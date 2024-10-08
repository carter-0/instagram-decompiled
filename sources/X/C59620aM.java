package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.0aM  reason: invalid class name and case insensitive filesystem */
public final class C59620aM extends 0zn {
    public static final C59620aM A00 = new Object();
    public static final int[] A01 = {15335435, 34420479, 23592980, 61680819};
    public static final String[] A02 = {"APP_START", "NAVIGATION_EVENT", "SCROLL", "VIDEO_RENDER"};
    public static final boolean[] A03 = {true, false, false, false};

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0aM.getListenerMarkers():X.0Xc, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.0Xc getListenerMarkers() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0aM.getListenerMarkers():X.0Xc, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59620aM.getListenerMarkers():X.0Xc");
    }

    public final String getName() {
        return "ig_executor_app_start_listener";
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0aM.onMarkerStart(X.0XY):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onMarkerStart(X.0XY r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0aM.onMarkerStart(X.0XY):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59620aM.onMarkerStart(X.0XY):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0aM.onMarkerStop(X.0XY):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onMarkerStop(X.0XY r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0aM.onMarkerStop(X.0XY):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59620aM.onMarkerStop(X.0XY):void");
    }

    public static final String A00() {
        boolean[] zArr = A03;
        int i = 0;
        while (!zArr[i]) {
            i++;
            if (i >= 4) {
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            }
        }
        return A02[i];
    }
}
