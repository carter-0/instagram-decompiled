package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SoundPlatformProduct;

/* renamed from: X.GoS  reason: case insensitive filesystem */
public final class C53435GoS extends AnonymousClass0T0 implements JSF {
    public final SoundPlatformProduct A00;
    public final String A01;

    public final C53435GoS F0e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53435GoS) {
                C53435GoS goS = (C53435GoS) obj;
                if (!0qQ.A0K(this.A01, goS.A01) || this.A00 != goS.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ago() {
        return this.A01;
    }

    public final SoundPlatformProduct Bxd() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAudioGoDarkInfoText", HTN.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C53435GoS(SoundPlatformProduct soundPlatformProduct, String str) {
        AnonymousClass7TG.A1O(str, soundPlatformProduct);
        this.A01 = str;
        this.A00 = soundPlatformProduct;
    }
}
