package io.dvlopt.linux.epoll.internal ;


import com.sun.jna.Pointer   ;
import com.sun.jna.Structure ;
import java.util.Arrays      ;
import java.util.List        ;




/**
 * This class is needed internally to describe a native data structure.
 * The user should not bother about this.
 */
public class NativeEpollEvent extends Structure {


    public int  events   ;
    public long userData ;


    public static final int OFFSET_EVENTS    ;
    public static final int OFFSET_USER_DATA ;
    public static final int SIZE             ;




    static {
    
        NativeEpollEvent event = new NativeEpollEvent() ;

        SIZE             = event.size()                    ;
        OFFSET_EVENTS    = event.fieldOffset( "events" )   ;
        OFFSET_USER_DATA = event.fieldOffset( "userData" ) ;
    }




    public NativeEpollEvent() {}




    public NativeEpollEvent( Pointer ptr ) {
    
        super( ptr ) ;
    }




    protected List< String > getFieldOrder() {
    
        return Arrays.asList( new String[] { "events"   ,
                                             "userData" } ) ;
    }
}
