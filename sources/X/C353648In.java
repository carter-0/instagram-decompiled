package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8In  reason: invalid class name and case insensitive filesystem */
public final class C353648In {
    public static final int A00 = ((int) TimeUnit.MILLISECONDS.toMicros(1));

    /* JADX INFO: finally extract failed */
    public final File A00(C353628Il r16, File file, String str, int i, int i2) {
        File file2 = file;
        r16.AQB();
        Q0V A002 = Q0V.A00("audio_download_util");
        AnonymousClass9TQ r0 = new AnonymousClass9TQ(new XF2(str));
        try {
            A002.A01(r0);
            int trackCount = A002.A00.getTrackCount();
            int i3 = 0;
            while (true) {
                if (i3 >= trackCount) {
                    i3 = -1;
                    break;
                }
                MediaFormat trackFormat = A002.A00.getTrackFormat(i3);
                0qQ.A07(trackFormat);
                String string = trackFormat.getString("mime");
                if (string != null && 00p.A0k(string, "audio/", false)) {
                    A002.ELD(i3);
                    break;
                }
                i3++;
            }
            boolean z = false;
            if (i3 != -1) {
                z = true;
            }
            if (z) {
                if (file == null) {
                    file2 = new File(AnonymousClass457.A0D("-audio", ".mp4"));
                }
                try {
                    try {
                        MediaMuxer mediaMuxer = new MediaMuxer(file2.getCanonicalPath(), 0);
                        MediaFormat trackFormat2 = A002.A00.getTrackFormat(i3);
                        0qQ.A07(trackFormat2);
                        trackFormat2.getString("mime");
                        r16.CpB();
                        try {
                            mediaMuxer.addTrack(trackFormat2);
                            mediaMuxer.start();
                            r16.CpC();
                            int i4 = A00;
                            int i5 = i * i4;
                            int i6 = i2 * i4;
                            long j = (long) i5;
                            A002.EL0(j, 0);
                            ByteBuffer allocate = ByteBuffer.allocate(C249703kE.FLAG_MOVED);
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            while (A002.A00.advance()) {
                                int readSampleData = A002.A00.readSampleData(allocate, 0);
                                long sampleTime = A002.A00.getSampleTime();
                                if (readSampleData < 0 || sampleTime > ((long) (i5 + i6))) {
                                    break;
                                }
                                bufferInfo.size = readSampleData;
                                bufferInfo.presentationTimeUs = sampleTime - j;
                                bufferInfo.flags = A002.A00.getSampleFlags();
                                mediaMuxer.writeSampleData(0, allocate, bufferInfo);
                            }
                            r16.Cp9();
                            mediaMuxer.stop();
                            mediaMuxer.release();
                            A002.release();
                            r16.CpA();
                            return file2;
                        } catch (Throwable th) {
                            mediaMuxer.release();
                            A002.release();
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new IOException("couldn't create MediaMuxer", e);
                    }
                } catch (IOException e2) {
                    throw new IOException("couldn't generate output file path", e2);
                }
            } else {
                throw new IllegalStateException("couldn't find an audio track in input media");
            }
        } catch (IOException unused) {
            throw new IOException("couldn't read source data", r0.A00);
        }
    }
}
