package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ulc  reason: case insensitive filesystem */
public final class C15960Ulc extends C324596za {
    public final boolean A00;
    public final /* synthetic */ C15954UlW A01;

    public C15960Ulc(C15954UlW ulW, boolean z) {
        this.A01 = ulW;
        this.A00 = z;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ArrayList arrayList;
        int A03 = AnonymousClass0fD.A03(-2007487384);
        UY6 uy6 = (UY6) obj;
        int A032 = AnonymousClass0fD.A03(298819763);
        0qQ.A0B(uy6, 0);
        List list = uy6.A04;
        C15954UlW ulW = this.A01;
        UserSession userSession = ulW.A00;
        0qQ.A0B(userSession, 1);
        if (list == null || list.isEmpty()) {
            arrayList = 0sn.A00;
        } else {
            arrayList = C296885qo.A06(userSession, (C295795ov) null, list);
        }
        ArrayList A002 = C16931VBj.A00(ulW.A02, arrayList);
        C17957Vip vip = (C17957Vip) userSession.A01(C15935Ul2.class, C20656Wwo.A00);
        String str = ulW.A04.A04;
        if (str != null) {
            String str2 = ulW.A03.A00.A03.A07;
            boolean z = this.A00;
            vip.A01(arrayList, str, str2, (String) null, (List) null, z);
            ulW.A01.Dex((String) null, (String) null, A002, false, z);
            AnonymousClass0fD.A0A(1616877797, A032);
            AnonymousClass0fD.A0A(-438977180, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(320499873, A032);
        throw A0y;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-2105513024);
        this.A01.A01.DeI();
        AnonymousClass0fD.A0A(-1379372815, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(320460649);
        this.A01.A01.DeS();
        AnonymousClass0fD.A0A(-1134842781, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1532852259);
        this.A01.A01.Dei();
        AnonymousClass0fD.A0A(-1834092092, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-548524080);
        AnonymousClass0fD.A0A(-501095398, AnonymousClass0fD.A03(1559748270));
        AnonymousClass0fD.A0A(1761006681, A03);
    }
}
