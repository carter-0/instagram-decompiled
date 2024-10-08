package com.facebook.privacy.consent.bloks.instagram;

import X.02m;
import X.0Tu;
import X.0f9;
import X.0qQ;
import X.0s1;
import X.0sP;
import X.0wj;
import X.1AW;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass6Tm;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C16715V2y;
import X.C277014uI;
import X.C299275ur;
import X.C56480HzC;
import X.C56488HzK;
import X.C64991Zv;
import X.C67628Mr1;
import X.C70403O5g;
import X.C73989PnG;
import X.C8779R9f;
import X.OB1;
import X.OUl;
import X.OUs;
import X.PUX;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class InstagramConsentFlowHostActivity extends IgFragmentActivity implements AnonymousClass0iw {
    public C67628Mr1 A00;
    public 02m A01;
    public AnonymousClass0wW A02;
    public 0sP A03 = C73989PnG.A00;
    public String A04;

    public final String getModuleName() {
        return "InstagramConsentFlowActivity";
    }

    public static final void A01(InstagramConsentFlowHostActivity instagramConsentFlowHostActivity, String str, String str2, Throwable th) {
        Exception exc = new Exception(str2, th);
        0f9 AEf = 0wj.A01.AEf("ConsentUIFramework-Alaska", 817896479);
        AEf.ABQ("experience_id", str);
        AEf.ABQ("error_message", str2);
        AEf.report();
        02m r2 = instagramConsentFlowHostActivity.A01;
        if (r2 == null) {
            0qQ.A0F("quickPerformanceLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.markerEnd(192756491, 3);
        if (str != null) {
            OUs.A00.A00(str, exc);
        }
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("session");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void finish() {
        if (getSupportFragmentManager().A0U.A04().size() >= 1) {
            0s1 r2 = new 0s1(getSupportFragmentManager());
            List<Fragment> A042 = getSupportFragmentManager().A0U.A04();
            0qQ.A07(A042);
            for (Fragment A032 : A042) {
                r2.A03(A032);
            }
            r2.A0H(new PUX(this));
            r2.A01();
            return;
        }
        InstagramConsentFlowHostActivity.super.finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C8779R9f r9f;
        super.onActivityResult(i, i2, intent);
        if (C64991Zv.A00 != null && (r9f = C16715V2y.A01) != null) {
            r9f.onActivityResult(i, i2, intent);
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        String str = this.A04;
        if (str == null) {
            0qQ.A0F("flowInstanceId");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C56488HzK.A00(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: type inference failed for: r4v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.1K2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = 1844425596(0x6defb37c, float:9.2729876E27)
            int r5 = X.AnonymousClass0fD.A00(r0)
            X.08y r1 = X.09i.A0A
            r6 = r17
            android.content.Intent r0 = r6.getIntent()
            X.0qQ.A07(r0)
            android.os.Bundle r0 = X.C61350mg.A00(r0)
            X.0wW r0 = r1.A04(r0)
            r10 = 0
            X.0qQ.A0B(r0, r10)
            r6.A02 = r0
            r4 = r18
            super.onCreate(r4)
            r6.getSession()
            X.02m r0 = X.02m.A0p
            r6.A01 = r0
            r9 = 1
            r6.setRequestedOrientation(r9)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "experience_id"
            java.lang.String r8 = r1.getStringExtra(r0)
            r13 = 0
            if (r8 != 0) goto L_0x0049
            java.lang.String r0 = "InstagramConsentFlowHostActivity created without experienceId"
            A01(r6, r13, r0, r13)
            r0 = 2026159815(0x78c4bec7, float:3.1923738E34)
        L_0x0045:
            X.AnonymousClass0fD.A07(r0, r5)
            return
        L_0x0049:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r3 = "flow_name"
            java.lang.String r15 = r0.getStringExtra(r3)
            if (r15 != 0) goto L_0x005e
            java.lang.String r0 = "InstagramConsentFlowHostActivity created without flowName"
            A01(r6, r8, r0, r13)
            r0 = -1750421292(0xffffffff97aab0d4, float:-1.103063E-24)
            goto L_0x0045
        L_0x005e:
            r0 = 36
            java.lang.String r2 = X.002.A0T(r8, r15, r0)
            r6.A04 = r2
            java.lang.String r0 = "flowInstanceId"
            if (r2 == 0) goto L_0x007b
            X.OUl r1 = X.OUl.A00
            monitor-enter(r1)
            java.util.HashMap r0 = X.OUl.A01     // Catch:{ all -> 0x015c }
            r0.put(r2, r6)     // Catch:{ all -> 0x015c }
            monitor-exit(r1)
            if (r18 != 0) goto L_0x014a
            X.02m r0 = r6.A01
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "quickPerformanceLogger"
        L_0x007b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0083:
            r14 = 192756491(0xb7d3b0b, float:4.8770447E-32)
            r0.markerStart(r14, r3, r15)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "app_id"
            java.lang.String r12 = r1.getStringExtra(r0)
            if (r12 != 0) goto L_0x009e
            java.lang.String r0 = "InstagramConsentFlowHostActivity launching consent flow without Bloks App ID"
            A01(r6, r8, r0, r13)
            r0 = -2131909656(0xffffffff80eda3e8, float:-2.1823811E-38)
            goto L_0x0045
        L_0x009e:
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "source"
            java.lang.String r2 = r1.getStringExtra(r0)
            android.content.Intent r3 = r6.getIntent()
            r1 = 9
            r0 = 86
            java.lang.String r0 = X.Q2N.A01(r10, r1, r0)
            java.lang.String r1 = r3.getStringExtra(r0)
            android.content.Intent r3 = r6.getIntent()
            java.lang.String r0 = "extra_params_json"
            java.lang.String r0 = r3.getStringExtra(r0)
            X.0sP r7 = r6.A03
            int r4 = X.C67628Mr1.A02
            X.Mr1 r3 = new X.Mr1
            r3.<init>(r6, r7, r4)
            r6.A00 = r3
            X.AnonymousClass0fN.A00(r3)
            X.0wW r3 = r6.getSession()
            X.2nI r7 = X.C229382nI.A04(r6, r6, r3)
            X.OOW r16 = X.OTP.A03
            X.0wW r11 = r6.getSession()
            monitor-enter(r16)
            X.0qQ.A0B(r11, r10)     // Catch:{ all -> 0x015f }
            r3 = 37
            X.TVv r4 = new X.TVv     // Catch:{ all -> 0x015f }
            r4.<init>(r11, r3)     // Catch:{ all -> 0x015f }
            java.lang.Class<X.OTP> r3 = X.OTP.class
            java.lang.Object r11 = r11.A01(r3, r4)     // Catch:{ all -> 0x015f }
            X.OTP r11 = (X.OTP) r11     // Catch:{ all -> 0x015f }
            monitor-exit(r16)
            com.google.common.util.concurrent.SettableFuture r4 = new com.google.common.util.concurrent.SettableFuture
            r4.<init>()
            java.util.LinkedHashMap r3 = X.OOW.A00(r15, r8, r2, r1, r0)
            java.lang.String[] r0 = new java.lang.String[]{r15, r12, r2, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.lang.String r1 = r0.toString()
            java.util.HashMap r0 = r11.A02
            java.lang.Object r2 = r0.get(r1)
            X.JwJ r2 = (X.C61081JwJ) r2
            java.lang.String r1 = "is_cache_hit"
            X.02m r0 = r11.A00
            if (r2 == 0) goto L_0x012c
            r0.markerAnnotate(r14, r1, r9)
            java.lang.Object r3 = r2.A00
            java.lang.String r2 = r2.A01
            X.OUs r1 = X.OUs.A00
            monitor-enter(r1)
            X.0qQ.A0B(r2, r10)     // Catch:{ all -> 0x015c }
            java.util.HashMap r0 = X.OUs.A01     // Catch:{ all -> 0x015c }
            r0.put(r2, r8)     // Catch:{ all -> 0x015c }
            monitor-exit(r1)
            r4.set(r3)
            goto L_0x0140
        L_0x012c:
            r0.markerAnnotate(r14, r1, r10)
            X.0lg r0 = r11.A01
            X.8ey r1 = X.C359988do.A02(r13, r0, r12, r3)
            X.K8T r0 = new X.K8T
            r0.<init>(r4, r10)
            r1.A00(r0)
            r6.schedule(r1)
        L_0x0140:
            X.T0R r1 = new X.T0R
            r1.<init>(r7, r6, r8, r9)
            java.util.concurrent.Executor r0 = X.AnonymousClass6OG.A01
            X.C255183ti.A04(r1, r4, r0)
        L_0x014a:
            r0 = 2131100052(0x7f060194, float:1.7812475E38)
            int r0 = r6.getColor(r0)
            X.2db.A02(r6, r0)
            X.AnonymousClass2uJ.A04(r6, r0)
            r0 = -78175406(0xfffffffffb572352, float:-1.1170602E36)
            goto L_0x0045
        L_0x015c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x015f:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onDestroy() {
        OB1 ob1;
        C277014uI r2;
        int A002 = AnonymousClass0fD.A00(-1563994472);
        OUl oUl = OUl.A00;
        String str = this.A04;
        if (str != null) {
            synchronized (oUl) {
                OUl.A01.remove(str);
            }
            if (isFinishing()) {
                String str2 = this.A04;
                if (str2 != null) {
                    ReentrantReadWriteLock.WriteLock writeLock = C56488HzK.A02.writeLock();
                    0qQ.A07(writeLock);
                    writeLock.lock();
                    try {
                        C56488HzK.A00.remove(str2);
                        C70403O5g o5g = (C70403O5g) C56488HzK.A01.remove(str2);
                        if (!(o5g == null || (ob1 = o5g.A00) == null || (r2 = ob1.A01) == null)) {
                            C299275ur.A00(ob1.A00, AnonymousClass6Tm.A01, r2);
                        }
                        if (!1AW.A06(0Tu.A05, 18304871442750559L)) {
                            String str3 = this.A04;
                            if (str3 != null) {
                                AbstractCollection abstractCollection = (AbstractCollection) C56480HzC.A00.remove(str3);
                                if (abstractCollection != null) {
                                    Iterator A1G = AnonymousClass7TE.A1G(abstractCollection);
                                    while (A1G.hasNext()) {
                                        C56480HzC.A01.remove(AnonymousClass7TF.A0a(A1G));
                                    }
                                }
                            }
                        }
                    } finally {
                        writeLock.unlock();
                    }
                }
            }
            super.onDestroy();
            AnonymousClass0fD.A07(-611057952, A002);
            return;
        }
        0qQ.A0F("flowInstanceId");
        throw AnonymousClass00P.createAndThrow();
    }
}
