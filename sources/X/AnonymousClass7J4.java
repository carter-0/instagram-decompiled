package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.7J4  reason: invalid class name */
public final class AnonymousClass7J4 implements C329327Il {
    public int A00;
    public int A01;
    public final Activity A02;
    public final UserSession A03;
    public final C329357Io A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C377229La(this, 23));
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final AnonymousClass7IM A0H;

    public final void ErS(AnonymousClass7JU r3, AnonymousClass7JT r4, 0sP r5, boolean z) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        View A002 = A00(r3, r4, z);
        if (A002 != null) {
            AnonymousClass0fU.A00(new C39987AMt(r5), A002);
        }
    }

    public final void FLI(AnonymousClass7JT r8, 0sP r9, boolean z) {
        ColorFilterAlphaImageView colorFilterAlphaImageView;
        int i = 0;
        0qQ.A0B(r8, 0);
        C252063oV r1 = (C252063oV) this.A09.getValue();
        View view = null;
        if (r1 != null) {
            view = null;
            if (r1.CVM() || z) {
                view = r1.getView();
            }
        }
        if ((view instanceof ColorFilterAlphaImageView) && (colorFilterAlphaImageView = (ColorFilterAlphaImageView) view) != null) {
            0eP r5 = new 0eP(r8, Boolean.valueOf(z));
            AnonymousClass7JT r6 = AnonymousClass7JT.QUICK_REPLY;
            if (!r5.equals(new 0eP(r6, false))) {
                AnonymousClass7JT r2 = AnonymousClass7JT.QUICK_REPLY_HIGHLIGHTED;
                if (!r5.equals(new 0eP(r2, false))) {
                    if (r5.equals(new 0eP(r6, true))) {
                        AnonymousClass0fU.A00(new AnonymousClass7QB(this, r9), colorFilterAlphaImageView);
                        colorFilterAlphaImageView.A04(this.A01, this.A00);
                        colorFilterAlphaImageView.setVisibility(i);
                    } else if (r5.equals(new 0eP(r2, true))) {
                        AnonymousClass0fU.A00(new C40002ANi(this, r9), colorFilterAlphaImageView);
                        int i2 = this.A0C;
                        int i3 = this.A0B;
                        C294975nL.A01(colorFilterAlphaImageView, 0).A0G();
                        colorFilterAlphaImageView.setVisibility(0);
                        colorFilterAlphaImageView.A04(i2, i3);
                        C294975nL A012 = C294975nL.A01(colorFilterAlphaImageView, 0);
                        A012.A0G();
                        A012.A0U(0.0f, 1.0f, -1.0f);
                        A012.A0V(0.0f, 1.0f, -1.0f);
                        A012.A0E(C71392co.A04(60.0d, 5.0d)).A0H();
                        return;
                    } else {
                        return;
                    }
                }
            }
            i = 8;
            colorFilterAlphaImageView.setVisibility(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r0 != 0) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FMR(X.AnonymousClass7JU r8, X.AnonymousClass7JT r9, boolean r10) {
        /*
            r7 = this;
            r0 = 1
            X.0qQ.A0B(r9, r0)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            android.view.View r4 = r7.A00(r8, r9, r10)
            if (r4 == 0) goto L_0x004e
            if (r10 == 0) goto L_0x0066
            X.7JT r0 = X.AnonymousClass7JT.META_AI_DISCOVERY
            if (r9 != r0) goto L_0x0045
            X.0eM r0 = r7.A06
            java.lang.Object r0 = r0.getValue()
            X.3oV r0 = (X.C252063oV) r0
            if (r0 == 0) goto L_0x0045
            android.view.View r3 = r0.getView()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x0045
            com.instagram.common.session.UserSession r5 = r7.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36607677006091873(0x820e7d00001661, double:3.2141805737115165E-306)
            long r5 = X.182.A01(r2, r5, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            if (r0 == 0) goto L_0x0062
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004f
            r1 = 2131238671(0x7f081f0f, float:1.8093627E38)
        L_0x0042:
            r3.setImageResource(r1)
        L_0x0045:
            r0 = 0
        L_0x0046:
            r4.setVisibility(r0)
            X.7IM r0 = r7.A0H
            r0.A00(r8, r9, r10)
        L_0x004e:
            return
        L_0x004f:
            r1 = 2
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            r1 = 2131238544(0x7f081e90, float:1.809337E38)
            goto L_0x0042
        L_0x0059:
            r1 = 3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r1 = 2131237983(0x7f081c5f, float:1.8092232E38)
            if (r0 == 0) goto L_0x0042
        L_0x0062:
            r1 = 2131238541(0x7f081e8d, float:1.8093364E38)
            goto L_0x0042
        L_0x0066:
            r0 = 8
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7J4.FMR(X.7JU, X.7JT, boolean):void");
    }

    private final View A00(AnonymousClass7JU r4, AnonymousClass7JT r5, boolean z) {
        AnonymousClass0eM r0;
        View view = null;
        if (r4 == AnonymousClass7JU.RIGHT_INSET) {
            switch (r5.ordinal()) {
                case 0:
                    return (View) this.A05.getValue();
                case 1:
                    return this.A0E;
                case 4:
                    return this.A0F;
                case 11:
                    return this.A0G;
                case 21:
                    r0 = this.A06;
                    break;
                case 22:
                    r0 = this.A0A;
                    break;
                case 24:
                    r0 = this.A08;
                    break;
                case 25:
                    r0 = this.A07;
                    break;
            }
            C252063oV r2 = (C252063oV) r0.getValue();
            view = null;
            if ((r2 != null && r2.CVM()) || (z && r2 != null)) {
                return r2.getView();
            }
        }
        return view;
    }

    public final void ADj(AnonymousClass7L0 r4) {
        ColorFilterAlphaImageView colorFilterAlphaImageView;
        this.A01 = r4.A0C;
        this.A00 = r4.A0D;
        C252063oV r0 = (C252063oV) this.A09.getValue();
        if (r0 != null && (colorFilterAlphaImageView = (ColorFilterAlphaImageView) r0.getView()) != null) {
            colorFilterAlphaImageView.A04(this.A01, this.A00);
        }
    }

    public AnonymousClass7J4(Activity activity, View view, UserSession userSession, C329357Io r6, AnonymousClass7IM r7) {
        this.A03 = userSession;
        this.A02 = activity;
        this.A0H = r7;
        this.A04 = r6;
        Context context = view.getContext();
        this.A0D = context;
        this.A01 = 2Yu.A0F(context, R.attr.glyphColorPrimary);
        this.A00 = context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_text));
        this.A0C = context.getColor(R.color.badge_color);
        this.A0B = context.getColor(R.color.blue_3);
        this.A0E = view.findViewById(R.id.row_thread_composer_button_gallery);
        this.A0G = view.findViewById(R.id.row_thread_composer_voice);
        this.A0F = view.findViewById(R.id.row_thread_composer_button_sticker);
        this.A09 = AnonymousClass1YB.A00(new C377229La(view, 27));
        this.A08 = AnonymousClass1YB.A00(new C377229La(view, 26));
        this.A06 = AnonymousClass1YB.A00(new C377229La(view, 24));
        this.A07 = AnonymousClass1YB.A00(new C377229La(view, 25));
        this.A0A = AnonymousClass1YB.A00(new C377229La(view, 28));
    }
}
