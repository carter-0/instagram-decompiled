package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.Mbz  reason: case insensitive filesystem */
public final class C66754Mbz extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final C66776McM A02;
    public final DirectShareTarget A03;
    public final C254743sy A04;
    public final Long A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C66754Mbz(C66776McM mcM, DirectShareTarget directShareTarget, C254743sy r4, Long l, String str, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        0qQ.A0B(list, 3);
        this.A0F = z;
        this.A04 = r4;
        this.A07 = list;
        this.A00 = i;
        this.A0B = z2;
        this.A0G = z3;
        this.A01 = i2;
        this.A06 = str;
        this.A0A = z4;
        this.A0D = z5;
        this.A08 = z6;
        this.A0C = z7;
        this.A09 = z8;
        this.A0E = z9;
        this.A05 = l;
        this.A03 = directShareTarget;
        this.A02 = mcM;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66754Mbz) {
                C66754Mbz mbz = (C66754Mbz) obj;
                if (!(this.A0F == mbz.A0F && 0qQ.A0K(this.A04, mbz.A04) && 0qQ.A0K(this.A07, mbz.A07) && this.A00 == mbz.A00 && this.A0B == mbz.A0B && this.A0G == mbz.A0G && this.A01 == mbz.A01 && 0qQ.A0K(this.A06, mbz.A06) && this.A0A == mbz.A0A && this.A0D == mbz.A0D && this.A08 == mbz.A08 && this.A0C == mbz.A0C && this.A09 == mbz.A09 && this.A0E == mbz.A0E && 0qQ.A0K(this.A05, mbz.A05) && 0qQ.A0K(this.A03, mbz.A03) && 0qQ.A0K(this.A02, mbz.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A04, C51965G9l.A05(this.A0F));
        int A092 = AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A07(this.A07, A072) + this.A00) * 31);
        int A093 = AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0A, (((AnonymousClass7TF.A09(this.A0G, A092) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31)))));
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TF.A09(this.A0E, A093) + AnonymousClass7TE.A0L(this.A05)) * 31));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MultiThreadActionsViewModel(isUnread=");
        A1A.append(this.A0F);
        A1A.append(", unifiedThreadKey=");
        A1A.append(this.A04);
        A1A.append(", members=");
        A1A.append(this.A07);
        A1A.append(", threadLabel=");
        A1A.append(this.A00);
        A1A.append(", isMuted=");
        A1A.append(this.A0B);
        A1A.append(", isVideoCallMuted=");
        A1A.append(this.A0G);
        A1A.append(", threadSubtype=");
        A1A.append(this.A01);
        A1A.append(C273654mx.A00(1057));
        A1A.append(this.A06);
        A1A.append(C273654mx.A00(1084));
        A1A.append(this.A0A);
        A1A.append(C273654mx.A00(1088));
        A1A.append(this.A0D);
        A1A.append(", isGroup=");
        A1A.append(this.A08);
        A1A.append(", isPending=");
        A1A.append(this.A0C);
        A1A.append(C273654mx.A00(1082));
        A1A.append(this.A09);
        A1A.append(", isReactionsMuted=");
        A1A.append(this.A0E);
        A1A.append(", lastReceivedThreadMessageTimestampUs=");
        A1A.append(this.A05);
        A1A.append(", shareTarget=");
        A1A.append(this.A03);
        A1A.append(", threadAvatarViewModel=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
