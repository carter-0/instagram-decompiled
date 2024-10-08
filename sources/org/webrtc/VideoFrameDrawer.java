package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

public class VideoFrameDrawer {
    public static final String TAG = "VideoFrameDrawer";
    public static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    public final float[] dstPoints = new float[6];
    public VideoFrame lastI420Frame;
    public int renderHeight;
    public final Matrix renderMatrix = new Matrix();
    public final Point renderSize = new Point();
    public int renderWidth;
    public final YuvUploader yuvUploader = new Object();

    public class YuvUploader {
        public ByteBuffer copyBuffer;
        public int[] yuvTextures;

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i3 = 0;
            int i4 = i / 2;
            int[] iArr2 = {i, i4, i4};
            int i5 = i2 / 2;
            int[] iArr3 = {i2, i5, i5};
            int i6 = 0;
            int i7 = 0;
            do {
                int i8 = iArr[i6];
                int i9 = iArr2[i6];
                if (i8 > i9) {
                    i7 = Math.max(i7, i9 * iArr3[i6]);
                }
                i6++;
            } while (i6 < 3);
            if (i7 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i7)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i7);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                int i10 = 0;
                do {
                    this.yuvTextures[i10] = GlUtil.generateTexture(3553);
                    i10++;
                } while (i10 < 3);
            }
            do {
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.yuvTextures[i3]);
                int i11 = iArr[i3];
                int i12 = iArr2[i3];
                if (i11 == i12) {
                    byteBuffer = byteBufferArr[i3];
                } else {
                    YuvHelper.nativeCopyPlane(byteBufferArr[i3], i11, this.copyBuffer, i12, i12, iArr3[i3]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i3], iArr3[i3], 0, 6409, 5121, byteBuffer);
                i3++;
            } while (i3 < 3);
            return this.yuvTextures;
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public /* synthetic */ YuvUploader(AnonymousClass1 r1) {
        }

        public YuvUploader() {
        }
    }

    public static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot((double) (f3 - f), (double) (f4 - f2)));
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    /* renamed from: org.webrtc.VideoFrameDrawer$1  reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        static {
            /*
                org.webrtc.VideoFrame$TextureBuffer$Type[] r0 = org.webrtc.VideoFrame.TextureBuffer.Type.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = r1
                org.webrtc.VideoFrame$TextureBuffer$Type r0 = org.webrtc.VideoFrame.TextureBuffer.Type.OES     // Catch:{ NoSuchFieldError -> 0x000e }
                X.C66581MXm.A1N(r0, r1)     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                org.webrtc.VideoFrame$TextureBuffer$Type r0 = org.webrtc.VideoFrame.TextureBuffer.Type.RGB     // Catch:{ NoSuchFieldError -> 0x0013 }
                X.C51970G9q.A1M(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.VideoFrameDrawer.AnonymousClass1.<clinit>():void");
        }
    }

    private void calculateTransformedRenderSize(int i, int i2, Matrix matrix) {
        float[] fArr;
        if (matrix == null) {
            this.renderWidth = i;
            this.renderHeight = i2;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        int i3 = 0;
        do {
            fArr = this.dstPoints;
            int i4 = i3 * 2;
            fArr[i4] = fArr[i4] * ((float) i);
            int i5 = i4 + 1;
            fArr[i5] = fArr[i5] * ((float) i2);
            i3++;
        } while (i3 < 3);
        float f = fArr[0];
        float f2 = fArr[1];
        this.renderWidth = distance(f, f2, fArr[2], fArr[3]);
        this.renderHeight = distance(f, f2, fArr[4], fArr[5]);
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int ordinal = textureBuffer.getType().ordinal();
        if (ordinal == 0) {
            glDrawer.drawOes(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else if (ordinal == 1) {
            glDrawer.drawRgb(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else {
            throw new RuntimeException("Unknown texture type.");
        }
    }

    public VideoFrame.Buffer prepareBufferForViewportSize(VideoFrame.Buffer buffer, int i, int i2) {
        buffer.retain();
        return buffer;
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4) {
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        if (this.renderWidth <= 0 || this.renderHeight <= 0) {
            boolean z = Logging.loggingEnabled;
            return;
        }
        boolean z2 = videoFrame.buffer instanceof VideoFrame.TextureBuffer;
        this.renderMatrix.reset();
        this.renderMatrix.preTranslate(0.5f, 0.5f);
        if (!z2) {
            this.renderMatrix.preScale(1.0f, -1.0f);
        }
        this.renderMatrix.preRotate((float) videoFrame.rotation);
        this.renderMatrix.preTranslate(-0.5f, -0.5f);
        if (matrix != null) {
            this.renderMatrix.preConcat(matrix);
        }
        RendererCommon.GlDrawer glDrawer2 = glDrawer;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (z2) {
            this.lastI420Frame = null;
            drawTexture(glDrawer2, (VideoFrame.TextureBuffer) videoFrame.buffer, this.renderMatrix, this.renderWidth, this.renderHeight, i5, i6, i7, i8);
            return;
        }
        if (videoFrame != this.lastI420Frame) {
            this.lastI420Frame = videoFrame;
            VideoFrame.I420Buffer i420 = videoFrame.buffer.toI420();
            this.yuvUploader.uploadFromBuffer(i420);
            i420.release();
        }
        glDrawer2.drawYuv(this.yuvUploader.yuvTextures, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i5, i6, i7, i8);
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, (Matrix) null);
    }
}
