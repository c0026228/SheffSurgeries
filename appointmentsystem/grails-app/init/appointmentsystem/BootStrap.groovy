package appointmentsystem

class BootStrap {

    def init = { servletContext ->

    def appointment1=new com.SBretton.Appointment(
        appointmentID: '0234',
        appDate: new Date('20/03/2022'),
        appTime: '11:00',
        duration: '1 hour',
        roomNumber: '5675',
    ).save

    def appointment2=new com.SBretton.Appointment(
        appointmentID: '0127',
        appDate: new Date('28/03/2022'),
        appTime: '13:00',
        duration: '2 hour',
        roomNumber: '5674',
    ).save

    def patient1=new com.SBretton.Patient(
        patientName: 'Jim James',
        patientAddress: '42 kendry lane, wakefield, west yorkshire, W71 3DB',
        patientResidence: 'parents home',
        patientDob: new Date('28/01/1992'),
        patientID: '0232',
        dateregistered: new Date('14/01/2022'),
        patientPhone:'07127349741',
    ).save

    def patient2=new com.SBretton.Patient(
        patientName: 'Daniel James',
        patientAddress: '42 kendry lane, wakefield, west yorkshire, W71 3DB',
        patientResidence: 'parents home',
        patientDob: new Date('28/01/1992'),
        patientID: '0233',
        dateregistered: new Date('14/01/2022'),
        patientPhone:'07127349741',
    ).save

    def nurse1=new com.SBretton.Nurse(
        nurseID: '1982',
        fullName: 'leigha crossland',
        qualifications: 'Bsc Physical excerise',
        nurseEmail: 'lc@live.co.uk',
        nurseOffice: '4444',
        nursePhone: '07908984434',
        bio: 'Here to treat your wounds',
    ).save

    def nurse2=new com.SBretton.Nurse(
        nurseID: '1983',
        fullName: 'Alex Kane',
        qualifications: 'A level in biology',
        nurseEmail: 'Akane@gmail.co.uk',
        nurseOffice: '4443',
        nursePhone: '07908894434',
        bio: 'Here to take care of you',
    ).save

    def prescription1=new com.SBretton.Prescription(
        perscriptionID: '0234',
        pharmacyName: 'New lodge clinic',
        prescriptionNumber:'023453',
        medicine:'Hay fever tablet',
        totalCost: '£2',
        dateIssued: new Date('14/01/2022'),
        patientPaying: Boolean,
    ).save

    def prescription2=new com.SBretton.Prescription(
        perscriptionID: '0224',
        pharmacyName: 'New street clinic',
        prescriptionNumber:'043532',
        medicine:'blood pressure tablets',
        totalCost: '£5',
        dateIssued: new Date('23/03/2022'),
        patientPaying: Boolean,
    ).save

    def surgery1=new com.SBretton.Surgery(
        surgeryID: '2324',
        name: 'Sheffield Childrens hospital',
        address: 'Western Bank, Sheffield',
        postcode: 'S10 2TH',
        telephone: '0114 271 7000',
        numberOfPatients: '2500',
        description: 'Sheffield Childrens NHS Foundation Trust is one of only three dedicated childrens hospital trusts in the UK and provides integrated healthcare for children and young people',
        openingTime: '8am - 8pm',
        registeringnewpatients: 'yes',
    ).save

    def surgery2=new com.SBretton.Surgery(
        surgeryID: '2322',
        name: 'Accident & Emergency Department Northern General Hospital',
        address: 'Northern General Hospital, Herries Rd, Sheffield',
        postcode: 'S5 7AU',
        telephone: '0114 2434343',
        numberOfPatients: '1500',
        description: 'northern general hospital, situated in the north of sheffield, is home to the citys adult accident and emergency department',
        openingTime: 'midnight-11:59pm',
        registeringnewpatients: 'yes',
    ).save

    def receptionist1=new com.SBretton.Receptionist(
        receptionistID: '9999',
        recepName: 'Bobby Green',
        recepEmail: 'BobbyG@gmail.com',
        recepUsername: 'Bobby Green2',
        receppassword: 'BobGree234',
        recepPhone: '077777777777',
    ).save

    def receptionist2=new com.SBretton.Receptionist(
        receptionistID: '9998',
        recepName: 'Rachel Heywood',
        recepEmail: 'Haywood1@gmail.com',
        recepUsername: 'Haywood1',
        receppassword: 'Hay234',
        recepPhone: '07888888888',
    ).save


    def doctor1=new com.SBretton.Doctor(
        doctorID: '2222',
        fullName: 'Mark Rodges',
        qualifications: 'Bsc Biology',
        position: 'Main surgen',
        doctorEmail: 'MarkR@gmail.com',
        password: 'Rodges2121',
        doctorOffice: '5675',
        doctorPhone: '07923758311',
        bio: 'A guy who does a look or work on bodies',
    ).save()

    def doctor2=new com.SBretton.Doctor(
        doctorID: '3333',
        fullName: 'John byers',
        qualifications: 'Bsc Biology',
        position: 'Heart surgen',
        doctorEmail: 'Jbyers@hotmail.com',
        password: 'byersJohn',
        doctorOffice: '5674',
        doctorPhone: '07119245631',
        bio: 'I want to make sure that your heart is well',
    ).save()

    }
    def destroy = {
    }
}
