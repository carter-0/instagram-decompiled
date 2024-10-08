package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;
import java.io.IOException;

/* renamed from: X.4o3  reason: invalid class name and case insensitive filesystem */
public abstract class C274304o3 {
    public static TextAppSearchDiscussionTopicImpl parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("fbid".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("image_url".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("metagen_description".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("social_context_label".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new TextAppSearchDiscussionTopicImpl(str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl) {
        r2.A0c();
        String str = textAppSearchDiscussionTopicImpl.A00;
        if (str != null) {
            r2.A0R("fbid", str);
        }
        String str2 = textAppSearchDiscussionTopicImpl.A01;
        if (str2 != null) {
            r2.A0R("image_url", str2);
        }
        String str3 = textAppSearchDiscussionTopicImpl.A02;
        if (str3 != null) {
            r2.A0R("metagen_description", str3);
        }
        String str4 = textAppSearchDiscussionTopicImpl.A03;
        if (str4 != null) {
            r2.A0R("social_context_label", str4);
        }
        String str5 = textAppSearchDiscussionTopicImpl.A04;
        if (str5 != null) {
            r2.A0R(DialogModule.KEY_TITLE, str5);
        }
        r2.A0Z();
    }
}
