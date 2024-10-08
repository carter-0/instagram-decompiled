package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.lang.ref.Reference;

/* renamed from: X.FvY  reason: case insensitive filesystem */
public final class C51526FvY implements Runnable {
    public final /* synthetic */ C230842qN A00;
    public final /* synthetic */ 2bv A01;
    public final /* synthetic */ C300555xO A02;
    public final /* synthetic */ C230882qT A03;

    public C51526FvY(C230842qN r1, 2bv r2, C300555xO r3, C230882qT r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        View view;
        C226262fy r3;
        String str;
        C230882qT r7 = this.A03;
        C300555xO r6 = this.A02;
        if (!r7.A03(r6)) {
            AnonymousClass2bO.A00();
            DcZ A002 = DcY.A00(r7.A06);
            QPTooltipAnchor qPTooltipAnchor = r6.A00;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(A002, A002.A00), "ig_qp_tooltip_cancelled");
            if (qPTooltipAnchor == null || (str = qPTooltipAnchor.A00) == null) {
                str = "unknown";
            }
            A0e.AAJ(AnonymousClass000.A00(3826), str);
            A0e.AAJ(AnonymousClass000.A00(3827), r6.A0D);
            A0e.Cgf();
            r7.A04 = false;
            return;
        }
        Reference reference = (Reference) r7.A07.get(r6.A00);
        if (reference != null) {
            view = (View) reference.get();
        } else {
            view = null;
        }
        if (view != null) {
            Context context = view.getContext();
            Activity activity = r7.A00;
            if (activity == null && (activity = (Activity) 0mE.A00(context, Activity.class)) == null) {
                AnonymousClass2bO.A00();
                DcY.A00(r7.A06);
                return;
            }
            String str2 = r6.A02;
            if (str2 != null) {
                C230842qN r5 = this.A00;
                0qQ.A0A(context);
                int CHU = r5.CHU(context);
                Integer num = r6.A01;
                if (num == null) {
                    num = r5.Aw1();
                }
                if (AnonymousClass05K.A00 == num) {
                    r3 = C226262fy.BELOW_ANCHOR;
                } else {
                    r3 = C226262fy.ABOVE_ANCHOR;
                }
                AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, str2);
                A0f.A05 = r3;
                int CGx = r5.CGx(context, r7.A06);
                if (C226262fy.BELOW_ANCHOR != r3) {
                    CHU = -CHU;
                }
                A0f.A04(view, CGx, CHU, r5.CTz());
                A0f.A04 = new FdW(r6, this.A01, r7);
                if ("instagram_tool_tip_inverted".equals(r6.A09.A00)) {
                    A0f.A07(C283255Gu.A0A);
                    A0f.A08(C283255Gu.A09);
                }
                DbU.A1T(A0f);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
