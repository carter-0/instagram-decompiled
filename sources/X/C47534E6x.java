package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.E6x  reason: case insensitive filesystem */
public final class C47534E6x extends C273374mT implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditAccountCategoryFragment";
    public int A00;
    public LayoutInflater A01;
    public RadioGroup A02;
    public List A03;
    public final C47691EDa A04 = new C47691EDa(this, 30);
    public final List A05 = AnonymousClass7TE.A1C();

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbX.A1A(FPC.A00(this, 20), DbX.A0M(), r4);
        ? obj = new Object();
        C59922Jbl.A02(DbV.A05(this), obj, 2131952051);
        C59904JbT.A01(FPC.A00(this, 21), r4, obj);
    }

    public final String getModuleName() {
        return "edit_account_category";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1224697621);
        C47534E6x.super.onCreate(bundle);
        Dbb.A1M(this);
        1NY A0M = DbZ.A0M(getSession());
        A0M.A0A("hpi_accounts/get_account_category/");
        1OC A0S = DbU.A0S(A0M, C47351Dvl.class, C49788F6w.class);
        A0S.A00 = this.A04;
        schedule(A0S);
        AnonymousClass0fD.A09(900144949, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(785295039);
        0qQ.A0B(layoutInflater, 0);
        this.A01 = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.account_category_list, viewGroup, false);
        RadioGroup radioGroup = (RadioGroup) inflate.requireViewById(R.id.edit_account_category_radio_group);
        this.A02 = radioGroup;
        if (radioGroup == null) {
            0qQ.A0F("radioGroup");
            throw AnonymousClass00P.createAndThrow();
        }
        radioGroup.setOnCheckedChangeListener(new FQU(this, 1));
        AnonymousClass0fD.A09(1671610946, A022);
        return inflate;
    }
}
