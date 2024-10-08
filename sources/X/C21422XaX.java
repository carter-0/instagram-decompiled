package X;

import android.media.AudioTrack;
import java.lang.reflect.Method;

/* renamed from: X.XaX  reason: case insensitive filesystem */
public final class C21422XaX {
    public YB5 A00;
    public Method A01;
    public final Y86 A02;
    public final long[] A03;

    public C21422XaX(Y86 y86) {
        this.A02 = y86;
        try {
            this.A01 = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.A03 = new long[10];
        this.A00 = YB5.A00;
    }
}
