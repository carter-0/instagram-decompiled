package X;

import android.webkit.WebResourceResponse;

public final class TK3 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ WebResourceResponse A01;
    public final /* synthetic */ QL8 A02;
    public final /* synthetic */ QLA A03;
    public final /* synthetic */ String A04;

    public TK3(WebResourceResponse webResourceResponse, QL8 ql8, QLA qla, String str, long j) {
        this.A02 = ql8;
        this.A03 = qla;
        this.A04 = str;
        this.A01 = webResourceResponse;
        this.A00 = j;
    }

    public final void run() {
        QLA qla = this.A03;
        String str = this.A04;
        boolean A1V = AnonymousClass7TF.A1V(this.A01);
        long j = this.A00;
        if (!qla.A0H()) {
            char c = 1;
            SQO.A03("FB tracking %s requested", new Object[]{str});
            switch (str.hashCode()) {
                case 3710:
                    if (str.equals("tr")) {
                        c = 0;
                        break;
                    } else {
                        return;
                    }
                case 98107086:
                    if (!str.equals("ga_js")) {
                        return;
                    }
                    break;
                case 1017223877:
                    if (str.equals("ga_collect")) {
                        c = 2;
                        break;
                    } else {
                        return;
                    }
                case 1457680597:
                    if (str.equals("fbevents")) {
                        c = 3;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            switch (c) {
                case 0:
                    if (qla.A09 == -1) {
                        qla.A09 = j;
                        qla.A0a = A1V;
                        return;
                    }
                    return;
                case 1:
                    if (qla.A03 == -1) {
                        qla.A03 = j;
                        qla.A0R = A1V;
                        return;
                    }
                    return;
                case 2:
                    if (qla.A02 == -1) {
                        qla.A02 = j;
                        qla.A0Q = A1V;
                        return;
                    }
                    return;
                default:
                    if (qla.A00 == -1) {
                        qla.A00 = j;
                        qla.A0Z = A1V;
                        return;
                    }
                    return;
            }
        }
    }
}
