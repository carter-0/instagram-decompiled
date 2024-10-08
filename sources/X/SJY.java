package X;

import android.util.Base64;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SJY {
    public int A00;
    public int A01;
    public String A02;
    public List A03;
    public List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SJY sjy = (SJY) obj;
            if (!A00().equals(sjy.A00()) || !this.A02.equals(sjy.A02)) {
                return false;
            }
        }
        return true;
    }

    public final List A00() {
        List list = this.A03;
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                InetAddress inetAddress = null;
                try {
                    inetAddress = InetAddress.getByAddress(Base64.decode(AnonymousClass7TE.A18(it), 0));
                } catch (IllegalArgumentException | UnknownHostException unused) {
                }
                if (inetAddress != null) {
                    A1C.add(inetAddress);
                }
            }
            this.A03 = A1C;
            arrayList = A1C;
        }
        return arrayList;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A02) + A00().hashCode();
    }

    public SJY(String str, List list, int i, int i2) {
        this.A02 = str;
        this.A03 = list;
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1C.add(Base64.encodeToString(((InetAddress) it.next()).getAddress(), 0));
            }
            this.A04 = A1C;
        }
        this.A01 = i;
        this.A00 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AE{'");
        Pxf.A1P(A1A, this.A02);
        A1A.append(", ");
        Pxf.A1O(A1A, A00());
        A1A.append(", ");
        A1A.append(this.A01);
        A1A.append(", ");
        A1A.append(this.A00);
        return Pxg.A0x(A1A);
    }

    public SJY() {
        this("", (List) null, 0, 0);
    }
}
