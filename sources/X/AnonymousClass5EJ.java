package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.5EJ  reason: invalid class name */
public abstract class AnonymousClass5EJ extends C265154St {
    public Handler A00;
    public C250823m7 A01;
    public final HashMap A02 = new HashMap();

    public final void A0A() {
        for (AnonymousClass5EN r0 : this.A02.values()) {
            r0.A02.APD(r0.A01);
        }
    }

    public final void A0B() {
        for (AnonymousClass5EN r0 : this.A02.values()) {
            r0.A02.ARI(r0.A01);
        }
    }

    public void A0D() {
        HashMap hashMap = this.A02;
        for (AnonymousClass5EN r2 : hashMap.values()) {
            C265164Su r1 = r2.A02;
            r1.ECl(r2.A01);
            AnonymousClass5EM r0 = r2.A00;
            r1.EDd(r0);
            r1.EDW(r0);
        }
        hashMap.clear();
    }

    public void A0E(C250823m7 r4) {
        this.A01 = r4;
        Looper myLooper = Looper.myLooper();
        C256703wD.A01(myLooper);
        this.A00 = new Handler(myLooper, (Handler.Callback) null);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.5EO, java.lang.Object] */
    public final void A0F(C265164Su r6, Object obj) {
        HashMap hashMap = this.A02;
        C256703wD.A03(!hashMap.containsKey(obj));
        AnonymousClass5EL r3 = new AnonymousClass5EL(this, obj);
        AnonymousClass5EM r4 = new AnonymousClass5EM(this, obj);
        hashMap.put(obj, new AnonymousClass5EN(r4, r3, r6));
        Handler handler = this.A00;
        handler.getClass();
        r6.A8P(handler, r4);
        Handler handler2 = this.A00;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = ((C265154St) r6).A03.A02;
        ? obj2 = new Object();
        obj2.A00 = handler2;
        obj2.A01 = r4;
        copyOnWriteArrayList.add(obj2);
        C250823m7 r1 = this.A01;
        C264894Rs r0 = this.A00;
        C256703wD.A01(r0);
        r6.E4B(r0, r3, r1);
        if (!(!this.A05.isEmpty())) {
            r6.APD(r3);
        }
    }

    public void Cnl() {
        for (AnonymousClass5EN r0 : this.A02.values()) {
            r0.A02.Cnl();
        }
    }
}
