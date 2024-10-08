package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4lf  reason: invalid class name and case insensitive filesystem */
public final class C272934lf extends AnonymousClass0T0 implements C272944lg {
    public final Long A00;
    public final Long A01;

    public final C272934lf F8Q() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C272934lf) {
                C272934lf r5 = (C272934lf) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Long l = this.A00;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.A01;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public final Long B1j() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTQuietModePauseWindow", C44297Ccf.A00(this));
    }

    public final Long getStartTimestamp() {
        return this.A01;
    }

    public C272934lf(Long l, Long l2) {
        this.A00 = l;
        this.A01 = l2;
    }
}
