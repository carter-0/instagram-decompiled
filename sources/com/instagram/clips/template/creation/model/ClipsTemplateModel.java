package com.instagram.clips.template.creation.model;

import X.0qQ;
import X.28D;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C279584ys;
import X.C67211sN;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

public final class ClipsTemplateModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(78);
    public final 28D A00;
    public final C279584ys A01;
    public final User A02;
    public final String A03;
    public final String A04;

    public ClipsTemplateModel(28D r2, C279584ys r3, User user, String str, String str2) {
        0qQ.A0B(r2, 4);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = user;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsTemplateModel) {
                ClipsTemplateModel clipsTemplateModel = (ClipsTemplateModel) obj;
                if (!0qQ.A0K(this.A03, clipsTemplateModel.A03) || !0qQ.A0K(this.A04, clipsTemplateModel.A04) || !0qQ.A0K(this.A01, clipsTemplateModel.A01) || this.A00 != clipsTemplateModel.A00 || !0qQ.A0K(this.A02, clipsTemplateModel.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        C279584ys r0 = this.A01;
        0qQ.A0B(r0, 0);
        parcel.writeString(C67211sN.A00(r0));
        28D r02 = this.A00;
        0qQ.A0B(r02, 0);
        parcel.writeLong(r02.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, ((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31)) + AnonymousClass7TE.A0L(this.A02);
    }
}
