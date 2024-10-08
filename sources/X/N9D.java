package X;

import java.util.List;

public final class N9D extends AnonymousClass0T0 implements C74269Prx {
    public final C69281Nih A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9D) {
                N9D n9d = (N9D) obj;
                if (!(this.A00 == n9d.A00 && 0qQ.A0K(this.A02, n9d.A02) && 0qQ.A0K(this.A01, n9d.A01) && this.A05 == n9d.A05 && this.A03 == n9d.A03 && this.A04 == n9d.A04 && this.A06 == n9d.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A00)))))));
    }

    public N9D(C69281Nih nih, String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1U(nih, list, str);
        this.A00 = nih;
        this.A02 = list;
        this.A01 = str;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A06 = z4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallOutgoingStateModel(state=");
        A1A.append(this.A00);
        A1A.append(", callTargetAvatarUrls=");
        A1A.append(this.A02);
        A1A.append(", callTarget=");
        A1A.append(this.A01);
        A1A.append(", isGroupCall=");
        A1A.append(this.A05);
        A1A.append(", isAudioCall=");
        A1A.append(this.A03);
        A1A.append(", isCreatorAIEmbodiment=");
        A1A.append(this.A04);
        A1A.append(", isUserCreatedAIEmbodiment=");
        return G9t.A1C(A1A, this.A06);
    }
}
