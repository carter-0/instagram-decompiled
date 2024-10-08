package X;

/* renamed from: X.4QQ  reason: invalid class name */
public final class AnonymousClass4QQ implements AnonymousClass4QP {
    /* JADX WARNING: type inference failed for: r0v11, types: [X.4TN, java.lang.Object] */
    public final AnonymousClass4TN ALr(C256683wB r3) {
        String str = r3.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        return new Qo3();
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        return new Qo4();
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        return new Object();
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        return new Qo2();
                    }
                    break;
            }
        }
        throw new IllegalArgumentException(002.A0R("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean Ez7(C256683wB r3) {
        String str = r3.A0W;
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str)) {
            return true;
        }
        return false;
    }
}
