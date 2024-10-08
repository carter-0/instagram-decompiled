package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.EUh  reason: case insensitive filesystem */
public class C48063EUh extends ECF {
    public final FragmentActivity A00;
    public final AnonymousClass6ST A01;

    public final void A01(C61284K0v k0v) {
        FragmentActivity fragmentActivity;
        Context context;
        int i;
        String str;
        if (this instanceof HKF) {
            HKF hkf = (HKF) this;
            if (k0v != null) {
                C47154DrV A002 = k0v.FH3();
                boolean A1S = AnonymousClass7TF.A1S(A002.A01 ? 1 : 0, 1);
                HashMap hashMap = A002.A00;
                if (hashMap != null && AnonymousClass7TF.A1Y(hashMap.get("FB"), true)) {
                    fragmentActivity = hkf.A00;
                } else if (A1S) {
                    context = hkf.A00.getBaseContext();
                    i = 2131955351;
                    str = "clips_deep_delete_failed_on_facebook";
                    C59689JTv.A0F(context, str, i);
                }
            }
            context = hkf.A00.getBaseContext();
            i = 2131955350;
            str = "clips_deep_delete_failed";
            C59689JTv.A0F(context, str, i);
        }
        fragmentActivity = this.A00;
        context = fragmentActivity.getBaseContext();
        i = 2131955358;
        str = AnonymousClass000.A00(1178);
        C59689JTv.A0F(context, str, i);
    }

    public C48063EUh(FragmentActivity fragmentActivity, C267324bN r5, UserSession userSession, GBE gbe) {
        super(fragmentActivity, r5, userSession, gbe);
        this.A00 = fragmentActivity;
        AnonymousClass6ST A0h = DbV.A0h(fragmentActivity);
        this.A01 = A0h;
        DbU.A18(fragmentActivity.getBaseContext(), A0h, 2131957622);
    }

    public final void A00(C61284K0v k0v) {
        int A0D = AnonymousClass7TG.A0D(k0v, 701829764);
        super.A00(k0v);
        if (!k0v.FH3().A01) {
            A01(k0v);
        }
        AnonymousClass0fD.A0A(-289764955, A0D);
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 523697489);
        super.onFail(r3);
        A01((C61284K0v) r3.A00());
        AnonymousClass0fD.A0A(-1295177333, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-926840736);
        this.A01.dismiss();
        AnonymousClass0fD.A0A(1106881442, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-2009108654);
        AnonymousClass0fN.A00(this.A01);
        AnonymousClass0fD.A0A(-645455520, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(829093084);
        A00((C61284K0v) obj);
        AnonymousClass0fD.A0A(967990340, A03);
    }
}
