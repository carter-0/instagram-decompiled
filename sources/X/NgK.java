package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;

public final class NgK extends C47518E6c {
    public static final String __redex_internal_original_name = "SevereBugDescriptionBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "severe_bug_description_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        boolean z = requireArguments().getBoolean("SevereBugDescriptionBottomSheetFragment.ARGUMENT_INCLUDE_BUTTONS");
        ArrayList A1C = AnonymousClass7TE.A1C();
        FGF fgf = new FGF(2131973428);
        fgf.A06 = true;
        fgf.A01 = R.style.igds_emphasized_title;
        fgf.A02 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        A1C.add(fgf);
        FGF fgf2 = new FGF(2131973427);
        fgf2.A06 = true;
        A1C.add(fgf2);
        if (z) {
            String A16 = AnonymousClass7TE.A16(requireContext(), 2131973430);
            String string = requireContext().getString(2131973430);
            int A0D = 2Yu.A0D(getContext());
            View.OnClickListener onClickListener = this.A01;
            if (onClickListener == null) {
                str = "neverMindListener";
            } else {
                A1C.add(new C70661OFi(new C71403Ok2(onClickListener, 14), A16, string, A0D));
                FGF fgf3 = new FGF(2131973429);
                fgf3.A01 = R.style.rageshake_report_anyway;
                fgf3.A02 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
                View.OnClickListener onClickListener2 = this.A00;
                if (onClickListener2 == null) {
                    str = "iUnderstandListener";
                } else {
                    fgf3.A04 = onClickListener2;
                    fgf3.A06 = true;
                    A1C.add(fgf3);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        setBottomSheetMenuItems(A1C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }
}
