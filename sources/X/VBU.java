package X;

import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

public abstract class VBU {
    public static final void A00(N3M n3m, C20950X6d x6d, C14838UBs uBs) {
        boolean A1Y = C51970G9q.A1Y(x6d);
        boolean EtL = x6d.EtL(n3m);
        IgdsButton igdsButton = uBs.A00;
        if (EtL) {
            igdsButton.setVisibility(A1Y ? 1 : 0);
            igdsButton.setText(n3m.A08);
            WBG.A01(igdsButton, 13, n3m, x6d);
            return;
        }
        igdsButton.setVisibility(8);
        igdsButton.setOnClickListener((View.OnClickListener) null);
    }
}
