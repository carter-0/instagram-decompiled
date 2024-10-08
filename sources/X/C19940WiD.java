package X;

import android.media.AudioRecord;
import android.os.Process;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.WiD  reason: case insensitive filesystem */
public final class C19940WiD implements Runnable {
    public final /* synthetic */ C17688VcJ A00;

    public C19940WiD(C17688VcJ vcJ) {
        this.A00 = vcJ;
    }

    public final void run() {
        String str;
        Process.setThreadPriority(-19);
        try {
            C17688VcJ vcJ = this.A00;
            int i = vcJ.A01;
            byte[] bArr = new byte[i];
            AudioRecord audioRecord = vcJ.A04;
            if (audioRecord != null) {
                audioRecord.startRecording();
            }
            AnonymousClass0JR r8 = vcJ.A07;
            long now = r8.now();
            while (true) {
                AtomicBoolean atomicBoolean = vcJ.A0A;
                if (atomicBoolean.get()) {
                    AudioRecord audioRecord2 = vcJ.A04;
                    if (audioRecord2 != null) {
                        audioRecord2.read(bArr, 0, i);
                    }
                    OutputStream outputStream = vcJ.A05;
                    if (outputStream == null) {
                        break;
                    }
                    outputStream.write(bArr, 0, i);
                    if (((double) AnonymousClass7TE.A0P(r8.now() - now)) >= vcJ.A00) {
                        atomicBoolean.set(false);
                    }
                } else {
                    OutputStream outputStream2 = vcJ.A05;
                    if (outputStream2 != null) {
                        outputStream2.close();
                        vcJ.A08.onRecordingCompleted();
                        return;
                    }
                }
            }
            0qQ.A0F("outputStream");
            throw AnonymousClass00P.createAndThrow();
        } catch (IllegalStateException e) {
            e = e;
            str = "Audio Record start illegal state exception";
            0KC.A0G("mss:AndroidAudioEnhancementRecordingImpl", str, e);
        } catch (InterruptedException e2) {
            e = e2;
            str = "Audio recording thread interrupted";
            0KC.A0G("mss:AndroidAudioEnhancementRecordingImpl", str, e);
        }
    }
}
