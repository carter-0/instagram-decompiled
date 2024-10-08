package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class SOT {
    public static final Map A0D = AnonymousClass7TE.A1E();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final IBinder.DeathRecipient A05 = new SW0(this);
    public final C11229SGh A06;
    public final Object A07 = Pxe.A0p();
    public final WeakReference A08;
    public final List A09 = AnonymousClass7TE.A1C();
    public final Set A0A = AnonymousClass7TE.A1F();
    public final AtomicInteger A0B = Pxf.A10();
    public final SC0 A0C;

    public static final void A00(SOT sot) {
        synchronized (sot.A07) {
            Set<C365498nD> set = sot.A0A;
            for (C365498nD A022 : set) {
                A022.A02(Pxj.A0I("IntegrityService"));
            }
            set.clear();
        }
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0D;
        synchronized (map) {
            if (!map.containsKey("IntegrityService")) {
                map.put("IntegrityService", Pxg.A0N(new HandlerThread("IntegrityService", 10)));
            }
            handler = (Handler) map.get("IntegrityService");
        }
        return handler;
    }

    public SOT(Context context, Intent intent, SC0 sc0, C11229SGh sGh) {
        this.A03 = context;
        this.A06 = sGh;
        this.A04 = intent;
        this.A0C = sc0;
        this.A08 = C51965G9l.A0v((Object) null);
    }
}
