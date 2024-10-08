package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* renamed from: X.GmI  reason: case insensitive filesystem */
public final class C53332GmI extends AnonymousClass0T0 {
    public Integer A00;
    public final int A01;
    public final C53436GoT A02;
    public final ClipsACRMidCardSubType A03;
    public final ClipsMidCardSubtype A04;
    public final InstagramMidcardType A05;
    public final C53452Gok A06;
    public final C53461Got A07;
    public final C42110BHo A08;
    public final C2606046i A09;
    public final AudioOverlayTrack A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53332GmI) {
                C53332GmI gmI = (C53332GmI) obj;
                if (!0qQ.A0K(this.A0D, gmI.A0D) || !0qQ.A0K(this.A0H, gmI.A0H) || this.A01 != gmI.A01 || !0qQ.A0K(this.A09, gmI.A09) || !0qQ.A0K(this.A0I, gmI.A0I) || !0qQ.A0K(this.A0A, gmI.A0A) || !0qQ.A0K(this.A0J, gmI.A0J) || !0qQ.A0K(this.A0N, gmI.A0N) || !0qQ.A0K(this.A0M, gmI.A0M) || !0qQ.A0K(this.A08, gmI.A08) || !0qQ.A0K(this.A02, gmI.A02) || !0qQ.A0K(this.A07, gmI.A07) || this.A03 != gmI.A03 || this.A05 != gmI.A05 || this.A04 != gmI.A04 || !0qQ.A0K(this.A0C, gmI.A0C) || !0qQ.A0K(this.A0L, gmI.A0L) || !0qQ.A0K(this.A06, gmI.A06) || !0qQ.A0K(this.A0B, gmI.A0B) || !0qQ.A0K(this.A0O, gmI.A0O) || !0qQ.A0K(this.A0G, gmI.A0G) || !0qQ.A0K(this.A0F, gmI.A0F) || !0qQ.A0K(this.A0E, gmI.A0E) || this.A0K != gmI.A0K) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53332GmI(C53436GoT goT, ClipsACRMidCardSubType clipsACRMidCardSubType, ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C53452Gok gok, C53461Got got, C42110BHo bHo, C2606046i r10, AudioOverlayTrack audioOverlayTrack, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, List list5, List list6, int i, boolean z) {
        List list7 = list;
        AnonymousClass7TG.A1O(str, list7);
        C51970G9q.A1N(instagramMidcardType, 20, clipsMidCardSubtype);
        this.A0D = str;
        this.A0H = list7;
        this.A01 = i;
        this.A09 = r10;
        this.A0I = list2;
        this.A0A = audioOverlayTrack;
        this.A0J = list3;
        this.A0N = str2;
        this.A0M = str3;
        this.A08 = bHo;
        this.A02 = goT;
        this.A07 = got;
        this.A03 = clipsACRMidCardSubType;
        this.A05 = instagramMidcardType;
        this.A04 = clipsMidCardSubtype;
        this.A0C = str4;
        this.A0L = str5;
        this.A06 = gok;
        this.A0B = num;
        this.A0O = str6;
        this.A0G = list4;
        this.A0F = list5;
        this.A0E = list6;
        this.A0K = z;
    }

    public final int hashCode() {
        int A0O2 = AnonymousClass7TE.A0O(this.A0D);
        int A072 = AnonymousClass7TF.A07(this.A05, ((((((((((((((((((G9w.A02(G9w.A01((AnonymousClass7TF.A07(this.A0H, A0O2) + this.A01) * 31) * 31, AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0I)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A0J)) * 31) + AnonymousClass7TG.A0E(this.A0N)) * 31) + AnonymousClass7TG.A0E(this.A0M)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31 * 31) + AnonymousClass7TG.A0C(this.A03)) * 31);
        return AnonymousClass7TF.A09(this.A0K, (((((((((((((((AnonymousClass7TF.A07(this.A04, A072) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0L)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A0O)) * 31) + AnonymousClass7TG.A0C(this.A0G)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31);
    }
}
