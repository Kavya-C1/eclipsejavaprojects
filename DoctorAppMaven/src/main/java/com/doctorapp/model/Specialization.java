package com.doctorapp.model;

public enum Specialization {

	    ORTHO("ORTHOPEDICIAN"),
	    PEDIA("PEDINTRICIAN"),
	    PHYSICIAN("GENERAL PHYSICIAN"),
	    GYNAEC("GYNAECOLOGIST"),
	    NEURO("NEUROLOGIST"),
	    DERMA("DERMATOLOGIST");

	    private String speciality;

	    Specialization(String speciality) {
	        this.speciality = speciality;
	    }

	    public String getSpeciality() {
	        return speciality;
	    }
	
}
