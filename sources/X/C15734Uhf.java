package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Uhf  reason: case insensitive filesystem */
public final class C15734Uhf extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_header_with_action_text, viewGroup, false);
        2eS.A04(inflate, AnonymousClass05K.A07);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C14895UDx(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        TextView textView;
        int i;
        View view;
        int i2;
        C71982OuE ouE = (C71982OuE) r8;
        C14895UDx uDx = (C14895UDx) r9;
        boolean A1U = AnonymousClass7TF.A1U(0, ouE, uDx);
        TextView textView2 = uDx.A05;
        textView2.setText(ouE.A01);
        int intValue = ouE.A03.intValue();
        if (intValue != 0) {
            if (intValue == A1U) {
                textView = uDx.A04;
                i = 2131964288;
            } else if (intValue == 2) {
                textView = uDx.A04;
                i = 2131964290;
            } else if (intValue == 3) {
                textView = uDx.A04;
                textView.setVisibility(8);
            } else {
                throw new RuntimeException();
            }
            textView.setText(i);
            textView.setVisibility(0);
        } else {
            textView = uDx.A04;
            i = 2131964299;
            textView.setText(i);
            textView.setVisibility(0);
        }
        if (textView.getVisibility() == 0) {
            WB8.A00(textView, 42, ouE);
            textView.setOnLongClickListener(new C71425OkQ((Object) ouE, 4));
        }
        int intValue2 = ouE.A04.intValue();
        ImageView imageView = uDx.A03;
        if (intValue2 != 0) {
            if (intValue2 != 2) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(8);
                if (ouE.A00) {
                    View view2 = uDx.A01;
                    view2.setVisibility(0);
                    ImageView imageView2 = uDx.A02;
                    imageView2.setVisibility(0);
                    WB8.A00(imageView2, 45, ouE);
                    i2 = 46;
                    view = view2;
                }
            }
            uDx.A01.setVisibility(8);
            uDx.A02.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        uDx.A01.setVisibility(8);
        uDx.A02.setVisibility(8);
        WB8.A00(imageView, 43, ouE);
        i2 = 44;
        view = textView2;
        WB8.A00(view, i2, ouE);
    }

    public final Class modelClass() {
        return C71982OuE.class;
    }
}
