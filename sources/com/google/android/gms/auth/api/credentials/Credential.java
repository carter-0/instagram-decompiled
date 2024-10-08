package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.C301145yd;
import X.C66581MXm;
import X.Pxf;
import X.SA1;
import X.SWW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

@Deprecated
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(85);
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Credential) {
                Credential credential = (Credential) obj;
                if (!TextUtils.equals(this.A01, credential.A01) || !TextUtils.equals(this.A02, credential.A02) || !SA1.A01(this.A00, credential.A00) || !TextUtils.equals(this.A03, credential.A03) || !TextUtils.equals(this.A04, credential.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0C(this.A01, this.A02, this.A00, this.A03, this.A04);
    }

    public Credential(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        List unmodifiableList;
        AnonymousClass3Qk.A03(str, "credential identifier cannot be null");
        String trim = str.trim();
        AnonymousClass3Qk.A06(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!C66581MXm.A1a(z)) {
                    throw AnonymousClass7TE.A0w("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.A02 = str2;
                this.A00 = uri;
                if (list == null) {
                    unmodifiableList = Collections.emptyList();
                } else {
                    unmodifiableList = Collections.unmodifiableList(list);
                }
                this.A07 = unmodifiableList;
                this.A01 = trim;
                this.A03 = str3;
                this.A04 = str4;
                this.A05 = str5;
                this.A06 = str6;
                return;
            }
            throw AnonymousClass7TE.A0w("Password and AccountType are mutually exclusive");
        }
        throw AnonymousClass7TE.A0w("Password must not be empty if set");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1S = Pxf.A1S(parcel, this.A01);
        C301145yd.A0B(parcel, this.A02);
        C301145yd.A0A(parcel, this.A00, 3, i, A1S);
        C301145yd.A0E(parcel, this.A07, 4, A1S);
        C301145yd.A0C(parcel, this.A03, 5, A1S);
        C301145yd.A0C(parcel, this.A04, 6, A1S);
        C301145yd.A0C(parcel, this.A05, 9, A1S);
        C301145yd.A0C(parcel, this.A06, 10, A1S);
        C301145yd.A06(parcel, A032);
    }
}
