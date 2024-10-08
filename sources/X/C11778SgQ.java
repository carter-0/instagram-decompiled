package X;

import java.lang.ref.WeakReference;

/* renamed from: X.SgQ  reason: case insensitive filesystem */
public final class C11778SgQ implements C13516Tbl {
    public final WeakReference A00;

    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        QAQ qaq = (QAQ) this.A00.get();
        if (qaq != null) {
            int i = qaq.A00;
            if (i != 0) {
                qaq.setImageResource(i);
            }
            C13516Tbl tbl = qaq.A01;
            if (tbl == null) {
                tbl = QAQ.A0D;
            }
            tbl.onResult(obj);
        }
    }

    public C11778SgQ(QAQ qaq) {
        this.A00 = C51965G9l.A0v(qaq);
    }
}
