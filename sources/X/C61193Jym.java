package X;

/* renamed from: X.Jym  reason: case insensitive filesystem */
public final class C61193Jym extends AnonymousClass0T0 implements MVO {
    public C268714ds A00;
    public final int A01;
    public final C62529KhL A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61193Jym) {
                C61193Jym jym = (C61193Jym) obj;
                if (!(this.A02 == jym.A02 && 0qQ.A0K(this.A04, jym.A04) && 0qQ.A0K(this.A00, jym.A00) && this.A05 == jym.A05 && this.A03 == jym.A03 && this.A01 == jym.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean Ayv() {
        return AnonymousClass7TF.A1W(this.A03, AnonymousClass05K.A01);
    }

    public final boolean BrY() {
        return this.A05;
    }

    public final C62529KhL CAX() {
        return this.A02;
    }

    public final Integer CFq() {
        return this.A03;
    }

    public final String getTitle() {
        return this.A04;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A02);
        int A09 = AnonymousClass7TF.A09(this.A05, (AnonymousClass7TF.A08(this.A04, A0K) + AnonymousClass7TG.A0C(this.A00)) * 31);
        Integer num = this.A03;
        return AnonymousClass7TG.A0B(num, C63166KsZ.A00(num), A09) + this.A01;
    }

    public C61193Jym(C62529KhL khL, C268714ds r2, Integer num, String str, int i, boolean z) {
        this.A02 = khL;
        this.A04 = str;
        this.A00 = r2;
        this.A05 = z;
        this.A03 = num;
        this.A01 = i;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("InteractiveElementModel(type=");
        A1A.append(this.A02);
        A1A.append(", title=");
        A1A.append(this.A04);
        A1A.append(", drawable=");
        A1A.append(this.A00);
        A1A.append(", selected=");
        A1A.append(this.A05);
        A1A.append(", visualState=");
        Integer num = this.A03;
        if (num != null) {
            str = C63166KsZ.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", z=");
        return C51975G9x.A0j(A1A, this.A01);
    }
}
