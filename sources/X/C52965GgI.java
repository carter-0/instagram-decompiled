package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository;
import java.util.List;

/* renamed from: X.GgI  reason: case insensitive filesystem */
public final class C52965GgI extends C361478gI {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C56515Hzm A03;
    public final I25 A04;
    public final ImagineEditRepository A05;
    public final 0sP A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;
    public final AnonymousClass0Ud A0D;
    public final boolean A0E;
    public final C56150Htc A0F;
    public final AnonymousClass0r6 A0G;
    public final 05G A0H;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52965GgI(android.app.Application r21, com.meta.foa.session.FoaUserSession r22, X.I25 r23, X.C56150Htc r24, X.0sP r25, X.AnonymousClass0r6 r26) {
        /*
            r20 = this;
            r4 = 1
            r5 = r21
            X.0qQ.A0B(r5, r4)
            r3 = r22
            r7 = r23
            r6 = r24
            r0 = r25
            r1 = r26
            X.C51974G9v.A1S(r3, r6, r7, r1, r0)
            r2 = r20
            r2.<init>(r5)
            r2.A0F = r6
            r2.A04 = r7
            r2.A0G = r1
            r2.A06 = r0
            r12 = 0
            X.Hzm r0 = new X.Hzm
            r0.<init>(r3, r6)
            r2.A03 = r0
            r15 = 0
            X.I1q r11 = new X.I1q
            r13 = r12
            r14 = r15
            r16 = r15
            r17 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.02z r0 = X.DbS.A10(r11)
            r2.A0H = r0
            r2.A0C = r0
            java.lang.Integer r8 = r6.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r8 = X.AnonymousClass7TF.A1W(r8, r0)
            r2.A0E = r8
            X.HIL r0 = X.HIL.A00
            X.02z r0 = X.106.A01(r0)
            r2.A09 = r0
            X.05F r0 = X.10b.A03(r0)
            r2.A0D = r0
            X.HHg r11 = X.C54520HHg.A00
            X.Icv r10 = X.C57568Icv.A00
            X.HIE r9 = new X.HIE
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            X.02z r0 = X.DbS.A10(r9)
            r2.A08 = r0
            r2.A0B = r0
            if (r8 == 0) goto L_0x006a
            X.HHh r11 = X.C54521HHh.A00
        L_0x006a:
            X.02z r0 = X.106.A01(r11)
            r2.A07 = r0
            r2.A0A = r0
            r2.A02 = r4
            X.Nky r0 = r6.A02
            com.meta.metaai.imagine.service.ImagineNetworkService r8 = new com.meta.metaai.imagine.service.ImagineNetworkService
            r8.<init>(r5, r3, r0)
            X.6oS r17 = X.C318116oQ.A00(r2)
            X.HMY r4 = r6.A01
            boolean r3 = r6.A0O
            boolean r0 = r6.A0P
            com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository r13 = new com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository
            r16 = r8
            r18 = r3
            r19 = r0
            r14 = r7
            r15 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r2.A05 = r13
            X.HtR r7 = r6.A03
            if (r7 == 0) goto L_0x00b8
            java.lang.String r6 = r7.A02
            boolean r0 = android.webkit.URLUtil.isFileUrl(r6)
            if (r0 == 0) goto L_0x00b8
            X.6oS r4 = X.C318116oQ.A00(r2)
            X.4CZ r3 = X.AnonymousClass12W.A00
            r19 = 38
            X.MGk r0 = new X.MGk
            r18 = r12
            r14 = r0
            r15 = r5
            r16 = r2
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            X.1Eo.A05(r3, r0, r4)
        L_0x00b8:
            X.0Ud r4 = r13.A06
            r0 = 16
            X.JG0 r3 = new X.JG0
            r3.<init>(r0, r7, r2)
            X.6oS r0 = X.C318116oQ.A00(r2)
            r10 = 39
            X.MHK r5 = new X.MHK
            r6 = r4
            r7 = r3
            r8 = r2
            r9 = r12
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            X.19B r3 = X.19B.A00
            X.1Eo.A05(r3, r5, r0)
            r0 = 45
            X.JFy r7 = X.C59346JFy.A00(r2, r0)
            X.6oS r0 = X.C318116oQ.A00(r2)
            X.MHK r5 = new X.MHK
            r6 = r1
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            X.1Eo.A05(r3, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52965GgI.<init>(android.app.Application, com.meta.foa.session.FoaUserSession, X.I25, X.Htc, X.0sP, X.0r6):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r0 != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C52965GgI r8, java.lang.Boolean r9, java.lang.String r10) {
        /*
            X.05G r2 = r8.A0H
            X.Htc r0 = r8.A0F
            X.7K7 r1 = r0.A04
            if (r1 == 0) goto L_0x000c
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0015
        L_0x000c:
            if (r9 == 0) goto L_0x002b
            boolean r0 = r9.booleanValue()
        L_0x0012:
            r6 = 0
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r6 = 1
        L_0x0016:
            r5 = 0
            if (r1 == 0) goto L_0x0028
            boolean r8 = r1.A02
            boolean r9 = r1.A04
        L_0x001d:
            r7 = 0
            X.I1q r3 = new X.I1q
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.FIA(r3)
            return
        L_0x0028:
            r8 = 0
            r9 = 1
            goto L_0x001d
        L_0x002b:
            java.lang.Object r0 = r2.getValue()
            X.I1q r0 = (X.C56562I1q) r0
            boolean r0 = r0.A03
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52965GgI.A00(X.GgI, java.lang.Boolean, java.lang.String):void");
    }

    public final void A0E(HQ1 hq1) {
        QuickPerformanceLogger quickPerformanceLogger;
        int i;
        Object value;
        C57567Icu icu;
        C54536HHx hHx;
        C56146HtY htY;
        boolean z;
        boolean z2;
        HQ0 hq0;
        boolean z3;
        05G r3;
        int i2;
        List list;
        Object value2;
        C57567Icu icu2;
        HI5 hi5;
        C56146HtY htY2;
        String str;
        boolean z4;
        boolean z5;
        HQ0 hq02;
        boolean z6;
        C262224Cq r1;
        0sL mgc;
        C56146HtY htY3;
        Object value3;
        String A0C2;
        C54521HHh hHh;
        C56146HtY htY4;
        boolean z7;
        boolean z8;
        JMR jmr;
        HQ1 hq12;
        boolean z9;
        Object value4;
        C57567Icu icu3;
        HHi hHi;
        C56146HtY htY5;
        String str2;
        boolean z10;
        boolean z11;
        HQ0 hq03;
        boolean z12;
        HQ1 hq13 = hq1;
        if (hq13 instanceof HI1) {
            I25 i25 = this.A04;
            i25.A04("rendered");
            quickPerformanceLogger = i25.A00;
            if (quickPerformanceLogger != null) {
                i = 325724260;
            } else {
                return;
            }
        } else if (hq13 instanceof HHi) {
            C56146HtY htY6 = ((HHi) hq13).A00;
            I25 i252 = this.A04;
            QuickPerformanceLogger quickPerformanceLogger2 = i252.A00;
            if (quickPerformanceLogger2 != null) {
                quickPerformanceLogger2.markerStart(325726718);
            }
            if (quickPerformanceLogger2 != null) {
                quickPerformanceLogger2.markerPoint(325726718, "query_begin");
            }
            C56150Htc htc = i252.A01;
            i252.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, htc.A02.A00);
            i252.A06("surface_session_id", htc.A0B);
            i252.A06("bottom_sheet_session_id", htc.A0A);
            C56515Hzm.A00(HOC.GENERATED, this.A03, "animate_button_click");
            05G r5 = this.A08;
            do {
                value4 = r5.getValue();
                HIE hie = (HIE) value4;
                icu3 = C57567Icu.A00;
                hHi = new HHi(htY6);
                htY5 = hie.A03;
                str2 = hie.A04;
                z10 = hie.A07;
                z11 = hie.A06;
                hq03 = hie.A01;
                z12 = hie.A05;
                AnonymousClass7TG.A1R(hq03, icu3);
            } while (!r5.AIY(value4, new HIE(icu3, hq03, hHi, htY5, str2, z10, z11, z12)));
            A00(this, AnonymousClass7TE.A0v(), (String) null);
            ImagineEditRepository imagineEditRepository = this.A05;
            0qQ.A0B(htY6, 0);
            C51975G9x.A1E(htY6, imagineEditRepository, imagineEditRepository.A04, 35);
            return;
        } else if (hq13 instanceof C54523HHk) {
            String str3 = ((C54523HHk) hq13).A00;
            A00(this, (Boolean) null, 002.A0C(str3, ' '));
            05G r2 = this.A08;
            do {
                value3 = r2.getValue();
                HIE hie2 = (HIE) value3;
                A0C2 = 002.A0C(str3, ' ');
                hHh = C54521HHh.A00;
                htY4 = hie2.A03;
                z7 = hie2.A07;
                z8 = hie2.A06;
                jmr = hie2.A00;
                hq12 = hie2.A02;
                z9 = hie2.A05;
                AnonymousClass7TG.A1R(hHh, jmr);
            } while (!r2.AIY(value3, new HIE(jmr, hHh, hq12, htY4, A0C2, z7, z8, z9)));
            return;
        } else if (hq13 instanceof HI5) {
            this.A04.A01();
            C56515Hzm.A00(HOC.GENERATED, this.A03, "regenerate_button_click");
            05G r32 = this.A08;
            do {
                value2 = r32.getValue();
                HIE hie3 = (HIE) value2;
                icu2 = C57567Icu.A00;
                hi5 = HI5.A00;
                htY2 = hie3.A03;
                str = hie3.A04;
                z4 = hie3.A07;
                z5 = hie3.A06;
                hq02 = hie3.A01;
                z6 = hie3.A05;
                AnonymousClass7TG.A1R(hq02, icu2);
            } while (!r32.AIY(value2, new HIE(icu2, hq02, hi5, htY2, str, z4, z5, z6)));
            A00(this, AnonymousClass7TE.A0v(), (String) null);
            ImagineEditRepository imagineEditRepository2 = this.A05;
            C56559I1n A002 = ImagineEditRepository.A00(imagineEditRepository2);
            if (A002 != null) {
                if (A002.A04) {
                    C56146HtY htY7 = A002.A01;
                    if (htY7 != null && (htY3 = A002.A02) != null) {
                        String str4 = A002.A03;
                        r1 = imagineEditRepository2.A04;
                        mgc = new MH6((Object) htY7, (Object) imagineEditRepository2, (Object) htY3, str4, (AnonymousClass4D7) null, 24);
                    } else {
                        return;
                    }
                } else {
                    C56146HtY htY8 = A002.A01;
                    if (htY8 != null) {
                        r1 = imagineEditRepository2.A04;
                        mgc = new MGC((Object) htY8, (Object) imagineEditRepository2, (AnonymousClass4D7) null, 36);
                    } else {
                        return;
                    }
                }
                AnonymousClass7TE.A1Z(mgc, r1);
                return;
            }
            return;
        } else {
            if (hq13 instanceof HI7) {
                C56515Hzm.A00(HOC.GENERATED, this.A03, "undo_button_click");
                ImagineEditRepository imagineEditRepository3 = this.A05;
                imagineEditRepository3.A03();
                r3 = imagineEditRepository3.A05;
                int i3 = ((C56548I1c) r3.getValue()).A00;
                if (i3 > 0) {
                    i2 = i3 - 1;
                    list = ((C56548I1c) r3.getValue()).A01;
                } else {
                    return;
                }
            } else if (hq13 instanceof HI4) {
                C56515Hzm.A00(HOC.GENERATED, this.A03, "redo_button_click");
                r3 = this.A05.A05;
                int i4 = ((C56548I1c) r3.getValue()).A00;
                if (i4 < ((C56548I1c) r3.getValue()).A01.size()) {
                    i2 = i4 + 1;
                    list = ((C56548I1c) r3.getValue()).A01;
                } else {
                    return;
                }
            } else if (hq13 instanceof HI2) {
                HQ1 hq14 = ((HIE) this.A08.getValue()).A02;
                if (hq14 != null) {
                    A0E(hq14);
                    return;
                }
                return;
            } else if (hq13 instanceof C54536HHx) {
                String obj = ((C54536HHx) hq13).A01.toString();
                this.A00 = true;
                this.A02 = true;
                String A12 = DbV.A12(obj);
                this.A04.A01();
                C56515Hzm.A00(HOC.GENERATED, this.A03, "generate_button_click");
                if (!00l.A0W(A12)) {
                    05G r4 = this.A08;
                    C56146HtY htY9 = ((HIE) r4.getValue()).A03;
                    if (htY9 != null) {
                        do {
                            value = r4.getValue();
                            HIE hie4 = (HIE) value;
                            icu = C57567Icu.A00;
                            hHx = new C54536HHx((C56565I1t) null, A12, (String) null);
                            htY = hie4.A03;
                            z = hie4.A07;
                            z2 = hie4.A06;
                            hq0 = hie4.A01;
                            z3 = hie4.A05;
                            AnonymousClass7TG.A1R(hq0, icu);
                        } while (!r4.AIY(value, new HIE(icu, hq0, hHx, htY, (String) null, z, z2, z3)));
                        ImagineEditRepository imagineEditRepository4 = this.A05;
                        0qQ.A0B(A12, 1);
                        AnonymousClass7TE.A1Z(new C66173MGk(htY9, imagineEditRepository4, A12, (AnonymousClass4D7) null, 36), imagineEditRepository4.A04);
                        A00(this, true, (String) null);
                        return;
                    }
                    return;
                }
                return;
            } else if (hq13 instanceof C54534HHv) {
                String.valueOf(((C54534HHv) hq13).A00);
                if (this.A02) {
                    C56515Hzm.A00(HOC.GENERATED, this.A03, "begin_typing");
                    this.A02 = false;
                    return;
                }
                return;
            } else if (hq13 instanceof HI3) {
                C56515Hzm hzm = this.A03;
                C56507Hzd hzd = hzm.A02;
                XSJ A003 = XXv.A00(hzm.A01.A02);
                C54673HOe hOe = C54673HOe.EDIT;
                AnonymousClass7TF.A1B(A003, 0, hOe);
                C56507Hzd.A00(hOe, A003, hzd, "feedback_menu_click", (String) null);
                return;
            } else if (hq13 instanceof HI0) {
                quickPerformanceLogger = this.A04.A00;
                if (quickPerformanceLogger != null) {
                    i = 325726718;
                    quickPerformanceLogger.markerPoint(325726718, "rendered");
                } else {
                    return;
                }
            } else {
                this.A06.invoke(hq13);
                return;
            }
            r3.Epw(new C56548I1c(list, i2));
            return;
        }
        quickPerformanceLogger.markerEnd(i, 2);
    }
}
