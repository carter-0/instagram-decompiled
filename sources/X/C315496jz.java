package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6jz  reason: invalid class name and case insensitive filesystem */
public final class C315496jz {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public long A06 = -1;
    public Paint A07;
    public View A08;
    public View A09;
    public View A0A;
    public 2cs A0B;
    public IgImageView A0C;
    public C316026kz A0D;
    public AnonymousClass6Z4 A0E;
    public Integer A0F = AnonymousClass05K.A00;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Context A0J;
    public final View A0K;
    public final UserSession A0L;
    public final C252063oV A0M;
    public final C252063oV A0N;

    public static final void A00(View view, C64434Lbp lbp, C315496jz r3, boolean z) {
        if (view != null) {
            lbp.A01(new K0D(view, r3, z));
        }
    }

    public final void A01(Integer num) {
        View view = this.A09;
        if (view != null) {
            this.A0F = AnonymousClass05K.A01;
            view.animate().setListener((Animator.AnimatorListener) null).withLayer().setDuration(200).alpha(0.0f).withEndAction(new C66011M7w(this, num));
        }
    }

    public C315496jz(Context context, View view, UserSession userSession) {
        this.A0L = userSession;
        this.A0J = context;
        this.A0K = view;
        this.A0M = 2b1.A01(view.findViewById(R.id.reel_viewer_gestures_nux_stub), false, false);
        this.A0N = 2b1.A01(view.findViewById(R.id.reel_viewer_gestures_zoom_nux_stub), false, false);
    }
}
