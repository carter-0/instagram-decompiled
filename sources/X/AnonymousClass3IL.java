package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3IL  reason: invalid class name */
public final class AnonymousClass3IL extends AnonymousClass0T0 implements AnonymousClass3IM {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final AnonymousClass3IL F97(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IL) {
                AnonymousClass3IL r5 = (AnonymousClass3IL) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
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
        Long l = this.A04;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.A05;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.A08;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.A01;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A02;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A03;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode8 + i;
    }

    public final Integer BX3() {
        return this.A00;
    }

    public final Long BxC() {
        return this.A04;
    }

    public final String BxD() {
        return this.A05;
    }

    public final String BxE() {
        return this.A06;
    }

    public final String BxF() {
        return this.A07;
    }

    public final List Bzx() {
        return this.A08;
    }

    public final Integer C8c() {
        return this.A01;
    }

    public final Integer C8m() {
        return this.A02;
    }

    public final Integer C8n() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSnapshotData", C44361Cdh.A00(this));
    }

    public AnonymousClass3IL(Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, List list) {
        this.A00 = num;
        this.A04 = l;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = list;
        this.A01 = num2;
        this.A02 = num3;
        this.A03 = num4;
    }

    public final AnonymousClass3IM E8D(1E9 r1) {
        return this;
    }
}
