package X;

import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

public final class UE4 extends C249703kE {
    public TextWatcher A00;
    public String A01 = "v1";
    public final LinearLayout A02;
    public final C71662eb A03;
    public final C71662eb A04;
    public final C71662eb A05;
    public final IgdsButton A06;

    public UE4(View view) {
        super(view);
        this.A02 = (LinearLayout) view.requireViewById(R.id.question_list);
        this.A04 = DbY.A0T(view, R.id.comment_edit_text_stub);
        this.A05 = DbY.A0T(view, R.id.disclaimer_text_stub);
        this.A03 = DbY.A0T(view, R.id.action_button_stub);
        this.A06 = (IgdsButton) view.requireViewById(R.id.action_button_v2);
    }
}
