package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import java.util.concurrent.TimeUnit;

/* renamed from: X.55F  reason: invalid class name */
public final class AnonymousClass55F extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 1CY A02;
    public final /* synthetic */ ImageUrl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55F(1CY r4, ImageUrl imageUrl, String str, int i, long j, boolean z) {
        super(717, 5, false, false);
        this.A02 = r4;
        this.A03 = imageUrl;
        this.A04 = str;
        this.A05 = z;
        this.A01 = j;
        this.A00 = i;
    }

    public final void run() {
        String str;
        boolean z;
        String str2;
        1CY r5 = this.A02;
        ImageUrl imageUrl = this.A03;
        String str3 = this.A04;
        boolean z2 = this.A05;
        long j = this.A01;
        int i = this.A00;
        String CCJ = imageUrl.CCJ();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = r5.A04;
        lightweightQuickPerformanceLogger.markerStart(23396353, i, j, TimeUnit.MILLISECONDS);
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "MODULE", str3);
        if (z2) {
            str = "on-screen";
        } else {
            str = "off-screen";
        }
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "IMAGE_PRIORITY", str);
        PPRLoggingData BO8 = imageUrl.BO8();
        if (BO8 != null) {
            z = BO8.A07;
        } else {
            z = false;
        }
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "VIDEO_COVER", z);
        if (r5.A01 != null) {
            String A0L = 1NK.A00().A0L(imageUrl);
            0qQ.A07(A0L);
            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "DISK_CACHE_KEY", A0L);
            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "CACHE_KEY", ((ImageCacheKey) imageUrl.AjH()).A03);
            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "CDN_CONTENT_TYPE", imageUrl.AmO().A00);
            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "FB_TYPE", imageUrl.B4c().A00);
            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "EVERSTORE_OBJECT_TYPE", imageUrl.B2O().A00);
        }
        if (AnonymousClass20W.A02()) {
            int A042 = 00l.A04(CCJ, '?', 0);
            if (A042 > 0) {
                CCJ = CCJ.substring(0, A042);
                0qQ.A07(CCJ);
            }
            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "URI_HASH", CCJ.hashCode());
        }
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "APP_STARTUP_TYPE", C64031Cc.A09.toString());
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "APP_STARTUP_TIME_BUCKET", C64031Cc.A00());
        PPRLoggingData BO82 = imageUrl.BO8();
        if (!(BO82 instanceof PPRLoggingData)) {
            str2 = "unknown";
        } else if (BO82.A05) {
            str2 = "ad";
        } else {
            str2 = "organic";
        }
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "IS_AD", str2);
        1wo.A00().A03("IMAGE", str3, i, j, z2);
    }
}
