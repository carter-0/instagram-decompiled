package com.facebookpay.widget.apm;

import X.0qQ;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C11386SQz;
import X.C13925TlT;
import X.C54770HSc;
import X.C66580MXl;
import X.DbT;
import X.DbU;
import X.Pxf;
import X.Pxi;
import X.REP;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ApmButtonsView extends ConstraintLayout {
    public final ShimmerFrameLayout A00;
    public final ViewGroup A01;
    public final TextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApmButtonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.fbpay_apm_view, this);
        ViewGroup viewGroup = (ViewGroup) requireViewById(R.id.apm_bloks_container);
        this.A01 = viewGroup;
        TextView A0G = DbU.A0G(this, R.id.or_pay_with_card_text_view);
        this.A02 = A0G;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) requireViewById(R.id.shimmer);
        this.A00 = shimmerFrameLayout;
        C11386SQz.A02(context, viewGroup, REP.ALL_BORDERED_ALL_ROUNDED, C66580MXl.A0q(), 60);
        AnonymousClass2E0.A0A();
        Pxf.A1B(A0G, context.getColor(R.color.igds_elevated_background));
        AnonymousClass2E0.A0A();
        A0G.setTextColor(context.getColor(R.color.igds_secondary_text));
        AnonymousClass2E0.A0A();
        Drawable drawable = context.getDrawable(R.drawable.apm_buttons_shimmer_background);
        if (drawable != null) {
            AnonymousClass2E0.A0A();
            Pxi.A0u(context, drawable, shimmerFrameLayout, R.color.igds_primary_text);
            C54770HSc.A00(shimmerFrameLayout, (Integer) null);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void setupBloksApms(FragmentActivity fragmentActivity, C13925TlT tlT, Map map) {
        AnonymousClass7TG.A1T(fragmentActivity, tlT, map);
        AnonymousClass2E0.A0H().A02(AnonymousClass7TE.A0S(this), this.A01, fragmentActivity, tlT, map);
    }

    public final ShimmerFrameLayout getShimmer() {
        return this.A00;
    }

    public final void setPayWithCardText(int i) {
        DbT.A18(getContext(), this.A02, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApmButtonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ApmButtonsView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ApmButtonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
