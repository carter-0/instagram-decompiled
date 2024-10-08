package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CommentPrompt;

/* renamed from: X.4k0  reason: invalid class name and case insensitive filesystem */
public final class C272044k0 extends AnonymousClass0T0 implements C272054k1 {
    public final CommentPrompt A00;
    public final C272024jy A01;

    public final C272044k0 F1B(1E9 r1) {
        return this;
    }

    public final C272044k0 F1C(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C272044k0) {
                C272044k0 r5 = (C272044k0) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        CommentPrompt commentPrompt = this.A00;
        int i = 0;
        int hashCode = (commentPrompt == null ? 0 : commentPrompt.hashCode()) * 31;
        C272024jy r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return hashCode + i;
    }

    public final CommentPrompt ApJ() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C272034jz BdV() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCaptionAddOnData", AnonymousClass58N.A01(this));
    }

    public C272044k0(CommentPrompt commentPrompt, C272024jy r2) {
        this.A00 = commentPrompt;
        this.A01 = r2;
    }

    public final C272054k1 E78(1E9 r1) {
        return this;
    }
}
