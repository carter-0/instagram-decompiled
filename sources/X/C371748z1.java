package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8z1  reason: invalid class name and case insensitive filesystem */
public final class C371748z1 implements AnonymousClass8z2 {
    public static final float[] A0V = {-0.11970494f, 0.6727418f, 9.56203f};
    public static final float[] A0W = {-0.11796062f, 0.68843085f, 9.781745f};
    public static final float[] A0X = {4.6960264E-4f, -5.1159784E-4f, 2.8634304E-4f};
    public float A00;
    public int A01;
    public long A02;
    public Handler A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final int A06;
    public final Sensor A07;
    public final Sensor A08;
    public final Sensor A09;
    public final Sensor A0A;
    public final Sensor A0B;
    public final Sensor A0C;
    public final Sensor A0D;
    public final SensorEventListener A0E = new C371768z4(this);
    public final SensorEventListener A0F = new C371778z5(this);
    public final SensorEventListener A0G = new C371798z7(this);
    public final SensorEventListener A0H = new C371808z8(this);
    public final SensorEventListener A0I = new C371818z9(this);
    public final SensorEventListener A0J = new C371788z6(this);
    public final SensorEventListener A0K = new C371758z3(this);
    public final SensorManager A0L;
    public final WindowManager A0M;
    public final ArrayList A0N = new ArrayList();
    public final float[] A0O = new float[3];
    public final float[] A0P = new float[3];
    public final float[] A0Q = new float[16];
    public final float[] A0R = new float[16];
    public final float[] A0S;
    public final float[] A0T = new float[3];
    public final Integer A0U;

    public C371748z1(Context context, Integer num, boolean z) {
        float[] fArr = new float[16];
        this.A0S = fArr;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.A0L = sensorManager;
        this.A0U = num;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(15);
            if (defaultSensor == null && (defaultSensor = sensorManager.getDefaultSensor(11)) == null) {
                defaultSensor = sensorManager.getDefaultSensor(20);
            }
            this.A0D = defaultSensor;
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(1);
            this.A07 = defaultSensor2;
            this.A08 = sensorManager.getDefaultSensor(9);
            this.A0C = sensorManager.getDefaultSensor(4);
            if (z) {
                Sensor defaultSensor3 = this.A0L.getDefaultSensor(35);
                this.A09 = defaultSensor3 != null ? defaultSensor3 : defaultSensor2;
                Sensor defaultSensor4 = sensorManager.getDefaultSensor(16);
                this.A0A = defaultSensor4 == null ? sensorManager.getDefaultSensor(4) : defaultSensor4;
                this.A0B = sensorManager.getDefaultSensor(14);
            } else {
                this.A09 = null;
                this.A0A = null;
                this.A0B = null;
            }
        } else {
            this.A0D = null;
            this.A07 = null;
            this.A08 = null;
            this.A0C = null;
            this.A09 = null;
            this.A0A = null;
            this.A0B = null;
        }
        this.A0M = (WindowManager) context.getSystemService("window");
        this.A06 = 1;
        Matrix.setIdentityM(fArr, 0);
    }

    public static synchronized void A00(C371748z1 r9) {
        synchronized (r9) {
            int i = r9.A01;
            if (i > 0) {
                r9.A01 = i - 1;
            } else {
                Iterator it = r9.A0N.iterator();
                while (it.hasNext()) {
                    ((C41810B1p) it.next()).onDataChanged(r9.A0S, r9.A0O, r9.A0P, r9.A0T, r9.A02);
                }
            }
        }
    }

    public final boolean Cbe(int i) {
        Sensor sensor;
        if (i == 0) {
            sensor = this.A0D;
        } else if (i == 1) {
            sensor = this.A07;
        } else if (i == 2) {
            sensor = this.A08;
        } else if (i != 3) {
            return false;
        } else {
            sensor = this.A0C;
        }
        return sensor != null;
    }

    public final synchronized void start() {
        synchronized (this) {
            if (!this.A04) {
                this.A04 = true;
                this.A05 = false;
                int intValue = this.A0U.intValue();
                if (intValue == 0) {
                    SensorManager sensorManager = this.A0L;
                    if (sensorManager != null) {
                        Handler handler = this.A03;
                        if (handler == null) {
                            handler = C341447mt.A01("SensorMotionDataSource");
                            this.A03 = handler;
                        }
                        this.A01 = 2;
                        Sensor sensor = this.A0D;
                        if (sensor != null) {
                            SensorEventListener sensorEventListener = this.A0K;
                            if (sensorManager.registerListener(sensorEventListener, sensor, this.A06, handler)) {
                                AnonymousClass0BW.A00.A05(sensorEventListener, sensor);
                            }
                        }
                        Sensor sensor2 = this.A07;
                        if (sensor2 != null) {
                            SensorEventListener sensorEventListener2 = this.A0E;
                            if (sensorManager.registerListener(sensorEventListener2, sensor2, this.A06, this.A03)) {
                                AnonymousClass0BW.A00.A05(sensorEventListener2, sensor2);
                            }
                        }
                        Sensor sensor3 = this.A08;
                        if (sensor3 != null) {
                            SensorEventListener sensorEventListener3 = this.A0F;
                            if (sensorManager.registerListener(sensorEventListener3, sensor3, this.A06, this.A03)) {
                                AnonymousClass0BW.A00.A05(sensorEventListener3, sensor3);
                            }
                        }
                        Sensor sensor4 = this.A0C;
                        if (sensor4 != null) {
                            SensorEventListener sensorEventListener4 = this.A0J;
                            if (sensorManager.registerListener(sensorEventListener4, sensor4, this.A06, this.A03)) {
                                AnonymousClass0BW.A00.A05(sensorEventListener4, sensor4);
                            }
                        }
                        Sensor sensor5 = this.A09;
                        if (sensor5 != null) {
                            SensorEventListener sensorEventListener5 = this.A0G;
                            if (sensorManager.registerListener(sensorEventListener5, sensor5, this.A06, this.A03)) {
                                AnonymousClass0BW.A00.A05(sensorEventListener5, sensor5);
                            }
                        }
                        Sensor sensor6 = this.A0A;
                        if (sensor6 != null) {
                            SensorEventListener sensorEventListener6 = this.A0H;
                            if (sensorManager.registerListener(sensorEventListener6, sensor6, this.A06, this.A03)) {
                                AnonymousClass0BW.A00.A05(sensorEventListener6, sensor6);
                            }
                        }
                        Sensor sensor7 = this.A0B;
                        if (sensor7 != null) {
                            SensorEventListener sensorEventListener7 = this.A0I;
                            if (sensorManager.registerListener(sensorEventListener7, sensor7, this.A06, this.A03)) {
                                AnonymousClass0BW.A00.A05(sensorEventListener7, sensor7);
                            }
                        }
                    }
                } else if (intValue == 1) {
                    Matrix.setIdentityM(this.A0S, 0);
                    Matrix.setIdentityM(this.A0Q, 0);
                    Matrix.setIdentityM(this.A0R, 0);
                    float[] fArr = this.A0O;
                    float[] fArr2 = A0V;
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[1];
                    fArr[2] = fArr2[2];
                    float[] fArr3 = this.A0P;
                    float[] fArr4 = A0W;
                    fArr3[0] = fArr4[0];
                    fArr3[1] = fArr4[1];
                    fArr3[2] = fArr4[2];
                    float[] fArr5 = this.A0T;
                    float[] fArr6 = A0X;
                    fArr5[0] = fArr6[0];
                    fArr5[1] = fArr6[1];
                    fArr5[2] = fArr6[2];
                    this.A01 = 0;
                    A00(this);
                }
            }
        }
    }

    public final synchronized void stop() {
        synchronized (this) {
            if (this.A04) {
                int intValue = this.A0U.intValue();
                if (intValue == 0) {
                    SensorManager sensorManager = this.A0L;
                    if (sensorManager != null) {
                        if (this.A0D != null) {
                            C60240fb.A00(this.A0K, sensorManager);
                        }
                        if (this.A07 != null) {
                            C60240fb.A00(this.A0E, sensorManager);
                        }
                        if (this.A08 != null) {
                            C60240fb.A00(this.A0F, sensorManager);
                        }
                        if (this.A0C != null) {
                            C60240fb.A00(this.A0J, sensorManager);
                        }
                        if (this.A09 != null) {
                            C60240fb.A00(this.A0G, sensorManager);
                        }
                        if (this.A0A != null) {
                            C60240fb.A00(this.A0H, sensorManager);
                        }
                        if (this.A0B != null) {
                            C60240fb.A00(this.A0I, sensorManager);
                        }
                        Handler handler = this.A03;
                        if (handler != null) {
                            C341447mt.A02(handler, false, false);
                            this.A03 = null;
                        }
                    }
                } else if (intValue == 1) {
                    this.A00 = 0.0f;
                    int i = 0;
                    this.A05 = false;
                    do {
                        this.A0S[i] = 0.0f;
                        this.A0Q[i] = 0.0f;
                        this.A0R[i] = 0.0f;
                        i++;
                    } while (i < 16);
                    int i2 = 0;
                    while (true) {
                        this.A0O[i2] = 0.0f;
                        this.A0P[i2] = 0.0f;
                        this.A0T[i2] = 0.0f;
                        i2++;
                        if (i2 >= 3) {
                            break;
                        }
                    }
                }
                this.A04 = false;
                this.A05 = false;
                this.A0N.clear();
            }
        }
    }

    public final void A8u(C41810B1p b1p) {
        this.A0N.add(b1p);
    }

    public final Integer B2T() {
        return this.A0U;
    }

    public final boolean CKS() {
        if (this.A09 == null && this.A0A == null && this.A0B == null) {
            return false;
        }
        return true;
    }
}
