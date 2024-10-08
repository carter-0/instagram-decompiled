package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Muv  reason: case insensitive filesystem */
public final class C67791Muv extends C322136vJ {
    public static final C67769MuT A04 = new C67769MuT(3);
    public RecyclerView A00;
    public OK5 A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        this.A00 = recyclerView;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.layout_cowatch_playback_carousel_page, viewGroup, false);
        C71396Ojv.A00(inflate, 31, this);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C67924MxA(inflate, this.A02, this.A03);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        this.A00 = null;
    }

    public C67791Muv(AnonymousClass0iw r2, UserSession userSession) {
        super((C252303ot) A04);
        this.A02 = r2;
        this.A03 = userSession;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r3, int i) {
        C67924MxA mxA = (C67924MxA) r3;
        0qQ.A0B(mxA, 0);
        C68295N9i n9i = (C68295N9i) getItem(i);
        if (n9i != null) {
            mxA.A00.ADN(n9i);
        }
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r2) {
        C67924MxA mxA = (C67924MxA) r2;
        0qQ.A0B(mxA, 0);
        mxA.A00.A00();
    }
}
