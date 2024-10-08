package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NHs  reason: case insensitive filesystem */
public final class C68433NHs extends C272124k8 {
    public final /* synthetic */ C72214Oyf A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68433NHs(C72214Oyf oyf) {
        super(oyf.A05);
        this.A00 = oyf;
    }

    public final void A01(UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(-1786805002);
        this.A00.A04 = false;
        AnonymousClass0fD.A0A(443800740, A03);
    }

    public final void A02(UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(705296311);
        this.A00.A04 = true;
        AnonymousClass0fD.A0A(1783458755, A03);
    }

    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        ArrayList A1C;
        int A03 = AnonymousClass0fD.A03(-2053024355);
        int A032 = AnonymousClass0fD.A03(-606070571);
        C72214Oyf oyf = this.A00;
        synchronized (oyf) {
            try {
                OCE oce = oyf.A06;
                synchronized (oce) {
                    11Z.A05("This operation can't be run on UI thread.");
                    System.currentTimeMillis();
                    C49343Ety ety = (C49343Ety) oce.A00.A02(oce.A01, false);
                    System.currentTimeMillis();
                    A1C = AnonymousClass7TE.A1C();
                    if (ety != null) {
                        A1C.addAll(C51966G9m.A1J(ety.A00));
                    }
                }
                if (!A1C.isEmpty()) {
                    List list = oyf.A07;
                    list.clear();
                    list.addAll(A1C);
                    oyf.A03 = true;
                }
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0fD.A0A(697006072, A032);
                    throw th;
                }
            }
        }
        AnonymousClass0fD.A0A(-1784005164, A032);
        AnonymousClass0fD.A0A(56963504, A03);
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(-343501756);
        C47366Dwc dwc = (C47366Dwc) obj;
        int A032 = AnonymousClass0fD.A03(1388428825);
        C72214Oyf oyf = this.A00;
        synchronized (oyf) {
            try {
                oyf.A02 = true;
                oyf.A01 = dwc.A03;
                List list = oyf.A07;
                list.clear();
                list.addAll(C46503Dg6.A01(oyf.A00, oyf.A05, dwc.getItems()));
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0fD.A0A(1606472083, A032);
                    throw th;
                }
            }
        }
        AnonymousClass0fD.A0A(1175124335, A032);
        AnonymousClass0fD.A0A(183716626, A03);
    }
}
