package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLoggingController;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.7UL  reason: invalid class name */
public final class AnonymousClass7UL {
    public AnonymousClass7GI A00;
    public C330737Nz A01;
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final UserSession A05;
    public final AnonymousClass7UM A06 = new AnonymousClass7UM(this);
    public final AnonymousClass9HS A07;
    public final AnonymousClass9H3 A08;
    public final Runnable A09;
    public final String A0A;
    public final String A0B;
    public final WeakReference A0C;
    public final WeakReference A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass7UH A0H;
    public final Runnable A0I;
    public final WeakReference A0J;

    public AnonymousClass7UL(AnonymousClass4DH r3, UserSession userSession, AnonymousClass7UH r5, AnonymousClass9HS r6, AnonymousClass9H3 r7, Runnable runnable, Runnable runnable2, String str, String str2) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(r5, 5);
        this.A05 = userSession;
        this.A07 = r6;
        this.A08 = r7;
        this.A0H = r5;
        this.A0B = str;
        this.A0A = str2;
        this.A09 = runnable;
        this.A0I = runnable2;
        this.A0C = new WeakReference(r3);
        this.A0D = new WeakReference(runnable);
        this.A0J = new WeakReference(runnable2);
        this.A04 = new Handler(Looper.getMainLooper());
        this.A0G = AnonymousClass1YB.A00(new C377109Ko(this, 49));
        this.A0E = AnonymousClass1YB.A00(new C377109Ko(this, 47));
        this.A0F = AnonymousClass1YB.A00(new C377109Ko(this, 48));
    }

    public static final void A00(AnonymousClass7UL r4) {
        Runnable runnable;
        if (182.A06(0Tu.A05, r4.A05, 36324677316194526L)) {
            runnable = r4.A0I;
        } else {
            runnable = (Runnable) r4.A0J.get();
            if (runnable == null) {
                return;
            }
        }
        runnable.run();
    }

    public static final void A01(AnonymousClass7UL r7, int i, int i2) {
        AnonymousClass9H3 r3 = r7.A08;
        r3.A02("thread_frame_displayed", true);
        AnonymousClass9HS r5 = r7.A07;
        AnonymousClass9HU r2 = r5.A08;
        r2.A01.A0G("render_pass_count", i2);
        r2.A01(i);
        IGFOAMessagingThreadViewNavigationLogger logger = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE.getLogger(r7.A05);
        if (logger != null) {
            logger.onLogThreadRenderingEnd(0qQ.A0K(r7.A0A, "via_push_notification"));
        }
        r5.A0M();
        String str = r7.A0A;
        if (0qQ.A0K(str, "inbox")) {
            r7.A04.postDelayed(new C377899Nr(r7), 2000);
        }
        if (r7.A03 || 0qQ.A0K(str, "via_push_notification")) {
            18g r6 = r3.A08;
            C64331Jv r1 = r6.A05;
            if (r1 != null) {
                r1.A07 = Integer.valueOf(i);
            }
            r6.A0M(AnonymousClass9H3.A00(r3), r3, "DIRECT_THREAD_MESSAGES_RENDER_END");
            int i3 = AnonymousClass9H3.A0A;
            AnonymousClass9H3.A0A = i3 + 1;
            C64331Jv r12 = r6.A05;
            if (r12 != null) {
                r12.A05 = Integer.valueOf(i3);
            }
            r3.A01(18q.A03);
            if (0qQ.A0K(str, "via_push_notification")) {
                r7.A04.postDelayed(new C40876Akk(r7), 2000);
            }
        } else {
            r3.A01(AnonymousClass9H3.A0C);
        }
        r7.A02 = true;
    }

    public final void A02() {
        AnonymousClass9H3 r3 = this.A08;
        r3.A08.A0M(AnonymousClass9H3.A00(r3), r3, "DIRECT_THREAD_MESSAGES_RENDER_START");
        this.A07.A08.A00();
    }

    public final void A03(boolean z) {
        AnonymousClass9HS r2 = this.A07;
        boolean z2 = z;
        Boolean bool = r2.A01;
        if (bool != null) {
            z2 = bool.booleanValue();
        }
        r2.A01 = Boolean.valueOf(z2);
        this.A08.A02("message_matching_success", z);
        IGFOAMessagingThreadViewNavigationLogger logger = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE.getLogger(this.A05);
        if (logger != null) {
            logger.annotateMessageMatchingSuccess(z);
        }
    }

    public final void A04(boolean z, int i) {
        String str;
        AnonymousClass7UH r5 = this.A0H;
        if (182.A06(0Tu.A05, r5.A02, 36314459588856376L)) {
            for (String str2 : r5.A04) {
                Map map = r5.A03;
                int i2 = map.get(str2);
                if (i2 == null) {
                    i2 = 0;
                }
                int intValue = ((Number) i2).intValue() + (z ? 1 : 0);
                if (intValue <= 10) {
                    map.put(str2, Integer.valueOf(intValue));
                    02m r4 = r5.A01;
                    int i3 = r5.A00;
                    int hashCode = str2.hashCode();
                    String A0O = 002.A0O("generate_message_list_view_models", intValue);
                    if (z) {
                        str = "_start";
                    } else {
                        str = "_end";
                    }
                    r4.markerPoint(i3, hashCode, 002.A0R(A0O, str));
                    r4.markerAnnotate(i3, hashCode, "num_view_models_to_generate", i);
                }
            }
        }
        IGFOAMessagingLocalSendSpeedLoggingController A002 = C331107Po.A00(this.A05);
        if (z) {
            A002.onLogGenerateMessageListViewModelsStart(i);
        } else {
            A002.onLogGenerateMessageListViewModelsEnd(i);
        }
    }

    public final boolean A05() {
        IGFOAMessagingThreadViewNavigationLogger logger = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE.getLogger(this.A05);
        if (logger != null) {
            boolean z = false;
            if (this.A0B == null) {
                z = true;
            }
            logger.annotateMissingMessageId(z);
        }
        if (this.A0B == null || this.A03) {
            return false;
        }
        return true;
    }

    public final boolean A06(String str) {
        String str2 = this.A0B;
        if (str2 == null || this.A03 || !str2.equals(str)) {
            return false;
        }
        this.A03 = true;
        return true;
    }
}
