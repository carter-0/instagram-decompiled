package X;

import java.lang.ref.WeakReference;

/* renamed from: X.SgR  reason: case insensitive filesystem */
public final class C11779SgR implements C13516Tbl {
    public final WeakReference A00;

    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        S7N s7n = (S7N) obj;
        QAQ qaq = (QAQ) this.A00.get();
        if (qaq != null) {
            qaq.setComposition(s7n);
        }
    }

    public C11779SgR(QAQ qaq) {
        this.A00 = C51965G9l.A0v(qaq);
    }
}
