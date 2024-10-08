package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.77o  reason: invalid class name and case insensitive filesystem */
public abstract class C3266377o {
    public static final C254873tC A01(C254703su r5) {
        Object obj = r5.A1T;
        if (!(obj instanceof C254873tC)) {
            if (obj instanceof List) {
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                if (!((List) obj).isEmpty()) {
                    Object obj2 = r5.A1T;
                    0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    if (((List) obj2).get(0) instanceof C254873tC) {
                        Object obj3 = r5.A1T;
                        0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        obj = ((List) obj3).get(0);
                    }
                }
            }
            C254873tC r3 = r5.A0j;
            if (r3 != null) {
                return r3;
            }
            ImmutableList A0H = r5.A0H();
            if (A0H == null) {
                return null;
            }
            obj = 00k.A0O(A0H, 0);
            return (C254873tC) obj;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.GenericFBAttachment");
        return (C254873tC) obj;
    }

    public static final C254873tC A02(C254933tI r3) {
        C254873tC r0 = r3.A09;
        if (r0 != null) {
            return r0;
        }
        ImmutableList A01 = r3.A01();
        if (A01 == null || 00k.A0O(A01, 0) == null) {
            throw new IllegalStateException("No generic share items");
        }
        ImmutableList A012 = r3.A01();
        if (A012 != null) {
            Object obj = A012.get(0);
            0qQ.A0A(obj);
            return (C254873tC) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A03(UserSession userSession, C254703su r3) {
        2FW r1 = r3.A10;
        if ((r1 == 2FW.A1y || r1 == 2FW.A1x) && A00(r3).A05() && !0qQ.A0K(userSession.A06, r3.BsI())) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession, C254933tI r3) {
        2FW r1 = r3.A0F;
        if ((r1 == 2FW.A1y || r1 == 2FW.A1x) && A02(r3).A05() && !2PP.A00(userSession.A06, r3.A0U)) {
            return true;
        }
        return false;
    }

    public static final C254873tC A00(C254703su r3) {
        Class<?> cls;
        C254873tC A01 = A01(r3);
        if (A01 != null) {
            return A01;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected message content object type: ");
        Object obj = r3.A1T;
        2FW r0 = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        sb.append(cls);
        sb.append(", message type: ");
        sb.append(r3.A10);
        sb.append(", replied message type: ");
        C254933tI A0P = r3.A0P();
        if (A0P != null) {
            r0 = A0P.A0F;
        }
        sb.append(r0);
        throw new IllegalStateException(sb.toString());
    }
}
