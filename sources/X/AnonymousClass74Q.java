package X;

import android.net.Uri;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.74Q  reason: invalid class name */
public final class AnonymousClass74Q implements AnonymousClass7DY {
    public final /* synthetic */ AnonymousClass7I3 A00;
    public final /* synthetic */ AnonymousClass7XA A01;

    public AnonymousClass74Q(AnonymousClass7I3 r1, AnonymousClass7XA r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void Cy2(Object obj, Object obj2) {
        AnonymousClass9JN r0;
        String str;
        Uri A03;
        C328667Fr r10 = (C328667Fr) obj2;
        DirectMessageIdentifier directMessageIdentifier = r10.A0L;
        String str2 = directMessageIdentifier.A02;
        String str3 = r10.A0Y;
        String str4 = str3;
        if (str3 == null) {
            str3 = r10.A0T;
        }
        String str5 = directMessageIdentifier.A00;
        if (!(str2 == null || str3 == null)) {
            ((C332767Wh) this.A01).AFb(str2, str3, str4, str5, true);
        }
        AnonymousClass7I3 r2 = this.A00;
        if (str2 != null) {
            Set set = r2.A02;
            if (!set.contains(str2)) {
                set.add(str2);
                List list = r10.A0b;
                if (list != null && (r0 = (AnonymousClass9JN) 00k.A0J(list)) != null && (str = r0.A06) != null && (A03 = 0cp.A03(str)) != null) {
                    LinkedHashMap A032 = r2.A03(A03);
                    if (!A032.isEmpty()) {
                        0wc r22 = r2.A01;
                        0Aj A002 = r22.A00(r22.A00, C66579MXk.A00(303));
                        if (A002.isSampled()) {
                            A002.A9H("extra", A032);
                            A002.Cgf();
                        }
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void D77(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void DuS(Object obj) {
    }
}
