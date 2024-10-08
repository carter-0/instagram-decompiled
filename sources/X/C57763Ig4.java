package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.Ig4  reason: case insensitive filesystem */
public final class C57763Ig4 implements Runnable {
    public final /* synthetic */ C53146GjI A00;

    public C57763Ig4(C53146GjI gjI) {
        this.A00 = gjI;
    }

    public final void run() {
        int A1c;
        C53152GjO gjO;
        C53146GjI gjI = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View view = gjI.A00;
        if (view.getVisibility() == 0) {
            C59586JPg jPg = gjI.A03;
            if (jPg.CbM(view) && (A1c = ((LinearLayoutManager) gjI.A06.getValue()).A1c()) != -1) {
                C249703kE A0W = gjI.A01.A0W(A1c);
                if (A0W == null || !(A0W instanceof C53152GjO)) {
                    gjO = null;
                } else {
                    gjO = (C53152GjO) A0W;
                }
                jPg.DHD(gjO);
            }
        }
    }
}
