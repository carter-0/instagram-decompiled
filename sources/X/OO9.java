package X;

import android.content.IntentFilter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class OO9 {
    public AnonymousClass0iw A00;
    public C66752Mbx A01;
    public C66752Mbx A02;
    public MYb A03;
    public AnonymousClass43G A04;
    public AnonymousClass43G A05;
    public AnonymousClass43G A06;
    public boolean A07;
    public C66752Mbx A08;
    public final UserSession A09;
    public final AnonymousClass439 A0A;
    public final MutedWordsFilterManager A0B;
    public final C67565Mpz A0C;
    public final C69004Ncg A0D;
    public final C70841ONs A0E;
    public final Set A0F;

    public final void A00() {
        this.A07 = true;
        AnonymousClass43G r1 = this.A06;
        if (r1 == null) {
            AnonymousClass439 r2 = this.A0A;
            synchronized (r2) {
                r1 = r2.A0A;
            }
            this.A06 = r1;
        }
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.direct.store.InboxNetworkSource");
        A04(r1);
        this.A08 = this.A02;
    }

    public final void A01(C272124k8 r3) {
        0qQ.A0B(r3, 0);
        if (this.A0F.add(r3)) {
            AnonymousClass43G r1 = this.A04;
            if (r1 == null) {
                0qQ.A0F("directCurrentSource");
                throw AnonymousClass00P.createAndThrow();
            }
            r1.A0C.add(r3);
            if (r1.A05) {
                r3.onStart();
            }
        }
    }

    public final void A04(AnonymousClass43G r6) {
        0qQ.A0B(r6, 0);
        Iterator it = this.A0F.iterator();
        AnonymousClass43G r1 = this.A04;
        if (r1 != null) {
            r1.A00 = null;
            while (it.hasNext()) {
                1P0 r12 = (1P0) it.next();
                AnonymousClass43G r0 = this.A04;
                if (r0 == null) {
                    0qQ.A0F("directCurrentSource");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0B(r12, 0);
                r0.A0C.remove(r12);
                r6.A0C.add(r12);
                if (r6.A05) {
                    r12.onStart();
                }
            }
        } else {
            while (it.hasNext()) {
                1P0 r13 = (1P0) it.next();
                0qQ.A0B(r13, 0);
                r6.A0C.add(r13);
                if (r6.A05) {
                    r13.onStart();
                }
            }
        }
        r6.A00 = this.A00;
        this.A04 = r6;
    }

    public final void A05(2Eo r4) {
        AnonymousClass43G r1;
        0qQ.A0B(r4, 0);
        this.A07 = false;
        AnonymousClass439 r2 = this.A0A;
        synchronized (r2) {
            r1 = (AnonymousClass43G) r2.A0B.get(r4);
        }
        this.A05 = r1;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.direct.store.InboxNetworkSource");
        A04(r1);
        this.A08 = this.A01;
    }

    public /* synthetic */ OO9(UserSession userSession) {
        IntentFilter intentFilter = AnonymousClass439.A0I;
        AnonymousClass439 A002 = C261854Be.A00(userSession);
        0qQ.A0B(A002, 2);
        this.A09 = userSession;
        this.A0A = A002;
        this.A0E = new C70841ONs(userSession);
        if (182.A06(0Tu.A05, userSession, 36313222638536517L)) {
            this.A03 = MYc.A01(userSession, "MessageRequestsNetworkSourceManager").A01;
        }
        this.A0F = AnonymousClass7TE.A1F();
        this.A0D = O0Z.A00(userSession);
        this.A0C = C67564Mpy.A00(userSession);
        this.A0B = AnonymousClass92E.A00(userSession);
    }

    public final void A02(C69375NkF nkF, C2611948q r26) {
        ArrayList A032;
        ArrayList arrayList;
        C67256Mkq mkq;
        boolean equals;
        String str;
        C2611948q r2 = r26;
        C69375NkF nkF2 = nkF;
        0qQ.A0B(nkF2, 0);
        AnonymousClass43G r0 = this.A04;
        if (r0 != null) {
            if (r0.A03) {
                C67565Mpz mpz = this.A0C;
                Integer num = AnonymousClass05K.A0C;
                if (this.A07) {
                    mkq = C67256Mkq.SPAM;
                } else {
                    mkq = C67256Mkq.PENDING;
                }
                mpz.A06(mkq, num);
                String str2 = nkF2.A03;
                0qQ.A0B(str2, 0);
                mpz.A03("filter_type", str2);
                if (mpz.A00 != num || !mpz.A01) {
                    mpz.A04("fetch_threads_server_start", (String) null);
                }
                mpz.A01 = true;
                boolean z = this.A07;
                C69004Ncg ncg = this.A0D;
                if (z) {
                    equals = "pending".equals("spam");
                } else {
                    equals = "pending".equals("pending");
                }
                if (equals) {
                    str = "fetch_threads_start_pending";
                } else {
                    str = "fetch_threads_start_other";
                }
                ncg.A04(str, "server");
            }
            if (this.A07 && !C272094k5.A0A(this.A09, true)) {
                r2 = C2611948q.ALL;
            } else if (r26 == null) {
                r2 = C271314ie.A00(nkF2.A01);
            }
            if (!this.A07 || C272094k5.A0A(this.A09, true)) {
                A032 = this.A0E.A03(nkF2.A01, false);
            } else {
                A032 = null;
            }
            AnonymousClass43G r3 = this.A04;
            if (r3 != null) {
                if (!r3.A05 && !r3.A04 && r3.A03) {
                    UserSession userSession = r3.A07;
                    2EM r9 = r3.A08;
                    String str3 = r3.A01;
                    String str4 = r3.A02;
                    Integer num2 = AnonymousClass05K.A01;
                    String A012 = C66681Mao.A01(userSession, r9.A01, r2);
                    String str5 = r3.A0A.A00;
                    if (A032 != null) {
                        arrayList = AnonymousClass43B.A01(A032);
                    } else {
                        arrayList = null;
                    }
                    C66716MbN A002 = C67314Mlo.A00(userSession, r9, (AnonymousClass7BV) null, false, num2, (Integer) null, (Integer) null, str3, str4, A012, str5, (String) null, AnonymousClass7TF.A0b(), arrayList, -1);
                    A002.A00(new C68438NHy(userSession, r3, AnonymousClass7TF.A1V(r3.A01)));
                    AnonymousClass43G.A00(A002, r3);
                }
                C66752Mbx mbx = this.A08;
                if (mbx != null) {
                    mbx.CgP(AnonymousClass43I.A00, r2);
                    return;
                }
                return;
            }
        }
        0qQ.A0F("directCurrentSource");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0339  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C69375NkF r32, X.C2611948q r33, boolean r34) {
        /*
            r31 = this;
            r3 = r33
            r13 = 0
            r4 = r32
            X.0qQ.A0B(r4, r13)
            r2 = r31
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0037
            X.MYb r7 = r2.A03
            if (r7 == 0) goto L_0x0037
            r0 = 681066249448173(0x26b6d17ddeaed, double:3.36491436394287E-309)
            java.lang.String r5 = java.lang.Long.toString(r0)
            r1 = 0
            java.lang.String r0 = "FBLegacyBroker"
            com.facebook.msys.mci.PrivacyContext r6 = com.facebook.msys.mci.PrivacyContextCoding.newPrivacyContextNative(r1, r0, r5)
            X.1aU r5 = r7.A0B
            r1 = 49
            X.Owf r0 = new X.Owf
            r0.<init>((java.lang.Object) r6, (int) r1)
            X.1aU r1 = X.C66581MXm.A0M(r0, r5)
            X.Oxf r0 = new X.Oxf
            r0.<init>()
            r1.A0V(r0)
        L_0x0037:
            r9 = 1
            boolean r0 = r2.A07
            X.Ncg r5 = r2.A0D
            if (r0 == 0) goto L_0x0268
            java.lang.String r1 = "spam"
            java.lang.String r0 = "pending"
            boolean r0 = r0.equals(r1)
        L_0x0046:
            if (r0 == 0) goto L_0x0264
            java.lang.String r1 = "fetch_threads_start_pending"
        L_0x004a:
            java.lang.String r0 = "server"
            r5.A04(r1, r0)
            boolean r0 = r2.A07
            r22 = 0
            if (r0 == 0) goto L_0x025e
            com.instagram.common.session.UserSession r0 = r2.A09
            boolean r0 = X.C272094k5.A0A(r0, r9)
            if (r0 != 0) goto L_0x025e
            X.48q r3 = X.C2611948q.ALL
        L_0x005f:
            X.Mpz r6 = r2.A0C
            java.lang.Integer r5 = r6.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            java.lang.String r1 = "fetch_threads_server_start"
            if (r5 != r0) goto L_0x006d
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x0072
        L_0x006d:
            r0 = r22
            r6.A04(r1, r0)
        L_0x0072:
            r6.A01 = r9
            boolean r0 = r2.A07
            java.lang.String r21 = "directCurrentSource"
            if (r0 == 0) goto L_0x00d5
            X.43G r4 = r2.A04
            if (r4 == 0) goto L_0x0344
            X.ONs r1 = r2.A0E
            com.instagram.common.session.UserSession r0 = r1.A00
            X.48t r0 = X.C2612048r.A00(r0)
            java.util.Set r0 = r0.A00
            java.util.List r0 = X.00k.A0a(r0)
            r4.A03(r3, r0)
            com.instagram.common.session.UserSession r0 = r2.A09
            boolean r0 = X.C272094k5.A08(r0)
            if (r0 == 0) goto L_0x0335
            X.43G r5 = r2.A04
            if (r5 == 0) goto L_0x0344
            java.util.ArrayList r7 = r1.A01()
        L_0x009f:
            com.instagram.common.session.UserSession r6 = r5.A07
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r7.iterator()
        L_0x00a9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0270
            java.lang.Object r0 = r8.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.lang.Object r0 = r0.second
            java.util.Iterator r1 = X.C51966G9m.A1H(r0)
        L_0x00bf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r0 = r1.next()
            X.Nkv r0 = (X.C69415Nkv) r0
            int r0 = r0.A00
            X.AnonymousClass7TF.A1M(r3, r0)
            goto L_0x00bf
        L_0x00d1:
            r4.add(r3)
            goto L_0x00a9
        L_0x00d5:
            X.43G r1 = r2.A04
            if (r1 == 0) goto L_0x0344
            java.lang.String r0 = X.AnonymousClass7TG.A0j()
            r1.A02 = r0
            com.instagram.common.session.UserSession r7 = r2.A09
            X.0Tu r6 = X.0Tu.A05
            r0 = 36311925559657272(0x81018100180338, double:3.027146168090788E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x029b
            r0 = 36593400536106232(0x820181001404f8, double:3.205152076605867E-306)
            int r20 = X.DbS.A04(r6, r7, r0)
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r0 = r2.A0B
            if (r0 == 0) goto L_0x025b
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x025b
            r0 = 36593400536171769(0x820181001504f9, double:3.2051520766473126E-306)
            int r11 = X.DbS.A04(r6, r7, r0)
        L_0x010a:
            r0 = 36593400536302842(0x820181001704fa, double:3.2051520767302037E-306)
            int r19 = X.DbS.A04(r6, r7, r0)
            X.43G r10 = r2.A04
            if (r10 == 0) goto L_0x0344
            X.ONs r0 = r2.A0E
            r29 = r0
            X.2Eo r1 = r4.A01
            r4 = r34
            java.util.ArrayList r1 = r0.A03(r1, r4)
            r0 = 4
            X.0qQ.A0B(r3, r0)
            java.lang.String r8 = X.AnonymousClass7TG.A0j()
            com.instagram.common.session.UserSession r5 = r10.A07
            java.lang.Integer r18 = java.lang.Integer.valueOf(r20)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r19)
            X.2EM r0 = r10.A08
            X.2EN r0 = r0.A01
            java.lang.String r16 = X.C66681Mao.A01(r5, r0, r3)
            X.2Eo r0 = r10.A0A
            java.lang.String r15 = r0.A00
            r11 = 0
            java.util.ArrayList r14 = X.AnonymousClass43B.A01(r1)
            r0 = 226417922(0xd7edd02, float:7.853582E-31)
            X.1FZ r4 = new X.1FZ
            r4.<init>(r5, r0, r9, r13)
            r4.A05()
            java.lang.String r0 = "direct_v2/pending_inbox_streaming/"
            r4.A0A(r0)
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            java.lang.Class<X.OOc> r0 = X.C70849OOc.class
            java.lang.Object r3 = r1.cast(r0)
            java.lang.Class r3 = (java.lang.Class) r3
            r3.getClass()
            X.1NX r1 = new X.1NX
            r0 = r22
            r1.<init>(r0)
            X.1Fj r0 = new X.1Fj
            r23 = r0
            r24 = r22
            r25 = r1
            r26 = r3
            r27 = r13
            r28 = r13
            r23.<init>(r24, r25, r26, r27, r28)
            r4.A00 = r0
            java.lang.String r3 = "true"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.AnonymousClass0oH.A01(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x019a
            java.lang.String r0 = "push_disabled"
            r4.A9m(r0, r3)
        L_0x019a:
            java.lang.String r0 = "persistentBadging"
            r4.A9m(r0, r3)
            if (r18 == 0) goto L_0x01af
            r0 = r20
            long r0 = (long) r0
            r22 = r0
            java.lang.String r1 = java.lang.Long.toString(r22)
            java.lang.String r0 = "thread_limit"
            r4.A9m(r0, r1)
        L_0x01af:
            if (r17 == 0) goto L_0x01c1
            int r0 = r17.intValue()
            long r0 = (long) r0
            r17 = r0
            java.lang.String r1 = java.lang.Long.toString(r17)
            java.lang.String r0 = "thread_message_limit"
            r4.A9m(r0, r1)
        L_0x01c1:
            if (r12 == 0) goto L_0x01d9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01d9
            r0 = r19
            long r0 = (long) r0
            java.lang.String r1 = java.lang.Long.toString(r0)
            java.lang.String r0 = "thread_batch_size"
            r4.A9m(r0, r1)
        L_0x01d9:
            java.lang.String r1 = "selected_filter"
            r0 = r16
            r4.A0G(r1, r0)
            java.lang.String r0 = "sort_order"
            r4.A0G(r0, r15)
            java.lang.String r1 = "is_prefetching"
            java.lang.String r0 = "false"
            r4.A9m(r1, r0)
            java.lang.String r0 = "igd_request_log_tracking_id"
            r4.A0G(r0, r8)
            X.65C r0 = X.AnonymousClass65B.A03
            java.lang.String r1 = r0.A02(r5)
            java.lang.String r0 = "eb_device_id"
            r4.A0G(r0, r1)
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0248
            r1 = 0
        L_0x0203:
            java.lang.String r0 = "message_request_selected_filters"
            r4.A0G(r0, r1)
            r0 = 36328375283629362(0x811077000c3d32, double:3.03754903976846E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 == 0) goto L_0x0218
            java.lang.String r0 = "is_inbox_ia_enabled"
            r4.A9m(r0, r3)
        L_0x0218:
            java.lang.String r1 = "visual_message_return_type"
            java.lang.String r0 = "unseen"
            r4.A9m(r1, r0)
            X.1GP r3 = r4.A0M()
            java.lang.String r0 = r10.A01
            if (r0 == 0) goto L_0x0228
            r11 = 1
        L_0x0228:
            X.NHy r1 = new X.NHy
            r1.<init>(r5, r10, r11)
            X.OsI r0 = new X.OsI
            r0.<init>(r5, r1, r10, r8)
            r3.A02(r0)
            X.AnonymousClass43G.A00(r3, r10)
            boolean r0 = X.C272094k5.A08(r7)
            if (r0 == 0) goto L_0x0335
            X.43G r5 = r2.A04
            if (r5 == 0) goto L_0x0344
            java.util.ArrayList r7 = r29.A01()
            goto L_0x009f
        L_0x0248:
            java.lang.String r9 = "["
            r0 = 44
            X.3El r0 = X.C239023El.A00(r0)
            java.lang.String r1 = r0.A02(r14)
            java.lang.String r0 = "]"
            java.lang.String r1 = X.002.A0g(r9, r1, r0)
            goto L_0x0203
        L_0x025b:
            r11 = 1
            goto L_0x010a
        L_0x025e:
            if (r33 != 0) goto L_0x005f
            X.48q r3 = r4.A02
            goto L_0x005f
        L_0x0264:
            java.lang.String r1 = "fetch_threads_start_other"
            goto L_0x004a
        L_0x0268:
            java.lang.String r0 = "pending"
            boolean r0 = r0.equals(r0)
            goto L_0x0046
        L_0x0270:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.lang.String r0 = ","
            X.3El r8 = new X.3El
            r8.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L_0x027f:
            boolean r0 = r4.hasNext()
            java.lang.String r3 = "]"
            java.lang.String r1 = "["
            if (r0 == 0) goto L_0x0307
            java.lang.Object r0 = r4.next()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r0 = r8.A02(r0)
            java.lang.String r0 = X.002.A0g(r1, r0, r3)
            r9.add(r0)
            goto L_0x027f
        L_0x029b:
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r0 = r2.A0B
            if (r0 == 0) goto L_0x02fd
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x02fd
            r0 = 36593400536106232(0x820181001404f8, double:3.205152076605867E-306)
            int r8 = X.DbS.A04(r6, r7, r0)
            r0 = 36593400536171769(0x820181001504f9, double:3.2051520766473126E-306)
            int r7 = X.DbS.A04(r6, r7, r0)
            X.43G r5 = r2.A04
            if (r5 == 0) goto L_0x0344
            r0 = 3
            X.0qQ.A0B(r3, r0)
            com.instagram.common.session.UserSession r4 = r5.A07
            X.2EM r6 = r5.A08
            java.lang.String r1 = r5.A02
            r29 = -1
            java.lang.Integer r20 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r7)
            X.2EN r0 = r6.A01
            java.lang.String r24 = X.C66681Mao.A01(r4, r0, r3)
            X.2Eo r0 = r5.A0A
            java.lang.String r0 = r0.A00
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r13)
            java.lang.String r27 = X.AnonymousClass7TF.A0b()
            r15 = r4
            r16 = r6
            r17 = r22
            r19 = r22
            r23 = r1
            r25 = r0
            r26 = r22
            r28 = r22
            X.MbN r3 = X.C67314Mlo.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.NHy r0 = new X.NHy
            r0.<init>(r4, r5, r13)
            r3.A00(r0)
            goto L_0x0332
        L_0x02fd:
            X.43G r1 = r2.A04
            if (r1 == 0) goto L_0x0344
            X.0sn r0 = X.0sn.A00
            r1.A03(r3, r0)
            goto L_0x0335
        L_0x0307:
            java.lang.String r0 = r8.A02(r9)
            java.lang.String r4 = X.002.A0g(r1, r0, r3)
            X.1NY r3 = X.DbU.A0O(r6)
            java.lang.String r0 = "direct_v2/get_filtered_pending_requests_preview/"
            r3.A0A(r0)
            java.lang.Class<X.NGz> r1 = X.NGz.class
            java.lang.Class<X.OQM> r0 = X.OQM.class
            r3.A0R(r1, r0)
            java.lang.String r0 = "pending_inbox_filtered_views"
            r3.A9m(r0, r4)
            r3.A0U = r13
            X.1OC r3 = r3.A0M()
            r1 = 4
            X.NHz r0 = new X.NHz
            r0.<init>(r6, r5, r7, r1)
            r3.A00 = r0
        L_0x0332:
            X.AnonymousClass43G.A00(r3, r5)
        L_0x0335:
            X.Mbx r2 = r2.A08
            if (r2 == 0) goto L_0x0343
            int r1 = r2.A00
            X.PCi r0 = new X.PCi
            r0.<init>(r1)
            X.C66752Mbx.A00(r2, r0)
        L_0x0343:
            return
        L_0x0344:
            X.0qQ.A0F(r21)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OO9.A03(X.NkF, X.48q, boolean):void");
    }

    public final boolean A06() {
        C66752Mbx mbx = this.A08;
        AnonymousClass43G r1 = this.A04;
        if (mbx == null) {
            if (r1 != null) {
                return r1.A05;
            }
        } else if (r1 != null) {
            if (r1.A05 || mbx.isLoading()) {
                return true;
            }
            return false;
        }
        0qQ.A0F("directCurrentSource");
        throw AnonymousClass00P.createAndThrow();
    }
}
