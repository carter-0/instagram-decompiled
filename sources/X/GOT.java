package X;

import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;

public final class GOT extends AnonymousClass0T0 {
    public final ContentNoteMetadata A00;
    public final C59490JLo A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GOT) {
                GOT got = (GOT) obj;
                if (!(0qQ.A0K(this.A01, got.A01) && this.A03 == got.A03 && this.A0A == got.A0A && this.A02 == got.A02 && 0qQ.A0K(this.A00, got.A00) && this.A08 == got.A08 && this.A04 == got.A04 && this.A05 == got.A05 && this.A07 == got.A07 && this.A09 == got.A09 && this.A06 == got.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0K(this.A01)));
        Integer num = this.A02;
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0B(num, GOR.A00(num), A092))))))));
    }

    public GOT(ContentNoteMetadata contentNoteMetadata, C59490JLo jLo, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C51972G9s.A1B(jLo, num);
        this.A01 = jLo;
        this.A03 = z;
        this.A0A = z2;
        this.A02 = num;
        this.A00 = contentNoteMetadata;
        this.A08 = z3;
        this.A04 = z4;
        this.A05 = z5;
        this.A07 = z6;
        this.A09 = z7;
        this.A06 = z8;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NotesPogBubbleUiState(content=");
        A1A.append(this.A01);
        A1A.append(", canLikeNote=");
        A1A.append(this.A03);
        A1A.append(", likeAffordanceEnabled=");
        A1A.append(this.A0A);
        A1A.append(", nuxType=");
        Integer num = this.A02;
        if (num != null) {
            str = GOR.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", contentNoteMetadata=");
        A1A.append(this.A00);
        A1A.append(", iconicStylingEnabled=");
        A1A.append(this.A08);
        A1A.append(", iconicAnimationEnabled=");
        A1A.append(this.A04);
        A1A.append(", iconicNeumorphismEnabled=");
        A1A.append(this.A05);
        A1A.append(", iconicShadowEnabled=");
        A1A.append(this.A07);
        A1A.append(", iconicSwRenderingEnabled=");
        A1A.append(this.A09);
        A1A.append(", iconicPseudoShadowEnabled=");
        return G9t.A1C(A1A, this.A06);
    }
}
