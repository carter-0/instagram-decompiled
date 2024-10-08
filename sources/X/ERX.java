package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;

public final class ERX extends C47518E6c {
    public static final String __redex_internal_original_name = "NudityPreSendEducationBottomSheetContentFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        view2.setBackgroundResource(2Yu.A02(getContext()));
        ArrayList A1C = AnonymousClass7TE.A1C();
        Drawable A002 = AnonymousClass2dd.A00(DbV.A05(this), R.drawable.ig_illustrations_illo_nudity_detection_refresh);
        0qQ.A07(A002);
        A1C.add(new OTE(A002));
        int A02 = AnonymousClass7TG.A02(requireContext());
        int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        F0T f0t = new F0T(0, dimensionPixelSize, 0, dimensionPixelSize, A02, A02);
        FAZ faz = new FAZ((CharSequence) requireContext().getString(2131969718));
        faz.A02 = 4;
        faz.A03 = R.style.igds_headline_1_bold;
        faz.A05 = f0t;
        A1C.add(faz);
        FAZ faz2 = new FAZ((CharSequence) requireContext().getString(2131969714));
        faz2.A02 = 4;
        faz2.A03 = R.style.igds_body_1;
        faz2.A05 = f0t;
        A1C.add(faz2);
        Context requireContext = requireContext();
        String A16 = AnonymousClass7TE.A16(requireContext, 2131953611);
        String A0T = 002.A0T(requireContext.getString(2131969715), A16, ' ');
        ESx eSx = new ESx(this, DbV.A02(requireContext));
        SpannableStringBuilder A0C = DbS.A0C(A0T);
        AnonymousClass7AV.A04(A0C, eSx, A16);
        FAZ faz3 = new FAZ((CharSequence) A0C);
        faz3.A02 = 4;
        faz3.A03 = R.style.igds_body_1;
        faz3.A05 = f0t;
        A1C.add(faz3);
        setItems(A1C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(794809697);
        super.onCreate(bundle);
        AnonymousClass0fD.A09(1436917867, A02);
    }
}
