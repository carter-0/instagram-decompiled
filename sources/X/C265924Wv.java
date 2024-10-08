package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.4Wv  reason: invalid class name and case insensitive filesystem */
public final class C265924Wv {
    public int A00 = -1;
    public View A01;
    public LinearLayout A02;
    public TextView A03;
    public C249693kD A04;
    public C265914Wu A05;
    public C265934Ww A06;
    public C19471WaJ A07;
    public ArrayList A08 = new ArrayList();
    public final C252063oV A09;

    public final void A00() {
        String format;
        C19471WaJ waJ = this.A07;
        if (waJ == null) {
            format = "Cannot show correct answer because of null sticker model.";
        } else {
            int A002 = waJ.A00();
            ArrayList arrayList = this.A08;
            if (A002 >= arrayList.size()) {
                format = String.format("Cannot show correct answer because correct answer is set as %d with answer array size %d", new Object[]{Integer.valueOf(A002), Integer.valueOf(arrayList.size())});
            } else {
                C18587Vue vue = (C18587Vue) arrayList.get(A002);
                Drawable drawable = vue.A03;
                int i = vue.A02;
                C18587Vue.A00(drawable, i);
                View view = vue.A05;
                TransitionDrawable transitionDrawable = vue.A04;
                view.setBackground(transitionDrawable);
                vue.A06.setBackground(drawable);
                vue.A07.setTextColor(i);
                transitionDrawable.startTransition(150);
                return;
            }
        }
        0wb.A03("ReelQuizStickerViewBinder", format);
    }

    public final void A01(int i) {
        this.A00 = i;
        if (i != -1) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.A08;
                if (i2 < arrayList.size()) {
                    C18587Vue vue = (C18587Vue) arrayList.get(i2);
                    boolean z = true;
                    boolean z2 = false;
                    if (i2 == this.A00) {
                        z2 = true;
                    }
                    C19471WaJ waJ = this.A07;
                    waJ.getClass();
                    if (i2 != waJ.A00()) {
                        z = false;
                    }
                    vue.A01(z2, z);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public C265924Wv(C252063oV r2) {
        this.A09 = r2;
        this.A06 = new C265934Ww(this);
    }
}
