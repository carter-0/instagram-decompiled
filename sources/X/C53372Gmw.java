package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Gmw  reason: case insensitive filesystem */
public final class C53372Gmw extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C53372Gmw(User user, String str, String str2, String str3, List list, List list2, int i, boolean z) {
        this.A06 = str;
        this.A04 = user;
        this.A03 = list;
        this.A02 = list2;
        this.A08 = z;
        this.A01 = i;
        this.A05 = str2;
        this.A07 = str3;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53372Gmw)) {
                return false;
            }
            C53372Gmw gmw = (C53372Gmw) obj;
            if (gmw.A00 != 1 || !0qQ.A0K(this.A06, gmw.A06) || !0qQ.A0K(this.A04, gmw.A04) || !0qQ.A0K(this.A03, gmw.A03) || !0qQ.A0K(this.A02, gmw.A02) || this.A08 != gmw.A08 || this.A01 != gmw.A01 || !0qQ.A0K(this.A05, gmw.A05)) {
                return false;
            }
            obj2 = this.A07;
            obj3 = gmw.A07;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53372Gmw)) {
                return false;
            }
            C53372Gmw gmw2 = (C53372Gmw) obj;
            if (gmw2.A00 != 0 || !0qQ.A0K(this.A06, gmw2.A06) || this.A01 != gmw2.A01 || !0qQ.A0K(this.A05, gmw2.A05) || !0qQ.A0K(this.A07, gmw2.A07) || !0qQ.A0K(this.A04, gmw2.A04) || this.A08 != gmw2.A08 || !0qQ.A0K(this.A02, gmw2.A02)) {
                return false;
            }
            obj2 = this.A03;
            obj3 = gmw2.A03;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072;
        int hashCode;
        int i = this.A00;
        String str = this.A06;
        if (i != 0) {
            int A073 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0O(str))));
            A072 = AnonymousClass7TF.A08(this.A05, (AnonymousClass7TF.A09(this.A08, A073) + this.A01) * 31);
            hashCode = AnonymousClass7TG.A0E(this.A07);
        } else {
            A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A04, (((((AnonymousClass7TE.A0O(str) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A07)) * 31)));
            hashCode = this.A03.hashCode();
        }
        return A072 + hashCode;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NotesPogOverflowUiState(mediaId=");
        A1A.append(this.A06);
        A1A.append(", mediaPosition=");
        A1A.append(this.A01);
        A1A.append(", inventorySource=");
        A1A.append(this.A05);
        A1A.append(AnonymousClass000.A00(403));
        A1A.append(this.A07);
        A1A.append(", notes=");
        A1A.append(this.A04);
        A1A.append(", isReelsViewer=");
        A1A.append(this.A08);
        A1A.append(", avatarsUiState=");
        A1A.append(this.A02);
        A1A.append(", avatarsUiStateForDragging=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }

    public C53372Gmw(C61080JwI jwI, C61080JwI jwI2, String str, String str2, String str3, List list, int i, boolean z) {
        this.A06 = str;
        this.A01 = i;
        this.A05 = str2;
        this.A07 = str3;
        this.A04 = list;
        this.A08 = z;
        this.A02 = jwI;
        this.A03 = jwI2;
    }
}
