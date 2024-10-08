package X;

import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.PaJ  reason: case insensitive filesystem */
public final class C73298PaJ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C67833Mvd A01;
    public final /* synthetic */ AnonymousClass77U A02;

    public C73298PaJ(C67833Mvd mvd, AnonymousClass77U r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = mvd;
    }

    public final void run() {
        AnonymousClass77U r4 = this.A02;
        AnonymousClass0eM r3 = r4.A04;
        C249703kE A0W = ((RecyclerView) r3.getValue()).A0W(this.A00);
        if (A0W != null) {
            JTO.A0F(A0W).startAnimation(AnimationUtils.loadAnimation(r4.A03, R.anim.bounce));
        }
        ((RecyclerView) r3.getValue()).A16(this.A01);
    }
}
