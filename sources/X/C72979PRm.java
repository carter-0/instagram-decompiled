package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* renamed from: X.PRm  reason: case insensitive filesystem */
public final class C72979PRm implements C331117Pq {
    public Integer A00 = AnonymousClass05K.A00;
    public final SimpleVideoLayout A01;
    public final AnonymousClass0eM A02;
    public final O9F A03;

    public C72979PRm(Context context, UserSession userSession, O9F o9f, SimpleVideoLayout simpleVideoLayout) {
        0qQ.A0B(simpleVideoLayout, 3);
        this.A01 = simpleVideoLayout;
        this.A03 = o9f;
        this.A02 = AnonymousClass0eN.A00(0eO.A02, new C58695Iw4(49, (Object) context, (Object) this, (Object) userSession));
    }

    public final /* synthetic */ void DxV(C263754Nf r1) {
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

    public final void Dxx(C263754Nf r3) {
        if (this.A00 != AnonymousClass05K.A0N) {
            this.A00 = AnonymousClass05K.A0C;
        }
    }

    public final void onPrepare(C263754Nf r3) {
        this.A00 = AnonymousClass05K.A01;
        C68046MzD mzD = this.A03.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        mzD.A09.setVisibility(0);
    }
}
