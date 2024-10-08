package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.LrJ  reason: case insensitive filesystem */
public final class C65320LrJ implements G73 {
    public final int A00;
    public final Object A01;

    public C65320LrJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DoN(1Xj r7) {
        Context requireContext;
        int i;
        ImageUrl A1Q;
        RoundedCornerImageView roundedCornerImageView;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r7, 0);
                K54 k54 = (K54) this.A01;
                k54.A04 = r7;
                K54.A00(k54, false);
                RoundedCornerImageView roundedCornerImageView2 = k54.A03;
                if (roundedCornerImageView2 != null) {
                    roundedCornerImageView2.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
                }
                1Xj r0 = k54.A04;
                if (!(r0 == null || (A1Q = r0.A1Q()) == null || (roundedCornerImageView = k54.A03) == null)) {
                    roundedCornerImageView.setUrl(A1Q, k54);
                }
                TextView textView = k54.A01;
                if (textView != null) {
                    DbT.A18(k54.requireContext(), textView, 2131952245);
                }
                TextView textView2 = k54.A00;
                if (textView2 != null) {
                    Context requireContext2 = k54.requireContext();
                    1Xj r02 = k54.A04;
                    if (r02 == null || !r02.A5G()) {
                        requireContext = k54.requireContext();
                        i = 2131954042;
                    } else {
                        requireContext = k54.requireContext();
                        i = 2131954043;
                    }
                    DbX.A13(requireContext2, textView2, C51967G9n.A0p(requireContext, i), 2131952244);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = k54.A05;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryActionText(k54.requireContext().getString(2131970140));
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = k54.A05;
                if (igdsBottomButtonLayout2 != null) {
                    igdsBottomButtonLayout2.setPrimaryActionOnClickListener(new LY1(k54, 28));
                }
                TextView textView3 = k54.A02;
                if (textView3 != null) {
                    DbT.A18(k54.requireContext(), textView3, 2131976633);
                }
                TextView textView4 = k54.A02;
                if (textView4 != null) {
                    LY1.A00(textView4, 29, k54);
                }
                ((WGU) AnonymousClass7TE.A14(k54.A09)).A0H(C16678UzE.RESHARED_MEDIA_AD_NOT_DELIVERING_SCREEN, "reshared_media_ad_not_delivering");
                return;
            case 2:
                0qQ.A0B(r7, 0);
                ((C63781L6n) this.A01).A02.Epw(r7);
                return;
            case 4:
                0qQ.A0B(r7, 0);
                C52029GCb gCb = (C52029GCb) this.A01;
                UserSession userSession = gCb.A0C;
                C270634h3 r1 = new C270634h3(ClipsViewerSource.CLIPS_QUESTION_RESPONSE, userSession);
                r1.A1C = r7.getId();
                r1.A1H = "";
                r1.A09 = AnonymousClass5OB.QUESTION_REPLY;
                C250563lf.A0X(gCb.A07, r1.A00(), userSession);
                return;
            default:
                0qQ.A0B(r7, 0);
                ((AnonymousClass4D7) this.A01).resumeWith(r7);
                return;
        }
    }

    public final void onFail(String str) {
        AnonymousClass4D7 r1;
        0eQ r0;
        switch (this.A00) {
            case 0:
                K54.A00((K54) this.A01, false);
                throw new C318126oR(002.A0R(AnonymousClass000.A00(418), AnonymousClass000.A00(115)));
            case 1:
                r1 = (AnonymousClass4D7) this.A01;
                r0 = JTU.A0c(JTO.A0u(str));
                break;
            case 2:
                return;
            case 3:
                r1 = (AnonymousClass4D7) this.A01;
                r0 = null;
                break;
            default:
                0f9 AEf = 0wj.A01.AEf(AnonymousClass000.A00(4324), 817902720);
                AEf.ABQ(DialogModule.KEY_MESSAGE, "Failed to fetch q&a response sticker original media: $errorMessage");
                AEf.report();
                return;
        }
        r1.resumeWith(r0);
    }
}
