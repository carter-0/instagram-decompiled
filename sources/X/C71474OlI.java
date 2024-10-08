package X;

import android.widget.RatingBar;
import java.util.HashMap;

/* renamed from: X.OlI  reason: case insensitive filesystem */
public final class C71474OlI implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ 2bv A00;
    public final /* synthetic */ AnonymousClass4UC A01;

    public C71474OlI(2bv r1, AnonymousClass4UC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        Integer num;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("rating", String.valueOf(f));
        if (f > 4.0f) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        this.A00.DbI(this.A01, num, A1E);
    }
}
