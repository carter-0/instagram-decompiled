package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.WeakHashMap;

/* renamed from: X.ILp  reason: case insensitive filesystem */
public final class C57023ILp implements JPE {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;
    public final C51984GAh A03;
    public final String A04;
    public final AnonymousClass0eM A05 = C58679Ivo.A00(this, 9);
    public final AnonymousClass0eM A06 = C58679Ivo.A00(this, 10);
    public final AnonymousClass0eM A07 = C58679Ivo.A00(this, 11);
    public final 2el A08;
    public final C230482ph A09;
    public final C249763kK A0A;
    public final Ho2 A0B;

    public final void EBW(View view, C267324bN r12, C52058GDe gDe) {
        String str;
        View view2 = view;
        AnonymousClass7TG.A1T(view, r12, gDe);
        String A1B = C51966G9m.A1B(r12);
        String id = C51966G9m.A0s(r12).getId();
        Integer A0A2 = r12.A0A();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ad_id:");
        A1A.append(A1B);
        A1A.append(":media_id:");
        A1A.append(id);
        C2354830a A002 = AnonymousClass30Y.A00(r12, gDe, AnonymousClass7TG.A0m(A0A2, ":ad_id:", A1A));
        A002.A00((C230372pW) this.A06.getValue());
        A002.A00((C230622pv) this.A07.getValue());
        A002.A00((IPI) this.A05.getValue());
        this.A08.A05(view, DbU.A0a(this.A09, A002));
        if (182.A06(0Tu.A05, this.A00, 36324630071488704L)) {
            Ho2 ho2 = this.A0B;
            String id2 = C51966G9m.A0s(r12).getId();
            if (id2 != null) {
                WeakHashMap weakHashMap = ho2.A04;
                if (weakHashMap.containsKey(view) && (str = (String) weakHashMap.get(view)) != null) {
                    ho2.A02.A01(str, (View) null);
                }
                weakHashMap.put(view, id2);
                AnonymousClass49W r2 = ho2.A02;
                r12.A06();
                r2.A00((C55513Hiv) null, new C57519Ic7(r12), new GAN(view2, ho2.A03, "reels_multi_ads", ho2.A01.getModuleName(), id2));
            }
        }
    }

    public final void FIt(View view) {
        0qQ.A0B(view, 0);
        this.A08.A04(view);
        if (182.A06(0Tu.A05, this.A00, 36324630071488704L)) {
            Ho2 ho2 = this.A0B;
            WeakHashMap weakHashMap = ho2.A04;
            String str = (String) weakHashMap.get(view);
            if (str != null) {
                ho2.A02.A01(str, view);
            }
            weakHashMap.remove(view);
        }
    }

    public C57023ILp(UserSession userSession, 2el r6, C232852uY r7, AnonymousClass4DU r8, C249763kK r9, C51984GAh gAh, String str) {
        this.A08 = r6;
        this.A00 = userSession;
        this.A0A = r9;
        this.A04 = str;
        this.A02 = r8;
        this.A01 = r7;
        this.A03 = gAh;
        this.A09 = new C230482ph(userSession, new C230462pf(userSession, new C57356IYn(r9.getSessionId(), r8.getModuleName()), new C230442pd(), C230432pc.CLIPS), C230472pg.SPONSORED);
        this.A0B = new Ho2(userSession, r8);
    }
}
