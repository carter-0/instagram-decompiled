package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.2uI  reason: invalid class name and case insensitive filesystem */
public final class C232712uI {
    public C246923fS A00;
    public AnonymousClass4Jd A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final C231672s5 A08 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2s5, java.lang.Object] */
    public C232712uI(Context context) {
        int i;
        this.A07 = context;
        this.A02 = 2Yu.A0F(context, R.attr.textColorLocation);
        try {
            i = context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_text));
        } catch (Resources.NotFoundException e) {
            2Yn.A03(this.A07, e);
            context.getTheme().applyStyle(2Yn.A00(), true);
            i = context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_text));
        }
        this.A06 = i;
        Resources resources = context.getResources();
        this.A04 = resources.getDimensionPixelSize(R.dimen.container_height);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        this.A05 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
    }
}
