package X;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.List;

/* renamed from: X.8zN  reason: invalid class name and case insensitive filesystem */
public final class C371928zN implements C371938zO {
    public Vibrator A00;
    public final Context A01;

    public final void FMz(List list, List list2) {
        VibrationEffect createWaveform;
        Vibrator vibrator = this.A00;
        if (vibrator != null) {
            long[] jArr = new long[list.size()];
            for (int i = 0; i < list.size(); i++) {
                jArr[i] = Math.max(((Number) list.get(i)).longValue(), 0);
            }
            if (list2.isEmpty()) {
                createWaveform = VibrationEffect.createWaveform(jArr, -1);
            } else {
                int[] iArr = new int[list2.size()];
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    int floatValue = (int) (((Number) list2.get(i2)).floatValue() * 255.0f);
                    iArr[i2] = floatValue;
                    int max = Math.max(floatValue, 0);
                    iArr[i2] = max;
                    iArr[i2] = Math.min(max, 255);
                }
                createWaveform = VibrationEffect.createWaveform(jArr, iArr, -1);
            }
            vibrator.vibrate(createWaveform);
        }
    }

    public final void FN0() {
        Vibrator vibrator = this.A00;
        if (vibrator != null) {
            vibrator.vibrate(VibrationEffect.createOneShot(100, -1));
        }
    }

    public final void cancel() {
        Vibrator vibrator = this.A00;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    public C371928zN(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        this.A00 = (Vibrator) applicationContext.getSystemService("vibrator");
    }
}
