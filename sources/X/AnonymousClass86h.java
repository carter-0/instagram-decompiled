package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.86h  reason: invalid class name */
public final class AnonymousClass86h implements AnonymousClass86i {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ AnonymousClass82W A01;
    public final /* synthetic */ C357638Yz A02;
    public final /* synthetic */ AnonymousClass80D A03;
    public final /* synthetic */ AnonymousClass81T A04;
    public final /* synthetic */ C3504884v A05;
    public final /* synthetic */ AnonymousClass0eK A06;
    public final /* synthetic */ AnonymousClass0eK A07;
    public final /* synthetic */ C62320sa A08;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.07Z, X.4DH] */
    public final void A00(AnonymousClass2gO r4, AnonymousClass2gO r5) {
        0qQ.A0B(r5, 1);
        C3504884v r2 = this.A05;
        if (r2 != null) {
            if (r4 != null) {
                C226292g8.A00(19B.A00, r2.A0c).A06(this.A00, r4);
            }
            r2.A01().A06(this.A00, r5);
        }
    }

    public final void DBf(CameraAREffect cameraAREffect) {
        AnonymousClass8DD r0 = (AnonymousClass8DD) this.A07.get();
        if (r0 != null) {
            AnonymousClass8DD.A06(r0, false);
            AnonymousClass8DD.A04(r0);
            C3504884v r3 = this.A05;
            if (r3 != null) {
                String moduleName = this.A03.A0O.getModuleName();
                0qQ.A0B(moduleName, 1);
                C318136oS A002 = C318116oQ.A00(r3);
                1Eo.A05(19B.A00, new C66174MGl((Object) r3, (Object) cameraAREffect, moduleName, (AnonymousClass4D7) null, 22), A002);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public AnonymousClass86h(AnonymousClass4DH r1, AnonymousClass82W r2, C357638Yz r3, AnonymousClass80D r4, AnonymousClass81T r5, C3504884v r6, AnonymousClass0eK r7, AnonymousClass0eK r8, C62320sa r9) {
        this.A05 = r6;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A07 = r7;
        this.A08 = r9;
        this.A04 = r5;
        this.A01 = r2;
        this.A06 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DBU() {
        /*
            r3 = this;
            X.0eK r0 = r3.A07
            java.lang.Object r2 = r0.get()
            X.8DD r2 = (X.AnonymousClass8DD) r2
            if (r2 == 0) goto L_0x0021
            X.84v r0 = r3.A05
            if (r0 == 0) goto L_0x001d
            X.05G r0 = r0.A0b
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r2.A0H(r0)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86h.DBU():void");
    }

    public final void DBc(CameraAREffect cameraAREffect) {
        AnonymousClass8DD r0 = (AnonymousClass8DD) this.A07.get();
        if (r0 != null) {
            AnonymousClass8DD.A06(r0, true);
            AnonymousClass8DD.A04(r0);
            C3504884v r3 = this.A05;
            if (r3 != null) {
                String moduleName = this.A03.A0O.getModuleName();
                0qQ.A0B(moduleName, 1);
                C318136oS A002 = C318116oQ.A00(r3);
                1Eo.A05(19B.A00, new C66174MGl((Object) r3, (Object) cameraAREffect, moduleName, (AnonymousClass4D7) null, 21), A002);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
