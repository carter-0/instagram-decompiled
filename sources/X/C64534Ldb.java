package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Ldb  reason: case insensitive filesystem */
public final class C64534Ldb implements C66427MRh {
    public C64516LdI A00;
    public final View A01;
    public final View A02;
    public final RecyclerView A03;
    public final AnonymousClass2t9 A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;

    public C64534Ldb(ViewStub viewStub, AnonymousClass0iw r14, UserSession userSession, float f) {
        int A022 = DbW.A02(1, userSession, viewStub);
        Context context = viewStub.getContext();
        View inflate = viewStub.inflate();
        if (inflate != null) {
            this.A01 = inflate;
            inflate.setVisibility(8);
            RecyclerView A0I = DbT.A0I(inflate, R.id.media_grid_recycler_view);
            this.A03 = A0I;
            A0I.setVisibility(8);
            View requireViewById = inflate.requireViewById(R.id.empty_media_grid_view);
            this.A02 = requireViewById;
            this.A07 = DbT.A0a(inflate, R.id.empty_media_grid_title);
            this.A06 = DbT.A0a(inflate, R.id.empty_media_grid_message);
            this.A05 = DbT.A0a(inflate, R.id.create_media_button);
            requireViewById.setVisibility(8);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
            A0I.setLayoutManager(gridLayoutManager);
            A0I.A11(new C60455Jln(JTR.A08(context), A022));
            A0I.A15(new C3251871j(gridLayoutManager, new C65319LrI(this, 6), C3251771i.A07, true, false));
            AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
            A002.A08 = true;
            AnonymousClass2t9 A0U = DbU.A0U(A002, new C61641KFr(this, r14, userSession, f));
            this.A04 = A0U;
            JTQ.A1G(A0U);
            A0I.setAdapter(A0U);
            A0I.setItemAnimator((AnonymousClass3AS) null);
            LY1.A00(AnonymousClass7TF.A0G(inflate, R.id.create_media_button), 32, this);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DIF(ImageUrl imageUrl, String str) {
        C64516LdI ldI = this.A00;
        if (ldI != null) {
            String str2 = ldI.A05;
            if (str2 != null) {
                int A002 = C64516LdI.A00(ldI, str2);
                int A003 = C64516LdI.A00(ldI, str);
                ldI.A05 = str;
                ldI.A01 = A003;
                C64516LdI.A02(ldI, A002, false);
                C64516LdI.A02(ldI, A003, true);
                C64534Ldb ldb = ldI.A08;
                List list = ldI.A0A;
                0qQ.A0B(list, 0);
                AnonymousClass2t9 r0 = ldb.A04;
                JTR.A1L(r0, list);
                r0.notifyItemChanged(A002);
                r0.notifyItemChanged(A003);
                if (!ldI.A04()) {
                    AnonymousClass0iw r5 = ldI.A09;
                    C64516LdI ldI2 = ldb.A00;
                    if (ldI2 != null) {
                        C64515LdH ldH = ldI2.A02;
                        if (ldH != null) {
                            C65324LrN lrN = ldH.A03;
                            lrN.A03 = false;
                            C65324LrN.A03(lrN, "context_switch");
                            C358248ab A0Y = DbS.A0Y(ldb.A01.getContext());
                            A0Y.A09(2131964336);
                            A0Y.A08(2131964335);
                            A0Y.A0J(LV3.A00(ldb, 20), 2131964334);
                            A0Y.A0h((Bitmap) null, r5, imageUrl);
                            A0Y.A0r(true);
                            DbT.A1V(A0Y);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                C64515LdH ldH2 = ldI.A02;
                if (ldH2 != null) {
                    ldH2.A01(ldI.A05, true);
                    return;
                }
                throw AnonymousClass7TE.A0z("delegate could not be null when user selected one media item in grid");
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }
}
