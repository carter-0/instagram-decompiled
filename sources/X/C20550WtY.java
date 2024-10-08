package X;

import java.util.List;

/* renamed from: X.WtY  reason: case insensitive filesystem */
public final class C20550WtY implements C46214DQs {
    public final /* synthetic */ List A00;
    public final /* synthetic */ C17890Vhh A01;

    public final void DEd(String str, Throwable th) {
        0qQ.A0B(str, 0);
        C18724Vyy.A01(C18724Vyy.A00("report_events_failure", str, th, this.A00), "error", this.A01.A04);
    }

    public C20550WtY(List list, C17890Vhh vhh) {
        this.A01 = vhh;
        this.A00 = list;
    }

    public final void onSuccess() {
        C18724Vyy.A01(C18724Vyy.A00("report_events_success", (String) null, (Throwable) null, this.A00), "info", this.A01.A04);
    }
}
