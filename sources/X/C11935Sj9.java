package X;

import android.content.res.AssetManager;
import android.net.Uri;

/* renamed from: X.Sj9  reason: case insensitive filesystem */
public final class C11935Sj9 implements C13698TfG {
    public final AssetManager A00;
    public final C13534Tc6 A01;

    public final /* bridge */ /* synthetic */ boolean CJT(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public C11935Sj9(AssetManager assetManager, C13534Tc6 tc6) {
        this.A00 = assetManager;
        this.A01 = tc6;
    }

    public final /* bridge */ /* synthetic */ C10528Rth AEZ(C11856Shi shi, Object obj, int i, int i2) {
        return new C10528Rth(new C11853Shf(obj), this.A01.AEU(this.A00, obj.toString().substring(22)));
    }
}
