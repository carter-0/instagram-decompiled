package com.instagram.creation.capture.gallery.ui;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51967G9n;
import X.DbT;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import java.util.Iterator;
import java.util.Map;

public final class GalleryPickerView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = LVP.A00(13);
    public int A00;
    public String A01;
    public String A02;
    public Map A03;
    public boolean A04;
    public boolean A05;
    public float[] A06;
    public String[] A07;

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeFloatArray(this.A06);
        parcel.writeStringArray(this.A07);
        parcel.writeInt(this.A05 ? 1 : 0);
        Map map = this.A03;
        parcel.writeInt(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            parcel.writeString(DbT.A13(A1J));
            parcel.writeParcelable((GalleryPreviewInfo) A1J.getValue(), i);
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GalleryPickerView.SavedState{");
        A1A.append(Integer.toHexString(System.identityHashCode(this)));
        A1A.append(" folderId=");
        A1A.append(this.A00);
        A1A.append(" folderName=");
        A1A.append(this.A01);
        A1A.append(" mediumId=");
        A1A.append(this.A02);
        return C51967G9n.A0r(A1A, '}');
    }
}
