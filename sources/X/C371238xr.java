package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.8xr  reason: invalid class name and case insensitive filesystem */
public final class C371238xr {
    public final BroadcastReceiver A00 = new C371248xs(this);
    public final Context A01;
    public final AudioManager A02;
    public final Handler A03;
    public final C371228xq A04;
    public volatile boolean A05;

    public final synchronized void A00() {
        if (this.A05) {
            try {
                this.A01.unregisterReceiver(this.A00);
            } catch (Exception e) {
                if (!e.getMessage().contains("DeadSystemException")) {
                    throw e;
                }
            }
            this.A05 = false;
        }
    }

    public C371238xr(Context context, AudioManager audioManager, Handler handler, C371228xq r5) {
        this.A01 = context.getApplicationContext();
        this.A02 = audioManager;
        this.A04 = r5;
        this.A03 = handler;
    }
}
