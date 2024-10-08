package com.instagram.ui.mediaactions;

import X.0qQ;
import X.AnonymousClass3TK;
import X.AnonymousClass3TL;
import X.C56350Hx1;
import X.GQ0;
import X.I0W;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LikeActionView extends ImageView implements AnonymousClass3TK, AnonymousClass3TL {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LikeActionView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void A00() {
        setScaleX(0.0f);
        setScaleY(0.0f);
        setAlpha(1.0f);
        setRotation(0.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    public final /* synthetic */ void CvC() {
    }

    public final void E2h() {
        I0W i0w = I0W.A00;
        Context context = getContext();
        0qQ.A07(context);
        setImageDrawable(i0w.A00(context));
    }

    public final void CvR(boolean z, float f) {
        setScaleX(f);
        setScaleY(f);
        if (z) {
            f = (float) Math.min(Math.max((double) f, (double) getAlpha()), 1.0d);
        }
        setAlpha(f);
    }

    public final void CvS(GQ0 gq0, float f, float f2, float f3, float f4) {
        setScaleX(f);
        setScaleY(f);
        setAlpha(f4);
        setRotation(f3);
        setTranslationX(C56350Hx1.A01(gq0));
        Context context = getContext();
        0qQ.A07(context);
        setTranslationY(C56350Hx1.A00(context, gq0, f2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LikeActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        setImageDrawable(context.getDrawable(R.drawable.feed_like_big));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LikeActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LikeActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
