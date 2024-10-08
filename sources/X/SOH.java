package X;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.MemoryFile;
import android.os.SystemClock;
import com.google.common.io.Closeables;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class SOH {
    public static int A06;
    public static final int[] A07 = {60, 30, 15};
    public Integer A00 = 0;
    public final MediaCodec A01;
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final byte[] A03 = new byte[4096];
    public final AnonymousClass8HJ A04;
    public final UserSession A05;

    public static void A00(SOH soh) {
        boolean A062 = 182.A06(0Tu.A05, soh.A05, 36316671497409108L);
        MediaCodec mediaCodec = soh.A01;
        if (!A062) {
            0fX.A06(mediaCodec, 1626044916);
            0fX.A03(mediaCodec, 1011797371);
        } else if (mediaCodec != null) {
            C11292SKa.A01(mediaCodec);
            C11292SKa.A00(mediaCodec);
        }
    }

    public final boolean A01(File file, MemoryFile[] memoryFileArr, int i, long j) {
        boolean z = false;
        if (!this.A02.compareAndSet(0, 1)) {
            return false;
        }
        MediaCodec mediaCodec = this.A01;
        0fX.A05(mediaCodec, -2104290731);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), 0);
            mediaMuxer.setOrientationHint(i);
            ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
            ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (MemoryFile memoryFile : memoryFileArr) {
                if (memoryFile != null) {
                    A1C.add(memoryFile);
                }
            }
            float size = ((float) A1C.size()) / ((float) (((double) j) / 1.0E9d));
            try {
                AnonymousClass8HL[] r11 = this.A04.A01;
                0qQ.A0B(r11, 0);
                float f = size / (1000.0f / 50.0f);
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                boolean z2 = false;
                for (AnonymousClass8HL r2 : r11) {
                    if (r2.A01 == 1.0f && !z2) {
                        0qQ.A0B(A1C2, 0);
                        A1C2.size();
                        z2 = true;
                    }
                    r2.A00(A1C, A1C2, f, -1.0f, -1.0f);
                }
                long j2 = 0;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i2 = -1;
                int i3 = 0;
                int i4 = 0;
                boolean z3 = false;
                int i5 = 0;
                while (true) {
                    if (Pxe.A0C(elapsedRealtime) > 15000) {
                        break;
                    }
                    int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(2500);
                    if (dequeueInputBuffer >= 0) {
                        if (i3 == Pxe.A0A(A1C2)) {
                            i4++;
                            if (j2 > 3000000000L && i4 >= 3) {
                                z3 = true;
                            }
                            i3 = 0;
                        } else {
                            i3++;
                        }
                        if (!z3) {
                            ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                            MemoryFile memoryFile2 = (MemoryFile) A1C2.get(i3);
                            byteBuffer.clear();
                            InputStream inputStream = memoryFile2.getInputStream();
                            while (true) {
                                try {
                                    byte[] bArr = this.A03;
                                    int read = inputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    byteBuffer.put(bArr, 0, read);
                                } catch (Exception e) {
                                    0KC.A0F("BoomerangEncoder", "Error while reading memory file bytes into input buffer", e);
                                    Closeables.A01(inputStream);
                                } catch (Throwable th) {
                                    Closeables.A01(inputStream);
                                    throw th;
                                }
                            }
                            Closeables.A01(inputStream);
                            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, memoryFile2.length(), AnonymousClass7TE.A0P(j2), 0);
                            i5++;
                            j2 = (long) (((double) j2) + 5.0E7d);
                        }
                    }
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 2500);
                    if (dequeueOutputBuffer >= 0) {
                        ByteBuffer byteBuffer2 = outputBuffers[dequeueOutputBuffer];
                        if (i2 == -1) {
                            i2 = mediaMuxer.addTrack(mediaCodec.getOutputFormat());
                            mediaMuxer.start();
                        }
                        mediaMuxer.writeSampleData(i2, byteBuffer2, bufferInfo);
                        mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                        i5--;
                        if (i5 == 0 && z3) {
                            z = true;
                            break;
                        }
                    }
                }
            } catch (RuntimeException e2) {
                0kD.A07("BoomerangEncoder", "unable to encode boomerang", e2);
            }
            A00(this);
            mediaMuxer.release();
        } catch (Exception unused) {
        }
        return z;
    }

    public SOH(MediaCodec mediaCodec, AnonymousClass8HJ r4, UserSession userSession) {
        this.A01 = mediaCodec;
        this.A04 = r4;
        this.A05 = userSession;
    }
}
