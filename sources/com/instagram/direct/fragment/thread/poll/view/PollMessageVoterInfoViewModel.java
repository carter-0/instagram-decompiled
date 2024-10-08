package com.instagram.direct.fragment.thread.poll.view;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C232262tL;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class PollMessageVoterInfoViewModel extends AnonymousClass0T0 implements C232262tL, Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(73);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public PollMessageVoterInfoViewModel(ImageUrl imageUrl, String str, String str2, String str3) {
        AnonymousClass7TG.A0w(1, str, str3, imageUrl);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PollMessageVoterInfoViewModel) {
                PollMessageVoterInfoViewModel pollMessageVoterInfoViewModel = (PollMessageVoterInfoViewModel) obj;
                if (!0qQ.A0K(this.A01, pollMessageVoterInfoViewModel.A01) || !0qQ.A0K(this.A02, pollMessageVoterInfoViewModel.A02) || !0qQ.A0K(this.A03, pollMessageVoterInfoViewModel.A03) || !0qQ.A0K(this.A00, pollMessageVoterInfoViewModel.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A03, (AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
