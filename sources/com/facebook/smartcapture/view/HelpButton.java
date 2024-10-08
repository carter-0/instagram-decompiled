package com.facebook.smartcapture.view;

import X.03v;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11408SSf;
import X.C12903TCr;
import X.C13581Td7;
import X.C13857Tic;
import X.DbW;
import X.SKW;
import X.U7B;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.smartcapture.ui.ResourcesTextView;
import com.facebook.smartcapture.ui.SCImageView;
import com.instagram.android.R;

public final class HelpButton extends LinearLayout {
    public boolean A00;
    public Drawable A01;
    public ResourcesTextView A02;
    public SCImageView A03;
    public final Handler A04 = AnonymousClass7TF.A0D();
    public final Runnable A05 = new C12903TCr(this);
    public final Paint A06 = AnonymousClass7TE.A0V(1);
    public final RectF A07 = AnonymousClass7TE.A0Y();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context);
    }

    private final void A00(Context context) {
        C13857Tic Az2;
        setOrientation(0);
        setWillNotDraw(false);
        this.A06.setColor(C11408SSf.A01(context, R.attr.sc_help_button_background));
        LayoutInflater.from(context).inflate(R.layout.help_button, this, true);
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof C13581Td7)) {
                if (!(context2 instanceof ContextWrapper)) {
                    Az2 = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            } else {
                Az2 = ((C13581Td7) context2).Az2();
                break;
            }
        }
        SCImageView sCImageView = (SCImageView) SKW.A00(this, R.id.iv_icon);
        this.A03 = sCImageView;
        String str = "ivIcon";
        if (Az2 != null) {
            if (sCImageView != null) {
                sCImageView.setImageDrawable(Az2.Bib(context));
                this.A01 = Az2.Bic(context);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        SCImageView sCImageView2 = this.A03;
        if (sCImageView2 != null) {
            sCImageView2.setColorFilter(C11408SSf.A01(context, R.attr.sc_help_button_icon));
            ResourcesTextView resourcesTextView = (ResourcesTextView) SKW.A00(this, R.id.tv_title);
            this.A02 = resourcesTextView;
            if (resourcesTextView == null) {
                str = DialogModule.KEY_TITLE;
            } else {
                C11408SSf.A04(context, resourcesTextView, R.attr.sc_help_button_text);
                setExpanded(false);
                03v.A0B(this, new U7B(1));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float min = ((float) Math.min(getMeasuredWidth(), getMeasuredHeight())) / 2.0f;
        if (this.A00) {
            ResourcesTextView resourcesTextView = this.A02;
            if (resourcesTextView == null) {
                0qQ.A0F(DialogModule.KEY_TITLE);
                throw AnonymousClass00P.createAndThrow();
            } else if (resourcesTextView.getLineCount() > 1) {
                min /= 2.0f;
            }
        }
        canvas.drawRoundRect(this.A07, min, min, this.A06);
    }

    public void setBackgroundColor(int i) {
        this.A06.setColor(i);
        invalidate();
    }

    public final void setExpanded(boolean z) {
        this.A00 = z;
        ResourcesTextView resourcesTextView = this.A02;
        if (resourcesTextView == null) {
            0qQ.A0F(DialogModule.KEY_TITLE);
            throw AnonymousClass00P.createAndThrow();
        }
        resourcesTextView.setVisibility(DbW.A01(z ? 1 : 0));
        TransitionManager.beginDelayedTransition(this);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1800556241);
        this.A07.set(0.0f, 0.0f, (float) i, (float) i2);
        AnonymousClass0fD.A0D(677007966, A062);
    }

    public final void setIsExpanded(boolean z) {
        setExpanded(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpButton(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context);
    }
}
