package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.Vw2  reason: case insensitive filesystem */
public final class C18650Vw2 {
    public final UserSession A00;
    public final VS8 A01;

    public C18650Vw2(UserSession userSession, AnonymousClass4DU r3) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new VS8(userSession, r3);
    }

    public final View A01(Context context, ViewGroup viewGroup) {
        View A0A = DbU.A0A(DbT.A0B(context), viewGroup, R.layout.tombstone_ad_break_persistent, false);
        A0A.setTag(new C17684VcF(A0A, AnonymousClass05K.A0C, C51967G9n.A0p(context, 2131975456), (String) null));
        return A0A;
    }

    public final View A02(Context context, ViewGroup viewGroup) {
        View A0A = DbU.A0A(DbT.A0B(context), viewGroup, R.layout.tombstone_ad_break_redesign, false);
        UserSession userSession = this.A00;
        Integer num = AnonymousClass05K.A01;
        int i = 2131975448;
        if (182.A06(0Tu.A05, userSession, 36325489065473015L)) {
            i = 2131975447;
        }
        A0A.setTag(new C17684VcF(A0A, num, C51967G9n.A0p(context, i), context.getString(2131975449)));
        return A0A;
    }

    public final View A03(Context context, ViewGroup viewGroup) {
        View A0A = DbU.A0A(DbT.A0B(context), viewGroup, R.layout.tombstone_ad_break, false);
        UserSession userSession = this.A00;
        Integer num = AnonymousClass05K.A00;
        int i = 2131975445;
        if (182.A06(0Tu.A05, userSession, 36325489065473015L)) {
            i = 2131975447;
        }
        A0A.setTag(new C17684VcF(A0A, num, C51967G9n.A0p(context, i), context.getString(2131975450)));
        return A0A;
    }

    public final void A04(C61084JwM jwM, AnonymousClass0iw r17, C17684VcF vcF) {
        1Xj r4;
        long j;
        String str;
        Long A10;
        AnonymousClass0iw r13 = r17;
        C17684VcF vcF2 = vcF;
        AnonymousClass7TF.A1B(vcF2, 0, r13);
        vcF2.A01.setVisibility(0);
        C61084JwM jwM2 = jwM;
        C61084JwM jwM3 = jwM2;
        AnonymousClass0fU.A00(new WBF(8, (Object) this, (Object) vcF2, (Object) r13, (Object) jwM3), vcF2.A02);
        IgTextView igTextView = vcF2.A03;
        if (igTextView != null) {
            AnonymousClass0fU.A00(new WBF(9, (Object) this, (Object) vcF2, (Object) r13, (Object) jwM3), igTextView);
        }
        IgdsButton igdsButton = vcF2.A06;
        if (igdsButton != null) {
            AnonymousClass0fU.A00(new WBF(10, (Object) this, (Object) vcF2, (Object) r13, (Object) jwM3), igdsButton);
        }
        IgTextView igTextView2 = vcF2.A04;
        if (igTextView2 != null) {
            igTextView2.setText(vcF2.A08);
        }
        IgTextView igTextView3 = vcF2.A05;
        if (igTextView3 != null) {
            igTextView3.setText(vcF2.A09);
        }
        if (jwM != null && (r4 = (1Xj) jwM2.A01) != null && !0qQ.A0K(vcF2.A00, r4.getId())) {
            VS8 vs8 = this.A01;
            Integer num = vcF2.A07;
            long j2 = ((AnonymousClass3W1) jwM2.A02).A0c;
            0qQ.A0B(num, 1);
            UserSession userSession = vs8.A00;
            AnonymousClass4DU r11 = vs8.A01;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r11, userSession), "instagram_delayed_skip_tombstone_impression");
            if (A0e.isSampled()) {
                0jB A012 = C254513sb.A03(userSession, r4, r11, "instagram_delayed_skip_tombstone_impression").A01();
                String A07 = C231122qu.A07(userSession, r4);
                if (A07 == null || (A10 = AnonymousClass7TE.A10(A07)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                C51965G9l.A1D(A0e, Long.valueOf(j));
                C51965G9l.A1L(A0e, C294185m0.A07(userSession, r4, r11));
                C51965G9l.A1I(A0e, C294185m0.A09(r4));
                A0e.AAJ("a_pk", C51973G9u.A0j(userSession, r4));
                A0e.AAJ("carousel_media_id", (String) A012.A01(C271774jZ.A10));
                int intValue = num.intValue();
                if (intValue == 0) {
                    str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                } else if (intValue != 1) {
                    str = "persistent";
                } else {
                    str = "redesigned";
                }
                A0e.AAJ("tombstone_type", str);
                A0e.A9F(AnonymousClass000.A00(161), Long.valueOf(j2));
                A0e.A8M(XSS.A02, "page_type");
                A0e.Cgf();
            }
            vcF2.A00 = r4.getId();
        }
    }

    public static final void A00(C18650Vw2 vw2, 1Xj r7, Integer num, Integer num2) {
        long j;
        String str;
        String str2;
        Long A10;
        if (r7 != null) {
            VS8 vs8 = vw2.A01;
            0qQ.A0B(num, 1);
            UserSession userSession = vs8.A00;
            AnonymousClass4DU r6 = vs8.A01;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_delayed_skip_tombstone_click");
            if (A0e.isSampled()) {
                0jB A012 = C254513sb.A03(userSession, r7, r6, "instagram_delayed_skip_tombstone_click").A01();
                String A07 = C231122qu.A07(userSession, r7);
                if (A07 == null || (A10 = AnonymousClass7TE.A10(A07)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                C51965G9l.A1D(A0e, Long.valueOf(j));
                C51965G9l.A1L(A0e, C294185m0.A07(userSession, r7, r6));
                C51965G9l.A1I(A0e, C294185m0.A09(r7));
                A0e.AAJ("a_pk", C51973G9u.A0j(userSession, r7));
                A0e.AAJ("carousel_media_id", (String) A012.A01(C271774jZ.A10));
                int intValue = num.intValue();
                if (intValue == 0) {
                    str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                } else if (intValue != 1) {
                    str = "persistent";
                } else {
                    str = "redesigned";
                }
                A0e.AAJ("tombstone_type", str);
                if (num2.intValue() != 0) {
                    str2 = "learn_more";
                } else {
                    str2 = "dismiss";
                }
                A0e.AAJ("click_type", str2);
                A0e.A8M(XSS.A02, "page_type");
                A0e.Cgf();
            }
        }
    }
}
