SELECT * From User;
SELECT * From Doctor;
SELECT * From Clinic;

SELECT * From User
JOIN Patient ON User.UserId = Patient.PatientID;
SELECT * From User
JOIN Doctor ON User.UserId = Doctor.DoctorID;

SELECT * FROM Clinic;

SELECT UserID, FirstName, LastName, DOB, Email, Phone, Password, Specialization From User
JOIN Doctor ON User.UserID = Doctor.DoctorID
JOIN Clinic ON Doctor.ClinicID = Clinic.ClinicID
WHERE Clinic.ClinicID = 2;

SELECT * From Clinic
WHERE Clinic.ClinicID = 2;

SELECT Specialization From User
JOIN Doctor ON User.UserID = Doctor.DoctorID
JOIN Clinic ON Doctor.ClinicID = Clinic.ClinicID
WHERE Clinic.ClinicID = 1;
-- Update user information
UPDATE User
SET FirstName = 'NewFirstName',
LastName = 'NewLastName',
DOB = '1995-01-01',
Email = 'newemail@example.com',
Phone = '0123456789',
Password = 'newpassword'
WHERE UserID = 101;

-- Update patient information
UPDATE Patient
SET Illness = 'NewIllness'
WHERE PatientID = 1;

SET @UserID = LAST_INSERT_ID();

SELECT LAST_INSERT_ID() From User;

SELECT ReservationID, PatientID, DoctorID, ClinicID, ReservationDateTime, Reason
FROM Reservation
WHERE Reservation.ReservationID = 1;

INSERT INTO Reservation (PatientID, DoctorID, ClinicID, ReservationDateTime, Reason)
VALUES
    (101, 101, 1, '2024-05-10 10:00:00', 'Regular checkup');

DELETE FROM User
WHERE UserID = 112;

select * from Patient;

select * from Reservation