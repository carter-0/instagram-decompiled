package com.instagram.direct.fragment.thread.poll.view;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.C232262tL;
import X.C41848B3p;
import X.C51974G9v;
import X.C51975G9x;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class PollMessageOptionViewModel extends AnonymousClass0T0 implements C232262tL, Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(72);
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PollMessageOptionViewModel) {
                PollMessageOptionViewModel pollMessageOptionViewModel = (PollMessageOptionViewModel) obj;
                if (this.A01 != pollMessageOptionViewModel.A01 || !0qQ.A0K(this.A03, pollMessageOptionViewModel.A03) || !0qQ.A0K(this.A04, pollMessageOptionViewModel.A04) || !0qQ.A0K(this.A02, pollMessageOptionViewModel.A02) || this.A06 != pollMessageOptionViewModel.A06 || !0qQ.A0K(this.A05, pollMessageOptionViewModel.A05) || this.A00 != pollMessageOptionViewModel.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A05);
        while (A1F.hasNext()) {
            ((PollMessageVoterInfoViewModel) A1F.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, C51975G9x.A03(this.A01)))))) + this.A00;
    }

    public PollMessageOptionViewModel(String str, String str2, String str3, List list, int i, long j, boolean z) {
        C51974G9v.A1M(str, str2, str3);
        this.A01 = j;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A06 = z;
        this.A05 = list;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
