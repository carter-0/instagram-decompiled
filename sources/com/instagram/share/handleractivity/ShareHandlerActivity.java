package com.instagram.share.handleractivity;

import X.00l;
import X.0qQ;
import X.1QP;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C10993S4n;
import X.C9851RiQ;
import X.C9853RiS;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public final class ShareHandlerActivity extends BaseShareHandlerActivity {
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-86065008);
        super.onCreate(bundle);
        UserSession A01 = A01();
        if (A01 == null) {
            i = 1241075451;
        } else {
            C10993S4n A002 = C9851RiQ.A00(A01);
            if (A002.A00 == 0) {
                A002.A00 = A002.A02.flowStartForMarker(980420125, "ShareHandlerActivity", false);
            }
            Intent intent = getIntent();
            String valueOf = String.valueOf(intent.getAction());
            String valueOf2 = String.valueOf(intent.getType());
            String str = C9853RiS.A00(this, intent, A01).A04;
            if (00l.A0d(str, AnonymousClass000.A00(2845), false)) {
                intent.putExtra(AnonymousClass000.A00(370), str);
            }
            0qQ.A0B(valueOf, 0);
            AnonymousClass7TG.A1O(valueOf2, str);
            long j = A002.A00;
            if (j != 0) {
                1QP r7 = A002.A02;
                r7.flowAnnotate(j, "action", valueOf);
                r7.flowAnnotate(A002.A00, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, valueOf2);
                r7.flowAnnotate(A002.A00, "source_app", str);
            }
            long j2 = A002.A00;
            if (j2 != 0) {
                A002.A02.flowEndSuccess(j2);
                A002.A00 = 0;
            }
            if (!A04()) {
                finish();
            }
            i = 1026508341;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
