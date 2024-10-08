package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.common.dextricks.Constants;
import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBadDataException;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.proxygen.TraceFieldType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.nio.channels.WritableByteChannel;
import org.webrtc.CameraEnumerationAndroid;

public final class STP {
    public static final int[] A0M = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD};
    public long A00;
    public long A01;
    public MediaCodec A02 = null;
    public MediaCodec A03 = null;
    public FFMpegAVStream A04 = null;
    public C13860Tig A05 = null;
    public C11019S5q A06 = null;
    public SFQ A07;
    public File A08;
    public WritableByteChannel A09 = null;
    public boolean A0A;
    public FFMpegBufferInfo A0B = null;
    public FFMpegMediaMuxer A0C = null;
    public C11244SHe A0D;
    public FileOutputStream A0E = null;
    public ByteBuffer A0F = null;
    public boolean A0G;
    public ByteBuffer[] A0H = null;
    public ByteBuffer[] A0I = null;
    public final MediaCodec.BufferInfo A0J = new MediaCodec.BufferInfo();
    public final MediaCodec.BufferInfo A0K = new MediaCodec.BufferInfo();
    public final byte[] A0L = new byte[7];

    /* JADX WARNING: type inference failed for: r1v0, types: [X.S5q, java.lang.Object] */
    public static void A00(MediaCodec.BufferInfo bufferInfo, MediaFormat mediaFormat, STP stp, C7334Q4k q4k, byte[] bArr, float f, int i) {
        C11244SHe sHe;
        int i2;
        int i3 = i;
        A01(bufferInfo, stp, q4k, bArr);
        int integer = mediaFormat.getInteger("channel-count");
        if (!(q4k instanceof C7966QeE) ? !(q4k instanceof C7964QeC) || 2 - ((C7964QeC) q4k).A00 != 0 : !((C7966QeE) q4k).A0A) {
            i3 = (i * stp.A07.A01) / integer;
        } else {
            if ((!mediaFormat.containsKey("pcm-encoding") || mediaFormat.getInteger("pcm-encoding") == 2) && integer != (i2 = stp.A07.A01)) {
                sHe = new C11244SHe(integer, i2);
            } else {
                sHe = null;
            }
            stp.A0D = sHe;
        }
        ByteBuffer byteBuffer = C11019S5q.A02;
        int integer2 = mediaFormat.getInteger("sample-rate");
        ? obj = new Object();
        obj.A01 = C11019S5q.A02;
        obj.A00 = new C11421SSx(f, 1.0f, integer2, integer, i3);
        stp.A06 = obj;
    }

    public static void A01(MediaCodec.BufferInfo bufferInfo, STP stp, C7334Q4k q4k, byte[] bArr) {
        int i;
        while (true) {
            C11019S5q s5q = stp.A06;
            if (s5q != null && s5q.A00.A06 != 0) {
                int dequeueInputBuffer = stp.A03.dequeueInputBuffer(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer = stp.A0H[dequeueInputBuffer];
                    byteBuffer.clear();
                    if (!(q4k instanceof C7966QeE) ? !(!(q4k instanceof C7964QeC) || 2 - ((C7964QeC) q4k).A00 != 0) : ((C7966QeE) q4k).A0A) {
                        if (stp.A0D != null) {
                            stp.A0D.A00(stp.A06.A00());
                            C11244SHe sHe = stp.A0D;
                            ByteBuffer byteBuffer2 = sHe.A02;
                            sHe.A02 = sHe.A00;
                            i = byteBuffer2.remaining();
                            byteBuffer.put(byteBuffer2);
                            stp.A03.queueInputBuffer(dequeueInputBuffer, 0, i, 0, 1);
                        }
                    }
                    C11019S5q s5q2 = stp.A06;
                    if (s5q2.A00.A06 != 0) {
                        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                        int position = asShortBuffer.position();
                        s5q2.A00.A05(asShortBuffer);
                        i = (asShortBuffer.position() - position) * 2;
                    } else {
                        i = 0;
                    }
                    stp.A03.queueInputBuffer(dequeueInputBuffer, 0, i, 0, 1);
                }
                A04(bufferInfo, stp, bArr);
            } else {
                return;
            }
        }
    }

    public static void A02(STP stp) {
        if (stp.A0A) {
            stp.A0F = ByteBuffer.allocateDirect(Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
            stp.A0B = new FFMpegBufferInfo();
            FFMpegMediaMuxer fFMpegMediaMuxer = new FFMpegMediaMuxer(C9955RkA.A00, stp.A08.getCanonicalPath(), false);
            stp.A0C = fFMpegMediaMuxer;
            fFMpegMediaMuxer.initialize();
        } else {
            FileOutputStream A0t = JTO.A0t(stp.A08);
            stp.A0E = A0t;
            stp.A09 = A0t.getChannel();
        }
        stp.A0G = false;
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.Object, X.RQJ] */
    public static void A03(STP stp, byte[] bArr, int i, int i2) {
        MediaCodec mediaCodec = stp.A03;
        if (mediaCodec != null) {
            C7948Qdp qdp = new C7948Qdp(mediaCodec, (C7254Q1b) new Object());
            new Object().A00 = qdp;
            qdp.A00();
        }
        MediaCodec A022 = 0fX.A02("audio/mp4a-latm", 465465463);
        stp.A03 = A022;
        int i3 = stp.A07.A00;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        createAudioFormat.setInteger(TraceFieldType.Bitrate, i3);
        createAudioFormat.setInteger("sample-rate", i);
        createAudioFormat.setInteger("channel-count", i2);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("max-input-size", 64000);
        0fX.A07(A022, (MediaCrypto) null, createAudioFormat, (Surface) null, 1, -292048562);
        bArr[0] = -1;
        bArr[1] = -15;
        int i4 = 0;
        while (true) {
            int[] iArr = A0M;
            if (i4 < 12) {
                if (i == iArr[i4]) {
                    break;
                }
                i4++;
            } else {
                i4 = 0;
                break;
            }
        }
        int i5 = (byte) i2;
        bArr[2] = 64;
        byte b = (byte) ((((byte) i4) << 2) | 64);
        bArr[2] = b;
        bArr[2] = (byte) (b | (i5 >> 2));
        bArr[3] = (byte) ((i5 & 3) << 6);
        bArr[4] = 0;
        bArr[5] = 0;
        bArr[6] = -4;
        0fX.A05(stp.A03, 814900264);
        stp.A0H = stp.A03.getInputBuffers();
        stp.A0I = stp.A03.getOutputBuffers();
    }

    public static boolean A04(MediaCodec.BufferInfo bufferInfo, STP stp, byte[] bArr) {
        int dequeueOutputBuffer = stp.A03.dequeueOutputBuffer(bufferInfo, 0);
        boolean z = false;
        while (dequeueOutputBuffer != -1) {
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = stp.A0I[dequeueOutputBuffer];
                Pxg.A1D(bufferInfo, byteBuffer);
                if ((bufferInfo.flags & 2) == 0) {
                    ByteBuffer byteBuffer2 = stp.A0F;
                    FFMpegBufferInfo fFMpegBufferInfo = stp.A0B;
                    Pxh.A12((bufferInfo.size - bufferInfo.offset) + 7, bArr);
                    try {
                        if (stp.A0A) {
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            byteBuffer2.clear();
                            byteBuffer2.position(0);
                            wrap.position(0);
                            byteBuffer2.limit(wrap.limit());
                            byteBuffer2.put(wrap);
                            int remaining = byteBuffer2.remaining();
                            fFMpegBufferInfo.offset = 0;
                            fFMpegBufferInfo.size = remaining;
                            fFMpegBufferInfo.presentationTimeUs = 0;
                            fFMpegBufferInfo.flags = 1;
                            stp.A04.writeFrame(fFMpegBufferInfo, byteBuffer2);
                        } else {
                            stp.A09.write(ByteBuffer.wrap(bArr));
                        }
                        FFMpegBufferInfo fFMpegBufferInfo2 = stp.A0B;
                        if (stp.A0A) {
                            int i = bufferInfo.offset;
                            int i2 = bufferInfo.size;
                            fFMpegBufferInfo2.offset = i;
                            fFMpegBufferInfo2.size = i2;
                            fFMpegBufferInfo2.presentationTimeUs = 0;
                            fFMpegBufferInfo2.flags = 1;
                            stp.A04.writeFrame(fFMpegBufferInfo2, byteBuffer);
                        } else {
                            stp.A09.write(byteBuffer);
                        }
                    } catch (FFMpegBadDataException | IOException unused) {
                    }
                }
                if ((bufferInfo.flags & 4) != 0) {
                    z = true;
                }
                byteBuffer.clear();
                stp.A03.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else if (dequeueOutputBuffer == -3) {
                stp.A0I = stp.A03.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = stp.A03.getOutputFormat();
                FFMpegMediaMuxer fFMpegMediaMuxer = stp.A0C;
                if (stp.A0A) {
                    try {
                        stp.A04 = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(FFMpegMediaFormat.toFFMpegMediaFormat(outputFormat), -1, fFMpegMediaMuxer.A02);
                        fFMpegMediaMuxer.A00();
                        FFMpegAVStream fFMpegAVStream = stp.A04;
                        ByteBuffer byteBuffer3 = outputFormat.getByteBuffer("csd-0");
                        if (byteBuffer3 != null) {
                            FFMpegBufferInfo fFMpegBufferInfo3 = new FFMpegBufferInfo();
                            int limit = byteBuffer3.limit();
                            fFMpegBufferInfo3.offset = 0;
                            fFMpegBufferInfo3.size = limit;
                            fFMpegBufferInfo3.presentationTimeUs = 0;
                            fFMpegBufferInfo3.flags = 2;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
                            allocateDirect.clear();
                            allocateDirect.position(0);
                            byteBuffer3.position(0);
                            allocateDirect.limit(byteBuffer3.limit());
                            allocateDirect.put(byteBuffer3);
                            fFMpegAVStream.writeFrame(fFMpegBufferInfo3, allocateDirect);
                        } else {
                            continue;
                        }
                    } catch (Exception e) {
                        throw new Exception("Error in writing CSD data", e);
                    } catch (Exception unused2) {
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
            dequeueOutputBuffer = stp.A03.dequeueOutputBuffer(bufferInfo, 0);
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.RQJ] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.RQJ] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.RQJ] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r3 = this;
            boolean r0 = r3.A0G
            if (r0 != 0) goto L_0x0082
            X.Q1b r2 = new X.Q1b
            r2.<init>()
            android.media.MediaCodec r1 = r3.A02
            if (r1 == 0) goto L_0x0018
            r0 = 1286715035(0x4cb1b69b, float:9.3172952E7)
            X.0fX.A06(r1, r0)     // Catch:{ all -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r0 = move-exception
            X.C7254Q1b.A00(r2, r0)
        L_0x0018:
            android.media.MediaCodec r0 = r3.A02
            X.Qdp r1 = new X.Qdp
            r1.<init>((android.media.MediaCodec) r0, (X.C7254Q1b) r2)
            X.RQJ r0 = new X.RQJ
            r0.<init>()
            r0.A00 = r1
            r1.A00()
            android.media.MediaCodec r1 = r3.A03
            if (r1 == 0) goto L_0x0038
            r0 = 1286715035(0x4cb1b69b, float:9.3172952E7)
            X.0fX.A06(r1, r0)     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            X.C7254Q1b.A00(r2, r0)
        L_0x0038:
            android.media.MediaCodec r0 = r3.A03
            X.Qdp r1 = new X.Qdp
            r1.<init>((android.media.MediaCodec) r0, (X.C7254Q1b) r2)
            X.RQJ r0 = new X.RQJ
            r0.<init>()
            r0.A00 = r1
            r1.A00()
            X.Tig r0 = r3.A05
            X.Qdp r1 = new X.Qdp
            r1.<init>((X.C7254Q1b) r2, (X.C13860Tig) r0)
            X.RQJ r0 = new X.RQJ
            r0.<init>()
            r0.A00 = r1
            r1.A00()
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0064
            com.facebook.ffmpeg.FFMpegMediaMuxer r0 = r3.A0C     // Catch:{ Exception -> 0x0078 }
            r0.A01()     // Catch:{ Exception -> 0x0078 }
            goto L_0x007c
        L_0x0064:
            java.nio.channels.WritableByteChannel r0 = r3.A09
            if (r0 == 0) goto L_0x0070
            r0.close()     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            X.C7254Q1b.A00(r2, r0)
        L_0x0070:
            java.io.FileOutputStream r0 = r3.A0E
            if (r0 == 0) goto L_0x007c
            r0.close()     // Catch:{  }
            goto L_0x007c
        L_0x0078:
            r0 = move-exception
            X.C7254Q1b.A00(r2, r0)
        L_0x007c:
            r0 = 1
            r3.A0G = r0
            r2.A01()
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STP.A05():void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Q1b, java.lang.Object] */
    public final void A06(SFQ sfq, File file, long j) {
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        MediaCodec mediaCodec;
        this.A07 = sfq;
        File file2 = file;
        C266784aL.A06(AnonymousClass7TF.A1V(file2), "null outputFile provided");
        this.A08 = file2;
        if (file2.getName().endsWith(".mp4")) {
            this.A0A = true;
        }
        A02(this);
        SFQ sfq2 = this.A07;
        if (sfq2.A00 == -1) {
            sfq2.A00 = 32000;
        }
        ? obj = new Object();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            byte[] bArr = new byte[7];
            SFQ sfq3 = this.A07;
            int i5 = sfq3.A04;
            int i6 = sfq3.A01;
            long A0P = AnonymousClass7TE.A0P(((long) i5) * j * ((long) i6));
            long j3 = 0;
            A03(this, bArr, i5, i6);
            byte[] bArr2 = new byte[C249703kE.FLAG_MOVED];
            do {
                if (j3 >= A0P) {
                    i4 = this.A03.dequeueInputBuffer(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    if (i4 >= 0) {
                        j2 = 0;
                        i = 4;
                        i2 = 0;
                        i3 = 0;
                        mediaCodec = this.A03;
                    }
                } else {
                    i4 = this.A03.dequeueInputBuffer(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    if (i4 >= 0) {
                        j3 += 1024;
                        ByteBuffer byteBuffer = this.A0H[i4];
                        byteBuffer.clear();
                        byteBuffer.position(0);
                        byteBuffer.put(bArr2);
                        j2 = 0;
                        mediaCodec = this.A03;
                        i3 = 0;
                        i2 = 2048;
                        i = 1;
                    }
                }
                mediaCodec.queueInputBuffer(i4, i3, i2, j2, i);
            } while (!A04(bufferInfo, this, bArr));
            try {
                A05();
            } catch (Throwable th) {
                C7254Q1b.A00(obj, th);
            }
            Throwable th2 = obj.A01;
            if (th2 != null) {
                throw new Exception("generateSilentAudioFileForVideo failed", th2);
            }
            return;
        } catch (Exception e) {
            C7254Q1b.A00(obj, e);
            A05();
        } catch (Throwable th3) {
            C7254Q1b.A00(obj, th3);
        }
        Throwable th4 = obj.A01;
        if (th4 != null) {
            throw new Exception("generateSilentAudioFileForVideo failed", th4);
        }
    }
}
