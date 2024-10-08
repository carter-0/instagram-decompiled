package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.2Ba  reason: invalid class name */
public final class AnonymousClass2Ba implements SensorEventListener {
    public float A00;
    public final AnonymousClass2Bc A01;
    public final /* synthetic */ AnonymousClass2BU A02;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2Ba.onSensorChanged(android.hardware.SensorEvent):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onSensorChanged(android.hardware.SensorEvent r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2Ba.onSensorChanged(android.hardware.SensorEvent):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Ba.onSensorChanged(android.hardware.SensorEvent):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Ba(AnonymousClass2BU r1) {
        this();
        this.A02 = r1;
    }

    public AnonymousClass2Ba() {
        this.A01 = new AnonymousClass2Bc(this);
    }
}
