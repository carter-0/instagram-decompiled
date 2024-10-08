package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;

public final class LA9 {
    public LQW A00;
    public C11032S6k A01 = C11032S6k.A00.A00();
    public ContentResolver A02;
    public PackageManager A03;
    public AnonymousClass1Tr A04;
    public 1To A05;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.1Tr, java.lang.Object] */
    public LA9(Context context) {
        0qQ.A0B(context, 1);
        this.A02 = context.getApplicationContext().getContentResolver();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            this.A03 = packageManager;
            C64428Lbj lbj = new C64428Lbj(this, 4);
            this.A05 = lbj;
            ? obj = new Object();
            obj.A00 = lbj;
            this.A04 = obj;
            C10549Ru3 A002 = RW4.A00(packageManager);
            ContentResolver contentResolver = this.A02;
            if (contentResolver == null) {
                0qQ.A0F("contentResolver");
                throw AnonymousClass00P.createAndThrow();
            } else {
                this.A00 = new LQW(contentResolver, A002, this.A04, this.A05);
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }
}
