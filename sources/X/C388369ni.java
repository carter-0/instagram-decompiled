package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.io.Serializable;

/* renamed from: X.9ni  reason: invalid class name and case insensitive filesystem */
public final class C388369ni extends K5U implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "ClipsTimelineTemplateLandingPageFragment";
    public CreationActionBar A00;
    public C64701LgW A01;
    public IgdsMediaButton A02;
    public IgdsMediaButton A03;
    public final 293 A04;
    public final AnonymousClass0eM A05;

    public final String getModuleName() {
        return "clips_template_landing_page";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0076, code lost:
        if (r5.CbC() != true) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r3 = 0
            X.0qQ.A0B(r13, r3)
            super.onViewCreated(r13, r14)
            r0 = 2131430264(0x7f0b0b78, float:1.8482224E38)
            android.view.View r0 = r13.requireViewById(r0)
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r0 = (com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar) r0
            r12.A00 = r0
            android.content.Context r10 = X.AnonymousClass7TE.A0S(r13)
            r9 = 0
            r6 = 2
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = X.AnonymousClass8PT.A00(r10, r9)
            X.5pj r0 = X.C296235pj.PRIMARY
            r2.setButtonStyle(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131955497(0x7f130f29, float:1.9547523E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            r2.setLabel(r0)
            r0 = 23
            X.AOX.A00(r2, r0, r12)
            r12.A02 = r2
            com.instagram.common.session.UserSession r4 = r12.A0O()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322164760193001(0x810ad1000127e9, double:3.0336214797395344E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            java.lang.String r11 = "addClipsButton"
            java.lang.String r8 = "creationActionBar"
            r7 = 1
            if (r0 == 0) goto L_0x00af
            X.1E7 r4 = X.1E8.A03
            com.instagram.common.session.UserSession r2 = r12.A0O()
            X.87s r0 = r12.A0P()
            com.instagram.clips.template.creation.model.ClipsTemplateModel r0 = r0.A05
            if (r0 == 0) goto L_0x00ad
            java.lang.String r1 = r0.A03
        L_0x005c:
            java.lang.String r0 = "ClipsTimelineTemplateLandingPageFragment"
            X.1Xj r5 = r4.A01(r2, r0, r1)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r4 = X.AnonymousClass8PT.A00(r10, r9)
            X.0eM r0 = r12.A05
            r0.getValue()
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r4)
            if (r5 == 0) goto L_0x0078
            boolean r0 = r5.CbC()
            r2 = 1
            if (r0 == r7) goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131955498(0x7f130f2a, float:1.9547525E38)
            if (r2 == 0) goto L_0x0085
            r0 = 2131972593(0x7f1351f1, float:1.9582198E38)
        L_0x0085:
            java.lang.String r0 = r1.getString(r0)
            r4.setLabel(r0)
            X.ID0 r0 = new X.ID0
            r0.<init>((int) r6, (java.lang.Object) r5, (java.lang.Object) r4, (java.lang.Object) r12)
            X.AnonymousClass0fU.A00(r0, r4)
            r12.A03 = r4
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r2 = r12.A00
            if (r2 == 0) goto L_0x00c3
            r0 = 12
            X.9I9 r1 = new X.9I9
            r1.<init>(r3, r0, r3)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r12.A02
            if (r0 == 0) goto L_0x00c7
            com.instagram.igds.components.mediabutton.IgdsMediaButton[] r0 = new com.instagram.igds.components.mediabutton.IgdsMediaButton[]{r4, r0}
        L_0x00a9:
            r2.A0E(r1, r0)
            return
        L_0x00ad:
            r1 = r9
            goto L_0x005c
        L_0x00af:
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r2 = r12.A00
            if (r2 == 0) goto L_0x00c3
            r0 = 12
            X.9I9 r1 = new X.9I9
            r1.<init>(r3, r0, r3)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r12.A02
            if (r0 == 0) goto L_0x00c7
            com.instagram.igds.components.mediabutton.IgdsMediaButton[] r0 = new com.instagram.igds.components.mediabutton.IgdsMediaButton[]{r0}
            goto L_0x00a9
        L_0x00c3:
            X.0qQ.A0F(r8)
            goto L_0x00ca
        L_0x00c7:
            X.0qQ.A0F(r11)
        L_0x00ca:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C388369ni.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final boolean onBackPressed() {
        if (this.A01 != null) {
            return false;
        }
        0qQ.A0F("deleteTrayController");
        throw AnonymousClass00P.createAndThrow();
    }

    public C388369ni() {
        293 r1;
        C41607AxL axL = C41607AxL.A00;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMB(new MMB(this, 46), 47));
        Serializable serializable = null;
        this.A05 = new C227862kA(new MMB(A002, 48), axL, new C66291MMa(14, (Object) null, A002), new 0Yh(C354878Ns.class));
        Bundle bundle = this.mArguments;
        serializable = bundle != null ? bundle.getSerializable("ARG_CLIPS_TEMPLATE_BROWSER_ENTRY_POINT") : serializable;
        this.A04 = (!(serializable instanceof 293) || (r1 = (293) serializable) == null) ? 293.A06 : r1;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.3on, X.LgW, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1187662971);
        super.onCreate(bundle);
        ? obj = new Object();
        this.A01 = obj;
        registerLifecycleListener(obj);
        AnonymousClass0fD.A09(-715150070, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(156910613);
        0qQ.A0B(layoutInflater, 0);
        if (this.A04 == 293.A06) {
            str = "TEMPLATE_LANDING_PAGE_ENTRY_POINT_REELS_VIEWER";
        } else {
            str = "TEMPLATE_LANDING_PAGE_ENTRY_POINT_TEMPLATE_BROWSER";
        }
        27r A012 = 27p.A01(A0O());
        0Aj A0e = AnonymousClass7TE.A0e(A012.A01, "ig_camera_template_landing_page_impression");
        AnonymousClass283 r7 = A012.A04;
        String str2 = r7.A0L;
        C59725JVj jVj = r7.A0C;
        if (!(!A0e.isSampled() || jVj == null || str2 == null)) {
            A0e.A8M(C279294yP.CLIPS, "camera_destination");
            A0e.AAJ("camera_session_id", str2);
            AnonymousClass7TE.A1V(A0e, r7);
            A0e.AAJ("clips_template_landing_page_entry_point", str);
            AnonymousClass7TH.A0U(A0e);
            A0e.A8M(jVj, "surface");
            AnonymousClass7TE.A1W(A0e, "event_type", 2);
            AnonymousClass7TH.A0V(A0e);
        }
        View inflate = layoutInflater.inflate(R.layout.clips_timeline_template_landing_page_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1472299001, A022);
        return inflate;
    }
}
