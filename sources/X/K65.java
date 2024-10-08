package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class K65 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C21048XBp, X7f {
    public static final String __redex_internal_original_name = "ArchiveReelComposeFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new MME(this, 19));
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new MME(this, 25));
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(new MME(this, 30));
    public final AnonymousClass0eM A0A;

    public final void Cxx(String str, Integer num) {
    }

    public final void DFd(String str, Integer num) {
    }

    public final void DVy() {
    }

    public final void DW7() {
    }

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        Set set = (Set) ((C61056Jvu) ((C60308Jj7) this.A0A.getValue()).A09.getValue()).A05;
        if (set.isEmpty()) {
            r6.Eom(2131956869);
            r6.AA6(2131968361);
        } else {
            r6.setTitle(JTS.A0i(DbV.A05(this), set.size(), 2131963455));
            LYC.A01(r6, this, 39, 2131968361);
        }
        r6.Eu4(true);
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C60308Jj7.A01((C60308Jj7) this.A0A.getValue(), (String) null, true);
        ((WT0) this.A00.getValue()).A04.add(this);
    }

    public final void EKl() {
        ((C60308Jj7) this.A0A.getValue()).A03(0);
    }

    public final String getModuleName() {
        if (AnonymousClass7TF.A1Z(this.A05)) {
            return AnonymousClass000.A00(1743);
        }
        return "archive_stories_tab";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public K65() {
        0eO r2 = 0eO.A02;
        this.A01 = MME.A00(this, r2, 20);
        this.A05 = MME.A00(this, r2, 24);
        this.A04 = MME.A00(this, r2, 23);
        this.A08 = AnonymousClass0eN.A00(r2, new C66215MIw(this));
        this.A02 = MME.A00(this, r2, 21);
        this.A03 = MME.A00(this, r2, 22);
        MME mme = new MME(this, 31);
        AnonymousClass0eM A002 = MME.A00(new MME(this, 27), r2, 28);
        this.A0A = DbS.A0I(new MME(A002, 29), mme, new MMZ(45, (Object) null, (Object) A002), DbS.A0z(C60308Jj7.class));
        this.A07 = C227642jf.A02(this);
    }

    public final void DYr(String str, Integer num) {
        L3L l3l;
        String str2;
        AnonymousClass7TG.A1N(str, num);
        if (num == AnonymousClass05K.A00 && (l3l = (L3L) ((WT0) this.A00.getValue()).A03.get(str)) != null && (str2 = l3l.A01) != null) {
            AnonymousClass0eM r4 = this.A0A;
            List list = (List) ((C61056Jvu) ((C60308Jj7) r4.getValue()).A09.getValue()).A02;
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (0qQ.A0K(((C55977Hqi) it.next()).A02.getId(), str2)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            if (intValue > -1) {
                C60308Jj7 jj7 = (C60308Jj7) r4.getValue();
                jj7.A03((list.size() - 1) - (intValue + AnonymousClass7TG.A0A(l3l.A00)));
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-776351304);
        K65.super.onCreate(bundle);
        DbY.A0v(requireContext(), (MYU) this.A06.getValue(), this, this.A07);
        AnonymousClass0fD.A09(1926922675, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1662617455);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A03(new C59111J6t(this, 16), 973849433), false, 182.A06(0Tu.A05, DbT.A0X(this.A07), 36316869065642690L));
        AnonymousClass0fD.A09(-699316860, A022);
        return A012;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1547219791);
        super.onDestroy();
        C64184LSr.A03(((C60308Jj7) this.A0A.getValue()).A05);
        ((WT0) this.A00.getValue()).A04.remove(this);
        AnonymousClass0fD.A09(-474281009, A022);
    }
}
