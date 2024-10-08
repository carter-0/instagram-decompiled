package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.Okv  reason: case insensitive filesystem */
public final class C71456Okv implements Animation.AnimationListener {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ C279864zZ A01;
    public final /* synthetic */ C72271Ozg A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0r1 A04;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public C71456Okv(AlphaAnimation alphaAnimation, C279864zZ r2, C72271Ozg ozg, String str, 0r1 r5) {
        this.A04 = r5;
        this.A00 = alphaAnimation;
        this.A02 = ozg;
        this.A03 = str;
        this.A01 = r2;
    }

    public final void onAnimationEnd(Animation animation) {
        0r1 r3 = this.A04;
        if (r3.A00) {
            AlphaAnimation alphaAnimation = this.A00;
            alphaAnimation.setStartOffset(3500);
            NoteAvatarView noteAvatarView = (NoteAvatarView) this.A02.A03.get();
            if (noteAvatarView != null) {
                noteAvatarView.getNoteBubbleView().startAnimation(alphaAnimation);
            }
            r3.A00 = false;
            return;
        }
        NotesRepository notesRepository = this.A02.A02;
        String str = this.A03;
        notesRepository.A0M(str);
        notesRepository.A0O(this.A01.A0H, str);
    }
}
