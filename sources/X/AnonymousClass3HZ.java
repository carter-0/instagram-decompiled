package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ACRType;
import com.instagram.model.reels.ReelType;
import java.util.List;

/* renamed from: X.3HZ  reason: invalid class name */
public final class AnonymousClass3HZ extends AnonymousClass0T0 implements C239583Ha {
    public final ACRType A00;
    public final DT1 A01;
    public final 1Xj A02;
    public final ReelType A03;
    public final Long A04;
    public final Long A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    public final AnonymousClass3HZ FEg(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3HZ) {
                AnonymousClass3HZ r5 = (AnonymousClass3HZ) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A06, r5.A06) || this.A03 != r5.A03 || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A0C, r5.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ACRType aCRType = this.A00;
        int i = 0;
        int hashCode = (aCRType == null ? 0 : aCRType.hashCode()) * 31;
        Long l = this.A04;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.A07;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.A05;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        1Xj r0 = this.A02;
        int hashCode8 = (hashCode7 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Long l3 = this.A06;
        int hashCode9 = (hashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        ReelType reelType = this.A03;
        int hashCode10 = (hashCode9 + (reelType == null ? 0 : reelType.hashCode())) * 31;
        List list = this.A0D;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.A0B;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DT1 dt1 = this.A01;
        int hashCode13 = (hashCode12 + (dt1 == null ? 0 : dt1.hashCode())) * 31;
        String str6 = this.A0C;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode13 + i;
    }

    public final ACRType AY6() {
        return this.A00;
    }

    public final Long AY9() {
        return this.A04;
    }

    public final String AYU() {
        return this.A07;
    }

    public final String AqW() {
        return this.A09;
    }

    public final String Aqd() {
        return this.A0A;
    }

    public final Long BEY() {
        return this.A05;
    }

    public final 1Xj Bf4() {
        return this.A02;
    }

    public final Long Bl4() {
        return this.A06;
    }

    public final ReelType Bl5() {
        return this.A03;
    }

    public final List Bxo() {
        return this.A0D;
    }

    public final DT1 C9A() {
        return this.A01;
    }

    public final String C9L() {
        return this.A0C;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAutoCreatedReelsNetegoInStory", C44868CmK.A00(this));
    }

    public final String getAudioClusterId() {
        return this.A08;
    }

    public final String getTitle() {
        return this.A0B;
    }

    public AnonymousClass3HZ(ACRType aCRType, DT1 dt1, 1Xj r3, ReelType reelType, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A00 = aCRType;
        this.A04 = l;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A05 = l2;
        this.A02 = r3;
        this.A06 = l3;
        this.A03 = reelType;
        this.A0D = list;
        this.A0B = str5;
        this.A01 = dt1;
        this.A0C = str6;
    }

    public final C239583Ha E9s(1E9 r1) {
        return this;
    }
}
