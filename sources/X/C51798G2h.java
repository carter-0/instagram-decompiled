package X;

import android.os.Bundle;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import org.webrtc.EglBase14Impl;

/* renamed from: X.G2h  reason: case insensitive filesystem */
public final class C51798G2h extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51798G2h(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C51798G2h(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle;
        String str;
        switch (this.A00) {
            case 0:
            case 5:
            case 13:
            case 21:
            case 26:
            case 32:
            case Seq.NULL_REFNUM:
            case 46:
                return this.A01;
            case 1:
            case 6:
            case 14:
            case 22:
            case 27:
            case 33:
            case Seq.RefTracker.REF_OFFSET:
            case 47:
                return DbT.A0r(this.A01);
            case 3:
                E7R e7r = (E7R) this.A01;
                return new KER(DbY.A05(e7r), AnonymousClass7TE.A0l(e7r.A02), DbS.A0t(e7r.A01), (ArrayList) e7r.A00.getValue());
            case 4:
            case 30:
            case 36:
                return new Object[((AnonymousClass0r6[]) this.A01).length];
            case 8:
                E7M e7m = (E7M) this.A01;
                AnonymousClass0eM r0 = e7m.A01;
                return new EFC(AnonymousClass7TE.A0l(r0), new SubscribedAndRecommendedCreatorListRepository(AnonymousClass7TE.A0l(r0)), e7m.requireArguments().getBoolean("ARG_SHOW_EDUCATION_HEADER"));
            case 9:
                C47408E1a e1a = (C47408E1a) this.A01;
                User A02 = 17h.A00(AnonymousClass7TE.A0l(e1a.A07)).A02(DbS.A0t(e1a.A04));
                if (A02 != null) {
                    return A02;
                }
                throw AnonymousClass7TE.A0y();
            case 10:
                bundle = DbS.A0B(this.A01);
                str = "creator_user_id";
                break;
            case 11:
            case EglBase14Impl.EGLExt_SDK_VERSION:
                bundle = DbS.A0B(this.A01);
                str = "origin";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return C320236s2.A01(DbS.A0B(this.A01), "recipient_user_id");
            case 16:
                C47408E1a e1a2 = (C47408E1a) this.A01;
                return new C47739EEx(AnonymousClass7TE.A0l(e1a2.A07), e1a2.requireActivity());
            case 17:
                E41 e41 = (E41) this.A01;
                return 17h.A00(AnonymousClass7TE.A0l(e41.A03)).A02(e41.requireArguments().getString("creator_user_id"));
            case 19:
                bundle = DbS.A0B(this.A01);
                str = "recipient_user_id";
                break;
            case 20:
                bundle = DbS.A0B(this.A01);
                str = "sku";
                break;
            case 24:
                E41 e412 = (E41) this.A01;
                return new C47739EEx(AnonymousClass7TE.A0l(e412.A03), e412.requireActivity());
            case 25:
                return Integer.valueOf((int) Math.ceil(((double) DbS.A05(this.A01)) / 3.0d));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                H0Q h0q = (H0Q) this.A01;
                return new C61560KCn(h0q.requireActivity(), AnonymousClass7TE.A0l(h0q.A00));
            case 31:
            case 45:
                return DbS.A0B(this.A01).getString("ARGUMENT_ENTRY_POINT", "UNKNOWN");
            case 35:
                E42 e42 = (E42) this.A01;
                return new C61595KDw(AnonymousClass7TE.A0l(e42.A08), DbW.A0l(e42.A07));
            case 37:
                FEX fex = (FEX) this.A01;
                return fex.A03.A00(fex.A00, fex.A02);
            case 38:
            case 39:
                ((FEX) this.A01).A01.A01();
                return C60340gF.A00;
            case 40:
                return C48796EkJ.A00(AnonymousClass7TE.A0l(((E7O) this.A01).A0A));
            case 44:
                return new C47725EEi(AnonymousClass7TE.A0l(((E7O) this.A01).A0A));
            case 49:
                E7P e7p = (E7P) this.A01;
                return new C47740EEy(AnonymousClass7TE.A0l(e7p.A01), (String) AnonymousClass7TE.A14(e7p.A00));
            default:
                return DbY.A0I(this.A01);
        }
        return bundle.getString(str);
    }
}
