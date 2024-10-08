package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.AbstractMap;
import java.util.LinkedHashMap;

public final class NM7 extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public NM7(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
        this.A05 = z;
        this.A03 = obj4;
    }

    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-1218701515);
                i2 = -968398434;
                break;
            case 1:
                i = AnonymousClass7TG.A0D(r6, -866169701);
                NM7.super.onFail(r6);
                String obj = C71115Od8.A01(r6, C71115Od8.A00).toString();
                if (this.A05) {
                    C313746gw.A00(((1fk) this.A04).A00).A0S(((DirectThreadKey) this.A03).A00, AnonymousClass000.A00(1212), obj);
                }
                i2 = 238724098;
                break;
            default:
                NM7.super.onFail(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1579443616);
                int A032 = AnonymousClass0fD.A03(-201283497);
                C67539MpY.A00((UserSession) this.A04).A00((C68137N2b) this.A02);
                C71044OaM.A01((Context) this.A01, (C62320sa) this.A03, this.A05);
                AnonymousClass0fD.A0A(960310320, A032);
                i2 = 1501363375;
                break;
            case 1:
                i = AnonymousClass0fD.A03(1373981389);
                int A033 = AnonymousClass0fD.A03(-1568355103);
                1fk r7 = (1fk) this.A04;
                1fi r6 = (1fi) this.A02;
                AnonymousClass3Q2 A034 = ((PendingMediaStore) r7.A04.getValue()).A03(r6.A04.A06);
                if (A034 != null && A034.A53) {
                    A034.A0b(AnonymousClass3QD.CONFIGURED);
                    ((PendingMediaStoreSerializer) r7.A05.getValue()).A04();
                }
                MessageIdentifier messageIdentifier = (MessageIdentifier) this.A01;
                if (messageIdentifier != null) {
                    AnonymousClass1Nd.A00(r7.A00).A00(new AnonymousClass7MH((DirectThreadKey) this.A03, messageIdentifier));
                }
                ((AnonymousClass5D0) r7.A02.getValue()).A02(r6.A05);
                AnonymousClass0fD.A0A(-433215409, A033);
                i2 = 1159073155;
                break;
            default:
                i = AnonymousClass0fD.A03(-1739881332);
                C298835u7 r12 = (C298835u7) obj;
                int A035 = AnonymousClass0fD.A03(-170862802);
                0qQ.A0B(r12, 0);
                NM7.super.onSuccess(r12);
                for (C267324bN r0 : r12.Ao4()) {
                    1Xj r8 = r0.A02;
                    if (r8 != null) {
                        AbstractMap abstractMap = (AbstractMap) this.A02;
                        C55793HnS hnS = (C55793HnS) this.A03;
                        String id = r8.getId();
                        if (id != null) {
                            Object obj2 = DbV.A18(id, "_").get(0);
                            C57457Ib1 ib1 = (C57457Ib1) abstractMap.get(obj2);
                            if (ib1 != null) {
                                0qQ.A0B(obj2, 0);
                                hnS.A01.put(obj2, new C55674HlX(r8, ib1, hnS.A00));
                            }
                        } else {
                            IllegalStateException A0y = AnonymousClass7TE.A0y();
                            AnonymousClass0fD.A0A(-130579159, A035);
                            throw A0y;
                        }
                    }
                }
                if (this.A05) {
                    UserSession userSession = (UserSession) this.A04;
                    C56658I6n.A04((AnonymousClass0iw) this.A01, userSession, (LinkedHashMap) this.A02);
                }
                AnonymousClass0fD.A0A(-1429908830, A035);
                i2 = 277831709;
                break;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
