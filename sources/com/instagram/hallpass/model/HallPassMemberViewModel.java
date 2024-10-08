package com.instagram.hallpass.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.C232262tL;
import X.DbS;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

public final class HallPassMemberViewModel extends AnonymousClass0T0 implements C232262tL, Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(69);
    public final User A00;
    public final boolean A01;

    public HallPassMemberViewModel(User user, boolean z) {
        0qQ.A0B(user, 1);
        this.A00 = user;
        this.A01 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HallPassMemberViewModel) {
                HallPassMemberViewModel hallPassMemberViewModel = (HallPassMemberViewModel) obj;
                if (!0qQ.A0K(this.A00, hallPassMemberViewModel.A00) || this.A01 != hallPassMemberViewModel.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        User user;
        HallPassMemberViewModel hallPassMemberViewModel = (HallPassMemberViewModel) obj;
        String id = this.A00.getId();
        if (hallPassMemberViewModel == null || (user = hallPassMemberViewModel.A00) == null) {
            str = null;
        } else {
            str = user.getId();
        }
        if (!0qQ.A0K(id, str) || this.A01 != hallPassMemberViewModel.A01) {
            return false;
        }
        return true;
    }
}
