package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.NgW  reason: case insensitive filesystem */
public final class C69183NgW extends C47518E6c implements AnonymousClass4DS {
    public static final byte[] A03 = {5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
    public static final String __redex_internal_original_name = "IcdcDevOptionsFragment";
    public 1aU A00;
    public final 1a8 A01 = C66581MXm.A0P();
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "ICDC Developer Options");
    }

    public final String getModuleName() {
        return "msys_icdc_dev_options";
    }

    public static final void A06(C69183NgW ngW, String str, 0sP r7) {
        int i;
        Resources resources;
        Context context = ngW.getContext();
        if (context == null || (resources = context.getResources()) == null) {
            i = 0;
        } else {
            i = DbS.A03(resources, R.dimen.account_discovery_bottom_gap);
        }
        EditText editText = new EditText(ngW.getContext());
        editText.setHint("fbid");
        editText.setText(String.valueOf(DbX.A0l(AnonymousClass0t1.A01, ngW.A02).BST()), TextView.BufferType.EDITABLE);
        editText.setPadding(i, i, i, i);
        C18080Vl9 vl9 = new C18080Vl9(ngW.requireContext());
        vl9.A08(str);
        vl9.A01.A0C = "Enter the contact ID (fbid):";
        vl9.A07(editText);
        vl9.A06(C71236Og1.A00, "OK");
        vl9.A05(C71237Og2.A00, "Cancel");
        vl9.A00();
        C14729U5o A002 = vl9.A00();
        AnonymousClass0fN.A00(A002);
        C71399Ojy.A00(A002.A00.A0F, A002, editText, r7, 23);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(841324167);
        super.onCreate(bundle);
        this.A00 = 1aD.A01(AnonymousClass7TE.A0l(this.A02), __redex_internal_original_name).A02;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C50989Fmc.A01(requireContext(), new C71397Ojw(this, 52), "Inject an ICDC additional device to a user account", A1C);
        C50989Fmc.A01(requireContext(), new C71397Ojw(this, 53), "Clear ICDC additional devices in a user account", A1C);
        C50989Fmc.A01(requireContext(), new C71397Ojw(this, 54), "Clear ICDC failure data from a user account", A1C);
        C50989Fmc.A01(requireContext(), new C71397Ojw(this, 55), "Remove ICDC metadata from a user account", A1C);
        C50989Fmc.A01(requireContext(), new C71397Ojw(this, 56), "Increase ICDC metadata sequence for a user account", A1C);
        C50989Fmc.A01(requireContext(), new C71397Ojw(this, 57), "Decrease ICDC metadata sequence for a user account", A1C);
        setItems(A1C);
        AnonymousClass0fD.A09(1099856073, A022);
    }
}
