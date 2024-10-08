package X;

/* renamed from: X.6OU  reason: invalid class name */
public abstract class AnonymousClass6OU {
    public static final int A00(String str) {
        float f;
        int i;
        String obj = 00l.A0B(str).toString();
        try {
            if (obj.length() == 0) {
                return 0;
            }
            f = AnonymousClass6Su.A02(obj);
            return (int) f;
        } catch (C258053yO unused) {
            if (obj != null) {
                i = obj.length();
            } else {
                i = 0;
            }
            StringBuilder sb = new StringBuilder(obj);
            if (Character.isDigit((char) obj.codePointAt(i - 1))) {
                sb.append("dp");
            }
            try {
                f = AnonymousClass6Su.A01(sb.toString());
            } catch (C258053yO unused2) {
                return 0;
            }
        }
    }
}
