package X;

import android.animation.ValueAnimator;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.Oeb  reason: case insensitive filesystem */
public final class C71162Oeb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ NoteAvatarView A00;

    public C71162Oeb(NoteAvatarView noteAvatarView) {
        this.A00 = noteAvatarView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = AnonymousClass7TH.A00(valueAnimator);
        NoteAvatarView noteAvatarView = this.A00;
        noteAvatarView.getNoteBubbleView().setScaleX(A002);
        noteAvatarView.getNoteBubbleView().setScaleY(A002);
    }
}
