package X;

import android.view.View;
import com.instagram.model.reels.Reel;

public final class WAC implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C242813Wa A02;
    public final /* synthetic */ AnonymousClass3W1 A03;
    public final /* synthetic */ Reel A04;
    public final /* synthetic */ 1Av A05;
    public final /* synthetic */ AnonymousClass3N3 A06;

    public WAC(1Xj r1, C242813Wa r2, AnonymousClass3W1 r3, Reel reel, 1Av r5, AnonymousClass3N3 r6, int i) {
        this.A05 = r5;
        this.A00 = i;
        this.A02 = r2;
        this.A04 = reel;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r6;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-49875989);
        this.A05.A0b(this.A00 + 1);
        this.A02.D2z(this.A01, this.A03, this.A04, this.A06);
        AnonymousClass0fD.A0C(-638019614, A052);
    }
}
