package com.example.trabajofinalmoviles.ui;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.trabajofinalmoviles.R;
import com.example.trabajofinalmoviles.model.Reporte;
import com.example.trabajofinalmoviles.ui.adapters.ItemAdapter;

import java.util.ArrayList;
import java.util.Date;

public class ListPendientesActivity extends Activity {
    private ArrayList<Reporte> reportes;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_pendientes_activity);
        recyclerView = findViewById(R.id.list_pendientes);
        reportes = new ArrayList<>();
        Date date2 = new Date();

        Reporte reporte = new Reporte();
        reporte.setNombre("Prueba 1");
        Date date = new Date();
        reporte.setFecha(date);
        reporte.setIdUsuario("Gabriel");
        reporte.setUbicacion("Liberia");

        Reporte reporte2 = new Reporte();
        reporte2.setNombre("Prueba 2");
        reporte2.setFecha(date2);
        reporte2.setEstado("Atendido");
        reporte2.setIdUsuario("Roy");
        reporte2.setUbicacion("Villa Bonita");

        Reporte reporte3 = new Reporte();
        reporte3.setNombre("Prueba 3");
        reporte3.setFecha(date2);
        reporte3.setEstado("Atendido");
        reporte3.setIdUsuario("Juan");
        reporte3.setUbicacion("Sabanilla");

        reportes.add(reporte);
        reportes.add(reporte2);
        reportes.add(reporte3);

        itemAdapter = new ItemAdapter(reportes);

        recyclerView.setAdapter(itemAdapter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        itemAdapter.setResults(reportes);
    }

}
