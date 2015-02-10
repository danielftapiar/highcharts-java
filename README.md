# highcharts-java
Highcharts Java 

Made this mini adapter for Java for the Highcharts Libarary, it will spit out the chart object for javascript, there are no event handlers here,
drilldowns do work though and you can switch between the type of drilldown chart type.

Tested it with Highcharts 4.0.4, All classes are serialized and works well with Spring 4, and jackson as the json mapper.

Ex: Column Chart and on drilldown change to a Line Chart to display the drilldown data or vice-versa


LINE CHART EXAMPLE

        LineChart highchartLine = new LineChart();
        Serie serie1 = new Serie();
        serie1.setName("January Production");
        highchartLine.setTitle("Chart Title");
        highchartLine.setyAxisTitle("%");

        for (Integer i = 0; i < 10; i++) {
            Data data = new Data();
            data.setY(i.floatValue());
            data.setX(i.longValue());
            data.setName("Category "+i.toString());
            data.setX(i.longValue());
            data.setDrilldown(UUID.randomUUID().toString());

            String randomId = UUID.randomUUID().toString();
            data.setDrilldown(randomId);
            
            Serie newDrilldownSerie = new Serie();
            ArrayList<Data> newDrillDownData = new ArrayList<Data>();
            newDrilldownSerie.setColor("#FF0000");
            newDrilldownSerie.setId(data.getDrilldown());
            newDrilldownSerie.setName("SubCategorias");
            newDrilldownSerie.setType(null); //if left null drilldown type will inherit from the parent series, you can change it to 'column','line' etc
            
            for(Integer j = 0 ; j<10 ; j++){
                Data data2 = new Data();
                data2.setX(j.longValue());
                data2.setY(j.floatValue());
                data2.setName("SubCategoria"+j.toString());
                newDrillDownData.add(data2);
            }
            newDrilldownSerie.setData(newDrillDownData);
            highchartLine.addDrilldownSeries(newDrilldownSerie);
            serie1.getData().add(data);
        }
        highchartLine.addSerie(serie1);
        highchartLine.processChart();
        return highchartLine;
        
  
  COLUMN CHART EXAMPLE
  
        ColumnChart highchartColumn = new ColumnChart();
        Serie serie1 = new Serie();
        
        serie1.setName("January Production");
        ArrayList<String> categories = new ArrayList<String>();
        highchartColumn.setCategories(categories);
        highchartColumn.setTitle("Chart Title");
        highchartColumn.setyAxisTitle("%");

        for (Integer i = 0; i < 10; i++) {
            Data data = new Data();
            categories.add("Categoria " + i.toString());
            data.setY(i.floatValue());
            data.setName("Categoria " + i.toString());
            data.setX(i.longValue());
            String randomId = UUID.randomUUID().toString();
            data.setDrilldown(randomId);
            
            Serie newDrilldownSerie = new Serie();
            ArrayList<Data> newDrillDownData = new ArrayList<Data>();
            newDrilldownSerie.setColor("#FF0000");
            newDrilldownSerie.setId(data.getDrilldown());
            newDrilldownSerie.setName("SubCategorias");
            newDrilldownSerie.setType("column");
            
            for(Integer j = 0 ; j<10 ; j++){
                Data data2 = new Data();
                data2.setX(j.longValue());
                data2.setY(j.floatValue());
                data2.setName("SubCategoria"+j.toString());
                newDrillDownData.add(data2);
            }
            newDrilldownSerie.setData(newDrillDownData);
            highchartColumn.addDrilldownSeries(newDrilldownSerie);
            serie1.getData().add(data);
        }
        highchartColumn.addSerie(serie1);
        highchartColumn.processChart();
        return highchartColumn;
        
PIE CHART EXAMPLE

        PieChart pieChart = new PieChart();
        Serie serie1 = new Serie();
        serie1.setName("January Production");
        ArrayList<String> categories = new ArrayList<String>();
        pieChart.setTitle("Valores Historicos");

        for (Integer i = 0; i < 5; i++) {
            Data data = new Data();
            categories.add("Categoria "+i.toString());
            data.setY(i.floatValue());
            data.setName("Categoria "+i.toString());
            data.setX(i.longValue());
            data.setDrilldown(UUID.randomUUID().toString());
            data.setId(UUID.randomUUID().toString());     // id de filtro para el drilldown
            serie1.getData().add(data);
        }

        pieChart.addSerie(serie1);
        pieChart.processChart();

        return pieChart;
        
        
Finally to render it on the page, use ajax so it spits out the json.

<body>

    <div id="chartColumn"></div>
    <div id="chartLine"></div>
    <div id="chartPie"></div>

</body>


    $(document).ready(function(){
        $.ajax({
            url : "/myApp/pg/user/highchartsDemoColumn",
            type: "GET",
            success: function(chart){
               global =  $("#chartColumn").highcharts(chart);
            }
        });

        $.ajax({
            url : "/myApp/pg/user/highchartsDemoLine",
            type: "GET",
            success: function(chart){
                $("#chartLine").highcharts(chart);
            }
        });

        $.ajax({
            url : "/myApp/pg/user/highchartsDemoPie",
            type: "GET",
            success: function(chart) {
                $("#chartPie").highcharts(chart);
            }
        });
    });
