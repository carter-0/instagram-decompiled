package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3xn  reason: invalid class name and case insensitive filesystem */
public final class C257683xn extends AnonymousClass0T0 implements C257693xo {
    public final Boolean A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;
    public final String A04;

    public final C257683xn F36() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257683xn) {
                C257683xn r5 = (C257683xn) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
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
        Long l = this.A02;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.A03;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A04;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final Integer B1a() {
        return this.A01;
    }

    public final Long B6w() {
        return this.A02;
    }

    public final String BaI() {
        return this.A03;
    }

    public final Boolean CSh() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFeedEndSceneDict", C44141CXg.A00(this));
    }

    public final String getSubtitle() {
        return this.A04;
    }

    public C257683xn(Boolean bool, Integer num, Long l, String str, String str2) {
        this.A01 = num;
        this.A02 = l;
        this.A00 = bool;
        this.A03 = str;
        this.A04 = str2;
    }
}
