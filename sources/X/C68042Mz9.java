package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.text.ExpandableTextView;

/* renamed from: X.Mz9  reason: case insensitive filesystem */
public final class C68042Mz9 extends C249703kE {
    public 1wn A00;
    public 1wn A01;
    public IgLinearLayout A02;
    public boolean A03;
    public final RecyclerView A04;
    public final ShimmerFrameLayout A05;
    public final 1Ng A06;
    public final UserSession A07;
    public final ExpandableTextView A08;
    public final O7P A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68042Mz9(View view, UserSession userSession, O7P o7p) {
        super(view);
        int A032 = DbW.A03(2, userSession, o7p);
        this.A07 = userSession;
        this.A09 = o7p;
        this.A08 = (ExpandableTextView) AnonymousClass7TE.A0b(view, R.id.snippet_body);
        this.A05 = (ShimmerFrameLayout) AnonymousClass7TE.A0b(view, R.id.meta_ai_snippet_shimmer);
        this.A04 = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.meta_ai_snippet_prompt_pills);
        this.A06 = AnonymousClass1Nd.A00(userSession);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(DbS.A07(this), 0, false);
        RecyclerView recyclerView = this.A04;
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.A12.size() == 0) {
            recyclerView.A11(new C60449Jlh(A032));
        }
    }
}
