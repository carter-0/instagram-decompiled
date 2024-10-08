package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.4Gm  reason: invalid class name and case insensitive filesystem */
public abstract class C262914Gm {
    public static final C244023aW A00(UserSession userSession, 1Xj r13, 1Xj r14, AnonymousClass4DU r15, AnonymousClass3W1 r16, C262864Gh r17, AnonymousClass3V9 r18, boolean z) {
        0qQ.A0B(r13, 0);
        0qQ.A0B(r14, 1);
        AnonymousClass3W1 r4 = r16;
        0qQ.A0B(r4, 2);
        C262864Gh r8 = r17;
        0qQ.A0B(r8, 3);
        AnonymousClass4DU r7 = r15;
        0qQ.A0B(r15, 5);
        AnonymousClass3V9 r10 = r18;
        C262924Gn r9 = new C262924Gn(r10);
        UserSession userSession2 = userSession;
        return new C244023aW(userSession2, (String) null, new AnonymousClass9MF(2, r7, userSession, r13), new C377569Mi(userSession2, (Object) null, r4, r13, r14, r7, r8, r9, r10, 1, z), true);
    }

    public static final void A01(UserSession userSession, 1Xj r20, 1Xj r21, AnonymousClass4DU r22, AnonymousClass3W1 r23, C262864Gh r24, AnonymousClass3VA r25, AnonymousClass3V9 r26, C262944Gp r27) {
        String str;
        Product product;
        User user;
        AnonymousClass3VA r18 = r25;
        1Xj r11 = r20;
        0qQ.A0B(r11, 0);
        1Xj r6 = r21;
        0qQ.A0B(r6, 1);
        AnonymousClass3W1 r12 = r23;
        0qQ.A0B(r12, 2);
        C262864Gh r10 = r24;
        0qQ.A0B(r10, 3);
        AnonymousClass4DU r4 = r22;
        0qQ.A0B(r4, 4);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 5);
        C262944Gp r13 = r27;
        0qQ.A0B(r13, 6);
        AnonymousClass3V9 r2 = r26;
        0qQ.A0B(r2, 7);
        if (r25 == null) {
            r18 = C243193Xt.A02(userSession2, r11, r6);
        }
        int A15 = r11.A15(userSession2);
        int ordinal = r18.ordinal();
        switch (r12.A07(A15, ordinal).A00.intValue()) {
            case 0:
                str = "HIDDEN";
                break;
            case 1:
                str = "ICON_ONLY";
                break;
            default:
                str = "EXPANDED";
                break;
        }
        String name = r18.name();
        String id = r11.getId();
        if (id != null) {
            1iA BR7 = r11.BR7();
            0xI A00 = 0xI.A00(r4, "instagram_media_tag_indicator_tapped");
            A00.A0C("indicator_state", str);
            A00.A0C("indicator_type", name);
            A00.A0C("m_pk", id);
            A00.A08(Integer.valueOf(BR7.A00), "m_t");
            C60510iO.A00(userSession2).EFq(A00);
            switch (ordinal) {
                case 1:
                case 2:
                    r10.DWf(r11, r12, r13);
                    return;
                case 3:
                case 4:
                    ArrayList A3K = r11.A3K(true);
                    if (A3K == null || (product = (Product) 00k.A0J(A3K)) == null || (user = product.A0B) == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    r10.DZv(r11, r12, r13, user, r2.A0B);
                    return;
                case 5:
                    r10.D3j(r2.A09(), AnonymousClass5OC.PREVIEW_ICON, r4, r11, r12);
                    return;
                case 6:
                    r10.D45(r11);
                    return;
                case 7:
                    r10.DvE(r11, r12, r13, new C57436Iag(userSession2, r11, r12, r18, r2));
                    return;
                case 8:
                    r10.DHH(r4, r6);
                    return;
                case 9:
                    r10.D4C(r11);
                    return;
                case 11:
                    r10.DJK(r2.A09(), r11, r12, r6.A0C.CCd());
                    return;
                case 16:
                    r10.DJl(r4, r11);
                    return;
                default:
                    return;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }
}
