package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.proxygen.TraceFieldType;

public final class Y36 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C22147XwB A01;
    public final /* synthetic */ C341737nR A02;

    public Y36(Handler handler, C22147XwB xwB, C341737nR r3) {
        this.A01 = xwB;
        this.A02 = r3;
        this.A00 = handler;
    }

    public final void run() {
        C22147XwB xwB = this.A01;
        C341737nR r3 = this.A02;
        Handler handler = this.A00;
        if (xwB.A0B != AnonymousClass05K.A00) {
            xwB.A04.A01("pAEe");
            C18091VlL.A01(handler, r3, DbW.A0c("Must only call prepare() on a stopped AudioEncoder. Current state is: ", XUR.A00(xwB.A0B)));
            return;
        }
        try {
            C343507qK r7 = xwB.A05;
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", r7.A08, r7.A03);
            createAudioFormat.setInteger("aac-profile", r7.A00);
            createAudioFormat.setInteger(TraceFieldType.Bitrate, r7.A01);
            int i = r7.A02;
            if (i > 0) {
                createAudioFormat.setInteger("max-input-size", i);
            }
            createAudioFormat.setInteger("pcm-encoding", r7.A07);
            xwB.A01 = C9269RVu.A00((MediaCodec.Callback) null, createAudioFormat, "audio/mp4a-latm");
        } catch (Exception unused) {
            C341467mw r4 = xwB.A04;
            r4.A01("pAEe1");
            try {
                C343507qK r8 = xwB.A05;
                MediaFormat createAudioFormat2 = MediaFormat.createAudioFormat("audio/mp4a-latm", r8.A08, r8.A03);
                createAudioFormat2.setInteger("aac-profile", r8.A00);
                createAudioFormat2.setInteger(TraceFieldType.Bitrate, r8.A01);
                createAudioFormat2.setInteger("max-input-size", 0);
                createAudioFormat2.setInteger("pcm-encoding", r8.A07);
                xwB.A01 = C9269RVu.A00((MediaCodec.Callback) null, createAudioFormat2, "audio/mp4a-latm");
            } catch (Exception e) {
                r4.A01("pAEe2");
                C18091VlL.A01(handler, r3, e);
                return;
            }
        }
        xwB.A0B = AnonymousClass05K.A01;
        xwB.A04.A01("pAEs");
        C18091VlL.A00(handler, r3);
    }
}
