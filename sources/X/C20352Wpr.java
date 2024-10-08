package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.Wpr  reason: case insensitive filesystem */
public final class C20352Wpr implements Runnable {
    public final /* synthetic */ C331897Sw A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C20352Wpr(C331897Sw r1, File file, Runnable runnable, String str, String str2, boolean z, boolean z2) {
        this.A01 = file;
        this.A04 = str;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = r1;
        this.A03 = str2;
        this.A02 = runnable;
    }

    public final void run() {
        try {
            String path = this.A01.getPath();
            AnonymousClass733 r9 = AnonymousClass733.A00;
            String str = this.A04;
            0qQ.A0A(path);
            boolean z = this.A06;
            boolean z2 = this.A05;
            C331897Sw r3 = this.A00;
            C331897Sw r0 = C331897Sw.A0A;
            C321356tz r2 = new C321356tz(r9.A00(r3.A00, str, path, z, z2), path);
            AnonymousClass7T3 r02 = r3.A02;
            String str2 = this.A03;
            r02.put(str2, r2);
            r3.A07.execute(new C20351Wpq(r2, r3, str2, str, C331897Sw.A04(r3, str2), z2, z));
        } catch (IOException unused) {
            this.A02.run();
        }
    }
}
