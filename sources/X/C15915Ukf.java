package X;

import android.content.res.Resources;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.Ukf  reason: case insensitive filesystem */
public final class C15915Ukf extends AnonymousClass91P implements AnonymousClass6MR {
    public final Hashtag A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15915Ukf(Hashtag hashtag, int i) {
        super(i);
        0qQ.A0B(hashtag, 2);
        this.A00 = hashtag;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.WUf, X.X6W] */
    public final X6W By4() {
        int i = this.A01;
        HashtagImpl FEY = this.A00.FEY();
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = FEY;
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15915Ukf(Resources resources, Hashtag hashtag) {
        super(resources);
        AnonymousClass7TG.A1O(resources, hashtag);
        this.A00 = hashtag;
    }
}
