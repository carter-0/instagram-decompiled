package X;

import java.util.List;

/* renamed from: X.9K4  reason: invalid class name */
public final class AnonymousClass9K4 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final float A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K4(C354388Lv r2, Integer num, AnonymousClass4D7 r4, float f, int i) {
        super(2, r4);
        this.A02 = i;
        this.A04 = r2;
        this.A03 = num;
        this.A01 = f;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9K4, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        int i;
        int i2 = this.A02;
        C354388Lv r1 = (C354388Lv) this.A04;
        Integer num = (Integer) this.A03;
        float f = this.A01;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new AnonymousClass9K4(r1, num, r8, f, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9K4) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.9K4, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        05G r7;
        int i;
        C354398Lw r4;
        int size;
        int i2 = this.A02;
        1Hj r5 = 1Hj.A02;
        int i3 = this.A00;
        if (i2 != 0) {
            if (i3 == 0) {
                0eS.A00(obj);
                C354388Lv r1 = (C354388Lv) this.A04;
                r7 = r1.A07;
                List list = r1.A04;
                int i4 = ((C354398Lw) r7.getValue()).A01;
                int indexOf = list.indexOf(new Integer(i4));
                Integer num = (Integer) this.A03;
                if (num == AnonymousClass05K.A00) {
                    size = indexOf + 1;
                } else {
                    size = (indexOf - 1) + list.size();
                }
                r4 = new C354398Lw(num, this.A01, i4, ((Number) list.get(size % list.size())).intValue());
            }
            0eS.A00(obj);
            return C60340gF.A00;
        }
        if (i3 == 0) {
            0eS.A00(obj);
            r7 = ((C354388Lv) this.A04).A07;
            C354398Lw r12 = (C354398Lw) r7.getValue();
            Integer num2 = (Integer) this.A03;
            if (num2 == AnonymousClass05K.A0C) {
                i = r12.A02;
            } else {
                i = r12.A01;
            }
            r4 = new C354398Lw(num2, this.A01, i, r12.A02);
        }
        0eS.A00(obj);
        return C60340gF.A00;
        this.A00 = 1;
        if (r7.emit(r4, this) == r5) {
            return r5;
        }
        return C60340gF.A00;
    }
}
