package aoir2035MV.note.repository;

import java.util.List;

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

public class ClasaRepositoryImplementationTest {
    private NoteController ctrl;

    @Before
    public void init(){
        ctrl = new NoteController();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void test1() throws Exception
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
    public void test2() throws ClasaException {
        expectedEx.expect(ClasaException.class);
        expectedEx.expectMessage(Constants.emptyRepository);
        ctrl.calculeazaMedii();
    }

    @Test
    public void test3() throws ClasaException {
        Elev e1 = new Elev(1, "Elev1");
        Elev e2 = new Elev(2, "Elev2");
        ctrl.addElev(e1);
        ctrl.addElev(e2);
        Nota n1 = new Nota(1,"Matematica", 10);
        Nota n2 = new Nota(1,"Matematica", 1);
        ctrl.addNota(n1);
        ctrl.addNota(n2);
        ctrl.creeazaClasa(ctrl.getElevi(), ctrl.getNote());
        List<Medie> rezultate = ctrl.calculeazaMedii();
        for(Medie m : rezultate)
            if(m.getElev().getNrmatricol() == 1)
                assertEquals(m.getMedie(),5.5, 0.00001);
    }

    @Test
    public void test_f3_valid() throws ClasaException {
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
    public void test_f3_invalid() throws ClasaException {
        ctrl.creeazaClasa(ctrl.getElevi(), ctrl.getNote());
        List<Corigent> corigenti = ctrl.getCorigenti();
        assertEquals(corigenti.size(),0);
    }
}