package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

public final class UA8 extends 2Rw {
    public List A00 = new ArrayList();
    public final UserSession A01;
    public final Context A02;
    public final AnonymousClass86E A03;

    public final void onBindViewHolder(C249703kE r8, int i) {
        String str;
        UDN udn;
        0qQ.A0B(r8, 0);
        AnonymousClass72J r0 = (AnonymousClass72J) 00k.A0O(this.A00, i);
        if (r0 != null && (str = r0.A00) != null) {
            AnonymousClass86E r4 = this.A03;
            if ((r8 instanceof UDN) && (udn = (UDN) r8) != null) {
                IgImageView igImageView = udn.A03;
                Context context = igImageView.getContext();
                DbU.A13(context, igImageView, R.drawable.instagram_search_pano_outline_24);
                DbX.A12(context, igImageView, 2Yu.A0H(context, R.attr.igdsPrimaryIcon));
                TextView textView = udn.A01;
                textView.setText(str);
                textView.setTypeface((Typeface) null, 0);
                DbT.A17(context, textView, 2Yu.A0H(context, R.attr.igds_color_primary_text));
                IgSimpleImageView igSimpleImageView = udn.A02;
                igSimpleImageView.setVisibility(0);
                WBG.A01(udn.A00, 2, udn, r4);
                WBG.A01(igSimpleImageView, 3, udn, r4);
            }
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return new UDN(DbU.A09(LayoutInflater.from(this.A02), viewGroup, R.layout.row_effect_recent_search, false));
    }

    public UA8(Context context, UserSession userSession, AnonymousClass86E r4) {
        this.A02 = context;
        this.A01 = userSession;
        this.A03 = r4;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1570498332);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1764348291, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(1592392973, AnonymousClass0fD.A03(858584638));
        return 0;
    }
}
