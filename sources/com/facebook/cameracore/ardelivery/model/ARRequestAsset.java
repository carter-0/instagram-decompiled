package com.facebook.cameracore.ardelivery.model;

import X.002;
import X.AnonymousClass05K;
import X.AnonymousClass80A;
import X.AnonymousClass8LN;
import X.C296675qS;
import X.C371118xc;
import X.C371138xf;
import X.C376409Hw;
import X.Pxd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class ARRequestAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(6);
    public final long A00;
    public final long A01;
    public final AnonymousClass80A A02;
    public final SparkVisionCapability A03;
    public final ImmutableList A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final String A0D;

    public enum CompressionMethod {
        NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
        ZIP("ZIP"),
        TAR_BROTLI("TAR_BROTLI");
        
        public String mMethod;

        public static CompressionMethod fromJson(String str) {
            return valueOf(str.toUpperCase(Locale.US));
        }

        public static CompressionMethod fromString(String str) {
            return valueOf(str.toUpperCase(Locale.US));
        }

        public String getCompressionMethod() {
            return this.mMethod;
        }

        /* access modifiers changed from: public */
        CompressionMethod(String str) {
            this.mMethod = str;
        }

        public static CompressionMethod fromCompressionType(C371138xf r2) {
            int ordinal = r2.ordinal();
            if (ordinal == 0) {
                return NONE;
            }
            if (ordinal == 1) {
                return ZIP;
            }
            if (ordinal == 2) {
                return TAR_BROTLI;
            }
            throw new IllegalArgumentException(002.A0R("unsupported compression method for CompressionType : ", r2.name()));
        }

        public static CompressionMethod fromCompressionTypeCppValue(int i) {
            for (C371138xf r1 : C371138xf.values()) {
                if (r1.A00 == i) {
                    return fromCompressionType(r1);
                }
            }
            throw new IllegalArgumentException(002.A0O("Unsupported compression type : ", i));
        }

        public static String toJson(CompressionMethod compressionMethod) {
            return compressionMethod.getCompressionMethod();
        }

        public static C371138xf toXplatCompressionType(CompressionMethod compressionMethod) {
            int ordinal = compressionMethod.ordinal();
            if (ordinal == 0) {
                return C371138xf.None;
            }
            if (ordinal == 1) {
                return C371138xf.Zip;
            }
            if (ordinal == 2) {
                return C371138xf.TarBrotli;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported compression method : ");
            sb.append(compressionMethod);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        SparkVisionCapability sparkVisionCapability;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ARRequestAsset)) {
            return false;
        }
        ARRequestAsset aRRequestAsset = (ARRequestAsset) obj;
        SparkVisionCapability sparkVisionCapability2 = this.A03;
        if (sparkVisionCapability2 == null && aRRequestAsset.A03 == null) {
            z = true;
        } else if (sparkVisionCapability2 == null || (sparkVisionCapability = aRRequestAsset.A03) == null) {
            z = false;
        } else {
            z = sparkVisionCapability2.equals(sparkVisionCapability);
        }
        if (this.A02.A09.equals(aRRequestAsset.A02.A09) && C296675qS.A04(this.A07, aRRequestAsset.A07) && C296675qS.A04(this.A09, aRRequestAsset.A09) && C296675qS.A04(this.A0D, aRRequestAsset.A0D) && this.A0B == aRRequestAsset.A0B && C296675qS.A04(this.A06, aRRequestAsset.A06) && this.A05 == aRRequestAsset.A05 && this.A00 == aRRequestAsset.A00) {
            List list = this.A0A;
            List list2 = aRRequestAsset.A0A;
            if (list != null ? list.equals(list2) : list2 == null) {
                if (C296675qS.A04(this.A08, aRRequestAsset.A08)) {
                    ImmutableList immutableList = this.A04;
                    ImmutableList immutableList2 = aRRequestAsset.A04;
                    if (immutableList != null ? immutableList.equals(immutableList2) : immutableList2 == null) {
                        return this.A0C == aRRequestAsset.A0C && z;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return this.A02.A09.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        AnonymousClass80A r5 = this.A02;
        sb.append(r5.A09);
        sb.append(", name: ");
        sb.append(r5.A0B);
        sb.append(", instance id: ");
        sb.append(r5.A0A);
        sb.append(Pxd.A00(308));
        sb.append(r5.A08);
        sb.append(", asset type: ");
        ARAssetType aRAssetType = r5.A02;
        sb.append(aRAssetType);
        sb.append(", sub asset type: ");
        sb.append(r5.A02());
        sb.append(", compression method: ");
        sb.append(r5.A03);
        sb.append(", uri: ");
        sb.append(this.A09);
        sb.append(", file size bytes: ");
        sb.append(this.A00);
        sb.append(", hash value: ");
        sb.append(this.A06);
        sb.append(", hash type: ");
        Integer num = this.A05;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "MD5";
        } else {
            str = "SHA256";
        }
        sb.append(str);
        sb.append(", is logging disabled: ");
        sb.append(this.A0B);
        sb.append(", is asset encrypted: ");
        sb.append(r5.A06.booleanValue());
        sb.append(", uses flm capability: ");
        sb.append(this.A0C);
        if (aRAssetType == ARAssetType.EFFECT) {
            sb.append(", model capability minVersion: ");
            sb.append(this.A0A);
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        AnonymousClass80A r1 = this.A02;
        ByteBuffer allocate = ByteBuffer.allocate(4096);
        allocate.putLong(7310021016723351138L);
        AnonymousClass80A.A01(r1.A09, allocate);
        AnonymousClass80A.A01(r1.A0A, allocate);
        AnonymousClass80A.A01(r1.A0B, allocate);
        AnonymousClass80A.A01(r1.A02.name(), allocate);
        AnonymousClass80A.A01(r1.A02(), allocate);
        AnonymousClass80A.A01(r1.A0C, allocate);
        AnonymousClass80A.A01(r1.A03.name(), allocate);
        allocate.putInt(r1.A01);
        AnonymousClass80A.A01(r1.A08, allocate);
        AnonymousClass80A.A01(r1.A07.toString(), allocate);
        AnonymousClass8LN r0 = r1.A05;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.toString();
        }
        AnonymousClass80A.A01(obj, allocate);
        AnonymousClass80A.A01(r1.A06.toString(), allocate);
        AnonymousClass80A.A01(r1.A0D, allocate);
        parcel.writeByteArray(Arrays.copyOf(allocate.array(), allocate.position()));
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0D);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeTypedList(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeTypedList(this.A04);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        int i2 = 0;
        parcel.writeParcelable(this.A03, 0);
        Integer num = this.A05;
        if (num != null) {
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    public ARRequestAsset(Parcel parcel) {
        ImmutableList copyOf;
        try {
            this.A02 = new AnonymousClass80A(ByteBuffer.wrap(parcel.createByteArray()));
            this.A07 = parcel.readString();
            this.A09 = parcel.readString();
            this.A0D = parcel.readString();
            boolean z = true;
            this.A0B = parcel.readByte() != 0;
            this.A06 = parcel.readString();
            this.A00 = parcel.readLong();
            this.A01 = parcel.readLong();
            this.A0A = parcel.createTypedArrayList(ARCapabilityMinVersionModeling.CREATOR);
            this.A08 = parcel.readString();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AREffectAsyncAsset.CREATOR);
            if (createTypedArrayList == null) {
                copyOf = null;
            } else {
                copyOf = ImmutableList.copyOf((Collection) createTypedArrayList);
            }
            this.A04 = copyOf;
            this.A0C = parcel.readByte() == 0 ? false : z;
            this.A03 = (SparkVisionCapability) parcel.readParcelable(SparkVisionCapability.class.getClassLoader());
            this.A05 = AnonymousClass05K.A00(2)[parcel.readInt()];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ARRequestAsset(ARAssetType aRAssetType, CompressionMethod compressionMethod, EffectAssetType effectAssetType, C371118xc r23, AnonymousClass8LN r24, SparkVisionCapability sparkVisionCapability, VersionedCapability versionedCapability, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        String str9 = str;
        CompressionMethod compressionMethod2 = compressionMethod;
        if (compressionMethod != null) {
            ImmutableList immutableList = null;
            ARAssetType aRAssetType2 = aRAssetType;
            boolean z4 = z;
            C371118xc r8 = r23;
            EffectAssetType effectAssetType2 = effectAssetType;
            this.A02 = new AnonymousClass80A(aRAssetType2, compressionMethod2, effectAssetType2, r8, r24, versionedCapability, Boolean.valueOf(z4), Boolean.valueOf(z2), str9, str2, str3, str7, aRAssetType2 == ARAssetType.SPARKVISION ? str9 : null, i);
            this.A09 = str5;
            this.A07 = str4;
            this.A06 = str6;
            this.A0B = z4;
            this.A0D = str9;
            this.A00 = j;
            this.A01 = j2;
            this.A0A = list;
            this.A08 = str8;
            this.A04 = list2 != null ? ImmutableList.copyOf((Collection) list2) : immutableList;
            this.A03 = sparkVisionCapability;
            this.A0C = z3;
            this.A05 = num;
            return;
        }
        throw new IllegalArgumentException(002.A0R("Compression method must not be null: id=", str9));
    }
}
