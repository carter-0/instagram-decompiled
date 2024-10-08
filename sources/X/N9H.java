package X;

import java.util.Map;

public final class N9H extends AnonymousClass0T0 implements C74269Prx {
    public final long A00;
    public final N9E A01;
    public final Map A02;
    public final Map A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9H) {
                N9H n9h = (N9H) obj;
                if (!(0qQ.A0K(this.A01, n9h.A01) && 0qQ.A0K(this.A03, n9h.A03) && this.A0F == n9h.A0F && this.A05 == n9h.A05 && this.A06 == n9h.A06 && this.A0D == n9h.A0D && this.A0B == n9h.A0B && this.A0C == n9h.A0C && this.A08 == n9h.A08 && this.A00 == n9h.A00 && this.A09 == n9h.A09 && this.A04 == n9h.A04 && this.A07 == n9h.A07 && 0qQ.A0K(this.A02, n9h.A02) && this.A0E == n9h.A0E && this.A0A == n9h.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A0A, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A09, C51972G9s.A07(this.A00, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A01))))))))))))))));
    }

    public N9H(N9E n9e, Map map, Map map2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A01 = n9e;
        this.A03 = map;
        this.A0F = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A0D = z4;
        this.A0B = z5;
        this.A0C = z6;
        this.A08 = z7;
        this.A00 = j;
        this.A09 = z8;
        this.A04 = z9;
        this.A07 = z10;
        this.A02 = map2;
        this.A0E = z11;
        this.A0A = z12;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallParticipantsModel(self=");
        A1A.append(this.A01);
        A1A.append(", remoteParticipants=");
        A1A.append(this.A03);
        A1A.append(", useFloatingSelfView=");
        A1A.append(this.A0F);
        A1A.append(", detectBadFrames=");
        A1A.append(this.A05);
        A1A.append(", hasInteropUsers=");
        A1A.append(this.A06);
        A1A.append(", showParticipantsView=");
        A1A.append(this.A0D);
        A1A.append(", isE2eeEncrypted=");
        A1A.append(this.A0B);
        A1A.append(", isUserAloneInRoom=");
        A1A.append(this.A0C);
        A1A.append(", isAvatarApplied=");
        A1A.append(this.A08);
        A1A.append(", reconnectionCount=");
        A1A.append(this.A00);
        A1A.append(", isCallOnGoing=");
        A1A.append(this.A09);
        A1A.append(", areUserIdsEimu=");
        A1A.append(this.A04);
        A1A.append(", hasVerifiedUser=");
        A1A.append(this.A07);
        A1A.append(", participantInfoMap=");
        A1A.append(this.A02);
        A1A.append(", useFloatingParticipantsView=");
        A1A.append(this.A0E);
        A1A.append(", isCreatorAIEmbodiment=");
        return G9t.A1C(A1A, this.A0A);
    }
}
