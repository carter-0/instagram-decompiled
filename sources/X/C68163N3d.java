package X;

/* renamed from: X.N3d  reason: case insensitive filesystem */
public final class C68163N3d extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C46730DkJ A04;
    public final String A05 = "universal";
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68163N3d) {
                C68163N3d n3d = (C68163N3d) obj;
                if (!(0qQ.A0K(this.A05, n3d.A05) && this.A09 == n3d.A09 && 0qQ.A0K(this.A06, n3d.A06) && 0qQ.A0K(this.A07, n3d.A07) && this.A03 == n3d.A03 && this.A02 == n3d.A02 && this.A01 == n3d.A01 && this.A00 == n3d.A00 && this.A0E == n3d.A0E && this.A0B == n3d.A0B && this.A0C == n3d.A0C && this.A0A == n3d.A0A && this.A0F == n3d.A0F && this.A0D == n3d.A0D && 0qQ.A0K(this.A08, n3d.A08) && 0qQ.A0K(this.A04, n3d.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C68163N3d(C46730DkJ dkJ, String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A09 = z;
        this.A06 = "direct_user_search_nullstate";
        this.A07 = "direct_user_search_keypressed";
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A0E = z2;
        this.A0B = z3;
        this.A0C = z4;
        this.A0A = z5;
        this.A0F = z6;
        this.A0D = z7;
        this.A08 = str;
        this.A04 = dkJ;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A09(this.A09, AnonymousClass7TE.A0O(this.A05)));
        int A092 = AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(false, AnonymousClass7TF.A09(false, AnonymousClass7TF.A09(this.A0E, (((((((AnonymousClass7TF.A08(this.A07, A082) + this.A03) * 31 * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31))));
        int A002 = C54732HQn.A00();
        return ((((AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A09(this.A0C, (A092 + A002) * 31) + A002) * 31))) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31 * 31) + AnonymousClass7TG.A0C(this.A04)) * 31 * 31;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SearchResultProviderConfiguration(mode=");
        A1A.append(this.A05);
        A1A.append(", includeThreads=");
        A1A.append(this.A09);
        A1A.append(", nullStateBanyanSurfaceName=");
        A1A.append(this.A06);
        A1A.append(", queryStateBanyanSurfaceName=");
        A1A.append(this.A07);
        A1A.append(", maxIgResults=");
        A1A.append(this.A03);
        A1A.append(", maxFbResults=");
        A1A.append(0);
        A1A.append(", maxIgBusResults=");
        A1A.append(this.A02);
        A1A.append(", maxIbcResults=");
        A1A.append(this.A01);
        A1A.append(", maxAiAgentResults=");
        A1A.append(this.A00);
        A1A.append(", isMsysEnabled=");
        A1A.append(this.A0E);
        A1A.append(", msysRecipientsOnly=");
        A1A.append(false);
        A1A.append(", excludeThreadWithoutCurrentUser=");
        A1A.append(false);
        A1A.append(", isContentSearchEnabled=");
        A1A.append(this.A0B);
        C51975G9x.A1G(A1A, ", isReshareFlywheelEnabled=");
        A1A.append(", isIBCInNullStateEnabled=");
        A1A.append(this.A0C);
        C51975G9x.A1G(A1A, ", isRTROnShareSheetEnabled=");
        A1A.append(", isAiAgentEnabled=");
        A1A.append(this.A0A);
        A1A.append(", isNullStatePromptsEnabled=");
        A1A.append(this.A0F);
        A1A.append(", isMetaAiTypeaheadPromptsEnabled=");
        A1A.append(this.A0D);
        A1A.append(", posterId=");
        A1A.append((String) null);
        A1A.append(Pxd.A00(50));
        A1A.append(this.A08);
        A1A.append(", directShareSheetViewModel=");
        A1A.append((Object) null);
        A1A.append(", inviteContactViewModel=");
        A1A.append(this.A04);
        A1A.append(", contentId=");
        A1A.append((String) null);
        A1A.append(", sharingLifeCycleOwner=");
        return AnonymousClass7TG.A0n((Object) null, A1A);
    }
}
