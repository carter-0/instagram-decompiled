package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9YP  reason: invalid class name */
public final class AnonymousClass9YP extends 2Rw {
    public final MS2 A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_reel_hashtag, viewGroup, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        C380479Yi r2 = new C380479Yi(inflate, this.A00);
        TextView textView = r2.A01;
        0qQ.A07(context);
        textView.setTypeface(AnonymousClass7TG.A0O(context));
        return r2;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        String str;
        C380479Yi r52 = (C380479Yi) r5;
        0qQ.A0B(r52, 0);
        Hashtag hashtag = (Hashtag) this.A01.get(i);
        String name = hashtag.getName();
        if (name != null) {
            Locale locale = Locale.getDefault();
            0qQ.A07(locale);
            str = name.toUpperCase(locale);
            0qQ.A07(str);
        } else {
            str = "";
        }
        TextView textView = r52.A01;
        textView.setBackgroundResource(R.drawable.reel_hashtag_background);
        textView.setText(0mp.A06("#%s", new Object[]{str}));
        r52.A00 = hashtag;
    }

    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(C249703kE r2) {
        C380479Yi r22 = (C380479Yi) r2;
        0qQ.A0B(r22, 0);
        r22.A02.A02();
    }

    public AnonymousClass9YP(UserSession userSession, MS2 ms2) {
        this.A02 = userSession;
        this.A00 = ms2;
    }

    public final void A00(List list) {
        int size = list.size();
        if (size > 10) {
            size = 10;
        }
        int i = 0;
        for (Object next : list) {
            if (i >= size) {
                break;
            }
            List list2 = this.A01;
            if (!list2.contains(next)) {
                list2.add(next);
                i++;
            }
        }
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1146036520);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(127980251, A03);
        return size;
    }
}
