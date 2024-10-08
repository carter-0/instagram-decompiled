package X;

import android.view.View;

public final class N4H extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public N4H(Object obj, Object obj2, String str, int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = obj;
        this.A05 = str;
        this.A03 = obj2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N4H) {
                    N4H n4h = (N4H) obj;
                    if (n4h.A00 == 0 && this.A01 == n4h.A01 && this.A02 == n4h.A02 && 0qQ.A0K(this.A03, n4h.A03) && 0qQ.A0K(this.A04, n4h.A04)) {
                        obj2 = this.A05;
                        obj3 = n4h.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof N4H)) {
                    return false;
                }
                N4H n4h2 = (N4H) obj;
                if (n4h2.A00 == 1 && 0qQ.A0K(this.A05, n4h2.A05) && this.A02 == n4h2.A02 && this.A04 == n4h2.A04 && this.A03 == n4h2.A03 && this.A01 == n4h2.A01) {
                    return true;
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N4H) {
                    N4H n4h3 = (N4H) obj;
                    if (n4h3.A00 == 2 && this.A01 == n4h3.A01 && this.A02 == n4h3.A02 && 0qQ.A0K(this.A04, n4h3.A04) && 0qQ.A0K(this.A05, n4h3.A05)) {
                        obj2 = this.A03;
                        obj3 = n4h3.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C;
        int A002;
        switch (this.A00) {
            case 0:
                A0C = ((((((this.A01 * 31) + this.A02) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31;
                A002 = C41845B3m.A00(this.A05);
                break;
            case 1:
                int A07 = AnonymousClass7TF.A07(this.A04, (AnonymousClass7TE.A0O(this.A05) + this.A02) * 31);
                Integer num = (Integer) this.A03;
                A002 = AnonymousClass7TG.A0B(num, C48821Ekj.A00(num), A07);
                A0C = this.A01;
                break;
            default:
                A002 = ((((((this.A01 * 31) + this.A02) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + C41845B3m.A00(this.A05)) * 31;
                A0C = this.A03.hashCode();
                break;
        }
        return A0C + A002;
    }

    public final String toString() {
        String str;
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DirectGifCategoriesTabModel(searchQuery=");
        A1A.append(this.A05);
        A1A.append(", resInt=");
        A1A.append(this.A02);
        A1A.append(", tabType=");
        A1A.append(this.A04);
        A1A.append(", serverType=");
        Integer num = (Integer) this.A03;
        if (num != null) {
            str = C48821Ekj.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", contentDescription=");
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4H(Integer num, int i, int i2) {
        this((Object) null, num, (String) null, i, i2, 0);
        this.A00 = 0;
    }

    public N4H(C69286Nim nim, Integer num, String str, int i, int i2) {
        this.A00 = 1;
        this.A05 = str;
        this.A02 = i;
        this.A04 = nim;
        this.A03 = num;
        this.A01 = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public N4H(View.OnClickListener onClickListener, int i, int i2) {
        this((Object) null, onClickListener, (String) null, i, i2, 2);
        this.A00 = 2;
    }
}
