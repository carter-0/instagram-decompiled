package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class Ep5 {
    public static final void A00(Context context, AnonymousClass4UE r14, 2bv r15) {
        AnonymousClass4UC r142 = (AnonymousClass4UC) r14;
        if (0qQ.A0K(r142.A09.A00, "instagram_app_rating_dialog")) {
            C49446Evn evn = new C49446Evn(context);
            AnonymousClass4V7 r1 = r142.A08;
            String A0n = DbZ.A0n(r1.A09);
            String A0n2 = DbZ.A0n(r1.A03);
            C71474OlI olI = new C71474OlI(r15, r142);
            FHX fhx = new FHX(2, r15, r142);
            boolean A1V = AnonymousClass7TF.A1V(r1.A00);
            Dialog dialog = new Dialog(evn.A01, R.style.IgDialogDeprecated);
            evn.A00 = dialog;
            dialog.setContentView(R.layout.new_appirater);
            Dialog dialog2 = evn.A00;
            0qQ.A0A(dialog2);
            View requireViewById = dialog2.requireViewById(R.id.rating_bar);
            0qQ.A0C(requireViewById, "null cannot be cast to non-null type android.widget.RatingBar");
            RatingBar ratingBar = (RatingBar) requireViewById;
            Dialog dialog3 = evn.A00;
            0qQ.A0A(dialog3);
            View requireViewById2 = dialog3.requireViewById(R.id.appirater_title_area);
            0qQ.A0C(requireViewById2, "null cannot be cast to non-null type android.widget.TextView");
            Dialog dialog4 = evn.A00;
            0qQ.A0A(dialog4);
            View requireViewById3 = dialog4.requireViewById(R.id.appirater_message_area);
            0qQ.A0C(requireViewById3, "null cannot be cast to non-null type android.widget.TextView");
            Dialog dialog5 = evn.A00;
            0qQ.A0A(dialog5);
            View requireViewById4 = dialog5.requireViewById(R.id.appirater_rate_later_button);
            0qQ.A0C(requireViewById4, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) requireViewById2).setText(A0n);
            ((TextView) requireViewById3).setText(A0n2);
            if (A1V) {
                FPE.A01(requireViewById4, 2, fhx, evn);
                Dialog dialog6 = evn.A00;
                0qQ.A0A(dialog6);
                dialog6.setCancelable(true);
                Dialog dialog7 = evn.A00;
                0qQ.A0A(dialog7);
                dialog7.setOnCancelListener(fhx);
            } else {
                Dialog dialog8 = evn.A00;
                0qQ.A0A(dialog8);
                View requireViewById5 = dialog8.requireViewById(R.id.appirater_rate_later_divider);
                0qQ.A07(requireViewById5);
                requireViewById4.setVisibility(8);
                requireViewById5.setVisibility(8);
                Dialog dialog9 = evn.A00;
                0qQ.A0A(dialog9);
                dialog9.setCancelable(false);
                Dialog dialog10 = evn.A00;
                0qQ.A0A(dialog10);
                dialog10.setOnCancelListener((DialogInterface.OnCancelListener) null);
            }
            ratingBar.setOnRatingBarChangeListener(new FQb(olI, evn));
            Dialog dialog11 = evn.A00;
            if (dialog11 != null) {
                AnonymousClass0fN.A00(dialog11);
                r15.DbK(r142);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
