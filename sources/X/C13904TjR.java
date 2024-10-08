package X;

/* renamed from: X.TjR  reason: case insensitive filesystem */
public interface C13904TjR {
    void reject(Throwable th);

    void resolve(Object obj);

    static void A00(C13904TjR tjR, String str, String str2, String str3, Throwable th) {
        tjR.reject(new RuntimeException(002.A0u(str, str2, str3, th.getMessage())));
    }

    static void A01(String str, String str2, C13904TjR tjR) {
        tjR.reject(new RuntimeException(002.A0R(str, str2)));
    }
}
