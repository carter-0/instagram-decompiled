package X;

public final class MMH extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMH(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new MMH(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        return X.C229342nE.A00(X.AnonymousClass7TE.A0l(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0146, code lost:
        return r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01cd, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x025c, code lost:
        r3 = X.0Tu.A05;
        r1 = 36328237843954790L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02c0, code lost:
        return X.AnonymousClass7TF.A0R(r3, r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x02c1;
                case 1: goto L_0x02ab;
                case 2: goto L_0x029b;
                case 3: goto L_0x028b;
                case 4: goto L_0x0279;
                case 5: goto L_0x0272;
                case 6: goto L_0x0272;
                case 7: goto L_0x0272;
                case 8: goto L_0x0005;
                case 9: goto L_0x026b;
                case 10: goto L_0x0264;
                case 11: goto L_0x0005;
                case 12: goto L_0x026b;
                case 13: goto L_0x0264;
                case 14: goto L_0x0252;
                case 15: goto L_0x0248;
                case 16: goto L_0x020f;
                case 17: goto L_0x0204;
                case 18: goto L_0x01e9;
                case 19: goto L_0x01dc;
                case 20: goto L_0x01ce;
                case 21: goto L_0x01a4;
                case 22: goto L_0x0195;
                case 23: goto L_0x0186;
                case 24: goto L_0x0175;
                case 25: goto L_0x015d;
                case 26: goto L_0x014e;
                case 27: goto L_0x0272;
                case 28: goto L_0x0147;
                case 29: goto L_0x0136;
                case 30: goto L_0x011e;
                case 31: goto L_0x0104;
                case 32: goto L_0x00ec;
                case 33: goto L_0x00df;
                case 34: goto L_0x00d2;
                case 35: goto L_0x00c9;
                case 36: goto L_0x00ba;
                case 37: goto L_0x0272;
                case 38: goto L_0x0097;
                case 39: goto L_0x0029;
                case 40: goto L_0x001f;
                case 41: goto L_0x0010;
                case 42: goto L_0x0005;
                case 43: goto L_0x026b;
                case 44: goto L_0x0264;
                case 45: goto L_0x0008;
                case 46: goto L_0x0005;
                case 47: goto L_0x026b;
                case 48: goto L_0x0264;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r12.A01
            return r4
        L_0x0008:
            java.lang.Object r0 = r12.A01
            X.H1K r0 = (X.H1K) r0
            X.0eM r0 = r0.A0C
            goto L_0x00c0
        L_0x0010:
            java.lang.Object r1 = r12.A01
            X.IbA r1 = (X.C57466IbA) r1
            r0 = 0
            X.C57466IbA.A00(r1, r0)
            X.1vq r0 = r1.A04
            r0.A03(r1)
            goto L_0x01cb
        L_0x001f:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.GLi r4 = new X.GLi
            r4.<init>(r0)
            return r4
        L_0x0029:
            java.lang.Object r0 = r12.A01
            X.GCz r0 = (X.C52053GCz) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            X.0Tu r2 = X.0Tu.A06
            r0 = 36882189840810417(0x830828000001b1, double:3.3877835957619854E-306)
            java.lang.String r0 = X.182.A04(r2, r3, r0)
            java.util.List r0 = X.DbX.A0x(r0)
            if (r0 == 0) goto L_0x006f
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x0048:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.String r6 = X.AnonymousClass7TE.A18(r7)
            X.2v9[] r5 = X.C233162v9.values()
            int r4 = r5.length
            r3 = 0
        L_0x0058:
            if (r3 >= r4) goto L_0x0048
            r2 = r5[r3]
            java.lang.String r1 = r2.A01
            java.lang.String r0 = X.DbV.A12(r6)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006c
            r8.add(r2)
            goto L_0x0048
        L_0x006c:
            int r3 = r3 + 1
            goto L_0x0058
        L_0x006f:
            X.0sn r8 = X.0sn.A00
        L_0x0071:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r4 = r8.iterator()
        L_0x0079:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r3 = r4.next()
            X.2v9 r3 = (X.C233162v9) r3
            X.2pg r2 = X.C230472pg.SPONSORED
            X.2pc r1 = X.C230432pc.CLIPS
            X.9Ib r0 = new X.9Ib
            r0.<init>((X.C230472pg) r2, (X.C233162v9) r3, (X.C230432pc) r1)
            r5.add(r0)
            goto L_0x0079
        L_0x0092:
            java.util.Set r4 = X.00k.A0j(r5)
            return r4
        L_0x0097:
            java.lang.Object r8 = r12.A01
            X.H1E r8 = (X.H1E) r8
            androidx.fragment.app.FragmentActivity r5 = r8.requireActivity()
            android.content.Context r6 = r8.requireContext()
            X.0eM r0 = r8.A0I
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            X.0gy r7 = X.AnonymousClass07i.A00(r8)
            java.lang.String r10 = r8.A0G
            r0 = 2
            X.DbW.A1N(r9, r0, r10)
            r11 = 0
            X.H6l r4 = new X.H6l
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x00ba:
            java.lang.Object r0 = r12.A01
            X.H1E r0 = (X.H1E) r0
            X.0eM r0 = r0.A0I
        L_0x00c0:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2nF r4 = X.C229342nE.A00(r0)
            return r4
        L_0x00c9:
            java.lang.Object r1 = r12.A01
            r0 = 6
            X.LuO r4 = new X.LuO
            r4.<init>(r1, r0)
            return r4
        L_0x00d2:
            java.lang.Object r0 = r12.A01
            instagram.features.clips.edit.ClipsEditMetadataController r0 = (instagram.features.clips.edit.ClipsEditMetadataController) r0
            X.4DH r0 = r0.A0q
            X.2YN r1 = X.DbW.A0F(r0)
            java.lang.Class<X.Jg9> r0 = X.C60128Jg9.class
            goto L_0x0142
        L_0x00df:
            java.lang.Object r0 = r12.A01
            instagram.features.clips.edit.ClipsEditMetadataController r0 = (instagram.features.clips.edit.ClipsEditMetadataController) r0
            X.4DH r0 = r0.A0q
            X.2YN r1 = X.DbW.A0F(r0)
            java.lang.Class<X.Jg0> r0 = X.C60119Jg0.class
            goto L_0x0142
        L_0x00ec:
            java.lang.Object r1 = r12.A01
            instagram.features.clips.edit.ClipsEditMetadataController r1 = (instagram.features.clips.edit.ClipsEditMetadataController) r1
            X.4DH r0 = r1.A0q
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = r1.A0s
            X.KBj r0 = new X.KBj
            r0.<init>(r1)
            X.2YN r1 = X.JTO.A0L(r0, r2)
            java.lang.Class<X.JiL> r0 = X.C60264JiL.class
            goto L_0x0142
        L_0x0104:
            java.lang.Object r1 = r12.A01
            instagram.features.clips.edit.ClipsEditMetadataController r1 = (instagram.features.clips.edit.ClipsEditMetadataController) r1
            X.4DH r0 = r1.A0q
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r1.A0s
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.KCg r0 = new X.KCg
            r0.<init>(r2, r1)
            X.2YN r1 = X.JTO.A0L(r0, r3)
            java.lang.Class<X.JiG> r0 = X.C60259JiG.class
            goto L_0x0142
        L_0x011e:
            java.lang.Object r1 = r12.A01
            instagram.features.clips.edit.ClipsEditMetadataController r1 = (instagram.features.clips.edit.ClipsEditMetadataController) r1
            X.4DH r0 = r1.A0q
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = r1.A0s
            X.KBi r0 = new X.KBi
            r0.<init>(r1)
            X.2YN r1 = X.JTO.A0L(r0, r2)
            java.lang.Class<X.Jil> r0 = X.C60289Jil.class
            goto L_0x0142
        L_0x0136:
            java.lang.Object r0 = r12.A01
            instagram.features.clips.edit.ClipsEditMetadataController r0 = (instagram.features.clips.edit.ClipsEditMetadataController) r0
            X.4DH r0 = r0.A0q
            X.2YN r1 = X.DbW.A0F(r0)
            java.lang.Class<X.Jiu> r0 = X.C60296Jiu.class
        L_0x0142:
            X.2YL r4 = r1.A00(r0)
            return r4
        L_0x0147:
            java.lang.Object r0 = r12.A01
            X.2YM r4 = X.JTR.A0b(r0)
            return r4
        L_0x014e:
            java.lang.Object r0 = r12.A01
            X.HJZ r0 = (X.HJZ) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328237844282475(0x81105700063c6b, double:3.0374621225720646E-306)
            goto L_0x02bc
        L_0x015d:
            java.lang.Object r0 = r12.A01
            X.HJZ r0 = (X.HJZ) r0
            X.1Av r3 = r0.A0A
            X.0s0 r2 = r3.A7I
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 271(0x10f, float:3.8E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 != 0) goto L_0x0172
            X.KgK r4 = X.C62469KgK.UNINSTALL
            return r4
        L_0x0172:
            X.KgK r4 = X.C62469KgK.OVER_FLOW_MENU
            return r4
        L_0x0175:
            X.6q4 r1 = X.C319116q4.A00
            java.lang.Object r0 = r12.A01
            X.HJZ r0 = (X.HJZ) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            boolean r0 = r1.A0A(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0186:
            java.lang.Object r0 = r12.A01
            X.HJZ r0 = (X.HJZ) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328237844085864(0x81105700033c68, double:3.037462122447727E-306)
            goto L_0x02bc
        L_0x0195:
            java.lang.Object r0 = r12.A01
            X.HJZ r0 = (X.HJZ) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328237844020327(0x81105700023c67, double:3.037462122406281E-306)
            goto L_0x02bc
        L_0x01a4:
            java.lang.Object r0 = r12.A01
            X.GiF r0 = (X.C53081GiF) r0
            X.0eM r0 = r0.A0C
            java.lang.Object r0 = r0.getValue()
            X.LPH r0 = (X.LPH) r0
            X.0wc r1 = r0.A01
            java.lang.String r0 = "content_scheduling_cancel"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x01cb
            java.lang.String r0 = "draft_folder"
            X.DbS.A1N(r1, r0)
            java.lang.String r0 = "schedule_picker"
            X.DbS.A1H(r1, r0)
            r1.Cgf()
        L_0x01cb:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x01ce:
            java.lang.Object r0 = r12.A01
            X.GiF r0 = (X.C53081GiF) r0
            com.instagram.common.session.UserSession r1 = r0.A07
            android.app.Activity r0 = r0.A03
            X.LD5 r4 = new X.LD5
            r4.<init>(r0, r1)
            return r4
        L_0x01dc:
            java.lang.Object r0 = r12.A01
            X.GiF r0 = (X.C53081GiF) r0
            android.app.Activity r1 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A07
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r4 = X.AnonymousClass72U.A00(r1, r0)
            return r4
        L_0x01e9:
            java.lang.Object r2 = r12.A01
            X.GiF r2 = (X.C53081GiF) r2
            com.instagram.common.session.UserSession r1 = r2.A07
            X.27r r0 = X.27p.A01(r1)
            X.283 r0 = r0.A04
            X.28D r0 = r0.A09
            X.0qQ.A07(r0)
            X.JVg r0 = X.C63094KrN.A00(r0)
            X.LPH r4 = new X.LPH
            r4.<init>(r0, r2, r1)
            return r4
        L_0x0204:
            java.lang.Object r0 = r12.A01
            X.K4Z r0 = (X.K4Z) r0
            X.0eM r0 = r0.A07
            X.0lg r0 = X.DbT.A0X(r0)
            goto L_0x025c
        L_0x020f:
            X.12T r5 = X.AnonymousClass12T.A00
            X.2MY r1 = com.instagram.creation.persistence.CreationDatabase.A00
            java.lang.Object r4 = r12.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Class<com.instagram.creation.persistence.CreationDatabase> r0 = com.instagram.creation.persistence.CreationDatabase.class
            java.lang.Object r0 = r4.A00(r0)
            com.instagram.roomdb.IgRoomDatabase r0 = (com.instagram.roomdb.IgRoomDatabase) r0
            if (r0 != 0) goto L_0x022b
            monitor-enter(r1)
            com.instagram.roomdb.IgRoomDatabase r0 = X.JTT.A0h(r4, r1)     // Catch:{ all -> 0x0227 }
            goto L_0x022a
        L_0x0227:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x022a:
            monitor-exit(r1)
        L_0x022b:
            com.instagram.creation.persistence.CreationDatabase r0 = (com.instagram.creation.persistence.CreationDatabase) r0
            X.2NP r3 = r0.A00()
            r0 = 15
            X.0t0 r2 = A00(r4, r0)
            r0 = 1931769926(0x73247846, float:1.3030641E31)
            X.0nV r1 = X.JTP.A0V(r5, r0)
            X.2Nl r0 = X.2Nk.A00(r4)
            X.2N1 r4 = new X.2N1
            r4.<init>(r0, r3, r2, r1)
            return r4
        L_0x0248:
            java.lang.Object r0 = r12.A01
            X.0lg r0 = (X.0lg) r0
            X.L8g r4 = new X.L8g
            r4.<init>(r0)
            return r4
        L_0x0252:
            java.lang.Object r0 = r12.A01
            X.K57 r0 = (X.K57) r0
            X.0eM r0 = r0.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
        L_0x025c:
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328237843954790(0x81105700013c66, double:3.037462122364835E-306)
            goto L_0x02bc
        L_0x0264:
            java.lang.Object r0 = r12.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x026b:
            java.lang.Object r0 = r12.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x0272:
            java.lang.Object r0 = r12.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x0279:
            java.lang.Object r0 = r12.A01
            X.K57 r0 = (X.K57) r0
            X.0eM r0 = r0.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328237844872305(0x811057000f3c71, double:3.0374621229450754E-306)
            goto L_0x02bc
        L_0x028b:
            java.lang.Object r0 = r12.A01
            X.K57 r0 = (X.K57) r0
            X.0eM r0 = r0.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBZ r4 = new X.KBZ
            r4.<init>(r0)
            return r4
        L_0x029b:
            java.lang.Object r0 = r12.A01
            X.K57 r0 = (X.K57) r0
            X.0eM r0 = r0.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBY r4 = new X.KBY
            r4.<init>(r0)
            return r4
        L_0x02ab:
            java.lang.Object r0 = r12.A01
            X.K57 r0 = (X.K57) r0
            X.0eM r0 = r0.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328237844413548(0x81105700083c6c, double:3.0374621226549556E-306)
        L_0x02bc:
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r3, r0, r1)
            return r4
        L_0x02c1:
            java.lang.Object r0 = r12.A01
            X.K57 r0 = (X.K57) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A0I
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.72M r4 = new X.72M
            r4.<init>(r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMH.invoke():java.lang.Object");
    }
}
