package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import com.instagram.compose.ui.pulltorefresh.PullRefreshNestedScrollConnection;

/* renamed from: X.GQi  reason: case insensitive filesystem */
public abstract class C52383GQi {
    public static final Modifier A00(Modifier modifier, C52397GQw gQw) {
        AnonymousClass7TG.A1N(modifier, gQw);
        0sP r4 = C287655aY.A00;
        C285245Qk r5 = Modifier.A00;
        C58142In8 in8 = new C58142In8(gQw, 28);
        MG0 mg0 = new MG0(gQw, (AnonymousClass4D7) null, 6);
        0qQ.A0B(r5, 0);
        Modifier A0V = C51970G9q.A0V(r5, new PullRefreshNestedScrollConnection(in8, mg0), (NestedScrollDispatcher) null);
        C288285bf r2 = new C288285bf(r4);
        Modifier Ezh = r5.Ezh(r2).Ezh(A0V).Ezh(r2.A00);
        C288285bf r22 = new C288285bf(r4);
        return modifier.Ezh(r22).Ezh(Ezh).Ezh(r22.A00);
    }
}
