package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MuN  reason: case insensitive filesystem */
public final class C67763MuN extends PagingDataAdapter {
    public final O9E A00;
    public final 0sL A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67763MuN(X.O9E r3, X.0sL r4) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.MuU r1 = X.C67770MuU.A00
            X.4CZ r0 = X.AnonymousClass12W.A02
            X.134 r0 = X.AnonymousClass12y.A00
            r2.<init>(r1, r0)
            r2.A00 = r3
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67763MuN.<init>(X.O9E, X.0sL):void");
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C68044MzB(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.story_template_discovery_surface_section_view, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C68044MzB mzB = (C68044MzB) r5;
        0qQ.A0B(mzB, 0);
        C61076JwE jwE = (C61076JwE) A02(i);
        if (jwE != null) {
            Object obj = jwE.A00;
            if (obj == C48117EWj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE || obj == null) {
                JTS.A1W(mzB.A03, 0);
                mzB.A02.setVisibility(8);
            } else {
                IgTextView igTextView = mzB.A02;
                igTextView.setText(jwE.A01);
                AnonymousClass7TE.A1U(AnonymousClass7TH.A06(mzB.A03), true);
                C294975nL.A07(new View[]{igTextView}, true);
            }
            Object obj2 = jwE.A00;
            if (obj2 != null) {
                this.A01.invoke(mzB.A01, obj2);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r3) {
        C68044MzB mzB = (C68044MzB) r3;
        0qQ.A0B(mzB, 0);
        mzB.A02.setText((CharSequence) null);
    }
}
