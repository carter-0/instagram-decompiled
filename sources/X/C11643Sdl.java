package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Sdl  reason: case insensitive filesystem */
public final class C11643Sdl implements AnonymousClass2gO {
    public final /* synthetic */ S2R A00;
    public final /* synthetic */ C10813RyZ A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ 0rm A05;

    public C11643Sdl(S2R s2r, C10813RyZ ryZ, Map map, Map map2, Map map3, 0rm r6) {
        this.A01 = ryZ;
        this.A03 = map;
        this.A05 = r6;
        this.A00 = s2r;
        this.A04 = map2;
        this.A02 = map3;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        ArrayList<C10500RtF> arrayList;
        SUj sUj = (SUj) obj;
        List list = (List) sUj.A01;
        if (list != null) {
            arrayList = AnonymousClass7TE.A1C();
            for (Object next : list) {
                SUj A0W = Pxe.A0W(((C10500RtF) next).A00);
                if (!(A0W == null || A0W.A01 == null)) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = 0sn.A00;
        }
        List A0a = 00k.A0a(this.A03.keySet());
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        for (C10500RtF rtF : arrayList) {
            A0r.add(rtF.A01);
        }
        Set A022 = 094.A02(00k.A0k(A0r), 00k.A0k(A0a));
        if (!SUj.A0V(sUj) || !A022.isEmpty()) {
            this.A05.A00 = new C8986RKc(00k.A0a(A022));
        } else {
            Map map = this.A02;
            Map map2 = this.A04;
            for (C10500RtF rtF2 : arrayList) {
                Object obj2 = map.get(rtF2.A01);
                if (obj2 != null) {
                    Object A023 = rtF2.A00.A02();
                    0qQ.A0C(A023, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<kotlin.String>");
                    map2.put(obj2, SUj.A0D((SUj) A023));
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        this.A00.A00((Throwable) this.A05.A00, this.A04);
    }
}
