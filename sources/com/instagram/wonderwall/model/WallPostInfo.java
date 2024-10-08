package com.instagram.wonderwall.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41847B3o;
import X.C41848B3p;
import X.C51972G9s;
import X.C51974G9v;
import X.HMM;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class WallPostInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(11);
    public final int A00;
    public final int A01;
    public final long A02;
    public final User A03;
    public final WallInfo A04;
    public final HMM A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WallPostInfo) {
                WallPostInfo wallPostInfo = (WallPostInfo) obj;
                if (!(0qQ.A0K(this.A06, wallPostInfo.A06) && 0qQ.A0K(this.A03, wallPostInfo.A03) && 0qQ.A0K(this.A04, wallPostInfo.A04) && 0qQ.A0K(this.A07, wallPostInfo.A07) && this.A0B == wallPostInfo.A0B && this.A09 == wallPostInfo.A09 && this.A0A == wallPostInfo.A0A && this.A01 == wallPostInfo.A01 && 0qQ.A0K(this.A08, wallPostInfo.A08) && this.A05 == wallPostInfo.A05 && this.A02 == wallPostInfo.A02 && this.A00 == wallPostInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, i);
        this.A04.writeToParcel(parcel, i);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A01);
        Iterator A1F = C41848B3p.A1F(parcel, this.A08);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        AnonymousClass7TE.A1T(parcel, this.A05);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A00);
    }

    public final boolean A00() {
        HMM hmm = this.A05;
        if (hmm == HMM.DELETING || hmm == HMM.UPLOADING || hmm == HMM.PUBLISHING) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        HMM hmm = this.A05;
        if (hmm == HMM.UPLOADING || hmm == HMM.PUBLISHING || hmm == HMM.UPLOAD_FAILED || hmm == HMM.PUBLISH_FAILED_CAN_RETRY || hmm == HMM.PUBLISH_FAILED) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A06))))));
        return C51972G9s.A07(this.A02, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A08, (AnonymousClass7TF.A09(this.A0A, A092) + this.A01) * 31))) + this.A00;
    }

    public WallPostInfo(User user, WallInfo wallInfo, HMM hmm, String str, String str2, List list, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        C51974G9v.A1P(str, user, wallInfo, str2);
        0qQ.A0B(hmm, 10);
        this.A06 = str;
        this.A03 = user;
        this.A04 = wallInfo;
        this.A07 = str2;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A01 = i;
        this.A08 = list;
        this.A05 = hmm;
        this.A02 = j;
        this.A00 = i2;
    }
}
