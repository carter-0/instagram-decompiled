package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;
import java.util.LinkedHashMap;

public final class LXV implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public LXV(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [X.1qK, java.lang.Object, X.LfC] */
    public final void onClick(View view) {
        int A05;
        int i;
        Long l;
        long j;
        Long A10;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(1388604971);
                String str = this.A03;
                C61414K6l k6l = ((C63598Kzl) this.A01).A00;
                JTU.A0D(k6l.A09).A0F(C16678UzE.MEDIA_PICKER, "media_cell");
                ((C60252Ji9) k6l.A0B.getValue()).A01(str);
                i = 848093288;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(-2017879779);
                String str2 = this.A03;
                C61415K6m k6m = ((C63599Kzm) this.A01).A00;
                JTU.A0D(k6m.A0C).A0F(C16678UzE.MEDIA_PICKER, "media_cell");
                ((C60252Ji9) k6m.A0F.getValue()).A01(str2);
                i = -1484516576;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(-32297963);
                ((C66427MRh) this.A01).DIF((ImageUrl) this.A02, this.A03);
                i = 75719155;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(-299530313);
                String str3 = this.A03;
                if (str3 != null) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.A01;
                    IgAutoCompleteTextView igAutoCompleteTextView = ((K6Z) this.A02).A00;
                    if (igAutoCompleteTextView == null) {
                        0qQ.A0F("textView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    linkedHashMap.put(str3, AnonymousClass7TF.A0f(igAutoCompleteTextView));
                }
                AnonymousClass0eM r4 = ((K6Z) this.A02).A03;
                1Ng A0R = DbX.A0R(r4);
                ? obj = new Object();
                obj.A00 = (LinkedHashMap) this.A01;
                A0R.A05(obj);
                C59888JbD.A02(r4);
                i = 355863681;
                break;
            case 4:
                A05 = AnonymousClass0fD.A05(-1714869134);
                C61942KSr kSr = (C61942KSr) this.A02;
                kSr.A0I = this.A03;
                ((0r1) this.A01).A00 = false;
                kSr.A0K = true;
                C61942KSr.A0A(kSr);
                i = -799193732;
                break;
            case 5:
                A05 = AnonymousClass0fD.A05(-1326435724);
                ((C60402Jkv) this.A02).A03.invoke(this.A03, this.A01);
                i = -540200020;
                break;
            case 6:
                A05 = AnonymousClass0fD.A05(1235356051);
                C60677JpO jpO = (C60677JpO) this.A02;
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                FragmentActivity fragmentActivity = jpO.A09;
                UserSession userSession = jpO.A0A;
                C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
                LEU A002 = C49195Er0.A00().A00();
                String str4 = this.A03;
                C60968JuQ juQ = (C60968JuQ) this.A01;
                String str5 = juQ.A05;
                String valueOf = String.valueOf(juQ.A00);
                Integer valueOf2 = Integer.valueOf(juQ.A01);
                Integer num = AnonymousClass05K.A0C;
                String str6 = juQ.A07;
                Integer num2 = juQ.A02;
                if (num2 != null) {
                    l = C51969G9p.A0r(num2);
                } else {
                    l = null;
                }
                A0M.A0B((Bundle) null, A002.A01(valueOf2, num, l, str4, str5, valueOf, str4, str6, false, true));
                A0M.A04();
                FCG.A00(userSession).A00(EZV.BADGES_ESTIMATED_EARNINGS, "User Pay Earnings", (String) null, juQ.A06);
                i = -1868082049;
                break;
            default:
                A05 = AnonymousClass0fD.A05(1832108708);
                IgLiveOptionsDialogViewModel A003 = LRB.A00(this.A02);
                User user = (User) this.A01;
                String str7 = this.A03;
                0qQ.A0B(str7, 1);
                C61013JvD A0Q = JTQ.A0Q(A003.A0C);
                if (A0Q != null) {
                    AnonymousClass7TE.A1Z(new MHK((Object) user, (Object) A0Q, (Object) A003, (AnonymousClass4D7) null, 14), C318116oQ.A00(A003));
                    LF6 lf6 = A003.A08;
                    String id = user.getId();
                    String str8 = A0Q.A08;
                    String A004 = C61013JvD.A00(A0Q);
                    String str9 = A0Q.A09;
                    0Aj A0e = AnonymousClass7TE.A0e(lf6.A01, "ig_live_moderator_revoke");
                    JTQ.A14(A0e, A004);
                    DbS.A1H(A0e, "confirm");
                    if (str8 == null || (A10 = AnonymousClass7TE.A10(str8)) == null) {
                        j = 0;
                    } else {
                        j = A10.longValue();
                    }
                    JTQ.A10(A0e, j);
                    if (str9 == null) {
                        str9 = "0";
                    }
                    C51965G9l.A1I(A0e, str9);
                    C51969G9p.A1A(A0e, lf6.A00);
                    A0e.A9F("target_user_id", Long.valueOf(JTR.A0M(id)));
                    JTP.A1G(A0e);
                    A0e.AAJ("method", str7);
                    A0e.Cgf();
                }
                i = 1706452876;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
