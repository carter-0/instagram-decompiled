package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.UfU  reason: case insensitive filesystem */
public final class C15602UfU extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ FragmentActivity A03;
    public final /* synthetic */ C307896Rx A04;
    public final /* synthetic */ AnonymousClass6Tm A05;
    public final /* synthetic */ C277014uI A06;
    public final /* synthetic */ C277014uI A07;
    public final /* synthetic */ UserSession A08;

    public C15602UfU(FragmentActivity fragmentActivity, C307896Rx r2, AnonymousClass6Tm r3, C277014uI r4, C277014uI r5, UserSession userSession, int i, int i2, int i3) {
        this.A03 = fragmentActivity;
        this.A08 = userSession;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A07 = r4;
        this.A05 = r3;
        this.A04 = r2;
        this.A06 = r5;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A032 = AnonymousClass0fD.A03(-2014555250);
        C15253UXn uXn = (C15253UXn) obj;
        int A0D = AnonymousClass7TG.A0D(uXn, 1106761629);
        if (uXn.A04) {
            FragmentActivity fragmentActivity = this.A03;
            UserSession userSession = this.A08;
            int i = this.A02;
            int i2 = this.A01;
            int i3 = this.A00;
            C277014uI r5 = this.A06;
            VVG vvg = new VVG(this.A04, this.A05, r5);
            0qQ.A0B(userSession, 1);
            if (fragmentActivity != null) {
                C358248ab r52 = new C358248ab((Activity) fragmentActivity);
                String str2 = uXn.A03;
                if (str2 != null) {
                    r52.A05 = str2;
                    String str3 = uXn.A00;
                    if (str3 != null) {
                        r52.A0q(str3);
                        String str4 = uXn.A01;
                        if (str4 != null) {
                            r52.A0c(new W52(fragmentActivity, vvg, userSession, i, i2, i3), str4);
                            String str5 = uXn.A02;
                            if (str5 != null) {
                                r52.A0b(new W5U(userSession, 32), str5);
                                DbT.A1V(r52);
                                STD.A06((AnonymousClass0iw) null, userSession, (String) null, "av_enrollment", "av_upsell", (String) null);
                            } else {
                                str = "secondaryButtonText";
                            }
                        } else {
                            str = "primaryButtonText";
                        }
                    } else {
                        str = "bodyText";
                    }
                } else {
                    str = DialogModule.KEY_TITLE;
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            C277014uI r2 = this.A07;
            C299275ur.A00(this.A04, this.A05, r2);
        }
        AnonymousClass0fD.A0A(-1749053310, A0D);
        AnonymousClass0fD.A0A(-1995246555, A032);
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(-1042391553);
        C277014uI r2 = this.A07;
        C299275ur.A00(this.A04, this.A05, r2);
        AnonymousClass0fD.A0A(1177259845, A032);
    }
}
