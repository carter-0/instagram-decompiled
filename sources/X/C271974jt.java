package X;

import com.instagram.api.schemas.CommentPrompt;
import com.instagram.api.schemas.CommentPromptImpl;
import java.io.IOException;

/* renamed from: X.4jt  reason: invalid class name and case insensitive filesystem */
public abstract class C271974jt {
    public static C272044k0 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CommentPromptImpl commentPromptImpl = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C272024jy r3 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("comment_prompt".equals(A0q)) {
                    commentPromptImpl = CW9.parseFromJson(r4);
                } else if ("poll".equals(A0q)) {
                    r3 = C271984ju.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C272044k0(commentPromptImpl, r3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, C272044k0 r5) {
        r4.A0c();
        CommentPrompt commentPrompt = r5.A00;
        if (commentPrompt != null) {
            r4.A0q("comment_prompt");
            CommentPromptImpl F20 = commentPrompt.F20();
            r4.A0c();
            String str = F20.A01;
            if (str != null) {
                r4.A0R("parent_comment_id", str);
            }
            Integer num = F20.A00;
            if (num != null) {
                r4.A0P("reply_count", num.intValue());
            }
            r4.A0Z();
        }
        C272024jy r1 = r5.A01;
        if (r1 != null) {
            r4.A0q("poll");
            C271984ju.A00(r4, r1, true);
        }
        r4.A0Z();
    }
}
