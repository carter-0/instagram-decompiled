package X;

import android.view.View;

/* renamed from: X.Oin  reason: case insensitive filesystem */
public final class C71338Oin implements View.OnClickListener {
    public final /* synthetic */ C74474PvU A00;
    public final /* synthetic */ C55866Hon A01;
    public final /* synthetic */ AnonymousClass3M8 A02;

    public C71338Oin(C74474PvU pvU, C55866Hon hon, AnonymousClass3M8 r3) {
        this.A00 = pvU;
        this.A02 = r3;
        this.A01 = hon;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(590721380);
        this.A00.Di4();
        AnonymousClass3M8 r1 = this.A02;
        AnonymousClass3M8.A03(r1, true);
        r1.A0J.remove(this.A01);
        AnonymousClass0fD.A0C(-14105603, A05);
    }
}
