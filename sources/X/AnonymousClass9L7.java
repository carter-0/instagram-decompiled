package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9L7  reason: invalid class name */
public final class AnonymousClass9L7 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9L7(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass2rI r2;
        AnonymousClass2s3 r1;
        C231592rv r0;
        switch (this.A00) {
            case 0:
                AnonymousClass35N r02 = (AnonymousClass35N) this.A01;
                return AnonymousClass0kN.A01(r02.A0F, r02.A0E);
            case 1:
                AnonymousClass35N r03 = (AnonymousClass35N) this.A01;
                UserSession userSession = r03.A0E;
                String string = r03.A0B.getString(2131962337);
                0qQ.A07(string);
                return userSession.A01(C229072mn.class, new C73670Phj(string, userSession, 32));
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new AnonymousClass3BY((AnonymousClass2rI) this.A01);
            case 19:
                AnonymousClass2rI r4 = (AnonymousClass2rI) this.A01;
                return r4.A0I.A00(r4.A0K.getModuleName(), new MML(r4, 15));
            case 20:
                r2 = (AnonymousClass2rI) this.A01;
                r1 = r2.A0E;
                r0 = C231592rv.MEDIA_LABEL_BELOW_COMMENTS;
                break;
            case 21:
                r2 = (AnonymousClass2rI) this.A01;
                r1 = r2.A0E;
                r0 = C231592rv.MEDIA_CONTENT;
                break;
            case 22:
                r2 = (AnonymousClass2rI) this.A01;
                r1 = r2.A0E;
                r0 = C231592rv.MEDIA_UFI;
                break;
            case 23:
                r2 = (AnonymousClass2rI) this.A01;
                r1 = r2.A0E;
                r0 = C231592rv.MEDIA_COMMENT;
                break;
            case 24:
                r2 = (AnonymousClass2rI) this.A01;
                r1 = r2.A0E;
                r0 = C231592rv.MEDIA_FEEDBACK;
                break;
            case 25:
                r2 = (AnonymousClass2rI) this.A01;
                r1 = r2.A0E;
                r0 = C231592rv.BRANDED_CONTENT_LABEL;
                break;
            case 26:
                r2 = (AnonymousClass2rI) this.A01;
                r1 = r2.A0E;
                r0 = C231592rv.MEDIA_VIEW_ALL_COMMENTS;
                break;
            case 27:
                r2 = (AnonymousClass2rI) this.A01;
                r1 = r2.A0E;
                r0 = C231592rv.LITHO_TESTIMONIAL;
                break;
            case 28:
                r2 = (AnonymousClass2rI) this.A01;
                r1 = r2.A0E;
                r0 = C231592rv.MEDIA_INLINE_COMPOSER_BUTTON;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new AnonymousClass2t8((Context) this.A01);
            case 30:
                return new C232472tm((Context) this.A01);
            case 31:
                return new AnonymousClass2t7((Context) this.A01);
            case 32:
                return new C238253Bd((UserSession) this.A01);
            case 33:
                return new C228492ll((UserSession) this.A01);
            case 34:
                return new 1GW((UserSession) this.A01);
            case 35:
                return new C2372336v((UserSession) this.A01);
            case 36:
                return new C228292lF((UserSession) this.A01);
            case 37:
                return new AnonymousClass3G7((UserSession) this.A01);
            case 38:
                return new 1OI((UserSession) this.A01);
            case 39:
                return new A4E(((AnonymousClass2k7) this.A01).A00);
            case 40:
                return new C229082mo(((AnonymousClass2k7) this.A01).A00);
            case Seq.NULL_REFNUM:
                return new AnonymousClass3G8(((AnonymousClass2k7) this.A01).A00);
            case Seq.RefTracker.REF_OFFSET:
                return new C229762nz(((AnonymousClass2k7) this.A01).A00);
            case 43:
                return new AnonymousClass36H(((AnonymousClass2k7) this.A01).A00);
            case 44:
                return new A4F(((AnonymousClass2k7) this.A01).A00);
            case 45:
                C229772oA r04 = (C229772oA) this.A01;
                return new C355148Ov(r04.A02, r04.A03, (Integer) null, false);
            case 46:
                return new 1UN((UserSession) this.A01);
            case 47:
                return 1FV.A02(((1UN) this.A01).A03);
            case 48:
                return new AnonymousClass2xN((UserSession) this.A01);
            default:
                return ((C62320sa) this.A01).invoke();
        }
        return Integer.valueOf(r2.getAdapterViewType(r1, r0.ordinal()));
    }
}
