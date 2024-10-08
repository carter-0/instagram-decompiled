package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.8pO  reason: invalid class name and case insensitive filesystem */
public final class C366618pO extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public int A02;
    public C306576Mr A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public List A07;
    public List A08;
    public final HashMap A09;

    public C366618pO(C306576Mr r2, Integer num, Integer num2, String str, HashMap hashMap, List list, List list2, int i, int i2, int i3) {
        0qQ.A0B(list, 5);
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = r2;
        this.A07 = list;
        this.A04 = num;
        this.A08 = list2;
        this.A09 = hashMap;
        this.A05 = num2;
        this.A06 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C366618pO) {
                C366618pO r5 = (C366618pO) obj;
                if (this.A02 != r5.A02 || this.A01 != r5.A01 || this.A00 != r5.A00 || this.A03 != r5.A03 || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.A02 * 31) + this.A01) * 31) + this.A00) * 31) + this.A03.hashCode()) * 31) + this.A07.hashCode()) * 31;
        Integer num = this.A04;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.A08.hashCode()) * 31) + this.A09.hashCode()) * 31;
        Integer num2 = this.A05;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.A06.hashCode();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C366618pO() {
        /*
            r11 = this;
            r2 = 0
            r8 = 0
            r10 = -1
            X.6Mr r1 = X.C306576Mr.DISABLED
            X.0sn r6 = X.0sn.A00
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r4 = ""
            r0 = r11
            r3 = r2
            r7 = r6
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366618pO.<init>():void");
    }
}
