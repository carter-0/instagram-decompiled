package X;

import com.instagram.nux.cal.model.ContentText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EuW  reason: case insensitive filesystem */
public final class C49368EuW {
    public final List A00;

    public C49368EuW(EVU evu, List list) {
        0sn A1I;
        0qQ.A0B(evu, 2);
        if (list == null) {
            A1I = 0sn.A00;
        } else if (evu == EVU.NO_SPLIT || evu == EVU.NO_SPLIT_HINT_TEXT || evu == EVU.NO_SPLIT_NON_STICKY_FOOTER) {
            A1I = AnonymousClass7TE.A1I(new C49561Exw(list));
        } else {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContentText contentText = (ContentText) it.next();
                Boolean bool = contentText.A00;
                if (bool != null && bool.booleanValue()) {
                    A1C.add(new C49561Exw(00k.A0a(A1C2)));
                    A1C2 = AnonymousClass7TE.A1C();
                }
                A1C2.add(contentText);
            }
            A1C.add(new C49561Exw(A1C2));
            A1I = 00k.A0a(A1C);
        }
        this.A00 = A1I;
    }
}
