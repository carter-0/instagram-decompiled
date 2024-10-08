package com.instagram.challenge.activity;

import X.0KY;
import X.0hq;
import X.0oI;
import X.0wb;
import X.16P;
import X.1wn;
import X.1xC;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C46636DiG;
import X.C47697EDg;
import X.C48766Ejp;
import X.C49240Erj;
import X.C49317Et0;
import X.C49427EvT;
import X.DbT;
import X.DbY;
import X.F5E;
import X.FXZ;
import X.FZ1;
import X.Pxd;
import X.SQH;
import X.T6A;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.base.activity.BaseFragmentActivity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ChallengeActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public Bundle A00;
    public 0hq A01;
    public AnonymousClass0wW A02;
    public T6A A03;
    public String A04;
    public String A05;
    public String A06;
    public 1xC A07;
    public Integer A08;
    public final 1wn A09 = FXZ.A00(this, 11);

    /* JADX WARNING: type inference failed for: r6v0, types: [android.app.Activity] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cc, code lost:
        r1.setArguments(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        X.0wb.A03(r2, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r15 = this;
            r6 = r15
            java.lang.Integer r0 = r15.A08
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x00d1;
                case 2: goto L_0x000a;
                case 3: goto L_0x000a;
                case 4: goto L_0x0023;
                case 5: goto L_0x008b;
                case 6: goto L_0x00c1;
                case 7: goto L_0x006f;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.String r2 = "Challenge"
            java.lang.String r0 = "unknown challenge type found"
        L_0x000e:
            X.0wb.A03(r2, r0)
        L_0x0011:
            r1 = 0
        L_0x0012:
            X.0hq r0 = r15.A01
            X.SQH.A01(r0)
            if (r1 == 0) goto L_0x0022
            X.0wW r0 = r15.A02
            X.6Yo r0 = X.DbS.A0M(r15, r0)
            X.Dba.A13(r1, r0)
        L_0x0022:
            return
        L_0x0023:
            X.0wW r9 = r15.A02
            java.lang.String r2 = "Challenge"
            if (r9 == 0) goto L_0x006c
            r0 = 686(0x2ae, float:9.61E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ Exception -> 0x0066 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r5 = r0.newInstance()     // Catch:{ Exception -> 0x0066 }
            com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl r5 = (com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl) r5     // Catch:{ Exception -> 0x0066 }
            java.lang.String r4 = "selfie_captcha"
            java.lang.String r3 = "selfie_captcha_start"
            X.XFn r1 = X.C21123XFn.SCREEN_GENERATED     // Catch:{ Exception -> 0x0066 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x0066 }
            X.FFD.A02(r1, r9, r0, r4, r3)     // Catch:{ Exception -> 0x0066 }
            X.0hq r8 = r15.A01     // Catch:{ Exception -> 0x0066 }
            android.os.Bundle r7 = r15.A00     // Catch:{ Exception -> 0x0066 }
            java.lang.String r11 = r15.A04     // Catch:{ Exception -> 0x0066 }
            r11.getClass()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r12 = r15.A06     // Catch:{ Exception -> 0x0066 }
            r12.getClass()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r13 = r15.A05     // Catch:{ Exception -> 0x0066 }
            X.T6A r10 = r15.A03     // Catch:{ Exception -> 0x0066 }
            android.os.Bundle r1 = r15.A00     // Catch:{ Exception -> 0x0066 }
            r0 = 662(0x296, float:9.28E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r14 = X.DbU.A0l(r1, r0)     // Catch:{ Exception -> 0x0066 }
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0011
        L_0x0066:
            java.lang.String r0 = "reflection loading of selfie captcha failed"
            X.0wb.A03(r2, r0)
            goto L_0x0011
        L_0x006c:
            java.lang.String r0 = "Session is null"
            goto L_0x000e
        L_0x006f:
            X.1ZA r0 = X.AnonymousClass1ZA.A00
            if (r0 == 0) goto L_0x00ef
            android.os.Bundle r2 = r15.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.R8P r1 = new X.R8P
            r1.<init>()
            goto L_0x00cc
        L_0x007f:
            android.os.Bundle r2 = r15.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.E3y r1 = new X.E3y
            r1.<init>()
            goto L_0x00cc
        L_0x008b:
            X.0wW r0 = r15.A02
            boolean r0 = r0.hasEnded()
            if (r0 == 0) goto L_0x0096
            r15.finish()
        L_0x0096:
            X.0wW r1 = r15.A02
            r0 = 0
            X.2nI r2 = X.C229382nI.A01(r0, r15, r15, r1)
            r0 = 1
            r2.A00 = r0
            android.os.Bundle r1 = r15.A00
            java.lang.String r0 = "ChallengeFragment.bloksAction"
            int r1 = r1.getInt(r0)
            X.0wW r0 = r15.A02
            X.DiG r0 = X.C46636DiG.A00(r0)
            java.lang.Object r0 = r0.A02(r1)
            X.Di0 r0 = (X.C46620Di0) r0
            if (r0 == 0) goto L_0x00bb
            X.C48382Edd.A00(r2, r0)
            goto L_0x0011
        L_0x00bb:
            java.lang.String r2 = "bloks_challenge_action"
            java.lang.String r0 = "Challenge action was expected but was null"
            goto L_0x000e
        L_0x00c1:
            android.os.Bundle r2 = r15.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.E79 r1 = new X.E79
            r1.<init>()
        L_0x00cc:
            r1.setArguments(r2)
            goto L_0x0012
        L_0x00d1:
            X.C49765F5y.A01()
            X.0wW r3 = r15.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 0
            X.0qQ.A0B(r3, r1)
            java.lang.String r0 = "direct_blocking"
            X.C49765F5y.A01()
            android.os.Bundle r0 = X.C49766F5z.A00(r3, r2, r0, r1)
            X.ELb r1 = new X.ELb
            r1.<init>()
            r1.setArguments(r0)
            goto L_0x0012
        L_0x00ef:
            X.DbS.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.challenge.activity.ChallengeActivity.A00():void");
    }

    public final String getModuleName() {
        return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
    }

    public final void A0j(Bundle bundle) {
        if (DbY.A0H(this) == null) {
            A00();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.challenge.activity.ChallengeActivity, android.app.Activity] */
    public final void finish() {
        FZ1 A002;
        ChallengeActivity.super.finish();
        AnonymousClass0wW r0 = this.A02;
        if (r0 != null && (A002 = F5E.A00(r0)) != null) {
            A002.A01();
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.challenge.activity.ChallengeActivity, java.lang.Object, com.instagram.base.activity.IgFragmentActivity] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i != 64) {
            return;
        }
        if (i2 == -1) {
            SQH.A02(this.A01);
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("challenge_id", this.A04);
            A1E.put("entity_id", this.A05);
            if (intent != null) {
                String stringExtra = intent.getStringExtra(Pxd.A00(867));
                if (!TextUtils.isEmpty(stringExtra)) {
                    try {
                        C49427EvT parseFromJson = C49240Erj.parseFromJson(16P.A00(stringExtra));
                        if (!(parseFromJson == null || (str = parseFromJson.A00) == null)) {
                            A1E.put("age_verification_result", str);
                        }
                    } catch (IOException unused) {
                        0wb.A03("ChallengeActivity", "Unable to parse response string");
                    }
                }
            }
            C49317Et0.A00(getApplicationContext(), C47697EDg.A00(this, 37), this.A02, AnonymousClass05K.A01, "challenge/", A1E);
            return;
        }
        C49317Et0.A00(getApplicationContext(), C47697EDg.A00(this, 38), this.A02, AnonymousClass05K.A01, "challenge/rewind/", (Map) null);
        finish();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.challenge.activity.ChallengeActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-1837165060);
        Bundle bundleExtra = getIntent().getBundleExtra("ChallengeFragment.arguments");
        bundleExtra.getClass();
        this.A00 = bundleExtra;
        this.A02 = DbT.A0W(bundleExtra);
        this.A04 = this.A00.getString("challenge_id");
        this.A06 = this.A00.getString("user_fbid");
        this.A05 = this.A00.getString("entity_id");
        this.A01 = getSupportFragmentManager();
        this.A08 = C48766Ejp.A00(getIntent().getStringExtra("ChallengeFragment.challengeType"));
        this.A03 = new T6A(this.A02);
        Context applicationContext = getApplicationContext();
        if (applicationContext != null && 0oI.A09(applicationContext)) {
            1xC r2 = 1xC.A01;
            r2.A02(this.A09, 0KY.class);
            this.A07 = r2;
        }
        super.onCreate(bundle);
        AnonymousClass0fD.A07(1893283964, A002);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.challenge.activity.ChallengeActivity, android.app.Activity] */
    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(396778084);
        super.onDestroy();
        if (isFinishing() && this.A08 == AnonymousClass05K.A0j) {
            C46636DiG.A00(this.A02).A03(this.A00.getInt("ChallengeFragment.bloksAction"));
        }
        AnonymousClass0fD.A07(-729301537, A002);
    }

    public final void onNewIntent(Intent intent) {
        ChallengeActivity.super.onNewIntent(intent);
        Bundle bundleExtra = intent.getBundleExtra("ChallengeFragment.arguments");
        bundleExtra.getClass();
        this.A00 = bundleExtra;
        this.A04 = bundleExtra.getString("challenge_id");
        this.A06 = this.A00.getString("user_fbid");
        this.A05 = this.A00.getString("entity_id");
        this.A08 = C48766Ejp.A00(intent.getStringExtra("ChallengeFragment.challengeType"));
        getSupportFragmentManager().A0y((String) null, 1);
        A00();
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }
}
