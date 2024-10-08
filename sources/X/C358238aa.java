package X;

import android.app.Activity;
import android.app.Dialog;
import com.instagram.common.session.UserSession;

/* renamed from: X.8aa  reason: invalid class name and case insensitive filesystem */
public final class C358238aa {
    public final Activity A00;
    public final Dialog A01;
    public final AnonymousClass4DH A02;
    public final AnonymousClass0eM A03;

    public C358238aa(Activity activity, AnonymousClass4DH r7, UserSession userSession, 1Av r9) {
        0qQ.A0B(r9, 3);
        this.A00 = activity;
        this.A02 = r7;
        this.A03 = AnonymousClass0eN.A01(new AnonymousClass9MH(16, (Object) r9, (Object) this, (Object) userSession));
        C358248ab r2 = new C358248ab(activity);
        r2.A05 = activity.getString(2131965635);
        r2.A0q(activity.getString(2131965634));
        String string = activity.getString(2131974918);
        0qQ.A07(string);
        r2.A0c(new C358268ad(this), string);
        String string2 = activity.getString(2131956164);
        0qQ.A07(string2);
        r2.A0a(new C358298ag(this), string2);
        this.A01 = r2.A02();
        if (!r7.mDetached) {
            AnonymousClass0xx A002 = AnonymousClass07a.A00(this.A02.getViewLifecycleOwner());
            C376889Js r22 = new C376889Js(this, (AnonymousClass4D7) null, 42);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r22, A002);
            AnonymousClass11O.A03(AnonymousClass07a.A00(this.A02.getViewLifecycleOwner()), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 32), ((C358328aj) this.A03.getValue()).A03));
        }
    }
}
