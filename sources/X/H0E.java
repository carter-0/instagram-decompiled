package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class H0E extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LimitsPlusWhatToLimitBottomsheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return "limitsplus_what_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C53446Goe goe;
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(view, this);
        C52986Ggd ggd = (C52986Ggd) this.A01.getValue();
        YBJ ybj = (YBJ) G9w.A0P(ggd.A00.A01).A03;
        if (ybj != null) {
            05G r5 = ggd.A01;
            do {
                goe = (C53446Goe) ybj;
            } while (!r5.AIY(r5.getValue(), new C61042Jvg(goe.A01, goe.A00, 21)));
        }
        07U r9 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHL(view2, viewLifecycleOwner, r9, this, (AnonymousClass4D7) null, 48), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public H0E() {
        C58175Inf inf = new C58175Inf(this, 14);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58175Inf(new C58175Inf(this, 11), 12));
        this.A01 = DbS.A0I(new C58175Inf(A002, 13), inf, new MJ6(24, (Object) null, A002), DbS.A0z(C52986Ggd.class));
    }

    public static final void A00(View view, H0E h0e) {
        int i;
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.limits_plus_some_interactions_row);
        C69349Njo njo = C69349Njo.TYPE_CHECKBOX;
        igdsListCell.setTextCellType(njo);
        AnonymousClass0eM r6 = h0e.A01;
        igdsListCell.setChecked(((C61042Jvg) ((C52986Ggd) r6.getValue()).A02.getValue()).A01);
        Dba.A14(h0e, igdsListCell, 2131965023);
        AnonymousClass0eM r4 = h0e.A00;
        0lg A0X = DbT.A0X(r4);
        0Tu r5 = 0Tu.A05;
        boolean booleanValue = AnonymousClass7TF.A0R(r5, A0X, 36326292223702702L).booleanValue();
        int i2 = 2131965021;
        if (booleanValue) {
            i2 = 2131965022;
        }
        igdsListCell.A0H(DbU.A0m(h0e, i2));
        IEB.A00(igdsListCell, h0e, 1);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.limits_plus_most_interactions_row);
        igdsListCell2.setTextCellType(njo);
        igdsListCell2.setChecked(((C61042Jvg) ((C52986Ggd) r6.getValue()).A02.getValue()).A00);
        Dba.A14(h0e, igdsListCell2, 2131965005);
        if (AnonymousClass7TF.A0R(r5, DbT.A0X(r4), 36326292223702702L).booleanValue()) {
            i = 2131965003;
        } else {
            i = 2131965002;
            if (DbX.A0l(AnonymousClass0t1.A01, r4).A0N() == AnonymousClass05K.A0C) {
                i = 2131965004;
            }
        }
        igdsListCell2.A0H(DbU.A0m(h0e, i));
        IEB.A00(igdsListCell2, h0e, 2);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1526915849);
        H0E.super.onCreate(bundle);
        AnonymousClass0fD.A09(911713600, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1327051957);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.limits_plus_what_to_limit_bottomsheet_layout, viewGroup, false);
        AnonymousClass0fD.A09(-867455299, A02);
        return inflate;
    }
}
