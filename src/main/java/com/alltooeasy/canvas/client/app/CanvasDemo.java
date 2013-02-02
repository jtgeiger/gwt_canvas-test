package com.alltooeasy.canvas.client.app;

import java.util.logging.Logger;

import com.alltooeasy.canvas.client.resource.MyResources;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;

public class CanvasDemo implements EntryPoint
{

    final static private Logger log = Logger.getLogger( CanvasDemo.class.getName() );
    
    final static private CssColor red = CssColor.make( "red" );
    final static private CssColor blue = CssColor.make( "blue" );
    final static private CssColor aqua = CssColor.make( "aqua" );
    final static private CssColor yellow = CssColor.make( "yellow" );
    final static private CssColor[] colors = { red, blue, aqua, yellow };
    
    final static private int WIDTH = 600;
    final static private int HEIGHT = 800;
    
//    static
//    {
//        MyResources resources = MyResources.INSTANCE;
//        
//        Image.prefetch( resources.kc().getSafeUri() );
//    }
    
    @Override
    public void onModuleLoad()
    {
        //RootPanel.get().add( new Label( "Hello World." ) );
        
        int rand = Random.nextInt();
        
        log.info( "Rand=" + rand + "." );
        
        rand = Math.abs( rand );
        
        int cur = rand % colors.length;
        
/**/
        //GWTCanvas canvas = new GWTCanvas(400,400);
        Canvas canvas = Canvas.createIfSupported();
        canvas.setSize( WIDTH + "px", HEIGHT + "px" );
        canvas.setCoordinateSpaceWidth( WIDTH );
        canvas.setCoordinateSpaceHeight( HEIGHT );
        final Context2d context = canvas.getContext2d();

//        context.setLineWidth(1);
//        //canvas.setStrokeStyle(Color.GREEN);
//        context.setStrokeStyle( "green" );
//
//        context.beginPath();
//        context.moveTo(1,1);
//        context.lineTo(1,50);
//        context.lineTo(50,50);
//        context.lineTo(50, 1);
//        context.closePath();
//        context.stroke();
        
        context.beginPath();
        context.setFillStyle( "green" );
        context.fillRect( 0, 0, WIDTH, HEIGHT );
        context.closePath();
        
        context.beginPath();
        context.setFillStyle( colors[cur] );
        context.fillRect( 200, 200, 75, 75 );
        context.closePath();
        
        //Image img = new Image( "images/AD.svg" );
        Image img = new Image( "images/4.png" );
        ImageElement ie = ImageElement.as( img.getElement() );
        context.drawImage( ie, 25, 25 );
        
        final MyResources resources = MyResources.INSTANCE;
        
        ImageResource kc = resources.kc();
        final Image kcimg = new Image( kc.getSafeUri() );
//        kcimg.addLoadHandler( new LoadHandler() {
//
//            @Override
//            public void onLoad( LoadEvent event )
//            {
                final ImageElement kcie = ImageElement.as( kcimg.getElement() );
                context.drawImage( kcie, 75, 25 );
//                log.info( "Dude finished loading." );
//            }
//        } );
       
        ImageResource sixh = resources.sixh();
        Image sixhimg = new Image( sixh.getSafeUri() );
        final ImageElement sixhie = ImageElement.as( sixhimg.getElement() );
//                img.addLoadHandler( new LoadHandler() {
//
//                    @Override
//                    public void onLoad( LoadEvent event )
//                    {
                context.drawImage( sixhie, 100, 25 );
        
        
        RootPanel.get().add( canvas );
//*/
        log.info( "Finished " + getClass() + ".onModuleLoad()." );
    }

}
