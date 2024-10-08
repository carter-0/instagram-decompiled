package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Dlo  reason: case insensitive filesystem */
public final class C46812Dlo extends C322136vJ {
    public final G6N A00;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46972DoQ(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.language_locale_item, false));
    }

    public C46812Dlo(G6N g6n) {
        super((C252303ot) C46803Dlf.A00);
        this.A00 = g6n;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        C46972DoQ doQ = (C46972DoQ) r7;
        0qQ.A0B(doQ, 0);
        C61082JwK jwK = (C61082JwK) getItem(i);
        Context A07 = DbS.A07(doQ);
        C47271Dtz dtz = (C47271Dtz) jwK.A00;
        String A16 = AnonymousClass7TE.A16(A07, dtz.A01);
        doQ.A01.setText(A16);
        String A162 = AnonymousClass7TE.A16(A07, dtz.A00);
        boolean equals = A16.equals(A162);
        int i2 = 8;
        TextView textView = doQ.A02;
        if (equals) {
            textView.setVisibility(8);
        } else {
            textView.setText(A162);
            textView.setVisibility(0);
        }
        FP7.A00(doQ.itemView, 0, jwK, this);
        View view = doQ.A00;
        if (jwK.A01) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    public final long getItemId(int i) {
        int A03 = AnonymousClass0fD.A03(34516534);
        long j = (long) ((C47271Dtz) ((C61082JwK) getItem(i)).A00).A00;
        AnonymousClass0fD.A0A(-1423356075, A03);
        return j;
    }
}
