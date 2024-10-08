package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.34T  reason: invalid class name */
public final class AnonymousClass34T implements C252243on, C228132kq {
    public static final Handler A09 = new Handler(Looper.getMainLooper());
    public C2365334c A00;
    public final double A01 = 0.03d;
    public final UserSession A02;
    public final HashSet A03 = new HashSet();
    public final int A04 = 3;
    public final AnonymousClass0iw A05;
    public final AnonymousClass34W A06 = new AnonymousClass34V(this);
    public final Runnable A07 = new AnonymousClass34U(this);
    public final Set A08 = new LinkedHashSet();

    public static final synchronized ArrayList A00(AnonymousClass34T r8, List list) {
        ArrayList arrayList;
        synchronized (r8) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                Set set = r8.A08;
                if (!set.contains(reel.getId())) {
                    if (!182.A06(0Tu.A05, r8.A02, 36325867023119676L)) {
                        String id = reel.getId();
                        0qQ.A07(id);
                        set.add(id);
                    }
                    boolean z = false;
                    if (reel.A0P == ReelType.A0n) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(reel);
                    }
                }
            }
        }
        return arrayList;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DJL(boolean z) {
    }

    public final void DWD(long j, int i) {
    }

    public final void DWE(long j) {
    }

    public final void DcX(boolean z, boolean z2) {
    }

    public final /* synthetic */ void Dcg(Integer num, int i, long j, boolean z) {
    }

    public final synchronized void Dch(1OE r3, String str, int i, long j, boolean z, boolean z2) {
        if (!z && (i == -1 || i == 1)) {
            A09.removeCallbacks(this.A07);
            this.A08.clear();
            A01(AnonymousClass3BU.FOREGROUND_PREFETCH, this, A00(this, 1OP.A05(this.A02).A0U(false)));
        }
    }

    public final /* synthetic */ void Dcj() {
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

    public static final void A01(AnonymousClass3BU r16, AnonymousClass34T r17, Collection collection) {
        int i;
        int i2;
        Double d;
        ArrayList arrayList = new ArrayList();
        AnonymousClass3BU r14 = r16;
        AnonymousClass34T r5 = r17;
        if (r14 == AnonymousClass3BU.FOREGROUND_PREFETCH) {
            UserSession userSession = r5.A02;
            0Tu r2 = 0Tu.A05;
            i = (int) 182.A01(r2, userSession, 36607341999625781L);
            i2 = (int) 182.A01(r2, userSession, 36607341999953463L);
        } else {
            i = 0;
            i2 = r5.A04;
        }
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                if (i <= 0 || arrayList.size() >= i) {
                    UserSession userSession2 = r5.A02;
                    0Tu r8 = 0Tu.A05;
                    if (!182.A06(r8, userSession2, 36312217617826811L)) {
                        AnonymousClass3HV r0 = reel.A0M;
                        if ((r0 == null || (d = r0.A0T) == null || d.doubleValue() <= r5.A01) && !182.A06(r8, 1NM.A00(userSession2).A00, 36317234138125247L)) {
                        }
                    } else if (!reel.A1c) {
                        continue;
                    }
                }
                String id = reel.getId();
                UserSession userSession3 = r5.A02;
                arrayList.add(new AnonymousClass3PJ(r14, id, 1, reel.A03(userSession3), -1));
                0Tu r82 = 0Tu.A05;
                if (182.A06(r82, userSession3, 36325867023119676L)) {
                    Set set = r5.A08;
                    String id2 = reel.getId();
                    0qQ.A07(id2);
                    set.add(id2);
                }
                if (arrayList.size() == i2 && !182.A06(r82, userSession3, 36312217617826811L)) {
                    break;
                }
            }
        }
        AnonymousClass3BV.A00(r5.A02).A0C(r5.A05.getModuleName(), (String) null, arrayList);
    }

    public final void onPause() {
        C2365334c r0;
        UserSession userSession = this.A02;
        C228102kn A002 = C228092km.A00(userSession);
        A002.A0G(this);
        A002.A08 = null;
        if ((!182.A06(0Tu.A05, userSession, 36325867022136624L)) && (r0 = this.A00) != null) {
            AnonymousClass34W r1 = this.A06;
            0qQ.A0B(r1, 0);
            RecyclerView recyclerView = r0.A03;
            if (recyclerView != null) {
                recyclerView.A16(r1);
            }
        }
    }

    public final void onResume() {
        C2365334c r0;
        UserSession userSession = this.A02;
        C228102kn A002 = C228092km.A00(userSession);
        A002.A0F(this);
        A002.A08 = this;
        if ((!182.A06(0Tu.A05, userSession, 36325867022136624L)) && (r0 = this.A00) != null) {
            AnonymousClass34W r1 = this.A06;
            0qQ.A0B(r1, 0);
            RecyclerView recyclerView = r0.A03;
            if (recyclerView != null) {
                recyclerView.A15(r1);
            }
        }
    }

    public AnonymousClass34T(AnonymousClass0iw r3, UserSession userSession) {
        this.A02 = userSession;
        this.A05 = r3;
        C228102kn A002 = C228092km.A00(userSession);
        A002.A0F(this);
        A002.A08 = this;
    }
}
