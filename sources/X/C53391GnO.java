package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.List;

/* renamed from: X.GnO  reason: case insensitive filesystem */
public final class C53391GnO extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public C53391GnO(Integer num, String str, List list) {
        this.A00 = 2;
        this.A00 = 2;
        this.A04 = null;
        this.A06 = str;
        this.A02 = null;
        this.A05 = null;
        this.A01 = num;
        this.A03 = list;
        this.A07 = false;
        this.A08 = false;
    }

    public static /* synthetic */ C53391GnO A00(C53391GnO gnO, ImageUrl imageUrl, File file, String str, String str2, List list, int i, boolean z) {
        boolean z2;
        boolean z3 = z;
        String str3 = str2;
        List list2 = list;
        ImageUrl imageUrl2 = imageUrl;
        String str4 = str;
        File file2 = file;
        List list3 = null;
        if ((i & 1) != 0) {
            file2 = (File) gnO.A02;
        }
        if ((i & 2) != 0) {
            str4 = gnO.A06;
        }
        if ((i & 4) != 0) {
            imageUrl2 = (ImageUrl) gnO.A01;
        }
        if ((i & 8) != 0) {
            list2 = (List) gnO.A04;
        }
        if ((i & 16) != 0) {
            str3 = gnO.A05;
        }
        if ((i & 32) != 0) {
            z3 = gnO.A07;
        }
        if ((i & 64) != 0) {
            list3 = (List) gnO.A03;
        }
        if ((i & 128) != 0) {
            z2 = gnO.A08;
        } else {
            z2 = false;
        }
        C51972G9s.A1D(list2, str3);
        0qQ.A0B(list3, 6);
        return new C53391GnO(imageUrl2, file2, str4, str3, list2, list3, z3, z2);
    }

    public final boolean equals(Object obj) {
        C53391GnO gnO;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C53391GnO)) {
                    return false;
                }
                C53391GnO gnO2 = (C53391GnO) obj;
                if (gnO2.A00 != 0 || !0qQ.A0K(this.A02, gnO2.A02) || !0qQ.A0K(this.A04, gnO2.A04) || this.A07 != gnO2.A07 || !0qQ.A0K(this.A03, gnO2.A03)) {
                    return false;
                }
                return true;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C53391GnO)) {
                    return false;
                }
                gnO = (C53391GnO) obj;
                if (gnO.A00 != 1 || !0qQ.A0K(this.A02, gnO.A02) || !0qQ.A0K(this.A06, gnO.A06) || !0qQ.A0K(this.A01, gnO.A01) || !0qQ.A0K(this.A04, gnO.A04) || !0qQ.A0K(this.A05, gnO.A05) || this.A07 != gnO.A07 || !0qQ.A0K(this.A03, gnO.A03)) {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C53391GnO)) {
                    return false;
                }
                gnO = (C53391GnO) obj;
                if (gnO.A00 != 2 || !0qQ.A0K(this.A04, gnO.A04) || !0qQ.A0K(this.A06, gnO.A06) || !0qQ.A0K(this.A02, gnO.A02) || !0qQ.A0K(this.A05, gnO.A05) || !0qQ.A0K(this.A01, gnO.A01) || !0qQ.A0K(this.A03, gnO.A03) || this.A07 != gnO.A07) {
                    return false;
                }
        }
        if (this.A08 != gnO.A08) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        int hashCode;
        int A092;
        int hashCode2;
        switch (this.A00) {
            case 0:
                A09 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A02)));
                hashCode = this.A03.hashCode();
                break;
            case 1:
                A092 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A07(this.A04, ((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31)));
                hashCode2 = this.A03.hashCode();
                break;
            default:
                A092 = AnonymousClass7TF.A07(this.A03, ((((((((AnonymousClass7TG.A0C(this.A04) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
                hashCode2 = 1237;
                if (this.A07) {
                    hashCode2 = 1231;
                    break;
                }
                break;
        }
        A09 = (A092 + hashCode2) * 31;
        hashCode = 1237;
        if (this.A08) {
            hashCode = 1231;
        }
        return A09 + hashCode;
    }

    public C53391GnO(Bundle bundle, UserSession userSession, ExY exY, boolean z) {
        this.A00 = 0;
        0qQ.A0B(userSession, 2);
        this.A02 = bundle;
        this.A04 = userSession;
        this.A07 = z;
        this.A03 = exY;
        this.A01 = bundle.getParcelable(AnonymousClass000.A00(42));
        this.A08 = bundle.getBoolean(AnonymousClass000.A00(438), false);
        String string = bundle.getString(AnonymousClass000.A00(921), "");
        0qQ.A07(string);
        this.A05 = string;
        this.A06 = bundle.getString(AnonymousClass000.A00(107));
    }

    public C53391GnO(ImageUrl imageUrl, File file, String str, String str2, List list, List list2, boolean z, boolean z2) {
        this.A00 = 1;
        0qQ.A0B(list, 4);
        this.A02 = file;
        this.A06 = str;
        this.A01 = imageUrl;
        this.A04 = list;
        this.A05 = str2;
        this.A07 = z;
        this.A03 = list2;
        this.A08 = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53391GnO(ImageUrl imageUrl, String str, List list, boolean z) {
        this(imageUrl, (File) null, (String) null, str, (List) C53027GhI.A0A.getValue(), list, false, z);
        this.A00 = 1;
    }
}
