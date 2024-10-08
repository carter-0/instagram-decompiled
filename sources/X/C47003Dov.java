package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Dov  reason: case insensitive filesystem */
public final class C47003Dov extends C249703kE {
    public final Context A00;
    public final Drawable A01;
    public final TextView A02;
    public final GradientSpinnerAvatarView A03;
    public final /* synthetic */ EGL A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47003Dov(View view, EGL egl) {
        super(view);
        this.A04 = egl;
        Context context = view.getContext();
        this.A00 = context;
        this.A02 = AnonymousClass7TG.A0R(view, R.id.active_now_username);
        GradientSpinnerAvatarView A0j = DbX.A0j(view, R.id.active_now_user_avatar);
        this.A03 = A0j;
        this.A01 = DbY.A07(context);
        A0j.setGradientSpinnerVisible(false);
        A0j.setGradientSpinnerActivated(false);
    }
}
