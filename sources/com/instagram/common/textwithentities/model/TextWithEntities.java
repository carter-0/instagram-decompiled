package com.instagram.common.textwithentities.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.Ci3;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.LinkAction;
import java.util.Iterator;
import java.util.List;

public final class TextWithEntities extends AnonymousClass0T0 implements Parcelable, TextWithEntitiesIntf {
    public static final Parcelable.Creator CREATOR = new W6D(88);
    public final LinkAction A00;
    public final Long A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    public final TextWithEntities FDs() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextWithEntities) {
                TextWithEntities textWithEntities = (TextWithEntities) obj;
                if (!0qQ.A0K(this.A03, textWithEntities.A03) || !0qQ.A0K(this.A04, textWithEntities.A04) || this.A00 != textWithEntities.A00 || !0qQ.A0K(this.A05, textWithEntities.A05) || !0qQ.A0K(this.A02, textWithEntities.A02) || !0qQ.A0K(this.A01, textWithEntities.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        List list2 = this.A04;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G2 = C41848B3p.A1G(parcel, list2);
            while (A1G2.hasNext()) {
                C41847B3o.A1I(parcel, A1G2, i);
            }
        }
        parcel.writeParcelable(this.A00, i);
        List list3 = this.A05;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G3 = C41848B3p.A1G(parcel, list3);
            while (A1G3.hasNext()) {
                C41847B3o.A1I(parcel, A1G3, i);
            }
        }
        parcel.writeString(this.A02);
        C41848B3p.A1K(parcel, this.A01);
    }

    public final List Ap2() {
        return this.A03;
    }

    public final List BHJ() {
        return this.A04;
    }

    public final LinkAction BMj() {
        return this.A00;
    }

    public final List BjD() {
        return this.A05;
    }

    public final Long C7Y() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextWithEntitiesDict", Ci3.A00(this));
    }

    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public TextWithEntities(LinkAction linkAction, Long l, String str, List list, List list2, List list3) {
        this.A03 = list;
        this.A04 = list2;
        this.A00 = linkAction;
        this.A05 = list3;
        this.A02 = str;
        this.A01 = l;
    }
}
