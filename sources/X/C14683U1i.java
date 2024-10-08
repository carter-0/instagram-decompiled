package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;

/* renamed from: X.U1i  reason: case insensitive filesystem */
public final class C14683U1i extends MediaCodec.Callback {
    public boolean A00;
    public final /* synthetic */ C19870Wgx A01;
    public final /* synthetic */ U86 A02;

    public C14683U1i(U86 u86) {
        this.A02 = u86;
        this.A01 = u86;
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        C19870Wgx wgx = this.A01;
        if (mediaCodec == wgx.A02) {
            Log.e("EncoderBase", AnonymousClass7TG.A0m(codecException, "onError: ", new StringBuilder()));
            wgx.A03();
            if (codecException == null) {
                C18729Vz4.A00(wgx.A0O, (Exception) null);
            } else {
                C18729Vz4.A00(wgx.A0O, codecException);
            }
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C19870Wgx wgx = this.A01;
        if (mediaCodec == wgx.A02 && !wgx.A09) {
            AnonymousClass7TF.A1M(wgx.A0P, i);
            wgx.A01();
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        IllegalStateException illegalStateException;
        C19870Wgx wgx = this.A01;
        MediaCodec mediaCodec2 = mediaCodec;
        if (mediaCodec2 == wgx.A02 && !this.A00) {
            MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
            int i2 = i;
            if (bufferInfo2.size > 0 && (bufferInfo2.flags & 2) == 0) {
                ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(i2);
                Pxg.A1D(bufferInfo2, outputBuffer);
                C18577VuT vuT = wgx.A07;
                if (vuT != null) {
                    long j = bufferInfo2.presentationTimeUs;
                    synchronized (vuT) {
                        vuT.A04 = j;
                        C18577VuT.A00(vuT);
                    }
                }
                C18729Vz4 vz4 = wgx.A0O;
                if (!vz4.A00) {
                    C19869Wgw wgw = vz4.A01;
                    if (wgw.A05 == null) {
                        illegalStateException = new IllegalStateException("Output buffer received before format info");
                    } else {
                        if (wgw.A01 < wgw.A00) {
                            MediaCodec.BufferInfo bufferInfo3 = new MediaCodec.BufferInfo();
                            bufferInfo3.set(outputBuffer.position(), outputBuffer.remaining(), 0, 0);
                            wgw.A02.writeSampleData(wgw.A05[wgw.A01 / wgw.A00], outputBuffer, bufferInfo3);
                        }
                        int i3 = wgw.A01 + 1;
                        wgw.A01 = i3;
                        if (i3 == wgw.A00) {
                            illegalStateException = null;
                        }
                    }
                    C18729Vz4.A00(vz4, illegalStateException);
                }
            }
            this.A00 = AnonymousClass7TF.A1P(bufferInfo2.flags & 4) | this.A00;
            mediaCodec2.releaseOutputBuffer(i2, false);
            if (this.A00) {
                wgx.A03();
                C18729Vz4.A00(wgx.A0O, (Exception) null);
            }
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        U86 u86 = this.A02;
        if (mediaCodec == u86.A02) {
            String string = mediaFormat.getString("mime");
            String A002 = Pxd.A00(226);
            if (!A002.equals(string)) {
                mediaFormat.setString("mime", A002);
                mediaFormat.setInteger(IgReactMediaPickerNativeModule.WIDTH, u86.A0L);
                mediaFormat.setInteger(IgReactMediaPickerNativeModule.HEIGHT, u86.A0I);
                if (u86.A0T) {
                    mediaFormat.setInteger("tile-width", u86.A0H);
                    mediaFormat.setInteger("tile-height", u86.A0F);
                    mediaFormat.setInteger("grid-rows", u86.A0G);
                    mediaFormat.setInteger("grid-cols", u86.A0E);
                }
            }
            C18729Vz4 vz4 = u86.A0O;
            if (!vz4.A00) {
                C19869Wgw wgw = vz4.A01;
                if (wgw.A05 != null) {
                    C18729Vz4.A00(vz4, new IllegalStateException("Output format changed after muxer started"));
                    return;
                }
                try {
                    wgw.A00 = mediaFormat.getInteger("grid-rows") * mediaFormat.getInteger("grid-cols");
                } catch (ClassCastException | NullPointerException unused) {
                    wgw.A00 = 1;
                }
                wgw.A05 = new int[1];
                for (int i = 0; i < wgw.A05.length; i++) {
                    mediaFormat.setInteger("is-default", AnonymousClass7TF.A1S(i, 0) ? 1 : 0);
                    wgw.A05[i] = wgw.A02.addTrack(mediaFormat);
                }
                wgw.A02.start();
                wgw.A0C.set(true);
                wgw.A01();
            }
        }
    }
}
