package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.cameracore.mediapipeline.services.music.MusicItem;

/* renamed from: X.6iD  reason: invalid class name and case insensitive filesystem */
public final class C314406iD extends BroadcastReceiver {
    public final /* synthetic */ C314396iB A00;

    public C314406iD(C314396iB r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0fD.A01(-524264249);
        AnonymousClass0fQ.A01(this, context, intent);
        if (!C59910bu.A02().A00(context, intent, this)) {
            i = -1898751302;
        } else {
            C314396iB r5 = this.A00;
            r5.A04 = intent.getStringExtra("track");
            r5.A02 = intent.getStringExtra("artist");
            r5.A03 = intent.getStringExtra("genre");
            r5.A00 = intent.getIntExtra("position", -1);
            r5.A01 = new MusicItem(r5.A04, r5.A02, r5.A03);
            C314396iB.A00(r5);
            i = 1226960225;
        }
        AnonymousClass0fD.A0E(i, A01, intent);
    }
}
