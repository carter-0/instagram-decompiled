package X;

import android.view.ViewStub;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.IMu  reason: case insensitive filesystem */
public final class C57054IMu implements C334367b9 {
    public final ViewStub A00;
    public final ComposerAutoCompleteTextView A01;

    public final ComposerAutoCompleteTextView Ae1() {
        return this.A01;
    }

    public final ViewStub Alo() {
        return this.A00;
    }

    public C57054IMu(IOA ioa) {
        C56015HrN hrN = ioa.A02;
        if (hrN == null) {
            0qQ.A0F("viewHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = hrN.A0D;
        this.A00 = hrN.A09;
    }
}
