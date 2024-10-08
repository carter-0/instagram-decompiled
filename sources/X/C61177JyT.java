package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JyT  reason: case insensitive filesystem */
public final class C61177JyT extends AnonymousClass0T0 implements C232262tL {
    public boolean A00 = true;
    public final long A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final 0sP A08;

    public C61177JyT(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, 0sP r9, long j) {
        0qQ.A0B(str5, 9);
        this.A04 = str;
        this.A02 = imageUrl;
        this.A05 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A08 = r9;
        this.A01 = j;
        this.A03 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61177JyT) {
                C61177JyT jyT = (C61177JyT) obj;
                if (!0qQ.A0K(this.A04, jyT.A04) || !0qQ.A0K(this.A02, jyT.A02) || !0qQ.A0K(this.A05, jyT.A05) || !0qQ.A0K(this.A07, jyT.A07) || !0qQ.A0K(this.A06, jyT.A06) || !0qQ.A0K(this.A08, jyT.A08) || this.A00 != jyT.A00 || this.A01 != jyT.A01 || !0qQ.A0K(this.A03, jyT.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, C51972G9s.A07(this.A01, AnonymousClass7TF.A09(this.A00, AnonymousClass7TF.A07(this.A08, ((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + C41845B3m.A00(this.A06)) * 31))));
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IgLiveReactionItemUiModel(emojiUnicode=");
        A1A.append(this.A04);
        A1A.append(", stickerReactionUrl=");
        A1A.append(this.A02);
        A1A.append(", stickerId=");
        A1A.append(this.A05);
        A1A.append(", stickerTemplateId=");
        A1A.append(this.A07);
        A1A.append(", stickerMediaType=");
        A1A.append(this.A06);
        A1A.append(", onReactionSelected=");
        A1A.append(this.A08);
        A1A.append(", shouldAnimatePopIn=");
        A1A.append(this.A00);
        A1A.append(AnonymousClass000.A00(2010));
        A1A.append(this.A01);
        A1A.append(C66579MXk.A00(45));
        return C51975G9x.A0i(this.A03, A1A);
    }
}
