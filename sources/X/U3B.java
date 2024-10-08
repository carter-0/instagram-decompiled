package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.instagram.android.R;

public final class U3B extends View {
    public float A00;
    public int A01;
    public int A02;
    public float[] A03;
    public String[] A04;
    public float[] A05;
    public String[] A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Paint A0A;
    public final Path A0B = new Path();
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Paint A0F;
    public final Paint A0G;

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        float[] fArr = this.A03;
        String str = "yMarksPositions";
        if (fArr != null) {
            int length = fArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    String[] strArr = this.A06;
                    if (strArr != null) {
                        String str2 = strArr[i2];
                        float f = (float) this.A0E;
                        float[] fArr2 = this.A03;
                        if (fArr2 == null) {
                            break;
                        }
                        canvas.drawText(str2, f, fArr2[i2] + 10.0f, this.A0G);
                        i2++;
                    } else {
                        str = "yMarks";
                        break;
                    }
                } else {
                    canvas.drawPath(this.A0B, this.A0F);
                    int length2 = getXMarksPositions().length;
                    while (i < length2) {
                        String[] strArr2 = this.A04;
                        if (strArr2 == null) {
                            str = "xMarks";
                        } else {
                            canvas.drawText(strArr2[i], getXMarksPositions()[i] + ((float) (this.A0C / 2)), this.A00, this.A0A);
                            i++;
                        }
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setRulersAndMarks(VRU vru) {
        0qQ.A0B(vru, 0);
        String[] strArr = vru.A01;
        this.A06 = strArr;
        String[] strArr2 = vru.A00;
        this.A04 = strArr2;
        this.A03 = new float[strArr.length];
        this.A05 = new float[strArr2.length];
    }

    public final float[] getXMarksPositions() {
        float[] fArr = this.A05;
        if (fArr != null) {
            return fArr;
        }
        0qQ.A0F("xMarksPositions");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        int i4;
        super.onMeasure(i, i2);
        int i5 = this.A07;
        this.A01 = (getMeasuredHeight() - this.A0D) - i5;
        this.A02 = getMeasuredWidth() - this.A0C;
        Path path = this.A0B;
        path.reset();
        float[] fArr = this.A03;
        String str = "yMarksPositions";
        if (fArr != null) {
            int length = fArr.length;
            float f2 = ((float) this.A01) * 1.0f;
            if (length > 1) {
                float f3 = f2 / ((float) (length - 1));
                int i6 = 0;
                while (true) {
                    i4 = this.A09;
                    float f4 = ((float) i4) + (((float) i6) * f3);
                    float[] fArr2 = this.A03;
                    if (fArr2 == null) {
                        break;
                    }
                    fArr2[i6] = f4;
                    i3 = this.A08;
                    f = (float) i3;
                    path.moveTo(f, f4);
                    path.lineTo((float) this.A02, f4);
                    i6++;
                    if (i6 >= length) {
                        break;
                    }
                }
            } else {
                i4 = this.A09;
                float f5 = ((float) i4) + (f2 / 2.0f);
                fArr[0] = f5;
                i3 = this.A08;
                f = (float) i3;
                path.moveTo(f, f5);
                float f6 = (float) this.A02;
                float[] fArr3 = this.A03;
                if (fArr3 != null) {
                    path.lineTo(f6, fArr3[0]);
                }
            }
            this.A00 = ((float) ((this.A01 + i5) + i4)) - this.A0A.descent();
            float f7 = 0.0f;
            String[] strArr = this.A04;
            str = "xMarks";
            if (strArr != null) {
                for (String length2 : strArr) {
                    f7 += (float) length2.length();
                }
                float f8 = ((((float) (this.A02 - i3)) - f7) * 1.0f) / ((float) (r3 - 1));
                for (int i7 = 0; i7 < r3; i7++) {
                    getXMarksPositions()[i7] = (((float) i7) * f8) + f;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public U3B(Context context, boolean z) {
        super(context);
        Paint paint = new Paint();
        this.A0G = paint;
        Paint paint2 = new Paint();
        this.A0A = paint2;
        Paint paint3 = new Paint();
        this.A0F = paint3;
        C13988Tno.A0u(context.getResources(), paint3, R.dimen.ads_disclosure_footer_top_divider_height);
        AnonymousClass7TE.A1N(context, paint3, 2Yu.A0H(context, R.attr.igds_color_separator));
        JTO.A1N(paint3);
        AnonymousClass7TE.A1N(context, paint, 2Yu.A08(context));
        C13988Tno.A0t(context.getResources(), paint, R.dimen.button_text_size);
        paint.setTextAlign(Paint.Align.RIGHT);
        AnonymousClass7TE.A1N(context, paint2, 2Yu.A08(context));
        paint2.setTextSize((float) AnonymousClass7TF.A02(context, R.dimen.button_text_size));
        paint2.setTextAlign(Paint.Align.CENTER);
        Context context2 = getContext();
        int A072 = JTR.A07(context2);
        this.A08 = A072;
        this.A0E = A072 - DbY.A01(context2);
        int A082 = C51972G9s.A08(context2);
        this.A0D = A082;
        this.A09 = A082;
        this.A07 = AnonymousClass7TG.A06(context2);
        this.A0C = context.getResources().getDimensionPixelSize(z ? R.dimen.ai_agent_share_profile_sticker_padding : R.dimen.account_discovery_bottom_gap);
    }
}
