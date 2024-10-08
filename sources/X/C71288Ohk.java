package X;

import android.view.View;
import com.instagram.reels.viewer.attribution.CyclingFrameLayout;

/* renamed from: X.Ohk  reason: case insensitive filesystem */
public final /* synthetic */ class C71288Ohk implements View.OnClickListener {
    public final /* synthetic */ CyclingFrameLayout A00;

    public /* synthetic */ C71288Ohk(CyclingFrameLayout cyclingFrameLayout) {
        this.A00 = cyclingFrameLayout;
    }

    public final void onClick(View view) {
        CyclingFrameLayout cyclingFrameLayout = this.A00;
        if (AnonymousClass7TE.A1b(cyclingFrameLayout.A0B)) {
            cyclingFrameLayout.getCurrentVisibleView().callOnClick();
        }
    }
}
