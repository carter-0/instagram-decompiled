package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;
import java.util.List;

public final class OO5 {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new C73903Ple(this, 9));

    public OO5(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A01(C376649Iu r16, C74551Pwk pwk, C66241l9 r18) {
        C376649Iu r4 = r16;
        0qQ.A0B(r4, 0);
        C66241l9 r2 = r18;
        new ArmadilloExpressLinkMessageSender(this.A00).A05(r2.A07(), pwk, new 1cX(r4, (C254933tI) null, r2.A02, (OCA) null, (DirectThreadKey) r2.C6L().get(0), r2.A02, NetInfoModule.CONNECTION_TYPE_NONE, r2.A00, false, false));
    }

    public final void A02(C69421Nl3 nl3, C69420Nl2 nl2, C74551Pwk pwk, 1bp r12, Object obj, String str) {
        C65421cY r6;
        C74551Pwk pwk2 = pwk;
        1bp r62 = r12;
        C51974G9v.A1P(pwk, nl3, obj, nl2);
        if (A05((DirectThreadKey) C66582MXn.A0q(r12), r12.A02())) {
            A03(A00(nl3, nl2, obj), (DirectForwardingParams) null, pwk2, r62, str);
            return;
        }
        if (r12 instanceof C65421cY) {
            r6 = (C65421cY) r62;
        } else {
            r6 = null;
        }
        A04(pwk, r6);
    }

    public final void A03(N1Z n1z, DirectForwardingParams directForwardingParams, C74551Pwk pwk, 1bp r17, String str) {
        UserSession userSession = this.A00;
        1bp r5 = r17;
        C70175NyT.A00(userSession).A02(C70992OVn.A00.A00(n1z, userSession, (Media) null, directForwardingParams, r5, str), pwk, r5, (DirectThreadKey) C66582MXn.A0q(r5), 9);
    }

    public final void A04(C74551Pwk pwk, C65421cY r13) {
        1cX ACS;
        if (r13 instanceof 1jn) {
            1jn r132 = (1jn) r13;
            String str = r132.A02;
            if (str != null) {
                1cE r2 = new 1cE((C254933tI) null, r132.A02, (C69343Nji) null, (DirectThreadKey) AnonymousClass7TE.A13(r132.C6L()), 2FW.A1F, r132.A02, Long.valueOf(r132.A00), str);
                OMW omw = new OMW(this.A00);
                new 0xF();
                omw.A01((DirectForwardingParams) null, pwk, r2);
            }
        } else if (r13 != null && (ACS = r13.ACS()) != null) {
            new ArmadilloExpressLinkMessageSender(this.A00).A05((DirectForwardingParams) null, pwk, ACS);
        }
    }

    public final N1Z A00(C69421Nl3 nl3, C69420Nl2 nl2, Object obj) {
        AnonymousClass7TG.A1O(obj, nl2);
        List A13 = C66580MXl.A13(nl3, ((I6A) this.A01.getValue()).A01);
        if (A13 != null) {
            Iterator it = A13.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                OEB oeb = (OEB) it.next();
                if (0qQ.A0K(oeb.A00, obj.getClass())) {
                    N1Z n1z = (N1Z) oeb.A01.invoke(nl2, obj);
                    if (n1z != null) {
                        return n1z;
                    }
                }
            }
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean A05(DirectThreadKey directThreadKey, String str) {
        C242373Tu r0;
        AnonymousClass7TG.A1N(directThreadKey, str);
        UserSession userSession = this.A00;
        AnonymousClass3U9 A0a = C66582MXn.A0a(userSession, directThreadKey);
        if (A0a != null) {
            r0 = A0a.AiM();
        } else {
            r0 = null;
        }
        if (!C331057Pi.A01(userSession, r0)) {
            if (A0a == null) {
                return false;
            }
            if ((A0a.Axj() || A0a.CVE() || C331077Pk.A02.A03(userSession, A0a.AiM())) && 2Aj.A05(userSession, str)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
