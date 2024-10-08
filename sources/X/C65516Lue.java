package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lue  reason: case insensitive filesystem */
public final class C65516Lue implements MU4 {
    public final /* synthetic */ C61992KUp A00;

    public final void DUA(LFH lfh) {
        C61992KUp kUp = this.A00;
        29H A0K = JTS.A0K(kUp.A0F);
        String str = lfh.A01;
        A0K.A0B(str);
        C65512Lua lua = kUp.A02;
        String str2 = "musicSearchResultsView";
        if (lua != null) {
            C60246Ji3 ji3 = lua.A02.A0G;
            if (!0qQ.A0K(ji3.A03, str)) {
                ji3.A03 = str;
                ji3.A00();
            }
            if (lfh.A03) {
                C65512Lua lua2 = kUp.A02;
                if (lua2 != null) {
                    lua2.A00();
                }
            } else if (lfh.A00 > 0) {
                LAU lau = kUp.A01;
                if (lau == null) {
                    str2 = "keywordSearchResultsLoader";
                } else {
                    0qQ.A0B(str, 0);
                    UserSession userSession = lau.A03;
                    int i = lau.A00;
                    1OC A01 = LSH.A01(lau.A01, userSession, AnonymousClass05K.A0Y, str, lau.A05, i);
                    C61499KAe.A00(A01, C61992KUp.A00(lau.A04).A01, lau, 11);
                    lau.A02.schedule(A01);
                }
            }
            JZH jzh = kUp.A04;
            if (jzh == null) {
                str2 = "entityFeedResultsLoader";
            } else {
                jzh.A00(true);
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public C65516Lue(C61992KUp kUp) {
        this.A00 = kUp;
    }

    public final void DBw() {
        C65512Lua lua = this.A00.A02;
        if (lua == null) {
            0qQ.A0F("musicSearchResultsView");
            throw AnonymousClass00P.createAndThrow();
        }
        C60246Ji3 ji3 = lua.A02.A0G;
        ji3.A00 = null;
        ji3.A09.clear();
        ji3.A00();
    }
}
