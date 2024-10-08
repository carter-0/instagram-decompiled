package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.K9n  reason: case insensitive filesystem */
public final class C61482K9n extends C231632rz {
    public final Context A00;
    public final C2355930l A01;
    public final UserSession A02;
    public final IngestSessionShim A03;
    public final L1M A04;
    public final MVA A05;
    public final MTF A06;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Integer num;
        int A032 = AnonymousClass0fD.A03(-108522699);
        FV6 fv6 = (FV6) obj;
        LAN lan = (LAN) DbT.A0o(view);
        MTF mtf = this.A06;
        UserSession userSession = this.A02;
        Context context = this.A00;
        MVA mva = this.A05;
        UserStoryTarget userStoryTarget = fv6.A0A;
        C65300Lqt lqt = new C65300Lqt(context, (AnonymousClass0iw) null, userSession, this.A03, mva, userStoryTarget, (C363008it) null, mtf, false);
        L1M l1m = this.A04;
        0qQ.A0B(lan, 0);
        DbW.A1O(mtf, 3, l1m);
        lan.A02.setActivated(fv6.A00);
        View view2 = lan.A00;
        LYE.A00(view2, 23, l1m);
        C252063oV r3 = lan.A05;
        r3.setVisibility(0);
        LYE.A00(r3.getView(), 24, l1m);
        0qQ.A0A(userSession);
        int A002 = C63112Krf.A00(userSession);
        TextView textView = (TextView) r3.getView();
        if (A002 > 0) {
            textView.setText(DbY.A0d(view2.getResources(), A002, R.plurals.recipient_picker_close_friends_count));
        } else {
            textView.setText(2131969778);
        }
        r3.getView();
        LRm AXA = mtf.AXA();
        boolean z = true;
        if (AXA != null) {
            Integer num2 = AXA.A01(C61002Juy.A03).A01;
            LRm AXA2 = mtf.AXA();
            0qQ.A0A(AXA2);
            Integer num3 = AXA2.A01(C61002Juy.A07).A01;
            Integer num4 = AnonymousClass05K.A0N;
            if (!(num2 == num4 || num2 == (num = AnonymousClass05K.A0C) || num3 == num4 || num3 == num)) {
                z = false;
            }
        }
        View view3 = lan.A01;
        C71392co r0 = C315596kB.A02;
        C294975nL A0c = JTP.A0c(view3, 0);
        if (z) {
            A0c.A0I(0.0f);
            A0c.A03 = 4;
            A0c.A0H();
            C294975nL A0c2 = JTP.A0c(view2, 0);
            A0c2.A0I(0.5f);
            A0c2.A0H();
            lan.A06.A01.setClickable(false);
            view2.setClickable(false);
            r3.getView().setClickable(false);
        } else {
            A0c.A0I(1.0f);
            A0c.A04 = 0;
            A0c.A0H();
            C294975nL A0c3 = JTP.A0c(view2, 0);
            A0c3.A0I(1.0f);
            A0c3.A0H();
            C64162LRd lRd = lan.A06;
            lRd.A01.setClickable(true);
            view2.setClickable(true);
            r3.getView().setClickable(true);
            C61002Juy juy = C61002Juy.A05;
            LRm AXA3 = mtf.AXA();
            if (AXA3 != null) {
                lRd.A03(AXA3.A01(juy), lqt);
                lRd.A05(DbU.A05(view2).getString(2131960410), AnonymousClass05K.A00);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        AnonymousClass0fD.A0A(1140282506, A032);
    }

    public C61482K9n(Context context, C2355930l r2, UserSession userSession, IngestSessionShim ingestSessionShim, L1M l1m, MVA mva, MTF mtf) {
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = mva;
        this.A04 = l1m;
        this.A01 = r2;
        this.A06 = mtf;
        this.A03 = ingestSessionShim;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-1292247303);
        UserSession userSession = this.A02;
        Context A0C = JTP.A0C(viewGroup, 0);
        View A0A = DbU.A0A(LayoutInflater.from(A0C), viewGroup, R.layout.recipient_picker_add_to_favorites_story, false);
        LAN lan = new LAN(A0A, userSession);
        ImageView imageView = lan.A02;
        0qQ.A0A(A0C);
        imageView.setImageDrawable(C346697vb.A00(A0C));
        lan.A03.setText(2131956191);
        A0A.setTag(lan);
        AnonymousClass0fD.A0A(-2124839340, A032);
        return A0A;
    }
}
