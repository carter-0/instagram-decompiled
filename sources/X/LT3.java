package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.ui.widget.qrcode.AutosizingGradientTextView;
import java.util.Iterator;
import kotlin.enums.EnumEntries;

public final class LT3 {
    public View A00;
    public AutosizingGradientTextView A01;
    public AutosizingGradientTextView A02;
    public C62588KiL A03;
    public final Context A04;
    public final Typeface A05;
    public final AnonymousClass0iw A06;
    public final 0wc A07;
    public final ImageUrl A08;
    public final C70448O6z A09;
    public final MT4 A0A;
    public final U16 A0B;
    public final CharSequence A0C;
    public final CharSequence A0D;
    public final Long A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final int A0J;
    public final boolean A0K;

    public LT3(Context context, AnonymousClass0iw r15, UserSession userSession, ImageUrl imageUrl, C70448O6z o6z, MT4 mt4, CharSequence charSequence, CharSequence charSequence2, String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str;
        UserSession userSession2 = userSession;
        char A1Y = DbW.A1Y(userSession2);
        this.A04 = context;
        this.A07 = AnonymousClass0kN.A01(r15, userSession2);
        this.A06 = r15;
        str2 = str2 == null ? "0" : str2;
        Long A0m = C51971G9r.A0m();
        boolean z3 = true;
        try {
            A0m = AnonymousClass7TE.A10(str2);
        } catch (NumberFormatException e) {
            0KC.A0L("QRCodeDialogController", "failed to parse entity id: %s", e, new Object[]{str2});
        }
        this.A0E = A0m;
        this.A0G = str3;
        this.A08 = imageUrl;
        this.A0D = charSequence;
        this.A0C = charSequence2;
        this.A03 = C62588KiL.DEFAULT;
        int A012 = AnonymousClass1GB.A01(0nA.A04(context, 200));
        this.A0J = A012;
        Rect rect = new Rect(0, 0, A012, A012);
        this.A05 = AnonymousClass7TG.A0O(this.A04);
        this.A0I = z;
        this.A0K = z2;
        this.A0A = mt4;
        this.A09 = o6z;
        this.A0H = imageUrl == null ? false : z3;
        try {
            Uri parse = Uri.parse(str4);
            Uri.Builder builder = new Uri.Builder();
            Iterator it = JTT.A0u(builder, parse).iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                builder.appendQueryParameter(A18, parse.getQueryParameter(A18));
            }
            str4 = builder.build().toString();
        } catch (RuntimeException unused) {
            0wb.A03("QRCodeDialogParseError", 002.A0R("failed url: ", str4));
        }
        this.A0F = str4;
        Integer num = AnonymousClass05K.A01;
        int i = this.A0J;
        int[] iArr = this.A03.A02;
        float f = (float) i;
        LinearGradient linearGradient = new LinearGradient(0.0f, f, f, 0.0f, iArr[0], iArr[A1Y], Shader.TileMode.CLAMP);
        U16 u16 = new U16();
        u16.invalidateSelf();
        u16.A01 = num;
        U16.A00(u16);
        u16.A07.setShader(linearGradient);
        u16.invalidateSelf();
        u16.setBounds(rect);
        u16.A02 = str4;
        U16.A00(u16);
        this.A0B = u16;
    }

    public static final Bitmap A00(LT3 lt3) {
        View view = lt3.A00;
        if (view == null) {
            return null;
        }
        boolean z = lt3.A0H;
        int i = R.id.qr_code_background;
        if (z) {
            i = R.id.qr_code_layout;
        }
        View A0G2 = AnonymousClass7TF.A0G(view, i);
        Bitmap A0B2 = AnonymousClass7TF.A0B(A0G2.getWidth(), A0G2.getHeight());
        Canvas A0B3 = JTO.A0B(A0B2);
        A0B3.translate(-((float) A0G2.getLeft()), -((float) A0G2.getTop()));
        if (z) {
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.message);
            CharSequence text = A0R.getText();
            int currentTextColor = A0R.getCurrentTextColor();
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, lt3.A03.A02);
            gradientDrawable.setDither(true);
            A0G2.setBackgroundDrawable(gradientDrawable);
            EnumEntries<C62588KiL> enumEntries = C62588KiL.A03;
            for (C62588KiL kiL : enumEntries) {
                AnonymousClass7TH.A0R(view.requireViewById(kiL.A01));
            }
            A0R.setText(2131971007);
            A0R.setTextColor(-1);
            A0G2.draw(A0B3);
            A0G2.setBackgroundDrawable((Drawable) null);
            for (C62588KiL kiL2 : enumEntries) {
                View requireViewById = view.requireViewById(kiL2.A01);
                if (requireViewById != null) {
                    requireViewById.setVisibility(0);
                }
            }
            A0R.setText(text);
            A0R.setTextColor(currentTextColor);
            return A0B2;
        }
        A0G2.setVisibility(4);
        view.draw(A0B3);
        A0G2.setVisibility(0);
        return A0B2;
    }

    public static final void A01(View view, C62588KiL kiL, LT3 lt3) {
        lt3.A03 = kiL;
        for (C62588KiL kiL2 : C62588KiL.A03) {
            View requireViewById = view.requireViewById(kiL2.A01);
            if (requireViewById != null) {
                requireViewById.setSelected(AnonymousClass7TF.A1W(kiL2, lt3.A03));
            }
        }
        int[] iArr = kiL.A02;
        U16 u16 = lt3.A0B;
        float f = (float) lt3.A0J;
        u16.A07.setShader(new LinearGradient(0.0f, f, f, 0.0f, iArr[0], iArr[1], Shader.TileMode.CLAMP));
        u16.invalidateSelf();
        AutosizingGradientTextView autosizingGradientTextView = lt3.A02;
        if (autosizingGradientTextView != null && !lt3.A0H) {
            autosizingGradientTextView.setGradient(iArr);
        }
        AutosizingGradientTextView autosizingGradientTextView2 = lt3.A01;
        if (autosizingGradientTextView2 != null && !lt3.A0H) {
            autosizingGradientTextView2.setGradient(iArr);
        }
    }

    public static final void A02(LT3 lt3) {
        if (Build.VERSION.SDK_INT < 33) {
            Context context = lt3.A04;
            if (!1DL.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C64729Lh6 lh6 = new C64729Lh6(10, new C66069MAc(lt3, 6), lt3);
                if (context instanceof Activity) {
                    JTP.A11((Activity) context, lh6, "android.permission.WRITE_EXTERNAL_STORAGE");
                    return;
                }
                return;
            }
        }
        Bitmap A002 = A00(lt3);
        if (A002 != null) {
            C290815g0 A003 = MB7.A00(A002, lt3, 27);
            KH1.A01(A003, lt3, 20);
            1ES.A03(A003);
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [android.widget.TextView, android.view.View, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    /* JADX WARNING: type inference failed for: r1v11, types: [android.widget.TextView, android.view.View, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    /* JADX WARNING: type inference failed for: r0v24, types: [android.widget.TextView, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    /* JADX WARNING: type inference failed for: r0v25, types: [android.view.View, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    /* JADX WARNING: type inference failed for: r0v36, types: [android.widget.TextView, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    /* JADX WARNING: type inference failed for: r0v37, types: [android.view.View, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    /* JADX WARNING: type inference failed for: r0v43, types: [android.widget.TextView, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    /* JADX WARNING: type inference failed for: r1v18, types: [android.widget.TextView, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    public final void A04() {
        int i;
        int i2;
        String str;
        ImageUrl imageUrl;
        0Aj A0e = AnonymousClass7TE.A0e(this.A07, "ig_qr_code_impression");
        Long l = this.A0E;
        if (l != null && A0e.isSampled()) {
            long longValue = l.longValue();
            if (this.A0I) {
                longValue = 0;
            }
            A0e.A9F("entity_id", Long.valueOf(longValue));
            A0e.AAJ("source", this.A06.getModuleName());
            A0e.Cgf();
        }
        boolean z = this.A0H;
        int i3 = R.layout.qr_code_dialog_header_layout;
        if (z) {
            i3 = R.layout.qr_code_dialog_bc_header_layout;
        }
        Context context = this.A04;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) null);
        this.A00 = inflate;
        if (inflate != null) {
            TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.message);
            String str2 = this.A0G;
            if (str2 != null) {
                A0R.setText(str2);
                A0R.setVisibility(0);
            } else {
                A0R.setVisibility(8);
            }
            DbX.A0J(inflate, R.id.qr_code).setImageDrawable(this.A0B);
            AvatarView avatarView = (AvatarView) inflate.findViewById(R.id.avatar);
            if (!(avatarView == null || (imageUrl = this.A08) == null)) {
                avatarView.setAvatarUrl(imageUrl);
                avatarView.setStrokeWidth(AnonymousClass7TE.A0H(context.getResources()));
                avatarView.setStrokeColor(AnonymousClass7TE.A0A(context));
            }
            for (C62588KiL kiL : C62588KiL.A03) {
                ImageView A0F2 = DbU.A0F(inflate, kiL.A01);
                C59982Jcr jcr = new C59982Jcr(inflate.getContext());
                jcr.A00 = kiL.A02;
                jcr.invalidateSelf();
                if (A0F2 != null) {
                    A0F2.setImageDrawable(jcr);
                    Resources resources = A0F2.getResources();
                    if (resources != null) {
                        str = resources.getString(kiL.A00);
                    } else {
                        str = null;
                    }
                    A0F2.setContentDescription(str);
                    LYA.A01(A0F2, kiL, inflate, this, 38);
                }
            }
            ? r1 = (AutosizingGradientTextView) inflate.requireViewById(R.id.title);
            this.A02 = r1;
            CharSequence charSequence = this.A0D;
            int i4 = 14;
            if (charSequence != null) {
                if (z) {
                    Drawable drawable = context.getDrawable(R.drawable.instagram_channels_broadcast_pano_filled_24);
                    int A012 = AnonymousClass7TH.A01(context);
                    if (drawable != null) {
                        drawable.setBounds(0, 0, A012, A012);
                    }
                    ? r0 = this.A02;
                    if (r0 != 0) {
                        r0.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    ? r12 = this.A02;
                    if (r12 != 0) {
                        r12.setCompoundDrawablePadding(AnonymousClass7TG.A03(context));
                    }
                    i2 = 16;
                } else {
                    if (r1 != 0) {
                        r1.setTypeface(this.A05);
                    }
                    AutosizingGradientTextView autosizingGradientTextView = this.A02;
                    if (autosizingGradientTextView != null) {
                        autosizingGradientTextView.setGradient(this.A03.A02);
                    }
                    i2 = 40;
                }
                AutosizingGradientTextView autosizingGradientTextView2 = this.A02;
                if (autosizingGradientTextView2 != null) {
                    int A013 = AnonymousClass1GB.A01(0nA.A04(context, 14));
                    int A014 = AnonymousClass1GB.A01(0nA.A04(context, i2));
                    autosizingGradientTextView2.A01 = A013;
                    autosizingGradientTextView2.A00 = A014;
                }
                ? r02 = this.A02;
                if (r02 != 0) {
                    r02.setText(charSequence);
                }
                ? r03 = this.A02;
                if (r03 != 0) {
                    r03.setVisibility(0);
                }
            } else if (r1 != 0) {
                r1.setVisibility(8);
            }
            ? r13 = (AutosizingGradientTextView) inflate.requireViewById(R.id.subtitle);
            this.A01 = r13;
            CharSequence charSequence2 = this.A0C;
            if (charSequence2 != null) {
                if (!z) {
                    if (r13 != 0) {
                        r13.setTypeface(this.A05);
                    }
                    AutosizingGradientTextView autosizingGradientTextView3 = this.A01;
                    if (autosizingGradientTextView3 != null) {
                        autosizingGradientTextView3.setGradient(this.A03.A02);
                    }
                    i = 14;
                    i4 = 20;
                } else {
                    i = 10;
                }
                AutosizingGradientTextView autosizingGradientTextView4 = this.A01;
                if (autosizingGradientTextView4 != null) {
                    int A015 = AnonymousClass1GB.A01(0nA.A04(context, i));
                    int A016 = AnonymousClass1GB.A01(0nA.A04(context, i4));
                    autosizingGradientTextView4.A01 = A015;
                    autosizingGradientTextView4.A00 = A016;
                }
                ? r04 = this.A01;
                if (r04 != 0) {
                    r04.setText(charSequence2);
                }
                ? r05 = this.A01;
                if (r05 != 0) {
                    r05.setVisibility(0);
                }
            } else if (r13 != 0) {
                r13.setVisibility(8);
            }
            A01(inflate, C62588KiL.DEFAULT, this);
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A0k(inflate);
            A0Y.A09 = true;
            A0Y.A0s(true);
            LV2 A002 = LV2.A00(this, 44);
            LV2 A003 = LV2.A00(this, 43);
            LV2 A004 = LV2.A00(this, 42);
            if (this.A0K) {
                A0Y.A0I(A002, 2131971009);
                A0Y.A0G(A003, 2131971006);
                A0Y.A0H(A004, 2131960992);
            } else {
                A0Y.A0I(A003, 2131971006);
                A0Y.A0G(A004, 2131960992);
            }
            DbT.A1V(A0Y);
        }
    }

    public static final void A03(LT3 lt3) {
        Bitmap A002 = A00(lt3);
        if (A002 != null) {
            boolean A1P = JTQ.A1P(Build.VERSION.SDK_INT, 30);
            C290815g0 r1 = new C290815g0(new C41356Asd(1, A002, lt3, A1P), 759274554);
            r1.A00 = new NQP(lt3, A1P);
            1ES.A06(r1, 759274554, false);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LT3(android.content.Context r15, X.AnonymousClass0iw r16, com.instagram.common.session.UserSession r17, X.MT4 r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            r14 = this;
            r1 = r15
            r2 = r16
            r3 = r17
            r9 = r19
            X.C51974G9v.A1P(r15, r3, r2, r9)
            r4 = 0
            r13 = 0
            r0 = r14
            r6 = r18
            r10 = r20
            r11 = r21
            r7 = r22
            r8 = r23
            r12 = r24
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LT3.<init>(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.MT4, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
