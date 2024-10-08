package com.facebook.smartcapture.view;

import X.00k;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10239Roz;
import X.C10745RxO;
import X.C10880Rzg;
import X.C11349SOi;
import X.C12166SoH;
import X.C13030TIm;
import X.C13583Td9;
import X.C13777Tgs;
import X.C13833Ti8;
import X.C343047pa;
import X.C343367q6;
import X.C3497181l;
import X.C51965G9l;
import X.C60240fb;
import X.C7913Qcj;
import X.C7915Qcm;
import X.JTR;
import X.Pxf;
import X.Q9N;
import X.TGR;
import X.TGS;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.docauth.DocAuthManager;
import com.facebook.smartcapture.logging.CancelReason;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.logging.InMemoryLogger;
import com.facebook.smartcapture.ui.PhotoRequirementsView;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class IdCaptureActivity extends IdCaptureBaseActivity implements C3497181l, C13777Tgs, C13583Td9 {
    public static final C10880Rzg A07 = new Object();
    public Uri A00;
    public FrameLayout A01;
    public C13833Ti8 A02;
    public C12166SoH A03;
    public C7915Qcm A04;
    public boolean A05;
    public boolean A06;

    public final void DDD(Exception exc) {
        0qQ.A0B(exc, 0);
        A02().logError("Camera initialization error", exc);
    }

    public final void DKf(C343367q6 r11) {
        C343047pa r1;
        C13833Ti8 ti8 = this.A02;
        C343047pa r2 = null;
        if (ti8 != null) {
            r1 = ti8.Bf7();
        } else {
            r1 = null;
        }
        C13833Ti8 ti82 = this.A02;
        if (ti82 != null) {
            r2 = ti82.BcL();
        }
        if (r1 != null && r2 != null) {
            IdCaptureLogger A022 = A02();
            int i = r1.A02;
            int i2 = r1.A01;
            int i3 = r2.A02;
            int i4 = r2.A01;
            FrameLayout frameLayout = this.A01;
            0qQ.A0A(frameLayout);
            int width = frameLayout.getWidth();
            FrameLayout frameLayout2 = this.A01;
            0qQ.A0A(frameLayout2);
            A022.logCameraInitialize(i, i2, i3, i4, width, frameLayout2.getHeight());
        }
    }

    public final void EUV(boolean z) {
        C7915Qcm qcm = this.A04;
        0qQ.A0A(qcm);
        C7913Qcj qcj = (C7913Qcj) qcm;
        ProgressBar progressBar = qcj.A06;
        0qQ.A0A(progressBar);
        progressBar.post(new TGR(qcj, z));
    }

    public final void ElL(boolean z, boolean z2) {
        C7915Qcm qcm = this.A04;
        0qQ.A0A(qcm);
        C7913Qcj qcj = (C7913Qcj) qcm;
        FragmentActivity activity = qcj.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C13030TIm(qcj, z, z2));
        }
    }

    public final void ElM(boolean z) {
        C7915Qcm qcm = this.A04;
        0qQ.A0A(qcm);
        C7913Qcj qcj = (C7913Qcj) qcm;
        ProgressBar progressBar = qcj.A08;
        0qQ.A0A(progressBar);
        progressBar.post(new TGS(qcj, z));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.facebook.smartcapture.view.IdCaptureActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity] */
    private final String A00(String str) {
        Map BEc = BEc();
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator A0u = AnonymousClass7TF.A0u(BEc);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (str.equals(A1J.getValue())) {
                JTR.A1U(A1H, A1J);
            }
        }
        if (A1H.isEmpty()) {
            return "";
        }
        return AnonymousClass7TF.A0d(getResources(), AnonymousClass7TE.A0M(00k.A09(A1H.keySet())));
    }

    public final void D14() {
        A02().logFlowCancel(CancelReason.CAPTURE_STEP_BACK_BUTTON);
        super.onBackPressed();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            if (intent != null) {
                this.A00 = intent.getData();
            }
            C12166SoH soH = this.A03;
            if (soH == null) {
                0qQ.A0F("presenter");
                throw AnonymousClass00P.createAndThrow();
            } else {
                soH.A02();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.smartcapture.view.IdCaptureActivity, android.app.Activity] */
    public final void onAttachedToWindow() {
        IdCaptureActivity.super.onAttachedToWindow();
        getWindow().addFlags(128);
    }

    public final void onBackPressed() {
        C7913Qcj A0P = getSupportFragmentManager().A0P(R.id.capture_overlay_fragment_container);
        if (A0P instanceof C7913Qcj) {
            C7913Qcj qcj = A0P;
            PhotoRequirementsView photoRequirementsView = qcj.A0C;
            0qQ.A0A(photoRequirementsView);
            if (photoRequirementsView.A02) {
                PhotoRequirementsView photoRequirementsView2 = qcj.A0C;
                0qQ.A0A(photoRequirementsView2);
                Q9N q9n = photoRequirementsView2.A01;
                if (q9n != null) {
                    q9n.A00();
                    photoRequirementsView2.A01 = null;
                }
                photoRequirementsView2.A02 = false;
                return;
            }
        }
        A02().logFlowCancel(CancelReason.SYSTEM_BACK_BUTTON);
        super.onBackPressed();
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [androidx.activity.ComponentActivity, X.81l, android.content.Context, com.facebook.smartcapture.view.IdCaptureActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = 2107200659(0x7d995493, float:2.5476377E37)
            int r1 = X.AnonymousClass0fD.A00(r0)
            r13 = r20
            r0 = r21
            super.onCreate(r0)
            r0 = 2131624429(0x7f0e01ed, float:1.8876037E38)
            r13.setContentView(r0)
            r0 = 2131429434(0x7f0b083a, float:1.848054E38)
            android.view.View r3 = r13.findViewById(r0)
            if (r3 == 0) goto L_0x01f0
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r13.A01 = r3
            if (r3 == 0) goto L_0x002f
            X.Q8k r2 = new X.Q8k
            r2.<init>(r3, r13)
            r3.setOutlineProvider(r2)
            r2 = 1
            r3.setClipToOutline(r2)
        L_0x002f:
            com.facebook.smartcapture.flow.IdCaptureConfig r16 = r13.A01()
            X.Rif r4 = r13.A08
            com.facebook.smartcapture.docauth.DocumentType r15 = r13.A01
            com.facebook.smartcapture.flow.IdCaptureConfig r3 = r13.A01()
            com.facebook.smartcapture.logging.IdCaptureLogger r2 = r13.A02()
            com.facebook.smartcapture.docauth.DocAuthManager r14 = new com.facebook.smartcapture.docauth.DocAuthManager
            r14.<init>(r13, r3, r2)
            com.facebook.smartcapture.logging.IdCaptureLogger r17 = r13.A02()
            X.SoH r12 = new X.SoH
            r18 = r13
            r19 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r13.A03 = r12
            X.TCs r3 = new X.TCs
            r3.<init>(r13)
            android.view.View r2 = X.C66581MXm.A0A(r13)
            r2.post(r3)
            com.facebook.smartcapture.logging.IdCaptureStep r3 = r13.A05
            com.facebook.smartcapture.logging.IdCaptureStep r2 = com.facebook.smartcapture.logging.IdCaptureStep.INITIAL
            if (r3 != r2) goto L_0x006c
            com.facebook.smartcapture.logging.IdCaptureLogger r2 = r13.A02()
            r2.logFlowStart()
        L_0x006c:
            java.lang.String r4 = "__external__permissions_title"
            com.facebook.smartcapture.ui.IdCaptureUi r2 = r13.A07
            r3 = 0
            if (r2 != 0) goto L_0x00b4
            com.facebook.smartcapture.logging.IdCaptureLogger r2 = r13.A02()
            java.lang.String r0 = "IdCaptureUi is null"
            r2.logError(r0, r3)
        L_0x007c:
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r13.A01()
            boolean r0 = r0.A0L
            r13.A06 = r0
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r13.A01()
            boolean r0 = r0.A0H
            r13.A05 = r0
            android.content.res.Resources r6 = r13.A00
            X.Qcm r0 = r13.A04
            X.0qQ.A0A(r0)
            r0 = 2131951664(0x7f130030, float:1.9539749E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 2131951638(0x7f130016, float:1.9539696E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131951749(0x7f130085, float:1.9539921E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r3, r2, r0}
            java.util.List r3 = X.0sr.A1P(r0)
            if (r6 == 0) goto L_0x01e9
            goto L_0x017e
        L_0x00b4:
            com.facebook.smartcapture.flow.IdCaptureConfig r2 = r13.A01()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            boolean r2 = r2.A0K     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            if (r2 == 0) goto L_0x0124
            java.lang.String r5 = r13.A00(r4)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            java.lang.String r2 = "__external__id_permissions_explanation"
            java.lang.String r6 = r13.A00(r2)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            android.content.res.Resources r3 = r13.getResources()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r2 = 17039370(0x104000a, float:2.42446E-38)
            java.lang.String r7 = X.AnonymousClass7TF.A0d(r3, r2)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            android.content.res.Resources r2 = r13.getResources()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r3 = 17039360(0x1040000, float:2.424457E-38)
            java.lang.String r8 = X.AnonymousClass7TF.A0d(r2, r3)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            java.lang.String r9 = r13.A00(r4)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            java.lang.String r2 = "__external__id_permissions_in_settings_explanation"
            java.lang.String r10 = r13.A00(r2)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            java.lang.String r2 = "__external__id_permissions_in_settings_ok_button"
            java.lang.String r11 = r13.A00(r2)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            android.content.res.Resources r2 = r13.getResources()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            java.lang.String r12 = X.AnonymousClass7TF.A0d(r2, r3)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            com.facebook.smartcapture.camera.DialogTexts r4 = new com.facebook.smartcapture.camera.DialogTexts     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            X.U7x r5 = new X.U7x     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r5.<init>()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            com.facebook.smartcapture.flow.IdCaptureConfig r2 = r13.A01()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            com.facebook.smartcapture.camera.sizesetter.FixedSizes r3 = r2.A04     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            java.lang.String r2 = "fixed_photo_size"
            r6.putParcelable(r2, r3)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            java.lang.String r2 = "texts"
            r6.putParcelable(r2, r4)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
        L_0x0112:
            r5.setArguments(r6)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            X.SoH r2 = r13.A03     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            if (r2 != 0) goto L_0x013f
            java.lang.String r0 = "presenter"
            X.0qQ.A0F(r0)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            throw r0     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
        L_0x0124:
            X.U7w r5 = new X.U7w     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r5.<init>()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            com.facebook.smartcapture.flow.IdCaptureConfig r2 = r13.A01()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            com.facebook.smartcapture.camera.sizesetter.FixedSizes r4 = r2.A04     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r3 = 0
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            java.lang.String r2 = "initial_camera_facing"
            r6.putInt(r2, r3)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            java.lang.String r2 = "fixed_photo_size"
            r6.putParcelable(r2, r4)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            goto L_0x0112
        L_0x013f:
            com.facebook.smartcapture.docauth.DocAuthManager r2 = r2.A0A     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r5.EQM(r2)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r5.EeV(r13)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            com.facebook.smartcapture.ui.IdCaptureUi r2 = r13.A07     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            X.0qQ.A0A(r2)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            java.lang.Class<X.Qcj> r2 = X.C7913Qcj.class
            java.lang.Object r4 = r2.newInstance()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            X.Qcm r4 = (X.C7915Qcm) r4     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            X.0s1 r3 = X.DbW.A0D(r13)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r2 = r5
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r3.A0A(r2, r0)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r0 = 2131429627(0x7f0b08fb, float:1.8480932E38)
            r3.A0A(r4, r0)     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r3.A00()     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r13.A02 = r5     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            r13.A04 = r4     // Catch:{ IllegalAccessException | InstantiationException -> 0x016d }
            goto L_0x007c
        L_0x016d:
            r3 = move-exception
            com.facebook.smartcapture.logging.IdCaptureLogger r2 = r13.A02()
            java.lang.String r0 = r3.getMessage()
            X.0qQ.A0A(r0)
            r2.logError(r0, r3)
            goto L_0x007c
        L_0x017e:
            boolean r0 = X.C9576RdG.A00(r6)     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x01e9
            android.content.res.Configuration r0 = X.Pxf.A0G(r13)     // Catch:{ all -> 0x01df }
            android.content.res.Configuration r2 = new android.content.res.Configuration     // Catch:{ all -> 0x01df }
            r2.<init>(r0)     // Catch:{ all -> 0x01df }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x01df }
            r2.setLocale(r0)     // Catch:{ all -> 0x01df }
            android.content.Context r0 = r13.createConfigurationContext(r2)     // Catch:{ all -> 0x01df }
            android.content.res.Resources r5 = r0.getResources()     // Catch:{ all -> 0x01df }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x01df }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x01df }
        L_0x01a1:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x01e9
            int r2 = X.AnonymousClass7TG.A0F(r7)     // Catch:{ all -> 0x01df }
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r6, r2)     // Catch:{ all -> 0x01df }
            java.lang.String r4 = X.AnonymousClass7TF.A0d(r5, r2)     // Catch:{ all -> 0x01df }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x01a1
            android.content.res.Configuration r0 = r6.getConfiguration()     // Catch:{ all -> 0x01df }
            java.util.Locale r0 = r0.locale     // Catch:{ all -> 0x01df }
            java.lang.String r2 = r0.getLanguage()     // Catch:{ all -> 0x01df }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x01df }
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x01df }
            java.lang.String r0 = "str"
            r3.put(r0, r4)     // Catch:{ all -> 0x01df }
            java.lang.String r0 = "lang"
            r3.put(r0, r2)     // Catch:{ all -> 0x01df }
            com.facebook.smartcapture.logging.IdCaptureLogger r2 = r13.A02()     // Catch:{ all -> 0x01df }
            java.lang.String r0 = "locale_mismatch"
            r2.logEvent(r0, r3)     // Catch:{ all -> 0x01df }
            goto L_0x01a1
        L_0x01df:
            r0 = move-exception
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "SCPUtil"
            android.util.Log.e(r0, r2)
        L_0x01e9:
            r0 = -1074289496(0xffffffffbff7a4a8, float:-1.9347124)
            X.AnonymousClass0fD.A07(r0, r1)
            return
        L_0x01f0:
            java.lang.String r0 = "Required View not found. Your layout is missing the ID requested."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.view.IdCaptureActivity.onCreate(android.os.Bundle):void");
    }

    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(-507326034);
        IdCaptureActivity.super.onPause();
        C12166SoH soH = this.A03;
        if (soH == null) {
            0qQ.A0F("presenter");
            throw AnonymousClass00P.createAndThrow();
        }
        soH.A0A.cleanupJNI();
        C10745RxO rxO = soH.A06;
        if (rxO != null) {
            SensorManager sensorManager = rxO.A00;
            if (sensorManager != null) {
                C60240fb.A00(rxO.A03, sensorManager);
            }
            WeakReference weakReference = rxO.A01;
            if (weakReference != null) {
                weakReference.clear();
            }
            rxO.A00 = null;
            rxO.A01 = null;
        }
        soH.A0G.disable();
        soH.A0E.logCaptureSessionEnd(soH.A0F.toString());
        AnonymousClass0fD.A07(-1931083044, A002);
    }

    public final void onResume() {
        Map A0x;
        int A002 = AnonymousClass0fD.A00(1082468860);
        super.onResume();
        C12166SoH soH = this.A03;
        if (soH == null) {
            0qQ.A0F("presenter");
            throw AnonymousClass00P.createAndThrow();
        }
        InMemoryLogger inMemoryLogger = soH.A0F;
        inMemoryLogger.clear();
        inMemoryLogger.addEntry(CaptureState.INITIAL.getText()).submit();
        C11349SOi sOi = soH.A0C;
        if (sOi.A03() || !soH.A08) {
            DocAuthManager docAuthManager = soH.A0A;
            boolean z = soH.A08;
            synchronized (sOi) {
                A0x = Pxf.A0x(sOi.A07);
            }
            docAuthManager.initJNI(false, z, A0x);
        }
        soH.A03();
        soH.A0G.enable();
        Context context = (Context) soH.A0J.get();
        C10745RxO rxO = soH.A06;
        if (!(rxO == null || context == null)) {
            C10239Roz roz = soH.A0H;
            0qQ.A0B(roz, 1);
            Object systemService = context.getSystemService("sensor");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            SensorManager sensorManager = (SensorManager) systemService;
            rxO.A00 = sensorManager;
            0qQ.A0A(sensorManager);
            SensorEventListener sensorEventListener = rxO.A03;
            SensorManager sensorManager2 = rxO.A00;
            0qQ.A0A(sensorManager2);
            C60240fb.A01(sensorManager2.getDefaultSensor(1), sensorEventListener, sensorManager, 2);
            rxO.A01 = C51965G9l.A0v(roz);
            rxO.A02 = true;
        }
        AnonymousClass0fD.A07(946695725, A002);
    }
}
