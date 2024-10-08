package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.7mk  reason: invalid class name and case insensitive filesystem */
public final class C341357mk implements C340507lN {
    public final /* synthetic */ C345437tU A00;

    public final /* synthetic */ void D5n(C340547lR r1, String str, String str2) {
    }

    public C341357mk(C345437tU r1) {
        this.A00 = r1;
    }

    public final void D5P(C343367q6 r8, C340547lR r9) {
        C345437tU r1 = this.A00;
        if (r1.A03.get()) {
            List list = r1.A01.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C340297l2 r3 = ((C340317l4) list.get(i)).A00;
                r3.A02 = r8;
                if (r3.A01 != null) {
                    Object A02 = r8.A03.A02(C342717p3.A0q);
                    AnonymousClass8GD r12 = r3.A01;
                    if (A02 == null) {
                        A02 = new C343047pa(0, 0);
                    }
                    r12.A02(A02);
                    r3.A01 = null;
                }
                C3497181l r0 = r3.A03;
                if (r0 != null) {
                    r0.DKf(r8);
                }
            }
        }
    }

    public final void D5f(C343367q6 r13, C340547lR r14) {
        C345437tU r2 = this.A00;
        if (r2.A03.compareAndSet(false, true)) {
            List list = r2.A01.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C340297l2 r5 = ((C340317l4) list.get(i)).A00;
                r5.A02 = r13;
                if (r5.A09) {
                    C344207rU r0 = r5.A0G;
                    C340447lH r6 = C341387mn.A00;
                    C343817qr r02 = (C343817qr) r0.A00;
                    C343817qr.A01(r02);
                    C345447tV r7 = (C345447tV) ((C341377mm) ((C344257rZ) r02.A02.A00(r6)));
                    ((C344037rD) r7.A00.Apf(C344037rD.A00)).ChM((long) r7.hashCode(), "camera_swipe_to_open_finished", "BasicLoggingNotifier", (Map) null);
                    r5.A09 = false;
                }
                if (r5.A08) {
                    r5.A08 = false;
                    ((C345487tZ) r5.A0G.A02(C345487tZ.A00)).DHC();
                }
                if (r5.A01 != null) {
                    Object A02 = r13.A03.A02(C342717p3.A0q);
                    AnonymousClass8GD r03 = r5.A01;
                    if (A02 == null) {
                        A02 = new C343047pa(0, 0);
                    }
                    r03.A02(A02);
                    r5.A01 = null;
                }
                C3497181l r04 = r5.A03;
                if (r04 != null) {
                    r04.DKf(r13);
                }
                C340297l2.A04(r5);
                0tS A002 = 0tS.A00();
                C343627qW.A00 = ((Boolean) A002.A0F.CDM(A002, 0tS.A4G[111])).booleanValue() ? 1 : 0;
            }
        }
    }

    public final void D5l(C340547lR r17, Exception exc) {
        List list = this.A00.A01.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Exception exc2 = exc;
            0KC.A0F("OneCameraController", "mConnectionListener - onConnectionException: ", exc2);
            0kD.A07("OneCameraController", "onConnectionException()", exc2);
            C340297l2 r1 = ((C340317l4) list.get(i)).A00;
            r1.A09 = false;
            AnonymousClass8GD r0 = r1.A01;
            if (r0 != null) {
                r0.A01(exc2);
                r1.A01 = null;
            }
            C3497181l r02 = r1.A03;
            if (r02 != null) {
                r02.DDD(exc2);
            }
            C59728JVm A002 = AnonymousClass9PJ.A00(r1.A0J);
            0qQ.A0B(exc2, 0);
            0JA.A01();
            0KC.A0F("ExtendedCreationSessionLogger", "oneCameraConnectionFailed", exc2);
            29E r7 = A002.A04;
            if (r7.A0E(585177486, A002.A00)) {
                r7.A0B(A002.A00, "camera_destination", String.valueOf(27p.A01(A002.A05).A0J()), false);
                long j = A002.A00;
                String message = exc2.getMessage();
                if (message == null) {
                    message = "one_camera_connection_failed";
                }
                A002.A00 = r7.A07(message, "", 585177486, j);
            }
        }
    }

    public final void D99(C340547lR r12) {
        C345437tU r2 = this.A00;
        if (r2.A03.compareAndSet(true, false)) {
            List list = r2.A01.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C340297l2 r0 = ((C340317l4) list.get(i)).A00;
                r0.A09 = false;
                AnonymousClass8A2 A01 = AnonymousClass8A1.A01(r0.A0J);
                long j = A01.A06;
                if (j != 838604519) {
                    A01.A06 = A01.A0K.A02(838604519, j);
                }
            }
        }
    }

    public final void D9A(C340547lR r8, Exception exc) {
        C345437tU r2 = this.A00;
        if (r2.A03.compareAndSet(true, false)) {
            List list = r2.A01.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                0kD.A07("OneCameraController", "#onDisconnectionException()", exc);
                ((C340317l4) list.get(i)).A00.A09 = false;
            }
        }
    }
}
