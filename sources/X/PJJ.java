package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.Map;
import org.webrtc.EglBase14Impl;

public final class PJJ implements C314616iZ {
    public final /* synthetic */ DirectVisualMessageViewerController A00;

    public final /* synthetic */ void Ck1(C255783ui r1, int i, int i2) {
    }

    public final /* synthetic */ void Ct6() {
    }

    public final void CxO(C255783ui r1) {
    }

    public final /* synthetic */ void D43(C255783ui r1) {
    }

    public final /* synthetic */ void DEu(C255783ui r1) {
    }

    public final /* synthetic */ void DEy() {
    }

    public final /* synthetic */ void DNg(View view, C255783ui r2) {
    }

    public final /* synthetic */ void DRp() {
    }

    public final /* synthetic */ void DUk() {
    }

    public final /* synthetic */ void DcG(C255783ui r1) {
    }

    public final void EJZ(String str, Map map) {
    }

    public PJJ(DirectVisualMessageViewerController directVisualMessageViewerController) {
        this.A00 = directVisualMessageViewerController;
    }

    public final View AqN() {
        return this.A00.viewerContainer;
    }

    public final View AuD() {
        int i;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A00;
        C68167N3h A02 = DirectVisualMessageViewerController.A02(directVisualMessageViewerController);
        boolean z = true;
        if (A02 == null || !AnonymousClass7TF.A1W(A02.A0B, 1iA.A0a)) {
            z = false;
        }
        View view = directVisualMessageViewerController.itemView;
        if (z) {
            if (view != null) {
                i = R.id.viewer_texture_view;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (view != null) {
            i = R.id.viewer_image_view;
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        return view.findViewById(i);
    }

    public final void CHz(User user, String str) {
        DirectVisualMessageViewerController.A0M(this.A00, user.getId(), str);
    }

    public final /* synthetic */ boolean CQz() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [X.0SC, java.lang.Object] */
    public final void DYC(View view, C255783ui r14) {
        Bundle bundle;
        UserSession userSession;
        Class<ModalActivity> cls;
        FragmentActivity fragmentActivity;
        String str;
        String str2;
        String str3;
        long j;
        C68167N3h A002;
        C271434iq r0;
        1iA r02;
        Long A10;
        C68167N3h A003;
        C271434iq r03;
        C635813i r04;
        C68167N3h A004;
        C271434iq r05;
        User user;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A00;
        directVisualMessageViewerController.A0U = true;
        String str4 = null;
        switch (r14.A11.ordinal()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                FragmentActivity fragmentActivity2 = directVisualMessageViewerController.A0e;
                UserSession userSession2 = directVisualMessageViewerController.A0m;
                BIZ biz = r14.A0j;
                if (biz == null || (str2 = biz.A01) == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                FH7.A08(fragmentActivity2, userSession2, 2EG.A1c, str2, directVisualMessageViewerController.A0f.getModuleName());
                return;
            case 15:
                HashtagImpl hashtagImpl = r14.A0k;
                bundle = AnonymousClass7TE.A0a();
                bundle.putParcelable("HashtagFeedFragment.ARGUMENT_HASHTAG", hashtagImpl);
                userSession = directVisualMessageViewerController.A0m;
                cls = ModalActivity.class;
                fragmentActivity = directVisualMessageViewerController.A0e;
                str = AnonymousClass000.A00(3238);
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                OW6 ow6 = directVisualMessageViewerController.A0G;
                if (ow6 == null || (A004 = ow6.A00()) == null || (r05 = A004.A07) == null) {
                    str3 = null;
                } else {
                    str3 = r05.A0K;
                }
                if (str3 == null) {
                    str3 = "";
                }
                try {
                    OW6 ow62 = directVisualMessageViewerController.A0G;
                    if (!(ow62 == null || (A003 = ow62.A00()) == null || (r03 = A003.A07) == null || (r04 = r03.A03) == null)) {
                        str4 = (String) r04.get();
                    }
                    long j2 = 0;
                    if (str4 == null || (A10 = AnonymousClass7TE.A10(str4)) == null) {
                        j = 0;
                    } else {
                        j = A10.longValue();
                    }
                    OW6 ow63 = directVisualMessageViewerController.A0G;
                    if (!(ow63 == null || (A002 = ow63.A00()) == null || (r0 = A002.A07) == null || (r02 = r0.A07) == null)) {
                        j2 = (long) r02.A00;
                    }
                    1Ln r5 = new 1Ln(AnonymousClass7TE.A0e(directVisualMessageViewerController.A0h, C273654mx.A00(2879)), 304);
                    r5.A0Q("author_id", Long.valueOf(j));
                    r5.A0R("media_id", str3);
                    r5.A0Q("media_type", Long.valueOf(j2));
                    r5.A0R("reel_id", "");
                    r5.A0R("tray_session_id", "");
                    r5.A0R("viewer_session_id", directVisualMessageViewerController.A16);
                    r5.A0R(C273654mx.A00(3408), "link_web");
                    ? obj = new Object();
                    AnonymousClass6MT A08 = r14.A08();
                    if (A08 != null) {
                        r5.A00.AAE(obj.A03(0cp.A03(A08.A00()), (0bq) null), "link_url");
                        r5.Cgf();
                        FragmentActivity fragmentActivity3 = directVisualMessageViewerController.A0e;
                        UserSession userSession3 = directVisualMessageViewerController.A0m;
                        AnonymousClass6MT A082 = r14.A08();
                        if (A082 != null) {
                            String A005 = A082.A00();
                            2EG r7 = 2EG.A3B;
                            String moduleName = directVisualMessageViewerController.A0f.getModuleName();
                            DbW.A1N(A005, 2, moduleName);
                            FH7.A09(fragmentActivity3, userSession3, r7, A005, moduleName, str3, (String) null);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } catch (Exception e) {
                    0wb.A06(C273654mx.A00(1359), C273654mx.A00(1267), e);
                }
                break;
            case 19:
                Venue A09 = r14.A09();
                if (A09 != null) {
                    bundle = AnonymousClass7TE.A0a();
                    bundle.putString(AnonymousClass000.A00(229), A09.A05());
                    userSession = directVisualMessageViewerController.A0m;
                    cls = ModalActivity.class;
                    fragmentActivity = directVisualMessageViewerController.A0e;
                    str = "location_feed";
                    break;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            case 21:
                C309516Yo A0M = DbS.A0M(directVisualMessageViewerController.A0e, directVisualMessageViewerController.A0m);
                IgFragmentFactoryImpl A006 = IgFragmentFactoryImpl.A00();
                String str5 = r14.A1a;
                if (str5 != null) {
                    F3W A03 = A006.A03(str5);
                    A03.A0E = directVisualMessageViewerController.A0v.getModuleName();
                    A0M.A0B((Bundle) null, A03.A01());
                    A0M.A04();
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            case 23:
                User user2 = r14.A1B;
                if (user2 != null) {
                    DirectVisualMessageViewerController.A0M(directVisualMessageViewerController, user2.getId(), "direct_visual_message_reel_mention");
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            case 28:
                MusicOverlayStickerModel musicOverlayStickerModel = r14.A0u;
                if (musicOverlayStickerModel != null && (user = musicOverlayStickerModel.A05) != null) {
                    CHz(user, "music_overlay_sticker_artist");
                    return;
                }
                return;
            default:
                throw AnonymousClass7TE.A1B("Unknown interactive type");
        }
        DbU.A0w(fragmentActivity, bundle, userSession, cls, str);
    }

    public final void DcF() {
        this.A00.A0X("resume");
    }

    public final void DcH(C255783ui r3, int i, int i2) {
        this.A00.A0W("tapped");
    }

    public final /* synthetic */ boolean Es9(C255783ui r2) {
        return false;
    }

    public final /* synthetic */ boolean Cml(C255783ui r2, int i, int i2) {
        return false;
    }
}
