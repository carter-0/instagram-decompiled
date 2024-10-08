package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class P32 implements C327807Cg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public P32(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void EPw(Drawable drawable) {
        if (this.A00 != 0) {
            NJZ njz = (NJZ) this.A02;
            ConstraintLayout constraintLayout = njz.A02;
            if (constraintLayout != null) {
                constraintLayout.setBackground(drawable);
            }
            ConstraintLayout constraintLayout2 = njz.A01;
            if (constraintLayout2 != null) {
                constraintLayout2.setBackground(drawable);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = njz.A09;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setBackground((Drawable) null);
                return;
            }
            return;
        }
        ((View) this.A02).setBackground(drawable);
    }

    public final void ESW(int i, int i2, int i3, int i4) {
        if (this.A00 != 0) {
            NJZ njz = (NJZ) this.A02;
            boolean A1S = AnonymousClass7TF.A1S(DbV.A05(njz).getConfiguration().uiMode & 48, 32);
            IgdsInlineSearchBox igdsInlineSearchBox = njz.A0A;
            if (igdsInlineSearchBox != null) {
                int i5 = 255;
                if (A1S) {
                    i5 = 30;
                }
                igdsInlineSearchBox.setSearchRowColor((i & 16777215) | (i5 << 24));
            }
            IgdsInlineSearchBox igdsInlineSearchBox2 = njz.A0A;
            if (igdsInlineSearchBox2 != null) {
                igdsInlineSearchBox2.setSearchGlyphColor(i2);
            }
            IgdsInlineSearchBox igdsInlineSearchBox3 = njz.A0A;
            if (igdsInlineSearchBox3 != null) {
                igdsInlineSearchBox3.setClearButtonColor(i2);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = njz.A09;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setBackgroundColor(i3);
            }
            AnonymousClass2uJ.A04((Activity) this.A01, i4);
        }
    }

    public final void setBackgroundColor(int i) {
        C331157Pu r0;
        if (this.A00 == 0 && (r0 = (C331157Pu) this.A01) != null) {
            r0.A03.A0S(i);
        }
    }
}
