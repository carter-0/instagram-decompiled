package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.HVe  reason: case insensitive filesystem */
public abstract class C54847HVe {
    public static final C53320Gm6 A00(C59639JRh jRh) {
        0qQ.A0B(jRh, 0);
        C53467Goz goz = (C53467Goz) jRh;
        LineType lineType = goz.A00;
        ThreadItemType threadItemType = goz.A01;
        C53491GpN gpN = new C53491GpN(goz.A02);
        List list = goz.A08;
        User user = goz.A03;
        boolean z = goz.A0A;
        boolean z2 = goz.A09;
        return new C53320Gm6(lineType, threadItemType, gpN, user, goz.A04, goz.A07, list, z, z2, false, C51972G9s.A1Z(goz.A05), AnonymousClass7TG.A1X(goz.A06));
    }
}
