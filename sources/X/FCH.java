package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

public abstract class FCH {
    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.common.ui.widget.imageview.CircularImageView r6, com.instagram.model.reels.Reel r7, X.C51959G9f r8, X.C283155Gi r9, com.instagram.ui.widget.gradientspinner.GradientSpinner r10, int r11, boolean r12) {
        /*
            r5 = r10
            if (r10 == 0) goto L_0x000a
            if (r12 == 0) goto L_0x000b
            r0 = 8
            r10.setVisibility(r0)
        L_0x000a:
            return
        L_0x000b:
            r4 = r7
            r3 = r8
            if (r7 == 0) goto L_0x001e
            r0 = 0
            r10.setVisibility(r0)
            r2 = 11
            X.FO6 r1 = new X.FO6
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x001a:
            X.AnonymousClass0fU.A00(r1, r6)
            return
        L_0x001e:
            r0 = 4
            r10.setVisibility(r0)
            r0 = 15
            X.FPA r1 = new X.FPA
            r1.<init>((X.C51959G9f) r8, (X.C283155Gi) r9, (int) r11, (int) r0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FCH.A01(com.instagram.common.ui.widget.imageview.CircularImageView, com.instagram.model.reels.Reel, X.G9f, X.5Gi, com.instagram.ui.widget.gradientspinner.GradientSpinner, int, boolean):void");
    }

    public static boolean A02(C283155Gi r1) {
        C283165Gj r12 = r1.A04;
        if (!(!C253833rU.A02(r12.A0G)) || !(!C253833rU.A02(r12.A0E))) {
            return false;
        }
        return true;
    }

    public static void A00(AnonymousClass0iw r15, C51959G9f g9f, G7D g7d, C283155Gi r18, int i) {
        String str;
        IgImageView Bwa = g7d.Bwa();
        StackedAvatarView ByY = g7d.ByY();
        C283155Gi r10 = r18;
        C283165Gj r3 = r10.A04;
        ImageUrl imageUrl = r3.A0E;
        ImageUrl imageUrl2 = r3.A0G;
        if (C253833rU.A02(imageUrl)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Missing Profile Image URL. story id: ");
            A1A.append(r10.A09);
            A1A.append("; text: ");
            A1A.append(r3.A0o);
            A1A.append("; type: ");
            C283195Gm r0 = r10.A05;
            if (r0 != null) {
                str = r0.name();
            } else {
                str = "unknown";
            }
            A1A.append(str);
            A1A.append("; story type: ");
            A1A.append(r10.A00);
            A1A.append("; profile id: ");
            0wb.A03("profile_image_missing_newsfeed_story", AnonymousClass7TF.A0l(r3.A0f, A1A));
            Bwa.setVisibility(4);
            ByY.setVisibility(8);
            return;
        }
        C51959G9f g9f2 = g9f;
        int i2 = i;
        if (A02(r10)) {
            Bwa.setVisibility(8);
            ByY.setVisibility(0);
            ByY.setUrls(imageUrl, imageUrl2, r15);
            ByY.setRingColor(2Yu.A00(Bwa.getContext()));
            AnonymousClass0fU.A00(new FO5(i2, 6, ByY, g9f2, r10), ByY);
            C50110FPa.A00(ByY, g9f2, r10, i2, 4);
            return;
        }
        ByY.setVisibility(8);
        Bwa.setVisibility(0);
        Bwa.setUrl(imageUrl, r15);
        AnonymousClass0fU.A00(new FO5(i2, 6, Bwa, g9f2, r10), Bwa);
        C50110FPa.A00(Bwa, g9f2, r10, i2, 4);
    }
}
