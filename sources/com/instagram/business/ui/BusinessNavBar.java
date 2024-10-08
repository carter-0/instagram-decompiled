package com.instagram.business.ui;

import X.0lg;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass703;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C71382cm;
import X.DbU;
import X.DbW;
import X.WCB;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.spinner.RefreshSpinner;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BusinessNavBar extends LinearLayout {
    public View A00;
    public View A01;
    public LinearLayout A02;
    public TitleTextView A03;
    public View A04;
    public TextView A05;
    public TextView A06;
    public RefreshSpinner A07;
    public CharSequence A08;
    public boolean A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BusinessNavBar(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void A00() {
        View view = this.A04;
        if (view != null) {
            boolean z = true;
            int i = 0;
            boolean A1S = AnonymousClass7TF.A1S(this.A03.getVisibility(), 8);
            if (this.A02.getVisibility() != 8) {
                z = false;
            }
            if (!A1S || !z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void A02(boolean z) {
        this.A03.setVisibility(DbW.A01(z ? 1 : 0));
        A00();
    }

    public final void setFooterTerms(CharSequence charSequence) {
        this.A05.setText(charSequence);
    }

    public final void setPrimaryButtonEnabled(boolean z) {
        this.A06.setEnabled(z);
        View view = this.A01;
        if (view.getBackground() != null) {
            Drawable background = view.getBackground();
            int i = 64;
            if (z) {
                i = 255;
            }
            background.setAlpha(i);
        }
    }

    public final void setPrimaryButtonOnclickListeners(View.OnClickListener onClickListener) {
        this.A06.setOnClickListener(onClickListener);
    }

    public final void setSecondaryButtonEnabled(boolean z) {
        TitleTextView titleTextView = this.A03;
        titleTextView.setEnabled(z);
        int i = 64;
        if (z) {
            i = 255;
        }
        titleTextView.setAlpha((float) i);
    }

    public final void setSecondaryButtonOnclickListeners(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public final void setSecondaryButtonText(int i) {
        DbU.A1A(getResources(), this.A03, i);
    }

    public final void setShowProgressBarOnPrimaryButton(boolean z) {
        CharSequence charSequence;
        if (this.A09 != z) {
            this.A09 = z;
            RefreshSpinner refreshSpinner = this.A07;
            int i = 4;
            if (z) {
                i = 0;
            }
            refreshSpinner.setVisibility(i);
            TextView textView = this.A06;
            if (z) {
                charSequence = "";
            } else {
                charSequence = this.A08;
            }
            textView.setText(charSequence);
            setPrimaryButtonEnabled(!z);
        }
    }

    public final void A01(View view) {
        getViewTreeObserver().addOnGlobalLayoutListener(new WCB(3, view, this));
    }

    public final void setPrimaryButtonText(int i) {
        setPrimaryButtonText((CharSequence) AnonymousClass7TF.A0d(getResources(), i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BusinessNavBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setFooterTerms(0lg r7, String str, String str2, String str3) {
        0qQ.A0B(r7, 0);
        AnonymousClass7TG.A1U(str, str2, str3);
        AnonymousClass703.A07(getContext(), this.A05, r7, str, str2, str3);
    }

    public final void setPrimaryButtonText(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        this.A08 = charSequence;
        this.A06.setText(charSequence);
    }

    public final void setSecondaryButtonText(CharSequence charSequence) {
        this.A03.setText(charSequence);
    }

    public final void setFooterTerms(0lg r8, String str, String str2) {
        AnonymousClass7TG.A1T(r8, str, str2);
        AnonymousClass703.A07(getContext(), this.A05, r8, str, str2, AnonymousClass000.A00(634));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        int resourceId2;
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        View inflate = LayoutInflater.from(context2).inflate(R.layout.business_nav_bar, this);
        this.A01 = inflate.requireViewById(R.id.primary_button_container);
        this.A06 = DbU.A0G(inflate, R.id.primary_button_text);
        this.A07 = inflate.requireViewById(R.id.primary_button_progress);
        this.A03 = (TitleTextView) inflate.requireViewById(R.id.secondary_button);
        this.A02 = (LinearLayout) inflate.requireViewById(R.id.business_fb_page_footer);
        this.A05 = DbU.A0G(inflate, R.id.business_fb_page_footer_text);
        this.A00 = inflate.requireViewById(R.id.divider_line);
        this.A04 = inflate.requireViewById(R.id.bb_extra_padding);
        this.A08 = "";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C71382cm.A0B);
            0qQ.A07(obtainStyledAttributes);
            if (obtainStyledAttributes.hasValue(0) && (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                setPrimaryButtonText((CharSequence) AnonymousClass7TE.A16(context, resourceId2));
            }
            if (obtainStyledAttributes.hasValue(1) && (resourceId = obtainStyledAttributes.getResourceId(1, 0)) != 0) {
                setSecondaryButtonText((CharSequence) context.getString(resourceId));
            }
            if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.getBoolean(2, false)) {
                this.A03.setVisibility(0);
            }
            if (obtainStyledAttributes.hasValue(3) && obtainStyledAttributes.getBoolean(3, false)) {
                this.A02.setVisibility(0);
            }
            A00();
            obtainStyledAttributes.recycle();
        }
    }
}
