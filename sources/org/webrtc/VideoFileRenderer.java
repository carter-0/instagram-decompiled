package org.webrtc;

import X.002;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

public class VideoFileRenderer implements VideoSink {
    public static final String TAG = "VideoFileRenderer";
    public EglBase eglBase;
    public final HandlerThread fileThread;
    public final Handler fileThreadHandler;
    public int frameCount;
    public final int outputFileHeight;
    public final String outputFileName;
    public final int outputFileWidth;
    public final ByteBuffer outputFrameBuffer;
    public final int outputFrameSize;
    public final HandlerThread renderThread;
    public final Handler renderThreadHandler;
    public final FileOutputStream videoOutFile;
    public YuvConverter yuvConverter;

    /* access modifiers changed from: private */
    /* renamed from: renderFrameOnRenderThread */
    public void m59lambda$onFrame$0$orgwebrtcVideoFileRenderer(VideoFrame videoFrame) {
        int i;
        int i2;
        VideoFrame.Buffer buffer = videoFrame.buffer;
        if (videoFrame.rotation % 180 == 0) {
            i = this.outputFileWidth;
            i2 = this.outputFileHeight;
        } else {
            i = this.outputFileHeight;
            i2 = this.outputFileWidth;
        }
        float width = ((float) buffer.getWidth()) / ((float) buffer.getHeight());
        float f = ((float) i) / ((float) i2);
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f > width) {
            height = (int) (((float) height) * (width / f));
        } else {
            width2 = (int) (((float) width2) * (f / width));
        }
        VideoFrame.Buffer cropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i, i2);
        videoFrame.release();
        VideoFrame.I420Buffer i420 = cropAndScale.toI420();
        cropAndScale.release();
        this.fileThreadHandler.post(new VideoFileRenderer$$ExternalSyntheticLambda3(this, i420, videoFrame));
    }

    /* renamed from: lambda$release$2$org-webrtc-VideoFileRenderer  reason: not valid java name */
    public /* synthetic */ void m60lambda$release$2$orgwebrtcVideoFileRenderer(CountDownLatch countDownLatch) {
        this.yuvConverter.release();
        this.eglBase.release();
        this.renderThread.quit();
        countDownLatch.countDown();
    }

    /* renamed from: lambda$release$3$org-webrtc-VideoFileRenderer  reason: not valid java name */
    public /* synthetic */ void m61lambda$release$3$orgwebrtcVideoFileRenderer() {
        try {
            this.videoOutFile.close();
            boolean z = Logging.loggingEnabled;
            this.fileThread.quit();
        } catch (IOException e) {
            throw new RuntimeException("Error closing output file", e);
        }
    }

    public VideoFileRenderer(String str, int i, int i2, final EglBase.Context context) {
        if (i % 2 == 1 || i2 % 2 == 1) {
            throw new IllegalArgumentException("Does not support uneven width or height");
        }
        this.outputFileName = str;
        this.outputFileWidth = i;
        this.outputFileHeight = i2;
        int i3 = ((i * i2) * 3) / 2;
        this.outputFrameSize = i3;
        this.outputFrameBuffer = ByteBuffer.allocateDirect(i3);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        this.videoOutFile = fileOutputStream;
        fileOutputStream.write(002.A0n("YUV4MPEG2 C420 W", " H", " Ip F30:1 A1:1\n", i, i2).getBytes(Charset.forName("US-ASCII")));
        HandlerThread A0I = Pxf.A0I("VideoFileRendererRenderThread");
        this.renderThread = A0I;
        Handler A0N = Pxg.A0N(A0I);
        this.renderThreadHandler = A0N;
        HandlerThread A0I2 = Pxf.A0I("VideoFileRendererFileThread");
        this.fileThread = A0I2;
        this.fileThreadHandler = Pxg.A0N(A0I2);
        ThreadUtils.invokeAtFrontUninterruptibly(A0N, (Runnable) new Runnable() {
            public void run() {
                VideoFileRenderer.this.eglBase = EglBase.CC.create(context, EglBase.CONFIG_PIXEL_BUFFER);
                VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                VideoFileRenderer.this.eglBase.makeCurrent();
                VideoFileRenderer.this.yuvConverter = new YuvConverter();
            }
        });
    }

    /* renamed from: lambda$renderFrameOnRenderThread$1$org-webrtc-VideoFileRenderer  reason: not valid java name */
    public /* synthetic */ void m62lambda$renderFrameOnRenderThread$1$orgwebrtcVideoFileRenderer(VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), this.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.rotation);
        i420Buffer.release();
        try {
            this.videoOutFile.write("FRAME\n".getBytes(Charset.forName("US-ASCII")));
            this.videoOutFile.write(this.outputFrameBuffer.array(), this.outputFrameBuffer.arrayOffset(), this.outputFrameSize);
            this.frameCount++;
        } catch (IOException e) {
            throw new RuntimeException("Error writing video to disk", e);
        }
    }

    public void onFrame(VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new VideoFileRenderer$$ExternalSyntheticLambda2(this, videoFrame));
    }

    public void release() {
        CountDownLatch A0y = Pxf.A0y();
        this.renderThreadHandler.post(new VideoFileRenderer$$ExternalSyntheticLambda0(this, A0y));
        ThreadUtils.awaitUninterruptibly(A0y);
        this.fileThreadHandler.post(new VideoFileRenderer$$ExternalSyntheticLambda1(this));
        try {
            this.fileThread.join();
        } catch (InterruptedException e) {
            Pxe.A1F();
            Logging.e(TAG, "Interrupted while waiting for the write to disk to complete.", e);
        }
    }
}
