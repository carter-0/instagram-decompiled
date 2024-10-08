package X;

import android.content.IntentFilter;
import android.os.Handler;
import com.facebook.common.networkreachability.NetworkState;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;

/* renamed from: X.Snf  reason: case insensitive filesystem */
public final class C12135Snf implements LiveStreamingClient.LiveStreamingSessionCallbacks {
    public LiveStreamingClient.LiveStreamingSessionCallbacks A00;
    public final C10961S2t A01;
    public final Handler A02;

    public final void onError(int i, String str, String str2, String str3, String str4) {
        C51974G9v.A1P(str, str2, str3, str4);
        this.A02.post(new TKW(this, str, str2, str3, str4, i));
    }

    public final void onInitialized() {
        this.A02.post(new TBX(this));
    }

    public final void onPaused() {
        this.A02.post(new TBY(this));
    }

    public final void onReleased() {
        this.A02.post(new TBZ(this));
    }

    public final void onResumed() {
        this.A02.post(new C12860TBa(this));
    }

    public final void onStarted() {
        this.A02.post(new C12861TBb(this));
    }

    public final void onStopped() {
        this.A02.post(new C12862TBc(this));
    }

    public C12135Snf(Handler handler, LiveStreamingClient.LiveStreamingSessionCallbacks liveStreamingSessionCallbacks, C10961S2t s2t) {
        this.A00 = liveStreamingSessionCallbacks;
        this.A02 = handler;
        this.A01 = s2t;
        if (s2t != null) {
            0DH.A00(s2t.A01, s2t.A02, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetworkState A002 = s2t.A00();
            NetworkState networkState = s2t.A00;
            if (A002 != networkState) {
                s2t.A03.networkStateChanged(A002.A00, networkState.A00);
                s2t.A00 = A002;
                return;
            }
            return;
        }
        0KC.A0D("LiveStreamingClientImpl", "Network Reachability Listener is null");
    }
}
