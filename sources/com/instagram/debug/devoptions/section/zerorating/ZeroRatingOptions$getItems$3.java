package com.instagram.debug.devoptions.section.zerorating;

import X.0qQ;
import X.0xY;
import X.0xn;
import X.1R0;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0fN;
import X.AnonymousClass1Qz;
import X.AnonymousClass7TF;
import X.C18080Vl9;
import X.DbT;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;

public final class ZeroRatingOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public ZeroRatingOptions$getItems$3(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-996852037);
        View A0D = DbT.A0D(LayoutInflater.from(this.$activity), (ViewGroup) null, R.layout.dev_text_input_dialog, false);
        final IgEditText igEditText = (IgEditText) AnonymousClass7TF.A0F(A0D, R.id.edit_text);
        String str = "";
        String string = 0xn.A01(AnonymousClass000.A00(464)).getString(AnonymousClass000.A00(489), str);
        if (string != null) {
            str = string;
        }
        igEditText.setText(str);
        igEditText.setHint("Type the carrier id you want to dogfood");
        igEditText.requestFocus();
        C18080Vl9 vl9 = new C18080Vl9(this.$activity);
        vl9.A08("Dogfood Carrier Id");
        vl9.A07(A0D);
        final UserSession userSession = this.$userSession;
        vl9.A06(new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                0qQ.A0B(dialogInterface, 0);
                String A0f = AnonymousClass7TF.A0f(IgEditText.this);
                0xY AR4 = 0xn.A01(AnonymousClass000.A00(464)).AR4();
                AR4.E5g(AnonymousClass000.A00(489), A0f);
                AR4.apply();
                1R0 A00 = AnonymousClass1Qz.A00(userSession);
                0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.zero.tokenfetch.IgZeroTokenManager");
                A00.A05();
                dialogInterface.dismiss();
            }
        }, "Confirm");
        vl9.A05(new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                0qQ.A0B(dialogInterface, 0);
                0xY AR4 = 0xn.A01(AnonymousClass000.A00(464)).AR4();
                AR4.ED3(AnonymousClass000.A00(489));
                AR4.apply();
                1R0 A00 = AnonymousClass1Qz.A00(userSession);
                0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.zero.tokenfetch.IgZeroTokenManager");
                A00.A05();
                dialogInterface.dismiss();
            }
        }, "Stop Dogfooding");
        AnonymousClass0fN.A00(vl9.A00());
        AnonymousClass0fD.A0C(1469310459, A05);
    }
}
