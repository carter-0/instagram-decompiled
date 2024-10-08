package X;

import com.instagram.api.schemas.CommentPrompt;
import com.instagram.api.schemas.CommentPromptImpl;

/* renamed from: X.Kq3  reason: case insensitive filesystem */
public abstract class C63013Kq3 {
    public static C272044k0 A00(CommentPrompt commentPrompt, C272034jz r4) {
        CommentPromptImpl commentPromptImpl;
        C272024jy r2 = null;
        1E9 A0p = C41847B3o.A0p();
        if (commentPrompt != null) {
            commentPromptImpl = commentPrompt.F20();
        } else {
            commentPromptImpl = null;
        }
        if (r4 != null) {
            r2 = r4.FGJ(A0p);
        }
        return new C272044k0(commentPromptImpl, r2);
    }
}
