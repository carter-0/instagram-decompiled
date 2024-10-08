package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.32b  reason: invalid class name and case insensitive filesystem */
public final class C2360132b {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C377209Ky(this, 33));
    public final AnonymousClass4DU A02;
    public final AnonymousClass57Q A03;
    public final C228232l0 A04;
    public final C249763kK A05;

    public final void A00(MotionEvent motionEvent, View view, Fragment fragment, 1Xj r18, AnonymousClass3W1 r19, 2EG r20, String str) {
        IGAdsIABScreenshotDataDict BEo;
        Context context;
        1Xj A1c;
        String str2;
        String id;
        1Xj r6 = r18;
        0qQ.A0B(r6, 1);
        AnonymousClass3W1 r5 = r19;
        0qQ.A0B(r5, 2);
        AnonymousClass0eM r3 = this.A01;
        C258403yx r1 = (C258403yx) r3.getValue();
        r1.A01(C46015DIt.A00);
        02m r4 = r1.A00;
        if (r4 != null) {
            r4.markerPoint(1056313521, AnonymousClass000.A00(3696));
        }
        AnonymousClass57Q r12 = this.A03;
        if (!(r12 == null || !r12.A08(r6, false) || (id = r6.getId()) == null)) {
            AnonymousClass57Q.A01(r12, id, true);
        }
        UserSession userSession = this.A00;
        0Tu r42 = 0Tu.A05;
        182.A06(r42, userSession, 36319819708047018L);
        C271794jb r11 = new C271794jb(userSession, r6, r5.A06());
        String str3 = null;
        if (r5.A3e && (A1c = r6.A1c(r5.A03)) != null && A1c.A5S()) {
            1Xj A1c2 = r6.A1c(r5.A03);
            if (A1c2 != null) {
                str2 = A1c2.A37(r5.A1A);
            } else {
                str2 = null;
            }
            r11.A05 = str2;
        }
        AnonymousClass4DU r122 = this.A02;
        r11.A04 = r5.A1L;
        Fragment fragment2 = fragment;
        Q03 q03 = new Q03(fragment2, userSession, r11, r122, r20);
        q03.A0J = r6;
        q03.A09 = r5.A03;
        q03.A0B = r5.getPosition();
        q03.A0K = r5;
        C249763kK r0 = this.A05;
        if (r0 != null) {
            str3 = r0.getSessionId();
        }
        q03.A0h = str3;
        q03.A0e = str;
        if (!(motionEvent == null || (context = fragment2.getContext()) == null)) {
            q03.A06 = 0nA.A01(context, motionEvent.getX());
            q03.A07 = 0nA.A01(context, motionEvent.getY());
        }
        GQ0 gq0 = r5.A0k;
        if (gq0 != null) {
            Float f = gq0.A01;
            if (f != null) {
                q03.A06 = f.floatValue();
            }
            Float f2 = gq0.A02;
            if (f2 != null) {
                q03.A07 = f2.floatValue();
            }
            Float f3 = gq0.A03;
            if (f3 != null) {
                q03.A01 = f3.floatValue();
            }
            Float f4 = gq0.A00;
            if (f4 != null) {
                q03.A00 = f4.floatValue();
            }
        }
        C262824Gd r02 = r5.A0j;
        if (r02 != null) {
            int i = r02.A01;
            Context context2 = fragment2.getContext();
            if (context2 != null) {
                q03.A05 = 0nA.A01(context2, (float) i);
            }
        }
        C262824Gd r03 = r5.A0j;
        if (r03 != null) {
            int i2 = r03.A00;
            Context context3 = fragment2.getContext();
            if (context3 != null) {
                q03.A04 = 0nA.A01(context3, (float) i2);
            }
        }
        q03.A0k = 1sx.A0E(userSession, r6, r5);
        q03.A0c = 1sx.A0A(r6, r5);
        if (C247643gg.A0B(userSession, r6)) {
            q03.A0X = r6.A0I;
        }
        if (r6.A5H()) {
            int[] iArr = new int[2];
            View view2 = view;
            if (view != null) {
                view2.getLocationInWindow(iArr);
            }
            q03.A0w = iArr;
            q03.A0A = r5.A01();
        }
        C228232l0 r7 = this.A04;
        if (r7 != null) {
            r7.DUE(C301155ye.A00(), C233162v9.CTA_CLICK, r6, r5);
        }
        C257603xf A1F = r6.A1F();
        if (!(A1F == null || A1F.BGl() == null)) {
            q03.A0F = r6.A1F();
        }
        C2608347f Atb = r6.A0C.Atb();
        if (Atb == null || !0qQ.A0K(Atb.Bud(), true) || !182.A06(r42, userSession, 36321615004313183L)) {
            C250513lZ injected = r6.A0C.getInjected();
            if (!(injected == null || (BEo = injected.BEo()) == null || !182.A06(r42, userSession, 36323741013126592L))) {
                q03.A0G = BEo;
            }
            C258403yx r13 = (C258403yx) r3.getValue();
            r13.A01(DIu.A00);
            02m r2 = r13.A00;
            if (r2 != null) {
                r2.markerPoint(1056313521, AnonymousClass000.A00(3701));
            }
            new Q02(q03).A02();
            return;
        }
        ((C258403yx) r3.getValue()).A01(C46026DJj.A00);
        FragmentActivity requireActivity = fragment2.requireActivity();
        C54127Gzw gzw = new C54127Gzw();
        C331127Pr r43 = new C331127Pr(userSession);
        r43.A0g = requireActivity.getString(2131963584);
        r43.A0K = GHY.A00(new C56766IBp(gzw, userSession, r6, r5), C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, userSession, Integer.valueOf(r5.A03));
        r43.A1J = true;
        r43.A0v = true;
        r43.A00().A02(requireActivity, gzw);
    }

    public C2360132b(UserSession userSession, AnonymousClass4DU r4, AnonymousClass57Q r5, C228232l0 r6, C249763kK r7) {
        this.A00 = userSession;
        this.A02 = r4;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
    }
}
