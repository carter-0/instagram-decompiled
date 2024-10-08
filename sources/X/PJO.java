package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.shopping.ProductItemWithARIntf;

public final class PJO implements C265834Wm, C317136mm {
    public final /* synthetic */ DirectVisualMessageViewerController A00;

    public final void DY3() {
    }

    public PJO(DirectVisualMessageViewerController directVisualMessageViewerController) {
        this.A00 = directVisualMessageViewerController;
    }

    public final void DBS(RectF rectF, CreativeConfigIntf creativeConfigIntf, String str) {
        if (creativeConfigIntf != null) {
            DirectVisualMessageViewerController directVisualMessageViewerController = this.A00;
            if (!directVisualMessageViewerController.A0y.A04) {
                directVisualMessageViewerController.A0U = true;
                UserSession userSession = directVisualMessageViewerController.A0m;
                FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
                AnonymousClass4DH r0 = directVisualMessageViewerController.A0f;
                String str2 = directVisualMessageViewerController.A16;
                C273434mZ r5 = directVisualMessageViewerController.A0w;
                ProductItemWithARIntf B0B = creativeConfigIntf.B0B();
                if (B0B != null) {
                    C249713kF r52 = C249713kF.A00;
                    FragmentActivity requireActivity = r0.requireActivity();
                    28D r7 = 28D.A2P;
                    String moduleName = r0.getModuleName();
                    OVZ A08 = r52.A08(requireActivity, r7, userSession, B0B.AcJ(), C14502TxO.A00(B0B.BgJ()), (String) null, moduleName);
                    A08.A03 = str2;
                    A08.A01();
                } else {
                    AnonymousClass6W8 A02 = AnonymousClass6W8.A02(fragmentActivity, ((A8F) AnonymousClass36R.A00.getValue()).A00(rectF, 28D.A2G, userSession, creativeConfigIntf), userSession, TransparentModalActivity.class, C273654mx.A00(236));
                    A02.A0E(r5);
                    A02.A0C(fragmentActivity);
                }
                fragmentActivity.overridePendingTransition(0, 0);
            }
        }
    }

    public final void DY4(C249693kD r10, C272024jy r11, C265854Wo r12, String str, String str2, float f, int i) {
        boolean A1Z = AnonymousClass7TG.A1Z(r12, r11);
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A00;
        C254743sy r2 = directVisualMessageViewerController.A0x;
        if (!(r2 instanceof MsysThreadId)) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = directVisualMessageViewerController.viewerContainer;
            if (touchInterceptorFrameLayout != null) {
                Context A0S = AnonymousClass7TE.A0S(touchInterceptorFrameLayout);
                UserSession userSession = directVisualMessageViewerController.A0m;
                DirectThreadKey A03 = C66647MaG.A03(r2);
                C68167N3h A02 = DirectVisualMessageViewerController.A02(directVisualMessageViewerController);
                if (A02 == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (!182.A06(0Tu.A05, userSession, 2342154711433478881L)) {
                    C358248ab A0Y = DbS.A0Y(A0S);
                    A0Y.A09(2131959242);
                    A0Y.A08(2131959241);
                    Dba.A1L(A0Y);
                } else {
                    int i2 = i;
                    if (i2 < C51971G9r.A0H(r11.A0F)) {
                        C66665MaY A07 = C66669Mac.A07(userSession, C65951iP.class);
                        String str3 = A02.A0K;
                        1OS r1 = new 1OS(A07);
                        r1.A01 = A03;
                        r1.A03 = str3;
                        r1.A00 = i2;
                        r1.A02 = DbV.A0s();
                        C66580MXl.A1P(userSession, r1);
                        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.POLLING, A02.A0P);
                        if (A002 != null) {
                            A002.A1L = Integer.valueOf(i2);
                        }
                        r12.Ext(userSession, (Runnable) null);
                        0xY A0N = AnonymousClass7TF.A0N(userSession);
                        A0N.E5T("has_ever_voted_on_direct_poll", A1Z);
                        A0N.apply();
                        return;
                    }
                    0wb.A03(C68463NJb.__redex_internal_original_name, "Selected poll index out of bounds");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }
}
