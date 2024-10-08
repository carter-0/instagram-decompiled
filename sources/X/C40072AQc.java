package X;

import android.os.Handler;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.audiograph.CameraAudioManager;

/* renamed from: X.AQc  reason: case insensitive filesystem */
public final class C40072AQc implements C3730593v {
    public CameraAudioManager A00;

    public final int fillAudioBuffer(Y1G y1g) {
        return 0;
    }

    public final String getDebugInfo() {
        return "";
    }

    public final void onReceivedAudioMixingMode(int i) {
        if (i == 4 || i == 5) {
            this.A00.setState(0);
        }
    }

    public final String snapshot() {
        return null;
    }

    public final void updateOutputRouteState(int i) {
        boolean z = true;
        CameraAudioManager cameraAudioManager = this.A00;
        if (i != 1) {
            z = false;
        }
        cameraAudioManager.setSpeakers(z);
    }

    public final int createFbaProcessingGraph(int i, int i2, C341477mx r4) {
        this.A00.mCallback = r4;
        return 0;
    }

    public final int createManualProcessingGraph(int i, int i2, C341477mx r4) {
        throw AnonymousClass7TE.A15("Audio State Machine does not use manual processing graph");
    }

    public final AudioGraphClientProvider getAudioGraphClientProvider() {
        return this.A00.getAudioGraphClientProvider();
    }

    public final boolean isSubgraphInserted() {
        return false;
    }

    public final int pause() {
        this.A00.setState(0);
        return 0;
    }

    public final void release() {
        CameraAudioManager cameraAudioManager = this.A00;
        if (cameraAudioManager.mDestroyed.compareAndSet(false, true)) {
            cameraAudioManager.mHybridData.resetNative();
            cameraAudioManager.mHybridData = null;
        }
    }

    public final int resume() {
        return 0;
    }

    public final void startInput(C341687nM r4, Handler handler) {
        Integer num;
        CameraAudioManager cameraAudioManager = this.A00;
        if (cameraAudioManager.getState() == 0) {
            num = AnonymousClass05K.A0C;
        } else {
            if (cameraAudioManager.getState() == 1) {
                num = AnonymousClass05K.A0N;
            }
            r4.onSuccess();
        }
        cameraAudioManager.setState(num.intValue());
        r4.onSuccess();
    }

    public final void stopInput(C341687nM r3, Handler handler) {
        this.A00.setState(0);
        r3.onSuccess();
    }

    public C40072AQc() {
        CameraAudioManager cameraAudioManager = new CameraAudioManager(0.0f);
        this.A00 = cameraAudioManager;
        cameraAudioManager.getSampleRate();
    }

    public final void prepareRecorder(C343487qI r1, C341607nE r2, Handler handler, C341687nM r4, Handler handler2) {
        r4.onSuccess();
    }
}
