package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44147CXm;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class FileCandidateImpl extends AnonymousClass0T0 implements Parcelable, FileCandidate {
    public static final Parcelable.Creator CREATOR = DE7.A00(72);
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final FileCandidateImpl F3C() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FileCandidateImpl) {
                FileCandidateImpl fileCandidateImpl = (FileCandidateImpl) obj;
                if (!0qQ.A0K(this.A01, fileCandidateImpl.A01) || !0qQ.A0K(this.A02, fileCandidateImpl.A02) || !0qQ.A0K(this.A03, fileCandidateImpl.A03) || !0qQ.A0K(this.A04, fileCandidateImpl.A04) || !0qQ.A0K(this.A00, fileCandidateImpl.A00) || !0qQ.A0K(this.A05, fileCandidateImpl.A05) || !0qQ.A0K(this.A06, fileCandidateImpl.A06)) {
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
        parcel.writeString(this.A04);
        AnonymousClass7TG.A15(parcel, this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
    }

    public final String B41() {
        return this.A01;
    }

    public final String B5e() {
        return this.A02;
    }

    public final String B5i() {
        return this.A03;
    }

    public final String Bd4() {
        return this.A04;
    }

    public final Long Bd5() {
        return this.A00;
    }

    public final String Bd6() {
        return this.A05;
    }

    public final String C7x() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTFileCandidate", C44147CXm.A00(this));
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }

    public FileCandidateImpl(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = l;
        this.A05 = str5;
        this.A06 = str6;
    }
}
