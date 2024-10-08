package X;

import android.view.View;
import android.view.WindowManager;

public final class Sls implements C13554TcQ {
    public final /* synthetic */ QCN A00;

    public Sls(QCN qcn) {
        this.A00 = qcn;
    }

    public final void onPreviewFrame(C10843Rz3 rz3) {
        C12061Slo slo;
        QCN qcn = this.A00;
        int i = rz3.A02;
        qcn.A00 = i;
        if (!qcn.A08 && (slo = (C12061Slo) qcn.A05.get()) != null) {
            View view = qcn.A03;
            if (view == null) {
                0qQ.A0F("cameraView");
                throw AnonymousClass00P.createAndThrow();
            }
            Object systemService = view.getContext().getSystemService("window");
            0qQ.A0C(systemService, AnonymousClass000.A00(14));
            ((WindowManager) systemService).getDefaultDisplay().getRotation();
            C40161AUb.A00(qcn.A00());
            C40161AUb.A00(qcn.A00());
            slo.A02 = i;
            qcn.A08 = true;
        }
        int i2 = qcn.A02;
        int i3 = rz3.A03;
        if (!(i2 == i3 && qcn.A01 == rz3.A00)) {
            qcn.A02 = i3;
            qcn.A01 = rz3.A00;
            qcn.A09 = false;
        }
        if (!qcn.A09) {
            qcn.requireActivity().runOnUiThread(new TGO(rz3, qcn));
        }
        C13554TcQ tcQ = (C13554TcQ) qcn.A07.get();
        if (tcQ != null) {
            tcQ.onPreviewFrame(rz3);
        }
    }
}
