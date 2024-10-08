package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Mjh  reason: case insensitive filesystem */
public final class C67185Mjh extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67944MxU(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_general_folder_hmps_banner_v2, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        if (r1 == X.C67220MkG.A0E) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r6, X.C249703kE r7) {
        /*
            r5 = this;
            X.NPD r6 = (X.NPD) r6
            X.MxU r7 = (X.C67944MxU) r7
            X.AnonymousClass7TG.A1N(r6, r7)
            r3 = 0
            com.instagram.igds.components.banner.IgdsBanner r2 = r7.A00
            int r0 = r6.A00
            r2.setIcon((int) r0)
            java.lang.String r1 = r6.A02
            r0 = 0
            X.DbT.A1U(r2, r1, r3)
            boolean r1 = r6.A04
            r2.setDismissible(r1)
            boolean r1 = r6.A05
            if (r1 == 0) goto L_0x0020
            java.lang.String r0 = r6.A03
        L_0x0020:
            r2.setAction((java.lang.CharSequence) r0)
            android.content.Context r1 = r2.getContext()
            int r0 = X.2Yu.A0C(r1)
            X.DbT.A16(r1, r2, r0)
            X.PHJ r1 = r6.A01
            r2.A00 = r1
            r2.setVisibility(r3)
            java.lang.Object r0 = r1.A02
            X.Mbh r0 = (X.C66736Mbh) r0
            com.instagram.common.session.UserSession r4 = r0.A0B
            X.0iw r3 = r0.A05
            java.lang.Object r1 = r1.A01
            X.MkG r1 = (X.C67220MkG) r1
            X.MkG r0 = X.C67220MkG.DEFAULT
            if (r1 == r0) goto L_0x005f
            X.MkG r0 = X.C67220MkG.GENERAL_FOLDER_RECOVERED_BANNER
            if (r1 == r0) goto L_0x005f
            X.MkG r0 = X.C67220MkG.NEW_THREADS_THROTTLED_BANNER
            if (r1 == r0) goto L_0x0052
            X.MkG r0 = X.C67220MkG.NEW_THREADS_THROTTLED_LIGHT_BANNER
            r2 = 2
            if (r1 != r0) goto L_0x0053
        L_0x0052:
            r2 = 1
        L_0x0053:
            boolean r0 = r1.A04
            java.lang.Boolean r1 = X.DbT.A0l(r0)
            java.lang.String r0 = "business_inbox_hmps_banner_impression"
            X.C3265677h.A0P(r3, r4, r1, r0, r2)
            return
        L_0x005f:
            r2 = 0
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67185Mjh.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return NPD.class;
    }
}
