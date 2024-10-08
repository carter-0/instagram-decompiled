package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.OHd  reason: case insensitive filesystem */
public final class C70708OHd {
    public final Context A00;
    public final Resources A01;
    public final View A02;
    public final View A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final AnonymousClass0eM A06;

    public C70708OHd(View view, AnonymousClass07Z r6, AnonymousClass07g r7) {
        0qQ.A0B(r7, 1);
        this.A02 = view;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A00 = A0S;
        this.A01 = AnonymousClass7TF.A0A(A0S);
        this.A06 = C49154EqL.A00(new WED(), r7, DbS.A0z(C67745Mty.class));
        this.A03 = AnonymousClass7TF.A0G(view, R.id.reel_viewer_text_container);
        this.A05 = DbX.A0Z(view, R.id.reel_viewer_title);
        this.A04 = DbX.A0Z(view, R.id.reel_viewer_timestamp);
        AnonymousClass7TE.A1Z(new MGD(r6, this, (AnonymousClass4D7) null, 1), AnonymousClass07a.A00(r6));
    }
}
