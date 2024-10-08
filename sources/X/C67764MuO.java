package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MuO  reason: case insensitive filesystem */
public final class C67764MuO extends PagingDataAdapter {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final O9D A03;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.story_template_discovery_surface_item_view, viewGroup, false);
        inflate.getLayoutParams().width = this.A01;
        inflate.getLayoutParams().height = this.A00;
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C68046MzD(inflate, this.A02, new C74190PqW(this, 1));
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        if (r3.length() == 0) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r6, int r7) {
        /*
            r5 = this;
            X.MzD r6 = (X.C68046MzD) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r4 = r5.A02(r7)
            X.N3s r4 = (X.C68177N3s) r4
            if (r4 == 0) goto L_0x0053
            X.C3Q r3 = r4.A05
            if (r3 == 0) goto L_0x003b
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r0 = r3.A0A(r0)
            if (r0 == 0) goto L_0x0025
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r6.A08
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            X.0xG r0 = r6.A05
            r2.setUrl(r1, r0)
        L_0x0025:
            com.instagram.common.ui.base.IgTextView r2 = r6.A07
            java.lang.String r0 = X.Dd6.A00()
            java.lang.String r0 = r3.A08(r0)
            r2.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r6.A08
            r0 = 4
            r1.setVisibility(r0)
            r2.setVisibility(r0)
        L_0x003b:
            java.lang.String r0 = r4.A09
            if (r0 == 0) goto L_0x004a
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r6.A09
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            X.0xG r0 = r6.A05
            r2.setUrl(r1, r0)
        L_0x004a:
            X.EWj r1 = r4.A02
            X.EWj r0 = X.C48117EWj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 0
            if (r1 != r0) goto L_0x0054
            r6.A00 = r3
        L_0x0053:
            return
        L_0x0054:
            android.view.View r1 = r6.A04
            X.Oke r0 = new X.Oke
            r0.<init>((X.C68177N3s) r4, (X.C68046MzD) r6)
            r1.setOnTouchListener(r0)
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x00ad
            X.C3R r2 = r4.A06
            if (r2 == 0) goto L_0x00ad
            r6.A01 = r2
            X.PRm r0 = r6.A02
            if (r0 != 0) goto L_0x0070
            r6.A00()
        L_0x0070:
            X.C3R r1 = r6.A01
            if (r1 == 0) goto L_0x007a
            java.lang.String r0 = "url"
            java.lang.String r3 = r1.A0A(r0)
        L_0x007a:
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            java.lang.String r0 = "id"
            java.lang.String r0 = r2.A08(r0)
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = ""
        L_0x0086:
            X.4im r2 = new X.4im
            r2.<init>(r1, r0)
            r2.A0B = r3
            if (r3 == 0) goto L_0x0096
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x0097
        L_0x0096:
            r0 = 1
        L_0x0097:
            r0 = r0 ^ 1
            r2.A0I = r0
            X.3WR r0 = r2.A00()
            r6.A03 = r0
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r2 = r6.A0A
            X.PRl r1 = new X.PRl
            r1.<init>(r0)
            X.0xG r0 = r6.A05
            r2.setVideoSource(r1, r0)
        L_0x00ad:
            r6.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67764MuO.onBindViewHolder(X.3kE, int):void");
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r4) {
        C68046MzD mzD = (C68046MzD) r4;
        0qQ.A0B(mzD, 0);
        C72979PRm pRm = mzD.A02;
        if (pRm != null) {
            ((C14044Tol) pRm.A02.getValue()).A0B("Story Template Discovery Surface media item recycler view recycled");
            pRm.A00 = AnonymousClass05K.A0N;
        }
        mzD.A02 = null;
        mzD.A01 = null;
        mzD.A03 = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67764MuO(com.instagram.common.session.UserSession r3, X.O9D r4, int r5, int r6) {
        /*
            r2 = this;
            X.C51972G9s.A1D(r4, r3)
            X.MuV r1 = X.C67771MuV.A00
            X.4CZ r0 = X.AnonymousClass12W.A02
            X.134 r0 = X.AnonymousClass12y.A00
            r2.<init>(r1, r0)
            r2.A01 = r5
            r2.A00 = r6
            r2.A03 = r4
            r2.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67764MuO.<init>(com.instagram.common.session.UserSession, X.O9D, int, int):void");
    }
}
