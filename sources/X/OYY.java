package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;

public final class OYY {
    public final /* synthetic */ C69108Nen A00;

    public OYY(C69108Nen nen) {
        this.A00 = nen;
    }

    public static final void A00(OYY oyy) {
        Integer num;
        C69108Nen nen = oyy.A00;
        PMU pmu = nen.A0M;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Context context = pmu.A0K.getContext();
        String A16 = AnonymousClass7TE.A16(context, 2131976431);
        C68293N9g n9g = pmu.A06;
        Integer num2 = null;
        if (n9g != null) {
            num = n9g.A02;
        } else {
            num = null;
        }
        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A00);
        Context context2 = pmu.A0C;
        Integer num3 = null;
        A1C.add(new C367618rI((Drawable) null, context2.getDrawable(R.drawable.instagram_camera_pano_outline_24), (C15048ULb) null, new PHN(pmu, 10), (Integer) null, A16, 0, 0, 0, true, false, A1W, true, false, false, false));
        String A162 = AnonymousClass7TE.A16(context, 2131976414);
        C68293N9g n9g2 = pmu.A06;
        if (n9g2 != null) {
            num3 = n9g2.A02;
        }
        A1C.add(new C367618rI((Drawable) null, context2.getDrawable(R.drawable.instagram_camera_rear_pano_outline_24), (C15048ULb) null, new PHN(pmu, 11), (Integer) null, A162, 0, 0, 0, true, false, AnonymousClass7TF.A1W(num3, AnonymousClass05K.A01), true, false, false, false));
        String A163 = AnonymousClass7TE.A16(context, 2131976425);
        C68293N9g n9g3 = pmu.A06;
        if (n9g3 != null) {
            num2 = n9g3.A02;
        }
        A1C.add(new C367618rI((Drawable) null, JTO.A0D(pmu.A0f), (C15048ULb) null, new PHN(pmu, 12), (Integer) null, A163, 0, 0, 0, true, false, AnonymousClass7TF.A1W(num2, AnonymousClass05K.A0C), true, false, false, false));
        C355148Ov A0c = C66581MXm.A0c(context, pmu.A0L, Integer.valueOf(R.drawable.dropdown_menu_background), A1C, true);
        pmu.A03 = A0c;
        View contentView = A0c.getContentView();
        0qQ.A07(contentView);
        contentView.measure(0, 0);
        AnonymousClass0eM r8 = pmu.A0e;
        AnonymousClass7TE.A0c(r8).measure(0, 0);
        int[] iArr = new int[2];
        AnonymousClass7TE.A0c(r8).getLocationInWindow(iArr);
        A0c.showAtLocation(AnonymousClass7TE.A0c(r8), 0, (iArr[0] - contentView.getMeasuredWidth()) + AnonymousClass7TE.A0c(r8).getMeasuredWidth(), (iArr[1] - contentView.getMeasuredHeight()) - context2.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap));
        nen.A0K.A00(PKO.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r1.A0I == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r1.A0I != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r3.A0M.A09();
        r3.A0L.A03(new X.C72822PLk(0.0f, false, true));
        X.C69108Nen.A03(r3, "dropdown_menu_tap");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.OYY r5, java.lang.Integer r6) {
        /*
            X.Nen r3 = r5.A00
            X.N9I r1 = r3.A01
            if (r1 == 0) goto L_0x0035
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x006c
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x000c:
            if (r0 == r6) goto L_0x0035
            int r0 = r6.intValue()
            java.lang.String r4 = "dropdown_menu_tap"
            r6 = 1
            r5 = 0
            if (r0 == r5) goto L_0x0036
            if (r0 == r6) goto L_0x0047
            X.Ocu r5 = r3.A0L
            boolean r2 = r1.A0I
            android.view.ViewGroup r0 = r3.A0G
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            float r1 = r1.getDimension(r0)
            X.PLk r0 = new X.PLk
            r0.<init>(r1, r6, r2)
            r5.A03(r0)
            X.C69108Nen.A04(r3, r4, r6, r2)
        L_0x0035:
            return
        L_0x0036:
            boolean r0 = r1.A0I
            if (r0 != 0) goto L_0x003b
            goto L_0x004b
        L_0x003b:
            X.Ocu r2 = r3.A0L
            r1 = 0
            X.PLk r0 = new X.PLk
            r0.<init>(r1, r5, r5)
            r2.A03(r0)
            goto L_0x005e
        L_0x0047:
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x003b
        L_0x004b:
            X.PMU r0 = r3.A0M
            r0.A09()
            X.Ocu r2 = r3.A0L
            r1 = 0
            X.PLk r0 = new X.PLk
            r0.<init>(r1, r5, r6)
            r2.A03(r0)
            X.C69108Nen.A03(r3, r4)
        L_0x005e:
            X.N9I r1 = r3.A01
            if (r1 == 0) goto L_0x0035
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x0035
            boolean r0 = r1.A0I
            X.C69108Nen.A04(r3, r4, r5, r0)
            return
        L_0x006c:
            boolean r0 = r1.A0I
            java.lang.Integer r0 = X.JTP.A0j(r0)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OYY.A01(X.OYY, java.lang.Integer):void");
    }
}
