package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3xk  reason: invalid class name and case insensitive filesystem */
public final class C257653xk extends AnonymousClass0T0 implements C257663xl {
    public final Integer A00;
    public final Integer A01;

    public final C257653xk F17() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257653xk) {
                C257653xk r5 = (C257653xk) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public final Integer AwA() {
        return this.A00;
    }

    public final Integer BDZ() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCTAInfoDict", CVH.A00(this));
    }

    public C257653xk(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
