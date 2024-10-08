package X;

import android.app.Activity;
import android.content.ClipData;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class MAD implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ClipData A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C279284yO A04;
    public final /* synthetic */ C362048hG A05;
    public final /* synthetic */ AnonymousClass8WX A06;
    public final /* synthetic */ List A07;

    public /* synthetic */ MAD(Activity activity, ClipData clipData, ViewGroup viewGroup, UserSession userSession, C279284yO r5, C362048hG r6, AnonymousClass8WX r7, List list) {
        this.A07 = list;
        this.A01 = clipData;
        this.A03 = userSession;
        this.A02 = viewGroup;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A00 = activity;
    }

    public final void run() {
        List list = this.A07;
        ClipData clipData = this.A01;
        UserSession userSession = this.A03;
        ViewGroup viewGroup = this.A02;
        C362048hG r9 = this.A05;
        C279284yO r6 = this.A04;
        AnonymousClass8WX r4 = this.A06;
        Activity activity = this.A00;
        if (list.isEmpty() || list.size() != clipData.getItemCount()) {
            C59689JTv.A0F(activity, AnonymousClass000.A00(1909), 2131975837);
            return;
        }
        r9.getClass();
        0Tu A0J = DbS.A0J(userSession, 0);
        if (182.A06(A0J, userSession, 36319415981120908L) && (r6 instanceof AnonymousClass80O)) {
            r4.A00().A0L(list, true);
        } else if (182.A06(A0J, userSession, 36319415981251982L) && (r6 instanceof AnonymousClass9QA)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Medium medium = (Medium) list.get(i);
                if (medium != null) {
                    A1C.add(JTR.A0f(medium));
                }
            }
            r4.A00().A0K(r9, A1C, 0, true, false, false);
        } else if (182.A06(A0J, userSession, 36319415981186445L) && (r6 instanceof C363138jC)) {
            if (list.size() == 1) {
                Medium medium2 = (Medium) list.get(0);
                if (medium2.A05()) {
                    r4.A00().A0E(medium2, r9, true);
                } else if (medium2.CeS()) {
                    r4.A00().A0F(medium2, r9, true);
                }
            } else {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Medium medium3 = (Medium) list.get(i2);
                    if (medium3 != null) {
                        A1C2.add(JTR.A0f(medium3));
                    }
                }
                ArrayList A1D = AnonymousClass7TE.A1D(A1C2);
                JW7 jw7 = (JW7) viewGroup.findViewById(R.id.gallery_picker_view);
                if (jw7 != null) {
                    jw7.A0X((L0A) null, A1D, true);
                }
            }
        }
    }
}
