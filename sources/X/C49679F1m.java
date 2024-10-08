package X;

/* renamed from: X.F1m  reason: case insensitive filesystem */
public final class C49679F1m {
    public final /* synthetic */ C47698EDh A00;

    public C49679F1m(C47698EDh eDh) {
        this.A00 = eDh;
    }

    public final void A00(C268654dm r43) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        C268654dm r3 = r43;
        C47698EDh eDh = this.A00;
        C48260Ebf ebf = eDh.A04;
        if (ebf != null && ebf.A02) {
            ebf.A00();
        }
        String Bo6 = eDh.A01.Bo6();
        int Acx = eDh.A01.Acx();
        Integer num2 = null;
        if (r3 instanceof C268674do) {
            DwQ dwQ = (DwQ) ((C268674do) r3).A00;
            if (!dwQ.isFeedbackRequired()) {
                if (!dwQ.hasErrorType("too_easy_password") || !eDh.A05) {
                    FAD fad = dwQ.A00;
                    if (fad != null) {
                        str3 = fad.A00;
                    } else {
                        str3 = null;
                    }
                    eDh.A04(str3, C48317Eca.A00(dwQ.mErrorSource));
                } else {
                    C358248ab A0X = DbS.A0X(eDh.A00);
                    A0X.A09(2131961740);
                    FAD fad2 = dwQ.A00;
                    if (fad2 != null) {
                        str4 = fad2.A00;
                    } else {
                        str4 = null;
                    }
                    A0X.A0q(str4);
                    Dba.A0t(C50021FJg.A00(this, 30), A0X, 2131954977);
                }
            }
            AnonymousClass0aP r7 = eDh.A08;
            String str5 = eDh.A09.A00;
            FAD fad3 = dwQ.A00;
            if (fad3 != null) {
                str = fad3.A01;
                str2 = fad3.A00;
            } else {
                str = null;
                str2 = null;
            }
            Boolean A0v = AnonymousClass7TE.A0v();
            String status = dwQ.getStatus();
            if (Acx > -1) {
                num2 = Integer.valueOf(Acx);
            }
            C49223ErS.A00(r7, A0v, Boolean.valueOf(dwQ.isCheckpointRequired()), Boolean.valueOf(dwQ.isConsentRequired()), Boolean.valueOf(dwQ.isFeedbackRequired()), Boolean.valueOf(dwQ.isLoginRequired()), Boolean.valueOf(dwQ.isNoContent()), Boolean.valueOf(dwQ.isViolatingBrandedContentPolicy()), Boolean.valueOf(dwQ.A05), num2, Integer.valueOf(dwQ.mStatusCode), str5, str, str2, status, Bo6, dwQ.mErrorType, dwQ.getErrorMessage(), eDh.A0B);
            return;
        }
        eDh.A04(eDh.A07.getString(2131968258), AnonymousClass05K.A00);
        Throwable A01 = r3.A01();
        if (A01 != null) {
            String name = A01.getClass().getName();
            AnonymousClass0aP r32 = eDh.A08;
            String str6 = eDh.A09.A00;
            if (Acx > -1) {
                num = Integer.valueOf(Acx);
            } else {
                num = null;
            }
            AnonymousClass7TF.A1B(r32, 0, str6);
            C49223ErS.A00(r32, false, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, num, (Integer) null, str6, (String) null, (String) null, name, Bo6, (String) null, (String) null, (String) null);
            0wb.A03("CreateAccountCallback", 002.A0u("Exception ", name, ": ", A01.getMessage()));
        }
    }
}
