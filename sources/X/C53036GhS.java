package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.shared.nux.data.MetaAINuxRepository;

/* renamed from: X.GhS  reason: case insensitive filesystem */
public final class C53036GhS extends 2YL {
    public boolean A00 = true;
    public final Application A01;
    public final FoaUserSession A02;
    public final C56564I1s A03;
    public final C56507Hzd A04;
    public final C56092Hsf A05;
    public final MetaAINuxRepository A06;
    public final C54639HLw A07;
    public final String A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final boolean A0B;
    public final boolean A0C;

    public /* synthetic */ C53036GhS(Application application, FoaUserSession foaUserSession, C56564I1s i1s, C56092Hsf hsf, C54639HLw hLw, String str, boolean z, boolean z2) {
        C56507Hzd hzd = new C56507Hzd(foaUserSession, hsf);
        MetaAINuxRepository metaAINuxRepository = new MetaAINuxRepository(application, foaUserSession);
        this.A01 = application;
        this.A02 = foaUserSession;
        this.A07 = hLw;
        this.A08 = str;
        this.A05 = hsf;
        this.A03 = i1s;
        this.A0C = z;
        this.A0B = z2;
        this.A04 = hzd;
        this.A06 = metaAINuxRepository;
        02z A10 = DbS.A10(new I1Z(C54559HIu.A00));
        this.A09 = A10;
        this.A0A = A10;
    }

    private final C54673HOe A00() {
        int ordinal = this.A07.ordinal();
        if (ordinal == 0) {
            return C54673HOe.CREATE;
        }
        if (ordinal == 3) {
            return C54673HOe.EDIT;
        }
        if (ordinal == 1 || ordinal == 2) {
            return C54673HOe.WRITE;
        }
        throw AnonymousClass7TE.A1K();
    }

    private final XSJ A01() {
        int ordinal = this.A07.ordinal();
        if (ordinal == 0 || ordinal == 3) {
            return XXv.A00(C69416Nky.valueOf(this.A08));
        }
        if (ordinal == 1 || ordinal == 2) {
            return XXw.A00(I3J.A00(this.A08));
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final void A02(C53036GhS ghS) {
        C56507Hzd hzd = ghS.A04;
        XSJ A012 = ghS.A01();
        C54673HOe A002 = ghS.A00();
        DbY.A1S(A012, A002);
        C56507Hzd.A00(A002, A012, hzd, "meta_ai_nux_impression", (String) null);
        05G r2 = ghS.A09;
        r2.getValue();
        r2.Epw(new I1Z(C54558HIt.A00));
    }

    public final void A03() {
        C56507Hzd hzd = this.A04;
        XSJ A012 = A01();
        C54673HOe A002 = A00();
        DbY.A1S(A012, A002);
        C56507Hzd.A00(A002, A012, hzd, "meta_ai_nux_not_now_clicked", (String) null);
        05G r2 = this.A09;
        r2.getValue();
        r2.Epw(new I1Z(C54560HIv.A00));
        this.A00 = false;
    }

    public final void A04() {
        C318136oS A002;
        int i;
        MetaAINuxRepository metaAINuxRepository = this.A06;
        String obj = this.A07.toString();
        0qQ.A0B(obj, 0);
        if (metaAINuxRepository.A00.getSharedPreferences("MetaAINuxImpressionCache", 0).getBoolean(obj, false)) {
            05G r2 = this.A09;
            r2.getValue();
            r2.Epw(new I1Z(C54557HIs.A00));
            return;
        }
        if (this.A0C) {
            A002 = C318116oQ.A00(this);
            i = 1;
        } else {
            A02(this);
            A002 = C318116oQ.A00(this);
            i = 2;
        }
        C58099ImL.A01(this, A002, i);
    }

    public final void A05(boolean z) {
        if (z) {
            C56507Hzd hzd = this.A04;
            XSJ A012 = A01();
            C54673HOe A002 = A00();
            DbY.A1S(A012, A002);
            C56507Hzd.A00(A002, A012, hzd, "meta_ai_nux_action", (String) null);
        }
        05G r2 = this.A09;
        r2.getValue();
        r2.Epw(new I1Z(C54557HIs.A00));
    }
}
