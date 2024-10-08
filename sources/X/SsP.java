package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public final class SsP implements C13855Tia {
    public static final ByteBuffer A0K = Pxg.A13(0);
    public int A00;
    public MediaCodec A01;
    public MediaFormat A02;
    public C13860Tig A03;
    public C11244SHe A04;
    public C11019S5q A05;
    public ByteBuffer A06;
    public ByteBuffer A07 = A0K;
    public boolean A08;
    public ByteBuffer[] A09;
    public ByteBuffer[] A0A;
    public C10794RyG A0B;
    public final MediaCodec.BufferInfo A0C = new MediaCodec.BufferInfo();
    public final C10862RzN A0D;
    public final C13725Tfv A0E;
    public final C13590TdI A0F;
    public final C13780Tgv A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public volatile long A0J;

    public final S6U BPw() {
        return null;
    }

    public final void EKz(long j) {
        this.A0J = (long) (((float) j) * A01(j));
        MediaCodec mediaCodec = this.A01;
        mediaCodec.getClass();
        mediaCodec.flush();
        this.A07 = A0K;
        this.A0I = false;
        this.A08 = false;
        C13860Tig tig = this.A03;
        tig.getClass();
        tig.EKz(this.A0J);
    }

    public final void FM5(C266724aF r1) {
    }

    public final void FNL() {
    }

    public final void cancel() {
        this.A0H = true;
    }

    public final void start() {
    }

    private float A00(long j) {
        C266794aM A042;
        C10862RzN rzN = this.A0D;
        MediaComposition mediaComposition = rzN.A08;
        if (!(mediaComposition == null || (A042 = mediaComposition.A04(C266714aE.AUDIO, this.A00)) == null)) {
            for (SIO sio : A042.A05) {
                MediaEffect mediaEffect = sio.A01;
                if (mediaEffect instanceof C12332Sre) {
                    if (C7334Q4k.A00(sio.A00, rzN.A0B, TimeUnit.MICROSECONDS, j)) {
                        return ((C12332Sre) mediaEffect).A00;
                    }
                }
            }
        }
        return 1.0f;
    }

    private float A01(long j) {
        C10862RzN rzN = this.A0D;
        MediaComposition mediaComposition = rzN.A08;
        if (mediaComposition == null) {
            return 1.0f;
        }
        Q1K q1k = new Q1K(mediaComposition, rzN.A0B.A0H());
        q1k.A01(C266714aE.AUDIO, this.A00);
        return q1k.A00(TimeUnit.MICROSECONDS, j);
    }

    public final void AIw(int i) {
        this.A00 = i;
        C10794RyG ryG = this.A0B;
        ByteBuffer[] byteBufferArr = ryG.A06;
        ByteBuffer byteBuffer = byteBufferArr[i];
        if (byteBuffer == null) {
            byteBuffer = Pxg.A13(ryG.A05.A0C.A01 * 1024 * 2);
            byteBufferArr[i] = byteBuffer;
        } else {
            byteBuffer.clear();
        }
        this.A06 = byteBuffer;
        C13590TdI tdI = this.A0F;
        C13725Tfv tfv = this.A0E;
        C13780Tgv tgv = this.A0G;
        C10862RzN rzN = this.A0D;
        C13860Tig AL7 = tdI.AL7(tfv, tgv, rzN.A0B);
        this.A03 = AL7;
        S9X.A01(AL7, rzN);
        this.A03.ELE(C266714aE.AUDIO, this.A00);
        MediaFormat BpC = this.A03.BpC();
        BpC.getClass();
        String string = BpC.getString("mime");
        string.getClass();
        this.A01 = 0fX.A01(string, 129937957);
        if (BpC.containsKey("encoder-delay") && BpC.getInteger("encoder-delay") > 10000) {
            BpC.setInteger("encoder-delay", 0);
        }
        0fX.A07(this.A01, (MediaCrypto) null, BpC, (Surface) null, 0, -1492752540);
        0fX.A05(this.A01, -1385643788);
        this.A09 = this.A01.getInputBuffers();
        this.A0A = this.A01.getOutputBuffers();
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [X.S5q, java.lang.Object] */
    public final void ANu(long j) {
        C11244SHe sHe;
        this.A06.getClass();
        this.A06.clear();
        while (this.A06.hasRemaining() && !this.A08) {
            int min = Math.min(this.A06.remaining(), this.A07.remaining());
            if (min <= 0) {
                if (!this.A08) {
                    this.A01.getClass();
                    MediaCodec mediaCodec = this.A01;
                    MediaCodec.BufferInfo bufferInfo = this.A0C;
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    if (dequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) != 0) {
                            this.A08 = true;
                            C11019S5q s5q = this.A05;
                            if (s5q != null) {
                                s5q.A01();
                            }
                        } else {
                            ByteBuffer[] byteBufferArr = this.A0A;
                            byteBufferArr.getClass();
                            ByteBuffer byteBuffer = byteBufferArr[dequeueOutputBuffer];
                            Pxg.A1D(bufferInfo, byteBuffer);
                            C11019S5q s5q2 = this.A05;
                            s5q2.getClass();
                            s5q2.A02(byteBuffer);
                            C11019S5q s5q3 = this.A05;
                            s5q3.getClass();
                            ByteBuffer A002 = s5q3.A00();
                            C11244SHe sHe2 = this.A04;
                            if (sHe2 != null) {
                                sHe2.A00(A002);
                                C11244SHe sHe3 = this.A04;
                                A002 = sHe3.A02;
                                sHe3.A02 = sHe3.A00;
                            }
                            this.A07 = A002;
                            this.A01.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.A0A = this.A01.getOutputBuffers();
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.A01.getOutputFormat();
                        this.A02 = outputFormat;
                        outputFormat.getClass();
                        int integer = outputFormat.getInteger("channel-count");
                        SFQ sfq = this.A0D.A0C;
                        int i = sfq.A01;
                        if (integer != i) {
                            sHe = new C11244SHe(integer, i);
                        } else {
                            sHe = null;
                        }
                        this.A04 = sHe;
                        MediaFormat mediaFormat = this.A02;
                        mediaFormat.getClass();
                        int integer2 = mediaFormat.getInteger("sample-rate");
                        MediaFormat mediaFormat2 = this.A02;
                        mediaFormat2.getClass();
                        int integer3 = mediaFormat2.getInteger("channel-count");
                        int i2 = sfq.A04;
                        ByteBuffer byteBuffer2 = C11019S5q.A02;
                        float A012 = A01(0);
                        float A003 = A00(0);
                        ? obj = new Object();
                        obj.A01 = C11019S5q.A02;
                        obj.A00 = new C11421SSx(A012, A003, integer2, integer3, i2);
                        this.A05 = obj;
                    }
                }
                while (true) {
                    if (this.A0I || this.A0H) {
                        break;
                    }
                    this.A01.getClass();
                    this.A03.getClass();
                    int dequeueInputBuffer = this.A01.dequeueInputBuffer(0);
                    if (dequeueInputBuffer < 0) {
                        break;
                    }
                    ByteBuffer[] byteBufferArr2 = this.A09;
                    byteBufferArr2.getClass();
                    int E6i = this.A03.E6i(byteBufferArr2[dequeueInputBuffer]);
                    if (E6i <= 0) {
                        this.A01.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                        this.A0I = true;
                        break;
                    }
                    int BpB = this.A03.BpB();
                    this.A01.queueInputBuffer(dequeueInputBuffer, 0, E6i, this.A03.BpD(), BpB);
                    this.A03.AAt();
                }
            } else {
                ByteBuffer duplicate = this.A07.duplicate();
                duplicate.limit(duplicate.position() + min);
                this.A06.put(duplicate);
                ByteBuffer byteBuffer3 = this.A07;
                byteBuffer3.position(byteBuffer3.position() + min);
            }
        }
        C11019S5q s5q4 = this.A05;
        if (s5q4 != null) {
            s5q4.A00.A00 = A00(j);
        }
        while (true) {
            int position = this.A06.position();
            int limit = this.A06.limit();
            ByteBuffer byteBuffer4 = this.A06;
            if (position < limit) {
                byteBuffer4.put((byte) 0);
            } else {
                byteBuffer4.flip();
                return;
            }
        }
    }

    public final boolean CRE() {
        return this.A08;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.RQJ] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.RQJ] */
    public final void release() {
        ? obj = new Object();
        C7948Qdp qdp = new C7948Qdp(this.A01, (C7254Q1b) obj);
        new Object().A00 = qdp;
        qdp.A00();
        C7948Qdp qdp2 = new C7948Qdp((C7254Q1b) obj, this.A03);
        new Object().A00 = qdp2;
        qdp2.A00();
        obj.A01();
        this.A06 = null;
        this.A01 = null;
    }

    public SsP(C10794RyG ryG, C13725Tfv tfv, C13590TdI tdI, C13780Tgv tgv, C10862RzN rzN) {
        this.A0D = rzN;
        this.A0B = ryG;
        this.A0F = tdI;
        this.A0E = tfv;
        this.A0G = tgv;
    }

    public final long ANt() {
        throw C66580MXl.A11();
    }

    public final long Avc() {
        throw C66580MXl.A11();
    }
}
