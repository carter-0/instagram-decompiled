package X;

import android.os.Handler;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Ocu  reason: case insensitive filesystem */
public final class C71111Ocu {
    public C74426Pug A00;
    public OLU A01;
    public final Handler A02;
    public final HashMap A03;

    public C71111Ocu() {
        this((Handler) null, (DefaultConstructorMarker) null, 1);
    }

    public final void A03(C74268Prw prw) {
        0qQ.A0B(prw, 0);
        C71004OWb oWb = C71004OWb.A00;
        Class<?> cls = prw.getClass();
        oWb.A00("RtcPresenterActionDispatcher", 002.A0R("Dispatching state action=", cls.getSimpleName()));
        A00(this, cls);
        C74426Pug pug = this.A00;
        if (pug != null) {
            pug.A7I(prw);
        }
    }

    public final void A05(C74272Ps0 ps0) {
        0qQ.A0B(ps0, 0);
        Class<?> cls = ps0.getClass();
        String simpleName = cls.getSimpleName();
        A00(this, cls);
        OLU olu = this.A01;
        if (olu != null) {
            List<C71135OdY> list = (List) 0Yt.A01(DbS.A0z(cls), (Map) olu.A02.getValue());
            for (C71135OdY A0K : list) {
                A0K.A0K(ps0);
            }
            if (list.isEmpty()) {
                0KC.A0C("RtcPresenterActionDispatcher", 002.A0R("No presenters registered for action=", simpleName));
            }
        }
    }

    public final void A06(C74272Ps0 ps0, long j) {
        0qQ.A0B(ps0, 0);
        Class<?> cls = ps0.getClass();
        A00(this, cls);
        C73255PZZ pzz = new C73255PZZ(this, ps0);
        this.A03.put(DbS.A0z(cls), pzz);
        this.A02.postDelayed(pzz, j);
    }

    public final boolean A07(C74271Prz prz) {
        Class<?> cls = prz.getClass();
        A00(this, cls);
        OLU olu = this.A01;
        if (olu == null) {
            return false;
        }
        0sn<Object> A13 = C66580MXl.A13(DbS.A0z(cls), olu.A01);
        if (A13 == null) {
            A13 = 0sn.A00;
        }
        ArrayList<C71135OdY> A1C = AnonymousClass7TE.A1C();
        for (Object obj : A13) {
            Object obj2 = ((AbstractMap) olu.A03.getValue()).get(obj);
            if (obj2 != null) {
                A1C.add(obj2);
            }
        }
        for (C71135OdY A0L : A1C) {
            if (A0L.A0L(prz)) {
                return true;
            }
        }
        if (!A1C.isEmpty()) {
            return false;
        }
        0KC.A0C("RtcPresenterActionDispatcher", 002.A0R("No consumable presenters registered for action=", cls.getSimpleName()));
        return false;
    }

    public static void A00(C71111Ocu ocu, Class cls) {
        0Yh r2 = new 0Yh(cls);
        Runnable runnable = (Runnable) ocu.A03.remove(r2);
        if (runnable != null) {
            AnonymousClass2YU.A00(r2);
            ocu.A02.removeCallbacks(runnable);
        }
    }

    public static void A01(C71111Ocu ocu, boolean z) {
        ocu.A05(new PNJ(z));
    }

    public static void A02(C71111Ocu ocu, boolean z) {
        ocu.A07(new PMY(z));
    }

    public /* synthetic */ C71111Ocu(Handler handler, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A02 = AnonymousClass7TF.A0D();
        this.A03 = AnonymousClass7TE.A1E();
    }

    public final void A04(C74268Prw prw, long j) {
        Class<?> cls = prw.getClass();
        A00(this, cls);
        C73256PZa pZa = new C73256PZa(this, prw);
        this.A03.put(DbS.A0z(cls), pZa);
        this.A02.postDelayed(pZa, j);
    }
}
