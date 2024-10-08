package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

public abstract class HU7 {
    public static C53467Goz parseFromJson(16F r25) {
        String A00;
        String str;
        String str2;
        16F r5 = r25;
        0qQ.A0B(r5, 0);
        try {
            Boolean bool = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str3 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            LineType lineType = null;
            1Xj r16 = null;
            ArrayList arrayList = null;
            User user = null;
            Boolean bool5 = null;
            ThreadItemType threadItemType = null;
            String str4 = null;
            while (true) {
                16L A1J = r5.A1J();
                16L r10 = 16L.A09;
                A00 = C273654mx.A00(382);
                if (A1J == r10) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r5);
                if ("can_inline_expand_below".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if ("collapsed_post_suffix".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                } else if ("is_contextual".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r5);
                } else if ("is_parent_unavailable".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r5);
                } else if ("line_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                    lineType = (LineType) LineType.A01.get(str2);
                    if (lineType == null) {
                        lineType = LineType.UNRECOGNIZED;
                    }
                } else if ("post".equals(A17)) {
                    r16 = 1Xj.A00(r5);
                } else if (A00.equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C273654mx.A00(383).equals(A17)) {
                    SimpleImageUrl simpleImageUrl = User.A08;
                    user = 1aC.A00(r5, false);
                } else if ("should_show_replies_cta".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r5);
                } else if ("should_show_reply_tap_cta".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r5);
                } else if ("thread_item_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    threadItemType = (ThreadItemType) ThreadItemType.A01.get(str);
                    if (threadItemType == null) {
                        threadItemType = ThreadItemType.UNRECOGNIZED;
                    }
                } else if ("view_replies_cta_string".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            if (bool == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_inline_expand_below", r5, "ThreadItem");
            } else if (lineType == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("line_type", r5, "ThreadItem");
            } else if (r16 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("post", r5, "ThreadItem");
            } else if (arrayList == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r5, "ThreadItem");
            } else if (bool2 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("should_show_replies_cta", r5, "ThreadItem");
            } else if (threadItemType != null || !(r5 instanceof 0c9)) {
                return new C53467Goz(lineType, threadItemType, r16, user, bool3, bool4, bool5, str3, str4, arrayList, bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("thread_item_type", r5, "ThreadItem");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
