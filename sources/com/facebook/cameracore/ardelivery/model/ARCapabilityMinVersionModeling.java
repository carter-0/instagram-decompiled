package com.facebook.cameracore.ardelivery.model;

import X.2PP;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;

public class ARCapabilityMinVersionModeling implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(5);
    public static final long serialVersionUID = 0;
    public VersionedCapability mCapability;
    public int mMinVersion;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling = (ARCapabilityMinVersionModeling) obj;
            if (!2PP.A00(this.mCapability, aRCapabilityMinVersionModeling.mCapability) || !2PP.A00(Integer.valueOf(this.mMinVersion), Integer.valueOf(aRCapabilityMinVersionModeling.mMinVersion))) {
                return false;
            }
        }
        return true;
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getCapabilityXplatValue() {
        return this.mCapability.getXplatValue();
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mCapability, Integer.valueOf(this.mMinVersion)});
    }

    public boolean isCapabilityBodyTracking() {
        return 2PP.A00(this.mCapability, VersionedCapability.BodyTracking);
    }

    public boolean isCapabilityFacetracker() {
        return 2PP.A00(this.mCapability, VersionedCapability.Facetracker);
    }

    public boolean isCapabilityGazeCorrection() {
        return 2PP.A00(this.mCapability, VersionedCapability.GazeCorrection);
    }

    public boolean isCapabilityHairSegmentation() {
        return 2PP.A00(this.mCapability, VersionedCapability.HairSegmentation);
    }

    public boolean isCapabilitySegmentation() {
        return 2PP.A00(this.mCapability, VersionedCapability.Segmentation);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("capability: ");
        sb.append(this.mCapability);
        sb.append(", minVersion:");
        sb.append(this.mMinVersion);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCapability.ordinal());
        parcel.writeInt(this.mMinVersion);
    }

    public ARCapabilityMinVersionModeling(Parcel parcel) {
        this.mCapability = VersionedCapability.values()[parcel.readInt()];
        this.mMinVersion = parcel.readInt();
    }

    public ARCapabilityMinVersionModeling(int i, int i2) {
        VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(i);
        fromXplatValue.getClass();
        this.mCapability = fromXplatValue;
        this.mMinVersion = i2;
    }

    public ARCapabilityMinVersionModeling(VersionedCapability versionedCapability, int i) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
    }

    public /* synthetic */ ARCapabilityMinVersionModeling(Parcel parcel, C376409Hw r2) {
        this(parcel);
    }

    public ARCapabilityMinVersionModeling() {
    }
}
