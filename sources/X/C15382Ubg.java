package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* renamed from: X.Ubg  reason: case insensitive filesystem */
public final class C15382Ubg extends AnonymousClass4DH implements C232732uM, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "VideoPreviewFragment";
    public SimpleVideoLayout A00;
    public AnonymousClass4M3 A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass3JR r2 = new AnonymousClass3JR();
        r2.A06 = R.drawable.instagram_arrow_back_24;
        r2.A05 = 2131953555;
        r2.A0G = new C56800ICx(this, 3);
        r4.A8p(new AnonymousClass3Jb(r2));
    }

    public final String getModuleName() {
        return "bugreporter_videopreview";
    }

    public final void onCompletion() {
    }

    public final void onCues(List list) {
    }

    public final void onDrawnToSurface() {
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final void onSeeking(long j) {
    }

    public final void onStopVideo(String str, boolean z) {
    }

    public final void onStopped(C263754Nf r1, int i) {
    }

    public final void onSurfaceTextureDestroyed() {
    }

    public final void onSurfaceTextureUpdated(C263754Nf r1) {
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final void onVideoPrepared(C263754Nf r1, boolean z) {
    }

    public final void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoSwitchToWarmupPlayer(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-661304432);
        C15382Ubg.super.onCreate(bundle);
        String string = requireArguments().getString(AnonymousClass000.A00(2535));
        if (string != null) {
            this.A02 = string;
            AnonymousClass0fD.A09(9224873, A022);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("VideoPreviewFragment.videoPath is null but is required");
        AnonymousClass0fD.A09(-1003230597, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(332362262);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bugreporter_video_preview, viewGroup, false);
        this.A00 = (SimpleVideoLayout) inflate.requireViewById(R.id.video_container);
        AnonymousClass0fD.A09(2142944338, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-2090261523);
        C15382Ubg.super.onPause();
        AnonymousClass4M3 r1 = this.A01;
        if (r1 != null) {
            r1.ECP("fragment_paused");
        }
        AnonymousClass0fD.A09(721319642, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1927092650);
        super.onResume();
        SimpleVideoLayout simpleVideoLayout = this.A00;
        if (simpleVideoLayout != null) {
            AnonymousClass4M1 A002 = AnonymousClass4M0.A00(simpleVideoLayout.getContext(), AnonymousClass7TE.A0l(this.A03), (C252323ov) null, this, "bugreporter_videopreview");
            String str = this.A02;
            if (str != null) {
                C263754Nf r8 = new C263754Nf((Object) str, 0);
                A002.EjF(AnonymousClass4M7.FIT);
                A002.A0X = true;
                A002.Ech(true);
                SimpleVideoLayout simpleVideoLayout2 = this.A00;
                if (simpleVideoLayout2 != null) {
                    C263414Lx r6 = new C263414Lx(false, false, false, false);
                    String str2 = this.A02;
                    if (str2 != null) {
                        A002.E4H(new C263794Nj(simpleVideoLayout2, r6, (AnonymousClass3WR) null, r8, str2, "bugreporter_videopreview", 0.0f, -1, 0, true));
                        A002.E2q("user request preview video", false);
                        this.A01 = A002;
                        AnonymousClass0fD.A09(-124808088, A022);
                        return;
                    }
                }
            }
            0qQ.A0F("videoPath");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("videoContainer");
        throw AnonymousClass00P.createAndThrow();
    }
}
