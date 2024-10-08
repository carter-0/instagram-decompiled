package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Xx  reason: invalid class name */
public final class AnonymousClass9Xx extends BaseAdapter {
    public final Context A00;
    public final TargetViewSizeProvider A01;
    public final WDA A02;
    public final UserSession A03;
    public final List A04;

    public AnonymousClass9Xx(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, WDA wda) {
        0qQ.A0B(context, 2);
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = targetViewSizeProvider;
        this.A02 = wda;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A04 = A1C;
        A1C.add(0sr.A1P(new String[]{"😍", "😂", "😀", "🔥", "😡", "😱", "😢", "🙌️"}));
        A1C.add(0sr.A1P(new String[]{"❤️", "🎉", "👍", "💩", "💯", "🙏", "😮", "😴"}));
        A1C.add(0sr.A1P(new String[]{"😭", "😒", "😎", "😲", "😩", "😐", "😇", "😷"}));
        A1C.add(0sr.A1P(new String[]{"👏", "👀", "🐶", "🐱", "🐷", "🙈", "🙉", "🙊"}));
        A1C.add(0sr.A1P(new String[]{"💔", "🌝", "🌚", "🌞", "👑", "🌈", "💰", "👻"}));
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        0qQ.A0B(viewGroup, 2);
        Context context = this.A00;
        LayoutInflater from = LayoutInflater.from(context);
        if (view == null) {
            view = from.inflate(R.layout.emoji_palette_parent, viewGroup, false);
        }
        0qQ.A0A(from);
        ViewGroup viewGroup2 = (ViewGroup) view;
        if (viewGroup2 != null) {
            List list = (List) this.A04.get(i);
            while (true) {
                if (viewGroup2.getChildCount() >= list.size()) {
                    break;
                }
                View inflate = from.inflate(R.layout.emoji_palette_child, viewGroup2, false);
                0qQ.A0A(inflate);
                0nA.A0f(inflate, (AnonymousClass81W.A00(this.A01) - (AnonymousClass7TG.A02(context) * 2)) / list.size());
                viewGroup2.addView(inflate);
            }
            while (viewGroup2.getChildCount() > list.size()) {
                viewGroup2.removeViewAt(0);
            }
            int size = list.size();
            for (i2 = 0; i2 < size; i2++) {
                String A19 = AnonymousClass7TE.A19(list, i2);
                View childAt = viewGroup2.getChildAt(i2);
                0qQ.A0C(childAt, C273654mx.A00(10));
                ImageView imageView = (ImageView) childAt;
                int A002 = AnonymousClass81W.A00(this.A01);
                AnonymousClass7TG.A1N(context, A19);
                int A022 = AnonymousClass7TF.A02(context, R.dimen.album_preview_add_item_margin);
                C306386Ly A0s = AnonymousClass7TE.A0s(context, A002);
                A0s.A0M(A19);
                A0s.A0A((float) A022);
                imageView.setImageDrawable(A0s);
                AnonymousClass0fU.A00(new W9h(A19, this, 4), imageView);
            }
            return viewGroup2;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int getCount() {
        return this.A04.size();
    }

    public final Object getItem(int i) {
        return this.A04.get(i);
    }
}
