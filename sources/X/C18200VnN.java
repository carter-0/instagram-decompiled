package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.VnN  reason: case insensitive filesystem */
public abstract class C18200VnN {
    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v19, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (r2.BAu().booleanValue() == false) goto L_0x0071;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass0iw r4, X.C230182p7 r5, X.C14897UDz r6, X.C57250IUl r7, X.C270054g7 r8) {
        /*
            X.3IK r2 = r8.A00
            com.instagram.common.typedurl.ImageUrl r0 = r2.BEO()
            boolean r1 = X.C253833rU.A02(r0)
            r3 = 0
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            if (r1 != 0) goto L_0x008f
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r6.A00
            if (r1 != 0) goto L_0x001d
            android.view.ViewStub r0 = r6.A02
            android.view.View r1 = r0.inflate()
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = (com.instagram.common.ui.widget.imageview.CircularImageView) r1
            r6.A00 = r1
        L_0x001d:
            com.instagram.common.typedurl.ImageUrl r0 = r2.BEO()
            r1.setUrl(r0, r4)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A00
            if (r0 != 0) goto L_0x0032
            android.view.ViewStub r0 = r6.A02
            android.view.View r0 = r0.inflate()
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = (com.instagram.common.ui.widget.imageview.CircularImageView) r0
            r6.A00 = r0
        L_0x0032:
            r0.setVisibility(r3)
        L_0x0035:
            android.widget.TextView r1 = r6.A04
            java.lang.String r0 = r8.A03()
            r1.setText(r0)
            android.widget.TextView r1 = r6.A03
            java.lang.String r0 = r8.A02()
            r1.setText(r0)
            java.lang.String r0 = r2.Air()
            r4 = 8
            if (r0 == 0) goto L_0x0089
            com.instagram.igds.components.button.IgdsButton r1 = r6.A05
            r1.setVisibility(r3)
            java.lang.String r0 = r2.Air()
            r1.setText((java.lang.String) r0)
            r0 = 34
            X.WB4.A00(r1, r5, r8, r7, r0)
        L_0x0060:
            java.lang.Boolean r0 = r2.BAu()
            if (r0 == 0) goto L_0x0071
            java.lang.Boolean r0 = r2.BAu()
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            android.view.View r2 = r6.A01
            if (r0 == 0) goto L_0x0084
            r2.setVisibility(r3)
            r1 = 13
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r5, (int) r1)
        L_0x0080:
            X.AnonymousClass0fU.A00(r0, r2)
            return
        L_0x0084:
            r2.setVisibility(r4)
            r0 = 0
            goto L_0x0080
        L_0x0089:
            com.instagram.igds.components.button.IgdsButton r0 = r6.A05
            r0.setVisibility(r4)
            goto L_0x0060
        L_0x008f:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A00
            X.0nA.A0O(r0)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18200VnN.A01(X.0iw, X.2p7, X.UDz, X.IUl, X.4g7):void");
    }

    public static View A00(Context context, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.simple_action);
        A0C.setTag(new C14897UDz(A0C));
        return A0C;
    }
}
