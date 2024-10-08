package X;

/* renamed from: X.PIe  reason: case insensitive filesystem */
public final class C72747PIe implements JPU {
    public final /* synthetic */ 02m A00;

    public final void DEc(String str) {
        0KC.A0P("proxy_service", "Connectivity probe failed: %s.", new Object[]{str});
        02m r2 = this.A00;
        r2.markerAnnotate(79499422, "has_meta_connectivity", false);
        r2.markerAnnotate(79499422, "connection_race_failure", str);
    }

    public final void Do9(int i, int i2) {
        0KC.A0P("proxy_service", "Connectivity probe succeeded: %d.", new Object[]{Integer.valueOf(i)});
        02m r4 = this.A00;
        r4.markerAnnotate(79499422, "has_meta_connectivity", true);
        synchronized (NC3.A05) {
            NC3.A04 = true;
            NC3 nc3 = NC3.A03;
            if (nc3 != null) {
                0KC.A0C("proxy_service", "Shutdown proxyservice due to connection race.");
                nc3.A04.stop();
                r4.markerAnnotate(79499422, "cancel_reason", "connection_race");
                r4.markerAnnotate(79499422, "connection_probe_won_race", false);
                r4.markerEnd(79499422, 4);
            }
        }
    }

    public C72747PIe(02m r1) {
        this.A00 = r1;
    }
}
