package com.doctorapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDb;
import com.doctorapp.util.Queries;

public class DoctorRepositoryImpl implements IDoctorRepository{
Doctor doctor = new Doctor();
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		 try(Connection connection = DoctorDb.OpenConnection();
		            PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
		            ){
		            statement.setString(1,doctor.getDoctorName());
		            statement.setString(2,doctor.getSpeciality());
		            statement.setInt(3,doctor.getExperience());
		            statement.setInt(4,doctor.getRatings());
		            statement.setDouble(5,doctor.getFees());
		            //call execute
		            boolean result = statement.execute();
		            System.out.println("One row inserted "+!result);


		        } catch (Exception e) {
		           e.printStackTrace();
		        }
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		try(Connection connection = DoctorDb.OpenConnection();
	            PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);
	        ){

	            statement.setInt(2,doctorId);
	            statement.setDouble(1,fees);
	            //call execute
	           int result = statement.executeUpdate();
	            System.out.println("One row updated "+result);


	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		 try (Connection connection = DoctorDb.OpenConnection();
	             PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);
	        ) {
	            statement.setInt(2, doctorId);
	            int result = statement.executeUpdate();
	            System.out.println("one row deleted " + result);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	@Override
	public Doctor findById(int doctorId) {
		// TODO Auto-generated method stub
		

        try (Connection connection = DoctorDb.OpenConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYID);
             ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                String doctorName = resultSet.getString("doctor_name");
                String speciality = resultSet.getString("speciality");
                int experience = resultSet.getInt("experience");
                int rating = resultSet.getInt("rating");
                doctorId = resultSet.getInt("doctor_id");
                double fee = resultSet.getDouble("fee");
                Doctor doctor = new Doctor(doctorId, doctorName, speciality, fee, rating, experience);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctor;
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		List<Doctor> doctorList = new ArrayList<>();
        try(Connection connection = DoctorDb.OpenConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
            ResultSet resultSet = statement.executeQuery();
        ){
            while (resultSet.next()){
                int doctorId = resultSet.getInt("doctor_id");
                String doctorName = resultSet.getString("doctor_name");
                String speciality = resultSet.getString("speciality");
                double fees = resultSet.getDouble("fees");
                int experience = resultSet.getInt("experience");
                int ratings = resultSet.getInt("ratings");


                Doctor doctor = new Doctor(doctorId,doctorName,speciality,fees,experience,ratings);
                doctorList.add(doctor);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return doctorList;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.OpenConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY);

        ) {
            statement.setString(1, speciality);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {

                    String doctorName = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experience");
                    int ratings = resultSet.getInt("ratings");
                    int doctorId = resultSet.getInt("doctor_id");
                    double fees = resultSet.getDouble("fees");
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setRatings(ratings);
                    doctor.setFees(fees);
                    doctor.setDoctorId(doctorId);

                    doctorList.add(doctor);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return doctorList;
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
		// TODO Auto-generated method stub
		 List<Doctor> doctorList = new ArrayList<>();
	        try (Connection connection = DoctorDb.OpenConnection();
	             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDEX);

	        ) {
	            statement.setString(1, speciality);
	            statement.setInt(2, experience);
	            try (ResultSet resultSet = statement.executeQuery();) {
	                while (resultSet.next()) {

	                    String doctorName = resultSet.getString("doctor_name");
	                    int ratings = resultSet.getInt("ratings");
	                    int doctorId = resultSet.getInt("doctor_id");
	                    double fees = resultSet.getDouble("fees");
	                    Doctor doctor = new Doctor();
	                    doctor.setDoctorName(doctorName);
	                    doctor.setSpeciality(speciality);
	                    doctor.setExperience(experience);
	                    doctor.setRatings(ratings);
	                    doctor.setFees(fees);
	                    doctor.setDoctorId(doctorId);
	                    doctorList.add(doctor);
	                }

	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return doctorList;
	}

	@Override
	public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) {
		// TODO Auto-generated method stub
		 List<Doctor> doctorList = new ArrayList<>();
	        try (Connection connection = DoctorDb.OpenConnection();
	             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDFEES);

	        ) {
	            statement.setString(1, speciality);
	            statement.setDouble(2, fees);
	            try (ResultSet resultSet = statement.executeQuery();) {
	                while (resultSet.next()) {

	                    String doctorName = resultSet.getString("doctor_name");
	                    int experience = resultSet.getInt("experience");
	                    int ratings = resultSet.getInt("ratings");
	                    int doctorId = resultSet.getInt("doctor_id");

	                    Doctor doctor = new Doctor();
//	                    doctor.setDoctorName(doctorName);
	                    doctor.setDoctorName(resultSet.getString("doctor_name"));
	                    // doctor.setSpeciality(speciality);
	                    doctor.setSpeciality(resultSet.getString("speciality"));
//	                    doctor.setExperience(experience);
	                    doctor.setExperience(resultSet.getInt("experience"));
//	                    doctor.setRatings(ratings);
	                    doctor.setRatings(resultSet.getInt("ratings"));
//	                    doctor.setFees(fees);
	                    doctor.setFees(resultSet.getDouble("fees"));
//	                    doctor.setDoctorId(doctorId);
	                    doctor.setDoctorId(resultSet.getInt("doctor_id"));

	                    doctorList.add(doctor);
	                }

	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return doctorList;
	}

	@Override
	public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
		// TODO Auto-generated method stub
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.OpenConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDRATINGS);

        ) {
            statement.setString(1, speciality);
            statement.setInt(2, ratings);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {

                    String docName = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experience");
                    int doctorId = resultSet.getInt("doctor_id");
                    double fees = resultSet.getDouble("fees");
                    Doctor doctor = new Doctor();
//                    doctor.setDoctorName(doctorName);
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    // doctor.setSpeciality(speciality);
                    doctor.setSpeciality(resultSet.getString("speciality"));
//                    doctor.setExperience(experience);
                    doctor.setExperience(resultSet.getInt("experience"));
//                    doctor.setRatings(ratings);
                    doctor.setRatings(resultSet.getInt("ratings"));
//                    doctor.setFees(fees);
                    doctor.setFees(resultSet.getDouble("fees"));
//                    doctor.setDoctorId(doctorId);
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));

                    doctorList.add(doctor);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctorList;
	}

	@Override
	public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
		// TODO Auto-generated method stub
		List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.OpenConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDNAME);

        ) {
            statement.setString(1, speciality);
            statement.setString(2, "%"+doctorName+"%");
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {

                    String docName = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experience");
                    int ratings = resultSet.getInt("ratings");
                    int doctorId = resultSet.getInt("doctor_id");
                    double fees = resultSet.getDouble("fees");
                    Doctor doctor = new Doctor();
//                    doctor.setDoctorName(doctorName);
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                   // doctor.setSpeciality(speciality);
                    doctor.setSpeciality(resultSet.getString("speciality"));
//                    doctor.setExperience(experience);
                    doctor.setExperience(resultSet.getInt("experience"));
//                    doctor.setRatings(ratings);
                    doctor.setRatings(resultSet.getInt("ratings"));
//                    doctor.setFees(fees);
                    doctor.setFees(resultSet.getDouble("fees"));
//                    doctor.setDoctorId(doctorId);
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));

                    doctorList.add(doctor);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctorList;
	}
	
	

}
