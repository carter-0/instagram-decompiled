package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.U4r  reason: case insensitive filesystem */
public final class C14725U4r extends FrameLayout implements C41835B2q {
    public C17937ViS A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final RectF A04 = new RectF();

    public C14725U4r(Context context) {
        super(context, (AttributeSet) null, DbW.A1X(context) ? 1 : 0);
        Resources resources = getResources();
        this.A02 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A03 = AnonymousClass7TE.A0C(resources);
    }

    public final boolean AFg() {
        return AnonymousClass7TF.A1V(this.A00);
    }

    public final void DVQ(float f) {
        float f2;
        C17937ViS viS = this.A00;
        if (viS != null) {
            int size = viS.A09.size();
            for (int i = 0; i < size; i++) {
                C17574VaS A002 = viS.A00(i);
                if (A002 != null) {
                    U4V u4v = A002.A04;
                    float A022 = 0mi.A02(f, 0.0f, 1.0f, 0.0f, A002.A00);
                    float A023 = 0mi.A02(f, 0.0f, 1.0f, 0.0f, A002.A01);
                    float f3 = (float) this.A03;
                    u4v.setY(A023 + f3);
                    if (this.A01) {
                        f2 = ((((float) getWidth()) - A022) - ((float) this.A02)) - f3;
                    } else {
                        f2 = f3 + A022;
                    }
                    u4v.setX(f2);
                    if (this.A04.contains(A002.A00, A002.A01)) {
                        u4v.setAlpha(f);
                    }
                }
            }
            return;
        }
        0kD.A07("SecondaryPickerView", "Needs to bind Adapter to use this view in onOpenProgressUpdated", (Throwable) null);
    }

    public int getMenuHeight() {
        C17937ViS viS = this.A00;
        if (viS == null) {
            return 0;
        }
        int i = viS.A03;
        int A012 = (JTP.A01((double) viS.A09.size(), (double) viS.A01) * viS.A02) + (i * 2);
        if (!viS.A0A) {
            i = 0;
        }
        return A012 + i;
    }

    public int getMenuWidth() {
        C17937ViS viS = this.A00;
        if (viS == null) {
            return 0;
        }
        int i = viS.A02 * viS.A01;
        int i2 = viS.A03 * 2;
        int i3 = i + i2;
        if (!viS.A0A) {
            i2 = 0;
        }
        return i3 + i2;
    }

    public View getView() {
        return this;
    }

    public void setIsOnRightSide(boolean z) {
        this.A01 = z;
    }

    public final void setSelectedItem(int i) {
        C17574VaS A002;
        C17937ViS viS = this.A00;
        if (viS == null) {
            0kD.A07("SecondaryPickerView", "Needs to bind Adapter to use this view in setSelectedItem", (Throwable) null);
        } else if (i >= 0 && i < viS.A08.size()) {
            C17574VaS A003 = viS.A00(viS.A00);
            if (A003 != null) {
                A003.A04.setItemViewState(false);
            }
            viS.A00 = i;
            if (C352618Eb.A06(viS.A06) && (A002 = viS.A00(viS.A00)) != null) {
                A002.A04.setItemViewState(true);
            }
        }
    }
}
