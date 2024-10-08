package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;

public final class LXU implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public LXU(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = z;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        String str;
        String A002;
        String A003;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A05(-1915966966);
                C65225LpV lpV = (C65225LpV) this.A02;
                27p.A01(lpV.A05).A1B(lpV.A01, lpV.A02);
                boolean z = this.A03;
                lpV.A06.DHk(lpV.A08, (ArrayList) this.A01, z);
                i2 = -971657656;
                break;
            case 1:
                i = AnonymousClass0fD.A05(-1589876204);
                boolean z2 = this.A03;
                27r A012 = 27p.A01((UserSession) this.A02);
                if (z2) {
                    str = "RESUME_DRAFT_EXIT_DIALOG_CANCEL";
                } else {
                    str = "EXIT_DIALOG_CANCEL";
                }
                A012.A1l(str);
                View.OnClickListener onClickListener = (View.OnClickListener) this.A01;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                i2 = 1999142777;
                break;
            case 2:
                i = DbX.A03(view, -1403223801);
                boolean z3 = this.A03;
                27r A013 = 27p.A01((UserSession) this.A02);
                if (z3) {
                    A002 = "RESUME_DRAFT_EXIT_DIALOG_DISCARD_EDITS";
                } else {
                    A002 = AnonymousClass000.A00(443);
                }
                A013.A1l(A002);
                ((View.OnClickListener) this.A01).onClick(view);
                i2 = 2052666814;
                break;
            case 3:
                i = DbX.A03(view, 516654137);
                boolean z4 = this.A03;
                27r A014 = 27p.A01((UserSession) this.A02);
                if (z4) {
                    A003 = "RESUME_DRAFT_EXIT_DIALOG_SAVE_DRAFT";
                } else {
                    A003 = AnonymousClass000.A00(929);
                }
                A014.A1l(A003);
                View.OnClickListener onClickListener2 = (View.OnClickListener) this.A01;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
                i2 = -1073067288;
                break;
            case 4:
                i = AnonymousClass0fD.A05(1428890960);
                ((C65275LqU) this.A02).CI7(((LongPressActionData) this.A01).A03, (String) null, this.A03);
                i2 = 151270417;
                break;
            case 5:
                i = AnonymousClass0fD.A05(526312481);
                C64143LQf lQf = (C64143LQf) this.A02;
                27p.A01(lQf.A03).A1X(AnonymousClass80P.ADD_UPCOMING_EVENT);
                C64143LQf.A01(lQf, (UpcomingEvent) this.A01, this.A03);
                i2 = 1177271860;
                break;
            default:
                C64986LlP llP = (C64986LlP) this.A01;
                boolean z5 = this.A03;
                C64025LJm.A01(llP.A09, llP.A0B, llP.A0C, (ArrayList) this.A02, z5);
                return;
        }
        AnonymousClass0fD.A0C(i2, i);
    }
}
