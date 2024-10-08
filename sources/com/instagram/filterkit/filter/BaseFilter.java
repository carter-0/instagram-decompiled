package com.instagram.filterkit.filter;

import X.0qQ;
import X.C51968G9o;
import android.os.Parcel;
import com.instagram.filterkit.filter.intf.IgFilter;
import com.instagram.filterkit.filter.resize.LanczosFilter;

public abstract class BaseFilter implements IgFilter {
    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a1, code lost:
        if (r13 != null) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02c5, code lost:
        if (r2 != 3) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02d4, code lost:
        if (r14 != null) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05c4, code lost:
        if (r1 != false) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x065c, code lost:
        if (r2 != false) goto L_0x065e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c0, code lost:
        if (r2 != 4) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e2, code lost:
        if (r2 != 4) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0694  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EEs(X.X98 r27, X.C365358my r28, X.XBw r29) {
        /*
            r26 = this;
            r1 = r26
            r5 = r28
            r4 = r29
            boolean r0 = r1 instanceof com.instagram.filterkit.filter.VideoFilter
            r6 = r27
            if (r0 == 0) goto L_0x0344
            r9 = r1
            com.instagram.filterkit.filter.VideoFilter r9 = (com.instagram.filterkit.filter.VideoFilter) r9
            java.lang.String r7 = r9.A0R
            r11 = 5
            int r0 = r5.getWidth()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r0 = r5.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r4.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r4.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r3, r2, r1, r0}
            java.lang.String r0 = "Render %s input=%dx%d output=%dx%d"
            java.lang.String.format(r0, r1)
            int r0 = r9.A01()
            android.opengl.GLES20.glUseProgram(r0)
            r9.A03(r6, r5, r4)
            X.TtB r2 = r9.A0A
            X.TtB r1 = r9.A0D
            if (r1 == 0) goto L_0x005d
            if (r2 == 0) goto L_0x005d
            int r0 = r4.Blp()
            float r0 = (float) r0
            r1.A00(r0)
            int r0 = r4.Blj()
            float r0 = (float) r0
            r2.A00(r0)
        L_0x005d:
            X.Tt7 r8 = r9.A07
            r7 = 1
            if (r8 == 0) goto L_0x031f
            boolean r0 = r8 instanceof X.Um3
            if (r0 == 0) goto L_0x0318
            r0 = 5
        L_0x0067:
            r3 = 0
            r2 = 0
        L_0x0069:
            r10 = -1
            if (r2 >= r0) goto L_0x0692
            if (r8 == 0) goto L_0x00e4
            X.Tsj r13 = r9.A08
            boolean r1 = r8 instanceof X.Um3
            if (r1 == 0) goto L_0x02db
            r14 = r8
            X.Um3 r14 = (X.Um3) r14
            X.UmC r12 = r14.A0C
            r12.getClass()
            java.nio.IntBuffer r1 = r12.A00
            r1.put(r3, r2)
            r12.A00 = r7
            r1 = 4
            if (r2 != r1) goto L_0x009e
            X.Tt4 r1 = r14.A0H
            r1.getClass()
            int r12 = r1.A02
            java.lang.String r1 = "sSmallBuffA"
            r13.A02(r1, r12)
            X.Tso r12 = r14.A0F
            r12.getClass()
            java.nio.IntBuffer r1 = r12.A00
            r1.put(r3, r7)
            r12.A00 = r7
        L_0x009e:
            boolean r13 = r8 instanceof X.Um3
            if (r13 == 0) goto L_0x02b3
            r12 = r8
            X.Um3 r12 = (X.Um3) r12
            X.XBw r1 = r12.A0K
            if (r1 == 0) goto L_0x032a
            X.Tt4 r1 = r12.A0G
            if (r1 == 0) goto L_0x032a
            X.Tt4 r15 = r12.A0H
            if (r15 == 0) goto L_0x032a
            X.Tt4 r14 = r12.A0I
            if (r14 == 0) goto L_0x032a
            if (r2 == 0) goto L_0x02d2
            if (r2 == r7) goto L_0x02b1
            r1 = 2
            if (r2 == r1) goto L_0x02d7
            r1 = 3
            if (r2 == r1) goto L_0x02d8
            r1 = 4
            if (r2 == r1) goto L_0x02d2
        L_0x00c2:
            if (r13 == 0) goto L_0x028b
            r12 = r8
            X.Um3 r12 = (X.Um3) r12
            X.XBw r13 = r12.A0K
            if (r13 == 0) goto L_0x0322
            X.Tt4 r1 = r12.A0G
            if (r1 == 0) goto L_0x0322
            X.Tt4 r14 = r12.A0H
            if (r14 == 0) goto L_0x0322
            X.Tt4 r12 = r12.A0I
            if (r12 == 0) goto L_0x0322
            if (r2 == 0) goto L_0x0289
            if (r2 == r7) goto L_0x0287
            r1 = 2
            if (r2 == r1) goto L_0x02ad
            r1 = 3
            if (r2 == r1) goto L_0x0287
            r1 = 4
            if (r2 == r1) goto L_0x02ae
        L_0x00e4:
            r1 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r1)
            boolean r1 = r9.A0G
            r12 = 3553(0xde1, float:4.979E-42)
            if (r1 == 0) goto L_0x00f3
            r12 = 36197(0x8d65, float:5.0723E-41)
        L_0x00f3:
            int r1 = r5.getTextureId()
            android.opengl.GLES20.glBindTexture(r12, r1)
            int r1 = r0 + -1
            boolean r16 = X.JTQ.A1P(r2, r1)
            if (r8 == 0) goto L_0x0270
            boolean r1 = r8 instanceof X.Um3
            if (r1 == 0) goto L_0x026d
            r13 = r8
            X.Um3 r13 = (X.Um3) r13
            r12 = 2
            if (r2 == 0) goto L_0x0260
            if (r2 == r7) goto L_0x0260
            if (r2 == r12) goto L_0x0260
            r1 = 3
            if (r2 == r1) goto L_0x0260
        L_0x0113:
            float[] r15 = new float[r12]
            r12 = 0
            r15[r3] = r12
        L_0x0118:
            r15[r7] = r12
            int r13 = r4.getWidth()
            r14 = r15[r3]
            r15 = r15[r7]
            r1 = 0
            int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0129
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x0129:
            X.TtB r12 = r9.A0C
            if (r12 == 0) goto L_0x0137
            float r1 = (float) r13
            float r1 = r1 * r14
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r12.A00(r1)
        L_0x0137:
            X.TtB r12 = r9.A0B
            if (r12 == 0) goto L_0x0145
            float r1 = (float) r13
            float r1 = r1 * r15
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r12.A00(r1)
        L_0x0145:
            if (r16 == 0) goto L_0x0182
            if (r8 == 0) goto L_0x0182
            int r1 = r4.getWidth()
            float r12 = (float) r1
            r1 = 0
            int r13 = X.AnonymousClass7TE.A05(r1, r12)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r12 = X.AnonymousClass7TE.A05(r12, r1)
            android.graphics.Rect r15 = r9.A0P
            int r1 = r4.getHeight()
            r15.set(r13, r3, r12, r1)
            int[] r1 = r8.A01
            r13 = 3089(0xc11, float:4.329E-42)
            android.opengl.GLES20.glGetIntegerv(r13, r1, r3)
            int[] r12 = r8.A02
            r1 = 3088(0xc10, float:4.327E-42)
            android.opengl.GLES20.glGetIntegerv(r1, r12, r3)
            android.opengl.GLES20.glEnable(r13)
            int r14 = r15.left
            int r13 = r15.top
            int r12 = r15.right
            int r12 = r12 - r14
            int r1 = r15.bottom
            int r1 = r1 - r13
            android.opengl.GLES20.glScissor(r14, r13, r12, r1)
            r8.A00 = r7
        L_0x0182:
            X.TtB r13 = r9.A09
            if (r13 == 0) goto L_0x018f
            int r1 = r9.A03
            float r12 = (float) r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 / r1
            r13.A00(r12)
        L_0x018f:
            if (r16 == 0) goto L_0x025c
            X.Tst r1 = r9.A0E
        L_0x0193:
            java.nio.FloatBuffer r1 = r1.A01
            int r12 = r9.A00
            android.opengl.GLES20.glEnableVertexAttribArray(r12)
            int r12 = r9.A00
            r13 = 2
            r14 = 5126(0x1406, float:7.183E-42)
            r16 = 8
            r17 = r1
            r15 = r3
            android.opengl.GLES20.glVertexAttribPointer(r12, r13, r14, r15, r16, r17)
            boolean r12 = r9.A0F
            X.Tst r1 = r9.A0E
            if (r12 == 0) goto L_0x0258
            java.nio.FloatBuffer r1 = r1.A00
        L_0x01af:
            int r12 = r9.A04
            android.opengl.GLES20.glEnableVertexAttribArray(r12)
            int r12 = r9.A04
            r17 = r1
            android.opengl.GLES20.glVertexAttribPointer(r12, r13, r14, r15, r16, r17)
            int r12 = r9.A02
            if (r12 == r10) goto L_0x01c7
            android.opengl.GLES20.glEnableVertexAttribArray(r12)
            int r12 = r9.A02
            android.opengl.GLES20.glVertexAttribPointer(r12, r13, r14, r15, r16, r17)
        L_0x01c7:
            r10 = 36160(0x8d40, float:5.0671E-41)
            int r1 = r4.B86()
            android.opengl.GLES20.glBindFramebuffer(r10, r1)
            java.lang.String r1 = "VideoFilter.render:glBindFramebuffer"
            X.AnonymousClass9S9.A05(r1)
            r12 = 0
        L_0x01d7:
            java.util.List r10 = r9.A0S
            int r1 = r10.size()
            if (r12 >= r1) goto L_0x020e
            X.8my[] r14 = r9.A0T
            r1 = r14[r12]
            if (r1 == 0) goto L_0x01fe
            X.Tsj r13 = r9.A08
            java.lang.Object r1 = r10.get(r12)
            com.instagram.model.filterkit.TextureAsset r1 = (com.instagram.model.filterkit.TextureAsset) r1
            java.lang.String r10 = r1.A00
            r10.getClass()
            r1 = r14[r12]
            int r1 = r1.getTextureId()
            r13.A02(r10, r1)
        L_0x01fb:
            int r12 = r12 + 1
            goto L_0x01d7
        L_0x01fe:
            java.lang.Object[] r10 = X.AnonymousClass7TF.A1b(r12)
            java.lang.String r1 = "render() is getting a null mFilterTextures[i] at i = %d"
            java.lang.String r10 = X.0mp.A06(r1, r10)
            java.lang.String r1 = "VideoFilter"
            X.0wb.A03(r1, r10)
            goto L_0x01fb
        L_0x020e:
            X.TtB r12 = r9.A0A
            X.TtB r10 = r9.A0D
            if (r10 == 0) goto L_0x0226
            if (r12 == 0) goto L_0x0226
            int r1 = r4.Blp()
            float r1 = (float) r1
            r10.A00(r1)
            int r1 = r4.Blj()
            float r1 = (float) r1
            r12.A00(r1)
        L_0x0226:
            X.VY1 r1 = r9.A0Q
            r4.CFQ(r1)
            int r13 = r1.A02
            int r12 = r1.A03
            int r10 = r1.A01
            int r1 = r1.A00
            android.opengl.GLES20.glViewport(r13, r12, r10, r1)
            X.Tsj r12 = r9.A08
            int r10 = r5.getTextureId()
            java.lang.String r1 = "image"
            r12.A02(r1, r10)
            X.Tsj r1 = r9.A08
            r1.A00()
            r1 = 4
            android.opengl.GLES20.glDrawArrays(r11, r3, r1)
            if (r0 == r7) goto L_0x024e
            if (r2 <= 0) goto L_0x0254
        L_0x024e:
            if (r27 == 0) goto L_0x0254
            r1 = 0
            r6.EB2(r1, r5)
        L_0x0254:
            int r2 = r2 + 1
            goto L_0x0069
        L_0x0258:
            java.nio.FloatBuffer r1 = r1.A02
            goto L_0x01af
        L_0x025c:
            X.Tst r1 = com.instagram.filterkit.filter.VideoFilter.A0W
            goto L_0x0193
        L_0x0260:
            float[] r15 = new float[r12]
            r12 = 0
            r15[r3] = r12
            X.XBw r1 = r13.A0K
            if (r1 == 0) goto L_0x0118
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0118
        L_0x026d:
            r12 = 2
            goto L_0x0113
        L_0x0270:
            int r13 = r4.getWidth()
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            X.TtB r12 = r9.A0C
            if (r12 == 0) goto L_0x0137
            float r1 = (float) r13
            float r1 = r1 * r14
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r12.A00(r1)
            goto L_0x0137
        L_0x0287:
            r13 = r14
            goto L_0x02ae
        L_0x0289:
            r13 = r1
            goto L_0x02ae
        L_0x028b:
            boolean r1 = r8 instanceof X.Um4
            if (r1 == 0) goto L_0x00e4
            r12 = r8
            X.Um4 r12 = (X.Um4) r12
            X.Um4.A01(r12)
            if (r2 == 0) goto L_0x02aa
            if (r2 == r7) goto L_0x02a7
            r1 = 2
            if (r2 == r1) goto L_0x02a4
            r1 = 3
            if (r2 != r1) goto L_0x00e4
            X.XBw r13 = r12.A0F
        L_0x02a1:
            if (r13 == 0) goto L_0x00e4
            goto L_0x02ae
        L_0x02a4:
            X.Tt4 r13 = r12.A0C
            goto L_0x02a1
        L_0x02a7:
            X.Tt4 r13 = r12.A0B
            goto L_0x02a1
        L_0x02aa:
            X.Tt4 r13 = r12.A0A
            goto L_0x02a1
        L_0x02ad:
            r13 = r12
        L_0x02ae:
            r4 = r13
            goto L_0x00e4
        L_0x02b1:
            r14 = r1
            goto L_0x02d8
        L_0x02b3:
            boolean r1 = r8 instanceof X.Um4
            if (r1 == 0) goto L_0x00c2
            r12 = r8
            X.Um4 r12 = (X.Um4) r12
            X.Um4.A01(r12)
            if (r2 == 0) goto L_0x02cf
            if (r2 == r7) goto L_0x02cc
            r1 = 2
            if (r2 == r1) goto L_0x02c9
            r1 = 3
            if (r2 == r1) goto L_0x02cf
            goto L_0x00c2
        L_0x02c9:
            X.Tt4 r14 = r12.A0B
            goto L_0x02d4
        L_0x02cc:
            X.Tt4 r14 = r12.A0A
            goto L_0x02d4
        L_0x02cf:
            X.8my r14 = r12.A0E
            goto L_0x02d4
        L_0x02d2:
            X.8my r14 = r12.A0J
        L_0x02d4:
            if (r14 == 0) goto L_0x00c2
            goto L_0x02d8
        L_0x02d7:
            r14 = r15
        L_0x02d8:
            r5 = r14
            goto L_0x00c2
        L_0x02db:
            boolean r1 = r8 instanceof X.Um4
            if (r1 == 0) goto L_0x009e
            r15 = r8
            X.Um4 r15 = (X.Um4) r15
            X.0qQ.A0B(r13, r7)
            X.UmC r12 = r15.A07
            if (r12 == 0) goto L_0x02f0
            java.nio.IntBuffer r1 = r12.A00
            r1.put(r3, r2)
            r12.A00 = r7
        L_0x02f0:
            r1 = 3
            if (r2 != r1) goto L_0x009e
            X.Tt4 r1 = r15.A0C
            java.lang.String r12 = "Required value was null."
            if (r1 == 0) goto L_0x033e
            int r14 = r1.A02
            java.lang.String r1 = "blurred"
            r13.A02(r1, r14)
            X.Tso r14 = r15.A08
            if (r14 == 0) goto L_0x0338
            java.nio.IntBuffer r1 = r14.A00
            r1.put(r3, r7)
            r14.A00 = r7
            X.Tt4 r1 = r15.A0A
            if (r1 == 0) goto L_0x0332
            int r12 = r1.A02
            java.lang.String r1 = "lutSurface"
            r13.A02(r1, r12)
            goto L_0x009e
        L_0x0318:
            boolean r0 = r8 instanceof X.Um4
            if (r0 == 0) goto L_0x031f
            r0 = 4
            goto L_0x0067
        L_0x031f:
            r0 = 1
            goto L_0x0067
        L_0x0322:
            java.lang.String r1 = "Surfaces have not been initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x032a:
            java.lang.String r1 = "Surfaces have not been initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0332:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x0338:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x033e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x0344:
            boolean r0 = r1 instanceof com.instagram.filterkit.filter.BaseSimpleFilter
            if (r0 == 0) goto L_0x0468
            r3 = r1
            com.instagram.filterkit.filter.BaseSimpleFilter r3 = (com.instagram.filterkit.filter.BaseSimpleFilter) r3
            r10 = 0
            boolean r8 = X.C51973G9u.A1b(r6, r5, r4)
            boolean r0 = r6.Bnj(r3)
            java.lang.String r2 = "Required value was null."
            X.Tsj r7 = r3.A01
            if (r0 != 0) goto L_0x0433
            if (r7 != 0) goto L_0x0455
            boolean r0 = r3 instanceof com.instagram.filterkit.filter.IdentityFilter
            if (r0 == 0) goto L_0x041f
            r9 = r3
            com.instagram.filterkit.filter.IdentityFilter r9 = (com.instagram.filterkit.filter.IdentityFilter) r9
            java.lang.String r1 = "Identity"
            r0 = 1
            int r0 = com.instagram.util.video.GlProgramCompiler.compileProgram(r1, r10, r0, r10)
            if (r0 == 0) goto L_0x0441
            X.Tsj r7 = new X.Tsj
            r7.<init>(r0)
            java.lang.String r0 = "u_enableVertexTransform"
            java.util.Map r1 = r7.A03
            java.lang.Object r0 = r1.get(r0)
            X.UmH r0 = (X.UmH) r0
            X.Tsu r0 = (X.C14271Tsu) r0
            r9.A00 = r0
            java.lang.String r0 = "u_vertexTransform"
            java.lang.Object r0 = r1.get(r0)
            X.UmH r0 = (X.UmH) r0
            X.Um6 r0 = (X.Um6) r0
            r9.A01 = r0
        L_0x038b:
            r3.A01 = r7
            X.VhA r0 = new X.VhA
            r0.<init>(r7)
            r3.A00 = r0
            r6.Clu(r3)
        L_0x0397:
            boolean r10 = r3 instanceof com.instagram.filterkit.filter.IdentityFilter
            if (r10 == 0) goto L_0x0415
            r9 = r3
            com.instagram.filterkit.filter.IdentityFilter r9 = (com.instagram.filterkit.filter.IdentityFilter) r9
            int r0 = r5.getTextureId()
            java.lang.String r8 = "image"
            r7.A02(r8, r0)
            X.Tsu r1 = r9.A00
            if (r1 == 0) goto L_0x03b0
            boolean r0 = r9.A03
            r1.A00(r0)
        L_0x03b0:
            X.Um6 r1 = r9.A01
            if (r1 == 0) goto L_0x03c1
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x03c1
            com.facebook.common.math.matrix.Matrix4 r0 = r9.A04
            java.nio.FloatBuffer r0 = r0.A00
            r1.A00 = r0
            r0 = 1
            r1.A00 = r0
        L_0x03c1:
            java.lang.String r0 = "BaseSimpleFilter.render:setFilterParams"
            X.AnonymousClass9S9.A05(r0)
            X.Tst r9 = com.instagram.filterkit.filter.BaseSimpleFilter.A03
            java.nio.FloatBuffer r1 = r9.A01
            java.lang.String r0 = "position"
            r7.A03(r0, r1)
            if (r10 == 0) goto L_0x0412
            r0 = r3
            com.instagram.filterkit.filter.IdentityFilter r0 = (com.instagram.filterkit.filter.IdentityFilter) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0412
            java.nio.FloatBuffer r1 = r9.A00
        L_0x03da:
            java.lang.String r0 = "transformedTextureCoordinate"
            r7.A03(r0, r1)
            java.nio.FloatBuffer r1 = r9.A02
            java.lang.String r0 = "staticTextureCoordinate"
            r7.A03(r0, r1)
            java.lang.String r0 = "BaseSimpleFilter.render:setCoordinates"
            X.AnonymousClass9S9.A05(r0)
            r1 = 36160(0x8d40, float:5.0671E-41)
            int r0 = r4.B86()
            android.opengl.GLES20.glBindFramebuffer(r1, r0)
            java.lang.String r0 = "BaseSimpleFilter.render:glBindFramebuffer"
            X.AnonymousClass9S9.A05(r0)
            X.VY1 r1 = r3.A02
            r4.CFQ(r1)
            int r0 = r5.getTextureId()
            r7.A02(r8, r0)
            X.VhA r0 = r3.A00
            if (r0 == 0) goto L_0x043b
            r0.A00(r1)
            r0 = 0
            r6.EB2(r0, r5)
            return
        L_0x0412:
            java.nio.FloatBuffer r1 = r9.A02
            goto L_0x03da
        L_0x0415:
            int r0 = r5.getTextureId()
            java.lang.String r8 = "image"
            r7.A02(r8, r0)
            goto L_0x03c1
        L_0x041f:
            java.lang.String r9 = "Identity"
            r12 = 1
            r11 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            int r0 = com.instagram.util.creation.ShaderBridge.compileProgram(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0441
            X.Tsj r7 = new X.Tsj
            r7.<init>(r0)
            goto L_0x038b
        L_0x0433:
            if (r7 != 0) goto L_0x0397
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x043b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0441:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Could not create program for "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            X.0qQ.A0B(r1, r8)
            X.V1t r0 = new X.V1t
            r0.<init>(r1)
            throw r0
        L_0x0455:
            java.lang.String r1 = "Filter program already initialized with different glResources "
            java.lang.String r0 = X.C51968G9o.A16(r3)
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.0qQ.A0B(r1, r8)
            X.V1t r0 = new X.V1t
            r0.<init>(r1)
            throw r0
        L_0x0468:
            r11 = r1
            com.instagram.filterkit.filter.resize.LanczosFilter r11 = (com.instagram.filterkit.filter.resize.LanczosFilter) r11
            android.opengl.GLES20.glFlush()
            boolean r0 = r6.Bnj(r11)
            if (r0 != 0) goto L_0x050f
            boolean r3 = r11.A0D
            if (r3 == 0) goto L_0x068c
            java.lang.String r1 = "LanczosLinearSpaceX"
            java.lang.String r0 = "LanczosLinearSpaceXFixed"
        L_0x047c:
            int r2 = com.instagram.filterkit.filter.resize.LanczosFilter.A00(r1, r0)
            if (r3 == 0) goto L_0x0686
            java.lang.String r1 = "LanczosLinearSpaceY"
            java.lang.String r0 = "LanczosLinearSpaceYFixed"
        L_0x0486:
            int r1 = com.instagram.filterkit.filter.resize.LanczosFilter.A00(r1, r0)
            X.Tsj r0 = new X.Tsj
            r0.<init>(r2)
            r11.A02 = r0
            X.Tsj r0 = new X.Tsj
            r0.<init>(r1)
            r11.A03 = r0
            X.Tsj r0 = r11.A02
            java.lang.String r1 = "srcWidth"
            java.util.Map r0 = r0.A03
            java.lang.Object r0 = r0.get(r1)
            X.UmH r0 = (X.UmH) r0
            X.UmC r0 = (X.UmC) r0
            r11.A0B = r0
            X.Tsj r0 = r11.A03
            java.lang.String r1 = "srcHeight"
            java.util.Map r0 = r0.A03
            java.lang.Object r0 = r0.get(r1)
            X.UmH r0 = (X.UmH) r0
            X.UmC r0 = (X.UmC) r0
            r11.A0A = r0
            X.Tsj r0 = r11.A02
            java.lang.String r3 = "scale"
            java.util.Map r0 = r0.A03
            X.TtB r0 = X.C13988Tno.A0M(r3, r0)
            r11.A08 = r0
            X.Tsj r0 = r11.A02
            java.lang.String r2 = "lanczosFactor"
            java.util.Map r0 = r0.A03
            X.TtB r0 = X.C13988Tno.A0M(r2, r0)
            r11.A04 = r0
            X.Tsj r0 = r11.A02
            java.lang.String r1 = "srcLanczosFactor"
            java.util.Map r0 = r0.A03
            X.TtB r0 = X.C13988Tno.A0M(r1, r0)
            r11.A06 = r0
            X.Tsj r0 = r11.A03
            java.util.Map r0 = r0.A03
            X.TtB r0 = X.C13988Tno.A0M(r3, r0)
            r11.A09 = r0
            X.Tsj r0 = r11.A03
            java.util.Map r0 = r0.A03
            X.TtB r0 = X.C13988Tno.A0M(r2, r0)
            r11.A05 = r0
            X.Tsj r0 = r11.A03
            java.util.Map r0 = r0.A03
            X.TtB r0 = X.C13988Tno.A0M(r1, r0)
            r11.A07 = r0
            X.Tsj r1 = r11.A02
            X.VhA r0 = new X.VhA
            r0.<init>(r1)
            r11.A00 = r0
            X.Tsj r1 = r11.A03
            X.VhA r0 = new X.VhA
            r0.<init>(r1)
            r11.A01 = r0
            r6.Clu(r11)
        L_0x050f:
            int r13 = r5.getHeight()
            int r7 = r5.getWidth()
            int r24 = r4.Blj()
            int r1 = r4.Blp()
            X.UmC r3 = r11.A0B
            r3.getClass()
            java.nio.IntBuffer r2 = r3.A00
            r23 = 0
            r0 = r23
            r2.put(r0, r7)
            r22 = 1
            r0 = r22
            r3.A00 = r0
            float r2 = (float) r7
            float r0 = (float) r1
            float r2 = r2 / r0
            X.TtB r0 = r11.A08
            r0.getClass()
            r0.A00(r2)
            X.TtB r0 = r11.A04
            r0.getClass()
            r12 = 1073741824(0x40000000, float:2.0)
            r0.A00(r12)
            X.TtB r0 = r11.A06
            r0.getClass()
            float r2 = r2 * r12
            r0.A00(r2)
            X.Tsj r7 = r11.A02
            r7.getClass()
            X.Tst r3 = com.instagram.filterkit.filter.resize.LanczosFilter.A0E
            java.nio.FloatBuffer r0 = r3.A01
            r25 = r0
            java.lang.String r21 = "position"
            r2 = r21
            r7.A03(r2, r0)
            X.Tsj r2 = r11.A02
            java.nio.FloatBuffer r10 = r3.A02
            java.lang.String r20 = "transformedTextureCoordinate"
            r0 = r20
            r2.A03(r0, r10)
            X.Tsj r2 = r11.A02
            java.lang.String r19 = "staticTextureCoordinate"
            r0 = r19
            r2.A03(r0, r10)
            X.Tsj r8 = r11.A02
            int r7 = r5.getTextureId()
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            java.lang.String r17 = "image"
            java.util.Map r3 = r8.A02
            X.Tsk r2 = new X.Tsk
            r0 = r18
            r2.<init>(r8, r0, r7)
            r0 = r17
            r3.put(r0, r2)
            X.Tt4 r9 = new X.Tt4
            r9.<init>(r1, r13)
            int r0 = r9.A00
            r8 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r8, r0)
            java.lang.String r16 = "glBindFramebuffer"
            boolean r14 = X.AnonymousClass9S9.A05(r16)
            java.lang.String r7 = ""
            if (r14 == 0) goto L_0x05b1
            java.lang.String r1 = "LanczosFilter"
            java.lang.String r0 = "_glBindFramebuffer_x"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0wb.A03(r0, r7)
        L_0x05b1:
            java.lang.String r3 = "LanczosFilter"
            X.VY1 r2 = r11.A0C
            r9.CFQ(r2)
            if (r14 != 0) goto L_0x05c6
            X.VhA r0 = r11.A00
            r0.getClass()
            boolean r1 = r0.A00(r2)
            r0 = 0
            if (r1 == 0) goto L_0x05c7
        L_0x05c6:
            r0 = 1
        L_0x05c7:
            java.lang.String r1 = "mMaxTileSize="
            if (r0 != 0) goto L_0x06f5
            X.UmC r14 = r11.A0A
            r14.getClass()
            java.nio.IntBuffer r0 = r14.A00
            r15 = r0
            r0 = r23
            r15.put(r0, r13)
            r0 = r22
            r14.A00 = r0
            float r13 = (float) r13
            r0 = r24
            float r0 = (float) r0
            float r13 = r13 / r0
            X.TtB r0 = r11.A09
            r0.getClass()
            r0.A00(r13)
            X.TtB r0 = r11.A05
            r0.getClass()
            r0.A00(r12)
            X.TtB r0 = r11.A07
            r0.getClass()
            float r13 = r13 * r12
            r0.A00(r13)
            X.Tsj r13 = r11.A03
            r13.getClass()
            r12 = r21
            r0 = r25
            r13.A03(r12, r0)
            X.Tsj r12 = r11.A03
            r0 = r20
            r12.A03(r0, r10)
            X.Tsj r12 = r11.A03
            r0 = r19
            r12.A03(r0, r10)
            X.Tsj r14 = r11.A03
            int r13 = r9.A02
            java.util.Map r12 = r14.A02
            X.Tsk r10 = new X.Tsk
            r0 = r18
            r10.<init>(r14, r0, r13)
            r0 = r17
            r12.put(r0, r10)
            r12 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r12, r13)
            r10 = 9728(0x2600, float:1.3632E-41)
            r0 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r12, r0, r10)
            r0 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r12, r0, r10)
            int r0 = r4.B86()
            android.opengl.GLES20.glBindFramebuffer(r8, r0)
            boolean r8 = X.AnonymousClass9S9.A05(r16)
            if (r8 == 0) goto L_0x064d
            java.lang.String r0 = "_glBindFramebuffer_y"
            java.lang.String r0 = X.002.A0R(r3, r0)
            X.0wb.A03(r0, r7)
        L_0x064d:
            r4.CFQ(r2)
            if (r8 != 0) goto L_0x065e
            X.VhA r0 = r11.A01
            r0.getClass()
            boolean r2 = r0.A00(r2)
            r0 = 0
            if (r2 == 0) goto L_0x065f
        L_0x065e:
            r0 = 1
        L_0x065f:
            r9.cleanup()
            r7 = 0
            r6.EB2(r7, r5)
            if (r0 == 0) goto L_0x06d9
            java.lang.String r0 = "_tileDraw_y"
            java.lang.String r2 = X.002.A0R(r3, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r0 = X.002.A0O(r1, r0)
            X.0wb.A03(r2, r0)
            r6.EB2(r7, r4)
            r6.AHI(r11)
            java.lang.String r1 = "Error scaling height"
            X.V1t r0 = new X.V1t
            r0.<init>(r1)
            throw r0
        L_0x0686:
            java.lang.String r1 = "LanczosY"
            java.lang.String r0 = "LanczosYFixed"
            goto L_0x0486
        L_0x068c:
            java.lang.String r1 = "LanczosX"
            java.lang.String r0 = "LanczosXFixed"
            goto L_0x047c
        L_0x0692:
            if (r8 == 0) goto L_0x06c8
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x06b4
            int[] r0 = r8.A01
            r1 = r0[r3]
            r0 = 3089(0xc11, float:4.329E-42)
            if (r1 == 0) goto L_0x06f1
            android.opengl.GLES20.glEnable(r0)
        L_0x06a3:
            int[] r5 = r8.A02
            r4 = r5[r3]
            r2 = r5[r7]
            r0 = 2
            r1 = r5[r0]
            r0 = 3
            r0 = r5[r0]
            android.opengl.GLES20.glScissor(r4, r2, r1, r0)
            r8.A00 = r3
        L_0x06b4:
            boolean r0 = r8 instanceof X.Um2
            if (r0 != 0) goto L_0x06c8
            boolean r0 = r8 instanceof X.Tt8
            if (r0 == 0) goto L_0x06da
            X.Tt8 r8 = (X.Tt8) r8
            r0 = 0
            r8.A00 = r0
            X.8my r0 = r8.A06
            if (r0 == 0) goto L_0x06c8
            r0.cleanup()
        L_0x06c8:
            int r0 = r9.A00
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            int r0 = r9.A04
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            int r0 = r9.A02
            if (r0 == r10) goto L_0x06d9
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
        L_0x06d9:
            return
        L_0x06da:
            boolean r0 = r8 instanceof X.Um1
            if (r0 != 0) goto L_0x06c8
            boolean r0 = r8 instanceof X.Um3
            if (r0 != 0) goto L_0x06c8
            X.Um4 r8 = (X.Um4) r8
            X.Tt4 r2 = r8.A0C
            X.X98 r1 = r8.A0D
            if (r1 == 0) goto L_0x06c8
            if (r2 == 0) goto L_0x06c8
            r0 = 0
            r1.EB2(r0, r2)
            goto L_0x06c8
        L_0x06f1:
            android.opengl.GLES20.glDisable(r0)
            goto L_0x06a3
        L_0x06f5:
            java.lang.String r0 = "_tileDraw_x"
            java.lang.String r2 = X.002.A0R(r3, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r0 = X.002.A0O(r1, r0)
            X.0wb.A03(r2, r0)
            int r0 = r5.getTextureId()
            r2 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r2, r0)
            r1 = 9729(0x2601, float:1.3633E-41)
            r0 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r2, r0, r1)
            r0 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r2, r0, r1)
            r9.cleanup()
            r6.AHI(r11)
            java.lang.String r1 = "Error scaling width"
            X.V1t r0 = new X.V1t
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.filterkit.filter.BaseFilter.EEs(X.X98, X.8my, X.XBw):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        if (this instanceof LanczosFilter) {
            z = ((LanczosFilter) this).A0D;
        } else if (this instanceof IdentityFilter) {
            IdentityFilter identityFilter = (IdentityFilter) this;
            parcel.writeParcelable(identityFilter.A04, i);
            parcel.writeInt(identityFilter.A03 ? 1 : 0);
            z = identityFilter.A02;
        } else {
            return;
        }
        parcel.writeInt(z ? 1 : 0);
    }

    public String toString() {
        String A16 = C51968G9o.A16(this);
        0qQ.A07(A16);
        return A16;
    }
}
