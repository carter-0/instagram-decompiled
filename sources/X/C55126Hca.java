package X;

/* renamed from: X.Hca  reason: case insensitive filesystem */
public abstract class C55126Hca {
    public static final C54672HOd A00(C54672HOd hOd, String str) {
        if (hOd == null) {
            hOd = C54672HOd.DEEPLINK;
        }
        for (C54672HOd hOd2 : C54672HOd.values()) {
            if (0qQ.A0K(hOd2.A00, str)) {
                return hOd2;
            }
        }
        return hOd;
    }
}
