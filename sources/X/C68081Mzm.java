package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* renamed from: X.Mzm  reason: case insensitive filesystem */
public final class C68081Mzm extends C249703kE implements C331117Pq {
    public final TextView A00;
    public final CircularImageView A01;
    public final SimpleVideoLayout A02;
    public final C14044Tol A03;
    public final Context A04;
    public final UserSession A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68081Mzm(Context context, View view, UserSession userSession) {
        super(view);
        AnonymousClass7TG.A1U(view, context, userSession);
        this.A04 = context;
        this.A05 = userSession;
        this.A02 = (SimpleVideoLayout) view.findViewById(R.id.clips_video_layout);
        this.A01 = (CircularImageView) view.findViewById(R.id.profile_image);
        this.A00 = AnonymousClass7TE.A0d(view, R.id.username);
        this.A03 = new C14044Tol(context, userSession, (C252323ov) null, this, "gallery_peek_video_player");
    }

    public final /* synthetic */ void DxV(C263754Nf r1) {
    }

    public final /* synthetic */ void Dxx(C263754Nf r1) {
    }

    public final void Dxy(C263754Nf r1) {
    }

    public final /* synthetic */ void Dyj(int i, int i2) {
    }

    public final /* synthetic */ void onCompletion() {
    }

    public final /* synthetic */ void onCues(List list) {
    }

    public final /* synthetic */ void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final /* synthetic */ void onProgressStateChanged(boolean z) {
    }

    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final /* synthetic */ void onStopVideo(String str, boolean z) {
    }

    public final /* synthetic */ void onVideoDownloading(C263754Nf r1) {
    }

    public final /* synthetic */ void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final /* synthetic */ void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }
}
