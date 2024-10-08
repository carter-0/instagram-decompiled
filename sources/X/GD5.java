package X;

import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

public final class GD5 implements C338257hf {
    public Long A00;
    public final UserSession A01;
    public final C52009GBg A02;
    public final C52007GBe A03;
    public final GBC A04;
    public final GD4 A05;

    public GD5(UserSession userSession, C52009GBg gBg, GD4 gd4, C52007GBe gBe, GBC gbc) {
        0qQ.A0B(gbc, 5);
        this.A02 = gBg;
        this.A01 = userSession;
        this.A03 = gBe;
        this.A05 = gd4;
        this.A04 = gbc;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final /* bridge */ /* synthetic */ void CyA(ComponentTree componentTree, C338557i9 r8, C338367hq r9, int i) {
        long j;
        C52007GBe gBe = this.A03;
        boolean A1W = AnonymousClass7TF.A1W(gBe.A0K.A0J, ClipsViewerSource.CLIPS_TAB);
        UserSession userSession = gBe.A0N;
        0Tu r2 = 0Tu.A05;
        if (A1W) {
            j = 36329732492902699L;
        } else {
            j = 36329732492968236L;
        }
        boolean A1Z = DbY.A1Z(r2, userSession, j);
        if (A1Z && this.A00 == null) {
            this.A00 = C51968G9o.A0u();
        }
        C227912kJ.A01(this.A01, this.A00, (C62320sa) null, new J6V(i, 14, (Object) r8, (Object) this), A1Z);
    }

    public final /* bridge */ /* synthetic */ void DzF(C338557i9 r2) {
        C52079GDz gDz = (C52079GDz) r2;
        0qQ.A0B(gDz, 0);
        this.A03.unbind(gDz);
    }

    public final long getItemId(int i) {
        return ((2Rw) this.A05.A00.A07.invoke()).getItemId(i);
    }

    public final /* bridge */ /* synthetic */ C338557i9 D73(ViewGroup viewGroup, int i) {
        C52278GLu gLu;
        AnonymousClass0mX.A00(viewGroup);
        GBC gbc = this.A04;
        if (gbc.A00 && (gLu = gbc.A01) != null && gLu.A00) {
            C52278GLu.A00(gLu, 002.A0R(AnonymousClass7TF.A0j("ON_CREATE_VIEW_HOLDER"), "_start"));
        }
        int Ewo = AnonymousClass2Ro.A00.Ewo(i);
        C52007GBe gBe = this.A03;
        C52079GDz A052 = gBe.A05();
        String name = gBe.getClass().getName();
        0qQ.A07(name);
        AnonymousClass2Ro.A00.ASL(C320866t5.A00(gBe, (Object) null, name, false, false), Ewo);
        if (gbc.A00) {
            C52278GLu gLu2 = gbc.A01;
            if (gLu2 != null && gLu2.A00) {
                C52278GLu.A00(gLu2, 002.A0R(AnonymousClass7TF.A0j("ON_CREATE_VIEW_HOLDER"), "_end"));
            }
            gbc.A00 = false;
        }
        return A052;
    }
}
