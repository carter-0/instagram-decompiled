package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;

/* renamed from: X.ATf  reason: case insensitive filesystem */
public final class C40139ATf implements C344747sM, C345097sv {
    public C344567s4 A00;
    public C345087su A01;
    public B2S A02;
    public A93 A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C344407ro A07;
    public final int A08;
    public volatile C345897uG A09;

    public final Object BNo() {
        return this;
    }

    public final void release() {
    }

    public final void A00(B2S b2s) {
        if (this.A09 == null) {
            b2s.DCn(AnonymousClass7TE.A0z("GlContext is null during takePhotoSync()"));
        } else if (this.A02 != null) {
            b2s.DCn(AnonymousClass7TE.A0z("Capture already in progress"));
        } else {
            this.A02 = b2s;
            if (this.A09 != null && this.A01 == null) {
                C345087su r3 = new C345087su(this.A07, new C345047sq(), new C345077st(), false);
                this.A01 = r3;
                r3.A03(this.A06, this.A04, this.A05);
                C345087su r1 = this.A01;
                r1.A02 = true;
                this.A00.A03(r1);
            }
        }
    }

    public final /* synthetic */ int BZU() {
        return 0;
    }

    public final int BZY() {
        return this.A08;
    }

    public final boolean CSb(C345137sz r2) {
        return AnonymousClass7TF.A1V(this.A01);
    }

    public final /* synthetic */ boolean CYX() {
        return false;
    }

    public final /* synthetic */ boolean CdZ() {
        return false;
    }

    public final Exception ClT() {
        C345087su r0 = this.A01;
        if (r0 != null) {
            return r0.ClT();
        }
        return null;
    }

    public final C345067ss FL0(C345137sz r3) {
        C345087su r1 = this.A01;
        if (r1 != null) {
            return r1.FL1(r3, r1.A01);
        }
        throw AnonymousClass7TE.A0z("FrameBuffer is null");
    }

    public final C345067ss FL1(C345137sz r2, C345057sr r3) {
        C345087su r0 = this.A01;
        if (r0 != null) {
            return r0.FL1(r2, r3);
        }
        throw AnonymousClass7TE.A0z("FrameBuffer is null");
    }

    public final void detach() {
        C345087su r1;
        if (!(this.A09 == null || (r1 = this.A01) == null)) {
            this.A00.A04(r1);
            this.A01 = null;
        }
        this.A02 = null;
        this.A09 = null;
    }

    public final void swapBuffers() {
        B2S b2s;
        C345087su r0 = this.A01;
        if (r0 != null) {
            A93 a93 = this.A03;
            if (a93 != null) {
                C368998tf r02 = r0.A00;
                r02.getClass();
                int width = r02.getWidth();
                C368998tf r03 = this.A01.A00;
                r03.getClass();
                a93.A00(width, r03.getHeight());
            }
            this.A01.swapBuffers();
            if (this.A09 == null || this.A01 == null || (b2s = this.A02) == null) {
                throw new RuntimeException();
            }
            b2s.DJq();
            C345067ss r2 = this.A01.A0A.A05;
            r2.getClass();
            Exception ClT = this.A01.ClT();
            if (ClT != null) {
                this.A02.DCn(ClT);
            } else {
                int i = r2.A01;
                int i2 = r2.A00;
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 4 * i2);
                GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, allocateDirect);
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                2HF.A00(createBitmap, "Cannot create bitmap");
                createBitmap.copyPixelsFromBuffer(allocateDirect);
                this.A02.CyI(createBitmap, this.A01.A0A.A03);
            }
            this.A02 = null;
        }
    }

    public C40139ATf(C344407ro r4, Integer num, Integer num2, Integer num3, int i) {
        num3.getClass();
        int intValue = num3.intValue();
        num.getClass();
        int intValue2 = num.intValue();
        AnonymousClass7TE.A0u().getClass();
        num2.getClass();
        int intValue3 = num2.intValue();
        r4.getClass();
        this.A06 = intValue;
        this.A04 = intValue2;
        this.A05 = intValue3;
        this.A07 = r4;
        this.A08 = i;
    }

    public final boolean contains(Object obj) {
        return AnonymousClass7TF.A1W(this, obj);
    }

    public final void ACn(C345897uG r1) {
        this.A09 = r1;
    }

    public final void CMa(C344567s4 r1) {
        this.A00 = r1;
    }

    public final void EeR(A93 a93) {
        this.A03 = a93;
    }
}
