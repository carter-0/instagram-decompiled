package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class P8E implements AnonymousClass7DS {
    public final UserSession A00;
    public final AnonymousClass7X1 A01;

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        AnonymousClass776 r1;
        ImageUrl imageUrl;
        AnonymousClass7X1 r7;
        String str;
        C300925yB r0;
        AnonymousClass776 r4;
        ImageUrl imageUrl2;
        C328687Ft r8 = (C328687Ft) obj;
        0qQ.A0B(r8, 0);
        int i = r8.A00;
        if (i == 0) {
            AnonymousClass7X1 r12 = this.A01;
            if (r12 != null) {
                r12.AGk(r8.A02.A01, 1);
                return true;
            }
        } else if (i != 1) {
            List<C68821NYf> list = r8.A04;
            if (((C68821NYf) list.get(0)).A01 != null) {
                if (182.A06(0Tu.A06, this.A00, 36316448160289150L) && (r7 = this.A01) != null) {
                    AnonymousClass7XT r72 = (AnonymousClass7XT) r7;
                    String str2 = r8.A03;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = C68821NYf.A01(list, 0).A0L.A01;
                    String str4 = C68821NYf.A01(list, 0).A0L.A00;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AnonymousClass777 r42 = C68821NYf.A00(it).A0F;
                        if (!(!(r42 instanceof AnonymousClass776) || (r4 = (AnonymousClass776) r42) == null || (imageUrl2 = r4.A00) == null)) {
                            A1C.add(imageUrl2);
                        }
                    }
                    String str5 = C68821NYf.A01(list, 0).A08.A00;
                    ArrayList A0r = AnonymousClass7TG.A0r(list);
                    for (C68821NYf nYf : list) {
                        AnonymousClass77B r13 = nYf.A01;
                        if (r13 == null || !r13.A0s || (r0 = r13.A0F) == null) {
                            str = null;
                        } else {
                            str = r0.A08;
                        }
                        A0r.add(str);
                    }
                    r72.CpM("stacks", (String) null, str2, (String) null, str3, str4, str5, A1C, A0r, (List) null);
                    return true;
                }
            } else {
                C328667Fr A012 = C68821NYf.A01(list, 0);
                MessageIdentifier Ar2 = A012.Ar2();
                if (Ar2 == null) {
                    Ar2 = A012.A0L;
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AnonymousClass777 r14 = C68821NYf.A00(it2).A0F;
                    if (!(!(r14 instanceof AnonymousClass776) || (r1 = (AnonymousClass776) r14) == null || (imageUrl = r1.A00) == null)) {
                        A1C2.add(imageUrl);
                    }
                }
                AnonymousClass7X1 r82 = this.A01;
                if (r82 != null) {
                    AnonymousClass9J6 r02 = A012.A08;
                    ((C332847Wp) r82).Cqp((View) null, (ImageUrl) null, (C68168N3i) null, Ar2, (GradientSpinner) null, (Long) null, (Long) null, r02.A01, r02.A00, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, A1C2, (List) null, (List) null, (List) null, (Map) null, 1, false);
                }
            }
        } else {
            AnonymousClass7X1 r15 = this.A01;
            if (r15 != null) {
                r15.AGk(r8.A02.A01, 2);
                return true;
            }
        }
        return true;
    }

    public P8E(UserSession userSession, AnonymousClass7X1 r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }
}
