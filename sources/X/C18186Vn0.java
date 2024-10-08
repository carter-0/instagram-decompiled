package X;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.QuoteSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import com.instagram.api.schemas.ColorAtTextRangeDictIntf;
import com.instagram.api.schemas.InlineStyleAtRangeDictIntf;
import com.instagram.api.schemas.TextWithEntitiesBlockDictIntf;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;
import com.instagram.common.ui.text.CustomTypefaceSpan;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Vn0  reason: case insensitive filesystem */
public abstract class C18186Vn0 {
    public static SpannableStringBuilder A01(Context context, TextWithEntitiesBlockDictIntf textWithEntitiesBlockDictIntf) {
        Object obj;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TextWithEntitiesIntf C5k = textWithEntitiesBlockDictIntf.C5k();
        C5k.getClass();
        spannableStringBuilder.append(A00(context, C5k));
        String blockType = textWithEntitiesBlockDictIntf.getBlockType();
        0qQ.A0B(blockType, 0);
        C16673Uz9 uz9 = (C16673Uz9) C16673Uz9.A01.get(blockType);
        if (uz9 == null) {
            uz9 = C16673Uz9.A0F;
        }
        int ordinal = uz9.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            obj = new BulletSpan(14);
        } else {
            switch (ordinal) {
                case 4:
                case 13:
                    obj = new QuoteSpan();
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(16, true), 0, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 17);
                    obj = new W7s(47.5f);
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                    obj = new AbsoluteSizeSpan(12, true);
                    break;
                default:
                    return spannableStringBuilder;
            }
        }
        spannableStringBuilder.setSpan(obj, 0, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static SpannableString A00(Context context, TextWithEntitiesIntf textWithEntitiesIntf) {
        String BD2;
        Object obj;
        int i;
        SpannableString spannableString = new SpannableString(textWithEntitiesIntf.getText());
        0sn<InlineStyleAtRangeDictIntf> BHJ = textWithEntitiesIntf.BHJ();
        if (BHJ == null) {
            BHJ = 0sn.A00;
        }
        for (InlineStyleAtRangeDictIntf inlineStyleAtRangeDictIntf : BHJ) {
            0qQ.A0B(inlineStyleAtRangeDictIntf, 0);
            int min = Math.min(AnonymousClass7TG.A0A(inlineStyleAtRangeDictIntf.BXp()), spannableString.length());
            int min2 = Math.min(AnonymousClass7TG.A0A(inlineStyleAtRangeDictIntf.BXp()) + AnonymousClass7TG.A0A(inlineStyleAtRangeDictIntf.BMP()), spannableString.length());
            C16583Uxd uxd = (C16583Uxd) C16583Uxd.A01.get(inlineStyleAtRangeDictIntf.BHI().intValue());
            if (uxd == null) {
                uxd = C16583Uxd.A07;
            }
            switch (uxd.ordinal()) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    obj = new UnderlineSpan();
                    break;
                case 5:
                    obj = new StrikethroughSpan();
                    break;
                case 6:
                    obj = new SubscriptSpan();
                    break;
                case 7:
                    obj = new SuperscriptSpan();
                    break;
                case 9:
                    spannableString.setSpan(new CustomTypefaceSpan(AnonymousClass7TG.A0N(context)), min, min2, 17);
                    continue;
            }
            obj = new StyleSpan(i);
            spannableString.setSpan(obj, min, min2, 17);
        }
        0sn<ColorAtTextRangeDictIntf> Ap2 = textWithEntitiesIntf.Ap2();
        if (Ap2 == null) {
            Ap2 = 0sn.A00;
        }
        for (ColorAtTextRangeDictIntf colorAtTextRangeDictIntf : Ap2) {
            0qQ.A0B(colorAtTextRangeDictIntf, 0);
            int min3 = Math.min(AnonymousClass7TG.A0A(colorAtTextRangeDictIntf.BXp()), spannableString.length());
            int min4 = Math.min(AnonymousClass7TG.A0A(colorAtTextRangeDictIntf.BXp()) + AnonymousClass7TG.A0A(colorAtTextRangeDictIntf.BXp()), spannableString.length());
            if (AnonymousClass3HA.A00(context)) {
                BD2 = colorAtTextRangeDictIntf.BD3();
            } else {
                BD2 = colorAtTextRangeDictIntf.BD2();
            }
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(BD2)), min3, min4, 17);
        }
        return spannableString;
    }
}
