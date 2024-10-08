package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.WFv  reason: case insensitive filesystem */
public final class C18994WFv implements 0Bb {
    public final /* synthetic */ C18447Vru A00;

    public C18994WFv(C18447Vru vru) {
        this.A00 = vru;
    }

    public final void Ew5(0Ba r5, String str) {
        String str2;
        String str3 = this.A00.A01;
        if (str3 != null) {
            str = 002.A0g(str, ":", str3);
        }
        List list = r5.A02;
        switch (r5.A00.intValue()) {
            case 0:
                str2 = "Camera wasn't closed before the app was backgrounded.";
                break;
            case 1:
                str2 = "Camera opened while the app was backgrounded.";
                break;
            default:
                str2 = "Camera opened but not used.";
                break;
        }
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(" ");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append(AnonymousClass7TE.A18(it));
            }
            str2 = sb.toString();
        }
        0wb.A05(str, str2, 1, r5.A01);
    }
}
