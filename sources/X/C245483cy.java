package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3cy  reason: invalid class name and case insensitive filesystem */
public final class C245483cy extends RuntimeException {
    public 2Sg A00;
    public final ArrayList A01;
    public final HashMap A02;
    public final 2V1 A03;
    public final String A04;
    public final String A05;

    public final String getMessage() {
        String str;
        C251263mp r1;
        String str2;
        StringBuilder sb = new StringBuilder("Real Cause");
        Throwable cause = getCause();
        if (cause == null) {
            throw new IllegalStateException("Required value was null.");
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null) {
                break;
            }
            cause = cause2;
        }
        2V1 r9 = this.A03;
        if (!(r9 == null || (r1 = r9.A01) == null)) {
            sb.append(" at <cls>");
            Class<?> cls = r1.getClass();
            if (cls != null) {
                str2 = cls.getName();
            } else {
                str2 = null;
            }
            sb.append(str2);
            sb.append("</cls>");
        }
        sb.append(" => ");
        sb.append(cause.getClass().getCanonicalName());
        sb.append(": ");
        sb.append(cause.getMessage());
        sb.append(10);
        sb.append("Litho Context:");
        sb.append(10);
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            sb.append("  layout_stack: ");
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    sb.append((String) arrayList.get(size));
                    if (size != 0) {
                        sb.append(" -> ");
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            sb.append(10);
        }
        if (r9 == null || (str = r9.A02.A01.A07) == null) {
            str = "";
        }
        if ((!00l.A0W(str)) || (str = this.A04) != null) {
            sb.append("  log_tag: ");
            sb.append(str);
            sb.append(10);
        }
        String str3 = this.A05;
        if (str3 != null) {
            sb.append("  tree_root: <cls>");
            sb.append(str3);
            sb.append("</cls>");
            sb.append(10);
        }
        sb.append("  thread_name: ");
        sb.append(Thread.currentThread().getName());
        sb.append(10);
        for (Map.Entry entry : this.A02.entrySet()) {
            sb.append("  ");
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append(10);
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        int length = obj.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            int i3 = length;
            if (!z) {
                i3 = i2;
            }
            int A002 = 0qQ.A00(obj.charAt(i3), 32);
            boolean z2 = false;
            if (A002 <= 0) {
                z2 = true;
            }
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i2++;
            }
        }
        return obj.subSequence(i2, length + 1).toString();
    }

    public C245483cy(2V1 r2, String str, String str2, Throwable th) {
        this.A03 = r2;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = new ArrayList();
        this.A02 = new HashMap();
        initCause(th);
        setStackTrace(new StackTraceElement[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r4 != null) goto L_0x000d;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C245483cy(com.facebook.litho.ComponentTree r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x001b
            X.3mp r0 = r4.A0E()
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = r0.A0J()
        L_0x000d:
            X.2V1 r0 = r4.A0V
            X.3X5 r0 = r0.A02
            if (r0 == 0) goto L_0x001f
            X.2Sa r0 = r0.A01
            java.lang.String r0 = r0.A07
        L_0x0017:
            r3.<init>(r2, r1, r0, r5)
            return
        L_0x001b:
            r1 = r2
            if (r4 == 0) goto L_0x001f
            goto L_0x000d
        L_0x001f:
            r0 = r2
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245483cy.<init>(com.facebook.litho.ComponentTree, java.lang.Throwable):void");
    }
}
