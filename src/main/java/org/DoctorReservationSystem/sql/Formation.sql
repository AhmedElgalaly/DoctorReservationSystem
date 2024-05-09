
DROP TABLE IF EXISTS Reservation;
DROP TABLE IF EXISTS Doctor;
DROP TABLE IF EXISTS Patient;
DROP TABLE IF EXISTS Clinic;
DROP TABLE IF EXISTS User;


-- User Table
CREATE TABLE User (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    DOB DATE NOT NULL,
    Email VARCHAR(50) NOT NULL,
    Phone VARCHAR(11) NOT NULL,
    Password VARCHAR(50) NOT NULL
)AUTO_INCREMENT=101;

-- Patient Table
CREATE TABLE Patient (
	PatientID INT PRIMARY KEY,
    Illness VARCHAR(100),
    FOREIGN KEY (PatientID) REFERENCES User(UserID)
);

-- Clinic Table
CREATE TABLE Clinic (
    ClinicID INT PRIMARY KEY AUTO_INCREMENT,
    ClinicName VARCHAR(100) NOT NULL,
    Location VARCHAR(255),
    Contact VARCHAR(100)
);

-- Doctor Table
CREATE TABLE Doctor (
    DoctorID INT PRIMARY KEY,
    Specialization VARCHAR(100),
    ClinicID INT,
    FOREIGN KEY (DoctorID) REFERENCES User(UserID),
    FOREIGN KEY (ClinicID) REFERENCES Clinic(ClinicID)
);

-- Reservation Table
CREATE TABLE Reservation (
    ReservationID INT PRIMARY KEY AUTO_INCREMENT,
    PatientID INT,
    DoctorID INT,
    ClinicID INT,
    ReservationDateTime DATETIME,
    Reason TEXT,
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID),
    FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID),
    FOREIGN KEY (ClinicID) REFERENCES Clinic(ClinicID)
);

INSERT INTO User (FirstName, LastName, DOB, Email, Phone, Password)
VALUES
    ('Ahmed', 'Ali', '1990-05-15', 'ahmedali@example.com', '01234567890', 'password1'),
    ('Fatma', 'Mohamed', '1985-08-20', 'fatmamohamed@example.com', '01123456789', 'password2'),
    ('Mohamed', 'Hassan', '1978-12-10', 'mohamedhassan@example.com', '01012345678', 'password3'),
    ('Sara', 'Ahmed', '1982-06-25', 'saraahmed@example.com', '01567894563', 'password4'),
    ('Omar', 'Gaber', '1975-11-30', 'omargaber@example.com', '01098765432', 'password5'),
    ('Nour', 'Samir', '1988-04-12', 'noursamir@example.com', '01234567891', 'password6'),
    ('Yasmine', 'Mohsen', '1987-09-18', 'yasminemohsen@example.com', '01122334455', 'password7'),
    ('Ahmed', 'Hassan', '1980-03-12', 'ahmedhassan@example.com', '01234567891', 'password8'),
    ('Fatma', 'Ali', '1983-09-25', 'fatmaalidoctor@example.com', '01123456780', 'password9'),
    ('Hassan', 'Mohamed', '1975-07-05', 'hassanmohamed@example.com', '01012345670', 'password10');


INSERT INTO Clinic (ClinicName, Location, Contact)
VALUES
    ('Al-Shorouk Hospital', 'Cairo', '01012345678'),
    ('El-Gouna Clinic', 'Hurghada', '01234567890'),
    ('Maadi Medical Center', 'Cairo', '01111111111'),
    ('Nile Clinic', 'Alexandria', '01222222222'),
    ('Luxor Health Center', 'Luxor', '01333333333');

INSERT INTO Doctor (DoctorID, Specialization, ClinicID)
VALUES
    (101, 'Cardiologist', 1),
    (102, 'Pediatrician', 2),
    (103, 'Dermatologist', 3),
    (104, 'Orthopedic Surgeon', 4),
    (105, 'Oncologist', 5),
    (106, 'Neurologist', 1),
    (107, 'Gynecologist', 2),
	(108, 'Ophthalmologist', 3),
    (109, 'Psychiatrist', 4),
    (110, 'General Surgeon', 5);
