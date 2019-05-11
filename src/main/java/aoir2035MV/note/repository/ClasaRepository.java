package aoir2035MV.note.repository;

import java.util.HashMap;
import java.util.List;

import aoir2035MV.note.model.Corigent;
import aoir2035MV.note.model.Elev;
import aoir2035MV.note.model.Medie;
import aoir2035MV.note.model.Nota;
import aoir2035MV.note.utils.ClasaException;

public interface ClasaRepository {
	
	public void creazaClasa(List<Elev> elevi, List<Nota> note);
	public HashMap<Elev, HashMap<String, List<Double>>> getClasa();
	public List<Medie> calculeazaMedii() throws ClasaException;
	public void afiseazaClasa();
	public List<Corigent> getCorigenti();
}
