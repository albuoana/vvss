package aoir2035MV.note.controller;

import java.util.HashMap;
import java.util.List;

import aoir2035MV.note.model.Corigent;
import aoir2035MV.note.model.Elev;
import aoir2035MV.note.model.Medie;
import aoir2035MV.note.model.Nota;
import aoir2035MV.note.repository.ClasaRepository;
import aoir2035MV.note.repository.ClasaRepositoryImplementation;
import aoir2035MV.note.repository.EleviRepository;
import aoir2035MV.note.repository.EleviRepositoryMockImplementation;
import aoir2035MV.note.repository.NoteRepository;
import aoir2035MV.note.repository.NoteRepositoryImplementation;
import aoir2035MV.note.utils.ClasaException;


public class NoteController {
	private NoteRepository note;
	private ClasaRepository clasa;
	private EleviRepository elevi;

	public NoteController() {
		note = new NoteRepositoryImplementation();
		clasa = new ClasaRepositoryImplementation();
		elevi = new EleviRepositoryMockImplementation();
	}
	
	public void addNota(Nota nota) throws ClasaException {
		note.addNota(nota);
	}
	
	public void addElev(Elev elev) {
		elevi.addElev(elev);
	}
	
	public void creeazaClasa(List<Elev> elevi, List<Nota> note) {
		clasa.creazaClasa(elevi, note);
	}
	
	public List<Medie> calculeazaMedii() throws ClasaException {
			return clasa.calculeazaMedii();
		
	}
	
	public List<Nota> getNote() {
		return note.getNote();
	}
	
	public List<Elev> getElevi() {
		return elevi.getElevi();
	}
	
	public HashMap<Elev, HashMap<String, List<Double>>> getClasa() {
		return clasa.getClasa();
	}
	
	public void afiseazaClasa() {
		clasa.afiseazaClasa();
	}
	
	public void readElevi(String fisier) {
		elevi.readElevi(fisier);
	}
	
	public void readNote(String fisier) {
		note.readNote(fisier);
	}
	
	public List<Corigent> getCorigenti() {
		return clasa.getCorigenti();
	}
}
