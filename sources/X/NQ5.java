package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

public final class NQ5 extends C232232tF {
    public final long A00;
    public final long A01;
    public final Context A02;
    public final O7R A03;
    public final C294875nB A04;
    public final boolean A05;
    public final boolean A06;

    public NQ5(Context context, O7R o7r, C294875nB r4, long j, long j2, boolean z, boolean z2) {
        AnonymousClass7TF.A1E(context, 1, r4);
        this.A02 = context;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = o7r;
        this.A04 = r4;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        NPB npb = (NPB) r5;
        C67932MxI mxI = (C67932MxI) r6;
        boolean A1Z = AnonymousClass7TG.A1Z(npb, mxI);
        List list = npb.A01;
        int i = npb.A00;
        0qQ.A0B(list, A1Z ? 1 : 0);
        C67800Mv4 mv4 = mxI.A00.A0A;
        0qQ.A0C(mv4, "null cannot be cast to non-null type com.instagram.ui.search.recyclerview.DirectInboxSearchPillPromptAdapter");
        C67800Mv4 mv42 = mv4;
        mv42.A01 = list;
        mv42.A00 = i;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context context = this.A02;
        boolean z = this.A06;
        boolean z2 = this.A05;
        long j = this.A00;
        long j2 = this.A01;
        O7R o7r = this.A03;
        C294875nB r3 = this.A04;
        0qQ.A0B(context, 0);
        AnonymousClass7TG.A1S(o7r, r3);
        int i = (int) j2;
        C68082Mzn mzn = new C68082Mzn(context, 0sn.A00, i, 1000, j, z2);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A09 = DbU.A09(LayoutInflater.from(context), (ViewGroup) null, R.layout.meta_ai_pill_keyword, false);
        C68009Myb myb = new C68009Myb(A09);
        AnonymousClass0mH.A00(A09, new J6T(11, (Object) null, (Object) myb), AnonymousClass30K.A03(AnonymousClass30J.SECONDS, 1));
        myb.itemView.measure(View.MeasureSpec.makeMeasureSpec(mzn.getWidth(), SN3.MAX_SIGNED_POWER_OF_TWO), 0);
        C66581MXm.A1B(mzn, -1, (int) (((float) (myb.itemView.getMeasuredHeight() * i)) * 1.5f));
        mzn.setAdapter(new C67800Mv4(context, o7r, r3, z));
        mzn.setVisibility(0);
        return new C67932MxI(mzn);
    }

    public final Class modelClass() {
        return NPB.class;
    }
}
