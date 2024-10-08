package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8A8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8A8 implements AnonymousClass0eK {
    public final /* synthetic */ ViewStub A00;
    public final /* synthetic */ AnonymousClass2Fj A01;
    public final /* synthetic */ C3503284f A02;
    public final /* synthetic */ AnonymousClass80D A03;
    public final /* synthetic */ AnonymousClass80R A04;
    public final /* synthetic */ C234462xu A05;

    public /* synthetic */ AnonymousClass8A8(ViewStub viewStub, AnonymousClass2Fj r2, C3503284f r3, AnonymousClass80D r4, AnonymousClass80R r5, C234462xu r6) {
        this.A04 = r5;
        this.A00 = viewStub;
        this.A03 = r4;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final Object get() {
        List list;
        View requireViewById;
        List list2;
        AnonymousClass80R r0 = this.A04;
        ViewStub viewStub = this.A00;
        AnonymousClass80D r2 = this.A03;
        C234462xu r24 = this.A05;
        AnonymousClass2Fj r41 = this.A01;
        C3503284f r20 = this.A02;
        List list3 = null;
        if (r2.A45) {
            ArrayList arrayList = r2.A2t;
            if (arrayList != null) {
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        if (r2.A45 && (list2 = r2.A2x) != null) {
            list3 = Collections.unmodifiableList(list2);
        }
        if (viewStub.getParent() != null) {
            requireViewById = viewStub.inflate();
        } else {
            requireViewById = r0.A0C.requireViewById(R.id.clips_post_capture_controls_v2);
        }
        UserSession userSession = r0.A0R;
        AnonymousClass4DH r18 = r0.A0J;
        AnonymousClass85O r17 = r0.A1O;
        C359278cX r11 = new C359278cX(r0);
        C357638Yz r21 = r0.A0W;
        TargetViewSizeProvider targetViewSizeProvider = r0.A0i;
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = r0.A1i;
        AnonymousClass8BA r10 = r0.A0e;
        C3499582p r23 = r0.A0o;
        AnonymousClass80U r9 = r0.A1f;
        InteractiveDrawableContainer interactiveDrawableContainer = r0.A2B;
        ViewGroup viewGroup = r0.A1Y.A00;
        AnonymousClass80D r13 = r0.A0v;
        AnonymousClass846 r8 = r0.A1v;
        28D r7 = r0.A01;
        C359288cY r6 = new C359288cY(r0);
        String BUn = r0.A26.BUn();
        AnonymousClass81T r5 = r0.A11;
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = r0.A1p;
        ViewGroup viewGroup2 = viewGroup;
        AnonymousClass2Fj r14 = r41;
        C359318cb r12 = new C359318cb(viewGroup2, r14, r7, r18, r20, r5, userSession, (IgFrameLayout) requireViewById, r21, targetViewSizeProvider, r23, r13, r0.A1N, r17, r10, r9, clipsAudioMixingDrawerController, clipsCreationDraftViewModel, r8, r24, interactiveDrawableContainer, BUn, list, list3, r11, r6, new C359298cZ(r0), new C359308ca(r0));
        ((AnonymousClass80T) r9).A01.A02(r12);
        r10.A1u.add(r12);
        return r12;
    }
}
