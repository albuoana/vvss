package aoir2035MV.note.repository;

import java.util.List;

import aoir2035MV.note.model.Elev;

public interface EleviRepository {
	public void addElev(Elev e);
	public List<Elev> getElevi();
	public void readElevi(String fisier);
}
