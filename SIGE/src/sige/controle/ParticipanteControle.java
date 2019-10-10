package sige.controle;

import java.sql.SQLException;
import java.util.List;

import sige.DAO.ParticipanteDAO;
import sige.modeo.Participante;

public class ParticipanteControle {
	private ParticipanteDAO participanteDAO = new ParticipanteDAO();

	public void salvarParticipante (Participante participante) throws ClassNotFoundException, SQLException {
		participanteDAO.salvarParticipante(participante);
	}
	public Participante autenticarUsuario (String matricula, String senha) throws ClassNotFoundException, SQLException {
		return participanteDAO.autenticarUsuario(matricula, senha);
	}
	public boolean verificarSeMatriculaExiste (String matricula) throws ClassNotFoundException, SQLException{
		return participanteDAO.verificarSeMatriculaExiste(matricula);
		
	}
	public void alterarParticipante (Participante participante) throws ClassNotFoundException, SQLException {
		participanteDAO.alterarParticipante(participante);
	}
	public void excluirParticipante (Participante participante) throws ClassNotFoundException, SQLException {
		participanteDAO.excluirParticipante(participante);
	}
	public List<Participante> listarParticipante (){
		return participanteDAO.listarParticipantes();
	}
}