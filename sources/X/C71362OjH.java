package X;

import android.view.View;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.OjH  reason: case insensitive filesystem */
public final class C71362OjH implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C59832Ja7 A02;
    public final /* synthetic */ C69365Nk5 A03;
    public final /* synthetic */ C70830ONc A04;
    public final /* synthetic */ DirectThreadKey A05;

    public C71362OjH(C59832Ja7 ja7, C69365Nk5 nk5, C70830ONc oNc, DirectThreadKey directThreadKey, int i, int i2) {
        this.A04 = oNc;
        this.A03 = nk5;
        this.A05 = directThreadKey;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = ja7;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-167985365);
        this.A04.A00(this.A02, C69309NjA.COMPOSER, this.A03, this.A05, this.A01, this.A00);
        AnonymousClass0fD.A0C(-1691820338, A052);
    }
}
