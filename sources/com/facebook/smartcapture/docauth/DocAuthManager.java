package com.facebook.smartcapture.docauth;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11321SMv;
import X.C51965G9l;
import X.DbZ;
import X.RF2;
import android.content.Context;
import android.graphics.Rect;
import com.facebook.jni.HybridData;
import com.facebook.smartcapture.diagnostic.DiagnosticInfo;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import java.lang.ref.WeakReference;

public final class DocAuthManager {
    public float alignmentScaleX;
    public int bytesPerPixel;
    public final Context context;
    public WeakReference delegate;
    public final IdCaptureConfig idCaptureConfig;
    public boolean isImageProcessingRunning = true;
    public boolean isNativeLibraryLoaded;
    public final IdCaptureLogger logger;
    public HybridData mHybridData;
    public int previewHeight;
    public Rect previewRegionOfInterest;
    public int previewWidth;

    public DocAuthManager(Context context2, IdCaptureConfig idCaptureConfig2, IdCaptureLogger idCaptureLogger) {
        DbZ.A0t(1, context2, idCaptureConfig2, idCaptureLogger);
        this.context = context2;
        this.idCaptureConfig = idCaptureConfig2;
        this.logger = idCaptureLogger;
    }

    private final native void initCreditCardScanner(String str, String str2, String str3);

    private final native void initCreditCardScanner(String str, String str2, String str3, int i, float f, boolean z);

    private final native HybridData initHybrid(IdCaptureLogger idCaptureLogger, boolean z, boolean z2, boolean z3, String str);

    private final native DocAuthResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7);

    public final synchronized void cleanupJNI() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
        this.mHybridData = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:2|3|4|5|6|7|(1:9)(1:(1:12)(1:13))|10|14|15|(2:17|(2:19|(1:23)))(1:24)|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void initJNI(boolean r10, boolean r11, java.util.Map r12) {
        /*
            r9 = this;
            r2 = r9
            monitor-enter(r2)
            r0 = 2
            X.0qQ.A0B(r12, r0)     // Catch:{ all -> 0x0087 }
            r6 = r11
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r9.idCaptureConfig     // Catch:{ UnsatisfiedLinkError -> 0x003f }
            boolean r0 = r0.A0I     // Catch:{ UnsatisfiedLinkError -> 0x003f }
            r1 = 16
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "dynamic_pytorch_impl"
            X.0dV.A0D(r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x003f }
            java.lang.String r0 = "torch-code-gen"
            X.0dV.A0D(r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x003f }
            java.lang.String r0 = "smartcapture_id_pt_cc"
            X.0dV.A0C(r0)     // Catch:{ UnsatisfiedLinkError -> 0x003f }
        L_0x0020:
            r0 = 1
            r9.isNativeLibraryLoaded = r0     // Catch:{ UnsatisfiedLinkError -> 0x003f }
            goto L_0x003f
        L_0x0024:
            if (r11 == 0) goto L_0x0038
            java.lang.String r0 = "dynamic_pytorch_impl"
            X.0dV.A0D(r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x003f }
            java.lang.String r0 = "torch-code-gen"
            X.0dV.A0D(r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x003f }
            java.lang.String r0 = "smartcapture_id_pt"
            X.0dV.A0C(r0)     // Catch:{ UnsatisfiedLinkError -> 0x003f }
            goto L_0x0020
        L_0x0038:
            java.lang.String r0 = "smartcapture_id"
            X.0dV.A0C(r0)     // Catch:{ UnsatisfiedLinkError -> 0x003f }
            goto L_0x0020
        L_0x003f:
            r9.cleanupJNI()     // Catch:{ all -> 0x0087 }
            boolean r0 = r9.shouldRunNativeProcessing()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0082
            com.facebook.smartcapture.logging.IdCaptureLogger r3 = r9.logger     // Catch:{ all -> 0x0087 }
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r9.idCaptureConfig     // Catch:{ all -> 0x0087 }
            boolean r4 = r0.A0J     // Catch:{ all -> 0x0087 }
            X.REd r0 = X.C8886REd.ID_DETECTOR_MODEL     // Catch:{ all -> 0x0087 }
            java.lang.String r7 = X.DbU.A0r(r0, r12)     // Catch:{ all -> 0x0087 }
            r5 = r10
            com.facebook.jni.HybridData r0 = r2.initHybrid(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0087 }
            r9.mHybridData = r0     // Catch:{ all -> 0x0087 }
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r9.idCaptureConfig     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.A0I     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0085
            X.REd r0 = X.C8886REd.OCR_CONFIGURATION     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = X.DbU.A0r(r0, r12)     // Catch:{ all -> 0x0087 }
            X.REd r0 = X.C8886REd.OCR_DETECTOR_MODEL     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = X.DbU.A0r(r0, r12)     // Catch:{ all -> 0x0087 }
            X.REd r0 = X.C8886REd.OCR_RECOGNIZER_MODEL     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = X.DbU.A0r(r0, r12)     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0085
            if (r4 == 0) goto L_0x0085
            if (r5 == 0) goto L_0x0085
            r6 = 1
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            r8 = 0
            r2.initCreditCardScanner(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0087 }
            goto L_0x0085
        L_0x0082:
            r0 = 0
            r9.mHybridData = r0     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r2)
            return
        L_0x0087:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.docauth.DocAuthManager.initJNI(boolean, boolean, java.util.Map):void");
    }

    public synchronized void onPreviewFrame(byte[] bArr) {
        DiagnosticInfo diagnosticInfo;
        synchronized (this) {
            byte[] bArr2 = bArr;
            0qQ.A0B(bArr2, 0);
            if (shouldRunNativeProcessing() && this.isImageProcessingRunning && this.mHybridData != null) {
                int i = this.previewWidth;
                int i2 = this.previewHeight;
                float f = this.alignmentScaleX;
                Rect rect = this.previewRegionOfInterest;
                0qQ.A0A(rect);
                int i3 = rect.left;
                Rect rect2 = this.previewRegionOfInterest;
                0qQ.A0A(rect2);
                int i4 = rect2.top;
                Rect rect3 = this.previewRegionOfInterest;
                0qQ.A0A(rect3);
                int i5 = rect3.right;
                Rect rect4 = this.previewRegionOfInterest;
                0qQ.A0A(rect4);
                int i6 = i5 - rect4.left;
                Rect rect5 = this.previewRegionOfInterest;
                0qQ.A0A(rect5);
                int i7 = rect5.bottom;
                Rect rect6 = this.previewRegionOfInterest;
                0qQ.A0A(rect6);
                DocAuthResult processImageBuffer = processImageBuffer(bArr2, i, i2, f, i3, i4, i6, i7 - rect6.top, this.bytesPerPixel);
                Rect rect7 = this.previewRegionOfInterest;
                0qQ.A0A(rect7);
                int i8 = rect7.bottom;
                Rect rect8 = this.previewRegionOfInterest;
                0qQ.A0A(rect8);
                int i9 = i8 - rect8.top;
                WeakReference weakReference = this.delegate;
                0qQ.A0A(weakReference);
                DocAuthManagerDelegate docAuthManagerDelegate = (DocAuthManagerDelegate) weakReference.get();
                if (!(processImageBuffer == null || docAuthManagerDelegate == null)) {
                    docAuthManagerDelegate.onDocAuthResultAvailable(processImageBuffer, i9);
                }
                if (!(!this.idCaptureConfig.A0J || processImageBuffer == null || (diagnosticInfo = processImageBuffer.diagnosticInfo) == null)) {
                    Rect rect9 = this.previewRegionOfInterest;
                    0qQ.A0A(rect9);
                    int i10 = rect9.right;
                    Rect rect10 = this.previewRegionOfInterest;
                    0qQ.A0A(rect10);
                    diagnosticInfo.previewWidth = i10 - rect10.left;
                    diagnosticInfo.previewHeight = i9;
                    if (docAuthManagerDelegate != null) {
                        docAuthManagerDelegate.onDiagnosticInfoAvailable(diagnosticInfo);
                    }
                }
            }
        }
    }

    public final void setDelegate(DocAuthManagerDelegate docAuthManagerDelegate) {
        0qQ.A0B(docAuthManagerDelegate, 0);
        this.delegate = C51965G9l.A0v(docAuthManagerDelegate);
    }

    private final boolean shouldRunNativeProcessing() {
        if (!this.isNativeLibraryLoaded || this.idCaptureConfig.A01() == RF2.LOW_END) {
            return false;
        }
        return true;
    }

    public final Context getContext() {
        return this.context;
    }

    public void onPreviewBytesPerPixelChanged(int i) {
        this.bytesPerPixel = i;
    }

    public void onPreviewSizeChanged(int i, int i2, int i3, int i4) {
        this.previewWidth = i;
        this.previewHeight = i2;
        Rect A0W = AnonymousClass7TE.A0W();
        C11321SMv.A01(A0W, i3, i4, i, i2);
        this.previewRegionOfInterest = A0W;
        this.alignmentScaleX = 1.0f - (((16.0f * AnonymousClass7TF.A0E(this.context).density) * 2.0f) / ((float) i3));
    }

    public final void setImageProcessingRunning(boolean z) {
        this.isImageProcessingRunning = z;
    }
}
