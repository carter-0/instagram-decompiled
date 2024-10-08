package X;

import java.util.List;

/* renamed from: X.GnN  reason: case insensitive filesystem */
public final class C53390GnN extends AnonymousClass0T0 {
    public final float A00;
    public final HM3 A01;
    public final Integer A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53390GnN) {
                C53390GnN gnN = (C53390GnN) obj;
                if (!(this.A01 == gnN.A01 && 0qQ.A0K(this.A03, gnN.A03) && Float.compare(this.A00, gnN.A00) == 0 && this.A04 == gnN.A04 && 0qQ.A0K(this.A02, gnN.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A02(HM3 hm3, C53390GnN gnN, Object obj, List list, 05G r7) {
        return r7.AIY(obj, A01(hm3, gnN.A02, list, gnN.A00, gnN.A04));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A01)), this.A00)) + AnonymousClass7TG.A0C(this.A02);
    }

    public C53390GnN(HM3 hm3, Integer num, List list, float f, boolean z) {
        this.A01 = hm3;
        this.A03 = list;
        this.A00 = f;
        this.A04 = z;
        this.A02 = num;
    }

    public static C61045Jvj A00(AnonymousClass0Ud r0, int i) {
        return (C61045Jvj) ((C53390GnN) r0.getValue()).A03.get(i);
    }

    public static final C53390GnN A01(HM3 hm3, Integer num, List list, float f, boolean z) {
        AnonymousClass7TG.A1N(hm3, list);
        return new C53390GnN(hm3, num, list, f, z);
    }

    public C53390GnN() {
        this(HM3.Initial, (Integer) null, 0sn.A00, 0.0f, true);
    }
}
