package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.HqI  reason: case insensitive filesystem */
public final class C55954HqI {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ H1P A02;

    public C55954HqI(FragmentActivity fragmentActivity, UserSession userSession, H1P h1p) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = h1p;
    }

    public final void A00(ImageUrl imageUrl, SavedCollection savedCollection) {
        String string;
        boolean z;
        boolean A05;
        C54665HMw hMw;
        boolean z2 = savedCollection.A0N;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        H1P h1p = this.A02;
        0qQ.A0B(h1p, 3);
        ImageUrl imageUrl2 = imageUrl;
        IVX ivx = new IVX(fragmentActivity, h1p, userSession, savedCollection);
        String str = savedCollection.A0G;
        if (z2) {
            string = fragmentActivity.getString(2131952148);
            z = true;
            hMw = savedCollection.A07;
            0qQ.A07(hMw);
            A05 = true;
        } else {
            int i = 2131952148;
            if (savedCollection.A05 != null) {
                i = 2131952360;
            }
            string = fragmentActivity.getString(i);
            z = true;
            A05 = savedCollection.A05();
            hMw = savedCollection.A07;
            0qQ.A07(hMw);
        }
        I6V.A00(fragmentActivity, imageUrl2, ivx, hMw, str, string, z, A05, z);
    }
}
