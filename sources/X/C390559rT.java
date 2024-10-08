package X;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.reels.ProductShareConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import com.instagram.shopping.model.share.ShopShareInfo;
import com.instagram.user.model.Product;
import java.io.File;

/* renamed from: X.9rT  reason: invalid class name and case insensitive filesystem */
public final class C390559rT extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelProductShareFragment";
    public RectF A00;
    public RectF A01;
    public 28D A02;
    public ProductShareConfig A03;
    public PendingRecipient A04;
    public ProductCollectionShareInfo A05;
    public ShopShareInfo A06;
    public Product A07;
    public File A08;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        AnonymousClass80E r0;
        0qQ.A0B(viewGroup, 0);
        long currentTimeMillis = System.currentTimeMillis();
        File file = this.A08;
        String str = "file";
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            0qQ.A07(absolutePath);
            long A0P = AnonymousClass7TE.A0P(currentTimeMillis);
            File file2 = this.A08;
            if (file2 != null) {
                Medium medium = new Medium(Uri.fromFile(file2), absolutePath, 0, 1, 0, 0, A0P, currentTimeMillis);
                AnonymousClass80D A002 = AnonymousClass80D.A00();
                AnonymousClass80D.A0F(A002, this);
                AnonymousClass80I r1 = AnonymousClass80H.A02;
                UserSession userSession = this.A00;
                0qQ.A06(userSession);
                AnonymousClass80D.A09(userSession, r1, A002, this);
                A002.A09 = viewGroup;
                28D r02 = this.A02;
                if (r02 == null) {
                    str = "entryPoint";
                } else {
                    A002.A0B = r02;
                    A002.A0O = this;
                    AnonymousClass80D.A02(this.A00, this.A01, A002);
                    A002.A3y = true;
                    A002.A3g = true;
                    A002.A0P = medium;
                    A002.A0w = null;
                    A002.A1t = this.A07;
                    A002.A1r = this.A05;
                    A002.A1s = this.A06;
                    A002.A1M = this.A03;
                    A002.A3Q = true;
                    PendingRecipient pendingRecipient = this.A04;
                    if (pendingRecipient != null) {
                        A002.A1S = pendingRecipient;
                        r0 = AnonymousClass80E.GROUP_PROFILE;
                    } else {
                        r0 = AnonymousClass80E.ALL;
                    }
                    A002.A0y = r0;
                    return A002;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "reel_product_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1459227806);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AnonymousClass7TH.A07(requireArguments, AnonymousClass000.A00(2465));
        this.A00 = (RectF) requireArguments.getParcelable(AnonymousClass000.A00(471));
        this.A01 = (RectF) requireArguments.getParcelable(AnonymousClass000.A00(472));
        String string = requireArguments.getString(AnonymousClass000.A00(473));
        if (string != null) {
            this.A08 = AnonymousClass7TE.A0t(string);
            this.A07 = (Product) requireArguments.getParcelable(AnonymousClass000.A00(2467));
            this.A05 = (ProductCollectionShareInfo) requireArguments.getParcelable(AnonymousClass000.A00(2464));
            this.A06 = (ShopShareInfo) requireArguments.getParcelable(AnonymousClass000.A00(2468));
            requireArguments.getBoolean(AnonymousClass000.A00(2466));
            this.A03 = (ProductShareConfig) requireArguments.getParcelable(AnonymousClass000.A00(2469));
            this.A04 = (PendingRecipient) requireArguments.getParcelable(AnonymousClass000.A00(474));
            AnonymousClass0fD.A09(393180696, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-161794585, A022);
        throw A0y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.exists() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r2 = this;
            r0 = -194471285(0xfffffffff4689a8b, float:-7.371505E31)
            int r1 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            com.instagram.user.model.Product r0 = r2.A07
            if (r0 == 0) goto L_0x0022
            java.io.File r0 = r2.A08
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "file"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0025
        L_0x0022:
            X.VJ3.A00(r2)
        L_0x0025:
            r0 = -723847900(0xffffffffd4daf524, float:-7.5233252E12)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390559rT.onResume():void");
    }
}
