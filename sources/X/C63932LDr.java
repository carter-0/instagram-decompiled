package X;

import android.content.Context;
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.LDr  reason: case insensitive filesystem */
public final class C63932LDr {
    public final Context A00;
    public final ShimmerFrameLayout A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgView A04;
    public final AnonymousClass0eM A05 = MMT.A00(this, 2);

    public C63932LDr(Context context, View view, ShimmerFrameLayout shimmerFrameLayout) {
        0qQ.A0B(view, 2);
        this.A00 = context;
        this.A01 = shimmerFrameLayout;
        this.A04 = (IgView) view.requireViewById(R.id.dimmer_overlay);
        this.A02 = JTP.A0T(view, R.id.loading_animation);
        this.A03 = DbT.A0a(view, R.id.creating_text);
    }

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        IgSimpleImageView igSimpleImageView = this.A02;
        AnonymousClass0eM r1 = this.A05;
        igSimpleImageView.setImageDrawable(JTO.A0D(r1));
        this.A04.setVisibility(0);
        IgTextView igTextView = this.A03;
        igTextView.setVisibility(0);
        igTextView.setText(str);
        AnonymousClass61R r12 = (AnonymousClass61R) r1.getValue();
        if (!r12.isPlaying()) {
            igSimpleImageView.setVisibility(0);
            r12.EL2(0.0f);
            r12.EFK();
            r12.E2p();
        }
    }
}
