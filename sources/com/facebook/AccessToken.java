package com.facebook;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66580MXl;
import X.C66583MXo;
import X.C66584MXp;
import X.C7216Pzk;
import X.Pxh;
import X.S89;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public final class AccessToken implements Parcelable {
    public static final Date A08;
    public static final Date A09 = new Date();
    public static final Date A0A;
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(86);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Date A04;
    public final Date A05;
    public final Set A06;
    public final Set A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.A04.equals(accessToken.A04) && this.A07.equals(accessToken.A07) && this.A06.equals(accessToken.A06) && this.A02.equals(accessToken.A02) && this.A00 == accessToken.A00 && this.A05.equals(accessToken.A05)) {
            String str = this.A01;
            String str2 = accessToken.A01;
            if (str != null ? str.equals(str2) : str2 == null) {
                if (this.A03.equals(accessToken.A03)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A02, (((C66583MXo.A01(this.A04.hashCode()) + this.A07.hashCode()) * 31) + this.A06.hashCode()) * 31);
        Integer num = this.A00;
        int A0B = AnonymousClass7TG.A0B(num, S89.A01(num), A082);
        return C41845B3m.A01(this.A03, (AnonymousClass7TF.A07(this.A05, A0B) + AnonymousClass7TG.A0E(this.A01)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A04.getTime());
        parcel.writeStringList(AnonymousClass7TE.A1D(this.A07));
        parcel.writeStringList(AnonymousClass7TE.A1D(this.A06));
        parcel.writeString(this.A02);
        parcel.writeString(S89.A01(this.A00));
        parcel.writeLong(this.A05.getTime());
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public AccessToken(Parcel parcel) {
        this.A04 = new Date(parcel.readLong());
        ArrayList A1C = AnonymousClass7TE.A1C();
        parcel.readStringList(A1C);
        this.A07 = Collections.unmodifiableSet(C66580MXl.A12(A1C));
        A1C.clear();
        parcel.readStringList(A1C);
        this.A06 = Collections.unmodifiableSet(C66580MXl.A12(A1C));
        this.A02 = parcel.readString();
        this.A00 = S89.A00(parcel.readString());
        this.A05 = new Date(parcel.readLong());
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("{AccessToken");
        A1A.append(" token:");
        if (this.A02 == null) {
            str = "null";
        } else {
            str = "ACCESS_TOKEN_REMOVED";
        }
        A1A.append(str);
        A1A.append(" permissions:");
        Set set = this.A07;
        if (set == null) {
            str2 = "null";
        } else {
            Pxh.A1P(A1A);
            A1A.append(TextUtils.join(", ", set));
            str2 = "]";
        }
        return C66584MXp.A0a(str2, A1A);
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        A0A = date;
        A08 = date;
    }

    public AccessToken(Integer num, String str, String str2, String str3, Collection collection, Collection collection2, Date date, Date date2) {
        HashSet A1F;
        HashSet A1F2;
        this.A04 = date == null ? A08 : date;
        if (collection != null) {
            A1F = C66580MXl.A12(collection);
        } else {
            A1F = AnonymousClass7TE.A1F();
        }
        this.A07 = Collections.unmodifiableSet(A1F);
        if (collection2 != null) {
            A1F2 = C66580MXl.A12(collection2);
        } else {
            A1F2 = AnonymousClass7TE.A1F();
        }
        this.A06 = Collections.unmodifiableSet(A1F2);
        this.A02 = str;
        this.A00 = num;
        this.A05 = date2 == null ? A09 : date2;
        this.A01 = str2;
        this.A03 = str3;
    }
}
