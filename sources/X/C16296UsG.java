package X;

import android.content.Context;
import android.widget.Adapter;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.UsG  reason: case insensitive filesystem */
public final class C16296UsG extends C233952wk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C15687Ugs A01;

    public final void A01(Adapter adapter, int i) {
        C15433Ucj ucj;
        C238643Cr r2;
        ImageInfo imageInfo;
        Object item = adapter.getItem(i);
        if (item != null) {
            C21051XBs xBs = (C21051XBs) item;
            int ordinal = xBs.CAU().ordinal();
            if (ordinal == 2) {
                r2 = this.A01.A01;
                if (r2 != null) {
                    ucj = (C15433Ucj) xBs;
                    imageInfo = ucj.A01;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (ordinal == 7) {
                C21051XBs xBs2 = (C21051XBs) ((C15435Ucl) xBs).A00.A00.get(0);
                0qQ.A0C(xBs2, AnonymousClass000.A00(332));
                ucj = (C15433Ucj) xBs2;
                r2 = this.A01.A01;
                if (r2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                imageInfo = ucj.A01;
            } else if (ordinal == 3) {
                r2 = this.A01.A01;
                if (r2 != null) {
                    imageInfo = ((C15436Ucm) xBs).A00;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                return;
            }
            r2.A01(1iI.A01(this.A00, imageInfo));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16296UsG(Context context, C15687Ugs ugs) {
        super(3);
        this.A01 = ugs;
        this.A00 = context;
    }
}
