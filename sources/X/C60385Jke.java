package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Jke  reason: case insensitive filesystem */
public final class C60385Jke extends 2Rw {
    public final View.OnClickListener A00;
    public final /* synthetic */ C60715Jq4 A01;

    public C60385Jke(View.OnClickListener onClickListener, C60715Jq4 jq4) {
        this.A01 = jq4;
        this.A00 = onClickListener;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        C62592KiP kiP;
        C60533Jn4 jn4 = (C60533Jn4) r7;
        0qQ.A0B(jn4, 0);
        C66568MWw mWw = (C66568MWw) this.A01.A03.get(i);
        View.OnClickListener onClickListener = this.A00;
        AnonymousClass7TF.A1H(mWw, onClickListener);
        View view = jn4.itemView;
        0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame");
        C60060Jeb jeb = (C60060Jeb) view;
        C60715Jq4 jq4 = jn4.A00;
        if (jq4.A04) {
            kiP = C62592KiP.FILTER_DARK;
        } else {
            kiP = C62592KiP.FILTER;
        }
        jeb.setConfig(kiP);
        jeb.A00 = jq4.A01;
        jeb.A02 = jq4.A05;
        jeb.A03(mWw, false);
        jeb.setContentDescription(mWw.getName());
        AnonymousClass0fU.A00(onClickListener, jeb);
        jeb.setDraggable(false);
        boolean z = jq4.A06;
        C60070Jez jez = jeb.A05;
        jez.A07 = z;
        jez.invalidate();
        int i2 = jq4.A00;
        jq4.A00 = i2 + 1;
        jeb.setId(i2);
        JTP.A14(jeb, -2, -1);
        C63695L3f l3f = new C63695L3f(jeb, C66568MWw.A00(jez));
        C64168LRo lRo = jq4.A01;
        if (lRo != null) {
            Context A0S = AnonymousClass7TE.A0S(jq4);
            ImmutableList of = ImmutableList.of(l3f);
            0qQ.A07(of);
            lRo.A07(A0S, of);
        }
        C66501MUf mUf = jq4.A02;
        if (mUf != null) {
            mUf.Drc(jeb);
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C60715Jq4 jq4 = this.A01;
        return new C60533Jn4(new C60060Jeb(AnonymousClass7TE.A0S(jq4)), jq4);
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(867448455);
        int size = this.A01.A03.size();
        AnonymousClass0fD.A0A(-289477724, A03);
        return size;
    }
}
