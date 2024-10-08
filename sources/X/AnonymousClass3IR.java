package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3IR  reason: invalid class name */
public final class AnonymousClass3IR extends AnonymousClass0T0 implements AnonymousClass3IS {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final AnonymousClass3IR FCs(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IR) {
                AnonymousClass3IR r5 = (AnonymousClass3IR) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.A07;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.A03;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A04;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A05;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A06;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    public final String AtD() {
        return this.A00;
    }

    public final List BPz() {
        return this.A07;
    }

    public final String BVq() {
        return this.A03;
    }

    public final String Bir() {
        return this.A04;
    }

    public final String C80() {
        return this.A05;
    }

    public final String C9L() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTThreadsInStoriesUnitAcquisitionNetegoInStory", C44540Cga.A00(this));
    }

    public final String getCtaText() {
        return this.A01;
    }

    public final String getId() {
        return this.A02;
    }

    public AnonymousClass3IR(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A07 = list;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
    }

    public final AnonymousClass3IS E9S(1E9 r1) {
        return this;
    }
}
