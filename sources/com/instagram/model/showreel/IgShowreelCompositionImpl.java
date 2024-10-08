package com.instagram.model.showreel;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376399Hv;
import X.C55057HbS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class IgShowreelCompositionImpl extends AnonymousClass0T0 implements IgShowreelComposition, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(54);
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public IgShowreelCompositionImpl(String str, String str2, String str3, List list) {
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        this.A03 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final IgShowreelCompositionImpl FFx() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgShowreelCompositionImpl) {
                IgShowreelCompositionImpl igShowreelCompositionImpl = (IgShowreelCompositionImpl) obj;
                if (!0qQ.A0K(this.A03, igShowreelCompositionImpl.A03) || !0qQ.A0K(this.A00, igShowreelCompositionImpl.A00) || !0qQ.A0K(this.A01, igShowreelCompositionImpl.A01) || !0qQ.A0K(this.A02, igShowreelCompositionImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A03;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List<IgShowreelCompositionAssetInfo> list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (IgShowreelCompositionAssetInfo writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final List Acn() {
        return this.A03;
    }

    public final String Anf() {
        return this.A00;
    }

    public final String AqT() {
        return this.A01;
    }

    public final String C4b() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShowreelComposition", C55057HbS.A00(this));
    }
}
