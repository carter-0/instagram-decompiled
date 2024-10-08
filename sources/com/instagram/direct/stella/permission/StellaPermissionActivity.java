package com.instagram.direct.stella.permission;

import X.002;
import X.0Gl;
import X.0Tu;
import X.0cS;
import X.0qQ;
import X.0s1;
import X.17d;
import X.182;
import X.AnonymousClass0cT;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TF;
import X.C358248ab;
import X.C47405E0x;
import X.C51972G9s;
import X.C67708MtN;
import X.C69370NkA;
import X.C69451Nlv;
import X.C70883OQa;
import X.C71249OgE;
import X.C73667Phg;
import X.C73903Ple;
import X.C73949PmT;
import X.DbS;
import X.DbT;
import X.Dba;
import X.FIT;
import X.JTS;
import X.OUo;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

public final class StellaPermissionActivity extends IgFragmentActivity implements AnonymousClass0iw {
    public static final AnonymousClass0cT A01;
    public final AnonymousClass0eM A00 = DbS.A0I(new C73903Ple(this, 46), new C73903Ple(this, 47), new C73667Phg(38, (Object) null, this), DbS.A0z(C67708MtN.class));

    public final String getModuleName() {
        return "stella_permission_activity";
    }

    static {
        0cS r1 = new 0cS();
        r1.A05("com.instagram.android.fbpermission.MANAGE_MESSAGING");
        r1.A04("MANAGE_DIRECT_MESSAGING");
        A01 = r1.A00();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, com.instagram.direct.stella.permission.StellaPermissionActivity, android.content.Context, X.0iw, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1059355896);
        super.onCreate(bundle);
        OUo oUo = OUo.A00;
        AnonymousClass0cT r1 = A01;
        0qQ.A08(r1);
        C69370NkA A003 = oUo.A00(this, getIntent(), r1);
        Intent A09 = DbS.A09();
        if (A003 != C69370NkA.SUCCESS) {
            setResult(A003.A00, A09);
            finish();
            i = 1786361623;
        } else {
            AnonymousClass0wW A0S = DbS.A0S(this);
            UserSession A012 = 0Gl.A01(A0S);
            if (A012 == null) {
                setResult(7, A09);
                finish();
                i = 259274840;
            } else {
                if (182.A06(0Tu.A05, A012, 36322422458230960L)) {
                    setContentView((int) R.layout.stella_permission_activity);
                    C47405E0x e0x = new C47405E0x();
                    String A004 = 17d.A00(JTS.A0e(A012));
                    0s1 r12 = new 0s1(getSupportFragmentManager());
                    r12.A09(e0x, R.id.layout_container_main);
                    r12.A00();
                    Dba.A15(this, ((C67708MtN) this.A00.getValue()).A00, new C73949PmT(this, A012, A004, 32), 54);
                    C70883OQa.A00((C69451Nlv) null, this, A0S, C51972G9s.A0n(), "PROVIDER_LINKING");
                } else {
                    String username = AnonymousClass7TF.A0Q(A012).getUsername();
                    String str = A012.A06;
                    String A005 = 17d.A00(JTS.A0e(A012));
                    C358248ab A0X = DbS.A0X(this);
                    A0X.A05 = "IG Permission";
                    A0X.A0r(false);
                    A0X.A0q(002.A0g("Allow sending message and receive notification for ", username, " ?"));
                    A0X.A0c(new FIT(this, str, A005, 1), "Yes");
                    A0X.A0b(C71249OgE.A00(this, 65), "No");
                    DbT.A1V(A0X);
                }
                i = 1498625059;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
