package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import java.util.List;

/* renamed from: X.4Kf  reason: invalid class name */
public final class AnonymousClass4Kf {
    public static final AnonymousClass4Kf A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableStringBuilder A02(android.content.Context r10, com.instagram.common.session.UserSession r11, X.AnonymousClass4Ke r12) {
        /*
            r3 = 0
            r8 = r11
            X.0qQ.A0B(r11, r3)
            r0 = 2
            r9 = r12
            X.0qQ.A0B(r12, r0)
            android.graphics.drawable.Drawable r5 = A01(r10, r12)
            android.graphics.drawable.Drawable r6 = A00(r10, r12)
            android.content.res.Resources r4 = r10.getResources()
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x0027
            r0 = 2131953302(0x7f130696, float:1.9543071E38)
            java.lang.String r0 = r4.getString(r0)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r0)
            return r7
        L_0x0027:
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x0050
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 2131231393(0x7f0802a1, float:1.8078866E38)
        L_0x0035:
            android.graphics.drawable.Drawable r1 = X.C263314Kg.A00(r10, r1, r0)
        L_0x0039:
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            A05(r10, r1, r7, r12, r0)
            X.9Ie r0 = r12.A01
            if (r0 == 0) goto L_0x0063
            java.lang.Object r1 = r0.A03
            com.instagram.api.schemas.OriginalAudioSubtype r0 = com.instagram.api.schemas.OriginalAudioSubtype.A05
            if (r1 == r0) goto L_0x0063
            X.0qQ.A0A(r4)
            A07(r4, r5, r6, r7, r8, r9)
            return r7
        L_0x0050:
            boolean r0 = r12.A06
            X.4Kg r1 = X.C263314Kg.A00
            if (r0 == 0) goto L_0x005d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            android.graphics.drawable.BitmapDrawable r1 = r1.A06(r10, r0)
            goto L_0x0039
        L_0x005d:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 2131238578(0x7f081eb2, float:1.8093439E38)
            goto L_0x0035
        L_0x0063:
            java.lang.String r0 = r12.A03
            r7.append(r0)
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x007a
            X.6Jl r2 = new X.6Jl
            r2.<init>()
            int r1 = r7.length()
            r0 = 33
            r7.setSpan(r2, r3, r1, r0)
        L_0x007a:
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0085
            java.lang.String r0 = " • "
            r7.append(r0)
        L_0x0085:
            java.lang.String r0 = r12.A04
            r7.append(r0)
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0096
            if (r5 == 0) goto L_0x0096
            X.0qQ.A0A(r4)
            A0B(r4, r5, r7, r3)
        L_0x0096:
            X.0qQ.A0A(r4)
            A0A(r4, r6, r7, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Kf.A02(android.content.Context, com.instagram.common.session.UserSession, X.4Ke):android.text.SpannableStringBuilder");
    }

    public static final SpannableStringBuilder A03(Resources resources, Drawable drawable, Drawable drawable2, UserSession userSession, AnonymousClass4Ke r16, boolean z) {
        Object obj;
        List list;
        AnonymousClass4Ke r11 = r16;
        0qQ.A0B(r11, 2);
        Resources resources2 = resources;
        if (r11.A05) {
            return new SpannableStringBuilder(resources.getString(2131953302));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        AnonymousClass4Kf r5 = A00;
        C376489Ie r4 = r11.A01;
        if (r4 != null) {
            obj = r4.A03;
        } else {
            obj = null;
        }
        Drawable drawable3 = drawable;
        UserSession userSession2 = userSession;
        if (obj != OriginalAudioSubtype.A06 || !182.A06(0Tu.A05, userSession, 36321395961177412L)) {
            Drawable drawable4 = drawable2;
            if (r4 == null || r4.A03 == OriginalAudioSubtype.A05) {
                spannableStringBuilder.append(r11.A03);
                if (r11.A0B) {
                    spannableStringBuilder.setSpan(new CharacterStyle(), 0, spannableStringBuilder.length(), 33);
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append(" • ");
                }
                spannableStringBuilder.append(r11.A04);
                if (r11.A07 && drawable != null) {
                    A0B(resources, drawable, spannableStringBuilder, false);
                }
                A0A(resources, drawable2, spannableStringBuilder, r11);
                return spannableStringBuilder;
            }
            A07(resources2, drawable3, drawable4, spannableStringBuilder, userSession2, r11);
            return spannableStringBuilder;
        } else if (z) {
            if (r4 == null) {
                return spannableStringBuilder;
            }
            r5.A09(resources, drawable, spannableStringBuilder, r4);
            return spannableStringBuilder;
        } else if (r4 == null || (list = (List) r4.A04) == null) {
            return spannableStringBuilder;
        } else {
            OriginalPartsAttributionModel originalPartsAttributionModel = (OriginalPartsAttributionModel) 00k.A0J(list);
            int size = list.size() - 1;
            if (originalPartsAttributionModel == null || size < 0) {
                return spannableStringBuilder;
            }
            String A04 = A04(originalPartsAttributionModel.A01, originalPartsAttributionModel.A02);
            if (A04.length() > 38) {
                StringBuilder sb = new StringBuilder();
                sb.append(A04.subSequence(0, 38));
                sb.append("…");
                A04 = sb.toString();
                0qQ.A07(A04);
            }
            if (size == 0) {
                spannableStringBuilder.append(A04);
                return spannableStringBuilder;
            }
            spannableStringBuilder.append(resources.getQuantityString(R.plurals.audio_mix_attribution_abbreviated, size, new Object[]{A04, Integer.valueOf(size)}));
            return spannableStringBuilder;
        }
    }

    public static final String A04(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        if (!(!00l.A0W(str)) || !(!00l.A0W(str2))) {
            z = false;
        }
        sb.append(str);
        if (z) {
            sb.append(" • ");
        }
        sb.append(str2);
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final void A06(Context context, Drawable drawable, AnonymousClass4Ke r3) {
        Drawable mutate;
        int A0H;
        if (r3.A09) {
            if (drawable != null && (mutate = drawable.mutate()) != null) {
                A0H = R.color.canvas_bottom_sheet_description_text_color;
            } else {
                return;
            }
        } else if (drawable != null && (mutate = drawable.mutate()) != null) {
            A0H = 2Yu.A0H(context, R.attr.igds_color_primary_text);
        } else {
            return;
        }
        mutate.setColorFilter(context.getColor(A0H), PorterDuff.Mode.SRC_IN);
    }

    public static final void A07(Resources resources, Drawable drawable, Drawable drawable2, SpannableStringBuilder spannableStringBuilder, UserSession userSession, AnonymousClass4Ke r11) {
        C376489Ie r4 = r11.A01;
        if (r4 != null) {
            spannableStringBuilder.append(r11.A03);
            if (r11.A0B) {
                spannableStringBuilder.setSpan(new CharacterStyle(), 0, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.append(r11.A04);
            if (r11.A07 && drawable != null) {
                spannableStringBuilder.append("  ");
                A08(resources, drawable, spannableStringBuilder);
                spannableStringBuilder.append(" ");
            }
            Object obj = r4.A03;
            if (obj == OriginalAudioSubtype.A06) {
                spannableStringBuilder.append(":  ");
                A00.A09(resources, drawable, spannableStringBuilder, r4);
            } else if (obj == OriginalAudioSubtype.A04) {
                List list = (List) r4.A00;
                if (!list.isEmpty() && 182.A06(0Tu.A05, userSession, 36328779009769043L)) {
                    spannableStringBuilder.append(" ");
                    int i = 2131967827;
                    if (r4.A01) {
                        i = 2131967828;
                    }
                    spannableStringBuilder.append(resources.getString(i, new Object[]{((OriginalPartsAttributionModel) 00k.A0I(list)).A02}));
                }
            }
            A0A(resources, drawable2, spannableStringBuilder, r11);
        }
    }

    public static final void A08(Resources resources, Drawable drawable, SpannableStringBuilder spannableStringBuilder) {
        C2606346l r3 = new C2606346l(drawable);
        drawable.setBounds(0, 0, resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap));
        r3.A02 = AnonymousClass05K.A01;
        int length = spannableStringBuilder.length();
        spannableStringBuilder.insert(length, "  ");
        spannableStringBuilder.setSpan(r3, length, length + 2, 33);
    }

    private final void A09(Resources resources, Drawable drawable, SpannableStringBuilder spannableStringBuilder, C376489Ie r11) {
        List list = (List) r11.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            OriginalPartsAttributionModel originalPartsAttributionModel = (OriginalPartsAttributionModel) list.get(i);
            String str = originalPartsAttributionModel.A01;
            String str2 = originalPartsAttributionModel.A02;
            boolean z = originalPartsAttributionModel.A03;
            if (i > 0) {
                spannableStringBuilder.append("  |  ");
            }
            spannableStringBuilder.append(str);
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.append(str2);
            if (z && drawable != null) {
                spannableStringBuilder.append("  ");
                A08(resources, drawable, spannableStringBuilder);
            }
        }
    }

    public static final void A0A(Resources resources, Drawable drawable, SpannableStringBuilder spannableStringBuilder, AnonymousClass4Ke r6) {
        String additionalAudioUsername;
        C67061rp r0 = r6.A02;
        if (r0 != null && (additionalAudioUsername = r0.getAdditionalAudioUsername()) != null && additionalAudioUsername.length() != 0) {
            spannableStringBuilder.append(" |");
            if (drawable != null) {
                A0B(resources, drawable, spannableStringBuilder, true);
            }
            spannableStringBuilder.append(additionalAudioUsername);
        }
    }

    public static final Drawable A00(Context context, AnonymousClass4Ke r2) {
        Drawable drawable = context.getDrawable(R.drawable.instagram_microphone_filled_12);
        A06(context, drawable, r2);
        return drawable;
    }

    public static final Drawable A01(Context context, AnonymousClass4Ke r2) {
        Drawable drawable = context.getDrawable(R.drawable.music_explicit);
        A06(context, drawable, r2);
        return drawable;
    }

    public static final void A05(Context context, Drawable drawable, SpannableStringBuilder spannableStringBuilder, AnonymousClass4Ke r6, int i) {
        drawable.setBounds(0, 0, context.getResources().getDimensionPixelSize(i), context.getResources().getDimensionPixelSize(i));
        A06(context, drawable, r6);
        C263324Kh.A02(drawable, spannableStringBuilder, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness));
    }

    public static final void A0B(Resources resources, Drawable drawable, SpannableStringBuilder spannableStringBuilder, boolean z) {
        int i = 0;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        int length = spannableStringBuilder.length();
        if (z) {
            i = dimensionPixelSize;
        }
        C263324Kh.A02(drawable, spannableStringBuilder, length, dimensionPixelSize, i);
    }
}
