package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import java.util.List;

/* renamed from: X.HFr  reason: case insensitive filesystem */
public final class C54485HFr extends SimpleVideoLayout implements C252243on, C232732uM {
    public final UserSession A00;
    public final TextureView A01;
    public final AnonymousClass0eM A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54485HFr(Context context, UserSession userSession) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(userSession, 2);
        this.A00 = userSession;
        this.A01 = new ScalingTextureView(context);
        this.A02 = AnonymousClass1YB.A00(new C58185Inp(6, context, this));
    }

    public final void A03(JPR jpr, boolean z) {
        0qQ.A0B(jpr, 0);
        if (jpr.AkI()) {
            if (!z) {
                String CE4 = getAnnotationVideoPlayer().CE4();
                C67591MqP mqP = (C67591MqP) jpr;
                String str = mqP.A0E.A03;
                if (str == null) {
                    str = mqP.A0F;
                }
                if (0qQ.A0K(CE4, str)) {
                    A00();
                    return;
                }
            }
            A02();
            getAnnotationVideoPlayer().E4H(new C263794Nj(this, new C263414Lx(false, false, false, false), ((C67591MqP) jpr).A0E.A00, new C263754Nf((Object) jpr, 0), (String) null, "map_annotation_player", 0.0f, 0, 0, true));
        }
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onCompletion() {
    }

    public final /* synthetic */ void onCreate() {
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

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final void onSeeking(long j) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onStopVideo(String str, boolean z) {
    }

    public final void onStopped(C263754Nf r1, int i) {
    }

    public final void onSurfaceTextureDestroyed() {
    }

    public final void onSurfaceTextureUpdated(C263754Nf r5) {
        JPR jpr;
        0qQ.A0B(r5, 0);
        if (A01() && (jpr = (JPR) r5.A03) != null) {
            Bitmap bitmap = this.A01.getBitmap();
            C67591MqP mqP = (C67591MqP) jpr;
            if (bitmap != null) {
                if (mqP.A0E.A05) {
                    bitmap = BlurUtil.blur(bitmap, 0.25f, 20);
                }
                mqP.A04 = bitmap;
                C67591MqP.A01(mqP);
            }
        }
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPrepared(C263754Nf r1, boolean z) {
    }

    public final void onVideoStartedPlaying(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        JPR jpr = (JPR) r2.A03;
        if (jpr != null) {
            jpr.invalidateSelf();
        }
    }

    public final void onVideoSwitchToWarmupPlayer(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final AnonymousClass4M3 getAnnotationVideoPlayer() {
        return (AnonymousClass4M3) AnonymousClass7TE.A14(this.A02);
    }

    private final void A00() {
        if (getAnnotationVideoPlayer().CE4() != null && ((AnonymousClass4M1) getAnnotationVideoPlayer()).A0K != null && !getAnnotationVideoPlayer().isPlaying()) {
            getAnnotationVideoPlayer().E2q("play_by_user", false);
        }
    }

    private final boolean A01() {
        if (getAnnotationVideoPlayer().CE4() == null || ((AnonymousClass4M1) getAnnotationVideoPlayer()).A0K == null || !getAnnotationVideoPlayer().isPlaying()) {
            return false;
        }
        return true;
    }

    public final void A02() {
        if (A01()) {
            getAnnotationVideoPlayer().EyP("pause_by_user", true);
        }
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-1308798986);
        super.onAttachedToWindow();
        TextureView textureView = this.A01;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(textureView);
        AnonymousClass0fD.A0D(-1431310250, A06);
    }

    public final void onDestroy() {
        if (A01()) {
            A02();
            getAnnotationVideoPlayer().ECP("release_by_user");
        }
    }

    public final void onDestroyView() {
        if (A01()) {
            A02();
            getAnnotationVideoPlayer().ECP("release_by_user");
        }
    }

    public final void onPause() {
        if (A01()) {
            getAnnotationVideoPlayer().E21("pause_by_user");
        }
    }

    public final void onResume() {
        A00();
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
        A02();
        A00();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
