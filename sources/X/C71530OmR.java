package X;

import com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OmR  reason: case insensitive filesystem */
public final class C71530OmR implements C74290PsI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public C71530OmR(Object obj, Object obj2, String str, int i, boolean z) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C68714NUa nUa;
        String str;
        String str2;
        C71087ObS obS;
        C71518OmF omF;
        C67712MtR mtR;
        C67711MtQ mtQ;
        C69552Nnw nnw = (C69552Nnw) obj;
        boolean z = nnw instanceof N0I;
        if (this.A00 != 0) {
            if (z) {
                Object obj2 = ((N0I) nnw).A00;
                List list = (List) obj2;
                0KC.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", 002.A0O("sendOtcNotifications got otc devices size ", list.size()));
                mtQ = (C67711MtQ) this.A02;
                mtQ.A07.A0D("NUM_TRUSTED_DEVICE", String.valueOf(list.size()));
                Iterable<OneTimeCodeDevice> iterable = (Iterable) obj2;
                mtQ.A01.FIA(C73429PcU.A00(iterable, 14));
                mtQ.A0A.FIA(new O6D(false));
                ArrayList A0r = AnonymousClass7TG.A0r(iterable);
                for (OneTimeCodeDevice oneTimeCodeDevice : iterable) {
                    A0r.add(oneTimeCodeDevice.A00);
                }
                if (AnonymousClass7TE.A1b(A0r)) {
                    0KC.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications sending notifications");
                    obS = ((OMK) this.A01).A01(this.A03, A0r);
                    omF = new C71518OmF(1, mtQ, this.A04);
                } else {
                    0KC.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications device list is empty");
                }
            } else {
                0KC.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications failed to get otc devices");
                mtQ = (C67711MtQ) this.A02;
            }
            nUa = mtQ.A07;
            str = "SOURCE";
            str2 = "OTC_RESTORE_WAIT";
            nUa.A0D(str, str2);
            nUa.A0B("OTC_PIN_CODE_API_SEND_FAILED");
            return;
        }
        if (z) {
            Object obj3 = ((N0I) nnw).A00;
            List list2 = (List) obj3;
            0KC.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", 002.A0O("sendOtcNotifications got otc devices size ", list2.size()));
            mtR = (C67712MtR) this.A02;
            mtR.A06.A0D("NUM_TRUSTED_DEVICE", String.valueOf(list2.size()));
            Iterable<OneTimeCodeDevice> iterable2 = (Iterable) obj3;
            mtR.A00.FIA(C73429PcU.A00(iterable2, 13));
            mtR.A0C.FIA(new O6C(false));
            ArrayList A0r2 = AnonymousClass7TG.A0r(iterable2);
            for (OneTimeCodeDevice oneTimeCodeDevice2 : iterable2) {
                A0r2.add(oneTimeCodeDevice2.A00);
            }
            if (AnonymousClass7TE.A1b(A0r2)) {
                0KC.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications sending notifications");
                obS = ((OMK) this.A01).A01(this.A03, A0r2);
                omF = new C71518OmF(0, mtR, this.A04);
            } else {
                0KC.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications device list is empty");
            }
        } else {
            0KC.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications failed to get otc devices");
            mtR = (C67712MtR) this.A02;
        }
        nUa = mtR.A06;
        str = "SOURCE";
        str2 = "OTC_ENTER_PIN";
        nUa.A0D(str, str2);
        nUa.A0B("OTC_PIN_CODE_API_SEND_FAILED");
        return;
        obS.A04(omF);
    }
}
