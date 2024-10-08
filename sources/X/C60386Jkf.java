package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.Jkf  reason: case insensitive filesystem */
public final class C60386Jkf extends 2Rw {
    public List A00 = 0sn.A00;
    public final MV2 A01;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r8, int i) {
        int i2;
        C60636Joj joj = (C60636Joj) r8;
        0qQ.A0B(joj, 0);
        joj.A03.setVisibility(8);
        TextView textView = joj.A02;
        textView.setVisibility(0);
        textView.setText(((C61079JwH) this.A00.get(i)).A02);
        Number number = (Number) ((C61079JwH) this.A00.get(i)).A00;
        View view = joj.A00;
        if (number != null) {
            Context context = view.getContext();
            int A012 = DbY.A01(context);
            view.setPadding(A012, A012, A012, A012);
            ImageView imageView = joj.A01;
            DbU.A13(context, imageView, number.intValue());
            imageView.setVisibility(0);
        } else {
            Context context2 = view.getContext();
            int A02 = AnonymousClass7TG.A02(context2);
            int A05 = JTR.A05(context2);
            view.setPadding(A02, A05, A02, A05);
            joj.A01.setVisibility(8);
        }
        Object obj = ((C61079JwH) this.A00.get(i)).A01;
        if (0qQ.A0K(obj, C61723KJo.A00)) {
            DbT.A18(textView.getContext(), textView, 2131969548);
            i2 = 64;
        } else if (0qQ.A0K(obj, C61722KJn.A00)) {
            i2 = 65;
        } else if (0qQ.A0K(obj, C61721KJm.A00)) {
            i2 = 66;
        } else if (0qQ.A0K(obj, C61724KJp.A00)) {
            i2 = 67;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        LY1.A00(view, i2, this);
    }

    public C60386Jkf(MV2 mv2) {
        this.A01 = mv2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1861111966);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(806518096, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return C64005LIl.A01(viewGroup);
    }
}
