package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NativeInfoCardCommentLayout;

public final class UNG extends AnonymousClass0T0 implements C21030XAj {
    public final NativeInfoCardCommentLayout A00;
    public final C21031XAk A01;
    public final C21031XAk A02;
    public final C21032XAl A03;
    public final XAX A04;

    public final UNG F6e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNG) {
                UNG ung = (UNG) obj;
                if (!0qQ.A0K(this.A01, ung.A01) || !0qQ.A0K(this.A03, ung.A03) || this.A00 != ung.A00 || !0qQ.A0K(this.A02, ung.A02) || !0qQ.A0K(this.A04, ung.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C21031XAk ApO() {
        return this.A01;
    }

    public final C21032XAl BEM() {
        return this.A03;
    }

    public final NativeInfoCardCommentLayout BLl() {
        return this.A00;
    }

    public final C21031XAk CCr() {
        return this.A02;
    }

    public final XAX CCv() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardComment", C16830V7l.A00(this));
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public UNG(NativeInfoCardCommentLayout nativeInfoCardCommentLayout, C21031XAk xAk, C21031XAk xAk2, C21032XAl xAl, XAX xax) {
        this.A01 = xAk;
        this.A03 = xAl;
        this.A00 = nativeInfoCardCommentLayout;
        this.A02 = xAk2;
        this.A04 = xax;
    }
}
