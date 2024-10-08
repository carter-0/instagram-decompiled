package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.P7w  reason: case insensitive filesystem */
public final class C72487P7w implements C328017Dc, C328027Dd {
    public C328087Dj A00;
    public final Drawable A01 = C328037De.A00();
    public final LinearLayout A02;
    public final TextView A03;
    public final TextView A04;

    public final View BJd() {
        return this.A02;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final void FHQ(int i) {
        AnonymousClass7PT.A00(this.A02.getBackground(), i);
    }

    public C72487P7w(View view) {
        this.A02 = (LinearLayout) view.requireViewById(R.id.message_content);
        this.A04 = DbU.A0G(view, R.id.title);
        this.A03 = DbU.A0G(view, R.id.text);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
