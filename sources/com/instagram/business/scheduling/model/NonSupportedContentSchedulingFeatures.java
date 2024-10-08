package com.instagram.business.scheduling.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51965G9l;
import X.DbS;
import X.G9t;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class NonSupportedContentSchedulingFeatures extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(61);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
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
    public final boolean A0G;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NonSupportedContentSchedulingFeatures) {
                NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures = (NonSupportedContentSchedulingFeatures) obj;
                if (!(this.A06 == nonSupportedContentSchedulingFeatures.A06 && this.A00 == nonSupportedContentSchedulingFeatures.A00 && this.A07 == nonSupportedContentSchedulingFeatures.A07 && this.A0C == nonSupportedContentSchedulingFeatures.A0C && this.A0F == nonSupportedContentSchedulingFeatures.A0F && this.A02 == nonSupportedContentSchedulingFeatures.A02 && this.A03 == nonSupportedContentSchedulingFeatures.A03 && this.A0G == nonSupportedContentSchedulingFeatures.A0G && this.A04 == nonSupportedContentSchedulingFeatures.A04 && this.A01 == nonSupportedContentSchedulingFeatures.A01 && this.A05 == nonSupportedContentSchedulingFeatures.A05 && this.A0E == nonSupportedContentSchedulingFeatures.A0E && this.A0D == nonSupportedContentSchedulingFeatures.A0D && this.A08 == nonSupportedContentSchedulingFeatures.A08 && this.A0B == nonSupportedContentSchedulingFeatures.A0B && this.A0A == nonSupportedContentSchedulingFeatures.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A0A, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A00, C51965G9l.A05(this.A06))))))))))))))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r20 != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NonSupportedContentSchedulingFeatures(boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r4 = this;
            r4.<init>()
            r4.A06 = r5
            r4.A00 = r6
            r4.A07 = r7
            r4.A0C = r8
            r4.A0F = r9
            r4.A02 = r10
            r4.A03 = r11
            r4.A0G = r12
            r4.A04 = r13
            r4.A01 = r14
            r4.A05 = r15
            r0 = r16
            r4.A0E = r0
            r3 = r17
            r4.A0D = r3
            r2 = r18
            r4.A08 = r2
            r0 = r19
            r4.A0B = r0
            r1 = r20
            r4.A0A = r1
            if (r5 != 0) goto L_0x0048
            if (r6 != 0) goto L_0x0048
            if (r7 != 0) goto L_0x0048
            if (r8 != 0) goto L_0x0048
            if (r9 != 0) goto L_0x0048
            if (r10 != 0) goto L_0x0048
            if (r11 != 0) goto L_0x0048
            if (r12 != 0) goto L_0x0048
            if (r13 != 0) goto L_0x0048
            if (r17 != 0) goto L_0x0048
            if (r18 != 0) goto L_0x0048
            if (r19 != 0) goto L_0x0048
            r0 = 0
            if (r20 == 0) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            r4.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NonSupportedContentSchedulingFeatures(hasFbSharingInfo=");
        A1A.append(this.A06);
        A1A.append(", hasBarcelonaSharingInfo=");
        A1A.append(this.A00);
        A1A.append(", hasFundraiser=");
        A1A.append(this.A07);
        A1A.append(", hasShoppingMetadata=");
        A1A.append(this.A0C);
        A1A.append(", hasUpcomingEvent=");
        A1A.append(this.A0F);
        A1A.append(", hasCollaboratorTagId=");
        A1A.append(this.A02);
        A1A.append(", hasCollaboratorTags=");
        A1A.append(this.A03);
        A1A.append(", hasBrandedContent=");
        A1A.append(this.A0G);
        A1A.append(", hasCustomMediaAudience=");
        A1A.append(this.A04);
        A1A.append(", hasCloseFriendsAudience=");
        A1A.append(this.A01);
        A1A.append(", hasExclusiveAudience=");
        A1A.append(this.A05);
        A1A.append(", hasTrialParams=");
        A1A.append(this.A0E);
        A1A.append(", hasTranslationAndDub=");
        A1A.append(this.A0D);
        A1A.append(", hasGenAiAttributionLabel=");
        A1A.append(this.A08);
        A1A.append(", hasPoll=");
        A1A.append(this.A0B);
        A1A.append(", hasOther=");
        return G9t.A1C(A1A, this.A0A);
    }
}
