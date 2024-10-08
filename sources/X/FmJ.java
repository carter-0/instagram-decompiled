package X;

import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;

public final class FmJ implements C332277Ui {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FmJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void D9V() {
        String str;
        switch (this.A00) {
            case 1:
                E3h e3h = (E3h) this.A02;
                AnonymousClass0eM r5 = e3h.A01;
                UserSession A0l = AnonymousClass7TE.A0l(r5);
                C368288sN.A00(AnonymousClass818.IG_CHANNELS_XPOSTING_MESSAGE_FOOTER, C368278sM.ACCEPT, AnonymousClass819.BOTTOMSHEET_XPOSTING_CHANNELS, (AnonymousClass81A) null, A0l);
                UserSession A0l2 = AnonymousClass7TE.A0l(r5);
                String str2 = e3h.A00;
                if (str2 == null) {
                    str = "threadId";
                    break;
                } else {
                    C68473NJl A002 = C69939Nuf.A00(A0l2, new C254763t0(str2), C66579MXk.A00(1210));
                    C309516Yo A0P = DbZ.A0P(e3h, r5);
                    A0P.A0B((Bundle) null, A002);
                    A0P.A0A = "broadcast_channel_xposting_education_bottomsheet";
                    A0P.A0F = true;
                    A0P.A04();
                    return;
                }
            case 2:
                new Handler().post(new C51396FtS((C51028FnK) this.A02, (User) this.A01));
                return;
            case 3:
                ((AnonymousClass37D) this.A01).A0P((C332277Ui) null);
                ((Runnable) this.A02).run();
                return;
            case 4:
                Object obj = ((Pair) this.A01).first;
                0qQ.A06(obj);
                ((FV7) this.A02).A04((EWQ) obj);
                return;
            case 6:
                ESI esi = (ESI) this.A02;
                Object obj2 = this.A01;
                C49794F7e.A01(esi, AnonymousClass7TE.A0l(esi.A0E), AnonymousClass000.A00(492), RealtimeSubscription.GRAPHQL_MQTT_VERSION, "0", new C13998To0(esi, 27), new C58691Iw0(42, obj2, esi));
                return;
            case 7:
                ESI esi2 = (ESI) this.A02;
                ESI.A0A(esi2, true);
                ESI.A09(esi2, (User) this.A01, AnonymousClass05K.A0C, false);
                return;
            case 8:
                ((AnonymousClass37D) this.A01).A0P((C332277Ui) null);
                E66 e66 = (E66) this.A02;
                C51889G6e g6e = e66.A03;
                if (g6e != null) {
                    String str3 = e66.A05;
                    if (str3 == null) {
                        str = "targetUserId";
                        break;
                    } else {
                        g6e.DwT(str3);
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((View.OnClickListener) this.A01).onClick((View) this.A02);
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D9a() {
    }
}
