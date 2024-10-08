package X;

import com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.ArrayList;

/* renamed from: X.OmM  reason: case insensitive filesystem */
public final class C71525OmM implements C74290PsI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C71525OmM(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C67754Mu9 mu9;
        String str;
        C71087ObS A012;
        C71515OmC omC;
        C71087ObS obS;
        Object A002;
        C69552Nnw nnw = (C69552Nnw) obj;
        switch (this.A00) {
            case 0:
                if (nnw instanceof N0I) {
                    Iterable<OneTimeCodeDevice> iterable = (Iterable) ((N0I) nnw).A00;
                    ArrayList A0r = AnonymousClass7TG.A0r(iterable);
                    for (OneTimeCodeDevice oneTimeCodeDevice : iterable) {
                        A0r.add(oneTimeCodeDevice.A00);
                    }
                    if (AnonymousClass7TE.A1b(A0r)) {
                        A012 = ((OMK) this.A01).A01(this.A03, A0r);
                        omC = new C71515OmC(this.A02, 15);
                        break;
                    } else {
                        mu9 = (C67754Mu9) this.A02;
                        str = "Failed to send OTC notifications, device list was empty";
                    }
                } else {
                    mu9 = (C67754Mu9) this.A02;
                    str = "Failed to send OTC notifications, couldn't get device list";
                }
                C67754Mu9.A01(mu9, str);
                return;
            case 1:
                if (nnw instanceof N0I) {
                    obS = (C71087ObS) this.A01;
                    A002 = new N0I(AnonymousClass7TE.A0v());
                } else if (nnw instanceof N0J) {
                    ((C71069Oao) O5J.A04.getValue()).A03((S5E) this.A02, this.A03);
                    obS = (C71087ObS) this.A01;
                    A002 = N0J.A00(((N0J) nnw).A00);
                } else {
                    return;
                }
                obS.A05(A002);
                return;
            default:
                0KC.A0D("EncryptedBackupsOneTimeCodeDisplayCodeViewModel", AnonymousClass7TG.A0m(nnw, "fetchCode got code ", AnonymousClass7TE.A1A()));
                C67742Mtv mtv = (C67742Mtv) this.A02;
                mtv.A06.FIA(new O6B(false));
                if (nnw instanceof N0I) {
                    ONK onk = (ONK) ((N0I) nnw).A00;
                    String str2 = onk.A01;
                    C66580MXl.A1U("fetchCode got code success, code: ", str2, "EncryptedBackupsOneTimeCodeDisplayCodeViewModel");
                    mtv.A03.A0B("OTC_GENERATE_CODE_SUCCESS");
                    mtv.A07.FIA(str2);
                    long j = onk.A00;
                    String str3 = this.A03;
                    0qQ.A0A(str3);
                    A012 = C71087ObS.A00();
                    NAS nas = ((OMK) this.A01).A01;
                    Long valueOf = Long.valueOf(j);
                    AnonymousClass68L A0I = C66581MXm.A0I(nas);
                    MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
                    C66582MXn.A1E(A0I, new C71689Op8(nas, 0, valueOf, A0G, str2, str3, 1), A0G);
                    C71722Opg.A01(A0G, A012, 19);
                    omC = new C71515OmC(mtv, 20);
                    break;
                } else {
                    0KC.A0D("EncryptedBackupsOneTimeCodeDisplayCodeViewModel", "fetchCode got code failure");
                    mtv.A07.FIA("");
                    mtv.A04.FIA(new O6A(true));
                    C66913Mex.A04(mtv.A03, "FAILURE_REASON", "GENERATE_CODE_ERROR");
                    return;
                }
        }
        A012.A04(omC);
    }
}
