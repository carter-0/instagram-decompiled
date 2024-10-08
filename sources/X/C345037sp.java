package X;

import android.graphics.RectF;
import java.util.List;

/* renamed from: X.7sp  reason: invalid class name and case insensitive filesystem */
public final class C345037sp implements C344747sM {
    public static final Object A08 = new Object();
    public RectF A00;
    public C344567s4 A01;
    public C361218fr A02;
    public Runnable A03 = null;
    public C365448n8 A04;
    public final C344407ro A05;
    public final C3496981j A06 = new C3496981j();
    public volatile boolean A07 = false;

    public static C345137sz A00(C345037sp r12, C345137sz r13) {
        if (r12.A00 == null) {
            return r13;
        }
        if (r12.A04 == null) {
            r12.A04 = new C365448n8();
        }
        C346337v0 texture = r13.getTexture();
        if (texture == null) {
            return r13;
        }
        C346367v3 r0 = texture.A02;
        int i = r0.A01;
        int i2 = r0.A00;
        C365448n8 r4 = r12.A04;
        r4.A00 = r13;
        RectF rectF = r12.A00;
        float f = (float) i;
        float f2 = (float) i2;
        r4.A00(1.0f, 1.0f, 0.0f, Math.round(rectF.left * f), Math.round(rectF.top * f2), Math.round(rectF.width() * f), Math.round(r12.A00.height() * f2));
        return r12.A04;
    }

    public static void A01(C345037sp r2) {
        synchronized (A08) {
            Runnable runnable = r2.A03;
            if (runnable != null) {
                runnable.run();
                r2.A03 = null;
            }
        }
    }

    public final void A04(Object obj) {
        C3496981j r5 = this.A06;
        List list = r5.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C345097sv r1 = (C345097sv) list.get(i);
            if (r1.contains(obj) || r1.equals(obj)) {
                r5.A02(r1);
                if (r1 instanceof C344747sM) {
                    C344747sM r12 = (C344747sM) r1;
                    this.A01.A04(r12);
                    r12.release();
                    return;
                }
                return;
            }
        }
    }

    public final void ACn(C345897uG r2) {
        C361218fr r0 = this.A02;
        if (r0 != null) {
            r0.ACn(r2);
        }
    }

    public final void detach() {
        C361218fr r0 = this.A02;
        if (r0 != null) {
            r0.detach();
        }
    }

    public final void release() {
        C3496981j r0 = this.A06;
        List list = r0.A00;
        r0.A00();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C345097sv r1 = (C345097sv) list.get(i);
            if (r1 instanceof C344747sM) {
                ((C344747sM) r1).release();
            }
        }
    }

    public C345037sp(C344407ro r2) {
        this.A05 = r2;
    }

    public final void A02(C344567s4 r8, C345097sv r9) {
        Object BNo = r9.BNo();
        C3496981j r5 = this.A06;
        List list = r5.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C345097sv r1 = (C345097sv) list.get(i);
            if (!r1.contains(BNo) && !r1.equals(BNo)) {
                i++;
            } else {
                return;
            }
        }
        this.A07 = false;
        r5.A01(r9);
        if (r9 instanceof C344747sM) {
            r8.A03((C344747sM) r9);
        }
    }

    public final void A03(C345137sz r7) {
        C345137sz A002 = A00(this, r7);
        C345897uG A012 = this.A01.A01();
        boolean z = this.A07;
        if (this.A02 == null) {
            C361218fr r0 = new C361218fr(this.A05);
            this.A02 = r0;
            r0.ACn(A012);
        }
        C361218fr r2 = this.A02;
        List list = this.A06.A00;
        if (z) {
            r2.A02(A012, A002, list, false);
            A01(this);
            return;
        }
        r2.A02(A012, A002, list, true);
    }

    public final void CMa(C344567s4 r1) {
        this.A01 = r1;
    }
}
