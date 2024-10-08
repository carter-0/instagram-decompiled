package X;

/* renamed from: X.Ml1  reason: case insensitive filesystem */
public final class C67267Ml1 extends AnonymousClass1GX {
    public final /* synthetic */ C66633Ma2 A00;

    public C67267Ml1(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScroll(X.C238133Ar r28, int r29, int r30, int r31, int r32, int r33) {
        /*
            r27 = this;
            r11 = r29
            r0 = -720791528(0xffffffffd5099818, float:-9.4553957E12)
            int r10 = X.AnonymousClass0fD.A03(r0)
            r9 = 0
            r0 = r28
            X.0qQ.A0B(r0, r9)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            int r1 = r29 + r30
            r0 = r27
            X.Ma2 r12 = r0.A00
            X.0eM r15 = r12.A1c
            java.lang.Object r0 = r15.getValue()
            X.Mhv r0 = (X.C67080Mhv) r0
            X.2t9 r0 = r0.A00
            int r0 = r0.getItemCount()
            int r6 = java.lang.Math.min(r1, r0)
            r16 = 1
        L_0x0033:
            if (r11 >= r6) goto L_0x018b
            java.lang.Object r0 = r15.getValue()
            X.Mhv r0 = (X.C67080Mhv) r0
            X.2t9 r0 = r0.A00
            java.lang.Object r1 = r0.A04(r11)
            boolean r0 = r1 instanceof X.C66702Mb9
            if (r0 == 0) goto L_0x016b
            X.Mb9 r1 = (X.C66702Mb9) r1
            com.instagram.model.direct.DirectThreadKey r0 = r1.A0I
            if (r0 == 0) goto L_0x016b
            java.lang.String r5 = r0.A00
            if (r5 == 0) goto L_0x016b
            java.util.Set r0 = r12.A1b
            boolean r0 = r0.add(r5)
            if (r0 == 0) goto L_0x0126
            java.lang.Object r0 = r15.getValue()
            X.Mhv r0 = (X.C67080Mhv) r0
            X.2t9 r0 = r0.A00
            java.lang.Object r1 = r0.A04(r11)
            boolean r0 = r1 instanceof X.C66702Mb9
            if (r0 == 0) goto L_0x017d
            X.Mb9 r1 = (X.C66702Mb9) r1
            int r0 = r1.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x017d
            int r13 = r0.intValue()
            java.lang.Object r0 = r15.getValue()
            X.Mhv r0 = (X.C67080Mhv) r0
            X.2t9 r0 = r0.A00
            java.lang.Object r1 = r0.A04(r11)
            boolean r0 = r1 instanceof X.C66702Mb9
            if (r0 == 0) goto L_0x017a
            X.Mb9 r1 = (X.C66702Mb9) r1
            boolean r4 = r1.A0j
        L_0x0089:
            java.lang.Object r0 = r15.getValue()
            X.Mhv r0 = (X.C67080Mhv) r0
            if (r13 < 0) goto L_0x0177
            X.2t9 r1 = r0.A00
            int r0 = r1.getItemCount()
            if (r13 >= r0) goto L_0x0177
            java.lang.Object r1 = r1.A04(r13)
            boolean r0 = r1 instanceof X.C66702Mb9
            if (r0 == 0) goto L_0x0177
            X.Mb9 r1 = (X.C66702Mb9) r1
            X.Mb0 r0 = r1.A0D
            X.Noj r1 = r0.A01
            boolean r0 = r1 instanceof X.C66703MbA
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.inbox.ui.threadtitle.ThreadTitleViewModel.TitleType.Options"
            X.0qQ.A0C(r1, r0)
            X.MbA r1 = (X.C66703MbA) r1
            boolean r3 = r1.A01
        L_0x00b4:
            java.lang.Object r0 = r15.getValue()
            X.Mhv r0 = (X.C67080Mhv) r0
            X.2t9 r0 = r0.A00
            java.lang.Object r1 = r0.A04(r11)
            boolean r0 = r1 instanceof X.C66702Mb9
            if (r0 == 0) goto L_0x0174
            X.Mb9 r1 = (X.C66702Mb9) r1
            boolean r2 = r1.A0g
        L_0x00c8:
            java.lang.Object r0 = r15.getValue()
            X.Mhv r0 = (X.C67080Mhv) r0
            X.2t9 r0 = r0.A00
            java.lang.Object r1 = r0.A04(r11)
            boolean r0 = r1 instanceof X.C66702Mb9
            r25 = 0
            if (r0 == 0) goto L_0x00e8
            X.Mb9 r1 = (X.C66702Mb9) r1
            X.Mb1 r0 = r1.A0B
            if (r0 == 0) goto L_0x0171
            java.lang.Integer r1 = r0.A0B
        L_0x00e2:
            java.lang.Integer r0 = X.AnonymousClass05K.A0H
            if (r1 != r0) goto L_0x00e8
            r25 = 1
        L_0x00e8:
            X.2EM r0 = r12.A0t()
            int r14 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.String r20 = X.C66724MbV.A00(r0)
            java.lang.Object r0 = r15.getValue()
            X.Mhv r0 = (X.C67080Mhv) r0
            X.2t9 r0 = r0.A00
            java.lang.Object r1 = r0.A04(r11)
            boolean r0 = r1 instanceof X.C66702Mb9
            if (r0 == 0) goto L_0x016f
            X.Mb9 r1 = (X.C66702Mb9) r1
            X.Mb0 r0 = r1.A0D
            boolean r1 = r0.A04
        L_0x010c:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r13)
            X.Mli r0 = new X.Mli
            r17 = r0
            r19 = r5
            r21 = r14
            r22 = r4
            r23 = r3
            r24 = r2
            r26 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8.add(r0)
        L_0x0126:
            java.lang.Object r0 = r15.getValue()
            X.Mhv r0 = (X.C67080Mhv) r0
            X.2t9 r0 = r0.A00
            java.lang.Object r1 = r0.A04(r11)
            boolean r0 = r1 instanceof X.C66702Mb9
            if (r0 == 0) goto L_0x015d
            X.Mb9 r1 = (X.C66702Mb9) r1
            boolean r0 = r1.A0f
            if (r0 == 0) goto L_0x015d
            java.util.Set r0 = r12.A1a
            boolean r0 = r0.add(r5)
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r15.getValue()
            X.Mhv r0 = (X.C67080Mhv) r0
            X.2t9 r0 = r0.A00
            java.lang.Object r1 = r0.A04(r11)
            boolean r0 = r1 instanceof X.C66702Mb9
            if (r0 == 0) goto L_0x015d
            X.Mb9 r1 = (X.C66702Mb9) r1
            java.lang.String r0 = r1.A0N
            if (r0 == 0) goto L_0x015d
            r7.put(r5, r0)
        L_0x015d:
            android.util.Pair r0 = r12.A07
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r0.first
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x016b
            r16 = 0
        L_0x016b:
            int r11 = r11 + 1
            goto L_0x0033
        L_0x016f:
            r1 = 0
            goto L_0x010c
        L_0x0171:
            r1 = 0
            goto L_0x00e2
        L_0x0174:
            r2 = 0
            goto L_0x00c8
        L_0x0177:
            r3 = 0
            goto L_0x00b4
        L_0x017a:
            r4 = 0
            goto L_0x0089
        L_0x017d:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -443595446(0xffffffffe58f454a, float:-8.457207E22)
            X.AnonymousClass0fD.A0A(r0, r10)
            throw r1
        L_0x018b:
            android.util.Pair r0 = r12.A07
            if (r0 == 0) goto L_0x0194
            if (r16 == 0) goto L_0x0194
            r12.A0y()
        L_0x0194:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x01a0
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0296
        L_0x01a0:
            java.util.Iterator r16 = r8.iterator()
        L_0x01a4:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r5 = r16.next()
            X.Mli r5 = (X.C67308Mli) r5
            com.instagram.common.session.UserSession r2 = r12.A0p()
            X.4DH r0 = r12.A1J
            java.lang.String r14 = r5.A03
            boolean r1 = r5.A05
            int r13 = r5.A00
            java.lang.Integer r4 = r5.A01
            boolean r11 = r5.A04
            boolean r8 = r5.A07
            java.lang.String r3 = r5.A02
            boolean r6 = r5.A06
            boolean r5 = r5.A08
            X.0qQ.A0B(r2, r9)
            X.0wc r15 = X.AnonymousClass0kN.A01(r0, r2)
            java.lang.String r2 = "direct_inbox_thread_impression"
            X.0kJ r0 = r15.A00
            X.0Aj r2 = r15.A00(r0, r2)
            java.lang.String r0 = "thread_id"
            r2.AAJ(r0, r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "has_unseen"
            r2.A7p(r0, r1)
            long r0 = (long) r13
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "folder"
            r2.A9F(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "has_subscriber_badge"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "is_pending"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "is_dm_missed_message_impression_shown"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_user_nickname_added"
            r2.A7p(r0, r1)
            if (r4 == 0) goto L_0x0223
            int r0 = r4.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "position"
            r2.A9F(r0, r1)
        L_0x0223:
            java.lang.String r0 = "display_location"
            r2.AAJ(r0, r3)
            r2.Cgf()
            goto L_0x01a4
        L_0x022d:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x0235:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0296
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.getValue()
            java.lang.String r5 = (java.lang.String) r5
            com.instagram.common.session.UserSession r2 = r12.A0p()
            X.4DH r1 = r12.A1J
            r4 = 1
            X.0qQ.A0B(r2, r9)
            r0 = 4
            X.0qQ.A0B(r3, r0)
            if (r5 == 0) goto L_0x0235
            X.0wc r2 = X.AnonymousClass0kN.A01(r1, r2)
            java.lang.String r1 = "ig_nudge_imp"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0235
            java.lang.String r0 = "nudged_thread_last_message_id"
            r2.AAJ(r0, r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "thread_is_nudged"
            r2.A7p(r0, r1)
            java.lang.String r0 = "thread_is_bumped"
            r2.A7p(r0, r1)
            java.lang.String r1 = "direct"
            r0 = 3643(0xe3b, float:5.105E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.AAJ(r0, r1)
            java.lang.String r0 = "thread_id"
            r2.AAJ(r0, r3)
            r2.Cgf()
            goto L_0x0235
        L_0x0296:
            r0 = 1202959826(0x47b3b5d2, float:92011.64)
            X.AnonymousClass0fD.A0A(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67267Ml1.onScroll(X.3Ar, int, int, int, int, int):void");
    }

    public final void onScrollStateChanged(C238133Ar r4, int i) {
        int A03 = AnonymousClass0fD.A03(151513610);
        if (i == 0) {
            this.A00.A1A = false;
        } else if (i == 1) {
            this.A00.A1A = true;
        }
        AnonymousClass0fD.A0A(-874547831, A03);
    }
}
