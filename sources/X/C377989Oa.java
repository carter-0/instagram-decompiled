package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Oa  reason: invalid class name and case insensitive filesystem */
public final class C377989Oa implements AnonymousClass339, C252243on {
    public boolean A00;
    public final View A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final C227762js A04;
    public final UserSession A05;
    public final X9Q A06;
    public final AnonymousClass4DU A07;
    public final AnonymousClass339 A08;
    public final C238133Ar A09;
    public final C249763kK A0A;
    public final boolean A0B;

    public C377989Oa(View view, Fragment fragment, C227762js r6, UserSession userSession, X9Q x9q, AnonymousClass4DU r9, AnonymousClass339 r10, C238133Ar r11, C249763kK r12) {
        AnonymousClass7TG.A0w(1, r12, userSession, r9);
        this.A0A = r12;
        this.A02 = fragment;
        this.A05 = userSession;
        this.A07 = r9;
        this.A01 = view;
        this.A04 = r6;
        this.A06 = x9q;
        this.A09 = r11;
        this.A08 = r10;
        this.A03 = fragment.requireActivity();
        boolean A062 = 182.A06(0Tu.A05, userSession, 36323586395876648L);
        this.A0B = A062;
        if (!A062 && (fragment instanceof AnonymousClass4DJ)) {
            ((AnonymousClass4DJ) fragment).registerLifecycleListener(this);
        }
    }

    public final void AAo(int i) {
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final Integer BE0(1Xj r2) {
        0qQ.A0B(r2, 0);
        return this.A08.BE0(r2);
    }

    public final C54512HGy CG9(1Xj r11) {
        C246623eu r5;
        0qQ.A0B(r11, 0);
        UserSession userSession = this.A05;
        FragmentActivity fragmentActivity = this.A03;
        if (!r11.CcK()) {
            return null;
        }
        if (r11.CeS()) {
            r5 = r11.A1S();
        } else {
            r5 = new C246623eu(r11.A0y(), r11.A0x());
        }
        C55174HdQ A012 = C263264Jy.A01(fragmentActivity, userSession, r5, AnonymousClass337.EXPLORE_GRID_WATCH_AND_BROWSE, AnonymousClass05K.A01, false, false);
        if (A012 instanceof C54512HGy) {
            return (C54512HGy) A012;
        }
        return null;
    }

    public final void Co3(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A08.Co3(r2);
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        if (this.A0B) {
            AnonymousClass4DJ r1 = this.A02;
            if (r1 instanceof AnonymousClass4DJ) {
                r1.registerLifecycleListener(this);
            }
        }
    }

    public final boolean E0m(View view, 1Xj r8, C55865Hom hom, AnonymousClass3W1 r10, C54512HGy hGy) {
        AnonymousClass7TG.A1O(r8, r10);
        return this.A08.E0m(view, r8, hom, r10, hGy);
    }

    public final void EzH(C53277GlP glP, 1Xj r3, C54512HGy hGy, String str) {
        0qQ.A0B(r3, 1);
        this.A08.EzH(glP, r3, hGy, str);
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
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

    public final int AEx(int i, int i2) {
        return this.A08.AEx(i, i2);
    }

    public final int AFA(int i) {
        return this.A08.AFA(i);
    }

    public final void AID() {
        boolean z;
        C238133Ar r3 = this.A09;
        if (r3 != null) {
            C227762js r2 = this.A04;
            if (r2 != null) {
                z = false;
                if (r2.A01 < 2.0f) {
                    z = true;
                }
            } else {
                z = false;
            }
            this.A00 = z;
            AnonymousClass7TG.A1G(r2, r3);
        }
    }

    public final int APq(View view, C238123Aq r3) {
        return this.A08.APq(view, r3);
    }

    public final void ATU() {
        this.A08.ATU();
    }

    public final void ATd() {
        this.A08.ATd();
    }

    public final float AiC(int i) {
        return this.A08.AiC(i);
    }

    public final Integer B2a(C54512HGy hGy) {
        return this.A08.B2a(hGy);
    }

    public final Integer B2d() {
        return this.A08.B2d();
    }

    public final View B7z() {
        return this.A01;
    }

    public final boolean CPi() {
        return this.A08.CPi();
    }

    public final boolean CPj() {
        return this.A08.CPj();
    }

    public final void Cmp() {
        C227762js r2;
        C238133Ar r3 = this.A09;
        if (r3 != null && this.A00 && (r2 = this.A04) != null) {
            r2.A0D = true;
            r2.onScrollStateChanged(r3, 0);
        }
    }

    public final void EXc(int i, ViewGroup viewGroup) {
        this.A08.EXc(i, viewGroup);
    }

    public final void Evp(C238123Aq r2, int i, int i2) {
        this.A08.Evp(r2, i, i2);
    }

    public final boolean Evt(View view, int i) {
        return this.A08.Evt(view, i);
    }

    public final C238133Ar getScrollingViewProxy() {
        return this.A09;
    }

    public final void onDestroy() {
        if (!this.A0B) {
            AnonymousClass4DJ r1 = this.A02;
            if (r1 instanceof AnonymousClass4DJ) {
                r1.unregisterLifecycleListener(this);
            }
        }
    }

    public final void onDestroyView() {
        if (this.A0B) {
            AnonymousClass4DJ r1 = this.A02;
            if (r1 instanceof AnonymousClass4DJ) {
                r1.unregisterLifecycleListener(this);
            }
        }
    }

    public final void onPause() {
        AnonymousClass339 r1 = this.A08;
        if (r1.CPj() && !r1.CPi()) {
            ATU();
        }
    }

    public final void onResume() {
        C238133Ar r1 = this.A09;
        if (r1 != null) {
            AnonymousClass7TG.A1G(this.A04, r1);
        }
    }

    public final void CwU(1Xj r2, AnonymousClass3W1 r3) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A08.CwU(r2, r3);
    }
}
