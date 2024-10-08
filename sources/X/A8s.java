package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;

public final class A8s {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C322936we A01;
    public final /* synthetic */ String A02;

    public A8s(C322936we r1, String str, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = str;
    }

    public final void A00(RecyclerView recyclerView) {
        C322936we r3 = this.A01;
        int i = this.A00;
        Reel A03 = r3.A07.A03(this.A02);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(A03);
        C322936we.A00(recyclerView, A03, AnonymousClass3BQ.PROFILE_HIGHLIGHT_PERMALINK, r3, (C20960X6n) null, A1C, i);
    }
}
