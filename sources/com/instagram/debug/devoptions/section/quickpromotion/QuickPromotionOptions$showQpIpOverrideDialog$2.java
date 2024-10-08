package com.instagram.debug.devoptions.section.quickpromotion;

import X.0tS;
import X.AnonymousClass7TF;
import X.C59689JTv;
import X.DbS;
import X.DbV;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Patterns;
import com.instagram.common.ui.base.IgEditText;

public final class QuickPromotionOptions$showQpIpOverrideDialog$2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ 0tS $devPref;
    public final /* synthetic */ IgEditText $editText;

    public QuickPromotionOptions$showQpIpOverrideDialog$2(IgEditText igEditText, 0tS r2, Context context) {
        this.$editText = igEditText;
        this.$devPref = r2;
        this.$context = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        int i2;
        String A0f = AnonymousClass7TF.A0f(this.$editText);
        if (A0f == null || A0f.length() == 0) {
            0tS r4 = this.$devPref;
            DbS.A1a(r4, (Object) null, r4.A2O, 0tS.A4G, 212);
            return;
        }
        if (DbV.A1b(A0f, Patterns.IP_ADDRESS)) {
            0tS r3 = this.$devPref;
            DbS.A1a(r3, A0f, r3.A2O, 0tS.A4G, 212);
            context = this.$context;
            i2 = 2131958183;
        } else {
            context = this.$context;
            i2 = 2131958182;
        }
        C59689JTv.A06(context, i2);
    }
}
