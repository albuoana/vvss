package aoir2035MV.note.repository;

import java.util.List;

import aoir2035MV.note.model.Nota;
import aoir2035MV.note.utils.ClasaException;

public interface NoteRepository {
	
	public void addNota(Nota nota) throws ClasaException;
	public List<Nota> getNote();
	public void readNote(String fisier);
	
}
