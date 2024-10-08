package X;

import android.graphics.Bitmap;
import com.instagram.android.R;

/* renamed from: X.Gn4  reason: case insensitive filesystem */
public final class C53374Gn4 extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53374Gn4) || ((C53374Gn4) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!A00(1, obj)) {
                return false;
            }
            C53374Gn4 gn4 = (C53374Gn4) obj;
            if (this.A01 != gn4.A01 || !0qQ.A0K(this.A03, gn4.A03) || !0qQ.A0K(this.A04, gn4.A04)) {
                return false;
            }
            str = this.A02;
            str2 = gn4.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!A00(0, obj)) {
                return false;
            }
            C53374Gn4 gn42 = (C53374Gn4) obj;
            if (this.A01 != gn42.A01 || !0qQ.A0K(this.A03, gn42.A03) || !0qQ.A0K(this.A04, gn42.A04) || !0qQ.A0K(this.A02, gn42.A02)) {
                return false;
            }
            str = null;
            str2 = null;
        }
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08;
        int i;
        int i2 = this.A00;
        int A082 = AnonymousClass7TF.A08(this.A03, this.A01 * 31);
        String str = this.A04;
        if (i2 != 0) {
            A08 = AnonymousClass7TF.A08(str, A082) * 31;
            i = this.A02.hashCode();
        } else {
            A08 = AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(str, A082));
            i = 0;
        }
        return A08 + i;
    }

    public C53374Gn4(String str, String str2, String str3) {
        0qQ.A0B(str2, 3);
        this.A01 = R.drawable.instagram_contacts_pano_outline_24;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
    }

    public C53374Gn4(Bitmap bitmap, String str, String str2, String str3, int i, int i2) {
        0qQ.A0B(str2, 3);
        this.A01 = R.drawable.instagram_contacts_pano_outline_24;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
    }
}
