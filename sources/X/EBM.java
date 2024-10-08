package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class EBM extends 1P0 {
    public final Context A00;
    public final AnonymousClass2t9 A01;
    public final List A02;
    public final UserSession A03;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1748890632);
        int A033 = AnonymousClass0fD.A03(493176586);
        ViewModelListUpdate A0R = DbS.A0R();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) ((C43843CFj) obj).A00);
        ArrayList A0v = DbS.A0v(copyOf.size());
        Iterator it = copyOf.iterator();
        while (it.hasNext()) {
            User user = ((CU1) it.next()).A00;
            List A0n = DbW.A0n(user);
            A0v.add(new DirectShareTarget(new C291175gg(A0n), AnonymousClass50n.A07(user), A0n, true));
        }
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A0v);
        List list = this.A02;
        PzX A002 = PzX.A00(copyOf2);
        AWR awr = new AWR(list, 13);
        Object A05 = A002.A00.A05(A002);
        A05.getClass();
        PzX A003 = PzX.A00(new C8675Qzh(0, A05, awr));
        ImmutableList copyOf3 = ImmutableList.copyOf((Iterable) A003.A00.A05(A003));
        if (copyOf3.isEmpty()) {
            A0R.A00(new EGY(this.A00.getString(2131968486)));
        } else {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ImmutableList.Builder builder = new ImmutableList.Builder();
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            C249803kO it2 = copyOf3.iterator();
            while (it2.hasNext()) {
                DirectShareTarget A0f = DbT.A0f(it2);
                if (A0f.A0O()) {
                    builder.add(A0f);
                } else if (A0f.A0L()) {
                    builder2.add(A0f);
                }
            }
            ImmutableList build = builder.build();
            ImmutableList build2 = builder2.build();
            int i = 0;
            int i2 = 0;
            if (!build.isEmpty()) {
                A1C.addAll(FYR.A00(build, 12, 0, -1, 0, false));
                i = build.size();
                i2 = 1;
            }
            if (!build2.isEmpty()) {
                A1C.add(new C71982OuE((C16744V4b) null, AnonymousClass05K.A0F, AnonymousClass05K.A0N, (Object) null));
                A1C.addAll(FYR.A00(build2, 13, i, -1, i2, false));
            }
            A0R.A01(A1C);
        }
        this.A01.A05(A0R);
        AnonymousClass0fD.A0A(1214559962, A033);
        AnonymousClass0fD.A0A(1083640477, A032);
    }

    public EBM(Context context, AnonymousClass2t9 r4, UserSession userSession, String str) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A02 = A1C;
        this.A01 = r4;
        this.A00 = context;
        this.A03 = userSession;
        A1C.add(userSession.A06);
        if (str != null) {
            A1C.add(str);
        }
    }
}
