package aoir2035MV.note.repository;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import aoir2035MV.note.model.Nota;
import aoir2035MV.note.utils.ClasaException;
import aoir2035MV.note.utils.Constants;

public class NoteRepositoryImplementation implements NoteRepository{
	private List<Nota> note;
	
	public NoteRepositoryImplementation() {
		note = new LinkedList<Nota>();
	}


	@Override
	public void addNota(Nota nota) throws ClasaException {
		// TODO Auto-generated method stub
		if(!validareNota(nota))
			return;
		note.add(nota);
	}

	private boolean validareNota(Nota nota) throws ClasaException {
		// TODO Auto-generated method stub
		if(nota.getMaterie().length() < 5 || nota.getMaterie().length() > 20)
			throw new ClasaException(Constants.invalidMateria);
		if(nota.getNrmatricol() < Constants.minNrmatricol || nota.getNrmatricol() > Constants.maxNrmatricol)
			throw new ClasaException(Constants.invalidNrmatricol);
		if(nota.getNota() < Constants.minNota || nota.getNota() > Constants.maxNota)
			throw new ClasaException(Constants.invalidNota);
		if(nota.getNota() != (int)nota.getNota())
			throw new ClasaException(Constants.invalidNota);
		if(nota.getNrmatricol() != (int)nota.getNrmatricol())
			throw new ClasaException(Constants.invalidNrmatricol);
		return true;
	}

	@Override
	public List<Nota> getNote() {
		// TODO Auto-generated method stub
		return note;
	}
	
	public void readNote(String fisier) {
		try {
			FileInputStream fstream = new FileInputStream(fisier);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(";");
				Nota nota = new Nota(Double.parseDouble(values[0]), values[1], Double.parseDouble(values[2]));
				note.add(nota);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
