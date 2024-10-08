package X;

import com.facebook.common.dextricks.Constants;
import java.util.List;
import java.util.Map;

/* renamed from: X.N9h  reason: case insensitive filesystem */
public final class C68294N9h extends AnonymousClass0T0 implements C74270Pry {
    public final C59721JVf A00;
    public final N3V A01;
    public final List A02;
    public final List A03;
    public final Map A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68294N9h) {
                C68294N9h n9h = (C68294N9h) obj;
                if (!(this.A05 == n9h.A05 && this.A0F == n9h.A0F && this.A0B == n9h.A0B && this.A0G == n9h.A0G && this.A0E == n9h.A0E && this.A0C == n9h.A0C && this.A0D == n9h.A0D && this.A0A == n9h.A0A && 0qQ.A0K(this.A02, n9h.A02) && 0qQ.A0K(this.A03, n9h.A03) && 0qQ.A0K(this.A04, n9h.A04) && this.A06 == n9h.A06 && 0qQ.A0K(this.A00, n9h.A00) && 0qQ.A0K(this.A01, n9h.A01) && this.A07 == n9h.A07 && this.A08 == n9h.A08 && this.A09 == n9h.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C68294N9h A00(C59721JVf jVf, N3V n3v, C68294N9h n9h, List list, List list2, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        int i2;
        int i3;
        int i4;
        boolean z10 = z9;
        int i5 = i;
        boolean z11 = z;
        boolean z12 = z2;
        boolean z13 = z3;
        boolean z14 = z4;
        boolean z15 = z5;
        List list3 = list;
        List list4 = list2;
        Map map2 = map;
        boolean z16 = z6;
        boolean z17 = z7;
        N3V n3v2 = n3v;
        boolean z18 = z8;
        C68294N9h n9h2 = n9h;
        if ((i & 1) != 0) {
            z11 = n9h2.A05;
        }
        if ((i & 2) != 0) {
            z12 = n9h2.A0F;
        }
        if ((i & 4) != 0) {
            z13 = n9h2.A0B;
        }
        if ((i & 8) != 0) {
            z14 = n9h2.A0G;
        }
        if ((i & 16) != 0) {
            i2 = n9h2.A0E;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            i3 = n9h2.A0C;
        } else {
            i3 = 0;
        }
        if ((i & 64) != 0) {
            i4 = n9h2.A0D;
        } else {
            i4 = 0;
        }
        if ((i5 & 128) != 0) {
            z15 = n9h2.A0A;
        }
        if ((i5 & 256) != 0) {
            list3 = n9h2.A02;
        }
        if ((i5 & 512) != 0) {
            list4 = n9h2.A03;
        }
        if ((i5 & 1024) != 0) {
            map2 = n9h2.A04;
        }
        if ((i5 & C249703kE.FLAG_MOVED) != 0) {
            z16 = n9h2.A06;
        }
        if ((i5 & 4096) != 0) {
            jVf = n9h2.A00;
        }
        if ((i5 & 8192) != 0) {
            n3v2 = n9h2.A01;
        }
        if ((i5 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z17 = n9h2.A07;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            z18 = n9h2.A08;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            z10 = n9h2.A09;
        }
        C51973G9u.A0u(8, list3, list4, map2);
        boolean z19 = z11;
        boolean z20 = z12;
        return new C68294N9h(jVf, n3v2, list3, list4, map2, i2, i3, i4, z19, z20, z13, z14, z15, z16, z17, z18, z10);
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0F, C51965G9l.A05(this.A05)));
        int A072 = AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A0A, (((((AnonymousClass7TF.A09(this.A0G, A092) + this.A0E) * 31) + this.A0C) * 31) + this.A0D) * 31))));
        return DbS.A06(this.A09, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, (((AnonymousClass7TF.A09(this.A06, A072) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31)));
    }

    public C68294N9h(C59721JVf jVf, N3V n3v, List list, List list2, Map map, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A05 = z;
        this.A0F = z2;
        this.A0B = z3;
        this.A0G = z4;
        this.A0E = i;
        this.A0C = i2;
        this.A0D = i3;
        this.A0A = z5;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = map;
        this.A06 = z6;
        this.A00 = jVf;
        this.A01 = n3v;
        this.A07 = z7;
        this.A08 = z8;
        this.A09 = z9;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallParticipantsViewModel(displayCompactly=");
        A1A.append(this.A05);
        A1A.append(", callControlsShown=");
        A1A.append(this.A0F);
        A1A.append(", useFloatingSelfView=");
        A1A.append(this.A0B);
        A1A.append(", detectBadFrames=");
        A1A.append(this.A0G);
        A1A.append(", selfViewTopOffsetPx=");
        A1A.append(this.A0E);
        A1A.append(", selfViewBottomOffsetPx=");
        A1A.append(this.A0C);
        A1A.append(", selfViewSideOffsetPx=");
        A1A.append(this.A0D);
        A1A.append(", showParticipantsView=");
        A1A.append(this.A0A);
        A1A.append(", floatingParticipantsList=");
        A1A.append(this.A02);
        A1A.append(", participantsList=");
        A1A.append(this.A03);
        A1A.append(", participantViewSizes=");
        A1A.append(this.A04);
        A1A.append(", shouldAnimateGridChanges=");
        A1A.append(this.A06);
        A1A.append(", gridLayoutStrategy=");
        A1A.append(this.A00);
        A1A.append(", gridFloatingLayoutConfig=");
        A1A.append(this.A01);
        A1A.append(", shouldRegisterViewPointManager=");
        A1A.append(this.A07);
        A1A.append(", shouldShowParticipantsOverlay=");
        A1A.append(this.A08);
        A1A.append(", shouldSwapPeerAndSelfViews=");
        return G9t.A1C(A1A, this.A09);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C68294N9h() {
        /*
            r18 = this;
            r1 = 0
            r6 = 0
            X.0sn r3 = X.0sn.A00
            X.0sm r5 = X.0Yt.A0E()
            r14 = 1
            r0 = r18
            r2 = r1
            r4 = r3
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68294N9h.<init>():void");
    }
}
