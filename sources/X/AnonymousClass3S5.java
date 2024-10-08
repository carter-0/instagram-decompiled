package X;

import android.content.Context;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3S5  reason: invalid class name */
public final class AnonymousClass3S5 implements Runnable {
    public final /* synthetic */ AnonymousClass1wD A00;

    public AnonymousClass3S5(AnonymousClass1wD r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1wD r5 = this.A00;
        try {
            AnonymousClass1wD.A00(r5);
            Context context = r5.A05;
            context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r5.A08);
            r5.A02 = true;
            AtomicBoolean atomicBoolean = r5.A0B;
            if (!atomicBoolean.get()) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.RINGER_MODE_CHANGED");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                0DH.A03(r5.A04, context, intentFilter, true);
                atomicBoolean.set(true);
            }
        } catch (IllegalStateException e) {
            0KC.A0F("IgSystemAudioVolumeObserver", "Unable to register observer/listener", e);
        }
    }
}
