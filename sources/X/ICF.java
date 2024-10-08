package X;

import android.view.View;
import com.instagram.model.hashtag.Hashtag;

public final class ICF implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C381829cQ A01;
    public final /* synthetic */ C242813Wa A02;
    public final /* synthetic */ AnonymousClass3W1 A03;
    public final /* synthetic */ Hashtag A04;

    public ICF(C381829cQ r1, C242813Wa r2, AnonymousClass3W1 r3, Hashtag hashtag, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = hashtag;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1490480367);
        1Xj A002 = ((AnonymousClass3ZT) this.A01.A03).A00();
        this.A02.D2f(A002, this.A03, this.A04, this.A00);
        AnonymousClass0fD.A0C(1409038478, A05);
    }
}
