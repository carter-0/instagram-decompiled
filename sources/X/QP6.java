package X;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class QP6 extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public String A06;
    public final int A07;

    public QP6(String str, String str2, Map map, Set set, Set set2, Set set3, Set set4, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A07 = 1;
        0sl r1 = 0sl.A00;
        this.A07 = 1;
        0qQ.A0B(r1, 1);
        this.A00 = r1;
        this.A03 = r1;
        this.A02 = r1;
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A06 = null;
    }

    public final boolean equals(Object obj) {
        int i;
        Object obj2;
        Object obj3;
        switch (this.A07) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof QP6) {
                    QP6 qp6 = (QP6) obj;
                    if (qp6.A07 == 0 && 0qQ.A0K(this.A05, qp6.A05) && 0qQ.A0K(this.A06, qp6.A06) && 0qQ.A0K(this.A01, qp6.A01) && 0qQ.A0K(this.A04, qp6.A04) && 0qQ.A0K(this.A03, qp6.A03) && 0qQ.A0K(this.A00, qp6.A00)) {
                        obj2 = this.A02;
                        obj3 = qp6.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof QP6) {
                    QP6 qp62 = (QP6) obj;
                    if (qp62.A07 == 1 && 0qQ.A0K(this.A00, qp62.A00) && 0qQ.A0K(this.A03, qp62.A03) && 0qQ.A0K(this.A02, qp62.A02) && 0qQ.A0K(this.A05, qp62.A05) && 0qQ.A0K(this.A04, qp62.A04) && 0qQ.A0K(this.A01, qp62.A01)) {
                        obj2 = this.A06;
                        obj3 = qp62.A06;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 2:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof QP6)) {
                    return false;
                }
                QP6 qp63 = (QP6) obj;
                if (qp63.A07 != 2 || this.A04 != qp63.A04 || !0qQ.A0K(this.A05, qp63.A05) || !0qQ.A0K(this.A03, qp63.A03) || !0qQ.A0K(this.A06, qp63.A06) || !0qQ.A0K(this.A01, qp63.A01) || !0qQ.A0K(this.A00, qp63.A00) || this.A02 != qp63.A02) {
                    return false;
                }
                return true;
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof QP6)) {
            return false;
        }
        QP6 qp64 = (QP6) obj;
        if (qp64.A07 != i || !0qQ.A0K(this.A00, qp64.A00) || !0qQ.A0K(this.A01, qp64.A01) || !0qQ.A0K(this.A05, qp64.A05) || !0qQ.A0K(this.A02, qp64.A02) || !0qQ.A0K(this.A03, qp64.A03) || !0qQ.A0K(this.A06, qp64.A06)) {
            return false;
        }
        obj2 = this.A04;
        obj3 = qp64.A04;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C;
        int A08;
        int A0L;
        switch (this.A07) {
            case 0:
                return AnonymousClass7TE.A0N(this.A02, (((((((((AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31);
            case 1:
                A08 = (((((AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A00))) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31;
                A0L = C41845B3m.A00(this.A06);
                break;
            case 2:
                A08 = (((((((AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0K(this.A04)) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31;
                A0L = AnonymousClass7TE.A0L(this.A02);
                break;
            case 4:
                A0C = (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02);
                break;
            default:
                A0C = (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02);
                break;
        }
        A08 = ((((A0C * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31;
        A0L = AnonymousClass7TE.A0L(this.A04);
        return A08 + A0L;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public QP6(X.C8913RFg r10, java.lang.String r11, java.lang.String r12, java.util.List r13, java.util.List r14, java.util.List r15, int r16) {
        /*
            r9 = this;
            r8 = r15
            r7 = r14
            r5 = r12
            r6 = r13
            r2 = 0
            r0 = 2
            r1 = r9
            r9.A07 = r0
            r0 = r16 & 4
            if (r0 == 0) goto L_0x000f
            X.0sn r6 = X.0sn.A00
        L_0x000f:
            r0 = r16 & 8
            if (r0 == 0) goto L_0x0014
            r5 = r2
        L_0x0014:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x001a
            X.0sn r7 = X.0sn.A00
        L_0x001a:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x0020
            X.0sn r8 = X.0sn.A00
        L_0x0020:
            r3 = r10
            r4 = r11
            r1.<init>((X.C8918RFl) r2, (X.C8913RFg) r3, (java.lang.String) r4, (java.lang.String) r5, (java.util.List) r6, (java.util.List) r7, (java.util.List) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QP6.<init>(X.RFg, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, int):void");
    }

    public QP6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A05 = str;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A06 = str2;
        this.A04 = obj5;
    }

    public QP6(C8918RFl rFl, C8913RFg rFg, String str, String str2, List list, List list2, List list3) {
        this.A07 = 2;
        0qQ.A0B(str, 2);
        this.A04 = rFg;
        this.A05 = str;
        this.A03 = list;
        this.A06 = str2;
        this.A01 = list2;
        this.A00 = list3;
        this.A02 = rFl;
    }

    public QP6(QOt qOt, C7607QOp qOp, C7607QOp qOp2, C7607QOp qOp3, String str, String str2, Map map) {
        this.A07 = 0;
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A06 = str2;
        this.A01 = qOp;
        this.A04 = qOp2;
        this.A03 = qOp3;
        this.A00 = qOt;
        this.A02 = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QP6() {
        this((QOt) null, (C7607QOp) null, (C7607QOp) null, (C7607QOp) null, AnonymousClass7TF.A0c(), (String) null, (Map) 0Yt.A0E());
        this.A07 = 0;
    }
}
