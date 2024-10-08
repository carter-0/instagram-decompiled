package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AuthData;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ov1  reason: case insensitive filesystem */
public final class C72027Ov1 implements AnonymousClass68Z {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C72027Ov1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C71087ObS obS;
        C74290PsI psI;
        AnonymousClass7SD r1;
        String str;
        UserSession userSession;
        AnonymousClass3U9 A0b;
        C242373Tu AiM;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                OOB oob = (OOB) obj2;
                C67713MtS mtS = (C67713MtS) this.A02;
                mtS.A02.A0B("GDRIVE_SETUP_FETCH_TPID_START");
                if (oob.A04) {
                    obS = C71133OdW.A00(oob.A01, C69403Nkh.GOOGLE_DRIVE, "fetchTPIDForGDrive");
                } else {
                    obS = OZI.A00(oob.A00, 3);
                }
                psI = new C71524OmL(6, mtS, oob, this.A01);
                break;
            case 1:
                OZI ozi = ((OOB) obj2).A00;
                obS = C71087ObS.A00();
                if (!C51971G9r.A1b(ozi.A01.A00)) {
                    OZI.A01(obS);
                } else {
                    ozi.A00 = new C71618Ony(new C58718IwR(37, (Object) obS, (Object) ozi));
                    NAX nax = ozi.A02;
                    C71722Opg A002 = C71722Opg.A00(ozi, 12);
                    AnonymousClass68L A0I = C66581MXm.A0I(nax);
                    MailboxFutureImpl A0J = C66581MXm.A0J(A0I, A002);
                    C66582MXn.A1D(A0I, new C71723Oph(nax, A0J, 28), A0J);
                }
                psI = new C71519OmG(17, this.A02, this.A01);
                break;
            case 2:
                OOB oob2 = (OOB) obj2;
                obS = oob2.A01();
                psI = new C71524OmL(9, this.A02, this.A01, oob2);
                break;
            case 3:
                return C257443xP.A00(((OWT) this.A02).A00(((DirectPrivateStoryRecipientController) this.A01).A0T));
            case 4:
                OHL ohl = (OHL) this.A02;
                List list = (List) ((C61066Jw4) obj2).A00;
                C254763t0 A022 = C300965yF.A02(((N4P) this.A01).A0L);
                if (A022 == null || (str = A022.A00) == null || (A0b = C66582MXn.A0b(userSession, str)) == null || (AiM = A0b.AiM()) == null || !C3263776n.A00((userSession = ohl.A02), AiM)) {
                    return list;
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    JTR.A1P(((C71039Oa5) next).A03(), AnonymousClass7TE.A0u(), next, A1C);
                }
                return A1C;
            case 5:
                C72620PCz pCz = (C72620PCz) this.A01;
                if (pCz.A02) {
                    C254763t0 r7 = pCz.A00;
                    C68926Nb5 nb5 = (C68926Nb5) this.A02;
                    UserSession userSession2 = nb5.A00;
                    AnonymousClass9HC r5 = nb5.A01;
                    AnonymousClass7TG.A1O(userSession2, r5);
                    AnonymousClass3U9 B33 = 1bJ.A00(userSession2).B33(C327647Bq.A00(r7));
                    if (B33 != null) {
                        r1 = AnonymousClass7S4.A02.A00(userSession2, r5, B33, r7, false);
                        return new C72610PCp(r1, pCz.A01);
                    }
                }
                r1 = null;
                return new C72610PCp(r1, pCz.A01);
            case 6:
                MessagingUser messagingUser = (MessagingUser) obj2;
                0qQ.A0A(messagingUser);
                AuthData A003 = C300325ww.A00((UserSession) this.A02);
                OKP okp = new OKP();
                okp.A01.add(new AnonymousClass7Z5(true, false, false, true));
                okp.A00++;
                return new N8U((C376489Ie) null, (C53394GnR) null, (C61066Jw4) null, (N4L) null, A003, AnonymousClass7LZ.A0y, messagingUser, okp, (MsysThreadId) this.A01, OSC.A00, (Long) null, (Long) null, (String) null, AnonymousClass7TE.A1F(), 20, 0, 0, 0, 0, -1);
            case 7:
                C68931NbA nbA = (C68931NbA) this.A02;
                C66594MYg mYg = nbA.A02;
                1aU r72 = mYg.A00;
                MYb mYb = mYg.A01;
                MsysThreadId msysThreadId = nbA.A03;
                return 1aU.A04(new C71998OuY((AuthData) this.A01, nbA), r72, mYb.A01(msysThreadId), C72120Owf.A01(mYb.A09, msysThreadId, 52), mYb.A0D.A0M(new C72118Owd(1)));
            default:
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A02;
                MYb mYb2 = ((C66594MYg) this.A01).A01;
                C254743sy r12 = directVisualMessageViewerController.A0x;
                0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.MsysThreadId");
                long j = ((MsysThreadId) r12).A00;
                Long A0m = C51971G9r.A0m();
                return mYb2.A09.A0M(new C72038OvD(A0m, A0m, -1, -1, j)).A0L(new C72018Ous(directVisualMessageViewerController, 0));
        }
        obS.A04(psI);
        return C60340gF.A00;
    }
}
