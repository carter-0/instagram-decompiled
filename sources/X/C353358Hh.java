package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.8Hh  reason: invalid class name and case insensitive filesystem */
public abstract class C353358Hh extends C353368Hi {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final AnonymousClass8AM A05;
    public final AnonymousClass2S0 A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C353358Hh(Context context, AnonymousClass8DG r10, AnonymousClass8AM r11, boolean z, boolean z2) {
        this(context, r10, r11, z, z2, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r7.A05.CbK() == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r9 > r7.A00) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C380619Yw r8, int r9) {
        /*
            r7 = this;
            android.view.View r6 = r8.A07
            boolean r0 = r7.A01
            r4 = 8
            r1 = 0
            if (r0 != 0) goto L_0x000f
            int r2 = r7.A00
            r0 = 8
            if (r9 <= r2) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r6.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r8.A0A
            r5.setVisibility(r1)
            com.instagram.ui.widget.bubblespinner.BubbleSpinner r2 = r8.A0C
            r2.setVisibility(r4)
            X.8YA r0 = X.AnonymousClass8YA.DONE
            r2.setLoadingStatus(r0)
            boolean r0 = r7.A0A
            X.2eb r3 = r8.A0B
            if (r0 == 0) goto L_0x006d
            r3.A03(r1)
        L_0x002b:
            X.ANO r0 = new X.ANO
            r0.<init>(r7, r9)
            X.AnonymousClass0fU.A00(r0, r6)
            int r0 = r7.A00
            if (r9 != r0) goto L_0x0071
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0071
            boolean r0 = r6.isSelected()
            if (r0 != 0) goto L_0x006c
            r0 = 1
            r2 = 0
            X.C380619Yw.A00(r8, r0, r1)
            r6.setSelected(r0)
            android.view.View r1 = r8.A08
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x0051
            r2 = 8
        L_0x0051:
            r1.setVisibility(r2)
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x006c
            int r1 = r8.A00
            r5.setColorFilter(r1)
            int r0 = r3.A00()
            if (r0 == r4) goto L_0x006c
            android.view.View r0 = r3.A01()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r1)
        L_0x006c:
            return
        L_0x006d:
            r3.A03(r4)
            goto L_0x002b
        L_0x0071:
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x007e
            X.8AM r0 = r7.A05
            boolean r1 = r0.CbK()
            r0 = 1
            if (r1 != 0) goto L_0x007f
        L_0x007e:
            r0 = 0
        L_0x007f:
            r8.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353358Hh.A07(X.9Yw, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2.A05.CbK() == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onViewRecycled(X.C249703kE r3) {
        /*
            r2 = this;
            X.9Yw r3 = (X.C380619Yw) r3
            boolean r0 = r2.A07
            r3.A03 = r0
            boolean r0 = r2.A09
            r3.A05 = r0
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0017
            X.8AM r0 = r2.A05
            boolean r1 = r0.CbK()
            r0 = 1
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.A02(r0)
            r0 = 0
            r3.A01(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A0A
            r0.A09()
            X.2eb r1 = r3.A0B
            r0 = 8
            r1.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353358Hh.onViewRecycled(X.3kE):void");
    }

    public void A02(int i) {
        super.A02(i);
        this.A06.A05(10);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C380619Yw(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.generic_effect_picker_tile, viewGroup, false), this.A07, this.A09, this.A08);
    }

    public C353358Hh(Context context, AnonymousClass8DG r4, AnonymousClass8AM r5, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context, r4);
        this.A06 = AnonymousClass2S0.A01;
        this.A04 = new Handler(Looper.getMainLooper());
        this.A01 = true;
        this.A00 = -1;
        this.A02 = true;
        this.A05 = r5;
        this.A07 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A08 = z4;
        this.A00 = 0;
    }
}
