package X;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class GX1 extends C249403jg implements C13907Tl7 {
    public int A00;
    public final List A01;
    public final int A02;
    public final Activity A03;
    public final UserSession A04;
    public final boolean A05 = true;

    public GX1(Activity activity, UserSession userSession, List list, int i, int i2) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = activity;
        this.A01 = list;
        this.A02 = i + i2;
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final void A00(int i) {
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        Activity activity = this.A03;
        AnonymousClass37D A012 = r0.A01(activity);
        if (A012 == null || !((AnonymousClass37F) A012).A0g) {
            float f = 1.0f - (((float) i) / ((float) this.A02));
            if (f < 0.0f) {
                f = 0.0f;
            }
            float f2 = (1.0f - f) + 0.2f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            for (View alpha : this.A01) {
                alpha.setAlpha(f2);
            }
            if (this.A05 && !AnonymousClass1GD.A03()) {
                if (f == 0.0f && 2db.A0A(activity)) {
                    2db.A06(activity, false);
                }
                int i2 = (f > 0.2f ? 1 : (f == 0.2f ? 0 : -1));
                boolean A0A = 2db.A0A(activity);
                if (i2 > 0) {
                    if (!A0A) {
                        2db.A06(activity, true);
                    }
                } else if (A0A) {
                    2db.A06(activity, false);
                }
            }
        }
    }

    public final void onPause(AnonymousClass07Z r3) {
        for (Object A1M : this.A01) {
            C51969G9p.A1M(A1M);
        }
    }

    public final void onResume(AnonymousClass07Z r4) {
        for (View visibility : this.A01) {
            visibility.setVisibility(0);
        }
        A00(this.A00);
    }

    public final void onStop(AnonymousClass07Z r4) {
        if (this.A05 && !AnonymousClass1GD.A03()) {
            Activity activity = this.A03;
            if (!2db.A0A(activity)) {
                C317756nm.A04(activity, this.A04, false);
            }
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0fD.A03(2091005857);
        0qQ.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset < 0) {
            computeVerticalScrollOffset = 0;
        }
        this.A00 = computeVerticalScrollOffset;
        A00(computeVerticalScrollOffset);
        AnonymousClass0fD.A0A(1494574719, A032);
    }
}
