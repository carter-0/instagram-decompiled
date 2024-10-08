package com.instagram.debug.devoptions.section.quickpromotion;

import X.002;
import X.0s0;
import X.0sr;
import X.0tS;
import X.2c2;
import X.AnonymousClass07i;
import X.AnonymousClass0YZ;
import X.AnonymousClass0fN;
import X.AnonymousClass2bO;
import X.AnonymousClass4DH;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C18080Vl9;
import X.C50989Fmc;
import X.DbT;
import X.DbV;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class QuickPromotionOptions implements DeveloperOptionsSection {
    public static final QuickPromotionOptions INSTANCE = new Object();

    /* access modifiers changed from: private */
    public final void showQpIpOverrideDialog(Context context) {
        0tS A0h = DbT.A0h();
        C18080Vl9 vl9 = new C18080Vl9(context);
        View A0D = DbT.A0D(LayoutInflater.from(context), (ViewGroup) null, R.layout.dev_text_input_dialog, false);
        IgEditText igEditText = (IgEditText) AnonymousClass7TF.A0F(A0D, R.id.edit_text);
        0s0 r3 = A0h.A2O;
        AnonymousClass0YZ[] r2 = 0tS.A4G;
        String A13 = DbV.A13(A0h, r3, r2, 212);
        if (!(A13 == null || A13.length() == 0)) {
            igEditText.setText(DbV.A13(A0h, r3, r2, 212));
        }
        igEditText.addTextChangedListener(new QuickPromotionOptions$showQpIpOverrideDialog$1(AnonymousClass7TG.A0R(A0D, R.id.description), context));
        vl9.A07(A0D);
        vl9.A02(2131958147);
        vl9.A04(new QuickPromotionOptions$showQpIpOverrideDialog$2(igEditText, A0h, context), 2131960992);
        AnonymousClass0fN.A00(vl9.A00());
    }

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r14, AnonymousClass07i r15) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        C50989Fmc fmc = new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new QuickPromotionOptions$getItems$1(fragmentActivity), (CharSequence) "Quick Promotion Config");
        C50989Fmc A00 = C50989Fmc.A00(fragmentActivity, new QuickPromotionOptions$getItems$2(userSession, fragmentActivity), 2131958215);
        AnonymousClass2bO.A00();
        2c2.A00(userSession).A03.getValue();
        return 0sr.A1P(new C50989Fmc[]{fmc, A00, new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) QuickPromotionOptions$getItems$3.INSTANCE, (CharSequence) 002.A0R("QP SDK Stats: ", 002.A0R("Last Fetch ", "Never"))), C50989Fmc.A00(fragmentActivity, new QuickPromotionOptions$getItems$4(fragmentActivity, userSession), 2131958356), C50989Fmc.A00(fragmentActivity, new QuickPromotionOptions$getItems$5(fragmentActivity), 2131958147), C50989Fmc.A00(fragmentActivity, new QuickPromotionOptions$getItems$6(fragmentActivity, userSession), 2131958180), C50989Fmc.A00(fragmentActivity, new QuickPromotionOptions$getItems$7(fragmentActivity, userSession), 2131958185), C50989Fmc.A00(fragmentActivity, new QuickPromotionOptions$getItems$8(userSession, fragmentActivity), 2131958216)});
    }

    public int getTitleRes() {
        return 2131958188;
    }
}
