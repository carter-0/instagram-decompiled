package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardOverlayType;
import java.util.List;

/* renamed from: X.Goh  reason: case insensitive filesystem */
public final class C53449Goh extends AnonymousClass0T0 implements JS6 {
    public final MidCardClipsClickedAction A00;
    public final C53450Goi A01;
    public final C53450Goi A02;
    public final C53451Goj A03;
    public final MidCardOverlayType A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final C53450Goi A0C;

    public final JS6 E7d(1E9 r1) {
        return this;
    }

    public final C53449Goh F6H(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53449Goh) {
                C53449Goh goh = (C53449Goh) obj;
                if (!0qQ.A0K(this.A05, goh.A05) || this.A00 != goh.A00 || !0qQ.A0K(this.A07, goh.A07) || !0qQ.A0K(this.A08, goh.A08) || !0qQ.A0K(this.A09, goh.A09) || !0qQ.A0K(this.A0A, goh.A0A) || this.A04 != goh.A04 || !0qQ.A0K(this.A0B, goh.A0B) || !0qQ.A0K(this.A03, goh.A03) || !0qQ.A0K(this.A01, goh.A01) || !0qQ.A0K(this.A0C, goh.A0C) || !0qQ.A0K(this.A02, goh.A02) || !0qQ.A0K(this.A06, goh.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0E(this.A05) * 31)));
        C53450Goi goi = this.A01;
        return C41845B3m.A01(this.A06, (((AnonymousClass7TF.A07(goi, (((((((AnonymousClass7TF.A07(this.A09, A072) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }

    public C53449Goh(MidCardClipsClickedAction midCardClipsClickedAction, C53450Goi goi, C53450Goi goi2, C53450Goi goi3, C53451Goj goj, MidCardOverlayType midCardOverlayType, String str, String str2, List list, List list2, List list3, List list4, List list5) {
        C51974G9v.A1M(midCardClipsClickedAction, list, list2);
        C51969G9p.A1N(list3, 5, goi);
        0qQ.A0B(str2, 13);
        this.A05 = str;
        this.A00 = midCardClipsClickedAction;
        this.A07 = list;
        this.A08 = list2;
        this.A09 = list3;
        this.A0A = list4;
        this.A04 = midCardOverlayType;
        this.A0B = list5;
        this.A03 = goj;
        this.A01 = goi;
        this.A0C = goi2;
        this.A02 = goi3;
        this.A06 = str2;
    }
}
