package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class KVB extends C60518Jmp {
    public final TextView A00;
    public final C66452MSg A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KVB(View view, C66452MSg mSg) {
        super(view);
        0qQ.A0B(mSg, 2);
        this.A01 = mSg;
        this.A00 = AnonymousClass7TG.A0R(view, R.id.search_row_typeahead_text);
    }
}
