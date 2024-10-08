package com.google.android.gms.phenotype;

import X.AnonymousClass7TF;
import X.C301145yd;
import X.C9730Rfn;
import X.DbS;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExperimentTokens extends AbstractSafeParcelable {
    public static final ExperimentTokens A08;
    public static final byte[][] A09;
    public static final Parcelable.Creator CREATOR = SWR.A00(66);
    public final String A00;
    public final byte[] A01;
    public final int[] A02;
    public final byte[][] A03;
    public final byte[][] A04;
    public final byte[][] A05;
    public final byte[][] A06;
    public final byte[][] A07;

    static {
        byte[][] bArr = new byte[0][];
        A09 = bArr;
        A08 = new ExperimentTokens("", (byte[]) null, (int[]) null, bArr, bArr, bArr, bArr, (byte[][]) null);
    }

    public static List A00(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList A0v = DbS.A0v(r3);
        for (byte[] encodeToString : bArr) {
            A0v.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(A0v);
        return A0v;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof ExperimentTokens)) {
            return false;
        }
        ExperimentTokens experimentTokens = (ExperimentTokens) obj;
        if (!C9730Rfn.A00(this.A00, experimentTokens.A00) || !Arrays.equals(this.A01, experimentTokens.A01) || !C9730Rfn.A00(A00(this.A03), A00(experimentTokens.A03)) || !C9730Rfn.A00(A00(this.A04), A00(experimentTokens.A04)) || !C9730Rfn.A00(A00(this.A05), A00(experimentTokens.A05)) || !C9730Rfn.A00(A00(this.A06), A00(experimentTokens.A06))) {
            return false;
        }
        int[] iArr = this.A02;
        if (iArr == null) {
            list = Collections.emptyList();
        } else {
            ArrayList A0v = DbS.A0v(r2);
            for (int A1M : iArr) {
                AnonymousClass7TF.A1M(A0v, A1M);
            }
            Collections.sort(A0v);
            list = A0v;
        }
        int[] iArr2 = experimentTokens.A02;
        if (iArr2 == null) {
            list2 = Collections.emptyList();
        } else {
            ArrayList A0v2 = DbS.A0v(r2);
            for (int A1M2 : iArr2) {
                AnonymousClass7TF.A1M(A0v2, A1M2);
            }
            Collections.sort(A0v2);
            list2 = A0v2;
        }
        if (!C9730Rfn.A00(list, list2) || !C9730Rfn.A00(A00(this.A07), A00(experimentTokens.A07))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String A0s;
        StringBuilder A16 = Pxe.A16("ExperimentTokens");
        A16.append("(");
        String str = this.A00;
        if (str == null) {
            A0s = "null";
        } else {
            StringBuilder A14 = Pxe.A14(Pxf.A09(str) + 2);
            A14.append("'");
            A0s = Pxg.A0s(str, "'", A14);
        }
        A16.append(A0s);
        A16.append(", ");
        byte[] bArr = this.A01;
        A16.append(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A16.append("=");
        if (bArr == null) {
            A16.append("null");
        } else {
            A16.append("'");
            A16.append(Base64.encodeToString(bArr, 3));
            A16.append("'");
        }
        A16.append(", ");
        A01("GAIA", A16, this.A03);
        A16.append(", ");
        A01("PSEUDO", A16, this.A04);
        A16.append(", ");
        A01("ALWAYS", A16, this.A05);
        A16.append(", ");
        A01("OTHER", A16, this.A06);
        A16.append(", ");
        int[] iArr = this.A02;
        A16.append("weak");
        A16.append("=");
        if (iArr == null) {
            A16.append("null");
        } else {
            A16.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    A16.append(", ");
                }
                A16.append(i2);
                i++;
                z = false;
            }
            A16.append(")");
        }
        A16.append(", ");
        A01("directs", A16, this.A07);
        return AnonymousClass7TF.A0l(")", A16);
    }

    public ExperimentTokens(String str, byte[] bArr, int[] iArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, byte[][] bArr6) {
        this.A00 = str;
        this.A01 = bArr;
        this.A03 = bArr2;
        this.A04 = bArr3;
        this.A05 = bArr4;
        this.A06 = bArr5;
        this.A02 = iArr;
        this.A07 = bArr6;
    }

    public static void A01(String str, StringBuilder sb, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    Pxe.A1Y(sb);
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A00);
        C301145yd.A0F(parcel, this.A01, 3, false);
        C301145yd.A0I(parcel, this.A03, 4);
        C301145yd.A0I(parcel, this.A04, 5);
        C301145yd.A0I(parcel, this.A05, 6);
        C301145yd.A0I(parcel, this.A06, 7);
        int[] iArr = this.A02;
        if (iArr != null) {
            int A012 = C301145yd.A01(parcel, 8);
            parcel.writeIntArray(iArr);
            C301145yd.A06(parcel, A012);
        }
        C301145yd.A0I(parcel, this.A07, 9);
        C301145yd.A06(parcel, A032);
    }
}
