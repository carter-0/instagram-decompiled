package X;

import org.apache.http.client.HttpResponseException;

public final class S16 {
    public int A00;
    public final C11180SEg A01;

    public S16(C11180SEg sEg) {
        0qQ.A0B(sEg, 1);
        this.A01 = sEg;
    }

    public final void A00(Exception exc) {
        if ((exc instanceof HttpResponseException) && ((HttpResponseException) exc).getStatusCode() == 418) {
            this.A00++;
        }
    }
}
