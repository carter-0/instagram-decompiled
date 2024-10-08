package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class KI2 extends IgImageView {
    /* JADX WARNING: type inference failed for: r5v0, types: [X.KI2, android.view.View] */
    private final Path getCirclePath() {
        Path A0C = C51965G9l.A0C();
        float A01 = (AnonymousClass7TE.A01(DbU.A05(this), R.dimen.asset_picker_redesign_sticker_height) * getCurrentScale()) / 2.0f;
        A0C.addCircle(AnonymousClass7TE.A02(this) / 2.0f, AnonymousClass7TE.A03(this) - A01, A01, Path.Direction.CW);
        return A0C;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.KI2, android.view.View] */
    private final float getCurrentScale() {
        return AnonymousClass7TE.A02(this) / AnonymousClass7TE.A01(DbU.A05(this), R.dimen.abc_list_item_height_material);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.KI2, android.view.View] */
    private final Path getCustomMaskPath() {
        Path A0C = C51965G9l.A0C();
        Context context = getContext();
        float A09 = (((float) JTR.A09(context)) * getCurrentScale()) / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        A0C.addCircle(AnonymousClass7TE.A02(this) / 2.0f, AnonymousClass7TE.A03(this) - A09, A09, direction);
        float A01 = AnonymousClass7TE.A01(context.getResources(), R.dimen.abc_star_medium) * getCurrentScale();
        float[] fArr = new float[8];
        fArr[0] = A01;
        fArr[1] = A01;
        fArr[2] = A01;
        fArr[3] = A01;
        fArr[4] = 0.0f;
        C51975G9x.A1L(fArr, 0.0f);
        A0C.addRoundRect(0.0f, 0.0f, AnonymousClass7TE.A02(this), (AnonymousClass7TE.A03(this) / 2.0f) + (AnonymousClass7TE.A01(context.getResources(), R.dimen.abc_edit_text_inset_bottom_material) * getCurrentScale()), fArr, direction);
        A0C.addRect(AnonymousClass7TE.A02(this) / 2.0f, AnonymousClass7TE.A03(this) / 2.0f, AnonymousClass7TE.A02(this), (AnonymousClass7TE.A01(context.getResources(), R.dimen.abc_dialog_padding_top_material) * getCurrentScale()) + (AnonymousClass7TE.A03(this) / 2.0f), direction);
        return A0C;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.KI2, android.view.View] */
    public final void draw(Canvas canvas) {
        int A0D = AnonymousClass7TG.A0D(canvas, 294486286);
        Path circlePath = getCirclePath();
        Paint A0C = JTO.A0C();
        Context context = getContext();
        AnonymousClass7TE.A1N(context, A0C, R.color.igds_prism_black_alpha_15);
        canvas.drawPath(circlePath, A0C);
        canvas.clipPath(getCustomMaskPath());
        canvas.save();
        canvas.translate(((float) AnonymousClass7TG.A04(context)) * getCurrentScale(), 0.0f);
        KI2.super.draw(canvas);
        AnonymousClass0fD.A0A(246152390, A0D);
    }
}
