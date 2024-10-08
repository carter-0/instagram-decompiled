package com.google.android.gms.clearcut;

import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxe;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(23);
    public zzr A00;
    public boolean A01;
    public byte[] A02;
    public int[] A03;
    public int[] A04;
    public ExperimentTokens[] A05;
    public String[] A06;
    public byte[][] A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zze) {
                zze zze = (zze) obj;
                if (!SA1.A01(this.A00, zze.A00) || !Arrays.equals(this.A02, zze.A02) || !Arrays.equals(this.A03, zze.A03) || !Arrays.equals(this.A06, zze.A06) || !Arrays.equals(this.A04, zze.A04) || !Arrays.deepEquals(this.A07, zze.A07) || !Arrays.equals(this.A05, zze.A05) || this.A01 != zze.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, this.A06, null, null, null, this.A04, this.A07, this.A05, Boolean.valueOf(this.A01)});
    }

    public final String toString() {
        String str;
        StringBuilder A16 = Pxe.A16("LogEventParcelable[");
        A16.append(this.A00);
        A16.append(", LogEventBytes: ");
        byte[] bArr = this.A02;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr);
        }
        A16.append(str);
        A16.append(", TestCodes: ");
        A16.append(Arrays.toString(this.A03));
        A16.append(", MendelPackages: ");
        A16.append(Arrays.toString(this.A06));
        A16.append(", LogEvent: ");
        A16.append((Object) null);
        A16.append(", ExtensionProducer: ");
        A16.append((Object) null);
        A16.append(", VeProducer: ");
        A16.append((Object) null);
        A16.append(", ExperimentIDs: ");
        A16.append(Arrays.toString(this.A04));
        A16.append(", ExperimentTokens: ");
        A16.append(Arrays.toString(this.A07));
        A16.append(", ExperimentTokensParcelables: ");
        A16.append(Arrays.toString(this.A05));
        A16.append(", AddPhenotypeExperimentTokens: ");
        A16.append(this.A01);
        return AnonymousClass7TF.A0l("]", A16);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0F(parcel, this.A02, 3, Pxi.A1R(parcel, this.A00, i));
        int[] iArr = this.A03;
        if (iArr != null) {
            int A012 = C301145yd.A01(parcel, 4);
            parcel.writeIntArray(iArr);
            C301145yd.A06(parcel, A012);
        }
        C301145yd.A0H(parcel, this.A06, 5);
        int[] iArr2 = this.A04;
        if (iArr2 != null) {
            int A013 = C301145yd.A01(parcel, 6);
            parcel.writeIntArray(iArr2);
            C301145yd.A06(parcel, A013);
        }
        C301145yd.A0I(parcel, this.A07, 7);
        C301145yd.A09(parcel, 8, this.A01);
        C301145yd.A0G(parcel, this.A05, 9, i);
        C301145yd.A06(parcel, A032);
    }
}
