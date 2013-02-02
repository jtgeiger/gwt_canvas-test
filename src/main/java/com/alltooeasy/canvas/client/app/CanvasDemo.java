package com.alltooeasy.canvas.client.app;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class CanvasDemo implements EntryPoint
{

    @Override
    public void onModuleLoad()
    {
        //RootPanel.get().add( new Label( "Hello World." ) );
/**/
        //GWTCanvas canvas = new GWTCanvas(400,400);
        Canvas canvas = Canvas.createIfSupported();
        canvas.setSize( "400px", "400px" );
        canvas.setCoordinateSpaceWidth(400);
        canvas.setCoordinateSpaceHeight(400);
        Context2d context = canvas.getContext2d();

        context.setLineWidth(1);
        //canvas.setStrokeStyle(Color.GREEN);
        context.setStrokeStyle( "green" );

        context.beginPath();
        context.moveTo(1,1);
        context.lineTo(1,50);
        context.lineTo(50,50);
        context.lineTo(50, 1);
        context.closePath();
        context.stroke();
        
        context.beginPath();
        context.setFillStyle( "red" );
        context.fillRect( 200, 200, 75, 75 );
        context.closePath();

        RootPanel.get().add( canvas );
//*/
    }

}
