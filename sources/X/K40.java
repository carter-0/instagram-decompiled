package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class K40 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "UserPayCMPViolationBottomSheet";
    public final AnonymousClass0eM A00 = MMF.A00(this, 30);
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0G = DbU.A0G(view, R.id.description);
        Context context = A0G.getContext();
        String A16 = AnonymousClass7TE.A16(context, 2131965406);
        SpannableStringBuilder A08 = DbW.A08(context, 2131965414);
        AnonymousClass7AV.A04(A08, new C62146Kaz(this, DbV.A02(context)), A16);
        DbX.A1G(A0G, A08);
        C3021461u r4 = (C3021461u) view.requireViewById(R.id.bottom_button);
        Context context2 = view.getContext();
        r4.setPrimaryAction(context2.getString(2131965421), new LY3((Object) this, 7));
        r4.setSecondaryAction(context2.getString(2131965422), new LY3((Object) this, 8));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public K40() {
        MMF mmf = new MMF(this, 31);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMF(new MMF(this, 27), 28));
        this.A01 = DbS.A0I(new MMF(A002, 29), mmf, new MJ6(21, (Object) null, A002), DbS.A0z(C60160Jgf.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(44764704);
        0qQ.A0B(layoutInflater, 0);
        K40.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_cmp_violation_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-3668211, A02);
        return inflate;
    }
}
