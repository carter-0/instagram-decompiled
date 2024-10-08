package X;

import android.view.View;
import android.widget.ViewSwitcher;
import com.instagram.common.ui.base.IgTextView;

public final class IEJ implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ C254073rt A00;

    public IEJ(C254073rt r1) {
        this.A00 = r1;
    }

    public final View makeView() {
        return new IgTextView(this.A00.A0G);
    }
}
