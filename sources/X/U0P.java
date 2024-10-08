package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class U0P extends AnimatorListenerAdapter implements C20991X8n {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final /* synthetic */ UF6 A04;

    public final void Dtn(C14284TtI ttI) {
    }

    public final void Dtp(C14284TtI ttI) {
    }

    public U0P(View view, View view2, ViewGroup viewGroup, UF6 uf6) {
        this.A04 = uf6;
        this.A03 = viewGroup;
        this.A01 = view;
        this.A02 = view2;
    }

    private void A00() {
        this.A02.setTag(R.id.save_overlay_view, (Object) null);
        this.A03.getOverlay().remove(this.A01);
        this.A00 = false;
    }

    public final void Dtl(C14284TtI ttI) {
        if (this.A00) {
            A00();
        }
    }

    public final void onAnimationPause(Animator animator) {
        this.A03.getOverlay().remove(this.A01);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.A01;
        if (view.getParent() == null) {
            this.A03.getOverlay().add(view);
        } else {
            this.A04.A0F();
        }
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.A02;
            View view2 = this.A01;
            view.setTag(R.id.save_overlay_view, view2);
            this.A03.getOverlay().add(view2);
            this.A00 = true;
        }
    }

    public final /* synthetic */ void Dtr(C14284TtI ttI, boolean z) {
    }

    public final void Dtm(C14284TtI ttI) {
        ttI.A0B(this);
    }

    public final void onAnimationEnd(Animator animator) {
        A00();
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            A00();
        }
    }
}
