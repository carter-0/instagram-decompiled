package X;

import android.graphics.Bitmap;
import com.instagram.api.schemas.CameraTool;

public final class I12 {
    public static final C55905HpS A07 = new Object();
    public final Bitmap A00;
    public final C61076JwE A01;
    public final CameraTool A02;
    public final C55718HmF A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!0qQ.A0K(cls2, cls)) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.genai.magicmod.model.MagicModImageModel");
        return 0qQ.A0K(this.A04, ((I12) obj).A04);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public I12(Bitmap bitmap, CameraTool cameraTool, C55718HmF hmF, String str, String str2, boolean z) {
        C61076JwE jwE;
        this.A04 = str;
        this.A06 = z;
        this.A00 = bitmap;
        this.A05 = str2;
        this.A02 = cameraTool;
        this.A03 = hmF;
        if (bitmap != null) {
            jwE = new C61076JwE(bitmap, str);
        } else {
            jwE = null;
        }
        this.A01 = jwE;
    }
}
