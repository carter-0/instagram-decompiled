package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: X.T7c  reason: case insensitive filesystem */
public final class C12792T7c implements AnonymousClass11X {
    public final /* synthetic */ String A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ 0sP A02;

    public final String getName() {
        return "";
    }

    public final int getRunnableId() {
        return 0;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public C12792T7c(String str, C62320sa r2, 0sP r3) {
        this.A00 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void run() {
        String str = this.A00;
        C62320sa r0 = this.A01;
        0sP r5 = this.A02;
        C51972G9s.A1D(r0, r5);
        ArrayList A1C = AnonymousClass7TE.A1C();
        MediaExtractor mediaExtractor = new MediaExtractor();
        r0.invoke();
        try {
            mediaExtractor.setDataSource(str);
        } catch (IOException e) {
            0wb.A06("ImportAudioUtil", 002.A0g("audio extractor failed to set ", str, " as data source"), e);
            r5.invoke(0sn.A00);
        }
        int trackCount = mediaExtractor.getTrackCount();
        int i = 0;
        while (true) {
            if (i < trackCount) {
                String string = mediaExtractor.getTrackFormat(i).getString("mime");
                if (string != null && C66580MXl.A1a("audio/", 1, string)) {
                    mediaExtractor.selectTrack(i);
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        mediaExtractor.seekTo(0, 0);
        ByteBuffer allocate = ByteBuffer.allocate(C249703kE.FLAG_MOVED);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            if (!mediaExtractor.advance()) {
                break;
            }
            bufferInfo.size = mediaExtractor.readSampleData(allocate, 0);
            bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
            bufferInfo.flags = mediaExtractor.getSampleFlags();
            int i2 = bufferInfo.size;
            if (i2 < 0) {
                r5.invoke(0sn.A00);
                break;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                float A002 = 0mi.A00((float) Math.abs((Math.log((double) allocate.get(i3)) * 0.25d) - 1.5807000398635864d), 0.0f, 1.0f);
                if (!Float.isNaN(A002)) {
                    A1C.add(Float.valueOf(A002));
                }
            }
        }
        r5.invoke(A1C);
        mediaExtractor.release();
    }
}
