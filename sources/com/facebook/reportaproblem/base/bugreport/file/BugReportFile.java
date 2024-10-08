package com.facebook.reportaproblem.base.bugreport.file;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41845B3m;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class BugReportFile implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(46);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                BugReportFile bugReportFile = (BugReportFile) obj;
                if (!this.A00.equals(bugReportFile.A00) || !this.A01.equals(bugReportFile.A01) || !this.A02.equals(bugReportFile.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public BugReportFile(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
