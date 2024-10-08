package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.GMp  reason: case insensitive filesystem */
public final class C52299GMp extends C251343mx {
    public final AnonymousClass3W1 A00;
    public final C52171GHn A01;
    public final JR2 A02;
    public final long A03;
    public final long A04;

    public final C251263mp A0X(AnonymousClass3Y5 r12) {
        0qQ.A0B(r12, 0);
        Float A0h = C51967G9n.A0h();
        2V5 A002 = C247343gB.A00(r12, A0h);
        2V5 A003 = C247343gB.A00(r12, A0h);
        2V5 A004 = C247343gB.A00(r12, A0h);
        Object A005 = AnonymousClass3Zw.A00(r12, new C58194Iny(1, A002, A003, A004), new Object[0]);
        C243773a4.A00(r12, C58692Iw1.A00(A005, this, 5), C51970G9q.A1b());
        Drawable A0K = C51968G9o.A0K(r12, R.drawable.instagram_save_filled_44);
        C51973G9u.A0x(A0K, r12, 2Yu.A0H(r12.A05.A0C, R.attr.igds_color_primary_button_on_media));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, A0K);
        stateListDrawable.addState(new int[]{16842913}, A0K);
        stateListDrawable.addState(new int[0], C244013aV.A0D(r12, R.drawable.instagram_save_outline_44));
        AnonymousClass3XV r0 = 2WX.A02;
        long j = this.A03;
        Integer num = AnonymousClass05K.A00;
        2WX A006 = AnonymousClass9JR.A00(C51974G9v.A0M((2WX) null, num, 0, j), AnonymousClass05K.A0A, 0, this.A04);
        Integer num2 = AnonymousClass05K.A1F;
        return new GH5(stateListDrawable, ImageView.ScaleType.FIT_CENTER, C51971G9r.A0Z(C51971G9r.A0Y(C51971G9r.A0Y(C51971G9r.A0Y(C51973G9u.A0U(C51974G9v.A0J(C51971G9r.A0W(A004, C51974G9v.A0A(A003, A006, new AnonymousClass9JS(A002, num2)), num), C51965G9l.A0d(AnonymousClass05K.A06, Boolean.valueOf(this.A01.A02), 4), num), r12, 2131972502), AnonymousClass05K.A08, "save_button", 4), num2, J6Q.A00(r12, this, 6), 4), AnonymousClass05K.A03, J6J.A00(this, 16), 4), AnonymousClass05K.A0Y, J6J.A00(this, 17), (String) null), false);
    }

    public C52299GMp(AnonymousClass3W1 r1, C52171GHn gHn, JR2 jr2, long j, long j2) {
        AnonymousClass7TG.A1Q(gHn, jr2);
        this.A00 = r1;
        this.A01 = gHn;
        this.A02 = jr2;
        this.A03 = j;
        this.A04 = j2;
    }
}
