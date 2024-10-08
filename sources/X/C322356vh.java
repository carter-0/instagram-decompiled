package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.6vh  reason: invalid class name and case insensitive filesystem */
public final class C322356vh implements C252243on {
    public View A00;
    public View A01;
    public AnonymousClass5Gv A02;
    public C322366vi A03;
    public Runnable A04;
    public boolean A05;
    public final Activity A06;
    public final UserSession A07;
    public final Map A08;
    public final boolean A09;

    public C322356vh(Activity activity, UserSession userSession, String str, boolean z) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(str, 4);
        this.A06 = activity;
        this.A07 = userSession;
        this.A09 = z;
        EnumMap enumMap = new EnumMap(C322366vi.class);
        this.A08 = enumMap;
        enumMap.put(C322366vi.HIGHLIGHTS_TAB, new C322376vj(z, 0eE.A00(userSession).A00().A2A(), str));
        enumMap.put(C322366vi.ORGANIC_INSIGHT, new Object());
        enumMap.put(C322366vi.PANAVISION_PROFILE_UNIFICATION, new Object());
        enumMap.put(C322366vi.EXCLUSIVES_TAB, new C322416vn(str));
        enumMap.put(C322366vi.UPCOMING_EVENT_ON_PROFILE, new C322426vo(str));
        enumMap.put(C322366vi.CREATE_CHANNELS, new Object());
        enumMap.put(C322366vi.WONDER_WALL, new C322446vq(z));
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final void onDestroyView() {
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(View view, View view2, C322386vk r4, C322356vh r5) {
        r5.A01 = view;
        if (view != null && view2 != null && view2.isAttachedToWindow() && r5.A04 == null) {
            r5.A00 = view2;
            r5.A03 = r4.Bdj();
            AnonymousClass9PH r3 = new AnonymousClass9PH(r4, r5);
            r5.A04 = r3;
            r5.A05 = true;
            View view3 = r5.A01;
            if (view3 != null) {
                view3.postDelayed(r3, r4.EKO());
            }
        }
    }

    public final void A01(View view, View view2, C322366vi r9) {
        if (!this.A05) {
            C322366vi[] r5 = C320266s6.A00;
            int i = 0;
            do {
                C322366vi r3 = r5[i];
                C322386vk r2 = (C322386vk) this.A08.get(r3);
                if (r2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No tooltip delegate for ");
                    sb.append(r3);
                    throw new IllegalStateException(sb.toString());
                } else if (r3 == r9) {
                    if (r2.EtR(this.A07, this.A09)) {
                        A00(view, view2, r2, this);
                        return;
                    }
                    return;
                } else {
                    i++;
                }
            } while (i < 7);
        } else if (r9 == this.A03) {
            this.A01 = view;
            this.A00 = view2;
        }
    }

    public final void onPause() {
        View view;
        Runnable runnable = this.A04;
        if (!(runnable == null || (view = this.A01) == null)) {
            view.removeCallbacks(runnable);
        }
        this.A04 = null;
    }
}
