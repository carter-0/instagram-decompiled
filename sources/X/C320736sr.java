package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6sr  reason: invalid class name and case insensitive filesystem */
public final class C320736sr implements C252243on {
    public String A00;
    public final C294895nD A01;
    public final UserSession A02;
    public final String A03;
    public final C320306sA A04;
    public final C229352nF A05;

    public C320736sr(C320306sA r2, C294895nD r3, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = r2;
        this.A01 = r3;
        C229352nF A002 = C229342nE.A00(userSession);
        0qQ.A07(A002);
        this.A05 = A002;
    }

    public final void A00(C276114sa r8, C294895nD r9, List list, boolean z) {
        List list2 = list;
        0qQ.A0B(list, 0);
        C276114sa r1 = r8;
        0qQ.A0B(r8, 1);
        C294895nD r2 = r9;
        0qQ.A0B(r9, 4);
        C229352nF r0 = this.A05;
        String str = this.A00;
        if (str == null) {
            0qQ.A0F("gridKey");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A03(r1, r2, str, list2, z, true);
        }
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onDestroyView() {
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

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onCreate() {
        C320306sA r4 = this.A04;
        this.A00 = r4.B9m();
        for (C229372nH r2 : r4.Any()) {
            C229352nF r1 = this.A05;
            String str = this.A00;
            if (str == null) {
                0qQ.A0F("gridKey");
                throw AnonymousClass00P.createAndThrow();
            }
            r1.A04(r2, str);
        }
        r4.Ao3().A03(new GT2(this));
    }

    public final void onDestroy() {
        this.A05.A07(this.A04.B9m());
    }
}
