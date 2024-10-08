package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import com.instagram.arlink.fragment.NametagController;

/* renamed from: X.KAy  reason: case insensitive filesystem */
public final class C61519KAy extends C252233om {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Activity A04;
    public final RectF A05;
    public final RectF A06;
    public final NametagController A07;
    public final AnonymousClass4DH A08;

    public final void onResume() {
        C65724Lye lye = new C65724Lye((Object) this, 1);
        View view = this.A08.mView;
        if (view == null || this.A05 == null || this.A01) {
            lye.onFinish();
            return;
        }
        this.A01 = true;
        view.setVisibility(4);
        view.post(new M8R(view, this, lye));
    }

    public C61519KAy(Activity activity, RectF rectF, RectF rectF2, NametagController nametagController, AnonymousClass4DH r6) {
        this.A04 = activity;
        this.A08 = r6;
        this.A07 = nametagController;
        this.A05 = rectF;
        this.A06 = rectF2;
        this.A03 = 0nA.A09(activity);
        this.A02 = 0nA.A08(activity);
    }
}
