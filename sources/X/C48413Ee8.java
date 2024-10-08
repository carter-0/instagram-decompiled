package X;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.Ee8  reason: case insensitive filesystem */
public abstract class C48413Ee8 {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        FragmentActivity A04 = C308206Td.A04(r5);
        Object A03 = r6.A03(0);
        String A0p = DbS.A0p(A03);
        String str = (String) A03;
        String str2 = (String) DbT.A0q(r6, A0p, 1);
        0qQ.A0B(A04, 0);
        AnonymousClass7TF.A1B(str, 1, str2);
        Intent A09 = DbS.A09();
        Bundle bundle = ActivityOptions.makeCustomAnimation(A04, R.anim.cds_fade_in, R.anim.cds_slide_out_bottom).toBundle();
        A09.setClassName(A04, "com.instagram.caa.registration.transition.CaaRegTransitionScreenActivity");
        A09.setFlags(67108864);
        A09.putExtra("flow_type", str);
        A09.putExtra("flow_name", str2);
        if (bundle == null) {
            0kR.A0B(A04, A09);
        } else {
            0kR.A01(A04, A09, bundle);
        }
        A04.finish();
        return null;
    }
}
