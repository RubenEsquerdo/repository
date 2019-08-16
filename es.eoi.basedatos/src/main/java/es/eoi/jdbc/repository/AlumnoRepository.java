package es.eoi.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.eoi.jdbc.entity.Alumno;

public class AlumnoRepository  {

	

	private java.sql.Connection openConection() {
		String url = "";
		String user = "root";
		String password = "1234";

		try {
			Connection conexion = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {

		}
	}

	public List<Alumno> findByDni() {

		List<Alumno> alumnos = new ArrayList<>();
		String url = "";
		String user = "root";
		String password = "1234";
		Connection conexion = DriverManager.getConnection(url, user, password);
		StringBuilder sql = new StringBuilder();

		PreparedStatement pst = conexion.prepareStatement(sql.toString());
		ResultSet rs = pst.executeQuery("SELECT DNI FROM ALUMNO WHERE DNI = ?");

		while (rs.next()) {
			System.out.println(rs.getString("DNI"));

			return alumnos;
		}

	}

	public List<Alumno> findAll() {

		List<Alumno> alumnos = new ArrayList<>();
		String url = "";
		String user = "root";
		String password = "1234";

		Connection conexion = DriverManager.getConnection(url, user, password);
		Statement st = conexion.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM ALUMNO ");

		while (rs.next()) {
			System.out.println(rs.getString("DNI"));
			System.out.println(rs.getString("NOMBRE"));
			System.out.println(rs.getString("APELLIDOS"));
			System.out.println(rs.getInt("EDAD"));

		}
		return alumnos;
		conexion.close();
	}

	public boolean create (Alumno) {
		
		}

	public boolean delete(String Dni) {
		String url = "";
		String user = "root";
		String password = "1234";
		String sql = "DELETE FROM ALUMNO WHERE DNI = ?";
		boolean filaDeleted = false;
		Connection conexion = DriverManager.getConnection(url,user,password);
		
		
		

	}

	public boolean update(String dni, String nombre, String apellidos) {
		String sql = "UPDATE FROM ALUMNO SET DNI = ?, NOMBRE = ?, APELLIDOS = ? WHERE DNI = ?, OR NOMBRE = ?, OR APELLIDOS = ?";
		boolean filaUpdate = false;
		String url = "";
		String user = "root";
		String password = "1234";

		Connection conexion = DriverManager.getConnection(url, user, password);
		PreparedStatement statement = conexion.prepareStatement(sql.toString());
		statement.setString(1, "DNI");
		statement.setString(2, "NOMBRE");
		statement.setString(3, "APELLIDOS");

		ResultSet rs = statement.executeQuery();
		
		return filaUpdate;

	}

}
