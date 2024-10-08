package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.Collections;

/* renamed from: X.F3w  reason: case insensitive filesystem */
public final class C49731F3w {
    public C49460Ew1 A00;
    public C51903G6x A01;
    public C51870G5h A02;
    public C2357330z A03;
    public 1Xj A04;
    public AnonymousClass3W1 A05;
    public C331157Pu A06;
    public final Bundle A07;
    public final UserSession A08;
    public final 2FW A09;

    public final void A01() {
        this.A07.putBoolean("DirectShareSheetConstants.is_created_from_bottom_sheet_navigator", true);
    }

    public final void A04(AnonymousClass4DU r4) {
        0qQ.A0B(r4, 0);
        Bundle bundle = this.A07;
        bundle.putBoolean("DirectShareSheetConstants.insights_sponsored", r4.isSponsoredEligible());
        bundle.putBoolean("DirectShareSheetConstants.insights_organic", r4.isOrganicEligible());
    }

    public final void A06(String str) {
        0qQ.A0B(str, 0);
        2FW r3 = this.A09;
        C48840El2 el2 = C48840El2.$redex_init_class;
        int ordinal = r3.ordinal();
        if (ordinal == 28 || ordinal == 20 || ordinal == 37 || ordinal == 3) {
            if (DbV.A0U(this.A08, str) == null) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Media not found in MediaCache: contentType=");
                A1A.append(r3);
                A1A.append(" contentId=");
                throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(str, A1A));
            }
        } else if (ordinal == 15 && DbV.A0j(this.A08, str) == null) {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("User not found in UserCache: contentType=");
            A1A2.append(r3);
            A1A2.append(" contentId=");
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(str, A1A2));
        }
        this.A07.putString("DirectShareSheetConstants.content_id", str);
    }

    public final void A07(String str) {
        0qQ.A0B(str, 0);
        this.A07.putString("DirectShareSheetConstants.web_link_share", str);
    }

    public final DirectShareSheetFragment A00() {
        DirectShareSheetFragment directShareSheetFragment = new DirectShareSheetFragment();
        directShareSheetFragment.setArguments(this.A07);
        C51903G6x g6x = this.A01;
        if (g6x != null) {
            directShareSheetFragment.A0R = g6x;
        }
        C331157Pu r0 = this.A06;
        if (r0 != null) {
            directShareSheetFragment.A0d = r0;
        }
        AnonymousClass3W1 r02 = this.A05;
        if (r02 != null) {
            directShareSheetFragment.A0c = r02;
        }
        C2357330z r03 = this.A03;
        if (r03 != null) {
            directShareSheetFragment.A0U = r03;
        }
        1Xj r04 = this.A04;
        if (r04 != null) {
            directShareSheetFragment.A0b = r04;
        }
        C51870G5h g5h = this.A02;
        if (g5h != null) {
            directShareSheetFragment.A0T = g5h;
        }
        C49460Ew1 ew1 = this.A00;
        if (ew1 != null) {
            directShareSheetFragment.A0I = ew1;
        }
        return directShareSheetFragment;
    }

    public final void A02(0xF r4) {
        this.A07.putSerializable("DirectShareSheetConstants.analytics_extras", 0j8.A03(r4));
    }

    public final void A08(boolean z) {
        this.A07.putBoolean("DirectShareSheetConstants.should_show_bottom_sheet_drag_handle", z);
    }

    public C49731F3w(UserSession userSession, 2FW r5, String str) {
        Bundle A0a = AnonymousClass7TE.A0a();
        this.A07 = A0a;
        DbU.A1D(A0a, userSession);
        A0a.putString("DirectShareSheetConstants.message_type", r5.A00);
        if (str != null) {
            A0a.putString("DirectShareSheetConstants.source_module", str);
            this.A08 = userSession;
            this.A09 = r5;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.Parcelable, java.lang.Object, com.instagram.direct.model.DirectAREffectShare] */
    public final void A03(ImageUrl imageUrl, ProductAREffectContainer productAREffectContainer, String str, String str2, String str3) {
        AnonymousClass7TG.A1N(str, str2);
        ? obj = new Object();
        obj.A09 = Collections.emptyList();
        obj.A0A = Collections.emptyList();
        obj.A07 = str;
        obj.A08 = str2;
        obj.A01 = imageUrl;
        obj.A06 = str3;
        obj.A05 = null;
        obj.A00 = null;
        obj.A04 = productAREffectContainer;
        this.A07.putParcelable("DirectShareSheetConstants.ar_effect_share", obj);
    }

    public final void A05(C254793t3 r16, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, boolean z) {
        DirectForwardingParams directForwardingParams;
        C254763t0 A022 = C300965yF.A02(r16);
        MsysThreadId A042 = C300965yF.A04(r16);
        Integer num5 = num;
        Integer num6 = num2;
        String str6 = str;
        String str7 = str2;
        boolean z2 = z;
        if (A022 != null) {
            directForwardingParams = new DirectForwardingParams(num5, num6, num3, num4, A022.A00, str6, str7, str3, str4, str5, false, z2);
        } else if (A042 != null) {
            directForwardingParams = new DirectForwardingParams(num5, num6, (Integer) null, (Integer) null, String.valueOf(A042.A00), str6, str7, (String) null, (String) null, (String) null, true, z2);
        } else {
            throw AnonymousClass7TE.A0w("Unsupported threadId type");
        }
        this.A07.putParcelable("DirectShareSheetConstants.forward_params", directForwardingParams);
    }
}
