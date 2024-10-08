package X;

import android.opengl.GLES10;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;

/* renamed from: X.8qj  reason: invalid class name and case insensitive filesystem */
public final class C367428qj implements C365358my {
    public C346337v0 A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ 0r1 A04;
    public final /* synthetic */ 0rh A05;
    public final /* synthetic */ 0rh A06;
    public final /* synthetic */ 0rm A07;
    public final /* synthetic */ 0rm A08;
    public final /* synthetic */ 0rm A09;
    public final /* synthetic */ 0rm A0A;
    public final /* synthetic */ 0rm A0B;

    public static void A00(GainmapFilter gainmapFilter, C367428qj r5) {
        float[] fArr = (float[]) r5.A0B.A00;
        0qQ.A0B(fArr, 0);
        gainmapFilter.A04 = (float) Math.log((double) fArr[0]);
        float[] fArr2 = (float[]) r5.A0A.A00;
        0qQ.A0B(fArr2, 0);
        gainmapFilter.A03 = (float) Math.log((double) fArr2[0]);
        float[] fArr3 = (float[]) r5.A09.A00;
        0qQ.A0B(fArr3, 0);
        gainmapFilter.A02 = fArr3[0];
        float[] fArr4 = (float[]) r5.A08.A00;
        0qQ.A0B(fArr4, 0);
        gainmapFilter.A01 = fArr4[0];
        float[] fArr5 = (float[]) r5.A07.A00;
        0qQ.A0B(fArr5, 0);
        gainmapFilter.A00 = fArr5[0];
        gainmapFilter.A06 = r5.A06.A00;
    }

    public final C367428qj B8o() {
        return null;
    }

    public final void cleanup() {
        GLES10.glDeleteTextures(1, new int[]{this.A02}, 0);
    }

    public C367428qj(0r1 r1, 0rh r2, 0rh r3, 0rm r4, 0rm r5, 0rm r6, 0rm r7, 0rm r8, int i, int i2, int i3) {
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A04 = r1;
        this.A05 = r2;
        this.A07 = r4;
        this.A08 = r5;
        this.A09 = r6;
        this.A06 = r3;
        this.A0A = r7;
        this.A0B = r8;
    }

    public final int getHeight() {
        return this.A01;
    }

    public final C346337v0 getTexture() {
        C346337v0 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C346327uz r1 = new C346327uz("GainmapInputSurface");
        r1.A01 = this.A02;
        r1.A03 = 3553;
        r1.A00 = 6408;
        r1.A04 = this.A03;
        r1.A02 = this.A01;
        C346337v0 r02 = new C346337v0(r1);
        this.A00 = r02;
        return r02;
    }

    public final int getTextureId() {
        return this.A02;
    }

    public final int getWidth() {
        return this.A03;
    }
}
