package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xog  reason: case insensitive filesystem */
public final class C21985Xog {
    public String A00;
    public Map A01;
    public C21971XoG A02;
    public C11427STm A03;
    public C21956Xml A04;

    public final void A01(String str) {
        StringBuilder A1A;
        String str2;
        String str3 = str;
        if (str != null) {
            int i = 3;
            if (str3.regionMatches(true, 0, "ws:", 0, 3)) {
                A1A = AnonymousClass7TE.A1A();
                str2 = "http:";
            } else {
                i = 4;
                if (str3.regionMatches(true, 0, "wss:", 0, 4)) {
                    A1A = AnonymousClass7TE.A1A();
                    str2 = "https:";
                }
                S73 s73 = new S73();
                s73.A02(str3, (C11427STm) null);
                this.A03 = s73.A00();
                return;
            }
            A1A.append(str2);
            str3 = AnonymousClass7TF.A0l(str.substring(i), A1A);
            S73 s732 = new S73();
            s732.A02(str3, (C11427STm) null);
            this.A03 = s732.A00();
            return;
        }
        throw AnonymousClass7TE.A11("url == null");
    }

    public final C21464Xbw A00() {
        if (this.A03 != null) {
            return new C21464Xbw(this);
        }
        throw AnonymousClass7TE.A0z("url == null");
    }

    public final void A02(String str, String str2) {
        C21971XoG xoG = this.A02;
        C22023Xt4.A01(str);
        C22023Xt4.A02(str2, str);
        xoG.A01(str);
        xoG.A02(str, str2);
    }

    public C21985Xog(C21464Xbw xbw) {
        Map linkedHashMap;
        this.A01 = Collections.emptyMap();
        this.A03 = xbw.A03;
        this.A00 = xbw.A00;
        this.A04 = xbw.A04;
        Map map = xbw.A01;
        if (map.isEmpty()) {
            linkedHashMap = Collections.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap(map);
        }
        this.A01 = linkedHashMap;
        this.A02 = C21971XoG.A00(xbw.A02);
    }

    public C21985Xog() {
        this.A01 = Collections.emptyMap();
        this.A00 = "GET";
        this.A02 = new C21971XoG();
    }
}
