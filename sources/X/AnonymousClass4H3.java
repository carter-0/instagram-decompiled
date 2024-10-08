package X;

import com.instagram.common.session.UserSession;
import com.instagram.tagging.widget.TagsLayout;

/* renamed from: X.4H3  reason: invalid class name */
public abstract class AnonymousClass4H3 {
    public static final void A00(UserSession userSession, AnonymousClass47O r10, C247083fk r11, AnonymousClass3VD r12, boolean z, boolean z2) {
        C247083fk r4 = r11;
        0qQ.A0B(r11, 1);
        AnonymousClass47O r8 = r10;
        0qQ.A0B(r10, 5);
        AnonymousClass3VD r7 = r12;
        if (!r11.A06) {
            r12.A08.setVisibility(8);
            return;
        }
        if (z2) {
            2eQ.A04(r12.A08, 4);
        }
        AnonymousClass3W1 r6 = r11.A04;
        TagsLayout tagsLayout = r12.A08;
        tagsLayout.setVisibility(0);
        tagsLayout.removeAllViews();
        r12.A05 = ((Boolean) ((0sP) r11.A02.A04).invoke(Boolean.valueOf(z))).booleanValue();
        UserSession userSession2 = userSession;
        if (r6.A20) {
            r12.A02(userSession, r11, false);
        }
        if (!(r6 == r12.A01 && r11.A01 == r12.A00)) {
            r12.A01(userSession, r6, r10, r11);
        }
        int i = r11.A00;
        AnonymousClass3W1 r2 = r12.A01;
        if (r2 != null) {
            r2.A0M(r12, Integer.valueOf(i), true);
        }
        r12.A00 = i;
        r12.A01 = r6;
        r6.A0L(r12, Integer.valueOf(i), true);
        boolean A06 = 182.A06(0Tu.A06, userSession, 36325858432333095L);
        r12.A06 = A06;
        if (C262574Fa.A00(userSession, r11.A03) || A06) {
            r12.A04 = new AnonymousClass9MZ(11, r4, userSession2, r6, r7, r8);
        }
    }
}
