package X;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public final class S4j {
    public 0bY A00;
    public C9569Rd9 A01;
    public final List A02;
    public final List A03;

    public final Integer A01(String str) {
        String str2;
        String A0u;
        0qQ.A0B(str, 0);
        0bY r6 = this.A00;
        Uri A002 = 0cp.A00(r6, str);
        if (A002 == null) {
            str2 = "WebViewUriHandler";
            A0u = "Uri cannot be parsed so we block it.";
        } else {
            for (AnonymousClass0cm A012 : this.A02) {
                if (A012.A01(A002)) {
                    return AnonymousClass05K.A00;
                }
            }
            String scheme = A002.getScheme();
            String authority = A002.getAuthority();
            if (scheme == null) {
                scheme = "cannot parse";
            }
            if (authority == null) {
                authority = "cannot parse";
            }
            str2 = "WebViewUriHandler";
            A0u = 002.A0u("Uri is blocked, scheme: ", scheme, " , authority: ", authority);
        }
        r6.EFT(str2, A0u, (Throwable) null);
        return AnonymousClass05K.A0C;
    }

    public S4j(0bY r3, C9569Rd9 rd9, List list, List list2) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A03 = A1C;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        this.A02 = A1C2;
        A1C2.addAll(list2);
        A1C.addAll(list);
        this.A00 = r3;
        this.A01 = rd9;
    }

    public final Integer A00(Context context, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(context, str);
        0bY r3 = this.A00;
        Uri A002 = 0cp.A00(r3, str);
        if (A002 == null) {
            r3.EFT("WebViewUriHandler", "Uri cannot be parsed so we block it.", (Throwable) null);
            return AnonymousClass05K.A0C;
        }
        for (C13442TaV taV : this.A03) {
            String A10 = DbT.A10(A002);
            R8W r8w = ((C12273SqS) taV).A00;
            if (C66580MXl.A1a(r8w.A08, A1Z ? 1 : 0, A10)) {
                r8w.A00();
                return AnonymousClass05K.A01;
            }
        }
        return A01(str);
    }
}
