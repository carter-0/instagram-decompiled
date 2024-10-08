package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fkj  reason: case insensitive filesystem */
public final class C50904Fkj implements G7K {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ 28D A02;
    public final /* synthetic */ ACRType A03;
    public final /* synthetic */ AnonymousClass4DH A04;
    public final /* synthetic */ AnonymousClass8ZP A05;
    public final /* synthetic */ C255773uh A06;
    public final /* synthetic */ AnonymousClass6Z5 A07;
    public final /* synthetic */ List A08;

    public final void Dje(List list) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        Fragment fragment = this.A04;
        if (fragment.mDetached) {
            UserSession userSession = this.A07.A09;
            if (userSession != null) {
                if (DbY.A1Y(0Tu.A05, userSession, 36325768237692109L)) {
                    DbT.A1Q(0wj.A01, "crash_when_showing_crossposting_progress", 817890849);
                    return;
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        0gy A002 = AnonymousClass07i.A00(fragment);
        Context context = this.A01;
        AnonymousClass6Z5 r14 = this.A07;
        UserSession userSession2 = r14.A09;
        if (userSession2 != null) {
            AnonymousClass72Q r4 = new AnonymousClass72Q(context, userSession2);
            AnonymousClass6ST A0h = DbV.A0h(context);
            DbX.A15(context, A0h);
            List<1Xj> list3 = this.A08;
            ArrayList A0r = AnonymousClass7TG.A0r(list3);
            for (1Xj A003 : list3) {
                A0r.add(r4.A00(A003));
            }
            C290815g0 A012 = r4.A01(00k.A0a(A0r), list2);
            A012.A00 = new KH0(context, A002, this.A02, this.A03, this.A05, this.A06, A0h, r14, list3, this.A00);
            1ES.A00(context, A002, A012);
            return;
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public C50904Fkj(Context context, 28D r2, ACRType aCRType, AnonymousClass4DH r4, AnonymousClass8ZP r5, C255773uh r6, AnonymousClass6Z5 r7, List list, int i) {
        this.A04 = r4;
        this.A07 = r7;
        this.A01 = context;
        this.A08 = list;
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = aCRType;
        this.A06 = r6;
        this.A00 = i;
    }

    public final void onCancel() {
        throw AnonymousClass00P.createAndThrow();
    }
}
