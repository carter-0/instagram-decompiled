package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.ui.widget.expandingtextview.ExpandingTextView;

/* renamed from: X.74L  reason: invalid class name */
public final class AnonymousClass74L implements C328017Dc, C328027Dd, AnonymousClass76N {
    public AnonymousClass7DU A00;
    public C328087Dj A01;
    public final Drawable A02 = C328037De.A00();
    public final View A03;
    public final C71662eb A04;
    public final ExpandingTextView A05;

    public final View BJd() {
        return this.A03;
    }

    public final C328087Dj BY0() {
        return this.A01;
    }

    public final void FHQ(int i) {
        AnonymousClass7PT.A00(this.A05.getBackground(), i);
    }

    public AnonymousClass74L(View view, ExpandingTextView expandingTextView) {
        this.A03 = view;
        this.A05 = expandingTextView;
        this.A04 = new C71662eb((ViewStub) view.findViewById(R.id.direct_expandable_text_progress_bar_stub));
    }

    public final void EdM(AnonymousClass7DU r1) {
        this.A00 = r1;
    }

    public final void EeT(C328087Dj r1) {
        this.A01 = r1;
    }
}
