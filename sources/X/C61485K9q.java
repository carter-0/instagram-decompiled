package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.K9q  reason: case insensitive filesystem */
public final class C61485K9q extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C357638Yz A03;
    public final C314236hs A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public final int getViewTypeCount() {
        return 3;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: type inference failed for: r0v15, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3;
        String str;
        Object obj4 = obj;
        View view2 = view;
        int A042 = DbX.A04(view2, 74497940);
        0qQ.A0B(obj4, 2);
        UserSession userSession = this.A02;
        Object tag = view2.getTag();
        if (tag != null) {
            C63700L3k l3k = (C63700L3k) tag;
            AnonymousClass0iw r11 = this.A01;
            C3251571g r10 = ((C63702L3m) obj4).A01;
            C314236hs r8 = this.A04;
            C357638Yz r17 = this.A03;
            boolean z = this.A07;
            String str2 = this.A05;
            AnonymousClass7TG.A1N(userSession, l3k);
            int A08 = C51970G9q.A08(2, r11, r8);
            View[] viewArr = l3k.A00;
            int length = viewArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                View view3 = viewArr[i2];
                if (view3 != null) {
                    obj3 = view3.getTag();
                } else {
                    obj3 = null;
                }
                0qQ.A0C(obj3, C273654mx.A00(3076));
                LN9 ln9 = (LN9) obj3;
                C317466nJ r0 = (C317466nJ) 00k.A0O(r10.A01, r10.A00 + i2);
                LND lnd = C63517KyS.A00;
                if (r0 != null) {
                    lnd.A01(r11, userSession, r17, r8, ln9, r0);
                    C317876nz BzU = ((C317466nJ) r10.A02(i2)).BzU();
                    if (!(!z || BzU == null || str2 == null)) {
                        27r A012 = 27p.A01(userSession);
                        if (DbT.A1b(BzU.A01())) {
                            str = (String) BzU.A01().get(0);
                        } else {
                            str = BzU.A0Z;
                        }
                        A012.A1j((Long) null, str, AED.A02(BzU, false), AED.A00(BzU));
                    }
                } else {
                    0qQ.A0B(ln9, 0);
                    ln9.A08.A02();
                    ln9.A0A.setVisibility(A08);
                    ln9.A0B.setVisibility(8);
                    ln9.A09.setVisibility(8);
                    ln9.A02 = null;
                    ln9.A01 = null;
                }
            }
            AnonymousClass0fD.A0A(1956288695, A042);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-2109978883, A042);
        throw A0y;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        C63702L3m l3m = (C63702L3m) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, r5, l3m);
        int i = l3m.A00;
        if (i == 2) {
            r5.A7U(2);
        } else if (i != 3) {
            r5.A7U(A1U ? 1 : 0);
        } else {
            r5.A7U(0);
        }
    }

    public C61485K9q(Context context, AnonymousClass0iw r2, UserSession userSession, C357638Yz r4, C314236hs r5, String str, boolean z, boolean z2) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = str;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int i2;
        int A032 = AnonymousClass0fD.A03(-930672756);
        if (i == 0) {
            i2 = 3;
        } else if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 0;
            }
        } else {
            i2 = 4;
        }
        UserSession userSession = this.A02;
        AnonymousClass0iw r6 = this.A01;
        Context context = this.A00;
        boolean z = this.A06;
        C51974G9v.A1K(userSession, r6, context);
        LinearLayout linearLayout = new LinearLayout(context);
        if (z) {
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        }
        C63700L3k l3k = new C63700L3k(linearLayout, i2);
        linearLayout.setTag(l3k);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        Resources resources = context.getResources();
        int i3 = R.dimen.abc_button_padding_horizontal_material;
        if (i2 != 2) {
            i3 = R.dimen.accent_edge_thickness;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i3);
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        for (int i4 = 0; i4 < i2; i4++) {
            View[] viewArr = l3k.A00;
            viewArr[i4] = LND.A00(linearLayout, r6, userSession, AnonymousClass7TF.A1T(i4, i2 - 1), AnonymousClass7TF.A1S(i2, 2));
            linearLayout.addView(viewArr[i4]);
        }
        AnonymousClass0fD.A0A(2128252680, A032);
        return linearLayout;
    }
}
