package com.instagram.feed.media;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass910;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CameraTool;

public final class CameraToolInfo extends AnonymousClass0T0 implements Parcelable, CameraToolInfoIntf {
    public static final Parcelable.Creator CREATOR = new C376399Hv(8);
    public final CameraTool A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;

    public CameraToolInfo(CameraTool cameraTool, Float f, Float f2, Float f3) {
        0qQ.A0B(cameraTool, 1);
        this.A00 = cameraTool;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
    }

    public final CameraToolInfo FDu() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CameraToolInfo) {
                CameraToolInfo cameraToolInfo = (CameraToolInfo) obj;
                if (this.A00 != cameraToolInfo.A00 || !0qQ.A0K(this.A01, cameraToolInfo.A01) || !0qQ.A0K(this.A02, cameraToolInfo.A02) || !0qQ.A0K(this.A03, cameraToolInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        Float f = this.A01;
        int i = 0;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A02;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.A03;
        if (f3 != null) {
            i = f3.hashCode();
        }
        return hashCode3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.A02;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.A03;
        if (f3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeFloat(f3.floatValue());
    }

    public final CameraTool Ajp() {
        return this.A00;
    }

    public final Float AzT() {
        return this.A01;
    }

    public final Float ByB() {
        return this.A02;
    }

    public final Float C7W() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreationToolInfoDict", AnonymousClass910.A00(this));
    }
}
