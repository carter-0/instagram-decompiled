package X;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.VwD  reason: case insensitive filesystem */
public final class C18658VwD {
    public boolean A00 = false;
    public float[] A01;
    public float[] A02;
    public float[] A03;
    public float[] A04;
    public int A05 = 0;
    public int A06 = 0;
    public final RectF A07 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public final C344227rW A08;
    public final C368848tQ A09;
    public final C18568VuK A0A = new C18568VuK();
    public final C345557ti A0B;
    public final Map A0C;
    public final C17553Va6 A0D;
    public final float[] A0E;

    public final ArrayList A01() {
        ArrayList arrayList = new ArrayList();
        Iterator A16 = DbV.A16(this.A0C);
        while (A16.hasNext()) {
            C368848tQ r2 = (C368848tQ) A16.next();
            if (r2.A08) {
                C361868gx r1 = r2.A05;
                if (r1.isEnabled() && !(r1 instanceof C368938tZ)) {
                    C361848gv r0 = r2.A01;
                    if (r0 != null) {
                        r2.A00.A00 = r0.A0E();
                    }
                    arrayList.add(r2.A00);
                }
            }
        }
        return arrayList;
    }

    public final void A02() {
        if (this.A00) {
            Iterator A16 = DbV.A16(this.A0C);
            while (A16.hasNext()) {
                C368848tQ r1 = (C368848tQ) A16.next();
                r1.A05.Dpb();
                r1.A03 = false;
            }
        }
        this.A00 = false;
        this.A06 = 0;
        this.A05 = 0;
    }

    public final void A03(int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        Iterator A16 = DbV.A16(this.A0C);
        while (A16.hasNext()) {
            ((C368848tQ) A16.next()).A05.DpU(i, i2);
        }
    }

    public C18658VwD(C344227rW r5, C17553Va6 va6, C345557ti r7, C368938tZ r8) {
        this.A0B = r7;
        this.A08 = r5;
        C368848tQ r2 = new C368848tQ(r8);
        this.A09 = r2;
        this.A0D = va6;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A0C = concurrentHashMap;
        C66581MXm.A1S(r2, concurrentHashMap, 1);
        float[] fArr = new float[16];
        this.A0E = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void A00(C18658VwD vwD, C17988VjQ vjQ, W1n w1n, C361868gx r11) {
        int i;
        int i2;
        if (r11.BHb() == AnonymousClass05K.A00) {
            C368538so r1 = vwD.A0A.A04;
            vwD.A04 = r1.A03;
            synchronized (vjQ) {
                i = vjQ.A02;
            }
            synchronized (vjQ) {
                i2 = vjQ.A00;
            }
            float[] A072 = w1n.A07(C365468nA.CROP, i, i2, 0, false);
            vwD.A02 = A072;
            r1.A03 = A072;
        }
    }

    public final void A04(List list) {
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C368848tQ r5 = (C368848tQ) it.next();
            Map map = this.A0C;
            Number A14 = C51966G9m.A14(r5, map);
            if (A14 == null) {
                A14 = C51967G9n.A0k();
                C17553Va6 va6 = this.A0D;
                C361868gx r2 = r5.A05;
                r2.EOi(new C19084WKo(va6, r5));
                if (this.A00) {
                    r2.DpY(this.A0B);
                    r5.A03 = true;
                    int i2 = this.A05;
                    if (i2 > 0 && (i = this.A06) > 0) {
                        r2.DpU(i, i2);
                        r2.DpZ(this.A07);
                    }
                }
            }
            C66580MXl.A1T(r5, map, A14.intValue() + 1);
        }
    }

    public final void A05(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C368848tQ r3 = (C368848tQ) it.next();
            Map map = this.A0C;
            Number A14 = C51966G9m.A14(r3, map);
            if (A14 == null) {
                Log.w("EffectManager", "Effect unregistered that wasn't previously registered");
            } else {
                int intValue = A14.intValue() - 1;
                Integer valueOf = Integer.valueOf(intValue);
                if (intValue <= 0) {
                    map.remove(r3);
                    C361868gx r1 = r3.A05;
                    r1.EOi((C13586TdE) null);
                    if (this.A00) {
                        r1.Dpb();
                        r3.A03 = false;
                    }
                } else {
                    map.put(r3, valueOf);
                }
            }
        }
    }
}
