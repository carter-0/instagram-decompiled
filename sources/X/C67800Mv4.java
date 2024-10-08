package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectSearchResult;
import java.util.List;

/* renamed from: X.Mv4  reason: case insensitive filesystem */
public final class C67800Mv4 extends 2Rw {
    public int A00;
    public List A01 = 0sn.A00;
    public final Context A02;
    public final O7R A03;
    public final C294875nB A04;
    public final boolean A05;

    public final void onBindViewHolder(C249703kE r12, int i) {
        0qQ.A0B(r12, 0);
        if (r12 instanceof C68009Myb) {
            View A0F = JTO.A0F(r12);
            this.A04.DpB(A0F, (C67058MhZ) null, (DirectSearchResult) this.A01.get(i), "direct_user_search", 40, i % 3, i, -1, false);
            C68009Myb myb = (C68009Myb) r12;
            DirectSearchPrompt directSearchPrompt = (DirectSearchPrompt) this.A01.get(i);
            int i2 = this.A00;
            AnonymousClass7TF.A1H(myb, directSearchPrompt);
            TextView textView = myb.A02;
            String str = directSearchPrompt.A01;
            textView.setText(str);
            textView.setContentDescription(textView.getContext().getString(2131966287, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2), str}));
            myb.A03.setText(directSearchPrompt.A03);
            myb.A01 = directSearchPrompt;
            myb.A00 = i;
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Context context = this.A02;
        boolean z = this.A05;
        O7R o7r = this.A03;
        View A09 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.meta_ai_pill_keyword, false);
        C68009Myb myb = new C68009Myb(A09);
        AnonymousClass0mH.A00(A09, new J6T(11, (Object) o7r, (Object) myb), AnonymousClass30K.A03(AnonymousClass30J.SECONDS, 1));
        if (!z) {
            myb.A02.setVisibility(8);
        }
        return myb;
    }

    public C67800Mv4(Context context, O7R o7r, C294875nB r4, boolean z) {
        this.A02 = context;
        this.A05 = z;
        this.A03 = o7r;
        this.A04 = r4;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1705617213);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-1607989954, A032);
        return size;
    }
}
