package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.FfM  reason: case insensitive filesystem */
public final class C50606FfM implements G62 {
    public final /* synthetic */ Set A00;

    public C50606FfM(Set set) {
        this.A00 = set;
    }

    public final AnonymousClass0r6 AY2(Activity activity, AnonymousClass12V r8, 0lg r9) {
        Object obj;
        AnonymousClass7TG.A1T(activity, r9, r8);
        Set<EXE> set = this.A00;
        LinkedHashSet<EXE> A0y = DbS.A0y();
        LinkedHashSet<G62> A0y2 = DbS.A0y();
        for (EXE A002 : set) {
            EXE.A00(A002, A0y);
        }
        for (EXE exe : A0y) {
            switch (exe.ordinal()) {
                case 0:
                    obj = new C50607FfN((C319606qt) null, (DefaultConstructorMarker) null, 1);
                    break;
                case 1:
                    throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(exe, "Not yet supported provider type ", AnonymousClass7TE.A1A()));
                case 2:
                case 7:
                case 8:
                    throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(exe, "Unexpected provider group found: ", AnonymousClass7TE.A1A()));
                case 3:
                    obj = new C50609FfP(C51655FyH.A00);
                    break;
                case 4:
                    obj = new C50610FfQ((0sJ) null, (DefaultConstructorMarker) null, 1);
                    break;
                case 5:
                    obj = new C50608FfO((C49440Evg) null, (DefaultConstructorMarker) null, 1);
                    break;
                case 6:
                    obj = new Object();
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            A0y2.add(obj);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A0y2);
        for (G62 AY2 : A0y2) {
            A0r.add(AY2.AY2(activity, r8, r9));
        }
        return 10q.A03(A0r);
    }
}
