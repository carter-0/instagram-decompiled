package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;

/* renamed from: X.7EV  reason: invalid class name */
public final class AnonymousClass7EV implements C328007Db {
    public final C71662eb A00;
    public final C333137Xu A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass9LX(this, 0));

    private final void A00(IgdsBulletCell igdsBulletCell, String str, String str2, int i, int i2) {
        if (str != null) {
            igdsBulletCell.setText((CharSequence) str2, (CharSequence) str);
            igdsBulletCell.setIcon(i);
            igdsBulletCell.setIconColor(i2);
            igdsBulletCell.setVisibility(0);
            C71662eb r1 = this.A00;
            if (r1.A00() == 8) {
                r1.A03(0);
                return;
            }
            return;
        }
        igdsBulletCell.setVisibility(8);
    }

    public final void A01(AnonymousClass7AF r31) {
        Object value = this.A05.getValue();
        0qQ.A07(value);
        AnonymousClass7AF r0 = r31;
        String str = r0.A07;
        A00((IgdsBulletCell) value, str, r0.A06, R.drawable.instagram_arrow_right_pano_outline_24, R.color.badge_color);
        Object value2 = this.A04.getValue();
        0qQ.A07(value2);
        A00((IgdsBulletCell) value2, r0.A05, r0.A04, R.drawable.instagram_arrow_left_pano_outline_24, R.color.green_5);
        Object value3 = this.A03.getValue();
        0qQ.A07(value3);
        IgdsBulletCell igdsBulletCell = (IgdsBulletCell) value3;
        A00(igdsBulletCell, r0.A02, r0.A03, R.drawable.instagram_timer_pano_outline_24, R.color.clips_gradient_redesign_color_1);
        Object value4 = this.A02.getValue();
        0qQ.A07(value4);
        A00((IgdsBulletCell) value4, r0.A00, r0.A01, R.drawable.instagram_error_pano_outline_24, R.color.netego_su_background_gradient_end_4);
        Object value5 = this.A08.getValue();
        0qQ.A07(value5);
        A00((IgdsBulletCell) value5, str, r0.A0D, R.drawable.instagram_arrow_right_pano_outline_24, R.color.badge_color);
        Object value6 = this.A07.getValue();
        0qQ.A07(value6);
        A00((IgdsBulletCell) value6, r0.A0C, r0.A0B, R.drawable.instagram_arrow_left_pano_outline_24, R.color.green_5);
        Object value7 = this.A06.getValue();
        0qQ.A07(value7);
        IgdsBulletCell igdsBulletCell2 = (IgdsBulletCell) value7;
        A00(igdsBulletCell2, r0.A09, r0.A0A, R.drawable.instagram_timer_pano_outline_24, R.color.clips_gradient_redesign_color_1);
        Object value8 = this.A09.getValue();
        0qQ.A07(value8);
        AnonymousClass0fU.A00(new C39996ANc(this, r0), (View) value8);
    }

    public final View BJd() {
        View view;
        C71662eb r1 = this.A00;
        if (r1.A00 != null) {
            view = r1.A01();
        } else {
            view = r1.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass7EV(C71662eb r4, C333137Xu r5) {
        this.A00 = r4;
        this.A01 = r5;
        0eO r2 = 0eO.A02;
        this.A05 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 46));
        this.A04 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 45));
        this.A03 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 44));
        this.A02 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 43));
        this.A08 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 49));
        this.A07 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 48));
        this.A06 = AnonymousClass0eN.A00(r2, new AnonymousClass9LB(this, 47));
    }
}
