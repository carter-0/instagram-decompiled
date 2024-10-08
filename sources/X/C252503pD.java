package X;

import java.util.Iterator;

/* renamed from: X.3pD  reason: invalid class name and case insensitive filesystem */
public abstract class C252503pD extends C252513pE implements Iterable {
    public int A02() {
        return A03(0);
    }

    public int A03(int i) {
        return 0;
    }

    public C252503pD A04(String str) {
        return (C252503pD) ((C268194cw) this).A00.get(str);
    }

    public String A07() {
        return null;
    }

    public boolean A0A() {
        return false;
    }

    public abstract boolean equals(Object obj);

    public abstract String toString();

    public C252503pD A05(String str) {
        C252503pD r0 = (C252503pD) ((C268194cw) this).A00.get("hostText");
        if (r0 == null) {
            return C8238Qkl.A00;
        }
        return r0;
    }

    public String A06() {
        return "";
    }

    public Iterator A08() {
        if (this instanceof C268194cw) {
            return ((C268194cw) this).A00.values().iterator();
        }
        return C269574fL.A00;
    }

    public final Iterator A09() {
        if (this instanceof C268194cw) {
            return ((C268194cw) this).A00.keySet().iterator();
        }
        return C269574fL.A00;
    }

    public final Iterator iterator() {
        return A08();
    }
}
