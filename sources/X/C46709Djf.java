package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import java.util.List;

/* renamed from: X.Djf  reason: case insensitive filesystem */
public final class C46709Djf extends BaseAdapter {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final List A03;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = DbV.A0D(viewGroup).inflate(R.layout.slide_card_with_headline, viewGroup, false);
        }
        IgdsHeadline A0U = DbZ.A0U(view, R.id.headline);
        SlideCardViewModel slideCardViewModel = (SlideCardViewModel) this.A03.get(i);
        View findViewById = view.findViewById(R.id.image);
        View findViewById2 = view.findViewById(R.id.circular_image);
        int i2 = slideCardViewModel.A01;
        if (i2 != 0) {
            A0U.setImageDrawable(AnonymousClass2dd.A00(viewGroup.getResources(), i2));
        } else {
            int i3 = slideCardViewModel.A00;
            if (i3 != 0) {
                A0U.setImageResource(i3);
            } else {
                ImageUrl imageUrl = slideCardViewModel.A05;
                if (imageUrl != null) {
                    A0U.setCircularImageUrl(imageUrl, (String) null);
                } else {
                    ImageUrl imageUrl2 = slideCardViewModel.A06;
                    if (imageUrl2 != null) {
                        A0U.setImageURL(imageUrl2, (AnonymousClass0iw) null);
                    } else if (!(findViewById2 == null || findViewById == null)) {
                        findViewById2.setVisibility(8);
                        findViewById.setVisibility(8);
                    }
                }
            }
        }
        String str = slideCardViewModel.A09;
        if (str != null) {
            TextView A0G = DbU.A0G(view, R.id.link2);
            Context context = A0G.getContext();
            DbT.A17(context, A0G, 2Yu.A0D(context));
            A0G.setText(str);
            View.OnClickListener onClickListener = slideCardViewModel.A04;
            if (onClickListener != null) {
                AnonymousClass0fU.A00(onClickListener, A0G);
            }
            A0G.setVisibility(0);
        } else {
            DbX.A1D(view, R.id.link2, 8);
        }
        CharSequence charSequence = slideCardViewModel.A07;
        if (charSequence != null) {
            A0U.setDetailText(charSequence);
        }
        View findViewById3 = view.findViewById(R.id.row_divider);
        if (findViewById3 != null) {
            if (!this.A01 || slideCardViewModel.A06 != null) {
                findViewById3.setVisibility(8);
            } else {
                findViewById3.setVisibility(0);
            }
        }
        String str2 = slideCardViewModel.A0B;
        if (str2 != null) {
            A0U.setHeadline((CharSequence) str2);
        }
        String str3 = slideCardViewModel.A0A;
        if (str3 != null) {
            A0U.setBody(str3, (View.OnClickListener) null);
        } else {
            String str4 = slideCardViewModel.A08;
            if (str4 != null) {
                A0U.setAction(str4, slideCardViewModel.A03);
                return view;
            }
        }
        return view;
    }

    public final int getCount() {
        return this.A03.size();
    }

    public final Object getItem(int i) {
        return this.A03.get(i);
    }

    public C46709Djf(ViewGroup viewGroup, List list, boolean z, boolean z2) {
        int i;
        this.A03 = list;
        this.A01 = z;
        this.A02 = z2;
        DisplayMetrics A0E = AnonymousClass7TF.A0E(viewGroup.getContext());
        int i2 = 0;
        while (true) {
            if (i2 >= this.A03.size()) {
                break;
            }
            View view = getView(i2, (View) null, viewGroup);
            if (view.requireViewById(R.id.placeholder).getVisibility() == 0) {
                this.A00 = -1;
                break;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(A0E.widthPixels, AnonymousClass972.MUTABLE_FLAG_MASK), 0);
            if (this.A00 < view.getMeasuredHeight()) {
                i = view.getMeasuredHeight();
            } else {
                i = this.A00;
            }
            this.A00 = i;
            i2++;
        }
        viewGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, this.A00));
    }
}
