package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;
import java.util.Map;

/* renamed from: X.MvG  reason: case insensitive filesystem */
public final class C67812MvG extends 2Rw {
    public static final AnonymousClass0iw A02 = DbS.A0O("reply_composer_module");
    public final O8C A00;
    public final List A01;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C68001MyT(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_profile_reply_container, false), this);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        C68001MyT myT = (C68001MyT) r7;
        0qQ.A0B(myT, 0);
        O8C o8c = this.A00;
        Object obj = this.A01.get(i);
        0qQ.A0B(obj, 0);
        Map map = o8c.A00.A08;
        if (map == null) {
            0qQ.A0F("selectedThreads");
            throw AnonymousClass00P.createAndThrow();
        }
        C66754Mbz mbz = (C66754Mbz) map.get(obj);
        if (mbz != null) {
            myT.A00.setText(DbT.A0y(mbz.A03));
            C66776McM mcM = mbz.A02;
            C69597Nof nof = mcM.A01;
            if (nof instanceof C66695Mb2) {
                GradientSpinnerAvatarView gradientSpinnerAvatarView = myT.A02;
                0qQ.A0C(nof, "null cannot be cast to non-null type com.instagram.direct.inbox.ui.threadavatar.ThreadAvatarViewModel.Avatar.Single");
                ImageUrl imageUrl = ((C66695Mb2) nof).A00;
                gradientSpinnerAvatarView.A0F(mcM.A00, A02, imageUrl);
                gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            }
            C71404Ok3.A01(myT.A01, this, i, 2);
        }
    }

    public C67812MvG(O8C o8c, List list) {
        this.A01 = list;
        this.A00 = o8c;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-360758375);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-1256648025, A03);
        return size;
    }
}
