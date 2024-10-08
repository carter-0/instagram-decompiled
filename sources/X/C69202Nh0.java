package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView;
import com.instagram.ui.widget.volume.VolumeIndicator;

/* renamed from: X.Nh0  reason: case insensitive filesystem */
public final class C69202Nh0 extends AnonymousClass4HM {
    public final int A00;
    public final Object A01;

    public C69202Nh0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 1:
            case 3:
                0qQ.A0B(animator, 0);
                onAnimationEnd(animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        View view;
        switch (this.A00) {
            case 1:
                0qQ.A0B(animator, 0);
                view = ((NoteAvatarView) this.A01).A07;
                break;
            case 2:
                C14289TtN ttN = (C14289TtN) this.A01;
                C18599Vuq vuq = ttN.A03;
                ttN.A02 = vuq;
                if (vuq != null) {
                    ttN.A03 = null;
                    C14289TtN.A00(ttN);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(ttN.A05);
                    C71170Oej.A00(ofFloat, ttN, 2);
                    ttN.A01 = ofFloat;
                    ofFloat.start();
                    return;
                }
                return;
            case 3:
                0qQ.A0B(animator, 0);
                view = (View) this.A01;
                break;
            case 4:
                ExpandingEllipsizingTextView expandingEllipsizingTextView = (ExpandingEllipsizingTextView) this.A01;
                C69202Nh0.super.setMaxLines(expandingEllipsizingTextView.A00);
                return;
            case 5:
                VolumeIndicator volumeIndicator = (VolumeIndicator) this.A01;
                volumeIndicator.setVisibility(8);
                volumeIndicator.A00 = null;
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
        view.setVisibility(4);
        animator.removeListener(this);
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            super.onAnimationStart(animator);
        } else {
            AnonymousClass7TF.A16((View) this.A01);
        }
    }
}
