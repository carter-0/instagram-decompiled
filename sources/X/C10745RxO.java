package X;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.lang.ref.WeakReference;

/* renamed from: X.RxO  reason: case insensitive filesystem */
public final class C10745RxO {
    public SensorManager A00;
    public WeakReference A01;
    public boolean A02;
    public final SensorEventListener A03 = new ALC(this, 0);
    public final float[] A04 = new float[3];
}
