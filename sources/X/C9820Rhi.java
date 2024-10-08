package X;

import java.util.ArrayList;

/* renamed from: X.Rhi  reason: case insensitive filesystem */
public abstract class C9820Rhi {
    public static final String A00() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        0qQ.A0A(stackTrace);
        Object[] A0Z = 0Yw.A0Z(stackTrace, 3, r7);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object obj : A0Z) {
            String className = ((StackTraceElement) obj).getClassName();
            0qQ.A07(className);
            DbV.A1U(obj, A1C, 00l.A0d(className, "IgdsShowToastEvent", false) ? 1 : 0);
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next : A1C) {
            String className2 = ((StackTraceElement) next).getClassName();
            0qQ.A07(className2);
            DbV.A1U(next, A1C2, 00l.A0d(className2, "IgdsToastUtil", false) ? 1 : 0);
        }
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        for (Object next2 : A1C2) {
            String className3 = ((StackTraceElement) next2).getClassName();
            0qQ.A07(className3);
            DbV.A1U(next2, A1C3, 00l.A0d(className3, "IgShowSnackBarEvent", false) ? 1 : 0);
        }
        if (A1C3.isEmpty()) {
            return "unknown_caller";
        }
        String className4 = ((StackTraceElement) A1C3.get(0)).getClassName();
        0qQ.A07(className4);
        String str = (String) 00k.A0K(DbV.A18(className4, "."));
        ArrayList<StackTraceElement> A1C4 = AnonymousClass7TE.A1C();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className5 = stackTraceElement.getClassName();
            0qQ.A07(className5);
            if (00l.A0d(className5, str, false)) {
                A1C4.add(stackTraceElement);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C4);
        for (StackTraceElement methodName : A1C4) {
            A0r.add(methodName.getMethodName());
        }
        return 002.A0T(str, DbT.A0z("->", 00k.A0Y(A0r), (0sP) null), ':');
    }
}
