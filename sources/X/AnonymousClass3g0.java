package X;

import java.io.IOException;

/* renamed from: X.3g0  reason: invalid class name */
public final class AnonymousClass3g0 extends IOException {
    public final String A00;

    public AnonymousClass3g0(String str) {
        super(str);
        this.A00 = str;
    }

    public final void A00(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        StringBuilder sb = new StringBuilder();
        sb.append("Exception message: ");
        sb.append(this.A00);
        sb.append(", Reported in: ");
        sb.append(stackTraceElement.getClassName());
        sb.append('.');
        sb.append(stackTraceElement.getMethodName());
        0wb.A03(str, sb.toString());
    }
}
