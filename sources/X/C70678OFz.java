package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.collect.EvictingQueue;
import com.instagram.android.R;

/* renamed from: X.OFz  reason: case insensitive filesystem */
public final class C70678OFz {
    public final ViewGroup A00;
    public final LinearLayout A01;
    public final EvictingQueue A02 = new EvictingQueue(10);
    public final OJZ A03;
    public final MZ9 A04;

    public C70678OFz(Context context, View view, MZ9 mz9) {
        boolean A1Z = DbW.A1Z(mz9);
        this.A04 = mz9;
        OJZ ojz = new OJZ();
        this.A03 = ojz;
        View rootView = view.getRootView();
        C66580MXl.A1R(rootView);
        ViewGroup viewGroup = (ViewGroup) rootView;
        this.A00 = viewGroup;
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        this.A01 = linearLayout;
        JTS.A0x(linearLayout);
        linearLayout.setOrientation(A1Z ? 1 : 0);
        linearLayout.setPadding(40, 60, 20, 20);
        DbT.A16(context, linearLayout, 2Yu.A0H(context, R.attr.igds_color_photo_border));
        int i = 0;
        do {
            View inflate = DbV.A0D(linearLayout).inflate(R.layout.direct_thread_osd_debug_info_item, linearLayout, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
            TextView textView = (TextView) inflate;
            textView.setTextSize(10.0f);
            ojz.A00.add(textView);
            linearLayout.addView(textView);
            i++;
        } while (i < 10);
        viewGroup.addView(linearLayout);
        if (mz9.A04.add(this)) {
            for (MZH mzh : mz9.A03) {
                11Z.A02(new C73196PYa(this, new MZH(002.A0R("[old]", mzh.A01), mzh.A00)));
            }
        }
    }
}
