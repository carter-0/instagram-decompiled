package X;

import android.net.Uri;
import java.util.Set;

/* renamed from: X.SjE  reason: case insensitive filesystem */
public final class C11940SjE implements C13698TfG {
    public static final Set A01 = Pxg.A18(new String[]{"file", "android.resource", "content"});
    public final C13536Tc8 A00;

    public final /* bridge */ /* synthetic */ C10528Rth AEZ(C11856Shi shi, Object obj, int i, int i2) {
        Uri uri = (Uri) obj;
        return new C10528Rth(new C11853Shf(uri), this.A00.AEE(uri));
    }

    public final /* bridge */ /* synthetic */ boolean CJT(Object obj) {
        return A01.contains(((Uri) obj).getScheme());
    }

    public C11940SjE(C13536Tc8 tc8) {
        this.A00 = tc8;
    }
}
