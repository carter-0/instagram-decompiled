package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.GLe  reason: case insensitive filesystem */
public final class C52263GLe extends HPG {
    public final int A00;
    public final C298835u7 A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final HashMap A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C52263GLe(C298835u7 r2, Long l, Long l2, String str, String str2, String str3, HashMap hashMap, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        0qQ.A0B(list, 2);
        this.A01 = r2;
        this.A09 = list;
        this.A00 = i;
        this.A0D = z;
        this.A0G = z2;
        this.A0F = z3;
        this.A0I = z4;
        this.A0E = z5;
        this.A0H = z6;
        this.A0B = z7;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = hashMap;
        this.A08 = list2;
        this.A04 = str3;
        this.A02 = l;
        this.A03 = l2;
        this.A0A = z8;
        this.A0C = AnonymousClass7TF.A1Q(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52263GLe) {
                C52263GLe gLe = (C52263GLe) obj;
                if (!0qQ.A0K(this.A01, gLe.A01) || !0qQ.A0K(this.A09, gLe.A09) || this.A00 != gLe.A00 || this.A0D != gLe.A0D || this.A0G != gLe.A0G || this.A0F != gLe.A0F || this.A0I != gLe.A0I || this.A0E != gLe.A0E || this.A0H != gLe.A0H || this.A0B != gLe.A0B || !0qQ.A0K(this.A05, gLe.A05) || !0qQ.A0K(this.A06, gLe.A06) || !0qQ.A0K(this.A07, gLe.A07) || !0qQ.A0K(this.A08, gLe.A08) || !0qQ.A0K(this.A04, gLe.A04) || !0qQ.A0K(this.A02, gLe.A02) || !0qQ.A0K(this.A03, gLe.A03) || this.A0A != gLe.A0A) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        int A092 = AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0D, (AnonymousClass7TF.A07(this.A09, A0K) + this.A00) * 31))))));
        return DbS.A06(this.A0A, (((((((((((((AnonymousClass7TF.A09(this.A0B, A092) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SuccessState(responseObject=");
        A1A.append(this.A01);
        A1A.append(", clipsItems=");
        A1A.append(this.A09);
        A1A.append(", chunkIndex=");
        A1A.append(this.A00);
        A1A.append(", isFirstPage=");
        A1A.append(this.A0D);
        A1A.append(", isRefreshing=");
        A1A.append(this.A0G);
        A1A.append(", isPrefetchResponse=");
        A1A.append(this.A0F);
        A1A.append(", isStreaming=");
        A1A.append(this.A0I);
        A1A.append(", isForward=");
        A1A.append(this.A0E);
        A1A.append(", isRequestedFromCache=");
        A1A.append(this.A0H);
        A1A.append(", isEagerFetch=");
        A1A.append(this.A0B);
        A1A.append(C273654mx.A00(1130));
        A1A.append(this.A05);
        A1A.append(", responseContainerModule=");
        A1A.append(this.A06);
        A1A.append(", brandSafetySeverityMap=");
        A1A.append(this.A07);
        A1A.append(", brandSafetyBlocklist=");
        A1A.append(this.A08);
        A1A.append(", cacheKeyUsed=");
        A1A.append(this.A04);
        A1A.append(", cachedResponseTimeStamp=");
        A1A.append(this.A02);
        A1A.append(", responseTimestamp=");
        A1A.append(this.A03);
        A1A.append(AnonymousClass000.A00(2024));
        return G9t.A1C(A1A, this.A0A);
    }
}
