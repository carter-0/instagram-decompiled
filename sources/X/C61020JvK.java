package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JvK  reason: case insensitive filesystem */
public final class C61020JvK extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final ArrayList A03;
    public final List A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61020JvK) {
                C61020JvK jvK = (C61020JvK) obj;
                if (!0qQ.A0K(this.A04, jvK.A04) || !0qQ.A0K(this.A02, jvK.A02) || this.A05 != jvK.A05 || this.A00 != jvK.A00 || !0qQ.A0K(this.A03, jvK.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00(String str) {
        Iterator it = this.A04.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (0qQ.A0K(((C64801LiL) it.next()).A03, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() < 0) {
            return null;
        }
        return valueOf;
    }

    public final List A01() {
        ArrayList arrayList = this.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C64801LiL liL = (C64801LiL) 00k.A0O(this.A04, AnonymousClass7TG.A0F(it));
            if (liL != null) {
                A1C.add(liL.A03);
            }
        }
        return A1C;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A04));
        return AnonymousClass7TE.A0N(this.A03, (AnonymousClass7TF.A09(this.A05, A08) + this.A00) * 31);
    }

    public C61020JvK(String str, ArrayList arrayList, List list, int i, boolean z) {
        this.A04 = list;
        this.A02 = str;
        this.A05 = z;
        this.A00 = i;
        this.A03 = arrayList;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int A0M = AnonymousClass7TE.A0M(next);
            if (A0M >= 0 && A0M < this.A04.size()) {
                A1C.add(next);
            }
        }
        this.A01 = A1C.size();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61020JvK() {
        /*
            r6 = this;
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.lang.String r1 = "0"
            r4 = 1
            r0 = 0
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.AnonymousClass7TF.A1M(r2, r0)
            r0 = r6
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61020JvK.<init>():void");
    }
}
