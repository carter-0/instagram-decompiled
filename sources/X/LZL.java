package X;

import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.List;

public final class LZL implements PopupWindow.OnDismissListener {
    public final int A00;
    public final Object A01;

    public LZL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDismiss() {
        long j;
        Long A10;
        switch (this.A00) {
            case 0:
                ((C18018Vju) this.A01).A01();
                return;
            case 1:
                LON lon = (LON) this.A01;
                if (lon.A05) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    if (!lon.A0C) {
                        A1C.add(C62648KkA.USER_TAG);
                    }
                    A1C.add(C62648KkA.COLLAB);
                    27r A012 = 27p.A01(lon.A0A);
                    List A0a = 00k.A0a(A1C);
                    1Ln A0N = JTO.A0N(A012);
                    C279294yP A0J = A012.A0J();
                    AnonymousClass283 r3 = A012.A04;
                    String str = r3.A0L;
                    C59725JVj jVj = r3.A0C;
                    if (!(!DbT.A1Y(A0N) || A0J == null || str == null || jVj == null)) {
                        A0N.A0a(A0J);
                        A0N.A0r("MENTION_PROMPT_DISMISS");
                        JTQ.A1B(A0N, r3);
                        A0N.A0d(jVj);
                        JTO.A1U(A0N, str);
                        JTQ.A1A(A0N);
                        A0N.A0c(r3.A0A);
                        AnonymousClass7TF.A18(A0N);
                        A0N.A0S("mention_prompt_options", A0a);
                        A0N.Cgf();
                    }
                }
                lon.A05 = true;
                return;
            default:
                C63886LAp lAp = (C63886LAp) this.A01;
                boolean z = ((C57451Iav) lAp.A06.getValue()).A02;
                C60275JiW jiW = (C60275JiW) lAp.A07.getValue();
                if (z) {
                    AnonymousClass7TE.A1Z(new MHK(jiW, (AnonymousClass4D7) null, 19), C318116oQ.A00(jiW));
                    return;
                }
                LAV lav = jiW.A03;
                0Aj A0e = AnonymousClass7TE.A0e(lav.A03, "live_with_request_to_join_waterfall");
                JTQ.A14(A0e, lav.A04.A06);
                String str2 = lav.A01;
                if (str2 == null) {
                    str2 = "";
                }
                C51965G9l.A1I(A0e, str2);
                DbS.A1H(A0e, DbY.A0j(AnonymousClass000.A00(2420)));
                C51969G9p.A1A(A0e, lav.A02);
                String str3 = lav.A00;
                if (str3 == null || (A10 = AnonymousClass7TE.A10(str3)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                JTQ.A10(A0e, j);
                JTQ.A11(A0e, lav.A05);
                JTQ.A16(A0e, 00k.A0U(lav.A06));
                return;
        }
    }
}
