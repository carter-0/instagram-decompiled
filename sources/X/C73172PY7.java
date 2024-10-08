package X;

import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import com.facebook.rsys.audio.AudioFrameData;
import com.facebook.rsys.audio.gen.AudioFrame;
import com.facebook.rsys.audio.gen.AudioFrameDetails;
import com.facebook.rsys.audio.gen.AudioFrameMetadata;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import java.nio.ShortBuffer;

/* renamed from: X.PY7  reason: case insensitive filesystem */
public final class C73172PY7 implements Runnable {
    public final /* synthetic */ MediaProjection A00;
    public final /* synthetic */ OLK A01;

    public C73172PY7(MediaProjection mediaProjection, OLK olk) {
        this.A01 = olk;
        this.A00 = mediaProjection;
    }

    public final void run() {
        Throwable th;
        int i;
        AudioModule audioModule;
        OLK olk = this.A01;
        C70641OEn oEn = (C70641OEn) olk.A03.invoke(this.A00);
        try {
            if (oEn.A00 == null) {
                oEn.A01 = (ShortBuffer) oEn.A03.invoke();
                MediaProjection mediaProjection = oEn.A02;
                int i2 = C70367O3t.A00;
                AudioRecord A002 = XVT.A00(mediaProjection, i2);
                oEn.A00 = A002;
                A002.startRecording();
                OB4 ob4 = olk.A00;
                OAB oab = olk.A01;
                while (olk.A02.get()) {
                    AudioRecord audioRecord = oEn.A00;
                    if (audioRecord != null) {
                        ShortBuffer shortBuffer = oEn.A01;
                        if (shortBuffer != null) {
                            int read = audioRecord.read(shortBuffer.array(), 0, i2);
                            if (read >= 0) {
                                short[] array = shortBuffer.array();
                                0qQ.A07(array);
                                short[] sArr = ob4.A00;
                                if (sArr == null || sArr.length != (i = array.length)) {
                                    i = array.length;
                                    sArr = new short[i];
                                    ob4.A00 = sArr;
                                }
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < i) {
                                    sArr[i4] = (short) AnonymousClass1GB.A01(((float) array[i3]) * ob4.A01);
                                    i3++;
                                    i4++;
                                }
                                AudioFrame createFrame = AudioFrame.CProxy.createFrame(new AudioFrameData(sArr), new AudioFrameMetadata(16000, 1, read, false, (AudioFrameDetails) null));
                                0qQ.A07(createFrame);
                                OZU ozu = oab.A00;
                                if (AnonymousClass7TF.A1Z(ozu.A0A) || (audioModule = ozu.A06) == null) {
                                    ScreenShareApi screenShareApi = ozu.A00;
                                    if (screenShareApi != null) {
                                        screenShareApi.handleAudioData(createFrame, false);
                                    }
                                } else {
                                    audioModule.deliverAppLevelAudio(createFrame);
                                }
                            } else {
                                th = new C69549Nnt();
                            }
                        } else {
                            th = AnonymousClass7TE.A0z("captureAudio() called on an uninitialized AudioRecorder.");
                        }
                    } else {
                        th = AnonymousClass7TE.A0z("captureAudio() called on an uninitialized AudioRecorder.");
                    }
                }
                ob4.A00 = null;
                AudioRecord audioRecord2 = oEn.A00;
                if (audioRecord2 != null) {
                    audioRecord2.release();
                }
                oEn.A00 = null;
                oEn.A01 = null;
                olk.A02.set(false);
                return;
            }
            th = AnonymousClass7TE.A0z("Session already active");
            throw th;
        } catch (Exception unused) {
        } catch (Throwable th2) {
            AudioRecord audioRecord3 = oEn.A00;
            if (audioRecord3 != null) {
                audioRecord3.release();
            }
            oEn.A00 = null;
            oEn.A01 = null;
            olk.A02.set(false);
            throw th2;
        }
    }
}
