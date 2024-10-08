package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.appwidget.DirectRecipientSearchActivity;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class NSU extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ DirectRecipientSearchActivity A02;
    public final /* synthetic */ C74236PrP A03;
    public final /* synthetic */ List A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSU(Context context, UserSession userSession, DirectRecipientSearchActivity directRecipientSearchActivity, C74236PrP prP, List list) {
        super(1243474276, 3, false, false);
        this.A04 = list;
        this.A02 = directRecipientSearchActivity;
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = prP;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.direct.appwidget.DirectRecipientSearchActivity, android.app.Activity] */
    public final void run() {
        List list = this.A04;
        Iterator it = list.iterator();
        DirectThreadWidgetItem directThreadWidgetItem = null;
        while (it.hasNext()) {
            AnonymousClass2Ep A0c = C66580MXl.A0c(it);
            String C6C = A0c.C6C();
            DirectRecipientSearchActivity directRecipientSearchActivity = this.A02;
            if (0qQ.A0K(C6C, directRecipientSearchActivity.A03) || !00k.A0u(directRecipientSearchActivity.A05, A0c.C6C())) {
                List BRZ = A0c.BRZ();
                ArrayList A0r = AnonymousClass7TG.A0r(BRZ);
                Iterator it2 = BRZ.iterator();
                while (it2.hasNext()) {
                    C66582MXn.A1O(A0r, it2);
                }
                String C6f = A0c.C6f();
                if (C6f == null) {
                    C6f = "";
                }
                String str = null;
                String A0z = DbT.A0z(", ", A0r, (0sP) null);
                UserSession userSession = this.A01;
                String A0o = JTP.A0o((ImageUrl) AnonymousClass48N.A00(userSession, A0c).A00);
                ImageUrl imageUrl = (ImageUrl) AnonymousClass48N.A00(userSession, A0c).A01;
                if (imageUrl != null) {
                    str = imageUrl.getUrl();
                }
                DirectThreadWidgetItem directThreadWidgetItem2 = new DirectThreadWidgetItem(C6f, A0z, A0o, str, A0c.C6C(), A0c.Cdv(userSession));
                if (0qQ.A0K(A0c.C6C(), directRecipientSearchActivity.A03)) {
                    directThreadWidgetItem = directThreadWidgetItem2;
                }
                directRecipientSearchActivity.A06.add(directThreadWidgetItem2);
            }
        }
        ? r4 = this.A02;
        r4.A01 = new C67685MsN(this.A00, directThreadWidgetItem, this.A03, r4.A06);
        r4.runOnUiThread(new C73179PYJ(r4, list));
    }
}
