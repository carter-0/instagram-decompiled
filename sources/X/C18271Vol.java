package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.gradient.IGGradientView;
import java.util.List;

/* renamed from: X.Vol  reason: case insensitive filesystem */
public abstract class C18271Vol {
    public static final View A00(Context context, ViewGroup viewGroup) {
        0qQ.A0B(context, 0);
        View A09 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.merchant_hscroll, false);
        UEA uea = new UEA(A09);
        A09.setTag(uea);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A0v(true);
        RecyclerView recyclerView = uea.A04;
        recyclerView.setLayoutManager(linearLayoutManager);
        Resources resources = context.getResources();
        JTP.A1D(recyclerView, AnonymousClass7TE.A0B(resources), AnonymousClass7TE.A0C(resources));
        0nA.A0X(recyclerView, AnonymousClass7TE.A0B(resources));
        return A09;
    }

    public static final void A01(Context context, View.OnClickListener onClickListener, AnonymousClass0iw r9, C17391VTs vTs, C231172qz r11, UEA uea, String str, String str2, List list) {
        AnonymousClass7TG.A1T(context, uea, r9);
        0qQ.A0B(vTs, 6);
        if (str2 != null) {
            C252063oV r0 = uea.A05;
            int i = 0;
            r0.setVisibility(0);
            C13988Tno.A0q(context, r0.getView(), R.attr.igds_color_secondary_background);
            TextView textView = uea.A03;
            if (textView == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (uea.A02 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (uea.A01 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (uea.A00 != null) {
                textView.setText(str2);
                int A02 = JTQ.A02(uea.A02);
                TextView textView2 = uea.A01;
                if (textView2 != null) {
                    textView2.setVisibility(A02);
                }
                TextView textView3 = uea.A00;
                if (textView3 != null) {
                    if (onClickListener == null) {
                        i = 8;
                    }
                    textView3.setVisibility(i);
                }
                if (onClickListener != null) {
                    Drawable drawable = context.getDrawable(R.drawable.instagram_x_pano_outline_12);
                    if (drawable != null) {
                        DbX.A11(context, drawable, 2Yu.A09(context));
                    }
                    TextView textView4 = uea.A00;
                    if (textView4 != null) {
                        DbS.A1C(textView4);
                        textView4.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        AnonymousClass0fU.A00(onClickListener, textView4);
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            uea.A05.setVisibility(8);
        }
        0sn r5 = 0sn.A00;
        RecyclerView recyclerView = uea.A04;
        recyclerView.A0b();
        UB1.A00(recyclerView, vTs, 23);
        int A0H = 2Yu.A0H(context, R.attr.igds_color_secondary_background);
        C252553pI r1 = recyclerView.A0D;
        if (r1 != null) {
            r1.A1P(vTs.A00);
        }
        DbT.A16(context, recyclerView, A0H);
        0nA.A0X(recyclerView, 0);
        UA0 ua0 = recyclerView.A0A;
        if (ua0 == null) {
            UA0 ua02 = new UA0(context, r9);
            ua02.A01 = str;
            0qQ.A0B(r5, 1);
            List list2 = ua02.A05;
            if (C51966G9m.A1a(list2, list)) {
                list2.clear();
                list2.addAll(list);
                DbW.A0z(ua02, r5, ua02.A04);
            }
            ua02.A00 = r11;
            ua02.notifyDataSetChanged();
            recyclerView.setAdapter(ua02);
        } else if (C51966G9m.A1a(ua0.A05, list)) {
            ua0.A01 = str;
            0qQ.A0B(r5, 1);
            List list3 = ua0.A05;
            if (C51966G9m.A1a(list3, list)) {
                list3.clear();
                list3.addAll(list);
                DbW.A0z(ua0, r5, ua0.A04);
            }
            ua0.A00 = r11;
            ua0.notifyDataSetChanged();
            recyclerView.A0o(0);
        } else {
            ua0.notifyDataSetChanged();
        }
        int A03 = AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_background);
        IGGradientView iGGradientView = uea.A07;
        iGGradientView.setVisibility(0);
        iGGradientView.setBackground(C52184GIa.A00(GradientDrawable.Orientation.BOTTOM_TOP, A03));
        IGGradientView iGGradientView2 = uea.A06;
        iGGradientView2.setVisibility(0);
        iGGradientView2.setBackground(C52184GIa.A00(GradientDrawable.Orientation.TOP_BOTTOM, A03));
    }
}
