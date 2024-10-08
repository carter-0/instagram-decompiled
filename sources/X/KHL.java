package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgFrameLayout;

public final class KHL extends IgFrameLayout {
    public final /* synthetic */ ViewGroup A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KHL(Context context, ViewGroup viewGroup) {
        super(context);
        this.A00 = viewGroup;
    }

    public int getId() {
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            return viewGroup.getId();
        }
        return super.getId();
    }
}
