package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.List;

public final class FGX {
    public final Context A00;
    public final Boolean A01;
    public final Boolean A02;
    public final List A03;

    public FGX(Context context, Boolean bool, Boolean bool2) {
        0qQ.A0B(context, 1);
        this.A00 = context;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = AnonymousClass7TE.A1C();
    }

    public static FGX A01(Context context, Boolean bool) {
        return new FGX(context, bool, 4);
    }

    public final List A04() {
        EWR ewr;
        List<C49626Ezj> list = this.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C49626Ezj ezj : list) {
            Context context = this.A00;
            0qQ.A0B(ezj, 1);
            IgdsBulletCell igdsBulletCell = new IgdsBulletCell(context, (AttributeSet) null, 0);
            igdsBulletCell.setIcon(ezj.A00);
            IgdsBulletCell.A00(igdsBulletCell, ezj.A04, ezj.A03);
            igdsBulletCell.setExcludeHorizontalPadding(0qQ.A0K(ezj.A01, true));
            if (0qQ.A0K(ezj.A02, true)) {
                ewr = EWR.ON_MEDIA;
            } else {
                ewr = EWR.DEFAULT;
            }
            igdsBulletCell.setSurfaceType(ewr);
            A0r.add(igdsBulletCell);
        }
        return A0r;
    }

    public final void A05(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.A03.add(new C49626Ezj(this.A01, this.A02, charSequence, charSequence2, i));
    }

    public static Resources A00(Fragment fragment, FGX fgx, CharSequence charSequence, CharSequence charSequence2, int i) {
        fgx.A05(charSequence, charSequence2, i);
        return fragment.requireContext().getResources();
    }

    public static FGX A02(Context context, boolean z) {
        return new FGX(context, Boolean.valueOf(z), 4);
    }

    public static void A03(FGX fgx, IgdsHeadline igdsHeadline, CharSequence charSequence, CharSequence charSequence2, int i) {
        fgx.A05(charSequence, charSequence2, i);
        igdsHeadline.setBulletList(fgx.A04());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FGX(android.content.Context r4, java.lang.Boolean r5, int r6) {
        /*
            r3 = this;
            r2 = 0
            r0 = r6 & 2
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            if (r0 == 0) goto L_0x000a
            r5 = r1
        L_0x000a:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x000f
            r2 = r1
        L_0x000f:
            r3.<init>((android.content.Context) r4, (java.lang.Boolean) r5, (java.lang.Boolean) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGX.<init>(android.content.Context, java.lang.Boolean, int):void");
    }
}
