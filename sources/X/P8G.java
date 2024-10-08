package X;

import android.net.Uri;
import android.view.MotionEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class P8G implements AnonymousClass7DS {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C333017Xi A02;

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        String str;
        String host;
        C328687Ft r7 = (C328687Ft) obj;
        C249703kE r4 = (C249703kE) obj2;
        boolean A1U = AnonymousClass7TF.A1U(0, r7, r4);
        UserSession userSession = this.A01;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36325287201485639L);
        C72193OyD A002 = C69843Nt7.A00(this.A00, userSession);
        List list = r7.A04;
        int size = list.size();
        C68821NYf nYf = (C68821NYf) 00k.A0J(list);
        if (nYf != null) {
            str = nYf.A02.A0L.A00;
        } else {
            str = null;
        }
        String str2 = r7.A03;
        C72193OyD.A00(A002, "stack", "tap", str, str2, size, A06);
        if (A06) {
            C328667Fr A012 = C68821NYf.A01(list, 0);
            AnonymousClass9J6 r72 = A012.A08;
            Uri A09 = DbT.A09(r72.A01);
            List<String> pathSegments = A09.getPathSegments();
            if (pathSegments.size() < 2 || !"reel".equalsIgnoreCase(AnonymousClass7TE.A19(pathSegments, 0)) || (host = A09.getHost()) == null || new 11S(".*instagram.*").A08(host) != A1U) {
                return false;
            }
            String queryParameter = A09.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String A0t = DbU.A0t(pathSegments, A1U ? 1 : 0);
            ((AnonymousClass7Wt) this.A02).CpS(0nA.A0F(JTO.A0F(r4)), (ImageUrl) null, (OMU) null, A012.A0L, (AnonymousClass3OA) null, false, (Boolean) null, queryParameter, A0t, (String) null, (String) null, (String) null, 0qQ.A0K(userSession.A06, r72.A00));
        } else {
            String str3 = C68821NYf.A01(list, 0).A0L.A00;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str4 = C68821NYf.A00(it).A0L.A02;
                if (str4 != null) {
                    A1C.add(str4);
                }
            }
            this.A02.CpQ(str2, str3, A1C);
        }
        return true;
    }

    public P8G(AnonymousClass0iw r1, UserSession userSession, C333017Xi r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = r1;
    }
}
