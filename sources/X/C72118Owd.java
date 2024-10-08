package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.NetworkUtils;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Owd  reason: case insensitive filesystem */
public final class C72118Owd implements AnonymousClass68Z {
    public final int A00;

    public C72118Owd(int i) {
        this.A00 = i;
    }

    public static 1aU A00(1aU r1, int i) {
        return r1.A0L(new C72118Owd(i));
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.A00) {
            case 0:
                OOB oob = (OOB) obj;
                0qQ.A0B(oob, 0);
                Boolean A0v = AnonymousClass7TE.A0v();
                OZI ozi = oob.A00;
                C71087ObS A002 = C71087ObS.A00();
                NAX nax = ozi.A02;
                AnonymousClass68L A0I = C66581MXm.A0I(nax);
                MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
                C66582MXn.A1E(A0I, new C71651OoW(3, A0G, A0v, nax), A0G);
                C71722Opg.A01(A0G, A002, 10);
                A002.A04(C71535OmW.A00);
                return C60340gF.A00;
            case 1:
                MYb mYb = MYb.A0M;
                return 1aU.A07(new C72122Owh(obj, 1), AnonymousClass6F9.A00("load_thread_themes_list"));
            case 2:
                MYb mYb2 = MYb.A0M;
                return 1aU.A07(new C3030667g((Mailbox) obj), AnonymousClass6F9.A00("stored_procedure_listener"));
            case 3:
                MYb mYb3 = MYb.A0M;
                return ((Mailbox) obj).getAccountSession();
            case 5:
                return new MailboxFeature((AnonymousClass68I) obj);
            case 6:
                return new MailboxFeature((AnonymousClass68I) obj);
            case 7:
                return new MailboxFeature((AnonymousClass68I) obj);
            case 8:
                return new MailboxFeature((AnonymousClass68I) obj);
            case 9:
                return new MailboxFeature((AnonymousClass68I) obj);
            case 10:
                return new MailboxFeature((AnonymousClass68I) obj);
            case 11:
                return new MailboxFeature((AnonymousClass68I) obj);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new MailboxFeature((AnonymousClass68I) obj);
            case 13:
                return new MailboxFeature((AnonymousClass68I) obj);
            case 14:
                return new MailboxFeature((AnonymousClass68I) obj);
            case 15:
                return new MailboxFeature((AnonymousClass68I) obj);
            case 16:
                MYb mYb4 = MYb.A0M;
                return 1aU.A07(new C72121Owg((AnonymousClass67N) obj), AnonymousClass6F9.A00("load_pending_thread_count"));
            case 17:
                AnonymousClass681 r0 = C68313NAa.A00;
                return new MailboxFeature(new C66794Mcg((Mailbox) obj));
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C74233PrM prM = (C74233PrM) obj;
                if (prM instanceof C72176Oxl) {
                    return new C72176Oxl(C66996MgU.A01(prM));
                }
                return new C66990MgO(C66996MgU.A02(prM));
            case 19:
                return Boolean.valueOf(AnonymousClass7TF.A1V(((MailboxNullable) obj).value));
            case 20:
                return 1aU.A07(new C72122Owh(obj, 4), AnonymousClass6F9.A00("load_cutover_thread_list"));
            case 21:
                return 1aU.A07(new C72122Owh(obj, 5), AnonymousClass6F9.A00("mailbox_insert_rtc_e2ee_admin_messages"));
            case 22:
                return 1aU.A07(new C72122Owh(obj, 3), AnonymousClass6F9.A00("mailbox_insert_rtc_e2ee_call_xma_messages"));
            case 23:
                Object[] objArr = (Object[]) obj;
                0qQ.A0B(objArr, 0);
                int length = objArr.length;
                ArrayList A0v2 = DbS.A0v(length);
                int i = 0;
                while (i < length) {
                    Object obj2 = objArr[i];
                    0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.model.messaginguser.MessagingUser");
                    Long l = ((MessagingUser) obj2).A02;
                    if (l != null) {
                        A0v2.add(l);
                        i++;
                    } else {
                        throw AnonymousClass7TE.A0z("create_secure_thread: RecipientUser has no EIMU.");
                    }
                }
                return A0v2;
            case 24:
                AnonymousClass681 r02 = C68314NAb.A00;
                return new MailboxFeature(new C66794Mcg((Mailbox) obj));
            case 25:
                AnonymousClass681 r03 = AnonymousClass67N.A00;
                return new MailboxFeature(new C66794Mcg((Mailbox) obj));
            case 27:
                return new C67233MkT(obj);
            case 28:
                return ((C66921MfF) obj).A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return obj;
            case 30:
                return 1aU.A08(((C66923MfH) obj).A01);
            case 31:
                return ((C66923MfH) obj).A00;
            case 32:
                obj.toString();
                return obj;
            case 33:
                String sandboxDomain = NetworkUtils.getSandboxDomain();
                if (sandboxDomain == null) {
                    return "";
                }
                return sandboxDomain;
            default:
                return new C66794Mcg((Mailbox) obj);
        }
    }
}
