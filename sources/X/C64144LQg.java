package X;

import android.media.AudioRecord;
import android.os.CountDownTimer;
import java.io.OutputStream;

/* renamed from: X.LQg  reason: case insensitive filesystem */
public final class C64144LQg {
    public int A00;
    public long A01;
    public AudioRecord A02;
    public CountDownTimer A03;
    public L6K A04;
    public boolean A05;
    public boolean A06;
    public final C65074Lmu A07;
    public final C63743L5b A08;

    public static final void A00(OutputStream outputStream, int i) {
        outputStream.write(i >> 0);
        outputStream.write(i >> 8);
        outputStream.write(i >> 16);
        outputStream.write(i >> 24);
    }

    public C64144LQg(C65074Lmu lmu, C63743L5b l5b, long j) {
        this.A07 = lmu;
        this.A01 = j;
        this.A08 = l5b;
    }

    public static final void A01(OutputStream outputStream, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            outputStream.write(str.charAt(i));
        }
    }
}
