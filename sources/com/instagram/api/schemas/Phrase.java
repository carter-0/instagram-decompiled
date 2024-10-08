package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.CbS;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class Phrase extends AnonymousClass0T0 implements Parcelable, PhraseIntf {
    public static final Parcelable.Creator CREATOR = DE6.A00(14);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    public final Phrase F7V() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Phrase) {
                Phrase phrase = (Phrase) obj;
                if (!0qQ.A0K(this.A00, phrase.A00) || !0qQ.A0K(this.A02, phrase.A02) || !0qQ.A0K(this.A01, phrase.A01) || !0qQ.A0K(this.A03, phrase.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        parcel.writeString(this.A02);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            C41847B3o.A1I(parcel, A1G, i);
        }
    }

    public final Integer B1f() {
        return this.A00;
    }

    public final String BcF() {
        return this.A02;
    }

    public final Integer Byo() {
        return this.A01;
    }

    public final List CGh() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTPhrase", CbS.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public Phrase(Integer num, Integer num2, String str, List list) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
        this.A03 = list;
    }
}
