package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.MnI  reason: case insensitive filesystem */
public final class C67401MnI extends C232222tE {
    public final X47 A00;
    public final C74367Pth A01;
    public final Integer A02;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        int i;
        String string;
        C71969Otu otu = (C71969Otu) r5;
        C67984MyC myC = (C67984MyC) r6;
        AnonymousClass7TG.A1N(otu, myC);
        View view = myC.A00;
        Context A0S = AnonymousClass7TE.A0S(view);
        String str = otu.A01;
        Integer num = this.A02;
        if (!(num == null || (string = A0S.getString(num.intValue())) == null)) {
            str = string;
        }
        myC.A01.setText(str);
        C71409Ok8.A01(view, 29, this, otu);
        boolean z = otu.A00.A0I;
        ? r1 = myC.A02;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        r1.setVisibility(i);
        X47 x47 = this.A00;
        if (x47 != null) {
            x47.EBK(view, otu);
        }
    }

    public final Class modelClass() {
        return C71969Otu.class;
    }

    public C67401MnI(X47 x47, C74367Pth pth, Integer num) {
        this.A01 = pth;
        this.A00 = x47;
        this.A02 = num;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        Integer num = this.A02;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        int i2 = R.layout.row_search_echo;
        if (num == null) {
            i2 = R.layout.row_search_for_x_echo;
        }
        return new C67984MyC(DbT.A0D(layoutInflater, viewGroup, i2, false));
    }
}
