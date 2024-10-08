package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.clips.audio.soundsync.view.player.SoundSyncPreviewView;

/* renamed from: X.IIp  reason: case insensitive filesystem */
public final class C56945IIp implements C252203oj {
    public Integer A00 = AnonymousClass05K.A01;
    public final C71392co A01 = new C71392co(0.0d, 0.0d);
    public final C71392co A02 = new C71392co(0.0d, 0.0d);
    public final AnonymousClass0eM A03 = C58710IwJ.A01(this, 2);
    public final View A04;
    public final C55452Hhw A05;

    public C56945IIp(View view, C55452Hhw hhw) {
        0qQ.A0B(view, 1);
        this.A04 = view;
        this.A05 = hhw;
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r5) {
        0qQ.A0B(r5, 0);
        if (0qQ.A0K(r5.A05, this.A02)) {
            r5.A09(this.A01);
            r5.A02();
            r5.A04();
            return;
        }
        C55452Hhw hhw = this.A05;
        Integer num = this.A00;
        0qQ.A0B(num, 0);
        if (num == AnonymousClass05K.A00) {
            SoundSyncPreviewView soundSyncPreviewView = hhw.A00;
            soundSyncPreviewView.getStrokeProgress().A01();
            C51970G9q.A1R(soundSyncPreviewView.getForeGroundDrawable().A0B);
            soundSyncPreviewView.A06.setImageDrawable((Drawable) null);
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r6) {
        Integer num;
        Integer num2;
        0qQ.A0B(r6, 0);
        float f = (float) r6.A09.A00;
        if (0qQ.A0K(r6.A05, this.A01)) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        int intValue = num.intValue();
        Integer num3 = this.A00;
        if (intValue != 0) {
            num2 = AnonymousClass05K.A01;
        } else {
            num2 = AnonymousClass05K.A00;
        }
        if (num3 == num2) {
            this.A04.setAlpha(f);
        }
        float f2 = ((float) (((double) f) * 0.15d)) + 1.0f;
        View view = this.A04;
        view.setScaleY(f2);
        view.setScaleX(f2);
    }
}
