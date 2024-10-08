package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

public final class PA8 implements C66819MdB {
    public boolean A00;
    public final long A01;
    public final UserFlowLogger A02;
    public final AnonymousClass0iw A03;
    public final Integer A04;
    public final Integer A05;
    public final boolean A06;

    public final void Ddt() {
        this.A00 = true;
        this.A02.flowMarkPoint(this.A01, "MEDIA_RENDERED");
    }

    public /* synthetic */ PA8(AnonymousClass0iw r3, Integer num, Integer num2, boolean z) {
        UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(02m.A0p);
        this.A05 = num;
        this.A06 = z;
        this.A03 = r3;
        this.A02 = userFlowLoggerImpl;
        this.A04 = num2;
        this.A01 = userFlowLoggerImpl.generateNewFlowId(584653653);
    }

    public final void DQn(C74244PrY prY) {
        C66793Mcf mcf;
        boolean equals = prY.equals(PA7.A00);
        String str = null;
        if ((prY instanceof C66793Mcf) && (mcf = (C66793Mcf) prY) != null) {
            str = mcf.A00;
        }
        this.A02.markPointWithEditor(this.A01, "MEDIA_SET").addPointData("is_local", equals).addPointData(C273654mx.A00(590), str).markerEditingCompleted();
    }

    public final void Dds() {
        boolean z = this.A00;
        UserFlowLogger userFlowLogger = this.A02;
        long j = this.A01;
        if (z) {
            userFlowLogger.flowEndSuccess(j);
        } else {
            userFlowLogger.flowEndCancel(j, CancelReason.USER_CANCELLED);
        }
    }

    public final void Ddu() {
        UserFlowLogger userFlowLogger = this.A02;
        long j = this.A01;
        userFlowLogger.flowMarkPoint(j, "MEDIA_LOAD_FAILURE");
        userFlowLogger.flowEndFail(j, "MEDIA_LOAD_FAILURE", "");
    }

    public final void Ddv(C254783t2 r6) {
        String str;
        String str2;
        UserFlowConfig build = new UserFlowConfig.UserFlowConfigBuilder(this.A03.getModuleName(), false).build();
        UserFlowLogger userFlowLogger = this.A02;
        long j = this.A01;
        userFlowLogger.flowStart(j, build);
        switch (this.A05.intValue()) {
            case 0:
                str = "permanent_image";
                break;
            case 1:
                str = "permanent_video";
                break;
            case 2:
                str = "ephemeral_image";
                break;
            default:
                str = "ephemeral_video";
                break;
        }
        userFlowLogger.flowAnnotateWithCrucialData(j, "media_type", str);
        userFlowLogger.flowAnnotateWithCrucialData(j, TraceFieldType.TransportType, DbT.A11(Boolean.valueOf(this.A06), O4O.A00));
        switch (this.A04.intValue()) {
            case 0:
                str2 = "CHAT_THREAD";
                break;
            case 1:
                str2 = "FULL_SCREEN";
                break;
            default:
                str2 = "THREAD_DETAILS";
                break;
        }
        userFlowLogger.flowAnnotateWithCrucialData(j, AnonymousClass000.A00(813), str2);
        if (r6 != null) {
            String A022 = AnonymousClass4KK.A02(r6);
            if (A022 != null) {
                userFlowLogger.flowAnnotateWithCrucialData(j, "open_thread_id", A022);
            }
            Long A012 = AnonymousClass4KK.A01(r6);
            if (A012 != null) {
                userFlowLogger.flowAnnotateWithCrucialData(j, "occamadillo_thread_id", C66581MXm.A0x(A012));
            }
        }
    }

    public final void Dyt() {
        this.A02.flowMarkPoint(this.A01, "VIEW_DISAPPEAR");
    }

    public final void Dyu() {
        this.A02.flowMarkPoint(this.A01, "VIEW_DISPLAYED_ON_VIEWPORT");
    }
}
