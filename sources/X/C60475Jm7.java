package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Jm7  reason: case insensitive filesystem */
public final class C60475Jm7 extends C249403jg implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public final float A01;
    public final int A02;
    public final ValueAnimator A03;
    public final View A04;

    public C60475Jm7(View view) {
        this.A04 = view;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A03 = valueAnimator;
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin) + (AnonymousClass7TE.A0C(resources) * 2);
        this.A02 = dimensionPixelSize;
        float A012 = AnonymousClass7TE.A01(resources, R.dimen.account_discovery_bottom_gap) / 2.0f;
        this.A01 = A012;
        view.setTranslationX((((float) dimensionPixelSize) / 2.0f) - A012);
        view.setVisibility(0);
        valueAnimator.addUpdateListener(this);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        Object A0o = C51971G9r.A0o(valueAnimator);
        if ((A0o instanceof Float) && (number = (Number) A0o) != null) {
            this.A04.setTranslationX(number.floatValue() - ((float) this.A00));
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0fD.A03(1182168302);
        this.A00 = Math.max(0, this.A00 + i);
        if (!this.A03.isRunning()) {
            View view = this.A04;
            view.setTranslationX(view.getTranslationX() - ((float) i));
        }
        AnonymousClass0fD.A0A(1621040581, A032);
    }
}
