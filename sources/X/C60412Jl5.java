package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import java.util.List;

/* renamed from: X.Jl5  reason: case insensitive filesystem */
public final class C60412Jl5 extends 2Rw {
    public final Integer A00;
    public final Integer A01;
    public final List A02;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        int applyDimension;
        Context A0C = JTP.A0C(viewGroup, 0);
        View inflate = LayoutInflater.from(A0C).inflate(R.layout.primer_bottom_sheet_info_list_item, viewGroup, false);
        if (i == 0) {
            Resources A0A = AnonymousClass7TF.A0A(A0C);
            Integer num = this.A00;
            if (num != null) {
                applyDimension = A0A.getDimensionPixelSize(num.intValue());
            } else {
                applyDimension = (int) TypedValue.applyDimension(1, 24.0f, A0A.getDisplayMetrics());
            }
            inflate.setPadding(0, 0, 0, applyDimension);
        }
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C60646Jot(inflate, this.A01);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r8, int i) {
        C60646Jot jot = (C60646Jot) r8;
        0qQ.A0B(jot, 0);
        InfoItem infoItem = (InfoItem) this.A02.get(i);
        0qQ.A0B(infoItem, 0);
        IconConfig iconConfig = infoItem.A00;
        if (iconConfig instanceof IconConfig.SimpleIconConfig) {
            View A0H = JTP.A0H(jot.A00, R.layout.primer_bottom_sheet_info_list_simple_icon_layout);
            0qQ.A0C(A0H, C273654mx.A00(87));
            ((ImageView) A0H).setImageResource(((IconConfig.SimpleIconConfig) iconConfig).A00);
        } else if (iconConfig instanceof IconConfig.IconWithTextConfig) {
            View A0H2 = JTP.A0H(jot.A00, R.layout.primer_bottom_sheet_info_list_icon_with_text_layout);
            ViewGroup.LayoutParams layoutParams = A0H2.getLayoutParams();
            int dimensionPixelSize = DbU.A05(A0H2).getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            IconConfig.IconWithTextConfig iconWithTextConfig = (IconConfig.IconWithTextConfig) iconConfig;
            DbS.A0G(A0H2, R.id.icon_image).setImageResource(iconWithTextConfig.A00);
            AnonymousClass7TE.A0d(A0H2, R.id.icon_text).setText(iconWithTextConfig.A01);
        }
        String str = infoItem.A02;
        String str2 = infoItem.A03;
        Integer num = infoItem.A01;
        TextView textView = jot.A01;
        textView.setText(Html.fromHtml(str, 0));
        if (num != null) {
            DbT.A17(textView.getContext(), textView, num.intValue());
        }
        Integer num2 = jot.A03;
        if (num2 != null) {
            textView.setTextAppearance(num2.intValue());
        }
        if (str2 == null || 00l.A0W(str2)) {
            jot.A02.setVisibility(8);
            return;
        }
        TextView textView2 = jot.A02;
        textView2.setVisibility(0);
        textView2.setText(str2);
    }

    public C60412Jl5(Integer num, Integer num2, List list) {
        this.A02 = list;
        this.A00 = num;
        this.A01 = num2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1812035177);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-985818905, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(1699096627);
        int i2 = 1;
        if (i != this.A02.size() - 1) {
            i2 = 0;
        }
        AnonymousClass0fD.A0A(-381667709, A03);
        return i2;
    }
}
