package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.Q0m  reason: case insensitive filesystem */
public final class C7240Q0m {
    public Bitmap A00;
    public C7243Q0p A01;
    public C13824Thu A02;
    public boolean A03;
    public int A04;
    public final C13815Thi A05;
    public final C7241Q0n A06;
    public final List A07;
    public final int A08;
    public final int A09;
    public final boolean A0A;
    public final boolean A0B;

    public final long A00() {
        C7239Q0l q0l;
        C7243Q0p q0p = this.A01;
        if (q0p != null) {
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                MediaCodec mediaCodec = q0p.A03;
                int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000);
                if (dequeueOutputBuffer >= 0) {
                    ByteBuffer[] byteBufferArr = q0p.A02;
                    byteBufferArr.getClass();
                    q0l = new C7239Q0l(dequeueOutputBuffer, byteBufferArr[dequeueOutputBuffer], bufferInfo);
                } else if (dequeueOutputBuffer == -3) {
                    q0p.A02 = mediaCodec.getOutputBuffers();
                    q0l = new C7239Q0l(-1, (ByteBuffer) null, (MediaCodec.BufferInfo) null);
                } else if (dequeueOutputBuffer != -2) {
                    return -1;
                } else {
                    q0p.A00 = mediaCodec.getOutputFormat();
                    0KC.A0O("MediaCodecWrapper", "codec: %s changed format %s", new Object[]{mediaCodec.getName(), q0p.A00});
                    q0l = new C7239Q0l(-1, (ByteBuffer) null, (MediaCodec.BufferInfo) null);
                }
                int i = q0l.A01;
                if (i < 0) {
                    return A00();
                }
                MediaCodec.BufferInfo bufferInfo2 = q0l.A00;
                if (bufferInfo2 != null) {
                    int i2 = (bufferInfo2.presentationTimeUs > 0 ? 1 : (bufferInfo2.presentationTimeUs == 0 ? 0 : -1));
                    C7243Q0p q0p2 = this.A01;
                    if (i2 >= 0) {
                        if (q0p2 != null) {
                            q0p2.A03.releaseOutputBuffer(i, q0p2.A05);
                        }
                    } else if (q0p2 != null) {
                        q0p2.A03.releaseOutputBuffer(i, false);
                    }
                    if ((bufferInfo2.flags & 4) != 0) {
                        this.A03 = true;
                        Bitmap bitmap = this.A00;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        this.A00 = null;
                        if (this.A0A) {
                            long j = bufferInfo2.presentationTimeUs;
                            C13815Thi thi = this.A05;
                            thi.Elt(true);
                            thi.AQa(j);
                        }
                    } else if (bufferInfo2.presentationTimeUs >= 0) {
                        C13815Thi thi2 = this.A05;
                        thi2.ACz();
                        long j2 = bufferInfo2.presentationTimeUs;
                        thi2.Elt(false);
                        thi2.AQa(j2);
                        if (this.A02.ErY(this.A04, bufferInfo2.presentationTimeUs)) {
                            if (this.A0B) {
                                Bitmap bitmap2 = this.A00;
                                if (bitmap2 != null && bitmap2.isRecycled()) {
                                    0KC.A0C("DecoderWrapper", "mReusableBitmap should not be recycled at this point.");
                                }
                                Bitmap bitmap3 = this.A00;
                                if (bitmap3 == null || bitmap3.isRecycled()) {
                                    this.A00 = Bitmap.createBitmap(this.A09, this.A08, Bitmap.Config.ARGB_8888);
                                }
                                int i3 = this.A09;
                                int i4 = this.A08;
                                Bitmap bitmap4 = this.A00;
                                if (bitmap4 != null) {
                                    ByteBuffer A012 = C7245Q0r.A01(i3, i4);
                                    C7245Q0r.A02(A012, i3, i4);
                                    bitmap4.copyPixelsFromBuffer(A012);
                                    C13824Thu thu = this.A02;
                                    Bitmap bitmap5 = this.A00;
                                    if (bitmap5 != null) {
                                        thu.CyD(bufferInfo2.presentationTimeUs, this.A04, bitmap5);
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                this.A02.CyD(bufferInfo2.presentationTimeUs, this.A04, C7245Q0r.A00(this.A09, this.A08));
                            }
                        }
                    }
                    this.A04++;
                    return bufferInfo2.presentationTimeUs;
                }
                throw new IllegalStateException("Required value was null.");
            } catch (Exception e) {
                C7243Q0p.A00(e);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A01(C7239Q0l q0l) {
        C7243Q0p q0p = this.A01;
        if (q0p != null) {
            try {
                q0l.A00.getClass();
                MediaCodec mediaCodec = q0p.A03;
                int i = q0l.A01;
                MediaCodec.BufferInfo bufferInfo = q0l.A00;
                mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                MediaCodec.BufferInfo bufferInfo2 = q0l.A00;
                if (bufferInfo2 != null && bufferInfo2.size > 0) {
                    this.A02.DKn(bufferInfo2.presentationTimeUs);
                }
            } catch (Exception e) {
                C7243Q0p.A00(e);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C7240Q0m(C13815Thi thi, C7241Q0n q0n, C13824Thu thu, List list, int i, int i2, boolean z, boolean z2) {
        this.A06 = q0n;
        this.A05 = thi;
        this.A09 = i;
        this.A08 = i2;
        this.A02 = thu;
        this.A0A = z;
        this.A0B = z2;
        this.A07 = list;
    }
}
