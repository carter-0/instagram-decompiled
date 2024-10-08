package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Dli  reason: case insensitive filesystem */
public final class C46806Dli extends U9W {
    public final 0sL A00;

    public C46806Dli(0sL r3) {
        super(3, 0);
        this.A00 = r3;
    }

    public final int getMovementFlags(RecyclerView recyclerView, C249703kE r4) {
        0qQ.A0B(r4, 1);
        if (!(r4 instanceof C47013Dp5) || ((C47013Dp5) r4).A04.getVisibility() != 0) {
            return 0;
        }
        return C355538Qj.makeMovementFlags(3, 0);
    }

    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C249703kE r10, float f, float f2, int i, boolean z) {
        float f3;
        long A08;
        AnonymousClass7TF.A1B(recyclerView, 1, r10);
        C249703kE A0W = recyclerView.A0W(r10.getBindingAdapterPosition() - 1);
        C249703kE A0W2 = recyclerView.A0W(r10.getBindingAdapterPosition() + 1);
        float f4 = 0.0f;
        boolean z2 = false;
        if (f2 < 0.0f) {
            z2 = true;
        }
        boolean A1R = AnonymousClass7TF.A1R((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)));
        if ((z2 && A0W != null && !canDropOver(recyclerView, r10, A0W)) || (A1R && A0W2 != null && !canDropOver(recyclerView, r10, A0W2))) {
            f2 = 0.0f;
        }
        View view = r10.itemView;
        0qQ.A06(view);
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (z) {
            f3 = 0nA.A04(AnonymousClass7TE.A0S(recyclerView), 1);
        } else {
            f3 = 0.0f;
        }
        view.setElevation(f3);
        ViewPropertyAnimator animate = view.animate();
        AnonymousClass3AS r0 = recyclerView.A0C;
        if (r0 == null) {
            A08 = 200;
        } else {
            A08 = r0.A08();
        }
        ViewPropertyAnimator duration = animate.setDuration(A08);
        if (z) {
            f4 = 0nA.A04(AnonymousClass7TE.A0S(recyclerView), 19);
        }
        duration.translationZ(f4);
    }

    public final void onSwiped(C249703kE r1, int i) {
    }

    public final boolean canDropOver(RecyclerView recyclerView, C249703kE r4, C249703kE r5) {
        AnonymousClass7TG.A1O(r4, r5);
        if (!(r4 instanceof C47013Dp5) || ((C47013Dp5) r4).A04.getVisibility() != 0 || !(r5 instanceof C47013Dp5) || ((C47013Dp5) r5).A04.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final boolean onMove(RecyclerView recyclerView, C249703kE r5, C249703kE r6) {
        AnonymousClass7TG.A1O(r5, r6);
        return AnonymousClass7TE.A1a(this.A00.invoke(Integer.valueOf(r5.getAbsoluteAdapterPosition()), Integer.valueOf(r6.getAbsoluteAdapterPosition())));
    }
}
