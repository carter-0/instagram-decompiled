package X;

import android.content.Context;
import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7uF  reason: invalid class name and case insensitive filesystem */
public final class C345887uF implements C345897uG {
    public C344557s3 A00;
    public boolean A01;
    public final C344557s3 A02;
    public final C345937uK A03;
    public final C345557ti A04;
    public final C344507ry A05;
    public final C345957uM A06;
    public final C345967uN A07;
    public final C346007uR A08;

    public final C344557s3 Azl(int i) {
        C344557s3 r3 = this.A02;
        if (0 == (r3.Apq() & 32)) {
            return r3;
        }
        C344557s3 r1 = this.A00;
        if (r1 != null) {
            return r1;
        }
        C344507ry r12 = this.A05;
        C344517rz r0 = C344507ry.A02;
        Object obj = C344527s0.A05;
        Map map = r12.A00;
        Object obj2 = map.get(r0);
        if (obj2 != null) {
            obj = obj2;
        }
        Object obj3 = map.get(C344507ry.A07);
        obj3.getClass();
        C344587s6 A012 = C344577s5.A01(obj, ((Number) obj3).intValue());
        0qQ.A0C(A012, "null cannot be cast to non-null type com.facebook.gl.EGLCore<android.opengl.EGLContext>");
        A012.A0A(r3, 5);
        this.A00 = A012;
        return A012;
    }

    public final C344557s3 Azk() {
        return this.A02;
    }

    public final C345557ti BhQ() {
        return this.A04;
    }

    public final C345967uN Blv() {
        return this.A07;
    }

    public final C346007uR C3G() {
        return this.A08;
    }

    public final C345957uM C5m() {
        return this.A06;
    }

    public final void makeCurrent() {
        if (!this.A01) {
            this.A03.A05();
        }
    }

    public final void release() {
        if (!this.A01) {
            this.A01 = true;
            C345967uN r4 = this.A07;
            C345977uO r0 = r4.A03;
            if (r0 != null) {
                r0.A00();
            }
            HashMap hashMap = r4.A04;
            for (Map.Entry entry : hashMap.entrySet()) {
                ((C344747sM) entry.getValue()).detach();
                ((C344747sM) entry.getValue()).release();
            }
            hashMap.clear();
            r4.A00 = null;
            C344557s3 r1 = this.A02;
            r1.ClX();
            this.A03.A02();
            r1.release();
            C344557s3 r02 = this.A00;
            if (r02 != null) {
                r02.release();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.7uM, java.lang.Object] */
    public C345887uF(Context context, C344557s3 r5, C344557s3 r6, C344507ry r7, C344567s4 r8) {
        this.A05 = r7;
        this.A02 = r5;
        boolean z = false;
        Object obj = r7.A00.get(C344507ry.A03);
        int i = ((Boolean) (obj != null ? obj : z)).booleanValue() ? 37 : 5;
        if (r6 != null) {
            int Apq = r6.Apq();
            i = (Apq & 256) != 0 ? i | 256 : i;
            if ((Apq & 32) != 0) {
                i = C392929vc.A00(r6, i | 32);
                if ((Apq & 8192) != 0) {
                    i |= 8192;
                }
            }
            r5.ErC(r6, i);
        } else {
            r5.ErB(i);
        }
        this.A04 = new C345557ti(context.getResources());
        C345937uK AMW = r5.AMW(8, 8);
        this.A03 = AMW;
        AMW.A05();
        this.A06 = new Object();
        C345967uN r1 = new C345967uN(r7, r8);
        this.A07 = r1;
        this.A08 = new C346007uR(this);
        r1.A00 = this;
    }

    public final void AVT() {
        GLES20.glFinish();
    }

    public final void flush() {
        GLES20.glFlush();
    }
}
