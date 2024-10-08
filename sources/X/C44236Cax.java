package X;

import com.instagram.api.schemas.NoteChatResponseInfoImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cax  reason: case insensitive filesystem */
public abstract class C44236Cax {
    public static NoteChatResponseInfoImpl parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            ArrayList arrayList = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("group_chat_hash".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("is_member".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r14);
                } else if ("last_num_members".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r14);
                } else if ("num_members".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r14);
                } else if ("social_context_users".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            C41846B3n.A1E(r14, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r14.A0z();
            }
            if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("group_chat_hash", r14, "NoteChatResponseInfoImpl");
            } else if (bool == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_member", r14, "NoteChatResponseInfoImpl");
            } else if (num == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("num_members", r14, "NoteChatResponseInfoImpl");
            } else if (arrayList != null || !(r14 instanceof 0c9)) {
                return new NoteChatResponseInfoImpl(num2, str, arrayList, num.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("social_context_users", r14, "NoteChatResponseInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
