package X;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class NdO extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;

    public NdO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DsC(AnonymousClass5Gv r5) {
        switch (this.A00) {
            case 2:
                JTS.A1S(AnonymousClass7TE.A0q(((C70485O8k) this.A01).A00), "camera_reply_tooltip_impression_count", 0);
                return;
            case 4:
                AnonymousClass32V r1 = (AnonymousClass32V) this.A01;
                AnonymousClass6Z3 r0 = r1.A01;
                if (r0 != null) {
                    r0.DsB();
                }
                r1.A02 = false;
                return;
            case 5:
                OGO ogo = ((C73331Paq) this.A01).A01;
                C70480O8f o8f = ogo.A00;
                if (o8f != null) {
                    o8f.A00.A0X("resume");
                }
                ogo.A01 = null;
                ogo.A02 = null;
                return;
            case 6:
                C73414PcB pcB = (C73414PcB) this.A01;
                C315006jC r3 = pcB.A07;
                r3.A00 = null;
                View view = pcB.A01;
                Runnable runnable = r3.A02;
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                }
                r3.A02 = null;
                AnonymousClass6Z3 r02 = r3.A01;
                if (r02 != null) {
                    r02.DsB();
                    return;
                }
                return;
            default:
                super.DsC(r5);
                return;
        }
    }

    public final void DsH(AnonymousClass5Gv r10) {
        0xY r2;
        0xa r22;
        String str;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r10, 0);
                ODR odr = (ODR) this.A01;
                0xY A0N = AnonymousClass7TF.A0N(odr.A01);
                A0N.E5T("should_show_tool_tip_new_moderators_in_broadcast_channel", false);
                A0N.apply();
                Map map = odr.A02;
                if (map.containsValue(r10)) {
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    Iterator A0u = AnonymousClass7TF.A0u(map);
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        if (0qQ.A0K(A1J.getValue(), r10)) {
                            Dbb.A1V(A1J, A1H);
                        }
                    }
                    map.remove(00k.A09(A1H.keySet()));
                    return;
                }
                return;
            case 1:
                AnonymousClass4kA A002 = AnonymousClass4k9.A00(C66583MXo.A0M(this.A01));
                long A0I = AnonymousClass7TG.A0I();
                0xa r8 = A002.A00;
                0xY AR4 = r8.AR4();
                AR4.E5c("inbox_pill_impression_count", DbW.A06(r8, "inbox_pill_impression_count") + 1);
                AR4.apply();
                r2 = r8.AR4();
                r2.E5c("inbox_pill_last_impression_timestamp", A0I);
                break;
            case 3:
                r2 = ((C71153OeR) this.A01).A0s.A00.AR4();
                r2.E5T("has_seen_pending_inbox_filter_tooltip", true);
                break;
            case 5:
                r22 = AnonymousClass7TE.A0q(((C73331Paq) this.A01).A01.A04);
                str = "direct_poll_tooltip_impression_count";
                break;
            case 6:
                C73414PcB pcB = (C73414PcB) this.A01;
                C315036jF r23 = pcB.A06;
                C315006jC r0 = pcB.A07;
                r23.DsI(pcB.A00, r0.A03, r0.A04, pcB.A03, pcB.A04);
                return;
            case 7:
                OK5 ok5 = (OK5) this.A01;
                if (ok5 != null) {
                    C69109Neo neo = ok5.A00;
                    JTS.A1S(neo.A0N.A01, "video_call_cowatch_navigate_to_profile_tooltip_display_count", 0);
                    neo.A05 = true;
                    return;
                }
                return;
            case 8:
                r22 = ((C73396Pbt) this.A01).A03.A01;
                str = "zero_rating_video_setting_banner_tooltip";
                break;
            default:
                super.DsH(r10);
                return;
        }
        r2 = r22.AR4();
        r2.E5Z(str, r22.getInt(str, 0) + 1);
        r2.apply();
    }
}
