package X;

import java.io.IOException;

/* renamed from: X.732  reason: invalid class name */
public final class AnonymousClass732 implements Runnable {
    public final /* synthetic */ C227602jb A00;
    public final /* synthetic */ C331897Sw A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass732(C227602jb r1, C331897Sw r2, Runnable runnable, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A00 = r1;
        this.A04 = str;
        this.A07 = z;
        this.A06 = z2;
        this.A01 = r2;
        this.A03 = str2;
        this.A02 = runnable;
        this.A05 = z3;
    }

    public final void run() {
        try {
            String A002 = this.A00.A00();
            0qQ.A07(A002);
            AnonymousClass733 r9 = AnonymousClass733.A00;
            String str = this.A04;
            boolean z = this.A07;
            boolean z2 = this.A06;
            C331897Sw r3 = this.A01;
            C331897Sw r0 = C331897Sw.A0A;
            C321356tz r2 = new C321356tz(r9.A00(r3.A00, str, A002, z, z2), A002);
            AnonymousClass7T3 r02 = r3.A02;
            String str2 = this.A03;
            r02.put(str2, r2);
            r3.A07.execute(new C14142Tqc(r2, r3, str2, str, this.A05, z2, z));
        } catch (IOException unused) {
            this.A02.run();
        }
    }
}
