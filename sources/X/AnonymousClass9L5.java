package X;

/* renamed from: X.9L5  reason: invalid class name */
public final class AnonymousClass9L5 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9L5(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bd, code lost:
        if (r1 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bf, code lost:
        r1.setEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c3, code lost:
        r2.A0T.Du1((X.C53401GnY) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0125, code lost:
        r0 = r1.getInt(r2, 0);
        r1 = r1.AR4();
        r1.E5Z(r2, r0 + 1);
        r1.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0138, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0045, code lost:
        r4 = new X.1Ln(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0050, code lost:
        if (r4.A00.isSampled() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0052, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0323, code lost:
        return r1.A01(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x005d;
                case 2: goto L_0x006e;
                case 3: goto L_0x007f;
                case 4: goto L_0x0095;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00ca;
                case 8: goto L_0x00db;
                case 9: goto L_0x00f5;
                case 10: goto L_0x0108;
                case 11: goto L_0x0117;
                case 12: goto L_0x0139;
                case 13: goto L_0x0018;
                case 14: goto L_0x002f;
                case 15: goto L_0x0151;
                case 16: goto L_0x0054;
                case 17: goto L_0x0005;
                case 18: goto L_0x0167;
                case 19: goto L_0x0173;
                case 20: goto L_0x0005;
                case 21: goto L_0x0180;
                case 22: goto L_0x018c;
                case 23: goto L_0x019c;
                case 24: goto L_0x0005;
                case 25: goto L_0x01aa;
                case 26: goto L_0x01b6;
                case 27: goto L_0x01c1;
                case 28: goto L_0x01d6;
                case 29: goto L_0x01e1;
                case 30: goto L_0x01eb;
                case 31: goto L_0x0200;
                case 32: goto L_0x0215;
                case 33: goto L_0x022a;
                case 34: goto L_0x0236;
                case 35: goto L_0x0255;
                case 36: goto L_0x025f;
                case 37: goto L_0x026c;
                case 38: goto L_0x0276;
                case 39: goto L_0x0280;
                case 40: goto L_0x028b;
                case 41: goto L_0x0296;
                case 42: goto L_0x02a1;
                case 43: goto L_0x02ab;
                case 44: goto L_0x02bc;
                case 45: goto L_0x02d0;
                case 46: goto L_0x02e4;
                case 47: goto L_0x02f8;
                case 48: goto L_0x030c;
                case 49: goto L_0x0324;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.7Ru r0 = (X.C331647Ru) r0
            X.7Rs r0 = r0.A00
            X.0sa r0 = r0.A02
            java.lang.Object r0 = r0.invoke()
            X.07g r0 = (X.AnonymousClass07g) r0
            X.07f r4 = r0.getViewModelStore()
        L_0x0017:
            return r4
        L_0x0018:
            java.lang.Object r0 = r5.A01
            X.32a r0 = (X.C2360032a) r0
            X.0eM r0 = r0.A03
            java.lang.Object r2 = r0.getValue()
            X.0wc r2 = (X.0wc) r2
            java.lang.String r1 = "ig_organic_media_cta_click"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r0 = 235(0xeb, float:3.3E-43)
            goto L_0x0045
        L_0x002f:
            java.lang.Object r0 = r5.A01
            X.32a r0 = (X.C2360032a) r0
            X.0eM r0 = r0.A03
            java.lang.Object r2 = r0.getValue()
            X.0wc r2 = (X.0wc) r2
            java.lang.String r1 = "ig_organic_media_cta_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r0 = 236(0xec, float:3.31E-43)
        L_0x0045:
            X.1Ln r4 = new X.1Ln
            r4.<init>(r1, r0)
            X.0Aj r0 = r4.A00
            boolean r0 = r0.isSampled()
            if (r0 != 0) goto L_0x0017
            r4 = 0
            return r4
        L_0x0054:
            java.lang.Object r0 = r5.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x005d:
            java.lang.Object r0 = r5.A01
            X.810 r0 = (X.AnonymousClass810) r0
            android.view.View r1 = r0.A01
            r0 = 2131433444(0x7f0b17e4, float:1.8488674E38)
            android.view.View r4 = r1.requireViewById(r0)
            X.0qQ.A07(r4)
            return r4
        L_0x006e:
            java.lang.Object r0 = r5.A01
            X.810 r0 = (X.AnonymousClass810) r0
            android.view.View r1 = r0.A01
            r0 = 2131433447(0x7f0b17e7, float:1.848868E38)
            android.view.View r4 = r1.requireViewById(r0)
            X.0qQ.A07(r4)
            return r4
        L_0x007f:
            java.lang.Object r0 = r5.A01
            X.88F r0 = (X.AnonymousClass88F) r0
            com.instagram.common.session.UserSession r3 = r0.A0C
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319892722425549(0x8108c000001ecd, double:3.032184633906636E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0095:
            java.lang.Object r2 = r5.A01
            X.8g9 r2 = (X.C361388g9) r2
            r0 = 0
            r2.A00 = r0
            X.01W r0 = r2.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0136
            android.os.Handler r1 = r2.A01
            X.AkT r0 = new X.AkT
            r0.<init>(r2)
            r1.post(r0)
            goto L_0x0136
        L_0x00b0:
            java.lang.Object r2 = r5.A01
            X.8QZ r2 = (X.AnonymousClass8QZ) r2
            android.view.View r1 = r2.A0J
            goto L_0x00bf
        L_0x00b7:
            java.lang.Object r2 = r5.A01
            X.8QZ r2 = (X.AnonymousClass8QZ) r2
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r2.A07
            if (r1 == 0) goto L_0x00c3
        L_0x00bf:
            r0 = 0
            r1.setEnabled(r0)
        L_0x00c3:
            X.8QW r1 = r2.A0T
            r0 = 0
            r1.Du1(r0)
            goto L_0x0136
        L_0x00ca:
            java.lang.Object r0 = r5.A01
            X.8QZ r0 = (X.AnonymousClass8QZ) r0
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r0.A0P
            r0 = 2131436038(0x7f0b2206, float:1.8493935E38)
            android.view.View r4 = r1.requireViewById(r0)
            X.0qQ.A07(r4)
            return r4
        L_0x00db:
            java.lang.Object r2 = r5.A01
            X.8QZ r2 = (X.AnonymousClass8QZ) r2
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r2.A0P
            r0 = 2131436036(0x7f0b2204, float:1.8493931E38)
            android.view.View r1 = r1.findViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            boolean r0 = r2.A0a
            X.8Qd r4 = new X.8Qd
            r4.<init>(r1, r0)
            return r4
        L_0x00f5:
            java.lang.Object r0 = r5.A01
            X.8QZ r0 = (X.AnonymousClass8QZ) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A0L
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            X.WUs r4 = new X.WUs
            r4.<init>(r0)
            return r4
        L_0x0108:
            java.lang.Object r0 = r5.A01
            X.8QZ r0 = (X.AnonymousClass8QZ) r0
            com.instagram.common.session.UserSession r0 = r0.A0O
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r1 = r0.A01
            java.lang.String r2 = "gallery_drag_thumbnail_tray_tooltip"
            goto L_0x0125
        L_0x0117:
            java.lang.Object r0 = r5.A01
            X.8QZ r0 = (X.AnonymousClass8QZ) r0
            com.instagram.common.session.UserSession r0 = r0.A0O
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r1 = r0.A01
            java.lang.String r2 = "gallery_thumbnail_tray_preview_tooltip"
        L_0x0125:
            r0 = 0
            int r0 = r1.getInt(r2, r0)
            X.0xY r1 = r1.AR4()
            int r0 = r0 + 1
            r1.E5Z(r2, r0)
            r1.apply()
        L_0x0136:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0139:
            X.2cp r0 = X.C61340me.A00()
            X.2cs r4 = r0.A02()
            r2 = 1
            r4.A06 = r2
            java.lang.Object r0 = r5.A01
            X.8QZ r0 = (X.AnonymousClass8QZ) r0
            r4.A0A(r0)
            r0 = 0
            r4.A08(r0, r2)
            return r4
        L_0x0151:
            java.lang.Object r3 = r5.A01
            X.0lg r3 = (X.0lg) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Class<X.HDl> r2 = X.C54436HDl.class
            r1 = 32
            X.Ivn r0 = new X.Ivn
            r0.<init>(r3, r1)
            java.lang.Object r4 = r3.A01(r2, r0)
            return r4
        L_0x0167:
            java.lang.Object r0 = r5.A01
            X.7Rs r0 = (X.C331627Rs) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.7GN r4 = new X.7GN
            r4.<init>(r0)
            return r4
        L_0x0173:
            java.lang.Object r0 = r5.A01
            X.7Rs r0 = (X.C331627Rs) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            r0 = 0
            X.GPq r4 = new X.GPq
            r4.<init>(r1, r0)
            return r4
        L_0x0180:
            java.lang.Object r0 = r5.A01
            X.7Rs r0 = (X.C331627Rs) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.7PC r4 = new X.7PC
            r4.<init>(r0)
            return r4
        L_0x018c:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1vn r1 = X.1vm.A01(r0)
            java.lang.String r0 = r0.A06
            com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository r4 = new com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository
            r4.<init>(r1, r0)
            return r4
        L_0x019c:
            X.0rk r2 = new X.0rk
            r2.<init>()
            java.lang.Object r1 = r5.A01
            r0 = 1
            X.WTX r4 = new X.WTX
            r4.<init>(r0, r2, r1)
            return r4
        L_0x01aa:
            java.lang.Object r0 = r5.A01
            X.7Rs r0 = (X.C331627Rs) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.KBn r4 = new X.KBn
            r4.<init>(r0)
            return r4
        L_0x01b6:
            java.lang.Object r0 = r5.A01
            X.8jf r0 = (X.C363398jf) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.2Ly r4 = X.2Lv.A00(r0)
            return r4
        L_0x01c1:
            java.lang.Object r0 = r5.A01
            X.8jf r0 = (X.C363398jf) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 14
            X.Phb r2 = new X.Phb
            r2.<init>(r1, r0)
            java.lang.Class<X.8jg> r0 = X.C363408jg.class
            goto L_0x031f
        L_0x01d6:
            java.lang.Object r0 = r5.A01
            X.8kI r0 = (X.C363758kI) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0wc r4 = X.AnonymousClass0kN.A02(r0)
            return r4
        L_0x01e1:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8jd r4 = new X.8jd
            r4.<init>(r0)
            return r4
        L_0x01eb:
            java.lang.Object r0 = r5.A01
            X.8jd r0 = (X.C363378jd) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 29
            X.Dbl r2 = new X.Dbl
            r2.<init>(r1, r0)
            java.lang.Class<X.8kI> r0 = X.C363758kI.class
            goto L_0x031f
        L_0x0200:
            java.lang.Object r0 = r5.A01
            X.8jd r0 = (X.C363378jd) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 26
            X.Dbl r2 = new X.Dbl
            r2.<init>(r1, r0)
            java.lang.Class<X.A5I> r0 = X.A5I.class
            goto L_0x031f
        L_0x0215:
            java.lang.Object r0 = r5.A01
            X.8jd r0 = (X.C363378jd) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 28
            X.Dbl r2 = new X.Dbl
            r2.<init>(r1, r0)
            java.lang.Class<X.8jf> r0 = X.C363398jf.class
            goto L_0x031f
        L_0x022a:
            java.lang.Object r0 = r5.A01
            X.8jd r0 = (X.C363378jd) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.8k9 r4 = new X.8k9
            r4.<init>(r0)
            return r4
        L_0x0236:
            java.lang.Object r3 = r5.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = 1922747189(0x729acb35, float:6.132013E30)
            r0 = 3
            X.0nV r0 = r2.CO6(r1, r0)
            X.19S r2 = X.19E.A02(r0)
            X.4HU r1 = X.AnonymousClass4HU.A00
            X.4HW r0 = new X.4HW
            r0.<init>(r1)
            X.89T r4 = new X.89T
            r4.<init>(r0, r3, r2)
            return r4
        L_0x0255:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.5w8 r4 = new X.5w8
            r4.<init>(r0)
            return r4
        L_0x025f:
            java.lang.Object r1 = r5.A01
            X.5w8 r1 = (X.AnonymousClass5w8) r1
            X.5w9 r0 = X.AnonymousClass5w8.A05
            com.instagram.common.session.UserSession r0 = r1.A02
            X.8jd r4 = X.C363388je.A00(r0)
            return r4
        L_0x026c:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7wl r4 = new X.7wl
            r4.<init>(r0)
            return r4
        L_0x0276:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7wr r4 = new X.7wr
            r4.<init>(r0)
            return r4
        L_0x0280:
            java.lang.Object r0 = r5.A01
            X.8jR r0 = (X.C363268jR) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.2D6 r4 = X.2D5.A00(r0)
            return r4
        L_0x028b:
            java.lang.Object r0 = r5.A01
            X.8jR r0 = (X.C363268jR) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1Av r4 = X.1Au.A00(r0)
            return r4
        L_0x0296:
            java.lang.Object r0 = r5.A01
            X.8jx r0 = (X.C363568jx) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0wc r4 = X.AnonymousClass0kN.A02(r0)
            return r4
        L_0x02a1:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager r4 = new com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager
            r4.<init>(r0)
            return r4
        L_0x02ab:
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r5.A01
            com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager r0 = (com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager) r0
            com.instagram.common.session.UserSession r0 = r0.userSession
            com.instagram.user.model.User r0 = r1.A01(r0)
            X.16V r4 = r0.A0J()
            return r4
        L_0x02bc:
            java.lang.Object r0 = r5.A01
            com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager r0 = (com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager) r0
            com.instagram.common.session.UserSession r1 = r0.userSession
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 31
            X.Dbl r2 = new X.Dbl
            r2.<init>(r1, r0)
            java.lang.Class<X.9RT> r0 = X.AnonymousClass9RT.class
            goto L_0x031f
        L_0x02d0:
            java.lang.Object r0 = r5.A01
            com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager r0 = (com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager) r0
            com.instagram.common.session.UserSession r1 = r0.userSession
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 35
            X.Dbl r2 = new X.Dbl
            r2.<init>(r1, r0)
            java.lang.Class<X.AcD> r0 = X.C40442AcD.class
            goto L_0x031f
        L_0x02e4:
            java.lang.Object r0 = r5.A01
            com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager r0 = (com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager) r0
            com.instagram.common.session.UserSession r1 = r0.userSession
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 34
            X.Dbl r2 = new X.Dbl
            r2.<init>(r1, r0)
            java.lang.Class<X.8jx> r0 = X.C363568jx.class
            goto L_0x031f
        L_0x02f8:
            java.lang.Object r0 = r5.A01
            com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager r0 = (com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager) r0
            com.instagram.common.session.UserSession r1 = r0.userSession
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 33
            X.Dbl r2 = new X.Dbl
            r2.<init>(r1, r0)
            java.lang.Class<X.8jR> r0 = X.C363268jR.class
            goto L_0x031f
        L_0x030c:
            java.lang.Object r0 = r5.A01
            com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager r0 = (com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager) r0
            com.instagram.common.session.UserSession r1 = r0.userSession
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 37
            X.Dbl r2 = new X.Dbl
            r2.<init>(r1, r0)
            java.lang.Class<X.AcE> r0 = X.C40443AcE.class
        L_0x031f:
            java.lang.Object r4 = r1.A01(r0, r2)
            return r4
        L_0x0324:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.crossposting.story.StoryCrosspostingAudienceSettingManager r4 = new com.instagram.crossposting.story.StoryCrosspostingAudienceSettingManager
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9L5.invoke():java.lang.Object");
    }
}
