package aoir2035MV.note.repository;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import aoir2035MV.note.controller.NoteController;
import aoir2035MV.note.model.Nota;
import aoir2035MV.note.utils.ClasaException;
import aoir2035MV.note.utils.Constants;

import static junit.framework.TestCase.assertEquals;

public class NoteRepositoryImplementationTest {

    private NoteController ctrl;

    @Before
    public void init(){
        ctrl = new NoteController();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void TC1EP() throws ClasaException{
        Nota nota = new Nota(1, "Logica", 10);
        ctrl.addNota(nota);
        assertEquals(1, ctrl.getNote().size());
    }

    @Test
    public void TC2EP() throws ClasaException {
        expectedEx.expect(ClasaException.class);
        expectedEx.expectMessage(Constants.invalidMateria);
        Nota nota = new Nota(1, "Logi", 10);
        ctrl.addNota(nota);
    }

    @Test
    public void TC3EP() throws ClasaException {
        expectedEx.expect(ClasaException.class);
        expectedEx.expectMessage(Constants.invalidNota);
        Nota nota = new Nota(1, "Logica", 8.2);
        ctrl.addNota(nota);
    }

    @Test
    public void TC4EP() throws ClasaException {
        expectedEx.expect(ClasaException.class);
        expectedEx.expectMessage(Constants.invalidNota);
        Nota nota = new Nota(1, "Logica", 20);
        ctrl.addNota(nota);
    }

    @Test
    public void TC1BVA() throws ClasaException {
        expectedEx.expect(ClasaException.class);
        expectedEx.expectMessage(Constants.invalidMateria);
        Nota nota = new Nota(1, "lll123456789123456789", 5);
        ctrl.addNota(nota);
    }

    @Test
    public void TC2BVA() throws ClasaException {
        Nota nota = new Nota(5, "Logic", 10);
        ctrl.addNota(nota);
    }

    @Test
    public void TC3BVA() throws ClasaException {
        expectedEx.expect(ClasaException.class);
        expectedEx.expectMessage(Constants.invalidNota);
        Nota nota = new Nota(2, "Logica", 0);
        ctrl.addNota(nota);
        assertEquals(1, ctrl.getNote().size());
    }

    @Test
    public void TC4BVA() throws ClasaException {
        Nota nota = new Nota(1, "Logica", 10);
        ctrl.addNota(nota);
        assertEquals(1, ctrl.getNote().size());
    }
}