package X;

import android.content.ClipData;
import android.os.Build;

/* renamed from: X.02e  reason: invalid class name */
public final class AnonymousClass02e {
    public final AnonymousClass02f A00;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0vK, java.lang.Object] */
    public AnonymousClass02e(AnonymousClass02h r4) {
        C62740vL r2;
        if (Build.VERSION.SDK_INT >= 31) {
            r2 = new C62740vL(r4);
        } else {
            ? obj = new Object();
            AnonymousClass02g r1 = r4.A00;
            obj.A02 = r1.Anj();
            obj.A01 = r1.Bxf();
            obj.A00 = r1.B6S();
            obj.A03 = r1.BMw();
            obj.A04 = r1.getExtras();
            r2 = obj;
        }
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0vK, java.lang.Object] */
    public AnonymousClass02e(ClipData clipData, int i) {
        C62740vL r0;
        if (Build.VERSION.SDK_INT >= 31) {
            r0 = new C62740vL(clipData, i);
        } else {
            ? obj = new Object();
            obj.A02 = clipData;
            obj.A01 = i;
            r0 = obj;
        }
        this.A00 = r0;
    }
}
