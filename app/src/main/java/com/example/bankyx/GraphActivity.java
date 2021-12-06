package com.example.bankyx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GridLabelRenderer;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class GraphActivity extends AppCompatActivity {
    GraphView graphView;
    private static final String[] DAYS = {"APR 22", "APR 23", "APR 24", "APR 25",  "APR 26"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        IniciarComponentes();
        BarGraphSeries exampleSeries = new BarGraphSeries(new DataPoint[]{
                 new DataPoint(1, 155)

                , new DataPoint(2, 210)

                , new DataPoint(3, 205)

                , new DataPoint(4, 160)
                , new DataPoint(5, 140)








        });
        exampleSeries.setSpacing(10);
        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graphView);
        staticLabelsFormatter.setHorizontalLabels(DAYS);
        graphView.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);
        graphView.getGridLabelRenderer().setGridStyle(GridLabelRenderer.GridStyle.NONE);
        graphView.addSeries(exampleSeries);

    }

    private void IniciarComponentes() {
        graphView = findViewById(R.id.graph_view);
    }
}