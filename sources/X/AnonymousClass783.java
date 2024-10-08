package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.783  reason: invalid class name */
public final class AnonymousClass783 implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass782 A00;

    public AnonymousClass783(AnonymousClass782 r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        String str;
        String str2;
        boolean A01;
        0qQ.A0B(motionEvent, 1);
        AnonymousClass782 r5 = this.A00;
        AnonymousClass780 r2 = r5.A03;
        if (!(r2 == null || r2.A01 == (A01 = r5.A04.A01()))) {
            r2.A01 = A01;
            r2.A00();
        }
        if (motionEvent.getAction() == 1) {
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = r5.A04;
            if (refreshableNestedScrollingParent.A01()) {
                r5.A00 = false;
                r5.A02.stopNestedScroll();
                refreshableNestedScrollingParent.A0A = true;
                if (r5 instanceof AnonymousClass781) {
                    AnonymousClass781 r52 = (AnonymousClass781) r5;
                    0wc r22 = r52.A00;
                    C254793t3 CBU = r52.A02.C6l().CBU();
                    if (CBU != null) {
                        str = C300965yF.A07(CBU);
                    } else {
                        str = null;
                    }
                    0qQ.A0B(r22, 0);
                    0Aj A002 = r22.A00(r22.A00, "direct_shh_mode_swipe_gesture");
                    A002.AAJ("action", "succeed");
                    A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                    A002.Cgf();
                    r52.A03.FHO(new AnonymousClass9I5(!r52.A03(), 0, 1));
                } else {
                    AnonymousClass787 r53 = (AnonymousClass787) r5;
                    boolean A03 = r53.A03();
                    if (!A03) {
                        C332297Uk r9 = r53.A02;
                        if (182.A06(0Tu.A05, r9.A04, 36320317928251682L)) {
                            C330617Nn r0 = r9.A02;
                            if (r0 != null) {
                                r0.setVisibility(0);
                            }
                            C40465Aca aca = new C40465Aca(r9);
                            C17345VRy vRy = new C17345VRy(10, C18372VqY.A00);
                            C330577Nj r23 = r9.A01;
                            if (r23 == null) {
                                0qQ.A0F("emitterAnimationCanvasRenderer");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            C395139zH.A00(r23, vRy, new WVU(aca, r9), "🤫");
                        }
                    }
                    r53.A03.FHO(new AnonymousClass9I5(!A03, 0, 1));
                    AnonymousClass780 r24 = r53.A03;
                    if (!(r24 == null || r24.A02 == (!r53.A03()))) {
                        r24.A02 = z;
                        r24.A00();
                    }
                }
                refreshableNestedScrollingParent.setRefreshing(false);
            } else if (r5.A00) {
                r5.A00 = false;
                if (r5 instanceof AnonymousClass781) {
                    AnonymousClass781 r54 = (AnonymousClass781) r5;
                    0wc r25 = r54.A00;
                    C254793t3 CBU2 = r54.A02.C6l().CBU();
                    if (CBU2 != null) {
                        str2 = C300965yF.A07(CBU2);
                    } else {
                        str2 = null;
                    }
                    0qQ.A0B(r25, 0);
                    0Aj A003 = r25.A00(r25.A00, "direct_shh_mode_swipe_gesture");
                    A003.AAJ("action", "cancel");
                    A003.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                    A003.Cgf();
                }
            }
        }
        if (view != null) {
            view.performClick();
        }
        return false;
    }
}
