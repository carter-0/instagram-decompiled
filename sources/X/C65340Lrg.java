package X;

/* renamed from: X.Lrg  reason: case insensitive filesystem */
public final class C65340Lrg implements C320986tO {
    public final int A00;
    public final Object A01;

    public C65340Lrg(int i, AnonymousClass4D7 r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public final void DOa(C20997X8u x8u, String str, String str2) {
        if (this.A00 != 0) {
            0qQ.A0B(str2, 2);
            ((AnonymousClass4D7) this.A01).resumeWith(str2);
            return;
        }
        ((AnonymousClass4D7) this.A01).resumeWith(C60340gF.A00);
    }

    public final /* synthetic */ boolean EsB() {
        return false;
    }

    public final void onError(String str) {
        0eQ A0c;
        int i = this.A00;
        AnonymousClass4D7 r1 = (AnonymousClass4D7) this.A01;
        if (i != 0) {
            A0c = null;
        } else {
            A0c = JTU.A0c(new C66124MCw());
        }
        r1.resumeWith(A0c);
    }

    public final /* synthetic */ void DOb(C20997X8u x8u, String str, String str2, String str3) {
    }

    public final void DaG(String str, float f) {
    }

    public final /* synthetic */ void DH4(X9T x9t, String str, String str2) {
    }
}
