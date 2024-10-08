package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FBTagType;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.LyL  reason: case insensitive filesystem */
public final class C65706LyL implements X76, C66571MXb {
    public final UserSession A00;
    public final C66573MXe A01;

    public final void A8A(User user) {
    }

    public final FragmentActivity B7r() {
        return null;
    }

    public final void Cu2(Product product) {
    }

    public final void D6L(User user) {
    }

    public final void D88(ProductCollection productCollection) {
    }

    public final void DBl(Context context, User user, String str, int i) {
    }

    public final void DDy(FBUserTag fBUserTag) {
    }

    public final void DRY(User user, int i) {
    }

    public final void DwV(User user, int i) {
    }

    public final void EBX(View view) {
    }

    public final void AAN(User user, boolean z) {
        C66573MXe mXe = this.A01;
        Iterator it = mXe.BbX().iterator();
        while (true) {
            if (it.hasNext()) {
                if (JTU.A0Y(it).equals(user.getId())) {
                    break;
                }
            } else {
                PeopleTag peopleTag = new PeopleTag(new PointF(), user);
                peopleTag.A09(user);
                mXe.BbX().add(peopleTag);
                if (z) {
                    mXe.A84(user);
                }
            }
        }
        AVW();
    }

    public final void AVW() {
        TaggingActivity taggingActivity = (TaggingActivity) this.A01;
        TaggingActivity.A0J(taggingActivity);
        C62630Kj1 kj1 = taggingActivity.A0H;
        String str = null;
        if (kj1 == null) {
            0qQ.A0F("tagType");
            throw AnonymousClass00P.createAndThrow();
        }
        if (kj1 == C62630Kj1.PEOPLE) {
            str = "PeopleTagSearch";
        }
        taggingActivity.getSupportFragmentManager().A19(str, 1);
        TaggingActivity.A0I(taggingActivity);
        TaggingActivity.A0C(taggingActivity);
    }

    public final void D87(Product product) {
        C66573MXe mXe = this.A01;
        ArrayList BgW = mXe.BgW();
        Iterator it = BgW.iterator();
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            if (tag.getId().equals(product.A0H)) {
                BgW.remove(tag);
                TaggingActivity.A0K((TaggingActivity) mXe, tag);
                return;
            }
        }
    }

    public final void DDz(FBUserTag fBUserTag) {
        TaggingActivity taggingActivity = (TaggingActivity) this.A01;
        ArrayList arrayList = taggingActivity.A0M;
        if (arrayList != null) {
            ((MediaTaggingInfo) DbZ.A0g(arrayList, taggingActivity.A00)).A0A.remove(fBUserTag);
            if (FBTagType.WITH_TAG == fBUserTag.A01) {
                ArrayList arrayList2 = taggingActivity.A0M;
                if (arrayList2 != null) {
                    Iterator A1G = AnonymousClass7TE.A1G(arrayList2);
                    while (A1G.hasNext()) {
                        ((MediaTaggingInfo) AnonymousClass7TF.A0a(A1G)).A0A.remove(fBUserTag);
                    }
                }
            }
            TaggingActivity.A0K(taggingActivity, fBUserTag);
            return;
        }
        JTO.A1L();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DJ8(User user, boolean z) {
        C66573MXe mXe = this.A01;
        Iterator it = mXe.BbX().iterator();
        while (it.hasNext()) {
            PeopleTag peopleTag = (PeopleTag) it.next();
            if (peopleTag.getId().equals(user.getId())) {
                peopleTag.A02 = !z;
                TaggingActivity taggingActivity = (TaggingActivity) mXe;
                View view = (View) taggingActivity.A0m.get(taggingActivity.A0X());
                if (view != null) {
                    C62630Kj1 A012 = peopleTag.A01();
                    if (A012 == C62630Kj1.PEOPLE) {
                        C60046JeE jeE = (C60046JeE) view.findViewWithTag(peopleTag);
                        if (jeE != null) {
                            jeE.setText(C18274Vop.A01(view.getContext(), peopleTag));
                        }
                    } else if (A012 == C62630Kj1.FB_USER_TAG && view.findViewWithTag(peopleTag) != null) {
                        throw AnonymousClass7TE.A11("mFbUser");
                    }
                }
                TaggingActivity.A0G(taggingActivity);
                TaggingActivity.A0C(taggingActivity);
                return;
            }
        }
    }

    public final void DdP(User user) {
        C66573MXe mXe = this.A01;
        ArrayList BbX = mXe.BbX();
        Iterator it = BbX.iterator();
        while (it.hasNext()) {
            PeopleTag peopleTag = (PeopleTag) it.next();
            if (peopleTag.getId().equals(user.getId())) {
                BbX.remove(peopleTag);
                TaggingActivity taggingActivity = (TaggingActivity) mXe;
                TaggingActivity.A0O(taggingActivity, peopleTag.A07());
                TaggingActivity.A0K(taggingActivity, peopleTag);
                return;
            }
        }
    }

    public final void DqV() {
        this.A01.DqV();
    }

    public final boolean EtC(Product product) {
        String A002 = AnonymousClass3ZA.A00(product.A0B);
        A002.getClass();
        return !A002.equals(this.A00.A06);
    }

    public C65706LyL(UserSession userSession, C66573MXe mXe) {
        this.A00 = userSession;
        this.A01 = mXe;
    }
}
