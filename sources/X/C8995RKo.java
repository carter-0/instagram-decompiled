package X;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.RKo  reason: case insensitive filesystem */
public final class C8995RKo extends Exception {
    public static final StackTraceElement[] A06 = new StackTraceElement[0];
    public C13892TjF A00;
    public Class A01;
    public Exception A02;
    public Integer A03;
    public String A04;
    public final List A05;

    public final Throwable fillInStackTrace() {
        return this;
    }

    public static void A00(C8995RKo rKo, Throwable th, List list) {
        if (th instanceof C8995RKo) {
            for (Throwable A002 : ((C8995RKo) th).A05) {
                A00(rKo, A002, list);
            }
            return;
        }
        list.add(th);
    }

    public final String getMessage() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder A14 = Pxe.A14(71);
        A14.append(this.A04);
        Class cls = this.A01;
        String str5 = "";
        if (cls != null) {
            str = AnonymousClass7TG.A0m(cls, ", ", AnonymousClass7TE.A1A());
        } else {
            str = str5;
        }
        A14.append(str);
        Integer num = this.A03;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str4 = "REMOTE";
                    break;
                case 2:
                    str4 = "DATA_DISK_CACHE";
                    break;
                case 3:
                    str4 = "RESOURCE_DISK_CACHE";
                    break;
                case 4:
                    str4 = "MEMORY_CACHE";
                    break;
                default:
                    str4 = "LOCAL";
                    break;
            }
            str2 = 002.A0R(", ", str4);
        } else {
            str2 = str5;
        }
        A14.append(str2);
        C13892TjF tjF = this.A00;
        if (tjF != null) {
            str5 = AnonymousClass7TG.A0m(tjF, ", ", AnonymousClass7TE.A1A());
        }
        A14.append(str5);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A00(this, this, A1C);
        if (!A1C.isEmpty()) {
            if (A1C.size() == 1) {
                str3 = "\nThere was 1 root cause:";
            } else {
                A14.append("\nThere were ");
                A14.append(A1C.size());
                str3 = " root causes:";
            }
            A14.append(str3);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                A14.append(10);
                A14.append(C66581MXm.A0y(th));
                A14.append('(');
                A14.append(th.getMessage());
                A14.append(')');
            }
            A14.append("\n call GlideException#logRootCauses(String) for more detail");
        }
        return A14.toString();
    }

    public C8995RKo(String str, List list) {
        this.A04 = str;
        setStackTrace(A06);
        this.A05 = list;
    }

    public static void A01(Appendable appendable, Throwable th) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw C41845B3m.A0j(th);
        }
    }

    public static void A02(Appendable appendable, List list) {
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof C8995RKo) {
                    C8995RKo rKo = (C8995RKo) th;
                    A01(appendable, rKo);
                    A02(new C12839T9r(appendable), rKo.A05);
                } else {
                    A01(appendable, th);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw C41845B3m.A0j(e);
        }
    }

    public final void printStackTrace(PrintStream printStream) {
        A01(printStream, this);
        A02(new C12839T9r(printStream), this.A05);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        A01(printWriter, this);
        A02(new C12839T9r(printWriter), this.A05);
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }
}
