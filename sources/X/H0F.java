package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class H0F extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LimitsPlusWhoToLimitBottomsheetFragment";
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return "limitsplus_who_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C294475mW r0;
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(view, this);
        C52987Gge gge = (C52987Gge) this.A04.getValue();
        C294485mX r5 = (C294485mX) G9w.A0P(gge.A00.A01).A02;
        if (r5 != null) {
            05G r4 = gge.A01;
            do {
                r0 = (C294475mW) r5;
            } while (!C51975G9x.A1b(r4.getValue(), r4, r0.A01, r0.A00, r0.A02));
        }
        07U r8 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHL(view2, viewLifecycleOwner, r8, this, (AnonymousClass4D7) null, 49), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public H0F() {
        C58175Inf inf = new C58175Inf(this, 22);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58175Inf(new C58175Inf(this, 19), 20));
        this.A04 = DbS.A0I(new C58175Inf(A002, 21), inf, new MJ6(26, (Object) null, A002), DbS.A0z(C52987Gge.class));
    }

    public static final void A00(View view, H0F h0f) {
        String A0m;
        int i;
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.limits_plus_close_friends_row);
        C69349Njo njo = C69349Njo.TYPE_SWITCH;
        igdsListCell.setTextCellType(njo);
        igdsListCell.setChecked(h0f.A00);
        Dba.A14(h0f, igdsListCell, 2131964992);
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r3 = h0f.A03;
        if (!DbX.A0l(r0, r3).A1m()) {
            A0m = DbU.A0m(h0f, 2131965000);
            i = 2131965001;
        } else {
            A0m = DbU.A0m(h0f, 2131964991);
            i = 2131964990;
        }
        String string = h0f.getString(i);
        C54490HFw hFw = new C54490HFw(h0f, Dbb.A04(h0f));
        SpannableStringBuilder A0C = DbS.A0C(002.A0B(string));
        AnonymousClass7AV.A04(A0C, hFw, A0m);
        igdsListCell.A0H(A0C);
        IEB.A00(igdsListCell, h0f, 3);
        MovementMethod instance = LinkMovementMethod.getInstance();
        0qQ.A07(instance);
        igdsListCell.A0B(instance);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.limits_plus_recent_followers_row);
        igdsListCell2.setTextCellType(njo);
        igdsListCell2.setChecked(h0f.A01);
        Dba.A14(h0f, igdsListCell2, 2131965051);
        int i2 = 2131965048;
        if (AnonymousClass7TF.A0R(0Tu.A05, DbT.A0X(r3), 36326292223702702L).booleanValue()) {
            i2 = 2131965049;
        }
        igdsListCell2.A0H(DbU.A0m(h0f, i2));
        IEB.A00(igdsListCell2, h0f, 4);
        IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.limits_plus_non_followers_row);
        igdsListCell3.setTextCellType(njo);
        igdsListCell3.setChecked(h0f.A02);
        Dba.A14(h0f, igdsListCell3, 2131965047);
        IEB.A00(igdsListCell3, h0f, 5);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1843993596);
        H0F.super.onCreate(bundle);
        AnonymousClass0fD.A09(-423675807, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(522721886);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.limits_plus_who_to_limit_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(-453106958, A022);
        return inflate;
    }
}
