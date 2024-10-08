package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C16843V7y;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class NoteCustomThemeImpl extends AnonymousClass0T0 implements NoteCustomTheme, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376389Hu(80);
    public final NoteActivationType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final NoteCustomThemeImpl F6q() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoteCustomThemeImpl) {
                NoteCustomThemeImpl noteCustomThemeImpl = (NoteCustomThemeImpl) obj;
                if (this.A00 != noteCustomThemeImpl.A00 || !0qQ.A0K(this.A01, noteCustomThemeImpl.A01) || !0qQ.A0K(this.A02, noteCustomThemeImpl.A02) || !0qQ.A0K(this.A03, noteCustomThemeImpl.A03) || !0qQ.A0K(this.A04, noteCustomThemeImpl.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        NoteActivationType noteActivationType = this.A00;
        int i = 0;
        int hashCode = (noteActivationType == null ? 0 : noteActivationType.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A02;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public final NoteActivationType AYd() {
        return this.A00;
    }

    public final String Aej() {
        return this.A01;
    }

    public final String Aur() {
        return this.A02;
    }

    public final String C1z() {
        return this.A03;
    }

    public final String C54() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNoteCustomTheme", C16843V7y.A00(this));
    }

    public NoteCustomThemeImpl(NoteActivationType noteActivationType, String str, String str2, String str3, String str4) {
        this.A00 = noteActivationType;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }
}
