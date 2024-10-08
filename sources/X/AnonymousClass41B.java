package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.41B  reason: invalid class name */
public final class AnonymousClass41B extends AnonymousClass0T0 implements AnonymousClass41C {
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;

    public final AnonymousClass41B F1U() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass41B) {
                AnonymousClass41B r5 = (AnonymousClass41B) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.A02;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String B3u() {
        return this.A03;
    }

    public final Integer B8J() {
        return this.A02;
    }

    public final Boolean BvJ() {
        return this.A00;
    }

    public final Boolean CCX() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsDeliveryParameters", C41860B4e.A00(this));
    }

    public AnonymousClass41B(Boolean bool, Boolean bool2, Integer num, String str) {
        this.A03 = str;
        this.A02 = num;
        this.A00 = bool;
        this.A01 = bool2;
    }
}
