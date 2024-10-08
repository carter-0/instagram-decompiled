package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.U9a  reason: case insensitive filesystem */
public final class C14789U9a extends LinearLayoutManager {
    public final /* synthetic */ int A00;
    public final /* synthetic */ QCH A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14789U9a(Context context, QCH qch, int i, int i2) {
        super(context, i, false);
        this.A01 = qch;
        this.A00 = i2;
    }

    public final void A1s(AnonymousClass3AW r5, int[] iArr) {
        int height;
        int i = this.A00;
        QCH qch = this.A01;
        if (i == 0) {
            iArr[0] = qch.A02.getWidth();
            height = qch.A02.getWidth();
        } else {
            iArr[0] = qch.A02.getHeight();
            height = qch.A02.getHeight();
        }
        iArr[1] = height;
    }

    public final void A1T(AnonymousClass3AW r4, RecyclerView recyclerView, int i) {
        C67603Mqb mqb = new C67603Mqb(recyclerView.getContext(), this, 1);
        mqb.A00 = i;
        A0t(mqb);
    }
}
