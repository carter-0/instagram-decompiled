package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.smartcapture.ui.SCImageView;
import com.instagram.android.R;
import java.util.List;

public final class QFY extends 08m {
    public final List A00;

    public QFY(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.ScrollView, X.QAA, android.view.View, java.lang.Object, android.view.ViewGroup] */
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        String str;
        0qQ.A0B(viewGroup, 0);
        List list = this.A00;
        list.get(i);
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        ? scrollView = new ScrollView(A0S);
        View.inflate(A0S, R.layout.sc_ig_onboarding_view, scrollView);
        scrollView.A02 = (SCImageView) SKW.A00(scrollView, R.id.iv_image);
        scrollView.A01 = SKW.A02(scrollView, R.id.tv_title);
        scrollView.A00 = SKW.A02(scrollView, R.id.tv_subtitle);
        TextView textView = scrollView.A01;
        if (textView == null) {
            str = "titleView";
        } else {
            Context A0S2 = AnonymousClass7TE.A0S(scrollView);
            C11408SSf.A04(A0S2, textView, R.attr.sc_primary_text);
            TextView textView2 = scrollView.A00;
            if (textView2 == null) {
                str = "subtitleView";
            } else {
                C11408SSf.A04(A0S2, textView2, R.attr.sc_secondary_text);
                scrollView.set((C10681RwK) list.get(i));
                viewGroup.addView(scrollView);
                return scrollView;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        DbY.A1S(viewGroup, obj);
        viewGroup.removeView((View) obj);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        AnonymousClass7TG.A1N(view, obj);
        return AnonymousClass7TF.A1W(view, obj);
    }
}
