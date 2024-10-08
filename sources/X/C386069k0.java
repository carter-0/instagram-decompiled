package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import java.util.List;

/* renamed from: X.9k0  reason: invalid class name and case insensitive filesystem */
public final class C386069k0 extends C268694dq implements B1L, C41796B1b {
    public int A00;
    public Drawable A01;
    public final int A02;
    public final Context A03;
    public final C389759q9 A04;
    public final Float A05;
    public final QuestionResponseReshareModel A06;

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A01, this.A04});
    }

    public final int A08() {
        QuestionMediaResponseModel questionMediaResponseModel = this.A06.A04;
        if (questionMediaResponseModel != null) {
            Integer num = questionMediaResponseModel.A04;
            if (num != null) {
                return num.intValue();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final Drawable Aco() {
        return this.A01;
    }

    public final A7J Bik() {
        return this.A06.A02;
    }

    public final int getIntrinsicHeight() {
        int i;
        Drawable drawable = this.A01;
        if (drawable != null) {
            i = drawable.getIntrinsicHeight();
        } else {
            i = 0;
        }
        return i + this.A04.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public C386069k0(Context context, Drawable drawable, ImageUrl imageUrl, QuestionResponseReshareModel questionResponseReshareModel, C389759q9 r8, Float f, int i, int i2) {
        this.A03 = context;
        this.A01 = drawable;
        this.A04 = r8;
        this.A06 = questionResponseReshareModel;
        this.A02 = i;
        this.A00 = i2;
        this.A05 = f;
        if (imageUrl != null) {
            1OO A0J = 1NK.A00().A0J(imageUrl, (String) null);
            A0J.A02(new C40250AXo(this, 1));
            A0J.A01();
        }
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        AnonymousClass7TF.A13(canvas, AnonymousClass7TE.A0X(this));
        C389759q9 r0 = this.A04;
        r0.draw(canvas);
        canvas.translate(0.0f, (float) r0.A01);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
