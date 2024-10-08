package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.Lge  reason: case insensitive filesystem */
public final class C64706Lge implements C252243on {
    public int A00;
    public AnonymousClass8RH A01;
    public 0sP A02;
    public 0sP A03 = null;
    public boolean A04;
    public final ClipsCreationViewModel A05;
    public final AnonymousClass8RF A06;
    public final AnonymousClass861 A07;
    public final AnonymousClass4DH A08;
    public final UserSession A09;
    public final MXI A0A;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C64706Lge(X.AnonymousClass4DH r4, com.instagram.common.session.UserSession r5, X.C390839rv r6, X.MXI r7, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r8, X.AnonymousClass8RF r9, X.AnonymousClass861 r10) {
        /*
            r3 = this;
            r1 = 0
            r0 = 2
            X.DbW.A1O(r5, r0, r6)
            r3.<init>()
            r3.A08 = r4
            r3.A09 = r5
            r3.A06 = r9
            r3.A05 = r8
            r3.A07 = r10
            r3.A0A = r7
            r3.A03 = r1
            X.2Fk r1 = r8.A0C
            r0 = 27
            X.MP5 r0 = X.MP5.A00(r3, r0)
            r2 = 0
            X.Dba.A15(r4, r1, r0, r2)
            X.2Fj r1 = r9.A05
            r0 = 28
            X.MP5 r0 = X.MP5.A00(r3, r0)
            X.Dba.A15(r4, r1, r0, r2)
            X.2Fj r1 = r10.A0G
            r0 = 29
            X.MP5 r0 = X.MP5.A00(r3, r0)
            X.Dba.A15(r4, r1, r0, r2)
            r0 = 35
            X.MId r0 = X.JTO.A1C(r3, r0)
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64706Lge.<init>(X.4DH, com.instagram.common.session.UserSession, X.9rv, X.MXI, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel, X.8RF, X.861):void");
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

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final AnonymousClass831 A00(C64706Lge lge) {
        AnonymousClass831 A0K;
        ClipsCreationViewModel clipsCreationViewModel = lge.A05;
        if (clipsCreationViewModel.A0s() || (A0K = JTQ.A0K(clipsCreationViewModel)) == null) {
            return new AnonymousClass831(0sn.A00, false);
        }
        return A0K;
    }

    public static final void A01(C64706Lge lge) {
        C361278fx r0;
        AnonymousClass8RF r02 = lge.A06;
        AnonymousClass8RH A0E = r02.A0E();
        if (!r02.A0I() && !(A0E instanceof AnonymousClass8RX) && (r0 = (C361278fx) lge.A05.A0C.A02()) != null && r0.A00 == 3 && A03(lge)) {
            lge.A07.A06(A00(lge).A01(lge.A00));
            A00(lge).A01(lge.A00);
            A00(lge);
        }
    }

    public static final void A02(C64706Lge lge) {
        AnonymousClass8RF r1 = lge.A06;
        AnonymousClass8RH A0E = r1.A0E();
        if (r1.A0I() && (A0E instanceof AnonymousClass8RS)) {
            C361278fx r12 = (C361278fx) r1.A05.A02();
            int i = 0;
            if (r12 != null && r12.A00 == 3) {
                AnonymousClass51M A0f = JTO.A0f(A00(lge), ((AnonymousClass8RS) A0E).getSegmentIndex());
                AnonymousClass861 r13 = lge.A07;
                if (A0f != null) {
                    i = A0f.A09;
                }
                r13.A06(i);
            }
        }
    }

    public final void A04() {
        AnonymousClass861 r2 = this.A07;
        this.A04 = AnonymousClass7TF.A1W(r2.A0A.A02(), AnonymousClass8YU.PLAYING);
        r2.A01();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass4DH r0 = this.A08;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHJ.A02(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 20), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final boolean A03(C64706Lge lge) {
        int i;
        if (A00(lge).A01.isEmpty() || (i = lge.A00) < 0 || i >= JTO.A08(A00(lge))) {
            return false;
        }
        return true;
    }
}
