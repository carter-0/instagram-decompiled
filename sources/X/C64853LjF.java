package X;

import android.view.View;
import java.util.List;

/* renamed from: X.LjF  reason: case insensitive filesystem */
public final class C64853LjF implements AnonymousClass3NL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C60704Jpp A01;
    public final /* synthetic */ C230242pG A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public C64853LjF(C60704Jpp jpp, C230242pG r2, String str, List list, int i) {
        this.A02 = r2;
        this.A03 = str;
        this.A00 = i;
        this.A04 = list;
        this.A01 = jpp;
    }

    public final void DP5(View view) {
        C230242pG r3 = this.A02;
        String str = this.A03;
        r3.Dcf(this.A04, this.A00, str);
    }

    public final boolean Dqe(View view) {
        C230242pG r0 = this.A02;
        String str = this.A03;
        int i = this.A00;
        r0.Dca(this.A01, (AnonymousClass3O9) null, (Integer) null, str, (String) null, this.A04, i, false);
        return true;
    }
}
