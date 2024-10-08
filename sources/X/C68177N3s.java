package X;

import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.N3s  reason: case insensitive filesystem */
public final class C68177N3s extends AnonymousClass0T0 {
    public final int A00;
    public final CreativeConfigIntf A01;
    public final C48117EWj A02;
    public final C255783ui A03;
    public final PromptStickerModel A04;
    public final C3Q A05;
    public final C3R A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C68177N3s() {
        this((CreativeConfigIntf) null, C48117EWj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, (C255783ui) null, (PromptStickerModel) null, (C3Q) null, (C3R) null, (String) null, (String) null, (String) null, 1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68177N3s) {
                C68177N3s n3s = (C68177N3s) obj;
                if (!0qQ.A0K(this.A05, n3s.A05) || !0qQ.A0K(this.A08, n3s.A08) || !0qQ.A0K(this.A07, n3s.A07) || this.A00 != n3s.A00 || !0qQ.A0K(this.A09, n3s.A09) || !0qQ.A0K(this.A06, n3s.A06) || this.A02 != n3s.A02 || !0qQ.A0K(this.A04, n3s.A04) || !0qQ.A0K(this.A03, n3s.A03) || !0qQ.A0K(this.A01, n3s.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A07(this.A02, ((((((((((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C68177N3s(CreativeConfigIntf creativeConfigIntf, C48117EWj eWj, C255783ui r3, PromptStickerModel promptStickerModel, C3Q c3q, C3R c3r, String str, String str2, String str3, int i) {
        this.A05 = c3q;
        this.A08 = str;
        this.A07 = str2;
        this.A00 = i;
        this.A09 = str3;
        this.A06 = c3r;
        this.A02 = eWj;
        this.A04 = promptStickerModel;
        this.A03 = r3;
        this.A01 = creativeConfigIntf;
    }
}
