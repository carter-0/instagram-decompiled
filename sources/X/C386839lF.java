package X;

import android.graphics.BitmapFactory;
import java.lang.ref.WeakReference;

/* renamed from: X.9lF  reason: invalid class name and case insensitive filesystem */
public final class C386839lF extends 0ng {
    public final /* synthetic */ C362478hy A00;
    public final /* synthetic */ C365798nh A01;
    public final /* synthetic */ WeakReference A02;

    public final void run() {
        C362478hy r9 = this.A00;
        C365798nh r8 = this.A01;
        WeakReference weakReference = this.A02;
        String A012 = r8.A01();
        if (weakReference.get() != null && r8.A01() != null) {
            BitmapFactory.Options options = r9.A02;
            BitmapFactory.decodeFile(A012, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int i3 = r9.A01;
            int i4 = r9.A00;
            int i5 = 1;
            while (i / i5 > i3 && i2 / i5 > i4) {
                i5 *= 2;
            }
            C362478hy.A05.put(002.A0o(r8.A06, "?", "x", i3, i4), Integer.valueOf(i5));
            C362478hy.A00(r9, r8, weakReference, i5);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386839lF(C362478hy r2, C365798nh r3, WeakReference weakReference) {
        super(1910247448);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = weakReference;
    }
}
