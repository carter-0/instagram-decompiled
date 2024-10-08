package com.instagram.urlhandlers.directgroupinvite;

import X.00k;
import X.00y;
import X.0Gl;
import X.0qQ;
import X.1pE;
import X.1wn;
import X.AnonymousClass0fD;
import X.AnonymousClass1Nd;
import X.AnonymousClass7TE;
import X.C66579MXk;
import X.C71892Osa;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbZ;
import X.Dbb;
import X.FXZ;
import X.OXO;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class DirectGroupInviteHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;
    public final 1wn A01 = FXZ.A00(this, 66);

    public final void A0j(Bundle bundle) {
    }

    public final boolean A0m() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.urlhandlers.directgroupinvite.DirectGroupInviteHandlerActivity, android.app.Activity] */
    public final void finish() {
        DirectGroupInviteHandlerActivity.super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.directgroupinvite.DirectGroupInviteHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String string;
        String str;
        Integer num;
        String str2;
        int A002 = AnonymousClass0fD.A00(-322875276);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (string = A0A.getString("original_url")) == null || string.length() == 0) {
            finish();
            i = 1474522772;
        } else {
            UserSession A003 = 0Gl.A00(DbT.A0W(A0A));
            this.A00 = A003;
            String string2 = A0A.getString("original_url");
            if (string2 == null || string2.length() == 0) {
                finish();
                i = -1092698936;
            } else {
                Uri A09 = DbT.A09(string2);
                String host = A09.getHost();
                String A004 = OXO.A00(A09);
                List<String> pathSegments = A09.getPathSegments();
                if (!OXO.A02(A09)) {
                    str = null;
                } else {
                    0qQ.A0A(pathSegments);
                    str = (String) 00k.A0O(pathSegments, 2);
                }
                String A0Y = Dbb.A0Y(A09, "s");
                String A0Y2 = Dbb.A0Y(A09, "st");
                String A0Y3 = Dbb.A0Y(A09, "cid");
                String A0Y4 = Dbb.A0Y(A09, "fbclid");
                String A0Y5 = Dbb.A0Y(A09, "scid");
                String A0Y6 = Dbb.A0Y(A09, "x");
                if (A004 != null) {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString("group_invite_key", A004);
                    A0a.putString("group_invite_content_key", str);
                    DbZ.A11(A09, A0a, host);
                    if (A0Y != null) {
                        A0a.putString("group_invite_source_key", A0Y);
                    }
                    if (A0Y2 != null) {
                        A0a.putString("group_invite_subtype_key", A0Y2);
                    }
                    if (A0Y3 != null) {
                        A0a.putString("group_invite_creator_id_key", A0Y3);
                    }
                    if (A0Y4 != null) {
                        A0a.putString("group_invite_source_key", C66579MXk.A00(271));
                    }
                    if (A0Y5 != null) {
                        A0a.putString("group_invite_sc_invite_id_key", A0Y5);
                    }
                    if (A0Y6 != null) {
                        A0a.putString("group_invite_message_id_key", A0Y6);
                    }
                    A0A.putAll(A0a);
                    0qQ.A0B(A003, 1);
                    String string3 = A0A.getString("group_invite_key");
                    String string4 = A0A.getString("group_invite_content_key");
                    String string5 = A0A.getString("group_invite_source_key");
                    String string6 = A0A.getString("group_invite_subtype_key");
                    if (string6 != null) {
                        num = 00y.A0l(string6);
                    } else {
                        num = null;
                    }
                    String string7 = A0A.getString("group_invite_creator_id_key");
                    String string8 = A0A.getString("group_invite_sc_invite_id_key");
                    String string9 = A0A.getString("group_invite_message_id_key");
                    if (string3 != null) {
                        if (string5 == null) {
                            str2 = "fbapp_direct_link";
                        } else {
                            str2 = string5;
                        }
                        1pE A012 = 1pE.A01(this, DbS.A0O("DirectUrlHandler"), A003, str2);
                        DbZ.A1Z(A012, string3);
                        A012.A0T = string3;
                        A012.A0R = string4;
                        A012.A0U = string5;
                        A012.A0S = string7;
                        A012.A0E = num;
                        A012.A0V = string8;
                        A012.A0Y = string9;
                        A012.A06();
                    }
                    AnonymousClass1Nd.A00(A003).A01(this.A01, C71892Osa.class);
                    i = -99225056;
                } else {
                    finish();
                    i = -693494808;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(957787030);
        super.onDestroy();
        UserSession userSession = this.A00;
        if (userSession != null) {
            AnonymousClass1Nd.A00(userSession).A02(this.A01, C71892Osa.class);
        }
        this.A00 = null;
        AnonymousClass0fD.A07(1344151975, A002);
    }
}
