package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;

/* renamed from: X.5CW  reason: invalid class name */
public final class AnonymousClass5CW extends AnonymousClass0T0 implements AnonymousClass5CX {
    public final IGAdTransparencyDisclaimerPlacement A00;
    public final String A01;

    public final AnonymousClass5CW F3u() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5CW) {
                AnonymousClass5CW r5 = (AnonymousClass5CW) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement = this.A00;
        if (iGAdTransparencyDisclaimerPlacement != null) {
            i = iGAdTransparencyDisclaimerPlacement.hashCode();
        }
        return hashCode + i;
    }

    public final String BKL() {
        return this.A01;
    }

    public final IGAdTransparencyDisclaimerPlacement Bcs() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdTransparencyDisclaimerInfoDict", C44171CYk.A00(this));
    }

    public AnonymousClass5CW(IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement, String str) {
        this.A01 = str;
        this.A00 = iGAdTransparencyDisclaimerPlacement;
    }
}
