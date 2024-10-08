package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Lgi  reason: case insensitive filesystem */
public final class C64709Lgi implements C252243on, 1wn, AnonymousClass2sT {
    public Set A00 = AnonymousClass7TE.A1F();
    public final AnonymousClass4DH A01;
    public final 1Ng A02;
    public final UserSession A03;
    public final PendingMediaStore A04;
    public final Map A05 = AnonymousClass7TE.A1E();
    public final boolean A06;

    public C64709Lgi(AnonymousClass4DH r2, 1Ng r3, UserSession userSession, boolean z) {
        0qQ.A0B(r2, 2);
        this.A03 = userSession;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = z;
        this.A04 = 28K.A00(userSession);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DaJ(AnonymousClass3Q2 r3) {
        AnonymousClass55U r0;
        0qQ.A0B(r3, 0);
        if (r3.A1f == AnonymousClass3QD.CONFIGURED || ((r0 = r3.A6I) != null && r0.A00 == 403)) {
            A01(r3);
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

    private final void A00() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            JTO.A0m(it).A0Z(this);
        }
        Map map = this.A05;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            1xC.A01.A00(new AnonymousClass3GU((LQT) AnonymousClass7TE.A1J(A0u).getValue()));
        }
        this.A00.clear();
        map.clear();
    }

    private final void A01(AnonymousClass3Q2 r5) {
        Map map = this.A05;
        if (map.containsKey(r5.A35)) {
            LQT lqt = (LQT) map.get(r5.A35);
            if (lqt != null) {
                1xC.A01.A00(new AnonymousClass3GU(lqt));
                map.remove(r5.A35);
            }
            r5.A0Z(this);
        }
    }

    private final void A02(AnonymousClass3Q2 r5) {
        Map map = this.A05;
        if (!map.containsKey(r5.A35)) {
            Context context = this.A01.getContext();
            if (context != null) {
                C65366Ls7 ls7 = new C65366Ls7(context, r5, this.A06);
                r5.A0Y(ls7);
                r5.A0Y(this);
                LQT lqt = new LQT((C66536MVq) ls7);
                1xC.A01.A00(new AnonymousClass3GT(lqt));
                map.put(r5.A35, lqt);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void onResume() {
        Collection values = this.A04.A06.values();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : values) {
            AnonymousClass3Q2 r1 = (AnonymousClass3Q2) next;
            if (C261624Ah.A00(r1, AnonymousClass05K.A08) && r1.A0n()) {
                A1C.add(next);
            }
        }
        Set A0j = 00k.A0j(00k.A0a(MAY.A00(A1C, 22)));
        this.A00 = A0j;
        Iterator it = A0j.iterator();
        while (it.hasNext()) {
            A02(JTO.A0m(it));
        }
    }

    public final void onDestroy() {
        A00();
        this.A01.unregisterLifecycleListener(this);
        this.A02.A02(this, C64670Lfw.class);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(-401084223);
        C64670Lfw lfw = (C64670Lfw) obj;
        int A0D = AnonymousClass7TG.A0D(lfw, 1680222125);
        AnonymousClass3Q2 r1 = lfw.A00;
        if (lfw.A01) {
            A01(r1);
            i = -1167709963;
        } else {
            A02(r1);
            if (!this.A00.contains(r1)) {
                this.A00.add(r1);
            }
            i = -282968467;
        }
        AnonymousClass0fD.A0A(i, A0D);
        AnonymousClass0fD.A0A(2059966476, A032);
    }

    public final void onPause() {
        A00();
    }
}
