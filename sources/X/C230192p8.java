package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2p8  reason: invalid class name and case insensitive filesystem */
public final class C230192p8 implements C230202p9, AnonymousClass2pA {
    public static String A06 = "v1";
    public C2361132m A00;
    public final Context A01;
    public final C227812jx A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final AnonymousClass2pB A05;

    public final void D9b(C17997VjZ vjZ) {
    }

    public final void Db7(C17983VjL vjL, C17997VjZ vjZ) {
    }

    public final void Db8(String str, int i) {
    }

    public static final void A00(WWP wwp, C230192p8 r6) {
        User user = wwp.A01.A01;
        if (user != null) {
            FragmentActivity requireActivity = r6.A02.requireActivity();
            UserSession userSession = r6.A03;
            C309516Yo r4 = new C309516Yo(requireActivity, userSession);
            r4.A0D(C46447Df9.A03().A01.A02(userSession, C46548Dgp.A01(userSession, user.getId(), "feed_survey", r6.A04.getModuleName()).A04()));
            r4.A0B = "survey_owner";
            r4.A04();
        }
    }

    public static final void A01(WWP wwp, C230192p8 r4, C57251IUm iUm) {
        if (r4.A00 != null) {
            C57214ITb iTb = new C57214ITb(wwp, iUm);
            C238133Ar scrollingViewProxy = r4.A02.getScrollingViewProxy();
            C2361132m r0 = r4.A00;
            if (r0 != null) {
                iTb.A00(r0, scrollingViewProxy);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A02(WWP wwp, C230192p8 r6, C57251IUm iUm) {
        iUm.A01 = AnonymousClass05K.A00;
        UserSession userSession = r6.A03;
        AnonymousClass4DU r2 = r6.A04;
        C17997VjZ A002 = wwp.A00();
        C254523sc r1 = new C254523sc(r2, 002.A0R("instagram_ad_", C273654mx.A00(404)));
        r1.A7J = wwp.C9L();
        String str = A002.A03.A03;
        if (str != null) {
            r1.A6X = str;
            r1.A83 = 00k.A0X(A002.A00());
            r1.A6w = 1UQ.A0K.toString();
            C233822wX.A0H(userSession, r1, r2);
            A01(wwp, r6, iUm);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ void DFo(Object obj, Object obj2) {
        WWP wwp = (WWP) obj;
        C57251IUm iUm = (C57251IUm) obj2;
        0qQ.A0B(wwp, 0);
        0qQ.A0B(iUm, 1);
        if (0qQ.A0K(A06, "v2") || 0qQ.A0K(A06, "v3")) {
            1xC r3 = 1xC.A01;
            C310336ap r2 = new C310336ap();
            r2.A0D = this.A01.getString(2131974837);
            r3.A00(new AnonymousClass3GP(r2.A00()));
            new Handler(Looper.getMainLooper()).postDelayed(new C20296Wol(wwp, this, iUm), 500);
            return;
        }
        A02(wwp, this, iUm);
    }

    public C230192p8(Context context, C227812jx r6, UserSession userSession, 2el r8, AnonymousClass4DU r9) {
        this.A01 = context;
        this.A02 = r6;
        this.A03 = userSession;
        this.A04 = r9;
        this.A05 = new AnonymousClass2pB(r8, this);
        0Tu r3 = 0Tu.A05;
        boolean A062 = 182.A06(r3, userSession, 36318106016094075L);
        boolean A063 = 182.A06(r3, userSession, 2342172694461563133L);
        if (A062) {
            A06 = "v2";
        }
        if (A063) {
            A06 = "v3";
        }
    }

    public final /* bridge */ /* synthetic */ void DFm(Object obj, Object obj2) {
    }
}
