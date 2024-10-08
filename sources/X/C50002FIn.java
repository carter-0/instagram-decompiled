package X;

import android.content.DialogInterface;

/* renamed from: X.FIn  reason: case insensitive filesystem */
public final /* synthetic */ class C50002FIn implements DialogInterface.OnClickListener {
    public final /* synthetic */ 2HA A00;
    public final /* synthetic */ C49681F1p A01;
    public final /* synthetic */ ESU A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C50002FIn(2HA r1, C49681F1p f1p, ESU esu, String str, String str2, boolean z) {
        this.A02 = esu;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A05 = z;
        this.A01 = f1p;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ESU esu = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        ESU.A08(this.A00, this.A01, esu, str, str2, this.A05);
    }
}
