package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.direct.locationsharing.service.DirectLiveLocationService;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Sl2  reason: case insensitive filesystem */
public final class C12041Sl2 implements C13920TlM {
    public final int A00;
    public final String A01;
    public final /* synthetic */ S2X A02;

    public C12041Sl2(S2X s2x, String str, int i) {
        0qQ.A0B(str, 2);
        this.A02 = s2x;
        this.A01 = str;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        0qQ.A0B(abstractCollection, 0);
        if (abstractCollection.isEmpty()) {
            S2X s2x = this.A02;
            String str = this.A01;
            s2x.A02.remove(str);
            s2x.A01.remove(str);
            s2x.A03.remove(str);
        }
        S2X s2x2 = this.A02;
        boolean isEmpty = s2x2.A02.isEmpty();
        C10295Rpt rpt = s2x2.A00;
        if (isEmpty) {
            int i = this.A00;
            DirectLiveLocationService directLiveLocationService = rpt.A00;
            C8367QpP qpP = directLiveLocationService.A00;
            if (qpP != null) {
                qpP.A01(directLiveLocationService.A04);
            }
            directLiveLocationService.A03 = false;
            directLiveLocationService.stopForeground(1);
            if (i > 0) {
                directLiveLocationService.stopSelf(i);
            } else {
                directLiveLocationService.stopSelf();
            }
        } else {
            String str2 = this.A01;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                String str3 = ((LiveLocationSession) it.next()).A04;
                0qQ.A07(str3);
                C51973G9u.A1F(str3, A1C);
            }
            DirectLiveLocationService directLiveLocationService2 = rpt.A00;
            if (DirectLiveLocationService.A04(directLiveLocationService2) && DbT.A1b(A1C)) {
                Object computeIfAbsent = directLiveLocationService2.A06.computeIfAbsent(str2, new C13169TOb(1, new C74185PqR(22, (Object) directLiveLocationService2, (Object) directLiveLocationService2)));
                0qQ.A07(computeIfAbsent);
                C11218SFs sFs = (C11218SFs) computeIfAbsent;
                Iterator it2 = A1C.iterator();
                while (it2.hasNext()) {
                    DirectLiveLocationService.A01(directLiveLocationService2, sFs, Pxg.A0H(it2));
                }
            }
        }
    }

    public final void onError(Throwable th) {
        throw AnonymousClass00P.createAndThrow();
    }
}
