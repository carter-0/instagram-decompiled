package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.concurrent.TimeUnit;

public final class MGD extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGD(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
    }

    public static void A00(1Fa r3, Number number, long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r3.A9m(TraceFieldType.StartTime, String.valueOf(timeUnit.toSeconds(j)));
        if (number != null) {
            r3.A9m("end_time", String.valueOf(timeUnit.toSeconds(number.longValue())));
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MGD, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MGD, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MGD, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return new X.MGD(r1, r2, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013c, code lost:
        return new X.MGD(r2, r1, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        r3 = new X.MGD(r1, r6, r0);
        r3.A01 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0148, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r5, X.AnonymousClass4D7 r6) {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x0085;
                case 1: goto L_0x008a;
                case 2: goto L_0x0091;
                case 3: goto L_0x0011;
                case 4: goto L_0x0017;
                case 5: goto L_0x0098;
                case 6: goto L_0x009f;
                case 7: goto L_0x001d;
                case 8: goto L_0x0023;
                case 9: goto L_0x002a;
                case 10: goto L_0x00a4;
                case 11: goto L_0x0031;
                case 12: goto L_0x00ac;
                case 13: goto L_0x00b4;
                case 14: goto L_0x00ba;
                case 15: goto L_0x00c0;
                case 16: goto L_0x00c7;
                case 17: goto L_0x00cc;
                case 18: goto L_0x0038;
                case 19: goto L_0x00d3;
                case 20: goto L_0x003f;
                case 21: goto L_0x0046;
                case 22: goto L_0x004d;
                case 23: goto L_0x00da;
                case 24: goto L_0x00df;
                case 25: goto L_0x00e4;
                case 26: goto L_0x00e9;
                case 27: goto L_0x00ee;
                case 28: goto L_0x00f3;
                case 29: goto L_0x00f8;
                case 30: goto L_0x00fd;
                case 31: goto L_0x0102;
                case 32: goto L_0x0107;
                case 33: goto L_0x010c;
                case 34: goto L_0x0111;
                case 35: goto L_0x0116;
                case 36: goto L_0x0054;
                case 37: goto L_0x005b;
                case 38: goto L_0x0062;
                case 39: goto L_0x0069;
                case 40: goto L_0x011b;
                case 41: goto L_0x0120;
                case 42: goto L_0x0070;
                case 43: goto L_0x0125;
                case 44: goto L_0x012c;
                case 45: goto L_0x0131;
                case 46: goto L_0x0077;
                case 47: goto L_0x007e;
                case 48: goto L_0x013d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 49
        L_0x000b:
            X.MGD r3 = new X.MGD
            r3.<init>(r1, r2, r6, r0)
            return r3
        L_0x0011:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 3
            goto L_0x000b
        L_0x0017:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 4
            goto L_0x000b
        L_0x001d:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 7
            goto L_0x000b
        L_0x0023:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 8
            goto L_0x000b
        L_0x002a:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 9
            goto L_0x000b
        L_0x0031:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 11
            goto L_0x000b
        L_0x0038:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 18
            goto L_0x000b
        L_0x003f:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 20
            goto L_0x000b
        L_0x0046:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 21
            goto L_0x000b
        L_0x004d:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 22
            goto L_0x000b
        L_0x0054:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 36
            goto L_0x000b
        L_0x005b:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 37
            goto L_0x000b
        L_0x0062:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 38
            goto L_0x000b
        L_0x0069:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 39
            goto L_0x000b
        L_0x0070:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 42
            goto L_0x000b
        L_0x0077:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 46
            goto L_0x000b
        L_0x007e:
            java.lang.Object r2 = r4.A03
            java.lang.Object r1 = r4.A01
            r0 = 47
            goto L_0x000b
        L_0x0085:
            java.lang.Object r1 = r4.A03
            r0 = 0
            goto L_0x0141
        L_0x008a:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A03
            r0 = 1
            goto L_0x0137
        L_0x0091:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A03
            r0 = 2
            goto L_0x0137
        L_0x0098:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A03
            r0 = 5
            goto L_0x0137
        L_0x009f:
            java.lang.Object r1 = r4.A03
            r0 = 6
            goto L_0x0141
        L_0x00a4:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A03
            r0 = 10
            goto L_0x0137
        L_0x00ac:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A03
            r0 = 12
            goto L_0x0137
        L_0x00b4:
            java.lang.Object r1 = r4.A03
            r0 = 13
            goto L_0x0141
        L_0x00ba:
            java.lang.Object r1 = r4.A03
            r0 = 14
            goto L_0x0141
        L_0x00c0:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A03
            r0 = 15
            goto L_0x0137
        L_0x00c7:
            java.lang.Object r1 = r4.A03
            r0 = 16
            goto L_0x0141
        L_0x00cc:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A03
            r0 = 17
            goto L_0x0137
        L_0x00d3:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A03
            r0 = 19
            goto L_0x0137
        L_0x00da:
            java.lang.Object r1 = r4.A03
            r0 = 23
            goto L_0x0141
        L_0x00df:
            java.lang.Object r1 = r4.A03
            r0 = 24
            goto L_0x0141
        L_0x00e4:
            java.lang.Object r1 = r4.A03
            r0 = 25
            goto L_0x0141
        L_0x00e9:
            java.lang.Object r1 = r4.A03
            r0 = 26
            goto L_0x0141
        L_0x00ee:
            java.lang.Object r1 = r4.A03
            r0 = 27
            goto L_0x0141
        L_0x00f3:
            java.lang.Object r1 = r4.A03
            r0 = 28
            goto L_0x0141
        L_0x00f8:
            java.lang.Object r1 = r4.A03
            r0 = 29
            goto L_0x0141
        L_0x00fd:
            java.lang.Object r1 = r4.A03
            r0 = 30
            goto L_0x0141
        L_0x0102:
            java.lang.Object r1 = r4.A03
            r0 = 31
            goto L_0x0141
        L_0x0107:
            java.lang.Object r1 = r4.A03
            r0 = 32
            goto L_0x0141
        L_0x010c:
            java.lang.Object r1 = r4.A03
            r0 = 33
            goto L_0x0141
        L_0x0111:
            java.lang.Object r1 = r4.A03
            r0 = 34
            goto L_0x0141
        L_0x0116:
            java.lang.Object r1 = r4.A03
            r0 = 35
            goto L_0x0141
        L_0x011b:
            java.lang.Object r1 = r4.A03
            r0 = 40
            goto L_0x0141
        L_0x0120:
            java.lang.Object r1 = r4.A03
            r0 = 41
            goto L_0x0141
        L_0x0125:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A03
            r0 = 43
            goto L_0x0137
        L_0x012c:
            java.lang.Object r1 = r4.A03
            r0 = 44
            goto L_0x0141
        L_0x0131:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A03
            r0 = 45
        L_0x0137:
            X.MGD r3 = new X.MGD
            r3.<init>(r2, r1, r6, r0)
            return r3
        L_0x013d:
            java.lang.Object r1 = r4.A03
            r0 = 48
        L_0x0141:
            X.MGD r3 = new X.MGD
            r3.<init>(r1, r6, r0)
            r3.A01 = r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGD.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.MGD, X.4D7] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a1, code lost:
        r7.A00 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0379, code lost:
        r7.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x037b, code lost:
        r0 = r3.ELH(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0a07, code lost:
        X.0eS.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0a0a, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0a55, code lost:
        r8 = r1.A00(1474739340, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0a5c, code lost:
        if (r8 == r6) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0a5e, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0be5, code lost:
        if (r0 != r6) goto L_0x0c61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0be7, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0c57, code lost:
        if (r0 == null) goto L_0x0d1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0c59, code lost:
        r0.A03.A0D.setDisplayedChild(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0d1d, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0d24, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0154, code lost:
        if (r1 != 3) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e2, code lost:
        if (r9.A02 == false) goto L_0x01e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r18
            r1 = r19
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x0bae;
                case 1: goto L_0x0b86;
                case 2: goto L_0x0b5e;
                case 3: goto L_0x0b2a;
                case 4: goto L_0x0af7;
                case 5: goto L_0x0ace;
                case 6: goto L_0x0a98;
                case 7: goto L_0x0a61;
                case 8: goto L_0x0be8;
                case 9: goto L_0x0cd8;
                case 10: goto L_0x09f8;
                case 11: goto L_0x09b3;
                case 12: goto L_0x0939;
                case 13: goto L_0x08e1;
                case 14: goto L_0x08aa;
                case 15: goto L_0x087d;
                case 16: goto L_0x0840;
                case 17: goto L_0x0818;
                case 18: goto L_0x07be;
                case 19: goto L_0x078d;
                case 20: goto L_0x076c;
                case 21: goto L_0x06e3;
                case 22: goto L_0x06af;
                case 23: goto L_0x0682;
                case 24: goto L_0x064c;
                case 25: goto L_0x0613;
                case 26: goto L_0x05e4;
                case 27: goto L_0x05b2;
                case 28: goto L_0x057d;
                case 29: goto L_0x054b;
                case 30: goto L_0x051e;
                case 31: goto L_0x04f1;
                case 32: goto L_0x04c3;
                case 33: goto L_0x0491;
                case 34: goto L_0x045b;
                case 35: goto L_0x040e;
                case 36: goto L_0x03d8;
                case 37: goto L_0x03b0;
                case 38: goto L_0x0381;
                case 39: goto L_0x02ef;
                case 40: goto L_0x0283;
                case 41: goto L_0x025b;
                case 42: goto L_0x0233;
                case 43: goto L_0x01f2;
                case 44: goto L_0x01b0;
                case 45: goto L_0x0126;
                case 46: goto L_0x00f8;
                case 47: goto L_0x0060;
                case 48: goto L_0x00c8;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 2
            r9 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r9) goto L_0x0047
            if (r0 == r4) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x001a:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.KdN r0 = (X.C62289KdN) r0
            X.3ju r8 = r0.A0A
            X.Ki4 r5 = X.Ki4.FOLLOW_UPSELL
            r3 = 2131965384(0x7f1335c8, float:1.9567576E38)
            java.lang.Object r0 = r7.A01
            X.JvD r0 = (X.C61013JvD) r0
            com.instagram.user.model.User r0 = r0.A05
            java.lang.String r2 = r0.getUsername()
            r0 = 2131965379(0x7f1335c3, float:1.9567566E38)
            java.lang.Integer r1 = X.JTO.A0w(r0)
            X.KdZ r0 = new X.KdZ
            r0.<init>(r5, r1, r2, r3)
            r7.A00 = r9
            java.lang.Object r0 = r8.ELH(r0, r7)
            if (r0 != r6) goto L_0x004a
            return r6
        L_0x0047:
            X.0eS.A00(r1)
        L_0x004a:
            java.lang.Object r1 = r7.A03
            X.JiJ r1 = (X.C60262JiJ) r1
            boolean r0 = X.C61027JvR.A01(r1)
            if (r0 == 0) goto L_0x0c61
            X.3ju r1 = r1.A0B
            X.KdF r0 = X.C62281KdF.A00
            r7.A00 = r4
            java.lang.Object r0 = r1.ELH(r0, r7)
            goto L_0x0be5
        L_0x0060:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x00a4
            if (r0 != r3) goto L_0x00c3
            X.0eS.A00(r1)
        L_0x006c:
            java.lang.Object r5 = r7.A03
            X.KdH r5 = (X.C62283KdH) r5
            java.lang.Object r4 = r7.A01
            X.JvD r4 = (X.C61013JvD) r4
            X.2f1 r0 = r5.A06
            com.instagram.user.model.User r2 = r4.A05
            com.instagram.user.model.FollowStatus r1 = r0.A0N(r2)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            r3 = 0
            if (r1 != r0) goto L_0x0091
            X.6oS r2 = X.C318116oQ.A00(r5)
            r0 = 49
            X.MGD r1 = new X.MGD
            r1.<init>(r4, r5, r3, r0)
        L_0x008c:
            X.AnonymousClass7TE.A1Z(r1, r2)
            goto L_0x0c61
        L_0x0091:
            com.instagram.api.schemas.IGLiveNotificationPreference r1 = r2.A0A()
            com.instagram.api.schemas.IGLiveNotificationPreference r0 = com.instagram.api.schemas.IGLiveNotificationPreference.DEFAULT
            if (r1 != r0) goto L_0x0c61
            X.6oS r2 = X.C318116oQ.A00(r5)
            r0 = 0
            X.MGg r1 = new X.MGg
            r1.<init>(r4, r5, r3, r0)
            goto L_0x008c
        L_0x00a4:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.KdN r0 = (X.C62289KdN) r0
            X.5mt r2 = r0.A05
            java.lang.Object r0 = r7.A01
            X.JvD r0 = (X.C61013JvD) r0
            com.instagram.user.model.User r1 = r0.A05
            r0 = 0
            r2.A0G(r1, r0)
            r0 = 60000(0xea60, double:2.9644E-319)
            r7.A00 = r3
            java.lang.Object r0 = X.C241603Pv.A01(r7, r0)
            if (r0 != r6) goto L_0x006c
            return r6
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00c8:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x00d6
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d6:
            X.0eS.A00(r1)
            java.lang.Object r1 = r7.A01
            X.Kns r1 = (X.C62878Kns) r1
            boolean r0 = r1 instanceof X.C62182Kbe
            if (r0 == 0) goto L_0x0c61
            java.lang.Object r0 = r7.A03
            X.KdN r0 = (X.C62289KdN) r0
            X.3ju r2 = r0.A0A
            X.Kbe r1 = (X.C62182Kbe) r1
            com.instagram.user.model.User r1 = r1.A00
            X.KdR r0 = new X.KdR
            r0.<init>(r1)
            r7.A00 = r3
            java.lang.Object r0 = r2.ELH(r0, r7)
            goto L_0x0be5
        L_0x00f8:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 1
            if (r0 == 0) goto L_0x0113
            if (r0 != r2) goto L_0x0121
            X.0eS.A00(r1)
        L_0x0104:
            java.lang.Object r2 = r7.A03
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 26
            X.C66184MGv.A02(r2, r1, r0)
            goto L_0x0c61
        L_0x0113:
            X.0eS.A00(r1)
            r0 = 10000(0x2710, double:4.9407E-320)
            r7.A00 = r2
            java.lang.Object r0 = X.C241603Pv.A01(r7, r0)
            if (r0 != r6) goto L_0x0104
            return r6
        L_0x0121:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0126:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 3
            r3 = 4
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x013b
            if (r0 == r5) goto L_0x017d
            if (r0 == r4) goto L_0x0191
            if (r0 == r2) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x013b:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A01
            X.3NV r0 = (X.AnonymousClass3NV) r0
            if (r0 == 0) goto L_0x0156
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x0179
            if (r1 == r4) goto L_0x0175
            if (r1 == r3) goto L_0x0171
            r0 = 5
            if (r1 == r0) goto L_0x016d
            r3 = 2131965196(0x7f13350c, float:1.9567195E38)
            if (r1 == r2) goto L_0x0159
        L_0x0156:
            r3 = 2131968687(0x7f1342af, float:1.9574276E38)
        L_0x0159:
            java.lang.Object r0 = r7.A03
            X.KdL r0 = (X.C62287KdL) r0
            X.3ju r1 = r0.A03
            X.KdO r0 = new X.KdO
            r0.<init>(r3)
            r7.A00 = r5
            java.lang.Object r0 = r1.ELH(r0, r7)
            if (r0 != r6) goto L_0x0180
            return r6
        L_0x016d:
            r3 = 2131965194(0x7f13350a, float:1.956719E38)
            goto L_0x0159
        L_0x0171:
            r3 = 2131965235(0x7f133533, float:1.9567274E38)
            goto L_0x0159
        L_0x0175:
            r3 = 2131965374(0x7f1335be, float:1.9567556E38)
            goto L_0x0159
        L_0x0179:
            r3 = 2131965294(0x7f13356e, float:1.9567394E38)
            goto L_0x0159
        L_0x017d:
            X.0eS.A00(r1)
        L_0x0180:
            java.lang.Object r1 = r7.A01
            X.3NV r0 = X.AnonymousClass3NV.A08
            if (r1 != r0) goto L_0x0c61
            r0 = 15000(0x3a98, double:7.411E-320)
            r7.A00 = r4
            java.lang.Object r0 = X.C241603Pv.A01(r7, r0)
            if (r0 != r6) goto L_0x0194
            return r6
        L_0x0191:
            X.0eS.A00(r1)
        L_0x0194:
            java.lang.Object r1 = r7.A03
            X.KdL r1 = (X.C62287KdL) r1
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r0 = r1.A09
            X.Juh r0 = X.JTP.A0e(r0)
            if (r0 == 0) goto L_0x0c61
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0c61
            X.3ju r3 = r1.A03
            r0 = 2131963285(0x7f132d95, float:1.956332E38)
            X.KdO r9 = new X.KdO
            r9.<init>(r0)
            goto L_0x0379
        L_0x01b0:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 2
            r8 = 1
            if (r0 == 0) goto L_0x01c1
            if (r0 == r8) goto L_0x0bbc
            if (r0 == r2) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01c1:
            X.0eS.A00(r1)
            java.lang.Object r9 = r7.A01
            X.L7K r9 = (X.L7K) r9
            int r10 = r9.A00
            java.lang.Object r0 = r7.A03
            X.KdL r0 = (X.C62287KdL) r0
            X.3ju r3 = r0.A03
            if (r10 <= 0) goto L_0x01ee
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r0.A00
            long r4 = r4 - r0
            r1 = 9000(0x2328, double:4.4466E-320)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x01e4
            boolean r0 = r9.A02
            r1 = 0
            if (r0 != 0) goto L_0x01e5
        L_0x01e4:
            r1 = 1
        L_0x01e5:
            java.util.List r0 = r9.A01
            X.KdP r9 = new X.KdP
            r9.<init>(r10, r1, r0)
            goto L_0x02a1
        L_0x01ee:
            X.KdQ r9 = X.C62292KdQ.A00
            goto L_0x0379
        L_0x01f2:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x0200
            if (r0 == r4) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0200:
            X.0eS.A00(r1)
            java.lang.Object r1 = r7.A01
            X.MVW r1 = (X.MVW) r1
            boolean r0 = r1 instanceof X.M0V
            if (r0 == 0) goto L_0x0c61
            java.lang.Object r0 = r7.A03
            X.KdH r0 = (X.C62283KdH) r0
            X.JVe r3 = r0.A0A
            r2 = r1
            X.M0V r2 = (X.M0V) r2
            X.2Fk r0 = r0.A04
            java.lang.Object r0 = r0.A02()
            X.JwK r0 = (X.C61082JwK) r0
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r0.A00
        L_0x0220:
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            X.Kc0 r0 = new X.Kc0
            r0.<init>(r2, r1)
            r7.A00 = r4
            java.lang.Object r0 = r3.A00(r0, r7)
            goto L_0x0be5
        L_0x0231:
            r0 = 0
            goto L_0x0220
        L_0x0233:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x0241
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0241:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.JiJ r0 = (X.C60262JiJ) r0
            X.JVe r2 = r0.A0A
            java.lang.Object r1 = r7.A01
            X.MVW r1 = (X.MVW) r1
            X.Kbk r0 = new X.Kbk
            r0.<init>(r1)
            r7.A00 = r3
            java.lang.Object r0 = r2.A00(r0, r7)
            goto L_0x0be5
        L_0x025b:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x0269
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0269:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A01
            X.M0V r2 = (X.M0V) r2
            java.lang.Object r0 = r7.A03
            X.KdH r0 = (X.C62283KdH) r0
            X.3ju r1 = r0.A0B
            X.KdK r0 = new X.KdK
            r0.<init>(r2)
            r7.A00 = r3
            java.lang.Object r0 = r1.ELH(r0, r7)
            goto L_0x0be5
        L_0x0283:
            X.1Hj r6 = X.1Hj.A02
            int r3 = r7.A00
            r8 = 5
            r0 = 4
            r5 = 3
            r4 = 2
            r2 = 1
            if (r3 == 0) goto L_0x02a5
            if (r3 == r2) goto L_0x0bbc
            if (r3 == r4) goto L_0x0bbc
            if (r3 == r5) goto L_0x0bbc
            if (r3 != r0) goto L_0x0bbc
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.JiJ r0 = (X.C60262JiJ) r0
            X.3ju r3 = r0.A0B
            X.KdG r9 = X.C62282KdG.A00
        L_0x02a1:
            r7.A00 = r8
            goto L_0x037b
        L_0x02a5:
            X.0eS.A00(r1)
            java.lang.Object r1 = r7.A01
            X.Kns r1 = (X.C62878Kns) r1
            boolean r0 = r1 instanceof X.C62196Kbs
            if (r0 == 0) goto L_0x02c1
            java.lang.Object r0 = r7.A03
            X.KdH r0 = (X.C62283KdH) r0
            X.3ju r3 = r0.A0B
            X.Kbs r1 = (X.C62196Kbs) r1
            X.M0V r0 = r1.A00
            X.KdI r9 = new X.KdI
            r9.<init>(r0)
            goto L_0x0379
        L_0x02c1:
            boolean r0 = r1 instanceof X.C62189Kbl
            if (r0 == 0) goto L_0x02d8
            java.lang.Object r0 = r7.A03
            X.KdH r0 = (X.C62283KdH) r0
            X.3ju r3 = r0.A0B
            X.Kbl r1 = (X.C62189Kbl) r1
            java.lang.String r0 = r1.A00
            X.KdJ r9 = new X.KdJ
            r9.<init>(r0)
            r7.A00 = r4
            goto L_0x037b
        L_0x02d8:
            boolean r0 = r1 instanceof X.C62190Kbm
            if (r0 == 0) goto L_0x0c61
            java.lang.Object r0 = r7.A03
            X.KdH r0 = (X.C62283KdH) r0
            X.3ju r3 = r0.A0B
            X.Kbm r1 = (X.C62190Kbm) r1
            X.M0V r0 = r1.A00
            X.KdI r9 = new X.KdI
            r9.<init>(r0)
            r7.A00 = r5
            goto L_0x037b
        L_0x02ef:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0300
            if (r0 == r4) goto L_0x032f
            if (r0 == r2) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0300:
            X.0eS.A00(r1)
            java.lang.Object r3 = r7.A03
            X.Jj0 r3 = (X.C60302Jj0) r3
            X.KfY r0 = r3.A0B
            X.L2x r0 = r0.A0I()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0c61
            java.lang.Object r1 = r7.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r7.A00 = r4
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r3.A06
            X.0Ud r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x032a
            com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository r0 = r3.A05
            java.lang.Boolean r1 = r0.A00(r1, r7)
        L_0x0327:
            if (r1 != r6) goto L_0x0332
            return r6
        L_0x032a:
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            goto L_0x0327
        L_0x032f:
            X.0eS.A00(r1)
        L_0x0332:
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r7.A03
            X.Jj0 r0 = (X.C60302Jj0) r0
            if (r1 == 0) goto L_0x0367
            X.L9O r2 = r0.A08
            java.lang.Object r0 = r7.A01
            java.lang.String r1 = X.DbS.A0q(r0)
            X.KhM r3 = X.C62530KhM.DISMISSED
            X.LRD r2 = r2.A00
            X.LAz r0 = r2.A00
            if (r0 == 0) goto L_0x0c61
            X.LR7 r0 = r0.A03
            java.util.Map r0 = r0.A02
            java.lang.Object r1 = r0.get(r1)
            X.LFs r1 = (X.C63966LFs) r1
            if (r1 == 0) goto L_0x0c61
            r1.A00 = r3
            boolean r0 = r1.A01
            r0 = r0 & 1
            r1.A01 = r0
            r1.A01 = r0
            r2.A02(r1)
            goto L_0x0c61
        L_0x0367:
            X.3ju r3 = r0.A0E
            r1 = 2131965189(0x7f133505, float:1.956718E38)
            java.lang.Object r0 = r7.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getUsername()
            X.HGR r9 = new X.HGR
            r9.<init>(r1, r0)
        L_0x0379:
            r7.A00 = r2
        L_0x037b:
            java.lang.Object r0 = r3.ELH(r9, r7)
            goto L_0x0be5
        L_0x0381:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x038f
            if (r0 == r4) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x038f:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.Jj0 r0 = (X.C60302Jj0) r0
            X.3ju r3 = r0.A0E
            r2 = 2131965205(0x7f133515, float:1.9567213E38)
            java.lang.Object r0 = r7.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = r0.getUsername()
            X.HGR r0 = new X.HGR
            r0.<init>(r2, r1)
            r7.A00 = r4
            java.lang.Object r0 = r3.ELH(r0, r7)
            goto L_0x0be5
        L_0x03b0:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x03be
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03be:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.Jj0 r0 = (X.C60302Jj0) r0
            X.JVe r2 = r0.A0A
            java.lang.Object r1 = r7.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.Kbq r0 = new X.Kbq
            r0.<init>(r1)
            r7.A00 = r3
            java.lang.Object r0 = r2.A00(r0, r7)
            goto L_0x0be5
        L_0x03d8:
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x03e4
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03e4:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.Jj0 r0 = (X.C60302Jj0) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository r2 = r0.A05
            X.L9O r0 = r0.A08
            X.0Ud r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x040c
            int r1 = r0.size()
        L_0x03fd:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r1 = 0
            X.KgH r0 = X.C62467KgH.LEAVE_BROADCAST
            r7.A00 = r3
            r2.A04(r0, r1, r7)
            goto L_0x0c61
        L_0x040c:
            r1 = 0
            goto L_0x03fd
        L_0x040e:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x041c
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x041c:
            X.0eS.A00(r1)
            java.lang.Object r1 = r7.A01
            boolean r0 = r1 instanceof X.C62215KcB
            if (r0 != 0) goto L_0x0435
            X.KcN r0 = X.C62227KcN.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0435
            X.Kc8 r0 = X.C62212Kc8.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0c61
        L_0x0435:
            java.lang.Object r0 = r7.A03
            X.JiD r0 = (X.C60256JiD) r0
            X.3ju r2 = r0.A07
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r0.A04
            X.JvD r0 = X.JTQ.A0Q(r0)
            if (r0 == 0) goto L_0x0458
            com.instagram.user.model.User r0 = r0.A05
            if (r0 == 0) goto L_0x0458
            java.lang.String r1 = r0.getUsername()
        L_0x044b:
            X.Kd7 r0 = new X.Kd7
            r0.<init>(r1)
            r7.A00 = r3
            java.lang.Object r0 = r2.ELH(r0, r7)
            goto L_0x0be5
        L_0x0458:
            java.lang.String r1 = "host"
            goto L_0x044b
        L_0x045b:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 1
            if (r0 == 0) goto L_0x0472
            if (r0 != r2) goto L_0x048c
            X.0eS.A00(r1)
        L_0x0467:
            java.lang.Object r0 = r7.A03
            X.JhZ r0 = (X.C60216JhZ) r0
            X.05G r0 = r0.A07
            X.JTU.A1P(r0)
            goto L_0x0c61
        L_0x0472:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A01
            boolean r0 = r0 instanceof X.C62180Kbc
            if (r0 == 0) goto L_0x0c61
            java.lang.Object r0 = r7.A03
            X.JhZ r0 = (X.C60216JhZ) r0
            X.3ju r1 = r0.A04
            X.LLs r0 = X.C64074LLs.A00
            r7.A00 = r2
            java.lang.Object r0 = r1.ELH(r0, r7)
            if (r0 != r6) goto L_0x0467
            return r6
        L_0x048c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0491:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x049f
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x049f:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A03
            X.Lm3 r2 = (X.C65025Lm3) r2
            X.0eM r0 = r2.A0F
            java.lang.Object r0 = r0.getValue()
            X.JhH r0 = (X.C60198JhH) r0
            X.0Ud r0 = r0.A05
            X.0qC r1 = new X.0qC
            r1.<init>(r0)
            r0 = 60
            X.MCk r0 = X.MCk.A00(r2, r0)
            r7.A00 = r3
            java.lang.Object r0 = r1.collect(r0, r7)
            goto L_0x0be5
        L_0x04c3:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x04d1
            if (r0 == r4) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04d1:
            X.0eS.A00(r1)
            java.lang.Object r3 = r7.A03
            X.Lm3 r3 = (X.C65025Lm3) r3
            X.0eM r0 = r3.A0F
            java.lang.Object r0 = r0.getValue()
            X.JhH r0 = (X.C60198JhH) r0
            X.0r6 r2 = r0.A02
            r1 = 36
            X.9NG r0 = new X.9NG
            r0.<init>(r3, r1)
            r7.A00 = r4
            java.lang.Object r0 = r2.collect(r0, r7)
            goto L_0x0be5
        L_0x04f1:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x04ff
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04ff:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A03
            X.LlW r2 = (X.C64993LlW) r2
            X.0eM r0 = r2.A0A
            java.lang.Object r0 = r0.getValue()
            X.Jge r0 = (X.C60159Jge) r0
            X.0r6 r1 = r0.A02
            r0 = 59
            X.MCk r0 = X.MCk.A00(r2, r0)
            r7.A00 = r3
            java.lang.Object r0 = r1.collect(r0, r7)
            goto L_0x0be5
        L_0x051e:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x052c
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x052c:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A03
            X.Lm4 r2 = (X.C65026Lm4) r2
            X.0eM r0 = r2.A09
            java.lang.Object r0 = r0.getValue()
            X.Jgr r0 = (X.C60172Jgr) r0
            X.0r6 r1 = r0.A02
            r0 = 58
            X.MCk r0 = X.MCk.A00(r2, r0)
            r7.A00 = r3
            java.lang.Object r0 = r1.collect(r0, r7)
            goto L_0x0be5
        L_0x054b:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x0559
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0559:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A03
            X.Kct r2 = (X.C62259Kct) r2
            X.0eM r0 = r2.A0D
            java.lang.Object r0 = r0.getValue()
            X.Jiy r0 = (X.C60300Jiy) r0
            X.0Ud r0 = r0.A0F
            X.0qC r1 = new X.0qC
            r1.<init>(r0)
            r0 = 56
            X.MCk r0 = X.MCk.A00(r2, r0)
            r7.A00 = r3
            java.lang.Object r0 = r1.collect(r0, r7)
            goto L_0x0be5
        L_0x057d:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x058b
            if (r0 == r5) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x058b:
            X.0eS.A00(r1)
            java.lang.Object r4 = r7.A01
            java.lang.Object r3 = r7.A03
            X.LjY r3 = (X.C64872LjY) r3
            X.0eM r0 = r3.A07
            java.lang.Object r0 = r0.getValue()
            X.Jhb r0 = (X.C60218Jhb) r0
            X.0Ud r0 = r0.A0A
            X.0qC r2 = new X.0qC
            r2.<init>(r0)
            r1 = 39
            X.MCl r0 = new X.MCl
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3)
            r7.A00 = r5
            java.lang.Object r0 = r2.collect(r0, r7)
            goto L_0x0be5
        L_0x05b2:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x05c0
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05c0:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A03
            X.LA5 r2 = (X.LA5) r2
            X.0eM r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            X.Jg7 r0 = (X.C60126Jg7) r0
            X.0Ud r0 = r0.A01
            X.0qC r1 = new X.0qC
            r1.<init>(r0)
            r0 = 55
            X.MCk r0 = X.MCk.A00(r2, r0)
            r7.A00 = r3
            java.lang.Object r0 = r1.collect(r0, r7)
            goto L_0x0be5
        L_0x05e4:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x05f2
            if (r0 == r4) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05f2:
            X.0eS.A00(r1)
            java.lang.Object r3 = r7.A03
            X.K8D r3 = (X.K8D) r3
            X.DlH r0 = r3.A0C()
            X.0Ud r0 = r0.A03
            X.0qC r2 = new X.0qC
            r2.<init>(r0)
            r1 = 26
            X.FxN r0 = new X.FxN
            r0.<init>((java.lang.Object) r3, (int) r1)
            r7.A00 = r4
            java.lang.Object r0 = r2.collect(r0, r7)
            goto L_0x0be5
        L_0x0613:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0621
            if (r0 == r5) goto L_0x0644
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0621:
            X.0eS.A00(r1)
            java.lang.Object r4 = r7.A01
            java.lang.Object r3 = r7.A03
            X.Llb r3 = (X.C64998Llb) r3
            X.0eM r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            X.JhZ r0 = (X.C60216JhZ) r0
            X.0Ud r2 = r0.A08
            r1 = 38
            X.MCl r0 = new X.MCl
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3)
            r7.A00 = r5
            java.lang.Object r0 = r2.collect(r0, r7)
            if (r0 != r6) goto L_0x0647
            return r6
        L_0x0644:
            X.0eS.A00(r1)
        L_0x0647:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x064c:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x065a
            if (r0 == r3) goto L_0x067a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x065a:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A03
            X.Jdk r2 = (X.C60034Jdk) r2
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.Jgz r0 = (X.C60180Jgz) r0
            X.0Ud r1 = r0.A05
            r0 = 53
            X.MCk r0 = X.MCk.A00(r2, r0)
            r7.A00 = r3
            java.lang.Object r0 = r1.collect(r0, r7)
            if (r0 != r6) goto L_0x067d
            return r6
        L_0x067a:
            X.0eS.A00(r1)
        L_0x067d:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0682:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x0690
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0690:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A03
            X.Jdk r2 = (X.C60034Jdk) r2
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.Jgz r0 = (X.C60180Jgz) r0
            X.0r6 r1 = r0.A03
            r0 = 52
            X.MCk r0 = X.MCk.A00(r2, r0)
            r7.A00 = r3
            java.lang.Object r0 = r1.collect(r0, r7)
            goto L_0x0be5
        L_0x06af:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 1
            if (r0 == 0) goto L_0x06bd
            if (r0 == r2) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06bd:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.6gj r0 = (X.C313616gj) r0
            com.instagram.common.session.UserSession r0 = r0.A0N
            X.6h3 r0 = X.C313766gy.A00(r0)
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r1 = (com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager) r1
            java.lang.Object r0 = r7.A01
            X.4gL r0 = (X.C270194gL) r0
            java.lang.String r0 = r0.A0X
            r0.getClass()
            r7.A00 = r2
            java.lang.Object r0 = r1.A02(r0, r7)
            goto L_0x0be5
        L_0x06e3:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r9 = 1
            if (r0 == 0) goto L_0x06f1
            if (r0 == r9) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06f1:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.LAo r0 = (X.C63885LAo) r0
            X.3ju r10 = r0.A05
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.Object r3 = r7.A01
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<X.Br3> r12 = X.Br3.class
            r11 = 3
            java.lang.String r5 = "waver"
            r4 = -118064216(0xfffffffff8f67ba8, float:-3.9994159E34)
            X.3lr r2 = r3.getRequiredTreeField(r11, r5, r12, r4)
            r1 = 0
            java.lang.String r0 = "strong_id__"
            java.lang.String r2 = r2.getRequiredStringField(r1, r0)
            X.3lr r1 = r3.getRequiredTreeField(r11, r5, r12, r4)
            java.lang.String r0 = X.AnonymousClass9NF.A00()
            java.lang.String r0 = r1.getRequiredStringField(r9, r0)
            com.instagram.user.model.User r8 = new com.instagram.user.model.User
            r8.<init>(r2, r0)
            X.3lr r2 = r3.getRequiredTreeField(r11, r5, r12, r4)
            r1 = 2
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r0 = r2.getRequiredStringField(r1, r0)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            r8.A0l(r0)
            java.lang.String r0 = "wave_type"
            java.lang.String r5 = r3.getRequiredStringField(r1, r0)
            java.lang.Integer[] r4 = X.AnonymousClass05K.A00(r1)
            int r3 = r4.length
            r2 = 0
        L_0x0742:
            if (r2 >= r3) goto L_0x075d
            r1 = r4[r2]
            r0 = 0
            int r0 = X.C51967G9n.A03(r1, r0)
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x075a
            java.lang.String r0 = "wave"
        L_0x0751:
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L_0x075f
            int r2 = r2 + 1
            goto L_0x0742
        L_0x075a:
            java.lang.String r0 = "wave_back"
            goto L_0x0751
        L_0x075d:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x075f:
            X.JwL r0 = new X.JwL
            r0.<init>((com.instagram.user.model.User) r8, (java.lang.Integer) r1)
            r7.A00 = r9
            java.lang.Object r0 = r10.ELH(r0, r7)
            goto L_0x0be5
        L_0x076c:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 1
            if (r0 == 0) goto L_0x077a
            if (r0 == r2) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x077a:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r0 = (com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository) r0
            X.3ju r1 = r0.A03
            java.lang.Object r0 = r7.A01
            r7.A00 = r2
            java.lang.Object r0 = r1.ELH(r0, r7)
            goto L_0x0be5
        L_0x078d:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x079b
            if (r0 == r4) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x079b:
            X.0eS.A00(r1)
            java.lang.Object r3 = r7.A01
            X.L7G r3 = (X.L7G) r3
            X.L2l r0 = r3.A01
            if (r0 == 0) goto L_0x07bc
            java.lang.String r2 = r0.A00
        L_0x07a8:
            java.lang.Object r1 = r7.A03
            com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository) r1
            com.instagram.common.session.UserSession r0 = r1.A03
            boolean r0 = X.C51966G9m.A1W(r0, r2)
            if (r0 != 0) goto L_0x0c61
            r7.A00 = r4
            java.lang.Object r0 = com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository.A00(r3, r1, r7)
            goto L_0x0be5
        L_0x07bc:
            r2 = 0
            goto L_0x07a8
        L_0x07be:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x07cc
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07cc:
            X.0eS.A00(r1)
            java.lang.Object r5 = r7.A03
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r5 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r5
            java.util.Set r0 = r5.A0B
            java.lang.Object r8 = r7.A01
            X.L8W r8 = (X.L8W) r8
            java.util.Iterator r4 = r0.iterator()
        L_0x07dd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0816
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.M0V r0 = (X.M0V) r0
            java.lang.String r1 = r0.getPk()
            java.lang.String r0 = r8.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x07dd
        L_0x07f6:
            X.M0V r2 = (X.M0V) r2
            if (r2 == 0) goto L_0x0c61
            java.lang.String r1 = r8.A02
            com.instagram.common.session.UserSession r0 = r5.A0A
            boolean r0 = X.C51966G9m.A1W(r0, r1)
            if (r0 == 0) goto L_0x0808
            boolean r0 = r8.A03
            r2.A0F = r0
        L_0x0808:
            int r0 = r8.A00
            r2.A02 = r0
            X.3ju r0 = r5.A0D
            r7.A00 = r3
            java.lang.Object r0 = r0.ELH(r2, r7)
            goto L_0x0be5
        L_0x0816:
            r2 = 0
            goto L_0x07f6
        L_0x0818:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x0826
            if (r0 == r4) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0826:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A01
            X.Dky r0 = (X.C46771Dky) r0
            X.0r6 r3 = r0.A05
            java.lang.Object r2 = r7.A03
            r1 = 24
            X.FxN r0 = new X.FxN
            r0.<init>((java.lang.Object) r2, (int) r1)
            r7.A00 = r4
            java.lang.Object r0 = r3.collect(r0, r7)
            goto L_0x0be5
        L_0x0840:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x084e
            if (r0 == r4) goto L_0x0875
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x084e:
            X.0eS.A00(r1)
            java.lang.Object r3 = r7.A03
            X.E6i r3 = (X.C47522E6i) r3
            X.DkI r0 = r3.A0B
            if (r0 != 0) goto L_0x0863
            java.lang.String r0 = "likesListViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0863:
            X.0Ud r2 = r0.A05
            r1 = 23
            X.FxN r0 = new X.FxN
            r0.<init>((java.lang.Object) r3, (int) r1)
            r7.A00 = r4
            java.lang.Object r0 = r2.collect(r0, r7)
            if (r0 != r6) goto L_0x0878
            return r6
        L_0x0875:
            X.0eS.A00(r1)
        L_0x0878:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x087d:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x088b
            if (r0 == r3) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x088b:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A01
            r1 = 6
            X.PhT r0 = new X.PhT
            r0.<init>(r2, r1)
            X.05E r2 = X.C3025664b.A02(r0)
            java.lang.Object r1 = r7.A03
            r0 = 44
            X.MCk r0 = X.MCk.A00(r1, r0)
            r7.A00 = r3
            java.lang.Object r0 = r2.collect(r0, r7)
            goto L_0x0be5
        L_0x08aa:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x08b8
            if (r0 == r4) goto L_0x08d9
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08b8:
            X.0eS.A00(r1)
            java.lang.Object r3 = r7.A03
            X.E6d r3 = (X.C47519E6d) r3
            X.0eM r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            X.JiB r0 = (X.C60254JiB) r0
            X.0Ud r2 = r0.A04
            r1 = 21
            X.FxN r0 = new X.FxN
            r0.<init>((java.lang.Object) r3, (int) r1)
            r7.A00 = r4
            java.lang.Object r0 = r2.collect(r0, r7)
            if (r0 != r6) goto L_0x08dc
            return r6
        L_0x08d9:
            X.0eS.A00(r1)
        L_0x08dc:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x08e1:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0916
            if (r0 != r5) goto L_0x0934
            X.0eS.A00(r1)
        L_0x08ed:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            if (r1 == 0) goto L_0x0c63
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0c63
            java.util.Iterator r3 = r1.iterator()
        L_0x08ff:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0c63
            X.3lr r2 = X.C41845B3m.A0V(r3)
            r1 = 5
            java.lang.String r0 = "strong_id__"
            java.lang.String r0 = r2.getRequiredStringField(r1, r0)
            if (r0 == 0) goto L_0x08ff
            r6.add(r0)
            goto L_0x08ff
        L_0x0916:
            X.0eS.A00(r1)
            java.lang.Object r4 = r7.A01
            X.4Cq r4 = (X.C262224Cq) r4
            r3 = 0
            java.lang.Object r2 = r7.A03
            r1 = 48
            X.MG5 r0 = new X.MG5
            r0.<init>(r2, r3, r1)
            X.2Q8 r0 = X.JTO.A1E(r0, r4)
            r7.A00 = r5
            java.lang.Object r1 = r0.A0E(r7)
            if (r1 != r6) goto L_0x08ed
            return r6
        L_0x0934:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0939:
            r8 = r1
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 1
            if (r0 == 0) goto L_0x0948
            if (r0 == r4) goto L_0x0a07
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0948:
            X.0eS.A00(r1)
            java.lang.Object r5 = r7.A01
            X.LA2 r5 = (X.LA2) r5
            java.lang.Object r0 = r7.A03
            X.KWU r0 = (X.KWU) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            java.lang.String r13 = r5.A01
            java.lang.String r0 = r5.A00
            java.lang.String r12 = X.DbV.A12(r0)
            java.util.Date r0 = r5.A03
            long r1 = r0.getTime()
            java.util.Date r0 = r5.A02
            if (r0 == 0) goto L_0x09b1
            long r8 = r0.getTime()
            java.lang.Long r11 = X.JTO.A0y(r8)
        L_0x096f:
            boolean r10 = r5.A04
            boolean r9 = r5.A05
            java.lang.String r8 = "title"
            r0 = 2
            X.0qQ.A0B(r12, r0)
            X.1NY r5 = X.AnonymousClass7TG.A0a(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r13}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r4)
            java.lang.String r0 = "upcoming_events/edit/%s/"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            X.0qQ.A07(r0)
            r5.A0E = r0
            java.lang.String r0 = "id"
            r5.A9m(r0, r13)
            r5.A9m(r8, r12)
            A00(r5, r11, r1)
            java.lang.String r0 = "remove_end_time"
            r5.A0H(r0, r10)
            java.lang.String r0 = "show_on_profile"
            r5.A0H(r0, r9)
            java.lang.Class<X.CGC> r1 = X.CGC.class
            java.lang.Class<X.D1s> r0 = X.C45693D1s.class
            X.1OC r1 = X.DbW.A0L(r5, r1, r0, r4)
            r7.A00 = r4
            goto L_0x0a55
        L_0x09b1:
            r11 = 0
            goto L_0x096f
        L_0x09b3:
            r8 = r1
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x09c2
            if (r0 == r3) goto L_0x0a07
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09c2:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.KWU r0 = (X.KWU) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            java.lang.Object r0 = r7.A01
            com.instagram.user.model.UpcomingEvent r0 = (com.instagram.user.model.UpcomingEvent) r0
            java.lang.String r0 = r0.getId()
            X.0qQ.A0B(r0, r3)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "upcoming_events/delete/%s/"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r0)
            r2.A0E = r0
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r1 = X.DbW.A0L(r2, r1, r0, r3)
            r7.A00 = r3
            goto L_0x0a55
        L_0x09f8:
            r8 = r1
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r9 = 1
            if (r0 == 0) goto L_0x0a0b
            if (r0 == r9) goto L_0x0a07
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a07:
            X.0eS.A00(r1)
            return r8
        L_0x0a0b:
            X.0eS.A00(r1)
            java.lang.Object r5 = r7.A01
            X.L8V r5 = (X.L8V) r5
            java.lang.Object r0 = r7.A03
            X.KWU r0 = (X.KWU) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.String r0 = r5.A00
            java.lang.String r10 = X.DbV.A12(r0)
            java.util.Date r0 = r5.A02
            long r3 = r0.getTime()
            java.util.Date r0 = r5.A01
            if (r0 == 0) goto L_0x0a5f
            long r0 = r0.getTime()
            java.lang.Long r8 = X.JTO.A0y(r0)
        L_0x0a30:
            boolean r5 = r5.A03
            java.lang.String r1 = "title"
            X.0qQ.A0B(r10, r9)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r0 = "upcoming_events/create/"
            r2.A0A(r0)
            r2.A9m(r1, r10)
            A00(r2, r8, r3)
            java.lang.String r0 = "show_on_profile"
            r2.A0H(r0, r5)
            java.lang.Class<X.CGC> r1 = X.CGC.class
            java.lang.Class<X.D1s> r0 = X.C45693D1s.class
            X.1OC r1 = X.DbW.A0L(r2, r1, r0, r9)
            r7.A00 = r9
        L_0x0a55:
            r0 = 1474739340(0x57e6bc8c, float:5.07394954E14)
            java.lang.Object r8 = r1.A00(r0, r7)
            if (r8 == r6) goto L_0x0c63
            return r8
        L_0x0a5f:
            r8 = 0
            goto L_0x0a30
        L_0x0a61:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 1
            if (r0 == 0) goto L_0x0a6f
            if (r0 == r8) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a6f:
            X.0eS.A00(r1)
            java.lang.Object r0 = r7.A03
            X.ViN r0 = (X.C17932ViN) r0
            com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository r5 = r0.A04
            java.lang.Object r1 = r7.A01
            X.L8U r1 = (X.L8U) r1
            com.instagram.user.model.UpcomingEvent r4 = r1.A02
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r0 = r1.A01
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r3 = com.instagram.upcomingevents.common.model.UpcomingEventReminderAction.SET_REMINDER
            if (r0 != r3) goto L_0x0a86
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r3 = com.instagram.upcomingevents.common.model.UpcomingEventReminderAction.UNSET_REMINDER
        L_0x0a86:
            java.lang.String r2 = r1.A03
            X.1Xj r0 = r1.A00
            X.L8U r1 = new X.L8U
            r1.<init>(r0, r3, r4, r2)
            r0 = 0
            r7.A00 = r8
            java.lang.Object r0 = r5.A02(r0, r1, r7)
            goto L_0x0be5
        L_0x0a98:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L_0x0aa6
            if (r0 == r3) goto L_0x0ac6
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0aa6:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A03
            X.K7E r2 = (X.K7E) r2
            X.0eM r0 = r2.A0B
            java.lang.Object r0 = r0.getValue()
            X.JgO r0 = (X.C60143JgO) r0
            X.05G r1 = r0.A02
            r0 = 42
            X.MCk r0 = X.MCk.A00(r2, r0)
            r7.A00 = r3
            java.lang.Object r0 = r1.collect(r0, r7)
            if (r0 != r6) goto L_0x0ac9
            return r6
        L_0x0ac6:
            X.0eS.A00(r1)
        L_0x0ac9:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0ace:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 1
            if (r0 == 0) goto L_0x0adc
            if (r0 == r8) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0adc:
            X.0eS.A00(r1)
            java.lang.Object r5 = r7.A01
            X.07Z r5 = (X.AnonymousClass07Z) r5
            X.07U r4 = X.07U.A04
            java.lang.Object r3 = r7.A03
            r2 = 0
            r1 = 42
            X.MG5 r0 = new X.MG5
            r0.<init>(r3, r2, r1)
            r7.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r4, r5, r7, r0)
            goto L_0x0be5
        L_0x0af7:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0b05
            if (r0 == r5) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b05:
            X.0eS.A00(r1)
            java.lang.Object r4 = r7.A03
            X.U91 r4 = (X.U91) r4
            X.0V2 r3 = r4.A0D
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.Object r0 = r7.A01
            X.1Xj r0 = (X.1Xj) r0
            X.JwL r2 = new X.JwL
            r2.<init>((X.1Xj) r0, (java.lang.Integer) r1)
            X.Vbe r0 = r4.A08
            X.0wc r1 = r0.A01
            X.Jzo r0 = new X.Jzo
            r0.<init>(r2, r1, r5)
            r7.A00 = r5
            java.lang.Object r0 = r3.emit(r0, r7)
            goto L_0x0be5
        L_0x0b2a:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0b38
            if (r0 == r5) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b38:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A03
            X.U91 r2 = (X.U91) r2
            X.0V2 r4 = r2.A0D
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            java.lang.Object r0 = r7.A01
            X.1Xj r0 = (X.1Xj) r0
            X.JwL r3 = new X.JwL
            r3.<init>((X.1Xj) r0, (java.lang.Integer) r1)
            X.Vbe r0 = r2.A08
            X.0wc r2 = r0.A01
            r1 = 0
            X.Jzo r0 = new X.Jzo
            r0.<init>(r3, r2, r1)
            r7.A00 = r5
            java.lang.Object r0 = r4.emit(r0, r7)
            goto L_0x0be5
        L_0x0b5e:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 1
            if (r0 == 0) goto L_0x0b6c
            if (r0 == r8) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b6c:
            X.0eS.A00(r1)
            java.lang.Object r5 = r7.A01
            X.07Z r5 = (X.AnonymousClass07Z) r5
            X.07U r4 = X.07U.A04
            java.lang.Object r3 = r7.A03
            r2 = 0
            r1 = 31
            X.MG5 r0 = new X.MG5
            r0.<init>(r3, r2, r1)
            r7.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r4, r5, r7, r0)
            goto L_0x0be5
        L_0x0b86:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 1
            if (r0 == 0) goto L_0x0b94
            if (r0 == r8) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b94:
            X.0eS.A00(r1)
            java.lang.Object r5 = r7.A01
            X.07Z r5 = (X.AnonymousClass07Z) r5
            X.07U r4 = X.07U.A04
            java.lang.Object r3 = r7.A03
            r2 = 0
            r1 = 31
            X.MGx r0 = new X.MGx
            r0.<init>(r3, r2, r1)
            r7.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A01(r4, r5, r7, r0)
            goto L_0x0be5
        L_0x0bae:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0bc1
            if (r0 == r5) goto L_0x0bbc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0bbc:
            X.0eS.A00(r1)
            goto L_0x0c61
        L_0x0bc1:
            X.0eS.A00(r1)
            java.lang.Object r4 = r7.A01
            X.3pV r4 = (X.C252683pV) r4
            r0 = 11
            X.LjX r3 = new X.LjX
            r3.<init>(r4, r0)
            java.lang.Object r2 = r7.A03
            X.LZZ r2 = (X.LZZ) r2
            X.3E6 r0 = r2.A00
            r0.A9Y(r3)
            r1 = 14
            X.Wvv r0 = new X.Wvv
            r0.<init>(r1, r3, r2)
            r7.A00 = r5
            java.lang.Object r0 = X.C239083Et.A00(r7, r0, r4)
        L_0x0be5:
            if (r0 != r6) goto L_0x0c61
            return r6
        L_0x0be8:
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 1
            java.lang.String r9 = "viewBinder"
            if (r0 == 0) goto L_0x0c8e
            if (r0 != r6) goto L_0x0da7
            X.0eS.A00(r1)
        L_0x0bf6:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r3 = r7.A03
            X.K6D r3 = (X.K6D) r3
            java.lang.Object r4 = r7.A01
            X.JuA r4 = (X.C60952JuA) r4
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0c85
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.CGC r0 = (X.CGC) r0
            com.instagram.user.model.UpcomingEventImpl r1 = X.C45129Cqn.A00(r0)
            X.0eM r2 = r3.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.6ak r0 = X.C310266ai.A00(r0)
            r0.A01(r1)
            X.MUQ r0 = r3.A06
            if (r0 == 0) goto L_0x0c22
            r0.DD1(r1)
        L_0x0c22:
            X.Khz r1 = r4.A00
            X.Khz r0 = X.C62569Khz.UPCOMING_EVENTS_LIST
            if (r1 != r0) goto L_0x0c70
            X.L2g r0 = r3.A01
            if (r0 == 0) goto L_0x0c64
            X.K6D.A02(r3)
            X.K4S r0 = r0.A00
            X.K4S.A00(r0)
        L_0x0c34:
            X.LO9 r0 = r3.A04
            if (r0 == 0) goto L_0x0d1d
            X.LBP r0 = r0.A03
            com.instagram.actionbar.ActionButton r1 = r0.A0D
            r0 = 0
            r1.setDisplayedChild(r0)
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x0c44:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0c61
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0da2
            X.4dm r1 = X.JTP.A0N(r1)
            java.lang.String r0 = "upcoming_event_creation_request_failure"
            X.K6D.A01(r1, r3, r0)
            X.LO9 r0 = r3.A04
        L_0x0c57:
            if (r0 == 0) goto L_0x0d1d
            X.LBP r0 = r0.A03
            com.instagram.actionbar.ActionButton r1 = r0.A0D
            r0 = 0
            r1.setDisplayedChild(r0)
        L_0x0c61:
            X.0gF r6 = X.C60340gF.A00
        L_0x0c63:
            return r6
        L_0x0c64:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.creation.state.CreationState r1 = com.instagram.creation.state.CreationState.A0W
            X.KPP r0 = new X.KPP
            r0.<init>(r1)
            goto L_0x0c7d
        L_0x0c70:
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0c81
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            X.KPF r0 = new X.KPF
            r0.<init>()
        L_0x0c7d:
            X.C59888JbD.A01(r2, r0)
            goto L_0x0c34
        L_0x0c81:
            X.K6D.A02(r3)
            goto L_0x0c34
        L_0x0c85:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0c44
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0c8e:
            X.0eS.A00(r1)
            java.lang.Object r1 = r7.A03
            X.K6D r1 = (X.K6D) r1
            X.LO9 r0 = r1.A04
            if (r0 == 0) goto L_0x0d1d
            X.LBP r0 = r0.A03
            com.instagram.actionbar.ActionButton r0 = r0.A0D
            r0.setDisplayedChild(r6)
            X.KWU r5 = r1.A05
            if (r5 != 0) goto L_0x0cae
            java.lang.String r0 = "upcomingEventRepository"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0cae:
            java.lang.Object r0 = r7.A01
            X.JuA r0 = (X.C60952JuA) r0
            java.lang.String r3 = r0.A02
            java.util.Date r2 = r0.A04
            if (r2 == 0) goto L_0x0dac
            java.util.Date r1 = r0.A03
            boolean r0 = r0.A06
            X.L8V r4 = new X.L8V
            r4.<init>(r3, r2, r1, r0)
            r7.A00 = r6
            X.4Cq r0 = r5.A01
            X.4Cc r3 = r0.ArX()
            r2 = 0
            r1 = 10
            X.MGD r0 = new X.MGD
            r0.<init>(r4, r5, r2, r1)
            java.lang.Object r1 = X.1Eo.A00(r7, r3, r0)
            if (r1 != r8) goto L_0x0bf6
            return r8
        L_0x0cd8:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r2 = 1
            java.lang.String r9 = "viewBinder"
            if (r0 == 0) goto L_0x0d70
            if (r0 != r2) goto L_0x0db6
            X.0eS.A00(r1)
        L_0x0ce6:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r2 = r7.A03
            X.K6D r2 = (X.K6D) r2
            java.lang.Object r5 = r7.A01
            com.instagram.user.model.UpcomingEvent r5 = (com.instagram.user.model.UpcomingEvent) r5
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0d25
            X.0eM r0 = r2.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6ak r4 = X.C310266ai.A00(r0)
            java.lang.String r1 = r5.getId()
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.util.Map r0 = r4.A00
            r0.remove(r1)
            java.util.Set r0 = r4.A01
            r0.add(r1)
            X.MUQ r0 = r2.A06
            if (r0 == 0) goto L_0x0d17
            r0.DD2(r5)
        L_0x0d17:
            X.JuA r0 = r2.A03
            if (r0 != 0) goto L_0x0d2e
            java.lang.String r9 = "viewState"
        L_0x0d1d:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0d25:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0d5b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0d2e:
            r12 = 0
            X.Khz r11 = r0.A00
            java.lang.String r13 = r0.A02
            java.util.Date r14 = r0.A04
            java.util.Date r15 = r0.A03
            boolean r1 = r0.A05
            boolean r0 = r0.A06
            X.AnonymousClass7TG.A1O(r11, r13)
            X.JuA r10 = new X.JuA
            r17 = r0
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r2.A03 = r10
            X.LO9 r0 = r2.A04
            if (r0 == 0) goto L_0x0d1d
            X.LBP r0 = r0.A03
            com.instagram.actionbar.ActionButton r0 = r0.A0D
            r0.setDisplayedChild(r3)
            X.K6D.A02(r2)
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x0d5b:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0c61
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0db1
            X.4dm r1 = X.JTP.A0N(r1)
            java.lang.String r0 = "upcoming_event_deletion_request_failure"
            X.K6D.A01(r1, r2, r0)
            X.LO9 r0 = r2.A04
            goto L_0x0c57
        L_0x0d70:
            X.0eS.A00(r1)
            java.lang.Object r1 = r7.A03
            X.K6D r1 = (X.K6D) r1
            X.LO9 r0 = r1.A04
            if (r0 == 0) goto L_0x0d1d
            X.LBP r0 = r0.A03
            com.instagram.actionbar.ActionButton r0 = r0.A0D
            r0.setDisplayedChild(r2)
            X.KWU r5 = r1.A05
            if (r5 != 0) goto L_0x0d89
            java.lang.String r9 = "upcomingEventRepository"
            goto L_0x0d1d
        L_0x0d89:
            java.lang.Object r4 = r7.A01
            r7.A00 = r2
            X.4Cq r0 = r5.A01
            X.4Cc r3 = r0.ArX()
            r2 = 0
            r1 = 11
            X.MGD r0 = new X.MGD
            r0.<init>(r4, r5, r2, r1)
            java.lang.Object r1 = X.1Eo.A00(r7, r3, r0)
            if (r1 != r6) goto L_0x0ce6
            return r6
        L_0x0da2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0da7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0dac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0db1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0db6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGD) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGD(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A02 = i;
        this.A03 = obj;
    }
}
