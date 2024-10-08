package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class AJN implements Animator.AnimatorListener {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final ValueAnimator A0B;
    public final C249703kE A0C;
    public final /* synthetic */ int A0D;
    public final /* synthetic */ C355568Qm A0E;
    public final /* synthetic */ C249703kE A0F;

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AJN(C355568Qm r4, C249703kE r5, C249703kE r6, float f, float f2, float f3, float f4, int i, int i2) {
        this.A0E = r4;
        this.A0D = i2;
        this.A0F = r6;
        this.A0A = i;
        this.A0C = r5;
        this.A06 = f;
        this.A07 = f2;
        this.A08 = f3;
        this.A09 = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A0B = ofFloat;
        ofFloat.addUpdateListener(new AJX(this, 0));
        ofFloat.setTarget(r5.itemView);
        ofFloat.addListener(this);
        this.A00 = 0.0f;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A00 = 1.0f;
    }

    public final void onAnimationEnd(Animator animator) {
        C249703kE r2;
        if (!this.A05) {
            this.A0C.setIsRecyclable(true);
        }
        this.A05 = true;
        if (!this.A04) {
            int i = this.A0D;
            C355568Qm r3 = this.A0E;
            if (i <= 0) {
                C355538Qj r1 = r3.A0F;
                RecyclerView recyclerView = r3.A0I;
                r2 = this.A0F;
                r1.clearView(recyclerView, r2);
            } else {
                List list = r3.A0Q;
                r2 = this.A0F;
                list.add(r2.itemView);
                this.A03 = true;
                r3.A0I.post(new C41101AoN(this, r3, i));
            }
            if (r3.A0D == r2.itemView) {
                r3.A0D = null;
            }
        }
    }
}
