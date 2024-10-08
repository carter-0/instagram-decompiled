package X;

import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGAuthedTigonService;
import com.instagram.service.tigon.IGTigonService;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Vv2  reason: case insensitive filesystem */
public final class C18609Vv2 {
    public static C18609Vv2 A05;
    public static final C17748VdH A06 = new Object();
    public String A00;
    public WeakReference A01;
    public final VQO A02;
    public final List A03 = new ArrayList();
    public final AtomicInteger A04 = new AtomicInteger(0);

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.Vbt] */
    public final synchronized C17973VjA A00(C15046UKz uKz) {
        C17973VjA vjA;
        Integer num;
        String A0T = 002.A0T(uKz.A0A, uKz.A0B, '|');
        WeakReference weakReference = this.A01;
        if (weakReference == null || ((C17973VjA) weakReference.get()) == null) {
            this.A00 = null;
            this.A04.set(0);
        }
        if (0qQ.A0K(A0T, this.A00)) {
            WeakReference weakReference2 = this.A01;
            if (weakReference2 == null || (vjA = (C17973VjA) weakReference2.get()) == null) {
                throw AnonymousClass7TE.A0y();
            }
            this.A04.incrementAndGet();
        } else {
            vjA = new C17973VjA(uKz, this.A02);
            if (vjA.A00 == null) {
                VQO vqo = vjA.A02;
                C15046UKz uKz2 = vjA.A01;
                UserSession userSession = vqo.A00;
                IGAuthedTigonService instance = IGAuthedTigonService.getInstance(userSession);
                0qQ.A07(instance);
                IGTigonService tigonService = IGTigonService.getTigonService(userSession);
                0qQ.A07(tigonService);
                File CGg = AnonymousClass1F2.A00().CGg((1LJ) null, 1881128843);
                CGg.mkdirs();
                String A10 = DbT.A10(1Ma.A06());
                String canonicalPath = CGg.getCanonicalPath();
                0qQ.A07(canonicalPath);
                VZ4 vz4 = new VZ4(canonicalPath);
                vz4.A00 = instance;
                vz4.A01 = tigonService;
                vz4.A02 = A10;
                String str = uKz2.A0A;
                0qQ.A0B(str, 0);
                vz4.A03 = str;
                String str2 = uKz2.A0B;
                0qQ.A0B(str2, 0);
                if (uKz2.A0D) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A01;
                }
                String str3 = uKz2.A08;
                Integer num2 = uKz2.A07;
                ? obj = new Object();
                obj.A06 = vz4.A02;
                obj.A07 = vz4.A03;
                obj.A08 = str2;
                obj.A04 = vz4.A04;
                obj.A00 = vz4.A00;
                obj.A01 = vz4.A01;
                obj.A03 = num;
                obj.A05 = str3;
                obj.A02 = num2;
                vjA.A00 = new VQW(obj);
            }
            this.A04.set(1);
            WeakReference weakReference3 = this.A01;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            this.A01 = new WeakReference(vjA);
            this.A00 = A0T;
            for (X2O Cv0 : this.A03) {
                Cv0.Cv0(vjA);
            }
        }
        return vjA;
    }

    public final synchronized void A01() {
        if (this.A04.decrementAndGet() == 0) {
            WeakReference weakReference = this.A01;
            if (weakReference != null) {
                C17973VjA vjA = (C17973VjA) weakReference.get();
                if (vjA != null) {
                    VQW vqw = vjA.A00;
                    if (vqw == null) {
                        0qQ.A0F("aleBridge");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    vqw.A00.removeNotificationDelegate();
                }
                weakReference.clear();
            }
            this.A00 = null;
        }
    }

    public C18609Vv2(VQO vqo) {
        this.A02 = vqo;
    }
}
