package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import java.util.ArrayList;
import java.util.List;

public final class E1X extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "HowItWorksNuxFragment";
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04 = 0sn.A00;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        ViewGroup A0I = DbX.A0I(view, R.id.how_it_works_row_container);
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            ImageView A0F = DbU.A0F(view, R.id.header_icon);
            DbU.A13(requireContext, A0F, intValue);
            if (this.A05) {
                int dimensionPixelSize = A0F.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                A0F.setLayoutParams(layoutParams);
            }
            A0F.setVisibility(0);
        }
        String str = this.A03;
        if (str != null) {
            TextView A0G = DbU.A0G(view, R.id.header_text);
            A0G.setText(str);
            A0G.setVisibility(0);
        }
        for (HowItWorksNuxFragment$Row howItWorksNuxFragment$Row : this.A04) {
            IgdsBulletCell igdsBulletCell = new IgdsBulletCell(requireContext, (AttributeSet) null, 0);
            igdsBulletCell.setText(howItWorksNuxFragment$Row.A03, howItWorksNuxFragment$Row.A00);
            Integer num2 = howItWorksNuxFragment$Row.A02;
            if (num2 != null) {
                igdsBulletCell.setIcon(num2.intValue());
            }
            Integer num3 = howItWorksNuxFragment$Row.A01;
            if (num3 != null) {
                igdsBulletCell.setIconColor(num3.intValue());
            }
            A0I.addView(igdsBulletCell);
        }
        if (this.A02 != null) {
            TextView A0G2 = DbU.A0G(view, R.id.footer_text);
            A0G2.setText(this.A02);
            A0G2.setVisibility(0);
        }
    }

    public final String getModuleName() {
        String str = this.A01;
        if (str == null) {
            return "how_it_works_nux";
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        boolean z;
        int A022 = AnonymousClass0fD.A02(-1495356909);
        E1X.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = C320236s2.A01(requireArguments, AnonymousClass000.A00(511));
        ArrayList A023 = 2Yc.A02(requireArguments, HowItWorksNuxFragment$Row.class, "argument_rows");
        C320236s2.A03(requireArguments, A023, "argument_rows");
        this.A04 = A023;
        if (requireArguments.containsKey("argument_header_icon_id")) {
            num = DbV.A0o(requireArguments, "argument_header_icon_id");
        } else {
            num = null;
        }
        this.A00 = num;
        this.A03 = requireArguments.getString("argument_header_text");
        this.A02 = requireArguments.getString("argument_footer_text");
        if (requireArguments.containsKey("argument_use_default_icon_size")) {
            z = requireArguments.getBoolean("argument_use_default_icon_size");
        } else {
            z = false;
        }
        this.A05 = z;
        AnonymousClass0fD.A09(-295361826, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1378204709);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.how_it_works_bottom_sheet, false);
        AnonymousClass0fD.A09(1908044462, A022);
        return A0D;
    }
}
