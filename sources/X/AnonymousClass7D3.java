package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7D3  reason: invalid class name */
public final class AnonymousClass7D3 implements AnonymousClass7D2 {
    public final UserSession A00;
    public final AnonymousClass7VW A01;
    public final AnonymousClass0iw A02;

    /* renamed from: A00 */
    public final void ADp(C328127Do r6, C328557Fg r7) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        if (r7.A01 instanceof AnonymousClass7G5) {
            C327617Bm r3 = new C327617Bm(this, r7);
            C71662eb r0 = r6.A00;
            ImageUrl imageUrl = r7.A00;
            AnonymousClass0iw r1 = this.A02;
            0qQ.A0B(r0, 0);
            IgImageView A012 = r0.A01();
            0qQ.A07(A012);
            IgImageView igImageView = A012;
            if (imageUrl == null) {
                igImageView.A09();
            } else {
                igImageView.setUrl(imageUrl, r1);
            }
            igImageView.setVisibility(0);
            AnonymousClass0fU.A00(r3, igImageView);
            return;
        }
        C71662eb r12 = r6.A00;
        0qQ.A0B(r12, 0);
        r12.A03(8);
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.sender_avatar_stub, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new C328127Do(new C71662eb((ViewStub) inflate));
    }

    public AnonymousClass7D3(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7VW r3) {
        this.A02 = r1;
        this.A01 = r3;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r1) {
    }
}
