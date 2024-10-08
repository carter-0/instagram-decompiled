package com.instagram.video.live.mvvm.viewmodel.cobroadcast;

import X.00k;
import X.0eS;
import X.0sJ;
import X.0sl;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C60302Jj0;
import X.C60340gF;
import X.C61064Jw2;
import X.C65610Lwl;
import X.DbT;
import X.DbV;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.cobroadcast.IgLiveHostCobroadcastViewModel$4", f = "IgLiveHostCobroadcastViewModel.kt", i = {}, l = {303}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveHostCobroadcastViewModel$4 extends AnonymousClass1Ek implements 0sJ {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public final /* synthetic */ C60302Jj0 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveHostCobroadcastViewModel$4(C60302Jj0 jj0, AnonymousClass4D7 r3) {
        super(4, r3);
        this.A04 = jj0;
    }

    public final Object invokeSuspend(Object obj) {
        Set set;
        Set set2;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            boolean z = this.A02;
            boolean z2 = this.A03;
            Set set3 = (Set) this.A01;
            if (z) {
                C60302Jj0 jj0 = this.A04;
                IgLiveCobroadcastRepository igLiveCobroadcastRepository = jj0.A05;
                if (set3 != null) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = set3.iterator();
                    while (it.hasNext()) {
                        C61064Jw2.A00(A1C, it);
                    }
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    for (Object next : A1C) {
                        DbV.A1U(next, A1C2, ((Set) jj0.A09.A0V.getValue()).contains(next) ? 1 : 0);
                    }
                    set2 = 00k.A0k(A1C2);
                } else {
                    set2 = 0sl.A00;
                }
                this.A00 = 1;
                igLiveCobroadcastRepository.A03.Epw(0sl.A00);
                ArrayList A0r = AnonymousClass7TG.A0r(set2);
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    A0r.add(String.valueOf(DbT.A0k(it2).BST()));
                }
                if (AnonymousClass7TE.A1b(A0r)) {
                    igLiveCobroadcastRepository.A00.A00.A0A.A7I(new C65610Lwl(A0r));
                }
            } else if (!z2) {
                IgLiveCobroadcastRepository igLiveCobroadcastRepository2 = this.A04.A05;
                if (set3 != null) {
                    ArrayList A1C3 = AnonymousClass7TE.A1C();
                    Iterator it3 = set3.iterator();
                    while (it3.hasNext()) {
                        C61064Jw2.A00(A1C3, it3);
                    }
                    set = 00k.A0k(A1C3);
                } else {
                    set = 0sl.A00;
                }
                igLiveCobroadcastRepository2.A03.Epw(set);
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj2);
        IgLiveHostCobroadcastViewModel$4 igLiveHostCobroadcastViewModel$4 = new IgLiveHostCobroadcastViewModel$4(this.A04, (AnonymousClass4D7) obj4);
        igLiveHostCobroadcastViewModel$4.A02 = A1a;
        igLiveHostCobroadcastViewModel$4.A03 = A1a2;
        igLiveHostCobroadcastViewModel$4.A01 = obj3;
        return igLiveHostCobroadcastViewModel$4.invokeSuspend(C60340gF.A00);
    }
}
