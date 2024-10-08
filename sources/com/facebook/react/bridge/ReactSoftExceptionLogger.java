package com.facebook.react.bridge;

import X.002;
import X.0I1;
import X.AnonymousClass7TE;
import X.C13434TaM;
import X.C51968G9o;
import X.JTR;
import X.TQR;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReactSoftExceptionLogger {
    public static final List A00 = new CopyOnWriteArrayList();

    public static void addListener(C13434TaM taM) {
        JTR.A1T(taM, A00);
    }

    public static void clearListeners() {
        A00.clear();
    }

    public static void logSoftException(String str, Throwable th) {
        List list = A00;
        if (list.size() > 0) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("logSoftException");
            }
            return;
        }
        0I1.A05(str, "Unhandled SoftException", th);
    }

    public static void removeListener(C13434TaM taM) {
        A00.remove(taM);
    }

    public static void logNoThrowSoftExceptionWithMessage(String str, String str2) {
        TQR.A00(str2, str);
    }

    public static void logSoftExceptionVerbose(String str, Throwable th) {
        logSoftException(002.A11(str, "|", C51968G9o.A16(th), ":", th.getMessage()), th);
    }
}
