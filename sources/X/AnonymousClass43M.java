package X;

import android.content.Context;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.43M  reason: invalid class name */
public abstract class AnonymousClass43M {
    public static Boolean A01;
    public static boolean A02;
    public static final C261894Bi A03 = new C261894Bi();
    public final 02m A00;

    public AnonymousClass43M(02m r4) {
        this.A00 = r4;
        if (!A02) {
            14i.A03(15Y.A03, A03);
            A02 = true;
        }
    }

    public final AnonymousClass7BV A01(UserSession userSession, Boolean bool, Boolean bool2, Long l, int i, boolean z, boolean z2, boolean z3) {
        String str;
        int A06 = 2SP.A01.A06(1, Integer.MAX_VALUE);
        02m r0 = this.A00;
        r0.markerStart(i, A06, z3);
        MarkerEditor withMarker = r0.withMarker(i, A06);
        Context context = C60960kU.A00;
        0qQ.A07(context);
        withMarker.annotate("network_connected_when_attempt", C61970qY.A0F(context));
        withMarker.annotate("is_tlc_user", z);
        withMarker.annotate("is_ttlc_user", z2);
        if (bool != null) {
            withMarker.annotate("is_dm", bool.booleanValue());
        }
        if (bool2 != null) {
            withMarker.annotate("is_vm", bool2.booleanValue());
        }
        if (l != null) {
            withMarker.annotate("seq_id", l.longValue());
        }
        if (AnonymousClass45R.A00(userSession)) {
            str = "foreground";
        } else {
            str = AppStateModule.APP_STATE_BACKGROUND;
        }
        withMarker.annotate("account_session_state_at_start", str);
        Boolean bool3 = A01;
        if (bool3 != null) {
            withMarker.annotate("is_app_backgrounded", bool3.booleanValue());
        }
        withMarker.markerEditingCompleted();
        return new AnonymousClass7BV(i, A06);
    }

    public final void A07(AnonymousClass7BV r4, String str) {
        0qQ.A0B(str, 1);
        if (r4 != null) {
            this.A00.withMarker(r4.A01, r4.A00).pointEditor(str).markerEditingCompleted();
        }
    }

    public final void A09(AnonymousClass7BV r4, String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        if (r4 != null) {
            MarkerEditor withMarker = this.A00.withMarker(r4.A01, r4.A00);
            withMarker.annotate(str, str2);
            withMarker.markerEditingCompleted();
        }
    }

    public final void A0A(AnonymousClass7BV r7, String str, String str2) {
        0qQ.A0B(str2, 2);
        if (r7 != null) {
            02m r5 = this.A00;
            int i = r7.A01;
            int i2 = r7.A00;
            MarkerEditor withMarker = r5.withMarker(i, i2);
            withMarker.annotate(TraceFieldType.ErrorDomain, str);
            withMarker.annotate("error_message", str2);
            Context context = C60960kU.A00;
            0qQ.A07(context);
            withMarker.annotate("network_connected_when_failure", C61970qY.A0F(context));
            withMarker.markerEditingCompleted();
            r5.markerEnd(i, i2, 3);
        }
    }

    public final void A02(C268654dm r9, AnonymousClass7BV r10) {
        String str;
        String str2;
        String str3;
        String str4;
        if (r10 != null) {
            Throwable A012 = r9.A01();
            AnonymousClass1XT r1 = (AnonymousClass1XT) r9.A00();
            String str5 = null;
            if (A012 != null) {
                if (A012 instanceof C69248NiA) {
                    str = String.valueOf(((C69248NiA) A012).A00);
                    str3 = "http";
                } else {
                    str3 = DexOptimization.OPT_KEY_CLIENT;
                    str = null;
                }
                str4 = A012.toString();
                str2 = 2Og.A00(A012);
            } else if (r1 != null) {
                String errorCode = r1.getErrorCode();
                str = String.valueOf(r1.getStatusCode());
                str3 = r1.getErrorSource();
                str4 = r1.getErrorMessage();
                str2 = null;
                str5 = errorCode;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            MarkerEditor withMarker = this.A00.withMarker(r10.A01, r10.A00);
            withMarker.annotate(TraceFieldType.ErrorCode, str5);
            withMarker.annotate("error_response_code", str);
            withMarker.annotate("error_message", str4);
            withMarker.annotate(TraceFieldType.ErrorDomain, str3);
            withMarker.annotate(TraceFieldType.Error, str4);
            withMarker.annotate(Pxd.A00(212), str2);
            withMarker.markerEditingCompleted();
        }
    }

    public final void A03(AnonymousClass7BV r5) {
        if (r5 != null) {
            this.A00.markerPoint(r5.A01, r5.A00, "app_cache_update_end");
        }
    }

    public final void A04(AnonymousClass7BV r5) {
        if (r5 != null) {
            this.A00.markerPoint(r5.A01, r5.A00, "app_cache_update_start");
        }
    }

    public final void A05(AnonymousClass7BV r5) {
        if (r5 != null) {
            this.A00.markerPoint(r5.A01, r5.A00, "network_fetch_start");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r8 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass7BV r7, java.lang.Exception r8, java.lang.String r9) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0037
            int r5 = r7.A01
            int r4 = r7.A00
            if (r9 == 0) goto L_0x000d
            X.02m r0 = r6.A00
            r0.markerPoint(r5, r4, r9)
        L_0x000d:
            java.lang.String r3 = "unknown_exception_for_mailbox_api_invocation"
            if (r8 == 0) goto L_0x0017
            java.lang.String r2 = r8.getMessage()
            if (r2 != 0) goto L_0x001a
        L_0x0017:
            r2 = r3
            if (r8 == 0) goto L_0x0027
        L_0x001a:
            java.lang.Class r0 = r8.getClass()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r0.getSimpleName()
            if (r0 == 0) goto L_0x0027
            r3 = r0
        L_0x0027:
            X.02m r1 = r6.A00
            java.lang.String r0 = "error_domain"
            r1.markerAnnotate(r5, r4, r0, r3)
            java.lang.String r0 = "error_message"
            r1.markerAnnotate(r5, r4, r0, r2)
            r0 = 3
            r1.markerEnd(r5, r4, r0)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass43M.A06(X.7BV, java.lang.Exception, java.lang.String):void");
    }

    public final void A08(AnonymousClass7BV r4, String str, int i) {
        if (r4 != null) {
            MarkerEditor withMarker = this.A00.withMarker(r4.A01, r4.A00);
            withMarker.annotate(str, i);
            withMarker.markerEditingCompleted();
        }
    }

    public final void A0B(AnonymousClass7BV r4, String str, boolean z) {
        if (r4 != null) {
            MarkerEditor withMarker = this.A00.withMarker(r4.A01, r4.A00);
            withMarker.annotate(str, z);
            withMarker.markerEditingCompleted();
        }
    }

    public void A0C(AnonymousClass7BV r5) {
        if (r5 != null) {
            this.A00.markerEnd(r5.A01, r5.A00, 2);
        }
    }

    public void A0D(AnonymousClass7BV r7, Boolean bool, boolean z) {
        if (r7 != null) {
            02m r5 = this.A00;
            int i = r7.A01;
            int i2 = r7.A00;
            MarkerEditor withMarker = r5.withMarker(i, i2);
            withMarker.annotate("is_temp_failure", z);
            Context context = C60960kU.A00;
            0qQ.A07(context);
            withMarker.annotate("network_connected_when_failure", C61970qY.A0F(context));
            if (bool != null) {
                withMarker.annotate("cancel_exp_backoff", bool.booleanValue());
            }
            withMarker.markerEditingCompleted();
            r5.markerEnd(i, i2, 3);
        }
    }
}
