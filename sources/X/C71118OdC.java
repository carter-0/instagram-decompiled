package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.OdC  reason: case insensitive filesystem */
public final class C71118OdC {
    public static final C71118OdC A00 = new Object();

    public static final boolean A03(Activity activity, Context context, AnonymousClass0iw r8, UserSession userSession, 2EM r10, int i, boolean z) {
        boolean A1U = AnonymousClass7TF.A1U(0, context, activity);
        0qQ.A0B(userSession, 2);
        BizUserInboxState A0L = C66582MXn.A0L(userSession);
        if ((i == A1U || 0qQ.A0K(r10, AnonymousClass2EL.A00) || ((0qQ.A0K(r10, AnonymousClass2EU.A00) || i == 0) && z)) && A0L == BizUserInboxState.GENERAL_FOLDER_THROTTLED) {
            if (AnonymousClass78K.A00(userSession)) {
                C358248ab A0Y = DbS.A0Y(context);
                DbT.A19(context, A0Y, 2131963034);
                DbU.A17(context, A0Y, 2131963036);
                A0Y.A0d(C71221Ofm.A00, AnonymousClass7TE.A16(context, 2131968772));
                A0Y.A0a(new C71183Of1(9, activity, userSession), AnonymousClass7TE.A16(context, 2131963039));
                DbT.A1V(A0Y);
                C3265677h.A0P(r8, userSession, (Boolean) null, "business_inbox_hmps_thread_action_blocked_dialog_impression", 2);
                return A1U;
            } else if (z && C66582MXn.A1Q(userSession)) {
                A00(activity, context, userSession);
                return A1U;
            }
        }
        return false;
    }

    public final void A04(Context context, N4G n4g, UserSession userSession, 2Dm r27, DirectThreadKey directThreadKey, C62320sa r29, boolean z) {
        boolean z2;
        int i;
        2Dm r10 = r27;
        DirectThreadKey directThreadKey2 = directThreadKey;
        AnonymousClass7TG.A1Q(r10, directThreadKey2);
        2Dr r0 = (2Dr) r10;
        AnonymousClass3U9 A03 = 2Dr.A03(r0, directThreadKey2);
        Context context2 = context;
        N4G n4g2 = n4g;
        UserSession userSession2 = userSession;
        C62320sa r12 = r29;
        boolean z3 = z;
        if (A03 != null) {
            boolean CZA = 2Dr.A00(A03, r0).CZA();
            i = A03.C6a();
            z2 = A03.isPending();
            if (CZA && !z && 3 <= ((long) r10.BcZ(n4g2.A00, true))) {
                C73677Phq phq = new C73677Phq(context2, n4g2, userSession2, r10, directThreadKey2, r12, i, z2);
                String A01 = C66786McX.A01(context2, userSession2, AnonymousClass53K.A00(2EN.A05, n4g2.A00), false);
                C358248ab A0Y = DbS.A0Y(context2);
                A0Y.A05 = DbW.A0h(context2, A01, 2131960640);
                DbY.A0w(context2, A0Y, A01, 2131960639);
                String A16 = AnonymousClass7TE.A16(context2, 2131960638);
                C71249OgE A002 = C71249OgE.A00(phq, 49);
                C358278ae r2 = C358278ae.DEFAULT;
                A0Y.A0Y(A002, r2, A16, true);
                A0Y.A0W(C71222Ofn.A00, r2, AnonymousClass7TE.A16(context2, 2131954722), true);
                DbT.A1V(A0Y);
                return;
            }
        } else {
            i = 0;
            z2 = false;
        }
        A01(context2, n4g2, userSession2, directThreadKey2, r12, i, z3, z2);
    }

    public static final void A01(Context context, N4G n4g, UserSession userSession, DirectThreadKey directThreadKey, C62320sa r11, int i, boolean z, boolean z2) {
        String str;
        UserSession userSession2 = userSession;
        if (i == 29) {
            C66665MaY A08 = C66669Mac.A08(userSession, C65811gt.class);
            0qQ.A0B(A08, 1);
            1OS r0 = new 1OS(A08);
            r0.A00 = directThreadKey;
            r0.A01 = z;
            C66580MXl.A1P(userSession, r0);
            C71140Odl A002 = OPT.A00(userSession);
            String str2 = directThreadKey.A00;
            if (str2 != null) {
                0Aj A003 = C71140Odl.A00(A002);
                if (A003.isSampled()) {
                    C71140Odl.A04(A003, A002);
                    if (z) {
                        str = "channel_hide_in_messages";
                    } else {
                        str = "channel_show_in_messages";
                    }
                    C66582MXn.A19(A003, str);
                    Dba.A1B(A003, "source", "channel");
                    A003.AAJ("ig_thread_id", str2);
                    A003.Cgf();
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            String str3 = directThreadKey.A00;
            if (str3 != null) {
                C66671Mae.A01(n4g, userSession, str3);
                OPR.A01(context, n4g, userSession2, (String) null, 1, !z2);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        r11.invoke();
    }

    public static final void A00(Activity activity, Context context, UserSession userSession) {
        C358248ab A0Y = DbS.A0Y(context);
        DbT.A19(context, A0Y, 2131963033);
        DbU.A17(context, A0Y, 2131963035);
        A0Y.A0d(C71219Ofk.A00, AnonymousClass7TE.A16(context, 2131968772));
        A0Y.A0a(new C71183Of1(8, activity, userSession), AnonymousClass7TE.A16(context, 2131963039));
        DbT.A1V(A0Y);
    }

    public static final void A02(Context context, AnonymousClass0iw r9, UserSession userSession, String str, String str2, String str3) {
        C358248ab A0Y = DbS.A0Y(context);
        DbT.A19(context, A0Y, 2131954405);
        DbU.A17(context, A0Y, 2131954404);
        A0Y.A0c(new C50000FIl(r9, userSession, str, str2, str3, 1), AnonymousClass7TE.A16(context, 2131968772));
        DbT.A1V(A0Y);
        C3265677h.A0R(r9, userSession, "unsupported_dialog_impression", str, str2, str3);
    }
}
