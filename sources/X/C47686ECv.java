package X;

/* renamed from: X.ECv  reason: case insensitive filesystem */
public class C47686ECv extends 1P0 {
    public final E55 A00;
    public final EEA A01;

    public final void A00(Dw7 dw7) {
        String str;
        if (this instanceof ELY) {
            int A03 = AnonymousClass0fD.A03(-1133134741);
            C49917FEr.A00().A02(dw7.A00, dw7.A01, dw7.A04, dw7.A03);
            C47881ELb eLb = ((ELY) this).A00;
            if (eLb.isResumed()) {
                C49943FFw A002 = C49943FFw.A00();
                AnonymousClass0wW r0 = eLb.A00;
                0qQ.A0B(r0, 0);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(eLb, r0), "instagram_gdpr_consent_flow_entry");
                if (A0e.isSampled()) {
                    String str2 = A002.A02;
                    if (str2 != null) {
                        A0e.AAJ(Dbq.A01(), str2);
                        Integer num = A002.A00;
                        if (num != null) {
                            A0e.AAJ("user_state", C49766F5z.A01(num));
                            DbS.A1N(A0e, A002.A01);
                            if (C49917FEr.A00().A04 == AnonymousClass05K.A00) {
                                str = DbV.A0t();
                            } else {
                                str = null;
                            }
                            A0e.AAJ("guid", str);
                            DbS.A1K(A0e, "instagram_terms_flow");
                            A0e.AAJ("waterfall_id", C49917FEr.A01());
                            A0e.Cgf();
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                Integer num2 = C49917FEr.A00().A02;
                Integer num3 = AnonymousClass05K.A00;
                if (num2 == num3) {
                    F3L f3l = C49917FEr.A00().A00.A02;
                    if (f3l != null) {
                        C49943FFw A003 = C49943FFw.A00();
                        AnonymousClass0wW r1 = eLb.A00;
                        AnonymousClass7TF.A1H(r1, num3);
                        C49943FFw.A01(eLb, r1, A003, num3, (Integer) null);
                        EEA eea = eLb.A04;
                        String str3 = C49917FEr.A00().A08;
                        if (!(str3 == null || str3.length() == 0)) {
                            eea.A03.setText((CharSequence) str3);
                        }
                        eLb.A00.setVisibility(0);
                        eLb.A03.setText(f3l.A01);
                        C48936Ema.A00(eLb.requireContext(), eLb.A02, f3l.A03);
                    }
                } else if (!eLb.A04()) {
                    eLb.A03();
                }
            }
            AnonymousClass0fD.A0A(-562213158, A03);
            return;
        }
        int A0D = AnonymousClass7TG.A0D(dw7, -136432631);
        C47686ECv.super.onSuccess(dw7);
        C49917FEr.A00().A02(dw7.A00, dw7.A01, dw7.A04, dw7.A03);
        C49917FEr A004 = C49917FEr.A00();
        Integer num4 = dw7.A02;
        synchronized (A004) {
            C49917FEr.A0B.A03 = num4;
        }
        E55 e55 = this.A00;
        if (!e55.A04()) {
            e55.A03();
        }
        AnonymousClass0fD.A0A(-1024848519, A0D);
    }

    public C47686ECv(E55 e55, EEA eea) {
        this.A00 = e55;
        this.A01 = eea;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, -1759241586);
        Throwable A012 = r4.A01();
        if (A012 != null) {
            0wb.A07("Failed to request Consent Flow Data", A012);
        }
        if (r4 instanceof C268674do) {
            String errorMessage = ((AnonymousClass1XT) ((C268674do) r4).A00).getErrorMessage();
            0qQ.A0A(errorMessage);
            0wb.A03("GDPR Consent Flow error message", errorMessage);
        }
        AnonymousClass0fD.A0A(-1567401677, A0D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.A00 == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinish() {
        /*
            r4 = this;
            r0 = 740347954(0x2c20d032, float:2.285294E-12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.EEA r1 = r4.A01
            if (r1 == 0) goto L_0x0020
            r0 = 0
            r1.A01 = r0
            com.instagram.ui.widget.progressbutton.ProgressButton r2 = r1.A03
            r2.setShowProgressBar(r0)
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x001c
            boolean r1 = r1.A00
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.setEnabled(r0)
        L_0x0020:
            r0 = 490852434(0x1d41d052, float:2.5651036E-21)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47686ECv.onFinish():void");
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-841934259);
        A00((Dw7) obj);
        AnonymousClass0fD.A0A(-1299679022, A03);
    }
}
