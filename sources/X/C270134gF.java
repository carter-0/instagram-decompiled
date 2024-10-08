package X;

import com.instagram.api.schemas.OverlayAdTapDestinationEnum;
import com.instagram.api.schemas.OverlayAdsFormatEnum;

/* renamed from: X.4gF  reason: invalid class name and case insensitive filesystem */
public final class C270134gF extends AnonymousClass0T0 implements C270144gG {
    public final OverlayAdTapDestinationEnum A00;
    public final OverlayAdsFormatEnum A01;
    public final C46254DSj A02;
    public final C46254DSj A03;
    public final C46254DSj A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final String A0K;
    public final String A0L;

    public final C270134gF F7L() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C270134gF) {
                C270134gF r5 = (C270134gF) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0K, r5.A0K) || this.A01 != r5.A01 || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A0L, r5.A0L) || this.A00 != r5.A00 || !0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A05;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A06;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A07;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A08;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.A0F;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        C46254DSj dSj = this.A02;
        int hashCode6 = (hashCode5 + (dSj == null ? 0 : dSj.hashCode())) * 31;
        Boolean bool5 = this.A09;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A0A;
        int hashCode8 = (hashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str = this.A0K;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        OverlayAdsFormatEnum overlayAdsFormatEnum = this.A01;
        int hashCode10 = (hashCode9 + (overlayAdsFormatEnum == null ? 0 : overlayAdsFormatEnum.hashCode())) * 31;
        Integer num2 = this.A0G;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.A0L;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OverlayAdTapDestinationEnum overlayAdTapDestinationEnum = this.A00;
        int hashCode13 = (hashCode12 + (overlayAdTapDestinationEnum == null ? 0 : overlayAdTapDestinationEnum.hashCode())) * 31;
        Integer num3 = this.A0H;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool7 = this.A0B;
        int hashCode15 = (hashCode14 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A0C;
        int hashCode16 = (hashCode15 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.A0D;
        int hashCode17 = (hashCode16 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.A0E;
        int hashCode18 = (hashCode17 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        C46254DSj dSj2 = this.A03;
        int hashCode19 = (hashCode18 + (dSj2 == null ? 0 : dSj2.hashCode())) * 31;
        Integer num4 = this.A0I;
        int hashCode20 = (hashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.A0J;
        int hashCode21 = (hashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        C46254DSj dSj3 = this.A04;
        if (dSj3 != null) {
            i = dSj3.hashCode();
        }
        return hashCode21 + i;
    }

    public C270134gF(OverlayAdTapDestinationEnum overlayAdTapDestinationEnum, OverlayAdsFormatEnum overlayAdsFormatEnum, C46254DSj dSj, C46254DSj dSj2, C46254DSj dSj3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2) {
        this.A05 = bool;
        this.A06 = bool2;
        this.A07 = bool3;
        this.A08 = bool4;
        this.A0F = num;
        this.A02 = dSj;
        this.A09 = bool5;
        this.A0A = bool6;
        this.A0K = str;
        this.A01 = overlayAdsFormatEnum;
        this.A0G = num2;
        this.A0L = str2;
        this.A00 = overlayAdTapDestinationEnum;
        this.A0H = num3;
        this.A0B = bool7;
        this.A0C = bool8;
        this.A0D = bool9;
        this.A0E = bool10;
        this.A03 = dSj2;
        this.A0I = num4;
        this.A0J = num5;
        this.A04 = dSj3;
    }
}
