package X;

import android.view.View;

/* renamed from: X.SbI  reason: case insensitive filesystem */
public final class C11495SbI implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C11495SbI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C11495SbI(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r2v59, types: [com.facebook.smartcapture.view.PhotoReviewActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x076c, code lost:
        r7 = "stringResourcesDelegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x085f, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0862, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0930, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0933, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0953, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0956, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x096b, code lost:
        X.DbT.A1J(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x096e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0934;
                case 1: goto L_0x08fb;
                case 2: goto L_0x08c5;
                case 3: goto L_0x0895;
                case 4: goto L_0x0874;
                case 5: goto L_0x0863;
                case 6: goto L_0x0848;
                case 7: goto L_0x082b;
                case 8: goto L_0x0771;
                case 9: goto L_0x00d3;
                case 10: goto L_0x072f;
                case 11: goto L_0x06f8;
                case 12: goto L_0x06c6;
                case 13: goto L_0x06a5;
                case 14: goto L_0x0661;
                case 15: goto L_0x060a;
                case 16: goto L_0x05ad;
                case 17: goto L_0x0561;
                case 18: goto L_0x054e;
                case 19: goto L_0x0523;
                case 20: goto L_0x04f8;
                case 21: goto L_0x03a0;
                case 22: goto L_0x037f;
                case 23: goto L_0x036c;
                case 24: goto L_0x0359;
                case 25: goto L_0x0346;
                case 26: goto L_0x0301;
                case 27: goto L_0x0222;
                case 28: goto L_0x0282;
                case 29: goto L_0x01ca;
                case 30: goto L_0x01b4;
                case 31: goto L_0x019e;
                case 32: goto L_0x011d;
                case 33: goto L_0x0967;
                case 34: goto L_0x0115;
                case 35: goto L_0x004f;
                case 36: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.Qcn r0 = (X.C7916Qcn) r0
            java.lang.ref.WeakReference r0 = r0.A00
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r0.get()
            X.TaX r0 = (X.C13444TaX) r0
            if (r0 == 0) goto L_0x001e
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = X.Pxj.A0V(r0)
            com.facebook.smartcapture.logging.IdCaptureButton r0 = com.facebook.smartcapture.logging.IdCaptureButton.RETAKE_PHOTO
            r1.logButtonClick(r0)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r4 = r15.A01
            X.Qcx r4 = (X.C7926Qcx) r4
            X.T6A r3 = r4.A04
            X.RDG r2 = X.RDG.A02
            X.RDI r1 = X.RDI.A03
            java.lang.String r0 = r4.A05
            r3.A00(r2, r1, r0)
            java.lang.ref.WeakReference r0 = r4.A00
            if (r0 == 0) goto L_0x001e
            java.lang.Object r2 = r0.get()
            X.TaX r2 = (X.C13444TaX) r2
            if (r2 == 0) goto L_0x001e
            com.facebook.smartcapture.view.PhotoReviewActivity r2 = (com.facebook.smartcapture.view.PhotoReviewActivity) r2
            android.content.Intent r1 = X.DbS.A09()
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x004b
            android.net.Uri r0 = X.JTQ.A09(r0)
            r1.setData(r0)
        L_0x004b:
            X.Dba.A0k(r2, r1)
            return
        L_0x004f:
            java.lang.Object r7 = r15.A01
            X.Qcx r7 = (X.C7926Qcx) r7
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x096b
            r0 = 33
            X.SbI r6 = new X.SbI
            r6.<init>(r7, r0)
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            android.view.View r4 = r7.A00
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x001e
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.util.List r0 = r7.A07
            r0.clear()
            r5 = 0
            r2 = 0
        L_0x0071:
            int r0 = r4.getChildCount()
            if (r2 >= r0) goto L_0x008e
            android.view.View r1 = r4.getChildAt(r2)
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x008b
            r0 = 8
            r1.setVisibility(r0)
            java.util.List r0 = r7.A07
            r0.add(r1)
        L_0x008b:
            int r2 = r2 + 1
            goto L_0x0071
        L_0x008e:
            X.QdH r1 = r7.A02
            if (r1 == 0) goto L_0x001e
            r0 = 2130970982(0x7f040966, float:1.755069E38)
            int r0 = X.C11408SSf.A01(r3, r0)
            X.Q9N r4 = new X.Q9N
            r4.<init>(r3, r1, r0, r5)
            X.QdH r3 = r7.A02
            r0 = 2131969412(0x7f134584, float:1.9575746E38)
            java.lang.String r2 = r7.getString(r0)
            r1 = 34
            X.SbI r0 = new X.SbI
            r0.<init>(r4, r1)
            r3.setupCancelButton(r2, r0)
            com.instagram.common.ui.base.IgFrameLayout r2 = r7.A03
            if (r2 == 0) goto L_0x001e
            r2.addView(r4)
            r0 = 56
            X.SbM r0 = X.C11499SbM.A00(r7, r2, r0)
            r4.A00 = r0
            X.QdH r1 = r7.A02
            r0 = 2131969413(0x7f134585, float:1.9575748E38)
            java.lang.String r0 = r7.getString(r0)
            r1.setupDestructiveButton(r0, r6)
            r2.setVisibility(r5)
            r4.A01()
            return
        L_0x00d3:
            java.lang.Object r3 = r15.A01
            X.Q5H r3 = (X.Q5H) r3
            r3.dismiss()
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            r2 = 0
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "eligible_to_mock_notification_dialog_showing_quota"
            r1.E5Z(r0, r2)
            r1.apply()
            com.instagram.common.session.UserSession r0 = r3.A00
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "instagram_android_13_notifications_priming_event"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = "no_in_test"
            java.lang.String r0 = "experiment_group"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "mock_system_dialog_accept_clicked"
            java.lang.String r0 = "event_name"
            r2.AAJ(r0, r1)
            r2.Cgf()
            return
        L_0x0115:
            java.lang.Object r0 = r15.A01
            X.Q9N r0 = (X.Q9N) r0
            r0.A00()
            return
        L_0x011d:
            r0 = -151634824(0xfffffffff6f63c78, float:-2.4971318E33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.R8T r5 = (X.R8T) r5
            X.T6A r4 = r5.A0A
            X.0qQ.A0A(r4)
            X.RDG r3 = X.RDG.A02
            X.RDI r1 = X.RDI.A02
            java.lang.String r0 = r5.A0C
            r4.A00(r3, r1, r0)
            boolean r0 = r5.A0G
            java.lang.String r6 = "Required value was null."
            if (r0 == 0) goto L_0x014a
            com.instagram.common.session.UserSession r4 = r5.A08
            if (r4 == 0) goto L_0x018b
            java.lang.String r3 = r5.A0B
            java.lang.String r1 = r5.A0D
            java.lang.String r0 = "select_alt_ids"
            X.STD.A02(r5, r4, r3, r0, r1)
        L_0x014a:
            android.net.Uri r0 = r5.A01
            if (r0 == 0) goto L_0x0183
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x0193
            com.instagram.common.session.UserSession r8 = r5.A08
            X.0qQ.A0A(r8)
            android.net.Uri r0 = r5.A01
            X.0qQ.A0A(r0)
            java.lang.String r10 = r0.getPath()
            X.0qQ.A0A(r10)
            java.lang.String r11 = r5.A0C
            com.facebook.smartcapture.logging.AuthenticityUploadMedium r7 = com.facebook.smartcapture.logging.AuthenticityUploadMedium.IMAGE_PICKER
            X.T8b r9 = new X.T8b
            r9.<init>(r5)
            X.LDn r6 = new X.LDn
            r6.<init>(r7, r8, r9, r10, r11)
            r6.A00()
            X.0hq r0 = r5.A07
            X.0qQ.A0A(r0)
            X.SQH.A02(r0)
            r0 = 218135474(0xd007bb2, float:3.959194E-31)
            goto L_0x085f
        L_0x0183:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r6)
            r0 = 1113302531(0x425ba603, float:54.91212)
            goto L_0x019a
        L_0x018b:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r6)
            r0 = -796344975(0xffffffffd088bd71, float:-1.83529329E10)
            goto L_0x019a
        L_0x0193:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r6)
            r0 = 652553323(0x26e52c6b, float:1.5902107E-15)
        L_0x019a:
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r3
        L_0x019e:
            r0 = -256084387(0xfffffffff0bc765d, float:-4.666102E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.R8T r2 = (X.R8T) r2
            r1 = 0
            r2.A0F = r1
            X.R8T.A00(r2)
            r1 = 890586935(0x35154737, float:5.5610457E-7)
            goto L_0x0930
        L_0x01b4:
            r0 = 1788695666(0x6a9d5472, float:9.510007E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.R8T r2 = (X.R8T) r2
            r1 = 1
            r2.A0F = r1
            X.R8T.A00(r2)
            r1 = 431886851(0x19be1203, float:1.9652814E-23)
            goto L_0x0930
        L_0x01ca:
            r0 = 2089483187(0x7c8afbb3, float:5.773136E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.R8T r5 = (X.R8T) r5
            boolean r1 = r5.A0G
            if (r1 == 0) goto L_0x01ff
            com.instagram.common.session.UserSession r6 = r5.A08
            java.lang.String r2 = "Required value was null."
            if (r6 == 0) goto L_0x020f
            java.lang.String r7 = r5.A0B
            java.lang.String r10 = r5.A0D
            java.lang.String r8 = "av_idv"
            java.lang.String r9 = "select_alt_ids"
            X.STD.A04(r5, r6, r7, r8, r9, r10)
            com.instagram.common.session.UserSession r1 = r5.A08
            if (r1 == 0) goto L_0x0217
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r1)
            r3 = 0
            java.lang.String r1 = r5.A0E
            java.lang.Integer r2 = X.C9757RgF.A00(r1)
            java.lang.String r1 = "idv"
            X.Pxi.A1F(r4, r2, r1, r3)
        L_0x01ff:
            androidx.fragment.app.FragmentActivity r2 = r5.A06
            if (r2 == 0) goto L_0x020a
            boolean r1 = r2 instanceof com.instagram.challenge.activity.ChallengeActivity
            if (r1 == 0) goto L_0x020a
            r2.finish()
        L_0x020a:
            r1 = 1148239859(0x4470bff3, float:962.9992)
            goto L_0x0930
        L_0x020f:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r2)
            r1 = 922020265(0x36f4e9a9, float:7.2989683E-6)
            goto L_0x021e
        L_0x0217:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r2)
            r1 = 927695707(0x374b835b, float:1.21303265E-5)
        L_0x021e:
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r3
        L_0x0222:
            r0 = 1039944624(0x3dfc4bb0, float:0.12319124)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r15.A01
            X.R8P r7 = (X.R8P) r7
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x025a
            com.instagram.common.session.UserSession r0 = r7.getSession()
            java.lang.String r6 = r7.A05
            java.lang.String r5 = r7.A08
            java.lang.String r4 = "av_idv"
            java.lang.String r2 = "select_id_type"
            X.0wc r1 = X.AnonymousClass0kN.A01(r7, r0)
            java.lang.String r0 = "i_dont_have_these_ids"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x025a
            if (r6 != 0) goto L_0x0252
            java.lang.String r6 = ""
        L_0x0252:
            X.STD.A01(r1, r6, r4, r2, r5)
            java.lang.String r0 = "id_verification"
            X.Pxi.A1C(r1, r0)
        L_0x025a:
            androidx.fragment.app.FragmentActivity r1 = r7.A02
            if (r1 != 0) goto L_0x0262
            java.lang.String r7 = "fragmentActivity"
            goto L_0x0911
        L_0x0262:
            com.instagram.common.session.UserSession r0 = r7.getSession()
            X.6Yo r2 = X.DbS.A0M(r1, r0)
            X.R8T r1 = new X.R8T
            r1.<init>()
            android.os.Bundle r0 = r7.A01
            if (r0 != 0) goto L_0x0277
            java.lang.String r7 = "args"
            goto L_0x0911
        L_0x0277:
            r2.A0B(r0, r1)
            r2.A04()
            r0 = 1000109876(0x3b9c7734, float:0.0047749523)
            goto L_0x0953
        L_0x0282:
            java.lang.String r7 = "context"
            r0 = 750136067(0x2cb62b03, float:5.1775264E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.R8P r5 = (X.R8P) r5
            X.T6A r4 = r5.A04
            java.lang.String r6 = "idVerificationLogger"
            if (r4 == 0) goto L_0x02fc
            X.RDG r3 = X.RDG.A02
            X.RDI r2 = X.RDI.A01
            java.lang.String r1 = r5.A07
            r4.A00(r3, r2, r1)
            boolean r1 = r5.A0A
            if (r1 == 0) goto L_0x02b0
            com.instagram.common.session.UserSession r4 = r5.getSession()
            java.lang.String r3 = r5.A05
            java.lang.String r2 = r5.A08
            java.lang.String r1 = "select_id_type"
            X.STD.A02(r5, r4, r3, r1, r2)
        L_0x02b0:
            r4 = 0
            android.content.Context r9 = r5.A00     // Catch:{ IOException -> 0x02e3 }
            if (r9 != 0) goto L_0x02bd
            X.0qQ.A0F(r7)     // Catch:{ IOException -> 0x02e3 }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x02e3 }
            throw r1     // Catch:{ IOException -> 0x02e3 }
        L_0x02bd:
            com.instagram.common.session.UserSession r10 = r5.getSession()     // Catch:{ IOException -> 0x02e3 }
            java.lang.String r11 = r5.A06     // Catch:{ IOException -> 0x02e3 }
            java.lang.String r12 = r5.A07     // Catch:{ IOException -> 0x02e3 }
            java.lang.String r13 = r5.A05     // Catch:{ IOException -> 0x02e3 }
            java.lang.String r14 = r5.A08     // Catch:{ IOException -> 0x02e3 }
            X.Qca r8 = new X.Qca     // Catch:{ IOException -> 0x02e3 }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x02e3 }
            android.content.Intent r1 = r8.A00()
            X.0kR.A05(r5, r1, r4)
            X.T6A r4 = r5.A04
            if (r4 == 0) goto L_0x02fc
            X.RDG r3 = X.RDG.A04
            X.RDI r2 = X.RDI.A04
            java.lang.String r1 = r5.A07
            r4.A00(r3, r2, r1)
            goto L_0x02f7
        L_0x02e3:
            android.content.Context r3 = r5.A00
            if (r3 == 0) goto L_0x0911
            r1 = 2131974093(0x7f1357cd, float:1.958524E38)
            java.lang.String r2 = r5.getString(r1)
            r1 = 74
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.C59689JTv.A03(r3, r2, r1, r4)
        L_0x02f7:
            r1 = 1051131174(0x3ea6fd26, float:0.32615012)
            goto L_0x0930
        L_0x02fc:
            X.0qQ.A0F(r6)
            goto L_0x0914
        L_0x0301:
            r0 = -1690649893(0xffffffff9b3abadb, float:-1.5445936E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.R8P r5 = (X.R8P) r5
            boolean r1 = r5.A0A
            if (r1 == 0) goto L_0x0334
            com.instagram.common.session.UserSession r6 = r5.getSession()
            java.lang.String r7 = r5.A05
            java.lang.String r10 = r5.A08
            java.lang.String r8 = "av_idv"
            java.lang.String r9 = "select_id_type"
            X.STD.A04(r5, r6, r7, r8, r9, r10)
            com.instagram.common.session.UserSession r1 = r5.getSession()
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r1)
            r3 = 0
            java.lang.String r1 = r5.A09
            java.lang.Integer r2 = X.C9757RgF.A00(r1)
            java.lang.String r1 = "idv"
            X.Pxi.A1F(r4, r2, r1, r3)
        L_0x0334:
            androidx.fragment.app.FragmentActivity r2 = r5.A02
            java.lang.String r7 = "fragmentActivity"
            if (r2 == 0) goto L_0x0911
            boolean r1 = r2 instanceof com.instagram.challenge.activity.ChallengeActivity
            if (r1 == 0) goto L_0x0341
            r2.finish()
        L_0x0341:
            r1 = 1337157178(0x4fb3663a, float:6.0196424E9)
            goto L_0x0930
        L_0x0346:
            r0 = -937358057(0xffffffffc8210d17, float:-164916.36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbT.A1K(r1)
            r1 = 1255345172(0x4ad30c14, float:6915594.0)
            goto L_0x0930
        L_0x0359:
            r0 = -105439402(0xfffffffff9b71f56, float:-1.1885324E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.QA2 r1 = (X.QA2) r1
            r1.toggle()
            r1 = -1336554324(0xffffffffb055ccac, float:-7.7779805E-10)
            goto L_0x0930
        L_0x036c:
            r0 = 1762455590(0x690cf026, float:1.064898E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            r1.dismiss()
            r1 = -1300123868(0xffffffffb281af24, float:-1.5097221E-8)
            goto L_0x0930
        L_0x037f:
            r0 = -896747795(0xffffffffca8cb6ed, float:-4610934.5)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.R8R r1 = (X.R8R) r1
            android.view.View r0 = r1.A00
            X.AnonymousClass7TF.A16(r0)
            android.webkit.WebView r1 = r1.A02
            if (r1 == 0) goto L_0x039b
            r0 = 8
            r1.setVisibility(r0)
            r1.reload()
        L_0x039b:
            r0 = 253613674(0xf1dd66a, float:7.781992E-30)
            goto L_0x0953
        L_0x03a0:
            r0 = -1221058655(0xffffffffb7381fa1, float:-1.0974619E-5)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.PMS r5 = (X.PMS) r5
            X.O9u r0 = r5.A03()
            X.Neh r4 = r0.A00
            X.02m r9 = r4.A05
            r8 = 658910172(0x27462bdc, float:2.7501796E-15)
            r9.markerStart(r8)
            com.instagram.common.session.UserSession r7 = r4.A06
            X.0Tu r6 = X.0Tu.A05
            r0 = 36320747421180726(0x81098700042336, double:3.0327251488410056E-306)
            boolean r12 = X.182.A06(r6, r7, r0)
            r0 = 1
            r11 = 5
            X.Ocu r2 = r4.A08
            X.PPM r10 = new X.PPM
            r10.<init>(r11, r0)
            if (r12 == 0) goto L_0x04ed
            long r0 = r4.A00
            r2.A04(r10, r0)
        L_0x03d7:
            r0 = 2
            r9.markerEnd(r8, r0)
            r0 = 36320747421573947(0x810987000a233b, double:3.03272514908968E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0481
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.A00
            android.app.Activity r10 = r4.A04
            int r0 = X.Pxe.A05(r10, r0)
            if (r0 != 0) goto L_0x0481
            X.1Av r0 = r4.A07
            X.0xa r7 = r0.A01
            java.lang.String r6 = "previous_in_app_review_prompt_time"
            r0 = 0
            long r11 = r7.getLong(r6, r0)
            r8 = 10368000000(0x269fb2000, double:5.122472616E-314)
            int r6 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x040e
            long r6 = X.C51966G9m.A07(r11)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0481
        L_0x040e:
            android.content.Context r0 = r10.getApplicationContext()
            if (r0 == 0) goto L_0x0415
            r10 = r0
        L_0x0415:
            X.SEa r0 = new X.SEa
            r0.<init>(r10)
            X.SzS r9 = new X.SzS
            r9.<init>(r0)
            X.SEa r7 = r9.A01
            X.SGg r11 = X.C11174SEa.A02
            r8 = 1
            java.lang.String r0 = r7.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "requestInAppReview (%s)"
            r11.A01(r0, r1)
            X.SOS r10 = r7.A00
            if (r10 != 0) goto L_0x04a3
            java.lang.String r7 = "Play Store app is either not installed or not the official version"
            java.lang.String r6 = "PlayCore"
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r6, r0)
            if (r0 == 0) goto L_0x044a
            java.lang.String r1 = r11.A00
            java.lang.String r0 = " : "
            java.lang.String r0 = X.002.A0g(r1, r0, r7)
            android.util.Log.e(r6, r0)
        L_0x044a:
            r10 = -1
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.util.Map r1 = X.C10089RmR.A00
            boolean r0 = r1.containsKey(r12)
            if (r0 != 0) goto L_0x0490
            java.lang.String r0 = ""
        L_0x045d:
            java.lang.Object[] r1 = new java.lang.Object[]{r12, r0}
            java.lang.String r0 = "Review Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r11, r0, r1)
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r1.<init>(r10, r0)
            X.QpG r0 = new X.QpG
            r0.<init>(r1)
            X.9GD r7 = new X.9GD
            r7.<init>()
            r7.A0B(r0)
        L_0x0479:
            X.Syz r0 = new X.Syz
            r0.<init>(r8, r9, r4)
            r7.A03(r0)
        L_0x0481:
            X.PNo r6 = X.C72878PNo.A00
            long r0 = r4.A00
            r2.A06(r6, r0)
            X.PMS.A02(r5)
            r0 = 741546638(0x2c331a8e, float:2.545217E-12)
            goto L_0x0953
        L_0x0490:
            java.lang.String r7 = X.DbT.A11(r12, r1)
            java.util.Map r0 = X.C10089RmR.A01
            java.lang.String r6 = X.DbT.A11(r12, r0)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#"
            java.lang.String r0 = ")"
            java.lang.String r0 = X.002.A0u(r7, r1, r6, r0)
            goto L_0x045d
        L_0x04a3:
            X.8nD r1 = new X.8nD
            r1.<init>()
            X.Qy1 r6 = new X.Qy1
            r6.<init>(r1, r1, r7)
            java.lang.Object r12 = r10.A07
            monitor-enter(r12)
            java.util.Set r0 = r10.A0A     // Catch:{ all -> 0x04f5 }
            r0.add(r1)     // Catch:{ all -> 0x04f5 }
            X.9GD r7 = r1.A00     // Catch:{ all -> 0x04f5 }
            X.Syx r0 = new X.Syx     // Catch:{ all -> 0x04f5 }
            r0.<init>(r1, r10)     // Catch:{ all -> 0x04f5 }
            r7.A03(r0)     // Catch:{ all -> 0x04f5 }
            monitor-exit(r12)     // Catch:{ all -> 0x04f5 }
            monitor-enter(r12)
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A0B     // Catch:{ all -> 0x04f2 }
            int r0 = r0.getAndIncrement()     // Catch:{ all -> 0x04f2 }
            if (r0 <= 0) goto L_0x04dd
            X.SGg r13 = r10.A06     // Catch:{ all -> 0x04f2 }
            java.lang.String r11 = "Already connected to the service."
            java.lang.String r1 = "PlayCore"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x04f2 }
            if (r0 == 0) goto L_0x04dd
            java.lang.String r1 = r13.A00     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = " : "
            X.002.A0g(r1, r0, r11)     // Catch:{ all -> 0x04f2 }
        L_0x04dd:
            monitor-exit(r12)     // Catch:{ all -> 0x04f2 }
            X.8nD r0 = r6.A00
            X.Qxz r1 = new X.Qxz
            r1.<init>(r0, r6, r10)
            android.os.Handler r0 = r10.A01()
            r0.post(r1)
            goto L_0x0479
        L_0x04ed:
            r2.A03(r10)
            goto L_0x03d7
        L_0x04f2:
            r3 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x04f2 }
            throw r3
        L_0x04f5:
            r3 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x04f5 }
            throw r3
        L_0x04f8:
            r0 = -515573910(0xffffffffe144f76a, float:-2.2708687E20)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.TKb r4 = (X.C13071TKb) r4
            com.instagram.react.modules.navigator.IgReactNavigatorModule r0 = r4.A03
            X.QZK r1 = r0.getReactApplicationContextIfActiveOrWarn()
            if (r1 == 0) goto L_0x051e
            java.lang.Class<com.instagram.react.delegate.IgReactDelegate$RCTViewEventEmitter> r0 = com.instagram.react.delegate.IgReactDelegate.RCTViewEventEmitter.class
            com.facebook.react.bridge.JavaScriptModule r2 = r1.A02(r0)
            com.instagram.react.delegate.IgReactDelegate$RCTViewEventEmitter r2 = (com.instagram.react.delegate.IgReactDelegate.RCTViewEventEmitter) r2
            double r0 = r4.A00
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "didTapRightBarButton"
            r2.emit(r0, r1)
        L_0x051e:
            r0 = 264449024(0xfc32c00, float:1.9245433E-29)
            goto L_0x0953
        L_0x0523:
            r0 = -1931442337(0xffffffff8ce0875f, float:-3.4594138E-31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.TJz r4 = (X.C13069TJz) r4
            com.instagram.react.modules.navigator.IgReactNavigatorModule r0 = r4.A02
            X.QZK r1 = r0.getReactApplicationContextIfActiveOrWarn()
            if (r1 == 0) goto L_0x0549
            java.lang.Class<com.instagram.react.delegate.IgReactDelegate$RCTViewEventEmitter> r0 = com.instagram.react.delegate.IgReactDelegate.RCTViewEventEmitter.class
            com.facebook.react.bridge.JavaScriptModule r2 = r1.A02(r0)
            com.instagram.react.delegate.IgReactDelegate$RCTViewEventEmitter r2 = (com.instagram.react.delegate.IgReactDelegate.RCTViewEventEmitter) r2
            double r0 = r4.A00
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "didTapLeftBarButton"
            r2.emit(r0, r1)
        L_0x0549:
            r0 = 1136421817(0x43bc6bb9, float:376.84158)
            goto L_0x0953
        L_0x054e:
            r0 = 2102434993(0x7d509cb1, float:1.7330813E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.R8W r1 = (X.R8W) r1
            r1.A00()
            r1 = 1141560456(0x440ad488, float:555.3208)
            goto L_0x0930
        L_0x0561:
            r0 = 1948156797(0x741e837d, float:5.0234973E31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            X.R8N r0 = (X.R8N) r0
            X.S3Q r6 = X.R8N.A00(r0)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "page"
            java.lang.String r0 = "settings"
            r5.putString(r1, r0)
            com.instagram.common.session.UserSession r4 = r6.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310362190250018(0x81001500040022, double:3.0261574869824575E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x05a4
            androidx.fragment.app.Fragment r0 = X.SAY.A00(r5)
        L_0x0590:
            androidx.fragment.app.FragmentActivity r1 = r6.A01
            X.6Yo r1 = X.DbS.A0M(r1, r4)
            X.0qQ.A0A(r0)
            r1.A0D(r0)
            r1.A04()
            r0 = 2143346146(0x7fc0dde2, float:NaN)
            goto L_0x0953
        L_0x05a4:
            com.instagram.settings.common.PaymentOptionsFragment r0 = new com.instagram.settings.common.PaymentOptionsFragment
            r0.<init>()
            r0.setArguments(r5)
            goto L_0x0590
        L_0x05ad:
            r0 = -1714010851(0xffffffff99d6451d, float:-2.2154996E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.R8N r1 = (X.R8N) r1
            X.S3Q r9 = X.R8N.A00(r1)
            android.content.Context r7 = r9.A00
            androidx.fragment.app.FragmentActivity r5 = r9.A01
            com.instagram.common.session.UserSession r8 = r9.A02
            X.8ab r4 = new X.8ab
            r4.<init>((android.content.Context) r7)
            r1 = 2131954300(0x7f130a7c, float:1.9545095E38)
            r4.A09(r1)
            r1 = 2131954299(0x7f130a7b, float:1.9545093E38)
            r4.A08(r1)
            r1 = 2131954298(0x7f130a7a, float:1.9545091E38)
            java.lang.String r10 = r9.A04
            r11 = 2
            X.SV6 r6 = new X.SV6
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A0K(r6, r1)
            r3 = 2131954308(0x7f130a84, float:1.9545112E38)
            r2 = 3
            X.SV4 r1 = new X.SV4
            r1.<init>(r2, r8, r9, r5)
            r4.A0G(r1, r3)
            r2 = 2131954297(0x7f130a79, float:1.954509E38)
            r1 = 43
            X.SVE r1 = X.SVE.A00(r9, r1)
            r4.A0H(r1, r2)
            r1 = 1
            X.AnonymousClass7TH.A0a(r4, r1)
            X.SHc r3 = r9.A03
            java.lang.String r2 = "clear_all_clicked"
            r1 = 0
            X.C11242SHc.A00(r3, r2, r1)
            r1 = 1620281193(0x60938769, float:8.504465E19)
            goto L_0x0930
        L_0x060a:
            r0 = -240758051(0xfffffffff1a652dd, float:-1.64719E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.R8N r1 = (X.R8N) r1
            X.S3Q r5 = X.R8N.A00(r1)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r4 = r5.A02
            java.util.ArrayList r1 = X.23d.A02()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r1)
            java.lang.String r1 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
            r3.putStringArrayList(r1, r2)
            java.lang.String r2 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r1 = "browser_settings_fragment"
            r3.putString(r2, r1)
            java.lang.String r2 = "BrowserLiteIntent.InstagramExtras.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS_INDEX"
            r1 = 0
            r3.putInt(r2, r1)
            X.SHc r1 = r5.A03
            boolean r2 = r1.A04
            java.lang.String r1 = "Tracking.ENABLED"
            r3.putBoolean(r1, r2)
            X.1Yj r1 = X.AnonymousClass1Yj.A00
            if (r1 != 0) goto L_0x064b
            java.lang.String r7 = "newInstance"
            goto L_0x0911
        L_0x064b:
            X.R8X r2 = new X.R8X
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r5.A01
            X.6Yo r1 = X.DbU.A0Q(r1, r4)
            r1.A0B(r3, r2)
            r1.A04()
            r1 = -1932645814(0xffffffff8cce2a4a, float:-3.1764777E-31)
            goto L_0x0930
        L_0x0661:
            r0 = -574824946(0xffffffffddbcde0e, float:-1.70116631E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.R8N r1 = (X.R8N) r1
            X.S3Q r7 = X.R8N.A00(r1)
            android.content.Context r6 = r7.A00
            com.instagram.common.session.UserSession r5 = r7.A02
            X.8ab r4 = new X.8ab
            r4.<init>((android.content.Context) r6)
            r1 = 2131954288(0x7f130a70, float:1.954507E38)
            r4.A09(r1)
            r1 = 2131954287(0x7f130a6f, float:1.9545069E38)
            r4.A08(r1)
            r3 = 2131954286(0x7f130a6e, float:1.9545067E38)
            r2 = 2
            X.SV4 r1 = new X.SV4
            r1.<init>(r2, r5, r7, r6)
            r4.A0K(r1, r3)
            r2 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.SUx r1 = new X.SUx
            r1.<init>()
            r4.A0G(r1, r2)
            r1 = 1
            X.AnonymousClass7TH.A0a(r4, r1)
            r1 = 448684425(0x1abe6189, float:7.8739735E-23)
            goto L_0x0930
        L_0x06a5:
            r0 = 1279749216(0x4c476c60, float:5.2277632E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.QD7 r1 = (X.QD7) r1
            X.2Fj r4 = r1.A06
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "promotion_payment"
            X.SFA r1 = new X.SFA
            r1.<init>(r2, r3)
            X.SR4.A01(r4, r1)
            r1 = 1827286865(0x6cea2f51, float:2.2648967E27)
            goto L_0x0930
        L_0x06c6:
            r0 = -226602831(0xfffffffff27e50b1, float:-5.0372315E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.Qn9 r5 = (X.C8267Qn9) r5
            X.2FO r3 = r5.A03
            com.facebookpay.logging.FBPayLoggerData r1 = r5.A00
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r1)
            java.lang.String r1 = "fbpay_all_payment_activity_button_click"
            android.os.Bundle r4 = X.Pxi.A0E(r3, r1, r2)
            com.facebookpay.logging.FBPayLoggerData r2 = r5.A00
            java.lang.String r1 = "logger_data"
            r4.putParcelable(r1, r2)
            X.2Fj r3 = r5.A06
            java.lang.String r2 = "transactions_list"
            X.SFA r1 = new X.SFA
            r1.<init>(r2, r4)
            X.SR4.A01(r3, r1)
            r1 = 1306408549(0x4dde3665, float:4.66013344E8)
            goto L_0x0930
        L_0x06f8:
            r0 = -1096956666(0xffffffffbe9dc506, float:-0.3081438)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity r4 = (com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity) r4
            X.13u r0 = r4.A03
            if (r0 != 0) goto L_0x070c
            java.lang.String r7 = "resourcesLogger"
            goto L_0x0911
        L_0x070c:
            X.0Ae r1 = r0.A01
            java.lang.String r0 = "fbresources_use_english"
            X.0wc r1 = (X.0wc) r1
            X.DbZ.A1R(r1, r0)
            X.1Qr r2 = r4.A04
            if (r2 == 0) goto L_0x076c
            X.1Ql r0 = r2.A03
            java.util.concurrent.atomic.AtomicReference r1 = r0.A01
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.set(r0)
            X.AnonymousClass1Qr.A01(r2)
            com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity.A01(r4)
            r0 = 427713368(0x197e6358, float:1.31515545E-23)
            goto L_0x0953
        L_0x072f:
            r0 = 1423580688(0x54da1e10, float:7.4944579E12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity r3 = (com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity) r3
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0767
            java.lang.String r7 = "resourcesLogger"
            X.13u r0 = r3.A03
            if (r0 == 0) goto L_0x0911
            X.0Ae r1 = r0.A01
            java.lang.String r0 = "fbresources_loading_retry"
            X.0wc r1 = (X.0wc) r1
            X.DbZ.A1R(r1, r0)
            X.02m r1 = X.02m.A0p
            r0 = 4456452(0x440004, float:6.24482E-39)
            r1.markerStart(r0)
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0764
            r0 = 0
            r3.A09 = r0
            X.1Qr r0 = r3.A04
            if (r0 == 0) goto L_0x076c
            r0.A04()
        L_0x0764:
            com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity.A00(r3)
        L_0x0767:
            r0 = 193034992(0xb817af0, float:4.987397E-32)
            goto L_0x085f
        L_0x076c:
            java.lang.String r7 = "stringResourcesDelegate"
            goto L_0x0911
        L_0x0771:
            r0 = -1617227367(0xffffffff9f9b1199, float:-6.5674166E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog r0 = (com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog) r0
            X.Rpj r0 = r0.A02
            if (r0 == 0) goto L_0x0827
            X.TJC r0 = r0.A00
            X.T5o r6 = r0.A01
            X.Rvw r5 = r6.A01
            java.util.List r0 = r0.A02
            r4 = 0
            java.util.Iterator r12 = r0.iterator()
        L_0x078d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0822
            java.lang.Object r10 = r12.next()
            com.facebook.android.instantexperiences.autofill.model.FbAutofillData r10 = (com.facebook.android.instantexperiences.autofill.model.FbAutofillData) r10
            X.S6n r8 = r5.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData<*, *>"
            X.0qQ.A0C(r10, r0)
            boolean r0 = r10 instanceof com.facebook.android.instantexperiences.autofill.model.NameAutofillData
            if (r0 == 0) goto L_0x0801
            java.util.ArrayList r11 = r8.A02()
            java.lang.String r7 = "ix_autofill_name"
        L_0x07ab:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r11.iterator()
        L_0x07b3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07c8
            java.lang.Object r1 = r3.next()
            com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData r1 = (com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData) r1
            boolean r0 = r1.Ccl(r10)
            if (r0 == 0) goto L_0x07b3
            r11.remove(r1)
        L_0x07c8:
            r9.add(r10)
            r9.addAll(r11)
            org.json.JSONArray r10 = X.Pxe.A1E()
            java.util.Iterator r9 = r9.iterator()
        L_0x07d6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x07f5
            java.lang.Object r0 = r9.next()
            com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData r0 = (com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData) r0
            org.json.JSONObject r0 = r0.A02()     // Catch:{ JSONException -> 0x07ea }
            r10.put(r0)     // Catch:{ JSONException -> 0x07ea }
            goto L_0x07d6
        L_0x07ea:
            r3 = move-exception
            java.lang.String r1 = "IgAutofillDataStore"
            java.lang.String r0 = r3.toString()
            X.0KC.A0F(r1, r0, r3)
            goto L_0x07d6
        L_0x07f5:
            X.1Av r0 = r8.A00
            java.lang.String r1 = r10.toString()
            X.0xa r0 = r0.A01
            X.DbX.A1U(r0, r7, r1)
            goto L_0x078d
        L_0x0801:
            boolean r0 = r10 instanceof com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData
            if (r0 == 0) goto L_0x080c
            java.util.ArrayList r11 = r8.A03()
            java.lang.String r7 = "ix_autofill_phone"
            goto L_0x07ab
        L_0x080c:
            boolean r0 = r10 instanceof com.facebook.android.instantexperiences.autofill.model.AddressAutofillData
            if (r0 == 0) goto L_0x0817
            java.util.ArrayList r11 = r8.A00()
            java.lang.String r7 = "ix_autofill_address"
            goto L_0x07ab
        L_0x0817:
            boolean r0 = r10 instanceof com.facebook.android.instantexperiences.autofill.model.EmailAutofillData
            if (r0 == 0) goto L_0x078d
            java.util.ArrayList r11 = r8.A01()
            java.lang.String r7 = "ix_autofill_email"
            goto L_0x07ab
        L_0x0822:
            X.S1O r0 = r6.A02
            r0.A00(r4)
        L_0x0827:
            r0 = 655892243(0x27181f13, float:2.1111083E-15)
            goto L_0x085f
        L_0x082b:
            r0 = -119272983(0xfffffffff8e409e9, float:-3.7001396E34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog r0 = (com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog) r0
            X.Rpj r0 = r0.A02
            if (r0 == 0) goto L_0x0844
            X.TJC r0 = r0.A00
            X.T5o r0 = r0.A01
            X.S1O r1 = r0.A02
            r0 = 0
            r1.A00(r0)
        L_0x0844:
            r0 = 1129384654(0x43510ace, float:209.0422)
            goto L_0x085f
        L_0x0848:
            r0 = -197136483(0xfffffffff43fef9d, float:-6.0826943E31)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome r0 = (com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome) r0
            X.TbM r0 = r0.A07
            X.T5p r0 = (X.C12755T5p) r0
            X.R8a r0 = r0.A00
            X.DbX.A1I(r0)
            r0 = -2082787230(0xffffffff83db3062, float:-1.2882771E-36)
        L_0x085f:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0863:
            r0 = -2098778524(0xffffffff82e72e64, float:-3.3969026E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dba.A1Q(r1)
            r1 = -1351526804(0xffffffffaf71566c, float:-2.1949526E-10)
            goto L_0x0930
        L_0x0874:
            r0 = 874940173(0x3426870d, float:1.5509086E-7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.R8Q r1 = (X.R8Q) r1
            android.view.View r0 = r1.A00
            X.AnonymousClass7TF.A16(r0)
            android.webkit.WebView r1 = r1.A02
            if (r1 == 0) goto L_0x0890
            r0 = 8
            r1.setVisibility(r0)
            r1.reload()
        L_0x0890:
            r0 = -553534837(0xffffffffdf01ba8b, float:-9.347937E18)
            goto L_0x0953
        L_0x0895:
            r0 = 1862022308(0x6efc34a4, float:3.902693E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.String r1 = "android.intent.action.GET_CONTENT"
            android.content.Intent r4 = X.Pxe.A0G(r1)
            java.lang.String r2 = "image/*"
            java.lang.String r1 = "video/*"
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[]{r2, r1}
            java.lang.String r1 = "*/*"
            r4.setType(r1)
            r1 = 2600(0xa28, float:3.643E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.putExtra(r1, r2)
            X.0kR.A06(r5, r4, r3)
            r1 = -98267554(0xfffffffffa248e5e, float:-2.1360606E35)
            goto L_0x0930
        L_0x08c5:
            r0 = -1577503739(0xffffffffa1f93405, float:-1.6886666E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.8ab r3 = new X.8ab
            r3.<init>((android.app.Activity) r1)
            r1 = 2131972122(0x7f13501a, float:1.9581243E38)
            r3.A09(r1)
            r1 = 2131972121(0x7f135019, float:1.958124E38)
            r3.A08(r1)
            r2 = 2131971974(0x7f134f86, float:1.9580942E38)
            r1 = 39
            X.SVE r1 = X.SVE.A00(r4, r1)
            r3.A0K(r1, r2)
            r3.A03()
            X.DbT.A1V(r3)
            r1 = 1736200582(0x677c5186, float:1.1915402E24)
            goto L_0x0930
        L_0x08fb:
            r0 = -1320148803(0xffffffffb15020bd, float:-3.0286593E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.R8J r3 = (X.R8J) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            android.widget.TextView r1 = r3.A00
            if (r1 != 0) goto L_0x0919
            java.lang.String r7 = "textView"
        L_0x0911:
            X.0qQ.A0F(r7)
        L_0x0914:
            X.00P r3 = X.AnonymousClass00P.createAndThrow()
            throw r3
        L_0x0919:
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            X.0nC.A00(r2, r1)
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            java.lang.String r1 = "Copied to clipboard"
            X.C59689JTv.A09(r2, r1)
            r1 = -1365714326(0xffffffffae98da6a, float:-6.950958E-11)
        L_0x0930:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0934:
            r0 = 552745603(0x20f23a83, float:4.1035114E-19)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.R8Z r2 = (X.R8Z) r2
            com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r0 = r2.A01
            X.0xI r1 = com.instagram.common.analytics.intf.AnalyticsEventDebugInfo.A00(r0)
            if (r1 != 0) goto L_0x0957
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r0 = "Event Relogg failed not event"
        L_0x094d:
            X.C59689JTv.A09(r1, r0)
            r0 = 1663577317(0x63282ce5, float:3.102288E21)
        L_0x0953:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0957:
            X.0wW r0 = r2.A02
            X.0xN r0 = X.C60510iO.A00(r0)
            r0.EHF(r1)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r0 = "Event Relogged"
            goto L_0x094d
        L_0x0967:
            java.lang.Object r7 = r15.A01
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
        L_0x096b:
            X.DbT.A1J(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11495SbI.onClick(android.view.View):void");
    }
}
