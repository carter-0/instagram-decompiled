package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class UB3 extends C249403jg implements X7j {
    public ValueAnimator A00;
    public Integer A01 = AnonymousClass05K.A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final View A06;
    public final C15697Uh3 A07;
    public final C19191WOx A08;
    public final AnonymousClass0eM A09 = C51970G9q.A0o(this, 8);
    public final AnonymousClass0eM A0A = C51970G9q.A0o(this, 9);
    public final AnonymousClass0eM A0B = C51970G9q.A0o(this, 10);
    public final AnonymousClass0eM A0C = C51970G9q.A0o(this, 11);
    public final AnonymousClass0eM A0D = C51970G9q.A0o(this, 12);
    public final boolean A0E;
    public final RecyclerView A0F;

    public UB3(Context context, View view, RecyclerView recyclerView, C15697Uh3 uh3, C19191WOx wOx, boolean z) {
        0qQ.A0B(context, 1);
        this.A06 = view;
        this.A0F = recyclerView;
        this.A0E = z;
        this.A08 = wOx;
        this.A07 = uh3;
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.block_comment_empty_state_padding_top);
        this.A04 = AnonymousClass7TG.A06(context);
        if (z) {
            new C324466zK(this.A03, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION).A04(AnonymousClass7TE.A0c(this.A0C));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setDuration(250);
            W4Q.A00(ofFloat, this, 12);
            U0N.A00(ofFloat, this, 15);
            this.A00 = ofFloat;
        }
    }

    public final boolean DAf(C19015WGq wGq, float f, int i) {
        boolean z = true;
        if (i != 1 || !A00(this.A0F)) {
            z = false;
        }
        this.A02 = z;
        return z;
    }

    public static final boolean A00(RecyclerView recyclerView) {
        C252553pI r3 = recyclerView.A0D;
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r3;
        if (linearLayoutManager.A1b() + 1 != linearLayoutManager.A0U()) {
            return false;
        }
        View A0X = linearLayoutManager.A0X(linearLayoutManager.A0T() - 1);
        if (A0X == null) {
            throw AnonymousClass7TE.A0y();
        } else if (A0X.getBottom() == recyclerView.getHeight()) {
            return true;
        } else {
            return false;
        }
    }

    public final void DAR(C19015WGq wGq, float f) {
        AnonymousClass0eM r0;
        float f2 = (float) this.A03;
        float f3 = -f;
        if (f2 + f3 >= f2) {
            float f4 = (float) this.A05;
            if (f3 >= f4) {
                f3 = f4;
            }
            float f5 = f3 / f4;
            if (this.A0E) {
                r0 = this.A0B;
            } else {
                r0 = this.A0C;
            }
            ViewGroup.LayoutParams layoutParams = AnonymousClass7TE.A0c(r0).getLayoutParams();
            layoutParams.height = (int) (f2 + f3);
            AnonymousClass7TE.A0c(this.A0C).setLayoutParams(layoutParams);
            View A0c = AnonymousClass7TE.A0c(this.A09);
            float f6 = (-f3) / 2.0f;
            float f7 = (((float) (-this.A04)) * f5) + f6;
            A0c.setTranslationY(f7);
            AnonymousClass0eM r1 = this.A0A;
            AnonymousClass7TE.A0c(r1).setTranslationY(f7);
            AnonymousClass7TE.A0c(r1).setAlpha(f5);
            AnonymousClass7TE.A0c(this.A0D).setTranslationY(f6);
            this.A0F.scrollBy(0, (int) f3);
        }
    }

    public final void DAY(C19015WGq wGq, float f, float f2) {
        float abs = Math.abs(f) / ((float) this.A05);
        if (abs > 1.0f) {
            abs = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{abs, 0.0f});
        ofFloat.setDuration(250);
        W4Q.A00(ofFloat, this, 11);
        ofFloat.addListener(new U0D(this, abs, 4));
        ofFloat.start();
        this.A02 = false;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Integer num;
        int A032 = AnonymousClass0fD.A03(693264027);
        if (!this.A02) {
            boolean A002 = A00(this.A0F);
            ValueAnimator valueAnimator = this.A00;
            if (A002) {
                if (valueAnimator == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (!valueAnimator.isRunning() && AnonymousClass7TE.A0c(this.A0B).getAlpha() == 1.0f) {
                    this.A01 = AnonymousClass05K.A01;
                    valueAnimator.start();
                } else if (valueAnimator.isRunning() && this.A01 == AnonymousClass05K.A00) {
                    num = AnonymousClass05K.A01;
                }
            } else if (valueAnimator == null) {
                throw AnonymousClass7TE.A0y();
            } else if ((!valueAnimator.isRunning() && AnonymousClass7TE.A0c(this.A0B).getAlpha() == 0.0f) || (valueAnimator.isRunning() && this.A01 == AnonymousClass05K.A01)) {
                num = AnonymousClass05K.A00;
            }
            this.A01 = num;
            valueAnimator.reverse();
        }
        AnonymousClass0fD.A0A(-1446612219, A032);
    }
}
