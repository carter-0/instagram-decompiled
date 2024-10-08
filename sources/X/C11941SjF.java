package X;

import android.net.Uri;
import java.util.Set;

/* renamed from: X.SjF  reason: case insensitive filesystem */
public final class C11941SjF implements C13698TfG {
    public static final Set A01 = Pxg.A18(new String[]{"http", "https"});
    public final C13698TfG A00;

    public final /* bridge */ /* synthetic */ boolean CJT(Object obj) {
        return A01.contains(((Uri) obj).getScheme());
    }

    public C11941SjF(C13698TfG tfG) {
        this.A00 = tfG;
    }

    public final /* bridge */ /* synthetic */ C10528Rth AEZ(C11856Shi shi, Object obj, int i, int i2) {
        return this.A00.AEZ(shi, new C11859Shl(obj.toString()), i, i2);
    }
}
