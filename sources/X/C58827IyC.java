package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IyC  reason: case insensitive filesystem */
public final class C58827IyC extends 0Yg implements 0sP {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58827IyC(Object obj, Object obj2, Object obj3, float f, float f2, float f3, int i, long j, long j2, boolean z) {
        super(1);
        this.A03 = i;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A04 = j;
        this.A07 = obj;
        this.A09 = z;
        this.A05 = j2;
        this.A06 = obj2;
        this.A08 = obj3;
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.Object, X.64W] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Float valueOf;
        Float valueOf2;
        Object obj2;
        Object obj3 = obj;
        if (this.A03 != 0) {
            AnonymousClass6GH r10 = (AnonymousClass6GH) obj3;
            0qQ.A0B(r10, 0);
            C289095d0 A0T = C51965G9l.A0T(C288025bF.A02(r10.A00.Bwg()) / r10.AwL());
            C289095d0 A0T2 = C51965G9l.A0T(0.0f);
            if (A0T.compareTo(A0T2) < 0) {
                A0T = A0T2;
            }
            float f = A0T.A00;
            float f2 = this.A01;
            float f3 = this.A00;
            float f4 = f3;
            C284945Oz r11 = (C284945Oz) this.A06;
            List A0a = 00k.A0a((Iterable) r11.getValue());
            int i = (int) (f / (f2 + f3));
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (!(!A0a.isEmpty())) {
                for (int i2 = 0; i2 < i; i2++) {
                    A1C.add(Float.valueOf(0.0f));
                }
            } else if (i >= 1) {
                float size = ((float) A0a.size()) / ((float) i);
                A1C.add(00k.A0I(A0a));
                int i3 = i - 1;
                for (int i4 = 1; i4 < i3; i4++) {
                    double d = (double) (((float) i4) * size);
                    double floor = Math.floor(d);
                    int ceil = (int) Math.ceil(d);
                    int i5 = (int) floor;
                    float f5 = (float) (d - floor);
                    if (i5 >= A0a.size() || ceil >= A0a.size()) {
                        obj2 = A1C.get(i4 - 1);
                    } else {
                        float A002 = AnonymousClass7TG.A00(A0a, i5);
                        obj2 = Float.valueOf(A002 + ((AnonymousClass7TG.A00(A0a, ceil) - A002) * f5));
                    }
                    A1C.add(obj2);
                }
                if (i >= 2 && A0a.size() >= 2) {
                    A1C.add(00k.A0K(A0a));
                }
            }
            r11.Epw(A1C);
            float f6 = this.A02;
            long j = this.A04;
            Object obj4 = this.A07;
            boolean z = this.A09;
            J6M A003 = J6M.A00(new C58827IyC(obj4, r11, this.A08, f6, f2, f4, 0, j, this.A05, z), 25);
            ? obj5 = new Object();
            obj5.A00 = A003;
            r10.A01 = obj5;
            return obj5;
        }
        AnonymousClass5Q3 A0T3 = C51968G9o.A0T(obj3);
        float f7 = this.A02;
        float f8 = this.A01;
        float f9 = this.A00;
        long j2 = this.A04;
        float f10 = 0.0f;
        for (Object A042 : (List) C51966G9m.A17(this.A06)) {
            C289095d0 A0T4 = C51965G9l.A0T(AnonymousClass7TE.A04(A042) * f7);
            C289095d0 A0T5 = C51965G9l.A0T(f8);
            if (A0T4.compareTo(A0T5) < 0) {
                A0T4 = A0T5;
            }
            float f11 = A0T4.A00;
            long A004 = C289325dP.A00(f10, A0T3.F06(C51967G9n.A00(f7, f11)));
            long A005 = C288015bE.A00(A0T3.F06(f8), A0T3.F06(f11));
            float F06 = A0T3.F06(f8);
            A0T3.AQv((C288195bW) null, C289635dw.A00, 1.0f, 3, j2, A004, A005, AnonymousClass6GR.A00(F06, F06));
            f10 += C51966G9m.A00(A0T3, f9, A0T3.F06(f8));
        }
        float f12 = ((C53355Gmf) DbT.A0r(this.A07)).A01;
        C284945Oz r5 = (C284945Oz) this.A08;
        float A022 = f12 * C51971G9r.A02(r5);
        if (this.A09) {
            valueOf = Float.valueOf(-1.0f * A022);
            valueOf2 = Float.valueOf(C51971G9r.A02(r5));
        } else {
            valueOf = Float.valueOf(A022);
            valueOf2 = Float.valueOf(0.0f);
        }
        float floatValue = valueOf.floatValue();
        A0T3.AQs((C288195bW) null, C289635dw.A00, 1.0f, 5, this.A05, C289325dP.A00(valueOf2.floatValue(), 0.0f), C288015bE.A00(floatValue, A0T3.F06(f7)));
        return C60340gF.A00;
    }
}
