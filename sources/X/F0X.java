package X;

import android.content.res.Resources;
import android.text.TextWatcher;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

public final class F0X {
    public TextWatcher A00;
    public C49689F1z A01;
    public final View A02;
    public final View A03;
    public final IgLinearLayout A04;
    public final IgAutoCompleteTextView A05;
    public final AnonymousClass0eM A06;

    public F0X(View view, AnonymousClass07Z r9, FR2 fr2, boolean z) {
        0qQ.A0B(view, 1);
        View A0F = DbY.A0F(view, z ? R.id.direct_multi_select_bottom_container_stub : R.id.direct_private_share_message_view_stub);
        0qQ.A0A(A0F);
        this.A02 = A0F;
        this.A04 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.sharesheet_write_message_header);
        this.A05 = (IgAutoCompleteTextView) AnonymousClass7TF.A0F(view, R.id.direct_private_share_message_box);
        View A0F2 = DbY.A0F(A0F, R.id.layout_suggested_prompts_stub);
        0qQ.A07(A0F2);
        this.A03 = A0F2;
        2YM r1 = C46782DlA.A0D;
        0Yh A0z = DbS.A0z(C46782DlA.class);
        2YS r5 = new 2YS(fr2.getDefaultViewModelCreationExtras());
        r5.A01(FR3.A00, r1);
        this.A06 = DbS.A0I(new C67570Mq4(fr2, 43), new C67570Mq4(fr2, 44), new C67570Mq4(r5, 45), A0z);
        AnonymousClass7TE.A1Z(new C73568Pfp(r9, this, (AnonymousClass4D7) null, 11), AnonymousClass07a.A00(r9));
        if (z) {
            Resources resources = A0F.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
            this.A05.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        } else {
            int A012 = AnonymousClass1GB.A01(0nA.A04(AnonymousClass7TE.A0S(A0F), 12));
            this.A04.setPadding(A012, A012, A012, A012);
        }
        IgAutoCompleteTextView igAutoCompleteTextView = this.A05;
        View view2 = this.A02;
        igAutoCompleteTextView.setHint(view2.getContext().getString(2131960523));
        igAutoCompleteTextView.setTextSize(0, (float) view2.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size));
    }
}
