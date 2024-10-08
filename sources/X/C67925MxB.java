package X;

import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.MxB  reason: case insensitive filesystem */
public final class C67925MxB extends C249703kE {
    public final C68082Mzn A00;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2tF, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67925MxB(LayoutInflater layoutInflater, View view, C14140Tqa tqa, XAH xah) {
        super(view);
        C51972G9s.A1D(tqa, xah);
        C68082Mzn mzn = (C68082Mzn) view;
        this.A00 = mzn;
        if (mzn != null) {
            AnonymousClass2tC r1 = new AnonymousClass2tC(layoutInflater);
            r1.A01(new C68623NPt(tqa, xah));
            mzn.setAdapter(DbU.A0U(r1, new Object()));
        }
    }
}
