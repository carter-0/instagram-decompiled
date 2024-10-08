package X;

import com.instagram.api.schemas.AdproObjectiveTypesEnum;
import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.InstagramMediaProductType;
import java.util.List;

public final class UL2 extends AnonymousClass0T0 {
    public final AdproObjectiveTypesEnum A00;
    public final BoostedActionStatus A01;
    public final CallToActionType A02;
    public final InstagramMediaProductType A03;
    public final UKM A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Long A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final List A0K;
    public final boolean A0L;
    public final AdproRegulatedCategory A0M;
    public final Integer A0N;
    public final Long A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UL2) {
                UL2 ul2 = (UL2) obj;
                if (this.A01 != ul2.A01 || !0qQ.A0K(this.A0E, ul2.A0E) || this.A02 != ul2.A02 || !0qQ.A0K(this.A0P, ul2.A0P) || !0qQ.A0K(this.A0N, ul2.A0N) || !0qQ.A0K(this.A05, ul2.A05) || !0qQ.A0K(this.A0F, ul2.A0F) || !0qQ.A0K(this.A0G, ul2.A0G) || !0qQ.A0K(this.A0Q, ul2.A0Q) || !0qQ.A0K(this.A06, ul2.A06) || !0qQ.A0K(this.A04, ul2.A04) || !0qQ.A0K(this.A0K, ul2.A0K) || !0qQ.A0K(this.A0R, ul2.A0R) || this.A03 != ul2.A03 || this.A00 != ul2.A00 || !0qQ.A0K(this.A0H, ul2.A0H) || this.A0M != ul2.A0M || !0qQ.A0K(this.A07, ul2.A07) || !0qQ.A0K(this.A08, ul2.A08) || this.A0L != ul2.A0L || !0qQ.A0K(this.A09, ul2.A09) || !0qQ.A0K(this.A0D, ul2.A0D) || !0qQ.A0K(this.A0O, ul2.A0O) || !0qQ.A0K(this.A0I, ul2.A0I) || !0qQ.A0K(this.A0A, ul2.A0A) || !0qQ.A0K(this.A0S, ul2.A0S) || !0qQ.A0K(this.A0B, ul2.A0B) || !0qQ.A0K(this.A0C, ul2.A0C) || !0qQ.A0K(this.A0J, ul2.A0J)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((AnonymousClass7TF.A09(this.A0L, ((((((((((((((((((((((((((((((((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A0P)) * 31) + AnonymousClass7TG.A0C(this.A0N)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0E(this.A0G)) * 31) + AnonymousClass7TG.A0E(this.A0Q)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A0K)) * 31) + AnonymousClass7TG.A0E(this.A0R)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A0H)) * 31) + AnonymousClass7TG.A0C(this.A0M)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A0O)) * 31) + AnonymousClass7TG.A0E(this.A0I)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0S)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + C41845B3m.A00(this.A0J);
    }

    public UL2(AdproObjectiveTypesEnum adproObjectiveTypesEnum, AdproRegulatedCategory adproRegulatedCategory, BoostedActionStatus boostedActionStatus, CallToActionType callToActionType, InstagramMediaProductType instagramMediaProductType, UKM ukm, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, boolean z) {
        this.A01 = boostedActionStatus;
        this.A0E = str;
        this.A02 = callToActionType;
        this.A0P = str2;
        this.A0N = num;
        this.A05 = num2;
        this.A0F = str3;
        this.A0G = str4;
        this.A0Q = str5;
        this.A06 = num3;
        this.A04 = ukm;
        this.A0K = list;
        this.A0R = str6;
        this.A03 = instagramMediaProductType;
        this.A00 = adproObjectiveTypesEnum;
        this.A0H = str7;
        this.A0M = adproRegulatedCategory;
        this.A07 = num4;
        this.A08 = num5;
        this.A0L = z;
        this.A09 = num6;
        this.A0D = l;
        this.A0O = l2;
        this.A0I = str8;
        this.A0A = num7;
        this.A0S = str9;
        this.A0B = num8;
        this.A0C = num9;
        this.A0J = str10;
    }
}
