package X;

import android.graphics.RectF;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.facebook.msys.mci.AuthData;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PSc  reason: case insensitive filesystem */
public final class C72993PSc implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C72993PSc(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A04 = obj;
        this.A01 = obj2;
        this.A03 = obj5;
    }

    /* JADX WARNING: type inference failed for: r0v51, types: [java.lang.Object, X.0bY] */
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C71039Oa5 oa5;
        AuthData authData;
        C74513Pw8 pw8;
        String host;
        switch (this.A00) {
            case 0:
                if (!((C8918RFl) obj).A01) {
                    List list = (List) this.A05;
                    if (AnonymousClass7TE.A1b(list)) {
                        ((T7R) this.A02).A04(new C64430Lbl(1, this.A03, this.A04, this.A01), (List) null, list);
                        return;
                    }
                }
                C299275ur.A00((C307896Rx) this.A01, new AnonymousClass6Tm(AnonymousClass7TE.A1I("Failed to init")), (C277014uI) this.A03);
                return;
            case 1:
                Pair pair = (Pair) obj;
                C74513Pw8 pw82 = null;
                if (pair != null) {
                    authData = (AuthData) pair.first;
                    pw82 = (C74513Pw8) pair.second;
                } else {
                    authData = null;
                }
                RectF rectF = (RectF) this.A04;
                C66633Ma2 ma2 = (C66633Ma2) this.A05;
                C254743sy r8 = (C254743sy) this.A03;
                AnonymousClass7SD r5 = (AnonymousClass7SD) this.A01;
                DirectShareTarget directShareTarget = (DirectShareTarget) this.A02;
                if (!C66633Ma2.A0e(authData, ma2, pw82, new PFZ(0, rectF, r5, ma2, directShareTarget, r8))) {
                    C66633Ma2.A0C(rectF, ma2, r5, (AnonymousClass2Ep) null, directShareTarget, r8);
                    return;
                }
                return;
            case 2:
                Pair pair2 = (Pair) obj;
                AuthData authData2 = null;
                if (pair2 != null) {
                    authData2 = (AuthData) pair2.first;
                    pw8 = (C74513Pw8) pair2.second;
                } else {
                    pw8 = null;
                }
                C66633Ma2 ma22 = (C66633Ma2) this.A05;
                DirectShareTarget directShareTarget2 = (DirectShareTarget) this.A02;
                RectF rectF2 = (RectF) this.A04;
                28D r52 = (28D) this.A01;
                C254743sy r82 = (C254743sy) this.A03;
                if (!C66633Ma2.A0e(authData2, ma22, pw8, new PFZ(1, rectF2, r52, ma22, directShareTarget2, r82))) {
                    UserSession A0p = ma22.A0p();
                    if (directShareTarget2 != null) {
                        C66633Ma2.A0A(rectF2, r52, ma22, C71046OaO.A03(A0p, directShareTarget2), r82);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                return;
            case 3:
                List list2 = (List) obj;
                0qQ.A0A(list2);
                AnonymousClass77B r4 = (AnonymousClass77B) this.A01;
                Iterator it = list2.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (!0qQ.A0K(((C71039Oa5) it.next()).A05(), r4.A0T)) {
                            i++;
                        } else if (i != -1) {
                            P9N p9n = (P9N) this.A05;
                            C254743sy r10 = (C254743sy) this.A03;
                            View view = (View) this.A04;
                            UserSession userSession = p9n.A01;
                            AnonymousClass4DH r42 = p9n.A00;
                            if (C69874Ntc.A00(r42.requireActivity(), userSession, r10)) {
                                AnonymousClass0eK r1 = p9n.A05;
                                MediaViewerReplyBarEligibilityCheckerImpl A002 = C69918NuK.A00(userSession, (AnonymousClass7S7) C66580MXl.A0s(r1));
                                AnonymousClass7H6 r83 = p9n.A02;
                                r42.registerLifecycleListener(r83);
                                DirectShareTarget C6Z = ((AnonymousClass7S7) r1.get()).C6Z(r42.getContext());
                                String str = null;
                                if (AnonymousClass7TF.A1T(i, list2.size()) && (oa5 = (C71039Oa5) 00k.A0O(list2, i)) != null) {
                                    str = oa5.A05();
                                }
                                OM2 om2 = new OM2(r42.requireContext(), view, userSession, r83, C6Z, r10);
                                om2.A06 = list2;
                                om2.A01 = i;
                                om2.A03 = AnonymousClass05K.A01;
                                om2.A05 = str;
                                om2.A02 = A002;
                                om2.A00();
                            }
                        }
                    }
                }
                P9N p9n2 = (P9N) this.A05;
                View view2 = (View) this.A04;
                if (C69874Ntc.A00(p9n2.A00.requireActivity(), p9n2.A01, (C254743sy) p9n2.A06.invoke())) {
                    p9n2.A03.Cpz(view2, new C68168N3i(0nA.A0F(view2), 0.0f), AnonymousClass05K.A01, AnonymousClass7TE.A1I(r4), 0, false, false);
                }
                ((1a8) this.A02).A01();
                return;
            default:
                C257443xP r14 = (C257443xP) obj;
                ((1a8) this.A04).A01();
                if (!r14.A06()) {
                    ArmadilloExpressLinkMessageSender armadilloExpressLinkMessageSender = (ArmadilloExpressLinkMessageSender) this.A05;
                    1cX r2 = (1cX) this.A03;
                    String str2 = r2.A00.A01;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Uri A003 = 0cp.A00(new Object(), str2);
                    if (A003 != null && (host = A003.getHost()) != null && host.equals("www.instagram.com") && AnonymousClass7TE.A19(A003.getPathSegments(), 0).equals("explore") && AnonymousClass7TE.A19(A003.getPathSegments(), 1).equals("locations")) {
                        armadilloExpressLinkMessageSender.A05((DirectForwardingParams) this.A02, (C74551Pwk) this.A01, r2);
                        return;
                    }
                }
                ArmadilloExpressLinkMessageSender.A04((DirectForwardingParams) this.A02, (C278354wk) null, (C74551Pwk) this.A01, (N2L) r14.A04(), (ArmadilloExpressLinkMessageSender) this.A05, (1cX) this.A03);
                return;
        }
    }
}
