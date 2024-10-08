package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.KGq  reason: case insensitive filesystem */
public final class C61666KGq extends C232232tF {
    public boolean A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final C62320sa A04;
    public final C62320sa A05;
    public final 0sP A06;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60524Jmv(new IgdsBanner(AnonymousClass7TE.A0S(viewGroup), (AttributeSet) null, 0));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r13, C249703kE r14) {
        String str;
        C64772Lho lho = (C64772Lho) r13;
        C60524Jmv jmv = (C60524Jmv) r14;
        boolean A1Z = AnonymousClass7TG.A1Z(lho, jmv);
        if (!this.A00) {
            this.A06.invoke(lho.A00);
            this.A00 = A1Z;
        }
        IgdsBanner igdsBanner = jmv.A00;
        Context A0S = AnonymousClass7TE.A0S(igdsBanner);
        C62719KlJ klJ = lho.A01;
        if (klJ instanceof C61334K2v) {
            str = ((C61334K2v) klJ).A00;
        } else {
            str = null;
        }
        int i = this.A01;
        Integer num = this.A03;
        Integer num2 = this.A02;
        EWK ewk = lho.A00;
        C48375EdW.A00(A0S, igdsBanner, num2, num, str, this.A04, this.A05, i, ewk.A01, ewk.A00);
    }

    public final Class modelClass() {
        return C64772Lho.class;
    }

    public C61666KGq(Integer num, Integer num2, C62320sa r3, C62320sa r4, 0sP r5, int i) {
        this.A01 = i;
        this.A02 = num;
        this.A03 = num2;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
    }
}
