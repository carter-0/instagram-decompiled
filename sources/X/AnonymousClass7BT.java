package X;

import android.view.View;

/* renamed from: X.7BT  reason: invalid class name */
public final class AnonymousClass7BT implements View.OnClickListener {
    public final /* synthetic */ C330147Lp A00;
    public final /* synthetic */ C330077Li A01;

    public AnonymousClass7BT(C330147Lp r1, C330077Li r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1508723479);
        int ordinal = this.A00.A05.A02.ordinal();
        if (ordinal == 24) {
            this.A01.A0F.CxX();
        } else if (ordinal == 25) {
            this.A01.A0F.D0S();
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Invalid left button");
            AnonymousClass0fD.A0C(935718293, A05);
            throw illegalStateException;
        }
        AnonymousClass0fD.A0C(57295655, A05);
    }
}
