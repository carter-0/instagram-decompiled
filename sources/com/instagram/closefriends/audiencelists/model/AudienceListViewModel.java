package com.instagram.closefriends.audiencelists.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C232262tL;
import X.C41847B3o;
import X.C41848B3p;
import X.C51974G9v;
import X.DbS;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AudienceListViewModel extends AnonymousClass0T0 implements C232262tL, Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(79);
    public final int A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceListViewModel) {
                AudienceListViewModel audienceListViewModel = (AudienceListViewModel) obj;
                if (!(0qQ.A0K(this.A01, audienceListViewModel.A01) && 0qQ.A0K(this.A02, audienceListViewModel.A02) && this.A00 == audienceListViewModel.A00 && 0qQ.A0K(this.A03, audienceListViewModel.A03) && this.A05 == audienceListViewModel.A05 && this.A06 == audienceListViewModel.A06 && this.A04 == audienceListViewModel.A04)) {
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
        parcel.writeInt(this.A00);
        Iterator A1F = C41848B3p.A1F(parcel, this.A03);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        return DbS.A06(this.A04, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TF.A08(this.A02, A0O) + this.A00) * 31))));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        AudienceListViewModel audienceListViewModel = (AudienceListViewModel) obj;
        String str2 = this.A01;
        if (audienceListViewModel != null) {
            str = audienceListViewModel.A01;
        } else {
            str = null;
        }
        if (0qQ.A0K(str2, str) && 0qQ.A0K(this.A02, audienceListViewModel.A02) && this.A00 == audienceListViewModel.A00 && 0qQ.A0K(this.A03, audienceListViewModel.A03) && this.A05 == audienceListViewModel.A05 && this.A06 == audienceListViewModel.A06 && this.A04 == audienceListViewModel.A04) {
            return true;
        }
        return false;
    }

    public AudienceListViewModel(String str, String str2, List list, int i, boolean z, boolean z2, boolean z3) {
        C51974G9v.A1L(str, str2, list);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = list;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
    }
}
