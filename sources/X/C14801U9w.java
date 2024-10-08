package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.U9w  reason: case insensitive filesystem */
public final class C14801U9w extends 2Rw {
    public final C15371UbP A00;
    public final Context A01;
    public final List A02;

    public final void onBindViewHolder(C249703kE r6, int i) {
        Context context = this.A01;
        String text = ((VSD) this.A02.get(i)).A01.getText();
        text.getClass();
        C49804F7q.A01(new C50989Fmc(context, (View.OnClickListener) new WB1(this, i, 14), (CharSequence) text), new FAT(AnonymousClass7TF.A1Q(i), AnonymousClass7TF.A1S(i, getItemCount() - 1), true), (C46894DnA) r6);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return C49804F7q.A00(this.A01, viewGroup);
    }

    public C14801U9w(Context context, C15371UbP ubP, List list) {
        this.A01 = context;
        this.A02 = list;
        this.A00 = ubP;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1699282687);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-432974295, A03);
        return size;
    }
}
