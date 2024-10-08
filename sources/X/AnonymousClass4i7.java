package X;

import android.view.View;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.4i7  reason: invalid class name */
public final class AnonymousClass4i7 implements View.OnClickListener {
    public final /* synthetic */ C229122ms A00;
    public final /* synthetic */ LoadMoreButton A01;
    public final /* synthetic */ C230682q1 A02;

    public AnonymousClass4i7(C229122ms r1, LoadMoreButton loadMoreButton, C230682q1 r3) {
        this.A01 = loadMoreButton;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-197086373);
        LoadMoreButton loadMoreButton = this.A01;
        C229122ms r0 = loadMoreButton.A00;
        r0.getClass();
        r0.CgO();
        loadMoreButton.setViewType(this.A00, this.A02);
        AnonymousClass0fD.A0C(328258499, A05);
    }
}
