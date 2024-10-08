package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.SrA  reason: case insensitive filesystem */
public final class C12307SrA implements C13839TiE {
    public final long A00;
    public final 1QP A01;
    public final String A02;

    public final void EwX(C11354SOn sOn, List list) {
        1QP r4 = this.A01;
        long j = this.A00;
        String str = this.A02;
        r4.flowStart(j, str, false);
        r4.flowMarkPoint(j, "flow_start");
        r4.flowAnnotate(j, "upload_id", str);
        r4.flowAnnotate(j, "video_segments_size", list.size());
        r4.flowAnnotate(j, "target_width", sOn.A0C);
        r4.flowAnnotate(j, "target_height", sOn.A0A);
        r4.flowAnnotate(j, AnonymousClass000.A00(375), sOn.A01());
        r4.flowAnnotate(j, "target_iframe_interval", sOn.A03);
    }

    private final void A00(C11354SOn sOn) {
        String str;
        SJA sja = sOn.A0G;
        if (sja != null) {
            1QP r4 = this.A01;
            long j = this.A00;
            C8907RFa rFa = sja.A04;
            if (rFa == null || (str = rFa.toString()) == null) {
                str = "empty";
            }
            r4.flowAnnotate(j, "target_codec", str);
            r4.flowAnnotate(j, "target_profile", sja.A03);
            r4.flowAnnotate(j, "target_level", sja.A02);
        }
    }

    public final void AGA(C11354SOn sOn, Throwable th) {
        1QP r4 = this.A01;
        long j = this.A00;
        r4.flowMarkPoint(j, "flow_cancel");
        A00(sOn);
        String message = th.getMessage();
        if (message == null) {
            message = "empty";
        }
        r4.flowAnnotate(j, "flow_cancel_reason", message);
        r4.flowEndCancel(j, Pxh.A0k(r4, th, j));
    }

    public final void DtK() {
        this.A01.flowMarkPoint(this.A00, "transcode_cancel");
    }

    public final void DtO() {
        this.A01.flowMarkPoint(this.A00, "transcode_start");
    }

    public final void DtQ(List list) {
        1QP r3 = this.A01;
        long j = this.A00;
        r3.flowMarkPoint(j, "transcode_success");
        r3.flowAnnotate(j, "result_list_size", list.size());
        SRW srw = (SRW) 00k.A0J(list);
        if (srw != null) {
            String str = srw.A0L.A0I;
            if (str == null) {
                str = "empty";
            }
            r3.flowAnnotate(j, "encoder_name", str);
            r3.flowAnnotate(j, "input_width", srw.A07);
            r3.flowAnnotate(j, "input_height", srw.A06);
            r3.flowAnnotate(j, "input_bitrate", srw.A0H);
            SRW.A01(r3, srw, srw.A05, j);
            r3.flowAnnotate(j, "target_frame_rate", srw.A0A);
            r3.flowAnnotate(j, "frame_drop_percent", srw.A03);
        }
    }

    public final void Eyx(C11354SOn sOn) {
        1QP r3 = this.A01;
        long j = this.A00;
        r3.flowMarkPoint(j, "flow_success");
        A00(sOn);
        r3.flowEndSuccess(j);
    }

    public C12307SrA(UserSession userSession, String str) {
        this.A02 = str;
        1QP A002 = AnonymousClass1QO.A00(userSession);
        this.A01 = A002;
        this.A00 = A002.generateFlowId(356984935, JTQ.A0Z().hashCode());
    }

    public final void AUa(C11354SOn sOn, Throwable th) {
        0wb.A07("videolite_flow_fail", th);
        1QP r4 = this.A01;
        long j = this.A00;
        r4.flowMarkPoint(j, "flow_fail");
        A00(sOn);
        String message = th.getMessage();
        if (message == null) {
            message = "empty";
        }
        r4.flowAnnotate(j, "flow_fail_reason", message);
        r4.flowEndFail(j, DialogModule.KEY_MESSAGE, Pxh.A0k(r4, th, j));
    }

    public final void DtL(AnonymousClass4ZS r6) {
        0wb.A08("videolite_transcode_fail", r6);
        1QP r4 = this.A01;
        long j = this.A00;
        r4.flowAnnotate(j, "transcode_fail_reason", Pxg.A0m(r4, "transcode_fail", r6, j));
        r4.flowAnnotate(j, "stacktrace", 2Og.A00(r6));
    }
}
