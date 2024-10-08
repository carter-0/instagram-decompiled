package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import java.util.List;

/* renamed from: X.358  reason: invalid class name */
public final class AnonymousClass358 implements C13907Tl7 {
    public static final AnonymousClass359 A06 = new Object();
    public boolean A00;
    public final C227762js A01;
    public final UserSession A02;
    public final AnonymousClass356 A03;
    public final C2365134a A04;
    public final C227872kC A05;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3Jn] */
    public final void A01(Activity activity, boolean z, int i) {
        View view;
        ViewGroup viewGroup;
        List list;
        InstagramMainActivity instagramMainActivity;
        int i2 = i;
        C240103Jp r9 = new C240103Jp(activity, new Object(), this, i2);
        ViewGroup viewGroup2 = null;
        if (!(activity instanceof AnonymousClass2ZQ) || (instagramMainActivity = (2ZR) activity) == null) {
            view = null;
            viewGroup = null;
        } else {
            view = ((2au) instagramMainActivity.A0k.getValue()).A02;
            viewGroup = instagramMainActivity.C3o();
        }
        UserSession userSession = this.A02;
        0Tu r8 = 0Tu.A05;
        if (182.A06(r8, userSession, 36317560555181391L)) {
            viewGroup2 = 2dZ.A0t.A03(activity).A0P;
        }
        if (182.A06(r8, userSession, 36323045229472536L)) {
            View[] viewArr = {view, viewGroup};
            0qQ.A0B(viewArr, 0);
            list = 03t.A0I(viewArr);
        } else {
            list = 0sn.A00;
        }
        C227762js r82 = this.A01;
        r82.A05(r9, list, 0sr.A1N(viewGroup2), (float) A06.A01(activity, this.A05, i2), true);
        if (C240043Jj.A00(userSession) && z) {
            C227762js.A00(r82, r82.A00);
        }
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final void onPause(AnonymousClass07Z r3) {
        0qQ.A0B(r3, 0);
        A00(this, true);
        this.A00 = false;
    }

    public final void onResume(AnonymousClass07Z r3) {
        0qQ.A0B(r3, 0);
        this.A00 = true;
        A00(this, false);
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public static final void A00(AnonymousClass358 r4, boolean z) {
        InstagramMainActivity A002;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        2bB r0;
        if (182.A06(0Tu.A05, r4.A02, 36323045229472536L) && (A002 = C71172bH.A00()) != null) {
            InstagramMainActivity instagramMainActivity = A002;
            2b7 r02 = instagramMainActivity.A09;
            if (r02 == null || (r0 = r02.A02) == null) {
                layoutParams = null;
            } else {
                layoutParams = r0.A08.getLayoutParams();
            }
            boolean z2 = false;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) instagramMainActivity.A0i.getValue()) != null && ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin == marginLayoutParams.bottomMargin) {
                z2 = true;
            }
            if (z != z2) {
                A002.Eu7(z);
            }
        }
    }

    public AnonymousClass358(C227762js r1, UserSession userSession, AnonymousClass356 r3, C2365134a r4, C227872kC r5) {
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = userSession;
    }
}
