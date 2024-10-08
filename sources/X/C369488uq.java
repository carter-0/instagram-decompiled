package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.8uq  reason: invalid class name and case insensitive filesystem */
public final class C369488uq extends Drawable implements C268714ds, C300645xY, C300655xZ {
    public static final List A0T;
    public static final List A0U;
    public static final Map A0V = new C41529AvX();
    public int A00;
    public Venue A01;
    public String A02;
    public String A03;
    public int[] A04;
    public int A05;
    public int A06;
    public int A07;
    public LinearGradient A08;
    public String A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Context A0H;
    public final Resources A0I;
    public final Bitmap A0J;
    public final Bitmap A0K;
    public final Canvas A0L;
    public final Paint A0M;
    public final PorterDuffXfermode A0N;
    public final Rect A0O;
    public final RectF A0P;
    public final UserSession A0Q;
    public final C391239sZ A0R;
    public final Locale A0S;

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        C391239sZ r2 = C391239sZ.DEFAULT;
        A0U = Arrays.asList(new C391239sZ[]{r2, C391239sZ.SUBTLE_REDESIGN, C391239sZ.RAINBOW_REDESIGN});
        A0T = Arrays.asList(new C391239sZ[]{C391239sZ.HERO, r2, C391239sZ.HERO_REDESIGN});
    }

    private void A00() {
        int i = this.A0E;
        int i2 = this.A0C;
        int width = i + i2 + this.A0J.getWidth() + this.A0D;
        this.A09 = this.A03;
        Paint paint = this.A0M;
        float f = this.A0A;
        paint.setTextSize(f);
        String str = this.A09;
        int length = str.length();
        Rect rect = this.A0O;
        paint.getTextBounds(str, 0, length, rect);
        int width2 = rect.width() + width;
        int i3 = this.A0B;
        if (width2 > i3) {
            float f2 = f * 0.9f;
            while (true) {
                if (f2 < 0.5f * f) {
                    TextPaint textPaint = new TextPaint(paint);
                    textPaint.density = this.A0I.getDisplayMetrics().density;
                    String charSequence = TextUtils.ellipsize(this.A03, textPaint, (float) (i3 - width), TextUtils.TruncateAt.END).toString();
                    this.A09 = charSequence;
                    paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                    break;
                }
                paint.setTextSize(f2);
                String str2 = this.A09;
                paint.getTextBounds(str2, 0, str2.length(), rect);
                if (rect.width() + width <= i3) {
                    break;
                }
                f2 -= 0.1f * f;
            }
        }
        this.A07 = Math.min(i3, rect.width() + width);
        this.A06 = Math.min(Math.abs(rect.top), (int) Math.abs(paint.getFontMetrics().ascent));
        this.A05 = (rect.height() + (i2 * 2)) - (this.A0F * 2);
    }

    public final void A02(Venue venue) {
        this.A01 = venue;
        String str = "";
        if (!C346897vw.A01(this.A0Q) || !A0U.contains(this.A0R)) {
            if (venue.A00.getName() != null) {
                str = venue.A00.getName();
            }
            this.A03 = str.toUpperCase(this.A0S);
        } else {
            if (venue.A00.getName() != null) {
                str = venue.A00.getName();
            }
            this.A03 = str;
        }
        A00();
        invalidateSelf();
    }

    public final Drawable AKn(String str) {
        UserSession userSession = this.A0Q;
        Context context = this.A0H;
        int i = this.A0B;
        int round = Math.round(this.A0A);
        int i2 = this.A0C;
        int i3 = this.A04[0];
        C369488uq r1 = new C369488uq(context, userSession, (C391239sZ) null, new int[]{i3, i3}, i, round, i2, this.A00);
        Venue venue = this.A01;
        venue.getClass();
        r1.A02(venue);
        r1.A02 = str;
        return r1;
    }

    public final C2802350v BzV() {
        Venue venue = this.A01;
        if (venue != null) {
            return new C387349m4(venue, (Integer) null);
        }
        return null;
    }

    public final String C4F() {
        return this.A02;
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.A0M;
        paint.setColor(this.A00);
        RectF rectF = this.A0P;
        rectF.set((float) getBounds().centerX(), (float) getBounds().centerY(), (float) getBounds().centerX(), (float) getBounds().centerY());
        rectF.inset((float) ((-this.A07) / 2), (float) ((-this.A05) / 2));
        float f = (float) this.A0G;
        Canvas canvas2 = canvas;
        canvas2.drawRoundRect(rectF, f, f, paint);
        paint.setColor(-1);
        paint.setShader(this.A08);
        String str = this.A09;
        int i = getBounds().left;
        Bitmap bitmap = this.A0J;
        int i2 = this.A0E;
        canvas2.drawText(str, (float) (i + bitmap.getWidth() + i2 + this.A0D), (float) (getBounds().centerY() + (this.A06 / 2)), paint);
        Bitmap bitmap2 = this.A0K;
        bitmap2.eraseColor(0);
        Canvas canvas3 = this.A0L;
        canvas3.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        paint.setXfermode(this.A0N);
        canvas3.save();
        float f2 = rectF.left + ((float) i2);
        List list = A0T;
        C391239sZ r9 = this.A0R;
        if (list.contains(r9)) {
            paint.setColor(-1);
            r9.getClass();
            paint.setShader(new LinearGradient(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight(), r9.A03, ABP.A00(), Shader.TileMode.REPEAT));
        } else {
            canvas3.translate(-f2, 0.0f);
        }
        canvas3.drawPaint(paint);
        canvas3.restore();
        paint.setXfermode((Xfermode) null);
        canvas2.drawBitmap(bitmap2, f2, (float) (getBounds().centerY() - (bitmap.getHeight() / 2)), (Paint) null);
        paint.setShader((Shader) null);
    }

    public final int getIntrinsicHeight() {
        return this.A05;
    }

    public final int getIntrinsicWidth() {
        return this.A07;
    }

    public C369488uq(Context context, UserSession userSession, C391239sZ r9, int[] iArr, int i, int i2, int i3, int i4) {
        Bitmap A002;
        int i5;
        this.A0N = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        Paint paint = new Paint(1);
        this.A0M = paint;
        this.A0O = new Rect();
        this.A0P = new RectF();
        this.A07 = -1;
        this.A05 = -1;
        this.A02 = "";
        this.A0Q = userSession;
        this.A0H = context;
        Resources resources = context.getResources();
        this.A0I = resources;
        this.A0R = r9;
        this.A00 = i4;
        this.A04 = iArr;
        if (C346897vw.A01(userSession)) {
            i2 = resources.getDimensionPixelSize(A0U.contains(r9) ? R.dimen.avatar_search_sticker_tray_text_size : R.dimen.clips_template_landing_page_template_preview_clip_index_text_size);
        }
        float f = (float) i2;
        this.A0A = f;
        paint.setTextSize(f);
        Typeface A022 = AnonymousClass0qo.A00(context).A02(0qm.A0V);
        Map map = A0V;
        if (map.containsKey(r9) && C346897vw.A01(userSession)) {
            A022 = AnonymousClass0qo.A00(context).A02(((AnonymousClass6MW) map.get(r9)).A01);
        }
        paint.setTypeface(A022);
        if (C346897vw.A01(userSession)) {
            Bitmap A003 = AnonymousClass6MX.A00(resources, R.drawable.instagram_location_pano_outline_24);
            int dimensionPixelSize = resources.getDimensionPixelSize(A0U.contains(r9) ? R.dimen.abc_select_dialog_padding_start_material : R.dimen.abc_dialog_padding_material);
            A002 = 0fO.A00(A003, dimensionPixelSize, dimensionPixelSize, true);
        } else {
            A002 = AnonymousClass6MX.A00(resources, R.drawable.instagram_location_pano_filled_24);
        }
        this.A0J = A002;
        Bitmap createBitmap = Bitmap.createBitmap(A002.getWidth(), this.A0J.getHeight(), Bitmap.Config.ARGB_8888);
        this.A0K = createBitmap;
        this.A0L = new Canvas(createBitmap);
        this.A0S = resources.getConfiguration().locale;
        this.A03 = resources.getString(2131952306);
        this.A0B = i;
        this.A0C = i3;
        int i6 = i3 / 2;
        if (C346897vw.A01(userSession)) {
            i5 = resources.getDimensionPixelSize(R.dimen.universal_location_sticker_icon_offset);
        } else {
            i5 = 0;
        }
        this.A0E = i5 + i6;
        this.A0D = i6 - resources.getDimensionPixelSize(R.dimen.universal_location_sticker_icon_offset);
        if (!C346897vw.A01(userSession) || !A0U.contains(r9)) {
            this.A0F = 0;
        } else {
            this.A0F = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        }
        this.A0G = resources.getDimensionPixelSize(C346897vw.A01(userSession) ? R.dimen.account_discovery_bottom_gap : R.dimen.abc_button_inset_vertical_material);
        A00();
    }

    public static void A01(C369488uq r9) {
        r9.A08 = new LinearGradient((float) (r9.getBounds().centerX() - (r9.A07 / 2)), 0.0f, (float) (r9.getBounds().centerX() + (r9.A07 / 2)), 0.0f, r9.A04, (float[]) null, Shader.TileMode.REPEAT);
    }

    public final void AGn(C21236XQh xQh, int i) {
        int A012 = xQh.A01(i);
        this.A04 = new int[]{A012, A012};
        A01(this);
        invalidateSelf();
        this.A00 = xQh.A00(i);
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A01(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369488uq(android.content.Context r11, com.instagram.common.session.UserSession r12, X.C391239sZ r13, int r14, int r15, int r16) {
        /*
            r10 = this;
            r4 = r13
            int[] r5 = r13.A04
            r2 = r11
            android.content.res.Resources r1 = r11.getResources()
            boolean r0 = r13.A01
            if (r0 != 0) goto L_0x0017
            r0 = 1
            r13.A01 = r0
            int r0 = r13.A02
            int r0 = r1.getColor(r0)
            r13.A00 = r0
        L_0x0017:
            int r9 = r13.A00
            r1 = r10
            r3 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369488uq.<init>(android.content.Context, com.instagram.common.session.UserSession, X.9sZ, int, int, int):void");
    }
}
