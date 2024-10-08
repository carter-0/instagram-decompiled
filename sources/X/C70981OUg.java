package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.OUg  reason: case insensitive filesystem */
public final class C70981OUg {
    public static final C70981OUg A00 = new Object();

    public final void A00(UserSession userSession, 2Er r19, C70830ONc oNc, DirectThreadKey directThreadKey) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        2Er r2 = r19;
        if (r19 != null) {
            int AdN = r2.AdN();
            AnonymousClass914 Amp = r2.Amp();
            C66930MfP A002 = C69868NtW.A00(userSession2);
            C70830ONc oNc2 = oNc;
            DirectThreadKey directThreadKey2 = directThreadKey;
            if (C3269478t.A01(r2)) {
                C66930MfP.A01(A002, r2.C6C(), r2.C6k(), "daily_prompt_null_creation_sheet_rendered", "tap", "daily_prompt_button", "thread_view", r2.AdN());
                if (oNc != null) {
                    C69365Nk5 nk5 = C69365Nk5.DAILY_PROMPT;
                    int C6a = r2.C6a();
                    oNc2.A00((C59832Ja7) null, C69309NjA.COMPOSER, nk5, directThreadKey2, C6a, AdN);
                }
            } else if (Amp == null) {
            } else {
                if (Amp.A00()) {
                    if (oNc != null) {
                        UserSession userSession3 = oNc2.A01;
                        int i = 2131958868;
                        if (AnonymousClass7K4.A02(userSession3)) {
                            i = 2131958867;
                        }
                        boolean A02 = AnonymousClass7K4.A02(userSession3);
                        int i2 = 2131958866;
                        if (A02) {
                            i2 = 2131958865;
                        }
                        Activity activity = oNc2.A00;
                        C358248ab A0X = DbS.A0X(activity);
                        DbT.A19(activity, A0X, i);
                        DbU.A17(activity, A0X, i2);
                        A0X.A0R(new C71185Of3(6, oNc2, r2, Amp), C358278ae.BLUE_BOLD, 2131958864);
                        A0X.A0C(C71238Og3.A00);
                        AnonymousClass7TH.A0a(A0X, true);
                    }
                } else if (!Amp.A00() && !Amp.A05) {
                    if (182.A06(0Tu.A05, userSession2, 36328164829772840L)) {
                        if (oNc != null) {
                            C70830ONc oNc3 = oNc2;
                            oNc3.A01(C69309NjA.COMPOSER, C69365Nk5.DAILY_PROMPT, Amp, r2, directThreadKey2);
                        }
                    } else if (oNc != null) {
                        int i3 = 2131958870;
                        if (AnonymousClass7K4.A02(oNc2.A01)) {
                            i3 = 2131958869;
                        }
                        Activity activity2 = oNc2.A00;
                        C358248ab A0X2 = DbS.A0X(activity2);
                        DbT.A19(activity2, A0X2, i3);
                        A0X2.A0R(new C71185Of3(7, oNc2, r2, Amp), C358278ae.BLUE_BOLD, 2131958864);
                        A0X2.A0C(new C71183Of1(15, r2, oNc2));
                        AnonymousClass7TH.A0a(A0X2, true);
                    }
                    A002.A04(r2.C6C(), r2.C6k(), r2.AdN());
                }
            }
        }
    }
}
