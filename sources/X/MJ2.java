package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.io.Serializable;
import java.util.HashMap;
import org.webrtc.EglBase14Impl;

public final class MJ2 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJ2(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [X.07Z, X.G7r, X.K74] */
    /* JADX WARNING: type inference failed for: r0v89, types: [X.2tF, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object invoke;
        long j;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        switch (this.A00) {
            case 1:
                UserSession userSession = ((C15291UZw) this.A01).A00;
                0qQ.A07(userSession);
                return new C385639jI(userSession);
            case 2:
                return new C387339m3((StoryGroupMentionTappableData) C320236s2.A00(DbS.A0B(this.A01), StoryGroupMentionTappableData.class, "group_mention_sticker_model"));
            case 3:
                C15291UZw uZw = (C15291UZw) this.A01;
                UserSession userSession2 = uZw.A00;
                0qQ.A06(userSession2);
                return 17h.A00(userSession2).A02(uZw.requireArguments().getString(C66579MXk.A00(355)));
            case 4:
            case 13:
                return new PromptStickerModel((StoryPromptTappableDataIntf) C320236s2.A00(DbS.A0B(this.A01), StoryPromptTappableDataIntf.class, "prompt_sticker_model"));
            case 5:
            case 8:
                Serializable serializable = DbS.A0B(this.A01).getSerializable(C273654mx.A00(3181));
                if (!(serializable instanceof HashMap)) {
                    return null;
                }
                return serializable;
            case 6:
            case 14:
                return C51971G9r.A0U(this.A01);
            case 7:
            case 15:
                UserSession userSession3 = ((C15291UZw) this.A01).A00;
                0qQ.A07(userSession3);
                return new C310366as(userSession3);
            case 9:
                Serializable serializable2 = DbS.A0B(this.A01).getSerializable("camera_entry_point_type");
                if (!(serializable2 instanceof 28D) || serializable2 == null) {
                    return 28D.A46;
                }
                return serializable2;
            case 10:
                return DbS.A0B(this.A01).getParcelable(C273654mx.A00(371));
            case 11:
                return DbU.A0g(DbS.A0B(this.A01), C273654mx.A00(3184));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return C14291TtP.parseFromJson(16P.A00(C320236s2.A01(DbS.A0B(this.A01), C273654mx.A00(372))));
            case 16:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    j = bundle.getLong(AnonymousClass000.A00(1734));
                } else {
                    j = -1;
                }
                return Long.valueOf(j);
            case 17:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 == null || (string4 = bundle2.getString(AnonymousClass000.A00(1735))) == null) {
                    return null;
                }
                return AnonymousClass7TE.A0t(string4);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C61370K4o k4o = (C61370K4o) this.A01;
                Context context = k4o.getContext();
                if (context != null) {
                    return DbU.A0U(AnonymousClass2t9.A00(context), new H7S(k4o, AnonymousClass7TE.A0l(k4o.A01), k4o));
                }
                return null;
            case 19:
            case 25:
                return this.A01;
            case 20:
            case 26:
                return DbT.A0r(this.A01);
            case 22:
                C61370K4o k4o2 = (C61370K4o) this.A01;
                Bundle bundle3 = k4o2.mArguments;
                if (bundle3 != null && (string = bundle3.getString(AnonymousClass000.A00(2624))) != null) {
                    return new H6F(AnonymousClass7TE.A0l(k4o2.A01), string);
                }
                throw AnonymousClass7TE.A0z("ARG_COMMENT_LIKES_COMMENT_ID must not be null");
            case 23:
                K74 k74 = (K74) this.A01;
                Bundle bundle4 = k74.mArguments;
                if (bundle4 == null || (string5 = bundle4.getString(AnonymousClass000.A00(1099))) == null) {
                    throw AnonymousClass7TE.A0z("ARG_DASHBOARD_COMMENTS_MEDIA_ID must not be null");
                }
                AnonymousClass0eM r3 = k74.A03;
                1Xj A02 = DbX.A0d(r3).A02(string5);
                Context context2 = k74.getContext();
                if (context2 == null) {
                    return null;
                }
                AnonymousClass2tC A002 = AnonymousClass2t9.A00(context2);
                A002.A01(new C61664KGo(k74, A02, new C317376nA(new C234072ww(AnonymousClass7TE.A0l(r3), k74, (C249763kK) null), AnonymousClass7TE.A0l(r3), (2el) AnonymousClass7TE.A14(k74.A06), k74, (C310016aI) null, (C273384mU) null), k74));
                return DbU.A0U(A002, new Object());
            case 24:
                int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                ? r1 = (K74) this.A01;
                return new C46434Dew(r1, AnonymousClass7TE.A0l(r1.A03), r1);
            case 28:
                K74 k742 = (K74) this.A01;
                Bundle bundle5 = k742.mArguments;
                if (bundle5 == null || (string2 = bundle5.getString(AnonymousClass000.A00(1099))) == null) {
                    throw AnonymousClass7TE.A0z("ARG_DASHBOARD_COMMENTS_MEDIA_ID must not be null");
                }
                Bundle bundle6 = k742.mArguments;
                if (bundle6 != null && (string3 = bundle6.getString(AnonymousClass000.A00(2625))) != null) {
                    return new C61586KDn(AnonymousClass7TE.A0l(k742.A03), string3, string2);
                }
                throw AnonymousClass7TE.A0z("ARG_DASHBOARD_COMMENTS_REEL_ID must not be null");
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                K74 k743 = (K74) this.A01;
                AnonymousClass0eM r0 = k743.A03;
                return new C51031FnN(k743, k743, AnonymousClass7TE.A0l(r0), k743, new F35(DbX.A0P(k743, r0)), k743);
            case 30:
                C73540PeW peW = (C73540PeW) this.A01;
                synchronized (peW.A02) {
                    invoke = peW.A08.B9B().invoke();
                }
                return invoke;
            default:
                return DbY.A0I(this.A01);
        }
    }
}
