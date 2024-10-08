package exoplayer2.av1.src;

import X.0IE;
import X.0Ks;
import X.27d;
import X.AnonymousClass0IJ;
import X.AnonymousClass4PQ;
import X.AnonymousClass4PT;
import X.AnonymousClass4YU;
import X.AnonymousClass5Oh;
import X.AnonymousClass5Oj;
import X.C251403n3;
import X.C256683wB;
import X.C2612348u;
import X.C296395pz;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public class Dav1dMediaCodecAdapter implements C251403n3 {
    public static final String TAG = "Dav1dMediaCodecAdapter";
    public Bitmap mBitmap;
    public ColorInfo mColorInfo;
    public int mCurrentHeight = 0;
    public int mCurrentWidth = 0;
    public Dav1dMediaCodecAdapterSetting mDav1dMediaCodecAdapterSetting;
    public Dav1dDecoder mDecoder;
    public HashMap mInputBufferInUse = new HashMap();
    public int mInputIndex = 0;
    public HashMap mOutputBufferInUse = new HashMap();
    public boolean mOutputFormatNotified = false;
    public boolean mOutputFormatSet = false;
    public int mOutputIndex = 0;
    public int mOutputMode;
    public int mPendingOutputIndex = -1;
    public Surface mSurface;

    private void clearRenderedFirstFrame() {
    }

    private void onOutputReset() {
    }

    public int dequeueInputBufferIndex() {
        AnonymousClass4PQ A01;
        try {
            Dav1dDecoder dav1dDecoder = this.mDecoder;
            if (!(dav1dDecoder == null || (A01 = dav1dDecoder.AOh()) == null)) {
                int i = this.mInputIndex;
                HashMap hashMap = this.mInputBufferInUse;
                this.mInputIndex = i + 1;
                hashMap.put(Integer.valueOf(i), A01);
                return i;
            }
        } catch (Dav1dDecoderException e) {
            Log.w(TAG, String.format("dequeueInputBuffer() - Exception calling mDecoder.dequeueInputBuffer(): %s", new Object[]{e.toString()}));
        }
        return -1;
    }

    public MediaFormat getOutputFormat() {
        this.mOutputFormatNotified = true;
        return MediaFormat.createVideoFormat((String) null, this.mCurrentWidth, this.mCurrentHeight);
    }

    public boolean needsReconfiguration() {
        return false;
    }

    public void processOutputBuffersChanged() {
    }

    public void queueSecureInputBuffer(int i, int i2, AnonymousClass4PT r3, long j, int i3) {
    }

    public void setOnFrameRenderedListener(C296395pz r1, Handler handler) {
    }

    public void setParameters(Bundle bundle) {
    }

    public void setVideoScalingMode(int i) {
    }

    private boolean hasOutput() {
        if (this.mOutputMode != -1) {
            return true;
        }
        return false;
    }

    private boolean isSurfaceEligible(Surface surface) {
        if (surface == null || !surface.isValid()) {
            return false;
        }
        return true;
    }

    private void onOutputChanged() {
    }

    private void onOutputRemoved() {
    }

    private void render(Dav1dOutputBuffer dav1dOutputBuffer, long j) {
        if (this.mDecoder != null) {
            try {
                renderOutputBuffer(dav1dOutputBuffer);
            } catch (C2612348u unused) {
            }
        }
    }

    private void renderOutputBuffer(Dav1dOutputBuffer dav1dOutputBuffer) {
        Surface surface = this.mSurface;
        if ((dav1dOutputBuffer.mode == 0 || !isSurfaceEligible(surface)) && dav1dOutputBuffer.height > 0 && dav1dOutputBuffer.width > 0) {
            try {
                Dav1dDecoder dav1dDecoder = this.mDecoder;
                if (dav1dDecoder != null) {
                    dav1dDecoder.renderYuvFrameToSurface(dav1dOutputBuffer, surface);
                }
            } catch (Dav1dDecoderException e) {
                Log.w(TAG, String.format("renderOutputBuffer() - Exception calling renderOutputBuffer(): %s", new Object[]{e.toString()}));
                throw new C2612348u((C256683wB) null, TAG, e, 1, 4003, 2, 4, false);
            }
        }
    }

    private void setOutputSurfaceInternal(Surface surface) {
        Dav1dDecoder dav1dDecoder;
        int i = 0;
        if (this.mSurface != surface) {
            this.mSurface = surface;
            this.mCurrentWidth = 0;
            this.mCurrentHeight = 0;
        }
        if (!isSurfaceEligible(surface)) {
            i = -1;
        }
        if (i != this.mOutputMode && (dav1dDecoder = this.mDecoder) != null) {
            this.mOutputMode = i;
            dav1dDecoder.outputMode = i;
        }
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, Object obj) {
        if (obj != null && (obj instanceof Dav1dMediaCodecAdapterSetting)) {
            this.mDav1dMediaCodecAdapterSetting = (Dav1dMediaCodecAdapterSetting) obj;
            this.mOutputMode = -1;
            if (this.mDecoder == null) {
                createDav1dDecoder(mediaFormat, surface);
            }
        }
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        Dav1dOutputBuffer dav1dOutputBuffer;
        int i;
        int i2;
        int i3;
        int i4 = this.mPendingOutputIndex;
        if (i4 != -1) {
            this.mPendingOutputIndex = -1;
            return i4;
        }
        try {
            Dav1dDecoder dav1dDecoder = this.mDecoder;
            if (!(dav1dDecoder == null || (dav1dOutputBuffer = (Dav1dOutputBuffer) dav1dDecoder.AOk()) == null)) {
                bufferInfo.presentationTimeUs = dav1dOutputBuffer.A00;
                if ((dav1dOutputBuffer.A00 & 4) == 4) {
                    i = 4;
                } else {
                    i = 0;
                }
                bufferInfo.flags = i;
                ByteBuffer byteBuffer = dav1dOutputBuffer.data;
                if (byteBuffer != null) {
                    i2 = byteBuffer.remaining();
                } else {
                    i2 = 0;
                }
                bufferInfo.size = i2;
                int i5 = this.mOutputIndex;
                HashMap hashMap = this.mOutputBufferInUse;
                this.mOutputIndex = i5 + 1;
                hashMap.put(Integer.valueOf(i5), dav1dOutputBuffer);
                int i6 = dav1dOutputBuffer.width;
                if (i6 <= 0 || (i3 = dav1dOutputBuffer.height) <= 0) {
                    return i5;
                }
                if (this.mCurrentWidth == i6 && this.mCurrentHeight == i3) {
                    return i5;
                }
                this.mPendingOutputIndex = i5;
                this.mCurrentWidth = i6;
                this.mCurrentHeight = i3;
                return -2;
            }
        } catch (Dav1dDecoderException e) {
            Log.w(TAG, String.format("dequeueOutputBuffer() - Exception calling mDecoder.dequeueOutputBuffer(): %s", new Object[]{e.toString()}));
        }
        return -1;
    }

    public void enableSR(boolean z) {
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder != null) {
            dav1dDecoder.mEnableAV1SRShader = z;
        }
    }

    public void flush() {
        this.mInputBufferInUse.clear();
        for (Map.Entry value : this.mOutputBufferInUse.entrySet()) {
            AnonymousClass5Oj r0 = (AnonymousClass5Oj) value.getValue();
            if (r0 != null) {
                r0.release();
            }
        }
        this.mOutputBufferInUse.clear();
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder != null) {
            dav1dDecoder.flush();
        }
    }

    public ByteBuffer getInputBuffer(int i) {
        AnonymousClass4PQ r0 = (AnonymousClass4PQ) this.mInputBufferInUse.get(Integer.valueOf(i));
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public PersistableBundle getMetrics() {
        return new PersistableBundle();
    }

    public ByteBuffer getOutputBuffer(int i) {
        Dav1dOutputBuffer dav1dOutputBuffer = (Dav1dOutputBuffer) this.mOutputBufferInUse.get(Integer.valueOf(i));
        if (dav1dOutputBuffer != null) {
            return dav1dOutputBuffer.data;
        }
        return null;
    }

    public Pair getPerFrameTotalDecodeTimeAndCount() {
        Pair pair;
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder == null) {
            return new Pair(0L, 0);
        }
        synchronized (dav1dDecoder) {
            pair = new Pair(Long.valueOf(dav1dDecoder.totalDecodeTime), Integer.valueOf(dav1dDecoder.totalSampleCount));
            dav1dDecoder.totalDecodeTime = 0;
            dav1dDecoder.totalSampleCount = 0;
        }
        return pair;
    }

    public int getTotalSampleCount() {
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder != null) {
            return dav1dDecoder.totalSampleCount;
        }
        return 0;
    }

    public boolean isSREnabled(int i) {
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder == null || !dav1dDecoder.mEnableAV1SRShader || i <= 0 || this.mDav1dMediaCodecAdapterSetting.maxWidthForAV1SRShader <= i) {
            return false;
        }
        return true;
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        HashMap hashMap = this.mInputBufferInUse;
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass5Oh r1 = (AnonymousClass5Oh) hashMap.get(valueOf);
        if (r1 != null) {
            if ((i4 & 4) != 0) {
                r1.A00 = 4;
            }
            ColorInfo colorInfo = this.mColorInfo;
            if (colorInfo != null) {
                r1.A00 = colorInfo;
            }
            try {
                r1.A01 = j;
                Dav1dDecoder dav1dDecoder = this.mDecoder;
                if (dav1dDecoder != null) {
                    dav1dDecoder.E5x(r1);
                    this.mInputBufferInUse.remove(valueOf);
                }
            } catch (Dav1dDecoderException e) {
                Log.w(TAG, String.format("queueInputBuffer() - Exception calling mDecoder.queueInputBuffer(): %s", new Object[]{e.toString()}));
            }
        }
    }

    public void releaseOutputBuffer(int i, boolean z) {
        HashMap hashMap = this.mOutputBufferInUse;
        Integer valueOf = Integer.valueOf(i);
        Dav1dOutputBuffer dav1dOutputBuffer = (Dav1dOutputBuffer) hashMap.get(valueOf);
        if (dav1dOutputBuffer != null) {
            if (z) {
                render(dav1dOutputBuffer, -1);
            }
            dav1dOutputBuffer.release();
            this.mOutputBufferInUse.remove(valueOf);
        }
    }

    public void createDav1dDecoder(MediaFormat mediaFormat, Surface surface) {
        if (AnonymousClass0IJ.A02()) {
            AnonymousClass0IJ.A00(new 0Ks(1437958796, hashCode(), "dav1d"));
        }
        try {
            27d.A01("createDav1dDecoder");
            ThreadPoolExecutor threadPoolExecutor = Dav1dDecoder.sThreadPoolExecutor;
            this.mDecoder = new Dav1dDecoder(this.mDav1dMediaCodecAdapterSetting);
            this.mColorInfo = AnonymousClass4YU.A00(mediaFormat);
            27d.A00();
        } catch (Dav1dDecoderException e) {
            Log.w(TAG, String.format("configure() - Exception initializing Dav1dDecoder: %s", new Object[]{e.toString()}));
        }
        setOutputSurfaceInternal(surface);
    }

    public void release() {
        if (AnonymousClass0IJ.A02()) {
            AnonymousClass0IJ.A00(new 0IE(-849434272, Integer.valueOf(hashCode())));
        }
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder != null) {
            dav1dDecoder.release();
            this.mDecoder = null;
        }
        this.mSurface = null;
    }

    public void reset() {
        if (AnonymousClass0IJ.A02()) {
            AnonymousClass0IJ.A00(new 0IE(997288427, Integer.valueOf(hashCode())));
        }
        flush();
        this.mInputIndex = 0;
        this.mOutputIndex = 0;
        this.mColorInfo = null;
        this.mCurrentWidth = 0;
        this.mCurrentHeight = 0;
    }

    public void start() {
        if (AnonymousClass0IJ.A02()) {
            AnonymousClass0IJ.A00(new 0IE(702923060, Integer.valueOf(hashCode())));
        }
    }

    public void stop() {
        if (AnonymousClass0IJ.A02()) {
            AnonymousClass0IJ.A00(new 0IE(936395742, Integer.valueOf(hashCode())));
        }
    }

    public void setOutputSurface(Surface surface) {
        setOutputSurfaceInternal(surface);
    }

    public void releaseOutputBuffer(int i, long j) {
        HashMap hashMap = this.mOutputBufferInUse;
        Integer valueOf = Integer.valueOf(i);
        Dav1dOutputBuffer dav1dOutputBuffer = (Dav1dOutputBuffer) hashMap.get(valueOf);
        if (dav1dOutputBuffer != null) {
            render(dav1dOutputBuffer, j);
            dav1dOutputBuffer.release();
            this.mOutputBufferInUse.remove(valueOf);
        }
    }
}
