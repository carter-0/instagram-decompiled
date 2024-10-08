package X;

import android.content.Context;

/* renamed from: X.Lri  reason: case insensitive filesystem */
public final class C65342Lri implements C320986tO {
    public final /* synthetic */ K86 A00;
    public final /* synthetic */ 0sP A01;
    public final /* synthetic */ boolean A02;

    public final /* synthetic */ void DH4(X9T x9t, String str, String str2) {
    }

    public final void DOa(C20997X8u x8u, String str, String str2) {
        String str3 = str2;
        0qQ.A0B(str2, 2);
        K86 k86 = this.A00;
        Context context = k86.getContext();
        if (context != null) {
            boolean z = this.A02;
            0sP r4 = this.A01;
            if (z) {
                1Eo.A05(DbX.A0c(AnonymousClass12T.A00), new C66174MGl((Object) context, (Object) r4, str3, (AnonymousClass4D7) null, 7), DbV.A0J(k86));
                return;
            }
            r4.invoke((Object) null);
        }
    }

    public final /* synthetic */ void DOb(C20997X8u x8u, String str, String str2, String str3) {
    }

    public final void DaG(String str, float f) {
    }

    public C65342Lri(K86 k86, 0sP r2, boolean z) {
        this.A00 = k86;
        this.A02 = z;
        this.A01 = r2;
    }

    public final /* synthetic */ boolean EsB() {
        return false;
    }

    public final void onError(String str) {
        K86 k86 = this.A00;
        if (k86.getContext() != null) {
            2YL A0H = DbS.A0H(k86.A08);
            MHA.A03(A0H, C318116oQ.A00(A0H), 43);
        }
    }
}
