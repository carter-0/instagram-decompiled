package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.6u4  reason: invalid class name and case insensitive filesystem */
public final class C321386u4 implements Runnable {
    public final /* synthetic */ 1JG A00;
    public final /* synthetic */ C331897Sw A01;
    public final /* synthetic */ ByteArrayOutputStream A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C321386u4(1JG r1, C331897Sw r2, ByteArrayOutputStream byteArrayOutputStream, Runnable runnable, String str, String str2, boolean z, boolean z2) {
        this.A00 = r1;
        this.A04 = str;
        this.A02 = byteArrayOutputStream;
        this.A01 = r2;
        this.A05 = str2;
        this.A03 = runnable;
        this.A07 = z;
        this.A06 = z2;
    }

    public final void run() {
        C331897Sw r0 = C331897Sw.A0A;
        1JG r1 = this.A00;
        String str = this.A04;
        byte[] byteArray = this.A02.toByteArray();
        0qQ.A07(byteArray);
        if (C331917Sy.A01(r1, str, byteArray)) {
            C331897Sw.A01(r1, this.A01, this.A03, this.A05, str, this.A07, this.A06);
            return;
        }
        this.A03.run();
    }
}
