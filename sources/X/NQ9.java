package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;

public final class NQ9 extends C232232tF {
    public final C70963OTk A00;

    public NQ9(AnonymousClass0iw r9, UserSession userSession, IgSimpleImageView igSimpleImageView, C68478NJv nJv, QuickSnapReactionEmitterView quickSnapReactionEmitterView, C262224Cq r14, int i) {
        C51974G9v.A1M(userSession, igSimpleImageView, quickSnapReactionEmitterView);
        this.A00 = new C70963OTk(r9, userSession, igSimpleImageView, nJv, quickSnapReactionEmitterView, r14, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r4 >= 0) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r8, X.C249703kE r9) {
        /*
            r7 = this;
            X.Ott r8 = (X.C71968Ott) r8
            X.MzH r9 = (X.C68050MzH) r9
            X.AnonymousClass7TG.A1N(r8, r9)
            X.OTk r3 = r7.A00
            X.NR1 r0 = r9.A00()
            if (r0 == 0) goto L_0x0012
            r0.A0I()
        L_0x0012:
            android.widget.FrameLayout r0 = r9.A01
            r0.removeAllViews()
            java.util.List r5 = r8.A01
            java.util.Iterator r6 = r5.iterator()
            r4 = 0
        L_0x001e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r6.next()
            X.GnY r0 = (X.C53401GnY) r0
            X.NJv r2 = r3.A02
            java.lang.String r1 = r0.A04
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.36N r0 = X.C68478NJv.A03(r2)
            X.L50 r0 = r0.A04
            java.util.Set r0 = r0.A01
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0058
            if (r4 < 0) goto L_0x005b
        L_0x0044:
            r1 = 0
        L_0x0045:
            int r0 = r1 + r4
            X.C70963OTk.A00(r8, r9, r3, r0)
            int r1 = r1 + 1
            r0 = 3
            if (r1 < r0) goto L_0x0045
            android.view.View r0 = r9.itemView
            r0.setTag(r9)
            r9.A01()
            return
        L_0x0058:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x005b:
            int r4 = r5.size()
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQ9.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C71968Ott.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r4) {
        C68050MzH mzH = (C68050MzH) r4;
        0qQ.A0B(mzH, 0);
        C70963OTk oTk = this.A00;
        NR1 A002 = mzH.A00();
        if (A002 != null) {
            A002.A04 = false;
            A002.A0I();
        }
        oTk.A01.clearAnimation();
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        C70963OTk oTk = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.quick_snap_consumption_viewer_item_container, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(2));
        return new C68050MzH((FrameLayout) inflate, oTk.A02);
    }
}
