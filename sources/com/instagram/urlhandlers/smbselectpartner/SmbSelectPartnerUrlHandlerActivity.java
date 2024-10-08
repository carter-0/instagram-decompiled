package com.instagram.urlhandlers.smbselectpartner;

import X.0Gl;
import X.0eE;
import X.0qQ;
import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C253543qx;
import X.C324066yY;
import X.DbT;
import X.DbU;
import X.Dba;
import X.Dbb;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class SmbSelectPartnerUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.smbselectpartner.SmbSelectPartnerUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A002 = AnonymousClass0fD.A00(-752911788);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        if (A0A != null) {
            this.A00 = DbT.A0W(A0A);
        }
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            if (!(r0 instanceof UserSession)) {
                1WK A003 = FFQ.A00();
                AnonymousClass0wW r02 = this.A00;
                if (r02 != null) {
                    A003.A00(this, A0A, r02);
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = 1236237289;
                }
            } else {
                String A0j = AnonymousClass7TG.A0j();
                String stringExtra = intent.getStringExtra("servicetype");
                if (stringExtra != null) {
                    SMBPartnerType A004 = C253543qx.A00(stringExtra);
                    String stringExtra2 = intent.getStringExtra("entrypoint");
                    AnonymousClass0wW r6 = this.A00;
                    if (r6 != null) {
                        0qQ.A0A(stringExtra2);
                        0eE r1 = AnonymousClass0t1.A01;
                        AnonymousClass0wW r03 = this.A00;
                        if (r03 != null) {
                            User A01 = r1.A01(0Gl.A00(r03));
                            SMBPartnerType[] values = SMBPartnerType.values();
                            int length = values.length;
                            int i2 = 0;
                            while (i2 < length && C324066yY.A00(values[i2], A01) == null) {
                                i2++;
                            }
                            AnonymousClass7TF.A1D(A0j, 3, stringExtra2);
                            DbU.A0v();
                            Bundle A0a = AnonymousClass7TE.A0a();
                            Dba.A0v(A0a, stringExtra2, A0j);
                            A0a.putSerializable("args_service_type", A004);
                            AnonymousClass4DH r04 = new AnonymousClass4DH();
                            r04.setArguments(A0a);
                            Dbb.A13(r04, this, r6);
                        } else {
                            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                            i = -1619316094;
                        }
                    } else {
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                        i = 1722141988;
                    }
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = 1456313598;
                }
            }
            AnonymousClass0fD.A07(1998788825, A002);
            return;
        }
        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
        i = -534265347;
        AnonymousClass0fD.A07(i, A002);
        throw illegalStateException;
    }
}
