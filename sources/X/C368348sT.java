package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.8sT  reason: invalid class name and case insensitive filesystem */
public final class C368348sT extends 2Rw {
    public final Context A00;
    public final C355148Ov A01;
    public final List A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = R.layout.context_menu_item;
        if (i == 2) {
            i2 = R.layout.context_menu_item_secondary;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C380579Ys(inflate, this);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r19, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Drawable drawable;
        C380579Ys r6 = (C380579Ys) r19;
        0qQ.A0B(r6, 0);
        List list = this.A02;
        int i2 = i;
        C367618rI r7 = (C367618rI) 00k.A0O(list, i2);
        if (r7 != null) {
            Context context = this.A00;
            Drawable drawable2 = context.getDrawable(R.drawable.instagram_check_pano_outline_24);
            TextView textView = r6.A07;
            String str = r7.A08;
            textView.setText(str);
            C15048ULb uLb = r7.A05;
            if (!(uLb == null || (drawable = context.getDrawable(uLb.A00)) == null)) {
                drawable.setColorFilter(AnonymousClass37O.A00(textView.getCurrentTextColor()));
                drawable.setBounds(0, 0, (int) textView.getTextSize(), (int) textView.getTextSize());
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new C2606346l(drawable), uLb.A03, uLb.A01, uLb.A02);
                textView.setText(spannableString);
            }
            int i3 = r7.A01;
            if (i3 != 0) {
                textView.setMinWidth(i3);
            }
            if (r7.A09) {
                textView.setSingleLine(false);
            }
            Drawable drawable3 = r7.A04;
            if (drawable3 != null) {
                ImageView imageView = r6.A05;
                imageView.setImageDrawable(drawable3);
                imageView.setVisibility(0);
                int i4 = r7.A02;
                if (i4 != 0) {
                    imageView.getLayoutParams().height = i4;
                    imageView.getLayoutParams().width = i4;
                }
                imageView.setColorFilter(context.getColor(2Yu.A0B(context)));
            }
            boolean z = r7.A0E;
            if (!z) {
                drawable2 = r7.A03;
            }
            ImageView imageView2 = r6.A04;
            if (drawable2 != null) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setVisibility(0);
                int i5 = r7.A00;
                if (i5 != 0) {
                    imageView2.getLayoutParams().height = i5;
                    imageView2.getLayoutParams().width = i5;
                }
                imageView2.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_icon)));
            } else {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginStart(0);
                }
            }
            if (r7.A0F) {
                TextView textView2 = r6.A06;
                textView2.setVisibility(0);
                0oe.A01(textView2, AnonymousClass05K.A00, false);
            }
            if (this.A03) {
                int color = context.getColor(2Yu.A0H(context, R.attr.igds_color_text_on_color));
                int color2 = context.getColor(R.color.gradient_dark);
                int color3 = context.getColor(R.color.badge_color);
                int color4 = context.getColor(R.color.grey_4);
                if (z) {
                    color = color3;
                } else if (r7.A0D) {
                    color = color4;
                }
                textView.setTextColor(color);
                if (drawable3 != null) {
                    r6.A05.setColorFilter(color);
                }
                if (r7.A03 != null) {
                    imageView2.setColorFilter(color);
                }
                r6.A01.setBackgroundColor(color2);
            }
            Integer num = r7.A07;
            if (num != null) {
                int color5 = context.getColor(num.intValue());
                r6.A05.setColorFilter(color5);
                imageView2.setColorFilter(color5);
                textView.setTextColor(color5);
            }
            View view = r6.A00;
            AnonymousClass0fU.A00(new C40011ANr(r7, this), view);
            view.setOnTouchListener(new AP1(r7));
            view.setContentDescription(str);
            boolean z2 = r7.A0C;
            if (z2) {
                2eS.A04(view, AnonymousClass05K.A01);
            }
            if (i2 == list.size() - 1 || !r7.A0A) {
                r6.A01.setVisibility(8);
            }
            boolean z3 = r7.A0B;
            View view2 = r6.A02;
            if (z3) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
            }
            view.setAlpha(1.0f);
            view.setClickable(z2);
        }
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r3) {
        C380579Ys r32 = (C380579Ys) r3;
        0qQ.A0B(r32, 0);
        FrameLayout frameLayout = r32.A03;
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
            frameLayout.setVisibility(8);
        }
    }

    public C368348sT(Context context, C355148Ov r2, List list, boolean z) {
        this.A00 = context;
        this.A02 = list;
        this.A01 = r2;
        this.A03 = z;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(2063400805);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-900510729, A032);
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r2 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = 864652947(0x33898e93, float:6.405494E-8)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.util.List r0 = r4.A02
            java.lang.Object r0 = X.00k.A0O(r0, r5)
            X.8rI r0 = (X.C367618rI) r0
            if (r0 == 0) goto L_0x0019
            boolean r2 = r0.A0D
            r1 = 2
            r0 = -717482917(0xffffffffd53c145b, float:-1.29247258E13)
            if (r2 != 0) goto L_0x001d
        L_0x0019:
            r1 = 1
            r0 = -1861165941(0xffffffff9110dc8b, float:-1.1427557E-28)
        L_0x001d:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368348sT.getItemViewType(int):int");
    }
}
