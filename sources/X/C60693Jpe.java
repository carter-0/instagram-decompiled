package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;

/* renamed from: X.Jpe  reason: case insensitive filesystem */
public final class C60693Jpe extends C249703kE {
    public float A00;
    public float A01;
    public IgImageView A02;
    public C60964JuM A03;
    public Integer A04 = A01(this);
    public final View A05;
    public final ConstraintLayout A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final IgTextView A09;
    public final IgImageView A0A;
    public final LEZ A0B;
    public final IgEditSeekBar A0C;
    public final /* synthetic */ C60407Jl0 A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60693Jpe(View view, C60407Jl0 jl0, LEZ lez) {
        super(view);
        LEZ lez2 = lez;
        0qQ.A0B(lez2, 3);
        this.A0D = jl0;
        this.A05 = view;
        this.A0B = lez2;
        this.A06 = (ConstraintLayout) view.findViewById(R.id.stacked_timeline_volume_controls_item);
        this.A08 = Dba.A0E(view, R.id.volume_control_card_title);
        this.A07 = Dba.A0E(view, R.id.volume_control_card_subtitle);
        IgImageView findViewById = view.findViewById(R.id.volume_control_card_cover_art);
        IgImageView igImageView = findViewById;
        Context A0S = AnonymousClass7TE.A0S(igImageView);
        Resources resources = igImageView.getResources();
        igImageView.setImageDrawable(new GIH(A0S, (GJO) null, resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width), AnonymousClass7TE.A0D(resources), 0, AnonymousClass7TE.A0A(A0S), 0, -1, false));
        0qQ.A07(findViewById);
        this.A02 = igImageView;
        IgImageView A0Y = JTO.A0Y(view, R.id.volume_control_card_slider_icon);
        A0Y.setContentDescription(DbS.A07(this).getText(2131955864));
        this.A0A = A0Y;
        Context A0S2 = AnonymousClass7TE.A0S(view);
        float A002 = 0nA.A00(A0S2, A0S2.getResources().getDimension(R.dimen.abc_control_corner_material));
        IgEditSeekBar igEditSeekBar = (IgEditSeekBar) view.findViewById(R.id.volume_control_card_slider);
        igEditSeekBar.setSeekBarHeight(A002);
        Context context = igEditSeekBar.getContext();
        igEditSeekBar.setActiveColor(context.getColor(2Yu.A0A(context)));
        igEditSeekBar.setInactiveColor(AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_grey_08));
        igEditSeekBar.A04 = false;
        this.A0C = igEditSeekBar;
        this.A09 = JTO.A0X(view, R.id.volume_control_card_slider_value);
    }

    public static final Integer A00(C60693Jpe jpe) {
        L0W l0w;
        C60964JuM juM = jpe.A03;
        if (juM != null) {
            l0w = juM.A03;
        } else {
            l0w = null;
        }
        if (l0w instanceof C61793KMh) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A00;
    }

    public static final Integer A01(C60693Jpe jpe) {
        L0W l0w;
        C60964JuM juM = jpe.A03;
        if (juM != null) {
            l0w = juM.A03;
        } else {
            l0w = null;
        }
        if (l0w instanceof C61793KMh) {
            return AnonymousClass05K.A0N;
        }
        return AnonymousClass05K.A01;
    }

    public static final void A02(C60693Jpe jpe, int i) {
        Integer A012;
        Integer num = jpe.A04;
        if (i == 0) {
            if (num == A01(jpe)) {
                A012 = A00(jpe);
            } else {
                return;
            }
        } else if (num == A00(jpe)) {
            A012 = A01(jpe);
        } else {
            return;
        }
        A04(jpe, A012);
    }

    public static final void A03(C60693Jpe jpe, L0W l0w, float f) {
        String valueOf;
        IgEditSeekBar igEditSeekBar = jpe.A0C;
        igEditSeekBar.setVisibility(0);
        float f2 = f * 100.0f;
        igEditSeekBar.setCurrentValue(AnonymousClass1GB.A01(f2));
        jpe.A09.setText(String.valueOf(AnonymousClass1GB.A01(f2)));
        int i = (int) f2;
        String valueOf2 = String.valueOf(i);
        boolean z = l0w instanceof C61789KMd;
        View view = jpe.itemView;
        if (z) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            Context context = jpe.A0D.A03;
            A1A.append(context.getText(2131955865));
            A1A.append(' ');
            A1A.append(jpe.A08.getText());
            A1A.append(" \n ");
            A1A.append(context.getText(2131955862));
            A1A.append(' ');
            valueOf = AnonymousClass7TF.A0i(jpe.A07.getText(), A1A);
        } else {
            valueOf = String.valueOf(jpe.A08.getText());
        }
        view.setContentDescription(valueOf);
        View view2 = jpe.itemView;
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        CharSequence contentDescription = view2.getContentDescription();
        DbS.A1Y(contentDescription);
        A1A2.append((String) contentDescription);
        A1A2.append("\n ");
        A1A2.append(jpe.A0D.A03.getText(2131955863));
        A1A2.append(' ');
        view2.setContentDescription(AnonymousClass7TF.A0l(valueOf2, A1A2));
        A02(jpe, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r5 == 1) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C60693Jpe r6, java.lang.Integer r7) {
        /*
            r6.A04 = r7
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r6.A0A
            int r5 = r7.intValue()
            r0 = 3
            if (r5 == r0) goto L_0x0050
            r0 = 2
            if (r5 == r0) goto L_0x0050
            r1 = 1
            r0 = 2131239001(0x7f082059, float:1.8094297E38)
            if (r5 == r1) goto L_0x0017
            r0 = 2131238997(0x7f082055, float:1.8094288E38)
        L_0x0017:
            r4.setImageResource(r0)
            android.view.View r0 = r6.A05
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r0)
            r2 = 1
            r1 = 3
            if (r5 == r1) goto L_0x0029
            r0 = 2130970185(0x7f040649, float:1.7549073E38)
            if (r5 != r2) goto L_0x002c
        L_0x0029:
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
        L_0x002c:
            int r0 = X.2Yu.A0H(r3, r0)
            X.DbU.A14(r3, r4, r0)
            if (r5 == r1) goto L_0x004c
            r0 = 2
            if (r5 == r0) goto L_0x0048
            r0 = 2131955864(0x7f131098, float:1.9548268E38)
            if (r5 == r2) goto L_0x0040
            r0 = 2131955866(0x7f13109a, float:1.9548272E38)
        L_0x0040:
            java.lang.CharSequence r0 = r3.getText(r0)
            r4.setContentDescription(r0)
            return
        L_0x0048:
            r0 = 2131955858(0x7f131092, float:1.9548255E38)
            goto L_0x0040
        L_0x004c:
            r0 = 2131955857(0x7f131091, float:1.9548253E38)
            goto L_0x0040
        L_0x0050:
            r0 = 2131238989(0x7f08204d, float:1.8094272E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60693Jpe.A04(X.Jpe, java.lang.Integer):void");
    }
}
