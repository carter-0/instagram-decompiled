package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3kq  reason: invalid class name and case insensitive filesystem */
public final class C250063kq extends AnonymousClass0T0 implements C250073kr {
    public final Integer A00;
    public final Integer A01;

    public final C250063kq F16() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250063kq) {
                C250063kq r5 = (C250063kq) obj;
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

    public final Integer BYX() {
        return this.A00;
    }

    public final Integer BYZ() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCOPRenderingOutput", CVG.A00(this));
    }

    public C250063kq(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
