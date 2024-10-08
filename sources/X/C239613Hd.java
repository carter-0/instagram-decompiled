package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3Hd  reason: invalid class name and case insensitive filesystem */
public final class C239613Hd extends AnonymousClass0T0 implements C239623He {
    public final int A00;
    public final int A01;
    public final String A02;

    public C239613Hd(String str, int i, int i2) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final C239613Hd FF4() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C239613Hd) {
                C239613Hd r5 = (C239613Hd) obj;
                if (!(0qQ.A0K(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00) * 31) + this.A01;
    }

    public final String AZC() {
        return this.A02;
    }

    public final int BGt() {
        return this.A00;
    }

    public final int BWp() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdPodRules", C41920B6v.A00(this));
    }
}
