package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.36M  reason: invalid class name */
public final class AnonymousClass36M implements C252243on {
    public View A00;
    public C320256s4 A01;
    public final Fragment A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9LY(this, 49));
    public final AnonymousClass0eM A06;
    public final C228152ks A07;

    public AnonymousClass36M(Fragment fragment, AnonymousClass0iw r9, UserSession userSession, C228152ks r11) {
        0qQ.A0B(r11, 2);
        this.A02 = fragment;
        this.A07 = r11;
        this.A03 = r9;
        this.A04 = userSession;
        AnonymousClass9LF r5 = new AnonymousClass9LF(this, 0);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LF(new AnonymousClass9LF(fragment, 1), 2));
        this.A06 = new C227862kA(new AnonymousClass9LF(A002, 3), r5, new C66216MIx(A002), new 0Yh(AnonymousClass36N.class));
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final void onDestroyView() {
        this.A00 = null;
        this.A01 = null;
        this.A07.FJ2((C249383je) this.A05.getValue());
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void A00(boolean z) {
        if (AnonymousClass39U.A02(this.A04)) {
            2YL r4 = (2YL) this.A06.getValue();
            C318136oS A002 = C318116oQ.A00(r4);
            1Eo.A05(19B.A00, new JV6((Object) r4, (AnonymousClass4D7) null, 42, z), A002);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 13377) {
            AnonymousClass0eM r5 = this.A06;
            2YL r4 = (2YL) r5.getValue();
            C318136oS A002 = C318116oQ.A00(r4);
            1Eo.A05(19B.A00, new C66160MFx(r4, (AnonymousClass4D7) null, 6), A002);
            ((AnonymousClass36N) r5.getValue()).A01();
        }
    }

    public final void onResume() {
        C320256s4 r2 = this.A01;
        if (r2 != null && r2.A01 && r2.A03.getVisibility() == 0) {
            r2.A05.A03(r2.A00);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C320256s4 r0;
        if (view != null) {
            UserSession userSession = this.A04;
            if (AnonymousClass39U.A02(userSession)) {
                View requireViewById = view.requireViewById(R.id.main_feed_quick_snap_preview_stub);
                0qQ.A07(requireViewById);
                View inflate = ((ViewStub) requireViewById).inflate();
                this.A00 = inflate;
                if (inflate != null) {
                    r0 = new C320256s4(new ANF(this), inflate, this.A03, userSession);
                } else {
                    r0 = null;
                }
                this.A01 = r0;
                Fragment fragment = this.A02;
                07U r4 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
                AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
                1Eo.A05(19B.A00, new C58107ImT((Object) viewLifecycleOwner, (Object) r4, (Object) this, (AnonymousClass4D7) null, 21), A002);
                A00(true);
                this.A07.EBt((C249383je) this.A05.getValue());
            }
        }
    }
}
