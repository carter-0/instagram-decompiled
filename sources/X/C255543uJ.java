package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3uJ  reason: invalid class name and case insensitive filesystem */
public class C255543uJ implements SerialDescriptor, C255553uK {
    public int A00 = -1;
    public Map A01;
    public final int A02;
    public final String A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final C255533uI A07;
    public final String[] A08;
    public final List[] A09;
    public final boolean[] A0A;

    public final void A00(String str) {
        A01(str, false);
    }

    public final void A01(String str, boolean z) {
        0qQ.A0B(str, 0);
        String[] strArr = this.A08;
        int i = this.A00 + 1;
        this.A00 = i;
        strArr[i] = str;
        this.A0A[i] = z;
        this.A09[i] = null;
        if (i == this.A02 - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.A01 = hashMap;
        }
    }

    public final int B0T(String str) {
        0qQ.A0B(str, 0);
        Number number = (Number) this.A01.get(str);
        if (number != null) {
            return number.intValue();
        }
        return -3;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C255543uJ) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (0qQ.A0K(this.A03, serialDescriptor.BsV()) && Arrays.equals((Object[]) this.A06.getValue(), (Object[]) ((C255543uJ) obj).A06.getValue()) && (i = this.A02) == serialDescriptor.B0a()) {
                int i2 = 0;
                while (i2 < i) {
                    if (0qQ.A0K(B0R(i2).BsV(), serialDescriptor.B0R(i2).BsV()) && 0qQ.A0K(B0R(i2).BKK(), serialDescriptor.B0R(i2).BKK())) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final List B0P(int i) {
        List list = this.A09[i];
        if (list == null) {
            return 0sn.A00;
        }
        return list;
    }

    public final SerialDescriptor B0R(int i) {
        if (this instanceof C2590740h) {
            return ((SerialDescriptor[]) ((C2590740h) this).A00.getValue())[i];
        }
        return ((C255463uA[]) this.A05.getValue())[i].getDescriptor();
    }

    public final String B0V(int i) {
        return this.A08[i];
    }

    public final int B0a() {
        return this.A02;
    }

    public final C255513uF BKK() {
        if (this instanceof C2590740h) {
            return ((C2590740h) this).A01;
        }
        return C2590840i.A00;
    }

    public final String BsV() {
        return this.A03;
    }

    public final Set BsW() {
        return this.A01.keySet();
    }

    public final boolean CRn(int i) {
        return this.A0A[i];
    }

    public final boolean CYM() {
        return false;
    }

    public final List getAnnotations() {
        return 0sn.A00;
    }

    public int hashCode() {
        return ((Number) this.A04.getValue()).intValue();
    }

    public final boolean isInline() {
        if (this instanceof C271134hx) {
            return true;
        }
        return false;
    }

    public String toString() {
        return 00k.A0P(", ", 002.A0C(this.A03, '('), ")", C229632nm.A0C(0, this.A02), new C20419Wr3(this));
    }

    public C255543uJ(String str, C255533uI r5, int i) {
        this.A03 = str;
        this.A07 = r5;
        this.A02 = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.A08 = strArr;
        this.A09 = new List[i];
        this.A0A = new boolean[i];
        this.A01 = 0Yt.A0E();
        0eO r1 = 0eO.A03;
        this.A05 = AnonymousClass0eN.A00(r1, new C261764Av(this));
        this.A06 = AnonymousClass0eN.A00(r1, new C261774Aw(this));
        this.A04 = AnonymousClass0eN.A00(r1, new C261784Ax(this));
    }
}
