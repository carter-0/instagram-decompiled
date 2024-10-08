package X;

/* renamed from: X.OmF  reason: case insensitive filesystem */
public final class C71518OmF implements C74290PsI {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C71518OmF(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C68714NUa nUa;
        String str;
        String str2;
        int i;
        int i2;
        boolean z = obj instanceof N0I;
        if (this.A00 != 0) {
            if (z) {
                0KC.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications sending notifications success");
                C67711MtQ mtQ = (C67711MtQ) this.A01;
                boolean z2 = this.A02;
                C68714NUa nUa2 = mtQ.A07;
                nUa2.A0D("SOURCE", "OTC_RESTORE_WAIT");
                nUa2.A0B("OTC_PIN_CODE_API_SEND_SUCCESS");
                Object[] objArr = new Object[0];
                if (z2) {
                    i2 = 2131961648;
                } else {
                    i2 = 2131961650;
                }
                C61084JwM jwM = new C61084JwM((C266444Yx) DbS.A0Q(objArr, i2), (C266444Yx) DbS.A0Q(new Object[0], 2131961649), (Integer) null, 4);
                AnonymousClass7TE.A1Z(new C58104ImQ(jwM, mtQ, (AnonymousClass4D7) null, 49), C318116oQ.A00(mtQ));
                return;
            }
            0KC.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications sending notifications failure");
            nUa = ((C67711MtQ) this.A01).A07;
            str = "SOURCE";
            str2 = "OTC_RESTORE_WAIT";
        } else if (z) {
            0KC.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications sending notifications success");
            C67712MtR mtR = (C67712MtR) this.A01;
            boolean z3 = this.A02;
            C68714NUa nUa3 = mtR.A06;
            nUa3.A0D("SOURCE", "OTC_ENTER_PIN");
            nUa3.A0B("OTC_PIN_CODE_API_SEND_SUCCESS");
            Object[] objArr2 = new Object[0];
            if (z3) {
                i = 2131961648;
            } else {
                i = 2131961650;
            }
            C61084JwM jwM2 = new C61084JwM((C266444Yx) DbS.A0Q(objArr2, i), (C266444Yx) DbS.A0Q(new Object[0], 2131961649), (Integer) null, 4);
            AnonymousClass7TE.A1Z(new C58104ImQ(jwM2, mtR, (AnonymousClass4D7) null, 48), C318116oQ.A00(mtR));
            return;
        } else {
            0KC.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications sending notifications failure");
            nUa = ((C67712MtR) this.A01).A06;
            str = "SOURCE";
            str2 = "OTC_ENTER_PIN";
        }
        nUa.A0D(str, str2);
        nUa.A0B("OTC_PIN_CODE_API_SEND_FAILED");
    }
}
