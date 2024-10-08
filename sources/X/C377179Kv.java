package X;

/* renamed from: X.9Kv  reason: invalid class name and case insensitive filesystem */
public final class C377179Kv extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377179Kv(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v86, types: [X.3j2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v88, types: [X.3j2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v90, types: [X.3j2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v92, types: [X.3j2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v28, types: [java.lang.Object, X.3Zt] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0417, code lost:
        if (r5.getReturnType().equals(X.AnonymousClass2YU.A00(new X.0Yh(r2))) != false) goto L_0x0419;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0419, code lost:
        r0 = java.lang.reflect.Modifier.isPublic(r5.getModifiers());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0421, code lost:
        if (r0 == false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0423, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0428, code lost:
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x046c, code lost:
        return r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02a7, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0429;
                case 1: goto L_0x0397;
                case 2: goto L_0x033e;
                case 3: goto L_0x02fe;
                case 4: goto L_0x02f4;
                case 5: goto L_0x02c1;
                case 6: goto L_0x02b1;
                case 7: goto L_0x02a8;
                case 8: goto L_0x029c;
                case 9: goto L_0x0292;
                case 10: goto L_0x046d;
                case 11: goto L_0x028a;
                case 12: goto L_0x0275;
                case 13: goto L_0x0260;
                case 14: goto L_0x024b;
                case 15: goto L_0x0236;
                case 16: goto L_0x0226;
                case 17: goto L_0x0216;
                case 18: goto L_0x0462;
                case 19: goto L_0x020a;
                case 20: goto L_0x045d;
                case 21: goto L_0x0455;
                case 22: goto L_0x01ff;
                case 23: goto L_0x01f5;
                case 24: goto L_0x01ec;
                case 25: goto L_0x01e3;
                case 26: goto L_0x01c9;
                case 27: goto L_0x01bc;
                case 28: goto L_0x01af;
                case 29: goto L_0x01bc;
                case 30: goto L_0x01af;
                case 31: goto L_0x018e;
                case 32: goto L_0x0177;
                case 33: goto L_0x016d;
                case 34: goto L_0x0163;
                case 35: goto L_0x000f;
                case 36: goto L_0x0142;
                case 37: goto L_0x0138;
                case 38: goto L_0x0005;
                case 39: goto L_0x00ff;
                case 40: goto L_0x00ee;
                case 41: goto L_0x00dc;
                case 42: goto L_0x00ce;
                case 43: goto L_0x00a0;
                case 44: goto L_0x0092;
                case 45: goto L_0x006f;
                case 46: goto L_0x0061;
                case 47: goto L_0x004b;
                case 48: goto L_0x0005;
                case 49: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3zY r2 = new X.3zY
            r2.<init>(r0)
        L_0x000e:
            return r2
        L_0x000f:
            X.401 r6 = com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase.A00
            java.lang.Object r0 = r7.A01
            X.3zc r0 = (X.C258773zc) r0
            com.instagram.common.session.UserSession r5 = r0.A01
            java.lang.Class<com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase> r4 = com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase.class
            java.lang.Object r2 = r5.A00(r4)
            if (r2 != 0) goto L_0x000e
            monitor-enter(r6)
            goto L_0x0470
        L_0x0022:
            java.lang.Object r2 = r7.A01
            X.951 r2 = (X.AnonymousClass951) r2
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase r0 = (com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase) r0
            X.402 r3 = r0.A00()
            X.0eM r0 = r2.A00
            java.lang.Object r1 = r0.getValue()
            X.3zZ r1 = (X.C258743zZ) r1
            X.0eM r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            X.0JP r0 = (X.AnonymousClass0JP) r0
            X.403 r2 = new X.403
            r2.<init>(r0, r3, r1)
            return r2
        L_0x004b:
            java.lang.Object r2 = r7.A01
            X.3zj r2 = (X.C258843zj) r2
            X.0eM r0 = r2.A03
            java.lang.Object r1 = r0.getValue()
            X.0xa r1 = (X.0xa) r1
            X.0JP r0 = r2.A00()
            X.3zx r2 = new X.3zx
            r2.<init>(r0, r1)
            return r2
        L_0x0061:
            java.lang.Object r1 = r7.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.3zu r0 = X.AnonymousClass4Ix.A00(r1)
            X.3zv r2 = new X.3zv
            r2.<init>(r1, r0)
            return r2
        L_0x006f:
            X.1L7 r1 = X.1L7.A01()
            X.0qQ.A07(r1)
            X.3zl r0 = new X.3zl
            r0.<init>(r1)
            X.2jB r0 = r0.A00()
            X.3zm r1 = new X.3zm
            r1.<init>(r0)
            java.lang.Object r0 = r7.A01
            X.3zj r0 = (X.C258843zj) r0
            X.0JP r0 = r0.A00()
            X.3zp r2 = new X.3zp
            r2.<init>(r0, r1)
            return r2
        L_0x0092:
            X.02m r1 = X.02m.A0p
            X.0qQ.A07(r1)
            r0 = 424086240(0x19470ae0, float:1.0290255E-23)
            X.3zy r2 = new X.3zy
            r2.<init>(r1, r0)
            return r2
        L_0x00a0:
            java.lang.Object r4 = r7.A01
            X.3zj r4 = (X.C258843zj) r4
            X.0eM r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            X.3zY r0 = (X.C258733zY) r0
            X.0gq r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x00c5
            r0 = 36317779600479759(0x8106d4001e160f, double:3.030848287079259E-306)
            boolean r0 = r3.Agw(r0)
            if (r0 != r2) goto L_0x00c5
        L_0x00bc:
            if (r2 == 0) goto L_0x00c7
            X.0eM r0 = r4.A04
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x00c5:
            r2 = 0
            goto L_0x00bc
        L_0x00c7:
            X.0eM r0 = r4.A02
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x00ce:
            java.lang.Object r0 = r7.A01
            X.3zj r0 = (X.C258843zj) r0
            X.0JP r0 = r0.A00()
            X.3zw r2 = new X.3zw
            r2.<init>(r0)
            return r2
        L_0x00dc:
            java.lang.Object r0 = r7.A01
            X.3zj r0 = (X.C258843zj) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.3zt r0 = (X.C258943zt) r0
            X.400 r2 = new X.400
            r2.<init>(r0)
            return r2
        L_0x00ee:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A24
            java.lang.Class<X.3zx> r0 = X.C258983zx.class
            X.0xa r2 = r2.A04(r1, r0)
            return r2
        L_0x00ff:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r1 = r7.A01
            X.3zj r1 = (X.C258843zj) r1
            X.0eM r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            r3.add(r0)
            X.0eM r0 = r1.A05
            java.lang.Object r0 = r0.getValue()
            r3.add(r0)
            X.0eM r0 = r1.A0A
            java.lang.Object r0 = r0.getValue()
            r3.add(r0)
            X.3zs r0 = r1.A00
            r3.add(r0)
            X.0eM r0 = r1.A07
            java.lang.Object r1 = r0.getValue()
            X.3zy r1 = (X.C258993zy) r1
            java.lang.String r0 = "All"
            X.3zz r2 = new X.3zz
            r2.<init>(r1, r0, r3)
            return r2
        L_0x0138:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.94x r2 = new X.94x
            r2.<init>(r0)
            return r2
        L_0x0142:
            X.1L7 r1 = X.1L7.A01()
            X.0qQ.A07(r1)
            X.3zl r0 = new X.3zl
            r0.<init>(r1)
            X.2jB r0 = r0.A00()
            X.3zm r1 = new X.3zm
            r1.<init>(r0)
            java.lang.Object r0 = r7.A01
            X.3zc r0 = (X.C258773zc) r0
            X.0JP r0 = r0.A00
            X.3zp r2 = new X.3zp
            r2.<init>(r0, r1)
            return r2
        L_0x0163:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3zc r2 = new X.3zc
            r2.<init>(r0)
            return r2
        L_0x016d:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.94d r2 = new X.94d
            r2.<init>(r0)
            return r2
        L_0x0177:
            X.183 r2 = X.183.A01
            if (r2 == 0) goto L_0x02f2
            java.lang.Object r1 = r7.A01
            X.94M r1 = (X.AnonymousClass94M) r1
            X.94M r0 = X.AnonymousClass94M.$redex_init_class
            com.instagram.common.session.UserSession r0 = r1.A01
            X.1AV r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x02f2
            X.1AU r0 = r0.A01
            X.1AA r2 = r0.A00
            return r2
        L_0x018e:
            X.1L7 r1 = X.1L7.A01()
            X.0qQ.A07(r1)
            X.3zl r0 = new X.3zl
            r0.<init>(r1)
            X.2jB r0 = r0.A00()
            X.3zm r1 = new X.3zm
            r1.<init>(r0)
            java.lang.Object r0 = r7.A01
            X.94V r0 = (X.AnonymousClass94V) r0
            X.0JP r0 = r0.A00
            X.3zp r2 = new X.3zp
            r2.<init>(r0, r1)
            return r2
        L_0x01af:
            java.lang.Object r0 = r7.A01
            X.45c r0 = (X.C2603045c) r0
            X.3m2 r0 = r0.A0C
            if (r0 == 0) goto L_0x02a5
            r0.onNetworkUnavailable()
            goto L_0x02a5
        L_0x01bc:
            java.lang.Object r0 = r7.A01
            X.45c r0 = (X.C2603045c) r0
            X.3m2 r0 = r0.A0C
            if (r0 == 0) goto L_0x02a5
            r0.onNetworkAvailable()
            goto L_0x02a5
        L_0x01c9:
            java.lang.Object r2 = r7.A01
            X.45c r2 = (X.C2603045c) r2
            X.44t r0 = r2.A05
            r0.A01()
            X.44u r0 = r2.A06
            r0.A00()
            X.3m2 r1 = r2.A0C
            r0 = 0
            r2.A0C = r0
            if (r1 == 0) goto L_0x02a5
            r1.stop()
            goto L_0x02a5
        L_0x01e3:
            java.lang.Object r0 = r7.A01
            X.3sD r0 = (X.C254273sD) r0
            X.3s9 r2 = r0.B3G()
            return r2
        L_0x01ec:
            java.lang.Object r0 = r7.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r2 = r0.invoke()
            return r2
        L_0x01f5:
            java.lang.Object r1 = r7.A01
            r0 = 23
            X.TY5 r2 = new X.TY5
            r2.<init>(r1, r0)
            return r2
        L_0x01ff:
            java.lang.Object r1 = r7.A01
            X.2Wa r1 = (X.2Wa) r1
            X.Ayd r0 = X.C41686Ayd.A00
            r1.A03(r0)
            goto L_0x02a5
        L_0x020a:
            java.lang.Object r1 = r7.A01
            X.2Wa r1 = (X.2Wa) r1
            X.19B r0 = X.19B.A00
            X.3g3 r2 = new X.3g3
            r2.<init>(r1, r0)
            return r2
        L_0x0216:
            java.lang.Object r0 = r7.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r0 = r0.invoke()
            X.3Zt r2 = new X.3Zt
            r2.<init>()
            r2.A00 = r0
            return r2
        L_0x0226:
            java.lang.String r1 = "onEvent: "
            java.lang.Object r0 = r7.A01
            X.3al r0 = (X.C244173al) r0
            java.lang.String r0 = r0.A00
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.1KZ.A01(r0)
            goto L_0x02a5
        L_0x0236:
            java.lang.Object r1 = r7.A01
            X.0eL r1 = (X.AnonymousClass0eL) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.3j2 r0 = new X.3j2
            r0.<init>()
            r0.A00 = r1
            X.9OP r2 = new X.9OP
            r2.<init>(r0)
            return r2
        L_0x024b:
            java.lang.Object r1 = r7.A01
            X.0eL r1 = (X.AnonymousClass0eL) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.3j2 r0 = new X.3j2
            r0.<init>()
            r0.A00 = r1
            X.Aub r2 = new X.Aub
            r2.<init>(r0)
            return r2
        L_0x0260:
            java.lang.Object r1 = r7.A01
            X.0eL r1 = (X.AnonymousClass0eL) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.3j2 r0 = new X.3j2
            r0.<init>()
            r0.A00 = r1
            X.3j5 r2 = new X.3j5
            r2.<init>(r0)
            return r2
        L_0x0275:
            java.lang.Object r1 = r7.A01
            X.0eL r1 = (X.AnonymousClass0eL) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.3j2 r0 = new X.3j2
            r0.<init>()
            r0.A00 = r1
            X.9OD r2 = new X.9OD
            r2.<init>(r0)
            return r2
        L_0x028a:
            java.lang.Object r0 = r7.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.invalidateSelf()
            goto L_0x02a5
        L_0x0292:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.9EX r2 = new X.9EX
            r2.<init>(r0)
            return r2
        L_0x029c:
            java.lang.Object r0 = r7.A01
            X.1Vy r0 = (X.1Vy) r0
            X.1Vz r0 = r0.A05
            r0.evictAll()
        L_0x02a5:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x02a8:
            java.lang.Object r0 = r7.A01
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.IgTextureLoader r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.IgTextureLoader) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.TextureLoaderWeakPtr r2 = r0.createTextureLoaderNative()
            return r2
        L_0x02b1:
            java.lang.Object r0 = r7.A01
            X.500 r0 = (X.AnonymousClass500) r0
            X.2TF r0 = r0.A02
            long r0 = r0.A02()
            X.A4f r2 = new X.A4f
            r2.<init>(r0)
            return r2
        L_0x02c1:
            java.lang.Object r0 = r7.A01
            X.4tf r0 = (X.C276644tf) r0
            X.4tP r4 = r0.A00
            if (r4 == 0) goto L_0x02f2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = r4
        L_0x02cf:
            java.util.List r1 = r2.A03
            r0 = 0
            r3.addAll(r0, r1)
            X.4tP r2 = r2.A02
            if (r2 != 0) goto L_0x02cf
            r0 = r4
        L_0x02da:
            java.lang.String r1 = r0.A01
            if (r1 != 0) goto L_0x02e3
            X.4tP r0 = r0.A02
            if (r0 != 0) goto L_0x02da
            r1 = 0
        L_0x02e3:
            java.lang.String r0 = r4.A00
            if (r0 != 0) goto L_0x02ec
            X.4tP r4 = r4.A02
            if (r4 != 0) goto L_0x02e3
            r0 = 0
        L_0x02ec:
            X.A5s r2 = new X.A5s
            r2.<init>(r1, r0, r3)
            return r2
        L_0x02f2:
            r2 = 0
            return r2
        L_0x02f4:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader r2 = new com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader
            r2.<init>(r0)
            return r2
        L_0x02fe:
            java.lang.Object r4 = r7.A01
            X.4Vj r4 = (X.C265594Vj) r4
            X.4Vk r0 = r4.A00
            java.lang.ClassLoader r1 = r0.A00
            java.lang.String r0 = "androidx.window.extensions.WindowExtensions"
            java.lang.Class r2 = r1.loadClass(r0)
            X.0qQ.A07(r2)
            r3 = 0
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.String r0 = "getWindowLayoutComponent"
            java.lang.reflect.Method r2 = r2.getMethod(r0, r1)
            java.lang.ClassLoader r1 = r4.A02
            r0 = 188(0xbc, float:2.63E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.Class r1 = r1.loadClass(r0)
            X.0qQ.A07(r1)
            X.0qQ.A07(r2)
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x0424
            java.lang.Class r0 = r2.getReturnType()
            boolean r0 = r0.equals(r1)
            goto L_0x0421
        L_0x033e:
            java.lang.Object r2 = r7.A01
            X.4Vj r2 = (X.C265594Vj) r2
            X.4Vi r0 = r2.A01
            java.lang.ClassLoader r1 = r0.A00     // Catch:{ ClassNotFoundException -> 0x0354 }
            r0 = 3476(0xd94, float:4.871E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ ClassNotFoundException -> 0x0354 }
            java.lang.Class r5 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0354 }
            X.0qQ.A07(r5)     // Catch:{ ClassNotFoundException -> 0x0354 }
            goto L_0x0355
        L_0x0354:
            r5 = 0
        L_0x0355:
            r3 = 0
            if (r5 == 0) goto L_0x0424
            java.lang.ClassLoader r1 = r2.A02
            r0 = 188(0xbc, float:2.63E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.Class r4 = r1.loadClass(r0)
            X.0qQ.A07(r4)
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Class[] r1 = new java.lang.Class[]{r0, r5}
            r0 = 625(0x271, float:8.76E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.reflect.Method r2 = r4.getMethod(r0, r1)
            java.lang.Class[] r1 = new java.lang.Class[]{r5}
            r0 = 852(0x354, float:1.194E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.reflect.Method r5 = r4.getMethod(r0, r1)
            X.0qQ.A07(r2)
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x0424
            X.0qQ.A07(r5)
            goto L_0x0419
        L_0x0397:
            java.lang.Object r0 = r7.A01
            X.4Vj r0 = (X.C265594Vj) r0
            java.lang.ClassLoader r1 = r0.A02
            java.lang.String r0 = "androidx.window.extensions.layout.FoldingFeature"
            java.lang.Class r5 = r1.loadClass(r0)
            X.0qQ.A07(r5)
            r3 = 0
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.String r0 = "getBounds"
            java.lang.reflect.Method r2 = r5.getMethod(r0, r1)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.String r0 = "getType"
            java.lang.reflect.Method r4 = r5.getMethod(r0, r1)
            java.lang.Class[] r1 = new java.lang.Class[r3]
            java.lang.String r0 = "getState"
            java.lang.reflect.Method r5 = r5.getMethod(r0, r1)
            X.0qQ.A07(r2)
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            X.0Yh r0 = new X.0Yh
            r0.<init>(r1)
            java.lang.Class r1 = X.AnonymousClass2YU.A00(r0)
            java.lang.Class r0 = r2.getReturnType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0424
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x0424
            X.0qQ.A07(r4)
            java.lang.Class r2 = java.lang.Integer.TYPE
            X.0Yh r0 = new X.0Yh
            r0.<init>(r2)
            java.lang.Class r1 = X.AnonymousClass2YU.A00(r0)
            java.lang.Class r0 = r4.getReturnType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0424
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x0424
            X.0qQ.A07(r5)
            X.0Yh r0 = new X.0Yh
            r0.<init>(r2)
            java.lang.Class r1 = X.AnonymousClass2YU.A00(r0)
            java.lang.Class r0 = r5.getReturnType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0424
        L_0x0419:
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
        L_0x0421:
            if (r0 == 0) goto L_0x0424
            r3 = 1
        L_0x0424:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            return r2
        L_0x0429:
            java.lang.Object r4 = r7.A01
            X.5J2 r4 = (X.AnonymousClass5J2) r4
            int r0 = r4.A00
            long r0 = (long) r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            r3 = 32
            java.math.BigInteger r2 = r0.shiftLeft(r3)
            int r0 = r4.A01
            long r0 = (long) r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r0 = r2.or(r0)
            java.math.BigInteger r2 = r0.shiftLeft(r3)
            int r0 = r4.A02
            long r0 = (long) r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r2 = r2.or(r0)
            return r2
        L_0x0455:
            java.lang.Object r0 = r7.A01
            X.2V5 r2 = new X.2V5
            r2.<init>(r0)
            return r2
        L_0x045d:
            java.lang.Object r0 = r7.A01
            X.0sa r0 = (X.C62320sa) r0
            goto L_0x0468
        L_0x0462:
            java.lang.Object r0 = r7.A01
            X.3XS r0 = (X.AnonymousClass3XS) r0
            X.0sa r0 = r0.A00
        L_0x0468:
            java.lang.Object r2 = r0.invoke()
            return r2
        L_0x046d:
            java.lang.Object r2 = r7.A01
            return r2
        L_0x0470:
            java.lang.Object r2 = r5.A00(r4)     // Catch:{ all -> 0x049d }
            com.instagram.roomdb.IgRoomDatabase r2 = (com.instagram.roomdb.IgRoomDatabase) r2     // Catch:{ all -> 0x049d }
            if (r2 != 0) goto L_0x049b
            android.content.Context r1 = X.C60960kU.A00     // Catch:{ all -> 0x049d }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x049d }
            java.lang.String r0 = X.1V8.A00(r5, r6)     // Catch:{ all -> 0x049d }
            X.1VA r3 = X.1V9.A00(r1, r4, r0)     // Catch:{ all -> 0x049d }
            r2 = 1809011763(0x6bd35433, float:5.1096194E26)
            r1 = 1567390029(0x5d6c794d, float:1.06498346E18)
            r0 = 0
            X.1VC.A00(r3, r2, r1, r0)     // Catch:{ all -> 0x049d }
            r3.A01()     // Catch:{ all -> 0x049d }
            X.3oI r2 = r3.A00()     // Catch:{ all -> 0x049d }
            com.instagram.roomdb.IgRoomDatabase r2 = (com.instagram.roomdb.IgRoomDatabase) r2     // Catch:{ all -> 0x049d }
            r5.A04(r4, r2)     // Catch:{ all -> 0x049d }
        L_0x049b:
            monitor-exit(r6)
            return r2
        L_0x049d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377179Kv.invoke():java.lang.Object");
    }
}
