package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lgb  reason: case insensitive filesystem */
public final class C64705Lgb implements C252243on {
    public String A00;
    public boolean A01;
    public C262204Co A02;
    public final AnonymousClass4DH A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C305836Jt A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(C66298MMh.A01(this, 29));
    public final AnonymousClass0eM A08;

    public C64705Lgb(AnonymousClass4DH r8, AnonymousClass0iw r9, UserSession userSession, C305836Jt r11) {
        0qQ.A0B(userSession, 2);
        this.A03 = r8;
        this.A05 = userSession;
        this.A04 = r9;
        this.A06 = r11;
        C66298MMh A012 = C66298MMh.A01(this, 33);
        AnonymousClass0eM A002 = C66298MMh.A00(C66298MMh.A01(r8, 30), 0eO.A02, 31);
        this.A08 = DbS.A0I(C66298MMh.A01(A002, 32), A012, new MJ6(7, (Object) null, A002), DbS.A0z(C60310JjB.class));
        r8.registerLifecycleListener(this);
        A00();
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

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final void A00() {
        if (this.A02 == null) {
            this.A02 = AnonymousClass11O.A03(DbV.A0J(this.A03), MHB.A02(this, ((C60310JjB) this.A08.getValue()).A0K, 14));
        }
    }

    public final void onStop() {
        this.A02 = JTQ.A0n(this.A02);
        this.A01 = false;
        this.A06.A02(this.A03, true);
    }

    public final void onStart() {
        A00();
    }
}
