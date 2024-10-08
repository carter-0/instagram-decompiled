package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class K74 extends AnonymousClass4DH implements AnonymousClass4DU, C51924G7s, AnonymousClass4DS, C51923G7r {
    public static final String __redex_internal_original_name = "StoryCommentsDashboardFragment";
    public List A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(MM5.A00);

    public final void Cs5() {
    }

    public final void DhN() {
    }

    public final void FId(C14631Tzd tzd) {
    }

    public final String getModuleName() {
        return "story_comments_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        C58107ImT imT = new C58107ImT((Object) viewLifecycleOwner, (Object) r4, (Object) this, (AnonymousClass4D7) null, 26);
        19B r1 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(this, r1, imT, A002);
        1Eo.A05(r1, new C58107ImT((Object) A0I, (Object) r4, (Object) this, (AnonymousClass4D7) null, 27), AnonymousClass07a.A00(A0I));
    }

    public final boolean CJz() {
        return ((C61032JvW) C60317JjL.A00((C60317JjL) this.A04.getValue())).A05;
    }

    public final void CgO() {
        2YL A0H = DbS.A0H(this.A04);
        AnonymousClass7TE.A1Z(new C58099ImL(A0H, (AnonymousClass4D7) null, 44), C318116oQ.A00(A0H));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (((X.C61032JvW) X.C60317JjL.A00(r3)).A09 != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cs2(X.C14631Tzd r5) {
        /*
            r4 = this;
            X.0eM r0 = r4.A04
            java.lang.Object r3 = r0.getValue()
            X.JjL r3 = (X.C60317JjL) r3
            java.util.List r2 = r3.A05
            r1 = 21
            X.J6L r0 = new X.J6L
            r0.<init>(r5, r1)
            X.018.A1A(r2, r0)
            java.lang.Object r0 = X.C60317JjL.A00(r3)
            X.JvW r0 = (X.C61032JvW) r0
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0029
            java.lang.Object r0 = X.C60317JjL.A00(r3)
            X.JvW r0 = (X.C61032JvW) r0
            boolean r1 = r0.A09
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            X.C60317JjL.A04(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K74.Cs2(X.Tzd):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public K74() {
        MJ2 mj2 = new MJ2(this, 28);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MJ2(new MJ2(this, 25), 26));
        this.A04 = DbS.A0I(new MJ2(A002, 27), mj2, new MJ5(5, (Object) null, A002), DbS.A0z(C60317JjL.class));
        this.A01 = AnonymousClass1YB.A00(new MJ2(this, 23));
        this.A05 = AnonymousClass1YB.A00(new MJ2(this, 29));
        this.A00 = AnonymousClass7TE.A1C();
        this.A02 = AnonymousClass0eN.A01(new MJ2(this, 24));
    }

    public static final List A00(List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C60970JuS juS = (C60970JuS) it.next();
            String str = juS.A06;
            ImageUrl imageUrl = juS.A01;
            String str2 = juS.A04;
            String str3 = juS.A05;
            Long l = juS.A03;
            boolean z = juS.A07;
            boolean z2 = juS.A08;
            A0r.add(new C64809LiU(imageUrl, juS.A02, l, str, str2, str3, juS.A00, z, z2, juS.A09));
        }
        return A0r;
    }

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, JTT.A0B(this, r3).getString(2131963516));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        int A022 = AnonymousClass0fD.A02(-423815173);
        Context context = getContext();
        if (context != null) {
            recyclerView = new RecyclerView(context, (AttributeSet) null);
            ((2el) AnonymousClass7TE.A14(this.A06)).A08(recyclerView, AnonymousClass3DZ.A00(this), new AnonymousClass2eo[0]);
            C51968G9o.A1D(recyclerView, -1);
            Context context2 = recyclerView.getContext();
            DbV.A1B(context2, recyclerView);
            Dba.A17(recyclerView, this.A01);
            recyclerView.A15((C249403jg) this.A02.getValue());
            DbT.A16(context2, recyclerView, 2Yu.A0H(context2, R.attr.igds_color_primary_background));
        } else {
            recyclerView = null;
        }
        AnonymousClass0fD.A09(1174437371, A022);
        return recyclerView;
    }
}
