package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;

/* renamed from: X.EGu  reason: case insensitive filesystem */
public final class C47783EGu extends C232232tF {
    public final E7P A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46965DoJ(this.A00, new IgdsInlineSearchBox(AnonymousClass7TE.A0S(viewGroup), (AttributeSet) null, 0));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C47766EGd eGd = (C47766EGd) r5;
        C46965DoJ doJ = (C46965DoJ) r6;
        AnonymousClass7TG.A1N(eGd, doJ);
        String str = eGd.A00;
        0qQ.A0B(str, 0);
        IgdsInlineSearchBox igdsInlineSearchBox = doJ.A02;
        BackInterceptEditText backInterceptEditText = igdsInlineSearchBox.A0E;
        backInterceptEditText.setText(str);
        backInterceptEditText.requestFocus();
        igdsInlineSearchBox.A02 = doJ.A00;
        igdsInlineSearchBox.setImeOptions(6);
        igdsInlineSearchBox.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public final Class modelClass() {
        return C47766EGd.class;
    }

    public C47783EGu(E7P e7p) {
        this.A00 = e7p;
    }
}
