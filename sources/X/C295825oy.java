package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5oy  reason: invalid class name and case insensitive filesystem */
public final class C295825oy {
    public int A00;
    public int A01 = -1;
    public AnonymousClass9JG A02;
    public C276114sa A03;
    public C267324bN A04;
    public C295835oz A05 = C295835oz.DEFAULT;
    public C292525j6 A06;
    public C292535j7 A07;
    public String A08;
    public String A09;
    public String A0A = "";
    public String A0B;
    public String A0C;
    public String A0D = "";
    public List A0E;
    public boolean A0F;

    public final List A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36318556988053741L)) {
            return C295325ny.A05(userSession, A02());
        }
        return C295325ny.A07(A02());
    }

    public final C267324bN A00() {
        if (this.A00 >= A02().size()) {
            this.A00 = 0;
        }
        return C295325ny.A02((C276024sM) A02().get(this.A00));
    }

    public final C292535j7 A01() {
        C292535j7 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        throw AnonymousClass00P.createAndThrow();
    }

    public final List A02() {
        List list = this.A0E;
        if (list != null) {
            return list;
        }
        0qQ.A0F("clips");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A04(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C276014sL A002 = C295325ny.A00((C267324bN) it.next());
            if (A002 != null) {
                A02().add(A002);
            }
        }
    }
}
