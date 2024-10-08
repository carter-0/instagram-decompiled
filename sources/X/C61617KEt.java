package X;

import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsFooterCell;

/* renamed from: X.KEt  reason: case insensitive filesystem */
public final class C61617KEt extends C232222tE {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.accessibility.AccessibleTextView, android.widget.TextView] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        CharSequence charSequence;
        Li7 li7 = (Li7) r4;
        C60546JnH jnH = (C60546JnH) r5;
        AnonymousClass7TG.A1N(li7, jnH);
        IgdsFooterCell igdsFooterCell = jnH.A00;
        int i = li7.A01;
        if (i != -1) {
            charSequence = igdsFooterCell.getResources().getText(i);
        } else {
            charSequence = li7.A00;
        }
        0qQ.A0A(charSequence);
        igdsFooterCell.A00(charSequence);
        MovementMethod instance = LinkMovementMethod.getInstance();
        0qQ.A07(instance);
        igdsFooterCell.A02.setMovementMethod(instance);
        Integer num = li7.A02;
        if (num != null) {
            igdsFooterCell.setContentDescription(igdsFooterCell.getResources().getText(num.intValue()));
        }
    }

    public final Class modelClass() {
        return Li7.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C60546JnH(new IgdsFooterCell(JTU.A06(viewGroup), (AttributeSet) null));
    }
}
