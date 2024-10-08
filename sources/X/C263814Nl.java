package X;

import android.os.SystemClock;

/* renamed from: X.4Nl  reason: invalid class name and case insensitive filesystem */
public final class C263814Nl {
    public float A00;
    public int A01;
    public long A02;
    public C263414Lx A03;
    public C263824Nm A04;
    public boolean A05;
    public boolean A06;
    public final float A07;
    public final int A08;
    public final long A09;
    public final AnonymousClass3WR A0A;
    public final C263754Nf A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public C263814Nl(C263814Nl r3, int i) {
        this.A0C = r3.A0C;
        this.A0A = r3.A0A;
        this.A09 = r3.A09;
        this.A0B = r3.A0B;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
        this.A00 = r3.A00;
        this.A08 = i;
        this.A07 = r3.A07;
        this.A06 = r3.A06;
        this.A03 = r3.A03;
        this.A05 = r3.A05;
        this.A0E = r3.A0E;
        this.A0D = r3.A0D;
        this.A04 = r3.A04;
    }

    public C263814Nl(C263414Lx r5, AnonymousClass3WR r6, C263754Nf r7, String str, float f, int i, int i2, boolean z, boolean z2) {
        String str2;
        this.A0C = str;
        this.A0A = r6;
        this.A0B = r7;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A09 = elapsedRealtime;
        this.A02 = elapsedRealtime;
        this.A08 = i;
        this.A07 = f;
        this.A01 = i2;
        this.A03 = r5;
        this.A0E = z;
        if (!z) {
            str2 = "early_prepare";
        } else if (z2) {
            str2 = "resume";
        } else {
            str2 = "autoplay";
        }
        this.A0D = str2;
        this.A04 = new C263824Nm(str2, elapsedRealtime);
    }
}
