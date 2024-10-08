package X;

import android.content.Context;
import com.facebook.smartcapture.download.CreditCardModulesDownloader;
import com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.IdCaptureUi;
import java.util.Map;

/* renamed from: X.S3b  reason: case insensitive filesystem */
public abstract class C10969S3b {
    public int A00;
    public long A01;
    public Context A02;
    public RE7 A03 = RE7.ONE_SIDE;
    public CreditCardModulesDownloader A04;
    public IdCaptureExperimentConfigProvider A05;
    public SmartCaptureLoggerProvider A06;
    public ResourcesProvider A07;
    public StringOverrideFactory A08;
    public IdCaptureUi A09;
    public Integer A0A = AnonymousClass05K.A00;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public Map A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r7 == null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent A00() {
        /*
            r12 = this;
            java.lang.String r7 = r12.A0E
            android.content.Context r4 = r12.A02
            if (r4 == 0) goto L_0x000d
            com.facebook.smartcapture.ui.IdCaptureUi r0 = r12.A09
            if (r0 == 0) goto L_0x000d
            r0 = 1
            if (r7 != 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x017d
            X.RF2 r8 = X.RF2.MID_END
            com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider r0 = r12.A05
            r2 = 0
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            com.facebook.smartcapture.docauth.DocumentType r3 = com.facebook.smartcapture.docauth.DocumentType.ID1
            if (r0 == 0) goto L_0x002b
            X.0Tu r5 = X.0Tu.A05
            r0 = 18868379741848012(0x4308b1000001cc, double:2.1175973180899413E-307)
            java.lang.String r10 = X.1AW.A04(r5, r0)
        L_0x0028:
            if (r10 == 0) goto L_0x00a4
            goto L_0x002d
        L_0x002b:
            r10 = r2
            goto L_0x0028
        L_0x002d:
            int r0 = r10.length()     // Catch:{ Exception -> 0x00a7 }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ Exception -> 0x00a7 }
            X.0qQ.A0A(r9)     // Catch:{ Exception -> 0x00a7 }
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x00a7 }
            r6 = 0
            boolean r0 = X.00p.A0k(r9, r1, r6)     // Catch:{ Exception -> 0x00a7 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r5 = X.AnonymousClass7TF.A0k(r9)     // Catch:{ Exception -> 0x00a7 }
        L_0x0048:
            r0 = 1
            X.0qQ.A0B(r5, r0)     // Catch:{ Exception -> 0x00a7 }
            org.json.JSONObject r1 = X.C66580MXl.A17(r10)     // Catch:{ Exception -> 0x00a7 }
            boolean r0 = r1.has(r5)     // Catch:{ Exception -> 0x00a7 }
            if (r0 == 0) goto L_0x00a4
            org.json.JSONObject r10 = r1.getJSONObject(r5)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = "photo_size"
            org.json.JSONObject r0 = r10.getJSONObject(r0)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r11 = "width"
            int r1 = r0.getInt(r11)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = "height"
            int r0 = r0.getInt(r5)     // Catch:{ Exception -> 0x00a7 }
            com.facebook.smartcapture.camera.sizesetter.Size r9 = new com.facebook.smartcapture.camera.sizesetter.Size     // Catch:{ Exception -> 0x00a7 }
            r9.<init>(r1, r0)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = "preview_size"
            org.json.JSONObject r0 = r10.getJSONObject(r0)     // Catch:{ Exception -> 0x00a7 }
            int r1 = r0.getInt(r11)     // Catch:{ Exception -> 0x00a7 }
            int r0 = r0.getInt(r5)     // Catch:{ Exception -> 0x00a7 }
            com.facebook.smartcapture.camera.sizesetter.Size r5 = new com.facebook.smartcapture.camera.sizesetter.Size     // Catch:{ Exception -> 0x00a7 }
            r5.<init>(r1, r0)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = "auto_capture"
            boolean r1 = r10.optBoolean(r0, r6)     // Catch:{ Exception -> 0x00a7 }
            com.facebook.smartcapture.camera.sizesetter.FixedSizes r0 = new com.facebook.smartcapture.camera.sizesetter.FixedSizes     // Catch:{ Exception -> 0x00a7 }
            r0.<init>(r9, r5, r1)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00a5
        L_0x0093:
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = X.Pxf.A0n(r0, r1)     // Catch:{ Exception -> 0x00a7 }
            r1 = 32
            java.lang.String r0 = X.Pxf.A0n(r0, r9)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = X.002.A0T(r5, r0, r1)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x0048
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            r2 = r0
            goto L_0x00b7
        L_0x00a7:
            r5 = move-exception
            com.facebook.smartcapture.logging.SmartCaptureLoggerProvider r0 = r12.A06
            if (r0 == 0) goto L_0x00b7
            com.facebook.smartcapture.logging.SmartCaptureLogger r1 = r0.get(r4)
            if (r1 == 0) goto L_0x00b7
            java.lang.String r0 = "Fixed size config parse error"
            r1.logError(r0, r5)
        L_0x00b7:
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.util.Map r0 = r12.A0H
            if (r0 == 0) goto L_0x00cd
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r0)
        L_0x00c3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cd
            X.Pxh.A17(r6, r1)
            goto L_0x00c3
        L_0x00cd:
            X.SG1 r5 = new X.SG1
            r5.<init>()
            r5.A05 = r8
            java.lang.String r0 = "featureLevel"
            X.SG1.A00(r5, r0)
            X.RE7 r1 = r12.A03
            r5.A04 = r1
            java.lang.String r0 = "captureMode"
            X.C11367SPk.A03(r1, r0)
            X.SG1.A00(r5, r0)
            com.facebook.smartcapture.ui.IdCaptureUi r0 = r12.A09
            r5.A0B = r0
            int r0 = r12.A00
            r5.A00 = r0
            com.facebook.smartcapture.logging.SmartCaptureLoggerProvider r0 = r12.A06
            r5.A08 = r0
            com.facebook.smartcapture.resources.ResourcesProvider r0 = r12.A07
            r5.A09 = r0
            com.facebook.smartcapture.download.CreditCardModulesDownloader r0 = r12.A04
            r5.A06 = r0
            com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider r0 = r12.A05
            r5.A07 = r0
            r5.A0G = r7
            java.lang.String r0 = "product"
            X.C11367SPk.A03(r7, r0)
            java.lang.String r0 = r12.A0D
            r5.A0F = r0
            long r0 = r12.A01
            r5.A01 = r0
            java.lang.String r0 = r12.A0G
            r5.A0I = r0
            r5.A02 = r6
            java.lang.String r0 = r12.A0C
            r5.A0E = r0
            java.lang.String r0 = r12.A0B
            r5.A0D = r0
            java.lang.String r0 = r12.A0F
            r5.A0H = r0
            boolean r0 = r12.A0K
            r5.A0N = r0
            boolean r0 = r12.A0J
            r5.A0M = r0
            java.lang.Integer r1 = r12.A0A
            r5.A0C = r1
            java.lang.String r0 = "designSystem"
            X.C11367SPk.A03(r1, r0)
            X.SG1.A00(r5, r0)
            boolean r0 = r12.A0I
            r5.A0K = r0
            r5.A03 = r2
            boolean r0 = r12 instanceof X.C7905QcZ
            if (r0 == 0) goto L_0x0140
            r0 = 1
            r5.A0L = r0
        L_0x0140:
            com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory r0 = r12.A08
            if (r0 == 0) goto L_0x014c
            r5.A0A = r0
            java.lang.String r0 = "stringOverrideFactory"
            X.SG1.A00(r5, r0)
        L_0x014c:
            com.facebook.smartcapture.flow.IdCaptureConfig r2 = new com.facebook.smartcapture.flow.IdCaptureConfig
            r2.<init>((X.SG1) r5)
            boolean r0 = r2.A0I
            if (r0 != 0) goto L_0x0174
            java.lang.String r0 = r12.A0C
            if (r0 == 0) goto L_0x016d
            X.RE7 r0 = r12.A03
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x0174
            java.lang.String r0 = r12.A0B
            if (r0 != 0) goto L_0x0174
            java.lang.String r0 = "File paths missing for the requested CaptureMode"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x016d:
            java.lang.String r0 = "Front file path must not be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0174:
            X.Rzg r1 = com.facebook.smartcapture.view.IdCaptureActivity.A07
            com.facebook.smartcapture.logging.IdCaptureStep r0 = com.facebook.smartcapture.logging.IdCaptureStep.INITIAL
            android.content.Intent r0 = r1.A00(r4, r3, r2, r0)
            return r0
        L_0x017d:
            java.lang.String r0 = "All required fields must not be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10969S3b.A00():android.content.Intent");
    }
}
