package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.4WO  reason: invalid class name */
public final class AnonymousClass4WO implements AnonymousClass4WK {
    public String A00;
    public C62320sa A01 = AnonymousClass4WP.A00;
    public 0sP A02 = AnonymousClass4WR.A00;
    public 0sL A03 = AnonymousClass4WQ.A00;
    public boolean A04;
    public boolean A05 = true;
    public AnonymousClass4WN A06 = new AnonymousClass4WN((Integer) null, (Integer) null, (Integer) null);
    public final C252063oV A07;

    public AnonymousClass4WO(C252063oV r4) {
        this.A07 = r4;
    }

    public static final ViewGroup A00(AnonymousClass4WO r1) {
        View requireViewById = r1.A07.getView().requireViewById(R.id.translated_text_sticker_container);
        0qQ.A07(requireViewById);
        return (ViewGroup) requireViewById;
    }

    public static final AnonymousClass4WN A01(AnonymousClass4WO r4) {
        Integer num;
        AnonymousClass4WN r1 = r4.A06;
        if (r1.A00()) {
            return r1;
        }
        View view = (View) r4.A07.getView().getParent();
        Integer num2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getWidth());
            num2 = Integer.valueOf(view.getHeight());
        } else {
            num = null;
        }
        AnonymousClass4WN r0 = new AnonymousClass4WN(num, num2, 0);
        r4.A06 = r0;
        return r0;
    }

    public static final void A02(View view, View view2, AnonymousClass4WN r8, C255783ui r9, float f) {
        int i;
        int i2;
        Integer num = r8.A01;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = r8.A00;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        C255783ui r1 = r9;
        float f2 = f;
        C306406Ma.A04(view, r1, f2, i, i2, true);
        C306406Ma.A04(view2, r1, f2, i, i2, false);
    }

    public final void A04(int i) {
        if (!this.A04 && this.A07.CFV() == 0) {
            this.A04 = true;
            this.A01.invoke();
        }
        this.A02.invoke(Float.valueOf((float) i));
    }

    public final boolean CcZ() {
        return this.A05;
    }

    public final boolean FLi(boolean z, boolean z2) {
        if (z == this.A05) {
            return false;
        }
        this.A05 = z;
        this.A03.invoke(Boolean.valueOf(z), Boolean.valueOf(z2));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r7 != null) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.common.session.UserSession r17, X.AnonymousClass4WO r18, java.lang.Boolean r19, java.lang.Float r20, X.AnonymousClass2U7 r21) {
        /*
            java.util.Iterator r10 = r21.iterator()
        L_0x0004:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r3 = r10.next()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r1 = r3.getTag()
            boolean r0 = r1 instanceof X.C45384CvQ
            if (r0 == 0) goto L_0x0004
            r2 = 0
            if (r20 == 0) goto L_0x003d
            r0 = r1
            X.CvQ r0 = (X.C45384CvQ) r0
            float r5 = r20.floatValue()
            java.lang.Float r4 = r0.A02
            if (r4 == 0) goto L_0x003a
            java.lang.Float r0 = r0.A01
            if (r0 == 0) goto L_0x003a
            float r0 = r0.floatValue()
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01c7
            float r0 = r4.floatValue()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x01c7
        L_0x003a:
            r3.setVisibility(r2)
        L_0x003d:
            if (r19 == 0) goto L_0x0004
            boolean r0 = r3 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0004
            X.CvQ r1 = (X.C45384CvQ) r1
            boolean r0 = r19.booleanValue()
            if (r0 == 0) goto L_0x01bd
            java.lang.String r5 = r1.A03
        L_0x004d:
            if (r5 == 0) goto L_0x0004
            r0 = r18
            X.3oV r0 = r0.A07
            android.view.View r0 = r0.getView()
            android.content.Context r11 = r0.getContext()
            X.0qQ.A07(r11)
            X.DUv r7 = r1.A00
            if (r7 == 0) goto L_0x0068
            java.lang.String r1 = r7.C5C()
            if (r1 != 0) goto L_0x006c
        L_0x0068:
            java.lang.String r1 = "classic_v2"
            if (r7 == 0) goto L_0x0076
        L_0x006c:
            java.lang.Boolean r0 = r7.CTq()
            if (r0 == 0) goto L_0x0076
            boolean r2 = r0.booleanValue()
        L_0x0076:
            r13 = 0
            r6 = 0
            X.8bb r4 = X.C358878bc.A01(r1, r2, r13, r13, r13)
            r1 = 0
            if (r7 == 0) goto L_0x01b9
            java.lang.Float r9 = r7.B79()
            java.lang.String r0 = r7.getTextColor()
        L_0x0087:
            java.lang.Integer r0 = X.0nH.A0D(r0)
            if (r0 == 0) goto L_0x01b6
            int r15 = r0.intValue()
        L_0x0091:
            if (r7 == 0) goto L_0x01b3
            java.lang.String r2 = r7.B0s()
        L_0x0097:
            java.util.Map r0 = com.instagram.api.schemas.ClipsTextEmphasisMode.A01
            java.lang.Object r0 = r0.get(r2)
            com.instagram.api.schemas.ClipsTextEmphasisMode r0 = (com.instagram.api.schemas.ClipsTextEmphasisMode) r0
            if (r0 != 0) goto L_0x00a3
            com.instagram.api.schemas.ClipsTextEmphasisMode r0 = com.instagram.api.schemas.ClipsTextEmphasisMode.UNRECOGNIZED
        L_0x00a3:
            int r2 = r0.ordinal()
            r0 = 5
            if (r2 == r0) goto L_0x01af
            r0 = 1
            if (r2 == r0) goto L_0x01ab
            r0 = 2
            if (r2 == r0) goto L_0x01a7
            r0 = 6
            if (r2 == r0) goto L_0x01a3
            X.6Mr r2 = X.C306576Mr.DISABLED
        L_0x00b5:
            if (r7 == 0) goto L_0x00bb
            java.lang.String r1 = r7.C4s()
        L_0x00bb:
            java.util.Map r0 = com.instagram.api.schemas.ClipsTextAlignment.A01
            java.lang.Object r1 = r0.get(r1)
            com.instagram.api.schemas.ClipsTextAlignment r1 = (com.instagram.api.schemas.ClipsTextAlignment) r1
            if (r1 != 0) goto L_0x00c7
            com.instagram.api.schemas.ClipsTextAlignment r1 = com.instagram.api.schemas.ClipsTextAlignment.UNRECOGNIZED
        L_0x00c7:
            com.instagram.api.schemas.ClipsTextAlignment r0 = com.instagram.api.schemas.ClipsTextAlignment.UNRECOGNIZED
            if (r1 != r0) goto L_0x018b
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00cd:
            r8 = 1
            r1 = r17
            X.0qQ.A0B(r1, r8)
            android.text.Editable$Factory r1 = android.text.Editable.Factory.getInstance()
            android.text.Editable r12 = r1.newEditable(r5)
            X.0qQ.A0A(r12)
            X.AnonymousClass91Z.A00(r12, r4)
            X.AnonymousClass91U.A02(r11, r12, r4)
            X.8bi r1 = r4.A06
            int r7 = r1.A00(r11)
            X.6Ly r1 = new X.6Ly
            r1.<init>(r11, r7)
            r1.A0L(r12)
            r1.A0K(r0)
            if (r9 == 0) goto L_0x010c
            float r9 = r9.floatValue()
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r7 = r0.getDisplayMetrics()
            android.graphics.RectF r0 = X.0nA.A01
            float r0 = android.util.TypedValue.applyDimension(r8, r9, r7)
            r1.A0A(r0)
        L_0x010c:
            X.0qq r7 = X.AnonymousClass0qo.A00(r11)
            X.0qm r0 = X.0qm.A0z
            android.graphics.Typeface r0 = r7.A02(r0)
            r1.A0I(r0)
            X.AnonymousClass91Y.A00(r6, r4, r1)
            r1.A09()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A0M = r0
            X.C358948bj.A03(r12)
            int r7 = X.0nH.A04(r15)
            X.6Mr r0 = X.C306576Mr.OUTLINED
            if (r2 == r0) goto L_0x0189
            X.6Mr r0 = X.C306576Mr.INVERTED_OUTLINED
            if (r2 != r0) goto L_0x017a
            r0 = r7
        L_0x0133:
            r1.A0F(r0)
            X.8bh r8 = r4.A05
            r5 = 0
            android.text.StaticLayout r6 = r1.A0G
            r0 = 3645(0xe3d, float:5.108E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r6, r0)
            float[][] r0 = X.A1T.A00(r6)
            X.91R r6 = new X.91R
            r6.<init>(r11, r8, r0, r5)
            r6.A03 = r2
            r6.ESD(r15, r7)
            android.text.Spannable r5 = r1.A0F
            int r2 = r5.length()
            r0 = 65554(0x10012, float:9.1861E-41)
            r5.setSpan(r6, r13, r2, r0)
        L_0x015e:
            android.text.TextPaint r5 = r1.A0b
            float r0 = r5.getTextSize()
            float r2 = X.C39815AAm.A00(r11, r12, r4, r1, r0)
            float r0 = r5.getTextSize()
            float r0 = X.C39815AAm.A01(r11, r12, r4, r1, r0)
            r1.A0C(r2, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3.setImageDrawable(r1)
            goto L_0x0004
        L_0x017a:
            X.8f1 r0 = r4.A04
            X.C358948bj.A02(r11, r2, r0, r1)
            int r14 = r5.length()
            r16 = r7
            X.C358838bY.A03(r11, r12, r13, r14, r15, r16)
            goto L_0x015e
        L_0x0189:
            r0 = r15
            goto L_0x0133
        L_0x018b:
            int[] r0 = X.A2P.A00
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x019f
            r0 = 3
            if (r1 == r0) goto L_0x019b
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x00cd
        L_0x019b:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x00cd
        L_0x019f:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x00cd
        L_0x01a3:
            X.6Mr r2 = X.C306576Mr.INVERTED_OUTLINED
            goto L_0x00b5
        L_0x01a7:
            X.6Mr r2 = X.C306576Mr.OUTLINED
            goto L_0x00b5
        L_0x01ab:
            X.6Mr r2 = X.C306576Mr.DEFAULT
            goto L_0x00b5
        L_0x01af:
            X.6Mr r2 = X.C306576Mr.INVERTED
            goto L_0x00b5
        L_0x01b3:
            r2 = r6
            goto L_0x0097
        L_0x01b6:
            r15 = -1
            goto L_0x0091
        L_0x01b9:
            r9 = r6
            r0 = r6
            goto L_0x0087
        L_0x01bd:
            X.DUv r0 = r1.A00
            if (r0 == 0) goto L_0x0004
            java.lang.String r5 = r0.getText()
            goto L_0x004d
        L_0x01c7:
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x003d
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WO.A03(com.instagram.common.session.UserSession, X.4WO, java.lang.Boolean, java.lang.Float, X.2U7):void");
    }
}
