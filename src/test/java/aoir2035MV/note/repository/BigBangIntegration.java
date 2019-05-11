package aoir2035MV.note.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import aoir2035MV.note.controller.NoteController;
import aoir2035MV.note.model.Corigent;
import aoir2035MV.note.model.Elev;
import aoir2035MV.note.model.Medie;
import aoir2035MV.note.model.Nota;
import aoir2035MV.note.utils.ClasaException;
import aoir2035MV.note.utils.Constants;

import static org.junit.Assert.*;
import static junit.framework.TestCase.assertEquals;

public class BigBangIntegration {
    private NoteController ctrl;

    @Before
    public void init(){
        ctrl = new NoteController();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void test_f1() throws ClasaException{
        Nota nota = new Nota(1, "Logica", 10);
        ctrl.addNota(nota);
        assertEquals(1, ctrl.getNote().size());
    }

    @Test
    public void test_f2() throws Exception
    {
        Elev e1 = new Elev(1, "Elev1");
        Elev e2 = new Elev(2, "Elev2");
        ctrl.addElev(e1);
        ctrl.addElev(e2);
        Nota n1 = new Nota(1,"Matematica", 10);
        Nota n2 = new Nota(1,"Matematica", 1);
        Nota n3 = new Nota(1,"Romana", 10);
        Nota n4 = new Nota(1,"Romana", 1);
        Nota n5 = new Nota(2,"Matematica", 4);
        Nota n6 = new Nota(2,"Matematica", 3);
        Nota n7 = new Nota(2,"Romana", 6);
        Nota n8 = new Nota(2,"Romana", 7);
        ctrl.addNota(n1);
        ctrl.addNota(n2);
        ctrl.addNota(n3);
        ctrl.addNota(n4);
        ctrl.addNota(n5);
        ctrl.addNota(n6);
        ctrl.addNota(n7);
        ctrl.addNota(n8);
        ctrl.creeazaClasa(ctrl.getElevi(), ctrl.getNote());
        //ctrl.afiseazaClasa();
        List<Medie> rezultate = ctrl.calculeazaMedii();
        assertEquals(rezultate.size(),2);
    }

    @Test
    public void test_f3() throws ClasaException {
        Elev e1 = new Elev(1, "Elev1");
        Elev e2 = new Elev(2, "Elev2");
        ctrl.addElev(e1);
        ctrl.addElev(e2);
        Nota n1 = new Nota(1,"Matematica", 10);
        Nota n2 = new Nota(1,"Matematica", 7);
        Nota n3 = new Nota(1,"Romana", 10);
        Nota n4 = new Nota(1,"Romana", 10);
        Nota n5 = new Nota(2,"Matematica", 4);
        Nota n6 = new Nota(2,"Matematica", 5);
        Nota n7 = new Nota(2,"Romana", 6);
        Nota n8 = new Nota(2,"Romana", 7);
        ctrl.addNota(n1);
        ctrl.addNota(n2);
        ctrl.addNota(n3);
        ctrl.addNota(n4);
        ctrl.addNota(n5);
        ctrl.addNota(n6);
        ctrl.addNota(n7);
        ctrl.addNota(n8);
        ctrl.creeazaClasa(ctrl.getElevi(), ctrl.getNote());
        List<Corigent> corigenti = ctrl.getCorigenti();
        assertEquals(corigenti.size(),0);
    }

    @Test
    public void integration() throws ClasaException {
        //P->B->A->C B-valid A-valid C-valid
        Elev e1 = new Elev(1, "Elev1");
        ctrl.addElev(e1);
        Nota nota = new Nota(1, "Desena", 10);
        ctrl.addNota(nota);
        Assert.assertEquals(1, ctrl.getNote().size());
        ctrl.creeazaClasa(ctrl.getElevi(), ctrl.getNote());
        List<Medie> rezultate = ctrl.calculeazaMedii();
        Assert.assertEquals(1, rezultate.size());
        List<Corigent> corigenti = ctrl.getCorigenti();
        Assert.assertEquals(corigenti.size(),0);
    }
}