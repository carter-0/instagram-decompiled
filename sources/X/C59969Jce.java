package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.Jce  reason: case insensitive filesystem */
public final class C59969Jce extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public C59969Jce(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAnimationEnd(Animator animator) {
        View view;
        int i;
        switch (this.A00) {
            case 0:
                ((LN3) this.A01).A00 = true;
                return;
            case 1:
                C60066Jeq jeq = (C60066Jeq) this.A01;
                jeq.A01 = jeq.A02;
                jeq.A01();
                return;
            case 2:
                view = ((FilmstripTimelineView) this.A01).A09;
                i = 8;
                break;
            default:
                view = (View) this.A01;
                i = 4;
                break;
        }
        view.setVisibility(i);
    }
}
