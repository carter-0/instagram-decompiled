package X;

import java.util.List;

/* renamed from: X.Juo  reason: case insensitive filesystem */
public final class C60992Juo extends AnonymousClass0T0 {
    public final C62481KgW A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60992Juo) {
                C60992Juo juo = (C60992Juo) obj;
                if (!(0qQ.A0K(this.A01, juo.A01) && this.A04 == juo.A04 && this.A02 == juo.A02 && this.A03 == juo.A03 && this.A00 == juo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A04, AnonymousClass7TE.A0K(this.A01)))));
    }

    public C60992Juo(C62481KgW kgW, List list, boolean z, boolean z2, boolean z3) {
        this.A01 = list;
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A00 = kgW;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewState(audioControlBarItem=");
        A1A.append(this.A01);
        A1A.append(", hasVoiceover=");
        A1A.append(this.A04);
        A1A.append(", hasSoundEffects=");
        A1A.append(this.A02);
        A1A.append(", hasSticker=");
        A1A.append(this.A03);
        A1A.append(", canAddAudioTrackStatus=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
