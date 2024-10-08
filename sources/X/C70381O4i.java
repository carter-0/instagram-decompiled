package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.O4i  reason: case insensitive filesystem */
public abstract class C70381O4i {
    public static boolean A00;

    public static final void A00(AnonymousClass4DH r8, UserSession userSession, Integer num, boolean z, boolean z2) {
        C54660HMr hMr;
        C54660HMr hMr2;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, r8);
        1Av A002 = 1Au.A00(userSession);
        Context requireContext = r8.requireContext();
        if (!z) {
            0xa r7 = A002.A01;
            int i = r7.getInt("hidden_word_upsell_toast_shown_count", 0);
            if (!AnonymousClass7TF.A0Q(userSession).A2I() && !A00 && i < 3 && 182.A06(0Tu.A05, userSession, 36314073041930633L)) {
                A00 = A1U;
                JTS.A1S(r7, "hidden_word_upsell_toast_shown_count", 0);
                String A16 = AnonymousClass7TE.A16(requireContext, 2131963354);
                FdA fdA = new FdA(2, requireContext, r8, userSession);
                C310336ap A0a = DbS.A0a();
                A0a.A0D = A16;
                DbW.A0q(requireContext, A0a, 2131972991);
                A0a.A06();
                A0a.A0A(fdA);
                A0a.A0L = A1U;
                DbY.A1N(A0a);
                return;
            }
        }
        02m.A0p.markerEnd(190449529, 4);
        1pZ A003 = AnonymousClass1pc.A00();
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            hMr = C54660HMr.INBOX_DELETE;
        } else if (num == AnonymousClass05K.A01) {
            hMr = C54660HMr.COMPOSER_DELETE;
        } else if (num != AnonymousClass05K.A0C) {
            hMr = C54660HMr.UNKNOWN;
        } else if (z2) {
            hMr = C54660HMr.ALL_INBOX_DELETE;
        } else {
            hMr = C54660HMr.MULTI_INBOX_DELETE;
        }
        if (A003.Et5(userSession, hMr)) {
            1pZ A004 = AnonymousClass1pc.A00();
            Context requireContext2 = r8.requireContext();
            0xG A0O = DbS.A0O("direct_message");
            if (num == num2) {
                hMr2 = C54660HMr.INBOX_DELETE;
            } else if (num == AnonymousClass05K.A01) {
                hMr2 = C54660HMr.COMPOSER_DELETE;
            } else if (num != AnonymousClass05K.A0C) {
                hMr2 = C54660HMr.UNKNOWN;
            } else if (z2) {
                hMr2 = C54660HMr.ALL_INBOX_DELETE;
            } else {
                hMr2 = C54660HMr.MULTI_INBOX_DELETE;
            }
            A004.CnT(requireContext2, A0O, userSession, hMr2);
        }
    }
}
