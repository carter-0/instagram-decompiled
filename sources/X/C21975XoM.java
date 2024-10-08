package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.XoM  reason: case insensitive filesystem */
public final class C21975XoM {
    public static final C21975XoM A02 = new C21975XoM(new C21284XSp[0]);
    public int A00;
    public final ImmutableList A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A01.equals(((C21975XoM) obj).A01);
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = this.A01.hashCode();
        this.A00 = hashCode;
        return hashCode;
    }

    public C21975XoM(C21284XSp... xSpArr) {
        this.A01 = ImmutableList.copyOf((Object[]) xSpArr);
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.A01;
            if (i < immutableList.size()) {
                int i2 = i + 1;
                if (i2 < immutableList.size()) {
                    immutableList.get(i);
                    immutableList.get(i2);
                    throw AnonymousClass7TE.A11("equals");
                }
                i = i2;
            } else {
                return;
            }
        }
    }
}
