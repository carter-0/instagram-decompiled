package X;

import android.content.Intent;

/* renamed from: X.IXa  reason: case insensitive filesystem */
public final class C57317IXa implements JPX {
    public final /* synthetic */ C331157Pu A00;
    public final /* synthetic */ C54147H0r A01;

    public C57317IXa(C331157Pu r1, C54147H0r h0r) {
        this.A01 = h0r;
        this.A00 = r1;
    }

    public final void D8p() {
        this.A00.A07();
    }

    public final void Dgx() {
        Intent intent = new Intent();
        intent.putExtra("ARGUMENT_SCHOOL_REMOVED", true);
        C54147H0r h0r = this.A01;
        DbX.A17(intent, h0r);
        DbT.A1K(h0r);
    }
}
