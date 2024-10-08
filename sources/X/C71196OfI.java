package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.core.app.ComponentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OfI  reason: case insensitive filesystem */
public final class C71196OfI implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C71196OfI(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A06 = str;
        this.A01 = obj;
        this.A03 = obj5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                List list = (List) this.A03;
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C66581MXm.A1M(DbT.A0k(it), A0r);
                }
                C254763t0 A0g = C66580MXl.A0g(this.A06);
                Context context = (Context) this.A01;
                UserSession userSession = (UserSession) this.A05;
                DirectShareTarget directShareTarget = new DirectShareTarget(A0g, ((C331527Ri) this.A04).C6g(context, userSession), A0r, true);
                C72192OyC A012 = C66953Mfm.A01(((1X9) this.A02).A00(context, userSession).A06);
                if (A012 != null) {
                    C71143Odx odx = A012.A09.A0Z;
                    List A0m = DbW.A0m(directShareTarget);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it2 = A0m.iterator();
                    while (it2.hasNext()) {
                        String valueOf = String.valueOf(C66580MXl.A0k(it2).A08);
                        if (valueOf != null) {
                            A1C.add(valueOf);
                        }
                    }
                    0qQ.A0B(A1C, 0);
                    C71143Odx.A04(odx, new GN2(18, odx, A1C, true));
                }
                dialogInterface.dismiss();
                return;
            case 1:
                ((AnonymousClass3Q2) this.A03).A3k = null;
                C19200WPg wPg = (C19200WPg) this.A05;
                Activity activity = wPg.A01;
                UserSession userSession2 = wPg.A07;
                C63403KwO.A00(activity, wPg.A06, userSession2, (C270184gK) this.A02, (Reel) this.A04);
                C59689JTv.A07(activity, 2131954733);
                new 2YN(new C351728Ab(activity, (AnonymousClass0iw) this.A01, userSession2), wPg.A03).A00(StoryDraftsCreationViewModel.class).A03(this.A06);
                return;
            default:
                AnonymousClass0xx A002 = AnonymousClass07a.A00((ComponentActivity) this.A02);
                UserSession userSession3 = (UserSession) this.A05;
                AnonymousClass7TE.A1Z(new MGC(this.A03, (Object) userSession3, (AnonymousClass4D7) null, 8), A002);
                AnonymousClass0iw r7 = C46359DdX.A00;
                DcM A003 = F8V.A00(r7, userSession3);
                F10 A032 = ((AnonymousClass3FW) this.A04).A03(0);
                String str = this.A06;
                DcM.A03(A003, A032, "ig_quiet_mode_upsell_enable_flow_dialog_turn_on", str);
                DbT.A0j(userSession3).A1D(true);
                C59689JTv.A07((Context) this.A01, 2131971230);
                DcM.A03(F8V.A00(r7, userSession3), new AnonymousClass3FW(userSession3).A03(0), "ig_quiet_mode_enable_flow_toast_shown", str);
                return;
        }
    }
}
