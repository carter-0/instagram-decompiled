package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* renamed from: X.2pl  reason: invalid class name and case insensitive filesystem */
public final class C230522pl implements C230532pm {
    public final C228402lc A00;
    public final Activity A01;
    public final UserSession A02;
    public final C230532pm A03;
    public final C230562pp A04;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void Dv0(0jB r9, 1Xj r10, int i, int i2, int i3) {
        ExtendedImageUrl extendedImageUrl;
        int height;
        int width;
        1Wj r2;
        1Xj r4 = r10;
        if (r10.A1p() != null) {
            extendedImageUrl = r10.A1n(this.A01);
        } else {
            extendedImageUrl = null;
        }
        C230532pm r22 = this.A03;
        if (extendedImageUrl == null) {
            height = 0;
            width = 0;
        } else {
            height = extendedImageUrl.getHeight();
            width = extendedImageUrl.getWidth();
        }
        r22.Dv0((0jB) null, r4, i, height, width);
        C228402lc r3 = this.A00;
        AnonymousClass3W1 BQr = r3.BQr(r10);
        if (r10.A5D() && BQr.A03 == 0 && C274244nw.A00()) {
            0xa r1 = AnonymousClass0xl.A00(C61170le.A00).A00;
            int i4 = r1.getInt("carousel_nux_impressions", 0);
            0xY AR4 = r1.AR4();
            AR4.E5Z("carousel_nux_impressions", i4 + 1);
            AR4.apply();
        }
        AnonymousClass3W1 BQr2 = r3.BQr(r10);
        UserSession userSession = this.A02;
        C253953rg A002 = C253943rf.A00(userSession);
        A002.A01.containsKey(r10.A30());
        if (r10.A5D()) {
            BQr2.A0F(this.A01);
        }
        if (r10.A0C.B5V() != null && (r2 = 1Wj.A00) != null) {
            r2.A03(userSession, this.A01, r10.A0C.B5V());
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public final void ChV(1Xj r8, 1Xj r9, 1Xj r10, int i, int i2, int i3) {
        this.A03.ChV(r8, r9, r10, i, i2, i3);
    }

    public final void D6z(View view) {
        this.A03.D6z(view);
    }

    public final void DMB(1Xj r2) {
        this.A03.DMB(r2);
    }

    public final void DMS(1Xj r2, int i) {
        this.A03.DMS(r2, i);
    }

    public final void DMV(View view, 1Xj r3, double d) {
        this.A03.DMV(view, r3, d);
    }

    public final void Duz(1Xj r5) {
        this.A03.Duz(r5);
        C253953rg A002 = C253943rf.A00(this.A02);
        0qQ.A0B(r5, 0);
        String A30 = r5.A30();
        List list = (List) 0u4.A03(A002.A01).remove(A30);
        if (list != null && !list.isEmpty()) {
            0u4.A03(A002.A02).remove(A30);
            RealtimeClientManager.getInstance(A002.A00).graphqlUnsubscribeCommand(list);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A03.onActivityResult(i, i2, intent);
    }

    public final void onCreate() {
        this.A03.onCreate();
    }

    public final void onDestroy() {
        this.A03.onDestroy();
    }

    public final void onDestroyView() {
        this.A03.onDestroyView();
    }

    public final void onPause() {
        this.A03.onPause();
    }

    public final void onResume() {
        this.A03.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.A03.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        this.A03.onStart();
    }

    public final void onStop() {
        this.A03.onStop();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A03.onViewCreated(view, bundle);
    }

    public C230522pl(Activity activity, UserSession userSession, AnonymousClass4DU r5, C228402lc r6) {
        this.A02 = userSession;
        this.A00 = r6;
        C230562pp r1 = new C230562pp(new C230542pn(userSession, r5));
        this.A04 = r1;
        this.A03 = new C230572pq(userSession, r1, r5, r6);
        this.A01 = activity;
    }
}
