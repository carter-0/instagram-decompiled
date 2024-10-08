package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.avatars.pokes.PokeReceiverView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.36L  reason: invalid class name */
public final class AnonymousClass36L implements C252243on {
    public PokeReceiverView A00;
    public final Fragment A01;
    public final UserSession A02;

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

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onDestroyView() {
        PokeReceiverView pokeReceiverView = this.A00;
        if (pokeReceiverView != null) {
            0kx r1 = new 0kx(pokeReceiverView);
            while (r1.hasNext()) {
                ((View) r1.next()).clearAnimation();
            }
            pokeReceiverView.removeAllViews();
            pokeReceiverView.A01 = null;
            pokeReceiverView.A04 = null;
        }
        this.A00 = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A05, userSession, 36324239229333399L)) {
            View view2 = view;
            if (view != null) {
                PokeReceiverView pokeReceiverView = this.A00;
                if (pokeReceiverView == null) {
                    View inflate = ((ViewStub) view2.requireViewById(R.id.feed_pokes_stub)).inflate();
                    if (inflate instanceof PokeReceiverView) {
                        pokeReceiverView = (PokeReceiverView) inflate;
                    } else {
                        pokeReceiverView = null;
                    }
                }
                this.A00 = pokeReceiverView;
                if (pokeReceiverView != null) {
                    Fragment fragment = this.A01;
                    pokeReceiverView.A00 = fragment;
                    pokeReceiverView.A02 = userSession;
                    pokeReceiverView.A01 = new 2YN(new C47717EEa(userSession), fragment).A00(C46766Dkt.class);
                    PokeReceiverView.A00(pokeReceiverView);
                    Fragment fragment2 = pokeReceiverView.A00;
                    if (fragment2 != null) {
                        AnonymousClass0xx A002 = C71772f0.A00(fragment2.getLifecycle());
                        1Eo.A05(19B.A00, new C73555Pez(0, (AnonymousClass4D7) null), A002);
                    }
                    C46766Dkt dkt = pokeReceiverView.A01;
                    if (dkt != null) {
                        EQ4 eq4 = dkt.A01;
                        if (eq4.A00 == null) {
                            if (eq4.A01.CQG()) {
                                eq4.A01 = new 1HR(100);
                            }
                            2IS r6 = new 2IS();
                            2IS r5 = new 2IS();
                            AnonymousClass0K0 r4 = GraphQlCallInput.A02;
                            UserSession userSession2 = eq4.A02;
                            String str = userSession2.A06;
                            0Df A022 = r4.A02();
                            0Df.A00(A022, str, "poke_receiver_id");
                            r6.A00.A02().A0E(A022, AnonymousClass000.A00(1466));
                            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
                            eq4.A00 = 1vm.A01(userSession2).A01((2Kw) null, new C64395LbC(eq4), new PandoGraphQLRequest(AnonymousClass1vS.A00(), "PokesSubscription", r6.getParamsCopy(), r5.getParamsCopy(), BrI.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_poke_v2_subscribe"), 0, (String) null, "xdt_poke_v2_subscribe", new ArrayList()));
                        }
                    }
                }
            }
        }
    }

    public AnonymousClass36L(Fragment fragment, UserSession userSession) {
        this.A01 = fragment;
        this.A02 = userSession;
    }
}
