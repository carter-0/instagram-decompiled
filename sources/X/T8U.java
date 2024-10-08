package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.realtimeclient.RealtimeSubscription;

public final class T8U implements C13842TiH {
    public static int A01 = 1;
    public static int A02 = 1;
    public static int A03;
    public static int A04;
    public QuickPerformanceLogger A00 = QuickPerformanceLoggerProvider.getQPLInstance();

    public final void A6k(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (str2 != null && (quickPerformanceLogger = this.A00) != null) {
            quickPerformanceLogger.markerAnnotate(299633217, str, str2);
        }
    }

    public final void A6l() {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(299633217, 2);
        }
        A01++;
    }

    public final void A6m(String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(299633217, str);
        }
    }

    public final void A6n(String str) {
        if (this.A00 == null) {
            this.A00 = QuickPerformanceLoggerProvider.getQPLInstance();
        }
        int i = A03;
        int i2 = A01;
        if (i == i2) {
            A6k("has_duplicate_start", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            QuickPerformanceLogger quickPerformanceLogger = this.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(299633217, 3);
            }
            i2 = A01 + 1;
            A01 = i2;
        }
        A03 = i2;
        QuickPerformanceLogger quickPerformanceLogger2 = this.A00;
        if (quickPerformanceLogger2 != null) {
            quickPerformanceLogger2.markerStart(299633217);
        }
        QuickPerformanceLogger quickPerformanceLogger3 = this.A00;
        if (quickPerformanceLogger3 != null) {
            quickPerformanceLogger3.markerAnnotate(299633217, AnonymousClass000.A00(813), str);
        }
        QuickPerformanceLogger quickPerformanceLogger4 = this.A00;
        if (quickPerformanceLogger4 != null) {
            quickPerformanceLogger4.markerAnnotate(299633217, TraceFieldType.MsgId, A01);
        }
    }

    public final void A6o(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (str2 != null && (quickPerformanceLogger = this.A00) != null) {
            quickPerformanceLogger.markerAnnotate(299643486, str, str2);
        }
    }

    public final void A6p() {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(299643486, 2);
        }
        A02++;
    }

    public final void A6q(String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(299643486, str);
        }
    }

    public final void A6r(String str) {
        this.A00 = QuickPerformanceLoggerProvider.getQPLInstance();
        int i = A04;
        int i2 = A02;
        if (i == i2) {
            A6o("has_duplicate_start", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            QuickPerformanceLogger quickPerformanceLogger = this.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(299643486, 3);
            }
            i2 = A02 + 1;
            A02 = i2;
        }
        A04 = i2;
        QuickPerformanceLogger quickPerformanceLogger2 = this.A00;
        if (quickPerformanceLogger2 != null) {
            quickPerformanceLogger2.markerStart(299643486);
        }
        QuickPerformanceLogger quickPerformanceLogger3 = this.A00;
        if (quickPerformanceLogger3 != null) {
            quickPerformanceLogger3.markerAnnotate(299643486, AnonymousClass000.A00(813), "vrc_maybeStartRecording");
        }
        QuickPerformanceLogger quickPerformanceLogger4 = this.A00;
        if (quickPerformanceLogger4 != null) {
            quickPerformanceLogger4.markerAnnotate(299643486, TraceFieldType.MsgId, A02);
        }
    }
}
