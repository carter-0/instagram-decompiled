package X;

import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.4AT  reason: invalid class name */
public final class AnonymousClass4AT extends AnonymousClass4AA {
    public AnonymousClass30Y A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final NoteCustomThemeImpl A05;
    public final User A06;
    public final Boolean A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final Map A0E;
    public final boolean A0F;
    public final boolean A0G;

    public AnonymousClass4AT(NoteCustomThemeImpl noteCustomThemeImpl, User user, Boolean bool, String str, String str2, String str3, String str4, String str5, List list, Map map, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(user, 2);
        0qQ.A0B(map, 4);
        this.A0A = str;
        this.A06 = user;
        this.A0G = z;
        this.A0E = map;
        this.A02 = i;
        this.A0F = z2;
        this.A0D = list;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = i4;
        this.A0C = str2;
        this.A0B = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A07 = bool;
        this.A05 = noteCustomThemeImpl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4AT) {
                AnonymousClass4AT r5 = (AnonymousClass4AT) obj;
                if (!0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A06, r5.A06) || this.A0G != r5.A0G || !0qQ.A0K(this.A0E, r5.A0E) || this.A02 != r5.A02 || this.A0F != r5.A0F || !0qQ.A0K(this.A0D, r5.A0D) || this.A01 != r5.A01 || this.A03 != r5.A03 || this.A04 != r5.A04 || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = ((this.A0A.hashCode() * 31) + this.A06.hashCode()) * 31;
        int i = 1237;
        if (this.A0G) {
            i = 1231;
        }
        int hashCode8 = (((((hashCode7 + i) * 31) + this.A0E.hashCode()) * 31) + this.A02) * 31;
        int i2 = 1237;
        if (this.A0F) {
            i2 = 1231;
        }
        int i3 = (hashCode8 + i2) * 31;
        List list = this.A0D;
        int i4 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = (((((((i3 + hashCode) * 31) + this.A01) * 31) + this.A03) * 31) + this.A04) * 31;
        String str = this.A0C;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str2 = this.A0B;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        String str3 = this.A08;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        String str4 = this.A09;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        Boolean bool = this.A07;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        NoteCustomThemeImpl noteCustomThemeImpl = this.A05;
        if (noteCustomThemeImpl != null) {
            i4 = noteCustomThemeImpl.hashCode();
        }
        return i10 + i4;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
