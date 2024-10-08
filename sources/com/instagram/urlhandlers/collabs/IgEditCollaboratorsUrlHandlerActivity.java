package com.instagram.urlhandlers.collabs;

import X.002;
import X.00k;
import X.08y;
import X.09i;
import X.0qQ;
import X.0sn;
import X.182;
import X.1ES;
import X.1Xj;
import X.28D;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass3QO;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C2605946h;
import X.C309516Yo;
import X.C48898Ely;
import X.C60264JiL;
import X.C63211KtI;
import X.C65321LrK;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbY;
import X.FFQ;
import X.K67;
import X.Pxd;
import android.os.Bundle;
import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class IgEditCollaboratorsUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    public static final void A00(UserSession userSession, 1Xj r27, IgEditCollaboratorsUrlHandlerActivity igEditCollaboratorsUrlHandlerActivity) {
        ArrayList arrayList;
        String str;
        MediaTrialStatus mediaTrialStatus;
        C2605946h A1O;
        1Xj r2 = r27;
        String A2U = r2.A2U();
        0sn A3E = r2.A3E();
        if (A3E == null) {
            A3E = 0sn.A00;
        }
        UserSession userSession2 = userSession;
        C60264JiL jiL = new C60264JiL(userSession2);
        jiL.A05 = A3E;
        jiL.A0A.A0B(A3E);
        List coauthorProducers = r2.A0C.getCoauthorProducers();
        if (coauthorProducers != null) {
            arrayList = AnonymousClass7TF.A0p(coauthorProducers);
            Iterator it = coauthorProducers.iterator();
            while (it.hasNext()) {
                DbY.A1W(arrayList, it);
            }
        } else {
            arrayList = 0sn.A00;
        }
        List A3a = r2.A3a();
        ArrayList A0p = AnonymousClass7TF.A0p(A3a);
        Iterator it2 = A3a.iterator();
        while (it2.hasNext()) {
            DbY.A1W(A0p, it2);
        }
        ArrayList A0S = 00k.A0S(A0p, arrayList);
        0qQ.A0B(A0S, 0);
        jiL.A03 = A0S;
        jiL.A09.A0B(A0S);
        boolean A1V = AnonymousClass7TF.A1V(r2.A0C.Aqj());
        String str2 = (String) jiL.A06.A02();
        List list = jiL.A03;
        AnonymousClass3QO r10 = jiL.A01;
        String id = r2.getId();
        if (id != null) {
            28D r7 = 28D.A0J;
            if (!r2.A4q() || (A1O = r2.A1O()) == null) {
                str = null;
            } else {
                str = A1O.getAssetId();
            }
            ClipsTrialDict AoL = r2.A0C.AoL();
            if (AoL != null) {
                mediaTrialStatus = AoL.BzK();
            } else {
                mediaTrialStatus = null;
            }
            boolean A1W = AnonymousClass7TF.A1W(mediaTrialStatus, MediaTrialStatus.ACTIVE);
            String id2 = r2.getId();
            0sn A39 = r2.A39();
            if (A39 == null) {
                A39 = 0sn.A00;
            }
            K67 A00 = C63211KtI.A00(r7, (28D) null, userSession2, r10, true, str2, id, A2U, (String) null, str, id2, A3E, list, arrayList, A39, false, A1V, true, A1W, false, true);
            C309516Yo A0Q = DbU.A0Q(igEditCollaboratorsUrlHandlerActivity, userSession2);
            A0Q.A0B((Bundle) null, A00);
            A0Q.A0D = false;
            A0Q.A04();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.urlhandlers.collabs.IgEditCollaboratorsUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(1779079327);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -1690158902;
        } else {
            08y r5 = 09i.A0A;
            AnonymousClass0wW A05 = r5.A05(this);
            DbS.A1Z(A05);
            if (!182.A06(AnonymousClass7TF.A0H(A05), A05, 36313012185925218L)) {
                finish();
                i = -245895725;
            } else {
                Bundle bundleExtra = getIntent().getBundleExtra(Pxd.A00(13));
                if (bundleExtra == null) {
                    finish();
                    i = -693074787;
                } else {
                    String string = bundleExtra.getString("original_url");
                    if (string == null) {
                        finish();
                        i = 64552229;
                    } else {
                        UserSession A052 = r5.A05(this);
                        if (!(A052 instanceof UserSession)) {
                            FFQ.A00().A00(this, bundleExtra, A052);
                        } else {
                            UserSession userSession = A052;
                            String queryParameter = DbT.A09(string).getQueryParameter("media_id");
                            if (queryParameter == null) {
                                finish();
                            } else {
                                AtomicBoolean atomicBoolean = 1Xj.A0i;
                                String str = userSession.A06;
                                0qQ.A0B(str, 1);
                                1Xj A0U = DbV.A0U(userSession, 002.A0T(queryParameter, str, '_'));
                                if (A0U == null) {
                                    C48898Ely.A00(userSession, 1ES.A01(), new C65321LrK(1, userSession, this), queryParameter);
                                } else {
                                    A00(userSession, A0U, this);
                                }
                            }
                        }
                        i = 701698240;
                    }
                }
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return 09i.A0A.A05(this);
    }
}
