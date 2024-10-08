package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.KrI  reason: case insensitive filesystem */
public abstract class C63089KrI {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        Object A01 = r6.A01();
        DbS.A1Y(A01);
        String str = (String) A01;
        UserSession A0W = DbX.A0W(r5);
        C309516Yo A0M = DbS.A0M(C308206Td.A04(r5), A0W);
        AnonymousClass2BF.A00().A02();
        String str2 = A0W.A06;
        String A12 = DbT.A12(Locale.ROOT, AnonymousClass000.A00(4393));
        0qQ.A0B(str, 0);
        K8G k8g = new K8G();
        DbT.A1N(k8g, AnonymousClass7TH.A0h("arg_full_screen", true, AnonymousClass7TE.A1L("arg_media_id", str), AnonymousClass7TE.A1L("arg_creator_id", str2), AnonymousClass7TE.A1L("arg_entry_point", A12)));
        A0M.A0B((Bundle) null, k8g);
        A0M.A04();
        return null;
    }
}
