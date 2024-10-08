package X;

import org.apache.http.client.HttpResponseException;

public abstract class SAS {
    public static final String A01(Throwable th) {
        String A02 = C239023El.A00('|').A02(SS5.A01(th));
        0qQ.A07(A02);
        return A02;
    }

    public static final int A00(Throwable th) {
        for (HttpResponseException httpResponseException : SS5.A01(th)) {
            if (httpResponseException instanceof HttpResponseException) {
                return httpResponseException.getStatusCode();
            }
        }
        return -1;
    }
}
