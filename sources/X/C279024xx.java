package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.4xx  reason: invalid class name and case insensitive filesystem */
public final class C279024xx {
    public Runnable A00;
    public String A01 = "coldstart";
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Handler A07 = new Handler(Looper.getMainLooper());
    public final 02m A08 = 02m.A0p;
    public final Runnable A09 = new C279044xz(this);
    public final Runnable A0A = new C279034xy(this);
    public final String A0B;
    public final String A0C;

    public C279024xx(String str, String str2, long j, long j2, long j3, long j4) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 5);
        this.A0B = str;
        this.A06 = j;
        this.A04 = j2;
        this.A05 = j3;
        this.A0C = str2;
        this.A00 = new C279054y0(this, j4);
    }
}
