package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.OYq  reason: case insensitive filesystem */
public final class C71015OYq {
    public static final int[] A05 = {R.id.bottom_context, R.id.megaphone_social_context_facepile, R.id.megaphone_social_context_text, R.id.megaphone_icon};
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgLinearLayout A04;

    private final LinearLayout A00(View.OnClickListener onClickListener, Integer num, String str, String str2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Integer num2 = AnonymousClass05K.A00;
        int i = R.layout.igds_megaphone_secondary_style_button;
        int i2 = R.id.secondary_style_button;
        if (num == num2) {
            i = R.layout.igds_megaphone_primary_style_button;
            i2 = R.id.primary_style_button;
        }
        IgLinearLayout igLinearLayout = this.A04;
        LinearLayout linearLayout = (LinearLayout) C66583MXo.A0A(DbV.A0D(igLinearLayout), igLinearLayout, i);
        IgdsButton A0n = JTR.A0n(linearLayout, i2);
        A0n.setText(str);
        if (str2 != null) {
            A0n.setContentDescription(str2);
        }
        A0n.setVisibility(0);
        AnonymousClass0fU.A00(onClickListener, A0n);
        return linearLayout;
    }

    public C71015OYq(View view, C66815Md1 md1, N3L n3l) {
        this.A00 = view;
        this.A03 = C66582MXn.A0F(view);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.message);
        this.A01 = DbX.A0J(view, R.id.dismiss_button);
        this.A04 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.igds_button_layout);
        DbX.A1B(view, R.id.button_placeholder);
        this.A03.setText(n3l.A0D);
        this.A02.setText(n3l.A06);
        ImageView imageView = this.A01;
        DbU.A12(imageView.getContext(), imageView, 2131960863);
        C71402Ok1.A00(imageView, 34, md1);
        LinearLayout A002 = A00(new C71402Ok1((Object) md1, 32), n3l.A04, n3l.A08, n3l.A07);
        LinearLayout A003 = A00(new C71402Ok1((Object) md1, 33), n3l.A05, n3l.A0B, n3l.A0A);
        IgLinearLayout igLinearLayout = this.A04;
        igLinearLayout.setVisibility(0);
        int paddingLeft = igLinearLayout.getPaddingLeft();
        int paddingTop = igLinearLayout.getPaddingTop();
        int paddingRight = igLinearLayout.getPaddingRight();
        Context context = igLinearLayout.getContext();
        igLinearLayout.setPadding(paddingLeft, paddingTop, paddingRight, AnonymousClass7TG.A06(context));
        if (n3l.A03 == AnonymousClass05K.A00) {
            igLinearLayout.setOrientation(1);
            igLinearLayout.setGravity(1);
            if (A002 != null) {
                igLinearLayout.addView(A002);
            }
            if (A003 != null) {
                igLinearLayout.addView(A003);
            }
        } else {
            igLinearLayout.setOrientation(0);
            igLinearLayout.setGravity(1);
            if (A003 != null) {
                igLinearLayout.addView(A003);
            }
            if (A002 != null) {
                igLinearLayout.addView(A002);
                if (A003 != null) {
                    (DbU.A05(this.A00).getConfiguration().getLayoutDirection() != 1 ? A003 : A002).setPadding(A003.getPaddingLeft(), A003.getPaddingTop(), DbY.A01(context), A003.getPaddingBottom());
                }
            }
        }
        ImageView imageView2 = this.A01;
        C66581MXm.A1C(imageView2, C66581MXm.A02(imageView2.getContext()));
    }
}
