package X;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Iterator;

public final class E14 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AutoConfBottomSheetFragment";
    public String A00;
    public String A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "auto_conf_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(-723194285);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.auto_conf_bottom_sheet_fragment, viewGroup, false);
        String string = requireArguments().getString("AUTO_CONF_SCREEN_TYPE", (String) null);
        if (string != null) {
            this.A00 = string;
            0qQ.A0A(inflate);
            ViewGroup A0I = DbX.A0I(inflate, R.id.bottom_sheet_text_list);
            String str = this.A00;
            String str2 = "autoConfScreenType";
            if (str != null) {
                if (str.equals("OPT_OUT")) {
                    this.A01 = getString(2131953328);
                    i = 2131953329;
                } else {
                    int i2 = 2131953316;
                    if (str.equals("CONSENT")) {
                        i2 = 2131953317;
                    }
                    this.A01 = getString(i2);
                    i = 2131953315;
                }
                String string2 = getString(i);
                String str3 = this.A01;
                if (str3 == null) {
                    str2 = "descriptionParagraph1";
                } else if (string2 == null) {
                    str2 = "descriptionParagraph2";
                } else {
                    Iterator it = 0sr.A1P(new String[]{str3, string2}).iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        View A0D = DbT.A0D(layoutInflater, A0I, R.layout.auto_conf_bulleted_list, false);
                        View findViewById = A0D.findViewById(R.id.description_text);
                        if (findViewById != null) {
                            TextView textView = (TextView) findViewById;
                            if (A18 == null) {
                                A18 = "";
                            }
                            textView.setText(Html.fromHtml(A18));
                            A0I.addView(A0D);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    AnonymousClass0fD.A09(1636072094, A022);
                    return inflate;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1397608471, A022);
        throw A0y;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1988305982);
        super.onResume();
        AnonymousClass0fD.A09(1300166305, A022);
    }
}
