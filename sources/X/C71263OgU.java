package X;

import android.media.MediaPlayer;
import android.widget.VideoView;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.OgU  reason: case insensitive filesystem */
public final class C71263OgU implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ VideoView A00;
    public final /* synthetic */ AnonymousClass4AB A01;
    public final /* synthetic */ AnonymousClass50C A02;
    public final /* synthetic */ AnonymousClass4AL A03;

    public C71263OgU(VideoView videoView, AnonymousClass4AB r2, AnonymousClass50C r3, AnonymousClass4AL r4) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = videoView;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onPrepared(MediaPlayer mediaPlayer) {
        0qQ.A0B(mediaPlayer, 0);
        AnonymousClass50C r1 = this.A02;
        if (AnonymousClass50C.A05(this.A01, r1)) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
        AnonymousClass4AL r6 = this.A03;
        if (!AnonymousClass4AJ.A0F(r6.A02)) {
            mediaPlayer.setLooping(true);
            this.A00.start();
            NoteAvatarView noteAvatarView = r1.A0B;
            noteAvatarView.A0B.setVisibility(4);
            noteAvatarView.A05.setVisibility(0);
            return;
        }
        AnonymousClass4AB r0 = r1.A01;
        if (r0 == null || !r0.A0X) {
            NoteAvatarView noteAvatarView2 = r1.A0B;
            noteAvatarView2.A0B.setVisibility(0);
            noteAvatarView2.A05.setVisibility(4);
            return;
        }
        VideoView videoView = this.A00;
        videoView.start();
        NoteAvatarView noteAvatarView3 = r1.A0B;
        noteAvatarView3.A0B.setVisibility(4);
        noteAvatarView3.A05.setVisibility(0);
        mediaPlayer.setOnCompletionListener(new C71257OgO(1, videoView, r6));
    }
}
