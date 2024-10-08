package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class SSN {
    public int A00 = -1;
    public MediaCodec A01;
    public MediaMuxer A02;
    public Surface A03;
    public C10288Rpm A04;
    public Q7p A05;
    public boolean A06 = false;
    public final MediaCodec.BufferInfo A07 = new MediaCodec.BufferInfo();
    public final UserSession A08;
    public volatile boolean A09 = false;

    public static void A01(SSN ssn, Exception exc, String str) {
        ssn.A09 = false;
        0KC.A0F("BoomerangEncoder", str, exc);
        if (ssn.A04 != null) {
            0KC.A0F("PosesFramesHandlerV1", str, exc);
        }
    }

    public static void A00(SSN ssn) {
        MediaCodec mediaCodec;
        if (ssn.A09 && (mediaCodec = ssn.A01) != null) {
            try {
                mediaCodec.signalEndOfInputStream();
                A03(ssn, true);
                ssn.A01.flush();
            } catch (IllegalStateException e) {
                A02(ssn, e);
            } catch (Throwable th) {
                ssn.A09 = false;
                throw th;
            }
            ssn.A09 = false;
            try {
                if (182.A06(0Tu.A05, ssn.A08, 36316671497409108L)) {
                    Exception A012 = C11292SKa.A01(ssn.A01);
                    if (A012 != null) {
                        throw A012;
                    }
                } else {
                    0fX.A06(ssn.A01, 1883330788);
                }
            } catch (Exception e2) {
                A01(ssn, e2, "MediaCodec.stop() Error");
            }
            ssn.A06 = false;
            ssn.A00 = -1;
            C10288Rpm rpm = ssn.A04;
            if (rpm != null) {
                C69106Nel nel = rpm.A00.A0B.A00;
                nel.A0F.A00.A00(new PJh());
                ((Handler) nel.A0I.getValue()).post(new C73135PXU(nel));
            }
        }
    }

    public static void A02(SSN ssn, IllegalStateException illegalStateException) {
        String str;
        if (illegalStateException instanceof MediaCodec.CodecException) {
            str = "MediaCodec.CodecException Error";
        } else {
            str = "IllegalStateException Error";
        }
        A01(ssn, illegalStateException, str);
    }

    public static void A03(SSN ssn, boolean z) {
        RuntimeException runtimeException;
        if (ssn.A09) {
            try {
                MediaCodec mediaCodec = ssn.A01;
                if (mediaCodec != null && ssn.A02 != null) {
                    loop0:
                    while (true) {
                        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
                        while (true) {
                            MediaCodec mediaCodec2 = ssn.A01;
                            MediaCodec.BufferInfo bufferInfo = ssn.A07;
                            int dequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, 2500);
                            if (dequeueOutputBuffer == -1) {
                                if (!z) {
                                    return;
                                }
                            } else if (dequeueOutputBuffer == -3) {
                                break;
                            } else if (dequeueOutputBuffer == -2) {
                                if (ssn.A06) {
                                    runtimeException = Pxg.A0k("video/avc", ": format changed twice");
                                    break loop0;
                                }
                                ssn.A00 = ssn.A02.addTrack(ssn.A01.getOutputFormat());
                                ssn.A02.start();
                                ssn.A06 = true;
                            } else if (dequeueOutputBuffer < 0) {
                                0KC.A0P("BoomerangEncoder", "unexpected result from encoder.dequeueOutputBuffer: %d", new Object[]{Integer.valueOf(dequeueOutputBuffer)});
                            } else {
                                ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                                if ((bufferInfo.flags & 2) != 0) {
                                    bufferInfo.size = 0;
                                }
                                if (bufferInfo.size != 0) {
                                    if (!ssn.A06) {
                                        runtimeException = Pxg.A0k("video/avc", ": muxer hasn't started");
                                        break loop0;
                                    } else {
                                        Pxg.A1D(bufferInfo, byteBuffer);
                                        ssn.A02.writeSampleData(ssn.A00, byteBuffer, bufferInfo);
                                    }
                                }
                                ssn.A01.releaseOutputBuffer(dequeueOutputBuffer, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    if (!z) {
                                        0KC.A0P("BoomerangEncoder", "%s: reached end of stream unexpectedly", new Object[]{"video/avc"});
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        mediaCodec = ssn.A01;
                    }
                    throw runtimeException;
                }
            } catch (IllegalStateException e) {
                A02(ssn, e);
            }
        }
    }

    public final boolean A04(int i, int i2, int i3, int i4) {
        if (i4 < 10) {
            try {
                this.A01 = 0fX.A02("video/avc", 222554277);
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
                createVideoFormat.setInteger(TraceFieldType.Bitrate, i3);
                createVideoFormat.setInteger("i-frame-interval", 1);
                createVideoFormat.setInteger("max-input-size", 0);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("frame-rate", 30);
                0fX.A07(this.A01, (MediaCrypto) null, createVideoFormat, (Surface) null, 1, 1298097044);
                this.A03 = this.A01.createInputSurface();
                return true;
            } catch (IOException e) {
                0KC.A0F("BoomerangEncoder", "Cannot create encoder!", e);
                if (this.A04 != null) {
                    String message = e.getMessage();
                    0qQ.A0B(message, 0);
                    0KC.A0F("PosesFramesHandlerV1", message, e);
                }
            } catch (IllegalStateException e2) {
                A02(this, e2);
                return false;
            } catch (IllegalArgumentException unused) {
                return A04(i, i2, i3, i4 + 1);
            }
        }
        return false;
    }

    public SSN(UserSession userSession) {
        this.A08 = userSession;
    }
}
