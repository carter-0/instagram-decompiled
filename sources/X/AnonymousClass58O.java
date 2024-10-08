package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CommentPrompt;
import com.instagram.api.schemas.CommentPromptImpl;
import com.instagram.api.schemas.ImmutablePandoCommentPrompt;

/* renamed from: X.58O  reason: invalid class name */
public final class AnonymousClass58O extends 17P implements C272054k1 {
    public C272034jz A00;

    public final C272044k0 F1C(1E6 r4) {
        return F1B(new 1E9(r4, 6, false));
    }

    public final CommentPrompt ApJ() {
        return (CommentPrompt) A05(-16036028, ImmutablePandoCommentPrompt.class);
    }

    public final C272034jz BdV() {
        C272034jz r0 = this.A00;
        if (r0 == null) {
            return (C272034jz) A05(3446719, CSe.class);
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.4k1, X.58O] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AnonymousClass58N.A01(this), this);
    }

    public final C272054k1 E78(1E9 r2) {
        C272034jz BdV = BdV();
        if (BdV != null) {
            BdV.EAM(r2);
        } else {
            BdV = null;
        }
        this.A00 = BdV;
        return this;
    }

    public final C272044k0 F1B(1E9 r4) {
        CommentPromptImpl commentPromptImpl;
        CommentPrompt ApJ = ApJ();
        C272024jy r2 = null;
        if (ApJ != null) {
            commentPromptImpl = ApJ.F20();
        } else {
            commentPromptImpl = null;
        }
        C272034jz BdV = BdV();
        if (BdV != null) {
            r2 = BdV.FGJ(r4);
        }
        return new C272044k0(commentPromptImpl, r2);
    }
}
