package X;

import android.view.View;

/* renamed from: X.MGj  reason: case insensitive filesystem */
public final class C66172MGj extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66172MGj(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A02 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    public static void A00(C66172MGj mGj, int i, int i2) {
        ((View) mGj.A04).setVisibility(i);
        ((View) mGj.A03).setVisibility(i2);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.MGj, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a8, code lost:
        r1 = new X.C66172MGj(r2, r3, r4, r5, r6, 42);
        r1.A01 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x019d, code lost:
        r1 = new X.C66172MGj(r2, r3, r4, r5, r6);
        r1.A00 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01a5, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        return new X.C66172MGj(r1, r2, r3, r4, r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            int r0 = r8.A02
            r5 = r10
            switch(r0) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0088;
                case 2: goto L_0x0016;
                case 3: goto L_0x0020;
                case 4: goto L_0x002a;
                case 5: goto L_0x0034;
                case 6: goto L_0x008f;
                case 7: goto L_0x0098;
                case 8: goto L_0x00a0;
                case 9: goto L_0x00b3;
                case 10: goto L_0x00bd;
                case 11: goto L_0x003e;
                case 12: goto L_0x0049;
                case 13: goto L_0x00c7;
                case 14: goto L_0x00d1;
                case 15: goto L_0x00db;
                case 16: goto L_0x00e5;
                case 17: goto L_0x00ef;
                case 18: goto L_0x00f9;
                case 19: goto L_0x0054;
                case 20: goto L_0x0103;
                case 21: goto L_0x005f;
                case 22: goto L_0x006a;
                case 23: goto L_0x0075;
                case 24: goto L_0x010d;
                case 25: goto L_0x0117;
                case 26: goto L_0x0120;
                case 27: goto L_0x0129;
                case 28: goto L_0x0132;
                case 29: goto L_0x013b;
                case 30: goto L_0x0144;
                case 31: goto L_0x014d;
                case 32: goto L_0x0156;
                case 33: goto L_0x015f;
                case 34: goto L_0x0168;
                case 35: goto L_0x0171;
                case 36: goto L_0x017a;
                case 37: goto L_0x0183;
                case 38: goto L_0x018c;
                case 39: goto L_0x0195;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r2 = r8.A01
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A00
            java.lang.Object r1 = r8.A04
            r6 = 40
        L_0x0010:
            X.MGj r0 = new X.MGj
            r0.<init>((java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (X.AnonymousClass4D7) r5, (int) r6)
            return r0
        L_0x0016:
            java.lang.Object r4 = r8.A00
            java.lang.Object r1 = r8.A04
            java.lang.Object r2 = r8.A01
            java.lang.Object r3 = r8.A03
            r6 = 2
            goto L_0x0010
        L_0x0020:
            java.lang.Object r4 = r8.A00
            java.lang.Object r2 = r8.A01
            java.lang.Object r3 = r8.A03
            java.lang.Object r1 = r8.A04
            r6 = 3
            goto L_0x0010
        L_0x002a:
            java.lang.Object r2 = r8.A01
            java.lang.Object r1 = r8.A04
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A00
            r6 = 4
            goto L_0x0010
        L_0x0034:
            java.lang.Object r4 = r8.A00
            java.lang.Object r1 = r8.A04
            java.lang.Object r2 = r8.A01
            java.lang.Object r3 = r8.A03
            r6 = 5
            goto L_0x0010
        L_0x003e:
            java.lang.Object r4 = r8.A00
            java.lang.Object r2 = r8.A01
            java.lang.Object r3 = r8.A03
            java.lang.Object r1 = r8.A04
            r6 = 11
            goto L_0x0010
        L_0x0049:
            java.lang.Object r2 = r8.A01
            java.lang.Object r4 = r8.A00
            java.lang.Object r3 = r8.A03
            java.lang.Object r1 = r8.A04
            r6 = 12
            goto L_0x0010
        L_0x0054:
            java.lang.Object r1 = r8.A04
            java.lang.Object r2 = r8.A01
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A00
            r6 = 19
            goto L_0x0010
        L_0x005f:
            java.lang.Object r1 = r8.A04
            java.lang.Object r2 = r8.A01
            java.lang.Object r4 = r8.A00
            java.lang.Object r3 = r8.A03
            r6 = 21
            goto L_0x0010
        L_0x006a:
            java.lang.Object r2 = r8.A01
            java.lang.Object r1 = r8.A04
            java.lang.Object r4 = r8.A00
            java.lang.Object r3 = r8.A03
            r6 = 22
            goto L_0x0010
        L_0x0075:
            java.lang.Object r2 = r8.A01
            java.lang.Object r1 = r8.A04
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A00
            r6 = 23
            goto L_0x0010
        L_0x0080:
            java.lang.Object r2 = r8.A03
            java.lang.Object r4 = r8.A00
            java.lang.Object r3 = r8.A04
            r6 = 0
            goto L_0x00a8
        L_0x0088:
            r2 = 0
            java.lang.Object r4 = r8.A00
            java.lang.Object r3 = r8.A04
            r6 = 1
            goto L_0x00a8
        L_0x008f:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 6
            goto L_0x019d
        L_0x0098:
            java.lang.Object r2 = r8.A03
            java.lang.Object r3 = r8.A04
            java.lang.Object r4 = r8.A00
            r6 = 7
            goto L_0x00a8
        L_0x00a0:
            java.lang.Object r2 = r8.A03
            java.lang.Object r3 = r8.A04
            java.lang.Object r4 = r8.A00
            r6 = 8
        L_0x00a8:
            r7 = 42
            X.MGj r0 = new X.MGj
            r1 = r0
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (X.AnonymousClass4D7) r5, (int) r6, (int) r7)
            r0.A01 = r9
            return r0
        L_0x00b3:
            java.lang.Object r2 = r8.A04
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A03
            r6 = 9
            goto L_0x019d
        L_0x00bd:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 10
            goto L_0x019d
        L_0x00c7:
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A03
            java.lang.Object r2 = r8.A04
            r6 = 13
            goto L_0x019d
        L_0x00d1:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 14
            goto L_0x019d
        L_0x00db:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 15
            goto L_0x019d
        L_0x00e5:
            java.lang.Object r2 = r8.A04
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A03
            r6 = 16
            goto L_0x019d
        L_0x00ef:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 17
            goto L_0x019d
        L_0x00f9:
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A03
            java.lang.Object r2 = r8.A04
            r6 = 18
            goto L_0x019d
        L_0x0103:
            java.lang.Object r2 = r8.A04
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A03
            r6 = 20
            goto L_0x019d
        L_0x010d:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 24
            goto L_0x019d
        L_0x0117:
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A01
            r6 = 25
            goto L_0x019d
        L_0x0120:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 26
            goto L_0x019d
        L_0x0129:
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A01
            r6 = 27
            goto L_0x019d
        L_0x0132:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 28
            goto L_0x019d
        L_0x013b:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 29
            goto L_0x019d
        L_0x0144:
            java.lang.Object r3 = r8.A03
            java.lang.Object r2 = r8.A04
            java.lang.Object r4 = r8.A01
            r6 = 30
            goto L_0x019d
        L_0x014d:
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A03
            java.lang.Object r2 = r8.A04
            r6 = 31
            goto L_0x019d
        L_0x0156:
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A01
            r6 = 32
            goto L_0x019d
        L_0x015f:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 33
            goto L_0x019d
        L_0x0168:
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A01
            r6 = 34
            goto L_0x019d
        L_0x0171:
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A03
            java.lang.Object r2 = r8.A04
            r6 = 35
            goto L_0x019d
        L_0x017a:
            java.lang.Object r4 = r8.A01
            java.lang.Object r3 = r8.A03
            java.lang.Object r2 = r8.A04
            r6 = 36
            goto L_0x019d
        L_0x0183:
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A01
            r6 = 37
            goto L_0x019d
        L_0x018c:
            java.lang.Object r4 = r8.A01
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            r6 = 38
            goto L_0x019d
        L_0x0195:
            java.lang.Object r2 = r8.A04
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A01
            r6 = 39
        L_0x019d:
            X.MGj r0 = new X.MGj
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A00 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66172MGj.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A02;
        C66172MGj mGj = (C66172MGj) AnonymousClass7TE.A1M(obj2, obj, this);
        C60340gF r0 = C60340gF.A00;
        if (1 - i != 0) {
            return mGj.invokeSuspend(r0);
        }
        mGj.invokeSuspend(r0);
        throw null;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            r44 = this;
            r0 = r44
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x006c;
                case 1: goto L_0x1243;
                case 2: goto L_0x0097;
                case 3: goto L_0x00c9;
                case 4: goto L_0x00e0;
                case 5: goto L_0x124d;
                case 6: goto L_0x0106;
                case 7: goto L_0x0121;
                case 8: goto L_0x0149;
                case 9: goto L_0x017d;
                case 10: goto L_0x1281;
                case 11: goto L_0x039b;
                case 12: goto L_0x03ca;
                case 13: goto L_0x0483;
                case 14: goto L_0x054b;
                case 15: goto L_0x060f;
                case 16: goto L_0x11fc;
                case 17: goto L_0x0689;
                case 18: goto L_0x0709;
                case 19: goto L_0x080d;
                case 20: goto L_0x0855;
                case 21: goto L_0x0917;
                case 22: goto L_0x094d;
                case 23: goto L_0x0999;
                case 24: goto L_0x09cc;
                case 25: goto L_0x119f;
                case 26: goto L_0x0a03;
                case 27: goto L_0x0a3a;
                case 28: goto L_0x0b52;
                case 29: goto L_0x0b8d;
                case 30: goto L_0x0c23;
                case 31: goto L_0x0cea;
                case 32: goto L_0x0d83;
                case 33: goto L_0x0e5e;
                case 34: goto L_0x10c9;
                case 35: goto L_0x129f;
                case 36: goto L_0x12b0;
                case 37: goto L_0x12ca;
                case 38: goto L_0x1140;
                case 39: goto L_0x116a;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.0eS.A00(r45)
            java.lang.Object r5 = r0.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            java.lang.Object r9 = r0.A03
            X.5kq r9 = (X.C293505kq) r9
            java.lang.String r3 = r9.A0T
            r7 = 0
            boolean r10 = X.AnonymousClass7TF.A1U(r7, r5, r3)
            java.lang.String r1 = r5.A05
            java.lang.String r6 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r6, r1)
            r1 = 23
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            android.os.Bundle r3 = X.AnonymousClass7TG.A0P(r1, r3, r2)
            r8 = 1
            r1 = 212(0xd4, float:2.97E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.putBoolean(r1, r10)
            java.lang.Object r2 = r0.A00
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r2
            r1 = 57
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putParcelable(r1, r2)
            X.50r r2 = r9.A0H
            X.50r r1 = X.C2801950r.CLIPS
            if (r2 == r1) goto L_0x004b
            r8 = 0
        L_0x004b:
            r1 = 100
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putBoolean(r1, r8)
            r1 = 2152(0x868, float:3.016E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putBoolean(r1, r7)
            X.C320236s2.A01(r3, r6)
            java.lang.Object r1 = r0.A04
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "clips_share_sheet"
            X.DbU.A0w(r1, r3, r5, r4, r0)
        L_0x0069:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x006c:
            X.0eS.A00(r45)
            java.lang.Object r7 = r0.A01
            X.4Cq r7 = (X.C262224Cq) r7
            r6 = 0
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            java.lang.Object r4 = r0.A03
            X.6FR r4 = (X.AnonymousClass6FR) r4
            java.lang.Object r3 = r0.A00
            X.JQx r3 = (X.C59629JQx) r3
            r2 = 9
            X.MH2 r1 = new X.MH2
            r1.<init>((X.C59629JQx) r3, (X.AnonymousClass6FR) r4, (X.AnonymousClass4D7) r6, (int) r2)
            X.19B r3 = X.19B.A00
            X.1Eo.A03(r5, r3, r1, r7)
            java.lang.Object r2 = r0.A04
            r1 = 10
            X.MH2 r0 = new X.MH2
            r0.<init>((java.lang.Object) r2, (java.lang.Object) r4, (X.AnonymousClass4D7) r6, (int) r1)
            X.1Eo.A03(r5, r3, r0, r7)
            goto L_0x0069
        L_0x0097:
            X.0eS.A00(r45)
            java.lang.Object r5 = r0.A00
            X.4uI r5 = (X.C277014uI) r5
            if (r5 == 0) goto L_0x0069
            java.lang.Object r4 = r0.A04
            X.4tV r4 = (X.C276544tV) r4
            X.6Tl r3 = new X.6Tl
            r3.<init>()
            java.lang.Object r1 = r0.A01
            X.V4Z r1 = (X.V4Z) r1
            int r1 = r1.A00
            float r2 = (float) r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r1
            java.lang.Float r1 = X.C51965G9l.A0q(r2)
            r3.A01(r1)
            java.lang.Object r1 = r0.A03
            X.6Rm r1 = (X.C307786Rm) r1
            r3.A02(r1)
            X.6Tm r0 = r3.A00()
            X.C307886Rw.A03(r1, r4, r0, r5)
            goto L_0x0069
        L_0x00c9:
            X.0eS.A00(r45)
            java.lang.Object r3 = r0.A00
            X.4tV r3 = (X.C276544tV) r3
            java.lang.Object r2 = r0.A01
            X.4uI r2 = (X.C277014uI) r2
            java.lang.Object r1 = r0.A03
            X.6Tm r1 = (X.AnonymousClass6Tm) r1
            java.lang.Object r0 = r0.A04
            X.6Rm r0 = (X.C307786Rm) r0
            X.C307886Rw.A03(r0, r3, r1, r2)
            goto L_0x0069
        L_0x00e0:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A01
            X.Qcf r1 = (X.C7909Qcf) r1
            com.facebook.smartcapture.logging.SmartCaptureLogger r2 = r1.A01
            if (r2 == 0) goto L_0x00f0
            java.lang.String r1 = "docupload_cancelled"
            r2.logEvent(r1)
        L_0x00f0:
            java.lang.Object r3 = r0.A04
            X.4uI r3 = (X.C277014uI) r3
            X.6Tm r2 = X.AnonymousClass6Tm.A01
            java.lang.Object r1 = r0.A03
            X.6Rx r1 = (X.C307896Rx) r1
            X.C299275ur.A00(r1, r2, r3)
            java.lang.Object r0 = r0.A00
            java.io.File r0 = (java.io.File) r0
            X.JTR.A1O(r0)
            goto L_0x0069
        L_0x0106:
            X.0eS.A00(r45)
            java.lang.Object r5 = r0.A00
            X.3pV r5 = (X.C252683pV) r5
            r3 = 0
            java.lang.Object r1 = r0.A01
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r1 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r1
            java.lang.Object r4 = r0.A04
            X.0sK r4 = (X.0sK) r4
            java.lang.Object r2 = r0.A03
            X.AH4 r2 = (X.AH4) r2
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper$renderAllFrames$2$1 r0 = new com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper$renderAllFrames$2$1
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x09c7
        L_0x0121:
            X.0eS.A00(r45)
            java.lang.Object r6 = r0.A01
            X.4Cq r6 = (X.C262224Cq) r6
            r5 = 0
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A04
            r2 = 24
            X.MGZ r1 = new X.MGZ
            r1.<init>((java.lang.Object) r4, (java.lang.Object) r3, (X.AnonymousClass4D7) r5, (int) r2)
            X.19B r4 = X.19B.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.1Eo.A03(r3, r4, r1, r6)
            java.lang.Object r2 = r0.A00
            r1 = 43
            X.MFS r0 = new X.MFS
            r0.<init>(r2, r5, r1)
            X.1Eo.A03(r3, r4, r0, r6)
            goto L_0x0069
        L_0x0149:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A01
            X.4Cq r1 = (X.C262224Cq) r1
            java.lang.Object r7 = r0.A03
            r3 = 0
            X.Ivp r2 = new X.Ivp
            r2.<init>(r7, r3)
            X.05E r6 = X.C3025664b.A02(r2)
            java.lang.Object r5 = r0.A04
            r4 = 0
            r3 = 10
            X.MG9 r2 = new X.MG9
            r2.<init>(r5, r4, r3)
            X.C51968G9o.A1P(r2, r1, r6)
            r3 = 1
            X.Ivp r2 = new X.Ivp
            r2.<init>(r7, r3)
            X.05E r3 = X.C3025664b.A02(r2)
            java.lang.Object r2 = r0.A00
            r0 = 2
            X.MGa r5 = new X.MGa
            r5.<init>(r7, r2, r4, r0)
            goto L_0x0b88
        L_0x017d:
            X.0eS.A00(r45)
            java.lang.Object r2 = r0.A00
            X.7a7 r2 = (X.C333777a7) r2
            java.lang.Object r1 = r0.A04
            X.7b2 r1 = (X.C334297b2) r1
            r1.A00 = r2
            java.lang.Object r4 = r0.A01
            X.H3o r4 = (X.C54219H3o) r4
            X.GgO r1 = r4.A04()
            X.7a5 r1 = r1.A0B
            X.1Xl r5 = r1.A00
            if (r5 == 0) goto L_0x0069
            X.GmL r1 = r4.A03()
            boolean r1 = r1.A0R
            if (r1 != 0) goto L_0x0069
            X.0eM r1 = r4.A01
            java.lang.Object r1 = r1.getValue()
            X.7bg r1 = (X.C334677bg) r1
            android.content.Context r6 = r4.getThemedContext()
            java.lang.Object r0 = r0.A03
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r3, r6, r0)
            X.6zK r2 = r1.A00
            if (r2 != 0) goto L_0x0398
            X.6zK r2 = X.C324456zJ.A00(r6)
            r1.A00 = r2
            r4.registerLifecycleListener(r2)
            r14 = 1
        L_0x01c3:
            X.GmL r4 = r1.A02
            java.lang.Integer r10 = r4.A04
            int r2 = X.AnonymousClass7TG.A0A(r10)
            boolean r2 = X.1sx.A0Q(r5, r2)
            if (r2 == 0) goto L_0x0380
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x01d3:
            int r2 = r2.intValue()
            if (r2 == r3) goto L_0x0347
            X.L3T r9 = new X.L3T
            r9.<init>(r1, r5)
            com.instagram.common.session.UserSession r8 = r1.A03
            X.4DU r2 = r1.A04
            X.L9S r4 = new X.L9S
            r4.<init>(r6, r9, r2, r8)
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r2 = 2131625804(0x7f0e074c, float:1.8878826E38)
            android.view.View r2 = X.DbU.A0A(r6, r0, r2, r3)
            X.LAX r6 = new X.LAX
            r6.<init>(r2)
            r2.setTag(r6)
            java.lang.Object r6 = r2.getTag()
            java.lang.String r8 = "null cannot be cast to non-null type com.instagram.wellbeing.fundraiser.feedconsumption.StandaloneFundraiserCTAViewHolder"
            X.0qQ.A0C(r6, r8)
            X.LAX r6 = (X.LAX) r6
            X.1Xj r5 = r5.BPf()
            java.lang.String r8 = "Required value was null."
            if (r5 == 0) goto L_0x13ea
            if (r6 == 0) goto L_0x13e5
            X.1Xy r5 = r5.A0C
            X.1bS r16 = r5.B8b()
            if (r16 == 0) goto L_0x13e0
            android.view.View r5 = r6.A01
            android.content.Context r9 = r4.A01
            r8 = 2130970332(0x7f0406dc, float:1.7549371E38)
            int r8 = X.2Yu.A0H(r9, r8)
            X.DbT.A16(r9, r5, r8)
            com.instagram.common.ui.base.IgTextView r11 = r6.A06
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r8 = r16.B8e()
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r10 = com.instagram.model.fundraiser.FundraiserCampaignTypeEnum.IG_CHARITY_BUSINESS_PROFILE
            if (r8 != r10) goto L_0x0341
            java.lang.String r8 = r16.getBeneficiaryName()
        L_0x0233:
            r11.setText(r8)
            android.text.TextPaint r8 = r11.getPaint()
            r8.setFakeBoldText(r7)
            com.instagram.common.typedurl.ImageUrl r8 = r16.C6s()
            if (r8 == 0) goto L_0x0320
            android.widget.ImageView r9 = r6.A03
            com.instagram.common.typedurl.ImageUrl r8 = r16.C6s()
            X.JYP.A00(r9, r8)
        L_0x024c:
            java.lang.String r12 = r16.getProgressStr()
            if (r12 != 0) goto L_0x0254
            java.lang.String r12 = ""
        L_0x0254:
            com.instagram.common.ui.base.IgTextView r11 = r6.A05
            int r9 = r12.length()
            r8 = 0
            if (r9 != 0) goto L_0x025f
            r8 = 8
        L_0x025f:
            r11.setVisibility(r8)
            r11.setText(r12)
            com.instagram.common.ui.base.IgTextView r9 = r6.A04
            r9.setVisibility(r3)
            android.content.Context r3 = r6.A00
            android.content.res.Resources r8 = r3.getResources()
            r3 = 2131962313(0x7f1329c9, float:1.9561348E38)
            X.DbU.A1A(r8, r9, r3)
            android.text.TextPaint r3 = r9.getPaint()
            r3.setFakeBoldText(r7)
            java.lang.String r3 = r16.getFundraiserId()
            if (r3 == 0) goto L_0x02f9
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r9 = r16.B8e()
            X.L3T r8 = r4.A02
            X.7bg r11 = r8.A01
            X.0sa r7 = r11.A05
            java.lang.Object r7 = r7.invoke()
            android.content.Context r7 = (android.content.Context) r7
            if (r9 != r10) goto L_0x0307
            if (r7 == 0) goto L_0x02d6
            X.1Xl r8 = r8.A00
            X.1Xj r8 = r8.BPf()
            com.instagram.common.session.UserSession r10 = r11.A03
            java.lang.String r12 = X.C51973G9u.A0j(r10, r8)
            java.lang.String r11 = r8.A2n()
            java.lang.String r13 = "FEED_POST"
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.lang.String r8 = "fundraiser_id"
            r9.put(r8, r3)
            java.lang.String r8 = "source_name"
            r9.put(r8, r13)
            if (r12 == 0) goto L_0x02be
            java.lang.String r8 = "source_owner_igid"
            r9.put(r8, r12)
        L_0x02be:
            if (r11 == 0) goto L_0x02c5
            java.lang.String r8 = "source_media_igid"
            r9.put(r8, r11)
        L_0x02c5:
            r8 = 257(0x101, float:3.6E-43)
            java.lang.String r19 = X.C273654mx.A00(r8)
            r21 = 60
            r17 = r7
            r18 = r10
            r20 = r9
            X.C55175HdR.A00(r17, r18, r19, r20, r21)
        L_0x02d6:
            r20 = 5
            X.LXc r15 = new X.LXc
            r18 = r4
            r19 = r3
            r17 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            X.AnonymousClass0fU.A00(r15, r5)
            r6 = 27
            X.C64286LYm.A00(r5, r6, r4)
            com.instagram.common.session.UserSession r5 = r4.A04
            X.0iw r4 = r4.A03
            java.lang.String r6 = "feed_post_comments_upsell"
            java.lang.String r7 = "FEED_POST_COMMENTS"
            r8 = 0
            r10 = r8
            r9 = r3
            X.LTM.A06(r4, r5, r6, r7, r8, r9, r10)
        L_0x02f9:
            r0.addView(r2)
            if (r14 == 0) goto L_0x0069
            X.6zK r0 = r1.A00
            if (r0 == 0) goto L_0x0069
            r0.A02(r2)
            goto L_0x0069
        L_0x0307:
            if (r7 == 0) goto L_0x02d6
            X.1Xl r8 = r8.A00
            X.1Xj r9 = r8.BPf()
            com.instagram.common.session.UserSession r8 = r11.A03
            java.lang.String r11 = X.C51973G9u.A0j(r8, r9)
            java.lang.String r12 = r9.A2n()
            java.lang.String r10 = "FEED_POST_COMMENTS"
            r9 = r3
            X.LTV.A04(r7, r8, r9, r10, r11, r12)
            goto L_0x02d6
        L_0x0320:
            r8 = 2131238222(0x7f081d4e, float:1.8092717E38)
            android.graphics.drawable.Drawable r8 = r9.getDrawable(r8)
            r4.A00 = r8
            int r8 = X.2Yu.A05(r9)
            int r9 = r9.getColor(r8)
            android.graphics.drawable.Drawable r8 = r4.A00
            if (r8 == 0) goto L_0x0338
            r8.setTint(r9)
        L_0x0338:
            android.widget.ImageView r9 = r6.A03
            android.graphics.drawable.Drawable r8 = r4.A00
            r9.setImageDrawable(r8)
            goto L_0x024c
        L_0x0341:
            java.lang.String r8 = r16.getFundraiserTitle()
            goto L_0x0233
        L_0x0347:
            com.instagram.common.session.UserSession r9 = r1.A03
            X.4DU r11 = r1.A04
            X.GTF r8 = new X.GTF
            r8.<init>(r6, r9, r11)
            X.ITY r2 = new X.ITY
            r2.<init>(r1)
            X.GTH r7 = new X.GTH
            r7.<init>(r9, r11, r2)
            java.lang.Integer r2 = r4.A06
            int r4 = X.AnonymousClass7TG.A0A(r2)
            int r2 = X.C51967G9n.A04(r10, r3)
            X.GTG r3 = new X.GTG
            r3.<init>(r4, r2)
            X.GTC r2 = X.GTF.A04
            android.view.View r2 = r2.A01(r6, r0, r9)
            java.lang.Object r4 = r2.getTag()
            if (r4 == 0) goto L_0x13ef
            X.GTD r4 = (X.GTD) r4
            X.Jw9 r3 = r7.A00(r5, r3)
            r8.A00(r3, r4)
            goto L_0x02f9
        L_0x0380:
            X.1Xj r2 = r5.BPf()
            if (r2 == 0) goto L_0x0069
            X.1Xy r2 = r2.A0C
            X.1bS r2 = r2.B8b()
            if (r2 == 0) goto L_0x0069
            java.lang.String r2 = r2.getFundraiserId()
            if (r2 == 0) goto L_0x0069
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x01d3
        L_0x0398:
            r14 = 0
            goto L_0x01c3
        L_0x039b:
            X.0eS.A00(r45)
            java.lang.Object r2 = r0.A00
            X.1Av r2 = (X.1Av) r2
            r1 = 1
            r2.A1M(r1)
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131974019(0x7f135783, float:1.958509E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r2, r1)
            r1 = 2131974018(0x7f135782, float:1.9585088E38)
            java.lang.String r2 = r2.getString(r1)
            java.lang.String r1 = "amg_camera_roll_access_granted"
            X.Dc2 r1 = X.C339257jJ.A00(r1, r3, r2)
            X.DbX.A1S(r1)
            java.lang.Object r0 = r0.A04
            X.2jD r0 = (X.C227402jD) r0
            r0.A01()
            goto L_0x0069
        L_0x03ca:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A01
            X.9SC r1 = (X.AnonymousClass9SC) r1
            java.lang.Object r2 = r0.A00
            X.7kC r2 = (X.C339807kC) r2
            java.lang.Object r4 = r0.A03
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.Object r3 = r0.A04
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            android.view.View r0 = r2.A04
            android.content.Context r7 = r0.getContext()
            X.Jd3 r8 = new X.Jd3
            r8.<init>(r4, r3)
            X.0qQ.A0A(r7)
            int r22 = r8.getIntrinsicWidth()
            r0 = -1039663104(0xffffffffc2080000, float:-34.0)
            float r12 = X.0nA.A00(r7, r0)
            r0 = -1041901814(0xffffffffc1e5d70a, float:-28.73)
            float r13 = X.0nA.A00(r7, r0)
            r0 = 1109655552(0x42240000, float:41.0)
            float r10 = X.0nA.A00(r7, r0)
            r0 = -1047003136(0xffffffffc1980000, float:-19.0)
            float r11 = X.0nA.A00(r7, r0)
            r0 = -1051459584(0xffffffffc1540000, float:-13.25)
            float r16 = X.0nA.A00(r7, r0)
            r0 = -1045430272(0xffffffffc1b00000, float:-22.0)
            float r17 = X.0nA.A00(r7, r0)
            r0 = -1039400960(0xffffffffc20c0000, float:-35.0)
            float r14 = X.0nA.A00(r7, r0)
            float r15 = X.0nA.A00(r7, r0)
            r0 = -1053294592(0xffffffffc1380000, float:-11.5)
            float r20 = X.0nA.A00(r7, r0)
            r0 = -1046185247(0xffffffffc1a47ae1, float:-20.56)
            float r21 = X.0nA.A00(r7, r0)
            r0 = -1036517376(0xffffffffc2380000, float:-46.0)
            float r18 = X.0nA.A00(r7, r0)
            r0 = -1055916032(0xffffffffc1100000, float:-9.0)
            float r19 = X.0nA.A00(r7, r0)
            int r25 = r8.getIntrinsicWidth()
            int r26 = r8.getIntrinsicHeight()
            r9 = 0
            r23 = 0
            r27 = 33848(0x8438, float:4.7431E-41)
            r28 = 0
            X.7j4 r6 = new X.7j4
            r24 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r5 = r1.A02
            r36 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x0457
            r36 = 1058642330(0x3f19999a, float:0.6)
        L_0x0457:
            X.0sa r4 = r1.A00
            r3 = 10
            X.MM9 r0 = new X.MM9
            r0.<init>(r1, r3)
            X.MKB r33 = X.MKB.A00
            r37 = 2131238134(0x7f081cf6, float:1.8092538E38)
            r38 = 2131965994(0x7f13382a, float:1.9568814E38)
            r40 = 1
            X.MK9 r32 = X.MK9.A00
            X.MKA r34 = X.MKA.A00
            r29 = r6
            r30 = r2
            r31 = r0
            r35 = r4
            r39 = r5
            r41 = r40
            r42 = r40
            r43 = r5
            X.C339837kF.A00(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            goto L_0x0069
        L_0x0483:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.7wn r1 = (X.C347427wn) r1
            r13 = 0
            if (r1 == 0) goto L_0x0491
            X.MXB r13 = r1.CGy()
        L_0x0491:
            X.0eE r2 = X.AnonymousClass0t1.A01
            java.lang.Object r8 = r0.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r8 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r8
            X.0eM r1 = r8.A0f
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.4Cl r1 = X.DbS.A0h(r1, r2)
            java.lang.Boolean r1 = r1.BBj()
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0u()
            boolean r1 = X.0qQ.A0K(r1, r2)
            r3 = 1
            if (r1 == 0) goto L_0x051d
            java.lang.Object r1 = r0.A03
            X.7wl r1 = (X.C347407wl) r1
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x051d
            if (r13 == 0) goto L_0x04c0
            java.lang.String r1 = r13.getId()
            if (r1 != 0) goto L_0x051d
        L_0x04c0:
            r6 = 1
            X.0eM r1 = r8.A0f
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            X.0Tu r4 = X.0Tu.A05
            r1 = 36324101790707496(0x810c9400052f28, double:3.034846465636697E-306)
        L_0x04ce:
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r4, r5, r1)
        L_0x04d2:
            boolean r1 = X.C41845B3m.A14(r2)
            if (r1 == 0) goto L_0x0069
            java.lang.Object r7 = r0.A04
            android.view.View r7 = (android.view.View) r7
            r0 = 2131428065(0x7f0b02e1, float:1.8477764E38)
            android.view.ViewGroup r1 = X.DbX.A0I(r7, r0)
            X.LFW r0 = r8.shareToBarcelonaViewBinder
            if (r0 == 0) goto L_0x04ec
            X.Jel r0 = r0.A04
            r1.removeView(r0)
        L_0x04ec:
            android.content.Context r0 = r7.getContext()
            if (r6 == 0) goto L_0x0514
            X.0qQ.A07(r0)
            X.KNL r10 = new X.KNL
            r10.<init>(r0)
        L_0x04fa:
            r1.addView(r10, r3)
            X.LE1 r11 = r8.A0D
            if (r11 == 0) goto L_0x0069
            androidx.fragment.app.FragmentActivity r6 = r8.requireActivity()
            X.0eM r0 = r8.A0f
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            X.KNl r0 = r8.A0C
            if (r0 != 0) goto L_0x0534
            X.JTO.A1M()
            goto L_0x1212
        L_0x0514:
            X.0qQ.A07(r0)
            X.KNM r10 = new X.KNM
            r10.<init>(r0)
            goto L_0x04fa
        L_0x051d:
            r6 = 0
            if (r13 == 0) goto L_0x04d2
            java.lang.String r1 = r13.getId()
            if (r1 == 0) goto L_0x04d2
            X.0eM r1 = r8.A0f
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            X.0Tu r4 = X.0Tu.A05
            r1 = 36324101790379811(0x810c9400002f23, double:3.0348464654294676E-306)
            goto L_0x04ce
        L_0x0534:
            X.8qK r14 = r0.A0L
            X.KO3 r12 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A02(r8)
            X.LFW r5 = new X.LFW
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r8.shareToBarcelonaViewBinder = r5
            X.Loa r1 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A01(r8)
            X.LFW r0 = r8.shareToBarcelonaViewBinder
            r1.A00 = r0
            goto L_0x0069
        L_0x054b:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.JwI r1 = (X.C61080JwI) r1
            java.lang.Object r5 = r1.A00
            X.MVo r5 = (X.C66534MVo) r5
            java.lang.String r7 = "filterViewContainer"
            java.lang.String r6 = "creationMainActionsFlipper"
            java.lang.Object r3 = r0.A01
            X.JcV r3 = (X.C59962JcV) r3
            if (r5 == 0) goto L_0x05cc
            boolean r1 = X.C59963JcW.A03(r3)
            if (r1 == 0) goto L_0x058d
            boolean r0 = r5 instanceof X.C65499LuN
            if (r0 == 0) goto L_0x0584
            X.LuN r5 = (X.C65499LuN) r5
            X.C59962JcV.A05(r3)
            X.LOy r2 = r3.A0N
            if (r2 == 0) goto L_0x0069
            r0 = 21
            X.Jbg r1 = X.C59917Jbg.A00(r3, r0)
            r0 = 22
            X.Jbg r0 = X.C59917Jbg.A00(r3, r0)
            r2.A03(r5, r1, r0)
            goto L_0x0069
        L_0x0584:
            X.LOy r0 = r3.A0N
            if (r0 == 0) goto L_0x0069
            r0.A01(r5)
            goto L_0x0069
        L_0x058d:
            android.widget.ViewFlipper r2 = r3.A07
            if (r2 == 0) goto L_0x11f8
            r1 = 2
            r2.setDisplayedChild(r1)
            X.0eM r1 = r3.A0i
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r2 = r5.getTitle()
            X.KPN r1 = new X.KPN
            r1.<init>(r2)
            X.C59888JbD.A01(r4, r1)
            java.lang.Object r2 = r0.A04
            android.view.View r2 = (android.view.View) r2
            r1 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            android.view.ViewGroup r2 = X.DbU.A0C(r2, r1)
            android.content.Context r1 = r3.getThemedContext()
            android.view.View r1 = r5.AZq(r1)
            r2.addView(r1)
            com.instagram.creation.base.ui.filterview.FilterViewContainer r1 = r3.A0B
            if (r1 == 0) goto L_0x11e5
            android.view.View r2 = r1.A00
            if (r2 == 0) goto L_0x0606
            boolean r1 = r1.A05
            if (r1 == 0) goto L_0x0606
            r1 = 8
            goto L_0x0603
        L_0x05cc:
            android.widget.ViewFlipper r1 = r3.A07
            if (r1 == 0) goto L_0x11f8
            int r2 = r1.getDisplayedChild()
            r1 = 2
            if (r2 != r1) goto L_0x0069
            android.widget.ViewFlipper r2 = r3.A07
            if (r2 == 0) goto L_0x11f8
            r1 = 1
            r2.setDisplayedChild(r1)
            X.0eM r1 = r3.A0i
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.C59888JbD.A00(r1)
            java.lang.Object r2 = r0.A04
            android.view.View r2 = (android.view.View) r2
            r1 = 2131427808(0x7f0b01e0, float:1.8477243E38)
            android.view.ViewGroup r1 = X.DbU.A0C(r2, r1)
            r1.removeAllViews()
            com.instagram.creation.base.ui.filterview.FilterViewContainer r1 = r3.A0B
            if (r1 == 0) goto L_0x11e5
            android.view.View r2 = r1.A00
            if (r2 == 0) goto L_0x0606
            boolean r1 = r1.A05
            if (r1 == 0) goto L_0x0606
            r1 = 0
        L_0x0603:
            r2.setVisibility(r1)
        L_0x0606:
            java.lang.Object r0 = r0.A03
            X.8Kg r0 = (X.C353998Kg) r0
            r0.EEp()
            goto L_0x0069
        L_0x060f:
            X.0eS.A00(r45)
            java.lang.Object r6 = r0.A00
            X.7ac r6 = (X.C334067ac) r6
            boolean r1 = r6 instanceof X.C334057ab
            r3 = 8
            if (r1 != 0) goto L_0x067b
            boolean r1 = r6 instanceof X.C381889ck
            if (r1 != 0) goto L_0x065b
            boolean r1 = r6 instanceof X.C335407cu
            if (r1 != 0) goto L_0x067b
            boolean r1 = r6 instanceof X.C53497GpT
            if (r1 != 0) goto L_0x065b
            boolean r1 = r6 instanceof X.C335417cv
            if (r1 == 0) goto L_0x13f4
            java.lang.Object r5 = r0.A01
            X.LZa r5 = (X.C64300LZa) r5
            X.L9i r4 = r5.A03
            android.widget.TextView r3 = r4.A01
            java.lang.Object r2 = r0.A04
            r1 = 67
            X.LYG.A02(r3, r1, r5, r2)
            r1 = r6
            X.7cv r1 = (X.C335417cv) r1
            boolean r2 = r1.A0D
            X.L9i r1 = r5.A03
            android.widget.TextView r3 = r1.A01
            r3.setEnabled(r2)
            boolean r2 = r3.isEnabled()
            r1 = 1050253722(0x3e99999a, float:0.3)
            if (r2 == 0) goto L_0x0652
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0652:
            r3.setAlpha(r1)
            android.view.ViewGroup r1 = r4.A00
            r3 = 0
        L_0x0658:
            r1.setVisibility(r3)
        L_0x065b:
            java.lang.Object r2 = r0.A01
            X.LZa r2 = (X.C64300LZa) r2
            java.lang.Object r1 = r0.A04
            X.JjH r1 = (X.C60314JjH) r1
            X.OLz r7 = r1.A09
            java.lang.Object r9 = r0.A03
            X.7L2 r9 = (X.AnonymousClass7L2) r9
            X.L9i r0 = r2.A03
            com.facebook.litho.LithoView r1 = r0.A02
            X.JjH r8 = r2.A05
            X.4DU r10 = r2.A06
            X.Gtw r5 = new X.Gtw
            r5.<init>(r6, r7, r8, r9, r10)
            r1.setComponent(r5)
            r0 = 0
            goto L_0x06a0
        L_0x067b:
            java.lang.Object r1 = r0.A01
            X.LZa r1 = (X.C64300LZa) r1
            X.L9i r2 = r1.A03
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r2.A03
            X.0nA.A0N(r1)
            android.view.ViewGroup r1 = r2.A00
            goto L_0x0658
        L_0x0689:
            X.0eS.A00(r45)
            java.lang.Object r2 = r0.A00
            X.7GY r2 = (X.AnonymousClass7GY) r2
            boolean r1 = r2.A01
            if (r1 != 0) goto L_0x06a5
            boolean r1 = r2.A00
            if (r1 != 0) goto L_0x06a5
            java.lang.Object r0 = r0.A01
            X.LF1 r0 = (X.LF1) r0
            android.view.View r1 = r0.A00
            r0 = 8
        L_0x06a0:
            r1.setVisibility(r0)
            goto L_0x0069
        L_0x06a5:
            java.lang.Object r2 = r0.A01
            X.LF1 r2 = (X.LF1) r2
            android.view.View r1 = r2.A00
            r7 = 0
            r1.setVisibility(r7)
            X.LN8 r4 = r2.A01
            java.lang.Object r6 = r0.A04
            X.0qQ.A0B(r6, r7)
            X.4Cq r5 = r4.A0A
            r3 = 0
            r1 = 41
            X.ImQ r0 = new X.ImQ
            r0.<init>(r6, r4, r3, r1)
            X.19B r2 = X.19B.A00
            X.1Eo.A05(r2, r0, r5)
            com.instagram.igds.components.button.IgdsButton r1 = r4.A05
            if (r1 == 0) goto L_0x06ce
            r0 = 62
            X.LYD.A02(r1, r0, r6)
        L_0x06ce:
            com.instagram.igds.components.button.IgdsButton r1 = r4.A06
            if (r1 == 0) goto L_0x06d7
            r0 = 63
            X.LYD.A02(r1, r0, r6)
        L_0x06d7:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r4.A00
            if (r1 == 0) goto L_0x06e0
            r0 = 68
            X.LYG.A02(r1, r0, r4, r6)
        L_0x06e0:
            r1 = 40
            X.ImQ r0 = new X.ImQ
            r0.<init>(r6, r4, r3, r1)
            X.1Eo.A05(r2, r0, r5)
            r1 = 21
            X.MFR r0 = new X.MFR
            r0.<init>(r6, r3, r1)
            X.1Eo.A05(r2, r0, r5)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0069
            r4.A08 = r7
            r1 = 42
            X.ImQ r0 = new X.ImQ
            r0.<init>(r6, r4, r3, r1)
            X.1Er r0 = X.1Eo.A04(r2, r0, r5)
            r4.A07 = r0
            goto L_0x0069
        L_0x0709:
            X.0eS.A00(r45)
            java.lang.Object r6 = r0.A00
            X.Kmh r6 = (X.C62805Kmh) r6
            X.2dY r2 = X.2dZ.A0t
            java.lang.Object r5 = r0.A01
            X.E4V r5 = (X.E4V) r5
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            X.2dZ r1 = r2.A03(r1)
            r1.A0T()
            X.KQe r1 = X.C61889KQe.A00
            boolean r1 = X.0qQ.A0K(r6, r1)
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0746
            java.lang.Object r1 = r0.A03
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = (com.instagram.ui.widget.progressbutton.ProgressButton) r1
            r1.setShowProgressBar(r3)
            java.lang.Object r0 = r0.A04
            java.util.Iterator r1 = X.C51966G9m.A1H(r0)
        L_0x0738:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            android.view.View r0 = X.JTO.A0H(r1)
            r0.setEnabled(r4)
            goto L_0x0738
        L_0x0746:
            X.KQf r1 = X.KQf.A00
            boolean r1 = X.0qQ.A0K(r6, r1)
            if (r1 == 0) goto L_0x0769
            java.lang.Object r1 = r0.A03
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = (com.instagram.ui.widget.progressbutton.ProgressButton) r1
            r1.setShowProgressBar(r4)
            java.lang.Object r0 = r0.A04
            java.util.Iterator r1 = X.C51966G9m.A1H(r0)
        L_0x075b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            android.view.View r0 = X.JTO.A0H(r1)
            r0.setEnabled(r3)
            goto L_0x075b
        L_0x0769:
            boolean r1 = r6 instanceof X.C61888KQd
            if (r1 == 0) goto L_0x13f9
            X.KQd r6 = (X.C61888KQd) r6
            X.8wd r8 = r6.A00
            androidx.fragment.app.FragmentActivity r9 = r5.requireActivity()
            X.0eM r6 = r5.A0G
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r6)
            int r2 = r8.A0I
            r1 = 28
            if (r2 == r1) goto L_0x07dd
            r1 = 29
            if (r2 == r1) goto L_0x07d6
            r1 = 32
            if (r2 == r1) goto L_0x07cf
            r1 = 61
            if (r2 == r1) goto L_0x07dd
            r1 = 62
            if (r2 == r1) goto L_0x07cf
            java.lang.String r1 = ""
        L_0x0793:
            X.1pE r7 = X.1pE.A01(r9, r5, r7, r1)
            java.lang.String r2 = r8.A1D
            X.0qQ.A07(r2)
            X.3t0 r1 = new X.3t0
            r1.<init>(r2)
            r7.A0B = r1
            r7.A0v = r3
            r7.A0q = r3
            r7.A01 = r5
            r2 = 2
            X.Fb7 r1 = new X.Fb7
            r1.<init>(r5, r2)
            r7.A06 = r1
            r7.A06()
            java.lang.Object r1 = r0.A03
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = (com.instagram.ui.widget.progressbutton.ProgressButton) r1
            r1.setShowProgressBar(r4)
            java.lang.Object r0 = r0.A04
            java.util.Iterator r1 = X.C51966G9m.A1H(r0)
        L_0x07c1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07f1
            android.view.View r0 = X.JTO.A0H(r1)
            r0.setEnabled(r3)
            goto L_0x07c1
        L_0x07cf:
            r1 = 752(0x2f0, float:1.054E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            goto L_0x0793
        L_0x07d6:
            r1 = 337(0x151, float:4.72E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            goto L_0x0793
        L_0x07dd:
            X.0eM r1 = r5.A0A
            java.lang.Object r2 = r1.getValue()
            com.instagram.direct.channels.analytics.ChannelCreationSource r1 = com.instagram.direct.channels.analytics.ChannelCreationSource.MESSAGING_LED
            if (r2 != r1) goto L_0x07ee
            r1 = 649(0x289, float:9.1E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x0793
        L_0x07ee:
            java.lang.String r1 = "inbox_new_subscriber_social_channel"
            goto L_0x0793
        L_0x07f1:
            X.EV0 r1 = X.E4V.A01(r5)
            X.EV0 r0 = X.EV0.Social
            if (r1 != r0) goto L_0x07fa
            r4 = 1
        L_0x07fa:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            X.Mi7 r0 = X.C67089Mi7.A00(r1, r0)
            r0.A0C(r4, r3)
            r5.A09 = r3
            goto L_0x0069
        L_0x080d:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            java.lang.Object r1 = X.C51966G9m.A18(r1)
            X.N3q r1 = (X.C68175N3q) r1
            X.HMC r1 = r1.A01
            int r4 = r1.ordinal()
            r3 = 1
            r2 = 0
            if (r4 == r2) goto L_0x084c
            r1 = 4
            if (r4 == r1) goto L_0x0842
            r1 = 3
            if (r4 == r1) goto L_0x0838
            if (r4 == r3) goto L_0x0838
            r1 = 2
            if (r4 != r1) goto L_0x0069
            java.lang.Object r0 = r0.A03
            X.5Uk r0 = (X.C286225Uk) r0
            if (r0 == 0) goto L_0x0069
            r0.hide()
            goto L_0x0069
        L_0x0838:
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L_0x0d4d
        L_0x0842:
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            goto L_0x0d4d
        L_0x084c:
            java.lang.Object r0 = r0.A04
            X.I1b r0 = (X.C56547I1b) r0
            r0.A01()
            goto L_0x0069
        L_0x0855:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r1 = r1.A01
            X.K1N r1 = (X.K1N) r1
            java.lang.String r3 = r1.A00
            java.lang.String r2 = r1.A01
            if (r3 == 0) goto L_0x0069
            if (r2 == 0) goto L_0x0069
            r1 = 2
            java.lang.String r4 = X.00R.A03(r3, r1)
            java.lang.String r1 = X.00R.A03(r2, r1)
            boolean r1 = X.0qQ.A0K(r4, r1)
            r10 = 1
            r13 = r1 ^ 1
            java.lang.Object r1 = r0.A04
            X.3t3 r1 = (X.C254793t3) r1
            X.3sy r1 = X.C300965yF.A05(r1)
            com.instagram.model.direct.DirectThreadKey r9 = X.C66647MaG.A04(r1)
            if (r9 == 0) goto L_0x0069
            java.lang.Object r1 = r0.A01
            X.KWs r1 = (X.C62036KWs) r1
            java.lang.Object r11 = r0.A03
            X.170 r11 = (X.AnonymousClass170) r11
            X.0eM r0 = r1.A01
            java.lang.Object r8 = r0.getValue()
            X.2Dm r8 = (X.2Dm) r8
            com.instagram.common.session.UserSession r7 = r1.A00
            java.lang.String r0 = r7.A06
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r3)
            java.lang.String r0 = r11.getId()
            java.util.LinkedHashMap r6 = X.DbY.A0p(r0, r2, r1)
            X.2Dr r8 = (X.2Dr) r8
            X.0qQ.A0B(r6, r10)
            X.48S r0 = r8.A0P(r9)
            if (r0 == 0) goto L_0x0900
            X.3U9 r12 = r0.A0I
            X.0qQ.A07(r12)
            X.0eM r0 = r12.A05
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x08f2
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r12.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r4 = 0
            if (r0 != 0) goto L_0x08d8
            int r3 = r1.getReadHoldCount()
            r0 = 0
        L_0x08d0:
            if (r0 >= r3) goto L_0x08d9
            r5.unlock()
            int r0 = r0 + 1
            goto L_0x08d0
        L_0x08d8:
            r3 = 0
        L_0x08d9:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = X.JTP.A0z(r1)
            X.3S9 r1 = r12.A01     // Catch:{ all -> 0x13fe }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x13fe }
            r0.<init>(r6)     // Catch:{ all -> 0x13fe }
            r1.A1z = r0     // Catch:{ all -> 0x13fe }
        L_0x08e6:
            if (r4 >= r3) goto L_0x08ee
            r5.lock()
            int r4 = r4 + 1
            goto L_0x08e6
        L_0x08ee:
            r2.unlock()
            goto L_0x08fd
        L_0x08f2:
            X.3S9 r1 = r12.A01
            monitor-enter(r1)
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x140b }
            r0.<init>(r6)     // Catch:{ all -> 0x140b }
            r1.A1z = r0     // Catch:{ all -> 0x140b }
            monitor-exit(r1)
        L_0x08fd:
            r8.FLo(r9)
        L_0x0900:
            if (r13 == 0) goto L_0x0069
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r7)
            java.lang.String r0 = r11.B8Q()
            X.0qQ.A0B(r0, r10)
            X.Lf9 r0 = new X.Lf9
            r0.<init>()
            r1.A00(r0)
            goto L_0x0069
        L_0x0917:
            X.0eS.A00(r45)
            java.lang.Object r4 = r0.A04
            X.1fq r4 = (X.AnonymousClass1fq) r4
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x0069
            java.lang.Object r5 = r0.A01
            X.1fs r5 = (X.1fs) r5
            com.instagram.common.session.UserSession r2 = r5.A00
            X.0eM r1 = r5.A02
            java.lang.Object r7 = r1.getValue()
            com.instagram.pendingmedia.store.PendingMediaStore r7 = (com.instagram.pendingmedia.store.PendingMediaStore) r7
            X.0eM r1 = r5.A03
            java.lang.Object r8 = r1.getValue()
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r8 = (com.instagram.pendingmedia.store.PendingMediaStoreSerializer) r8
            java.lang.String r9 = r4.A02
            if (r9 == 0) goto L_0x140e
            com.instagram.model.direct.DirectThreadKey r6 = r4.A07()
            java.lang.Object r1 = r0.A00
            X.0xF r1 = (X.0xF) r1
            java.lang.Object r3 = r0.A03
            X.Pwk r3 = (X.C74551Pwk) r3
            X.C64009LIw.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0069
        L_0x094d:
            X.0eS.A00(r45)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Object r8 = r0.A01
            X.T7D r8 = (X.T7D) r8
            java.lang.Object r1 = r0.A04
            java.util.List r1 = (java.util.List) r1
            X.T7D.A04(r8, r1)
            java.lang.Object r7 = r0.A00
            com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata r7 = (com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata) r7
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r5 = r1.iterator()
        L_0x096b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0980
            java.lang.Object r2 = r5.next()
            com.instagram.jobscheduler.bgfetch.IgBgFetchJob r2 = (com.instagram.jobscheduler.bgfetch.IgBgFetchJob) r2
            com.instagram.jobscheduler.bgfetch.IgBgFetchPendingJob r1 = new com.instagram.jobscheduler.bgfetch.IgBgFetchPendingJob
            r1.<init>(r2, r3)
            r6.add(r1)
            goto L_0x096b
        L_0x0980:
            long r3 = r7.A00
            java.util.List r5 = r7.A01
            java.util.List r1 = r7.A02
            java.util.ArrayList r2 = X.00k.A0S(r6, r1)
            com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata r1 = new com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata
            r1.<init>(r5, r2, r3)
            X.T7D.A01(r1, r8)
            java.lang.Object r0 = r0.A03
            X.DbS.A1U(r0)
            goto L_0x0069
        L_0x0999:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A01
            X.JjV r1 = (X.C60326JjV) r1
            com.instagram.mediakit.repository.MediaKitRepository r9 = r1.A03
            java.lang.Object r8 = r0.A04
            X.1ud r2 = X.1ua.A0G
            java.lang.Object r1 = r0.A03
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A00
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1ua r7 = r2.A01(r1, r0)
            X.AnonymousClass7TG.A1N(r8, r7)
            X.12T r1 = X.AnonymousClass12T.A00
            r10 = 0
            r0 = 2010364072(0x77d3b8a8, float:8.588437E33)
            X.19S r5 = X.JTR.A17(r1, r0)
            r11 = 18
            X.MGh r0 = new X.MGh
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x09c7:
            X.AnonymousClass7TE.A1Z(r0, r5)
            goto L_0x0069
        L_0x09cc:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.4Cq r1 = (X.C262224Cq) r1
            java.lang.Object r6 = r0.A01
            X.E4F r6 = (X.E4F) r6
            X.0eM r2 = r6.A05
            java.lang.Object r2 = r2.getValue()
            X.Dkq r2 = (X.C46763Dkq) r2
            X.0Ud r2 = r2.A0E
            java.lang.Object r4 = r0.A04
            java.lang.Object r5 = r0.A03
            r7 = 0
            r8 = 25
            X.MGj r3 = new X.MGj
            r3.<init>(r4, r5, r6, r7, r8)
            X.C51968G9o.A1P(r3, r1, r2)
            X.0eM r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            X.Dkq r0 = (X.C46763Dkq) r0
            X.0r6 r3 = r0.A0B
            r0 = 21
            X.Fy7 r5 = new X.Fy7
            r5.<init>(r6, r7, r0)
            goto L_0x0b88
        L_0x0a03:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.4Cq r1 = (X.C262224Cq) r1
            java.lang.Object r6 = r0.A01
            X.E2p r6 = (X.C47443E2p) r6
            X.0eM r2 = r6.A02
            java.lang.Object r2 = r2.getValue()
            X.Dkl r2 = (X.C46758Dkl) r2
            X.0Ud r2 = r2.A06
            java.lang.Object r4 = r0.A04
            java.lang.Object r5 = r0.A03
            r7 = 0
            r8 = 27
            X.MGj r3 = new X.MGj
            r3.<init>(r4, r5, r6, r7, r8)
            X.C51968G9o.A1P(r3, r1, r2)
            X.0eM r0 = r6.A02
            java.lang.Object r0 = r0.getValue()
            X.Dkl r0 = (X.C46758Dkl) r0
            X.0r6 r3 = r0.A04
            r0 = 25
            X.Fy7 r5 = new X.Fy7
            r5.<init>(r6, r7, r0)
            goto L_0x0b88
        L_0x0a3a:
            X.0eS.A00(r45)
            java.lang.Object r3 = r0.A00
            X.KnK r3 = (X.C62844KnK) r3
            boolean r1 = r3 instanceof X.EP0
            r2 = 8
            r9 = 0
            if (r1 == 0) goto L_0x0a4d
            A00(r0, r9, r2)
            goto L_0x0069
        L_0x0a4d:
            boolean r1 = r3 instanceof X.C62009KVi
            if (r1 == 0) goto L_0x1413
            A00(r0, r2, r9)
            java.lang.Object r5 = r0.A01
            X.E2p r5 = (X.C47443E2p) r5
            X.0eM r0 = r5.A01
            java.lang.Object r4 = r0.getValue()
            X.JlH r4 = (X.C60424JlH) r4
            X.KVi r3 = (X.C62009KVi) r3
            java.util.List r8 = r3.A00
            java.util.List r6 = r3.A01
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.0eM r0 = r5.A02
            java.lang.Object r0 = r0.getValue()
            X.Dkl r0 = (X.C46758Dkl) r0
            com.instagram.api.schemas.IGRevShareProductType r7 = r0.A00
            com.instagram.api.schemas.IGRevShareProductType r1 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
            android.content.res.Resources r0 = X.DbV.A05(r5)
            r10 = 2131963682(0x7f132f22, float:1.9564124E38)
            java.lang.String r11 = r0.getString(r10)
            android.content.res.Resources r2 = X.Dbb.A09(r5, r11)
            if (r7 != r1) goto L_0x0b36
            X.0eM r0 = r5.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.C49785F6t.A01(r0)
            r1 = 2131963683(0x7f132f23, float:1.9564126E38)
            if (r0 == 0) goto L_0x0a99
            r1 = 2131963700(0x7f132f34, float:1.956416E38)
        L_0x0a99:
            r7 = 1
            android.content.res.Resources r0 = X.DbV.A05(r5)
            java.lang.String r0 = r0.getString(r10)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            android.text.SpannableStringBuilder r10 = X.DbS.A0C(r0)
            int r2 = X.Dbb.A06(r5)
            r1 = 44
        L_0x0ab0:
            X.ESx r0 = new X.ESx
            r0.<init>((X.C47443E2p) r5, (int) r2, (int) r1)
            X.AnonymousClass7AV.A05(r10, r0, r11)
            r1 = 2132018053(0x7f140385, float:1.9674402E38)
            X.Lu8 r0 = new X.Lu8
            r0.<init>(r10, r1)
            r3.add(r0)
            r10 = 2131963671(0x7f132f17, float:1.9564102E38)
            r0 = 2131963679(0x7f132f1f, float:1.9564118E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 47
            X.FPD r0 = new X.FPD
            r0.<init>((java.lang.Object) r5, (int) r1)
            X.DbV.A1E(r0, r2, r3, r10, r9)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0b2f
            r1 = 2131963669(0x7f132f15, float:1.9564098E38)
            android.content.res.Resources r0 = X.DbV.A05(r5)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r0, r1)
            r1 = 2132018624(0x7f1405c0, float:1.967556E38)
            X.Lu8 r0 = new X.Lu8
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x0af3:
            r0 = 2131963680(0x7f132f20, float:1.956412E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 48
            X.FPD r1 = new X.FPD
            r1.<init>((java.lang.Object) r5, (int) r0)
            r0 = 2131963678(0x7f132f1e, float:1.9564116E38)
            X.DbV.A1E(r1, r2, r3, r0, r7)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0b28
            r1 = 2131963676(0x7f132f1c, float:1.9564112E38)
            android.content.res.Resources r0 = X.DbV.A05(r5)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r0, r1)
            r1 = 2132018624(0x7f1405c0, float:1.967556E38)
            X.Lu8 r0 = new X.Lu8
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x0b23:
            r4.A00(r3)
            goto L_0x0069
        L_0x0b28:
            r0 = 2131820754(0x7f1100d2, float:1.9274232E38)
            X.C47443E2p.A00(r5, r3, r6, r0)
            goto L_0x0b23
        L_0x0b2f:
            r0 = 2131820753(0x7f1100d1, float:1.927423E38)
            X.C47443E2p.A00(r5, r3, r8, r0)
            goto L_0x0af3
        L_0x0b36:
            r1 = 2131963620(0x7f132ee4, float:1.9563999E38)
            r7 = 1
            android.content.res.Resources r0 = X.DbV.A05(r5)
            java.lang.String r0 = r0.getString(r10)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            android.text.SpannableStringBuilder r10 = X.DbS.A0C(r0)
            int r2 = X.Dbb.A06(r5)
            r1 = 43
            goto L_0x0ab0
        L_0x0b52:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.4Cq r1 = (X.C262224Cq) r1
            java.lang.Object r6 = r0.A01
            X.E2e r6 = (X.C47432E2e) r6
            X.0eM r2 = r6.A01
            java.lang.Object r2 = r2.getValue()
            X.JfY r2 = (X.C60092JfY) r2
            X.05G r5 = r2.A05
            java.lang.Object r4 = r0.A04
            X.Dln r4 = (X.C46811Dln) r4
            java.lang.Object r3 = r0.A03
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r2 = 0
            X.GDq r0 = new X.GDq
            r0.<init>(r3, r4, r2)
            X.C51968G9o.A1P(r0, r1, r5)
            X.0eM r0 = r6.A01
            java.lang.Object r0 = r0.getValue()
            X.JfY r0 = (X.C60092JfY) r0
            X.0r6 r3 = r0.A04
            r0 = 2
            X.GDq r5 = new X.GDq
            r5.<init>(r4, r6, r2, r0)
        L_0x0b88:
            X.C51968G9o.A1P(r5, r1, r3)
            goto L_0x0069
        L_0x0b8d:
            X.0eS.A00(r45)
            java.lang.Object r7 = r0.A00
            X.MQ0 r7 = (X.MQ0) r7
            java.lang.Object r4 = r0.A04
            X.05G r4 = (X.05G) r4
            java.lang.Object r0 = r0.A03
            X.UKY r0 = (X.UKY) r0
            X.UzF r5 = r0.A00
            boolean r6 = r0.A05
            r3 = 0
            X.0qQ.A0B(r4, r3)
            r2 = 1
            X.AnonymousClass7TF.A1C(r5, r2, r7)
            X.JwC r0 = X.JTO.A0P(r4)
            X.Jw7 r1 = r0.A04(r5)
            if (r1 == 0) goto L_0x0069
            boolean r0 = r7 instanceof X.C59702JUj
            if (r0 == 0) goto L_0x0bcd
            java.lang.Integer r3 = X.AnonymousClass05K.A01
        L_0x0bb8:
            java.lang.Object r2 = r1.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r1.A01
            X.Knf r0 = (X.C62865Knf) r0
            X.AnonymousClass7TG.A1T(r2, r3, r0)
            X.Jw7 r1 = new X.Jw7
            r1.<init>((X.C62865Knf) r0, (java.lang.Integer) r3, (java.util.List) r2)
        L_0x0bc8:
            X.C64835Lix.A05(r1, r5, r4)
            goto L_0x0069
        L_0x0bcd:
            boolean r0 = X.C59678JTj.A01(r3, r7)
            if (r0 == 0) goto L_0x0bd6
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x0bb8
        L_0x0bd6:
            boolean r0 = X.C59678JTj.A01(r2, r7)
            if (r0 == 0) goto L_0x1418
            if (r6 == 0) goto L_0x0c08
            X.JTj r7 = (X.C59678JTj) r7
            java.lang.Object r1 = r7.A01
            X.UY2 r1 = (X.UY2) r1
            com.instagram.model.shopping.productfeed.ProductFeedResponse r0 = r1.A02
            java.util.List r0 = r0.A03
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
        L_0x0bec:
            X.0qQ.A0A(r3)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.instagram.model.shopping.productfeed.ProductFeedResponse r0 = r1.A02
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x0c05
            X.KZp r0 = new X.KZp
            r0.<init>(r1)
        L_0x0bfc:
            X.AnonymousClass7TG.A1T(r3, r2, r0)
            X.Jw7 r1 = new X.Jw7
            r1.<init>((X.C62865Knf) r0, (java.lang.Integer) r2, (java.util.List) r3)
            goto L_0x0bc8
        L_0x0c05:
            X.KZo r0 = X.C62084KZo.A00
            goto L_0x0bfc
        L_0x0c08:
            java.lang.Object r2 = r1.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.JTj r7 = (X.C59678JTj) r7
            java.lang.Object r1 = r7.A01
            X.UY2 r1 = (X.UY2) r1
            com.instagram.model.shopping.productfeed.ProductFeedResponse r0 = r1.A02
            java.util.List r0 = r0.A03
            java.util.List r0 = X.C51966G9m.A1J(r0)
            java.util.ArrayList r0 = X.00k.A0S(r0, r2)
            java.util.List r3 = X.00k.A0W(r0)
            goto L_0x0bec
        L_0x0c23:
            X.0eS.A00(r45)
            java.lang.Object r7 = r0.A00
            X.JTj r7 = (X.C59678JTj) r7
            java.lang.Object r6 = r0.A03
            X.JuT r6 = (X.C60971JuT) r6
            X.0sP r2 = r6.A09
            java.lang.Object r1 = r7.A01
            X.JwL r1 = (X.C61083JwL) r1
            java.lang.Object r1 = r1.A01
            int r1 = X.AnonymousClass7TE.A0M(r1)
            switch(r1) {
                case 1: goto L_0x0c6e;
                case 2: goto L_0x0c71;
                case 3: goto L_0x0c74;
                default: goto L_0x0c3d;
            }
        L_0x0c3d:
            java.lang.String r1 = "from_memory_cache"
        L_0x0c3f:
            r2.invoke(r1)
            boolean r1 = r6.A0A
            if (r1 == 0) goto L_0x0c82
            java.lang.Object r8 = r0.A04
            X.L8Q r8 = (X.L8Q) r8
            java.util.HashMap r5 = r8.A02
            X.0eM r4 = r6.A04
            java.lang.Object r1 = r4.getValue()
            java.lang.Object r1 = r5.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0c7b
            java.util.Iterator r3 = r1.iterator()
        L_0x0c5e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0c7b
            java.lang.Object r2 = r3.next()
            java.util.HashMap r1 = r8.A00
            r1.remove(r2)
            goto L_0x0c5e
        L_0x0c6e:
            r1 = 3166(0xc5e, float:4.437E-42)
            goto L_0x0c76
        L_0x0c71:
            r1 = 1377(0x561, float:1.93E-42)
            goto L_0x0c76
        L_0x0c74:
            r1 = 3168(0xc60, float:4.44E-42)
        L_0x0c76:
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x0c3f
        L_0x0c7b:
            java.lang.Object r1 = r4.getValue()
            r5.remove(r1)
        L_0x0c82:
            java.lang.Object r4 = r0.A04
            X.L8Q r4 = (X.L8Q) r4
            java.util.HashMap r2 = r4.A02
            X.0eM r1 = r6.A04
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r3 = r2.get(r1)
            if (r3 != 0) goto L_0x0c9b
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r2.put(r1, r3)
        L_0x0c9b:
            java.util.List r3 = (java.util.List) r3
            X.0eM r2 = r6.A05
            java.lang.Object r1 = r2.getValue()
            r3.add(r1)
            java.util.HashMap r8 = r4.A00
            java.lang.Object r5 = r2.getValue()
            r2 = r7
            r4 = 1
            boolean r1 = X.C59678JTj.A01(r4, r7)
            if (r1 == 0) goto L_0x0cdf
            java.lang.Object r1 = r7.A01
            X.JwL r1 = (X.C61083JwL) r1
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            java.lang.Object r2 = r1.A00
            X.CGL r2 = (X.CGL) r2
            X.0qQ.A0B(r2, r4)
            X.JwL r1 = new X.JwL
            r1.<init>((X.CGL) r2, (java.lang.Integer) r3)
            X.JTj r2 = new X.JTj
            r2.<init>(r1, r4)
        L_0x0ccb:
            r8.put(r5, r2)
            java.lang.Object r3 = r0.A01
            X.LQV r3 = (X.LQV) r3
            com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint r2 = r6.A01
            r1 = 3
            X.J6T r0 = new X.J6T
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r7)
            X.LQV.A01(r2, r3, r0)
            goto L_0x0069
        L_0x0cdf:
            boolean r1 = X.C59678JTj.A02(r7)
            if (r1 != 0) goto L_0x0ccb
            X.Wub r6 = X.AnonymousClass7TE.A1K()
            throw r6
        L_0x0cea:
            X.0eS.A00(r45)
            java.lang.Object r5 = r0.A00
            X.Kni r5 = (X.C62868Kni) r5
            boolean r1 = r5 instanceof X.C62093KZx
            if (r1 == 0) goto L_0x0d52
            java.lang.Object r1 = r0.A01
            X.Jii r1 = (X.C60286Jii) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            boolean r1 = X.C314866iy.A01(r1)
            if (r1 == 0) goto L_0x0d41
            r1 = r5
            X.KZx r1 = (X.C62093KZx) r1
            X.K1h r10 = r1.A00
            java.util.List r1 = r10.A00()
            java.util.Iterator r9 = r1.iterator()
        L_0x0d0e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0d41
            java.lang.Object r8 = r9.next()
            X.6nz r8 = (X.C317876nz) r8
            java.util.List r1 = r8.A0O
            r2 = 0
            java.lang.Object r7 = X.00k.A0O(r1, r2)
            X.6o8 r7 = (X.C317966o8) r7
            if (r7 == 0) goto L_0x0d0e
            java.lang.String r6 = r10.A03
            java.lang.String r4 = r10.A04
            java.lang.String r3 = r10.A05
            java.util.List r1 = r8.A0O
            java.lang.Object r1 = X.00k.A0O(r1, r2)
            X.6o8 r1 = (X.C317966o8) r1
            if (r1 == 0) goto L_0x0d3f
            java.lang.String r2 = r1.A0Q
        L_0x0d37:
            com.instagram.avatars.common.AvatarInfo r1 = new com.instagram.avatars.common.AvatarInfo
            r1.<init>(r6, r4, r3, r2)
            r7.A0G = r1
            goto L_0x0d0e
        L_0x0d3f:
            r2 = 0
            goto L_0x0d37
        L_0x0d41:
            java.lang.Object r1 = r0.A03
            X.0sP r1 = (X.0sP) r1
            X.KZx r5 = (X.C62093KZx) r5
            X.K1h r0 = r5.A00
            java.util.List r0 = r0.A00()
        L_0x0d4d:
            r1.invoke(r0)
            goto L_0x0069
        L_0x0d52:
            boolean r1 = r5 instanceof X.C62092KZw
            if (r1 == 0) goto L_0x141d
            java.lang.Object r1 = r0.A01
            java.lang.String r3 = X.C51968G9o.A16(r1)
            X.0qQ.A07(r3)
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Failed to get avatar music sticker pack "
            r2.append(r1)
            java.lang.Object r0 = r0.A04
            r2.append(r0)
            r0 = 2059(0x80b, float:2.885E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.append(r0)
            X.KZw r5 = (X.C62092KZw) r5
            java.lang.Throwable r0 = r5.A00
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r2)
            X.0wb.A03(r3, r0)
            goto L_0x0069
        L_0x0d83:
            X.0eS.A00(r45)
            java.lang.Object r6 = r0.A00
            X.Knu r6 = (X.C62880Knu) r6
            boolean r1 = r6 instanceof X.C62272Kd6
            if (r1 == 0) goto L_0x0db3
            java.lang.Object r2 = r0.A04
            X.Vjq r2 = (X.C18014Vjq) r2
            if (r2 == 0) goto L_0x0069
            X.Kd6 r6 = (X.C62272Kd6) r6
            java.lang.String r1 = r6.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.Map r0 = r2.A05
            java.lang.Object r0 = r0.get(r1)
            X.L2d r0 = (X.C63667L2d) r0
            if (r0 == 0) goto L_0x0db1
            android.view.View r1 = r0.A00
        L_0x0da8:
            boolean r0 = r1 instanceof android.widget.Space
            if (r0 == 0) goto L_0x0069
            r2.A01(r1)
            goto L_0x0069
        L_0x0db1:
            r1 = 0
            goto L_0x0da8
        L_0x0db3:
            boolean r1 = r6 instanceof X.C62275Kd9
            if (r1 == 0) goto L_0x0dfc
            java.lang.Object r0 = r0.A03
            X.L2o r0 = (X.C63678L2o) r0
            com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment r0 = r0.A00
            X.KfX r3 = r0.A08
            if (r3 == 0) goto L_0x0069
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0069
            r0 = 1
            r3.A0B = r0
            X.LDx r0 = r3.A0M
            android.os.Handler r1 = r0.A02
            java.lang.Runnable r0 = r0.A04
            r1.removeCallbacks(r0)
            X.LSQ r0 = r3.A08
            if (r0 == 0) goto L_0x0dd8
            r0.A04()
        L_0x0dd8:
            X.M0W r2 = r3.A0K
            java.lang.String r1 = "stop camera"
            java.lang.String r0 = ""
            r2.A0A(r1, r0)
            X.W1D r0 = r3.A09
            X.U1s r2 = r0.A09
            r1 = 5
            android.os.Message r0 = r2.obtainMessage(r1)
            r2.sendMessageAtFrontOfQueue(r0)
            X.LOa r0 = r3.A08
            r0.A01()
            X.KAt r0 = new X.KAt
            r0.<init>(r3, r1)
            X.C62422KfX.A00(r0, r3)
            goto L_0x0069
        L_0x0dfc:
            boolean r1 = r6 instanceof X.C62274Kd8
            if (r1 == 0) goto L_0x0e0f
            java.lang.Object r1 = r0.A04
            X.Utx r1 = (X.C16380Utx) r1
            if (r1 == 0) goto L_0x0069
            X.Kd8 r6 = (X.C62274Kd8) r6
            java.lang.String r0 = r6.A00
            r1.A04(r0)
            goto L_0x0069
        L_0x0e0f:
            boolean r1 = r6 instanceof X.C62271Kd5
            if (r1 == 0) goto L_0x0e22
            java.lang.Object r1 = r0.A04
            X.Utx r1 = (X.C16380Utx) r1
            if (r1 == 0) goto L_0x0069
            X.Kd5 r6 = (X.C62271Kd5) r6
            java.lang.String r0 = r6.A00
            r1.A03(r0)
            goto L_0x0069
        L_0x0e22:
            boolean r1 = r6 instanceof X.C62273Kd7
            if (r1 == 0) goto L_0x0069
            java.lang.Object r5 = r0.A01
            X.L7M r5 = (X.L7M) r5
            android.content.Context r4 = r5.A00
            X.8ab r3 = X.DbS.A0Y(r4)
            r1 = 2131965207(0x7f133517, float:1.9567217E38)
            r2 = 1
            X.Kd7 r6 = (X.C62273Kd7) r6
            java.lang.String r0 = r6.A00
            java.lang.String r0 = X.DbW.A0h(r4, r0, r1)
            r3.A05 = r0
            r0 = 2131965206(0x7f133516, float:1.9567215E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r4, r0)
            r0 = 47
            X.LV2 r0 = X.LV2.A00(r5, r0)
            r3.A0c(r0, r1)
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r4, r0)
            r0 = 0
            r3.A0a(r0, r1)
            X.AnonymousClass7TH.A0a(r3, r2)
            goto L_0x0069
        L_0x0e5e:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.Ko3 r1 = (X.C62889Ko3) r1
            boolean r2 = r1 instanceof X.C62326Kdy
            if (r2 == 0) goto L_0x0f48
            java.lang.Object r5 = r0.A01
            X.LMb r5 = (X.C64083LMb) r5
            android.content.Context r2 = r5.A00
            com.instagram.common.session.UserSession r0 = r5.A01
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r2, r0)
            r6 = r1
            X.Kdy r6 = (X.C62326Kdy) r6
            boolean r0 = r6.A09
            r3.A07 = r0
            android.content.Context r2 = r3.A00
            r0 = 2131966692(0x7f133ae4, float:1.957023E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r2, r0)
            r0 = 45
            X.LY5 r0 = X.LY5.A00(r5, r0)
            r4 = 2
            r3.A06(r0, r7, r4)
            X.0eM r0 = r5.A02
            java.lang.Object r0 = r0.getValue()
            X.Jip r0 = (X.C60292Jip) r0
            r0.A01()
            boolean r7 = r6.A06
            r0 = 2131960780(0x7f1323cc, float:1.9558238E38)
            if (r7 == 0) goto L_0x0ea5
            r0 = 2131961626(0x7f13271a, float:1.9559954E38)
        L_0x0ea5:
            java.lang.String r8 = X.AnonymousClass7TE.A16(r2, r0)
            r7 = 68
            X.LY7 r0 = new X.LY7
            r0.<init>((int) r7, (java.lang.Object) r1, (java.lang.Object) r5)
            r3.A06(r0, r8, r4)
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0ecf
            boolean r7 = r6.A08
            r0 = 2131961629(0x7f13271d, float:1.955996E38)
            if (r7 == 0) goto L_0x0ec1
            r0 = 2131960785(0x7f1323d1, float:1.9558248E38)
        L_0x0ec1:
            java.lang.String r8 = X.AnonymousClass7TE.A16(r2, r0)
            r7 = 69
            X.LY7 r0 = new X.LY7
            r0.<init>((int) r7, (java.lang.Object) r1, (java.lang.Object) r5)
            r3.A06(r0, r8, r4)
        L_0x0ecf:
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0eeb
            boolean r7 = r6.A04
            r0 = 2131961625(0x7f132719, float:1.9559952E38)
            if (r7 == 0) goto L_0x0edd
            r0 = 2131960779(0x7f1323cb, float:1.9558236E38)
        L_0x0edd:
            java.lang.String r8 = X.AnonymousClass7TE.A16(r2, r0)
            r7 = 70
            X.LY7 r0 = new X.LY7
            r0.<init>((int) r7, (java.lang.Object) r1, (java.lang.Object) r5)
            r3.A06(r0, r8, r4)
        L_0x0eeb:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0f06
            boolean r7 = r6.A07
            r0 = 2131961628(0x7f13271c, float:1.9559958E38)
            if (r7 == 0) goto L_0x0ef9
            r0 = 2131960784(0x7f1323d0, float:1.9558246E38)
        L_0x0ef9:
            java.lang.String r8 = X.AnonymousClass7TE.A16(r2, r0)
            r7 = 0
            X.LY2 r0 = new X.LY2
            r0.<init>(r7, r1, r5)
            r3.A06(r0, r8, r4)
        L_0x0f06:
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0f2a
            r0 = 2131956749(0x7f13140d, float:1.9550062E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r0)
            r0 = 46
            X.LY5 r0 = X.LY5.A00(r5, r0)
            r3.A06(r0, r1, r4)
            r0 = 2131973529(0x7f135599, float:1.9584096E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r0)
            r0 = 47
            X.LY5 r0 = X.LY5.A00(r5, r0)
            r3.A06(r0, r1, r4)
        L_0x0f2a:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0f3e
            r0 = 2131973868(0x7f1356ec, float:1.9584784E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r0)
            r0 = 48
            X.LY5 r0 = X.LY5.A00(r5, r0)
            r3.A06(r0, r1, r4)
        L_0x0f3e:
            X.FFy r0 = new X.FFy
            r0.<init>(r3)
            r0.A05(r2)
            goto L_0x0069
        L_0x0f48:
            boolean r2 = r1 instanceof X.C62325Kdx
            if (r2 == 0) goto L_0x103d
            java.lang.Object r2 = r0.A01
            X.LMb r2 = (X.C64083LMb) r2
            com.instagram.common.session.UserSession r3 = r2.A01
            X.Hto r8 = new X.Hto
            r8.<init>(r3)
            java.lang.Object r3 = r0.A04
            X.XCD r3 = (X.XCD) r3
            r8.A01 = r3
            r15 = 0
            r8.A03 = r15
            java.lang.Object r4 = r0.A03
            X.4DH r4 = (X.AnonymousClass4DH) r4
            r3 = r1
            X.Kdx r3 = (X.C62325Kdx) r3
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0f9f
            android.content.Context r9 = r2.A00
            java.lang.String r11 = r4.getModuleName()
            r0 = 2131956749(0x7f13140d, float:1.9550062E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r9, r0)
            r14 = 2131238496(0x7f081e60, float:1.8093272E38)
            r13 = 1065353216(0x3f800000, float:1.0)
            r0 = 39
            X.KHt r10 = new X.KHt
            r10.<init>(r2, r0)
            r8.A04(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r11 = r4.getModuleName()
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r9, r0)
            r14 = 2131238773(0x7f081f75, float:1.8093834E38)
            r0 = 40
            X.KHt r10 = new X.KHt
            r10.<init>(r2, r0)
            r8.A04(r9, r10, r11, r12, r13, r14, r15)
        L_0x0f9f:
            android.content.Context r6 = r2.A00
            r0 = 2131966692(0x7f133ae4, float:1.957023E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r6, r0)
            r4 = 2131237850(0x7f081bda, float:1.8091962E38)
            r0 = 49
            X.LY5 r0 = X.LY5.A00(r2, r0)
            r8.A01(r6, r0, r5, r4)
            X.0eM r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            X.Jip r0 = (X.C60292Jip) r0
            r0.A01()
            boolean r4 = r3.A05
            r0 = 2131960780(0x7f1323cc, float:1.9558238E38)
            if (r4 == 0) goto L_0x0fc9
            r0 = 2131961626(0x7f13271a, float:1.9559954E38)
        L_0x0fc9:
            java.lang.String r7 = X.AnonymousClass7TE.A16(r6, r0)
            r5 = 2131238148(0x7f081d04, float:1.8092567E38)
            r4 = 1
            X.LY2 r0 = new X.LY2
            r0.<init>(r4, r1, r2)
            r8.A01(r6, r0, r7, r5)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0ff7
            boolean r4 = r3.A07
            r0 = 2131961629(0x7f13271d, float:1.955996E38)
            if (r4 == 0) goto L_0x0fe7
            r0 = 2131960785(0x7f1323d1, float:1.9558248E38)
        L_0x0fe7:
            java.lang.String r7 = X.AnonymousClass7TE.A16(r6, r0)
            r5 = 2131238498(0x7f081e62, float:1.8093276E38)
            r4 = 2
            X.LY2 r0 = new X.LY2
            r0.<init>(r4, r1, r2)
            r8.A01(r6, r0, r7, r5)
        L_0x0ff7:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x1015
            boolean r4 = r3.A03
            r0 = 2131961625(0x7f132719, float:1.9559952E38)
            if (r4 == 0) goto L_0x1005
            r0 = 2131960779(0x7f1323cb, float:1.9558236E38)
        L_0x1005:
            java.lang.String r7 = X.AnonymousClass7TE.A16(r6, r0)
            r5 = 2131237959(0x7f081c47, float:1.8092183E38)
            r4 = 3
            X.LY2 r0 = new X.LY2
            r0.<init>(r4, r1, r2)
            r8.A01(r6, r0, r7, r5)
        L_0x1015:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x1033
            boolean r3 = r3.A06
            r0 = 2131961628(0x7f13271c, float:1.9559958E38)
            if (r3 == 0) goto L_0x1023
            r0 = 2131960784(0x7f1323d0, float:1.9558246E38)
        L_0x1023:
            java.lang.String r5 = X.AnonymousClass7TE.A16(r6, r0)
            r4 = 2131238671(0x7f081f0f, float:1.8093627E38)
            r3 = 4
            X.LY2 r0 = new X.LY2
            r0.<init>(r3, r1, r2)
            r8.A01(r6, r0, r5, r4)
        L_0x1033:
            X.Vho r0 = new X.Vho
            r0.<init>(r8)
            r0.A00(r6)
            goto L_0x0069
        L_0x103d:
            boolean r2 = r1 instanceof X.C62319Kdr
            if (r2 == 0) goto L_0x1050
            java.lang.Object r0 = r0.A01
            X.LMb r0 = (X.C64083LMb) r0
            android.content.Context r2 = r0.A00
            X.Kdr r1 = (X.C62319Kdr) r1
            java.lang.String r0 = r1.A00
            X.0nC.A00(r2, r0)
            goto L_0x0069
        L_0x1050:
            boolean r2 = r1 instanceof X.C62321Kdt
            if (r2 == 0) goto L_0x1064
            java.lang.Object r0 = r0.A01
            X.LMb r0 = (X.C64083LMb) r0
            android.content.Context r2 = r0.A00
            X.Kdt r1 = (X.C62321Kdt) r1
            int r1 = r1.A00
            r0 = 0
        L_0x105f:
            X.C59689JTv.A0F(r2, r0, r1)
            goto L_0x0069
        L_0x1064:
            boolean r2 = r1 instanceof X.C62322Kdu
            if (r2 == 0) goto L_0x1098
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.Kdu r1 = (X.C62322Kdu) r1
            java.lang.String r9 = r1.A02
            java.lang.String r2 = "android.intent.extra.TEXT"
            r3.putString(r2, r9)
            r7 = 0
            r12 = 1
            r13 = 0
            java.lang.Object r4 = r0.A03
            X.4DH r4 = (X.AnonymousClass4DH) r4
            android.app.Activity r2 = r4.getRootActivity()
            if (r2 == 0) goto L_0x1422
            java.lang.String r10 = r1.A01
            com.instagram.user.model.User r6 = r1.A00
            java.lang.Object r0 = r0.A01
            X.LMb r0 = (X.C64083LMb) r0
            com.instagram.common.session.UserSession r5 = r0.A01
            r0 = 73
            java.lang.String r8 = X.C66579MXk.A00(r0)
            r11 = r7
            X.C46395DeI.A02(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0069
        L_0x1098:
            boolean r2 = r1 instanceof X.C62323Kdv
            if (r2 == 0) goto L_0x10a9
            X.37E r1 = X.AnonymousClass37D.A00
            java.lang.Object r0 = r0.A03
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.DbX.A10(r0, r1)
            goto L_0x0069
        L_0x10a9:
            boolean r2 = r1 instanceof X.C62324Kdw
            if (r2 == 0) goto L_0x10b8
            java.lang.Object r0 = r0.A01
            X.LMb r0 = (X.C64083LMb) r0
            android.content.Context r0 = r0.A00
            X.SQH.A00(r0)
            goto L_0x0069
        L_0x10b8:
            boolean r2 = r1 instanceof X.C62320Kds
            if (r2 == 0) goto L_0x0069
            java.lang.Object r0 = r0.A01
            X.LMb r0 = (X.C64083LMb) r0
            android.content.Context r2 = r0.A00
            X.Kds r1 = (X.C62320Kds) r1
            int r1 = r1.A00
            java.lang.String r0 = "host_options_error"
            goto L_0x105f
        L_0x10c9:
            X.0eS.A00(r45)
            java.lang.Object r2 = r0.A00
            X.Ko5 r2 = (X.C62891Ko5) r2
            boolean r1 = r2 instanceof X.C62329Ke1
            if (r1 == 0) goto L_0x112d
            java.lang.Object r8 = r0.A04
            android.view.View r8 = (android.view.View) r8
            X.0nA.A0N(r8)
            X.37E r3 = X.AnonymousClass37D.A00
            java.lang.Object r10 = r0.A03
            X.4DH r10 = (X.AnonymousClass4DH) r10
            androidx.fragment.app.FragmentActivity r1 = r10.getActivity()
            X.DbX.A10(r1, r3)
            java.lang.Object r4 = r0.A01
            X.L7P r4 = (X.L7P) r4
            X.Iav r7 = r4.A01
            android.content.Context r6 = r4.A00
            r5 = r2
            X.Ke1 r5 = (X.C62329Ke1) r5
            int r0 = r5.A01
            r3 = 1
            com.instagram.user.model.User r12 = r5.A02
            java.lang.String r1 = X.DbY.A0b(r6, r12, r0)
            X.0qQ.A07(r1)
            android.widget.TextView r0 = r7.A04
            r0.setText(r1)
            int r0 = r5.A00
            java.lang.String r1 = X.DbY.A0b(r6, r12, r0)
            X.0qQ.A07(r1)
            android.widget.TextView r0 = r7.A07
            r0.setText(r1)
            r0 = 2131965186(0x7f133502, float:1.9567175E38)
            java.lang.String r1 = X.DbY.A0b(r6, r12, r0)
            X.0qQ.A07(r1)
            android.widget.TextView r0 = r7.A06
            r0.setText(r1)
            com.instagram.user.model.User r11 = r5.A03
            X.LZN r9 = new X.LZN
            r9.<init>(r3, r4, r2)
            r7.A00(r8, r9, r10, r11, r12)
            goto L_0x0069
        L_0x112d:
            boolean r1 = r2 instanceof X.C62328Ke0
            if (r1 == 0) goto L_0x0069
            java.lang.Object r0 = r0.A01
            X.L7P r0 = (X.L7P) r0
            android.content.Context r1 = r0.A00
            X.Ke0 r2 = (X.C62328Ke0) r2
            com.instagram.user.model.User r0 = r2.A00
            X.LKI.A01(r1, r0)
            goto L_0x0069
        L_0x1140:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.LFx r1 = (X.C63970LFx) r1
            X.KzI r1 = r1.A00
            boolean r1 = r1 instanceof X.C60333Jjc
            if (r1 == 0) goto L_0x0069
            X.I4Q r2 = X.I4Q.A00
            java.lang.Object r1 = r0.A01
            android.content.Context r3 = X.DbT.A08(r1)
            java.lang.Object r4 = r0.A04
            android.view.View r4 = (android.view.View) r4
            X.HOz r5 = X.C54694HOz.CLIPS
            r7 = 1
            java.lang.Object r1 = r0.A03
            r0 = 9
            X.Ivi r6 = new X.Ivi
            r6.<init>(r1, r0)
            r2.A02(r3, r4, r5, r6, r7)
            goto L_0x0069
        L_0x116a:
            X.0eS.A00(r45)
            java.lang.Object r4 = r0.A00
            boolean r1 = r4 instanceof com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewEffect.ScrollToNextPosition
            r2 = 300(0x12c, double:1.48E-321)
            if (r1 == 0) goto L_0x118d
            java.lang.Object r5 = r0.A04
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r4 = r0.A03
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            java.lang.Object r0 = r0.A01
            X.H0d r0 = (X.C54134H0d) r0
            X.M8H r1 = new X.M8H
            r1.<init>(r4, r0)
        L_0x1186:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r5.postDelayed(r1, r2)
            goto L_0x0069
        L_0x118d:
            boolean r1 = r4 instanceof com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewEffect.FeedbackComplete
            if (r1 == 0) goto L_0x1427
            java.lang.Object r5 = r0.A04
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r0 = r0.A01
            X.H0d r0 = (X.C54134H0d) r0
            X.M5S r1 = new X.M5S
            r1.<init>(r0)
            goto L_0x1186
        L_0x119f:
            X.0eS.A00(r45)
            java.lang.Object r4 = r0.A00
            boolean r1 = r4 instanceof X.C62008KVh
            java.lang.String r7 = "recyclerView"
            java.lang.String r6 = "inlineSearchBox"
            r3 = 8
            r2 = 0
            if (r1 == 0) goto L_0x11c6
            A00(r0, r2, r3)
            java.lang.Object r1 = r0.A01
            X.E4F r1 = (X.E4F) r1
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r1.A01
            if (r0 == 0) goto L_0x11f8
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A00
            if (r0 == 0) goto L_0x11e5
            r0.setVisibility(r3)
            goto L_0x0069
        L_0x11c6:
            boolean r1 = r4 instanceof X.C62007KVg
            if (r1 == 0) goto L_0x142c
            A00(r0, r3, r2)
            java.lang.Object r1 = r0.A01
            X.E4F r1 = (X.E4F) r1
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r1.A01
            if (r0 == 0) goto L_0x11f8
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A00
            if (r0 == 0) goto L_0x11e5
            r0.setVisibility(r2)
            X.Trf r0 = r1.A03
            if (r0 != 0) goto L_0x11e9
            java.lang.String r7 = "dataSource"
        L_0x11e5:
            X.0qQ.A0F(r7)
            goto L_0x1212
        L_0x11e9:
            r0.A04()
            X.UdQ r0 = r1.A02
            if (r0 != 0) goto L_0x11f3
            java.lang.String r7 = "adapter"
            goto L_0x11e5
        L_0x11f3:
            r0.A00()
            goto L_0x0069
        L_0x11f8:
            X.0qQ.A0F(r6)
            goto L_0x1212
        L_0x11fc:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r3 = r0.A04
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.Object r1 = r1.A01
            X.CDz r1 = (X.C43807CDz) r1
            X.3Sk r2 = r1.A00
            if (r2 != 0) goto L_0x1217
            X.C41845B3m.A0v()
        L_0x1212:
            X.00P r6 = X.AnonymousClass00P.createAndThrow()
            throw r6
        L_0x1217:
            X.4Cl r1 = r3.A03
            r1.Efl(r2)
            java.lang.Object r1 = r0.A01
            X.HDZ r1 = (X.HDZ) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            X.17i r1 = X.17h.A00(r1)
            r1.A03(r3)
            java.lang.Object r0 = r0.A03
            X.L98 r0 = (X.L98) r0
            if (r0 == 0) goto L_0x0069
            X.LqT r2 = r0.A01
            android.app.Activity r1 = r0.A00
            com.instagram.user.model.User r3 = r0.A02
            java.lang.String r4 = r0.A03
            boolean r5 = r0.A04
            X.Fvf r0 = new X.Fvf
            r0.<init>(r1, r2, r3, r4, r5)
            X.11Z.A02(r0)
            goto L_0x0069
        L_0x1243:
            X.0eS.A00(r45)
            java.lang.String r0 = "getState"
            java.lang.NullPointerException r6 = X.AnonymousClass7TE.A11(r0)
            throw r6
        L_0x124d:
            X.0eS.A00(r45)
            X.14G r4 = X.14G.A03()
            java.lang.Object r3 = r0.A00
            X.2hY r3 = (X.AnonymousClass2hY) r3
            java.lang.Object r2 = r0.A04
            X.1QU r2 = (X.1QU) r2
            java.lang.Object r1 = r0.A01
            X.0lg r1 = (X.0lg) r1
            X.47Y r1 = r4.A08(r2, r3, r1)
            X.1Qb r1 = r1.A02
            java.io.InputStream r2 = r1.AjD()
            java.lang.Object r0 = r0.A03
            java.io.File r0 = (java.io.File) r0
            boolean r0 = X.0mb.A09(r0, r2)     // Catch:{ all -> 0x127a }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x127a }
            r2.close()
            return r1
        L_0x127a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x127c }
        L_0x127c:
            r6 = move-exception
            X.1zE.A00(r2, r0)
            throw r6
        L_0x1281:
            X.0eS.A00(r45)
            java.lang.Object r2 = r0.A00
            X.4Cq r2 = (X.C262224Cq) r2
            r4 = 0
            java.lang.Object r5 = r0.A01
            java.lang.Object r6 = r0.A04
            java.lang.Object r7 = r0.A03
            r8 = 47
            X.MHG r3 = new X.MHG
            r3.<init>((X.AnonymousClass4D7) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (int) r8)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Er r1 = X.1Eo.A03(r0, r1, r3, r2)
            return r1
        L_0x129f:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.4Cq r1 = (X.C262224Cq) r1
            r6 = 0
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A04
            r7 = 43
            goto L_0x12c0
        L_0x12b0:
            X.0eS.A00(r45)
            java.lang.Object r1 = r0.A00
            X.4Cq r1 = (X.C262224Cq) r1
            r6 = 0
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A04
            r7 = 44
        L_0x12c0:
            X.MHK r2 = new X.MHK
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r7)
            X.2Q8 r1 = X.JTO.A1E(r2, r1)
            return r1
        L_0x12ca:
            X.0eS.A00(r45)
            java.lang.Object r5 = r0.A00
            X.KmV r5 = (X.C62793KmV) r5
            boolean r1 = r5 instanceof X.KQ2
            r10 = 1
            if (r1 == 0) goto L_0x136c
            java.lang.Object r2 = r0.A04
            X.0rk r2 = (X.0rk) r2
            int r1 = r2.A00
            if (r1 == r10) goto L_0x12e0
            r2.A00 = r10
        L_0x12e0:
            r4 = r5
            X.KQ2 r4 = (X.KQ2) r4
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$Sections r1 = r4.A00
            java.lang.String r2 = r1.A0E()
            java.lang.String r1 = "trending_audio"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x1340
            java.lang.Object r2 = r0.A03
            X.0rm r2 = (X.0rm) r2
            X.EZw r1 = X.C48154EZw.TRENDING
        L_0x12f7:
            java.lang.String r1 = r1.A00
            r2.A00 = r1
        L_0x12fb:
            java.lang.Object r1 = r0.A03
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r2 = r1.A00
            if (r2 == 0) goto L_0x130c
            java.lang.Object r1 = r0.A01
            X.HJG r1 = (X.HJG) r1
            java.util.ArrayList r1 = r1.A00
            r1.add(r2)
        L_0x130c:
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$Sections r3 = r4.A00
            r2 = 4
            r1 = 4114(0x1012, float:5.765E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r4 = r3.getRequiredStringField(r2, r1)
            X.DbS.A1Y(r4)
            java.lang.Object r3 = r0.A01
            X.8gI r3 = (X.C361478gI) r3
            android.app.Application r0 = r3.A0D()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131957063(0x7f131547, float:1.95507E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r1, r0)
            r1 = 23
            X.LY2 r0 = new X.LY2
            r0.<init>(r1, r5, r3)
            X.Uq5 r1 = new X.Uq5
            r1.<init>(r4, r2, r0)
            return r1
        L_0x1340:
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$Sections r3 = r4.A00
            java.lang.String r2 = r3.A0E()
            java.lang.String r1 = "popular_with_your_followers_audios"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x1355
            java.lang.Object r2 = r0.A03
            X.0rm r2 = (X.0rm) r2
            X.EZw r1 = X.C48154EZw.POPULAR
            goto L_0x12f7
        L_0x1355:
            java.lang.String r2 = r3.A0E()
            r1 = 383(0x17f, float:5.37E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x12fb
            java.lang.Object r2 = r0.A03
            X.0rm r2 = (X.0rm) r2
            X.EZw r1 = X.C48154EZw.TRENDING_WITH_SIMILAR_ACCOUNTS
            goto L_0x12f7
        L_0x136c:
            boolean r1 = r5 instanceof X.KQ1
            if (r1 == 0) goto L_0x13db
            X.KQ1 r5 = (X.KQ1) r5
            com.instagram.creator.inspiration.repository.graphql.AudioFragmentImpl r4 = r5.A00
            java.lang.Class<com.instagram.creator.inspiration.repository.graphql.AudioFragmentImpl$Metadata> r3 = com.instagram.creator.inspiration.repository.graphql.AudioFragmentImpl.Metadata.class
            X.3sh r1 = X.C250663lr.Companion
            r2 = 1483975643(0x5873abdb, float:1.07167776E15)
            java.lang.String r1 = "metadata"
            X.3lr r3 = r4.A04(r3, r1, r2)
            if (r3 == 0) goto L_0x13d9
            r2 = 0
            java.lang.String r1 = "is_bookmarked"
            boolean r1 = r3.getRequiredBooleanField(r2, r1)
            if (r1 != r10) goto L_0x13d9
        L_0x138c:
            java.lang.Object r6 = r0.A01
            X.HJG r6 = (X.HJG) r6
            com.instagram.creator.inspiration.repository.graphql.AudioFragmentImpl r2 = r5.A00
            com.instagram.common.session.UserSession r1 = r6.A02
            X.1E5 r3 = X.1E4.A00(r1)
            r5 = 0
            X.0qQ.A0B(r3, r5)
            java.lang.Class<com.instagram.api.schemas.ImmutablePandoTrackOrOriginalSoundSchema> r1 = com.instagram.api.schemas.ImmutablePandoTrackOrOriginalSoundSchema.class
            com.facebook.pando.TreeJNI r4 = r2.reinterpret(r1)
            com.instagram.api.schemas.ImmutablePandoTrackOrOriginalSoundSchema r4 = (com.instagram.api.schemas.ImmutablePandoTrackOrOriginalSoundSchema) r4
            r2 = 6
            X.1E9 r1 = new X.1E9
            r1.<init>(r3, r2, r5)
            r4.E9T(r1)
            java.lang.Object r3 = r0.A04
            X.0rk r3 = (X.0rk) r3
            int r2 = r3.A00
            int r1 = r2 + 1
            r3.A00 = r1
            java.lang.Integer r1 = X.JTO.A0w(r2)
            java.lang.Object r0 = r0.A03
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            X.Uq6 r1 = r6.A0E(r4, r1, r0, r5)
            java.lang.String r7 = r1.A07
            X.6oS r0 = X.JTP.A0J(r6, r7, r5)
            r8 = 0
            r9 = 21
            X.MEW r5 = new X.MEW
            r5.<init>(r6, r7, r8, r9, r10)
            X.AnonymousClass7TE.A1Z(r5, r0)
            return r1
        L_0x13d9:
            r10 = 0
            goto L_0x138c
        L_0x13db:
            X.Wub r6 = X.AnonymousClass7TE.A1K()
            throw r6
        L_0x13e0:
            java.lang.IllegalStateException r6 = X.AnonymousClass7TE.A0z(r8)
            throw r6
        L_0x13e5:
            java.lang.IllegalStateException r6 = X.AnonymousClass7TE.A0z(r8)
            throw r6
        L_0x13ea:
            java.lang.IllegalStateException r6 = X.AnonymousClass7TE.A0z(r8)
            throw r6
        L_0x13ef:
            java.lang.IllegalStateException r6 = X.AnonymousClass7TE.A0y()
            throw r6
        L_0x13f4:
            X.Wub r6 = X.AnonymousClass7TE.A1K()
            throw r6
        L_0x13f9:
            X.Wub r6 = X.AnonymousClass7TE.A1K()
            throw r6
        L_0x13fe:
            r6 = move-exception
        L_0x13ff:
            if (r4 >= r3) goto L_0x1407
            r5.lock()
            int r4 = r4 + 1
            goto L_0x13ff
        L_0x1407:
            r2.unlock()
            throw r6
        L_0x140b:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L_0x140e:
            java.lang.IllegalArgumentException r6 = X.DbU.A0h()
            throw r6
        L_0x1413:
            X.Wub r6 = X.AnonymousClass7TE.A1K()
            throw r6
        L_0x1418:
            X.Wub r6 = X.AnonymousClass7TE.A1K()
            throw r6
        L_0x141d:
            X.Wub r6 = X.AnonymousClass7TE.A1K()
            throw r6
        L_0x1422:
            java.lang.IllegalStateException r6 = X.AnonymousClass7TE.A0y()
            throw r6
        L_0x1427:
            X.Wub r6 = X.AnonymousClass7TE.A1K()
            throw r6
        L_0x142c:
            X.Wub r6 = X.AnonymousClass7TE.A1K()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66172MGj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66172MGj(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A02 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A00 = obj4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66172MGj(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i, int i2) {
        super(2, r5);
        this.A02 = i;
        this.A03 = obj;
        this.A04 = obj2;
        this.A00 = obj3;
    }
}
