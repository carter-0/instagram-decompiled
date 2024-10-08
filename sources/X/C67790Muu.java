package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Muu  reason: case insensitive filesystem */
public final class C67790Muu extends C322136vJ {
    public RecyclerView A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final OZx A03;
    public final /* synthetic */ POV A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67790Muu(AnonymousClass0iw r2, UserSession userSession, POV pov, OZx oZx) {
        super((C252303ot) POV.A0D);
        0qQ.A0B(oZx, 4);
        this.A04 = pov;
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = oZx;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        C67766MuQ muQ = new C67766MuQ(this.A04);
        muQ.A00 = false;
        recyclerView.setItemAnimator(muQ);
        this.A00 = recyclerView;
    }

    public final void onBindViewHolder(C249703kE r3, int i) {
        0qQ.A0B(r3, 0);
        C68295N9i n9i = (C68295N9i) getItem(i);
        if (n9i != null && (r3 instanceof C74578PxR)) {
            ((C74361Ptb) r3).ADN(n9i);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C68080Mzl((ViewGroup) DbW.A09(A0F, viewGroup, R.layout.layout_cowatch_playback_vertical_grid, false), this.A01, this.A02, this.A03);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        this.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = r4.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(X.C249703kE r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            boolean r0 = r5 instanceof X.C74578PxR
            if (r0 == 0) goto L_0x0028
            X.POV r3 = r4.A04
            X.N9i r0 = r3.A01
            if (r0 == 0) goto L_0x0028
            X.Put r2 = r0.A05
            if (r2 == 0) goto L_0x0028
            java.util.List r0 = r3.A06
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L_0x0028
            X.PxR r5 = (X.C74578PxR) r5
            X.OK5 r0 = r3.A00
            r5.EqX(r0)
            r1 = 0
            java.lang.Boolean r0 = r3.A04
            r5.E2w(r2, r0, r1)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67790Muu.onViewAttachedToWindow(X.3kE):void");
    }

    public final void onViewDetachedFromWindow(C249703kE r3) {
        0qQ.A0B(r3, 0);
        if (r3 instanceof C74578PxR) {
            C74578PxR pxR = (C74578PxR) r3;
            pxR.EyO("hide");
            pxR.ECY();
            pxR.EqX((OK5) null);
        }
    }

    public final void onViewRecycled(C249703kE r2) {
        0qQ.A0B(r2, 0);
        if (r2 instanceof C74578PxR) {
            C74578PxR pxR = (C74578PxR) r2;
            pxR.onDestroy();
            pxR.ECY();
            pxR.EqX((OK5) null);
        }
    }
}
