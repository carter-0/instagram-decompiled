package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.KAo  reason: case insensitive filesystem */
public final class C61509KAo extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new IgdsMediaButton(context, (AttributeSet) null, 0);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r6, C276544tV r7, Object obj) {
        C296235pj r0;
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view;
        C51973G9u.A1E(igdsMediaButton, r6, r7);
        String A0K = r7.A0K(44);
        if (A0K != null) {
            int hashCode = A0K.hashCode();
            if (hashCode != -1407516662) {
                if (hashCode != -817598092) {
                    if (hashCode == -314765822 && A0K.equals("primary")) {
                        r0 = C296235pj.PRIMARY;
                    }
                } else if (A0K.equals("secondary")) {
                    r0 = C296235pj.SECONDARY;
                }
            } else if (A0K.equals("secondary_on_black")) {
                r0 = C296235pj.SECONDARY_ON_BLACK;
            }
            igdsMediaButton.setButtonStyle(r0);
        }
        if (r7.A0R(35, false)) {
            igdsMediaButton.setButtonStyle(C296235pj.PRIMARY_DESTRUCTIVE);
        }
        igdsMediaButton.setEnabled(!r7.A0R(36, false));
        C62962KpE.A00(r6.A00, r7, igdsMediaButton);
        igdsMediaButton.setLabel(r7.A0J());
        C277014uI A0A = r7.A0A(41);
        if (A0A == null) {
            return null;
        }
        LYA.A01(igdsMediaButton, r7, r6, A0A, 0);
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r6, C276544tV r7, Object obj, Object obj2) {
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view;
        0qQ.A0B(igdsMediaButton, 0);
        igdsMediaButton.setOnClickListener((View.OnClickListener) null);
        igdsMediaButton.setLabel((CharSequence) null);
        TextView textView = igdsMediaButton.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setGravity(17);
        IgdsMediaButton.A01(igdsMediaButton);
        igdsMediaButton.A05();
        igdsMediaButton.setButtonStyle(C296235pj.PRIMARY);
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C61509KAo(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
