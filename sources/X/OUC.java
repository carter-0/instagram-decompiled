package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class OUC {
    public final MailboxFutureImpl A01(UserSession userSession, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, long j, long j2, boolean z) {
        UserSession userSession2 = userSession;
        String str9 = str;
        AnonymousClass7TF.A1C(userSession2, 0, str9);
        String str10 = str2;
        String str11 = str5;
        C51969G9p.A1O(str10, 6, str11);
        String A0k = DbS.A0k();
        AnonymousClass67N A00 = A00(userSession2);
        Integer valueOf = Integer.valueOf(i);
        List A1I = AnonymousClass7TE.A1I(valueOf);
        List A1I2 = AnonymousClass7TE.A1I(str9);
        List A0z = C66582MXn.A0z(AnonymousClass7TG.A0A(num));
        List A0z2 = C66582MXn.A0z(AnonymousClass7TG.A0A(num2));
        List A1I3 = AnonymousClass7TE.A1I(str10);
        List A0z3 = C66582MXn.A0z(AnonymousClass7TG.A0A(num3));
        List A0z4 = C66582MXn.A0z(AnonymousClass7TG.A0A(num4));
        List A1I4 = AnonymousClass7TE.A1I(str3);
        List A10 = C66582MXn.A10(j2);
        List A0z5 = C66582MXn.A0z(i2);
        List A0z6 = C66582MXn.A0z(0);
        if (str4 == null) {
            str4 = "";
        }
        List A1I5 = AnonymousClass7TE.A1I(str4);
        List A1I6 = AnonymousClass7TE.A1I(str11);
        Integer num6 = num5;
        boolean z2 = z;
        return A00.A00((MailboxCallback) null, num6, l, DbZ.A0d(str8), C70109NxP.A00(userSession2, valueOf, num6, (Integer) null, (Integer) null, l2, str7, z2), str6, A0k, A1I, A1I2, A0z, A0z2, A1I3, A0z3, A0z4, A1I4, A10, A0z5, A0z6, A1I5, A1I6, j, z2);
    }

    public static final AnonymousClass67N A00(UserSession userSession) {
        return ((C70947OSu) C66582MXn.A0c(userSession).A01(C70947OSu.class, C73911Plm.A00(userSession, 14))).A00;
    }
}
