package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Ja7  reason: case insensitive filesystem */
public final class C59832Ja7 extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final int A07;

    public C59832Ja7(ImageUrl imageUrl, String str, String str2, String str3) {
        this.A07 = 1;
        this.A07 = 1;
        this.A02 = str;
        this.A01 = imageUrl;
        this.A03 = str2;
        this.A05 = str3;
        this.A06 = false;
        this.A00 = null;
        this.A04 = null;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A07) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C59832Ja7)) {
                    return false;
                }
                C59832Ja7 ja7 = (C59832Ja7) obj;
                if (ja7.A07 != 0 || !0qQ.A0K(this.A04, ja7.A04) || !0qQ.A0K(this.A02, ja7.A02) || !0qQ.A0K(this.A05, ja7.A05) || !0qQ.A0K(this.A03, ja7.A03) || !0qQ.A0K(this.A01, ja7.A01) || !0qQ.A0K(this.A00, ja7.A00) || this.A06 != ja7.A06) {
                    return false;
                }
                return true;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C59832Ja7) {
                    C59832Ja7 ja72 = (C59832Ja7) obj;
                    if (ja72.A07 == 1 && 0qQ.A0K(this.A02, ja72.A02) && 0qQ.A0K(this.A01, ja72.A01) && 0qQ.A0K(this.A03, ja72.A03) && 0qQ.A0K(this.A05, ja72.A05) && this.A06 == ja72.A06 && 0qQ.A0K(this.A00, ja72.A00)) {
                        obj2 = this.A04;
                        obj3 = ja72.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 3:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C59832Ja7) {
                    C59832Ja7 ja73 = (C59832Ja7) obj;
                    if (ja73.A07 == 3 && 0qQ.A0K(this.A01, ja73.A01) && 0qQ.A0K(this.A03, ja73.A03) && 0qQ.A0K(this.A04, ja73.A04) && 0qQ.A0K(this.A02, ja73.A02) && this.A00 == ja73.A00 && this.A06 == ja73.A06) {
                        obj2 = this.A05;
                        obj3 = ja73.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 4:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C59832Ja7) {
                    C59832Ja7 ja74 = (C59832Ja7) obj;
                    if (ja74.A07 == 4 && 0qQ.A0K(this.A03, ja74.A03) && 0qQ.A0K(this.A05, ja74.A05) && 0qQ.A0K(this.A00, ja74.A00) && this.A06 == ja74.A06 && 0qQ.A0K(this.A02, ja74.A02) && 0qQ.A0K(this.A04, ja74.A04)) {
                        obj2 = this.A01;
                        obj3 = ja74.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                return super.equals(obj);
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str;
        switch (this.A07) {
            case 0:
                String str2 = this.A05;
                return DbS.A06(this.A06, (((((AnonymousClass7TF.A08(str2, (AnonymousClass7TE.A0O(this.A04) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31);
            case 1:
                int A0O = AnonymousClass7TE.A0O(this.A02);
                i = (AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A08(this.A05, (AnonymousClass7TF.A07(this.A01, A0O) + AnonymousClass7TG.A0E(this.A03)) * 31)) + AnonymousClass7TG.A0C(this.A00)) * 31;
                str = this.A04;
                break;
            case 3:
                i = AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A00, (((((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31));
                str = this.A05;
                break;
            case 4:
                i = (((AnonymousClass7TF.A09(this.A06, ((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31;
                i2 = AnonymousClass7TE.A0L(this.A01);
                break;
            default:
                return super.hashCode();
        }
        i2 = C41845B3m.A00(str);
        return i + i2;
    }

    public C59832Ja7(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, boolean z) {
        this.A07 = 0;
        this.A04 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A01 = bool;
        this.A00 = bool2;
        this.A06 = z;
    }

    public C59832Ja7(C59721JVf jVf, C62555Khl khl, String str, String str2, String str3, String str4, boolean z) {
        this.A07 = 2;
        0qQ.A0B(str, 1);
        AnonymousClass7TF.A1C(str2, 2, str3);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A01 = khl;
        this.A06 = z;
        this.A00 = jVf;
    }

    public C59832Ja7(C61070Jw8 jw8, C59809JZd jZd, String str, String str2, String str3, String str4) {
        this.A07 = 3;
        this.A07 = 3;
        this.A01 = jw8;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A00 = jZd;
        this.A06 = false;
        this.A05 = str4;
    }

    public C59832Ja7() {
        this.A07 = 4;
        this.A07 = 4;
        this.A07 = 4;
        this.A03 = null;
        this.A05 = null;
        this.A00 = null;
        this.A06 = false;
        this.A02 = null;
        this.A04 = null;
        this.A01 = 0;
    }
}
