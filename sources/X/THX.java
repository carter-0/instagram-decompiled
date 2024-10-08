package X;

public final class THX implements Runnable {
    public final /* synthetic */ C353278Gz A00;
    public final /* synthetic */ 0sP A01;

    public THX(C353278Gz r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.T8S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: X.T8R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: X.T8S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: X.T8S} */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.Q0n, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v6, types: [X.Q0n, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0379 A[EDGE_INSN: B:136:0x0379->B:94:0x0379 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r33 = r34
            r0 = r33
            X.8Gz r0 = r0.A00
            r32 = r0
            X.S3Z r4 = r0.A00
            java.lang.String r22 = "multipleVideoMerger"
            if (r4 == 0) goto L_0x00de
            r3 = 0
            X.S70 r9 = r4.A0C     // Catch:{ IOException -> 0x037e }
            X.RyY r2 = r4.A0A     // Catch:{ IOException -> 0x037e }
            java.lang.String r1 = r2.A07     // Catch:{ IOException -> 0x037e }
            X.Q0h r11 = X.Q12.A00     // Catch:{ IOException -> 0x037e }
            r15 = 90000(0x15f90, float:1.26117E-40)
            r14 = 0
            com.facebook.ffmpeg.FFMpegMediaMuxer r0 = new com.facebook.ffmpeg.FFMpegMediaMuxer     // Catch:{ IOException -> 0x037e }
            r10 = r0
            r12 = r1
            r13 = r3
            r16 = r3
            r17 = r14
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x037e }
            r9.A02 = r0     // Catch:{ IOException -> 0x037e }
            r0.initialize()     // Catch:{ IOException -> 0x037e }
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.List r7 = r4.A0D
            java.util.Iterator r6 = r7.iterator()
        L_0x0037:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r6.next()
            X.Rva r0 = (X.C10641Rva) r0
            X.7zv r5 = r0.A02
            boolean r0 = r5.A1H
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r5.A0k
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            r1.setDataSource(r0)
            r0 = 16
            java.lang.String r1 = r1.extractMetadata(r0)
            java.lang.String r0 = "yes"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r5.A0k
            r8.add(r0)
            goto L_0x0037
        L_0x0068:
            int r0 = r8.size()
            r6 = 1
            if (r0 != r6) goto L_0x0076
            java.lang.Object r0 = r8.get(r3)
            r8.add(r0)
        L_0x0076:
            int r0 = r8.size()
            if (r0 <= r6) goto L_0x00a0
            int r10 = r8.size()
            float[] r11 = new float[r10]
            r5 = 0
        L_0x0083:
            if (r5 >= r10) goto L_0x0092
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = r8.size()
            float r0 = (float) r0
            float r1 = r1 / r0
            r11[r5] = r1
            int r5 = r5 + 1
            goto L_0x0083
        L_0x0092:
            int r1 = r8.size()
            int[] r10 = new int[r1]
            r0 = 0
        L_0x0099:
            if (r0 >= r1) goto L_0x00aa
            r10[r0] = r3
            int r0 = r0 + 1
            goto L_0x0099
        L_0x00a0:
            int r1 = r2.A00
            int r0 = r2.A01
            X.T8R r8 = new X.T8R
            r8.<init>(r9, r1, r0)
            goto L_0x00c5
        L_0x00aa:
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r5 = r8.toArray(r0)
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r1 = r2.A00
            int r0 = r2.A01
            X.T8S r8 = new X.T8S
            r12 = r8
            r13 = r9
            r14 = r11
            r15 = r10
            r16 = r5
            r17 = r1
            r18 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x00c5:
            r4.A03 = r8
            X.Q0n r5 = new X.Q0n     // Catch:{  }
            r5.<init>()     // Catch:{  }
            android.media.MediaFormat r1 = r4.A07     // Catch:{  }
            com.instagram.common.session.UserSession r0 = r4.A09     // Catch:{  }
            r31 = r0
            X.JYY.A00(r31)     // Catch:{  }
            X.Q0p r0 = r5.A01(r1, r0)     // Catch:{  }
            android.media.MediaCodec r0 = r0.A03     // Catch:{  }
            r4.A01 = r0     // Catch:{  }
            goto L_0x00e2
        L_0x00de:
            X.0qQ.A0F(r22)
            goto L_0x00f2
        L_0x00e2:
            android.view.Surface r1 = r0.createInputSurface()
            r4.A02 = r1
            X.S4f r0 = r4.A0B
            if (r1 != 0) goto L_0x00f7
            java.lang.String r1 = "surface"
        L_0x00ef:
            X.0qQ.A0F(r1)
        L_0x00f2:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f7:
            r0.A01(r1)
            X.ThX r0 = r4.A03
            java.lang.String r1 = "audioMerger"
            if (r0 == 0) goto L_0x00ef
            r0.E40()
            X.ThX r0 = r4.A03
            if (r0 == 0) goto L_0x00ef
            r0.ExD()
            java.util.Iterator r21 = r7.iterator()
        L_0x010e:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x0383
            java.lang.Object r7 = r21.next()
            X.Rva r7 = (X.C10641Rva) r7
            android.media.MediaExtractor r20 = new android.media.MediaExtractor
            r20.<init>()
            X.7zv r0 = r7.A02
            java.lang.String r1 = r0.A0k
            r0 = r20
            r0.setDataSource(r1)
            int r8 = r20.getTrackCount()
            r5 = 0
        L_0x012d:
            if (r5 >= r8) goto L_0x0385
            r0 = r20
            android.media.MediaFormat r15 = r0.getTrackFormat(r5)
            java.lang.String r1 = X.Pxf.A0a(r15)
            if (r1 == 0) goto L_0x0375
            java.lang.String r0 = "video/"
            r13 = 2
            boolean r0 = X.C66580MXl.A1a(r0, r6, r1)
            if (r0 == 0) goto L_0x0375
            r0 = r20
            r0.selectTrack(r5)
            java.lang.String r0 = "multiple_video_merger_decoder_thread"
            android.os.HandlerThread r0 = X.Pxf.A0I(r0)
            android.os.Handler r26 = X.Pxg.A0N(r0)
            java.util.concurrent.Semaphore r19 = new java.util.concurrent.Semaphore
            r0 = r19
            r0.<init>(r6, r6)
            X.RzB r5 = new X.RzB
            r5.<init>()
            r29 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.String r1 = "frame-rate"
            boolean r0 = r15.containsKey(r1)
            if (r0 == 0) goto L_0x0371
            int r0 = r15.getInteger(r1)
        L_0x0170:
            long r0 = (long) r0
            long r29 = r29 / r0
            int r0 = r2.A05
            float r9 = (float) r0
            android.graphics.RectF r0 = r7.A01
            r24 = r0
            float r0 = r24.width()
            float r0 = r0 * r9
            int r0 = (int) r0
            r18 = r0
            int r0 = r2.A02
            float r8 = (float) r0
            float r0 = r24.height()
            float r0 = r0 * r8
            int r0 = (int) r0
            r17 = r0
            java.lang.String r1 = "attribute vec3 position;\nattribute vec2 texcoord;\nvarying vec2 tx;\nvoid main() {\n    tx = texcoord;\n    gl_Position = vec4(position, 1);\n}"
            java.lang.String r0 = "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES tex_v;\nuniform highp mat4 st_matrix;\nvarying highp vec2 tx;\nvoid main() {\n    highp vec2 tx_transformed = (st_matrix * vec4(tx, 0, 1.0)).xy;\n    highp vec4 video = texture2D(tex_v, tx_transformed);\n    gl_FragColor = video;\n}"
            r10 = 35633(0x8b31, float:4.9932E-41)
            int r12 = android.opengl.GLES20.glCreateShader(r10)
            if (r12 == 0) goto L_0x01cb
            android.opengl.GLES20.glShaderSource(r12, r1)
            android.opengl.GLES20.glCompileShader(r12)
            int[] r10 = new int[r6]
            r1 = 35713(0x8b81, float:5.0045E-41)
            android.opengl.GLES20.glGetShaderiv(r12, r1, r10, r3)
            r10 = r10[r3]
            if (r10 == 0) goto L_0x01c8
            r14 = 0
            r10 = 35632(0x8b30, float:4.9931E-41)
            int r11 = android.opengl.GLES20.glCreateShader(r10)
            if (r11 == 0) goto L_0x01c8
            android.opengl.GLES20.glShaderSource(r11, r0)
            android.opengl.GLES20.glCompileShader(r11)
            int[] r0 = new int[r6]
            android.opengl.GLES20.glGetShaderiv(r11, r1, r0, r3)
            r0 = r0[r3]
            if (r0 != 0) goto L_0x033a
            android.opengl.GLES20.glDeleteShader(r11)
        L_0x01c8:
            android.opengl.GLES20.glDeleteShader(r12)
        L_0x01cb:
            r10 = 0
        L_0x01cc:
            r5.A02 = r10
            java.lang.String r0 = "position"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r10, r0)
            r5.A01 = r0
            int r1 = r5.A02
            java.lang.String r0 = "st_matrix"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r1, r0)
            r5.A00 = r0
            int r1 = r5.A02
            java.lang.String r0 = "tex_v"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r1, r0)
            r5.A04 = r0
            int r1 = r5.A02
            java.lang.String r0 = "texcoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r1, r0)
            r5.A03 = r0
            int[] r0 = new int[r13]
            r5.A07 = r0
            android.opengl.GLES20.glGenBuffers(r13, r0, r3)
            int[] r0 = r5.A07
            java.lang.String r16 = "vertexBuffers"
            r23 = r16
            if (r0 == 0) goto L_0x0379
            r0 = r0[r3]
            r11 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r11, r0)
            r10 = 48
            java.nio.FloatBuffer r1 = r5.A0A
            r0 = 35044(0x88e4, float:4.9107E-41)
            android.opengl.GLES20.glBufferData(r11, r10, r1, r0)
            int[] r1 = r5.A07
            if (r1 == 0) goto L_0x0379
            r1 = r1[r6]
            android.opengl.GLES20.glBindBuffer(r11, r1)
            r14 = 32
            java.nio.FloatBuffer r10 = r5.A09
            android.opengl.GLES20.glBufferData(r11, r14, r10, r0)
            android.opengl.GLES20.glBindBuffer(r11, r3)
            int[] r0 = new int[r6]
            r5.A06 = r0
            android.opengl.GLES20.glGenTextures(r6, r0, r3)
            int[] r0 = r5.A06
            java.lang.String r16 = "textures"
            if (r0 == 0) goto L_0x0379
            r0 = r0[r3]
            r12 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r12, r0)
            r0 = 10241(0x2801, float:1.435E-41)
            r1 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r12, r0, r1)
            r0 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameterf(r12, r0, r1)
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r0, r3)
            int[] r0 = r5.A06
            if (r0 == 0) goto L_0x0379
            r0 = r0[r3]
            android.graphics.SurfaceTexture r12 = new android.graphics.SurfaceTexture
            r12.<init>(r0)
            r5.A05 = r12
            r1 = r18
            r0 = r17
            r12.setDefaultBufferSize(r1, r0)
            android.graphics.SurfaceTexture r1 = r5.A05
            if (r1 == 0) goto L_0x03a7
            r12 = 4
            X.W5s r0 = new X.W5s
            r0.<init>((java.lang.Object) r5, (int) r12)
            r1.setOnFrameAvailableListener(r0)
            android.graphics.RectF r0 = r7.A00
            float r7 = r0.left
            float r1 = r0.top
            r18 = 1065353216(0x3f800000, float:1.0)
            float r17 = r18 - r1
            float r1 = r0.right
            float r0 = r0.bottom
            float r16 = r18 - r0
            r0 = 8
            float[] r0 = new float[r0]
            r0[r3] = r1
            r0[r6] = r16
            r0[r13] = r7
            r13 = 3
            r0[r13] = r16
            r0[r12] = r1
            r1 = 5
            r0[r1] = r17
            r1 = 6
            r0[r1] = r7
            r1 = 7
            r0[r1] = r17
            r10.position(r3)
            r10.put(r0)
            r10.position(r3)
            int[] r0 = r5.A07
            if (r0 != 0) goto L_0x02b3
            X.0qQ.A0F(r23)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02b3:
            r0 = r0[r6]
            android.opengl.GLES20.glBindBuffer(r11, r0)
            android.opengl.GLES20.glBufferSubData(r11, r3, r14, r10)
            android.opengl.GLES20.glBindBuffer(r11, r3)
            r0 = r24
            float r0 = r0.left
            float r0 = r0 * r9
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r7 = (float) r0
            int r10 = (int) r7
            r0 = r24
            float r0 = r0.bottom
            float r18 = r18 - r0
            float r0 = r8 * r18
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r7 = (float) r0
            int r7 = (int) r7
            float r0 = r24.width()
            float r9 = r9 * r0
            double r0 = (double) r9
            double r0 = java.lang.Math.ceil(r0)
            float r9 = (float) r0
            int r9 = (int) r9
            float r0 = r24.height()
            float r8 = r8 * r0
            double r0 = (double) r8
            double r0 = java.lang.Math.ceil(r0)
            float r8 = (float) r0
            int r1 = (int) r8
            android.graphics.Rect r0 = r5.A08
            r0.left = r10
            r0.top = r7
            r0.right = r9
            r0.bottom = r1
            X.Q0n r8 = new X.Q0n     // Catch:{  }
            r8.<init>()     // Catch:{  }
            android.graphics.SurfaceTexture r0 = r5.A05     // Catch:{  }
            android.view.Surface r7 = new android.view.Surface     // Catch:{  }
            r7.<init>(r0)     // Catch:{  }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{  }
            r0 = r31
            X.Q0p r0 = r8.A00(r15, r7, r0, r1)     // Catch:{  }
            android.media.MediaCodec r7 = r0.A03     // Catch:{  }
            X.Ryh r1 = new X.Ryh
            r23 = r1
            r24 = r7
            r25 = r15
            r27 = r5
            r28 = r19
            r23.<init>(r24, r25, r26, r27, r28, r29)
            X.Q6e r0 = new X.Q6e
            r8 = r0
            r9 = r20
            r10 = r26
            r11 = r4
            r12 = r1
            r13 = r19
            r8.<init>(r9, r10, r11, r12, r13)
            r7.setCallback(r0)
            java.util.List r0 = r4.A0E
            r0.add(r1)
            goto L_0x010e
        L_0x033a:
            int r10 = android.opengl.GLES20.glCreateProgram()
            if (r10 == 0) goto L_0x01cc
            android.opengl.GLES20.glAttachShader(r10, r12)
            java.lang.String r1 = "glAttachShader"
            int r0 = android.opengl.GLES20.glGetError()
            if (r0 != 0) goto L_0x03b7
            android.opengl.GLES20.glAttachShader(r10, r11)
            int r0 = android.opengl.GLES20.glGetError()
            if (r0 != 0) goto L_0x03ac
            android.opengl.GLES20.glLinkProgram(r10)
            int[] r1 = new int[r6]
            r0 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r10, r0, r1, r3)
            r0 = r1[r3]
            if (r0 == r6) goto L_0x036f
            android.opengl.GLES20.glDeleteProgram(r10)
        L_0x0366:
            android.opengl.GLES20.glDeleteShader(r12)
            android.opengl.GLES20.glDeleteShader(r11)
            r10 = r14
            goto L_0x01cc
        L_0x036f:
            r14 = r10
            goto L_0x0366
        L_0x0371:
            r0 = 30
            goto L_0x0170
        L_0x0375:
            int r5 = r5 + 1
            goto L_0x012d
        L_0x0379:
            X.0qQ.A0F(r16)
            goto L_0x00f2
        L_0x037e:
            r0 = move-exception
            X.Pxj.A1P(r0)
            goto L_0x0388
        L_0x0383:
            r3 = 1
            goto L_0x0388
        L_0x0385:
            r20.release()
        L_0x0388:
            r0 = r32
            X.S3Z r4 = r0.A00
            if (r3 == 0) goto L_0x0397
            if (r4 == 0) goto L_0x00de
            r0 = r33
            X.0sP r5 = r0.A01
            r3 = 0
            r6 = 0
            goto L_0x03c2
        L_0x0397:
            if (r4 == 0) goto L_0x00de
            r1 = 0
            r4.A00()
            r0.A01 = r1
            r0 = r33
            X.0sP r0 = r0.A01
            X.C51968G9o.A1O(r0, r1)
            return
        L_0x03a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03ac:
            java.lang.String r2 = ": glError "
            java.lang.String r0 = X.002.A0b(r1, r2, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x03b7:
            java.lang.String r2 = ": glError "
            java.lang.String r0 = X.002.A0b(r1, r2, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x03c2:
            android.media.MediaCodec r1 = r4.A01     // Catch:{ CodecException -> 0x0403 }
            if (r1 != 0) goto L_0x03d1
            java.lang.String r0 = "videoEncoder"
            X.0qQ.A0F(r0)     // Catch:{ CodecException -> 0x0403 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ CodecException -> 0x0403 }
            throw r0     // Catch:{ CodecException -> 0x0403 }
        L_0x03d1:
            r0 = 268298575(0xffde94f, float:2.5037593E-29)
            X.0fX.A05(r1, r0)     // Catch:{ CodecException -> 0x0403 }
            java.util.List r0 = r4.A0E
            java.util.Iterator r2 = r0.iterator()
        L_0x03dd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03f2
            java.lang.Object r0 = r2.next()
            X.Ryh r0 = (X.C10821Ryh) r0
            android.media.MediaCodec r1 = r0.A04     // Catch:{  }
            r0 = -1187026130(0xffffffffb93f6b2e, float:-1.8255107E-4)
            X.0fX.A05(r1, r0)     // Catch:{  }
            goto L_0x03dd
        L_0x03f2:
            X.4Cq r3 = r4.A0G
            r0 = 38
            X.MHB r2 = new X.MHB
            r2.<init>(r4, r5, r6, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A01(r0, r1, r2, r3)
            return
        L_0x0403:
            r0 = move-exception
            X.Pxj.A1P(r0)
            r4.A00()
            X.C51968G9o.A1O(r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.THX.run():void");
    }
}
