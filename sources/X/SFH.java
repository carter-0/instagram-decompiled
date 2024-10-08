package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;

public final class SFH {
    public C307896Rx A00;
    public Fragment A01;
    public final Context A02;
    public final C10620RvE A03;

    public static void A00(SFH sfh) {
        C8777R9d r9d = new C8777R9d(sfh, 0);
        Intent flags = Pxe.A0G("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType("image/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", false).setFlags(1);
        try {
            C308206Td.A0K(sfh.A00, r9d);
            0kR.A06(sfh.A01, flags, 1);
        } catch (ActivityNotFoundException e) {
            C10620RvE rvE = sfh.A03;
            C308206Td.A0E(rvE.A00, rvE.A01, Pxf.A1Z(e));
        }
    }

    public SFH(Context context, Fragment fragment, C10620RvE rvE, C307896Rx r4) {
        this.A01 = fragment;
        this.A02 = context;
        this.A00 = r4;
        this.A03 = rvE;
    }
}
