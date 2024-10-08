package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jX  reason: invalid class name and case insensitive filesystem */
public final class C315216jX implements C315036jF {
    public static final Rect A01 = new Rect();
    public final UserSession A00;

    public final View C8E(C255773uh r2, C316026kz r3) {
        return null;
    }

    public final void DsI(Context context, AnonymousClass0iw r10, UserSession userSession, C255773uh r12, C250973mM r13) {
        0xa r3;
        String str;
        DDv A02;
        C255773uh r5 = r12;
        C255783ui A002 = A00(userSession, r12);
        if (A002 != null) {
            int ordinal = A002.A11.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    r3 = 1Au.A00(userSession).A01;
                    str = "anti_bully_global_tooltip_shown_count";
                } else if (ordinal == 51) {
                    r3 = 1Au.A00(userSession).A01;
                    str = "voter_registration_tooltip_shown_count";
                } else if (!(ordinal != 4 || (A02 = A02(A002)) == null || A02.A09 == null)) {
                    1Av A003 = 1Au.A00(userSession);
                    String str2 = A02.A09;
                    0qQ.A0B(str2, 0);
                    A003.A10(str2, A003.A01.getInt(002.A0R("bloks_shown_count_", str2), 0) + 1);
                }
                int i = r3.getInt(str, 0) + 1;
                0xY AR4 = r3.AR4();
                AR4.E5Z(str, i);
                AR4.apply();
            } else {
                r3 = 1Au.A00(userSession).A01;
                str = "anti_bully_tooltip_shown_count";
                int i2 = r3.getInt(str, 0) + 1;
                0xY AR42 = r3.AR4();
                AR42.E5Z(str, i2);
                AR42.apply();
            }
            AnonymousClass3WT r1 = A002.A11;
            if (r1 == AnonymousClass3WT.ANTI_BULLY_ENG_ONLY || r1 == AnonymousClass3WT.ANTI_BULLY_GLOBAL || r1 == AnonymousClass3WT.VOTER_REGISTRATION || (r1 == AnonymousClass3WT.BLOKS_TAPPABLE && !A002.A0O())) {
                0wc A012 = AnonymousClass0kN.A01(r10, userSession);
                0qQ.A0B(r12, 1);
                AIK.A00(A012, C391479t9.IMPRESSION, C391489tA.CONSUMER_STICKER_TOOLTIP, r5, A002, r12.Bkd(A002.A11));
            }
        }
    }

    public static C255783ui A00(UserSession userSession, C255773uh r2) {
        C255783ui A012 = A01(userSession, r2.Bkd(AnonymousClass3WT.ANTI_BULLY_ENG_ONLY));
        if (A012 != null) {
            return A012;
        }
        C255783ui A013 = A01(userSession, r2.Bkd(AnonymousClass3WT.ANTI_BULLY_GLOBAL));
        if (A013 != null) {
            return A013;
        }
        C255783ui A014 = A01(userSession, r2.Bkd(AnonymousClass3WT.VOTER_REGISTRATION));
        if (A014 == null) {
            return A01(userSession, r2.Bkd(AnonymousClass3WT.BLOKS_TAPPABLE));
        }
        return A014;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r4 = (X.C255783ui) r7.get(0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C255783ui A01(com.instagram.common.session.UserSession r6, java.util.List r7) {
        /*
            if (r7 == 0) goto L_0x0062
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0062
            r5 = 0
            java.lang.Object r4 = r7.get(r5)
            X.3ui r4 = (X.C255783ui) r4
            X.DDv r3 = A02(r4)
            if (r3 == 0) goto L_0x0062
            X.3WT r0 = r4.A11
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x0059
            r0 = 1
            if (r1 == r0) goto L_0x0050
            r0 = 51
            if (r1 == r0) goto L_0x0047
            r0 = 4
            if (r1 != r0) goto L_0x0062
            java.lang.String r0 = r3.A09
            if (r0 == 0) goto L_0x0045
            X.1Av r0 = X.1Au.A00(r6)
            java.lang.String r2 = r3.A09
            X.0qQ.A0B(r2, r5)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "bloks_shown_count_"
            java.lang.String r0 = X.002.A0R(r0, r2)
        L_0x003c:
            int r1 = r1.getInt(r0, r5)
        L_0x0040:
            int r0 = r3.A00
            if (r1 >= r0) goto L_0x0062
            return r4
        L_0x0045:
            r1 = 0
            goto L_0x0040
        L_0x0047:
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "voter_registration_tooltip_shown_count"
            goto L_0x003c
        L_0x0050:
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "anti_bully_global_tooltip_shown_count"
            goto L_0x003c
        L_0x0059:
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "anti_bully_tooltip_shown_count"
            goto L_0x003c
        L_0x0062:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315216jX.A01(com.instagram.common.session.UserSession, java.util.List):X.3ui");
    }

    public static DDv A02(C255783ui r2) {
        int ordinal = r2.A11.ordinal();
        if (ordinal == 0) {
            return r2.A1C;
        }
        if (ordinal == 1) {
            return r2.A1D;
        }
        if (ordinal == 51) {
            return r2.A1G;
        }
        if (ordinal != 4) {
            return null;
        }
        return r2.A1F;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        DDv A02;
        String str;
        C255783ui A002 = A00(this.A00, r5);
        if (A002 == null || (A02 = A02(A002)) == null || (str = A02.A08) == null) {
            return new C315476jx(2131975014);
        }
        return new C315476jx((CharSequence) str);
    }

    public C315216jX(UserSession userSession) {
        this.A00 = userSession;
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r8, C316026kz r9) {
        C255783ui A002 = A00(userSession, r8);
        FrameLayout Bkk = r9.Bkk();
        if (A002 == null || Bkk == null) {
            return null;
        }
        int width = Bkk.getWidth();
        int height = Bkk.getHeight();
        float A003 = r8.A00();
        Rect rect = A01;
        C306746Ni.A00(rect, A002, A003, width, height);
        return new AnonymousClass9UE(Bkk, rect.centerX(), rect.top, false);
    }

    public final boolean EtQ(UserSession userSession, C255773uh r4, C250973mM r5, C316026kz r6) {
        if (A00(userSession, r4) != null) {
            return true;
        }
        return false;
    }
}
