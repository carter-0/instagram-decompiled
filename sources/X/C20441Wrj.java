package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Wrj  reason: case insensitive filesystem */
public final class C20441Wrj implements SerialDescriptor, C255553uK {
    public final int A00;
    public final String A01;
    public final AnonymousClass0eM A02;
    public final String[] A03;
    public final SerialDescriptor[] A04;
    public final SerialDescriptor[] A05;
    public final List A06;
    public final Map A07;
    public final Set A08;
    public final C255513uF A09;
    public final List[] A0A;
    public final boolean[] A0B;

    public final int B0T(String str) {
        0qQ.A0B(str, 0);
        Number A14 = C51966G9m.A14(str, this.A07);
        if (A14 != null) {
            return A14.intValue();
        }
        return -3;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20441Wrj) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (0qQ.A0K(this.A01, serialDescriptor.BsV()) && Arrays.equals(this.A05, ((C20441Wrj) obj).A05) && (i = this.A00) == serialDescriptor.B0a()) {
                int i2 = 0;
                while (i2 < i) {
                    SerialDescriptor[] serialDescriptorArr = this.A04;
                    if (0qQ.A0K(serialDescriptorArr[i2].BsV(), serialDescriptor.B0R(i2).BsV()) && 0qQ.A0K(serialDescriptorArr[i2].BKK(), serialDescriptor.B0R(i2).BKK())) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final List B0P(int i) {
        return this.A0A[i];
    }

    public final SerialDescriptor B0R(int i) {
        return this.A04[i];
    }

    public final String B0V(int i) {
        return this.A03[i];
    }

    public final int B0a() {
        return this.A00;
    }

    public final C255513uF BKK() {
        return this.A09;
    }

    public final String BsV() {
        return this.A01;
    }

    public final Set BsW() {
        return this.A08;
    }

    public final boolean CRn(int i) {
        return this.A0B[i];
    }

    public final boolean CYM() {
        return false;
    }

    public final List getAnnotations() {
        return this.A06;
    }

    public final int hashCode() {
        return DbX.A07(this.A02);
    }

    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return 00k.A0P(", ", 002.A0C(this.A01, '('), ")", C229632nm.A0C(0, this.A00), new C20406Wqq(this, 4));
    }

    public C20441Wrj(String str, List list, C17912Vi3 vi3, C255513uF r10, int i) {
        this.A01 = str;
        this.A09 = r10;
        this.A00 = i;
        this.A06 = vi3.A00;
        List list2 = vi3.A03;
        this.A08 = 00k.A0V(list2);
        int i2 = 0;
        String[] A1b = DbU.A1b(list2, 0);
        this.A03 = A1b;
        this.A04 = C360608er.A02(vi3.A02);
        this.A0A = (List[]) vi3.A01.toArray(new List[0]);
        List<Object> list3 = vi3.A04;
        0qQ.A0B(list3, 0);
        boolean[] zArr = new boolean[list3.size()];
        for (Object A1a : list3) {
            zArr[i2] = AnonymousClass7TE.A1a(A1a);
            i2++;
        }
        this.A0B = zArr;
        0sj A0L = 03t.A0L(A1b);
        ArrayList A0r = AnonymousClass7TG.A0r(A0L);
        Iterator it = A0L.iterator();
        while (it.hasNext()) {
            0k0 r0 = (0k0) it.next();
            AnonymousClass7TF.A1I(r0.A01, Integer.valueOf(r0.A00), A0r);
        }
        this.A07 = 0Yt.A08(A0r);
        this.A05 = C360608er.A02(list);
        this.A02 = AnonymousClass0eN.A01(new C20405Wqp(this, 14));
    }
}
