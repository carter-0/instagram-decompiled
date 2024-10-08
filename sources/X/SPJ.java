package X;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

public abstract class SPJ {
    public static Map A04 = AnonymousClass7TE.A1E();
    public static final SPJ A05;
    public static final SPJ A06;
    public static final SPJ A07;
    public static final SPJ A08;
    public static final SPJ A09;
    public static final SPJ A0A;
    public static final SPJ A0B;
    public static final SPJ A0C;
    public static final SPJ A0D;
    public final int A00;
    public final C8871RDn A01;
    public final C8904REw A02;
    public final EnumSet A03;

    public final SPJ A02(C8871RDn rDn) {
        C8871RDn rDn2 = rDn;
        if (this.A01 == rDn) {
            return this;
        }
        EnumSet enumSet = this.A03;
        if (enumSet.contains(rDn)) {
            return new R7V(rDn2, this, this.A02, enumSet, this.A00);
        }
        throw Pxf.A0X("The ASN.1 tag %s does not support encoding as %s", new Object[]{this, rDn});
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SPJ spj = (SPJ) obj;
            if (!(this.A00 == spj.A00 && this.A02 == spj.A02 && this.A01 == spj.A01)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.RR3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.RR3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.RR3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.RR3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.RR3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.RR3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.RR3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.RR3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v16, types: [X.RR3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.RR3, java.lang.Object] */
    public final RR3 A01(S58 s58) {
        if (!(this instanceof R7W)) {
            return ((R7V) this).A00.A01(s58);
        }
        switch (((R7W) this).A00) {
            case 0:
                ? obj = new Object();
                obj.A00 = s58;
                return obj;
            case 1:
                ? obj2 = new Object();
                obj2.A00 = s58;
                return obj2;
            case 2:
                ? obj3 = new Object();
                obj3.A00 = s58;
                return obj3;
            case 3:
                ? obj4 = new Object();
                obj4.A00 = s58;
                return obj4;
            case 4:
                ? obj5 = new Object();
                obj5.A00 = s58;
                return obj5;
            case 5:
                ? obj6 = new Object();
                obj6.A00 = s58;
                return obj6;
            case 6:
                ? obj7 = new Object();
                obj7.A00 = s58;
                return obj7;
            case 7:
                ? obj8 = new Object();
                obj8.A00 = s58;
                return obj8;
            case 8:
                ? obj9 = new Object();
                obj9.A00 = s58;
                return obj9;
            default:
                ? obj10 = new Object();
                obj10.A00 = s58;
                return obj10;
        }
    }

    public final int hashCode() {
        return Pxf.A0B(this.A02, Integer.valueOf(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("ASN1Tag[");
        A16.append(this.A02);
        A16.append(",");
        A16.append(this.A01);
        A16.append(",");
        A16.append(this.A00);
        return Pxg.A0w(A16);
    }

    static {
        C8904REw rEw = C8904REw.Universal;
        C8871RDn rDn = C8871RDn.Primitive;
        R7W r7w = new R7W(rDn, rEw, 1);
        A06 = r7w;
        R7W r7w2 = new R7W(rDn, rEw, 2);
        A08 = r7w2;
        C8871RDn rDn2 = C8871RDn.Constructed;
        R7W r7w3 = new R7W(rDn, rEw, EnumSet.of(rDn, rDn2));
        A05 = r7w3;
        R7W r7w4 = new R7W(rEw, EnumSet.of(rDn, rDn2));
        A0B = r7w4;
        R7W r7w5 = new R7W(rDn, rEw, 5);
        A09 = r7w5;
        R7W r7w6 = new R7W(rDn, rEw, 6);
        A0A = r7w6;
        R7W r7w7 = new R7W(rDn, rEw, 7);
        A07 = r7w7;
        R7W r7w8 = new R7W(rDn2, rEw, 8);
        A0D = r7w8;
        R7W r7w9 = new R7W(rDn2, rEw, 9);
        A0C = r7w9;
        C51967G9n.A1O(r7w, A04, r7w.A00);
        C51967G9n.A1O(r7w2, A04, r7w2.A00);
        C51967G9n.A1O(r7w3, A04, r7w3.A00);
        C51967G9n.A1O(r7w4, A04, r7w4.A00);
        C51967G9n.A1O(r7w5, A04, r7w5.A00);
        C51967G9n.A1O(r7w6, A04, r7w6.A00);
        C51967G9n.A1O(r7w7, A04, r7w7.A00);
        C51967G9n.A1O(r7w8, A04, r7w8.A00);
        C51967G9n.A1O(r7w9, A04, r7w9.A00);
    }

    public SPJ(C8871RDn rDn, C8904REw rEw, EnumSet enumSet, int i) {
        this.A02 = rEw;
        this.A00 = i;
        this.A03 = enumSet;
        this.A01 = rDn;
    }

    public static SPJ A00(C8904REw rEw, int i) {
        int ordinal = rEw.ordinal();
        if (ordinal == 0) {
            Iterator A0v = AnonymousClass7TF.A0v(A04);
            while (A0v.hasNext()) {
                SPJ spj = (SPJ) A0v.next();
                if (spj.A00 == i && rEw == spj.A02) {
                    return spj;
                }
            }
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return new R7W(rEw, EnumSet.of(C8871RDn.Primitive, C8871RDn.Constructed), i);
        }
        throw new RuntimeException(String.format("Unknown ASN.1 tag '%s:%s' found (%s)", new Object[]{rEw, Integer.valueOf(i), A04}));
    }
}
