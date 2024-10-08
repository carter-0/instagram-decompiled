package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Sfn  reason: case insensitive filesystem */
public final class C11752Sfn implements TZd {
    public final List A00;

    public static List A00(C11752Sfn sfn, C10943S2a s2a) {
        ArrayList arrayList;
        boolean z;
        String str;
        int i;
        C11389SRd sRd = new C11389SRd(s2a.A04);
        List list = sfn.A00;
        while (Pxe.A06(sRd) > 0) {
            int A05 = sRd.A05();
            int A052 = sRd.A01 + sRd.A05();
            if (A05 == 134) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                int A053 = sRd.A05() & 31;
                for (int i2 = 0; i2 < A053; i2++) {
                    String A0I = sRd.A0I(AnonymousClass2RN.A05, 3);
                    int A054 = sRd.A05();
                    boolean z2 = true;
                    if ((A054 & 128) != 0) {
                        z = true;
                        i = A054 & 63;
                        str = "application/cea-708";
                    } else {
                        z = false;
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte A055 = (byte) sRd.A05();
                    sRd.A0P(1);
                    List list2 = null;
                    if (z) {
                        if ((A055 & 64) == 0) {
                            z2 = false;
                        }
                        byte[] bArr = new byte[1];
                        if (z2) {
                            bArr[0] = 1;
                        } else {
                            bArr[0] = 0;
                        }
                        list2 = Collections.singletonList(bArr);
                    }
                    SOW A002 = SOW.A00();
                    A002.A01(str);
                    A002.A0V = A0I;
                    A002.A02 = i;
                    A002.A0X = list2;
                    A1C.add(Pxe.A0O(A002));
                }
                arrayList = A1C;
            } else {
                arrayList = list;
            }
            sRd.A0O(A052);
            list = arrayList;
        }
        return list;
    }

    public C11752Sfn(List list) {
        this.A00 = list;
    }

    public C11752Sfn() {
        this(ImmutableList.of());
    }
}
