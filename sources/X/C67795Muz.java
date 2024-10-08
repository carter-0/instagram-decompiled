package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.feed.feeditem.SuggestedChannels;
import java.util.List;

/* renamed from: X.Muz  reason: case insensitive filesystem */
public final class C67795Muz extends 2Rw {
    public SuggestedChannels A00;
    public final AnonymousClass2r8 A01;
    public final Context A02;

    public final void onBindViewHolder(C249703kE r10, int i) {
        SuggestedChannels suggestedChannels;
        List list;
        C74530PwP pwP;
        0qQ.A0B(r10, 0);
        if ((r10 instanceof C68004MyW) && (suggestedChannels = this.A00) != null && (list = suggestedChannels.A00.A07) != null && (pwP = (C74530PwP) list.get(i)) != null) {
            C68004MyW myW = (C68004MyW) r10;
            N5I n5i = (N5I) pwP;
            myW.A03.setUrl(DbS.A0V(n5i.A03), this.A01.A02);
            myW.A02.setText(n5i.A07);
            Context context = this.A02;
            boolean z = false;
            String A0c = DbY.A0c(context, C14066TpE.A01(context.getResources(), Integer.valueOf(n5i.A00), true), 2131974676);
            IgTextView igTextView = myW.A01;
            igTextView.setText(n5i.A05);
            Boolean bool = n5i.A01;
            if (bool != null) {
                z = bool.booleanValue();
            }
            C244273av.A0C(igTextView, z);
            myW.A00.setText(A0c);
            C71409Ok8.A01(r10.itemView, 17, this, pwP);
        }
    }

    public C67795Muz(Context context, AnonymousClass2r8 r2) {
        this.A02 = context;
        this.A01 = r2;
    }

    public final int getItemCount() {
        int i;
        List list;
        int A03 = AnonymousClass0fD.A03(-941725412);
        SuggestedChannels suggestedChannels = this.A00;
        if (suggestedChannels == null || (list = suggestedChannels.A00.A07) == null) {
            i = 0;
        } else {
            i = list.size();
        }
        AnonymousClass0fD.A0A(-619658053, A03);
        return i;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C68004MyW(DbT.A0D(LayoutInflater.from(this.A02), viewGroup, R.layout.suggested_channels_row, C66580MXl.A1Y(viewGroup)));
    }
}
