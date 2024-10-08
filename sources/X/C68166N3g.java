package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.rtc.views.omnigrid.GridItemType;
import com.instagram.common.typedurl.ImageUrl;
import org.webrtc.RendererCommon;

/* renamed from: X.N3g  reason: case insensitive filesystem */
public final class C68166N3g extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final long A02;
    public final GridItemType A03;
    public final ImageUrl A04;
    public final OMJ A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final RendererCommon.ScalingType A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68166N3g) {
                C68166N3g n3g = (C68166N3g) obj;
                if (!(0qQ.A0K(this.A09, n3g.A09) && 0qQ.A0K(this.A04, n3g.A04) && this.A0I == n3g.A0I && this.A0H == n3g.A0H && this.A0K == n3g.A0K && this.A0N == n3g.A0N && this.A0E == n3g.A0E && this.A0F == n3g.A0F && 0qQ.A0K(this.A05, n3g.A05) && 0qQ.A0K(this.A08, n3g.A08) && this.A0B == n3g.A0B && this.A06 == n3g.A06 && Float.compare(this.A00, n3g.A00) == 0 && this.A0C == n3g.A0C && this.A0G == n3g.A0G && this.A0L == n3g.A0L && this.A0J == n3g.A0J && this.A0M == n3g.A0M && this.A0D == n3g.A0D && 0qQ.A0K(this.A0A, n3g.A0A) && this.A03 == n3g.A03 && this.A02 == n3g.A02 && this.A01 == n3g.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C68166N3g(GridItemType gridItemType, ImageUrl imageUrl, OMJ omj, Integer num, String str, String str2, String str3, RendererCommon.ScalingType scalingType, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        long j;
        Integer num2 = num;
        float f2 = f;
        String str4 = str3;
        int i3 = i2;
        RendererCommon.ScalingType scalingType2 = (i3 & 1024) != 0 ? null : scalingType;
        num2 = (i3 & C249703kE.FLAG_MOVED) != 0 ? AnonymousClass05K.A00 : num2;
        f2 = (i3 & 4096) != 0 ? 0.5f : f2;
        boolean A1Q = C51966G9m.A1Q(i3 & 8192, z7);
        boolean A1Q2 = C51966G9m.A1Q(i3 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET, z8);
        boolean A1Q3 = C51966G9m.A1Q(32768 & i2, z9);
        boolean A1Q4 = C51966G9m.A1Q(65536 & i2, z10);
        boolean A1Q5 = C51966G9m.A1Q(131072 & i2, z11);
        boolean A1Q6 = C51966G9m.A1Q(262144 & i2, z12);
        str4 = (524288 & i2) != 0 ? null : str4;
        String str5 = str;
        if ((2097152 & i2) != 0) {
            j = Long.parseLong(str5);
        } else {
            j = 0;
        }
        ImageUrl imageUrl2 = imageUrl;
        AnonymousClass7TG.A1O(str5, imageUrl2);
        0qQ.A0B(num2, 12);
        this.A09 = str5;
        this.A04 = imageUrl2;
        this.A0I = z;
        this.A0H = z2;
        this.A0K = z3;
        boolean z13 = z4;
        this.A0N = z13;
        this.A0E = z5;
        this.A0F = z6;
        this.A05 = omj;
        this.A08 = str2;
        this.A0B = scalingType2;
        this.A06 = num2;
        this.A00 = f2;
        this.A0C = A1Q;
        this.A0G = A1Q2;
        this.A0L = A1Q3;
        this.A0J = A1Q4;
        this.A0M = A1Q5;
        this.A0D = A1Q6;
        this.A0A = str4;
        this.A03 = gridItemType;
        this.A02 = j;
        this.A01 = i;
        this.A07 = C51967G9n.A0l(z13 ? 1 : 0);
    }

    public final int hashCode() {
        String str;
        int A082 = (AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0O(this.A09)))))))) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31;
        int intValue = this.A06.intValue();
        switch (intValue) {
            case 1:
                str = "COMPACT";
                break;
            case 2:
                str = "BADGE";
                break;
            default:
                str = "REGULAR";
                break;
        }
        int A092 = AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A09(this.A0J, AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A00(C51971G9r.A0F(str, intValue, A082), this.A00))))));
        return (C51972G9s.A07(this.A02, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TF.A09(this.A0D, A092) + AnonymousClass7TG.A0E(this.A0A)) * 31)) + this.A01) * 31;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallParticipantViewModel(participantId=");
        A1A.append(this.A09);
        A1A.append(", avatarUrl=");
        A1A.append(this.A04);
        A1A.append(", showBackground=");
        A1A.append(this.A0I);
        A1A.append(", showAvatar=");
        A1A.append(this.A0H);
        A1A.append(", showMuted=");
        A1A.append(this.A0K);
        A1A.append(", showVideo=");
        A1A.append(this.A0N);
        A1A.append(", enableTouch=");
        A1A.append(this.A0E);
        A1A.append(", enableViewTap=");
        A1A.append(this.A0F);
        A1A.append(", attachVideo=");
        A1A.append(this.A05);
        A1A.append(", cellContentDescription=");
        A1A.append(this.A08);
        A1A.append(", scalingType=");
        A1A.append(this.A0B);
        A1A.append(", muteIndicatorStyle=");
        Integer num = this.A06;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "COMPACT";
                    break;
                case 2:
                    str = "BADGE";
                    break;
                default:
                    str = "REGULAR";
                    break;
            }
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", avatarSizeRatio=");
        A1A.append(this.A00);
        A1A.append(", attachInstructionText=");
        A1A.append(this.A0C);
        A1A.append(", scaleInstructionText=");
        A1A.append(this.A0G);
        A1A.append(", showReconnectingBackground=");
        A1A.append(this.A0L);
        A1A.append(", showCellOutline=");
        A1A.append(this.A0J);
        A1A.append(", showScreenShareButton=");
        A1A.append(this.A0M);
        A1A.append(", darkenBackgroundForLegibility=");
        A1A.append(this.A0D);
        A1A.append(", textBelowAvatar=");
        A1A.append(this.A0A);
        A1A.append(", itemType=");
        A1A.append(this.A03);
        A1A.append(", id=");
        A1A.append(this.A02);
        A1A.append(", viewType=");
        A1A.append(this.A01);
        A1A.append(", extras=");
        return AnonymousClass7TG.A0n((Object) null, A1A);
    }
}
