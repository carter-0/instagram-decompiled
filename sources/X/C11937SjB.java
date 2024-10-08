package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* renamed from: X.SjB  reason: case insensitive filesystem */
public final class C11937SjB implements C13698TfG {
    public final Context A00;
    public final C13698TfG A01;
    public final C13698TfG A02;
    public final Class A03;

    public final /* bridge */ /* synthetic */ C10528Rth AEZ(C11856Shi shi, Object obj, int i, int i2) {
        Uri uri = (Uri) obj;
        return new C10528Rth(new C11853Shf(uri), new C11891SiQ(this.A00, uri, shi, this.A01, this.A02, this.A03, i, i2));
    }

    public final /* bridge */ /* synthetic */ boolean CJT(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT < 29 || !C9206RTj.A00(uri)) {
            return false;
        }
        return true;
    }

    public C11937SjB(Context context, C13698TfG tfG, C13698TfG tfG2, Class cls) {
        this.A00 = context.getApplicationContext();
        this.A01 = tfG;
        this.A02 = tfG2;
        this.A03 = cls;
    }
}
