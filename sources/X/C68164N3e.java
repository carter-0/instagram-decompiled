package X;

import java.util.List;

/* renamed from: X.N3e  reason: case insensitive filesystem */
public final class C68164N3e extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C15048ULb A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68164N3e) {
                C68164N3e n3e = (C68164N3e) obj;
                if (!(0qQ.A0K(this.A08, n3e.A08) && this.A06 == n3e.A06 && this.A05 == n3e.A05 && this.A0B == n3e.A0B && this.A0F == n3e.A0F && this.A0I == n3e.A0I && this.A0E == n3e.A0E && this.A09 == n3e.A09 && this.A0A == n3e.A0A && Float.compare(this.A00, n3e.A00) == 0 && this.A0G == n3e.A0G && this.A0D == n3e.A0D && this.A02 == n3e.A02 && this.A03 == n3e.A03 && this.A04 == n3e.A04 && this.A01 == n3e.A01 && 0qQ.A0K(this.A07, n3e.A07) && this.A0C == n3e.A0C && this.A0H == n3e.A0H)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A00(AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0B, (((AnonymousClass7TE.A0K(this.A08) + this.A06) * 31) + this.A05) * 31)))))), this.A00));
        return DbS.A06(this.A0H, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A07(this.A07, (((((((AnonymousClass7TF.A09(this.A0D, A092) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31) + this.A01) * 31) * 31));
    }

    public C68164N3e(C15048ULb uLb, List list, float f, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A08 = list;
        this.A06 = i;
        this.A05 = i2;
        this.A0B = z;
        this.A0F = z2;
        this.A0I = z3;
        this.A0E = z4;
        this.A09 = z5;
        this.A0A = z6;
        this.A00 = f;
        this.A0G = z7;
        this.A0D = z8;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A01 = i6;
        this.A07 = uLb;
        this.A0C = z9;
        this.A0H = z10;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OmniGridViewModel(items=");
        A1A.append(this.A08);
        A1A.append(", systemTopInset=");
        A1A.append(this.A06);
        A1A.append(", systemBottomInset=");
        A1A.append(this.A05);
        A1A.append(", callControlsVisible=");
        A1A.append(this.A0B);
        A1A.append(", disableFloatingSelfView=");
        A1A.append(this.A0F);
        A1A.append(", minimized=");
        A1A.append(this.A0I);
        A1A.append(", coWatchEnabled=");
        A1A.append(this.A0E);
        A1A.append(", bottomSheetExpanded=");
        A1A.append(this.A09);
        A1A.append(", bottomSheetShowing=");
        A1A.append(this.A0A);
        A1A.append(", bottomSheetSlideOffset=");
        A1A.append(this.A00);
        A1A.append(", isARTrayShowing=");
        A1A.append(this.A0G);
        A1A.append(", chicletEnabled=");
        A1A.append(this.A0D);
        A1A.append(", cowatchE2eeDisclaimerHeight=");
        A1A.append(this.A02);
        A1A.append(", effectChicletHeight=");
        A1A.append(this.A03);
        A1A.append(", effectChicletTopSpacing=");
        A1A.append(this.A04);
        A1A.append(", arEffectsTrayHeight=");
        A1A.append(this.A01);
        A1A.append(", controlsHeightVOffset=");
        A1A.append(this.A07);
        A1A.append(", gridScaleDimensions=");
        A1A.append((Object) null);
        A1A.append(", cameraTogetherEnabled=");
        A1A.append(this.A0C);
        A1A.append(", isCreatorAIEmbodiment=");
        return G9t.A1C(A1A, this.A0H);
    }
}
