package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PhX  reason: case insensitive filesystem */
public final class C73658PhX extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73658PhX(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        0Tu r3;
        long j;
        UserSession userSession;
        switch (this.A00) {
            case 0:
            case 2:
            case Seq.RefTracker.REF_OFFSET:
                return 28E.A00((UserSession) this.A01);
            case 1:
            case Seq.NULL_REFNUM:
                return 28K.A00((UserSession) this.A01);
            case 3:
                return C69909NuB.A00(((1kV) this.A01).A00);
            case 4:
                return AnonymousClass7IP.A00(DbS.A0O("mutation_processor"), ((1kV) this.A01).A00);
            case 5:
                return new O8N(((1k1) this.A01).A00);
            case 6:
                return new O8O(((1jx) this.A01).A00);
            case 7:
                userSession = (0lg) this.A01;
                r3 = 0Tu.A05;
                j = 36322409575360667L;
                break;
            case 8:
                return 1bJ.A00((UserSession) this.A01);
            case 9:
                1bO A002 = 1bO.A00((UserSession) this.A01);
                0qQ.A07(A002);
                return A002;
            case 10:
                C282375Cv A003 = C282375Cv.A00((UserSession) this.A01);
                0qQ.A07(A003);
                return A003;
            case 11:
                userSession = (0lg) this.A01;
                r3 = 0Tu.A05;
                j = 2342164482484086177L;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                userSession = (0lg) this.A01;
                r3 = 0Tu.A05;
                j = 36321473270523299L;
                break;
            case 13:
                userSession = (0lg) this.A01;
                r3 = 0Tu.A05;
                j = 36320317925564683L;
                break;
            case 14:
                return Boolean.valueOf(C308556Us.A03((UserSession) this.A01));
            case 15:
                return AnonymousClass7TF.A0Y(0Tu.A05, (0lg) this.A01, 36601792902336863L);
            case 21:
                PD5 pd5 = (PD5) this.A01;
                return C51969G9p.A0n(1Al.A01(pd5.A00), 1An.A3V, pd5);
            case 22:
                userSession = ((PD5) this.A01).A00;
                r3 = 0Tu.A05;
                j = 36321473270982057L;
                break;
            case 26:
                return 1bJ.A00(((1nM) this.A01).A00);
            case 27:
                return 1bJ.A00(((1nT) this.A01).A00);
            case 28:
                return new O8L(((1lB) this.A01).A00);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new ArmadilloExpressLinkMessageSender(((1lB) this.A01).A00);
            case 30:
                return new O8P(((1lB) this.A01).A00);
            case 31:
                return new O8S(((1lB) this.A01).A00);
            case 32:
                return new O8U(((1lB) this.A01).A00);
            case 33:
                return new O8W(((1lB) this.A01).A00);
            case 34:
                return new ArmadilloExpressStorySender(((1lB) this.A01).A00);
            case 35:
                return new C70938OSl(((1mT) this.A01).A00);
            case 36:
                return new ArmadilloExpressNoteReplySender(((1kD) this.A01).A00);
            case 37:
                return new ArmadilloExpressNoteReplySender(((1k9) this.A01).A00);
            case 38:
                return new ArmadilloExpressNoteReplySender(((1kH) this.A01).A00);
            case 39:
                return new ArmadilloExpressNoteReplySender(((1k5) this.A01).A00);
            case 40:
                return new O8T(((1jt) this.A01).A00);
            case 43:
                UserSession userSession2 = (UserSession) this.A01;
                return new OC8(userSession2, C70175NyT.A00(userSession2));
            case 44:
                UserSession userSession3 = (UserSession) this.A01;
                return new OKG(25x.A00(userSession3), userSession3);
            case 45:
                return new O8K(((1do) this.A01).A00);
            case 46:
                return new O8M(((1ep) this.A01).A00);
            case 47:
                return new ArmadilloExpressLinkMessageSender(((1kt) this.A01).A00);
            case 48:
                return new O8Q(((1eK) this.A01).A00);
            case 49:
                return C69869NtX.A00(((1kM) this.A01).A00);
            default:
                return DbT.A0r(this.A01);
        }
        return AnonymousClass7TF.A0R(r3, userSession, j);
    }
}
