package X;

import android.view.View;

public final class WA4 implements View.OnClickListener {
    public final /* synthetic */ C15795Uie A00;
    public final /* synthetic */ C17195VLz A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public WA4(C15795Uie uie, C17195VLz vLz, String str, String str2, boolean z) {
        this.A01 = vLz;
        this.A04 = z;
        this.A00 = uie;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-998047882);
        C17195VLz vLz = this.A01;
        boolean z = this.A04;
        vLz.A00.A02(!z, false, false);
        this.A00.A04.invoke(Boolean.valueOf(z), this.A03, this.A02);
        AnonymousClass0fD.A0C(496940900, A05);
    }
}
