package com.instagram.settings2.core.viewmodel;

import X.002;
import X.02m;
import X.02z;
import X.05G;
import X.0Hf;
import X.0KC;
import X.0qQ;
import X.0sn;
import X.0sr;
import X.0u9;
import X.10b;
import X.19E;
import X.2YL;
import X.AnonymousClass05E;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0iw;
import X.AnonymousClass0r6;
import X.AnonymousClass10A;
import X.AnonymousClass11O;
import X.AnonymousClass19S;
import X.AnonymousClass3Eu;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20613Wvu;
import X.C20699WxV;
import X.C21251XQw;
import X.C249513ju;
import X.C262204Co;
import X.C318116oQ;
import X.C318136oS;
import X.C49905FEd;
import X.C51970G9q;
import X.C51973G9u;
import X.C53396GnT;
import X.C59845JaL;
import X.C61059Jvx;
import X.C61083JwL;
import X.C61237JzV;
import X.C61246Jze;
import X.C62551Khh;
import X.C66168MGf;
import X.C66186MGx;
import X.C66460MSo;
import X.DbS;
import X.DbY;
import X.G5E;
import X.HEP;
import X.I4T;
import X.JTO;
import X.JTP;
import X.JTR;
import X.JV5;
import X.JVH;
import X.KYL;
import X.KYM;
import X.KYN;
import X.KYO;
import X.KYP;
import X.KYQ;
import X.L2R;
import X.L2T;
import X.LFr;
import X.LGF;
import X.MDE;
import X.MG4;
import X.MGB;
import X.MR0;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.data.SettingsRepository;
import com.instagram.settings2.core.session.SettingsSession;
import java.util.ArrayList;
import java.util.List;

public final class SettingsScreenViewModel extends 2YL {
    public JVH A00;
    public G5E A01;
    public List A02;
    public C262204Co A03;
    public boolean A04;
    public final C61059Jvx A05;
    public final UserSession A06;
    public final SettingsRepository A07;
    public final SettingsSession A08;
    public final L2T A09;
    public final C21251XQw A0A;
    public final I4T A0B;
    public final String A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final C249513ju A0F;
    public final C249513ju A0G;
    public final AnonymousClass0r6 A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final AnonymousClass0Ud A0K;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050 A[LOOP:0: B:17:0x0049->B:19:0x0050, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C64185LSs r9, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r10, X.AnonymousClass4D7 r11) {
        /*
            r7 = 2
            boolean r0 = X.C66139MDr.A01(r7, r11)
            if (r0 == 0) goto L_0x0076
            r6 = r11
            X.MDr r6 = (X.C66139MDr) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0076
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r8 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 == r1) goto L_0x0038
            if (r0 != r7) goto L_0x007c
            X.0eS.A00(r8)
        L_0x0025:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0028:
            X.0eS.A00(r8)
            com.instagram.settings2.core.session.SettingsSession r0 = r10.A08
            r6.A01 = r10
            r6.A00 = r1
            java.lang.Object r8 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A08(r9, r0, r6)
            if (r8 != r5) goto L_0x003f
            return r5
        L_0x0038:
            java.lang.Object r10 = r6.A01
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r10 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r10
            X.0eS.A00(r8)
        L_0x003f:
            X.G5E r8 = (X.G5E) r8
            r10.A01 = r8
            java.util.List r0 = r10.A02
            java.util.Iterator r4 = r0.iterator()
        L_0x0049:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x0064
            java.lang.Object r2 = r4.next()
            X.4Co r2 = (X.C262204Co) r2
            java.lang.String r1 = "Navigating to another screen"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r3)
            r2.AG7(r0)
            goto L_0x0049
        L_0x0064:
            X.3ju r1 = r10.A0F
            X.Dtx r0 = new X.Dtx
            r0.<init>(r8, r3)
            r6.A01 = r3
            r6.A00 = r7
            java.lang.Object r0 = r1.ELH(r0, r6)
            if (r0 != r5) goto L_0x0025
            return r5
        L_0x0076:
            X.MDr r6 = new X.MDr
            r6.<init>(r10, r11, r7)
            goto L_0x0015
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.SettingsScreenViewModel.A01(X.LSs, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel, X.4D7):java.lang.Object");
    }

    public final void A06(L2R l2r) {
        C318136oS A002;
        int i;
        String str;
        0qQ.A0B(l2r, 0);
        JVH jvh = this.A00;
        if (jvh != null) {
            LFr lFr = (LFr) this.A0D.getValue();
            C66460MSo mSo = (C66460MSo) jvh.A04;
            C62551Khh khh = (C62551Khh) jvh.A02;
            String str2 = l2r.A00;
            String str3 = jvh.A05;
            AnonymousClass7TF.A1B(mSo, 0, khh);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(mSo.BOI());
            A1A.append("_modal_");
            A1A.append(str2);
            A1A.append('_');
            A1A.append("dialog");
            A1A.append('_');
            A1A.append(khh.A00);
            if (str3 == null || (str = 002.A0D(str3, '_')) == null) {
                str = "";
            }
            lFr.A01(AnonymousClass7TF.A0l(String.valueOf(str), A1A), AnonymousClass05K.A15, this.A0C);
        } else {
            0KC.A0C("SettingsScreenViewModel", "onModalButtonTapped(): Active modal should not be null");
        }
        if (l2r instanceof KYM) {
            A002 = C318116oQ.A00(this);
            i = 25;
        } else if (l2r instanceof KYL) {
            A002 = C318116oQ.A00(this);
            i = 24;
        } else {
            if (l2r instanceof KYN) {
                AnonymousClass7TE.A1Z(new C66168MGf((Object) l2r, (Object) this, (AnonymousClass4D7) null, 31), C318116oQ.A00(this));
            } else if (!(l2r instanceof KYO)) {
                if (l2r instanceof KYQ) {
                    JVH jvh2 = this.A00;
                    if (!(jvh2 == null || jvh2.A01 == null || jvh2.A03 == null)) {
                        AnonymousClass7TE.A1Z(new C66168MGf((Object) jvh2, (Object) this, (AnonymousClass4D7) null, 32), C318116oQ.A00(this));
                    }
                } else if (l2r instanceof KYP) {
                    JVH jvh3 = this.A00;
                    if (!(jvh3 == null || jvh3.A01 == null || jvh3.A03 == null)) {
                        A002 = C318116oQ.A00(this);
                        i = 26;
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                0KC.A0C("SettingsScreenViewModel", "No active modal, or the active modal doesn't have the correct data. Something is wrong!");
                return;
            }
            this.A00 = null;
        }
        AnonymousClass7TE.A1Z(new MG4(this, (AnonymousClass4D7) null, i), A002);
        this.A00 = null;
    }

    public final void A07(C21251XQw xQw, String str, boolean z) {
        short s;
        0qQ.A0B(xQw, 0);
        int hashCode = xQw.hashCode();
        02m r2 = ((LGF) this.A0E.getValue()).A00;
        if (z) {
            s = 2;
        } else {
            r2.markerAnnotate(827064321, hashCode, "error_message", str);
            s = 3;
        }
        r2.markerEnd(827064321, hashCode, s);
    }

    public final void A08(C21251XQw xQw, boolean z) {
        0qQ.A0B(xQw, 0);
        int hashCode = xQw.hashCode();
        02m r2 = ((LGF) this.A0E.getValue()).A00;
        r2.markerStart(827064321, hashCode);
        r2.markerAnnotate(827064321, hashCode, PublicKeyCredentialControllerUtility.JSON_KEY_ID, xQw.name());
        r2.markerAnnotate(827064321, hashCode, "is_initial_load", z);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.3Eu, X.3ju, X.3jw] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.3Eu, X.3ju, X.3jw] */
    public /* synthetic */ SettingsScreenViewModel(AnonymousClass0iw r13, UserSession userSession, C21251XQw xQw, String str, boolean z) {
        I4T i4t = (I4T) I4T.A0A.getValue();
        L2T l2t = new L2T(userSession);
        AnonymousClass7TF.A1B(userSession, 1, r13);
        int A082 = C51970G9q.A08(3, xQw, i4t);
        this.A06 = userSession;
        this.A0A = xQw;
        this.A0B = i4t;
        this.A0C = str;
        this.A09 = l2t;
        if (z) {
            C49905FEd.A00(userSession).A00 = null;
        }
        SettingsSession settingsSession = C49905FEd.A00(this.A06).A00;
        if (settingsSession == null) {
            AnonymousClass19S A022 = 19E.A02(JTR.A0j(3).plus(MDE.A00));
            UserSession userSession2 = this.A06;
            settingsSession = new SettingsSession(userSession2, new SettingsRepository(userSession2, this.A0B, this.A0C, A022), this.A0C, A022);
            C49905FEd.A00(this.A06).A00 = settingsSession;
        }
        this.A08 = settingsSession;
        SettingsRepository settingsRepository = settingsSession.A01;
        this.A07 = settingsRepository;
        C61059Jvx jvx = (C61059Jvx) JTR.A0x(xQw, i4t.A02);
        if (jvx != null) {
            this.A05 = jvx;
            02z A10 = DbS.A10("");
            this.A0J = A10;
            02z A102 = C51970G9q.A10(false);
            this.A0I = A102;
            this.A04 = true;
            Integer num = AnonymousClass05K.A01;
            ? r0 = new AnonymousClass3Eu(1, num);
            this.A0F = r0;
            this.A0H = 0u9.A04(r0);
            ? r2 = new AnonymousClass3Eu(1, num);
            this.A0G = r2;
            0sn r7 = 0sn.A00;
            this.A02 = r7;
            this.A0D = AnonymousClass0eN.A01(new C20613Wvu(10, this, r13));
            this.A0E = AnonymousClass0eN.A01(new C20699WxV(this, A082));
            AnonymousClass05E r5 = new AnonymousClass05E(new 0Hf(new SettingsScreenViewModel$uiState$1(this, (AnonymousClass4D7) null), new AnonymousClass0r6[]{A10, A102, settingsRepository.A0L, settingsSession.A08, 0u9.A04(r2)}, (AnonymousClass4D7) null, 1));
            this.A0K = 10b.A02(new C53396GnT(C61083JwL.A01(""), new HEP(r7, true), xQw, r7), C318116oQ.A00(this), r5, AnonymousClass10A.A01);
            return;
        }
        throw C51973G9u.A0g(xQw, "No screen model found for ID ", AnonymousClass7TE.A1A());
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C62551Khh r17, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r18, X.C66460MSo r19, java.lang.Object r20, java.lang.String r21, java.lang.String r22, X.AnonymousClass4D7 r23) {
        /*
            r1 = r21
            r2 = r19
            r3 = r20
            r9 = r17
            r15 = r18
            r7 = 14
            r8 = r23
            boolean r0 = X.ME1.A02(r7, r8)
            if (r0 == 0) goto L_0x003e
            r5 = r8
            X.ME1 r5 = (X.ME1) r5
            int r6 = r5.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r4
            if (r0 == 0) goto L_0x003e
            int r6 = r6 - r4
            r5.A00 = r6
        L_0x0022:
            java.lang.Object r13 = r5.A06
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            java.lang.String r10 = "SettingsScreenViewModel"
            r8 = 4
            r11 = 3
            r7 = 1
            r12 = 2
            r6 = 0
            if (r0 == 0) goto L_0x0066
            if (r0 == r7) goto L_0x0114
            if (r0 == r12) goto L_0x004d
            if (r0 == r11) goto L_0x0044
            if (r0 == r8) goto L_0x0114
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003e:
            X.ME1 r5 = new X.ME1
            r5.<init>(r15, r8, r7)
            goto L_0x0022
        L_0x0044:
            java.lang.Object r15 = r5.A01
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r15 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r15
            X.0eS.A00(r13)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x0117
        L_0x004d:
            java.lang.Object r9 = r5.A05
            X.Khh r9 = (X.C62551Khh) r9
            java.lang.Object r3 = r5.A04
            java.lang.Object r2 = r5.A03
            X.MSo r2 = (X.C66460MSo) r2
            java.lang.Object r1 = r5.A02
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r15 = r5.A01
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r15 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r15
            X.0eS.A00(r13)     // Catch:{ Exception -> 0x0063 }
            goto L_0x00d2
        L_0x0063:
            r1 = move-exception
            goto L_0x00fa
        L_0x0066:
            X.0eS.A00(r13)
            r2.BOI()
            X.I4T r0 = r15.A0B
            X.MVF r13 = X.JTS.A0X(r0, r2)
            if (r13 == 0) goto L_0x011b
            X.JwH r13 = r13.Bzr()
            java.lang.String r14 = r13.A02
            X.Dba.A0j(r7, r1, r14)
            X.0eM r13 = r0.A00
            java.lang.Object r13 = X.JTR.A0x(r1, r13)
            X.LSs r13 = (X.C64185LSs) r13
            if (r13 != 0) goto L_0x0097
            X.0eM r0 = r0.A06
            java.lang.Object r0 = X.JTR.A0x(r14, r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0112
            java.lang.Object r13 = r0.get(r1)
            X.LSs r13 = (X.C64185LSs) r13
        L_0x0097:
            if (r13 != 0) goto L_0x00c2
            X.3ju r3 = r15.A0F
            r0 = r22
            if (r22 == 0) goto L_0x00b9
            X.JzW r1 = new X.JzW
            r1.<init>(r0)
        L_0x00a4:
            X.JwL r2 = new X.JwL
            r2.<init>((X.MR0) r1)
            java.lang.String r1 = "settings_failed_to_change"
            X.Jzd r0 = new X.Jzd
            r0.<init>(r2, r1)
            r5.A00 = r7
        L_0x00b2:
            java.lang.Object r0 = r3.ELH(r0, r5)
        L_0x00b6:
            if (r0 != r4) goto L_0x0117
            return r4
        L_0x00b9:
            r0 = 2131954972(0x7f130d1c, float:1.9546458E38)
            X.JzV r1 = new X.JzV
            r1.<init>(r0)
            goto L_0x00a4
        L_0x00c2:
            com.instagram.settings2.core.session.SettingsSession r0 = r15.A08     // Catch:{ Exception -> 0x00f7 }
            X.ME1.A00(r15, r1, r2, r3, r5)     // Catch:{ Exception -> 0x00f7 }
            r5.A05 = r9     // Catch:{ Exception -> 0x00f7 }
            r5.A00 = r12     // Catch:{ Exception -> 0x00f7 }
            java.lang.Object r13 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A08(r13, r0, r5)     // Catch:{ Exception -> 0x00f7 }
            if (r13 != r4) goto L_0x00d2
            goto L_0x011a
        L_0x00d2:
            X.Jvx r13 = (X.C61059Jvx) r13     // Catch:{ Exception -> 0x00f5 }
            X.KYO r18 = X.KYO.A00     // Catch:{ Exception -> 0x00f5 }
            r5.A01 = r15     // Catch:{ Exception -> 0x00f5 }
            r5.A02 = r6     // Catch:{ Exception -> 0x00f5 }
            r5.A03 = r6     // Catch:{ Exception -> 0x00f5 }
            r5.A04 = r6     // Catch:{ Exception -> 0x00f5 }
            r5.A05 = r6     // Catch:{ Exception -> 0x00f5 }
            r5.A00 = r11     // Catch:{ Exception -> 0x00f5 }
            r21 = r3
            r22 = r1
            r23 = r5
            r19 = r2
            r20 = r3
            r17 = r9
            r16 = r13
            java.lang.Object r0 = r15.A03(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x00b6
        L_0x00f5:
            r1 = move-exception
            goto L_0x00fa
        L_0x00f7:
            r1 = move-exception
            goto L_0x00fa
        L_0x00f9:
            r1 = move-exception
        L_0x00fa:
            java.lang.String r0 = "Failed to resolve modal"
            X.0KC.A0F(r10, r0, r1)
            X.3ju r3 = r15.A0F
            X.Jzd r0 = X.C61083JwL.A03()
            r5.A01 = r6
            r5.A02 = r6
            r5.A03 = r6
            r5.A04 = r6
            r5.A05 = r6
            r5.A00 = r8
            goto L_0x00b2
        L_0x0112:
            r13 = 0
            goto L_0x0097
        L_0x0114:
            X.0eS.A00(r13)
        L_0x0117:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x011a:
            return r4
        L_0x011b:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "No setting model found for ID "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.SettingsScreenViewModel.A00(X.Khh, com.instagram.settings2.core.viewmodel.SettingsScreenViewModel, X.MSo, java.lang.Object, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[Catch:{ Exception -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r15, X.C66460MSo r16, X.AnonymousClass4D7 r17) {
        /*
            r13 = r16
            r9 = r15
            r3 = 38
            r5 = r17
            boolean r0 = X.ME9.A03(r3, r5)
            if (r0 == 0) goto L_0x00e3
            r4 = r5
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e3
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001b:
            java.lang.Object r7 = r4.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 4
            r6 = 3
            r8 = 1
            r5 = 2
            r14 = 0
            if (r0 == 0) goto L_0x004a
            if (r0 == r8) goto L_0x003e
            if (r0 == r5) goto L_0x0036
            if (r0 == r6) goto L_0x0036
            if (r0 != r3) goto L_0x00e9
            X.0eS.A00(r7)
        L_0x0033:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0036:
            java.lang.Object r9 = r4.A01
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r9 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r9
            X.0eS.A00(r7)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x0033
        L_0x003e:
            java.lang.Object r13 = r4.A02
            X.MSo r13 = (X.C66460MSo) r13
            java.lang.Object r9 = r4.A01
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r9 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r9
            X.0eS.A00(r7)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x006d
        L_0x004a:
            X.0eS.A00(r7)
            X.I4T r0 = r15.A0B     // Catch:{ Exception -> 0x00c6 }
            X.MVF r7 = X.JTS.A0X(r0, r13)     // Catch:{ Exception -> 0x00c6 }
            if (r7 == 0) goto L_0x00bb
            com.instagram.settings2.core.session.SettingsSession r1 = r15.A08     // Catch:{ Exception -> 0x00c6 }
            X.MSo r0 = r7.BEX()     // Catch:{ Exception -> 0x00c6 }
            X.0qQ.A0B(r0, r5)     // Catch:{ Exception -> 0x00c6 }
            X.LSs r0 = r7.Be2()     // Catch:{ Exception -> 0x00c6 }
            X.ME9.A01(r15, r13, r4, r8)     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object r7 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A07(r0, r1, r4)     // Catch:{ Exception -> 0x00c6 }
            if (r7 != r2) goto L_0x006d
            goto L_0x00ee
        L_0x006d:
            X.Drn r7 = (X.C47172Drn) r7     // Catch:{ Exception -> 0x00b9 }
            if (r7 == 0) goto L_0x0033
            int r1 = r7.A00     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r8)
            if (r0 == 0) goto L_0x0094
            java.lang.Object r10 = r7.A01     // Catch:{ Exception -> 0x0092 }
            X.Jvx r10 = (X.C61059Jvx) r10     // Catch:{ Exception -> 0x0092 }
            X.KYO r12 = X.KYO.A00     // Catch:{ Exception -> 0x0092 }
            X.Khh r11 = X.C62551Khh.POST_COMMIT     // Catch:{ Exception -> 0x0092 }
            X.ME9.A01(r9, r14, r4, r5)     // Catch:{ Exception -> 0x0092 }
            r15 = r14
            r16 = r14
            r17 = r4
            java.lang.Object r0 = r9.A03(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0090 }
            if (r0 != r2) goto L_0x0033
            goto L_0x00ef
        L_0x0090:
            r5 = move-exception
            goto L_0x00c9
        L_0x0092:
            r5 = move-exception
            goto L_0x00c9
        L_0x0094:
            r0 = 0
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            if (r0 != 0) goto L_0x00a0
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ Exception -> 0x00b5 }
            throw r0     // Catch:{ Exception -> 0x00b5 }
        L_0x00a0:
            X.3ju r5 = r9.A0F     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object r1 = r7.A01     // Catch:{ Exception -> 0x00b7 }
            X.G5E r1 = (X.G5E) r1     // Catch:{ Exception -> 0x00b7 }
            X.Dtx r0 = new X.Dtx     // Catch:{ Exception -> 0x00b5 }
            r0.<init>(r1, r14)     // Catch:{ Exception -> 0x00b5 }
            X.ME9.A01(r9, r14, r4, r6)     // Catch:{ Exception -> 0x00b5 }
            java.lang.Object r0 = r5.ELH(r0, r4)     // Catch:{ Exception -> 0x00b5 }
            if (r0 != r2) goto L_0x0033
            goto L_0x00f0
        L_0x00b5:
            r5 = move-exception
            goto L_0x00c9
        L_0x00b7:
            r5 = move-exception
            goto L_0x00c9
        L_0x00b9:
            r5 = move-exception
            goto L_0x00c9
        L_0x00bb:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = "No setting model found for ID "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r13, r0, r1)     // Catch:{ Exception -> 0x00c6 }
            throw r0     // Catch:{ Exception -> 0x00c6 }
        L_0x00c6:
            r5 = move-exception
            goto L_0x00c9
        L_0x00c8:
            r5 = move-exception
        L_0x00c9:
            java.lang.String r1 = "SettingsScreenViewModel"
            java.lang.String r0 = "Failed to resolve post commit"
            X.0KC.A0F(r1, r0, r5)
            X.3ju r1 = r9.A0F
            X.Jzd r0 = X.C61083JwL.A03()
            r4.A01 = r14
            r4.A02 = r14
            r4.A00 = r3
            java.lang.Object r0 = r1.ELH(r0, r4)
            if (r0 != r2) goto L_0x0033
            return r2
        L_0x00e3:
            X.ME9 r4 = X.ME9.A00(r15, r5, r3)
            goto L_0x001b
        L_0x00e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ee:
            return r2
        L_0x00ef:
            return r2
        L_0x00f0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.SettingsScreenViewModel.A02(com.instagram.settings2.core.viewmodel.SettingsScreenViewModel, X.MSo, X.4D7):java.lang.Object");
    }

    public final Object A03(C61059Jvx jvx, C62551Khh khh, L2R l2r, C66460MSo mSo, Object obj, Object obj2, String str, AnonymousClass4D7 r18) {
        C61246Jze jze;
        C249513ju r1;
        this.A00 = new JVH(khh, mSo, obj, obj2, str);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : (List) jvx.A01) {
            if (((JV5) next).A01) {
                A1C.add(next);
            }
        }
        L2R l2r2 = l2r;
        if (A1C.isEmpty() || (A1C.size() == 1 && ((JV5) A1C.get(0)).A03 == null)) {
            r1 = this.A0F;
            C61083JwL jwL = (C61083JwL) jvx.A06;
            C61083JwL jwL2 = null;
            if (!A1C.isEmpty()) {
                jwL2 = (C61083JwL) ((JV5) A1C.get(0)).A00;
            }
            C61083JwL jwL3 = (C61083JwL) jvx.A04;
            C61083JwL jwL4 = (C61083JwL) jvx.A05;
            C61083JwL jwL5 = (C61083JwL) jvx.A02;
            if (jwL5 == null) {
                jwL5 = new C61083JwL((MR0) new C61237JzV(2131954722));
            }
            jze = new C61246Jze(jwL, jwL2, jwL3, jwL4, new C61083JwL(jwL5, l2r));
        } else {
            r1 = this.A0F;
            jze = new C61246Jze((C61083JwL) jvx.A06, (C61083JwL) jvx.A04, (C61083JwL) jvx.A05, l2r2, (List) A1C);
        }
        return JTP.A0l(r1.ELH(jze, r18));
    }

    public final void A04() {
        JTR.A1V(this.A0I);
    }

    public final void A05() {
        boolean z = this.A04;
        if (this.A02.isEmpty()) {
            SettingsRepository settingsRepository = this.A07;
            List<AnonymousClass0r6> A1P = 0sr.A1P(new AnonymousClass0r6[]{JTO.A1I(new C59845JaL(this, (AnonymousClass4D7) null, 6), settingsRepository.A0Q), JTO.A1I(new C66168MGf(this, (AnonymousClass4D7) null, 34), settingsRepository.A0O), JTO.A1I(new C66168MGf(this, (AnonymousClass4D7) null, 35), settingsRepository.A0N), JTO.A1I(new C66168MGf(this, (AnonymousClass4D7) null, 36), settingsRepository.A0P), JTO.A1I(new C66168MGf(this, (AnonymousClass4D7) null, 37), settingsRepository.A0U), C66186MGx.A01(this, settingsRepository.A0T, 11), JTO.A1I(new MG4(this, (AnonymousClass4D7) null, 29), settingsRepository.A0R), JTO.A1I(new C66168MGf(this, (AnonymousClass4D7) null, 38), settingsRepository.A0S)});
            ArrayList A0r = AnonymousClass7TG.A0r(A1P);
            for (AnonymousClass0r6 A032 : A1P) {
                A0r.add(AnonymousClass11O.A03(C318116oQ.A00(this), A032));
            }
            this.A02 = A0r;
        }
        AnonymousClass7TE.A1Z(new MGB(this, (AnonymousClass4D7) null, 0, z), C318116oQ.A00(this));
    }

    public final void A09(boolean z) {
        String str;
        String str2;
        JVH jvh = this.A00;
        if (jvh != null) {
            LFr lFr = (LFr) this.A0D.getValue();
            C66460MSo mSo = (C66460MSo) jvh.A04;
            C62551Khh khh = (C62551Khh) jvh.A02;
            String str3 = jvh.A05;
            DbY.A1S(mSo, khh);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(mSo.BOI());
            A1A.append("_modal_");
            if (z) {
                str = "bottomsheet";
            } else {
                str = "dialog";
            }
            A1A.append(str);
            A1A.append('_');
            A1A.append(khh.A00);
            if (str3 == null || (str2 = 002.A0D(str3, '_')) == null) {
                str2 = "";
            }
            lFr.A00((Boolean) null, AnonymousClass05K.A0u, AnonymousClass7TF.A0l(str2, A1A), (String) null, (String) null, this.A0C);
            return;
        }
        0KC.A0C("SettingsScreenViewModel", "onModalImpression(): Active modal should not be null");
    }
}
