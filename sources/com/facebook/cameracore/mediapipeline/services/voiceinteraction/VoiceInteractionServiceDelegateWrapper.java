package com.facebook.cameracore.mediapipeline.services.voiceinteraction;

import X.C371958zQ;
import X.C371968zR;
import android.media.AudioRecord;

public final class VoiceInteractionServiceDelegateWrapper {
    public C371958zQ delegate;

    public final short[] getAudioChunk() {
        Integer num;
        int i;
        short[] sArr;
        C371958zQ r0 = this.delegate;
        if (r0 == null) {
            return null;
        }
        C371968zR r4 = r0.A01;
        synchronized (r4) {
            AudioRecord audioRecord = r4.A01;
            if (audioRecord != null) {
                short[] sArr2 = r4.A02;
                int i2 = r4.A00;
                num = Integer.valueOf(audioRecord.read(sArr2, i2, 4096 - i2));
            } else {
                num = null;
            }
            int i3 = r4.A00;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            int i4 = i3 + i;
            r4.A00 = i4;
            if (i4 == 4096) {
                sArr = new short[4096];
                System.arraycopy(r4.A02, 0, sArr, 0, 4096);
                r4.A00 = 0;
            } else {
                sArr = new short[0];
            }
        }
        return sArr;
    }

    public final void startAudioCapture() {
        C371958zQ r0 = this.delegate;
        if (r0 != null) {
            C371968zR r1 = r0.A01;
            r1.A00();
            synchronized (r1) {
                r1.A00 = 0;
                AudioRecord audioRecord = new AudioRecord(1, 16000, 16, 2, 512);
                r1.A01 = audioRecord;
                audioRecord.startRecording();
            }
        }
    }

    public final void stopAudioCapture() {
        C371958zQ r0 = this.delegate;
        if (r0 != null) {
            r0.A01.A00();
        }
    }
}
