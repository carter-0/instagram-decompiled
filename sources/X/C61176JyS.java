package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JyS  reason: case insensitive filesystem */
public final class C61176JyS extends AnonymousClass0T0 implements C232262tL {
    public final C53368Gms A00;
    public final C317966o8 A01;
    public final C318046oG A02;
    public final 0sL A03;
    public final boolean A04;

    public C61176JyS(C53368Gms gms, C317966o8 r3, C318046oG r4, 0sL r5, boolean z) {
        0qQ.A0B(r5, 5);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = gms;
        this.A04 = z;
        this.A03 = r5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61176JyS) {
                C61176JyS jyS = (C61176JyS) obj;
                if (!0qQ.A0K(this.A01, jyS.A01) || this.A02 != jyS.A02 || !0qQ.A0K(this.A00, jyS.A00) || this.A04 != jyS.A04 || !0qQ.A0K(this.A03, jyS.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A01.A0S;
        0qQ.A07(str);
        return str;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)))));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        ImageUrl imageUrl;
        C317966o8 r0;
        C61176JyS jyS = (C61176JyS) obj;
        ImageUrl imageUrl2 = this.A01.A0H;
        if (jyS == null || (r0 = jyS.A01) == null) {
            imageUrl = null;
        } else {
            imageUrl = r0.A0H;
        }
        return 0qQ.A0K(imageUrl2, imageUrl);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AvatarStickerItemViewModel(sticker=");
        A1A.append(this.A01);
        A1A.append(", stickerType=");
        A1A.append(this.A02);
        A1A.append(", rankingInfo=");
        A1A.append(this.A00);
        A1A.append(", isRestrictedLogging=");
        A1A.append(this.A04);
        A1A.append(", onAvatarStickerSelected=");
        A1A.append(this.A03);
        A1A.append(", directStickerTrayAvatarStaticStickerItem=");
        return AnonymousClass7TG.A0n((Object) null, A1A);
    }
}
