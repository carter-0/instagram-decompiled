package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;
import java.util.Set;

/* renamed from: X.76a  reason: invalid class name and case insensitive filesystem */
public final class C3262576a extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C333127Xt A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.thread_message_seen_indicator, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new AnonymousClass7PU(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r13, C249703kE r14) {
        View view;
        View.OnClickListener onClickListener;
        int i;
        Object[] objArr;
        String string;
        C331007Pc r132 = (C331007Pc) r13;
        AnonymousClass7PU r142 = (AnonymousClass7PU) r14;
        0qQ.A0B(r132, 0);
        0qQ.A0B(r142, 1);
        TextView textView = r142.A02;
        Context context = textView.getContext();
        if (r132.A07) {
            textView.setVisibility(0);
            r142.A00.setVisibility(8);
            textView.setTextColor(r132.A01);
            0qQ.A0A(context);
            textView.setText(AnonymousClass73k.A00(context, r132));
            C3256573p.A00(textView, r132.A08);
            return;
        }
        if (r132.A0B) {
            Set set = r132.A05;
            List A012 = AnonymousClass73m.A01(set);
            int min = Math.min(10, A012.size());
            for (int i2 = 0; i2 < min; i2++) {
                ImageUrl imageUrl = (ImageUrl) ((C376659Iv) A012.get(i2)).A01;
                Object obj = r142.A03.get(i2);
                0qQ.A07(obj);
                IgImageView view2 = ((C252063oV) obj).getView();
                view2.setVisibility(0);
                if (imageUrl != null) {
                    view2.setUrl(imageUrl, this.A00);
                } else {
                    view2.setImageDrawable(context.getDrawable(R.drawable.profile_anonymous_user));
                }
            }
            int size = set.size();
            int size2 = set.size();
            if (size <= 10) {
                while (size2 < 10) {
                    ((C252063oV) r142.A03.get(size2)).setVisibility(8);
                    size2++;
                }
                r142.A01.setVisibility(8);
            } else if (size2 > 10) {
                TextView textView2 = r142.A01;
                textView2.setVisibility(0);
                textView2.setText(context.getString(2131958532, new Object[]{Integer.valueOf(set.size() - 10)}));
            }
            LinearLayout linearLayout = r142.A00;
            0qQ.A0A(context);
            0qQ.A0B(context, 0);
            List A013 = AnonymousClass73m.A01(set);
            if (A013.isEmpty()) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder(((C376659Iv) A013.get(0)).A02);
                int min2 = Math.min(10, A013.size());
                for (int i3 = 1; i3 < min2; i3++) {
                    sb.append(context.getString(2131958531, new Object[]{((C376659Iv) A013.get(i3)).A02}));
                }
                if (A013.size() > 10) {
                    i = 2131958533;
                    objArr = new Object[]{sb.toString(), Integer.valueOf(A013.size() - 10)};
                } else {
                    i = 2131958530;
                    objArr = new Object[]{sb.toString()};
                }
                string = context.getString(i, objArr);
                0qQ.A0A(string);
            }
            linearLayout.setContentDescription(string);
            if (r132.A0A) {
                textView.setText(AnonymousClass73k.A00(context, r132));
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            View view3 = r142.itemView;
            onClickListener = new AnonymousClass9O1(this, r132);
            view = view3;
        } else {
            textView.setVisibility(0);
            r142.A00.setVisibility(8);
            0qQ.A0A(context);
            textView.setText(AnonymousClass73k.A00(context, r132));
            textView.setTextColor(r132.A01);
            if (r132.A09) {
                onClickListener = new C39997ANd(this, r132);
                view = textView;
            } else {
                return;
            }
        }
        AnonymousClass0fU.A00(onClickListener, view);
    }

    public final Class modelClass() {
        return C331007Pc.class;
    }

    public C3262576a(AnonymousClass0iw r1, UserSession userSession, C333127Xt r3) {
        this.A01 = r3;
        this.A00 = r1;
        this.A02 = userSession;
    }
}
