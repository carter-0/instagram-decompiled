package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3tm  reason: invalid class name and case insensitive filesystem */
public final class C255223tm extends AnonymousClass0T0 implements C255233tn {
    public final String A00;
    public final String A01;

    public C255223tm(String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final C255223tm F5R() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C255223tm) {
                C255223tm r5 = (C255223tm) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkedEntityUser", C46338Dcg.A00(this));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getUsername() {
        return this.A01;
    }
}
