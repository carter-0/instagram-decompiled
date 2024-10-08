package com.instagram.hallpass.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C232262tL;
import X.C41847B3o;
import X.C41848B3p;
import X.DbS;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class HallPassViewModel extends AnonymousClass0T0 implements C232262tL, Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(70);
    public boolean A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HallPassViewModel) {
                HallPassViewModel hallPassViewModel = (HallPassViewModel) obj;
                if (!0qQ.A0K(this.A04, hallPassViewModel.A04) || !0qQ.A0K(this.A05, hallPassViewModel.A05) || !0qQ.A0K(this.A03, hallPassViewModel.A03) || this.A01 != hallPassViewModel.A01 || this.A02 != hallPassViewModel.A02 || !0qQ.A0K(this.A06, hallPassViewModel.A06) || this.A00 != hallPassViewModel.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        Iterator A1F = C41848B3p.A1F(parcel, this.A06);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A04));
        return DbS.A06(this.A00, AnonymousClass7TF.A07(this.A06, (((AnonymousClass7TF.A08(this.A03, A08) + this.A01) * 31) + this.A02) * 31));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        HallPassViewModel hallPassViewModel = (HallPassViewModel) obj;
        String str2 = this.A04;
        if (hallPassViewModel != null) {
            str = hallPassViewModel.A04;
        } else {
            str = null;
        }
        if (!0qQ.A0K(str2, str) || !0qQ.A0K(this.A05, hallPassViewModel.A05) || this.A01 != hallPassViewModel.A01 || this.A02 != hallPassViewModel.A02 || !0qQ.A0K(this.A06, hallPassViewModel.A06) || this.A00 != hallPassViewModel.A00) {
            return false;
        }
        return true;
    }

    public HallPassViewModel(String str, String str2, String str3, List list, int i, int i2, boolean z) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(list, 6);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = i;
        this.A02 = i2;
        this.A06 = list;
        this.A00 = z;
    }
}
