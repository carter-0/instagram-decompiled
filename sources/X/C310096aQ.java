package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;

/* renamed from: X.6aQ  reason: invalid class name and case insensitive filesystem */
public final class C310096aQ {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final ReelViewerConfig A04;
    public final C228232l0 A05;
    public final String A06;
    public final String A07;

    public C310096aQ(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, AnonymousClass4DU r5, ReelViewerConfig reelViewerConfig, C228232l0 r7, String str, String str2) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(reelViewerConfig, 3);
        0qQ.A0B(str, 6);
        0qQ.A0B(str2, 7);
        0qQ.A0B(r7, 8);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A04 = reelViewerConfig;
        this.A01 = r3;
        this.A03 = r5;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = r7;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    public final void A02(HLF hlf, C255773uh r18, C250973mM r19, C309426Yf r20, User user, String str, String str2, boolean z) {
        C255773uh A0B;
        String str3;
        if (user == null) {
            0wb.A03("ReelViewerFragment#goToProfilePageIfEnabled with null user", "Not expecting to navigate to profile page without a user");
            return;
        }
        if (!this.A04.A0A) {
            boolean A2Q = user.A2Q();
            C255773uh r9 = r18;
            C250973mM r10 = r19;
            boolean z2 = z;
            A00(hlf, r9, r10, r20, this, str, A2Q, z2);
            String str4 = this.A07;
            String str5 = this.A06;
            String str6 = r9.A0k;
            int i = r10.A01;
            int i2 = r10.A0E;
            String str7 = r9.A0j;
            String id = user.getId();
            ? obj = new Object();
            obj.A09 = str4;
            obj.A05 = str5;
            obj.A04 = str6;
            obj.A01 = i;
            obj.A03 = i2;
            obj.A06 = str7;
            obj.A08 = id;
            if (A2Q) {
                UserSession userSession = this.A02;
                String A0U = r9.A0U(userSession);
                if (!(!r9.A15() || (A0B = r10.A0H.A0B(userSession, 0)) == null || (str3 = A0B.A0j) == null)) {
                    obj.A06 = str3;
                }
                if (A0U != null) {
                    C309516Yo r1 = new C309516Yo(this.A00, userSession);
                    r1.A0F = true;
                    r1.A0D(C250563lf.A0A(obj, A0U, z2));
                    r1.A04();
                    return;
                }
                return;
            }
            A01(this, obj, user.getId(), str2, z2);
        }
    }

    public final void A03(User user, String str) {
        0qQ.A0B(user, 0);
        if (!this.A04.A0A) {
            A01(this, (SourceModelInfoParams) null, user.getId(), str, false);
        }
    }

    public static final void A00(HLF hlf, C255773uh r22, C250973mM r23, C309426Yf r24, C310096aQ r25, String str, boolean z, boolean z2) {
        String str2;
        1Nv A09;
        C309426Yf r8 = r24;
        r8.A0J++;
        C255773uh r7 = r22;
        C250973mM r6 = r23;
        C310096aQ r3 = r25;
        if ((!r7.A1N()) && (A09 = r7.A09()) != null) {
            UserSession userSession = r3.A02;
            AnonymousClass4DU r13 = r3.A03;
            C296215pf r14 = new C296215pf(userSession, r6.A0H, r3.A06, r3.A07, r6.A01, r6.A0E);
            r14.A09 = r8.A0I;
            C233822wX.A0J(userSession, r14, hlf, A09, r13, (C249763kK) null, (Float) null, (Float) null, (Integer) null, (Integer) null, str, (String) null, (String) null, (String) null, 0, z, z2);
        }
        1Xj r1 = r7.A0b;
        C228232l0 r5 = r3.A05;
        C233162v9 r4 = C233162v9.PROFILE_TAP;
        if (r1 == null || (str2 = r1.A2B(r3.A02).A02) == null) {
            str2 = "UNKNOWN";
        }
        r5.DUE(new C301165yf((C376459Ib) null, (C53251Gkz) null, "", str2), r4, r7, r6);
    }

    public static final void A01(C310096aQ r9, SourceModelInfoParams sourceModelInfoParams, String str, String str2, boolean z) {
        String str3;
        C249813kP.A00.A06("profile", "reelProfileOpener", true);
        UserSession userSession = r9.A02;
        C46474Dfc A012 = C46548Dgp.A01(userSession, str, str2, r9.A01.getModuleName());
        A012.A0U = z;
        C324736zo r1 = new C324736zo(userSession);
        if (sourceModelInfoParams != null) {
            str3 = sourceModelInfoParams.A06;
        } else {
            str3 = null;
        }
        if (r1.A01(str3, str)) {
            A012.A0O = "profile_products";
            A012.A0c = false;
        }
        if (sourceModelInfoParams != null) {
            A012.A04 = sourceModelInfoParams;
        }
        if (182.A06(0Tu.A05, userSession, 36328216369052744L)) {
            C309516Yo r2 = new C309516Yo(r9.A00, userSession);
            r2.A0F = true;
            r2.A0B((Bundle) null, C46447Df9.A03().A01.A02(userSession, A012.A04()));
            r2.A04();
            return;
        }
        Bundle A013 = C46447Df9.A03().A01.A01(userSession, A012.A04());
        FragmentActivity fragmentActivity = r9.A00;
        AnonymousClass6W8 r3 = new AnonymousClass6W8(fragmentActivity, A013, userSession, ModalActivity.class, "profile");
        r3.A08();
        r3.A0C(fragmentActivity);
    }
}
