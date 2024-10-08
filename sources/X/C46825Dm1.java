package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Dm1  reason: case insensitive filesystem */
public final class C46825Dm1 extends 2Rw {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C46825Dm1(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final int getItemCount() {
        int A032;
        int A05;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(247116821);
            A05 = DbS.A05(this.A03);
            i = 1167249860;
        } else {
            A032 = AnonymousClass0fD.A03(780541276);
            A05 = DbS.A05(this.A03);
            i = -1439972312;
        }
        AnonymousClass0fD.A0A(i, A032);
        return A05;
    }

    public final void onBindViewHolder(C249703kE r5, int i) {
        if (this.A00 != 0) {
            String A19 = AnonymousClass7TE.A19((List) this.A03, i);
            if (r5 instanceof C46923Dnd) {
                FNi fNi = new FNi(this, A19, i);
                C46923Dnd dnd = (C46923Dnd) r5;
                0qQ.A0B(dnd, 0);
                dnd.A00.setText(A19);
                AnonymousClass0fU.A00(fNi, dnd.itemView);
                return;
            }
            return;
        }
        String A192 = AnonymousClass7TE.A19((List) this.A03, i);
        ((TextView) r5.itemView).setText(A192);
        AnonymousClass0fU.A00(new C50101FOr(A192, (Object) this, 13), r5.itemView);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.A00 != 0) {
            return new C46923Dnd(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.username_suggestion_row_view, false));
        }
        Context context = (Context) this.A02;
        TextView textView = new TextView(context);
        textView.setTextSize(2, context.getResources().getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size) / AnonymousClass7TF.A0E(context).density);
        textView.setBackgroundResource(R.drawable.reg_username_suggestion_button);
        DbY.A11(textView, context);
        return new C60683JpU(textView, 1, this);
    }
}
