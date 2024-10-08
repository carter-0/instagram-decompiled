package X;

import android.view.View;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.Mpg  reason: case insensitive filesystem */
public final class C67546Mpg implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AnonymousClass50C A00;

    public final void onViewDetachedFromWindow(View view) {
    }

    public C67546Mpg(AnonymousClass50C r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onViewAttachedToWindow(View view) {
        AnonymousClass50C r1 = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        NoteAvatarView noteAvatarView = r1.A0B;
        noteAvatarView.A0B.setVisibility(0);
        noteAvatarView.A05.setVisibility(4);
    }
}
