package X;

import android.view.View;
import android.view.ViewParent;
import com.facebook.litho.ComponentHost;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2pj  reason: invalid class name and case insensitive filesystem */
public abstract class C230502pj implements C250603lj {
    public final Map A00 = new LinkedHashMap();
    public final UserSession A01;

    public static final String A00(View view, C246113e2 r4, String str, boolean z) {
        String valueOf;
        if (r4 != null) {
            valueOf = String.valueOf(r4.A01.A06.A0H());
        } else {
            if (view.getId() == -1) {
                view.setId(View.generateViewId());
            }
            ViewParent parent = view.getParent();
            if (parent == null || (parent instanceof ComponentHost)) {
                valueOf = String.valueOf(view.getId());
            } else {
                StringBuilder sb = new StringBuilder();
                ViewParent parent2 = view.getParent();
                0qQ.A0C(parent2, "null cannot be cast to non-null type android.view.View");
                sb.append(((View) parent2).getId());
                sb.append(view.getId());
                valueOf = sb.toString();
            }
        }
        Integer A06 = AnonymousClass59A.A00.A06(str);
        if (!z || A06 == null) {
            return valueOf;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(valueOf);
        sb2.append(A06);
        return sb2.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.facebook.litho.ComponentHost} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: com.facebook.litho.ComponentHost} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v159, resolved type: com.instagram.common.ui.widget.imageview.IgImageView} */
    /* JADX WARNING: type inference failed for: r4v4, types: [X.59F, android.widget.ImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.59F, android.widget.ImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.59F, android.widget.ImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x024a, code lost:
        if (r0.length() > 0) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x024c, code lost:
        r0 = new X.AnonymousClass59I(r8, r5, (X.AnonymousClass5FD) null, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0264, code lost:
        if (r0.length() > 0) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x026f, code lost:
        if (((com.instagram.ui.widget.textview.IgTextLayoutView) r4).A00 != null) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x029b, code lost:
        r0 = (X.C53288Gla) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02bc, code lost:
        if (((X.C55923Hpk) r14.A0B.get(r12)).A00().CeS() != false) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0302, code lost:
        if (r0.CeS() != false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0307, code lost:
        if ((r8 instanceof com.instagram.ui.widget.framelayout.MediaFrameLayout) == false) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x030c, code lost:
        if (r5 != X.C244063aa.MEDIA) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x030e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x030f, code lost:
        if (r12 == false) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0311, code lost:
        if (r0 == false) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0324, code lost:
        if (r4 == false) goto L_0x030e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0034 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass30Y r24, X.C252093oY r25, java.lang.String r26, boolean r27) {
        /*
            r23 = this;
            r21 = 2
            r11 = r26
            r0 = r21
            X.0qQ.A0B(r11, r0)
            r1 = r24
            java.lang.Object r10 = r1.A03
            r0 = r25
            java.lang.Integer r0 = r0.CEk(r1)
            X.0qQ.A07(r0)
            r0 = r23
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r10)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0519
            java.util.concurrent.ConcurrentLinkedQueue r20 = new java.util.concurrent.ConcurrentLinkedQueue
            r20.<init>()
            r9 = 0
            X.9IZ r1 = new X.9IZ
            r2 = r27
            r1.<init>((android.view.View) r0, (X.C244063aa) r9, (boolean) r2)
            r0 = r20
            r0.add(r1)
        L_0x0034:
            boolean r0 = r20.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0519
            java.lang.Object r0 = r20.remove()
            if (r0 == 0) goto L_0x0511
            X.9IZ r0 = (X.AnonymousClass9IZ) r0
            java.lang.Object r8 = r0.A00
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r13 = r0.A03
            X.3aa r13 = (X.C244063aa) r13
            boolean r7 = r0.A01
            r6 = 0
            X.0qQ.A0B(r8, r6)
            r0 = 2131438001(0x7f0b29b1, float:1.8497917E38)
            java.lang.Object r5 = r8.getTag(r0)
            boolean r0 = r5 instanceof X.C244063aa
            if (r0 == 0) goto L_0x0061
            X.3aa r5 = (X.C244063aa) r5
            if (r5 != 0) goto L_0x0085
        L_0x0061:
            r12 = 2131428755(0x7f0b0593, float:1.8479163E38)
            java.lang.Object r0 = r8.getTag(r12)
            if (r0 == 0) goto L_0x009d
            X.3aa[] r4 = X.C244063aa.values()
            r3 = 0
            int r2 = r4.length
        L_0x0070:
            if (r3 >= r2) goto L_0x009d
            r5 = r4[r3]
            java.lang.String r1 = r5.toString()
            java.lang.Object r0 = r8.getTag(r12)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0085
            int r3 = r3 + 1
            goto L_0x0070
        L_0x0085:
            java.util.Map r2 = X.AnonymousClass59A.A02
            java.lang.Object r1 = r2.get(r11)
            X.59B r1 = (X.AnonymousClass59B) r1
            if (r1 != 0) goto L_0x0094
            X.59B r1 = new X.59B
            r1.<init>()
        L_0x0094:
            java.util.Set r0 = r1.A01
            r0.add(r5)
            r2.put(r11, r1)
            goto L_0x009e
        L_0x009d:
            r5 = r13
        L_0x009e:
            r4 = r8
            boolean r0 = r8 instanceof com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager
            r19 = r0
            if (r0 == 0) goto L_0x011a
            r0 = r4
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            int r0 = r0.getCurrentDataIndex()
        L_0x00ac:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00b0:
            if (r0 == 0) goto L_0x0143
            java.util.Map r2 = X.AnonymousClass59A.A02
            java.lang.Object r1 = r2.get(r11)
            X.59B r1 = (X.AnonymousClass59B) r1
            if (r1 != 0) goto L_0x00c1
            X.59B r1 = new X.59B
            r1.<init>()
        L_0x00c1:
            r1.A00 = r0
            r2.put(r11, r1)
            int r13 = r0.intValue()
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
        L_0x00cf:
            java.util.Queue r1 = X.AnonymousClass59A.A08
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0135
            java.lang.Object r0 = r1.poll()
            X.59G r0 = (X.AnonymousClass59G) r0
            if (r0 == 0) goto L_0x0135
            java.lang.Object r12 = r0.A00
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A02
            boolean r0 = X.0qQ.A0K(r12, r11)
            if (r0 == 0) goto L_0x0111
            java.util.Map r0 = X.AnonymousClass59A.A06
            java.lang.Object r0 = r0.get(r12)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r0.get(r2)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r0.get(r1)
            X.59E r0 = (X.AnonymousClass59E) r0
            if (r0 == 0) goto L_0x00cf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.String r1 = "index_of_card"
            java.util.Map r0 = r0.A01
            r0.put(r1, r2)
            goto L_0x00cf
        L_0x0111:
            X.59G r0 = new X.59G
            r0.<init>(r12, r2, r1)
            r3.add(r0)
            goto L_0x00cf
        L_0x011a:
            boolean r0 = r8 instanceof com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar
            if (r0 == 0) goto L_0x0124
            r0 = r4
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r0 = (com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar) r0
            int r0 = r0.A03
            goto L_0x00ac
        L_0x0124:
            boolean r0 = r8 instanceof com.instagram.ui.widget.textview.IgTextLayoutView
            if (r0 == 0) goto L_0x0143
            if (r5 == 0) goto L_0x0143
            X.3aa r0 = X.C244063aa.DPA_HEADLINE
            if (r5 != r0) goto L_0x0143
            r0 = r4
            com.instagram.ui.widget.textview.IgTextLayoutView r0 = (com.instagram.ui.widget.textview.IgTextLayoutView) r0
            java.lang.Integer r0 = r0.A01
            goto L_0x00b0
        L_0x0135:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0143
            r1.addAll(r3)
            r3.clear()
        L_0x0143:
            boolean r0 = r8 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0165
            r13 = r8
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            boolean r0 = r13 instanceof com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager
            if (r0 == 0) goto L_0x043f
            r0 = r8
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            android.view.View r2 = r0.A0F
            if (r2 == 0) goto L_0x0165
            boolean r0 = r2.isShown()
            if (r0 == 0) goto L_0x0165
            X.9IZ r1 = new X.9IZ
            r1.<init>((android.view.View) r2, (X.C244063aa) r5, (boolean) r7)
            r0 = r20
            r0.add(r1)
        L_0x0165:
            java.lang.String r18 = A00(r8, r9, r11, r7)
            if (r5 == 0) goto L_0x0181
            r0 = r18
            boolean r0 = X.AnonymousClass59A.A05(r11, r0)
            if (r0 != 0) goto L_0x0181
            r2 = r8
            boolean r0 = r8.isShown()
            if (r0 != 0) goto L_0x037c
            X.0sn r1 = X.0sn.A00
        L_0x017c:
            r0 = r18
            A01(r5, r10, r0, r11, r1)
        L_0x0181:
            java.lang.String r2 = A00(r8, r9, r11, r7)
            if (r5 == 0) goto L_0x0034
            X.59A r7 = X.AnonymousClass59A.A00
            boolean r0 = X.AnonymousClass59A.A05(r11, r2)
            if (r0 != 0) goto L_0x0034
            boolean r1 = r8 instanceof android.widget.ImageView
            if (r1 == 0) goto L_0x0202
            r3 = r8
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            boolean r0 = r0 instanceof X.C244323b0
            if (r0 == 0) goto L_0x0202
            boolean r0 = r3.isShown()
            if (r0 == 0) goto L_0x01b6
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.drawables.PileDrawable"
            X.0qQ.A0C(r3, r0)
            X.3b0 r3 = (X.C244323b0) r3
            java.util.List r0 = X.C244083ac.A03(r8, r5, r3)
        L_0x01b3:
            A01(r5, r10, r2, r11, r0)
        L_0x01b6:
            boolean r0 = X.C244083ac.A06(r8)
            if (r0 == 0) goto L_0x01d2
            boolean r0 = r8.isShown()
            if (r0 == 0) goto L_0x01d2
            boolean r0 = r8 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            if (r0 == 0) goto L_0x01d7
            com.instagram.common.ui.widget.imageview.IgImageView r8 = (com.instagram.common.ui.widget.imageview.IgImageView) r8
            boolean r0 = r8.isShown()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x0034
        L_0x01d2:
            X.AnonymousClass59A.A04(r11, r2)
            goto L_0x0034
        L_0x01d7:
            if (r1 == 0) goto L_0x0034
            r0 = 2131434543(0x7f0b1c2f, float:1.8490903E38)
            java.lang.Object r0 = r8.getTag(r0)
            if (r0 != 0) goto L_0x01f3
            r1 = r8
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            if (r0 == 0) goto L_0x0034
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            boolean r0 = r0 instanceof X.C244323b0
            if (r0 == 0) goto L_0x0034
        L_0x01f3:
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            boolean r0 = r8.isShown()
            if (r0 == 0) goto L_0x0034
            android.graphics.drawable.Drawable r0 = r8.getDrawable()
            if (r0 == 0) goto L_0x0034
            goto L_0x01d2
        L_0x0202:
            boolean r3 = r8 instanceof com.instagram.common.ui.base.IgSimpleImageView
            if (r3 == 0) goto L_0x021e
            r0 = r4
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r12 = r0.getDrawable()
            boolean r0 = r12 instanceof X.C300635xX
            if (r0 != 0) goto L_0x0215
            boolean r0 = r12 instanceof X.C299325uw
            if (r0 == 0) goto L_0x021e
        L_0x0215:
            X.6L3 r0 = new X.6L3
            r0.<init>(r8, r5, r11)
        L_0x021a:
            r7.A08(r5, r0, r11, r2)
            goto L_0x01b6
        L_0x021e:
            boolean r0 = X.C244083ac.A06(r8)
            if (r0 == 0) goto L_0x022a
            X.59D r0 = new X.59D
            r0.<init>(r8, r5, r10, r11)
            goto L_0x021a
        L_0x022a:
            boolean r0 = r8.isShown()
            if (r0 == 0) goto L_0x0272
            boolean r0 = r8 instanceof android.widget.TextSwitcher
            if (r0 == 0) goto L_0x023a
            android.widget.ViewAnimator r4 = (android.widget.ViewAnimator) r4
            android.view.View r4 = r4.getCurrentView()
        L_0x023a:
            boolean r0 = r4 instanceof com.facebook.rendercore.text.RCTextView
            if (r0 == 0) goto L_0x0252
            r0 = r4
            com.facebook.rendercore.text.RCTextView r0 = (com.facebook.rendercore.text.RCTextView) r0
            java.lang.CharSequence r0 = r0.A03
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0252
        L_0x024c:
            X.59I r0 = new X.59I
            r0.<init>(r8, r5, r9, r11)
            goto L_0x021a
        L_0x0252:
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0267
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0267
            goto L_0x024c
        L_0x0267:
            boolean r0 = r4 instanceof com.instagram.ui.widget.textview.IgTextLayoutView
            if (r0 == 0) goto L_0x0272
            com.instagram.ui.widget.textview.IgTextLayoutView r4 = (com.instagram.ui.widget.textview.IgTextLayoutView) r4
            android.text.Layout r0 = r4.A00
            if (r0 == 0) goto L_0x0272
            goto L_0x024c
        L_0x0272:
            boolean r4 = r8 instanceof com.instagram.ui.simplevideolayout.SimpleVideoLayout
            r13 = 1
            if (r4 == 0) goto L_0x02bf
            r0 = 2131428813(0x7f0b05cd, float:1.8479281E38)
            java.lang.Object r0 = r8.getTag(r0)
            if (r0 != 0) goto L_0x0291
            boolean r0 = r10 instanceof X.C267324bN
            if (r0 == 0) goto L_0x0297
            r0 = r10
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0297
            boolean r0 = r0.CeS()
            if (r0 != r13) goto L_0x0297
        L_0x0291:
            X.5uv r0 = new X.5uv
            r0.<init>(r8, r5, r10, r11)
            goto L_0x021a
        L_0x0297:
            boolean r0 = r10 instanceof X.C53288Gla
            if (r0 == 0) goto L_0x02bf
            r0 = r10
            X.Gla r0 = (X.C53288Gla) r0
            int r12 = r0.A00
            if (r12 < 0) goto L_0x02bf
            X.Gz1 r14 = r0.A03
            java.util.List r0 = r14.A0B
            int r0 = r0.size()
            if (r12 >= r0) goto L_0x02bf
            java.util.List r0 = r14.A0B
            java.lang.Object r0 = r0.get(r12)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r0 = r0.A00()
            boolean r0 = r0.CeS()
            if (r0 == 0) goto L_0x02bf
            goto L_0x0291
        L_0x02bf:
            boolean r12 = r10 instanceof X.C255773uh
            if (r12 != 0) goto L_0x02da
            boolean r0 = r10 instanceof X.1Xj
            if (r0 != 0) goto L_0x02da
        L_0x02c7:
            boolean r0 = r8 instanceof com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar
            if (r0 != 0) goto L_0x02cd
            if (r19 == 0) goto L_0x0327
        L_0x02cd:
            boolean r0 = r8.isShown()
            if (r0 == 0) goto L_0x0327
            X.5td r0 = new X.5td
            r0.<init>(r8, r5, r10, r11)
            goto L_0x021a
        L_0x02da:
            boolean r0 = r10 instanceof X.1Xj
            if (r0 == 0) goto L_0x0317
            r12 = r10
            X.1Xj r12 = (X.1Xj) r12
            java.lang.String r0 = r12.getId()
            if (r0 == 0) goto L_0x0509
            java.lang.Integer r4 = r7.A06(r0)
            boolean r0 = r12.CeS()
            if (r0 != 0) goto L_0x0304
            if (r4 == 0) goto L_0x0315
            int r0 = r4.intValue()
            X.1Xj r0 = r12.A1c(r0)
            if (r0 != 0) goto L_0x02fe
            r0 = r12
        L_0x02fe:
            boolean r0 = r0.CeS()
            if (r0 == 0) goto L_0x0315
        L_0x0304:
            r12 = 1
        L_0x0305:
            boolean r0 = r8 instanceof com.instagram.ui.widget.framelayout.MediaFrameLayout
            if (r0 == 0) goto L_0x030e
        L_0x0309:
            X.3aa r4 = X.C244063aa.MEDIA
            r0 = 1
            if (r5 == r4) goto L_0x030f
        L_0x030e:
            r0 = 0
        L_0x030f:
            if (r12 == 0) goto L_0x02c7
            if (r0 == 0) goto L_0x02c7
            goto L_0x0291
        L_0x0315:
            r12 = 0
            goto L_0x0305
        L_0x0317:
            if (r12 == 0) goto L_0x02c7
            r0 = r10
            X.3uh r0 = (X.C255773uh) r0
            boolean r12 = r0.A1m()
            boolean r0 = r8 instanceof com.instagram.ui.widget.framelayout.MediaFrameLayout
            if (r0 != 0) goto L_0x0309
            if (r4 == 0) goto L_0x030e
            goto L_0x0309
        L_0x0327:
            if (r3 == 0) goto L_0x01b6
            r7 = r8
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.graphics.drawable.Drawable r0 = r7.getDrawable()
            boolean r0 = r0 instanceof X.2eG
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView"
            X.0qQ.A0C(r8, r0)
            android.content.Context r0 = r7.getContext()
            X.0qQ.A0A(r0)
            X.59F r4 = new X.59F
            r4.<init>(r0)
            r0 = r21
            int[] r14 = new int[r0]
            r7.getLocationOnScreen(r14)
            int r12 = r7.getWidth()
            int r3 = r7.getHeight()
            r0 = r14[r6]
            float r0 = (float) r0
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = r14[r13]
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Float[] r0 = new java.lang.Float[]{r6, r0}
            r4.A0H(r0, r12, r3)
            android.graphics.drawable.Drawable r0 = r7.getDrawable()
            r4.setImageDrawable(r0)
            X.C244083ac.A05(r4, r5)
            java.util.List r0 = java.util.Collections.singletonList(r4)
            X.0qQ.A07(r0)
            goto L_0x01b3
        L_0x037c:
            boolean r0 = r8 instanceof android.widget.TextSwitcher
            if (r0 == 0) goto L_0x0386
            android.widget.ViewAnimator r2 = (android.widget.ViewAnimator) r2
            android.view.View r2 = r2.getCurrentView()
        L_0x0386:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            boolean r0 = r2 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0439
            r0 = r2
            android.widget.TextView r0 = (android.widget.TextView) r0
            r22 = r0
            java.lang.CharSequence r1 = r22.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0439
            android.text.Spanned r1 = (android.text.Spanned) r1
            if (r1 == 0) goto L_0x0439
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x0439
            X.C244083ac.A04(r1, r2, r5, r13)
            android.graphics.drawable.Drawable[] r14 = r22.getCompoundDrawables()
            X.0qQ.A07(r14)
            int r0 = r14.length
            r17 = 1
            if (r0 == 0) goto L_0x0439
            android.content.Context r16 = r22.getContext()
            r0 = r21
            int[] r12 = new int[r0]
            r0 = r22
            r0.getLocationOnScreen(r12)
            r3 = r14[r6]
            if (r3 == 0) goto L_0x03fb
            X.0qQ.A0A(r16)
            X.59F r2 = new X.59F
            r0 = r16
            r2.<init>(r0)
            r1 = r12[r6]
            int r0 = r22.getPaddingLeft()
            int r1 = r1 + r0
            float r0 = (float) r1
            java.lang.Float r15 = java.lang.Float.valueOf(r0)
            r0 = r12[r17]
            float r0 = (float) r0
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            java.lang.Float[] r15 = new java.lang.Float[]{r15, r1}
            int r1 = r3.getIntrinsicWidth()
            int r0 = r3.getIntrinsicHeight()
            r2.A0H(r15, r1, r0)
            r2.setImageDrawable(r3)
            X.C244083ac.A05(r2, r5)
            r13.add(r2)
        L_0x03fb:
            r14 = r14[r21]
            if (r14 == 0) goto L_0x0439
            X.0qQ.A0A(r16)
            X.59F r3 = new X.59F
            r0 = r16
            r3.<init>(r0)
            r1 = r12[r6]
            int r0 = r22.getWidth()
            int r1 = r1 + r0
            int r0 = r14.getIntrinsicWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = r12[r17]
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Float[] r2 = new java.lang.Float[]{r1, r0}
            int r1 = r14.getIntrinsicWidth()
            int r0 = r14.getIntrinsicHeight()
            r3.A0H(r2, r1, r0)
            r3.setImageDrawable(r14)
            X.C244083ac.A05(r3, r5)
            r13.add(r3)
        L_0x0439:
            java.util.List r1 = X.00k.A0a(r13)
            goto L_0x017c
        L_0x043f:
            r12 = 0
            int r3 = r13.getChildCount()
        L_0x0444:
            if (r12 >= r3) goto L_0x045f
            android.view.View r2 = r13.getChildAt(r12)
            if (r2 == 0) goto L_0x045c
            boolean r0 = r2.isShown()
            if (r0 == 0) goto L_0x045c
            X.9IZ r1 = new X.9IZ
            r1.<init>((android.view.View) r2, (X.C244063aa) r5, (boolean) r7)
            r0 = r20
            r0.add(r1)
        L_0x045c:
            int r12 = r12 + 1
            goto L_0x0444
        L_0x045f:
            boolean r0 = r8 instanceof com.facebook.litho.ComponentHost
            if (r0 == 0) goto L_0x0165
            r13 = r8
            com.facebook.litho.ComponentHost r13 = (com.facebook.litho.ComponentHost) r13
            if (r5 == 0) goto L_0x0165
            int r12 = r13.getMountItemCount()
            r3 = 0
        L_0x046d:
            if (r3 >= r12) goto L_0x0165
            X.3e2 r1 = r13.A0H(r3)
            java.lang.Object r2 = r1.A04
            boolean r0 = r2 instanceof com.facebook.litho.TextContent
            if (r0 == 0) goto L_0x04e9
            com.facebook.litho.TextContent r2 = (com.facebook.litho.TextContent) r2
            java.util.List r0 = r2.getItems()
            java.lang.Object r2 = X.00k.A0J(r0)
            X.5FD r2 = (X.AnonymousClass5FD) r2
            if (r2 == 0) goto L_0x04a9
            java.lang.String r14 = A00(r13, r1, r11, r7)
            X.59A r1 = X.AnonymousClass59A.A00
            boolean r0 = X.AnonymousClass59A.A05(r11, r14)
            if (r0 != 0) goto L_0x04a9
            X.59I r0 = new X.59I
            r0.<init>(r13, r5, r2, r11)
            r1.A08(r5, r0, r11, r14)
            boolean r0 = r13.isShown()
            if (r0 != 0) goto L_0x04ac
            X.0sn r0 = X.0sn.A00
        L_0x04a3:
            A01(r5, r10, r14, r11, r0)
            X.AnonymousClass59A.A04(r11, r14)
        L_0x04a9:
            int r3 = r3 + 1
            goto L_0x046d
        L_0x04ac:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r0 = r13.getTextContentText()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r16 = r0.iterator()
        L_0x04be:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x04d0
            java.lang.Object r1 = r16.next()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x04be
            r15.add(r1)
            goto L_0x04be
        L_0x04d0:
            java.util.Iterator r1 = r15.iterator()
        L_0x04d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04e4
            java.lang.Object r0 = r1.next()
            android.text.Spanned r0 = (android.text.Spanned) r0
            X.C244083ac.A04(r0, r13, r5, r2)
            goto L_0x04d4
        L_0x04e4:
            java.util.List r0 = X.00k.A0a(r2)
            goto L_0x04a3
        L_0x04e9:
            boolean r0 = r2 instanceof X.2Ul
            if (r0 == 0) goto L_0x04a9
            X.2Ul r2 = (X.2Ul) r2
            android.graphics.drawable.Drawable r2 = r2.A00
            boolean r0 = r2 instanceof X.C244323b0
            if (r0 == 0) goto L_0x04a9
            boolean r0 = r13.isShown()
            if (r0 == 0) goto L_0x04a9
            java.lang.String r1 = A00(r13, r1, r11, r7)
            X.3b0 r2 = (X.C244323b0) r2
            java.util.List r0 = X.C244083ac.A03(r13, r5, r2)
            A01(r5, r10, r1, r11, r0)
            goto L_0x04a9
        L_0x0509:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0511:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0519:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230502pj.A02(X.30Y, X.3oY, java.lang.String, boolean):void");
    }

    public C230502pj(UserSession userSession) {
        this.A01 = userSession;
    }

    public static final void A01(C244063aa r5, Object obj, String str, String str2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            String A0b = 002.A0b(str, "\\_", view.getId());
            AnonymousClass59A r1 = AnonymousClass59A.A00;
            if (!AnonymousClass59A.A05(str2, A0b)) {
                r1.A08(r5, new AnonymousClass59D(view, r5, obj, str2), str2, A0b);
                AnonymousClass59A.A04(str2, A0b);
            }
        }
    }
}
