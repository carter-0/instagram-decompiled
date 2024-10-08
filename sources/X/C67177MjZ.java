package X;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.MjZ  reason: case insensitive filesystem */
public final class C67177MjZ extends C232232tF {
    public final Activity A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(C73911Plm.A00(this, 37));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(C73911Plm.A00(this, 38));
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(C73911Plm.A00(this, 39));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(C73911Plm.A00(this, 40));

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68013Myf(DbT.A0D(layoutInflater, viewGroup, R.layout.partnerships_inbox_row_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        IgSimpleImageView igSimpleImageView;
        AnonymousClass0eM r0;
        NPJ npj = (NPJ) r4;
        C68013Myf myf = (C68013Myf) r5;
        AnonymousClass7TF.A1H(npj, myf);
        C71397Ojw.A00(myf.A00, 58, npj);
        myf.A02.setImageDrawable(JTO.A0D(this.A03));
        boolean z = npj.A01;
        IgTextView igTextView = myf.A03;
        if (z) {
            igTextView.setTypeface(Typeface.DEFAULT_BOLD);
            IgView igView = myf.A04;
            igView.setVisibility(0);
            igView.setBackground(JTO.A0D(this.A04));
            igSimpleImageView = myf.A01;
            r0 = this.A02;
        } else {
            igTextView.setTypeface(Typeface.DEFAULT);
            myf.A04.setVisibility(8);
            igSimpleImageView = myf.A01;
            r0 = this.A01;
        }
        C66581MXm.A1C(igSimpleImageView, DbX.A07(r0));
        C66633Ma2 ma2 = npj.A00.A00;
        UserSession A0p = ma2.A0p();
        AnonymousClass4DH r1 = ma2.A1J;
        0qQ.A0B(A0p, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, A0p), "ig_branded_content_event");
        if (A0e.isSampled()) {
            A0e.AAJ(TraceFieldType.AdhocEventName, "bc_partnership_inbox_row_impression");
            A0e.Cgf();
        }
    }

    public final Class modelClass() {
        return NPJ.class;
    }

    public C67177MjZ(Activity activity) {
        this.A00 = activity;
    }
}
