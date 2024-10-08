package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class HCA extends C249383je implements C13907Tl7 {
    public final int A00;
    public final Activity A01;
    public final C227762js A02;
    public final UserSession A03;
    public final List A04;
    public final boolean A05;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    private final void A00(float f) {
        float f2 = 1.0f - (f / ((float) this.A00));
        for (View alpha : this.A04) {
            alpha.setAlpha(f2);
        }
    }

    public final void A01() {
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        Activity activity = this.A01;
        AnonymousClass37D A012 = r0.A01(activity);
        if (A012 == null || !((AnonymousClass37F) A012).A0g) {
            C227762js r02 = this.A02;
            float f = r02.A00 - r02.A01;
            A00(f);
            if (this.A05 && !AnonymousClass1GD.A03()) {
                if (f > 25.0f && !2db.A0A(activity)) {
                    2db.A06(activity, true);
                } else if (f == 0.0f && 2db.A0A(activity)) {
                    2db.A06(activity, false);
                }
            }
        }
    }

    public final void onPause(AnonymousClass07Z r3) {
        for (Object A1M : this.A04) {
            C51969G9p.A1M(A1M);
        }
    }

    public final void onResume(AnonymousClass07Z r4) {
        for (View visibility : this.A04) {
            visibility.setVisibility(0);
        }
        C227762js r0 = this.A02;
        A00(r0.A00 - r0.A01);
    }

    public final void onStop(AnonymousClass07Z r4) {
        if (this.A05 && !AnonymousClass1GD.A03()) {
            Activity activity = this.A01;
            if (!2db.A0A(activity)) {
                C317756nm.A04(activity, this.A03, false);
            }
        }
    }

    public HCA(Activity activity, C227762js r2, UserSession userSession, List list, int i, boolean z) {
        AnonymousClass7TG.A1P(userSession, list);
        this.A03 = userSession;
        this.A01 = activity;
        this.A04 = list;
        this.A02 = r2;
        this.A00 = i;
        this.A05 = z;
    }

    public final void onScroll(C238133Ar r3, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0fD.A03(662129944);
        A01();
        AnonymousClass0fD.A0A(1063520295, A032);
    }
}
