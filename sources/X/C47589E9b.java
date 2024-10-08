package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.E9b  reason: case insensitive filesystem */
public final class C47589E9b extends C231632rz {
    public final AnonymousClass0iw A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47589E9b(AnonymousClass0iw r1) {
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 1488975416);
        0qQ.A0B(obj, 2);
        if (i == 0) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.genericsurvey.ui.MediaPreviewViewBinder.Holder");
            Eu3 eu3 = (Eu3) tag;
            1Xj r8 = (1Xj) obj;
            AnonymousClass0iw r2 = this.A00;
            boolean A1Z = AnonymousClass7TG.A1Z(eu3, r8);
            0qQ.A0B(r2, 2);
            IgProgressImageView igProgressImageView = eu3.A00;
            igProgressImageView.setAdjustViewBounds(A1Z);
            ImageUrl A1Q = r8.A1Q();
            if (A1Q != null) {
                igProgressImageView.setUrl(A1Q, r2);
                AnonymousClass0fD.A0A(360638764, A04);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        UnsupportedOperationException A1B = AnonymousClass7TE.A1B(AnonymousClass000.A00(33));
        AnonymousClass0fD.A0A(-771142939, A04);
        throw A1B;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1798289546);
        if (i == 0) {
            View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.media_preview_view, false);
            A0A.setTag(new Eu3(A0A));
            AnonymousClass0fD.A0A(-899350572, A04);
            return A0A;
        }
        UnsupportedOperationException A1B = AnonymousClass7TE.A1B("Unhandled view type");
        AnonymousClass0fD.A0A(-671779499, A04);
        throw A1B;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
