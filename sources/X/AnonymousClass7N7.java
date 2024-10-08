package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7N7  reason: invalid class name */
public final class AnonymousClass7N7 implements C252243on, AnonymousClass2sT {
    public List A00 = new ArrayList();
    public final Context A01;
    public final Fragment A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass7QE A05;
    public final AnonymousClass4DU A06;
    public final Integer A07;
    public final FragmentActivity A08;
    public final PendingMediaStore A09;
    public final C231002qi A0A;
    public final Set A0B = new HashSet();

    public AnonymousClass7N7(Context context, Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, AnonymousClass7QE r7, AnonymousClass4DU r8, C231002qi r9, Integer num) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A04 = userSession;
        this.A07 = num;
        this.A08 = fragmentActivity;
        this.A02 = fragment;
        this.A06 = r8;
        this.A03 = r5;
        this.A0A = r9;
        this.A05 = r7;
        this.A09 = 28K.A00(userSession);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DaJ(AnonymousClass3Q2 r4) {
        1Xj r2;
        0qQ.A0B(r4, 0);
        if (this.A05 != null && r4.A1f == AnonymousClass3QD.CONFIGURED && (r2 = r4.A1C) != null) {
            Set set = this.A0B;
            String id = r2.getId();
            if (id == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (set.add(id)) {
                11Z.A02(new C41173ApX(this, r2, r4));
            }
        }
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroyView() {
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

    public final void onDestroy() {
        for (AnonymousClass3Q2 A0Z : this.A00) {
            A0Z.A0Z(this);
        }
    }

    public final void onPause() {
        List A082 = this.A09.A08();
        this.A00 = A082;
        if (!A082.isEmpty()) {
            0eE r0 = AnonymousClass0t1.A01;
            UserSession userSession = this.A04;
            if (r0.A01(userSession).A0N() == AnonymousClass05K.A01) {
                List list = this.A00;
                list.get(list.size() - 1);
                C243473Yx.A08(userSession, this.A06);
                for (AnonymousClass3Q2 A0Z : this.A00) {
                    A0Z.A0Z(this);
                }
            }
        }
    }

    public final void onResume() {
        List A082 = this.A09.A08();
        this.A00 = A082;
        if (!A082.isEmpty()) {
            0eE r4 = AnonymousClass0t1.A01;
            UserSession userSession = this.A04;
            if (r4.A01(userSession).A0N() == AnonymousClass05K.A01) {
                Context context = this.A01;
                List list = this.A00;
                C250563lf.A0N(context, this.A02, userSession, this.A06, (AnonymousClass3Q2) list.get(list.size() - 1));
                for (AnonymousClass3Q2 A0Y : this.A00) {
                    A0Y.A0Y(this);
                }
                C231002qi r3 = this.A0A;
                if (r3 == null || !182.A06(0Tu.A05, userSession, 36314614207613667L)) {
                    FragmentActivity fragmentActivity = this.A08;
                    if (r4.A01(userSession).A2L() && AnonymousClass2o3.A00(userSession).A07(UserMonetizationProductType.INCENTIVE_PLATFORM)) {
                        BonusPromoDialogType bonusPromoDialogType = BonusPromoDialogType.AFTER_REELS_CREATION;
                        if (1Al.A01(userSession).A03(1An.A0X).getLong("bonuses_self_reel_promo_dialog_last_seen", 0) < System.currentTimeMillis() - TimeUnit.DAYS.toMillis(182.A01(0Tu.A06, userSession, 36594985377859577L)) && 182.A06(0Tu.A05, userSession, 36313510401345571L)) {
                            AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(891600198, 3));
                            1Eo.A05(19B.A00, new MGL(context, fragmentActivity, bonusPromoDialogType, userSession, (AnonymousClass4D7) null, 9), A022);
                            return;
                        }
                        return;
                    }
                    return;
                }
                EnumSet of = EnumSet.of(Trigger.A1m);
                0qQ.A07(of);
                r3.AVg(of);
            }
        }
    }
}
