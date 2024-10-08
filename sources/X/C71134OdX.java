package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import org.webrtc.EglBase14Impl;

/* renamed from: X.OdX  reason: case insensitive filesystem */
public final class C71134OdX {
    public static final C71134OdX A00 = new Object();

    public static final AnonymousClass777 A02(Integer num, Integer num2, Integer num3, Integer num4, Long l, String str) {
        Float f;
        int i;
        int intValue;
        int intValue2;
        Integer num5 = null;
        if (l == null) {
            return null;
        }
        if (num3 != null && num3.intValue() == 1) {
            return null;
        }
        if (num2 != null && num2.intValue() == 1) {
            return null;
        }
        if (num != null && num.intValue() == 1) {
            return C68851NZj.A00;
        }
        String A10 = DbT.A10(OXF.A00(str, (String) null, l.longValue()));
        if (num3 == null || num2 == null || (intValue = num2.intValue()) == 0 || (intValue2 = num3.intValue()) == 0) {
            f = null;
        } else {
            f = Float.valueOf(((float) intValue) / ((float) intValue2));
        }
        SimpleImageUrl A0V = DbS.A0V(A10);
        if (num4 != null) {
            int intValue3 = num4.intValue();
            if (intValue3 == 1) {
                i = R.drawable.filled_grid_album_icon;
            } else if (intValue3 == 2) {
                i = R.drawable.instagram_reels_pano_filled_24;
            } else if (intValue3 == 3) {
                i = R.drawable.play_button;
            }
            num5 = Integer.valueOf(i);
        }
        return new AnonymousClass776(A0V, AnonymousClass7TE.A0u(), f, (Integer) null, (Integer) null, num5, (String) null);
    }

    public final C376649Iu A05(Integer num, String str, String str2) {
        int intValue;
        C69305Nj6 nj6;
        if (num == null || (intValue = num.intValue()) == 0 || str2 == null) {
            return null;
        }
        if (intValue == 1) {
            nj6 = C69305Nj6.PRIVATE;
        } else if (intValue == 2) {
            nj6 = C69305Nj6.EYE_OFF;
        } else if (intValue != 3) {
            0wb.A03("XmaContentViewModelHelper_mapXmaGatingTypeToIconRes", "Unsupported gating type");
            nj6 = C69305Nj6.EYE_OFF;
        } else {
            nj6 = C69305Nj6.NEWS_OFF;
        }
        return new C376649Iu((String) null, (Object) new C70815OMk(nj6, str, str2, false), 5);
    }

    public final boolean A07(C74552Pwl pwl, int i, boolean z) {
        C74555Pww CH8;
        Integer CH5;
        AnonymousClass779 r1;
        int ordinal;
        if (z) {
            CH8 = pwl.Bmd(i);
            CH5 = pwl.Bmc(i);
        } else {
            CH8 = pwl.CH8(i);
            CH5 = pwl.CH5(i);
        }
        if (!(CH5 == null || CH5.intValue() != 5000 || CH8 == null)) {
            C69424Nl6 nl6 = (C69424Nl6) ((AnonymousClass3FZ) CH8).A04("target_type", C69424Nl6.A12);
            if (nl6 == null || (ordinal = nl6.ordinal()) == 0 || ordinal != 20) {
                r1 = AnonymousClass779.UNSUPPORTED;
            } else {
                r1 = AnonymousClass779.IG_EXTERNAL_LINK;
            }
            return r1 != AnonymousClass779.UNSUPPORTED;
        }
    }

    public static final AnonymousClass774 A01(Long l, String str, String str2) {
        if (l == null) {
            return null;
        }
        String str3 = str;
        if (str != null) {
            return new AnonymousClass774((Drawable) null, (Drawable) null, str3, (CharSequence) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, AnonymousClass7TE.A1I(DbS.A0V(DbT.A10(OXF.A00(str2, (String) null, l.longValue())))));
        }
        return null;
    }

    public static final boolean A04(UserSession userSession, AnonymousClass779 r5) {
        long j;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 2342160208991884110L)) {
            switch (r5.ordinal()) {
                case 1:
                case 2:
                case 7:
                    j = 2342160208992015184L;
                    break;
                case 4:
                case 5:
                case 8:
                case 15:
                    j = 2342160208991818573L;
                    break;
                case 6:
                    j = 2342160208992080721L;
                    break;
                case 10:
                    j = 2342160208991949647L;
                    break;
                case 11:
                    j = 2342160208992146258L;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    j = 2342160208992211795L;
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    j = 2342160208992342868L;
                    break;
            }
            if (182.A06(r3, userSession, j)) {
                return true;
            }
        }
        return false;
    }

    public static final AnonymousClass74T A00(Integer num, String str, String str2, String str3) {
        SpannableString A002 = AnonymousClass775.A00(str, str2);
        if (A002 == null) {
            return null;
        }
        return new AnonymousClass74T((ImageUrl) null, (ImageUrl) null, (C254893tE) null, A002, (CharSequence) null, (CharSequence) null, str3, (CharSequence) null, (CharSequence) null, (Integer) null, num, (Integer) null, (Integer) null, (String) null, 2);
    }

    public static final C3255473b A03(Context context, AnonymousClass7L2 r9, String str, boolean z) {
        int i = 8388611;
        if (z) {
            i = 8388613;
        }
        String str2 = str;
        if (str != null) {
            return new C3255473b((MessageIdentifier) null, str2, (String) null, (String) null, (HashMap) null, context.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material), i, r9.A04.A04, r9.A00);
        }
        return null;
    }

    public final boolean A06(C74552Pwl pwl, int i) {
        AnonymousClass779 r1;
        int ordinal;
        C74555Pww CH8 = pwl.CH8(i);
        Integer CH5 = pwl.CH5(i);
        if (!(CH5 == null || CH5.intValue() != 5000 || CH8 == null)) {
            C69424Nl6 nl6 = (C69424Nl6) ((AnonymousClass3FZ) CH8).A04("target_type", C69424Nl6.A12);
            if (nl6 == null || (ordinal = nl6.ordinal()) == 0 || ordinal != 20) {
                r1 = AnonymousClass779.UNSUPPORTED;
            } else {
                r1 = AnonymousClass779.IG_EXTERNAL_LINK;
            }
            if (r1 != AnonymousClass779.UNSUPPORTED) {
                return false;
            }
            return true;
        }
        return false;
    }
}
