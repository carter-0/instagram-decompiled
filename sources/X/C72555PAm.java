package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.PAm  reason: case insensitive filesystem */
public final class C72555PAm implements AnonymousClass7D2 {
    public final UserSession A00;
    public final AnonymousClass7X0 A01;
    public final OZK A02;
    public final AnonymousClass7DZ A03;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        UserSession userSession = this.A00;
        boolean A012 = C70867OPg.A01(userSession);
        int i = R.layout.direct_prompt_xma_legacy;
        if (A012) {
            i = R.layout.direct_prompt_xma_message;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        inflate.getLayoutParams().width = -2;
        C68070Mzb mzb = new C68070Mzb(inflate, userSession);
        OZK ozk = this.A02;
        UserSession userSession2 = ozk.A01;
        if (C70867OPg.A00(userSession2)) {
            C68148N2o n2o = ozk.A04;
            OZK.A01(ozk, mzb, n2o);
            int min = Math.min(4, n2o.A00);
            for (int i2 = !n2o.A03; i2 < min; i2++) {
                OZK.A00((OWC) mzb.A04.get(i2), n2o, i2);
            }
            if (C70867OPg.A00(userSession2)) {
                View view = mzb.A01;
                Object tag = view.getTag();
                if (!(tag instanceof C68148N2o)) {
                    tag = null;
                }
                if (!0qQ.A0K(tag, n2o)) {
                    view.setTag(n2o);
                }
            }
        }
        this.A03.A00(mzb);
        return mzb;
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r4, AnonymousClass7FW r5) {
        C68070Mzb mzb = (C68070Mzb) r4;
        C328687Ft r52 = (C328687Ft) r5;
        AnonymousClass7TG.A1N(mzb, r52);
        AnonymousClass7TJ r2 = (AnonymousClass7TJ) this.A01;
        String str = r52.A02.A00;
        if (str == null) {
            str = "";
        }
        r2.CjC(str, r52.CU2());
        this.A02.A02(mzb, r52);
        this.A03.A02(mzb, r52);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        C68070Mzb mzb = (C68070Mzb) r3;
        0qQ.A0B(mzb, 0);
        for (OWC A012 : mzb.A04) {
            A012.A01();
        }
        this.A03.A01(mzb);
    }

    public C72555PAm(UserSession userSession, AnonymousClass7X0 r2, OZK ozk, AnonymousClass7DZ r4) {
        this.A01 = r2;
        this.A02 = ozk;
        this.A03 = r4;
        this.A00 = userSession;
    }
}
