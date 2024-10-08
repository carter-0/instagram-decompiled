package X;

import java.util.Map;

/* renamed from: X.Tj9  reason: case insensitive filesystem */
public interface C13886Tj9 {
    void logEvent(String str, Map map);

    long now();

    static long A00(C13886Tj9 tj9, long j) {
        return tj9.now() - j;
    }
}
