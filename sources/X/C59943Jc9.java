package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jc9  reason: case insensitive filesystem */
public final class C59943Jc9 {
    public final C59944JcA A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final Map A02;
    public final Map A03;
    public final Map A04;

    public static List A00(C59943Jc9 jc9, Object obj) {
        0qQ.A0B(obj, 0);
        return (List) jc9.A02.get(obj);
    }

    public final C71492dQ A03(C347087wF r3, int i) {
        0qQ.A0B(r3, 0);
        List list = (List) this.A04.get(r3);
        if (list == null || i >= list.size()) {
            return null;
        }
        return (C71492dQ) list.get(i);
    }

    public final C63809L7p A04(C347087wF r2, int i) {
        0qQ.A0B(r2, 0);
        Object obj = this.A02.get(r2);
        if (obj != null) {
            return (C63809L7p) C51966G9m.A19(obj, i);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(C59943Jc9 jc9, C63808L7o l7o) {
        C347087wF r2 = l7o.A00;
        jc9.A02.put(r2, l7o.A01);
        jc9.A03.put(r2, l7o.A02);
        jc9.A04.put(r2, l7o.A03);
        jc9.A01.add(r2);
    }

    public final void A05() {
        C59944JcA jcA = this.A00;
        float f = jcA.A00;
        float f2 = f / 2.0f;
        float f3 = f / 4.0f;
        float f4 = jcA.A01;
        float f5 = f4 / 2.0f;
        int i = (int) f2;
        int i2 = (int) f4;
        int i3 = (int) f3;
        int i4 = (int) f5;
        C347087wF r9 = C347087wF.A08;
        C63809L7p l7p = new C63809L7p(f4, f2, 0.0f, 0.0f);
        C63809L7p l7p2 = new C63809L7p(f5, f3, 0.0f, f2);
        C63809L7p l7p3 = new C63809L7p(f5, f3, f5, f2);
        float f6 = f2 + f3;
        ArrayList A1L = 0sr.A1L(new C63809L7p[]{l7p, l7p2, l7p3, new C63809L7p(f5, f3, 0.0f, f6), new C63809L7p(f5, f3, f5, f6)});
        int i5 = jcA.A02;
        C71492dQ r3 = new C71492dQ(0, i5);
        JTP.A16(r3);
        C71492dQ r2 = new C71492dQ(0, i5);
        JTP.A16(r2);
        r2.A09 = 0.75f;
        C71492dQ r1 = new C71492dQ(i5, 0);
        r1.A0u = -1;
        r1.A0F = 0;
        r1.A0s = 0;
        r1.A0M = 0;
        r1.A05 = 0.5f;
        ArrayList A1L2 = 0sr.A1L(new C71492dQ[]{r3, r2, r1});
        C71492dQ A0B = JTQ.A0B(i2, i, 0, -1);
        A0B.A0s = 0;
        A0B.A0M = 0;
        C71492dQ r32 = new C71492dQ(i4, i3);
        r32.A0u = 0;
        r32.A0F = 0;
        r32.A0s = 0;
        r32.A0M = -1;
        r32.A09 = 0.6666667f;
        C71492dQ r22 = new C71492dQ(i4, i3);
        r22.A0u = 0;
        r22.A0F = 0;
        r22.A0s = -1;
        r22.A0M = 0;
        r22.A09 = 0.6666667f;
        C71492dQ A0B2 = JTQ.A0B(i4, i3, -1, 0);
        A0B2.A0s = 0;
        A0B2.A0M = -1;
        C71492dQ A0B3 = JTQ.A0B(i4, i3, -1, 0);
        A0B3.A0s = -1;
        A0B3.A0M = 0;
        A02(this, r9, A1L, A1L2, new C71492dQ[]{A0B, r32, r22, A0B2, A0B3});
    }

    public final void A06() {
        C59944JcA jcA = this.A00;
        float f = jcA.A00 / 2.0f;
        float f2 = jcA.A01;
        float f3 = f2 / 2.0f;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = (int) f3;
        C347087wF r7 = C347087wF.A09;
        ArrayList A1L = 0sr.A1L(new C63809L7p[]{new C63809L7p(f2, f, 0.0f, 0.0f), new C63809L7p(f3, f, 0.0f, f), new C63809L7p(f3, f, f3, f)});
        int i4 = jcA.A02;
        C71492dQ r2 = new C71492dQ(0, i4);
        JTP.A16(r2);
        C71492dQ r1 = new C71492dQ(i4, 0);
        r1.A0u = -1;
        r1.A0F = 0;
        r1.A0s = 0;
        r1.A0M = 0;
        r1.A05 = 0.5f;
        ArrayList A1L2 = 0sr.A1L(new C71492dQ[]{r2, r1});
        C71492dQ A0B = JTQ.A0B(i2, i, 0, -1);
        A0B.A0s = 0;
        A0B.A0M = 0;
        C71492dQ A0B2 = JTQ.A0B(i3, i, -1, 0);
        A0B2.A0s = 0;
        A0B2.A0M = -1;
        C71492dQ A0B3 = JTQ.A0B(i3, i, -1, 0);
        A0B3.A0s = -1;
        A0B3.A0M = 0;
        A02(this, r7, A1L, A1L2, new C71492dQ[]{A0B, A0B2, A0B3});
    }

    public final void A07() {
        C59944JcA jcA = this.A00;
        float f = jcA.A00;
        float f2 = jcA.A01 / 2.0f;
        int i = (int) f;
        int i2 = (int) f2;
        C347087wF r6 = C347087wF.A0F;
        ArrayList A1L = 0sr.A1L(new C63809L7p[]{new C63809L7p(f2, f, 0.0f, 0.0f), new C63809L7p(f2, f, f2, 0.0f)});
        C71492dQ r0 = new C71492dQ(jcA.A02, 0);
        JTP.A16(r0);
        ArrayList A1L2 = 0sr.A1L(new C71492dQ[]{r0});
        C71492dQ r2 = new C71492dQ(i2, i);
        r2.A0u = 0;
        r2.A0F = 0;
        r2.A0s = 0;
        r2.A0M = -1;
        C71492dQ r02 = new C71492dQ(i2, i);
        r02.A0u = 0;
        r02.A0F = 0;
        r02.A0s = -1;
        r02.A0M = 0;
        A02(this, r6, A1L, A1L2, new C71492dQ[]{r2, r02});
    }

    public final void A08() {
        C59944JcA jcA = this.A00;
        float f = jcA.A00 / 3.0f;
        float f2 = jcA.A01 / 2.0f;
        int i = (int) f;
        int i2 = (int) f2;
        C347087wF r1 = C347087wF.A0G;
        float f3 = 2.0f * f;
        ArrayList A1L = 0sr.A1L(new C63809L7p[]{new C63809L7p(f2, f, 0.0f, 0.0f), new C63809L7p(f2, f, f2, 0.0f), new C63809L7p(f2, f, 0.0f, f), new C63809L7p(f2, f, f2, f), new C63809L7p(f2, f, 0.0f, f3), new C63809L7p(f2, f, f2, f3)});
        int i3 = jcA.A02;
        C71492dQ r7 = new C71492dQ(0, i3);
        JTP.A16(r7);
        r7.A09 = 0.33333334f;
        C71492dQ r5 = new C71492dQ(0, i3);
        JTP.A16(r5);
        r5.A09 = 0.6666667f;
        C71492dQ r4 = new C71492dQ(i3, 0);
        JTP.A16(r4);
        ArrayList A1L2 = 0sr.A1L(new C71492dQ[]{r7, r5, r4});
        C71492dQ r72 = new C71492dQ(i2, i);
        r72.A0u = 0;
        r72.A0F = -1;
        r72.A0s = 0;
        r72.A0M = -1;
        C71492dQ A0B = JTQ.A0B(i2, i, 0, -1);
        A0B.A0s = -1;
        A0B.A0M = 0;
        C71492dQ r9 = new C71492dQ(i2, i);
        r9.A0u = 0;
        r9.A0F = 0;
        r9.A0s = 0;
        r9.A0M = -1;
        C71492dQ r10 = new C71492dQ(i2, i);
        r10.A0u = 0;
        r10.A0F = 0;
        r10.A0s = -1;
        r10.A0M = 0;
        C71492dQ A0B2 = JTQ.A0B(i2, i, -1, 0);
        A0B2.A0s = 0;
        A0B2.A0M = -1;
        C71492dQ A0B3 = JTQ.A0B(i2, i, -1, 0);
        A0B3.A0s = -1;
        A0B3.A0M = 0;
        A02(this, r1, A1L, A1L2, new C71492dQ[]{r72, A0B, r9, r10, A0B2, A0B3});
    }

    public final void A09() {
        C59944JcA jcA = this.A00;
        float f = jcA.A00 / 2.0f;
        float f2 = jcA.A01 / 2.0f;
        int i = (int) f;
        int i2 = (int) f2;
        C347087wF r8 = C347087wF.A0H;
        ArrayList A1L = 0sr.A1L(new C63809L7p[]{new C63809L7p(f2, f, 0.0f, 0.0f), new C63809L7p(f2, f, f2, 0.0f), new C63809L7p(f2, f, 0.0f, f), new C63809L7p(f2, f, f2, f)});
        int i3 = jcA.A02;
        C71492dQ r1 = new C71492dQ(0, i3);
        JTP.A16(r1);
        C71492dQ r0 = new C71492dQ(i3, 0);
        JTP.A16(r0);
        ArrayList A1L2 = 0sr.A1L(new C71492dQ[]{r1, r0});
        C71492dQ r4 = new C71492dQ(i2, i);
        r4.A0u = 0;
        r4.A0F = -1;
        r4.A0s = 0;
        r4.A0M = -1;
        C71492dQ A0B = JTQ.A0B(i2, i, 0, -1);
        A0B.A0s = -1;
        A0B.A0M = 0;
        C71492dQ A0B2 = JTQ.A0B(i2, i, -1, 0);
        A0B2.A0s = 0;
        A0B2.A0M = -1;
        C71492dQ A0B3 = JTQ.A0B(i2, i, -1, 0);
        A0B3.A0s = -1;
        A0B3.A0M = 0;
        A02(this, r8, A1L, A1L2, new C71492dQ[]{r4, A0B, A0B2, A0B3});
    }

    public C59943Jc9(Context context, float f, float f2) {
        this.A00 = new C59944JcA(context, f, f2);
        Class<C347087wF> cls = C347087wF.class;
        this.A02 = new EnumMap(cls);
        this.A03 = new EnumMap(cls);
        this.A04 = new EnumMap(cls);
    }

    public static void A02(C59943Jc9 jc9, C347087wF r3, List list, List list2, Object[] objArr) {
        A01(jc9, new C63808L7o(r3, list, list2, 0sr.A1L(objArr)));
    }
}
