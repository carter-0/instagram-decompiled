package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class PBR implements C328007Db, C328017Dc {
    public C328087Dj A00;
    public final TextView A01;
    public final View A02;

    public final View BJd() {
        return this.A02;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public PBR(View view) {
        this.A02 = view.requireViewById(R.id.hidden_message_container);
        this.A01 = DbU.A0G(view, R.id.hidden_message_text);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
