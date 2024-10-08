package X;

import android.app.Activity;
import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.io.File;

/* renamed from: X.OsF  reason: case insensitive filesystem */
public final class C71872OsF implements AnonymousClass0iw, AnonymousClass7YJ {
    public static final String __redex_internal_original_name = "DirectThreadMediaSaver";
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C74331Pt7 A03;

    public final void A06(XSV xsv, 1Xj r9, 1iA r10, String str, boolean z) {
        String str2;
        AnonymousClass7AG r0;
        C254703su BRu = this.A03.BRu(str);
        if (BRu == null || (r0 = BRu.A0Q) == null) {
            str2 = null;
        } else {
            str2 = r0.A06;
        }
        A03(this, new C73675Pho(xsv, this, r9, r10, C63238Ktj.A00(str2), z));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static final C290815g0 A00(C71872OsF osF, 1Xj r8, boolean z) {
        Activity activity = osF.A00;
        return C59730JVo.A04(activity, osF.A02, C59730JVo.A05(activity, r8, __redex_internal_original_name, false, z), -1, true);
    }

    public static final C290815g0 A01(C71872OsF osF, C300925yB r11) {
        String A032;
        Activity activity = osF.A00;
        UserSession userSession = osF.A02;
        boolean A05 = r11.A05();
        if (A05) {
            A032 = r11.A04();
        } else {
            A032 = r11.A03();
        }
        return C59730JVo.A04(activity, userSession, new C11211SFl(A032, __redex_internal_original_name, A05, true, false), -1, true);
    }

    public static final void A02(XSV xsv, C71872OsF osF, C74406PuM puM, String str) {
        C290815g0 A04;
        1Xj r0;
        C74406PuM puM2 = puM;
        2FW Aqm = puM2.Aqm();
        C70045NwN nwN = C70045NwN.$redex_init_class;
        int ordinal = Aqm.ordinal();
        boolean z = false;
        String str2 = null;
        C71872OsF osF2 = osF;
        if (ordinal != 3) {
            if (ordinal != 4) {
                throw C66582MXn.A0k(Aqm, "Invalid message contentType: ", AnonymousClass7TE.A1A());
            } else if (puM2 instanceof PAP) {
                C254703su r1 = ((PAP) puM2).A00;
                C271374ik r02 = r1.A0e;
                if (r02 != null) {
                    r0 = r02.A05;
                } else {
                    r0 = null;
                }
                C331377Qt r3 = r1.A0w;
                if (r0 != null) {
                    A04 = A00(osF2, r0, false);
                } else if (r3 == null) {
                    return;
                } else {
                    if (r3.A01() || r3.A04 != null) {
                        A04 = C59730JVo.A01(osF2.A00, osF2.A02, r3);
                    } else {
                        UserSession userSession = osF2.A02;
                        AnonymousClass3Q2 A032 = 28K.A00(userSession).A03(r3.A03);
                        if (A032 != null) {
                            A04 = C59730JVo.A01(osF2.A00, userSession, C331377Qt.A00(A032, r3.A06));
                        } else {
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        } else if (puM2 instanceof PAP) {
            C254703su r03 = ((PAP) puM2).A00;
            1Xj r2 = r03.A0s;
            C300925yB r12 = r03.A0v;
            AnonymousClass7AG r04 = r03.A0Q;
            if (r04 != null) {
                str2 = r04.A06;
            }
            str2 = C63238Ktj.A00(str2);
            if (r2 != null) {
                A04 = A00(osF2, r2, false);
            } else if (r12 != null) {
                A04 = A01(osF2, r12);
            } else {
                return;
            }
        } else if (puM2 instanceof PAQ) {
            Activity activity = osF2.A00;
            UserSession userSession2 = osF2.A02;
            PAQ paq = (PAQ) puM2;
            File A0t = AnonymousClass7TE.A0t(paq.A00.getPath());
            if (paq.A01 == 1iA.A0a) {
                z = true;
            }
            A04 = C59730JVo.A04(activity, userSession2, new C11211SFl(A0t.getPath(), __redex_internal_original_name, 0, 0, z, true, false, false, false), -1, true);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        A04.A00 = new NQQ(xsv, osF2, puM2.BR7(), str, str2, puM2 instanceof PAQ);
        1ES.A03(A04);
    }

    public static final void A03(C71872OsF osF, C62320sa r5) {
        if (Build.VERSION.SDK_INT < 33) {
            Activity activity = osF.A00;
            String A002 = AnonymousClass000.A00(10);
            if (!1DL.A07(activity, A002)) {
                JTP.A11(activity, new C64729Lh6(5, r5, osF), A002);
                return;
            }
        }
        r5.invoke();
    }

    public final void A04() {
        C59689JTv.A0A(this.A00, "error");
    }

    public final void A05(XSV xsv, C74406PuM puM, String str) {
        if (Build.VERSION.SDK_INT < 33) {
            Activity activity = this.A00;
            String A002 = AnonymousClass000.A00(10);
            if (!1DL.A07(activity, A002)) {
                JTP.A11(activity, new C64729Lh6(5, new C73673Phm(puM, this, str, 11), this), A002);
                return;
            }
        }
        A02(xsv, this, puM, str);
    }

    public final void EK6(MessageIdentifier messageIdentifier, String str) {
        C254703su BRu = this.A03.BRu(messageIdentifier.A01);
        if (BRu != null) {
            2FW r2 = BRu.A10;
            0qQ.A07(r2);
            A05((XSV) null, new PAP(BRu, r2, BRu.A0W()), "message_menu");
        }
    }

    public C71872OsF(Activity activity, AnonymousClass0iw r2, UserSession userSession, C74331Pt7 pt7) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A03 = pt7;
        this.A01 = r2;
    }
}
