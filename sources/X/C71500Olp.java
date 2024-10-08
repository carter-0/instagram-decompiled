package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Olp  reason: case insensitive filesystem */
public final class C71500Olp implements AnonymousClass07Z, AnonymousClass7D2 {
    public int A00;
    public int A01;
    public int A02;
    public final 0h9 A03 = new 0h9(this);
    public final AnonymousClass0iw A04;
    public final AnonymousClass7DZ A05;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(layoutInflater, 1);
        this.A01 = layoutInflater.getContext().getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        this.A02 = layoutInflater.getContext().getResources().getDimensionPixelOffset(R.dimen.asset_picker_video_sticker_width);
        this.A00 = layoutInflater.getContext().getColor(R.color.context_line_color);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C68074Mzf mzf = new C68074Mzf(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_notes_xma_content, false));
        mzf.A01.post(new C73223PZ1(this, mzf));
        return mzf;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        0qQ.A0B(r3, 0);
        this.A05.A01(r3);
        this.A03.A0B(07T.ON_PAUSE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r7 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r2 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r7 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r0 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r0 = r12.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r0 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r0 = (X.C70815OMk) r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r0 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        r3.A0F(r9, r8, r2, X.AnonymousClass7TF.A1W(r1, X.C69305Nj6.A07));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        if (r7 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d1 A[LOOP:0: B:47:0x00cb->B:49:0x00d1, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r11, X.AnonymousClass7FW r12) {
        /*
            r10 = this;
            X.Mzf r11 = (X.C68074Mzf) r11
            X.7Fr r12 = (X.C328667Fr) r12
            r4 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r4, r11, r12)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r6 = r11.A03
            r0 = 8
            r6.setVisibility(r0)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r3 = r11.A02
            int r0 = r10.A00
            r3.setBubbleBackgroundColor(r0)
            X.774 r0 = r12.A0E
            r5 = 0
            if (r0 == 0) goto L_0x0107
            java.lang.String r1 = r0.A09
        L_0x001e:
            java.lang.String r0 = "music"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f3
            X.0h9 r0 = r10.A03
            r3.setMusicContentLayout(r0)
            X.74T r7 = r12.A0D
            java.lang.String r9 = ""
            if (r7 == 0) goto L_0x003b
            java.lang.CharSequence r0 = r7.A08
            if (r0 == 0) goto L_0x003b
            java.lang.String r8 = r0.toString()
            if (r8 != 0) goto L_0x003e
        L_0x003b:
            r8 = r9
            if (r7 == 0) goto L_0x0048
        L_0x003e:
            java.lang.CharSequence r0 = r7.A09
            if (r0 == 0) goto L_0x0048
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L_0x004b
        L_0x0048:
            r2 = r9
            if (r7 == 0) goto L_0x0056
        L_0x004b:
            java.lang.CharSequence r0 = r7.A05
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0056
            r9 = r0
        L_0x0056:
            X.9Iu r0 = r12.A03
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r0 = r0.A00
            X.OMk r0 = (X.C70815OMk) r0
            if (r0 == 0) goto L_0x00f0
            X.Nj6 r1 = r0.A00
        L_0x0062:
            X.Nj6 r0 = X.C69305Nj6.WARNING
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r3.A0F(r9, r8, r2, r0)
            if (r7 == 0) goto L_0x008a
        L_0x006d:
            com.instagram.common.typedurl.ImageUrl r2 = r7.A01
            if (r2 == 0) goto L_0x008a
            java.lang.String r0 = r2.getUrl()
            if (r0 == 0) goto L_0x007d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x008a
        L_0x007d:
            r6.setVisibility(r4)
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r2)
            X.0iw r0 = r10.A04
            r6.A0F(r5, r0, r1)
        L_0x008a:
            int r5 = r10.A01
            int r6 = r10.A02
            android.view.View r2 = r3.A00
            int r1 = r2.getPaddingTop()
            int r0 = r2.getPaddingBottom()
            r2.setPaddingRelative(r4, r1, r4, r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof X.C71492dQ
            if (r0 == 0) goto L_0x00ae
            X.2dQ r1 = (X.C71492dQ) r1
            if (r1 == 0) goto L_0x00ae
            r1.A0d = r6
            r1.width = r4
            r2.setLayoutParams(r1)
        L_0x00ae:
            androidx.cardview.widget.CardView r0 = r3.A01
            androidx.cardview.widget.CardView[] r0 = new androidx.cardview.widget.CardView[]{r0}
            java.util.ArrayList r2 = X.0sr.A1M(r0)
            X.3oV r1 = r3.A0F
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x00c7
            android.view.View r0 = r1.getView()
            r2.add(r0)
        L_0x00c7:
            java.util.Iterator r3 = r2.iterator()
        L_0x00cb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r3.next()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            r1.setElevation(r0)
            android.view.View r2 = r1.getChildAt(r4)
            X.0qQ.A0A(r2)
            r2.setPaddingRelative(r5, r5, r5, r5)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.width = r0
            r2.setLayoutParams(r1)
            goto L_0x00cb
        L_0x00f0:
            r1 = 0
            goto L_0x0062
        L_0x00f3:
            X.74T r7 = r12.A0D
            if (r7 == 0) goto L_0x008a
            java.lang.CharSequence r2 = r7.A05
            if (r2 == 0) goto L_0x006d
            com.instagram.direct.inbox.notes.ui.NoteBubbleView.setContentLayout$default(r3, r4, r8, r5)
            X.Pjm r1 = X.C73787Pjm.A00
            java.lang.String r0 = ""
            r3.setText(r2, r4, r0, r1)
            goto L_0x006d
        L_0x0107:
            r1 = r5
            goto L_0x001e
        L_0x010a:
            X.7DZ r0 = r10.A05
            r0.A02(r11, r12)
            X.0h9 r1 = r10.A03
            X.07T r0 = X.07T.ON_RESUME
            r1.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71500Olp.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass07V getLifecycle() {
        return this.A03;
    }

    public C71500Olp(List list, AnonymousClass0iw r3) {
        this.A04 = r3;
        this.A05 = new AnonymousClass7DZ(list);
    }
}
