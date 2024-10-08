package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.endtoend.EndToEnd;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.81k  reason: invalid class name and case insensitive filesystem */
public final class C3497081k implements C3497181l {
    public final /* synthetic */ C3496881i A00;

    public C3497081k(C3496881i r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final void DKf(C343367q6 r13) {
        ViewStub viewStub;
        C340297l2 r9;
        C3496881i r5 = this.A00;
        AnonymousClass8HC r0 = r5.A03;
        if (!(r0 == null || (r9 = r5.A02) == null)) {
            AnonymousClass80R r8 = r0.A01;
            AnonymousClass810 r11 = r0.A02;
            AnonymousClass8HD r7 = r0.A00;
            boolean A0H = ((C344307re) ((C344327rg) ((C345477tY) C340297l2.A02(r9)).A00.Ape(C344327rg.A00))).A02.A0H();
            r8.A0M.A00().A05.A08 = r9;
            C357638Yz r6 = r8.A0W;
            AnonymousClass9QA r02 = AnonymousClass9QA.A00;
            C358088aL r3 = C358088aL.A0D;
            r6.A0J(r02, r3, A0H);
            r6.A0J(AnonymousClass80M.A00, r3, A0H);
            AnonymousClass80N r4 = AnonymousClass80N.A00;
            r6.A0J(r4, r3, A0H);
            AnonymousClass8FL r2 = (AnonymousClass8FL) r8.A1B.A00.A00();
            r2.A06 = new C343437qD(r9, r8.A1Q);
            AnonymousClass8FL.A01(r2, ((Set) r2.A0H.A09.A00).contains(r3));
            C352888Fl r22 = r8.A0l;
            0qQ.A0B(r22, 0);
            C2354830a A002 = AnonymousClass30Y.A00((Object) null, (Object) null, "camera_preview");
            A002.A00(new C343447qE(r22, r11));
            AnonymousClass30Y A01 = A002.A01();
            View requireViewById = r11.A01.requireViewById(R.id.camera_stub_constraint_layout);
            0qQ.A07(requireViewById);
            View findViewById = requireViewById.findViewById(R.id.camera_view);
            if (findViewById == null && (findViewById = requireViewById.findViewById(R.id.preview_view)) == null) {
                0kD.A07("QuickCaptureViewpointController", "Camera preview view not found.", (Throwable) null);
            } else {
                r11.A03.A05(findViewById, A01);
            }
            if (AnonymousClass81x.A00(r8.A0R)) {
                r7.getClass();
                Set<C358088aL> set = r7.A04;
                HashMap hashMap = r6.A0E;
                AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(r4);
                if (abstractCollection == null) {
                    abstractCollection = new HashSet();
                    hashMap.put(r4, abstractCollection);
                }
                abstractCollection.clear();
                abstractCollection.addAll(set);
                for (C358088aL A02 : set) {
                    C357638Yz.A02(r4, A02, r6, false);
                }
            }
        }
        C340297l2 r03 = r5.A02;
        if (r03 == null || !r03.A0T() || r13.A00 != null) {
            r5.A01 = r13;
            r5.A0A = true;
            C3496981j r42 = r5.A0H;
            List list = r42.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C3497181l r04 = (C3497181l) list.get(i);
                r42.A02(r04);
                r04.DKf(r13);
            }
            C340297l2 r1 = r5.A02;
            if (r1 != null) {
                r1.A0S(r5.A0Q);
            }
            if (r5.A0P && (viewStub = (ViewStub) r5.A0F.findViewById(R.id.birthday_selfie_confetti_view_stub)) != null) {
                ? r12 = (CircularImageView) viewStub.inflate().requireViewById(R.id.birthday_selfie_confetti_circular_imageview);
                C240943Ng.A00(r12.getContext(), r12);
                C240943Ng.A01(r12.getDrawable());
            }
        }
    }

    public final void DDD(Exception exc) {
        EndToEnd.A05();
        C3496881i r1 = this.A00;
        0kD.A01("Camera initialization failure", C340217kt.A03(exc));
        C3496981j r4 = r1.A0H;
        List list = r4.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3497181l r0 = (C3497181l) list.get(i);
            r4.A02(r0);
            r0.DDD(exc);
        }
    }
}
