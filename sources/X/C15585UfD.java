package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UfD  reason: case insensitive filesystem */
public final class C15585UfD extends 1P0 {
    public final /* synthetic */ UserSession A00;

    public C15585UfD(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(209919986);
        C15585UfD.super.onFinish();
        C14403TvW.A00 = false;
        AnonymousClass0fD.A0A(39715651, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1047971754);
        NH8 nh8 = (NH8) obj;
        int A0D = AnonymousClass7TG.A0D(nh8, 334784764);
        C15585UfD.super.onSuccess(nh8);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<PUI> list = nh8.A01;
        if (list != null) {
            for (PUI pui : list) {
                if (0qQ.A0K(pui.A02, Pxd.A00(102))) {
                    for (C66942Mfb mfb : pui.A03) {
                        int i = mfb.A01;
                        if (i == 1) {
                            arrayList2.add(mfb);
                        } else if (i == 2) {
                            arrayList.add(mfb);
                        } else if (i == 6) {
                            arrayList3.add(mfb);
                        }
                    }
                }
            }
            UserSession userSession = this.A00;
            C18646Vvr A002 = VGC.A00(userSession);
            synchronized (A002) {
                A002.A02.A06(arrayList);
                A002.A00.A06(arrayList2);
                A002.A01.A06(arrayList3);
            }
            1Av A003 = 1Au.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            A003.A6T.Epx(A003, Long.valueOf(currentTimeMillis), 1Av.A8a[7]);
            SystemClock.currentThreadTimeMillis();
            AnonymousClass0fD.A0A(-1286968856, A0D);
            AnonymousClass0fD.A0A(1904033196, A03);
            return;
        }
        0qQ.A0F("sections");
        throw AnonymousClass00P.createAndThrow();
    }
}
