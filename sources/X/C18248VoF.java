package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VoF  reason: case insensitive filesystem */
public abstract class C18248VoF {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.UBY, X.3kE, java.lang.Object] */
    public static final LinearLayout A00(Context context, ViewGroup viewGroup, int i) {
        0qQ.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        DbY.A0z(linearLayout);
        linearLayout.setOrientation(1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        LinearLayout linearLayout2 = (LinearLayout) shimmerFrameLayout.findViewById(R.id.container);
        linearLayout2.setOrientation(1);
        UDT udt = new UDT(DbU.A09(LayoutInflater.from(context), linearLayout2, R.layout.product_card_loading_placeholder_title, false));
        linearLayout2.addView(udt.A03);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            C14885UDn uDn = new C14885UDn(DbU.A0A(LayoutInflater.from(context), linearLayout2, R.layout.product_card_loading_placeholder_row, false));
            arrayList.add(uDn);
            linearLayout2.addView(uDn.A02);
        }
        linearLayout.addView(shimmerFrameLayout);
        ? r0 = new C249703kE(linearLayout);
        r0.A00 = shimmerFrameLayout;
        r0.A01 = udt;
        r0.A02 = arrayList;
        linearLayout.setTag(r0);
        return linearLayout;
    }

    public static final void A01(UBY uby, HES hes) {
        0qQ.A0B(uby, 0);
        UDT udt = uby.A01;
        C53504Gpa gpa = hes.A00;
        0qQ.A0B(udt, 0);
        View view = udt.A03;
        if (gpa != null) {
            view.setVisibility(0);
            udt.A01.setVisibility(8);
            view = udt.A00;
        }
        view.setVisibility(8);
        for (C14885UDn uDn : uby.A02) {
            0qQ.A0B(uDn, 0);
            View view2 = uDn.A00;
            Context context = view2.getContext();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
            0nA.A0Z(view2, dimensionPixelOffset);
            0nA.A0b(view2, dimensionPixelOffset2);
            View view3 = uDn.A01;
            0nA.A0Z(view3, dimensionPixelOffset2);
            0nA.A0b(view3, dimensionPixelOffset);
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
            View view4 = uDn.A02;
            0nA.A0e(view4, dimensionPixelOffset3);
            0nA.A0T(view4, dimensionPixelOffset3);
            List list = uDn.A03;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view5 = (View) list.get(i);
                int i2 = 8;
                int i3 = 8;
                if (i < 3) {
                    i3 = 0;
                }
                view5.setVisibility(i3);
                View view6 = (View) uDn.A04.get(i);
                if (i < 3) {
                    i2 = 0;
                }
                view6.setVisibility(i2);
            }
        }
        uby.A00.A02();
    }
}
