package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NOC extends C232222tE {
    public final C70494O8t A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68003MyV(DbT.A0D(layoutInflater, viewGroup, R.layout.pending_threads_hidden_words_folder_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C71958Otj otj = (C71958Otj) r7;
        C68003MyV myV = (C68003MyV) r8;
        AnonymousClass7TG.A1N(otj, myV);
        int i = otj.A00;
        int i2 = 1;
        if (i > 0) {
            TextView textView = myV.A02;
            Context context = myV.A00;
            textView.setText(DbY.A0d(context.getResources(), i, R.plurals.direct_pending_story_replies_row_subtitle_new_requests));
            DbY.A12(textView, context);
        } else {
            i2 = 0;
        }
        TextView textView2 = myV.A03;
        textView2.setTypeface(textView2.getTypeface(), i2);
        myV.A02.setTypeface(textView2.getTypeface(), i2);
        C71402Ok1.A00(myV.A01, 37, this);
    }

    public final Class modelClass() {
        return C71958Otj.class;
    }

    public NOC(C70494O8t o8t) {
        this.A00 = o8t;
    }
}
