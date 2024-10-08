package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class PRF implements C74371Ptl {
    public final /* synthetic */ NJq A00;

    public PRF(NJq nJq) {
        this.A00 = nJq;
    }

    public final void DqD(C74280Ps8 ps8) {
        String str;
        NJq nJq = this.A00;
        C74586PxZ pxZ = (C74586PxZ) ps8;
        nJq.A0C = pxZ;
        String str2 = ((PRE) pxZ).A02;
        char c = 65535;
        switch (str2.hashCode()) {
            case -1735392516:
                if (str2.equals("avatar_stickers")) {
                    c = 0;
                    break;
                }
                break;
            case 3172655:
                if (str2.equals("gifs")) {
                    c = 1;
                    break;
                }
                break;
            case 1531715286:
                if (str2.equals("stickers")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                1Au.A00(nJq.A05).A0w("avatar_stickers");
                str = "avatar";
                break;
            case 1:
                1Au.A00(nJq.A05).A0w("gifs");
                str = "gif";
                break;
            case 2:
                1Au.A00(nJq.A05).A0w("stickers");
                str = "sticker";
                break;
            default:
                str = null;
                break;
        }
        UserSession userSession = nJq.A05;
        0qQ.A0B(userSession, 1);
        Nt1.A00(new GSY((Object) null, (Object) AnonymousClass05K.A00, str, (String) null, 7), DbW.A0J(userSession, "ig_direct_expression_tray"), userSession, nJq.A0B, nJq.A0F);
        C74568PxH A002 = nJq.A0D.A00(nJq.getChildFragmentManager(), nJq.A0C);
        if (A002 instanceof C74568PxH) {
            A002.Dhu(nJq.A0G);
        }
        if ((nJq.A04 instanceof AnonymousClass0iw) && (A002 instanceof AnonymousClass0iw)) {
            C71342cb.A00(nJq.A05).A0D(nJq.A04, (String) null, 0);
            nJq.A04 = A002;
        }
        NJq.A01(nJq, ((PRE) ps8).A02);
        IgdsInlineSearchBox igdsInlineSearchBox = nJq.A0A;
        igdsInlineSearchBox.getClass();
        igdsInlineSearchBox.A03();
    }
}
