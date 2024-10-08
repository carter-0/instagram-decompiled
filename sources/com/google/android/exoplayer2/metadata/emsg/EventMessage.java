package com.google.android.exoplayer2.metadata.emsg;

import X.AnonymousClass4RQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C256653w8;
import X.C256683wB;
import X.JTR;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class EventMessage implements Metadata.Entry {
    public static final C256683wB A06;
    public static final C256683wB A07;
    public static final Parcelable.Creator CREATOR = SWW.A00(46);
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public final /* synthetic */ void E37(AnonymousClass4RQ r1) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventMessage eventMessage = (EventMessage) obj;
            if (this.A01 != eventMessage.A01 || this.A02 != eventMessage.A02 || !Util.A0I(this.A03, eventMessage.A03) || !Util.A0I(this.A04, eventMessage.A04) || !Arrays.equals(this.A05, eventMessage.A05)) {
                return false;
            }
        }
        return true;
    }

    static {
        C256653w8 r1 = new C256653w8();
        r1.A0U = "application/id3";
        A06 = new C256683wB(r1);
        C256653w8 r12 = new C256653w8();
        r12.A0U = "application/x-scte35";
        A07 = new C256683wB(r12);
    }

    public final C256683wB CGo() {
        String str;
        String str2 = this.A03;
        switch (str2.hashCode()) {
            case -1468477611:
                if (str2.equals("urn:scte:scte35:2014:bin")) {
                    return A07;
                }
                return null;
            case -795945609:
                str = "https://aomedia.org/emsg/ID3";
                break;
            case 1303648457:
                str = "https://developer.apple.com/streaming/emsg-id3";
                break;
            default:
                return null;
        }
        if (str2.equals(str)) {
            return A06;
        }
        return null;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A0D = Pxh.A0D(this.A05, AnonymousClass7TF.A01(this.A02, AnonymousClass7TF.A01(this.A01, (((527 + JTR.A0G(this.A03)) * 31) + Pxh.A0B(this.A04)) * 31)));
        this.A00 = A0D;
        return A0D;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }

    public EventMessage(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }

    public final byte[] CGn() {
        if (CGo() != null) {
            return this.A05;
        }
        return null;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EMSG: scheme=");
        A1A.append(this.A03);
        A1A.append(", id=");
        A1A.append(this.A02);
        A1A.append(", durationMs=");
        A1A.append(this.A01);
        A1A.append(", value=");
        return AnonymousClass7TF.A0l(this.A04, A1A);
    }

    public EventMessage(String str, String str2, byte[] bArr, long j, long j2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }
}
