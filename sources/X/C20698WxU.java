package X;

/* renamed from: X.WxU  reason: case insensitive filesystem */
public final class C20698WxU extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20698WxU(C15374UbS ubS, int i) {
        super(0);
        this.A00 = i;
        this.A01 = ubS;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0220, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0227, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0228, code lost:
        r0 = "priorModule";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022b, code lost:
        r0 = "shoppingSessionId";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r19 = this;
            r2 = r19
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x03a1;
                case 1: goto L_0x0388;
                case 2: goto L_0x03b6;
                case 3: goto L_0x0381;
                case 4: goto L_0x037a;
                case 5: goto L_0x0300;
                case 6: goto L_0x02f1;
                case 7: goto L_0x02e2;
                case 8: goto L_0x03b9;
                case 9: goto L_0x02d3;
                case 10: goto L_0x02c4;
                case 11: goto L_0x03b6;
                case 12: goto L_0x0381;
                case 13: goto L_0x037a;
                case 14: goto L_0x02b4;
                case 15: goto L_0x02a0;
                case 16: goto L_0x028c;
                case 17: goto L_0x027b;
                case 18: goto L_0x0268;
                case 19: goto L_0x0260;
                case 20: goto L_0x0007;
                case 21: goto L_0x0007;
                case 22: goto L_0x0256;
                case 23: goto L_0x024b;
                case 24: goto L_0x0235;
                case 25: goto L_0x01fe;
                case 26: goto L_0x01f4;
                case 27: goto L_0x01c1;
                case 28: goto L_0x0159;
                case 29: goto L_0x01a3;
                case 30: goto L_0x018d;
                case 31: goto L_0x013e;
                case 32: goto L_0x012a;
                case 33: goto L_0x0120;
                case 34: goto L_0x0107;
                case 35: goto L_0x00ea;
                case 36: goto L_0x00d7;
                case 37: goto L_0x00cb;
                case 38: goto L_0x00bf;
                case 39: goto L_0x00a5;
                case 40: goto L_0x0093;
                case 41: goto L_0x0083;
                case 42: goto L_0x0077;
                case 43: goto L_0x006d;
                case 44: goto L_0x0064;
                case 45: goto L_0x0057;
                case 46: goto L_0x004d;
                case 47: goto L_0x0042;
                case 48: goto L_0x0015;
                case 49: goto L_0x0037;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r2.A01
            X.3uv r1 = (X.C255913uv) r1
            r0 = 0
            r1.setCurrentPage(r0)
            r1.setPageCount(r0)
            X.0gF r5 = X.C60340gF.A00
        L_0x0014:
            return r5
        L_0x0015:
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03b9
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0023:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.JSA r0 = (X.JSA) r0
            com.facebook.pando.TreeUpdaterJNI r0 = r0.FHC()
            r5.add(r0)
            goto L_0x0023
        L_0x0037:
            java.lang.Object r0 = r2.A01
            X.G8q r0 = (X.C51947G8q) r0
            if (r0 == 0) goto L_0x03b9
            com.facebook.pando.TreeUpdaterJNI r5 = r0.FHC()
            return r5
        L_0x0042:
            java.lang.Object r0 = r2.A01
            X.5Cd r0 = (X.C282195Cd) r0
            if (r0 == 0) goto L_0x03b9
            com.facebook.pando.TreeUpdaterJNI r5 = r0.FHC()
            return r5
        L_0x004d:
            java.lang.Object r0 = r2.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0057:
            java.lang.Object r0 = r2.A01
            com.instagram.base.activity.IgFragmentActivity r0 = (com.instagram.base.activity.IgFragmentActivity) r0
            X.0wW r0 = r0.getSession()
            com.instagram.common.session.UserSession r5 = X.0Gl.A00(r0)
            return r5
        L_0x0064:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r2.A01
            X.0wW r5 = r1.A05(r0)
            return r5
        L_0x006d:
            java.lang.Object r0 = r2.A01
            X.0lg r0 = (X.0lg) r0
            X.Dc1 r5 = new X.Dc1
            r5.<init>(r0)
            return r5
        L_0x0077:
            java.lang.Object r1 = r2.A01
            X.TrX r1 = (X.C14192TrX) r1
            com.instagram.common.session.UserSession r0 = r1.A01
            X.HqA r5 = new X.HqA
            r5.<init>(r0, r1)
            return r5
        L_0x0083:
            java.lang.Object r0 = r2.A01
            X.TrX r0 = (X.C14192TrX) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            X.4DU r1 = r0.A02
            java.lang.String r0 = r0.A03
            com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository r5 = new com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository
            r5.<init>(r2, r1, r0)
            return r5
        L_0x0093:
            java.lang.Object r0 = r2.A01
            X.TrX r0 = (X.C14192TrX) r0
            androidx.fragment.app.FragmentActivity r3 = r0.A00
            com.instagram.common.session.UserSession r2 = r0.A01
            X.4DU r1 = r0.A02
            java.lang.String r0 = r0.A03
            X.ViT r5 = new X.ViT
            r5.<init>(r3, r2, r1, r0)
            return r5
        L_0x00a5:
            X.C63468KxX.A00()
            java.lang.Object r0 = r2.A01
            X.TrX r0 = (X.C14192TrX) r0
            androidx.fragment.app.FragmentActivity r6 = r0.A00
            com.instagram.common.session.UserSession r7 = r0.A01
            X.4DU r8 = r0.A02
            java.lang.String r9 = r0.A03
            java.lang.String r10 = r0.A04
            X.AnonymousClass7TG.A1O(r7, r8)
            X.Vjf r5 = new X.Vjf
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x00bf:
            java.lang.Object r1 = r2.A01
            X.TrX r1 = (X.C14192TrX) r1
            com.instagram.common.session.UserSession r0 = r1.A01
            X.VgL r5 = new X.VgL
            r5.<init>(r0, r1)
            return r5
        L_0x00cb:
            java.lang.Object r0 = r2.A01
            X.LQf r0 = (X.C64143LQf) r0
            X.MVf r0 = r0.A04
            r0.DvF()
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x00d7:
            java.lang.Object r1 = r2.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 1
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            r0 = 0
            X.6ao r5 = new X.6ao
            r5.<init>(r1, r0)
            return r5
        L_0x00ea:
            java.lang.Object r1 = r2.A01
            X.VU1 r1 = (X.VU1) r1
            boolean r0 = r1 instanceof X.C16348UtN
            if (r0 == 0) goto L_0x0102
            X.UtN r1 = (X.C16348UtN) r1
            X.UtJ r0 = r1.A00
        L_0x00f6:
            com.instagram.common.session.UserSession r2 = r0.A01
            java.lang.String r1 = r0.A03
            X.4DU r0 = r0.A02
            X.6am r5 = new X.6am
            r5.<init>(r0, r2, r1)
            return r5
        L_0x0102:
            X.UtO r1 = (X.C16349UtO) r1
            X.UtK r0 = r1.A00
            goto L_0x00f6
        L_0x0107:
            java.lang.Object r0 = r2.A01
            X.UtO r0 = (X.C16349UtO) r0
            X.UtK r0 = r0.A00
            com.instagram.common.session.UserSession r2 = r0.A01
            androidx.fragment.app.FragmentActivity r1 = r0.A00
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 != 0) goto L_0x011a
            androidx.fragment.app.FragmentActivity r1 = new androidx.fragment.app.FragmentActivity
            r1.<init>()
        L_0x011a:
            X.VU2 r5 = new X.VU2
            r5.<init>(r1, r2)
            return r5
        L_0x0120:
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            X.AnonymousClass0oH.A00(r0)
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x012a:
            java.lang.Object r0 = r2.A01
            X.ViN r0 = (X.C17932ViN) r0
            androidx.fragment.app.FragmentActivity r2 = r0.A00
            boolean r1 = r2 instanceof X.C249463jp
            r0 = 0
            if (r1 == 0) goto L_0x0136
            r0 = r2
        L_0x0136:
            X.3jp r0 = (X.C249463jp) r0
            X.6ao r5 = new X.6ao
            r5.<init>(r2, r0)
            return r5
        L_0x013e:
            java.lang.Object r4 = r2.A01
            X.UbS r4 = (X.C15374UbS) r4
            X.0eM r0 = r4.A0J
            java.lang.Object r3 = r0.getValue()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            r1 = 12
            X.J6T r0 = new X.J6T
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r4)
            X.C17113VIj.A00(r2, r0)
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0159:
            X.C63468KxX.A00()
            java.lang.Object r1 = r2.A01
            X.UbS r1 = (X.C15374UbS) r1
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0eM r0 = r1.A0I
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.4DU r5 = r1.A0C
            java.lang.String r6 = r1.A05
            if (r6 == 0) goto L_0x0228
            java.lang.String r7 = r1.A06
            if (r7 == 0) goto L_0x022b
            X.AnonymousClass7TG.A1O(r4, r5)
            X.Vjf r2 = new X.Vjf
            r2.<init>(r3, r4, r5, r6, r7)
            X.VU0 r0 = r1.A03
            if (r0 != 0) goto L_0x0184
            java.lang.String r0 = "viewModel"
            goto L_0x0220
        L_0x0184:
            X.VcH r0 = r0.A01
            com.instagram.user.model.UpcomingEvent r0 = r0.A00
            X.UtL r5 = r2.A00(r0)
            return r5
        L_0x018d:
            java.lang.Object r3 = r2.A01
            X.UbS r3 = (X.C15374UbS) r3
            X.0eM r0 = r3.A0I
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.4DU r1 = r3.A0C
            java.lang.String r0 = r3.A05
            if (r0 == 0) goto L_0x0228
            com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository r5 = new com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository
            r5.<init>(r2, r1, r0)
            return r5
        L_0x01a3:
            java.lang.Object r5 = r2.A01
            X.UbS r5 = (X.C15374UbS) r5
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            X.0eM r0 = r5.A0I
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.4DU r2 = r5.A0C
            java.lang.String r1 = r5.A05
            if (r1 == 0) goto L_0x0228
            java.lang.String r0 = r5.A06
            if (r0 == 0) goto L_0x022b
            X.ViT r5 = new X.ViT
            r5.<init>(r4, r3, r2, r1)
            return r5
        L_0x01c1:
            java.lang.Object r1 = r2.A01
            X.UbS r1 = (X.C15374UbS) r1
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            android.content.Context r2 = r1.requireContext()
            X.0eM r0 = r1.A0I
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            X.4DU r6 = r1.A0C
            r4 = 0
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto L_0x022b
            java.lang.String r13 = r6.getModuleName()
            r18 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            r17 = 1
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r14 = r4
            r15 = r4
            r16 = r0
            X.2qw r5 = X.C231132qv.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        L_0x01f4:
            java.lang.Object r0 = r2.A01
            X.UbS r0 = (X.C15374UbS) r0
            X.HC9 r5 = new X.HC9
            r5.<init>(r0)
            return r5
        L_0x01fe:
            java.lang.Object r2 = r2.A01
            X.UbS r2 = (X.C15374UbS) r2
            X.0eM r0 = r2.A0I
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.4DU r4 = r2.A0C
            java.lang.String r6 = r2.A06
            if (r6 == 0) goto L_0x022b
            java.lang.String r7 = r2.A05
            if (r7 == 0) goto L_0x0228
            r8 = 0
            X.UzB r5 = X.C16675UzB.UPCOMING_EVENT_BOTTOM_SHEET
            X.VvJ r1 = new X.VvJ
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.2el r0 = r2.A00
            if (r0 != 0) goto L_0x022e
            java.lang.String r0 = "viewpointManager"
        L_0x0220:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0228:
            java.lang.String r0 = "priorModule"
            goto L_0x0220
        L_0x022b:
            java.lang.String r0 = "shoppingSessionId"
            goto L_0x0220
        L_0x022e:
            r1.A00 = r0
            X.VwI r5 = r1.A02()
            return r5
        L_0x0235:
            java.lang.Object r3 = r2.A01
            X.UbS r3 = (X.C15374UbS) r3
            X.0eM r0 = r3.A0I
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r1 = r3.requireContext()
            X.4DU r0 = r3.A0C
            X.Vv5 r5 = new X.Vv5
            r5.<init>(r1, r2, r0, r3)
            return r5
        L_0x024b:
            java.lang.Object r0 = r2.A01
            X.UbS r0 = (X.C15374UbS) r0
            X.0eM r0 = r0.A0I
            X.1Ng r5 = X.DbX.A0R(r0)
            return r5
        L_0x0256:
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3YM r5 = new X.3YM
            r5.<init>(r0)
            return r5
        L_0x0260:
            java.lang.Object r0 = r2.A01
            X.0r6[] r0 = (X.AnonymousClass0r6[]) r0
            int r0 = r0.length
            X.LR6[] r5 = new X.LR6[r0]
            return r5
        L_0x0268:
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = X.0nA.A00(r1, r0)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            return r5
        L_0x027b:
            java.lang.Object r0 = r2.A01
            com.instagram.ui.mediaactions.ScrubberWithKeyFrames r0 = (com.instagram.ui.mediaactions.ScrubberWithKeyFrames) r0
            int r0 = X.DbX.A07(r0.A04)
            float r0 = X.C13988Tno.A01(r0)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            return r5
        L_0x028c:
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x02a0:
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
            float r0 = X.0nA.A00(r1, r0)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            return r5
        L_0x02b4:
            java.lang.Object r0 = r2.A01
            X.K7E r0 = (X.K7E) r0
            X.0eM r0 = r0.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KC5 r5 = new X.KC5
            r5.<init>(r0)
            return r5
        L_0x02c4:
            java.lang.Object r1 = r2.A01
            X.GDa r1 = (X.C52054GDa) r1
            X.0eM r0 = r1.A06
            r0.getValue()
            X.GYK r5 = new X.GYK
            r5.<init>(r1)
            return r5
        L_0x02d3:
            java.lang.Object r1 = r2.A01
            X.GDa r1 = (X.C52054GDa) r1
            X.0eM r0 = r1.A06
            r0.getValue()
            X.GYL r5 = new X.GYL
            r5.<init>(r1)
            return r5
        L_0x02e2:
            java.lang.Object r1 = r2.A01
            X.GDa r1 = (X.C52054GDa) r1
            X.0eM r0 = r1.A06
            r0.getValue()
            X.GFV r5 = new X.GFV
            r5.<init>(r1)
            return r5
        L_0x02f1:
            java.lang.Object r1 = r2.A01
            X.GDa r1 = (X.C52054GDa) r1
            X.0eM r0 = r1.A06
            r0.getValue()
            X.Hq8 r5 = new X.Hq8
            r5.<init>(r1)
            return r5
        L_0x0300:
            java.lang.Object r1 = r2.A01
            X.K4a r1 = (X.C61358K4a) r1
            android.os.Bundle r2 = r1.requireArguments()
            X.0eM r0 = r1.A06
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            r0 = 1035(0x40b, float:1.45E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r9 = r2.getString(r0)
            if (r9 != 0) goto L_0x031c
            java.lang.String r9 = ""
        L_0x031c:
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r10 = r2.getString(r0)
            if (r10 != 0) goto L_0x032a
            java.lang.String r10 = ""
        L_0x032a:
            java.lang.String r11 = r1.A05
            r0 = 2510(0x9ce, float:3.517E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r13 = r2.getBoolean(r0)
            r0 = 985(0x3d9, float:1.38E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r12 = r2.getString(r0)
            r0 = 984(0x3d8, float:1.379E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r6 = r2.getSerializable(r0)
            boolean r0 = r6 instanceof X.C46327Dbv
            if (r0 == 0) goto L_0x0378
            X.Dbv r6 = (X.C46327Dbv) r6
        L_0x0350:
            r0 = 2316(0x90c, float:3.245E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r14 = X.DbT.A1X(r2, r0)
            r0 = 2509(0x9cd, float:3.516E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r8 = r2.getParcelable(r0)
            boolean r0 = r8 instanceof com.instagram.trials.model.TrialMetricsData
            if (r0 == 0) goto L_0x0376
            com.instagram.trials.model.TrialMetricsData r8 = (com.instagram.trials.model.TrialMetricsData) r8
        L_0x036a:
            X.0eM r0 = r1.A07
            boolean r15 = X.AnonymousClass7TF.A1Z(r0)
            X.KEe r5 = new X.KEe
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        L_0x0376:
            r8 = 0
            goto L_0x036a
        L_0x0378:
            r6 = 0
            goto L_0x0350
        L_0x037a:
            java.lang.Object r0 = r2.A01
            X.07f r5 = X.DbY.A0I(r0)
            return r5
        L_0x0381:
            java.lang.Object r0 = r2.A01
            java.lang.Object r5 = X.DbT.A0r(r0)
            return r5
        L_0x0388:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x039f
            r0 = 4009(0xfa9, float:5.618E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0)
        L_0x039a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x039f:
            r0 = 0
            goto L_0x039a
        L_0x03a1:
            java.lang.Object r3 = r2.A01
            com.instagram.trials.impl.TrialsPreferencesImpl r3 = (com.instagram.trials.impl.TrialsPreferencesImpl) r3
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A3V
            java.lang.Class r0 = r3.getClass()
            X.0xa r5 = r2.A04(r1, r0)
            return r5
        L_0x03b6:
            java.lang.Object r5 = r2.A01
            return r5
        L_0x03b9:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20698WxU.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20698WxU(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }
}
