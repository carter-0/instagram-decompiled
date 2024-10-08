package X;

import android.content.Context;
import android.os.Handler;
import java.util.List;

/* renamed from: X.7uD  reason: invalid class name and case insensitive filesystem */
public final class C345867uD extends C344317rf implements C345877uE {
    public int A00;
    public int A01;
    public Handler A02;
    public final Context A03;
    public final C3496981j A04 = new C3496981j();
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final boolean A07 = true;

    public C345867uD(C343837qt r4) {
        super(r4);
        Context context = r4.getContext();
        0qQ.A07(context);
        this.A03 = context;
        0eO r2 = 0eO.A02;
        this.A05 = AnonymousClass0eN.A00(r2, new TTN(this, 3));
        this.A06 = AnonymousClass0eN.A00(r2, new TTN(this, 4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r0 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C345867uD r3) {
        /*
            r2 = 0
            X.7qg r1 = X.C345547th.A00     // Catch:{ RuntimeException -> 0x004a }
            X.7qe r0 = r3.A0A(r1)     // Catch:{ RuntimeException -> 0x004a }
            X.0qQ.A07(r0)     // Catch:{ RuntimeException -> 0x004a }
            X.7th r0 = (X.C345547th) r0     // Catch:{ RuntimeException -> 0x004a }
            boolean r0 = r0.CKQ()     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x0025
            X.7qe r0 = r3.A0A(r1)     // Catch:{ RuntimeException -> 0x004a }
            X.0qQ.A07(r0)     // Catch:{ RuntimeException -> 0x004a }
            X.7th r0 = (X.C345547th) r0     // Catch:{ RuntimeException -> 0x004a }
            android.view.View r0 = r0.Bf9()     // Catch:{ RuntimeException -> 0x004a }
            android.view.Display r0 = r0.getDisplay()     // Catch:{ RuntimeException -> 0x004a }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            android.content.Context r1 = r3.A03     // Catch:{ RuntimeException -> 0x004a }
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ RuntimeException -> 0x004a }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x004a
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x004a
        L_0x0037:
            int r1 = r0.getRotation()     // Catch:{ RuntimeException -> 0x004a }
            r0 = 1
            if (r1 == r0) goto L_0x003f
            goto L_0x0042
        L_0x003f:
            r2 = 90
            return r2
        L_0x0042:
            r0 = 2
            if (r1 == r0) goto L_0x004b
            r0 = 3
            if (r1 != r0) goto L_0x004a
            r2 = 270(0x10e, float:3.78E-43)
        L_0x004a:
            return r2
        L_0x004b:
            r2 = 180(0xb4, float:2.52E-43)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C345867uD.A00(X.7uD):int");
    }

    public static final void A01(C345867uD r6) {
        List list = r6.A04.A00;
        0qQ.A07(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C41790B0t) list.get(i)).DVZ(r6.A01, r6.A00);
        }
    }

    public static final void A03(C345867uD r3, C62320sa r4) {
        Handler handler = r3.A02;
        if (handler == null) {
            C343937r3 r2 = C343927r2.A00;
            C343837qt r1 = r3.A00;
            if (r1.CQO(r2)) {
                r3.A02 = ((C343927r2) r1.Apf(r2)).BAM("Lite-Controller-Thread");
            }
            handler = r3.A02;
            if (handler == null) {
                r4.invoke();
                return;
            }
        }
        handler.post(new C40726AiB(r4));
    }

    public final void A09() {
        C343697qe A0A = A0A(C345547th.A00);
        0qQ.A07(A0A);
        ((C345547th) A0A).A9s((C344337rh) this.A05.getValue());
    }

    public final C343717qg BJt() {
        C343717qg r0 = C345877uE.A00;
        0qQ.A08(r0);
        return r0;
    }
}
