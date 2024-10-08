package X;

import android.os.SystemClock;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.nio.charset.Charset;
import java.util.List;

public final class B5C extends 1P0 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public B5C(Object obj, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = str;
    }

    public final void onFail(C268654dm r13) {
        int A032;
        int i;
        int i2;
        String str;
        String str2;
        Throwable th;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(-708097763);
                IgNetworkingModule igNetworkingModule = (IgNetworkingModule) this.A02;
                int i3 = this.A01;
                AnonymousClass1O8 unused = igNetworkingModule.removeRequest(i3);
                Class cls = IgNetworkingModule.TAG;
                Throwable A012 = r13.A01();
                String str3 = "Error while invoking request";
                0KC.A05(cls, str3, A012);
                T6E t6e = (T6E) r13.A00();
                if (A012 != null) {
                    str3 = A012.getMessage();
                } else if (t6e != null) {
                    str3 = new String(t6e.A01, Charset.forName(ReactWebViewManager.HTML_ENCODING));
                }
                igNetworkingModule.onRequestError(i3, str3);
                i = 237345394;
                break;
            case 1:
                A032 = AnonymousClass7TG.A0D(r13, 1284913533);
                B5C.super.onFail(r13);
                E26 e26 = (E26) this.A02;
                E26.A02(e26);
                E26.A05(e26, new TTQ(e26, this.A03, this.A01, 2));
                i = 305649274;
                break;
            default:
                A032 = AnonymousClass0fD.A03(1050291199);
                0qQ.A0B(r13, 0);
                B57 b57 = (B57) this.A02;
                C57342IXz iXz = b57.A02;
                Object A002 = r13.A00();
                1XQ r0 = (1XQ) A002;
                if (r0 != null) {
                    i2 = r0.mStatusCode;
                } else {
                    i2 = 0;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - b57.A00;
                if (182.A06(0Tu.A05, b57.A03, 36322280724244515L)) {
                    String A003 = AnonymousClass000.A00(1379);
                    1XP r5 = (1XP) A002;
                    if (r5 != null) {
                        str2 = r5.getErrorMessage();
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "n/a";
                    }
                    String A0R = 002.A0R(A003, str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(AnonymousClass000.A00(1376));
                    Throwable A013 = r13.A01();
                    if (A013 == null || (th = A013.getCause()) == null) {
                        th = "n/a";
                    }
                    str = 002.A0g(A0R, " | ", AnonymousClass7TF.A0i(th, sb));
                } else {
                    str = null;
                }
                C52167GHj gHj = (C52167GHj) iXz.A01;
                gHj.A0S.Ch0(str, i2, elapsedRealtime, gHj.A0E);
                gHj.A0E = false;
                C52167GHj.A02(gHj, (List) null);
                C52170GHm.A0B = false;
                i = 933545432;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-1201602048);
                i2 = 38508202;
                break;
            case 2:
                i = AnonymousClass0fD.A03(548433677);
                ((C52167GHj) ((B57) this.A02).A02.A01).A06 = AnonymousClass05K.A00;
                i2 = 1574850199;
                break;
            default:
                B5C.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(1809772276);
                E26.A03((E26) this.A02);
                i2 = 718207245;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1871890608);
                B57 b57 = (B57) this.A02;
                b57.A00 = SystemClock.elapsedRealtime();
                b57.A02.CsF(this.A01);
                i2 = -1444773364;
                break;
            default:
                B5C.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02e1, code lost:
        r0 = "trackingToken";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r54) {
        /*
            r53 = this;
            r5 = r53
            r4 = r54
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0556;
                case 1: goto L_0x04c6;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -1261744423(0xffffffffb4cb4ed9, float:-3.7869066E-7)
            int r19 = X.AnonymousClass0fD.A03(r0)
            X.B5E r4 = (X.B5E) r4
            r0 = 662781381(0x27813dc5, float:3.5871663E-15)
            int r20 = X.AnonymousClass0fD.A03(r0)
            r9 = 0
            X.0qQ.A0B(r4, r9)
            java.lang.Object r0 = r5.A02
            X.B57 r0 = (X.B57) r0
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.List r1 = r4.A02
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            X.0qQ.A07(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x0032:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x01fe
            java.lang.Object r3 = r10.next()
            X.B7p r3 = (X.C41938B7p) r3
            X.Cw7 r1 = r3.A0E
            if (r1 == 0) goto L_0x008b
            com.instagram.common.session.UserSession r8 = r0.A03
            X.0Tu r6 = X.0Tu.A05
            r1 = 36318106016290686(0x8107200004177e, double:3.0310547137524605E-306)
            boolean r1 = X.182.A06(r6, r8, r1)
            if (r1 == 0) goto L_0x0032
            X.Cw7 r2 = r3.A0E
            if (r2 == 0) goto L_0x0032
            X.ILw r1 = new X.ILw
            r1.<init>(r2)
            X.4bN r6 = new X.4bN
            r6.<init>((X.C267334bO) r1)
            X.2vo r3 = r3.A0H
        L_0x0061:
            r22 = 0
            r30 = 16382(0x3ffe, float:2.2956E-41)
            X.2vl r2 = new X.2vl
            r23 = r3
            r24 = r22
            r25 = r9
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r9
            r31 = r9
            r32 = r9
            r33 = r9
            r34 = r9
            r21 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0082:
            X.9Ie r1 = new X.9Ie
            r1.<init>(r6, r2)
        L_0x0087:
            r7.add(r1)
            goto L_0x0032
        L_0x008b:
            boolean r1 = r4.A05
            if (r1 == 0) goto L_0x016e
            java.util.List r1 = r3.A02()
            r6 = 0
            java.lang.Object r1 = r1.get(r9)
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Long r2 = r3.A0Q
            if (r2 == 0) goto L_0x00a3
            X.1Xy r1 = r1.A0C
            r1.EQ7(r2)
        L_0x00a3:
            X.GV9 r2 = new X.GV9
            r2.<init>()
            java.util.List r1 = r3.A02()
            java.lang.Object r1 = r1.get(r9)
            X.1Xj r1 = (X.1Xj) r1
            r2.A0L = r1
            X.3xy r1 = r3.A0B
            r2.A0J = r1
            X.3xi r1 = r3.A05
            r2.A08 = r1
            java.lang.String r1 = r3.A0V
            r2.A0e = r1
            java.lang.String r1 = r3.A0S
            r2.A0a = r1
            X.3y3 r1 = r3.A0C
            r2.A0K = r1
            java.lang.String r1 = r3.A0X
            if (r1 == 0) goto L_0x01f0
            r2.A0g = r1
            java.util.List r1 = r3.A0h
            if (r1 == 0) goto L_0x01ec
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            r2.A0q = r1
            java.lang.String r1 = r3.A0c
            if (r1 == 0) goto L_0x02e1
            r2.A0l = r1
            java.lang.String r1 = r3.A0T
            if (r1 == 0) goto L_0x01e8
            r2.A0b = r1
            java.util.List r1 = r3.A0e
            if (r1 == 0) goto L_0x02e7
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            r2.A00 = r1
            java.lang.String r1 = r3.A0R
            r2.A0Z = r1
            X.3xc r1 = r3.A01
            r2.A02 = r1
            java.util.List r1 = r3.A0d
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            r2.A0m = r1
            java.lang.String r1 = r3.A0Y
            r2.A0h = r1
            X.2vo r8 = r3.A0H
            r22 = 0
            r30 = 16382(0x3ffe, float:2.2956E-41)
            X.2vl r1 = new X.2vl
            r23 = r8
            r24 = r22
            r25 = r9
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r9
            r31 = r9
            r32 = r9
            r33 = r9
            r34 = r9
            r21 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r2.A00 = r1
            X.3y9 r1 = r3.A0F
            r2.A0P = r1
            X.3yB r1 = r3.A0G
            r2.A0Q = r1
            java.lang.Boolean r1 = r3.A0M
            r2.A0U = r1
            r1 = 1
            r2.A0r = r1
            java.lang.String r1 = r3.A0b
            r2.A0j = r1
            java.util.List r1 = r3.A0f
            r2.A0o = r1
            java.lang.Integer r1 = r3.A0P
            r2.A0X = r1
            X.4gF r1 = r3.A0A
            r2.A0G = r1
            java.lang.Boolean r1 = r3.A0L
            if (r1 == 0) goto L_0x014e
            boolean r6 = r1.booleanValue()
        L_0x014e:
            r2.A0s = r6
            X.GV8 r2 = r2.A01()
            r1 = 1636(0x664, float:2.293E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            X.4bN r6 = X.C295375o3.A03(r2)
            X.2vo r1 = r3.A0H
            X.2vl r2 = new X.2vl
            r23 = r1
            r21 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0082
        L_0x016e:
            X.CtZ r8 = r3.A0D
            if (r8 == 0) goto L_0x01e2
            com.instagram.common.session.UserSession r6 = r0.A03
            X.0Tu r3 = X.0Tu.A05
            r1 = 2342155883961124147(0x2081025e00180533, double:4.059544270476401E-152)
            boolean r1 = X.182.A06(r3, r6, r1)
            if (r1 == 0) goto L_0x0032
            java.util.List r2 = r8.A01
            r1 = 10
            int r1 = X.0Yv.A1E(r2, r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x0192:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x01a6
            java.lang.Object r1 = r2.next()
            X.B7p r1 = (X.C41938B7p) r1
            X.GV8 r1 = r1.A01()
            r6.add(r1)
            goto L_0x0192
        L_0x01a6:
            com.instagram.api.schemas.IntentAwareAdsInfo r1 = r8.A00
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x01f9
            java.lang.String r3 = r1.A06
            if (r3 == 0) goto L_0x01b8
            java.lang.String r1 = "0"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01c0
        L_0x01b8:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r3 = r1.toString()
        L_0x01c0:
            X.0qQ.A0A(r3)
            com.instagram.api.schemas.IntentAwareAdsInfo r1 = r8.A00
            if (r1 == 0) goto L_0x01f4
            X.9Iz r2 = new X.9Iz
            r2.<init>((com.instagram.api.schemas.IntentAwareAdsInfoIntf) r1, (java.lang.String) r3, (java.util.List) r6)
            java.util.List r1 = r8.A01
            java.lang.Object r1 = X.00k.A0I(r1)
            X.B7p r1 = (X.C41938B7p) r1
            X.2vo r3 = r1.A0H
            java.lang.Object r1 = X.00k.A0I(r6)
            X.3OA r1 = (X.AnonymousClass3OA) r1
            X.4bN r6 = X.C295375o3.A01(r2, r1)
            goto L_0x0061
        L_0x01e2:
            X.9Ie r1 = r3.A00()
            goto L_0x0087
        L_0x01e8:
            java.lang.String r0 = "adTitle"
            goto L_0x02e9
        L_0x01ec:
            java.lang.String r0 = "hideReasons"
            goto L_0x02e9
        L_0x01f0:
            java.lang.String r0 = "label"
            goto L_0x02e9
        L_0x01f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x01f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x01fe:
            com.instagram.common.session.UserSession r3 = r0.A03
            X.0Tu r8 = X.0Tu.A06
            r1 = 36313725150431444(0x810324001008d4, double:3.028284236542745E-306)
            boolean r1 = X.182.A06(r8, r3, r1)
            if (r1 != 0) goto L_0x022e
            r1 = 36319480405564857(0x81086000001db9, double:3.0319238830636677E-306)
            boolean r1 = X.182.A06(r8, r3, r1)
            if (r1 != 0) goto L_0x022e
            r1 = 36320618571899562(0x810969000022aa, double:3.032643664036763E-306)
            boolean r1 = X.182.A06(r8, r3, r1)
            if (r1 != 0) goto L_0x022e
            r1 = 36325205596975836(0x810d95000032dc, double:3.035544517165466E-306)
            boolean r1 = X.182.A06(r8, r3, r1)
            if (r1 == 0) goto L_0x02f1
        L_0x022e:
            java.util.List r1 = r4.A04
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            X.0qQ.A07(r1)
            java.util.Iterator r16 = r1.iterator()
        L_0x023b:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x02f1
            java.lang.Object r13 = r16.next()
            X.CwE r13 = (X.C45434CwE) r13
            java.lang.String r1 = r13.A0A
            r27 = r1
            java.lang.String r12 = r13.A0C
            if (r12 == 0) goto L_0x02e4
            java.lang.Integer r1 = r13.A04
            r24 = r1
            java.lang.String r11 = r13.A0E
            if (r11 == 0) goto L_0x02e1
            X.1Xj r1 = r13.A02
            r23 = r1
            java.lang.String r1 = r13.A0D
            r30 = r1
            java.lang.String r1 = r13.A0B
            r31 = r1
            java.lang.String r1 = r13.A08
            r32 = r1
            java.lang.String r1 = r13.A06
            r22 = r1
            java.lang.String r1 = r13.A07
            r21 = r1
            boolean r1 = r13.A0G
            r18 = r1
            java.lang.Long r1 = r13.A05
            r17 = r1
            java.lang.String r15 = r13.A09
            X.B7n r14 = r13.A00
            java.util.List r10 = r13.A0F
            X.Cta r1 = r13.A01
            r40 = 0
            if (r1 == 0) goto L_0x02dd
            java.util.List r6 = r1.A01
            java.lang.String r2 = r1.A00
        L_0x0287:
            java.lang.Integer r25 = java.lang.Integer.valueOf(r9)
            X.GmE r1 = new X.GmE
            r26 = r17
            r28 = r12
            r29 = r11
            r33 = r22
            r34 = r21
            r35 = r15
            r36 = r2
            r37 = r10
            r38 = r6
            r39 = r18
            r21 = r1
            r22 = r14
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.GYO r2 = new X.GYO
            r2.<init>(r1)
            X.4bN r6 = new X.4bN
            r6.<init>((X.C267334bO) r2)
            X.2vo r1 = r13.A03
            r48 = 16382(0x3ffe, float:2.2956E-41)
            X.2vl r2 = new X.2vl
            r39 = r2
            r41 = r1
            r42 = r40
            r43 = r9
            r44 = r9
            r45 = r9
            r46 = r9
            r47 = r9
            r49 = r9
            r50 = r9
            r51 = r9
            r52 = r9
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            X.9Ie r1 = new X.9Ie
            r1.<init>(r6, r2)
            r7.add(r1)
            goto L_0x023b
        L_0x02dd:
            r6 = r40
            r2 = r6
            goto L_0x0287
        L_0x02e1:
            java.lang.String r0 = "trackingToken"
            goto L_0x02e9
        L_0x02e4:
            java.lang.String r0 = "netegoType"
            goto L_0x02e9
        L_0x02e7:
            java.lang.String r0 = "cookies"
        L_0x02e9:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02f1:
            X.0Tu r6 = X.0Tu.A05
            r1 = 36318556990478608(0x810789002c1910, double:3.03133991164483E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            if (r1 == 0) goto L_0x0308
            r2 = 3
            X.DIA r1 = new X.DIA
            r1.<init>(r2)
            java.util.List r7 = X.00k.A0g(r7, r1)
        L_0x0308:
            r1 = 36318556990347534(0x810789002a190e, double:3.031339911561938E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            if (r1 == 0) goto L_0x0396
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0396
            java.util.ArrayList r13 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x0321:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0341
            java.lang.Object r1 = r2.next()
            X.9Ie r1 = (X.C376489Ie) r1
            java.lang.Object r1 = r1.A04
            X.2vm r1 = (X.C233472vm) r1
            if (r1 == 0) goto L_0x033f
            int r1 = r1.A09()
        L_0x0337:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.add(r1)
            goto L_0x0321
        L_0x033f:
            r1 = -1
            goto L_0x0337
        L_0x0341:
            java.util.List r1 = X.00k.A0Z(r13)
            boolean r1 = X.0qQ.A0K(r1, r13)
            if (r1 != 0) goto L_0x0396
            java.util.List r1 = r4.A02
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            X.0qQ.A07(r1)
            java.util.ArrayList r12 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x035c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0374
            java.lang.Object r1 = r2.next()
            X.B7p r1 = (X.C41938B7p) r1
            X.2vo r1 = r1.A0H
            if (r1 == 0) goto L_0x0372
            java.lang.Integer r1 = r1.A0G
        L_0x036e:
            r12.add(r1)
            goto L_0x035c
        L_0x0372:
            r1 = 0
            goto L_0x036e
        L_0x0374:
            X.0wj r11 = X.0wj.A01
            r10 = 976028688(0x3a2d0410, float:6.6000316E-4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "Sponsored Item Delivery Discrepancy, indexList: "
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = "response: "
            r2.append(r1)
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r12, r2)
            X.0f9 r1 = r11.AEf(r1, r10)
            r1.report()
        L_0x0396:
            X.IXz r15 = r0.A02
            int r14 = r4.mStatusCode
            java.util.HashMap r1 = r4.A00
            java.util.Map r18 = java.util.Collections.unmodifiableMap(r1)
            java.util.List r1 = r4.A03
            r42 = r1
            long r39 = android.os.SystemClock.elapsedRealtime()
            long r1 = r0.A00
            long r39 = r39 - r1
            boolean r34 = r4.CPt()
            java.lang.String r1 = r5.A03
            r17 = r1
            int r5 = r5.A01
            X.0qQ.A0B(r7, r9)
            java.lang.Object r4 = r15.A01
            X.GHj r4 = (X.C52167GHj) r4
            X.2vI r13 = r4.A0S
            boolean r12 = r4.A0E
            X.0sn r30 = X.0sn.A00
            java.lang.String r11 = r4.A0Y
            boolean r10 = r4.A0F
            java.lang.Integer r2 = r4.A05
            int r1 = r4.A01
            java.lang.Integer r23 = java.lang.Integer.valueOf(r1)
            boolean r1 = r4.A0G
            r24 = 0
            X.4LN r21 = new X.4LN
            r22 = r2
            r25 = r11
            r26 = r24
            r27 = r24
            r28 = r24
            r29 = r24
            r31 = r10
            r32 = r1
            r33 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r35 = r13
            r36 = r21
            r37 = r7
            r38 = r14
            r41 = r12
            r35.Ch2(r36, r37, r38, r39, r41)
            r4.A0E = r9
            com.instagram.common.session.UserSession r14 = r4.A0P
            boolean r1 = X.1KU.A04(r14)
            if (r1 == 0) goto L_0x0475
            java.util.Iterator r16 = r7.iterator()
        L_0x0405:
            boolean r1 = r16.hasNext()
            r13 = 1
            r12 = -1
            if (r1 == 0) goto L_0x044b
            java.lang.Object r11 = r16.next()
            X.9Ie r11 = (X.C376489Ie) r11
            if (r34 == 0) goto L_0x0405
            java.lang.Object r2 = r11.A03
            X.4bN r2 = (X.C267324bN) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r2.A0D(r1)
            X.GM9 r1 = r4.A0U
            int r10 = r1.A00
            r1 = 36318509746886860(0x81077e003c18cc, double:3.0313100346071736E-306)
            boolean r1 = X.182.A06(r6, r14, r1)
            if (r1 == 0) goto L_0x0405
            if (r10 == r12) goto L_0x0405
            if (r5 == r12) goto L_0x0405
            if (r10 == r5) goto L_0x0405
            if (r10 != 0) goto L_0x0436
            r10 = 1
        L_0x0436:
            if (r5 == 0) goto L_0x0439
            r13 = r5
        L_0x0439:
            java.lang.Object r2 = r11.A04
            X.2vm r2 = (X.C233472vm) r2
            if (r2 == 0) goto L_0x0405
            int r1 = r2.A09()
            int r10 = r10 - r13
            int r1 = r1 - r10
            if (r1 <= 0) goto L_0x0405
            r2.A0B(r1)
            goto L_0x0405
        L_0x044b:
            if (r17 == 0) goto L_0x0475
            X.GM9 r10 = r4.A0U
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r11 = r7.iterator()
        L_0x0457:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0469
            java.lang.Object r1 = r11.next()
            X.9Ie r1 = (X.C376489Ie) r1
            java.lang.Object r1 = r1.A03
            r2.add(r1)
            goto L_0x0457
        L_0x0469:
            boolean r1 = X.1KU.A04(r14)
            if (r1 == 0) goto L_0x0471
            if (r34 == 0) goto L_0x0472
        L_0x0471:
            r5 = -1
        L_0x0472:
            r10.A01(r5, r13, r2)
        L_0x0475:
            r2 = r18
            r1 = r42
            X.C52167GHj.A03(r4, r7, r1, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r15.Dlz(r1, r7)
            X.C52170GHm.A0B = r9
            java.util.Iterator r5 = r7.iterator()
        L_0x0487:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x04b9
            java.lang.Object r1 = r5.next()
            X.9Ie r1 = (X.C376489Ie) r1
            java.lang.Object r1 = r1.A03
            X.4bN r1 = (X.C267324bN) r1
            X.1Xj r4 = r1.A02
            if (r4 == 0) goto L_0x0487
            r1 = 36320622866866859(0x81096a000022ab, double:3.032646380191376E-306)
            boolean r1 = X.182.A06(r8, r3, r1)
            if (r1 != 0) goto L_0x04b1
            r1 = 36320622866932396(0x81096a000122ac, double:3.032646380232822E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            if (r1 == 0) goto L_0x0487
        L_0x04b1:
            android.content.Context r2 = r0.A01
            java.lang.String r1 = ""
            X.C297715sD.A00(r2, r3, r4, r1)
            goto L_0x0487
        L_0x04b9:
            r1 = -1152666431(0xffffffffbb4bb4c1, float:-0.003108308)
            r0 = r20
            X.AnonymousClass0fD.A0A(r1, r0)
            r1 = -1495516415(0xffffffffa6dc3b01, float:-1.528156E-15)
            goto L_0x057d
        L_0x04c6:
            r0 = -410686279(0xffffffffe7856cb9, float:-1.2601606E24)
            int r19 = X.AnonymousClass0fD.A03(r0)
            X.371 r4 = (X.AnonymousClass371) r4
            r0 = 1653951653(0x62954ca5, float:1.3770438E21)
            int r3 = X.AnonymousClass7TG.A0D(r4, r0)
            X.B5C.super.onSuccess(r4)
            java.lang.Object r6 = r5.A02
            X.E26 r6 = (X.E26) r6
            X.E26.A02(r6)
            X.E26.A01(r6)
            java.lang.Object r0 = r4.FH3()
            X.EtB r0 = (X.EtB) r0
            com.instagram.user.model.User r1 = r0.A00
            X.0eM r2 = r6.A0N
            java.lang.Object r0 = r2.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.17i r0 = X.17h.A00(r0)
            r0.A03(r1)
            java.lang.Object r0 = r2.getValue()
            X.0lg r0 = (X.0lg) r0
            r1.A0d(r0)
            java.lang.String r1 = r5.A03
            X.2ZQ r5 = X.C71172bH.A00()
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L_0x053e
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0529
            if (r1 == 0) goto L_0x0529
            android.net.Uri r0 = r6.A01
            if (r0 == 0) goto L_0x0529
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 2108(0x83c, float:2.954E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putString(r0, r1)
        L_0x0529:
            java.lang.Object r2 = r2.getValue()
            X.0lg r2 = (X.0lg) r2
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            r0 = 562(0x232, float:7.88E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A03(r5, r4, r2, r1, r0)
            r0.A0C(r5)
        L_0x053e:
            r0 = 1
            r6.A0B = r0
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.00N r0 = r0.getOnBackPressedDispatcher()
            r0.A04()
            r0 = -444979524(0xffffffffe57a26bc, float:-7.3831634E22)
            X.AnonymousClass0fD.A0A(r0, r3)
            r1 = -1335581394(0xffffffffb064a52e, float:-8.318065E-10)
            goto L_0x057d
        L_0x0556:
            r0 = -289299981(0xffffffffeec1a1f3, float:-2.9963196E28)
            int r19 = X.AnonymousClass0fD.A03(r0)
            X.T6E r4 = (X.T6E) r4
            r0 = 1214780627(0x486814d3, float:237651.3)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A02
            com.instagram.react.modules.base.IgNetworkingModule r2 = (com.instagram.react.modules.base.IgNetworkingModule) r2
            int r1 = r5.A01
            X.AnonymousClass1O8 unused = r2.removeRequest(r1)
            java.lang.String r0 = r5.A03
            r2.onRequestSuccess(r1, r4, r0)
            r0 = -1186430120(0xffffffffb9488358, float:-1.9122416E-4)
            X.AnonymousClass0fD.A0A(r0, r3)
            r1 = -1634364931(0xffffffff9e9591fd, float:-1.5836368E-20)
        L_0x057d:
            r0 = r19
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B5C.onSuccess(java.lang.Object):void");
    }
}
