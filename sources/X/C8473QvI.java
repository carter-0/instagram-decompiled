package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.QvI  reason: case insensitive filesystem */
public final class C8473QvI extends TA9 {
    public final int A00;
    public final C8449Quu A01;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        TA9 ta9 = (TA9) obj;
        int A02 = ta9.A02();
        int i = 5;
        if (5 == A02) {
            C8449Quu quu = this.A01;
            int size = quu.size();
            C8449Quu quu2 = ((C8473QvI) ta9).A01;
            if (size != quu2.size()) {
                i = quu.size();
                A02 = quu2.size();
            } else {
                TM0 A06 = quu.entrySet().A06();
                TM0 A062 = quu2.entrySet().A06();
                do {
                    if (!A06.hasNext() && !A062.hasNext()) {
                        return 0;
                    }
                    Map.Entry A1J = AnonymousClass7TE.A1J(A06);
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A062);
                    int compareTo2 = ((TA9) A1J.getKey()).compareTo(A1J2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((TA9) A1J.getValue()).compareTo(A1J2.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
        }
        return i - A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C8473QvI) obj).A01);
    }

    public final String toString() {
        C8449Quu quu = this.A01;
        if (quu.isEmpty()) {
            return "{}";
        }
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TM0 A06 = quu.entrySet().A06();
        while (A06.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A06);
            A1H.put(A1J.getKey().toString().replace("\n", "\n  "), A1J.getValue().toString().replace("\n", "\n  "));
        }
        StringBuilder A16 = Pxe.A16("{\n  ");
        Iterator A0s = AnonymousClass7TF.A0s(A1H);
        try {
            if (A0s.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s);
                Object key = A1J2.getKey();
                A16.append(Pxj.A0e(key, key));
                while (true) {
                    A16.append(" : ");
                    Object value = A1J2.getValue();
                    A16.append(Pxj.A0e(value, value));
                    if (!A0s.hasNext()) {
                        break;
                    }
                    A16.append(",\n  ");
                    A1J2 = AnonymousClass7TE.A1J(A0s);
                    Object key2 = A1J2.getKey();
                    A16.append(Pxj.A0e(key2, key2));
                }
            }
            return AnonymousClass7TF.A0l("\n}", A16);
        } catch (IOException e) {
            throw Pxe.A0e(e);
        }
    }

    public C8473QvI(C8449Quu quu) {
        quu.getClass();
        this.A01 = quu;
        TM0 A06 = quu.entrySet().A06();
        int i = 0;
        while (A06.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A06);
            int A03 = ((TA9) A1J.getKey()).A03();
            i = i < A03 ? A03 : i;
            int A032 = ((TA9) A1J.getValue()).A03();
            if (i < A032) {
                i = A032;
            }
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (i2 > 8) {
            throw new IOException("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    public final int hashCode() {
        return Pxf.A0A(Pxe.A0l(), this.A01);
    }
}
