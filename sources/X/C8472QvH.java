package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.QvH  reason: case insensitive filesystem */
public final class C8472QvH extends TA9 {
    public final int A00;
    public final C8448Qut A01;

    public final int hashCode() {
        return Pxf.A0A(4, this.A01);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        TA9 ta9 = (TA9) obj;
        int A02 = ta9.A02();
        if (4 != A02) {
            return 4 - A02;
        }
        C8448Qut qut = this.A01;
        int size = qut.size();
        C8448Qut qut2 = ((C8472QvH) ta9).A01;
        if (size != qut2.size()) {
            return qut.size() - qut2.size();
        }
        for (int i = 0; i < qut.size(); i++) {
            int compareTo = ((TA9) qut.get(i)).compareTo(qut2.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C8472QvH) obj).A01);
    }

    public final String toString() {
        C8448Qut qut = this.A01;
        if (qut.isEmpty()) {
            return "[]";
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = qut.size();
        for (int i = 0; i < size; i++) {
            A1C.add(qut.get(i).toString().replace("\n", "\n  "));
        }
        StringBuilder A16 = Pxe.A16("[\n  ");
        Iterator it = A1C.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                A16.append(Pxj.A0e(next, next));
                while (it.hasNext()) {
                    A16.append(",\n  ");
                    Object next2 = it.next();
                    A16.append(Pxj.A0e(next2, next2));
                }
            }
            return AnonymousClass7TF.A0l("\n]", A16);
        } catch (IOException e) {
            throw Pxe.A0e(e);
        }
    }

    public C8472QvH(C8448Qut qut) {
        this.A01 = qut;
        int i = 0;
        int i2 = 0;
        while (true) {
            C8448Qut qut2 = this.A01;
            if (i >= qut2.size()) {
                break;
            }
            int A03 = ((TA9) qut2.get(i)).A03();
            if (i2 < A03) {
                i2 = A03;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 > 8) {
            throw new IOException("Exceeded cutoff limit for max depth of cbor value");
        }
    }
}
