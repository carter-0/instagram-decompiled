package X;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.Iterator;
import java.util.List;

public final class PMC implements C74361Ptb {
    public C72724PHe A00;
    public final Context A01;
    public final View A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        N9T n9t = (N9T) pry;
        0qQ.A0B(n9t, 0);
        JTO.A0I(this.A06).setText(n9t.A00);
        JTO.A0I(this.A07).setText(n9t.A01);
        List list = n9t.A02;
        if (list != null) {
            ViewModelListUpdate A0R = DbS.A0R();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0R.A00(new N5M(AnonymousClass7TE.A18(it)));
            }
            ((AnonymousClass2t9) this.A08.getValue()).A05(A0R);
        }
        AnonymousClass0eM r3 = this.A09;
        int count = ((ArrayAdapter) r3.getValue()).getCount();
        List list2 = n9t.A03;
        if (count != list2.size()) {
            ((ArrayAdapter) r3.getValue()).clear();
            ((ArrayAdapter) r3.getValue()).addAll(list2);
            0fE.A00((BaseAdapter) r3.getValue(), -1620706576);
        }
        DbW.A1R(this.A04, 0);
    }

    public PMC(View view) {
        this.A02 = view;
        this.A01 = AnonymousClass7TE.A0S(view);
        AnonymousClass0eM A002 = C73906Plh.A00(this, 20);
        this.A05 = A002;
        0eO r4 = 0eO.A02;
        this.A06 = AnonymousClass0eN.A00(r4, new GL8(R.id.debug_sheet_text_content, 28, A002, (Object) null));
        this.A07 = AnonymousClass0eN.A00(r4, new GL8(R.id.debug_sheet_media_stats_call_level_text_view, 28, A002, (Object) null));
        this.A04 = AnonymousClass0eN.A00(r4, new GL8(R.id.debug_sheet_media_stats_search_view, 28, A002, new C74180PqM(this, 16)));
        this.A08 = AnonymousClass0eN.A00(r4, new GL8(R.id.debug_sheet_media_stats_stream_level_recycler_view, 29, A002, new C74180PqM(this, 18)));
        this.A09 = AnonymousClass0eN.A00(r4, new GL8(R.id.debug_sheet_media_stats_spinner, 29, A002, new C74180PqM(this, 19)));
        this.A03 = AnonymousClass0eN.A00(r4, new GL8(R.id.bottom_sheet_contents, 27, view, (Object) null));
    }
}
