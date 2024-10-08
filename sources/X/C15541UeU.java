package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.UeU  reason: case insensitive filesystem */
public final class C15541UeU extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final XC1 A03;
    public final XAH A04;

    public C15541UeU(Context context, AnonymousClass0iw r3, UserSession userSession, XC1 xc1, XAH xah) {
        0qQ.A0B(xah, 5);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r3;
        this.A03 = xc1;
        this.A04 = xah;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        int A032 = AnonymousClass0fD.A03(1735264627);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0C(obj4, C66579MXk.A00(17));
        C66967Mg0 mg0 = (C66967Mg0) obj4;
        UserSession userSession = this.A02;
        Context context = this.A00;
        AnonymousClass0iw r9 = this.A01;
        0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.search.common.model.HashtagSearchEntry");
        C69160Nfj nfj = (C69160Nfj) obj3;
        XC1 xc1 = this.A03;
        XAH xah = this.A04;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.HashtagRowViewBinder.Holder");
        C17935ViQ viQ = (C17935ViQ) tag;
        boolean A1P = AnonymousClass7TF.A1P(mg0.A0F ? 1 : 0);
        0qQ.A0B(userSession, 0);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36323418890579094L);
        DbZ.A0t(1, context, r9, nfj);
        0qQ.A0B(viQ, 7);
        HashtagImpl hashtagImpl = nfj.A00;
        ImageView imageView = viQ.A04;
        C18795W2d.A01(context, imageView, r9, hashtagImpl, !AnonymousClass7TG.A1X(hashtagImpl.A07));
        C18795W2d.A02(imageView);
        if (xc1 != null) {
            WB4.A00(viQ.A02, xc1, nfj, mg0, 49);
        }
        if (xah != null) {
            xah.ECK(viQ.A02, nfj, mg0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(0mp.A06("#%s", new Object[]{hashtagImpl.A0D}));
        C253073qA.A00(userSession).A01(spannableStringBuilder);
        viQ.A05.setText(spannableStringBuilder);
        C18795W2d.A03(hashtagImpl, mg0, viQ, A06, false);
        IgSimpleImageView A002 = viQ.A00();
        if (!(xc1 == null || A002 == null)) {
            C67429Mnk.A00((AnonymousClass0iw) null, A002, nfj, mg0, xc1, A1P);
        }
        AnonymousClass0fD.A0A(2092773447, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, 874118497);
        View A002 = C18795W2d.A00(this.A00, viewGroup);
        AnonymousClass0fD.A0A(-1214527678, A042);
        return A002;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
