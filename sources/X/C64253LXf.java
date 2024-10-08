package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LXf  reason: case insensitive filesystem */
public final class C64253LXf implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C64253LXf(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj4;
        this.A02 = obj3;
        this.A04 = obj5;
        this.A01 = obj;
        this.A03 = obj2;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        String id;
        Integer num;
        switch (this.A00) {
            case 0:
                A052 = AnonymousClass0fD.A05(-1732738026);
                UserSession userSession = (UserSession) this.A05;
                AnonymousClass8ZP A002 = AnonymousClass8ZO.A00(userSession);
                28D r2 = (28D) this.A02;
                A002.A00(r2, (ACRType) null);
                Bundle A003 = C250563lf.A0C(r2).A00();
                List<1Xj> list = (List) this.A04;
                for (1Xj A032 : list) {
                    1E7.A00(userSession).A03(A032);
                }
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0r.add(C51971G9r.A0v(it));
                }
                A003.putStringArrayList(AnonymousClass000.A00(209), AnonymousClass7TE.A1D(A0r));
                A003.putSerializable(C273654mx.A00(19), C2801950r.CLIPS);
                AnonymousClass6W8 A022 = AnonymousClass6W8.A02((Activity) this.A01, A003, userSession, TransparentModalActivity.class, "clips_camera");
                Dbc.A0y(A022);
                A022.A0D((Fragment) this.A03, 9587);
                i = -975761947;
                break;
            case 1:
                A052 = AnonymousClass0fD.A05(1482654275);
                Context context = (Context) this.A01;
                0qQ.A0A(context);
                boolean z = ((C362958in) this.A02).A06;
                boolean z2 = ((AnonymousClass9I9) this.A03).A02;
                GalleryItem galleryItem = (GalleryItem) this.A04;
                boolean A053 = galleryItem.A05();
                boolean A06 = galleryItem.A06();
                C59852JaT jaT = (C59852JaT) this.A05;
                0qQ.A0B(context, 0);
                if (z || !z2) {
                    if (!A053) {
                        C59848JaO.A01(context, A06);
                    } else {
                        jaT.A00.A04.invoke(jaT.A01.A01);
                    }
                }
                i = -507657322;
                break;
            case 2:
                A052 = AnonymousClass0fD.A05(-1503128989);
                ((LOZ) this.A04).A01();
                C339257jJ r7 = (C339257jJ) this.A05;
                r7.A00 = null;
                Object obj = this.A01;
                Object obj2 = this.A03;
                1Eo.A05(JTP.A0U((AnonymousClass12V) r7.A01.getValue(), 23341140), new C59819JZr(obj2, obj, r7, (AnonymousClass4D7) null, 31), (C262224Cq) this.A02);
                i = 1320383312;
                break;
            case 3:
                A052 = AnonymousClass0fD.A05(-886492053);
                ((LOZ) this.A03).A01();
                C339257jJ r72 = (C339257jJ) this.A05;
                r72.A00 = null;
                Object obj3 = this.A01;
                Object obj4 = this.A04;
                1Eo.A05(JTP.A0U((AnonymousClass12V) r72.A01.getValue(), 23341140), new C59819JZr(obj4, obj3, r72, (AnonymousClass4D7) null, 32), (C262224Cq) this.A02);
                i = -2120470617;
                break;
            case 4:
                A052 = AnonymousClass0fD.A05(1130051780);
                1Xj r1 = (1Xj) this.A04;
                if (!(r1 == null || (id = r1.getId()) == null)) {
                    UserSession userSession2 = (UserSession) this.A05;
                    C65145Lo9 lo9 = new C65145Lo9((Context) this.A02, (Fragment) this.A03, (AnonymousClass0iw) this.A01, userSession2, id);
                    if (LIZ.A01(userSession2, r1)) {
                        num = AnonymousClass05K.A05;
                    } else {
                        num = AnonymousClass05K.A04;
                    }
                    lo9.Exg((C62642Kk4) null, (C371088xY) null, (AudioOverlayTrack) null, num, (String) null, (Map) null);
                }
                i = -1403414;
                break;
            case 5:
                A052 = AnonymousClass0fD.A05(-336644397);
                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) this.A01;
                if (igSimpleImageView != null) {
                    C59671JTb jTb = (C59671JTb) this.A04;
                    C63939LEc lEc = (C63939LEc) this.A05;
                    IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = (IgBouncyUfiButtonImageView) this.A03;
                    boolean z3 = jTb.A00;
                    if (!z3) {
                        igSimpleImageView.setVisibility(0);
                        igBouncyUfiButtonImageView.setVisibility(8);
                        igSimpleImageView.setScaleX(0.0f);
                        igSimpleImageView.setScaleY(0.0f);
                        ViewPropertyAnimator duration = igSimpleImageView.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new DecelerateInterpolator()).setDuration(200);
                        0qQ.A07(duration);
                        duration.withEndAction(new M7R(igSimpleImageView, new C73384Pbh(jTb, igSimpleImageView, igSimpleImageView, lEc, igBouncyUfiButtonImageView)));
                    } else {
                        lEc.A00.A02(z3, false, false);
                    }
                } else {
                    ((C63939LEc) this.A05).A00.A02(((C59671JTb) this.A04).A00, false, false);
                }
                ((MSJ) this.A02).FHK();
                i = -1512434080;
                break;
            case 6:
                A052 = AnonymousClass0fD.A05(886834919);
                UserSession userSession3 = (UserSession) this.A05;
                C368278sM r3 = C368278sM.ACCEPT;
                1Xj r73 = ((L56) this.A04).A01;
                LTD.A04(r3, userSession3, r73.getId(), (String) null);
                C63882LAl lAl = (C63882LAl) this.A03;
                C246353eS.A05((Fragment) this.A02, C246353eS.A00(AnonymousClass818.IG_SELF_REEL_LIKES_SHEET, new C64549Ldq(lAl, (C47522E6i) this.A01), userSession3, r73, AnonymousClass05K.A15), userSession3);
                i = 403767085;
                break;
            case 7:
                A052 = AnonymousClass0fD.A05(-1927922543);
                UserSession userSession4 = (UserSession) this.A05;
                C368278sM r22 = C368278sM.ACCEPT;
                1Xj r74 = ((L57) this.A04).A01;
                LTD.A02(r22, userSession4, r74.getId());
                C63882LAl lAl2 = (C63882LAl) this.A03;
                C246353eS.A05((Fragment) this.A02, C246353eS.A00(AnonymousClass818.IG_SELF_REEL_LIKES_SHEET, new C64549Ldq(lAl2, (C47522E6i) this.A01), userSession4, r74, AnonymousClass05K.A15), userSession4);
                i = 35177012;
                break;
            default:
                A052 = AnonymousClass0fD.A05(-1909625131);
                TaggingActivity taggingActivity = (TaggingActivity) this.A05;
                if (taggingActivity.CKU()) {
                    taggingActivity.EvN();
                } else {
                    C62630Kj1 kj1 = taggingActivity.A0H;
                    if (kj1 == null) {
                        0qQ.A0F("tagType");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C62630Kj1 kj12 = C62630Kj1.PRODUCT;
                    if (kj1 != kj12) {
                        TaggingActivity.A0L(taggingActivity, kj12, false);
                    }
                    TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) this.A04;
                    taggingActivity.Cnh(tagsInteractiveLayout, (ArrayList) this.A01, (ArrayList) this.A02);
                    tagsInteractiveLayout.A08(((MediaSuggestedProductTag) this.A03).A00);
                }
                i = -1687381529;
                break;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
