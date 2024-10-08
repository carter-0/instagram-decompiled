package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.Sj4  reason: case insensitive filesystem */
public final class C11930Sj4 implements C13698TfG {
    public final Context A00;

    public final /* bridge */ /* synthetic */ C10528Rth AEZ(C11856Shi shi, Object obj, int i, int i2) {
        Uri uri = (Uri) obj;
        return new C10528Rth(new C11853Shf(uri), new C11889SiO(this.A00, uri));
    }

    public final /* bridge */ /* synthetic */ boolean CJT(Object obj) {
        return C9206RTj.A00((Uri) obj);
    }

    public C11930Sj4(Context context) {
        this.A00 = context;
    }
}
