package exoplayer2.av1.src;

import X.002;
import X.0dV;
import X.15L;
import X.AnonymousClass2CR;
import X.AnonymousClass4PQ;
import X.AnonymousClass5Of;
import X.AnonymousClass5Oh;
import X.AnonymousClass5Oj;
import X.AnonymousClass972;
import X.C256703wD;
import X.C261794Ay;
import X.C40925AlX;
import X.TOH;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.service.errorcallback.ErrorCallback;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Dav1dDecoder extends AnonymousClass5Of {
    public static Context sAppContext;
    public static 15L sThreadAffinityBoostBuilder;
    public static ThreadPoolExecutor sThreadPoolExecutor;
    public long dav1dDecContext;
    public int lockCanvasErrorCount;
    public final Dav1dMediaCodecAdapterSetting mDav1dMediaCodecAdapterSetting;
    public boolean mEnableAV1SRShader;
    public volatile int outputMode;
    public volatile int prevSurfaceHash = Integer.MAX_VALUE;
    public volatile long totalDecodeTime;
    public volatile int totalSampleCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dav1dDecoder(Dav1dMediaCodecAdapterSetting dav1dMediaCodecAdapterSetting) {
        super(new AnonymousClass5Oh[4], new Dav1dOutputBuffer[4]);
        long dav1dInit;
        Dav1dMediaCodecAdapterSetting dav1dMediaCodecAdapterSetting2 = dav1dMediaCodecAdapterSetting;
        this.mDav1dMediaCodecAdapterSetting = dav1dMediaCodecAdapterSetting2;
        this.mEnableAV1SRShader = dav1dMediaCodecAdapterSetting2.enableAV1SRShader;
        ErrorCallback errorCallback = AnonymousClass2CR.A01.A00;
        if (dav1dMediaCodecAdapterSetting2.enableDav1dJniV2) {
            dav1dInit = dav1dInit2(dav1dMediaCodecAdapterSetting2, dav1dMediaCodecAdapterSetting2.vpsEventCallback);
        } else {
            dav1dInit = dav1dInit(dav1dMediaCodecAdapterSetting2.nThreads, dav1dMediaCodecAdapterSetting2.maxFrameDelay, dav1dMediaCodecAdapterSetting2.applyGrain ? 1 : 0, dav1dMediaCodecAdapterSetting2.enableOpenGLRendering, dav1dMediaCodecAdapterSetting2.enableMmeLogging, dav1dMediaCodecAdapterSetting2.scalingMode.getValue(), dav1dMediaCodecAdapterSetting2.alignLeft, dav1dMediaCodecAdapterSetting2.enableDav1dOpenGLRenderingHandleAspectRatio, dav1dMediaCodecAdapterSetting2.enableDynamicNDK, dav1dMediaCodecAdapterSetting2.vpsEventCallback, errorCallback);
        }
        this.dav1dDecContext = dav1dInit;
        if (dav1dInit != 0) {
            int i = this.A00;
            C256703wD.A04(i == r3);
            for (AnonymousClass4PQ A01 : this.A0A) {
                A01.A01(921600);
            }
            if (dav1dMediaCodecAdapterSetting2.useThreadAffinity) {
                synchronized (Dav1dDecoder.class) {
                    if (sThreadPoolExecutor == null) {
                        sThreadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new TOH());
                    }
                }
                ThreadPoolExecutor threadPoolExecutor = sThreadPoolExecutor;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.execute(new C40925AlX(this));
                    return;
                }
                return;
            }
            return;
        }
        throw new Exception(002.A0R("Dav1dDecoderException: ", "Failed to initialize Dav1d decoder"));
    }

    private native long dav1dClose(long j);

    private native long dav1dClose2(long j);

    private native long dav1dDecode(long j, ByteBuffer byteBuffer, int i, int i2, VpsEventCallback vpsEventCallback);

    private native long dav1dDecode2(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long dav1dFlush(long j);

    private native long dav1dFlush2(long j);

    private native int dav1dGetOutputHeight(long j);

    private native int dav1dGetOutputHeight2(long j);

    private native int dav1dGetOutputWidth(long j);

    private native int dav1dGetOutputWidth2(long j);

    private native int dav1dGetPicture(long j, Dav1dOutputBuffer dav1dOutputBuffer, boolean z, VpsEventCallback vpsEventCallback);

    private native int dav1dGetPicture2(long j, Dav1dOutputBuffer dav1dOutputBuffer, boolean z);

    private native int dav1dGetStatusCode(long j);

    private native int dav1dGetStatusCode2(long j);

    private native long dav1dInit(int i, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, boolean z4, boolean z5, VpsEventCallback vpsEventCallback, ErrorCallback errorCallback);

    private native long dav1dInit2(Dav1dMediaCodecAdapterSetting dav1dMediaCodecAdapterSetting, VpsEventCallback vpsEventCallback);

    private native long dav1dReleaseBuffer(long j, Dav1dOutputBuffer dav1dOutputBuffer);

    private native long dav1dReleaseBuffer2(long j, Dav1dOutputBuffer dav1dOutputBuffer);

    private native String dav1dVersion();

    private native String dav1dVersion2();

    private native long dav1dYuvSurfaceRender(long j, Dav1dOutputBuffer dav1dOutputBuffer, Surface surface, boolean z, boolean z2, int i, boolean z3, VpsEventCallback vpsEventCallback);

    private native long dav1dYuvSurfaceRender2(long j, Dav1dOutputBuffer dav1dOutputBuffer, Surface surface);

    public /* bridge */ /* synthetic */ AnonymousClass4PQ createInputBuffer() {
        return new AnonymousClass4PQ(2);
    }

    public void renderYuvFrameToSurface(Dav1dOutputBuffer dav1dOutputBuffer, Surface surface) {
        int hashCode;
        long dav1dYuvSurfaceRender;
        int dav1dGetStatusCode;
        Surface surface2 = surface;
        if (surface == null) {
            hashCode = 0;
        } else {
            hashCode = surface2.hashCode();
        }
        boolean z = false;
        if (this.prevSurfaceHash != hashCode) {
            z = true;
        }
        this.prevSurfaceHash = hashCode;
        Dav1dMediaCodecAdapterSetting dav1dMediaCodecAdapterSetting = this.mDav1dMediaCodecAdapterSetting;
        Dav1dOutputBuffer dav1dOutputBuffer2 = dav1dOutputBuffer;
        if (dav1dMediaCodecAdapterSetting.enableDav1dJniV2) {
            dav1dYuvSurfaceRender = dav1dYuvSurfaceRender2(this.dav1dDecContext, dav1dOutputBuffer2, surface2);
        } else {
            dav1dYuvSurfaceRender = dav1dYuvSurfaceRender(this.dav1dDecContext, dav1dOutputBuffer2, surface2, z, this.mEnableAV1SRShader, dav1dMediaCodecAdapterSetting.maxWidthForAV1SRShader, dav1dMediaCodecAdapterSetting.enableDav1dOpenGLRenderingHandleAspectRatio, dav1dMediaCodecAdapterSetting.vpsEventCallback);
        }
        if (dav1dYuvSurfaceRender != 0) {
            boolean z2 = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
            long j = this.dav1dDecContext;
            if (z2) {
                dav1dGetStatusCode = dav1dGetStatusCode2(j);
            } else {
                dav1dGetStatusCode = dav1dGetStatusCode(j);
            }
            String.format("Render YUV Result %d, Status Code %d", new Object[]{Long.valueOf(dav1dYuvSurfaceRender), Integer.valueOf(dav1dGetStatusCode)});
            if (dav1dGetStatusCode == 5) {
                this.lockCanvasErrorCount++;
                Log.w("Dav1dDecoderJava", "Failed to lock canvas");
                if (this.lockCanvasErrorCount <= this.mDav1dMediaCodecAdapterSetting.maxNumRetryLockingCanvas) {
                    return;
                }
            } else {
                this.lockCanvasErrorCount = 0;
                if (dav1dGetStatusCode == 0) {
                    return;
                }
            }
            this.lockCanvasErrorCount = 0;
            throw new Exception(002.A0R("Dav1dDecoderException: ", 002.A0O("Get Frame Result error: ", dav1dGetStatusCode)));
        }
    }

    static {
        0dV.A0C("Dav1dExo");
    }

    public /* bridge */ /* synthetic */ AnonymousClass5Oj createOutputBuffer() {
        return new Dav1dOutputBuffer(this);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4Ay, java.lang.Exception] */
    public /* bridge */ /* synthetic */ C261794Ay createUnexpectedDecodeException(Throwable th) {
        return new Exception(002.A0R("Dav1dDecoderException: ", "Unexpected decode error"), th);
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [X.4Ay, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r1v15, types: [X.4Ay, java.lang.Exception] */
    public /* bridge */ /* synthetic */ C261794Ay decode(AnonymousClass4PQ r17, AnonymousClass5Oj r18, boolean z) {
        long dav1dDecode;
        int dav1dGetPicture;
        int dav1dGetStatusCode;
        int dav1dGetStatusCode2;
        AnonymousClass5Oh r4 = (AnonymousClass5Oh) r17;
        Dav1dOutputBuffer dav1dOutputBuffer = (Dav1dOutputBuffer) r18;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ByteBuffer byteBuffer = r4.A02;
        int limit = byteBuffer.limit();
        boolean z2 = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
        long j = this.dav1dDecContext;
        int i = this.outputMode;
        if (z2) {
            dav1dDecode = dav1dDecode2(j, byteBuffer, limit, i);
        } else {
            dav1dDecode = dav1dDecode(j, byteBuffer, limit, i, this.mDav1dMediaCodecAdapterSetting.vpsEventCallback);
        }
        if (!(dav1dDecode == 0 || dav1dDecode == 1)) {
            boolean z3 = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
            long j2 = this.dav1dDecContext;
            if (z3) {
                dav1dGetStatusCode2 = dav1dGetStatusCode2(j2);
            } else {
                dav1dGetStatusCode2 = dav1dGetStatusCode(j2);
            }
            if (dav1dGetStatusCode2 != 0) {
                return new Exception(002.A0R("Dav1dDecoderException: ", 002.A0O("Decode error: ", dav1dGetStatusCode2)));
            }
        }
        long j3 = r4.A01;
        int i2 = this.outputMode;
        dav1dOutputBuffer.A00 = j3;
        dav1dOutputBuffer.mode = i2;
        dav1dOutputBuffer.bufferId = -1;
        dav1dOutputBuffer.colorInfo = r4.A00;
        if ((r4.A00 & 4) == 4) {
            dav1dOutputBuffer.A00 = 4;
        }
        Dav1dMediaCodecAdapterSetting dav1dMediaCodecAdapterSetting = this.mDav1dMediaCodecAdapterSetting;
        boolean z4 = dav1dMediaCodecAdapterSetting.enableDav1dJniV2;
        long j4 = this.dav1dDecContext;
        if (z4) {
            boolean z5 = false;
            if ((r4.A00 & AnonymousClass972.MUTABLE_FLAG_MASK) == Integer.MIN_VALUE) {
                z5 = true;
            }
            dav1dGetPicture = dav1dGetPicture2(j4, dav1dOutputBuffer, z5);
        } else {
            boolean z6 = false;
            if ((r4.A00 & AnonymousClass972.MUTABLE_FLAG_MASK) == Integer.MIN_VALUE) {
                z6 = true;
            }
            dav1dGetPicture = dav1dGetPicture(j4, dav1dOutputBuffer, z6, dav1dMediaCodecAdapterSetting.vpsEventCallback);
        }
        if ((r4.A00 & AnonymousClass972.MUTABLE_FLAG_MASK) == Integer.MIN_VALUE || dav1dGetPicture != 0) {
            dav1dOutputBuffer.A00 = Integer.MIN_VALUE | dav1dOutputBuffer.A00;
            if (!(dav1dGetPicture == 0 || dav1dGetPicture == 1)) {
                boolean z7 = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
                long j5 = this.dav1dDecContext;
                if (z7) {
                    dav1dGetStatusCode = dav1dGetStatusCode2(j5);
                } else {
                    dav1dGetStatusCode = dav1dGetStatusCode(j5);
                }
                if (dav1dGetStatusCode != 0) {
                    Log.w("Dav1dDecoderJava", String.format("AV1 Error: %d", new Object[]{Integer.valueOf(dav1dGetStatusCode)}));
                    boolean z8 = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
                    long j6 = this.dav1dDecContext;
                    if (z8) {
                        dav1dFlush2(j6);
                    } else {
                        dav1dFlush(j6);
                    }
                    if (this.mDav1dMediaCodecAdapterSetting.dav1dThrowExceptionOnPictureError) {
                        return new Exception(002.A0R("Dav1dDecoderException: ", 002.A0O("Get Frame Result error: ", dav1dGetStatusCode)));
                    }
                }
            }
        }
        synchronized (this) {
            this.totalDecodeTime += SystemClock.elapsedRealtime() - elapsedRealtime;
            this.totalSampleCount++;
        }
        return null;
    }

    public void releaseOutputBufferInternalDav1d(Dav1dOutputBuffer dav1dOutputBuffer) {
        if (dav1dOutputBuffer.mode == 0 && dav1dOutputBuffer.bufferId != -1) {
            boolean z = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
            long j = this.dav1dDecContext;
            if (z) {
                dav1dReleaseBuffer2(j, dav1dOutputBuffer);
            } else {
                dav1dReleaseBuffer(j, dav1dOutputBuffer);
            }
        }
        dav1dOutputBuffer.mode = -1;
        dav1dOutputBuffer.bufferId = -1;
        dav1dOutputBuffer.height = 0;
        dav1dOutputBuffer.width = 0;
    }

    public void release() {
        super.release();
        boolean z = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
        long j = this.dav1dDecContext;
        if (z) {
            dav1dClose2(j);
            this.dav1dDecContext = 0;
            return;
        }
        dav1dClose(j);
    }
}
