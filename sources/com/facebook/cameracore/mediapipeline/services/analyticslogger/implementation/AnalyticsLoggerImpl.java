package com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation;

import X.002;
import X.0qQ;
import X.0rw;
import X.AnonymousClass000;
import X.AnonymousClass1YL;
import X.C312546ef;
import X.C312586ej;
import X.C312596el;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.logging.crashmetadatalogger.implementation.CameraARCrashMetadataLogger;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executors;

public class AnalyticsLoggerImpl extends AnalyticsLogger {
    public AndroidAsyncExecutorFactory mAsyncExecutorFactory;
    public C312546ef mCameraARAnalyticsLogger;
    public final AnonymousClass1YL mCameraARBugReportLogger;
    public final CameraARCrashMetadataLogger mCrashMetadataLogger = new CameraARCrashMetadataLogger();
    public C312596el mEffectStartIntent = C312596el.NONE;
    public final C312586ej mOptimizedPerfLoggerOption;
    public String mProductName;

    public native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, int i);

    public String getEffectStartIntentString() {
        int ordinal = this.mEffectStartIntent.ordinal();
        if (ordinal == 1) {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }
        if (ordinal != 2) {
            return "unknown";
        }
        return "system";
    }

    public String getProductName() {
        return this.mProductName;
    }

    public XAnalyticsHolder getXAnalytics() {
        C312546ef r0 = this.mCameraARAnalyticsLogger;
        if (r0 != null) {
            return r0.CGu();
        }
        return null;
    }

    public void logForBugReport(String str, String str2) {
        String str3;
        AnonymousClass1YL r1 = this.mCameraARBugReportLogger;
        if (r1 != null) {
            0qQ.A0B(str, 0);
            0qQ.A0B(str2, 1);
            Map map = r1.A00;
            if (map.containsKey(str)) {
                str3 = 0rw.A0t(002.A0g("\n   ", (String) map.get(str), "\n   \n   "));
            } else {
                str3 = "";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AnonymousClass000.A00(5393));
            Date date = new Date(System.currentTimeMillis());
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(simpleDateFormat.format(date));
            sb.append("]: ");
            sb.append(str2);
            map.put(str, 002.A0R(str3, sb.toString()));
        }
    }

    public void logRawEvent(String str, String str2) {
        C312546ef r0 = this.mCameraARAnalyticsLogger;
        if (r0 != null) {
            r0.DOt(str, str2);
        }
    }

    public void logSessionEvent(boolean z) {
        C312546ef r0 = this.mCameraARAnalyticsLogger;
        if (r0 != null) {
            r0.DOu(z);
        }
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null && !z) {
            cameraARCrashMetadataLogger.cleanupBreakpadData();
        }
    }

    public void setBreakpadData(String str, String str2) {
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null) {
            cameraARCrashMetadataLogger.setBreakpadData(str, str2);
        }
    }

    public AnalyticsLoggerImpl(C312546ef r3, AnonymousClass1YL r4, C312586ej r5) {
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(Executors.newScheduledThreadPool(1));
        this.mAsyncExecutorFactory = androidAsyncExecutorFactory2;
        this.mCameraARAnalyticsLogger = r3;
        this.mProductName = r3.BgN();
        this.mCameraARBugReportLogger = r4;
        this.mOptimizedPerfLoggerOption = r5;
        this.mHybridData = initHybrid(androidAsyncExecutorFactory2, r5.A00);
    }
}
