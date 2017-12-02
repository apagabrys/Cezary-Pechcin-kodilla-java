package com.kodilla.testing.library;

public class LibraryUser {
    String firstname;
    String lastname;
    String peselId;

    public LibraryUser(String firsName, String lastName, String peselID) {
        this.firstname = firsName;
        this.lastname = lastName;
        this.peselId = peselID;
    }

    public String getFirsName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getPeselID() {
        return peselId;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firsName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", peselID='" + peselId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        LibraryUser that = (LibraryUser) o;
        if (!firstname.equals(that.firstname)) return false;
        if (!lastname.equals(that.lastname)) return false;
        return peselId.equals(that.peselId);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + peselId.hashCode();
        return result;
    }
}
