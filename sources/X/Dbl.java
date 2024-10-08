package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.CreatorToolsMonetizationApi;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.EglBase14Impl;

public final class Dbl extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dbl(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new Dbl(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String string;
        switch (this.A00) {
            case 0:
            case 7:
            case 23:
            case 47:
                return DbT.A0r(this.A01);
            case 2:
                return new C47725EEi(AnonymousClass7TE.A0l(((E7W) this.A01).A0G));
            case 3:
                UserSession userSession = ((C49729F3u) this.A01).A01;
                if (userSession != null) {
                    return Integer.valueOf(C375479Ds.A00(userSession));
                }
                break;
            case 4:
                UserSession userSession2 = ((C49729F3u) this.A01).A01;
                if (userSession2 != null) {
                    return C48796EkJ.A00(userSession2);
                }
                break;
            case 5:
                return C48796EkJ.A00(AnonymousClass7TE.A0l(((E7X) this.A01).A0J));
            case 6:
            case 22:
            case 46:
                return this.A01;
            case 9:
                return new C47724EEh(AnonymousClass7TE.A0l(((E7X) this.A01).A0J));
            case 10:
                return new C50337FYu((UserSession) this.A01);
            case 11:
                return new CreatorToolsMonetizationApi((UserSession) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                E2G e2g = (E2G) this.A01;
                return new C46836DmC(e2g, AnonymousClass7TE.A0l(e2g.A01), 0sn.A00);
            case 13:
            case 17:
                return DbT.A0E(this.A01).getViewModelStore();
            case 14:
                return new C47721EEe(AnonymousClass7TE.A0l(((E2G) this.A01).A01));
            case 15:
            case 20:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    return DbS.A0l(bundle);
                }
                return null;
            case 16:
                C47440E2m e2m = (C47440E2m) this.A01;
                return new C46836DmC(e2m, AnonymousClass7TE.A0l(e2m.A02), 0sn.A00);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new C47721EEe(AnonymousClass7TE.A0l(((C47440E2m) this.A01).A02));
            case 19:
                E2L e2l = (E2L) this.A01;
                return new C46837DmD(e2l, AnonymousClass7TE.A0l(e2l.A03), 0sn.A00);
            case 21:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 == null || (string = bundle2.getString("value_props_flow_type")) == null) {
                    return ValuePropsFlow.UNRECOGNIZED.A00;
                }
                return string;
            case 25:
                return new C47721EEe(AnonymousClass7TE.A0l(((E2L) this.A01).A03));
            case 26:
                return new A5I((UserSession) this.A01);
            case 27:
                return DbV.A0O(((A5I) this.A01).A00);
            case 28:
                return new C363398jf((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new C363758kI((UserSession) this.A01);
            case 30:
                UserSession userSession3 = (UserSession) this.A01;
                return new 2CE(AnonymousClass12T.A00, userSession3, new CXPNoticeStateRepository(userSession3, AnonymousClass05K.A01), 2D5.A00(userSession3), AnonymousClass7TF.A0w(2DQ.A0a, new Object()));
            case 31:
                return new AnonymousClass9RT((UserSession) this.A01);
            case 32:
                return 2D5.A00(((AnonymousClass9RT) this.A01).A00);
            case 33:
                return new C363268jR((UserSession) this.A01);
            case 34:
                return new C363568jx((UserSession) this.A01);
            case 35:
                return new C40442AcD((UserSession) this.A01);
            case 36:
                return 2D5.A00(((C40442AcD) this.A01).A00);
            case 37:
                return new C40443AcE((UserSession) this.A01);
            case 38:
                return 2D5.A00(((C40443AcE) this.A01).A00);
            case 39:
                return 1Au.A00(((C40443AcE) this.A01).A00);
            case 40:
                Map map = (Map) ((N4R) this.A01).A02;
                ArrayList A0v = DbS.A0v(map.size());
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry entry = (Map.Entry) A0u.next();
                    A0v.add(new C39876ACx(((C390849rw) entry.getKey()).name(), ((Boolean) entry.getValue()).booleanValue()));
                }
                return A0v;
            case Seq.NULL_REFNUM:
                return new C52524GWb((UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET:
                C61002Juy juy = C61002Juy.A04;
                return C64010LIx.A00(((C50412FbL) this.A01).A01);
            case 43:
                return Integer.valueOf(AnonymousClass7TF.A03(((View) this.A01).getContext(), R.attr.igds_color_primary_text));
            case 44:
                return DbV.A0n(((View) this.A01).getContext(), R.color.igds_pill_active_text);
            case 45:
                return new AnonymousClass7I3(AnonymousClass7TE.A0l(((C47446E2s) this.A01).A02));
            case 49:
                return new C47722EEf(AnonymousClass7TE.A0l(((C47446E2s) this.A01).A02));
            default:
                return DbY.A0I(this.A01);
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }
}
