/*========================================================================
| MyResources Class
|=========================================================================
| Copyright (C) 2013 Joel Geiger.
| All rights reserved.
|=========================================================================
| Change notice:
| Feb 2, 2013  jt  Original version.
|=======================================================================*/

package com.alltooeasy.canvas.client.resource;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface MyResources extends ClientBundle
{
    MyResources INSTANCE = GWT.create( MyResources.class );
    
    @Source( "image/35.png" )
    ImageResource sixh();
    
    //@Source( "image/KC.svg" )
    @Source( "image/5.png" )
    ImageResource kc();
}
