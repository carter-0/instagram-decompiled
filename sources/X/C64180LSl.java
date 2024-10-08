package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;
import java.util.List;

/* renamed from: X.LSl  reason: case insensitive filesystem */
public final class C64180LSl {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final 1Av A03;

    public static final SpannableStringBuilder A00(C64180LSl lSl, int i) {
        Context context = lSl.A01;
        C62146Kaz kaz = new C62146Kaz(lSl, DbV.A02(context));
        String A16 = AnonymousClass7TE.A16(context, 2131964884);
        SpannableStringBuilder A0D = DbY.A0D(context, A16, i);
        AnonymousClass7AV.A05(A0D, kaz, A16);
        return A0D;
    }

    public static final void A01(C64180LSl lSl) {
        C64180LSl lSl2 = lSl;
        UserSession userSession = lSl2.A02;
        Context context = lSl2.A01;
        String A16 = AnonymousClass7TE.A16(context, 2131965685);
        IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_info_pano_outline_24);
        Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
        InfoItem[] infoItemArr = {new InfoItem(simpleIconConfig, valueOf, A16, (String) null), JTR.A0t(valueOf, AnonymousClass7TE.A16(context, 2131965687), R.drawable.instagram_shield_pano_outline_24), JTR.A0t(valueOf, AnonymousClass7TE.A16(context, 2131965686), R.drawable.instagram_photo_pano_outline_24)};
        0qQ.A0B(infoItemArr, 0);
        List A0I = 03t.A0I(infoItemArr);
        String string = context.getString(2131965688);
        UserSession userSession2 = userSession;
        LOZ loz = new LOZ(userSession2, new PrimerBottomSheetConfig((TitleIcon) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), Integer.valueOf(R.style.PrivacyTextStyle), "magic_media_remix_full_access_settings_nux", AnonymousClass7TE.A16(context, 2131963115), "", string, A0I, 2131965689, false, false, false), (CharSequence) null, true, true, false);
        loz.A00 = new LYE((Object) lSl2, 19);
        A03(lSl2, true);
        loz.A02(context);
        lSl2.A03.A1T(true);
    }

    public static final void A03(C64180LSl lSl, boolean z) {
        AnonymousClass37D A012 = AnonymousClass7ON.A01(lSl.A01, lSl.A02);
        if (A012 != null) {
            ((AnonymousClass37F) A012).A0m = z;
            A012.A0B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (X.C2604245p.A04(r1) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C64180LSl(com.instagram.common.session.UserSession r3, android.content.Context r4) {
        /*
            r2 = this;
            X.AnonymousClass7TG.A1O(r3, r4)
            r2.<init>()
            r2.A02 = r3
            r2.A01 = r4
            X.1Av r0 = X.1Au.A00(r3)
            r2.A03 = r0
            android.content.Context r1 = r2.A01
            boolean r0 = X.C2604245p.A03(r1)
            if (r0 == 0) goto L_0x001f
            boolean r1 = X.C2604245p.A04(r1)
            r0 = 1
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64180LSl.<init>(com.instagram.common.session.UserSession, android.content.Context):void");
    }

    public static final void A02(C64180LSl lSl, String str, int i) {
        C310336ap A0W = DbV.A0W();
        A0W.A0H = str;
        Context context = lSl.A01;
        DbS.A19(context, A0W, i);
        A0W.A0I = context.getString(2131965670);
        A0W.A01 = 5000;
        A0W.A0J = true;
        DbY.A1N(A0W);
    }
}
