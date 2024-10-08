package X;

import android.view.View;
import com.facebook.quicklog.reliability.CancelReason;

/* renamed from: X.Ohz  reason: case insensitive filesystem */
public final class C71303Ohz implements View.OnClickListener {
    public final /* synthetic */ C314436iG A00;

    public C71303Ohz(C314436iG r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1199545644);
        C314426iF r4 = this.A00.A0o;
        C17833Vgm A002 = C70302O1g.A00(r4.A03);
        A002.A01.flowEndCancel(A002.A00, CancelReason.USER_CANCELLED);
        r4.A07.CLU();
        AnonymousClass0fD.A0C(-2063618284, A05);
    }
}
