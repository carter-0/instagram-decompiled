package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.smartcapture.docauth.CaptureState;
import java.lang.ref.WeakReference;

public final class ALC implements SensorEventListener {
    public final int A00;
    public final Object A01;

    public ALC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        WeakReference weakReference;
        C10239Roz roz;
        float f;
        float[] fArr;
        switch (this.A00) {
            case 0:
                0qQ.A0B(sensorEvent, 0);
                C10745RxO rxO = (C10745RxO) this.A01;
                float[] fArr2 = rxO.A04;
                boolean z = false;
                float f2 = 0.0f;
                int i = 0;
                do {
                    float[] fArr3 = sensorEvent.values;
                    float f3 = (fArr2[i] * 0.8f) + (fArr3[i] * 0.19999999f);
                    fArr2[i] = f3;
                    f2 += AnonymousClass7TE.A00(fArr3[i], f3);
                    i++;
                } while (i < 3);
                if (f2 < 0.65f) {
                    z = true;
                }
                if (!(z == rxO.A02 || (weakReference = rxO.A01) == null || (roz = (C10239Roz) weakReference.get()) == null)) {
                    C12166SoH soH = roz.A00;
                    C13777Tgs tgs = (C13777Tgs) soH.A0K.get();
                    if (soH.A04 == CaptureState.HOLDING_STEADY && tgs != null) {
                        tgs.ElM(z);
                    }
                }
                rxO.A02 = z;
                return;
            case 1:
                0qQ.A0B(sensorEvent, 0);
                if (sensorEvent.sensor.getType() == 15) {
                    APX apx = (APX) this.A01;
                    long j = apx.A02;
                    apx.A02 = 1 + j;
                    if (j > 10) {
                        float[] fArr4 = apx.A0A;
                        SensorManager.getRotationMatrixFromVector(fArr4, sensorEvent.values);
                        boolean z2 = apx.A03;
                        float[] fArr5 = apx.A09;
                        if (!z2) {
                            0Yw.A0S(fArr4, fArr5, fArr4.length);
                            apx.A03 = true;
                            AnonymousClass7U8 r3 = apx.A08;
                            C3266577q.A03 = 0.0f;
                            for (C3266577q A002 : C3266577q.A04.keySet()) {
                                C3266577q.A00(A002);
                            }
                            AnonymousClass9O8 r0 = (AnonymousClass9O8) r3.A00.A05.invoke();
                            if (r0 != null) {
                                r0.A00 = 0.0f;
                                r0.A01 = 0.0f;
                                r0.A00();
                                r0.A04.reset();
                                return;
                            }
                            return;
                        }
                        float f4 = fArr5[2];
                        float f5 = fArr5[5];
                        float f6 = fArr5[8];
                        apx.A01 = ((fArr4[0] * f4) + (fArr4[3] * f5) + (fArr4[6] * f6)) * 2.0f;
                        apx.A00 = (f4 * fArr4[1]) + (f5 * fArr4[4]) + (f6 * fArr4[7]);
                        AnonymousClass7U8 r02 = apx.A08;
                        A3S a3s = apx.A07;
                        0qQ.A0B(a3s, 0);
                        AnonymousClass7U7 r2 = r02.A00;
                        AnonymousClass9O8 r8 = (AnonymousClass9O8) r2.A05.invoke();
                        Drawable drawable = (Drawable) r2.A06.invoke();
                        Context context = r2.A01.getContext();
                        if (r8 == null || drawable == null) {
                            if (context == null) {
                                return;
                            }
                        } else if (context != null) {
                            AnonymousClass9HC r6 = r2.A04;
                            if (AnonymousClass7TF.A1Z(r6.A04)) {
                                float A003 = 0nA.A00(context, (float) ((Number) r6.A06.getValue()).doubleValue());
                                APX apx2 = a3s.A00;
                                float f7 = apx2.A01 * A003;
                                float f8 = apx2.A00 * A003;
                                float doubleValue = (float) ((Number) r6.A1E.getValue()).doubleValue();
                                if (Math.abs(f7) >= doubleValue || Math.abs(f8) >= doubleValue) {
                                    r8.A00 = f7;
                                    r8.A01 = f8;
                                    r8.A00();
                                    drawable.invalidateSelf();
                                }
                            }
                        } else {
                            return;
                        }
                        if (AnonymousClass7TE.A1a(r2.A07.invoke())) {
                            AnonymousClass9HC r5 = r2.A04;
                            float A004 = a3s.A00.A00 * 0nA.A00(context, (float) ((Number) r5.A1D.getValue()).doubleValue());
                            if (Math.abs(A004) >= ((float) ((Number) r5.A1F.getValue()).doubleValue())) {
                                C3266577q.A03 = A004;
                                for (C3266577q A005 : C3266577q.A04.keySet()) {
                                    C3266577q.A00(A005);
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C40668Agi agi = (C40668Agi) this.A01;
                if (sensorEvent == null || (fArr = sensorEvent.values) == null) {
                    f = 0.0f;
                } else {
                    f = fArr[0];
                }
                agi.A00 = f;
                return;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
