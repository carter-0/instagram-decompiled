package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.FIe  reason: case insensitive filesystem */
public final class C49995FIe implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ LinkWithText A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C249723kG A03;
    public final /* synthetic */ Product A04;

    public C49995FIe(FragmentActivity fragmentActivity, LinkWithText linkWithText, UserSession userSession, C249723kG r4, Product product) {
        this.A03 = r4;
        this.A04 = product;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = linkWithText;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (X.AnonymousClass5He.A00(r1) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r7, int r8) {
        /*
            r6 = this;
            com.instagram.user.model.Product r5 = r6.A04
            com.instagram.api.schemas.ProductReviewStatus r1 = r5.A05
            com.instagram.api.schemas.ProductReviewStatus r0 = com.instagram.api.schemas.ProductReviewStatus.REJECTED
            if (r1 != r0) goto L_0x0015
            X.3kG r4 = r6.A03
            androidx.fragment.app.FragmentActivity r3 = r6.A00
            com.instagram.common.session.UserSession r2 = r6.A02
            java.lang.String r1 = r5.A0H
            r0 = 1
            r4.A1F(r3, r2, r1, r0)
            return
        L_0x0015:
            androidx.fragment.app.FragmentActivity r3 = r6.A00
            com.instagram.common.session.UserSession r2 = r6.A02
            com.instagram.api.schemas.LinkWithText r0 = r6.A01
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = r0.A01
            boolean r0 = X.AnonymousClass5He.A00(r1)
            if (r0 != 0) goto L_0x002d
        L_0x0025:
            com.instagram.simplewebview.SimpleWebViewConfig r0 = X.Dba.A0N(r1)
            com.instagram.simplewebview.SimpleWebViewActivity.A00(r3, r2, r0)
            return
        L_0x002d:
            r0 = 3253(0xcb5, float:4.558E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49995FIe.onClick(android.content.DialogInterface, int):void");
    }
}
