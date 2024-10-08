package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public final class VWD {
    public final Context A00;
    public final LinearLayout A01;
    public final List A02 = new ArrayList();

    public VWD(View view) {
        this.A00 = view.getContext();
        this.A01 = (LinearLayout) view;
    }
}
