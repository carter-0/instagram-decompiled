package X;

/* renamed from: X.GXp  reason: case insensitive filesystem */
public final class C52564GXp extends AnonymousClass0T0 implements C251373n0 {
    public final C376509Ig A00;
    public final int A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52564GXp) {
                C52564GXp gXp = (C52564GXp) obj;
                if (!(0qQ.A0K(this.A00, gXp.A00) && this.A02 == gXp.A02 && this.A01 == gXp.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long AsM() {
        throw AnonymousClass7TE.A1B(C273654mx.A00(107));
    }

    public final long B2r() {
        throw AnonymousClass7TE.A1B(C273654mx.A00(109));
    }

    public final /* synthetic */ int B9W() {
        throw AnonymousClass7TE.A1B("Not supported");
    }

    public final /* bridge */ /* synthetic */ Object BTb() {
        return this.A00;
    }

    public final /* synthetic */ Integer Bdb() {
        return AnonymousClass05K.A00;
    }

    public final /* synthetic */ String BnF() {
        return "";
    }

    public final int BnH() {
        return this.A01;
    }

    public final /* synthetic */ String BnL() {
        return "";
    }

    public final /* synthetic */ boolean Bo5() {
        return false;
    }

    public final Integer Bxj() {
        return this.A02;
    }

    public final /* synthetic */ boolean CUo() {
        return false;
    }

    public final /* synthetic */ void Eiv(boolean z) {
        throw AnonymousClass7TE.A1B("Not supported");
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00);
        Integer num = this.A02;
        return AnonymousClass7TG.A0B(num, C271804jc.A01(num), A0K) + this.A01;
    }

    public C52564GXp(C376509Ig r1, Integer num, int i) {
        this.A00 = r1;
        this.A02 = num;
        this.A01 = i;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridSponsoredPoolItem(sponsoredContent=");
        A1A.append(this.A00);
        A1A.append(C273654mx.A00(442));
        Integer num = this.A02;
        if (num != null) {
            str = C271804jc.A01(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(C273654mx.A00(1133));
        return C51975G9x.A0j(A1A, this.A01);
    }
}
