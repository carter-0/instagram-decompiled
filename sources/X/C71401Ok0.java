package X;

import android.view.View;

/* renamed from: X.Ok0  reason: case insensitive filesystem */
public final class C71401Ok0 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C71401Ok0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C71401Ok0 A00(Object obj, int i) {
        return new C71401Ok0(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C71401Ok0(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r1v365, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v369, types: [X.ODt, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v7, types: [X.Mq3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v8, types: [X.Mq3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v4, types: [X.OMl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v526, types: [java.lang.Object, X.OBn] */
    /* JADX WARNING: type inference failed for: r6v49, types: [java.lang.Object, X.OBn] */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0585, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x081c, code lost:
        r14 = "userSession";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x1210, code lost:
        r12 = "delegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        X.0qQ.A0F(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x136e, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x1371, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x147a, code lost:
        r12 = "logger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x147d, code lost:
        r12 = "userSession";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x147f, code lost:
        X.0qQ.A0F(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x1486, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x1498, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x149b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x076c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r26) {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.A00
            r5 = r26
            switch(r0) {
                case 0: goto L_0x1487;
                case 1: goto L_0x13cf;
                case 2: goto L_0x13a7;
                case 3: goto L_0x1392;
                case 4: goto L_0x134b;
                case 5: goto L_0x1336;
                case 6: goto L_0x1268;
                case 7: goto L_0x1253;
                case 8: goto L_0x123e;
                case 9: goto L_0x03fe;
                case 10: goto L_0x03e5;
                case 11: goto L_0x1229;
                case 12: goto L_0x03bd;
                case 13: goto L_0x1214;
                case 14: goto L_0x038b;
                case 15: goto L_0x11c8;
                case 16: goto L_0x11b5;
                case 17: goto L_0x11a4;
                case 18: goto L_0x0dc4;
                case 19: goto L_0x061e;
                case 20: goto L_0x1187;
                case 21: goto L_0x0589;
                case 22: goto L_0x04be;
                case 23: goto L_0x110a;
                case 24: goto L_0x10f9;
                case 25: goto L_0x107c;
                case 26: goto L_0x0365;
                case 27: goto L_0x0820;
                case 28: goto L_0x1032;
                case 29: goto L_0x101f;
                case 30: goto L_0x0fff;
                case 31: goto L_0x0fdf;
                case 32: goto L_0x0fca;
                case 33: goto L_0x0fb9;
                case 34: goto L_0x0fa8;
                case 35: goto L_0x0e73;
                case 36: goto L_0x0e5c;
                case 37: goto L_0x0e41;
                case 38: goto L_0x0e22;
                case 39: goto L_0x0e03;
                case 40: goto L_0x0de4;
                case 41: goto L_0x02fa;
                case 42: goto L_0x0226;
                case 43: goto L_0x0da6;
                case 44: goto L_0x0d77;
                case 45: goto L_0x0d51;
                case 46: goto L_0x0cfc;
                case 47: goto L_0x0ce9;
                case 48: goto L_0x0cc3;
                case 49: goto L_0x0cb0;
                case 50: goto L_0x0c5b;
                case 51: goto L_0x0417;
                case 52: goto L_0x0c48;
                case 53: goto L_0x0c35;
                case 54: goto L_0x0c22;
                case 55: goto L_0x0c0f;
                case 56: goto L_0x0bfc;
                case 57: goto L_0x0be9;
                case 58: goto L_0x0bd6;
                case 59: goto L_0x0bc3;
                case 60: goto L_0x0b7e;
                case 61: goto L_0x0b6d;
                case 62: goto L_0x0adb;
                case 63: goto L_0x0ab6;
                case 64: goto L_0x0aa3;
                case 65: goto L_0x0a8c;
                case 66: goto L_0x0a75;
                case 67: goto L_0x087f;
                case 68: goto L_0x0868;
                case 69: goto L_0x0851;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 2068304809(0x7b47d3a9, float:1.03756005E36)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.NJC r0 = (X.NJC) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0nA.A0J(r1)
            X.Oam r11 = r0.A04
            if (r11 != 0) goto L_0x0029
            java.lang.String r14 = "controller"
        L_0x0021:
            X.0qQ.A0F(r14)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0029:
            boolean r1 = X.C71067Oam.A02(r11)
            if (r1 == 0) goto L_0x0582
            java.util.List r1 = r11.A0B
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x0039:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0054
            java.lang.Object r2 = r4.next()
            r1 = r2
            X.N5m r1 = (X.C68197N5m) r1
            java.lang.CharSequence r1 = r1.A00
            if (r1 == 0) goto L_0x0039
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0039
            r6.add(r2)
            goto L_0x0039
        L_0x0054:
            r5 = 10
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r7 = r6.iterator()
        L_0x005e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0083
            java.lang.Object r2 = r7.next()
            X.N5m r2 = (X.C68197N5m) r2
            java.lang.CharSequence r1 = r2.A00
            if (r1 == 0) goto L_0x0074
            java.lang.String r6 = r1.toString()
            if (r6 != 0) goto L_0x0076
        L_0x0074:
            java.lang.String r6 = ""
        L_0x0076:
            boolean r4 = r2.A01
            r2 = 11
            X.Jvk r1 = new X.Jvk
            r1.<init>((java.lang.String) r6, (boolean) r4, (int) r2)
            r8.add(r1)
            goto L_0x005e
        L_0x0083:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Map r7 = r11.A0D
            java.util.Set r1 = r7.keySet()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r1.iterator()
        L_0x0095:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00c0
            java.lang.Object r1 = r12.next()
            long r1 = X.AnonymousClass7TE.A0R(r1)
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            java.lang.Object r6 = r7.get(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0095
            boolean r10 = r6.booleanValue()
            X.OBn r6 = new X.OBn
            r6.<init>()
            r6.A00 = r1
            r6.A01 = r10
            r9.add(r6)
            goto L_0x0095
        L_0x00c0:
            java.util.List r1 = r11.A0C
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r1.iterator()
        L_0x00ca:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00eb
            java.lang.Object r6 = r11.next()
            r2 = r6
            com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel r2 = (com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel) r2
            boolean r1 = r2.A06
            if (r1 == 0) goto L_0x00ca
            long r1 = r2.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r1 = r7.containsKey(r1)
            if (r1 != 0) goto L_0x00ca
            r10.add(r6)
            goto L_0x00ca
        L_0x00eb:
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x00f3:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0110
            java.lang.Object r1 = r10.next()
            com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel r1 = (com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel) r1
            long r6 = r1.A01
            boolean r2 = r1.A06
            X.OBn r1 = new X.OBn
            r1.<init>()
            r1.A00 = r6
            r1.A01 = r2
            r11.add(r1)
            goto L_0x00f3
        L_0x0110:
            r4.addAll(r9)
            r4.addAll(r11)
            X.OMl r15 = new X.OMl
            r15.<init>()
            r15.A02 = r8
            r15.A01 = r4
            android.view.View r1 = r0.A00
            X.AnonymousClass7TF.A16(r1)
            android.view.View r1 = r0.A01
            X.AnonymousClass7TH.A0R(r1)
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x01d1
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.List r1 = r15.A02
            if (r1 == 0) goto L_0x0158
            java.util.Iterator r4 = r1.iterator()
        L_0x013d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0158
            java.lang.Object r2 = r4.next()
            X.Jvk r2 = (X.C61046Jvk) r2
            java.lang.String r1 = r2.A00
            r8.add(r1)
            boolean r1 = r2.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r9.add(r1)
            goto L_0x013d
        L_0x0158:
            X.Oam r1 = r0.A04
            java.lang.String r14 = "controller"
            r4 = 0
            if (r1 == 0) goto L_0x0021
            X.3sy r1 = r1.A07
            java.lang.String r1 = X.C66647MaG.A0B(r1)
            if (r1 == 0) goto L_0x0582
            java.lang.Long r1 = X.00y.A0n(r5, r1)
            if (r1 == 0) goto L_0x0582
            long r1 = r1.longValue()
            com.instagram.model.direct.threadkey.impl.MsysThreadId r7 = X.C66580MXl.A0j(r4, r1)
            X.1a8 r4 = r0.A0C
            X.PCP r6 = r0.A07
            if (r6 != 0) goto L_0x017f
            java.lang.String r14 = "msysThreadActionsManager"
            goto L_0x0021
        L_0x017f:
            X.Oam r1 = r0.A04
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = r1.A0A
            long r13 = java.lang.Long.parseLong(r1)
            java.util.List r1 = r15.A01
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            if (r1 == 0) goto L_0x01ab
            java.util.Iterator r5 = r1.iterator()
        L_0x0195:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x01ab
            java.lang.Object r2 = r5.next()
            X.OBn r2 = (X.C70565OBn) r2
            boolean r1 = r2.A01
            if (r1 == 0) goto L_0x0195
            long r1 = r2.A00
            X.AnonymousClass7TE.A1Y(r10, r1)
            goto L_0x0195
        L_0x01ab:
            X.6Ea r1 = X.PCP.A00(r6)
            long r11 = X.C66580MXl.A07(r7)
            X.1aU r1 = r1.A02
            java.lang.String r2 = "TamClientPollUpdate"
            X.OvG r7 = new X.OvG
            r7.<init>(r8, r9, r10, r11, r13)
            X.1aU r1 = r1.A0M(r7)
            X.1aU r2 = X.C66582MXn.A0N(r1, r2)
            X.OwY r1 = X.C72113OwY.A00
            X.1aU r2 = r2.A0L(r1)
            r1 = 25
            X.PU8.A00(r2, r4, r0, r1)
            goto L_0x0582
        L_0x01d1:
            X.Oam r2 = r0.A04
            java.lang.String r14 = "controller"
            if (r2 == 0) goto L_0x0021
            X.3sy r8 = r2.A07
            X.O76 r1 = r0.A05
            if (r1 != 0) goto L_0x01e1
            java.lang.String r14 = "logger"
            goto L_0x0021
        L_0x01e1:
            java.lang.String r13 = r2.A0A
            X.0wc r2 = r1.A00
            java.lang.String r1 = "submit_existing_poll"
            X.0Aj r10 = X.AnonymousClass7TE.A0e(r2, r1)
            java.util.List r1 = r15.A02
            r6 = 0
            if (r1 == 0) goto L_0x0217
            int r1 = r1.size()
            long r4 = (long) r1
        L_0x01f6:
            java.util.List r9 = r15.A01
            if (r9 == 0) goto L_0x0520
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r9.iterator()
        L_0x0202:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x021a
            java.lang.Object r2 = r6.next()
            r1 = r2
            X.OBn r1 = (X.C70565OBn) r1
            boolean r1 = r1.A01
            if (r1 == 0) goto L_0x0202
            r7.add(r2)
            goto L_0x0202
        L_0x0217:
            r4 = 0
            goto L_0x01f6
        L_0x021a:
            int r1 = r7.size()
            long r1 = (long) r1
            int r6 = r9.size()
            long r6 = (long) r6
            goto L_0x0522
        L_0x0226:
            java.lang.Object r5 = r1.A01
            X.NJ6 r5 = (X.NJ6) r5
            X.OLT r0 = r5.A02
            r0.getClass()
            X.OLT r0 = r5.A02
            java.util.List r0 = r0.A04
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            int r6 = r7.size()
            java.util.Set r4 = r5.A0C
            int r0 = r4.size()
            if (r0 != r6) goto L_0x025e
            r4.clear()
        L_0x0246:
            X.NJ6.A00(r5)
            X.MvC r0 = r5.A01
            r0.notifyDataSetChanged()
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x0588
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = r0.A03(r1)
            r0.A0T()
            return
        L_0x025e:
            java.lang.String r8 = r5.A03
            if (r8 == 0) goto L_0x0297
            com.instagram.common.session.UserSession r0 = r5.A00
            X.Oy7 r3 = X.O14.A00(r0)
            java.lang.String r2 = r5.A04
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.0wc r0 = r3.A00
            X.1Ln r1 = X.1Ln.A0F(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0297
            com.instagram.common.session.UserSession r0 = r3.A01
            X.Dbb.A1G(r1, r0)
            java.lang.String r0 = "jcs_select_all_recipients"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "jcs_recipient_selection"
            r1.A0p(r0)
            java.lang.String r0 = "story"
            X.Dba.A1E(r1, r0)
            r1.A0s(r2)
            r1.A0v(r8)
            r1.Cgf()
        L_0x0297:
            X.OLT r0 = r5.A02
            int r1 = r0.A01
            int r0 = r1 + r6
            r3 = 250(0xfa, float:3.5E-43)
            if (r0 > r3) goto L_0x02a5
            r4.addAll(r7)
            goto L_0x0246
        L_0x02a5:
            int r3 = r3 - r1
            int r0 = r4.size()
            int r3 = r3 - r0
            r2 = 0
        L_0x02ac:
            if (r2 >= r6) goto L_0x02c2
            if (r3 == 0) goto L_0x02c2
            java.lang.Object r1 = r7.get(r2)
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x02bf
            r4.add(r1)
            int r3 = r3 + -1
        L_0x02bf:
            int r2 = r2 + 1
            goto L_0x02ac
        L_0x02c2:
            int r2 = r4.size()
            X.8ab r4 = X.DbW.A0U(r5)
            boolean r1 = r5.A07
            r0 = 2131960290(0x7f1321e2, float:1.9557245E38)
            if (r1 == 0) goto L_0x02d4
            r0 = 2131960291(0x7f1321e3, float:1.9557247E38)
        L_0x02d4:
            r3 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            java.lang.String r0 = X.DbV.A0z(r5, r2, r0)
            r4.A05 = r0
            r0 = 2131960289(0x7f1321e1, float:1.9557242E38)
            java.lang.String r0 = X.DbV.A0z(r5, r2, r0)
            r4.A0q(r0)
            r4.A0s(r3)
            X.Oep r0 = new X.Oep
            r0.<init>(r1)
            r4.A0E(r0)
            X.DbT.A1V(r4)
            goto L_0x0246
        L_0x02fa:
            java.lang.Object r5 = r1.A01
            X.NJ6 r5 = (X.NJ6) r5
            java.util.Set r1 = r5.A0C
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0588
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x030f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0319
            X.DbY.A1W(r4, r1)
            goto L_0x030f
        L_0x0319:
            com.instagram.common.session.UserSession r3 = r5.A00
            java.lang.String r2 = r5.A04
            r1 = 0
            X.PE6 r0 = new X.PE6
            r0.<init>(r5, r1)
            X.OXI.A02(r3, r0, r2, r4)
            r0 = 1
            r5.A05 = r0
            X.NJ6.A00(r5)
            java.lang.String r4 = r5.A03
            if (r4 == 0) goto L_0x0588
            com.instagram.common.session.UserSession r0 = r5.A00
            X.Oy7 r3 = X.O14.A00(r0)
            java.lang.String r2 = r5.A04
            X.0qQ.A0B(r2, r1)
            X.0wc r0 = r3.A00
            X.1Ln r1 = X.1Ln.A0F(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0588
            com.instagram.common.session.UserSession r0 = r3.A01
            X.Dbb.A1G(r1, r0)
            java.lang.String r0 = "jcs_invite_recipient"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "jcs_recipient_selection"
            r1.A0p(r0)
            java.lang.String r0 = "story"
            X.Dba.A1E(r1, r0)
            r1.A0s(r2)
            r1.A0v(r4)
            r1.Cgf()
            return
        L_0x0365:
            java.lang.Object r0 = r1.A01
            X.OVX r0 = (X.OVX) r0
            X.McN r1 = r0.A09
            java.lang.String r0 = "This operation must be run on UI thread."
            X.11Z.A06(r0)
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0378
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0588
        L_0x0378:
            r0 = 0
            r1.A02 = r0
            r1.A03 = r0
            r1.A05()
            X.1Ng r1 = r1.A04
            X.MqH r0 = new X.MqH
            r0.<init>()
            r1.A00(r0)
            return
        L_0x038b:
            r0 = -1167507196(0xffffffffba694104, float:-8.897933E-4)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.P1D r4 = (X.P1D) r4
            X.7HL r2 = r4.A08
            X.0eM r1 = r4.A0C
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r1)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r0 = X.DbV.A12(r0)
            boolean r0 = r2.Dj1(r0)
            if (r0 == 0) goto L_0x03b8
            r4.EHy()
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            X.0nA.A0N(r0)
        L_0x03b8:
            r0 = -89001580(0xfffffffffab1f194, float:-4.6196817E35)
            goto L_0x0585
        L_0x03bd:
            r0 = -1118404983(0xffffffffbd567e89, float:-0.052366767)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.P1C r4 = (X.P1C) r4
            X.7HL r2 = r4.A07
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r4.A09
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r1)
            java.lang.String r0 = X.DbV.A12(r0)
            boolean r0 = r2.Dj1(r0)
            if (r0 == 0) goto L_0x03e0
            r4.EHy()
            X.0nA.A0N(r1)
        L_0x03e0:
            r0 = 144575425(0x89e0bc1, float:9.512042E-34)
            goto L_0x0585
        L_0x03e5:
            r0 = 799266019(0x2fa3d4e3, float:2.9800792E-10)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.OVY r0 = (X.OVY) r0
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r0.A00
            if (r1 == 0) goto L_0x03f9
            X.7HJ r0 = r0.A08
            r0.DjH(r1)
        L_0x03f9:
            r0 = 1207342053(0x47f693e5, float:126247.79)
            goto L_0x0585
        L_0x03fe:
            r0 = -1862142198(0xffffffff9101f70a, float:-1.025243E-28)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.OVY r0 = (X.OVY) r0
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r0.A00
            if (r1 == 0) goto L_0x0412
            X.7HJ r0 = r0.A08
            r0.DjH(r1)
        L_0x0412:
            r0 = -40908097(0xfffffffffd8fcabf, float:-2.389154E37)
            goto L_0x0585
        L_0x0417:
            r0 = -1198615684(0xffffffffb88e937c, float:-6.798559E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.NJ3 r6 = (X.NJ3) r6
            X.Pu7 r1 = r6.A0D
            if (r1 == 0) goto L_0x042e
            r1.DjZ()
        L_0x0429:
            r1 = 1826888119(0x6ce419b7, float:2.2060522E27)
            goto L_0x1498
        L_0x042e:
            X.3sy r1 = r6.A0I
            if (r1 != 0) goto L_0x0437
            r1 = -660130755(0xffffffffd8a7343d, float:-1.47074243E15)
            goto L_0x1498
        L_0x0437:
            X.0eM r4 = r6.A0N
            X.6gx r8 = X.C66583MXo.A0P(r4)
            int r7 = r6.A00
            X.3sy r1 = r6.A0I
            java.lang.String r5 = X.C66647MaG.A09(r1)
            X.3sy r1 = r6.A0I
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r1)
            java.lang.String r3 = r1.A01
            X.1Ln r2 = X.DbT.A0J(r8)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x046d
            X.DbW.A17(r2, r8)
            java.lang.String r1 = "thread_update_theme"
            X.DbV.A1M(r2, r1)
            java.lang.String r1 = "select_button"
            r2.A0p(r1)
            java.lang.String r1 = "custom_theme_sheet"
            java.lang.Long r1 = X.DbZ.A0b(r2, r1, r5, r3, r7)
            X.C66582MXn.A1C(r2, r8, r1)
        L_0x046d:
            X.6ST r1 = r6.A0J
            if (r1 != 0) goto L_0x0475
            java.lang.String r14 = "progressDialog"
            goto L_0x0021
        L_0x0475:
            X.AnonymousClass0fN.A00(r1)
            X.3sy r2 = r6.A0I
            r1 = 87
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            com.instagram.model.direct.DirectThreadKey r2 = (com.instagram.model.direct.DirectThreadKey) r2
            java.lang.String r2 = r2.A00
            if (r2 == 0) goto L_0x082a
            X.0lg r1 = X.DbT.A0X(r4)
            java.lang.String r5 = r6.A0L
            if (r5 != 0) goto L_0x0495
            java.lang.String r14 = "uploadId"
            goto L_0x0021
        L_0x0495:
            r4 = 0
            X.0qQ.A0B(r1, r4)
            X.1NY r3 = X.AnonymousClass7TG.A0a(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = "direct_v2/threads/%s/update_customized_theme/"
            r3.A0K(r1, r2)
            java.lang.String r1 = "theme_image_fbid"
            X.DbX.A1M(r3, r1, r5)
            X.1OC r3 = r3.A0M()
            r1 = 13
            X.NMI.A00(r3, r6, r1)
            X.1GK r1 = r3.A04
            int r2 = r1.runnableId
            r1 = 2
            X.1ES.A05(r3, r2, r1, r4, r4)
            goto L_0x0429
        L_0x04be:
            r0 = 1809091538(0x6bd48bd2, float:5.139051E26)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NJS r4 = (X.NJS) r4
            X.Mq3 r0 = r4.A0A
            if (r0 == 0) goto L_0x083a
            java.lang.String r6 = r0.A00()
            if (r6 == 0) goto L_0x04f9
            com.instagram.common.session.UserSession r5 = r4.A08
            if (r5 == 0) goto L_0x081c
            X.Nps r0 = r4.A09
            java.lang.String r14 = "analyticsData"
            if (r0 == 0) goto L_0x0021
            java.lang.String r2 = r0.A01
            X.0qQ.A07(r2)
            X.Nps r0 = r4.A09
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = r0.A02
            X.0qQ.A07(r1)
            java.lang.String r0 = "creation_delete_tap"
            X.0xI r1 = X.C3265677h.A01(r4, r0, r2, r1)
            java.lang.String r0 = "quick_reply_id"
            r1.A0C(r0, r6)
            X.DbU.A1R(r1, r5)
        L_0x04f9:
            X.8ab r2 = X.DbW.A0U(r4)
            r0 = 2131959213(0x7f131dad, float:1.955506E38)
            r2.A09(r0)
            r0 = 2131959212(0x7f131dac, float:1.9555058E38)
            r2.A08(r0)
            r1 = 2131968381(0x7f13417d, float:1.9573655E38)
            r0 = 0
            r2.A0H(r0, r1)
            r1 = 2131976948(0x7f1362f4, float:1.959103E38)
            r0 = 38
            X.OgE r0 = X.C71249OgE.A00(r4, r0)
            X.Dba.A0t(r0, r2, r1)
            r0 = 1909696442(0x71d3a7ba, float:2.0961314E30)
            goto L_0x0585
        L_0x0520:
            r1 = 0
        L_0x0522:
            long r6 = r6 - r1
            X.N11 r9 = new X.N11
            r9.<init>()
            java.lang.String r12 = X.C66647MaG.A0B(r8)
            if (r12 == 0) goto L_0x0835
            java.lang.String r11 = "thread_id"
            r9.A06(r11, r12)
            java.lang.String r11 = "question_id"
            r9.A06(r11, r13)
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "options_added"
            r9.A05(r4, r5)
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "options_selected"
            r9.A05(r1, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r1 = "options_unselected"
            r9.A05(r1, r2)
            X.C66583MXo.A13(r10, r9)
            X.0eM r1 = r0.A0D
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.model.direct.DirectThreadKey r16 = X.C66647MaG.A03(r8)
            X.Oam r1 = r0.A04
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = r1.A0A
            r14 = 0
            java.lang.String r19 = ""
            r23 = 0
            java.lang.String r20 = "direct_v2/threads/broadcast/edit_group_poll/"
            r17 = r14
            r18 = r1
            r21 = r14
            r22 = r14
            r24 = r23
            X.1OC r2 = X.C71151OeJ.A06(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = 4
            X.NMH.A00(r2, r8, r0, r1)
            r0.schedule(r2)
        L_0x0582:
            r0 = -233322776(0xfffffffff217c6e8, float:-3.0062528E30)
        L_0x0585:
            X.AnonymousClass0fD.A0C(r0, r3)
        L_0x0588:
            return
        L_0x0589:
            r0 = -481713496(0xffffffffe349a2a8, float:-3.7195162E21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.NJS r5 = (X.NJS) r5
            r9 = 0
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            r7 = 2
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>(r7)
            java.lang.Integer r0 = r5.A0B
            r14 = 0
            X.0qQ.A0B(r0, r14)
            int r0 = X.C69999Nvd.A00(r0)
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "existing_label"
            r6.put(r0, r1)
            r8.set(r14)
            r0 = 38
            X.PqQ r3 = new X.PqQ
            r3.<init>(r5, r0)
            r1 = 17
            X.MMt r0 = new X.MMt
            r0.<init>(r3, r1)
            X.Q3B r1 = new X.Q3B
            r1.<init>(r0)
            r0 = 822(0x336, float:1.152E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r6.put(r0, r1)
            r4 = 1
            r8.set(r4)
            int r0 = r8.nextClearBit(r14)
            if (r0 < r7) goto L_0x083f
            X.0sm r20 = X.0Yt.A0E()
            java.util.Map r19 = X.0Yt.A0B(r6)
            r22 = 0
            r21 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r16 = "com.bloks.www.biig.saved.reply.label.selection"
            X.ShW r3 = new X.ShW
            r17 = r9
            r18 = r9
            r24 = r4
            r15 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r24)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            com.instagram.common.session.UserSession r0 = r5.A08
            if (r0 == 0) goto L_0x081c
            X.6Qj r0 = X.C48721Ej6.A00(r0, r14)
            r13 = 1065353216(0x3f800000, float:1.0)
            X.FRI r8 = new X.FRI
            r10 = r9
            r11 = r9
            r12 = r9
            r15 = r14
            r16 = r14
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0qQ.A0B(r0, r4)
            r3.E0s(r1, r8, r0)
            r0 = 887456657(0x34e58391, float:4.27503E-7)
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x061e:
            r0 = 1055811630(0x3eee682e, float:0.46563858)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.NJS r7 = (X.NJS) r7
            X.Mq3 r0 = r7.A0A
            r6 = 0
            if (r0 == 0) goto L_0x0632
            java.lang.String r6 = r0.A00()
        L_0x0632:
            com.instagram.common.session.UserSession r5 = r7.A08
            if (r5 == 0) goto L_0x081c
            X.Nps r0 = r7.A09
            java.lang.String r14 = "analyticsData"
            if (r0 == 0) goto L_0x0021
            java.lang.String r2 = r0.A01
            X.0qQ.A07(r2)
            X.Nps r0 = r7.A09
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = r0.A02
            X.0qQ.A07(r1)
            X.Mq3 r0 = r7.A0A
            boolean r3 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r0 = "creation_save_tap"
            X.0xI r2 = X.C3265677h.A01(r7, r0, r2, r1)
            java.lang.String r1 = "mode"
            if (r3 == 0) goto L_0x066f
            java.lang.String r0 = "edit"
            r2.A0C(r1, r0)
            java.lang.String r0 = "quick_reply_id"
            r2.A0C(r0, r6)
        L_0x0664:
            X.DbU.A1R(r2, r5)
            android.widget.EditText r0 = r7.A03
            if (r0 != 0) goto L_0x0675
            java.lang.String r14 = "messageField"
            goto L_0x0021
        L_0x066f:
            java.lang.String r0 = "create"
            r2.A0C(r1, r0)
            goto L_0x0664
        L_0x0675:
            java.lang.String r6 = X.AnonymousClass7TF.A0f(r0)
            int r3 = r6.length()
            r5 = 1
            int r3 = r3 - r5
            r2 = 0
            r1 = 0
        L_0x0681:
            if (r2 > r3) goto L_0x0699
            r0 = r3
            if (r1 != 0) goto L_0x0687
            r0 = r2
        L_0x0687:
            boolean r0 = X.Dbb.A1a(r6, r0)
            if (r1 != 0) goto L_0x0694
            if (r0 != 0) goto L_0x0691
            r1 = 1
            goto L_0x0681
        L_0x0691:
            int r2 = r2 + 1
            goto L_0x0681
        L_0x0694:
            if (r0 == 0) goto L_0x0699
            int r3 = r3 + -1
            goto L_0x0681
        L_0x0699:
            java.lang.String r10 = X.Dba.A0c(r6, r3, r2)
            android.widget.EditText r0 = r7.A04
            if (r0 != 0) goto L_0x06a5
            java.lang.String r14 = "shortcutField"
            goto L_0x0021
        L_0x06a5:
            java.lang.String r6 = X.AnonymousClass7TF.A0f(r0)
            int r3 = r6.length()
            int r3 = r3 - r5
            r2 = 0
            r1 = 0
        L_0x06b0:
            if (r2 > r3) goto L_0x06c8
            r0 = r3
            if (r1 != 0) goto L_0x06b6
            r0 = r2
        L_0x06b6:
            boolean r0 = X.Dbb.A1a(r6, r0)
            if (r1 != 0) goto L_0x06c3
            if (r0 != 0) goto L_0x06c0
            r1 = 1
            goto L_0x06b0
        L_0x06c0:
            int r2 = r2 + 1
            goto L_0x06b0
        L_0x06c3:
            if (r0 == 0) goto L_0x06c8
            int r3 = r3 + -1
            goto L_0x06b0
        L_0x06c8:
            java.lang.String r8 = X.Dba.A0c(r6, r3, r2)
            java.lang.Integer r2 = r7.A0B
            X.NJS.A01(r7)
            com.instagram.common.session.UserSession r0 = r7.A08
            if (r0 == 0) goto L_0x081c
            X.McN r3 = X.C66778McO.A00(r0)
            X.Mq3 r0 = r7.A0A
            if (r0 == 0) goto L_0x079d
            java.lang.String r6 = r0.A00()
            if (r6 == 0) goto L_0x0768
            X.AnonymousClass7TF.A1B(r8, r5, r10)
            java.lang.String r0 = "This operation must be run on UI thread."
            X.11Z.A06(r0)
            X.Pux r0 = r3.A00
            if (r0 == 0) goto L_0x06f2
            r0.CtU()
        L_0x06f2:
            java.util.Map r0 = r3.A07
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x0846
            X.Mq3 r9 = new X.Mq3
            r9.<init>()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r9.A00 = r1
            r9.A03 = r8
            r9.A02 = r10
            r9.A01 = r6
            if (r2 == 0) goto L_0x070d
            r9.A00 = r2
        L_0x070d:
            com.instagram.common.session.UserSession r0 = r3.A05
            java.lang.String r10 = r3.A01
            r6 = 0
            X.NMG r8 = new X.NMG
            r8.<init>(r5, r9, r3, r6)
            X.1NY r2 = new X.1NY
            r2.<init>(r0)
            r2.A08(r1)
            r2.A0R = r5
            java.lang.String r0 = r9.A00()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "direct_v2/quick_reply/update/%s/"
            r2.A0K(r0, r1)
            java.lang.Class<X.MpS> r1 = X.C67533MpS.class
            java.lang.Class<X.OX9> r0 = X.OX9.class
            r2.A0R(r1, r0)
            java.lang.String r1 = r9.A03
            java.lang.String r0 = "shortcut"
            r2.A9m(r0, r1)
            java.lang.String r0 = "modification_token"
            r2.A9m(r0, r10)
            java.lang.String r1 = r9.A02
            java.lang.String r0 = "text"
            r2.A9m(r0, r1)
            java.lang.Integer r0 = r9.A00
            int r1 = X.C69999Nvd.A00(r0)
            java.lang.String r0 = "label"
            r2.A0C(r0, r1)
            X.1OC r2 = r2.A0M()
            r2.A00 = r8
            r1 = 114(0x72, float:1.6E-43)
            r0 = 3
            X.1ES.A05(r2, r1, r0, r6, r5)
        L_0x075f:
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r0 = 504(0x1f8, float:7.06E-43)
            r1.setResult(r0)
        L_0x0768:
            X.Nps r0 = r7.A09
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "direct_thread"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0791
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r3.A05
            com.instagram.user.model.User r0 = r0.A01(r1)
            boolean r0 = X.2Ek.A01(r0)
            X.4kA r3 = X.AnonymousClass4k9.A00(r1)
            if (r0 == 0) goto L_0x0796
            X.0s0 r2 = r3.A0B
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 13
        L_0x078e:
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r5)
        L_0x0791:
            r0 = -495144793(0xffffffffe27cb0a7, float:-1.16532716E21)
            goto L_0x136e
        L_0x0796:
            X.0s0 r2 = r3.A0A
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 12
            goto L_0x078e
        L_0x079d:
            boolean r6 = X.DbW.A1S(r5, r8, r10)
            java.lang.String r0 = "This operation must be run on UI thread."
            X.11Z.A06(r0)
            X.Pux r0 = r3.A00
            if (r0 == 0) goto L_0x07ad
            r0.CtU()
        L_0x07ad:
            X.Mq3 r9 = new X.Mq3
            r9.<init>()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r9.A00 = r1
            r9.A03 = r8
            r9.A02 = r10
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r9.A01 = r0
            if (r2 == 0) goto L_0x07c4
            r9.A00 = r2
        L_0x07c4:
            com.instagram.common.session.UserSession r0 = r3.A05
            java.lang.String r10 = r3.A01
            X.NMG r8 = new X.NMG
            r8.<init>(r5, r9, r3, r6)
            X.1NY r2 = new X.1NY
            r2.<init>(r0)
            r2.A08(r1)
            r2.A0R = r5
            java.lang.String r0 = r9.A00()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "direct_v2/quick_reply/create/%s/"
            r2.A0K(r0, r1)
            java.lang.Class<X.MpS> r1 = X.C67533MpS.class
            java.lang.Class<X.OX9> r0 = X.OX9.class
            r2.A0R(r1, r0)
            java.lang.String r1 = r9.A03
            java.lang.String r0 = "shortcut"
            r2.A9m(r0, r1)
            java.lang.String r0 = r9.A02
            java.lang.String r1 = "text"
            r2.A9m(r1, r0)
            java.lang.String r0 = "modification_token"
            r2.A9m(r0, r10)
            java.lang.String r0 = "reply_type"
            r2.A9m(r0, r1)
            java.lang.Integer r0 = r9.A00
            int r1 = X.C69999Nvd.A00(r0)
            java.lang.String r0 = "label"
            r2.A0C(r0, r1)
            X.1OC r2 = r2.A0M()
            r2.A00 = r8
            r1 = 113(0x71, float:1.58E-43)
            r0 = 3
            X.1ES.A05(r2, r1, r0, r6, r6)
            goto L_0x075f
        L_0x081c:
            java.lang.String r14 = "userSession"
            goto L_0x0021
        L_0x0820:
            java.lang.Object r0 = r1.A01
            X.OVX r0 = (X.OVX) r0
            X.Pv2 r0 = r0.A08
            r0.CuB()
            return
        L_0x082a:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r1 = -893726740(0xffffffffcabacfec, float:-6121462.0)
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r2
        L_0x0835:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x083a:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x083f:
            java.lang.String r0 = "Missing required params"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            throw r2
        L_0x0846:
            java.lang.String r0 = "Error while editing. No quick reply with ID: "
            java.lang.String r0 = X.002.A0R(r0, r6)
            java.lang.RuntimeException r2 = X.AnonymousClass7TE.A15(r0)
            throw r2
        L_0x0851:
            r0 = 891436506(0x35223dda, float:6.043971E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r1.A01
            android.content.Context r1 = X.DbT.A08(r1)
            X.DbX.A14(r1, r2)
            r1 = 1382596009(0x5268bda9, float:2.49903596E11)
            goto L_0x1498
        L_0x0868:
            r0 = 1066623559(0x3f936247, float:1.1514367)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.0hq r1 = r1.getParentFragmentManager()
            r1.A13()
            r1 = 139355289(0x84e6499, float:6.210912E-34)
            goto L_0x1498
        L_0x087f:
            r17 = 0
            r3 = 0
            r5 = 0
            r0 = -1811829324(0xffffffff9401adb4, float:-6.5470925E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NK1 r4 = (X.NK1) r4
            X.P4G r7 = r4.A03
            if (r7 != 0) goto L_0x0896
            java.lang.String r12 = "controller"
            goto L_0x147f
        L_0x0896:
            java.lang.String r6 = r7.A00
            r2 = 0
            if (r6 == 0) goto L_0x08e7
            boolean r1 = X.00l.A0W(r6)
            if (r1 != 0) goto L_0x08e7
            boolean r1 = X.P4G.A02(r7)
            if (r1 == 0) goto L_0x08e7
            java.util.Map r1 = r7.A03
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r1)
        L_0x08b1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x08cb
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r1 = r2.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x08b1
            X.JTR.A1U(r5, r2)
            goto L_0x08b1
        L_0x08cb:
            java.util.ArrayList r3 = X.JTQ.A0f(r5)
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r5)
        L_0x08d3:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x08e1
            java.lang.Object r1 = X.C51971G9r.A0p(r2)
            X.DbU.A1X(r1, r3)
            goto L_0x08d3
        L_0x08e1:
            java.util.List r3 = X.00k.A0W(r3)
            r2 = 1
            r5 = r6
        L_0x08e7:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r4.A05
            r10 = 0
            if (r1 == 0) goto L_0x08ef
            r1.setPrimaryButtonEnabled(r10)
        L_0x08ef:
            if (r2 == 0) goto L_0x0945
            com.instagram.model.direct.DirectShareTarget r1 = r4.A07
            java.lang.String r12 = "shareTarget"
            if (r1 == 0) goto L_0x147f
            X.3sy r1 = r1.A02()
            boolean r1 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            com.instagram.model.direct.DirectShareTarget r2 = r4.A07
            if (r1 == 0) goto L_0x0958
            if (r2 == 0) goto L_0x147f
            X.3sy r2 = r2.A02()
            if (r2 == 0) goto L_0x0945
            X.0eM r1 = r4.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.Mot r1 = X.C67497Mor.A00(r1)
            if (r5 == 0) goto L_0x0945
            if (r3 == 0) goto L_0x0945
            X.1a8 r9 = r1.A00
            X.6Ea r7 = X.C67499Mot.A00(r1)
            long r1 = X.C66647MaG.A00(r2)
            X.DbS.A1Y(r5)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            X.0qQ.A0C(r3, r6)
            X.1aU r8 = r7.A02
            java.lang.String r7 = "TamClientPollCreate"
            X.Ov8 r6 = new X.Ov8
            r6.<init>(r1, r5, r3)
            X.1aU r1 = r8.A0M(r6)
            X.1aU r2 = X.C66582MXn.A0N(r1, r7)
            X.4fh r1 = X.C318146oT.A01
            X.1aU r2 = r2.A0P(r1)
            X.PTc r1 = X.C73019PTc.A00
            r9.A02(r2, r1)
        L_0x0945:
            com.instagram.igds.components.form.IgFormField r1 = r4.A06
            X.0nA.A0N(r1)
            X.37E r2 = X.AnonymousClass37D.A00
            android.content.Context r1 = r4.requireContext()
            X.DbX.A14(r1, r2)
            r1 = 85467373(0x51820ed, float:7.153053E-36)
            goto L_0x1498
        L_0x0958:
            if (r2 == 0) goto L_0x147f
            X.0eM r8 = r4.A0G
            java.lang.String r1 = X.DbU.A0u(r8)
            boolean r7 = r2.A0Y(r1)
            X.O76 r2 = r4.A04
            if (r2 == 0) goto L_0x147a
            com.instagram.model.direct.DirectShareTarget r1 = r4.A07
            if (r1 == 0) goto L_0x147f
            X.3t2 r1 = X.DbS.A0c(r1)
            X.3t1 r1 = X.AnonymousClass6W3.A01(r1)
            X.3t0 r1 = X.AnonymousClass6W4.A00(r1)
            if (r1 == 0) goto L_0x09e7
            java.lang.String r11 = r1.A00
            if (r11 == 0) goto L_0x09e7
            X.0wc r2 = r2.A00
            java.lang.String r1 = "submit_new_poll"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r2, r1)
            X.N12 r6 = new X.N12
            r6.<init>()
            X.C66584MXp.A0z(r6, r11, r7)
            java.lang.Long r2 = X.C51971G9r.A0m()
            java.lang.String r1 = "options_added"
            r6.A05(r1, r2)
            X.C66583MXo.A13(r9, r6)
        L_0x099a:
            com.instagram.model.direct.DirectShareTarget r1 = r4.A07
            if (r1 == 0) goto L_0x147f
            X.3sy r9 = r1.A02()
            if (r9 == 0) goto L_0x0945
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r8)
            X.7Zi r11 = X.C333527Zh.A00(r1)
            android.content.Context r12 = r4.requireContext()
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = X.DbX.A0l(r1, r8)
            com.instagram.common.typedurl.ImageUrl r6 = r1.Bh3()
            X.OGv r2 = new X.OGv
            r2.<init>()
            r1 = r5
            if (r5 != 0) goto L_0x09c4
            java.lang.String r1 = ""
        L_0x09c4:
            r2.A04 = r1
            r2.A00 = r6
            if (r3 == 0) goto L_0x09f2
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r3.iterator()
        L_0x09d2:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x09f4
            java.lang.String r6 = X.AnonymousClass7TE.A18(r14)
            X.ODt r1 = new X.ODt
            r1.<init>()
            r1.A02 = r6
            r13.add(r1)
            goto L_0x09d2
        L_0x09e7:
            X.0wj r6 = X.0wj.A01
            r2 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r1 = "threadId is null while reporting submit poll event"
            X.DbT.A1Q(r6, r1, r2)
            goto L_0x099a
        L_0x09f2:
            X.0sn r13 = X.0sn.A00
        L_0x09f4:
            X.0qQ.A0B(r13, r10)
            r2.A05 = r13
            r6 = 2131960012(0x7f1320cc, float:1.955668E38)
            java.lang.String r1 = r2.A04
            java.lang.String r1 = X.DbW.A0h(r12, r1, r6)
            X.0qQ.A0B(r1, r10)
            r2.A01 = r1
            java.util.List r1 = r2.A05
            int r1 = r1.size()
            int r1 = r1 + -3
            if (r1 <= 0) goto L_0x0a1e
            r6 = 2131960019(0x7f1320d3, float:1.9556695E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = X.DbW.A0h(r12, r1, r6)
            r2.A02 = r1
        L_0x0a1e:
            java.lang.String r12 = r4.A0F
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r9)
            java.lang.String r13 = r1.A00
            X.2FW r6 = X.2FW.A0k
            java.lang.Boolean r15 = X.C333537Zi.A00(r11, r6, r13, r10)
            com.instagram.common.session.UserSession r13 = r11.A03
            java.lang.Class<X.1j7> r16 = X.AnonymousClass1j7.class
            boolean r11 = r11.A00
            X.ODs r14 = X.OQO.A00(r13, r1)
            r19 = r17
            r20 = r10
            r21 = r11
            r18 = r12
            X.MaY r15 = X.C66669Mac.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Long r17 = X.OQO.A01(r13, r9)
            long r18 = X.AnonymousClass7TG.A0H()
            X.1j7 r14 = new X.1j7
            r16 = r1
            r14.<init>(r15, r16, r17, r18)
            r14.A01 = r5
            r14.A02 = r3
            r14.A00 = r2
            r14.A03 = r7
            X.C66580MXl.A1P(r13, r14)
            java.lang.String r3 = r14.A06()
            X.MaY r2 = r14.A02
            boolean r2 = r2.A09
            X.C3265677h.A0g(r13, r1, r6, r3, r2)
            X.1Ng r2 = X.DbX.A0R(r8)
            X.78m r1 = new X.78m
            r1.<init>()
            r2.A00(r1)
            goto L_0x0945
        L_0x0a75:
            r0 = 771710062(0x2dff5c6e, float:2.903119E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r1.A01
            android.content.Context r1 = X.DbT.A08(r1)
            X.DbX.A14(r1, r2)
            r1 = 1419150638(0x5496852e, float:5.1718358E12)
            goto L_0x1498
        L_0x0a8c:
            r0 = -1359329239(0xffffffffaefa4829, float:-1.1381502E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.0hq r1 = r1.getParentFragmentManager()
            r1.A13()
            r1 = -1533863067(0xffffffffa4931b65, float:-6.3797496E-17)
            goto L_0x1498
        L_0x0aa3:
            r0 = -1173934512(0xffffffffba072e50, float:-5.1567424E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJ8 r1 = (X.NJ8) r1
            X.NJ8.A07(r1)
            r1 = -1648659209(0xffffffff9dbb74f7, float:-4.9619427E-21)
            goto L_0x1498
        L_0x0ab6:
            r0 = -1877406744(0xffffffff90190be8, float:-3.0183102E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.NJ8 r2 = (X.NJ8) r2
            X.0eM r1 = r2.A0N
            X.I4Z r1 = X.C66584MXp.A0Q(r1)
            boolean r1 = r1.A0A
            if (r1 == 0) goto L_0x0ad8
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
        L_0x0acd:
            X.NJ8.A0B(r2, r1)
            X.NJ8.A06(r2)
            r1 = -255539151(0xfffffffff0c4c831, float:-4.8720863E29)
            goto L_0x1498
        L_0x0ad8:
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            goto L_0x0acd
        L_0x0adb:
            r0 = 2129988883(0x7ef50d13, float:1.6286437E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.NJ8 r5 = (X.NJ8) r5
            X.02m r4 = r5.A0K
            r3 = 894512288(0x35512ca0, float:7.7923505E-7)
            java.lang.String r1 = "keyboard_tap"
            r4.markerPoint(r3, r1)
            r2 = 4
            r4.markerEnd(r3, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.NJ8.A0B(r5, r1)
            androidx.fragment.app.FragmentActivity r3 = r5.getActivity()
            if (r3 == 0) goto L_0x0b5e
            boolean r1 = X.NJ8.A0E(r5)
            r11 = 0
            if (r1 == 0) goto L_0x0b63
            X.7Pu r1 = r5.A08
            if (r1 == 0) goto L_0x0b0f
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r1.A03
            r1.A0N()
        L_0x0b0f:
            X.NJ8.A05(r5)
            X.7Pu r1 = r5.A08
            if (r1 == 0) goto L_0x0b1b
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r1.A03
            r1.onBottomSheetPositionChanged(r11, r11)
        L_0x0b1b:
            X.7Pu r1 = r5.A08
            if (r1 == 0) goto L_0x0b24
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r1.A03
            r1.A0T(r2)
        L_0x0b24:
            X.7Pu r1 = r5.A08
            if (r1 == 0) goto L_0x0b31
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r1.A03
            X.2dZ r1 = r1._actionBarService
            if (r1 == 0) goto L_0x0b31
            r1.Etr(r11)
        L_0x0b31:
            X.0eM r1 = r5.A0Q
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r2 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r2.<init>(r1)
            com.instagram.model.direct.DirectShareTarget r7 = X.NJ8.A02(r5)
            r4 = 0
            java.lang.String r9 = "meta_ai_voice"
            r14 = 1
            r6 = r4
            r8 = r4
            r10 = r4
            r12 = r11
            r13 = r11
            r2.A0B(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.7Pu r1 = r5.A08
            if (r1 == 0) goto L_0x0b5e
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r1.A03
            android.view.View r2 = r1.mView
            if (r2 == 0) goto L_0x0b5e
            X.TDk r1 = new X.TDk
            r1.<init>(r5)
            r2.post(r1)
        L_0x0b5e:
            r1 = 1395534329(0x532e29f9, float:7.4802849E11)
            goto L_0x1498
        L_0x0b63:
            X.0eM r1 = r5.A0Q
            X.6Yo r1 = X.DbX.A0N(r3, r1)
            r1.A06()
            goto L_0x0b5e
        L_0x0b6d:
            r0 = -2110308356(0xffffffff82373ffc, float:-1.3463079E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.C51965G9l.A1W(r1, r5)
            r1 = -1885752709(0xffffffff8f99b27b, float:-1.5155713E-29)
            goto L_0x1498
        L_0x0b7e:
            r0 = 1478461318(0x581f8786, float:7.0161767E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.NJ7 r6 = (X.NJ7) r6
            X.3t3 r2 = X.NJ7.A00(r6)
            X.3t0 r1 = X.C300965yF.A02(r2)
            if (r1 == 0) goto L_0x0bbe
            X.0eM r1 = r6.A0G
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r1 = X.C66580MXl.A0x(r2)
            com.instagram.model.direct.DirectThreadKey r4 = X.C66581MXm.A0e(r1)
            r1 = 0
            X.0qQ.A0B(r5, r1)
            java.lang.Class<X.1jX> r1 = X.AnonymousClass1jX.class
            X.MaY r3 = X.C66669Mac.A08(r5, r1)
            r2 = 1
            X.0qQ.A0B(r3, r2)
            X.1jX r1 = new X.1jX
            r1.<init>(r3)
            r1.A00 = r4
            X.C66580MXl.A1P(r5, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.A0F
            r1.set(r2)
        L_0x0bbe:
            r1 = 9460123(0x90599b, float:1.3256456E-38)
            goto L_0x1498
        L_0x0bc3:
            r0 = -1637978224(0xffffffff9e5e6f90, float:-1.1775653E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJ7 r1 = (X.NJ7) r1
            X.NJ7.A06(r1)
            r1 = 1581449192(0x5e42ffe8, float:3.51280111E18)
            goto L_0x1498
        L_0x0bd6:
            r0 = -1505844875(0xffffffffa63ea175, float:-6.6138307E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJ7 r1 = (X.NJ7) r1
            X.NJ7.A06(r1)
            r1 = -164335896(0xfffffffff6346ee8, float:-9.1490516E32)
            goto L_0x1498
        L_0x0be9:
            r0 = -515061980(0xffffffffe14cc724, float:-2.3609284E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJ7 r1 = (X.NJ7) r1
            X.NJ7.A05(r1)
            r1 = 1375267009(0x51f8e8c1, float:1.33632106E11)
            goto L_0x1498
        L_0x0bfc:
            r0 = 1611181039(0x6008abef, float:3.939291E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJ7 r1 = (X.NJ7) r1
            X.NJ7.A05(r1)
            r1 = 1638782442(0x61add5ea, float:4.008376E20)
            goto L_0x1498
        L_0x0c0f:
            r0 = 1734688953(0x676540b9, float:1.08261585E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJ7 r1 = (X.NJ7) r1
            X.NJ7.A04(r1)
            r1 = -1118467276(0xffffffffbd558b34, float:-0.052134708)
            goto L_0x1498
        L_0x0c22:
            r0 = 1683812631(0x645cf117, float:1.6302624E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJ7 r1 = (X.NJ7) r1
            X.NJ7.A04(r1)
            r1 = -1200572461(0xffffffffb870b7d3, float:-5.739166E-5)
            goto L_0x1498
        L_0x0c35:
            r0 = 2023743745(0x789fe101, float:2.5941838E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJ7 r1 = (X.NJ7) r1
            X.NJ7.A03(r1)
            r1 = -1895249462(0xffffffff8f08c9ca, float:-6.744181E-30)
            goto L_0x1498
        L_0x0c48:
            r0 = 1937651866(0x737e389a, float:2.0141471E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJ7 r1 = (X.NJ7) r1
            X.NJ7.A03(r1)
            r1 = 1910193673(0x71db3e09, float:2.1712708E30)
            goto L_0x1498
        L_0x0c5b:
            r0 = -408794715(0xffffffffe7a249a5, float:-1.5327637E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.NJ3 r7 = (X.NJ3) r7
            X.Pu7 r1 = r7.A0D
            if (r1 == 0) goto L_0x0c72
            r1.D0V()
        L_0x0c6d:
            r1 = -1832280079(0xffffffff92c99ff1, float:-1.2724312E-27)
            goto L_0x1498
        L_0x0c72:
            X.3sy r1 = r7.A0I
            if (r1 == 0) goto L_0x0cac
            X.0eM r1 = r7.A0N
            X.6gx r6 = X.C66583MXo.A0P(r1)
            int r5 = r7.A00
            X.3sy r1 = r7.A0I
            java.lang.String r4 = X.C66647MaG.A09(r1)
            X.3sy r1 = r7.A0I
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r1)
            java.lang.String r3 = r1.A01
            X.1Ln r2 = X.DbT.A0J(r6)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x0cac
            X.DbW.A17(r2, r6)
            java.lang.String r1 = "cancel_thread_update_theme"
            X.DbV.A1M(r2, r1)
            java.lang.String r1 = "cancel_button"
            r2.A0p(r1)
            java.lang.String r1 = "custom_theme_sheet"
            java.lang.Long r1 = X.DbZ.A0b(r2, r1, r4, r3, r5)
            X.C66582MXn.A1C(r2, r6, r1)
        L_0x0cac:
            X.DbX.A1I(r7)
            goto L_0x0c6d
        L_0x0cb0:
            r0 = -811557876(0xffffffffcfa09c0c, float:-5.3891625E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.7Pu r1 = (X.C331157Pu) r1
            r1.A0T()
            r1 = -1921148918(0xffffffff8d7d980a, float:-7.8144655E-31)
            goto L_0x1498
        L_0x0cc3:
            r0 = -1594525184(0xffffffffa0f57a00, float:-4.1585347E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.NKI r3 = (X.NKI) r3
            java.util.Map r2 = r3.A0C
            if (r2 != 0) goto L_0x0cd6
            java.lang.String r12 = "themesMap"
            goto L_0x147f
        L_0x0cd6:
            java.lang.String r1 = "3259963564026002"
            java.lang.Object r2 = r2.get(r1)
            com.instagram.direct.model.DirectThreadThemeInfo r2 = (com.instagram.direct.model.DirectThreadThemeInfo) r2
            if (r2 == 0) goto L_0x0ce4
            r1 = 0
            X.NKI.A06(r3, r2, r1)
        L_0x0ce4:
            r1 = -413684489(0xffffffffe757acf7, float:-1.0184994E24)
            goto L_0x1498
        L_0x0ce9:
            r0 = 1491988029(0x58edee3d, float:2.09285985E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NKI r1 = (X.NKI) r1
            X.NKI.A04(r1)
            r1 = 1746553767(0x681a4ba7, float:2.91456E24)
            goto L_0x1498
        L_0x0cfc:
            r0 = 1380915636(0x524f19b4, float:2.22372364E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NPk r1 = (X.C68614NPk) r1
            X.O6x r1 = r1.A00
            if (r1 == 0) goto L_0x0d45
            X.NKI r5 = r1.A00
            X.3sy r1 = r5.A08
            if (r1 == 0) goto L_0x0d32
            java.lang.String r1 = X.C66647MaG.A0A(r1)
            if (r1 == 0) goto L_0x0d32
            X.0eM r1 = r5.A0P
            X.6gx r4 = X.DbZ.A0R(r1)
            int r3 = r5.A00
            X.3sy r1 = r5.A08
            if (r1 == 0) goto L_0x0d4a
            java.lang.String r2 = X.C66647MaG.A0A(r1)
        L_0x0d27:
            X.3sy r1 = r5.A08
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r1)
            java.lang.String r1 = r1.A01
            r4.A0A(r3, r2, r1)
        L_0x0d32:
            X.OGr r4 = r5.A04
            if (r4 == 0) goto L_0x0d4c
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r1 = "android.intent.action.PICK"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r1, r2)
            androidx.fragment.app.Fragment r2 = r4.A02
            r1 = 1
            r2.startActivityForResult(r3, r1)
        L_0x0d45:
            r1 = 694760481(0x29693421, float:5.1781608E-14)
            goto L_0x1498
        L_0x0d4a:
            r2 = 0
            goto L_0x0d27
        L_0x0d4c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0d51:
            r0 = -1498115761(0xffffffffa6b4914f, float:-1.2529395E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.ODg r1 = (X.C70609ODg) r1
            X.Mc4 r3 = r1.A02
            X.4kA r1 = r3.A02
            X.0xa r1 = r1.A00
            X.0xY r2 = r1.AR4()
            java.lang.String r1 = "has_seen_broadcast_channel_pushability_upsell"
            X.DbW.A1L(r2, r1)
            X.Pt0 r1 = r3.A00
            if (r1 == 0) goto L_0x0d72
            r1.onDismiss()
        L_0x0d72:
            r1 = 1137137240(0x43c75658, float:398.67456)
            goto L_0x1498
        L_0x0d77:
            r0 = 1883049760(0x703d0f20, float:2.340438E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.ODg r1 = (X.C70609ODg) r1
            X.Mc4 r3 = r1.A02
            androidx.fragment.app.FragmentActivity r1 = r3.A00
            android.content.Context r1 = r1.getApplicationContext()
            X.AnonymousClass0oH.A00(r1)
            X.4kA r1 = r3.A02
            X.0xa r1 = r1.A00
            X.0xY r2 = r1.AR4()
            java.lang.String r1 = "has_seen_broadcast_channel_pushability_upsell"
            X.DbW.A1L(r2, r1)
            X.Pt0 r1 = r3.A00
            if (r1 == 0) goto L_0x0da1
            r1.onDismiss()
        L_0x0da1:
            r1 = -1263830552(0xffffffffb4ab79e8, float:-3.193993E-7)
            goto L_0x1498
        L_0x0da6:
            r0 = -1969140711(0xffffffff8aa14c19, float:-1.5532361E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.7Lf r3 = (X.C330047Lf) r3
            X.P1v r3 = (X.C72330P1v) r3
            X.NKJ r2 = new X.NKJ
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            X.C72330P1v.A00(r1, r2, r3)
            r1 = -857541123(0xffffffffcce2f5fd, float:-1.18992872E8)
            goto L_0x1498
        L_0x0dc4:
            r0 = -221999207(0xfffffffff2c48f99, float:-7.7865806E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.NJH r3 = (X.NJH) r3
            X.Psq r1 = r3.A00
            if (r1 == 0) goto L_0x1210
            r1.DUp()
            X.37E r2 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            X.DbX.A10(r1, r2)
            r1 = -1929826296(0xffffffff8cf93008, float:-3.8393432E-31)
            goto L_0x1498
        L_0x0de4:
            r0 = -2056256740(0xffffffff8570031c, float:-1.1285317E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NgM r1 = (X.NgM) r1
            X.OTm r2 = r1.A00
            if (r2 == 0) goto L_0x1210
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r2.A02 = r1
            X.7Pu r1 = r2.A01
            if (r1 == 0) goto L_0x0dfe
            r1.A07()
        L_0x0dfe:
            r1 = 651322036(0x26d262b4, float:1.4598431E-15)
            goto L_0x1498
        L_0x0e03:
            r0 = 946204386(0x3865eee2, float:5.482033E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NgM r1 = (X.NgM) r1
            X.OTm r2 = r1.A00
            if (r2 == 0) goto L_0x1210
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r2.A02 = r1
            X.7Pu r1 = r2.A01
            if (r1 == 0) goto L_0x0e1d
            r1.A07()
        L_0x0e1d:
            r1 = 763938325(0x2d88c615, float:1.5549376E-11)
            goto L_0x1498
        L_0x0e22:
            r0 = 389292596(0x17342234, float:5.8204307E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NgM r1 = (X.NgM) r1
            X.OTm r2 = r1.A00
            if (r2 == 0) goto L_0x1210
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2.A02 = r1
            X.7Pu r1 = r2.A01
            if (r1 == 0) goto L_0x0e3c
            r1.A07()
        L_0x0e3c:
            r1 = 230731691(0xdc0afab, float:1.1875204E-30)
            goto L_0x1498
        L_0x0e41:
            r0 = 703340903(0x29ec2167, float:1.04863E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.P3E r5 = (X.P3E) r5
            X.N40 r4 = r5.A09
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            java.util.List r2 = r4.A02
            java.util.List r1 = r4.A04
            X.P3E.A03(r5, r4, r3, r2, r1)
            r1 = -1412593072(0xffffffffabcd8a50, float:-1.4604516E-12)
            goto L_0x1498
        L_0x0e5c:
            r0 = -908010978(0xffffffffc9e0da1e, float:-1841987.8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJZ r1 = (X.NJZ) r1
            X.OJY r1 = r1.A07
            if (r1 == 0) goto L_0x0e6e
            r1.A00()
        L_0x0e6e:
            r1 = 1200427796(0x478d1314, float:72230.16)
            goto L_0x1498
        L_0x0e73:
            r0 = -1689014265(0xffffffff9b53b007, float:-1.7510388E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NJZ r4 = (X.NJZ) r4
            X.0eM r1 = r4.A0L
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r6 = r4.A0C
            java.lang.String r5 = r4.A0B
            if (r5 != 0) goto L_0x0e8e
            java.lang.String r12 = "bottomSheetSessionId"
            goto L_0x147f
        L_0x0e8e:
            X.DbY.A1S(r2, r6)
            boolean r1 = X.C70014Nvs.A00(r2)
            if (r1 == 0) goto L_0x0ebb
            X.0wc r2 = X.AnonymousClass0kN.A01(r4, r2)
            java.lang.String r1 = "direct_ai_sticker_tap_generate"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x0ebb
            java.lang.String r1 = "search_query"
            r3.AAJ(r1, r6)
            java.lang.String r1 = "bottom_sheet_session_id"
            r3.AAJ(r1, r5)
            X.Nlr r2 = X.C69447Nlr.AI_STICKER
            java.lang.String r1 = "tray_type"
            r3.A8M(r2, r1)
            r3.Cgf()
        L_0x0ebb:
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r4.A0A
            if (r1 == 0) goto L_0x0ec2
            r1.A03()
        L_0x0ec2:
            boolean r1 = r4.A0D
            if (r1 != 0) goto L_0x0f77
            r2 = 4
            com.instagram.common.ui.base.IgTextView r1 = r4.A06
            if (r1 == 0) goto L_0x0ece
            r1.setVisibility(r2)
        L_0x0ece:
            com.instagram.common.ui.base.IgTextView r1 = r4.A05
            if (r1 == 0) goto L_0x0ed5
            r1.setVisibility(r2)
        L_0x0ed5:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r4.A04
            if (r1 == 0) goto L_0x0edc
            r1.getY()
        L_0x0edc:
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r4.A0A
            if (r1 == 0) goto L_0x0ee3
            r1.getY()
        L_0x0ee3:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r4.A04
            if (r1 == 0) goto L_0x0eea
            r1.getWidth()
        L_0x0eea:
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r4.A0A
            if (r1 == 0) goto L_0x0fa3
            X.5nL r1 = X.JTP.A0b(r1)
            X.5nL r6 = r1.A0A()
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r4.A0A
            if (r1 == 0) goto L_0x0f9e
            float r1 = r1.getY()
            float r1 = -r1
            r6.A0K(r1)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r4.A04
            if (r1 == 0) goto L_0x0f99
            int r2 = r1.getWidth()
            X.0eM r8 = r4.A0I
            int r1 = X.DbX.A07(r8)
            int r1 = r1 * 2
            int r2 = r2 + r1
            X.0eM r7 = r4.A0K
            int r1 = X.DbX.A07(r7)
            int r2 = r2 - r1
            float r1 = (float) r2
            float r2 = -r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            com.instagram.common.ui.base.IgSimpleImageView r1 = r4.A04
            if (r1 == 0) goto L_0x0f94
            float r1 = X.AnonymousClass7TE.A02(r1)
            float r2 = r2 + r1
            int r1 = X.DbX.A07(r8)
            int r1 = r1 * 2
            float r1 = (float) r1
            float r2 = r2 + r1
            int r1 = X.DbX.A07(r7)
            float r1 = (float) r1
            float r2 = r2 - r1
            r6.A0J(r2)
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r4.A0A
            if (r1 == 0) goto L_0x0f8f
            float r5 = X.AnonymousClass7TE.A02(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r4.A02
            if (r1 == 0) goto L_0x0f8a
            float r3 = X.AnonymousClass7TE.A02(r1)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r4.A04
            if (r1 == 0) goto L_0x0f85
            int r2 = r1.getWidth()
            int r1 = X.DbX.A07(r8)
            int r1 = r1 * 2
            int r2 = r2 + r1
            int r1 = X.DbX.A07(r7)
            int r2 = r2 - r1
            float r1 = (float) r2
            float r3 = r3 - r1
            r6.A0R(r5, r3)
            r2 = 1
            X.PQI r1 = new X.PQI
            r1.<init>(r4, r2)
            r6.A05 = r1
            r6.A0H()
        L_0x0f6d:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r4.A09
            X.AnonymousClass7TH.A0R(r1)
            r1 = 407591737(0x184b5b39, float:2.628319E-24)
            goto L_0x1498
        L_0x0f77:
            X.Ob6 r2 = r4.A08
            if (r2 != 0) goto L_0x0f7f
            java.lang.String r12 = "uiController"
            goto L_0x147f
        L_0x0f7f:
            java.lang.String r1 = r4.A0C
            r2.A04(r1)
            goto L_0x0f6d
        L_0x0f85:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0f8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0f8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0f94:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0f99:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0f9e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0fa3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0fa8:
            r0 = 19035699(0x1227633, float:2.9839505E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -1384547535(0xffffffffad797b31, float:-1.4181365E-11)
            goto L_0x1498
        L_0x0fb9:
            r0 = -2135997430(0xffffffff80af440a, float:-1.609562E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -2016832959(0xffffffff87c99241, float:-3.032908E-34)
            goto L_0x1498
        L_0x0fca:
            r0 = -168841454(0xfffffffff5efaf12, float:-6.076708E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.McD r1 = (X.C66768McD) r1
            X.7Mt r1 = r1.A00
            r1.A01()
            r1 = 743099639(0x2c4accf7, float:2.8819705E-12)
            goto L_0x1498
        L_0x0fdf:
            r0 = -66837594(0xfffffffffc0423a6, float:-2.744425E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.NJA r3 = (X.NJA) r3
            X.0eM r1 = r3.A09
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r1)
            X.OyM r2 = (X.C72200OyM) r2
            java.lang.String r1 = "message_list"
            r2.A02(r1)
            r3.A00()
            r1 = -1195164323(0xffffffffb8c33d5d, float:-9.3097544E-5)
            goto L_0x1498
        L_0x0fff:
            r0 = -1569250362(0xffffffffa27723c6, float:-3.349368E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.NJA r3 = (X.NJA) r3
            X.0eM r1 = r3.A09
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r1)
            X.OyM r2 = (X.C72200OyM) r2
            java.lang.String r1 = "message_list"
            r2.A02(r1)
            r3.A00()
            r1 = 1037302142(0x3dd3f97e, float:0.10350321)
            goto L_0x1498
        L_0x101f:
            r0 = -1127381667(0xffffffffbccd855d, float:-0.025088007)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Obq r1 = (X.C71089Obq) r1
            X.C71089Obq.A00(r1)
            r1 = 1923548564(0x72a70594, float:6.616415E30)
            goto L_0x1498
        L_0x1032:
            r0 = -1647941562(0xffffffff9dc66846, float:-5.251798E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.NK2 r6 = (X.NK2) r6
            X.0eM r2 = r6.A0V
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            android.content.Context r7 = r6.requireContext()
            X.2Ep r10 = r6.A01
            java.lang.String r12 = "thread"
            if (r10 == 0) goto L_0x147f
            java.lang.String r11 = r10.C6C()
            r12 = 0
            r9 = 0
            com.instagram.model.direct.camera.DirectCameraViewModel r1 = X.C71046OaO.A01(r7, r8, r9, r10, r11, r12)
            android.os.Bundle r5 = X.C66582MXn.A0B(r1)
            X.0lg r4 = X.DbT.A0X(r2)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            java.lang.String r1 = "direct_quick_reply_camera_fragment"
            X.6W8 r2 = X.AnonymousClass6W8.A02(r2, r5, r4, r3, r1)
            r1 = 13369(0x3439, float:1.8734E-41)
            r2.A0D(r6, r1)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            r1.overridePendingTransition(r12, r12)
            r1 = 935402137(0x37c11a99, float:2.3019778E-5)
            goto L_0x1498
        L_0x107c:
            r0 = -535198900(0xffffffffe019834c, float:-4.4247075E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.NJP r7 = (X.NJP) r7
            com.instagram.common.session.UserSession r4 = r7.A00
            if (r4 == 0) goto L_0x147d
            X.Nps r1 = r7.A01
            java.lang.String r12 = "analyticsData"
            if (r1 == 0) goto L_0x147f
            java.lang.String r3 = r1.A01
            X.0qQ.A07(r3)
            X.Nps r1 = r7.A01
            if (r1 == 0) goto L_0x147f
            java.lang.String r2 = r1.A02
            X.0qQ.A07(r2)
            java.lang.String r1 = "list_add_tap"
            X.0xI r1 = X.C3265677h.A01(r7, r1, r3, r2)
            X.DbU.A1R(r1, r4)
            com.instagram.common.session.UserSession r1 = r7.A00
            r6 = 0
            if (r1 == 0) goto L_0x147d
            X.McN r1 = X.C66778McO.A00(r1)
            java.util.Map r1 = r1.A07
            int r1 = r1.size()
            r5 = 20
            if (r1 != r5) goto L_0x10f5
            com.instagram.common.session.UserSession r4 = r7.A00
            if (r4 == 0) goto L_0x147d
            X.Nps r1 = r7.A01
            if (r1 == 0) goto L_0x147f
            java.lang.String r3 = r1.A01
            X.0qQ.A07(r3)
            X.Nps r1 = r7.A01
            if (r1 == 0) goto L_0x147f
            java.lang.String r2 = r1.A02
            X.0qQ.A07(r2)
            java.lang.String r1 = "creation_max_limit_reached"
            X.0xI r1 = X.C3265677h.A01(r7, r1, r3, r2)
            X.DbU.A1R(r1, r4)
            android.content.res.Resources r2 = X.DbV.A05(r7)
            r1 = 2131960263(0x7f1321c7, float:1.955719E38)
            r3 = 0
            java.lang.String r2 = X.JTS.A0i(r2, r5, r1)
            X.0qQ.A07(r2)
            android.content.Context r1 = r7.getContext()
            X.C59689JTv.A00(r1, r2, r6, r3)
        L_0x10f0:
            r1 = 1919696237(0x726c3d6d, float:4.6792142E30)
            goto L_0x1498
        L_0x10f5:
            X.NJP.A00(r7, r6)
            goto L_0x10f0
        L_0x10f9:
            r0 = 91414743(0x572e0d7, float:1.1420082E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 533542277(0x1fcd3585, float:8.690942E-20)
            goto L_0x1498
        L_0x110a:
            r0 = -2027648009(0xffffffff87248bf7, float:-1.2379121E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.NIg r7 = (X.C68443NIg) r7
            com.instagram.common.session.UserSession r4 = r7.A00
            if (r4 == 0) goto L_0x147d
            X.Nps r1 = r7.A01
            java.lang.String r12 = "analyticsData"
            if (r1 == 0) goto L_0x147f
            java.lang.String r3 = r1.A01
            X.0qQ.A07(r3)
            X.Nps r1 = r7.A01
            if (r1 == 0) goto L_0x147f
            java.lang.String r2 = r1.A02
            X.0qQ.A07(r2)
            java.lang.String r1 = "list_add_tap"
            X.0xI r1 = X.C3265677h.A01(r7, r1, r3, r2)
            X.DbU.A1R(r1, r4)
            com.instagram.common.session.UserSession r1 = r7.A00
            r6 = 0
            if (r1 == 0) goto L_0x147d
            X.McN r1 = X.C66778McO.A00(r1)
            java.util.Map r1 = r1.A07
            int r1 = r1.size()
            r5 = 20
            if (r1 != r5) goto L_0x1183
            com.instagram.common.session.UserSession r4 = r7.A00
            if (r4 == 0) goto L_0x147d
            X.Nps r1 = r7.A01
            if (r1 == 0) goto L_0x147f
            java.lang.String r3 = r1.A01
            X.0qQ.A07(r3)
            X.Nps r1 = r7.A01
            if (r1 == 0) goto L_0x147f
            java.lang.String r2 = r1.A02
            X.0qQ.A07(r2)
            java.lang.String r1 = "creation_max_limit_reached"
            X.0xI r1 = X.C3265677h.A01(r7, r1, r3, r2)
            X.DbU.A1R(r1, r4)
            android.content.res.Resources r2 = X.DbV.A05(r7)
            r1 = 2131960263(0x7f1321c7, float:1.955719E38)
            r3 = 0
            java.lang.String r2 = X.JTS.A0i(r2, r5, r1)
            X.0qQ.A07(r2)
            android.content.Context r1 = r7.getContext()
            X.C59689JTv.A00(r1, r2, r6, r3)
        L_0x117e:
            r1 = 926912531(0x373f9013, float:1.1418032E-5)
            goto L_0x1498
        L_0x1183:
            X.C68443NIg.A00(r7, r6)
            goto L_0x117e
        L_0x1187:
            r0 = 1964770846(0x751c061e, float:1.9778378E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.NJS r2 = (X.NJS) r2
            boolean r1 = X.NJS.A04(r2)
            if (r1 == 0) goto L_0x11a0
            X.NJS.A00(r2)
        L_0x119b:
            r1 = -725422539(0xffffffffd4c2ee35, float:-6.6977608E12)
            goto L_0x1498
        L_0x11a0:
            X.DbT.A1J(r2)
            goto L_0x119b
        L_0x11a4:
            r0 = -1077061552(0xffffffffbfcd5850, float:-1.6042576)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -292245631(0xffffffffee94af81, float:-2.3007976E28)
            goto L_0x1498
        L_0x11b5:
            r0 = 1212589446(0x4846a586, float:203414.1)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NKF r1 = (X.NKF) r1
            X.NKF.A00(r1)
            r1 = -2094753805(0xffffffff832497f3, float:-4.8369698E-37)
            goto L_0x1498
        L_0x11c8:
            r0 = -806438298(0xffffffffcfeeba66, float:-8.0103864E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NIM r1 = (X.NIM) r1
            X.O6Q r1 = r1.A00
            if (r1 == 0) goto L_0x1210
            X.NVX r4 = r1.A00
            X.MfP r5 = r4.A02
            if (r5 == 0) goto L_0x120b
            com.instagram.model.direct.DirectThreadKey r1 = r4.A06()
            java.lang.String r6 = r1.A00
            com.instagram.model.direct.DirectThreadKey r1 = r4.A06()
            java.lang.String r7 = r1.A01
            int r12 = r4.A00
            java.lang.String r8 = "daily_prompt_creator_nux_sheet_dismissed"
            java.lang.String r9 = "tap"
            java.lang.String r10 = "get_started_button"
            java.lang.String r11 = "daily_prompt_creator_nux_sheet"
            X.C66930MfP.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            android.view.Window r3 = X.DbV.A0G(r4)
            if (r3 == 0) goto L_0x1208
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.PYV r1 = new X.PYV
            r1.<init>(r3, r4)
            r2.post(r1)
        L_0x1208:
            X.DbZ.A15(r4)
        L_0x120b:
            r1 = -2137406884(0xffffffff8099c25c, float:-1.4120554E-38)
            goto L_0x1498
        L_0x1210:
            java.lang.String r12 = "delegate"
            goto L_0x147f
        L_0x1214:
            r0 = 1109178944(0x421cba40, float:39.181885)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.P1D r1 = (X.P1D) r1
            X.7HL r1 = r1.A08
            r1.D00()
            r1 = 909536415(0x36366c9f, float:2.718334E-6)
            goto L_0x1498
        L_0x1229:
            r0 = -417391964(0xffffffffe71f1aa4, float:-7.513477E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.P1C r1 = (X.P1C) r1
            X.7HL r1 = r1.A07
            r1.D00()
            r1 = -246867426(0xfffffffff1491a1e, float:-9.95809E29)
            goto L_0x1498
        L_0x123e:
            r0 = -764167003(0xffffffffd273bca5, float:-2.61710496E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.OVY r1 = (X.OVY) r1
            X.7HJ r1 = r1.A08
            r1.Djk()
            r1 = -2110800034(0xffffffff822fbf5e, float:-1.2911889E-37)
            goto L_0x1498
        L_0x1253:
            r0 = 747362846(0x2c8bda1e, float:3.9748335E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.OVY r1 = (X.OVY) r1
            X.7HJ r1 = r1.A08
            r1.DAC()
            r1 = -774490140(0xffffffffd1d637e4, float:-1.15007586E11)
            goto L_0x1498
        L_0x1268:
            r0 = 842041669(0x32308945, float:1.027576E-8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.OVY r8 = (X.OVY) r8
            X.0qQ.A0A(r5)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.List r1 = r8.A01
            r9 = 1
            r6 = 0
            if (r1 == 0) goto L_0x129c
            X.Nj4 r0 = X.C69303Nj4.DOWNLOAD
            boolean r0 = r1.contains(r0)
            if (r0 != r9) goto L_0x129c
            r3 = 2131961011(0x7f1324b3, float:1.9558707E38)
            r2 = 2131238227(0x7f081d53, float:1.8092727E38)
            r1 = 10
            X.Mq4 r0 = new X.Mq4
            r0.<init>(r8, r1)
            X.8rI r0 = X.OVY.A00(r8, r0, r3, r2, r6)
            r7.add(r0)
        L_0x129c:
            java.util.List r1 = r8.A01
            if (r1 == 0) goto L_0x12bc
            X.Nj4 r0 = X.C69303Nj4.DELETE
            boolean r0 = r1.contains(r0)
            if (r0 != r9) goto L_0x12bc
            r3 = 2131957531(0x7f13171b, float:1.9551649E38)
            r2 = 2131238196(0x7f081d34, float:1.8092664E38)
            r1 = 11
            X.Mq4 r0 = new X.Mq4
            r0.<init>(r8, r1)
            X.8rI r0 = X.OVY.A00(r8, r0, r3, r2, r9)
            r7.add(r0)
        L_0x12bc:
            java.util.List r1 = r8.A01
            if (r1 == 0) goto L_0x12dc
            X.Nj4 r0 = X.C69303Nj4.UNSEND
            boolean r0 = r1.contains(r0)
            if (r0 != r9) goto L_0x12dc
            r3 = 2131965982(0x7f13381e, float:1.956879E38)
            r2 = 2131238196(0x7f081d34, float:1.8092664E38)
            r1 = 12
            X.Mq4 r0 = new X.Mq4
            r0.<init>(r8, r1)
            X.8rI r0 = X.OVY.A00(r8, r0, r3, r2, r9)
            r7.add(r0)
        L_0x12dc:
            java.util.List r1 = r8.A01
            if (r1 == 0) goto L_0x12fc
            X.Nj4 r0 = X.C69303Nj4.REMOVE
            boolean r0 = r1.contains(r0)
            if (r0 != r9) goto L_0x12fc
            r3 = 2131971974(0x7f134f86, float:1.9580942E38)
            r2 = 2131238196(0x7f081d34, float:1.8092664E38)
            r1 = 13
            X.Mq4 r0 = new X.Mq4
            r0.<init>(r8, r1)
            X.8rI r0 = X.OVY.A00(r8, r0, r3, r2, r9)
            r7.add(r0)
        L_0x12fc:
            java.util.List r1 = r8.A01
            if (r1 == 0) goto L_0x131c
            X.Nj4 r0 = X.C69303Nj4.REPORT
            boolean r0 = r1.contains(r0)
            if (r0 != r9) goto L_0x131c
            r3 = 2131972171(0x7f13504b, float:1.9581342E38)
            r2 = 2131238715(0x7f081f3b, float:1.8093717E38)
            r1 = 14
            X.Mq4 r0 = new X.Mq4
            r0.<init>(r8, r1)
            X.8rI r0 = X.OVY.A00(r8, r0, r3, r2, r9)
            r7.add(r0)
        L_0x131c:
            android.view.ViewGroup r0 = r8.A02
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.common.session.UserSession r1 = r8.A04
            r0 = 0
            X.8Ov r1 = X.C66581MXm.A0c(r2, r1, r0, r7, r6)
            android.view.View r0 = r1.getContentView()
            if (r0 == 0) goto L_0x1332
            r1.showAsDropDown(r5, r6, r6)
        L_0x1332:
            r0 = -691438324(0xffffffffd6c97d0c, float:-1.10769455E14)
            goto L_0x136e
        L_0x1336:
            r0 = 920890179(0x36e3ab43, float:6.7850647E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.OVY r1 = (X.OVY) r1
            X.7HJ r1 = r1.A08
            r1.CxV()
            r1 = -439123997(0xffffffffe5d37fe3, float:-1.248473E23)
            goto L_0x1498
        L_0x134b:
            r0 = 779656434(0x2e789cf2, float:5.6528067E-11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Nhg r3 = (X.C69226Nhg) r3
            X.Tol r2 = r3.A01
            r1 = 1
            if (r2 == 0) goto L_0x137d
            boolean r0 = r2.A01
            if (r0 != r1) goto L_0x137d
        L_0x135f:
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L_0x1372
            if (r2 == 0) goto L_0x1387
            java.lang.String r1 = "resume"
            r0 = 0
            r2.A0C(r1, r0)
        L_0x136b:
            r0 = -407572444(0xffffffffe7b4f024, float:-1.7089116E24)
        L_0x136e:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x1372:
            if (r2 == 0) goto L_0x137f
            java.lang.String r0 = "user_paused_video"
            r2.A0A(r0)
            X.C69226Nhg.A01(r3)
            goto L_0x136b
        L_0x137d:
            r1 = 0
            goto L_0x135f
        L_0x137f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -986846821(0xffffffffc52de99b, float:-2782.6003)
            goto L_0x138e
        L_0x1387:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = 1316194114(0x4e738742, float:1.02143194E9)
        L_0x138e:
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x1392:
            r0 = 2075015629(0x7bae39cd, float:1.809264E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NPi r1 = (X.C68612NPi) r1
            X.0sa r1 = r1.A00
            r1.invoke()
            r1 = 16940949(0x1027f95, float:2.3968765E-38)
            goto L_0x1498
        L_0x13a7:
            r0 = 1932806472(0x73344948, float:1.4283749E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NIv r4 = (X.C68457NIv) r4
            X.OSg r3 = r4.A03
            if (r3 == 0) goto L_0x147a
            java.lang.String r2 = "inbox_folders_manage_screen_reorder_click"
            X.0sm r1 = X.0Yt.A0E()
            X.C70933OSg.A00(r3, r2, r1)
            X.0eM r1 = r4.A07
            java.lang.Object r1 = r1.getValue()
            X.Mtt r1 = (X.C67740Mtt) r1
            r1.A00()
            r1 = 1366052845(0x516c4fed, float:6.3434576E10)
            goto L_0x1498
        L_0x13cf:
            r0 = -612152870(0xffffffffdb8349da, float:-7.3908845E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NIv r4 = (X.C68457NIv) r4
            X.0eM r6 = r4.A07
            java.lang.Object r1 = r6.getValue()
            X.Mtt r1 = (X.C67740Mtt) r1
            java.util.List r3 = r1.A03
            X.0Ud r1 = r1.A05
            java.lang.Object r1 = r1.getValue()
            X.JV5 r1 = (X.JV5) r1
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x13f8:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x140a
            java.lang.Object r1 = r2.next()
            X.N5x r1 = (X.C68208N5x) r1
            java.lang.String r1 = r1.A03
            r7.add(r1)
            goto L_0x13f8
        L_0x140a:
            X.OSg r4 = r4.A03
            if (r4 == 0) goto L_0x147a
            r1 = 0
            X.0qQ.A0B(r3, r1)
            r5 = 1
            java.lang.String r2 = r3.toString()
            java.lang.String r1 = "old_sequence"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r1 = "new_sequence"
            java.util.LinkedHashMap r2 = X.DbY.A0p(r1, r2, r3)
            java.lang.String r1 = "inbox_folders_manage_screen_reorder_done_click"
            X.C70933OSg.A00(r4, r1, r2)
            java.lang.Object r1 = r6.getValue()
            X.Mtt r1 = (X.C67740Mtt) r1
            r1.A00()
            java.lang.Object r3 = r6.getValue()
            X.Mtt r3 = (X.C67740Mtt) r3
            X.05G r1 = r3.A04
            java.lang.Object r1 = r1.getValue()
            X.JV5 r1 = (X.JV5) r1
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x144f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x1461
            java.lang.Object r1 = r2.next()
            X.N5x r1 = (X.C68208N5x) r1
            java.lang.String r1 = r1.A01
            r4.add(r1)
            goto L_0x144f
        L_0x1461:
            com.instagram.common.session.UserSession r3 = r3.A01
            java.lang.Class<X.1nJ> r1 = X.AnonymousClass1nJ.class
            X.MaY r2 = X.C66669Mac.A08(r3, r1)
            X.0qQ.A0B(r2, r5)
            X.1nR r1 = new X.1nR
            r1.<init>(r2)
            r1.A00 = r4
            X.C66580MXl.A1P(r3, r1)
            r1 = -1301840705(0xffffffffb2677cbf, float:-1.3474334E-8)
            goto L_0x1498
        L_0x147a:
            java.lang.String r12 = "logger"
            goto L_0x147f
        L_0x147d:
            java.lang.String r12 = "userSession"
        L_0x147f:
            X.0qQ.A0F(r12)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1487:
            r0 = 766756570(0x2db3c6da, float:2.0438252E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.Dbb.A0z(r1)
            r1 = -350513402(0xffffffffeb1b9706, float:-1.8809669E26)
        L_0x1498:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71401Ok0.onClick(android.view.View):void");
    }
}
