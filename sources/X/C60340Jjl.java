package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jjl  reason: case insensitive filesystem */
public final class C60340Jjl extends PagingDataAdapter {
    public final Activity A00;
    public final AnonymousClass07V A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C64111LNs A04;
    public final C60211JhU A05;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.clips_acr_browser_item_layout, viewGroup, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass0iw r4 = this.A02;
        UserSession userSession = this.A03;
        0qQ.A0A(inflate);
        C60211JhU jhU = this.A05;
        C64111LNs lNs = this.A04;
        return new C60690Jpb(this.A00, inflate, this.A01, r4, userSession, lNs, jhU);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r2, int i) {
        C60690Jpb jpb = (C60690Jpb) r2;
        0qQ.A0B(jpb, 0);
        C60979Jub jub = (C60979Jub) A02(i);
        if (jub != null) {
            jpb.A01(jub, i);
        }
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r5) {
        MediaComposition mediaComposition;
        C60690Jpb jpb = (C60690Jpb) r5;
        0qQ.A0B(jpb, 0);
        C60979Jub jub = jpb.A01;
        if (!(jub == null || (mediaComposition = jub.A01) == null)) {
            C64111LNs lNs = jpb.A0D;
            LVA lva = (LVA) lNs.A01.remove(mediaComposition);
            if (lva != null) {
                lva.isPlaying = false;
                lva.A01.A07();
            }
            lNs.A00 = -1;
        }
        jpb.A01 = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60340Jjl(android.app.Activity r3, X.AnonymousClass07V r4, X.AnonymousClass0iw r5, com.instagram.common.session.UserSession r6, X.C64111LNs r7, X.C60211JhU r8) {
        /*
            r2 = this;
            X.C51974G9v.A1M(r6, r8, r7)
            r0 = 5
            X.0qQ.A0B(r4, r0)
            X.JkA r1 = X.C60362JkA.A00
            X.4CZ r0 = X.AnonymousClass12W.A00
            X.134 r0 = X.AnonymousClass12y.A00
            r2.<init>(r1, r0)
            r2.A02 = r5
            r2.A03 = r6
            r2.A05 = r8
            r2.A04 = r7
            r2.A01 = r4
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60340Jjl.<init>(android.app.Activity, X.07V, X.0iw, com.instagram.common.session.UserSession, X.LNs, X.JhU):void");
    }
}
