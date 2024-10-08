package X;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Map;

public final class T7H implements 1DN {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public T7H(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public final void DWm(Map map) {
        String A002;
        switch (this.A00) {
            case 0:
                0qQ.A0B(map, 0);
                Object obj = map.get("android.permission.CALL_PHONE");
                C346927vz r0 = C346927vz.GRANTED;
                Context context = (Context) this.A01;
                String str = this.A03;
                T7B t7b = (T7B) this.A02;
                if (obj == r0) {
                    T7B.A01(t7b, "ctc_call_initiated_directly");
                    A002 = "android.intent.action.CALL";
                } else {
                    T7B.A01(t7b, "ctc_call_initiated_indirectly");
                    A002 = C66579MXk.A00(10);
                }
                Pxj.A12(context, A002, str);
                return;
            case 1:
                0qQ.A0B(map, 0);
                C18500Vsv vsv = (C18500Vsv) this.A02;
                TextView textView = (TextView) this.A01;
                String str2 = this.A03;
                Object obj2 = map.get(str2);
                if (obj2 != null) {
                    C18500Vsv.A00(textView, vsv, str2);
                    C346927vz r02 = C346927vz.DENIED_DONT_ASK_AGAIN;
                    Activity activity = vsv.A01;
                    if (obj2 == r02) {
                        W38.A06(activity, (Integer) null);
                        return;
                    }
                    Map map2 = vsv.A05;
                    String[] A1b = Pxf.A1b(map2.keySet(), 0);
                    if (1DL.A08(activity, (String[]) Arrays.copyOf(A1b, A1b.length))) {
                        1DN r2 = vsv.A00;
                        String[] A1b2 = Pxf.A1b(map2.keySet(), 0);
                        1DL.A04(activity, r2, (String[]) Arrays.copyOf(A1b2, A1b2.length));
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            default:
                0qQ.A0B(map, 0);
                Object obj3 = map.get("android.permission.CALL_PHONE");
                C346927vz r03 = C346927vz.GRANTED;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                String str3 = this.A03;
                T7B t7b2 = (T7B) this.A02;
                if (obj3 == r03) {
                    T7B.A01(t7b2, "ctc_call_initiated_directly");
                    Pxj.A12(fragmentActivity, "android.intent.action.CALL", str3);
                    return;
                }
                T7B.A01(t7b2, "ctc_call_initiated_indirectly");
                FH7.A06(fragmentActivity, (UserSession) null, AnonymousClass47L.AD_DESTINATION_PHONE, (C49716F3b) null, str3, (String) null);
                return;
        }
    }
}
