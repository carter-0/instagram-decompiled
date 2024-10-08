package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl;

/* renamed from: X.7VN  reason: invalid class name */
public final class AnonymousClass7VN implements AnonymousClass7VO {
    public final AnonymousClass4DH A00;
    public final AnonymousClass7VL A01;
    public final UserSession A02;

    public AnonymousClass7VN(AnonymousClass4DH r2, UserSession userSession, AnonymousClass7VL r4) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r4, 3);
        this.A00 = r2;
        this.A02 = userSession;
        this.A01 = r4;
    }

    public final void Eup(Integer num, String str, String str2, String str3) {
        C358248ab r5;
        Resources resources;
        int i;
        0qQ.A0B(num, 0);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        int intValue = num.intValue();
        if (intValue == 0) {
            Context context = this.A00.getContext();
            if (context != null && DisappearingModePluginImpl.A01 != null) {
                r5 = new C358248ab(context);
                r5.A09(2131960951);
                r5.A08(2131960950);
                r5.A0Q((DialogInterface.OnClickListener) null, C358278ae.DEFAULT, 2131968772);
            } else {
                return;
            }
        } else if (intValue != 2) {
            if (intValue == 1) {
                FragmentActivity activity = this.A00.getActivity();
                if (activity != null) {
                    r5 = new C358248ab((Activity) activity);
                    r5.A05 = activity.getResources().getString(2131960942);
                    resources = activity.getResources();
                    i = 2131960940;
                } else {
                    return;
                }
            } else if (intValue == 3) {
                FragmentActivity activity2 = this.A00.getActivity();
                if (activity2 != null) {
                    r5 = new C358248ab((Activity) activity2);
                    r5.A05 = activity2.getResources().getString(2131960958);
                    resources = activity2.getResources();
                    i = 2131960957;
                } else {
                    return;
                }
            } else {
                throw new RuntimeException();
            }
            r5.A0q(resources.getString(i));
            r5.A0S((DialogInterface.OnClickListener) null, C358278ae.DEFAULT, 2131960941, 2131960949);
        } else {
            1as r8 = 1as.A04;
            UserSession userSession = this.A02;
            FragmentActivity requireActivity = this.A00.requireActivity();
            C41359Asg asg = new C41359Asg(this, str, str2, str3);
            C384929i7 r52 = new C384929i7();
            Bundle bundle = new Bundle();
            bundle.putString("link_url", str);
            AnonymousClass0Dg.A00(bundle, userSession);
            r52.setArguments(bundle);
            C331127Pr r3 = new C331127Pr(userSession);
            r3.A0a = false;
            Context context2 = r8.A00;
            r3.A0g = context2.getString(2131960675);
            r3.A1J = true;
            r3.A0K = new ANX(requireActivity, asg);
            r3.A0v = true;
            r3.A0h = context2.getString(2131963104);
            r3.A1N = true;
            r3.A0w = true;
            r3.A03 = 0.5f;
            r3.A1E = true;
            C331157Pu A002 = r3.A00();
            0qQ.A0A(r52);
            OXC.A02(requireActivity, r52, A002, (C62320sa) null);
            return;
        }
        r5.A0r(true);
        r5.A0s(true);
        AnonymousClass0fN.A00(r5.A02());
    }
}
