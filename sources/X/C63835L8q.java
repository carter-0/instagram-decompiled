package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.L8q  reason: case insensitive filesystem */
public final class C63835L8q {
    public C11239SGz A00;
    public LQW A01;
    public JVE A02;
    public 1To A03;
    public final C11032S6k A04 = C11032S6k.A00.A00();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Tr, java.lang.Object] */
    public C63835L8q(Context context, 0lg r8, String str, String str2) {
        C51974G9v.A1M(r8, str, str2);
        ContentResolver A0B = JTP.A0B(context.getApplicationContext());
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            C64428Lbj lbj = new C64428Lbj(this, 1);
            this.A03 = lbj;
            ? obj = new Object();
            obj.A00 = lbj;
            this.A01 = new LQW(A0B, RW4.A00(packageManager), obj, this.A03);
            this.A00 = new C11239SGz(context, packageManager);
            this.A02 = new JVE(r8, str, str2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
