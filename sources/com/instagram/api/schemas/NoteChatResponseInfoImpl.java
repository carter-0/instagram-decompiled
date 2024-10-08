package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44235Caw;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class NoteChatResponseInfoImpl extends AnonymousClass0T0 implements Parcelable, NoteChatResponseInfo {
    public static final Parcelable.Creator CREATOR = new FK5(96);
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public NoteChatResponseInfoImpl(Integer num, String str, List list, int i, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(list, 5);
        this.A02 = str;
        this.A04 = z;
        this.A01 = num;
        this.A00 = i;
        this.A03 = list;
    }

    public final NoteChatResponseInfoImpl F6o(1E9 r1) {
        return this;
    }

    public final NoteChatResponseInfoImpl F6p(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoteChatResponseInfoImpl) {
                NoteChatResponseInfoImpl noteChatResponseInfoImpl = (NoteChatResponseInfoImpl) obj;
                if (!0qQ.A0K(this.A02, noteChatResponseInfoImpl.A02) || this.A04 != noteChatResponseInfoImpl.A04 || !0qQ.A0K(this.A01, noteChatResponseInfoImpl.A01) || this.A00 != noteChatResponseInfoImpl.A00 || !0qQ.A0K(this.A03, noteChatResponseInfoImpl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(C41847B3o.A00(parcel, this.A01));
        parcel.writeInt(this.A00);
        Iterator A1F = C41848B3p.A1F(parcel, this.A03);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
    }

    public final String B9v() {
        return this.A02;
    }

    public final Integer BLC() {
        return this.A01;
    }

    public final int BWz() {
        return this.A00;
    }

    public final List BxY() {
        return this.A03;
    }

    public final boolean CXA() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTNoteChatResponseInfo", C44235Caw.A00(this));
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return AnonymousClass7TE.A0N(this.A03, (((AnonymousClass7TF.A09(this.A04, A0O) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31);
    }
}
