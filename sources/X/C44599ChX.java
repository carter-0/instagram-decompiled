package X;

import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderContextType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ChX  reason: case insensitive filesystem */
public abstract class C44599ChX {
    public static final C53284GlW A00(BBL bbl) {
        BBD bbd;
        User user;
        DRY dry;
        0qQ.A0B(bbl, 0);
        String str = bbl.A04;
        String str2 = bbl.A03;
        ThreadHeaderStyle threadHeaderStyle = bbl.A02;
        List<C53467Goz> list = bbl.A05;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C53467Goz A00 : list) {
            A0r.add(C54847HVe.A00(A00));
        }
        ThreadContainerType threadContainerType = bbl.A00;
        DRX drx = bbl.A01;
        if (drx != null) {
            C42121BHz bHz = (C42121BHz) drx;
            ThreadHeaderContextType threadHeaderContextType = bHz.A01;
            String str3 = bHz.A02;
            String str4 = bHz.A03;
            DRZ drz = bHz.A00;
            if (drz == null || (dry = ((BI1) drz).A00) == null) {
                user = null;
            } else {
                user = ((BI0) dry).A00;
            }
            bbd = new BBD(threadHeaderContextType, user, str3, str4);
        } else {
            bbd = null;
        }
        return new C53284GlW(threadContainerType, threadHeaderStyle, bbd, str, str2, A0r);
    }
}
