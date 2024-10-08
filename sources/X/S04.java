package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class S04 {
    public final C13900TjN A00;

    public final boolean A03(C11389SRd sRd, long j) {
        int i;
        int A06;
        C13900TjN tjN;
        long j2 = j;
        C11389SRd sRd2 = sRd;
        if (this instanceof QE0) {
            QE0 qe0 = (QE0) this;
            int A05 = sRd2.A05();
            byte[] bArr = sRd2.A02;
            int i2 = sRd2.A01;
            int i3 = i2 + 1;
            int i4 = ((bArr[i2] & 255) << 24) >> 8;
            int i5 = i3 + 1;
            int A0D = Pxf.A0D(bArr, i3, i4);
            int i6 = i5 + 1;
            sRd2.A01 = i6;
            long A0E = j + Pxf.A0E((bArr[i5] & 255) | A0D);
            if (A05 == 0) {
                if (!qe0.A02) {
                    C11389SRd sRd3 = new C11389SRd(new byte[(sRd2.A00 - i6)]);
                    sRd2.A0R(sRd3.A02, 0, sRd2.A00 - i6);
                    C11219SFt A002 = C11219SFt.A00(sRd3);
                    qe0.A01 = A002.A08;
                    SOW A003 = SOW.A00();
                    A003.A01("video/avc");
                    A003.A0R = A002.A0A;
                    A003.A0L = A002.A09;
                    A003.A09 = A002.A06;
                    A003.A01 = A002.A00;
                    A003.A0X = A002.A0B;
                    qe0.A00.AWO(Pxe.A0O(A003));
                    qe0.A02 = true;
                }
            } else if (A05 == 1 && qe0.A02) {
                boolean A1S = AnonymousClass7TF.A1S(qe0.A00, 1);
                if (qe0.A03 || A1S) {
                    C11389SRd sRd4 = qe0.A04;
                    byte[] bArr2 = sRd4.A02;
                    bArr2[0] = 0;
                    bArr2[1] = 0;
                    bArr2[2] = 0;
                    int i7 = 4 - qe0.A01;
                    int i8 = 0;
                    while (Pxe.A06(sRd2) > 0) {
                        sRd2.A0R(sRd4.A02, i7, qe0.A01);
                        int A07 = Pxe.A07(sRd4, 0);
                        C11389SRd sRd5 = qe0.A05;
                        sRd5.A0O(0);
                        C13900TjN tjN2 = qe0.A00;
                        tjN2.EJf(sRd5, 4);
                        tjN2.EJf(sRd2, A07);
                        i8 = i8 + 4 + A07;
                    }
                    qe0.A00.EJm((S4h) null, A1S ? 1 : 0, i8, 0, A0E);
                    qe0.A03 = true;
                    return true;
                }
            }
        } else if (this instanceof QE1) {
            QE1 qe1 = (QE1) this;
            if (sRd2.A05() != 2 || !"onMetaData".equals(QE1.A01(sRd2)) || Pxe.A06(sRd2) == 0 || sRd2.A05() != 8) {
                return false;
            }
            HashMap A02 = QE1.A02(sRd2);
            Object obj = A02.get(TraceFieldType.Duration);
            if (obj instanceof Double) {
                double A004 = JTO.A00(obj);
                if (A004 > 0.0d) {
                    qe1.A00 = (long) (A004 * 1000000.0d);
                }
            }
            Object obj2 = A02.get("keyframes");
            if (!(obj2 instanceof Map)) {
                return false;
            }
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if (!(obj3 instanceof List) || !(obj4 instanceof List)) {
                return false;
            }
            List list = (List) obj3;
            List list2 = (List) obj4;
            int size = list2.size();
            qe1.A02 = new long[size];
            qe1.A01 = new long[size];
            for (int i9 = 0; i9 < size; i9++) {
                Object obj5 = list.get(i9);
                Object obj6 = list2.get(i9);
                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                    qe1.A02 = new long[0];
                    qe1.A01 = new long[0];
                    return false;
                }
                qe1.A02[i9] = (long) (JTO.A00(obj6) * 1000000.0d);
                qe1.A01[i9] = AnonymousClass7TE.A0R(obj5);
            }
            return false;
        } else {
            C7460QDz qDz = (C7460QDz) this;
            int i10 = qDz.A00;
            if (i10 == 2) {
                A06 = Pxe.A06(sRd2);
                tjN = qDz.A00;
                tjN.EJf(sRd2, A06);
                i = 0;
            } else {
                int A052 = sRd2.A05();
                i = 0;
                if (A052 == 0 && !qDz.A01) {
                    int A062 = Pxe.A06(sRd2);
                    byte[] bArr3 = new byte[A062];
                    sRd2.A0R(bArr3, 0, A062);
                    C10509RtO A01 = SMh.A01(new ST7(bArr3), false);
                    SOW A005 = SOW.A00();
                    A005.A01("audio/mp4a-latm");
                    A005.A0R = A01.A02;
                    A005.A04 = A01.A00;
                    A005.A0G = A01.A01;
                    A005.A0X = Collections.singletonList(bArr3);
                    qDz.A00.AWO(Pxe.A0O(A005));
                    qDz.A01 = true;
                } else if (i10 != 10 || A052 == 1) {
                    A06 = Pxe.A06(sRd2);
                    tjN = qDz.A00;
                    tjN.EJf(sRd2, A06);
                }
            }
            tjN.EJm((S4h) null, 1, A06, i, j2);
            return true;
        }
        return false;
    }

    public S04(C13900TjN tjN) {
        this.A00 = tjN;
    }
}
