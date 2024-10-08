package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;
import java.util.List;

/* renamed from: X.M2t  reason: case insensitive filesystem */
public final class C65878M2t implements Runnable {
    public final /* synthetic */ C359318cb A00;

    public C65878M2t(C359318cb r1) {
        this.A00 = r1;
    }

    public final void run() {
        27r r2;
        boolean z;
        C359448cq r4 = this.A00.A0n;
        C59725JVj jVj = C59725JVj.POST_CAPTURE;
        Dialog dialog = r4.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        LOZ loz = r4.A01;
        if (loz != null) {
            loz.A01();
        }
        0eE r10 = AnonymousClass0t1.A01;
        UserSession userSession = r4.A05;
        Integer A0R = JTQ.A0R(userSession, r10);
        Integer num = AnonymousClass05K.A01;
        boolean A1W = AnonymousClass7TF.A1W(A0R, num);
        0Tu r8 = 0Tu.A05;
        if (182.A06(r8, userSession, 36315709424668146L) || !182.A06(r8, userSession, 36315709424864755L)) {
            if (A1W) {
                Activity activity = r4.A02;
                TitleIcon titleIcon = new TitleIcon(new ColorTint(0, 2Yu.A0H(activity, R.attr.igds_color_gradient_red), 2Yu.A0H(activity, R.attr.igds_color_gradient_purple)), R.drawable.instagram_reels_outline_96);
                Context context = r4.A03;
                String A16 = AnonymousClass7TE.A16(context, 2131955558);
                IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
                Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
                InfoItem[] infoItemArr = {new InfoItem(simpleIconConfig, valueOf, A16, (String) null), JTR.A0t(valueOf, AnonymousClass7TE.A16(context, 2131955570), R.drawable.instagram_user_circle_pano_outline_24), JTR.A0t(valueOf, AnonymousClass7TE.A16(context, 2131955572), R.drawable.instagram_remix_pano_outline_24)};
                0qQ.A0B(infoItemArr, 0);
                List A0I = 03t.A0I(infoItemArr);
                LOZ loz2 = new LOZ(userSession, new PrimerBottomSheetConfig(titleIcon, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, AnonymousClass000.A00(4325), AnonymousClass7TE.A16(context, 2131968772), AnonymousClass7TE.A16(context, 2131963115), (String) null, A0I, 2131955580, false, false, false), (CharSequence) null, true, true, false);
                loz2.A00 = LYA.A00(loz2, jVj, r4, 18);
                loz2.A01 = LYA.A00(loz2, jVj, r4, 19);
                SpannableString spannableString = new SpannableString(context.getString(2131955569));
                spannableString.setSpan(new C60018JdR(1, loz2, r4, jVj), 0, spannableString.length(), 33);
                loz2.A03 = spannableString;
                r4.A01 = loz2;
                loz2.A02(context);
                r4.A06.A1L(jVj, (Boolean) null);
            } else {
                C358248ab A0Y = DbS.A0Y(r4.A03);
                A0Y.A0i(C359448cq.A00(r4));
                A0Y.A0E(LV0.A00(jVj, r4, 17));
                A0Y.A0s(true);
                A0Y.A0B(new C64209LTz(1, r4, jVj));
                A0Y.A09(2131955578);
                A0Y.A08(2131955561);
                A0Y.A0G(LV0.A00(jVj, r4, 18), 2131964884);
                Dialog A02 = A0Y.A02();
                if (!r4.A02.isFinishing()) {
                    r4.A00 = A02;
                    AnonymousClass0fN.A00(A02);
                    r4.A06.A1L(jVj, (Boolean) null);
                }
            }
            r4.A07.A1S(true);
            C368288sN.A00(AnonymousClass818.IG_REELS_PANAVISION_COMPOSER, C368278sM.VIEW, AnonymousClass819.BOTTOMSHEET_PANAVISION_DISCLOSURE, (AnonymousClass81A) null, userSession);
            return;
        }
        boolean A06 = 182.A06(r8, userSession, 36315709424537073L);
        if (JTQ.A0R(userSession, r10) == num) {
            if (A06) {
                C331127Pr A0W = DbS.A0W(userSession);
                A0W.A0k = false;
                A0W.A0q = false;
                A0W.A11 = true;
                A0W.A0y = false;
                C331157Pu A002 = A0W.A00();
                Boolean A01 = C359448cq.A01(r4);
                Bundle A09 = DbY.A09(userSession);
                K5M k5m = new K5M();
                k5m.setArguments(A09);
                Context context2 = r4.A03;
                SpannableString spannableString2 = new SpannableString(context2.getString(2131955569));
                spannableString2.setSpan(new ForegroundColorSpan(context2.getColor(2Yu.A06(r4.A02))), 0, spannableString2.length(), 33);
                spannableString2.setSpan(new C60018JdR(2, A01, r4, jVj), 0, spannableString2.length(), 33);
                k5m.A03 = spannableString2;
                k5m.A00 = new C64249LXb(2, A002, jVj, A01, r4);
                k5m.A01 = LYA.A00(A01, jVj, r4, 20);
                DbU.A1I(r4.A04, k5m, A002);
            } else {
                C367288qV r1 = C367288qV.A01;
                if (r1.A0G(userSession)) {
                    C359448cq.A05(jVj, r4, C367288qV.A06(userSession), false);
                } else if (!r1.A0G(userSession) && !182.A06(r8, userSession, 36315709424668146L) && 182.A06(r8, userSession, 36315709424864755L) && C367288qV.A07(userSession)) {
                    C359448cq.A05(jVj, r4, false, r4.A08.A0C());
                }
            }
            r2 = r4.A06;
            z = C359448cq.A01(r4);
        } else {
            C367288qV r5 = C367288qV.A01;
            if (r5.A0G(userSession)) {
                if (r5.A0F(userSession)) {
                    C359448cq.A04(jVj, r4, false, A06);
                } else if (C367288qV.A06(userSession)) {
                    C359448cq.A04(jVj, r4, true, A06);
                } else {
                    C358248ab A0Y2 = DbS.A0Y(r4.A03);
                    A0Y2.A0i(C359448cq.A00(r4));
                    A0Y2.A0s(true);
                    A0Y2.A0B(new C64209LTz(2, r4, jVj));
                    A0Y2.A09(2131955580);
                    A0Y2.A08(2131955561);
                    A0Y2.A0E(LV0.A00(jVj, r4, 19));
                    A0Y2.A0g(new C71252OgJ(r4, 2));
                    A0Y2.A0G(LV0.A00(jVj, r4, 20), 2131964884);
                    Dialog A022 = A0Y2.A02();
                    r4.A00 = A022;
                    if (!r4.A02.isFinishing()) {
                        AnonymousClass0fN.A00(A022);
                    }
                }
                r2 = r4.A06;
                z = true;
            } else {
                return;
            }
        }
        r2.A1L(jVj, z);
    }
}
