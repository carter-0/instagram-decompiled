package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NPt  reason: case insensitive filesystem */
public final class C68623NPt extends C232232tF {
    public final C14140Tqa A00;
    public final XAH A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A0D = DbT.A0D(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.meta_ai_pill_keyword, false);
        A0D.setTag(new OEY(A0D));
        C249703kE r1 = new C249703kE(A0D);
        if (A0D.getTag() instanceof OEY) {
            return r1;
        }
        throw DbT.A0m();
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C69171Nfu nfu = (C69171Nfu) r8;
        boolean A1U = AnonymousClass7TF.A1U(0, nfu, r9);
        Object tag = r9.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.MetaAiPillViewBinder.Holder");
        OEY oey = (OEY) tag;
        C14140Tqa tqa = this.A00;
        XAH xah = this.A01;
        DbZ.A0t(0, oey, tqa, xah);
        View view = oey.A01;
        C69157Nfg nfg = nfu.A00;
        xah.ECK(view, nfg, nfu.A00);
        TextView textView = oey.A02;
        N5G n5g = (N5G) nfg.A00;
        textView.setText(n5g.A01);
        oey.A00.setText(n5g.A02);
        AnonymousClass0mH.A00(view, new C74186PqS(39, (Object) nfu, (Object) tqa), AnonymousClass30K.A03(AnonymousClass30J.SECONDS, A1U ? 1 : 0));
    }

    public final Class modelClass() {
        return C69171Nfu.class;
    }

    public C68623NPt(C14140Tqa tqa, XAH xah) {
        this.A00 = tqa;
        this.A01 = xah;
    }
}
