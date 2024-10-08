package X;

import android.animation.ArgbEvaluator;
import android.view.View;
import android.widget.TextView;
import com.instagram.creation.base.ui.mediatabbar.MediaTabBar;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import java.util.List;

/* renamed from: X.Jai  reason: case insensitive filesystem */
public final class C59865Jai extends C232922uf {
    public final /* synthetic */ C59864Jah A00;

    public C59865Jai(C59864Jah jah) {
        this.A00 = jah;
    }

    public final void DmC(2cs r6) {
        C59864Jah jah = this.A00;
        Tab currentTab = jah.getCurrentTab();
        if (jah.A04 != currentTab) {
            Tab currentTab2 = jah.getCurrentTab();
            for (C66502MUg DqB : jah.A0L) {
                DqB.DqB(currentTab2);
            }
            jah.A04 = currentTab;
        }
    }

    public final void DmE(2cs r15) {
        float A01;
        C59864Jah jah = this.A00;
        MediaTabBar mediaTabBar = jah.A0I;
        float A012 = jah.getCurrentProgress();
        mediaTabBar.A00 = A012;
        if (mediaTabBar.A04) {
            A012 = ((float) DbT.A02(mediaTabBar.A07, 1)) - A012;
        }
        int ceil = (int) Math.ceil((double) A012);
        int i = mediaTabBar.A03;
        if (!(i == -1 || i == ceil)) {
            List list = mediaTabBar.A07;
            AnonymousClass2gY.A00((View) list.get(i), mediaTabBar.A03 + 1, list.size(), false);
        }
        List list2 = mediaTabBar.A07;
        AnonymousClass2gY.A00((View) list2.get(ceil), ceil + 1, list2.size(), true);
        mediaTabBar.A03 = ceil;
        ArgbEvaluator argbEvaluator = mediaTabBar.A05;
        float f = ((float) ceil) - A012;
        int i2 = mediaTabBar.A02;
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(mediaTabBar.A01);
        int A04 = DbW.A04(argbEvaluator.evaluate(f, valueOf, valueOf2), "null cannot be cast to non-null type kotlin.Int");
        int A042 = DbW.A04(argbEvaluator.evaluate(f, valueOf2, valueOf), "null cannot be cast to non-null type kotlin.Int");
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (ceil == i3) {
                ((TextView) list2.get(i3)).setTextColor(A042);
            } else {
                int i4 = ceil - i3;
                if (i4 > 1 || i4 < 0) {
                    ((TextView) list2.get(i3)).setTextColor(i2);
                } else {
                    ((TextView) list2.get(i3)).setTextColor(A04);
                }
            }
        }
        mediaTabBar.invalidate();
        Tab currentTab = jah.getCurrentTab();
        boolean A1a = C51969G9p.A1a(currentTab, jah.A03);
        float A002 = jah.getClampedSpringValue();
        for (C66502MUg mUg : jah.A0L) {
            if (jah.A0M) {
                A01 = ((float) (mediaTabBar.getChildCount() - 1)) - jah.getCurrentProgress();
            } else {
                A01 = jah.getCurrentProgress();
            }
            mUg.Dq9(A01 + ((float) jah.A01), A002);
            if (A1a) {
                mUg.DqA(jah.A03, currentTab);
            }
        }
        jah.A03 = currentTab;
    }
}
