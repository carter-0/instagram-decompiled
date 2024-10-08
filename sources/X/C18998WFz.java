package X;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WFz  reason: case insensitive filesystem */
public final class C18998WFz implements X8F {
    public static final long A04 = TimeUnit.MINUTES.toMillis(30);
    public final AnonymousClass0JP A00;
    public final File A01;
    public final File A02;
    public final VJR A03;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18998WFz(X.VJR r5, java.io.File r6) {
        /*
            r4 = this;
            r3 = 1
            r4.<init>()
            r4.A01 = r6
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{  }
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = r0.toString()     // Catch:{  }
            java.lang.String r0 = r6.getCanonicalPath()     // Catch:{ Exception -> 0x0017 }
            r0.contains(r1)     // Catch:{ Exception -> 0x0017 }
        L_0x0017:
            r2 = 0
            java.lang.String r1 = "v2"
            r0 = 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = X.Pxf.A1Y(r1, r0, r3)
            java.lang.String r0 = "%s.ols%d.%d"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r6, r1)
            r4.A02 = r0
            r4.A03 = r5
            java.io.File r1 = r4.A01
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0046
            java.io.File r0 = r4.A02
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x004b
            X.0Gw.A02(r1)
        L_0x0046:
            java.io.File r0 = r4.A02     // Catch:{ RCG -> 0x004b }
            X.C9247RUy.A00(r0)     // Catch:{ RCG -> 0x004b }
        L_0x004b:
            X.0Gt r0 = X.AnonymousClass0Gt.A00
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18998WFz.<init>(X.VJR, java.io.File):void");
    }

    public final void AHR() {
        0Gw.A01(this.A01);
    }

    public final /* bridge */ /* synthetic */ Collection B1v() {
        C18999WGa wGa = new C18999WGa(this);
        0Gw.A00(wGa, this.A02);
        return Collections.unmodifiableList(wGa.A00);
    }

    public final void E5C() {
        0Gw.A00(new C19000WGb(this), this.A01);
    }

    public final long ECz(C17847Vh0 vh0) {
        File file = vh0.A02.A00;
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (!file.delete()) {
            return -1;
        }
        return length;
    }
}
