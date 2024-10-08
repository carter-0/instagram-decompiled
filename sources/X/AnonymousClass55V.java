package X;

/* renamed from: X.55V  reason: invalid class name */
public final class AnonymousClass55V {
    public static final AnonymousClass55U A00(2ZL r9, String str) {
        0qQ.A0B(str, 0);
        int i = r9.A02;
        AnonymousClass55S A00 = AnonymousClass55S.A05.A00(i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": Response ");
        sb.append(i);
        sb.append(", ");
        sb.append(r9.A03);
        return new AnonymousClass55U(A00, sb.toString(), (String) null, (String) null, (String) null, (Throwable) null, i);
    }

    public static final AnonymousClass55U A01(AnonymousClass55S r6, String str, String str2, Throwable th) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(str, 1);
        return new AnonymousClass55U(r6, str, (String) null, (String) null, str2, th, -1);
    }

    public final AnonymousClass55U A02(2ZL r10, 1Cn r11, String str, Throwable th) {
        String str2;
        String A06;
        if (r10 == null) {
            String message = th.getMessage();
            if (!(message == null || message.length() == 0)) {
                message = new 11S("/VID_[0-9]+_[0-9]+\\.m").A00(new 11S(" ssl=0x[0-9a-f]+").A00(new 11S("[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+").A00(new 11S("[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+").A00(message, "<IPv4>"), "<IPv6>"), " ssl=0x..."), "/VID_xx_xx.m");
            }
            AnonymousClass55S A01 = AnonymousClass55S.A05.A01(AnonymousClass55S.A0G, r11, th);
            if (A01 == AnonymousClass55S.A08) {
                A06 = 002.A0R(str, ": Airplane mode");
            } else {
                Throwable cause = th.getCause();
                if (cause == null || (str2 = cause.getMessage()) == null) {
                    str2 = "NO_CAUSE";
                }
                A06 = 0mp.A06("context: %s, %s:%s", new Object[]{str, message, str2});
            }
            return A01(A01, A06, (String) null, th);
        } else if (r10.A02 == 200) {
            return new AnonymousClass55U(AnonymousClass55S.A0E, 002.A0g(str, ": Invalid reply, ", r10.A03), (String) null, (String) null, (String) null, (Throwable) null, 200);
        } else {
            return A00(r10, str);
        }
    }
}
