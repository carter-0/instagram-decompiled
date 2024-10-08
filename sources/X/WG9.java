package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class WG9 implements C365438n7, C365248mm {
    public final Handler A00;
    public final HandlerThread A01;
    public final C17553Va6 A02;
    public final C18812W3v A03;
    public final C344037rD A04;
    public final Object A05 = new Object();
    public final WeakReference A06;
    public final boolean A07;

    public WG9(HandlerThread handlerThread, VLC vlc, C344227rW r20, C17553Va6 va6, C18658VwD vwD, C18633VvR vvR, C344557s3 r24, C344037rD r25, C368938tZ r26, List list, int i) {
        this.A06 = new WeakReference(vlc);
        C344037rD r13 = r25;
        this.A04 = r13;
        C17553Va6 va62 = va6;
        this.A02 = va62;
        C344227rW r3 = r20;
        this.A03 = new C18812W3v(r3, va62, vwD, this, this, vvR, this, new WGA(r3, this), this, r24, r13, r26, list, i);
        HandlerThread handlerThread2 = handlerThread;
        this.A01 = handlerThread2;
        this.A07 = true;
        handlerThread2.start();
        this.A00 = new Handler(handlerThread2.getLooper(), new W68(this));
    }

    public static void A00(WG9 wg9, Object obj, int i) {
        Message obtainMessage;
        Handler handler = wg9.A00;
        if (obj != null) {
            obtainMessage = handler.obtainMessage(i, 0, 0, obj);
        } else {
            obtainMessage = handler.obtainMessage(i, 0, 0);
        }
        handler.sendMessage(obtainMessage);
    }

    public final void A04(AnonymousClass8KU r5) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(r5);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C18812W3v w3v = this.A03;
            if (next != null) {
                synchronized (next) {
                    w3v.A0i.add(next);
                }
            }
        }
        A00(this, arrayList, 9);
    }

    public final void Crt(C365408n3 r3) {
        this.A00.removeMessages(4);
        A00(this, r3, 4);
    }

    public final void ErU(C344557s3 r4, int i) {
        0JA.A08(C51969G9p.A1a(Thread.currentThread(), this.A01), "You cannot set up a shared context on the RenderThread");
        r4.ErC(this.A03.A0H(), 1);
    }

    public static void A01(WG9 wg9, Object[] objArr, int i) {
        Handler handler = wg9.A00;
        handler.sendMessage(handler.obtainMessage(i, 0, 0, objArr));
    }

    public final VUX A02() {
        VLH vlh = this.A03.A0V;
        synchronized (vlh) {
            List list = vlh.A00;
            if (list.isEmpty()) {
                return new VUX();
            }
            VUX vux = (VUX) list.remove(0);
            return vux;
        }
    }

    public final void A03(VUX vux) {
        C344907sc r0 = vux.A00;
        if (r0 == null) {
            return;
        }
        if (!r0.AOe() || Thread.currentThread() == this.A01) {
            this.A03.A0J(vux);
        } else {
            A00(this, vux, 12);
        }
    }

    public final C344557s3 Azk() {
        return this.A03.A0H();
    }

    public final void EXB(C365378n0 r3, C365408n3 r4) {
        A01(this, new Object[]{r3, r4}, 23);
    }
}
