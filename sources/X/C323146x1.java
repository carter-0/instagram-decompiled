package X;

/* renamed from: X.6x1  reason: invalid class name and case insensitive filesystem */
public final class C323146x1 implements C323156x2 {
    public final int A00;
    public final 02m A01;

    public final void Ci4(String str) {
        0qQ.A0B(str, 0);
        this.A01.markerPoint(31784979, this.A00, "http_request_faulted", str);
    }

    public final void Cgr() {
        this.A01.markerPoint(31784979, this.A00, "http_request_aborted");
    }

    public final void Chv(String str) {
        this.A01.markerPoint(31784979, this.A00, "http_request_error", str);
    }

    public final void CjV() {
        this.A01.markerPoint(31784979, this.A00, "http_request_cancel");
    }

    public final void CjW() {
        this.A01.markerPoint(31784979, this.A00, "http_request_finish");
    }

    public final void Cja() {
        this.A01.markerPoint(31784979, this.A00, "http_request_start");
    }

    public final void Ck9() {
        this.A01.markerPoint(31784979, this.A00, "http_request_run");
    }

    public final void CkA() {
        this.A01.markerPoint(31784979, this.A00, "http_request_run_finished");
    }

    public final void Cki() {
        this.A01.markerPoint(31784979, this.A00, "http_request_success");
    }

    public C323146x1(int i) {
        this.A00 = i;
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A01 = r0;
    }
}
