package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.2lS  reason: invalid class name and case insensitive filesystem */
public final class C228352lS {
    public WeakReference A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 14));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 15));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 17));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 18));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 19));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 20));
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 21));
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 22));
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 23));
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 24));
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 16));

    public final void A03(Context context, 02m r29, AnonymousClass2lP r30, AnonymousClass5K5 r31, C233632w4 r32, C238523Ce r33, String str, String str2, String str3) {
        Context context2 = context;
        0qQ.A0B(context2, 0);
        String str4 = str;
        0qQ.A0B(str4, 2);
        02m r10 = r29;
        0qQ.A0B(r10, 5);
        Object value = this.A0B.getValue();
        0qQ.A07(value);
        r10.markerAnnotate(424097382, "warm_up_enabled", ((Boolean) value).booleanValue());
        Object value2 = this.A07.getValue();
        0qQ.A07(value2);
        r10.markerAnnotate(424097382, "immediate_source_enabled", ((Boolean) value2).booleanValue());
        Object value3 = this.A08.getValue();
        0qQ.A07(value3);
        r10.markerAnnotate(424097382, "server_source_enabled", ((Boolean) value3).booleanValue());
        Object value4 = this.A09.getValue();
        0qQ.A07(value4);
        r10.markerAnnotate(424097382, "system_source_enabled", ((Boolean) value4).booleanValue());
        Object value5 = this.A06.getValue();
        0qQ.A07(value5);
        r10.markerAnnotate(424097382, "prefetch_source_enabled", ((Boolean) value5).booleanValue());
        r10.markerAnnotate(424097382, "app_start_type", C64031Cc.A09.toString());
        Object value6 = this.A04.getValue();
        0qQ.A07(value6);
        AnonymousClass2lP r12 = r30;
        AnonymousClass5K5 r13 = r31;
        C233632w4 r14 = r32;
        C238523Ce r15 = r33;
        String str5 = str2;
        String str6 = str3;
        if (((Boolean) value6).booleanValue()) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
                0qQ.A07(scheduledThreadPoolExecutor);
                C258473z8 listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) scheduledThreadPoolExecutor);
                0qQ.A07(listeningDecorator);
                ListenableFuture Eyk = listeningDecorator.Eyk(new C261634Ai(context2, r10, this, r13, str4));
                Object value7 = this.A05.getValue();
                0qQ.A07(value7);
                C255183ti.A04(new C258593zK(r10, this, r12, r14, r15, str5, str6), C255183ti.A02(Eyk, scheduledThreadPoolExecutor, TimeUnit.MILLISECONDS, ((Number) value7).longValue()), 1Lf.A01);
            } catch (TimeoutException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("timeout: ");
                sb.append(e);
                sb.append(".message");
                r10.markerAnnotate(424097382, TraceFieldType.FailureReason, sb.toString());
                A01(this, r12, r14, r15, Double.valueOf(1.0d), str5, str6, true);
            } catch (Exception e2) {
                String message = e2.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                r10.markerAnnotate(424097382, TraceFieldType.FailureReason, message);
                A01(this, r12, r14, r15, Double.valueOf(1.0d), str5, str6, true);
            }
        } else {
            0nY.A00().ATE(new C387009lW(context2, r10, this, r12, r13, r14, r15, str4, str5, str6));
        }
    }

    public static final double A00(C228352lS r1) {
        Object value = r1.A0C.getValue();
        0qQ.A07(value);
        return ((Number) value).doubleValue();
    }

    public static final void A01(C228352lS r1, AnonymousClass2lP r2, C233632w4 r3, C238523Ce r4, Double d, String str, String str2, boolean z) {
        11Z.A02(new AnonymousClass413(r1, r2, r3, r4, d, str, str2, z));
    }

    public C228352lS(UserSession userSession) {
        this.A01 = userSession;
    }

    public static final void A02(C228352lS r8, String str, long j) {
        long j2 = j;
        String str2 = str;
        if (j >= 0) {
            ((AnonymousClass40N) ((C258953zu) r8.A03.getValue()).A01.getValue()).FNg(str2, j2, 604800000);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Collect signal with invalid value: ");
        sb.append(j);
        sb.append(", signal key: ");
        sb.append(str);
        sb.append(' ');
        SOZ.A00((Exception) null, sb.toString());
    }
}
