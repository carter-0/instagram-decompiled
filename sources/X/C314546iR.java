package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6iR  reason: invalid class name and case insensitive filesystem */
public final class C314546iR {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C252063oV A03;
    public final ReelViewerFragment A04;
    public final List A05 = new ArrayList();
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 35));
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 36));
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 37));
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 38));
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 39));
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 40));
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 41));
    public final AnonymousClass0eM A0D = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 42));
    public final AnonymousClass0eM A0E = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 43));
    public final AnonymousClass0eM A0F = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 44));
    public final AnonymousClass0eM A0G = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 45));
    public final AnonymousClass0eM A0H = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 47));
    public final C227862kA A0I;

    public C314546iR(Activity activity, ViewStub viewStub, AnonymousClass07Z r9, AnonymousClass07g r10, AnonymousClass0iw r11, UserSession userSession, C317376nA r13, ReelViewerFragment reelViewerFragment) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(viewStub, 8);
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = r11;
        this.A04 = reelViewerFragment;
        this.A0I = new C227862kA(new AnonymousClass9LV(r10, 48), new AnonymousClass9M1(10, r13, this), C317496nM.A00, new 0Yh(C314556iS.class));
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        this.A03 = A012;
        A012.EeU(new C314566iT(this));
        AnonymousClass0xx A002 = AnonymousClass07a.A00(r9);
        AnonymousClass9K1 r0 = new AnonymousClass9K1((Object) r9, (Object) this, (AnonymousClass4D7) null, 23);
        19B r4 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        1Eo.A03(num, r4, r0, A002);
        1Eo.A03(num, r4, new AnonymousClass9K1((Object) r9, (Object) this, (AnonymousClass4D7) null, 24), AnonymousClass07a.A00(r9));
    }

    public static final C314556iS A00(C314546iR r0) {
        return (C314556iS) r0.A0I.getValue();
    }

    public static final void A01(View view, boolean z) {
        int visibility = view.getVisibility();
        if (z) {
            if (visibility != 0) {
                C294975nL A012 = C294975nL.A01(view, 0);
                0qQ.A07(A012);
                A012.A07 = new C65729Lyj(view);
                A012.A0G();
                C294975nL A0E2 = A012.A0F(false).A0E(C71392co.A04(90.0d, 6.0d));
                A0E2.A0U(0.0f, 1.0f, -1.0f);
                A0E2.A0V(0.0f, 1.0f, -1.0f);
                A012.A0H();
            }
        } else if (visibility == 0) {
            view.setVisibility(8);
        }
    }

    public final void A02() {
        User user;
        C255773uh r0;
        C255773uh r02;
        C314556iS A002 = A00(this);
        if (C317356n8.A05(A002.A01, A002.A07)) {
            if (A002.A02.isEmpty()) {
                C255773uh r03 = A002.A01;
                if (r03 != null) {
                    user = r03.A0i;
                } else {
                    user = null;
                }
                if (0qQ.A0K(user, A002.A09.A00()) && (r0 = A002.A01) != null && r0.A0k() && (r02 = A002.A01) != null && !r02.A0j()) {
                    05G r1 = A002.A0D;
                    r1.Epw(C317366n9.A00((AnonymousClass9JK) null, (AnonymousClass9JK) null, (C247733gp) null, (C317376nA) null, (C317366n9) r1.getValue(), (CharSequence) null, (List) null, (List) null, 0, 0, 0, 536870909, true, false, false, false, false, false, false, false, false, false, false, false));
                    return;
                }
            }
            if (!A002.A02.isEmpty()) {
                05G r12 = A002.A0D;
                r12.Epw(C317366n9.A00((AnonymousClass9JK) null, (AnonymousClass9JK) null, (C247733gp) null, (C317376nA) null, (C317366n9) r12.getValue(), (CharSequence) null, (List) null, (List) null, 0, 0, 0, 536870903, false, true, false, false, false, false, false, false, false, false, false, false));
                ((C309496Ym) A002.A0A.getValue()).A01();
            }
        }
    }
}
