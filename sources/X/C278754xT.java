package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4xT  reason: invalid class name and case insensitive filesystem */
public final class C278754xT {
    public boolean A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final C46323Dbr A04;
    public final HashSet A05 = new HashSet();
    public final HashSet A06 = new HashSet();
    public final HashSet A07 = new HashSet();
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C278754xT(Context context, UserSession userSession, String str) {
        0qQ.A0B(context, 1);
        this.A02 = context;
        this.A03 = userSession;
        this.A0C = str;
        this.A04 = new C46323Dbr(userSession.A06);
        0Tu r2 = 0Tu.A05;
        this.A0A = 182.A06(r2, userSession, 36315743784472058L);
        this.A09 = 182.A06(r2, userSession, 36317951397205688L);
        this.A08 = 182.A06(r2, userSession, 36316388029370665L);
        this.A0D = 182.A06(r2, userSession, 36316388029960495L);
        this.A0E = 182.A06(r2, userSession, 36316388029829421L);
        this.A0F = 182.A06(r2, userSession, 36316388029894958L);
        this.A01 = (int) 182.A01(r2, userSession, 36606388516296103L);
        this.A0B = C278764xU.A00(userSession);
    }

    public final void A05(AnonymousClass540 r19) {
        String A002;
        String str = "";
        if (this.A0D && (A002 = A00(WNO.A00, this)) != null) {
            str = A002;
        }
        UserSession userSession = this.A03;
        1NY r7 = new 1NY(userSession, -2);
        r7.A08(AnonymousClass05K.A0N);
        r7.A0O((15p) null, C3727892k.class, C3727992l.class, false);
        r7.A0A("users/{user_id}/info/");
        r7.A9m("is_prefetch", "true");
        String str2 = this.A04.A00;
        r7.A9m(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        r7.A0F("x_RESPONSE_SHAPE_LOGGING", str);
        r7.A0A = "users/{user_id}/info/";
        r7.A07(AnonymousClass05K.A0Y);
        1OC A0M = r7.A0M();
        HashSet hashSet = this.A05;
        C3727792j r0 = C3727792j.USER_INFO;
        hashSet.add(r0);
        1P2 A003 = 1P1.A00(userSession);
        String A012 = C3727392e.A01(r0, str2);
        0qQ.A0B(A012, 0);
        1P2.A00(A003, AnonymousClass93P.A00, (1P0) null, new C47644EBe(r19, this), A0M, (1OC) null, A012, 21600, true, false);
    }

    public static final void A01(AnonymousClass540 r13, 1OC r14, C278754xT r15, boolean z) {
        1P2 A002 = 1P1.A00(r15.A03);
        String A012 = C3727392e.A01(C3727792j.GRAPHQL_USER_INFO, r15.A04.A00);
        0qQ.A0B(A012, 0);
        1P2.A00(A002, AnonymousClass93P.A00, (1P0) null, new C47660EBu(r13, r15, z), r14, (1OC) null, A012, 21600, true, false);
    }

    public static final void A02(AnonymousClass540 r1, C278754xT r2) {
        if (r2.A05.isEmpty() && r2.A06.isEmpty() && r2.A07.isEmpty()) {
            r2.A00 = false;
            r1.AVX("self_profile_background_prefetch");
        }
    }

    public static final void A03(AnonymousClass540 r8, C278754xT r9, List list) {
        1Xj A1c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xj r1 = (1Xj) it.next();
            ImageUrl A1Q = r1.A1Q();
            if (A1Q != null) {
                C19213WPt wPt = new C19213WPt(r8, r9);
                r9.A06.add(wPt);
                1OO A0J = 1NK.A00().A0J(A1Q, "self_profile_background_prefetch");
                A0J.A02(wPt);
                A0J.A0I = true;
                A0J.A0F = false;
                arrayList.add(A0J);
                if (r1.CeS() || (r1.A5D() && (A1c = r1.A1c(r1.A0w())) != null && A1c.CeS())) {
                    if (!r1.A5D() || (r1 = r1.A1c(r1.A0w())) != null) {
                        C19841WgM wgM = new C19841WgM(r8, r9);
                        r9.A07.add(wgM);
                        C256203vO r12 = new C256203vO(r1.CEL(), "self_profile_background_prefetch");
                        r12.A01(wgM, r9.A01);
                        arrayList2.add(r12);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((1OO) it2.next()).A00().E5t();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C255593uO.A00(r9.A03).A01((C256203vO) it3.next());
        }
    }

    public static final void A04(C278754xT r3, String str, Throwable th) {
        String str2 = r3.A0C;
        if (str2 != null && str2.equals("settings_update")) {
            0f9 AEf = 0wj.A01.AEf("SettingsUserUpdate", 245701013);
            AEf.ABQ("userid", r3.A04.A00);
            AEf.ABQ("fetch_method", str);
            AEf.ERJ(th);
            AEf.report();
        }
    }

    public static final String A00(AnonymousClass540 r6, C278754xT r7) {
        C50175FSh A002 = C49063Eoh.A00();
        UserSession userSession = r7.A03;
        A002.A00(userSession.A06);
        1Ef build = A002.build();
        boolean z = r7.A0D;
        if (z) {
            build.addAdditionalHttpHeader("x_RESPONSE_SHAPE_LOGGING", String.valueOf(build.hashCode()));
        }
        boolean z2 = r7.A0E;
        if (z2) {
            build.setEnsureCacheWrite(true);
            build.setNetworkTimeoutSeconds(4);
        } else if (r7.A0F) {
            build.setCacheFallbackByDuration_EXPERIMENTAL(4000);
        }
        1vn A012 = 1vm.A01(userSession);
        0qQ.A0A(build);
        A01(r6, AnonymousClass9D0.A00(A012.A03(build)), r7, z2);
        if (z) {
            return String.valueOf(build.hashCode());
        }
        return null;
    }
}
