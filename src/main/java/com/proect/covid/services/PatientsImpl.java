package com.proect.covid.services;


import com.proect.covid.models.PatientsGlobal;
import com.proect.covid.services.contracts.ApisServices;
import com.proect.covid.services.contracts.Patients;
import org.springframework.stereotype.Service;

@Service
public class PatientsImpl implements Patients {

    private ApisServices apisServices;

    public PatientsImpl(ApisServices apisServices) {
        this.apisServices = apisServices;
    }

    @Override
    public void saveDailyData() {
        PatientsGlobal patient = new PatientsGlobal();
        String str = apisServices.getJson();


    }
}
