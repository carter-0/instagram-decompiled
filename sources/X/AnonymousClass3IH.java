package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3IH  reason: invalid class name */
public final class AnonymousClass3IH extends AnonymousClass0T0 implements AnonymousClass3II {
    public final BEO A00;
    public final 1Xj A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final AnonymousClass3IH F8w(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IH) {
                AnonymousClass3IH r5 = (AnonymousClass3IH) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        BEO beo = this.A00;
        int i = 0;
        int hashCode = (beo == null ? 0 : beo.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.A02;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        1Xj r0 = this.A01;
        int hashCode4 = (hashCode3 + (r0 == null ? 0 : r0.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A07;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    public final /* bridge */ /* synthetic */ DU7 ApN() {
        return this.A00;
    }

    public final Long BEY() {
        return this.A02;
    }

    public final 1Xj BPf() {
        return this.A01;
    }

    public final String BVq() {
        return this.A04;
    }

    public final String C9L() {
        return this.A07;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShareCommentToStoryNetegoInStory", C44341CdN.A00(this));
    }

    public final String getCtaText() {
        return this.A03;
    }

    public final String getSubtitle() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A06;
    }

    public AnonymousClass3IH(BEO beo, 1Xj r2, Long l, String str, String str2, String str3, String str4, String str5) {
        this.A00 = beo;
        this.A03 = str;
        this.A02 = l;
        this.A01 = r2;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
    }

    public final AnonymousClass3II E8A(1E9 r1) {
        return this;
    }
}
