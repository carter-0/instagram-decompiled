package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;

public final class GW3 extends IgFrameLayout {
    public final IgTextView A00 = findViewById(R.id.igds_pill_label);

    public GW3(Context context) {
        super(context, (AttributeSet) null, 0);
        LayoutInflater.from(context).inflate(R.layout.igds_pill, this, true);
    }

    public final void setLabel(String str) {
        0qQ.A0B(str, 0);
        this.A00.setText(str);
    }
}
