package X;

/* renamed from: X.Mh4  reason: case insensitive filesystem */
public final class C67031Mh4 implements 1aV {
    public final /* synthetic */ C66633Ma2 A00;

    public C67031Mh4(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r23) {
        /*
            r22 = this;
            r7 = r23
            X.GAX r7 = (X.GAX) r7
            r6 = 0
            X.0qQ.A0B(r7, r6)
            r0 = r22
            X.Ma2 r5 = r0.A00
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.2El.A09(r0)
            if (r0 == 0) goto L_0x003b
            X.Mbh r1 = X.C66581MXm.A0U(r5)
            X.Pvy r0 = X.C66581MXm.A0V(r5)
            X.PxF r0 = r0.C6W()
            boolean r2 = X.C66633Ma2.A0g(r1, r5, r0)
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.2El.A0G(r0)
            if (r0 == 0) goto L_0x01cb
            r1 = 0
        L_0x0031:
            int r0 = r5.A01
            if (r0 == r1) goto L_0x003b
            r5.A01 = r1
            r0 = 0
            r5.A16(r0)
        L_0x003b:
            java.lang.String r13 = "inboxViewProxy"
            int r4 = r7.A02
            r3 = 1
            r5.A16 = r3
            X.Mgq r0 = X.C66633Ma2.A04(r5)
            X.34p r0 = r0.A06
            if (r0 == 0) goto L_0x004d
            r0.A05()
        L_0x004d:
            java.lang.Object r0 = r7.A04
            java.lang.Long r0 = (java.lang.Long) r0
            r5.A0v = r0
            boolean r0 = r5.A14
            if (r0 != 0) goto L_0x007c
            X.0eM r1 = r5.A2c
            java.lang.Object r0 = r1.getValue()
            X.MYv r0 = (X.C66609MYv) r0
            java.util.List r0 = r0.A00
            if (r0 != 0) goto L_0x007c
            java.lang.Object r7 = r1.getValue()
            X.MYv r7 = (X.C66609MYv) r7
            X.MoP r2 = X.C67470MoP.A00
            X.0qQ.A0B(r2, r6)
            X.0nO r1 = X.0nY.A00()
            X.Mll r0 = new X.Mll
            r0.<init>(r7, r2)
            r1.ATE(r0)
            r5.A14 = r3
        L_0x007c:
            X.2EM r1 = r5.A0s()
            X.2EX r0 = X.AnonymousClass2EX.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0133
            X.C66633Ma2.A0U(r5, r4, r3)
        L_0x008b:
            r5.A10()
            X.0eM r0 = r5.A1f
            java.lang.Object r10 = r0.getValue()
            X.MoU r10 = (X.C67474MoU) r10
            X.0eM r0 = r10.A02
            java.lang.Object r0 = r0.getValue()
            X.4kA r0 = (X.AnonymousClass4kA) r0
            X.0xa r7 = r0.A00
            java.lang.String r1 = "broadcast_channel_inbox_last_synced_time_millis_"
            r0 = 3
            java.lang.String r2 = X.002.A0O(r1, r0)
            r0 = 0
            long r8 = r7.getLong(r2, r0)
            boolean r2 = r10.A06
            if (r2 == 0) goto L_0x00da
            int r7 = r10.A00
            if (r7 <= 0) goto L_0x00da
            X.0sa r2 = r10.A05
            boolean r2 = X.C51971G9r.A1b(r2)
            if (r2 != 0) goto L_0x00da
            X.0eM r2 = r10.A03
            r2.getValue()
            long r11 = X.C51966G9m.A07(r8)
            int r2 = r7 * 1000
            long r7 = (long) r2
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x00da
            X.4Cq r9 = r10.A02
            r8 = 0
            r7 = 8
            X.Pfn r2 = new X.Pfn
            r2.<init>(r10, r8, r7)
            X.AnonymousClass7TE.A1Z(r2, r9)
        L_0x00da:
            com.instagram.common.session.UserSession r2 = r5.A0p()
            X.Dfk r2 = X.DcK.A00(r2)
            X.05G r2 = r2.A04
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r7 = X.AnonymousClass7TG.A0A(r2)
            boolean r2 = r5.A13
            if (r2 != 0) goto L_0x01d1
            com.instagram.common.session.UserSession r2 = r5.A0p()
            r16 = 0
            boolean r2 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r2, r6)
            if (r2 == 0) goto L_0x01d1
            X.2EM r2 = r5.A0s()
            X.MkK r15 = X.C67224MkK.A00
            boolean r2 = X.0qQ.A0K(r2, r15)
            if (r2 == 0) goto L_0x01d1
            if (r4 >= r7) goto L_0x01d1
            r5.A13 = r3
            com.instagram.common.session.UserSession r2 = r5.A0p()
            X.Dfk r2 = X.DcK.A00(r2)
            r2.A00()
            com.instagram.common.session.UserSession r2 = r5.A0p()
            X.1bO r17 = X.1bO.A00(r2)
            X.48q r18 = X.C2611948q.ALL
            java.lang.String r19 = "locked_chat_initial_snapshot"
            X.Mlj r14 = new X.Mlj
            r20 = r3
            r21 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r14.A03()
            goto L_0x01d1
        L_0x0133:
            X.C66633Ma2.A0U(r5, r4, r6)
            boolean r0 = X.C66633Ma2.A0m(r5, r4)
            if (r0 != 0) goto L_0x015f
            X.Mbh r1 = X.C66581MXm.A0U(r5)
            java.util.List r0 = java.util.Collections.emptyList()
            r1.A09(r0)
        L_0x0147:
            boolean r0 = X.C66633Ma2.A0m(r5, r4)
            if (r0 != 0) goto L_0x01a4
            X.Mbh r2 = X.C66581MXm.A0U(r5)
            java.util.List r1 = java.util.Collections.emptyList()
            X.0qQ.A07(r1)
            boolean r0 = r2.A0L
            r2.A0A(r1, r6, r0, r6)
            goto L_0x008b
        L_0x015f:
            int r0 = r5.A02
            if (r4 == r0) goto L_0x0147
            com.instagram.common.session.UserSession r2 = r5.A0p()
            X.0Tu r7 = X.0Tu.A06
            r0 = 36322224889931789(0x810adf0004280d, double:3.033659506028467E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 != 0) goto L_0x0183
            com.instagram.common.session.UserSession r2 = r5.A0p()
            r0 = 36322224889997326(0x810adf0005280e, double:3.033659506069913E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x0147
        L_0x0183:
            r5.A02 = r4
            X.0ng r9 = r5.A0W
            if (r9 == 0) goto L_0x01a0
            X.0no r8 = X.0no.A00()
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0P(r5, r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36609760065755058(0x821062000817b2, double:3.215497909030323E-306)
            long r0 = X.182.A01(r2, r7, r0)
            r8.A01(r9, r0)
            goto L_0x0147
        L_0x01a0:
            X.C66633Ma2.A0H(r5)
            goto L_0x0147
        L_0x01a4:
            int r0 = r5.A04
            if (r4 == r0) goto L_0x008b
            r5.A04 = r4
            X.0ng r9 = r5.A0X
            if (r9 == 0) goto L_0x01c6
            X.0no r8 = X.0no.A00()
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0P(r5, r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36609760065755058(0x821062000817b2, double:3.215497909030323E-306)
            long r0 = X.182.A01(r2, r7, r0)
            r8.A01(r9, r0)
            goto L_0x008b
        L_0x01c6:
            X.C66633Ma2.A0I(r5)
            goto L_0x008b
        L_0x01cb:
            r1 = 1
            if (r2 == 0) goto L_0x0031
            r1 = 2
            goto L_0x0031
        L_0x01d1:
            X.3As r2 = r5.A0n     // Catch:{ NullPointerException -> 0x01ec }
            if (r2 == 0) goto L_0x01e4
            int r2 = r2.getCount()     // Catch:{ NullPointerException -> 0x01ec }
            if (r2 <= 0) goto L_0x020a
            X.3As r2 = r5.A0n     // Catch:{ NullPointerException -> 0x01ec }
            if (r2 == 0) goto L_0x01e4
            int r10 = r2.BLQ()     // Catch:{ NullPointerException -> 0x01ec }
            goto L_0x020b
        L_0x01e4:
            X.0qQ.A0F(r13)     // Catch:{ NullPointerException -> 0x01ec }
            X.00P r2 = X.AnonymousClass00P.createAndThrow()     // Catch:{ NullPointerException -> 0x01ec }
            throw r2     // Catch:{ NullPointerException -> 0x01ec }
        L_0x01ec:
            X.0wj r9 = X.0wj.A01
            r8 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r7 = "Unable to fetch lastVisiblePosition with item count "
            X.3As r2 = r5.A0n
            if (r2 != 0) goto L_0x01ff
            X.0qQ.A0F(r13)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01ff:
            int r2 = r2.getCount()
            java.lang.String r2 = X.002.A0O(r7, r2)
            X.DbT.A1Q(r9, r2, r8)
        L_0x020a:
            r10 = 0
        L_0x020b:
            X.MoZ r2 = r5.A0c
            if (r2 == 0) goto L_0x0238
            X.0eM r9 = r5.A1s
            java.lang.Object r2 = r9.getValue()
            X.Mjt r2 = (X.C67197Mjt) r2
            X.02m r7 = r2.A01
            r8 = 20125924(0x13318e4, float:3.2894966E-38)
            java.lang.String r2 = "thread_count"
            r7.markerAnnotate(r8, r2, r4)
            if (r4 >= r10) goto L_0x02e4
            X.Pw5 r8 = r5.A0q()
            X.2EM r7 = r5.A0t()
            X.48q r2 = X.C66633Ma2.A05(r5)
            boolean r2 = r8.AFZ(r7, r2)
            if (r2 == 0) goto L_0x02c1
            r5.A0x()
        L_0x0238:
            if (r4 != 0) goto L_0x0258
            X.Mgq r2 = X.C66633Ma2.A04(r5)
            X.9HU r2 = r2.A08
            r2.A01(r6)
            X.0eM r2 = r5.A1d
            java.lang.Object r4 = r2.getValue()
            X.72D r4 = (X.AnonymousClass72D) r4
            long r7 = r4.A01
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0258
            X.1QP r1 = r4.A02
            java.lang.String r0 = "thread_list_rendered"
            r1.flowMarkPoint(r7, r0)
        L_0x0258:
            com.instagram.common.session.UserSession r4 = X.C66580MXl.A0P(r5, r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320416709222805(0x81093a000c2195, double:3.032516005267146E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x02be
            X.4DH r6 = r5.A1J
            android.os.Bundle r4 = r6.mArguments
            if (r4 == 0) goto L_0x02be
            java.lang.String r0 = "jl_hash"
            java.lang.String r2 = r4.getString(r0)
            java.lang.String r0 = "di_id"
            java.lang.String r8 = r4.getString(r0)
            java.lang.String r1 = "back_stack"
            boolean r0 = r4.getBoolean(r1)
            if (r2 == 0) goto L_0x02be
            if (r8 == 0) goto L_0x02be
            if (r0 != 0) goto L_0x02be
            r4.putBoolean(r1, r3)
            X.0eM r0 = r5.A1u
            java.lang.Object r7 = r0.getValue()
            X.OJj r7 = (X.OJj) r7
            androidx.fragment.app.FragmentActivity r6 = r6.requireActivity()
            com.instagram.common.session.UserSession r1 = X.C66580MXl.A0P(r5, r3)
            android.net.Uri r0 = X.DbT.A09(r2)
            java.lang.String r4 = X.OXO.A00(r0)
            if (r4 == 0) goto L_0x02be
            X.7Pr r2 = X.DbS.A0W(r1)
            X.NjJ r1 = X.C69318NjJ.NOTIFICATION
            X.P3F r0 = new X.P3F
            r0.<init>(r3)
            X.NKN r1 = X.C71045OaN.A01(r1, r0, r4, r8)
            r2.A0U = r1
            X.7Pu r0 = r2.A00()
            r7.A00 = r0
            r0.A02(r6, r1)
        L_0x02be:
            r5.A17 = r3
            return
        L_0x02c1:
            boolean r2 = r5.A1E
            if (r2 == 0) goto L_0x0238
            com.instagram.common.session.UserSession r2 = r5.A0p()
            boolean r2 = X.2El.A0H(r2)
            if (r2 == 0) goto L_0x0238
            X.Pw5 r9 = r5.A0q()
            X.2EM r8 = r5.A0t()
            X.48q r7 = X.C66633Ma2.A05(r5)
            java.lang.String r2 = "filter_update"
            r9.AUu(r8, r7, r2)
            r5.A1E = r6
            goto L_0x0238
        L_0x02e4:
            java.lang.Object r2 = r9.getValue()
            X.Mjt r2 = (X.C67197Mjt) r2
            X.02m r7 = r2.A01
            r2 = 2
            r7.markerEnd(r8, r2)
            X.MkX r7 = r5.A0f
            X.MkX r2 = X.C67237MkX.A07
            if (r7 != r2) goto L_0x0238
            X.0eM r7 = r5.A2e
            java.lang.Object r2 = r7.getValue()
            X.Nbb r2 = (X.C68952Nbb) r2
            X.34p r2 = r2.A00
            if (r2 == 0) goto L_0x0305
            r2.A05()
        L_0x0305:
            java.lang.Object r2 = r7.getValue()
            X.Nbb r2 = (X.C68952Nbb) r2
            X.34p r2 = r2.A02
            r2.A05()
            java.lang.Object r2 = r7.getValue()
            X.9HT r2 = (X.AnonymousClass9HT) r2
            X.9HU r2 = r2.A08
            r2.A01(r4)
            goto L_0x0238
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67031Mh4.accept(java.lang.Object):void");
    }
}
