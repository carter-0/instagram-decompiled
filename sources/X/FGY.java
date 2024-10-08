package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

public final class FGY {
    public final Bitmap A00;
    public final UserSession A01;
    public final C62628Kiz A02;
    public final C8K A03;
    public final C63737L4v A04;
    public final String A05;
    public final String A06;

    public static final void A01(FragmentActivity fragmentActivity, FGY fgy) {
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        HashMap A1E3 = AnonymousClass7TE.A1E();
        BitSet A0w = DbS.A0w(1);
        boolean A1Z = Dba.A1Z("promo_id", fgy.A05, A1E, A0w);
        IgBloksScreenConfig A0N = DbS.A0N(fgy.A01);
        if (A0w.nextClearBit(A1Z ? 1 : 0) >= 1) {
            C46649DiU diU = new C46649DiU(C359608dC.A01(A1E), A1E2, "com.bloks.www.nme.contextual_guidance.ig.enhanced_linksheet.bottomsheet.nux");
            C46649DiU.A0B(diU, 719983200);
            diU.A03 = null;
            diU.A02 = null;
            diU.A04 = null;
            diU.A0H(A1E3);
            diU.A0E(fragmentActivity, A0N);
            return;
        }
        throw DbU.A0i();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.instagram.igds.components.banner.IgdsInsetBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.instagram.igds.components.banner.IgdsInsetBanner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.Dk5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.instagram.igds.components.banner.IgdsInsetBanner} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A05(android.content.Context r8) {
        /*
            r7 = this;
            r5 = 0
            X.0qQ.A0B(r8, r5)
            X.Kiz r0 = r7.A02
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x0012
            r2 = 6
            if (r1 == r2) goto L_0x00cf
            r4 = 0
            return r4
        L_0x0012:
            X.C8K r6 = r7.A03
            java.lang.String r1 = "subtitle"
            java.lang.String r0 = r6.A0C(r1)
            r3 = 0
            if (r0 == 0) goto L_0x00cd
            com.instagram.igds.components.banner.IgdsInsetBanner r4 = new com.instagram.igds.components.banner.IgdsInsetBanner
            r4.<init>(r8, r3, r5, r5)
            java.lang.String r1 = r6.A0C(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.setBody(r1, r0)
            r2 = 6
            java.lang.String r1 = "cta_text"
            java.lang.String r0 = r6.getOptionalStringField(r2, r1)
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r6.getOptionalStringField(r2, r1)
            r4.setAction((java.lang.String) r0)
        L_0x003d:
            r1 = 2
            X.FcH r0 = new X.FcH
            r0.<init>(r1, r7, r8)
            r4.A00 = r0
            X.Bxi r1 = r6.A0E()
            if (r1 == 0) goto L_0x0063
            java.lang.String r0 = "uri"
            java.lang.String r0 = r1.getOptionalStringField(r5, r0)
            if (r0 == 0) goto L_0x0063
            android.graphics.Bitmap r2 = r7.A00
            if (r2 == 0) goto L_0x00cd
            android.content.res.Resources r1 = r8.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r2)
            r4.setIconEnd((android.graphics.drawable.Drawable) r0)
        L_0x0063:
            r0 = 1
            r4.setDismissible(r0)
            java.lang.String r0 = "IMPRESSION"
            A04(r7, r0)
            goto L_0x00e2
        L_0x006d:
            X.Dk5 r3 = new X.Dk5
            r3.<init>(r8)
            java.lang.String r0 = r6.A0B(r1)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x007b
            r0 = r1
        L_0x007b:
            r3.setHeadline(r0)
            java.lang.String r0 = "subtitle"
            java.lang.String r0 = r6.A0C(r0)
            if (r0 == 0) goto L_0x0087
            r1 = r0
        L_0x0087:
            r3.setBody(r1)
            java.lang.String r0 = "cta_text"
            java.lang.String r2 = r6.getOptionalStringField(r2, r0)
            if (r2 == 0) goto L_0x009c
            r1 = 67
            X.FPF r0 = new X.FPF
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r7)
            r3.setPrimaryButton(r2, r0)
        L_0x009c:
            r1 = 39
            X.G2g r0 = new X.G2g
            r0.<init>(r7, r1)
            r3.setDismissListener(r0)
            X.Bxi r1 = r6.A0E()
            if (r1 == 0) goto L_0x00c8
            java.lang.String r0 = "uri"
            java.lang.String r0 = r1.getOptionalStringField(r5, r0)
            if (r0 == 0) goto L_0x00c8
            android.graphics.Bitmap r1 = r7.A00
            if (r1 == 0) goto L_0x00e2
            android.content.res.Resources r0 = r8.getResources()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r0, r1)
            X.EV1 r1 = X.EV1.TOP
            X.EVB r0 = X.EVB.SMALL
            r3.setIllustrationDrawable(r2, r1, r0)
        L_0x00c8:
            java.lang.String r0 = "IMPRESSION"
            A04(r7, r0)
        L_0x00cd:
            r4 = r3
            goto L_0x00e2
        L_0x00cf:
            X.C8K r6 = r7.A03
            java.lang.String r1 = "title"
            java.lang.String r0 = r6.A0B(r1)
            r4 = 0
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "subtitle"
            java.lang.String r0 = r6.A0C(r0)
            if (r0 != 0) goto L_0x006d
        L_0x00e2:
            android.view.View r4 = (android.view.View) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGY.A05(android.content.Context):android.view.View");
    }

    public final void A06(FragmentActivity fragmentActivity) {
        0qQ.A0B(fragmentActivity, 0);
        int ordinal = this.A02.ordinal();
        if (ordinal == 9) {
            throw AnonymousClass7TE.A0w("Tooltip show config is required for tooltip");
        } else if (ordinal == 3) {
            A02(fragmentActivity, this);
        } else if (ordinal == 2) {
            C8K c8k = this.A03;
            if (!c8k.hasFieldValue("is_bloks") || !c8k.getCoercedBooleanField(9, "is_bloks")) {
                A03(fragmentActivity, this);
            } else {
                A01(fragmentActivity, this);
            }
        }
    }

    public static final void A00(Context context, FGY fgy) {
        C8K c8k = fgy.A03;
        if (c8k.getOptionalStringField(7, "cta_url") != null) {
            A04(fgy, C273654mx.A00(207));
            String optionalStringField = c8k.getOptionalStringField(7, "cta_url");
            if (optionalStringField == null) {
                optionalStringField = "";
            }
            FHB.A05(context, optionalStringField);
        }
    }

    public static final void A02(FragmentActivity fragmentActivity, FGY fgy) {
        C8K c8k = fgy.A03;
        if (c8k.A0B(DialogModule.KEY_TITLE) != null) {
            C43406Bxi A0E = c8k.A0E();
            if (A0E == null || A0E.A07("uri") == null || fgy.A00 != null) {
                Object obj = new Object();
                F3t f3t = new F3t(fragmentActivity);
                String A0B = c8k.A0B(DialogModule.KEY_TITLE);
                String str = "";
                if (A0B == null) {
                    A0B = str;
                }
                f3t.A06 = A0B;
                f3t.A0B = true;
                String A0C = c8k.A0C("subtitle");
                if (A0C != null) {
                    str = A0C;
                }
                f3t.A04 = str;
                f3t.A09 = true;
                String optionalStringField = c8k.getOptionalStringField(6, "cta_text");
                if (optionalStringField != null) {
                    f3t.A02(new C50026FJl(27, (Object) fragmentActivity, (Object) fgy, obj), optionalStringField);
                }
                Bitmap bitmap = fgy.A00;
                if (bitmap != null) {
                    f3t.A02 = new C50492Fce(bitmap);
                    f3t.A05 = AnonymousClass05K.A0C;
                }
                f3t.A01 = new C50030FJp(3, fgy, obj);
                A04(fgy, "IMPRESSION");
                AnonymousClass0fN.A00(f3t.A00());
            }
        }
    }

    public static final void A03(FragmentActivity fragmentActivity, FGY fgy) {
        C8K c8k = fgy.A03;
        if (c8k.A0B(DialogModule.KEY_TITLE) != null) {
            C43406Bxi A0E = c8k.A0E();
            if (A0E == null || A0E.A07("uri") == null || fgy.A00 != null) {
                Object obj = new Object();
                String A0B = c8k.A0B(DialogModule.KEY_TITLE);
                if (A0B == null) {
                    A0B = "";
                }
                String A0C = c8k.A0C("subtitle");
                Bitmap bitmap = fgy.A00;
                Bundle A0C2 = DbV.A0C(DialogModule.KEY_TITLE, A0B);
                A0C2.putString("body", A0C);
                A0C2.putParcelable("illustration", bitmap);
                C47395E0n e0n = new C47395E0n();
                e0n.setArguments(A0C2);
                C331127Pr A0W = DbS.A0W(fgy.A01);
                if (c8k.getOptionalStringField(6, "cta_text") != null) {
                    A0W.A0g = c8k.getOptionalStringField(6, "cta_text");
                    A0W.A1J = true;
                    A0W.A0v = true;
                    A0W.A0K = new FPH(36, (Object) fragmentActivity, (Object) fgy, obj);
                }
                A0W.A0U = new FmA(3, obj, fgy);
                A04(fgy, "IMPRESSION");
                DbU.A0y(fragmentActivity, e0n, A0W);
            }
        }
    }

    public static final void A04(FGY fgy, String str) {
        C63737L4v l4v = fgy.A04;
        String str2 = fgy.A05;
        String str3 = fgy.A06;
        Enum optionalEnumField = fgy.A03.getOptionalEnumField(3, "entry_flow", C48125EWr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        AnonymousClass7TE.A1Z(new C66178MGp(l4v, optionalEnumField, str, str2, str3, (AnonymousClass4D7) null, 6), l4v.A01);
    }

    public FGY(Bitmap bitmap, UserSession userSession, C62628Kiz kiz, C63737L4v l4v, C8K c8k, String str, String str2) {
        AnonymousClass7TG.A1O(str, kiz);
        DbW.A1O(c8k, 4, l4v);
        this.A05 = str;
        this.A02 = kiz;
        this.A06 = str2;
        this.A03 = c8k;
        this.A00 = bitmap;
        this.A04 = l4v;
        this.A01 = userSession;
    }
}
