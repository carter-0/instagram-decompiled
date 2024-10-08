package com.instagram.urlhandlers.aistudio;

import X.08y;
import X.09i;
import X.0Tu;
import X.0Yt;
import X.0qQ;
import X.182;
import X.19B;
import X.1Eo;
import X.1Ln;
import X.1ps;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0fN;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass0xx;
import X.AnonymousClass4D7;
import X.AnonymousClass6ST;
import X.AnonymousClass7AV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.AnonymousClass9B8;
import X.AnonymousClass9B9;
import X.AnonymousClass9BA;
import X.C48053ESw;
import X.C49909FEh;
import X.C49951FGg;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbX;
import X.FFQ;
import X.LRW;
import X.MGS;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class AiStudioUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "AiStudioUrlHandlerActivity";
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.urlhandlers.aistudio.AiStudioUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-1985856541);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -111151562;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = -38352602;
            } else {
                08y r7 = 09i.A0A;
                UserSession A05 = r7.A05(this);
                if (!(A05 instanceof UserSession)) {
                    FFQ.A01(this, A0A, A05);
                    i = 752877134;
                } else {
                    UserSession userSession = A05;
                    0qQ.A0B(userSession, 0);
                    if (AnonymousClass9B8.A07(userSession) && 182.A06(0Tu.A05, userSession, 36319398806625548L)) {
                        AnonymousClass9B9.A00();
                        Integer A002 = AnonymousClass9BA.A00(userSession).A00();
                        Integer num = AnonymousClass05K.A00;
                        if (A002 != num) {
                            Uri A09 = DbT.A09(A0m);
                            List<String> pathSegments = A09.getPathSegments();
                            String str = null;
                            if (pathSegments.contains("ai")) {
                                if (pathSegments.size() >= 2) {
                                    str = pathSegments.get(1);
                                }
                            } else if (pathSegments.contains("chat")) {
                                str = DbT.A0v(A09);
                            }
                            UtmMetadata utmMetadata = new UtmMetadata(A09.getQueryParameter("utm_source"), A09.getQueryParameter("utm_medium"), A09.getQueryParameter("utm_campaign"), A09.getQueryParameter("utm_content"));
                            String str2 = str;
                            if (str2 == null) {
                                UserSession A052 = r7.A05(this);
                                DbS.A1Z(A052);
                                UserSession userSession2 = A052;
                                1Ln A003 = LRW.A00(new LRW(userSession2, (String) null, (String) null));
                                if (DbT.A1Y(A003)) {
                                    A003.A0l("ai_home_deeplink_clicked");
                                    A003.A0v((String) null);
                                    A003.A0x(0Yt.A06(AnonymousClass7TH.A0h("utm_content", utmMetadata.A01, AnonymousClass7TE.A1L("utm_source", utmMetadata.A03), AnonymousClass7TE.A1L("utm_medium", utmMetadata.A02), AnonymousClass7TE.A1L("utm_campaign", utmMetadata.A00))));
                                    A003.Cgf();
                                }
                                C49951FGg.A00(this, utmMetadata, userSession2, "deeplink", (String) null);
                                finish();
                            } else {
                                String str3 = utmMetadata.A03;
                                AnonymousClass0wW A053 = r7.A05(this);
                                DbS.A1Z(A053);
                                1ps A004 = AnonymousClass9B9.A00();
                                AnonymousClass6ST A0h = DbV.A0h(this);
                                DbX.A15(this, A0h);
                                AnonymousClass0fN.A00(A0h);
                                AnonymousClass0xx A0E = DbW.A0E(this);
                                1Eo.A03(num, 19B.A00, new MGS(A053, A0h, A004, this, str3, str2, (AnonymousClass4D7) null, 5), A0E);
                            }
                            i = 236690564;
                        }
                    }
                    C49909FEh fEh = C49909FEh.A00;
                    String A16 = AnonymousClass7TE.A16(this, 2131964884);
                    SpannableStringBuilder A08 = DbW.A08(this, 2131952629);
                    AnonymousClass7AV.A05(A08, new C48053ESw((AiStudioUrlHandlerActivity) this, (AiStudioUrlHandlerActivity) this, AnonymousClass7TF.A03(this, R.attr.igds_color_link)), A16);
                    fEh.A01(this, A08);
                    finish();
                    i = -2033713474;
                }
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
