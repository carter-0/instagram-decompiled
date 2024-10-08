package X;

import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.InstagramMediaProductType;
import java.util.List;

/* renamed from: X.9c1  reason: invalid class name and case insensitive filesystem */
public final class C381599c1 extends AnonymousClass0T0 {
    public final BoostedActionStatus A00;
    public final InstagramMediaProductType A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Long A0A;
    public final String A0B;
    public final boolean A0C;
    public final AdproRegulatedCategory A0D;
    public final CallToActionType A0E;
    public final UKM A0F;
    public final Integer A0G;
    public final Long A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List A0R;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381599c1) {
                C381599c1 r5 = (C381599c1) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A0I, r5.A0I) || this.A0E != r5.A0E || !0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A0K, r5.A0K) || !0qQ.A0K(this.A0L, r5.A0L) || !0qQ.A0K(this.A0M, r5.A0M) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0R, r5.A0R) || !0qQ.A0K(this.A0N, r5.A0N) || this.A01 != r5.A01 || !0qQ.A0K(this.A0O, r5.A0O) || this.A0D != r5.A0D || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || this.A0C != r5.A0C || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0P, r5.A0P) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0Q, r5.A0Q)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A092 = (((((((((((((((AnonymousClass7TF.A09(this.A0C, ((((((((((((((((((((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A0I)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A0J)) * 31) + AnonymousClass7TG.A0C(this.A0G)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A0K)) * 31) + AnonymousClass7TG.A0E(this.A0L)) * 31) + AnonymousClass7TG.A0E(this.A0M)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A0R)) * 31) + AnonymousClass7TG.A0E(this.A0N)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A0O)) * 31) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A0H)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0P)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31;
        String str = this.A0Q;
        if (str != null) {
            i = str.hashCode();
        }
        return A092 + i;
    }

    public C381599c1(AdproRegulatedCategory adproRegulatedCategory, BoostedActionStatus boostedActionStatus, CallToActionType callToActionType, InstagramMediaProductType instagramMediaProductType, UKM ukm, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, boolean z) {
        this.A00 = boostedActionStatus;
        this.A0I = str;
        this.A0E = callToActionType;
        this.A0J = str2;
        this.A0G = num;
        this.A02 = num2;
        this.A0K = str3;
        this.A0L = str4;
        this.A0M = str5;
        this.A03 = num3;
        this.A0F = ukm;
        this.A0R = list;
        this.A0N = str6;
        this.A01 = instagramMediaProductType;
        this.A0O = str7;
        this.A0D = adproRegulatedCategory;
        this.A04 = num4;
        this.A05 = num5;
        this.A0C = z;
        this.A06 = num6;
        this.A0H = l;
        this.A0A = l2;
        this.A0B = str8;
        this.A07 = num7;
        this.A0P = str9;
        this.A08 = num8;
        this.A09 = num9;
        this.A0Q = str10;
    }
}
