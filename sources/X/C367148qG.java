package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.WindowManager;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8qG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C367148qG implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C351978Be A01;

    public /* synthetic */ C367148qG(View view, C351978Be r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        Activity activity;
        C351978Be r0 = this.A01;
        View view = this.A00;
        AnonymousClass8BA r9 = r0.A00;
        AnonymousClass846 r8 = r9.A1X;
        if (!r8.A00().A01 && (activity = r9.A0n) != null && !activity.isFinishing() && !activity.isDestroyed()) {
            C349317zw A002 = r8.A00();
            InteractiveDrawableContainer interactiveDrawableContainer = r9.A1s;
            if (!A002.A01(interactiveDrawableContainer, view, C366978pz.A0y)) {
                C342877pJ r4 = r9.A05;
                if (r4 != null) {
                    1Av r3 = r4.A02;
                    if (!((Boolean) r3.A56.CDM(r3, 1Av.A8a[323])).booleanValue() && !r3.A1o()) {
                        r4.A00();
                        return;
                    }
                }
                UserSession userSession = r9.A0v;
                C317746nl r10 = r9.A1o;
                boolean z = r9.A0w.A08.A00 instanceof AnonymousClass9QA;
                0qQ.A0B(userSession, 1);
                0qQ.A0B(r10, 2);
                if (z && !1Au.A00(userSession).A01.getBoolean("has_seen_story_comments_settings_dialog_nux", false)) {
                    UserSession userSession2 = r10.A00;
                    0Tu r102 = 0Tu.A05;
                    if (182.A06(r102, userSession2, 36318247749949468L) && 182.A06(r102, userSession2, 2342161256964495392L)) {
                        ColorDrawable colorDrawable = new ColorDrawable(0);
                        F3t f3t = new F3t(activity);
                        String string = activity.getResources().getString(2131974382);
                        0qQ.A07(string);
                        f3t.A06 = string;
                        String string2 = activity.getResources().getString(2131974383);
                        0qQ.A07(string2);
                        f3t.A04 = string2;
                        f3t.A03(colorDrawable);
                        f3t.A05 = AnonymousClass05K.A01;
                        String string3 = activity.getString(2131968772);
                        0qQ.A07(string3);
                        f3t.A02((DialogInterface.OnClickListener) null, string3);
                        try {
                            f3t.A01();
                        } catch (WindowManager.BadTokenException unused) {
                        }
                        0xY AR4 = 1Au.A00(userSession).A01.AR4();
                        AR4.E5T("has_seen_story_comments_settings_dialog_nux", true);
                        AR4.apply();
                        return;
                    }
                }
                if ((!0eE.A00(userSession).A00().A2L() || !182.A06(0Tu.A05, userSession, 36317358692439121L) || !r8.A00().A01(interactiveDrawableContainer, view, C366978pz.A0I)) && 182.A06(0Tu.A05, userSession, 36319939967065906L)) {
                    r8.A00().A01(interactiveDrawableContainer, view, C366978pz.A13);
                }
            }
        }
    }
}
