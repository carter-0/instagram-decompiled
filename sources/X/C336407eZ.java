package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

/* renamed from: X.7eZ  reason: invalid class name and case insensitive filesystem */
public final class C336407eZ extends C231632rz {
    public final C334377bA A00;
    public final AnonymousClass0iw A01;
    public final 1Xj A02;
    public final WeakReference A03;

    public C336407eZ(AnonymousClass0iw r2, UserSession userSession, 1Xj r4, WeakReference weakReference) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(userSession, 2);
        this.A01 = r2;
        this.A02 = r4;
        this.A03 = weakReference;
        this.A00 = new C334377bA(r2, userSession);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String id;
        Long l;
        int A032 = AnonymousClass0fD.A03(-930625694);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.comments.carousel.MentionThumbnailCarouselViewBinder.Holder");
        C380409Yb r1 = (C380409Yb) tag;
        C61080JwI jwI = (C61080JwI) obj;
        0qQ.A0B(r1, 0);
        0qQ.A0B(jwI, 1);
        C385199iY r4 = r1.A00;
        if (!0qQ.A0K(r4.A00, jwI)) {
            r4.A00 = jwI;
            r4.clear();
            for (Object addModel : (List) jwI.A00) {
                r4.addModel(addModel, r4.A01);
            }
            r4.notifyDataSetChangedSmart();
        }
        1Xj r6 = this.A02;
        if (r6 != null) {
            C334377bA r12 = this.A00;
            Set set = r12.A02;
            if (!(00k.A0u(set, r6.getId()) || (id = r6.getId()) == null || id.length() == 0)) {
                0wc r2 = r12.A01;
                0Aj A002 = r2.A00(r2.A00, C273654mx.A00(309));
                if (A002.isSampled()) {
                    A002.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.getId());
                    A002.AAJ("m_pk", r6.getId());
                    User CCd = r6.A0C.CCd();
                    String str = null;
                    if (CCd != null) {
                        l = 00y.A0n(10, CCd.getId());
                    } else {
                        l = null;
                    }
                    A002.A9F("entity_id", l);
                    User CCd2 = r6.A0C.CCd();
                    if (CCd2 != null) {
                        str = CCd2.getUsername();
                    }
                    A002.AAJ(C273654mx.A00(276), str);
                    String A2n = r6.A2n();
                    if (A2n != null) {
                        A002.A9F("media_id", 00y.A0n(10, A2n));
                        A002.A8M(r6.BR7().A00(), "media_type");
                        A002.AAJ(C273654mx.A00(3017), "carousel_slide_mention");
                        A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                        A002.AAJ("device_aspect_ratio_category", C254473sX.A00);
                        A002.AAJ("device_fold_orientation", C254483sY.A00);
                        A002.AAJ("device_fold_state", C254493sZ.A00);
                        A002.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                        A002.Cgf();
                        String id2 = r6.getId();
                        if (id2 != null) {
                            set.add(id2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(477433419, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        C334397bC r3;
        int A032 = AnonymousClass0fD.A03(1929961750);
        0qQ.A0B(viewGroup, 1);
        AnonymousClass0iw r4 = this.A01;
        WeakReference weakReference = this.A03;
        if (weakReference != null) {
            r3 = (C334397bC) weakReference.get();
        } else {
            r3 = null;
        }
        0qQ.A0B(r4, 1);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_recyclerview_horizontal, viewGroup, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        inflate.setTag(new C380409Yb(inflate, r3, r4));
        AnonymousClass0fD.A0A(-1566356108, A032);
        return inflate;
    }
}
