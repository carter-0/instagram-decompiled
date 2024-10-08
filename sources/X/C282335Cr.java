package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5Cr  reason: invalid class name and case insensitive filesystem */
public final class C282335Cr implements 2Ag {
    public final UserSession A00;

    public final void D0Y(1OS r1) {
    }

    public final void D5W(1OS r1) {
    }

    public final void D9f(1OS r1, String str, boolean z) {
    }

    public final /* synthetic */ void D9g(1OS r1, boolean z) {
    }

    public final void DB7(1OS r1) {
    }

    public final void DTK(0xF r1, 1OS r2, boolean z) {
    }

    public final void DTL(0xF r1, 1OS r2, C270214gN r3, boolean z) {
    }

    public final /* synthetic */ void DYZ(String str, String str2, String str3) {
    }

    public final /* synthetic */ void DYd(1OS r1, String str, String str2) {
    }

    public final void Dfi(1OS r1, String str, boolean z) {
    }

    public final void DTP(0xF r6, 1OS r7) {
        String A02;
        List<DirectThreadKey> list;
        String str;
        if (r7 != null && (A02 = r7.A02()) != null) {
            switch (A02.hashCode()) {
                case -1698180071:
                    str = "send_link_message";
                    break;
                case -1507386093:
                    str = "configure_media_message";
                    break;
                case 373889219:
                    if (A02.equals(AnonymousClass000.A00(3305))) {
                        list = Collections.singletonList(((C66111jb) r7).C6K());
                        0qQ.A07(list);
                        break;
                    } else {
                        return;
                    }
                case 1174963788:
                    str = "send_text_message";
                    break;
                default:
                    return;
            }
            if (!A02.equals(str) || (list = ((1bp) r7).C6L()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (DirectThreadKey directThreadKey : list) {
                String str2 = directThreadKey.A00;
                if ((str2 != null && str2.length() != 0) || (str2 = directThreadKey.A01) != null) {
                    arrayList.add(str2);
                }
            }
            for (Object next : arrayList) {
                AnonymousClass7GH A002 = AnonymousClass7GF.A00(this.A00);
                if (0qQ.A0K(A002.A04, next)) {
                    A002.A03 = "";
                    A002.A02 = "";
                    A002.A04 = "";
                    A002.A06 = false;
                }
            }
        }
    }

    public C282335Cr(UserSession userSession) {
        this.A00 = userSession;
    }
}
