package com.facebookpay.widget.otc;

import X.0qQ;
import X.0sP;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.C11386SQz;
import X.C11531Sbs;
import X.C51972G9s;
import X.DbU;
import X.DbY;
import X.Pxh;
import X.Pxi;
import X.REP;
import X.RH2;
import X.SRn;
import X.SSH;
import X.TXS;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;

public final class AnonCheckoutToggleButton extends ConstraintLayout {
    public 0sP A00;
    public final TextView A01;
    public final TextView A02;
    public final SwitchCompat A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonCheckoutToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = TXS.A00;
        View.inflate(context, R.layout.ecp_anon_checkout_toggle, this);
        SwitchCompat switchCompat = (SwitchCompat) requireViewById(R.id.toggle_switch);
        this.A03 = switchCompat;
        TextView A0G = DbU.A0G(this, R.id.title_text);
        this.A02 = A0G;
        TextView A0G2 = DbU.A0G(this, R.id.description_text);
        this.A01 = A0G2;
        SRn.A02(A0G, RH2.A0s);
        Resources resources = getResources();
        A0G.setTextSize(0, resources.getDimension(R.dimen.auth_edit_field_text_size));
        AnonymousClass2E0.A0A();
        A0G2.setTextColor(context.getColor(R.color.igds_secondary_text));
        A0G2.setTextSize(0, resources.getDimension(R.dimen.auth_edit_field_text_size));
        AnonymousClass2E0.A0A();
        A0G2.setLinkTextColor(context.getColor(R.color.igds_link));
        A0G2.setMovementMethod(new LinkMovementMethod());
        int[][] iArr = {Pxh.A1Y(-16842912), Pxh.A1Y(16842912)};
        AnonymousClass2E0.A0A();
        int[] iArr2 = {context.getColor(R.color.canvas_bottom_sheet_description_text_color), AnonymousClass2E0.A0A().A03(context, 44)};
        AnonymousClass2E0.A0A();
        int[] iArr3 = {context.getColor(R.color.igds_separator), AnonymousClass2E0.A0A().A03(context, 45)};
        switchCompat.A0A.setTintList(new ColorStateList(iArr, iArr2));
        switchCompat.A0B.setTintList(new ColorStateList(iArr, iArr3));
        switchCompat.setOnCheckedChangeListener(new C11531Sbs(this, 6));
    }

    public final void setOnToggleCheckedListener(0sP r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final TextView getDescriptionTextView() {
        return this.A01;
    }

    public final 0sP getOnToggleCheckedListener() {
        return this.A00;
    }

    public final SwitchCompat getOtcSwitch() {
        return this.A03;
    }

    public final TextView getTitleTextView() {
        return this.A02;
    }

    public final void setEnableRedesign(boolean z) {
        if (z) {
            Context A0S = AnonymousClass7TE.A0S(this);
            C11386SQz.A01(A0S, this, REP.ALL_BORDERED_ALL_ROUNDED);
            int dimensionPixelSize = A0S.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            int A08 = C51972G9s.A08(A0S);
            Integer valueOf = Integer.valueOf(dimensionPixelSize);
            Integer valueOf2 = Integer.valueOf(A08);
            SSH.A02(this, valueOf, valueOf, valueOf2, valueOf2);
            SSH.A03(this, (Integer) null, (Integer) null, Integer.valueOf(DbY.A01(A0S)), (Integer) null);
            return;
        }
        AnonymousClass2E0.A0A();
        Context A0S2 = AnonymousClass7TE.A0S(this);
        Drawable drawable = A0S2.getDrawable(R.drawable.apm_buttons_shimmer_background);
        if (drawable != null) {
            AnonymousClass2E0.A0A();
            Pxi.A0u(A0S2, drawable, this, R.color.igds_elevated_background);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void setToggleOn(boolean z) {
        this.A03.setChecked(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonCheckoutToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonCheckoutToggleButton(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
