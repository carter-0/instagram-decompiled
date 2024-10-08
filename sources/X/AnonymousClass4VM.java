package X;

import com.instagram.quickpromotion.model.FilterType;
import java.util.List;

/* renamed from: X.4VM  reason: invalid class name */
public final class AnonymousClass4VM {
    public FilterType A00 = FilterType.UNKNOWN;
    public AnonymousClass4VP A01;
    public String A02;
    public List A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.4VP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.4VP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.4VP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.4VP} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4VP A00(java.lang.String r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.A03
            r3 = 0
            if (r0 == 0) goto L_0x0021
            java.util.Iterator r2 = r0.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4VP r0 = (X.AnonymousClass4VP) r0
            java.lang.String r0 = r0.A02
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0009
            r3 = r1
        L_0x001f:
            X.4VP r3 = (X.AnonymousClass4VP) r3
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VM.A00(java.lang.String):X.4VP");
    }

    public final String toString() {
        String str;
        List list = this.A03;
        if (list != null) {
            str = 00k.A0P(" : ", "", "", list, (0sP) null);
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{ QPFilter: value: ");
        sb.append(this.A01);
        sb.append(", filter_type:");
        sb.append(this.A00);
        sb.append(", unknown_action:");
        sb.append(this.A02);
        sb.append(", extra_data: ");
        sb.append(str);
        return sb.toString();
    }
}
