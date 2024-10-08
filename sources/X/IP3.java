package X;

import java.util.ArrayList;
import java.util.List;

public final class IP3 implements C242643Vh {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C13997Tnz A05;
    public final 0fA A06;
    public final H7z A07;
    public final C242643Vh A08;
    public final List A09;
    public final 0sP A0A;
    public final C242643Vh A0B;
    public final C242643Vh A0C;
    public final /* synthetic */ C2813957l A0D;

    public final Object AvB() {
        return null;
    }

    public final /* synthetic */ void DPe(Object obj) {
    }

    public IP3(C13997Tnz tnz, 0fA r7, H7z h7z, C2813957l r9, C242643Vh r10, C242643Vh r11, List list, 0sP r13, int i, int i2, int i3, int i4, int i5) {
        C242643Vh r3;
        this.A0D = r9;
        this.A07 = h7z;
        this.A05 = tnz;
        this.A06 = r7;
        this.A0A = r13;
        this.A09 = list;
        this.A01 = i;
        this.A02 = i2;
        this.A0B = r10;
        this.A04 = i3;
        this.A03 = i4;
        this.A08 = r11;
        this.A00 = i5;
        C242723Vr r4 = (C242723Vr) list.get(i);
        if (AnonymousClass9IN.A00(1, r4)) {
            r3 = new C242783Vx((AnonymousClass9IN) r4);
        } else if (AnonymousClass9IN.A00(0, r4)) {
            r3 = new AnonymousClass9VW((AnonymousClass9IN) r4);
        } else if (r4 instanceof AnonymousClass4FT) {
            r3 = new AnonymousClass4FU(this.A05, this.A06, (AnonymousClass4FT) r4, this.A0A);
        } else {
            throw AnonymousClass7TE.A0w(AnonymousClass000.A00(2531));
        }
        this.A0C = r3;
    }

    public final Iterable BVk(C376459Ib r8, AnonymousClass34Q r9, int i) {
        Object obj;
        ArrayList A1M = 0sr.A1M(new 0eP[]{AnonymousClass7TF.A0x(this.A0C, 0)});
        C242643Vh r1 = this.A0B;
        Integer valueOf = Integer.valueOf(this.A00);
        AnonymousClass7TF.A1I(r1, valueOf, A1M);
        C2813957l r4 = this.A0D;
        int i2 = this.A01;
        if ((i2 + 1 < this.A09.size() && (obj = C2813957l.A00(this.A07, r4, new GNG(12, r4, this), this.A02 + i2 + 1)) != null) || (obj = this.A08) != null) {
            AnonymousClass7TF.A1I(obj, valueOf, A1M);
        }
        return A1M;
    }

    public final /* synthetic */ boolean DPd(Object obj) {
        return true;
    }
}
