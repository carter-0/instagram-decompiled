package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public final class UAG extends 2Rw {
    public int A00;
    public final Context A01;
    public final HorizontalRecyclerPager A02;
    public final C2357130x A03;
    public final List A04;

    public final void onBindViewHolder(C249703kE r11, int i) {
        IgImageView igImageView;
        View.OnClickListener wb9;
        0qQ.A0B(r11, 0);
        if (r11 instanceof UD7) {
            C16723V3g v3g = (C16723V3g) 00k.A0O(this.A04, i);
            if (v3g != null) {
                UD7 ud7 = (UD7) r11;
                ud7.A02.setText(v3g.A02);
                ud7.A01.setText(v3g.A01);
                Integer num = v3g.A00;
                if (num != null) {
                    int intValue = num.intValue();
                    ImageView imageView = ud7.A00;
                    imageView.setImageDrawable(AnonymousClass2dd.A00(this.A01.getResources(), intValue));
                    imageView.setVisibility(0);
                }
            }
            UD7 ud72 = (UD7) r11;
            HorizontalRecyclerPager horizontalRecyclerPager = this.A02;
            ViewGroup.LayoutParams layoutParams = horizontalRecyclerPager.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            Context context = this.A01;
            layoutParams2.setMargins(0, 0, 0, DbY.A01(context));
            int i2 = AnonymousClass7TF.A0E(context).widthPixels;
            layoutParams.width = i2;
            layoutParams.height = Math.max(layoutParams.height, (int) (300.0f * C13989Tnp.A03(context)));
            layoutParams2.width = i2 - (context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_left_right_margin) * 2);
            horizontalRecyclerPager.setLayoutParams(layoutParams);
            this.A00 = JTR.A06(context);
            ud72.itemView.setLayoutParams(layoutParams2);
            ud72.itemView.setPadding(0, JTR.A07(context), 0, 0);
            ud72.itemView.setBackgroundResource(R.drawable.netego_layout_border);
            TextView textView = ud72.A01;
            int i3 = this.A00;
            textView.setPadding(i3, 0, i3, 0);
            igImageView = r11.itemView;
            wb9 = new WB1(this, i, 2);
        } else if (r11 instanceof C14853UCh) {
            Context context2 = this.A01;
            C2357130x r4 = this.A03;
            C14853UCh uCh = (C14853UCh) r11;
            if (uCh != null) {
                Drawable A002 = AnonymousClass2dd.A00(context2.getResources(), R.drawable.instagram_business_images_netego_welcome);
                0qQ.A07(A002);
                igImageView = uCh.A01;
                igImageView.setAdjustViewBounds(true);
                igImageView.setImageDrawable(A002);
                IgImageView igImageView2 = uCh.A00;
                if (igImageView2 != null) {
                    Drawable A003 = AnonymousClass2dd.A00(context2.getResources(), R.drawable.instagram_business_images_netego_arrow);
                    0qQ.A07(A003);
                    igImageView2.setImageDrawable(A003);
                    C16943VBv.A00(context2, igImageView2);
                }
                int dimensionPixelSize = AnonymousClass7TF.A0E(context2).widthPixels - (context2.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_left_right_margin) * 2);
                igImageView.setMaxWidth(dimensionPixelSize);
                igImageView.setMinimumWidth(dimensionPixelSize);
                wb9 = new WB9((Object) r4, 6);
            } else {
                return;
            }
        } else {
            return;
        }
        AnonymousClass0fU.A00(wb9, igImageView);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        LayoutInflater from = LayoutInflater.from(this.A01);
        if (i != 0) {
            return new C14853UCh(from.inflate(R.layout.netego_card_image, viewGroup, false));
        }
        View inflate = from.inflate(R.layout.slide_card_new_illustrations, viewGroup, false);
        DbT.A1F(inflate, R.id.placeholder, 0);
        return new UD7(inflate);
    }

    public final void onViewAttachedToWindow(C249703kE r3) {
        IgImageView igImageView;
        0qQ.A0B(r3, 0);
        if ((r3 instanceof C14853UCh) && (igImageView = ((C14853UCh) r3).A00) != null) {
            C16943VBv.A00(this.A01, igImageView);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.V3g] */
    public static void A00(Context context, Integer num, AbstractCollection abstractCollection, int i, int i2) {
        ? obj = new Object();
        obj.A02 = context.getString(i);
        obj.A01 = context.getString(i2);
        obj.A00 = num;
        abstractCollection.add(obj);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.V3g] */
    public UAG(Context context, HorizontalRecyclerPager horizontalRecyclerPager, User user, C2357130x r9) {
        this.A01 = context;
        ArrayList arrayList = new ArrayList();
        String A0g = 002.A0g(context.getString(2131976841), ", ", user.getUsername());
        String A16 = AnonymousClass7TE.A16(context, 2131956509);
        0qQ.A0B(A0g, 1);
        ? obj = new Object();
        obj.A02 = A0g;
        obj.A01 = A16;
        obj.A00 = null;
        arrayList.add(obj);
        A00(context, Integer.valueOf(R.drawable.instagram_business_images_business_new_props_followers), arrayList, 2131963057, 2131964881);
        A00(context, Integer.valueOf(R.drawable.ig_illustrations_illo_ads_megaphone_refresh), arrayList, 2131971307, 2131971306);
        A00(context, Integer.valueOf(R.drawable.instagram_business_images_business_new_props_contacts), arrayList, 2131976962, 2131976961);
        this.A04 = arrayList;
        this.A03 = r9;
        this.A02 = horizontalRecyclerPager;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1005443279);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(6970555, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-1556809062);
        boolean A1Q = AnonymousClass7TF.A1Q(i);
        AnonymousClass0fD.A0A(-423810035, A032);
        return A1Q ? 1 : 0;
    }
}
