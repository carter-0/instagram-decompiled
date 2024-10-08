package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.concurrent.Executor;

public final class APX implements AnonymousClass07Y {
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public final Sensor A04;
    public final SensorManager A05;
    public final ALC A06 = new ALC(this, 1);
    public final A3S A07 = new A3S(this);
    public final AnonymousClass7U8 A08;
    public final float[] A09 = new float[9];
    public final float[] A0A = new float[9];
    public final Executor A0B;

    @OnLifecycleEvent(07T.ON_START)
    public final void startTracking() {
        this.A0B.execute(new C40753Aij(this));
    }

    @OnLifecycleEvent(07T.ON_STOP)
    public final void stopTracking() {
        this.A0B.execute(new TD7(this));
    }

    public APX(Sensor sensor, SensorManager sensorManager, AnonymousClass7U8 r5, Executor executor) {
        this.A05 = sensorManager;
        this.A04 = sensor;
        this.A0B = executor;
        this.A08 = r5;
    }
}
