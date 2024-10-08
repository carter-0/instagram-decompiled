package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.8hw  reason: invalid class name and case insensitive filesystem */
public final class C362458hw implements C2365734g {
    public final /* synthetic */ C361998hA A00;

    public C362458hw(C361998hA r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        0qQ.A0B(view, 0);
        C361998hA r2 = this.A00;
        IgTextView requireViewById = view.requireViewById(R.id.gallery_drafts_delete_button);
        r2.A02 = requireViewById;
        if (requireViewById == null) {
            0qQ.A0F("draftsDeleteButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass0fU.A00(new LWl(r2), requireViewById);
        }
    }
}
