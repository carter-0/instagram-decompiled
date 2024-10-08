package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;

/* renamed from: X.7AG  reason: invalid class name */
public final class AnonymousClass7AG extends AnonymousClass0T0 {
    public final C61065Jw3 A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;

    public AnonymousClass7AG(C61065Jw3 jw3, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        0qQ.A0B(str, 1);
        0qQ.A0B(num, 2);
        this.A05 = str;
        this.A02 = num;
        this.A00 = jw3;
        this.A04 = str2;
        this.A09 = str3;
        this.A06 = str4;
        this.A08 = str5;
        this.A0C = list;
        this.A0B = str6;
        this.A0A = str7;
        this.A03 = str8;
        this.A01 = num2;
        this.A07 = str9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7AG) {
                AnonymousClass7AG r5 = (AnonymousClass7AG) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || this.A02 != r5.A02 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
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
        int hashCode11 = this.A05.hashCode() * 31;
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        } else {
            str = "SERVER_STREAMING_TEXT";
        }
        int hashCode12 = (hashCode11 + str.hashCode() + intValue) * 31;
        C61065Jw3 jw3 = this.A00;
        int i = 0;
        if (jw3 == null) {
            hashCode = 0;
        } else {
            hashCode = jw3.hashCode();
        }
        int i2 = (hashCode12 + hashCode) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A09;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.A06;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.A08;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List list = this.A0C;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str6 = this.A0B;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str7 = this.A0A;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str8 = this.A03;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Integer num = this.A01;
        if (num == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        String str9 = this.A07;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return i11 + i;
    }
}
