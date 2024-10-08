package org.webrtc;

import X.AnonymousClass000;
import X.C51971G9r;
import X.DbW;
import android.opengl.GLES20;
import java.nio.Buffer;

public class GlTextureFrameBuffer {
    public int frameBufferId;
    public int height;
    public final int pixelFormat;
    public int textureId;
    public int width;

    public void release() {
        GLES20.glDeleteTextures(1, new int[]{this.textureId}, 0);
        this.textureId = 0;
        GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        this.frameBufferId = 0;
        this.width = 0;
        this.height = 0;
    }

    public void setSize(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (i <= 0 || i2 <= 0) {
            throw C51971G9r.A0l(AnonymousClass000.A00(971), "x", i, i2);
        } else if (i != this.width || i2 != this.height) {
            this.width = i;
            this.height = i2;
            if (this.textureId == 0) {
                this.textureId = GlUtil.generateTexture(3553);
            }
            if (this.frameBufferId == 0) {
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.frameBufferId = iArr[0];
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.textureId);
            int i5 = this.pixelFormat;
            GLES20.glTexImage2D(3553, 0, i5, i3, i4, 0, i5, 5121, (Buffer) null);
            GLES20.glBindTexture(3553, 0);
            GlUtil.checkNoGLES2Error("GlTextureFrameBuffer setSize");
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureId, 0);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus == 36053) {
                GLES20.glBindFramebuffer(36160, 0);
                return;
            }
            throw DbW.A0b("Framebuffer not complete, status: ", glCheckFramebufferStatus);
        }
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public GlTextureFrameBuffer(int i) {
        switch (i) {
            case 6407:
            case 6408:
            case 6409:
                this.pixelFormat = i;
                this.width = 0;
                this.height = 0;
                return;
            default:
                throw DbW.A0a("Invalid pixel format: ", i);
        }
    }
}
