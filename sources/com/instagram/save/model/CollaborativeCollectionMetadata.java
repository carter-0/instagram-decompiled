package com.instagram.save.model;

import X.0qQ;
import X.0sn;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class CollaborativeCollectionMetadata extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(20);
    public String A00 = "";
    public String A01 = "";
    public List A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CollaborativeCollectionMetadata) {
                CollaborativeCollectionMetadata collaborativeCollectionMetadata = (CollaborativeCollectionMetadata) obj;
                if (!0qQ.A0K(this.A02, collaborativeCollectionMetadata.A02) || !0qQ.A0K(this.A01, collaborativeCollectionMetadata.A01) || !0qQ.A0K(this.A00, collaborativeCollectionMetadata.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A02);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public CollaborativeCollectionMetadata() {
        0sn r2 = 0sn.A00;
        0qQ.A0B(r2, 1);
        this.A02 = r2;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0K(this.A02)));
    }
}
