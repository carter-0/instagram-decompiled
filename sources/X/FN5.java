package X;

import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

public final /* synthetic */ class FN5 implements View.OnClickListener {
    public final /* synthetic */ IgdsButton A00;
    public final /* synthetic */ C50664FgP A01;

    public /* synthetic */ FN5(IgdsButton igdsButton, C50664FgP fgP) {
        this.A00 = igdsButton;
        this.A01 = fgP;
    }

    public final void onClick(View view) {
        IgdsButton igdsButton = this.A00;
        C50664FgP fgP = this.A01;
        igdsButton.setLoading(true);
        fgP.onClick();
    }
}
