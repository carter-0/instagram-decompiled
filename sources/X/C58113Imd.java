package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.remix.pivot.viewmodel.RemixPivotPageViewModel$viewState$1", f = "RemixPivotPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.Imd  reason: case insensitive filesystem */
public final class C58113Imd extends AnonymousClass1Ek implements 0sI {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public final /* synthetic */ C52998Ggp A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58113Imd(C52998Ggp ggp, AnonymousClass4D7 r3) {
        super(5, r3);
        this.A04 = ggp;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1a = AnonymousClass7TE.A1a(obj3);
        boolean A1a2 = AnonymousClass7TE.A1a(obj4);
        C58113Imd imd = new C58113Imd(this.A04, (AnonymousClass4D7) obj5);
        imd.A00 = obj;
        imd.A01 = obj2;
        imd.A02 = A1a;
        imd.A03 = A1a2;
        return imd.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C56078HsR hsR;
        1Xj r0;
        0eS.A00(obj);
        C53381GnB gnB = (C53381GnB) this.A00;
        List list = (List) this.A01;
        boolean z = this.A02;
        boolean z2 = this.A03;
        ArrayList A0U = 00k.A0U(list);
        if ((!A0U.isEmpty()) && (r0 = ((C267324bN) A0U.get(0)).A02) != null && r0.A5U()) {
            A0U.remove(0);
        }
        C52998Ggp ggp = this.A04;
        ggp.A01.A08(ggp.A04, A0U, true, false);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C267324bN r4 = (C267324bN) next;
            if (i == 0) {
                hsR = ggp.A02;
            } else {
                hsR = null;
            }
            A0r.add(new C320716sp((C52320GNm) null, r4, hsR));
            i = i2;
        }
        return new C61067Jw5(gnB, (List) A0r, z, z2);
    }
}
