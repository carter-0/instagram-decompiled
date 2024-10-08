package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* renamed from: X.4Ae  reason: invalid class name and case insensitive filesystem */
public final class C261594Ae extends AnonymousClass0T0 implements C261604Af {
    public final StickerTraySurface A00;
    public final SubscriptionStickerDict A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final Float A08;
    public final Float A09;
    public final Float A0A;
    public final Float A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;

    public final C261594Ae FA4(1E9 r1) {
        return this;
    }

    public final C261594Ae FA5(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C261594Ae) {
                C261594Ae r5 = (C261594Ae) obj;
                if (!0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A0K, r5.A0K) || !0qQ.A0K(this.A0L, r5.A0L) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0M, r5.A0M) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0N, r5.A0N) || !0qQ.A0K(this.A0O, r5.A0O) || !0qQ.A0K(this.A0P, r5.A0P) || !0qQ.A0K(this.A0Q, r5.A0Q) || !0qQ.A0K(this.A0R, r5.A0R) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00 || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0H;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A0I;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0J;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0K;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0L;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.A04;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f2 = this.A05;
        int hashCode8 = (hashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str6 = this.A0M;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.A0C;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0D;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A0E;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A0F;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.A0N;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0O;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A0P;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.A0Q;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.A0R;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Float f3 = this.A06;
        int hashCode19 = (hashCode18 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Boolean bool2 = this.A03;
        int hashCode20 = (hashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f4 = this.A07;
        int hashCode21 = (hashCode20 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num5 = this.A0G;
        int hashCode22 = (hashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        SubscriptionStickerDict subscriptionStickerDict = this.A01;
        int hashCode23 = (hashCode22 + (subscriptionStickerDict == null ? 0 : subscriptionStickerDict.hashCode())) * 31;
        StickerTraySurface stickerTraySurface = this.A00;
        int hashCode24 = (hashCode23 + (stickerTraySurface == null ? 0 : stickerTraySurface.hashCode())) * 31;
        Float f5 = this.A08;
        int hashCode25 = (hashCode24 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.A09;
        int hashCode26 = (hashCode25 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.A0A;
        int hashCode27 = (hashCode26 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.A0B;
        if (f8 != null) {
            i = f8.hashCode();
        }
        return hashCode27 + i;
    }

    public final String Ad0() {
        return this.A0H;
    }

    public final String AdC() {
        return this.A0I;
    }

    public final String Auy() {
        return this.A0K;
    }

    public final String AyE() {
        return this.A0L;
    }

    public final Float B1i() {
        return this.A04;
    }

    public final Boolean BB9() {
        return this.A02;
    }

    public final Float BCt() {
        return this.A05;
    }

    public final String BPo() {
        return this.A0N;
    }

    public final String BPq() {
        return this.A0O;
    }

    public final Float Bof() {
        return this.A06;
    }

    public final Boolean Bv3() {
        return this.A03;
    }

    public final Float Byt() {
        return this.A07;
    }

    public final Integer Bzj() {
        return this.A0G;
    }

    public final /* bridge */ /* synthetic */ SubscriptionStickerDictIntf C2V() {
        return this.A01;
    }

    public final StickerTraySurface C3E() {
        return this.A00;
    }

    public final Float CGX() {
        return this.A08;
    }

    public final Float CGt() {
        return this.A09;
    }

    public final Float CHS() {
        return this.A0A;
    }

    public final Float CHZ() {
        return this.A0B;
    }

    public final Integer CTN() {
        return this.A0C;
    }

    public final Integer CUa() {
        return this.A0D;
    }

    public final Integer CZ9() {
        return this.A0E;
    }

    public final Integer CcV() {
        return this.A0F;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryFeedMediaTappableObject", B5S.A00(this));
    }

    public final String getClipsCreationEntryPoint() {
        return this.A0J;
    }

    public final String getId() {
        return this.A0M;
    }

    public final String getMediaId() {
        return this.A0P;
    }

    public final String getMediaType() {
        return this.A0Q;
    }

    public final String getProductType() {
        return this.A0R;
    }

    public C261594Ae(StickerTraySurface stickerTraySurface, SubscriptionStickerDict subscriptionStickerDict, Boolean bool, Boolean bool2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A0H = str;
        this.A0I = str2;
        this.A0J = str3;
        this.A0K = str4;
        this.A0L = str5;
        this.A04 = f;
        this.A02 = bool;
        this.A05 = f2;
        this.A0M = str6;
        this.A0C = num;
        this.A0D = num2;
        this.A0E = num3;
        this.A0F = num4;
        this.A0N = str7;
        this.A0O = str8;
        this.A0P = str9;
        this.A0Q = str10;
        this.A0R = str11;
        this.A06 = f3;
        this.A03 = bool2;
        this.A07 = f4;
        this.A0G = num5;
        this.A01 = subscriptionStickerDict;
        this.A00 = stickerTraySurface;
        this.A08 = f5;
        this.A09 = f6;
        this.A0A = f7;
        this.A0B = f8;
    }

    public final C261604Af E8X(1E9 r1) {
        return this;
    }
}
