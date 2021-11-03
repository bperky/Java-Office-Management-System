public class Patient extends Person {
    private String fName;
    private String lName;
    private Doctor doctor;

    public Patient(String fName, String lName, Doctor doctor) {
            super();
            this.fName = fName;
            this.lName = lName;
            this.doctor = doctor;
        }

        public void setFirstName(String newPatientFirstName){
            this.fName = newPatientFirstName;
        }
        
        public void setLastName(String newPatientLastName){
            this.lName = newPatientLastName;
        }
        
        public void setDoctor(Doctor newDoctorName){
            this.doctor = newDoctorName;
        }
        
        public Doctor getDoctor(){
            return doctor;
        }
        
        public String getPatientName() {
                return String.format(fName + " " + lName);
        }
        
        public String getDoctorName(){
            return String.format(doctor.getFirstName() + " " + doctor.getLastName());
        }

        public String toString(){
            return String.format("\t" + fName + "\t\t" + lName + "\t\t" + "Dr." + doctor.getLastName());
        }
}
