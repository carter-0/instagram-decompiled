package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4jw  reason: invalid class name and case insensitive filesystem */
public final class C272004jw extends AnonymousClass0T0 implements C272014jx {
    public final Float A00;
    public final Integer A01;
    public final String A02;

    public final C272004jw FCL() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C272004jw) {
                C272004jw r5 = (C272004jw) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.A00;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final Integer Arb() {
        return this.A01;
    }

    public final Float B79() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTally", V8N.A00(this));
    }

    public final String getText() {
        return this.A02;
    }

    public C272004jw(Float f, Integer num, String str) {
        this.A01 = num;
        this.A00 = f;
        this.A02 = str;
    }
}
