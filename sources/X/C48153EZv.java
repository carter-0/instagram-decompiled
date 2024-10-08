package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Deprecated;

@Deprecated(message = "Use SharingAccoCrosspostingAccountLinkingManager instead")
/* renamed from: X.EZv  reason: case insensitive filesystem */
public enum C48153EZv implements CallerContextable {
    ;
    
    public static final String __redex_internal_original_name = "SharingAccount";
    public final int A00;
    public final int A01;
    public final String A02;

    public final void A03(Fragment fragment, UserSession userSession, AnonymousClass3Q3 r13, G7M g7m, Boolean bool, C62320sa r16) {
        boolean A0A;
        1Ng r1;
        C64661Lfn lfn;
        FragmentActivity requireActivity;
        boolean z = false;
        UserSession userSession2 = userSession;
        1Av A002 = 1Au.A00(userSession);
        AnonymousClass3Q3 r7 = r13;
        if (bool == null || !LTP.A09(userSession)) {
            A0A = A0A(r13);
        } else {
            A0A = bool.booleanValue();
        }
        C62320sa r8 = r16;
        if (A0A) {
            if (r16 != null) {
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36328435412385117L) || 182.A06(r2, userSession, 36328435412450654L)) {
                    requireActivity = fragment.requireActivity();
                }
            }
            if (LTP.A09(userSession)) {
                r1 = AnonymousClass1Nd.A00(userSession);
                lfn = new C64661Lfn(false);
                r1.A05(lfn);
                return;
            }
            0qQ.A0B(A002, 3);
            A06(r13, false);
            if (182.A06(0Tu.A05, userSession, 36312518263571608L)) {
                DbS.A1a(A002, "off", A002.A7j, 1Av.A8a, 241);
                return;
            }
            return;
        } else if (!A07(userSession)) {
            A04(fragment, userSession, g7m, EXN.SHARE_PHOTO);
            return;
        } else if (r16 != null && 182.A06(0Tu.A05, userSession, 36328435412385117L)) {
            requireActivity = fragment.requireActivity();
            z = true;
        } else if (LTP.A09(userSession)) {
            r1 = AnonymousClass1Nd.A00(userSession);
            lfn = new C64661Lfn(true);
            r1.A05(lfn);
            return;
        } else {
            A06(r13, true);
            return;
        }
        A00(requireActivity, userSession2, r7, r8, z);
    }

    public final boolean A09(UserSession userSession, AnonymousClass3Q3 r3) {
        0qQ.A0B(userSession, 0);
        if (this != A05) {
            return false;
        }
        if (DbX.A0m(userSession).BaE() != null || r3.Com()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: public */
    static {
        C48153EZv[] eZvArr;
        A03 = 0oU.A00(eZvArr);
    }

    public final String A01(Context context, User user) {
        String BaI;
        int i = this.A01;
        if (i != 2131961885 || (BaI = user.A03.BaI()) == null || BaI.length() == 0 || !user.CPm()) {
            return AnonymousClass7TE.A16(context, i);
        }
        String BaI2 = user.A03.BaI();
        if (BaI2 != null) {
            return BaI2;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String A02(UserSession userSession) {
        C375999Gd r1;
        if (this instanceof ER1) {
            0qQ.A0B(userSession, 0);
            if (!AnonymousClass7TF.A0Q(userSession).A1d()) {
                return "";
            }
            Class<C48153EZv> cls = C48153EZv.class;
            C376009Ge A012 = AnonymousClass9F0.A01(AnonymousClass9F0.A00(cls), userSession);
            if (A012 == null || (r1 = A012.A00) == null) {
                return null;
            }
            return r1.A00(AnonymousClass9F0.A00(cls), userSession);
        }
        0qQ.A0B(userSession, 0);
        return C363388je.A00(userSession).A00(CallerContext.A00(C48153EZv.class)).A04;
    }

    public final void A05(Fragment fragment, UserSession userSession, G7M g7m, String str) {
        String A002;
        if (this instanceof ER0) {
            AnonymousClass7TG.A1O(userSession, str);
            0qQ.A0B(g7m, 3);
            if (C363038ix.A02(userSession)) {
                Integer num = AnonymousClass05K.A00;
                C50216FTw fTw = new C50216FTw(g7m, str);
                FragmentActivity requireActivity = fragment.requireActivity();
                requireActivity.getSupportFragmentManager().A0v(new C50129FQm(fTw, 3), requireActivity, "page_linking_request");
                String A003 = AnonymousClass000.A00(1809);
                FragmentActivity requireActivity2 = fragment.requireActivity();
                E1T e1t = new E1T();
                e1t.setArguments(C48758Ejh.A00((C61073JwB) null, num, A003));
                Dbb.A0o((Bundle) null, e1t, requireActivity2, userSession);
                return;
            }
            C48920EmK.A00().A01(fragment, userSession, new C51130Fp2(g7m, 7)).A06(str, C317816nt.A00(userSession).A08("IG_FB_REEL_STORY_VIEWERS_DASHBOARD_BOTTOM"));
            return;
        }
        0qQ.A0B(userSession, 1);
        if (this instanceof ER1) {
            String A022 = A02(userSession);
            if (A022 == null || A022.length() == 0) {
                A002 = AnonymousClass000.A00(46);
            } else {
                A002 = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
            }
            C46649DiU A042 = C46649DiU.A04(A002, Dbb.A0d("ShareToOtherAppsEntryPoint", "whatsapp_linking_in_sharing_to_other_apps"));
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            DbZ.A19(fragment, A0N, 2131976862);
            AnonymousClass3M3 A023 = C49891FBs.A02(A0N, A042);
            C309516Yo A0H = DbW.A0H(fragment, userSession);
            A0H.A0A = "ShareToOtherAppsEntryPoint";
            A0H.A0F = true;
            A0H.A0D(A023);
            A0H.A04();
        }
    }

    public final void A06(AnonymousClass3Q3 r2, boolean z) {
        if (!(this instanceof ER1)) {
            0qQ.A0B(r2, 0);
            r2.EVs(z);
        }
    }

    public final boolean A07(UserSession userSession) {
        if (this instanceof ER0) {
            0qQ.A0B(userSession, 0);
            return C363378jd.A08.A04(CallerContext.A00(C48153EZv.class), userSession);
        }
        0qQ.A0B(userSession, 0);
        return AnonymousClass7TF.A0Q(userSession).A1d();
    }

    @Deprecated(message = "For Fb Feed xpost use SharingAccount.FACEBOOK.isSharingAllowedForMedia")
    public final boolean A08(UserSession userSession, AnonymousClass3Q3 r4) {
        if (this instanceof ER0) {
            0qQ.A0B(userSession, 0);
            return AnonymousClass3YO.A01(userSession, r4, C363388je.A02(C363388je.A00(userSession).A00(CallerContext.A00(C48153EZv.class))));
        } else if (r4 == null) {
            throw AnonymousClass7TE.A0y();
        } else if (r4.AdG() != AnonymousClass3QO.DEFAULT || r4.CJs() || r4.CJe() || r4.BtF()) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean A0A(AnonymousClass3Q3 r2) {
        if (this instanceof ER1) {
            return false;
        }
        0qQ.A0B(r2, 0);
        return r2.CT1();
    }

    /* access modifiers changed from: public */
    C48153EZv(int i, int i2, String str) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = i2;
    }

    private final void A00(Activity activity, UserSession userSession, AnonymousClass3Q3 r13, C62320sa r14, boolean z) {
        int i = 2131958493;
        boolean z2 = z;
        if (z) {
            i = 2131958485;
        }
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        UserSession userSession2 = userSession;
        String A0c = DbY.A0c(activity, AnonymousClass5w9.A00(userSession).A05(activity, userSession), 2131958486);
        int i2 = 2131958472;
        int i3 = 2131958490;
        if (z) {
            i2 = 2131958483;
            i3 = 2131958454;
        }
        C358248ab A0X = DbS.A0X(activity);
        A0X.A09(i);
        if (z) {
            A0X.A0q(A0c);
        }
        AnonymousClass3Q3 r5 = r13;
        C62320sa r6 = r14;
        A0X.A0I(new C49997FIg(3, r5, r6, this, userSession2, z2), i2);
        A0X.A0G(new C49997FIg(4, r5, r6, this, userSession2, z2), i3);
        A0X.A0H(FJU.A00, 2131958471);
        DbT.A1V(A0X);
    }

    public final void A04(Fragment fragment, UserSession userSession, G7M g7m, EXN exn) {
        AnonymousClass7TG.A1T(fragment, userSession, exn);
        A05(fragment, userSession, g7m, exn.A01());
    }
}
