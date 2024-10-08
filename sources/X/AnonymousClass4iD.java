package X;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.4iD  reason: invalid class name */
public class AnonymousClass4iD extends AnonymousClass4iE {
    public LinkedList A00;
    public transient Closeable A01;

    public AnonymousClass4iD(Closeable closeable, String str, Throwable th) {
        super(str, th);
        C12837T9j A1I;
        this.A00 = null;
        this.A01 = closeable;
        if (th instanceof C65181bG) {
            A1I = ((C65171bF) ((C65181bG) th)).A00;
        } else if (closeable instanceof 16F) {
            A1I = ((16F) closeable).A1I();
        } else {
            return;
        }
        this.A00 = A1I;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.Closeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4iD A00(X.T9W r4, java.lang.Throwable r5) {
        /*
            boolean r0 = r5 instanceof X.AnonymousClass4iD
            if (r0 == 0) goto L_0x001d
            X.4iD r5 = (X.AnonymousClass4iD) r5
        L_0x0006:
            java.util.LinkedList r2 = r5.A00
            if (r2 != 0) goto L_0x0011
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r5.A00 = r2
        L_0x0011:
            int r1 = r2.size()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 >= r0) goto L_0x001c
            r2.addFirst(r4)
        L_0x001c:
            return r5
        L_0x001d:
            java.lang.String r3 = X.C269574fL.A09(r5)
            if (r3 == 0) goto L_0x0029
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0039
        L_0x0029:
            java.lang.String r2 = "(was "
            java.lang.Class r0 = r5.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = ")"
            java.lang.String r3 = X.002.A0g(r2, r1, r0)
        L_0x0039:
            r2 = 0
            boolean r0 = r5 instanceof X.C65181bG
            if (r0 == 0) goto L_0x004c
            r0 = r5
            X.1bG r0 = (X.C65181bG) r0
            java.lang.Object r1 = r0.A06()
            boolean r0 = r1 instanceof java.io.Closeable
            if (r0 == 0) goto L_0x004c
            r2 = r1
            java.io.Closeable r2 = (java.io.Closeable) r2
        L_0x004c:
            X.4iD r0 = new X.4iD
            r0.<init>(r2, r3, r5)
            r5 = r0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4iD.A00(X.T9W, java.lang.Throwable):X.4iD");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.T9W, java.lang.Object] */
    public static AnonymousClass4iD A02(Object obj, String str, Throwable th) {
        ? obj2 = new Object();
        obj2.A00 = -1;
        obj2.A03 = obj;
        if (str != null) {
            obj2.A02 = str;
            return A00(obj2, th);
        }
        throw new NullPointerException("Cannot pass null fieldName");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.T9W, java.lang.Object] */
    public static AnonymousClass4iD A03(Object obj, Throwable th, int i) {
        ? obj2 = new Object();
        obj2.A03 = obj;
        obj2.A00 = i;
        return A00(obj2, th);
    }

    @JsonIgnore
    public final Object A06() {
        return this.A01;
    }

    public static AnonymousClass4iD A01(IOException iOException) {
        return new AnonymousClass4iD((Closeable) null, String.format("Unexpected IOException (of type %s): %s", new Object[]{iOException.getClass().getName(), C269574fL.A09(iOException)}));
    }

    public final String A09() {
        StringBuilder sb;
        String message = super.getMessage();
        LinkedList linkedList = this.A00;
        if (linkedList == null) {
            return message;
        }
        if (message != null) {
            sb = new StringBuilder(message);
        }
        sb.append(" (through reference chain: ");
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append("->");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final String getLocalizedMessage() {
        return A09();
    }

    public String getMessage() {
        return A09();
    }

    public AnonymousClass4iD(Closeable closeable, String str) {
        super(str);
        this.A01 = closeable;
        if (closeable instanceof 16F) {
            this.A00 = ((16F) closeable).A1I();
        }
    }
}
