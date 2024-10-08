package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

public final class T0Q implements 2IR {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C58840Ae A02;
    public final /* synthetic */ boolean A03;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        FragmentActivity fragmentActivity = this.A01;
        fragmentActivity.setResult(0, Pxj.A0F(DbS.A09(), "result_type", "new_token", th));
        if (this.A03) {
            SRE.A01(fragmentActivity, AnonymousClass05K.A01);
        }
        fragmentActivity.finish();
        SRE sre = SRE.A00;
        Pxk.A0Q(this.A00, this.A02, sre, AnonymousClass05K.A0j, th);
    }

    public T0Q(Bundle bundle, FragmentActivity fragmentActivity, C58840Ae r3, boolean z) {
        this.A01 = fragmentActivity;
        this.A02 = r3;
        this.A00 = bundle;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C13932Tla tla;
        String str;
        int intValue;
        C13933Tlb tlb;
        AnonymousClass3JD r7 = (AnonymousClass3JD) obj;
        Integer num = null;
        if (r7 == null || (tlb = (C13933Tlb) r7.Bny()) == null) {
            tla = null;
            str = null;
        } else {
            tla = (C13932Tla) ((C250663lr) tlb).getOptionalTreeField(0, "xfb_amazon_bwp_get_access_token(auth_code:$auth_code,extra_data:$extra_data,state:$state)", C7627QQt.class, -1654316616);
            if (tla != null) {
                C250663lr r2 = (C250663lr) tla;
                str = r2.getOptionalStringField(0, "access_token");
                num = Integer.valueOf(r2.getCoercedIntField(1, "expiry_time"));
            }
            str = null;
        }
        if (tla == null || str == null || num == null || (intValue = num.intValue()) == 0) {
            FragmentActivity fragmentActivity = this.A01;
            fragmentActivity.setResult(0, Pxi.A0B("result_type", "new_token").putExtra("error", "null access token or expiry time"));
            SRE.A00.A02(this.A00, this.A02, AnonymousClass05K.A0j, "null access token or expiry time");
            if (this.A03) {
                SRE.A01(fragmentActivity, AnonymousClass05K.A01);
            }
            fragmentActivity.finish();
            return;
        }
        Intent putExtra = Pxi.A0B("result_type", "new_token").putExtra("access_token", str).putExtra("expiry_time", intValue);
        Bundle bundle = this.A00;
        String string = bundle.getString("iab_session_id");
        if (string == null) {
            string = "";
        }
        Intent putExtra2 = putExtra.putExtra("iab_session_id", string);
        0qQ.A07(putExtra2);
        FragmentActivity fragmentActivity2 = this.A01;
        fragmentActivity2.setResult(-1, putExtra2);
        if (this.A03) {
            SRE.A01(fragmentActivity2, AnonymousClass05K.A0C);
        }
        fragmentActivity2.finish();
        SRE.A00.A02(bundle, this.A02, AnonymousClass05K.A0N, (String) null);
    }
}
