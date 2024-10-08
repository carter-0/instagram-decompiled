package X;

import java.util.Arrays;

public final class SFV {
    public Throwable A00;
    public final int A01;
    public final int A02;
    public final long A03 = System.nanoTime();
    public final String A04;
    public final int A05;

    public static Throwable A00(SFV sfv) {
        Throwable th = sfv.A00;
        if (th != null) {
            return th;
        }
        RuntimeException A15 = AnonymousClass7TE.A15(002.A07(sfv.A05, "Binder description: ", sfv.A04, " code: "));
        sfv.A00 = A15;
        StackTraceElement[] stackTrace = A15.getStackTrace();
        int i = 0;
        while (true) {
            int length = stackTrace.length;
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.getClassName().equals("android.os.BinderProxy") || !stackTraceElement.getMethodName().equals("transact")) {
                i++;
            } else if (i != 0) {
                sfv.A00.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
            }
        }
        return sfv.A00;
    }

    public SFV(int i, String str, int i2, int i3) {
        this.A02 = i;
        this.A04 = str;
        this.A05 = i2;
        this.A01 = i3;
    }
}
