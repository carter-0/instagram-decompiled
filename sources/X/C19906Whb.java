package X;

import android.media.MediaCodec;

/* renamed from: X.Whb  reason: case insensitive filesystem */
public final class C19906Whb implements Runnable {
    public final /* synthetic */ C18577VuT A00;

    public C19906Whb(C18577VuT vuT) {
        this.A00 = vuT;
    }

    public final void run() {
        MediaCodec mediaCodec = this.A00.A07.A02;
        if (mediaCodec != null) {
            mediaCodec.signalEndOfInputStream();
        }
    }
}
