package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public final class WXK implements C66525MVd {
    public UserSession A00;
    public AtomicBoolean A01 = JTQ.A0k();
    public final Context A02;
    public final C343747qj A03;
    public final X98 A04;
    public final ReentrantLock A05;

    public final void A7D() {
        ReentrantLock reentrantLock = this.A05;
        if (!reentrantLock.isHeldByCurrentThread()) {
            reentrantLock.lock();
            this.A03.A02();
        }
    }

    public final EGLSurface ANO(Object obj) {
        return this.A03.A00(obj);
    }

    public final void AOs() {
        if (this.A01.compareAndSet(true, false)) {
            C14264Tsm tsm = (C14264Tsm) this.A04;
            Set<X4B> set = tsm.A06;
            for (X4B A002 : set) {
                tsm.A00.A00(A002);
            }
            set.clear();
            Set<C367418qi> set2 = tsm.A07;
            for (C367418qi cleanup : set2) {
                cleanup.cleanup();
            }
            set2.clear();
            Map map = tsm.A03;
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                ((C367418qi) A16.next()).cleanup();
            }
            map.clear();
            Set<X4B> set3 = tsm.A04;
            for (X4B AHH : set3) {
                AHH.AHH(tsm);
            }
            set3.clear();
            Set set4 = tsm.A05;
            Iterator it = set4.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                List A182 = DbV.A18(A18, "x");
                C14263Tsl tsl = tsm.A00;
                int parseInt = Integer.parseInt(AnonymousClass7TE.A19(A182, 0));
                int parseInt2 = Integer.parseInt(AnonymousClass7TE.A19(A182, 1));
                Object obj = tsm.A02.get(A18);
                if (obj != null) {
                    int A0M = AnonymousClass7TE.A0M(obj);
                    int i = A0M;
                    StringBuilder sb = tsl.A01;
                    sb.setLength(0);
                    sb.append(parseInt);
                    String A0t = Pxg.A0t("x", sb, parseInt2);
                    0qQ.A07(A0t);
                    Object obj2 = tsl.A03.get(A0t);
                    if (obj2 != null) {
                        List list = (List) obj2;
                        while (list.size() > 0) {
                            A0M--;
                            if (i <= 0) {
                                break;
                            }
                            ((C367418qi) list.remove(0)).cleanup();
                            i = A0M;
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            tsm.A02.clear();
            set4.clear();
            ECZ();
            this.A03.A01();
        }
    }

    public final X98 Bnh() {
        return this.A04;
    }

    public final void ECZ() {
        ReentrantLock reentrantLock = this.A05;
        if (reentrantLock.isHeldByCurrentThread()) {
            this.A03.A03();
            reentrantLock.unlock();
        }
    }

    public WXK(Context context, UserSession userSession) {
        this.A02 = context;
        this.A00 = userSession;
        this.A04 = new C14264Tsm(context);
        this.A05 = new ReentrantLock(true);
        this.A03 = new C343747qj();
    }

    public final void ErI(LNz lNz) {
        SurfaceTexture A002 = lNz.A00();
        C343747qj r1 = this.A03;
        r1.A04();
        r1.A02 = r1.A00(A002);
        GLES20.glDisable(2929);
        this.A01.set(true);
        A7D();
    }
}
