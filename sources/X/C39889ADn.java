package X;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;
import java.util.List;

/* renamed from: X.ADn  reason: case insensitive filesystem */
public final class C39889ADn {
    public float A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public Editable A04;
    public Layout.Alignment A05;
    public AnonymousClass87I A06;
    public C358868bb A07;
    public C369458un A08;
    public String A09;
    public List A0A;
    public boolean A0B = false;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E = true;
    public boolean A0F = true;

    public static C353818Jf A00(Context context) {
        C353818Jf r1 = new C353818Jf();
        r1.A02 = context.getColor(R.color.design_dark_default_color_on_background);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.802, java.lang.Object] */
    public final AnonymousClass802 A01() {
        Editable editable = this.A04;
        Layout.Alignment alignment = this.A05;
        float f = this.A00;
        C369458un r14 = this.A08;
        C358868bb r13 = this.A07;
        List list = this.A0A;
        boolean z = this.A0E;
        int i = this.A01;
        int i2 = this.A03;
        int i3 = this.A02;
        AnonymousClass87I r7 = this.A06;
        String str = this.A09;
        boolean z2 = this.A0D;
        boolean z3 = this.A0F;
        boolean z4 = this.A0C;
        boolean z5 = this.A0B;
        ? obj = new Object();
        obj.A04 = editable;
        obj.A05 = alignment;
        obj.A00 = f;
        obj.A08 = r14;
        obj.A07 = r13;
        obj.A0A = list;
        obj.A0E = z;
        obj.A01 = i;
        obj.A03 = i2;
        obj.A02 = i3;
        obj.A06 = r7;
        obj.A09 = str;
        obj.A0D = z2;
        obj.A0F = z3;
        obj.A0C = z4;
        obj.A0B = z5;
        return obj;
    }

    public C39889ADn(Context context) {
        C353818Jf A002 = A00(context);
        C353818Jf.A01(context, A002, R.color.activator_card_progress_bad, context.getColor(R.color.purple_4));
        TextColorScheme A003 = C353818Jf.A00(context, A002, R.color.clips_gradient_redesign_color_4);
        C353818Jf A004 = A00(context);
        C353818Jf.A01(context, A004, R.color.blue_4, context.getColor(R.color.purple_4));
        TextColorScheme A005 = C353818Jf.A00(context, A004, R.color.netego_su_background_gradient_end_4);
        C353818Jf A006 = A00(context);
        C353818Jf.A01(context, A006, R.color.igds_gradient_cyan, context.getColor(R.color.igds_active_badge));
        TextColorScheme A007 = C353818Jf.A00(context, A006, R.color.clips_gradient_redesign_color_2);
        C353818Jf A008 = A00(context);
        C353818Jf.A01(context, A008, 2Yu.A0H(context, R.attr.igds_color_gradient_yellow), AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_red));
        TextColorScheme A009 = C353818Jf.A00(context, A008, R.color.badge_color);
        C353818Jf A0010 = A00(context);
        C353818Jf.A01(context, A0010, R.color.red_4, context.getColor(R.color.purple_4));
        TextColorScheme A0011 = C353818Jf.A00(context, A0010, R.color.netego_su_background_gradient_end_4);
        C353818Jf A0012 = A00(context);
        A0012.A02(AnonymousClass5BH.A00);
        TextColorScheme A0013 = C353818Jf.A00(context, A0012, R.color.clips_gradient_redesign_color_2);
        C353818Jf A0014 = A00(context);
        C353818Jf.A01(context, A0014, R.color.grey_9, context.getColor(R.color.grey_9));
        TextColorScheme A0015 = C353818Jf.A00(context, A0014, R.color.red_5);
        C353818Jf r3 = new C353818Jf();
        r3.A02 = context.getColor(R.color.grey_9);
        r3.A04 = new TextColors(TextShadow.A03, context.getColor(R.color.grey_9_50_transparent));
        C353818Jf.A01(context, r3, R.color.baseline_neutral_80, context.getColor(R.color.baseline_neutral_80));
        this.A0A = C256393vh.A01(A003, A005, A007, A009, A0011, A0013, A0015, C353818Jf.A00(context, r3, R.color.red_5));
    }
}
