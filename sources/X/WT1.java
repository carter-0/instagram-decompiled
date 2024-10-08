package X;

import android.content.Context;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;

public final class WT1 implements AnonymousClass0lh {
    public long A00;
    public 1QP A01;
    public String A02 = "";
    public String A03;
    public boolean A04;
    public final String A05;
    public final Context A06;
    public final C16601Uxv A07;
    public final VM7 A08;

    public static void A00(C16612Uy8 uy8, WT1 wt1) {
        wt1.A02(uy8, "", (String) null);
    }

    public final void A01() {
        long j = this.A00;
        if (j != 0) {
            this.A01.flowEndCancel(j, "new_flow_start");
            this.A00 = 0;
            this.A04 = false;
            this.A02 = "";
            this.A03 = null;
        }
        1QP r5 = this.A01;
        C16601Uxv uxv = this.A07;
        long generateNewFlowId = r5.generateNewFlowId(uxv.A00);
        this.A00 = generateNewFlowId;
        r5.flowStart(generateNewFlowId, new UserFlowConfig(uxv.A01, false));
    }

    public final void A03(String str, String str2) {
        long j = this.A00;
        if (j != 0) {
            this.A01.flowAnnotate(j, str, str2);
        }
    }

    public final void onSessionWillEnd() {
        long j = this.A00;
        if (j != 0) {
            this.A01.flowEndCancel(j, "session_end");
            this.A00 = 0;
            this.A04 = false;
            this.A02 = "";
            this.A03 = null;
        }
    }

    public WT1(Context context, C16601Uxv uxv, VM7 vm7, UserSession userSession, String str) {
        this.A05 = str;
        this.A06 = context;
        this.A07 = uxv;
        this.A08 = vm7;
        this.A01 = AnonymousClass1QO.A00(userSession);
    }

    public final void A02(C16612Uy8 uy8, String str, String str2) {
        String str3;
        boolean A1Z = AnonymousClass7TG.A1Z(uy8, str);
        if (!(str2 == null || str2.length() == 0)) {
            switch (uy8.A01.intValue()) {
                case 1:
                    str3 = "MEDIUM";
                    break;
                case 2:
                    str3 = "HIGH";
                    break;
                default:
                    str3 = "LOW";
                    break;
            }
            if (str.length() > 0) {
                str3 = C66580MXl.A10(str, str3);
            }
            0wb.A03(002.A0j(this.A05, str3, uy8.A02, ' ', ' '), str2);
        }
        int i = uy8.A00;
        if (i > 0) {
            VM7 vm7 = this.A08;
            String A0d = AnonymousClass7TF.A0d(this.A06.getResources(), i);
            C310336ap A0X = DbV.A0X();
            A0X.A0D = A0d;
            vm7.A00.A00(new AnonymousClass3GP(A0X.A00()));
        }
        String str4 = uy8.A02;
        if (str2 != null) {
            long j = this.A00;
            if (j != 0) {
                this.A01.flowMarkError(j, str4, str2);
                this.A04 = A1Z;
                this.A02 = str4;
                this.A03 = str2;
                return;
            }
            return;
        }
        long j2 = this.A00;
        if (j2 != 0) {
            this.A01.flowMarkPoint(j2, str4);
        }
    }
}
