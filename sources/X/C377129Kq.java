package X;

/* renamed from: X.9Kq  reason: invalid class name and case insensitive filesystem */
public final class C377129Kq extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377129Kq(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v79, resolved type: X.3bz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v80, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v82, resolved type: com.instagram.roomdb.IgRoomDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v83, resolved type: com.instagram.roomdb.IgRoomDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v86, resolved type: com.instagram.roomdb.IgRoomDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v87, resolved type: com.instagram.roomdb.IgRoomDatabase} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03e5, code lost:
        if (((java.lang.Boolean) r1.A03.getValue()).booleanValue() != false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0411, code lost:
        r2 = r0.contains(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0419, code lost:
        return java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0450, code lost:
        if (r1 == false) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x045d, code lost:
        r7 = r5.A06.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a2, code lost:
        r2 = r5.A06.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
        if (r3 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05a0, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05a1, code lost:
        return r3;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0050;
                case 3: goto L_0x0072;
                case 4: goto L_0x00da;
                case 5: goto L_0x00e6;
                case 6: goto L_0x0127;
                case 7: goto L_0x0132;
                case 8: goto L_0x013d;
                case 9: goto L_0x0149;
                case 10: goto L_0x0167;
                case 11: goto L_0x017d;
                case 12: goto L_0x0189;
                case 13: goto L_0x019a;
                case 14: goto L_0x01a4;
                case 15: goto L_0x01b5;
                case 16: goto L_0x01c7;
                case 17: goto L_0x01e0;
                case 18: goto L_0x01f9;
                case 19: goto L_0x01a4;
                case 20: goto L_0x0238;
                case 21: goto L_0x0287;
                case 22: goto L_0x0291;
                case 23: goto L_0x02ba;
                case 24: goto L_0x0005;
                case 25: goto L_0x02c4;
                case 26: goto L_0x0041;
                case 27: goto L_0x02ce;
                case 28: goto L_0x02da;
                case 29: goto L_0x02f1;
                case 30: goto L_0x030e;
                case 31: goto L_0x0319;
                case 32: goto L_0x032a;
                case 33: goto L_0x0335;
                case 34: goto L_0x0345;
                case 35: goto L_0x0390;
                case 36: goto L_0x03a1;
                case 37: goto L_0x03c6;
                case 38: goto L_0x03ed;
                case 39: goto L_0x041a;
                case 40: goto L_0x0427;
                case 41: goto L_0x0437;
                case 42: goto L_0x0534;
                case 43: goto L_0x053e;
                case 44: goto L_0x0548;
                case 45: goto L_0x0568;
                case 46: goto L_0x0588;
                case 47: goto L_0x05aa;
                case 48: goto L_0x05b3;
                case 49: goto L_0x05bd;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.401 r6 = com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase.A00
            java.lang.Object r5 = r13.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Class<com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase> r4 = com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase.class
            java.lang.Object r3 = r5.A00(r4)
            if (r3 != 0) goto L_0x05a1
            monitor-enter(r6)
            java.lang.Object r3 = r5.A00(r4)     // Catch:{ all -> 0x0235 }
            com.instagram.roomdb.IgRoomDatabase r3 = (com.instagram.roomdb.IgRoomDatabase) r3     // Catch:{ all -> 0x0235 }
            if (r3 != 0) goto L_0x05a0
            android.content.Context r1 = X.C60960kU.A00     // Catch:{ all -> 0x0235 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0235 }
            java.lang.String r0 = X.1V8.A00(r5, r6)     // Catch:{ all -> 0x0235 }
            X.1VA r3 = X.1V9.A00(r1, r4, r0)     // Catch:{ all -> 0x0235 }
            r2 = 1809011763(0x6bd35433, float:5.1096194E26)
            r1 = 1567390029(0x5d6c794d, float:1.06498346E18)
            r0 = 0
            X.1VC.A00(r3, r2, r1, r0)     // Catch:{ all -> 0x0235 }
            r3.A01()     // Catch:{ all -> 0x0235 }
            X.3oI r3 = r3.A00()     // Catch:{ all -> 0x0235 }
            com.instagram.roomdb.IgRoomDatabase r3 = (com.instagram.roomdb.IgRoomDatabase) r3     // Catch:{ all -> 0x0235 }
            r5.A04(r4, r3)     // Catch:{ all -> 0x0235 }
            goto L_0x05a0
        L_0x0041:
            X.02m r3 = X.02m.A0p
            return r3
        L_0x0044:
            java.lang.Object r0 = r13.A01
            X.3zX r0 = (X.C258723zX) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.3zY r3 = new X.3zY
            r3.<init>(r0)
            return r3
        L_0x0050:
            java.lang.Object r0 = r13.A01
            X.3zf r0 = (X.C258803zf) r0
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0eM r0 = r0.A02
            java.lang.Object r3 = r0.getValue()
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Class<X.ADv> r2 = X.C39893ADv.class
            r1 = 41
            X.TTN r0 = new X.TTN
            r0.<init>(r3, r1)
            java.lang.Object r3 = r4.A01(r2, r0)
            return r3
        L_0x0072:
            java.lang.Object r2 = r13.A01
            X.3zf r2 = (X.C258803zf) r2
            X.0eM r1 = r2.A02
            java.lang.Object r0 = r1.getValue()
            X.3zY r0 = (X.C258733zY) r0
            boolean r0 = r0.Bux()
            if (r0 == 0) goto L_0x009e
            X.0eM r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            X.ADv r0 = (X.C39893ADv) r0
            X.40G r1 = r0.A01()
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0098
            java.lang.Object r3 = r1.A00
            if (r3 != 0) goto L_0x05a1
        L_0x0098:
            com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams r3 = new com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams
            r3.<init>()
            return r3
        L_0x009e:
            java.lang.Object r0 = r1.getValue()
            X.3zY r0 = (X.C258733zY) r0
            long r4 = r0.BTh()
            r2 = 11
            r1 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
            java.util.List r6 = X.C39632A2w.A02
            int[] r10 = X.C39632A2w.A05
            float[] r7 = X.C39632A2w.A03
            float[] r8 = new float[r1]
            float[] r9 = X.C39632A2w.A04
            com.facebook.odin.model.Matrix[] r11 = X.C39632A2w.A06
            float[][] r12 = X.C39632A2w.A07
            com.facebook.odin.model.Matrix r4 = X.C39632A2w.A00
            com.facebook.odin.model.Matrix r5 = X.C39632A2w.A01
        L_0x00c1:
            X.410 r3 = new X.410
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        L_0x00c7:
            java.util.List r6 = X.C2591840s.A02
            int[] r10 = X.C2591840s.A05
            float[] r7 = X.C2591840s.A03
            float[] r8 = new float[r1]
            float[] r9 = X.C2591840s.A04
            com.facebook.odin.model.Matrix[] r11 = X.C2591840s.A06
            float[][] r12 = X.C2591840s.A07
            com.facebook.odin.model.Matrix r4 = X.C2591840s.A00
            com.facebook.odin.model.Matrix r5 = X.C2591840s.A01
            goto L_0x00c1
        L_0x00da:
            java.lang.Object r0 = r13.A01
            X.3zf r0 = (X.C258803zf) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.3zY r3 = new X.3zY
            r3.<init>(r0)
            return r3
        L_0x00e6:
            java.lang.Object r3 = r13.A01
            X.3zd r3 = (X.C258783zd) r3
            X.0eM r2 = r3.A04
            java.lang.Object r0 = r2.getValue()
            X.3zZ r0 = (X.C258743zZ) r0
            java.lang.Integer r0 = r0.BeZ()
            int r1 = r0.intValue()
            r0 = 0
            if (r1 != r0) goto L_0x0119
            java.lang.Object r2 = r2.getValue()
            X.3zZ r2 = (X.C258743zZ) r2
            X.0eM r0 = r3.A05
            java.lang.Object r1 = r0.getValue()
            X.RVp r1 = (X.C9264RVp) r1
            X.0eM r0 = r3.A02
            java.lang.Object r0 = r0.getValue()
            X.S4A r0 = (X.S4A) r0
            X.So9 r3 = new X.So9
            r3.<init>(r1, r0, r2)
            return r3
        L_0x0119:
            X.0eM r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            X.3zf r0 = (X.C258803zf) r0
            X.3zh r3 = new X.3zh
            r3.<init>(r0)
            return r3
        L_0x0127:
            java.lang.Object r0 = r13.A01
            X.3zd r0 = (X.C258783zd) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.S4A r3 = X.C9265RVq.A00(r0)
            return r3
        L_0x0132:
            java.lang.Object r0 = r13.A01
            X.3zd r0 = (X.C258783zd) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.3zf r3 = X.C393059vp.A00(r0)
            return r3
        L_0x013d:
            java.lang.Object r0 = r13.A01
            X.3zd r0 = (X.C258783zd) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.3zY r3 = new X.3zY
            r3.<init>(r0)
            return r3
        L_0x0149:
            java.lang.Object r3 = r13.A01
            X.0lg r3 = (X.0lg) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Class<X.3zd> r2 = X.C258783zd.class
            r1 = 11
            X.TVx r0 = new X.TVx
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.3zd r0 = (X.C258783zd) r0
            X.0eM r0 = r0.A01
            java.lang.Object r3 = r0.getValue()
            return r3
        L_0x0167:
            X.ACw r0 = X.C39875ACw.$redex_init_class
            java.lang.Object r0 = r13.A01
            X.94U r0 = (X.AnonymousClass94U) r0
            android.content.Context r1 = r0.A00
            X.0eM r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.A3L r0 = (X.A3L) r0
            X.ACw r3 = new X.ACw
            r3.<init>(r1, r0)
            return r3
        L_0x017d:
            java.lang.Object r0 = r13.A01
            X.94U r0 = (X.AnonymousClass94U) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.3zY r3 = new X.3zY
            r3.<init>(r0)
            return r3
        L_0x0189:
            java.lang.Object r0 = r13.A01
            X.94U r0 = (X.AnonymousClass94U) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.45s r0 = X.C2604645t.A00(r0)
            X.0eM r0 = r0.A01
            java.lang.Object r3 = r0.getValue()
            return r3
        L_0x019a:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.45s r3 = new X.45s
            r3.<init>(r0)
            return r3
        L_0x01a4:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A15
            java.lang.Class<X.45u> r0 = X.C2604745u.class
            X.0xa r3 = r2.A04(r1, r0)
            return r3
        L_0x01b5:
            java.lang.Object r0 = r13.A01
            X.45s r0 = (X.C2604545s) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.45u r0 = (X.C2604745u) r0
            X.A3L r3 = new X.A3L
            r3.<init>(r0)
            return r3
        L_0x01c7:
            java.lang.Object r0 = r13.A01
            X.45s r0 = (X.C2604545s) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.0xa r0 = (X.0xa) r0
            X.0xc r1 = new X.0xc
            r1.<init>(r0)
            java.lang.String r0 = "story_prefetch"
            X.45u r3 = new X.45u
            r3.<init>(r1, r0)
            return r3
        L_0x01e0:
            java.lang.Object r0 = r13.A01
            X.40I r0 = (X.AnonymousClass40I) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.0xa r0 = (X.0xa) r0
            X.0xc r1 = new X.0xc
            r1.<init>(r0)
            java.lang.String r0 = "ig_odml"
            X.45u r3 = new X.45u
            r3.<init>(r1, r0)
            return r3
        L_0x01f9:
            X.40K r6 = com.facebook.odin.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase.A00
            java.lang.Object r5 = r13.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Class<com.facebook.odin.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase> r4 = com.facebook.odin.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase.class
            java.lang.Object r3 = r5.A00(r4)
            if (r3 != 0) goto L_0x05a1
            monitor-enter(r6)
            java.lang.Object r3 = r5.A00(r4)     // Catch:{ all -> 0x0235 }
            com.instagram.roomdb.IgRoomDatabase r3 = (com.instagram.roomdb.IgRoomDatabase) r3     // Catch:{ all -> 0x0235 }
            if (r3 != 0) goto L_0x05a0
            android.content.Context r1 = X.C60960kU.A00     // Catch:{ all -> 0x0235 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0235 }
            java.lang.String r0 = X.1V8.A00(r5, r6)     // Catch:{ all -> 0x0235 }
            X.1VA r3 = X.1V9.A00(r1, r4, r0)     // Catch:{ all -> 0x0235 }
            r2 = 439645738(0x1a34762a, float:3.731858E-23)
            r1 = 278132057(0x1093f559, float:5.8359294E-29)
            r0 = 0
            X.1VC.A00(r3, r2, r1, r0)     // Catch:{ all -> 0x0235 }
            r3.A01()     // Catch:{ all -> 0x0235 }
            X.3oI r3 = r3.A00()     // Catch:{ all -> 0x0235 }
            com.instagram.roomdb.IgRoomDatabase r3 = (com.instagram.roomdb.IgRoomDatabase) r3     // Catch:{ all -> 0x0235 }
            r5.A04(r4, r3)     // Catch:{ all -> 0x0235 }
            goto L_0x05a0
        L_0x0235:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0238:
            java.lang.Object r3 = r13.A01
            X.40I r3 = (X.AnonymousClass40I) r3
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.40J r0 = (X.AnonymousClass40J) r0
            X.0gq r2 = r0.A00
            if (r2 == 0) goto L_0x0253
            r0 = 36880729553371489(0x8306d400160161, double:3.386860104105502E-306)
            java.lang.String r1 = r2.C1i(r0)
            if (r1 != 0) goto L_0x0255
        L_0x0253:
            java.lang.String r1 = "shared_prefs"
        L_0x0255:
            java.lang.String r0 = "sqlite"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0274
            X.0eM r0 = r3.A01
            java.lang.Object r0 = r0.getValue()
            com.facebook.odin.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase r0 = (com.facebook.odin.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase) r0
            X.40L r1 = r0.A00()
            X.0Gt r0 = X.AnonymousClass0Gt.A00
            X.0qQ.A07(r0)
            X.40M r3 = new X.40M
            r3.<init>(r0, r1)
            return r3
        L_0x0274:
            X.0eM r0 = r3.A00
            java.lang.Object r1 = r0.getValue()
            X.45u r1 = (X.C2604745u) r1
            X.0Gt r0 = X.AnonymousClass0Gt.A00
            X.0qQ.A07(r0)
            X.SoB r3 = new X.SoB
            r3.<init>(r0, r1)
            return r3
        L_0x0287:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.40J r3 = new X.40J
            r3.<init>(r0)
            return r3
        L_0x0291:
            java.lang.Object r3 = r13.A01
            X.5st r3 = (X.C298105st) r3
            X.0eM r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase r0 = (com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase) r0
            X.402 r2 = r0.A00()
            X.0eM r0 = r3.A02
            java.lang.Object r1 = r0.getValue()
            X.3zZ r1 = (X.C258743zZ) r1
            X.0eM r0 = r3.A00
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            X.0JP r0 = (X.AnonymousClass0JP) r0
            X.403 r3 = new X.403
            r3.<init>(r0, r2, r1)
            return r3
        L_0x02ba:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.94R r3 = new X.94R
            r3.<init>(r0)
            return r3
        L_0x02c4:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.94b r3 = new X.94b
            r3.<init>(r0)
            return r3
        L_0x02ce:
            java.lang.Object r1 = r13.A01
            X.7qt r1 = (X.C343837qt) r1
            X.7qb r0 = X.C343677qc.A00
            r1.Apu(r0)
            X.02m r3 = X.02m.A0p
            return r3
        L_0x02da:
            java.lang.Object r0 = r13.A01
            X.3lr r0 = (X.C250663lr) r0
            X.4Kx r0 = r0.cachedSelectionSet()
            X.4Kr[] r0 = r0.A00
            int r2 = r0.length
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r1 = 0
        L_0x02e8:
            if (r1 >= r2) goto L_0x05a1
            X.4Ky r0 = X.AnonymousClass4Ky.A00
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x02e8
        L_0x02f1:
            java.lang.Object r1 = r13.A01
            X.1wA r1 = (X.C67721wA) r1
            X.0eK r0 = r1.A04
            java.lang.Object r8 = r0.get()
            X.0qQ.A07(r8)
            X.MZv r8 = (X.MZv) r8
            X.1vl r7 = r1.A03
            X.0Ae r5 = r1.A01
            android.content.Context r4 = r1.A00
            X.1vo r6 = r1.A02
            X.MZw r3 = new X.MZw
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x030e:
            java.lang.Object r0 = r13.A01
            X.1wA r0 = (X.C67721wA) r0
            X.0eK r0 = r0.A05
            r0.get()
            r3 = 0
            return r3
        L_0x0319:
            java.lang.Object r0 = r13.A01
            X.1wA r0 = (X.C67721wA) r0
            X.0eK r0 = r0.A07
            r0.get()
            java.lang.String r1 = "mLightSharedPreferencesFactory"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x032a:
            java.lang.Object r0 = r13.A01
            X.41x r0 = (X.C2594941x) r0
            X.0sa r0 = r0.A02
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x0335:
            java.lang.Object r0 = r13.A01
            X.3c0 r0 = (X.C244943c0) r0
            X.3bz r3 = r0.A01
            if (r3 != 0) goto L_0x05a1
            java.lang.String r1 = "Trying to access the LayoutCache from outside a layout call"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0345:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r0 = r13.A01
            X.6Oh r0 = (X.C306966Oh) r0
            java.lang.String r5 = r0.A00
            r0 = 1
            char[] r2 = new char[r0]
            r1 = 95
            r0 = 0
            r2[r0] = r1
            r3 = 0
            java.util.List r0 = X.00l.A0Q(r5, r2, r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0361:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0387
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0361
            java.util.Set r0 = X.C306966Oh.A09
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0361
            java.util.Set r0 = X.C306966Oh.A08
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0361
            r4.add(r1)
            goto L_0x0361
        L_0x0387:
            java.lang.String r1 = "_"
            java.lang.String r0 = ""
            java.lang.String r3 = X.00k.A0P(r1, r0, r0, r4, r3)
            return r3
        L_0x0390:
            java.lang.Object r0 = r13.A01
            X.6Oh r0 = (X.C306966Oh) r0
            java.lang.String r1 = r0.A00
            r0 = 35
            boolean r0 = X.00l.A0X(r1, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x03a1:
            java.lang.Object r0 = r13.A01
            X.6Oh r0 = (X.C306966Oh) r0
            java.lang.String r3 = r0.A00
            r2 = 0
            r1 = 95
            boolean r0 = X.00l.A0X(r3, r1)
            if (r0 == 0) goto L_0x0415
            int r0 = r3.length()
            int r0 = r0 + -1
            int r0 = X.00l.A05(r3, r1, r0)
            int r0 = r0 + 1
            java.lang.String r1 = r3.substring(r0)
            X.0qQ.A07(r1)
            java.util.Set r0 = X.C306966Oh.A08
            goto L_0x0411
        L_0x03c6:
            java.lang.Object r1 = r13.A01
            X.6Oh r1 = (X.C306966Oh) r1
            X.0eM r0 = r1.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x03e7
            X.0eM r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x03e8
        L_0x03e7:
            r0 = 1
        L_0x03e8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x03ed:
            java.lang.Object r0 = r13.A01
            X.6Oh r0 = (X.C306966Oh) r0
            java.lang.String r3 = r0.A00
            r2 = 0
            r1 = 95
            boolean r0 = X.00l.A0X(r3, r1)
            if (r0 == 0) goto L_0x0415
            int r0 = r3.length()
            int r0 = r0 + -1
            int r0 = X.00l.A05(r3, r1, r0)
            int r0 = r0 + 1
            java.lang.String r1 = r3.substring(r0)
            X.0qQ.A07(r1)
            java.util.Set r0 = X.C306966Oh.A09
        L_0x0411:
            boolean r2 = r0.contains(r1)
        L_0x0415:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            return r3
        L_0x041a:
            java.lang.Object r0 = r13.A01
            X.6Oh r0 = (X.C306966Oh) r0
            java.util.Map r1 = r0.A01
            java.lang.String r0 = "unique_id"
            java.lang.Object r3 = r1.get(r0)
            return r3
        L_0x0427:
            java.lang.Object r0 = r13.A01
            X.627 r0 = (X.AnonymousClass627) r0
            android.content.Context r1 = r0.getContext()
            X.5Gy r0 = r0.A0B
            android.view.GestureDetector r3 = new android.view.GestureDetector
            r3.<init>(r1, r0)
            return r3
        L_0x0437:
            java.lang.Object r6 = r13.A01
            X.4Ms r6 = (X.C263624Ms) r6
            X.4Mt r5 = r6.A0I
            java.lang.String r1 = r5.A0W
            if (r1 == 0) goto L_0x0452
            X.4Mw r0 = r5.A0F
            X.4OI r0 = r0.A07
            if (r0 == 0) goto L_0x0452
            X.3uU r0 = r0.A0K
            java.lang.String r0 = r0.A0G
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0453
        L_0x0452:
            r0 = 0
        L_0x0453:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            X.4Mw r3 = r5.A0F
            X.4OI r8 = r3.A07
            if (r8 == 0) goto L_0x0531
            X.4Mg r0 = r5.A06
            X.274 r7 = r0.A00()
            long r0 = r5.A0S
            X.3wV r0 = X.274.A02(r8, r7, r0)
            if (r0 == 0) goto L_0x0531
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x0531
            X.29t r9 = r7.A06
            if (r9 == 0) goto L_0x0531
            java.util.Iterator r10 = r0.iterator()
        L_0x0477:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0531
            java.lang.Object r2 = r10.next()
            X.3wG r2 = (X.C256733wG) r2
            X.3vz r1 = r2.A03
            if (r1 == 0) goto L_0x0477
            java.lang.String r0 = r2.A03()
            android.net.Uri r1 = r1.A00(r0)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r7.A0H
            boolean r0 = r0.A3R
            boolean r0 = r9.A07(r1, r8, r2, r0)
            if (r0 == 0) goto L_0x0477
            r0 = 1
        L_0x049a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            X.4OI r7 = r3.A07
            if (r7 == 0) goto L_0x052f
            X.4Mg r0 = r5.A06
            X.274 r2 = r0.A00()
            long r0 = r5.A0S
            X.3wV r0 = X.274.A02(r7, r2, r0)
            if (r0 == 0) goto L_0x052f
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x052f
            X.29t r10 = r2.A06
            if (r10 == 0) goto L_0x052f
            java.util.Iterator r11 = r0.iterator()
        L_0x04bc:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x052f
            java.lang.Object r9 = r11.next()
            X.3wG r9 = (X.C256733wG) r9
            X.3vz r1 = r9.A03
            if (r1 == 0) goto L_0x04bc
            java.lang.String r0 = r9.A03()
            android.net.Uri r1 = r1.A00(r0)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r2.A0H
            boolean r0 = r0.A3R
            boolean r0 = r10.A07(r1, r7, r9, r0)
            if (r0 == 0) goto L_0x04bc
            r0 = 1
        L_0x04df:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            X.4OI r1 = r3.A07
            if (r1 == 0) goto L_0x052d
            X.4Mg r0 = r5.A06
            X.274 r2 = r0.A00()
            X.29n r0 = r2.A0c
            if (r0 == 0) goto L_0x052d
            X.3uU r0 = r1.A0K
            java.lang.String r1 = r0.A0G
            if (r1 == 0) goto L_0x052d
            X.29n r0 = r2.A0c
            boolean r0 = r0.A02(r1)
        L_0x04fd:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            android.view.View r0 = r6.A04
            boolean r0 = r0 instanceof android.view.SurfaceView
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.String r9 = "was_warmed"
            java.lang.String r6 = "was_cached"
            java.lang.String r5 = "was_audio_cached"
            java.lang.String r3 = "was_player_ready"
            java.lang.String r2 = "is_surfaceview"
            r1 = 5
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            r0.put(r9, r4)
            r0.put(r6, r8)
            r0.put(r5, r7)
            r0.put(r3, r11)
            r0.put(r2, r10)
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r0)
            return r3
        L_0x052d:
            r0 = 0
            goto L_0x04fd
        L_0x052f:
            r0 = 0
            goto L_0x04df
        L_0x0531:
            r0 = 0
            goto L_0x049a
        L_0x0534:
            java.lang.Object r0 = r13.A01
            X.4NN r0 = (X.AnonymousClass4NN) r0
            X.4OZ r3 = new X.4OZ
            r3.<init>(r0)
            return r3
        L_0x053e:
            java.lang.Object r0 = r13.A01
            X.0eK r0 = (X.AnonymousClass0eK) r0
            X.S7C r3 = new X.S7C
            r3.<init>(r0)
            return r3
        L_0x0548:
            java.lang.Object r0 = r13.A01
            X.2IK r0 = (X.AnonymousClass2IK) r0
            X.2IH r0 = r0.A00
            if (r0 == 0) goto L_0x0560
            X.0eK r0 = r0.A00
            java.lang.Object r3 = r0.get()
            if (r3 != 0) goto L_0x05a1
            java.lang.String r1 = "Provider is not available in the configuration"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0560:
            java.lang.String r1 = "W3C Client SDK has not been configured yet"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0568:
            java.lang.Object r0 = r13.A01
            X.2IK r0 = (X.AnonymousClass2IK) r0
            X.2IH r0 = r0.A00
            if (r0 == 0) goto L_0x0580
            X.0eK r0 = r0.A01
            java.lang.Object r3 = r0.get()
            if (r3 != 0) goto L_0x05a1
            java.lang.String r1 = "Provider is not available in the configuration"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0580:
            java.lang.String r1 = "W3C Client SDK has not been configured yet"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0588:
            java.lang.Object r0 = r13.A01
            X.2IK r0 = (X.AnonymousClass2IK) r0
            X.2IH r0 = r0.A00
            if (r0 == 0) goto L_0x05a2
            X.0eK r0 = r0.A02
            java.lang.Object r3 = r0.get()
            if (r3 != 0) goto L_0x05a1
            java.lang.String r1 = "Provider is not available in the configuration"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x05a0:
            monitor-exit(r6)
        L_0x05a1:
            return r3
        L_0x05a2:
            java.lang.String r1 = "W3C Client SDK has not been configured yet"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x05aa:
            java.lang.Object r1 = r13.A01
            r0 = 0
            X.9Nb r3 = new X.9Nb
            r3.<init>(r1, r0)
            return r3
        L_0x05b3:
            java.lang.Object r0 = r13.A01
            X.0lg r0 = (X.0lg) r0
            X.9BF r3 = new X.9BF
            r3.<init>(r0)
            return r3
        L_0x05bd:
            java.lang.Object r0 = r13.A01
            X.2dZ r0 = (X.2dZ) r0
            X.3oV r0 = r0.A0U
            android.view.View r1 = r0.getView()
            r0 = 2131427561(0x7f0b00e9, float:1.8476742E38)
            android.view.View r3 = r1.requireViewById(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377129Kq.invoke():java.lang.Object");
    }
}
