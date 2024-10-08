package X;

import android.opengl.EGLContext;
import android.view.Surface;

public final class ASV implements C344557s3 {
    public EGLContext A00;
    public final C344587s6 A01;

    public ASV(EGLContext eGLContext, Object obj) {
        this.A01 = new C344587s6(obj, 3);
        this.A00 = eGLContext;
    }

    public final C345937uK AMZ(Surface surface, int i) {
        return this.A01.AMZ(surface, 5);
    }

    public final C345937uK AMW(int i, int i2) {
        return this.A01.AMW(i, i2);
    }

    public final C345937uK AMY(Surface surface) {
        return this.A01.AMY(surface);
    }

    public final int Apq() {
        return this.A01.A00;
    }

    public final /* bridge */ /* synthetic */ EGLContext Azj() {
        return this.A00;
    }

    public final int BYP() {
        return this.A01.A01;
    }

    public final C344597s7 C5n() {
        return this.A01.A05;
    }

    public final boolean CQx() {
        return this.A01.CQx();
    }

    public final void ClX() {
        this.A01.ClX();
    }

    public final C344587s6 ErB(int i) {
        EGLContext eGLContext = this.A00;
        C344587s6 r0 = this.A01;
        r0.A09(eGLContext, i);
        return r0;
    }

    public final C344557s3 ErC(C344557s3 r2, int i) {
        C344587s6 r0 = this.A01;
        r0.A0A(r2, i);
        return r0;
    }

    public final void release() {
        this.A01.release();
    }
}
