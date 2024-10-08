package X;

import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4zZ  reason: invalid class name and case insensitive filesystem */
public final class C279864zZ extends AnonymousClass0T0 implements C279874za {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass60J A04;
    public final NoteBackgroundColor A05;
    public final NoteCustomThemeImpl A06;
    public final C300865y4 A07;
    public final NoteFontStyle A08;
    public final AnonymousClass60L A09;
    public final C300845y2 A0A;
    public final AnonymousClass60N A0B;
    public final User A0C;
    public final User A0D;
    public final Boolean A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279864zZ) {
                C279864zZ r8 = (C279864zZ) obj;
                if (this.A00 != r8.A00 || !0qQ.A0K(this.A0L, r8.A0L) || !0qQ.A0K(this.A0F, r8.A0F) || this.A05 != r8.A05 || this.A0O != r8.A0O || !0qQ.A0K(this.A04, r8.A04) || this.A02 != r8.A02 || !0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A0M, r8.A0M) || this.A03 != r8.A03 || this.A08 != r8.A08 || !0qQ.A0K(this.A0G, r8.A0G) || this.A0P != r8.A0P || !0qQ.A0K(this.A0H, r8.A0H) || this.A0Q != r8.A0Q || this.A0R != r8.A0R || !0qQ.A0K(this.A0A, r8.A0A) || this.A01 != r8.A01 || !0qQ.A0K(this.A07, r8.A07) || !0qQ.A0K(this.A0N, r8.A0N) || !0qQ.A0K(this.A09, r8.A09) || !0qQ.A0K(this.A0B, r8.A0B) || !0qQ.A0K(this.A0C, r8.A0C) || !0qQ.A0K(this.A0I, r8.A0I) || !0qQ.A0K(this.A0J, r8.A0J) || !0qQ.A0K(this.A0E, r8.A0E) || !0qQ.A0K(this.A0D, r8.A0D) || !0qQ.A0K(this.A0K, r8.A0K)) {
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
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int i = this.A00 * 31;
        List list = this.A0L;
        int i2 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Integer num = this.A0F;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int hashCode13 = (((i3 + hashCode2) * 31) + this.A05.hashCode()) * 31;
        int i4 = 1237;
        if (this.A0O) {
            i4 = 1231;
        }
        int i5 = (hashCode13 + i4) * 31;
        AnonymousClass60J r0 = this.A04;
        if (r0 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r0.hashCode();
        }
        long j = this.A02;
        int i6 = (((i5 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        NoteCustomThemeImpl noteCustomThemeImpl = this.A06;
        if (noteCustomThemeImpl == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = noteCustomThemeImpl.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        List list2 = this.A0M;
        if (list2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list2.hashCode();
        }
        long j2 = this.A03;
        int hashCode14 = (((((i7 + hashCode5) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A08.hashCode()) * 31;
        String str = this.A0G;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i8 = (hashCode14 + hashCode6) * 31;
        int i9 = 1237;
        if (this.A0P) {
            i9 = 1231;
        }
        int hashCode15 = (((i8 + i9) * 31) + this.A0H.hashCode()) * 31;
        int i10 = 1237;
        if (this.A0Q) {
            i10 = 1231;
        }
        int i11 = (hashCode15 + i10) * 31;
        int i12 = 1237;
        if (this.A0R) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        C300845y2 r02 = this.A0A;
        if (r02 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = r02.hashCode();
        }
        int i14 = (((i13 + hashCode7) * 31) + this.A01) * 31;
        C300865y4 r03 = this.A07;
        if (r03 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = r03.hashCode();
        }
        int hashCode16 = (((i14 + hashCode8) * 31) + this.A0N.hashCode()) * 31;
        AnonymousClass60L r04 = this.A09;
        if (r04 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = r04.hashCode();
        }
        int i15 = (hashCode16 + hashCode9) * 31;
        AnonymousClass60N r05 = this.A0B;
        if (r05 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = r05.hashCode();
        }
        int i16 = (i15 + hashCode10) * 31;
        User user = this.A0C;
        if (user == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = user.hashCode();
        }
        int i17 = (i16 + hashCode11) * 31;
        String str2 = this.A0I;
        if (str2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str2.hashCode();
        }
        int hashCode17 = (((i17 + hashCode12) * 31) + this.A0J.hashCode()) * 31;
        Boolean bool = this.A0E;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return ((((hashCode17 + i2) * 31) + this.A0D.hashCode()) * 31) + this.A0K.hashCode();
    }

    public C279864zZ(AnonymousClass60J r8, NoteBackgroundColor noteBackgroundColor, NoteCustomThemeImpl noteCustomThemeImpl, C300865y4 r11, NoteFontStyle noteFontStyle, AnonymousClass60L r13, C300845y2 r14, AnonymousClass60N r15, User user, User user2, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(noteBackgroundColor, 4);
        0qQ.A0B(noteFontStyle, 11);
        String str6 = str2;
        0qQ.A0B(str6, 14);
        List list4 = list3;
        0qQ.A0B(list4, 20);
        String str7 = str4;
        0qQ.A0B(str7, 25);
        User user3 = user2;
        0qQ.A0B(user3, 27);
        String str8 = str5;
        0qQ.A0B(str8, 28);
        this.A00 = i;
        this.A0L = list;
        this.A0F = num;
        this.A05 = noteBackgroundColor;
        this.A0O = z;
        this.A04 = r8;
        this.A02 = j;
        this.A06 = noteCustomThemeImpl;
        this.A0M = list2;
        this.A03 = j2;
        this.A08 = noteFontStyle;
        this.A0G = str;
        this.A0P = z2;
        this.A0H = str6;
        this.A0Q = z3;
        this.A0R = z4;
        this.A0A = r14;
        this.A01 = i2;
        this.A07 = r11;
        this.A0N = list4;
        this.A09 = r13;
        this.A0B = r15;
        this.A0C = user;
        this.A0I = str3;
        this.A0J = str7;
        this.A0E = bool;
        this.A0D = user3;
        this.A0K = str8;
    }
}
