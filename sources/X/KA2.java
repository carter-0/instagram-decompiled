package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.base.MediaSession;
import java.util.Set;

public final class KA2 extends C336937fQ {
    public final float A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C267834cI A04;
    public final Set A05 = AnonymousClass7TE.A1F();

    public final int getViewTypeCount() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        C3499582p r5 = (C3499582p) obj;
        if (r5.A00().COf()) {
            r4.A7U(0);
            return;
        }
        int i = 2;
        if (((MediaSession) r5.A00().Co4().get(0)).Bsu() == AnonymousClass05K.A00) {
            i = 1;
        }
        r4.A7U(i);
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [X.L47, java.lang.Object] */
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        C63803L7j l7j;
        int A032 = AnonymousClass0fD.A03(1112881494);
        C3499582p r8 = (C3499582p) obj;
        if (view == null) {
            ViewGroup viewGroup2 = viewGroup;
            if (i == 0) {
                C60050JeI jeI = new C60050JeI(this.A02, r8, this.A04);
                float f = this.A00;
                view = DbT.A0C(DbV.A0D(viewGroup2), viewGroup2, R.layout.layout_album_preview);
                ? obj3 = new Object();
                ReboundViewPager reboundViewPager = (ReboundViewPager) view.requireViewById(R.id.album_view_pager);
                obj3.A00 = reboundViewPager;
                reboundViewPager.A0N(jeI, f);
                l7j = obj3;
            } else if (i == 1) {
                view = LHr.A00(viewGroup2);
            } else {
                view = DbT.A0C(DbV.A0D(viewGroup2), viewGroup2, R.layout.layout_video_preview);
                l7j = new C63803L7j(view);
            }
            view.setTag(l7j);
        }
        int A033 = AnonymousClass0fD.A03(675393004);
        if (i == 0) {
            L47 l47 = (L47) DbT.A0o(view);
            UserSession userSession = this.A03;
            Context context = this.A01;
            C267834cI r10 = this.A04;
            Set set = this.A05;
            float f2 = this.A00;
            ReboundViewPager reboundViewPager2 = l47.A00;
            reboundViewPager2.setPageSpacing(0.0f);
            reboundViewPager2.A0P(new KIA(context, userSession, r8, l47, r10, set));
            L47.A00(context, userSession, r8, l47, r10, set, (int) f2);
        } else {
            C267834cI r1 = this.A04;
            String A0X = JTU.A0X(r8.A00(), 0);
            if (i == 1) {
                AnonymousClass3Q2 BbQ = r1.BbQ(A0X);
                BbQ.getClass();
                float f3 = r8.A00().ANP().A00;
                LHr.A01(this.A02, (C62932Kok) DbT.A0o(view), BbQ, f3);
            } else {
                AnonymousClass3Q2 BbQ2 = r1.BbQ(A0X);
                BbQ2.getClass();
                C63803L7j l7j2 = (C63803L7j) DbT.A0o(view);
                Set set2 = this.A05;
                set2.remove(l7j2.A01);
                set2.add(C63121Krp.A00(this.A01, this.A03, l7j2, BbQ2, BbQ2.A02));
            }
        }
        AnonymousClass0fD.A0A(-1011009257, A033);
        AnonymousClass0fD.A0A(1687619217, A032);
        return view;
    }

    public KA2(Context context, AnonymousClass0iw r3, UserSession userSession, C267834cI r5, float f) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = f;
    }
}
