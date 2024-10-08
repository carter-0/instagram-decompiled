package X;

import android.widget.CompoundButton;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class IEB implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public IEB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(IgdsListCell igdsListCell, Object obj, int i) {
        igdsListCell.A0D(new IEB(obj, i));
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [X.Gge, X.2YL] */
    /* JADX WARNING: type inference failed for: r5v8, types: [X.Gge, X.2YL] */
    /* JADX WARNING: type inference failed for: r0v109, types: [java.lang.Object, X.JtT] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        r1.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03fe, code lost:
        r1 = new X.MG2(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0403, code lost:
        X.AnonymousClass7TE.A1Z(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0406, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r36, boolean r37) {
        /*
            r35 = this;
            r1 = r35
            int r0 = r1.A00
            r6 = r37
            switch(r0) {
                case 0: goto L_0x0407;
                case 1: goto L_0x03d6;
                case 2: goto L_0x03ad;
                case 3: goto L_0x0347;
                case 4: goto L_0x02ec;
                case 5: goto L_0x028d;
                case 6: goto L_0x027c;
                case 7: goto L_0x0023;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            X.H0c r0 = (X.C54133H0c) r0
            X.0eM r0 = r0.A0B
            java.lang.Object r1 = r0.getValue()
            X.JiA r1 = (X.C60253JiA) r1
            boolean r0 = X.AnonymousClass7TF.A1P(r6)
            X.2Fj r1 = r1.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x001f:
            r1.A0B(r0)
        L_0x0022:
            return
        L_0x0023:
            java.lang.String r16 = "lipSyncOptInToggle"
            r4 = 0
            java.lang.Object r3 = r1.A01
            X.H0c r3 = (X.C54133H0c) r3
            if (r37 == 0) goto L_0x0209
            X.0eM r8 = r3.A0C
            X.27r r1 = X.C51971G9r.A0g(r8)
            X.80P r0 = X.AnonymousClass80P.TRANSLATE_AND_DUB_ON
            r1.A1X(r0)
            X.0eM r0 = r3.A0D
            java.lang.Object r5 = r0.getValue()
            X.1Av r5 = (X.1Av) r5
            X.0s0 r2 = r5.A2c
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 189(0xbd, float:2.65E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r5, r2, r1, r0)
            if (r0 != 0) goto L_0x019b
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r8)
            android.content.Context r0 = r3.requireContext()
            X.Hms r2 = new X.Hms
            r2.<init>(r0, r1, r3)
            android.content.Context r1 = r2.A00
            int r9 = X.2Yu.A08(r1)
            com.instagram.common.session.UserSession r7 = r2.A01
            r15 = 2131955261(0x7f130e3d, float:1.9547044E38)
            r0 = 2131955256(0x7f130e38, float:1.9547034E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131238544(0x7f081e90, float:1.809337E38)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r5 = new com.instagram.ui.primer.IconConfig$SimpleIconConfig
            r5.<init>(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r0 = 0
            com.instagram.ui.primer.InfoItem r11 = new com.instagram.ui.primer.InfoItem
            r11.<init>(r5, r12, r6, r0)
            r5 = 2131955258(0x7f130e3a, float:1.9547038E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r1, r5)
            r6 = 2131237869(0x7f081bed, float:1.8092E38)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r5 = new com.instagram.ui.primer.IconConfig$SimpleIconConfig
            r5.<init>(r6)
            com.instagram.ui.primer.InfoItem r10 = new com.instagram.ui.primer.InfoItem
            r10.<init>(r5, r12, r9, r0)
            r34 = 1
            r5 = 2131955257(0x7f130e39, float:1.9547036E38)
            java.lang.String r13 = X.AnonymousClass7TE.A16(r1, r5)
            r6 = 2131238261(0x7f081d75, float:1.8092796E38)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r5 = new com.instagram.ui.primer.IconConfig$SimpleIconConfig
            r5.<init>(r6)
            com.instagram.ui.primer.InfoItem r9 = new com.instagram.ui.primer.InfoItem
            r9.<init>(r5, r12, r13, r0)
            X.0Tu r13 = X.0Tu.A05
            r5 = 36323156898163624(0x810bb800092ba8, double:3.0342489117871753E-306)
            boolean r5 = X.C51965G9l.A1a(r13, r7, r5)
            r14 = 0
            if (r5 == 0) goto L_0x00c8
            r5 = 2131955255(0x7f130e37, float:1.9547032E38)
            java.lang.String r13 = X.AnonymousClass7TE.A16(r1, r5)
            r6 = 2131237971(0x7f081c53, float:1.8092208E38)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r5 = new com.instagram.ui.primer.IconConfig$SimpleIconConfig
            r5.<init>(r6)
            com.instagram.ui.primer.InfoItem r14 = new com.instagram.ui.primer.InfoItem
            r14.<init>(r5, r12, r13, r0)
        L_0x00c8:
            r5 = 2131955254(0x7f130e36, float:1.954703E38)
            java.lang.String r13 = X.AnonymousClass7TE.A16(r1, r5)
            r5 = 2131238503(0x7f081e67, float:1.8093287E38)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r6 = new com.instagram.ui.primer.IconConfig$SimpleIconConfig
            r6.<init>(r5)
            com.instagram.ui.primer.InfoItem r5 = new com.instagram.ui.primer.InfoItem
            r5.<init>(r6, r12, r13, r0)
            com.instagram.ui.primer.InfoItem[] r5 = new com.instagram.ui.primer.InfoItem[]{r11, r10, r9, r14, r5}
            java.util.List r30 = X.C51967G9n.A0s(r5)
            r5 = 2131955259(0x7f130e3b, float:1.954704E38)
            java.lang.String r27 = X.AnonymousClass7TE.A16(r1, r5)
            r5 = 2131955260(0x7f130e3c, float:1.9547042E38)
            java.lang.String r28 = X.AnonymousClass7TE.A16(r1, r5)
            r9 = 2131165184(0x7f070000, float:1.7944578E38)
            r6 = 2131165230(0x7f07002e, float:1.7944671E38)
            r5 = 2132018053(0x7f140385, float:1.9674402E38)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r5)
            java.lang.String r26 = "audio_translations_consent_blocking_nux"
            r31 = 2131955262(0x7f130e3e, float:1.9547047E38)
            com.instagram.ui.primer.PrimerBottomSheetConfig r17 = new com.instagram.ui.primer.PrimerBottomSheetConfig
            r22 = r20
            r23 = r20
            r24 = r20
            r29 = r0
            r32 = r4
            r33 = r4
            r18 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = 2131955253(0x7f130e35, float:1.9547028E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131955250(0x7f130e32, float:1.9547022E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131955251(0x7f130e33, float:1.9547024E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r1, r0)
            int r0 = X.2Yu.A06(r1)
            int r0 = r1.getColor(r0)
            X.ESv r9 = new X.ESv
            r9.<init>((X.C55757Hms) r2, (java.lang.String) r12, (int) r0)
            r0 = 14
            X.Dj8 r6 = new X.Dj8
            r6.<init>(r2, r0)
            r0 = 15
            X.Dj8 r5 = new X.Dj8
            r5.<init>(r2, r0)
            r13 = 2131955252(0x7f130e34, float:1.9547026E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r10, r12}
            java.lang.String r0 = r1.getString(r13, r0)
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r0)
            X.AnonymousClass7AV.A05(r0, r9, r12)
            X.AnonymousClass7AV.A05(r0, r6, r11)
            X.AnonymousClass7AV.A05(r0, r5, r10)
            X.LOZ r5 = new X.LOZ
            r9 = r5
            r10 = r7
            r11 = r17
            r12 = r0
            r13 = r4
            r14 = r4
            r15 = r34
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0 = 33
            X.ICy r0 = X.C56801ICy.A00(r2, r0)
            r5.A00 = r0
            r0 = 34
            X.ICy r0 = X.C56801ICy.A00(r2, r0)
            r5.A01 = r0
            X.27r r0 = X.27p.A01(r7)
            r0.A0l()
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()
            X.Iho r0 = new X.Iho
            r0.<init>(r5, r2)
            r1.post(r0)
        L_0x019b:
            r5 = 1
            X.C54133H0c.A01(r3, r5)
            X.0eM r7 = r3.A0B
            java.lang.Object r0 = r7.getValue()
            X.JiA r0 = (X.C60253JiA) r0
            r0.A01(r5)
            java.lang.Object r10 = r7.getValue()
            X.JiA r10 = (X.C60253JiA) r10
            com.instagram.common.session.UserSession r11 = X.DbW.A0S(r8, r4)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.lang.String r1 = "eng"
            java.lang.String r0 = "spa"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r2 = X.0sr.A1P(r0)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36886106851508918(0x830bb8000802b6, double:3.3902607291002535E-306)
            java.lang.String r1 = X.182.A04(r6, r11, r0)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01d9
            java.util.List r2 = X.DbX.A0x(r1)
        L_0x01d9:
            java.util.Iterator r11 = r2.iterator()
        L_0x01dd:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0239
            java.lang.String r2 = X.AnonymousClass7TE.A18(r11)
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = r0.getISO3Language()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x01dd
            java.lang.String r1 = X.AnonymousClass3WS.A01(r2)
            X.0qQ.A0B(r2, r5)
            X.JtT r0 = new X.JtT
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r1
            r9.add(r0)
            goto L_0x01dd
        L_0x0209:
            X.0eM r0 = r3.A0C
            X.27r r1 = X.C51971G9r.A0g(r0)
            X.80P r0 = X.AnonymousClass80P.TRANSLATE_AND_DUB_OFF
            r1.A1X(r0)
            X.C54133H0c.A01(r3, r4)
            X.0eM r1 = r3.A0B
            java.lang.Object r0 = r1.getValue()
            X.JiA r0 = (X.C60253JiA) r0
            r0.A01(r4)
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x022d
            com.instagram.igds.components.textcell.IgdsListCell r0 = r3.A04
            if (r0 == 0) goto L_0x0244
            r0.setChecked(r4)
        L_0x022d:
            java.lang.Object r0 = r1.getValue()
            X.JiA r0 = (X.C60253JiA) r0
            X.2Fj r1 = r0.A02
            X.0sn r0 = X.0sn.A00
            goto L_0x001f
        L_0x0239:
            X.2Fj r0 = r10.A02
            r0.A0B(r9)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r3.A03
            if (r1 != 0) goto L_0x024c
            java.lang.String r16 = "audioTranslationsLanguageSelector"
        L_0x0244:
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x024c:
            java.lang.Object r0 = r7.getValue()
            X.JiA r0 = (X.C60253JiA) r0
            java.util.List r0 = r0.A00()
            int r0 = r0.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.A0K(r0, r4)
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0022
            X.0lg r2 = X.DbT.A0X(r8)
            r0 = 36323156898294698(0x810bb8000b2baa, double:3.034248911870067E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            r3.A0A = r0
            com.instagram.igds.components.textcell.IgdsListCell r0 = r3.A04
            if (r0 == 0) goto L_0x0244
            r0.setChecked(r5)
            return
        L_0x027c:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.0xY r1 = X.AnonymousClass7TF.A0N(r0)
            java.lang.String r0 = "show_suggestion_netego_unit_type_in_header"
            r1.E5T(r0, r6)
            r1.apply()
            return
        L_0x028d:
            java.lang.Object r0 = r1.A01
            X.H0F r0 = (X.H0F) r0
            X.0eM r0 = r0.A04
            java.lang.Object r5 = r0.getValue()
            X.Gge r5 = (X.C52987Gge) r5
            X.05G r4 = r5.A01
            if (r37 != 0) goto L_0x02d9
            java.lang.Object r0 = r4.getValue()
            X.JVq r0 = (X.C59732JVq) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x02c5
        L_0x02a7:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JVq r0 = (X.C59732JVq) r0
            r6 = 0
            boolean r2 = r0.A00
            r1 = 1
            r0 = 0
            boolean r0 = X.C51975G9x.A1b(r3, r4, r1, r2, r0)
            if (r0 == 0) goto L_0x02a7
        L_0x02b9:
            X.6oS r2 = X.C318116oQ.A00(r5)
            r0 = 0
            X.ImS r1 = new X.ImS
            r1.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r0)
            goto L_0x0403
        L_0x02c5:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JVq r0 = (X.C59732JVq) r0
            r6 = 0
            boolean r2 = r0.A01
            boolean r1 = r0.A00
            r0 = 0
            boolean r0 = X.C51975G9x.A1b(r3, r4, r2, r1, r0)
            if (r0 == 0) goto L_0x02c5
            goto L_0x02b9
        L_0x02d9:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JVq r0 = (X.C59732JVq) r0
            r6 = 0
            boolean r2 = r0.A00
            r1 = 0
            r0 = 1
            boolean r0 = X.C51975G9x.A1b(r3, r4, r1, r2, r0)
            if (r0 == 0) goto L_0x02d9
            goto L_0x02b9
        L_0x02ec:
            java.lang.Object r0 = r1.A01
            X.H0F r0 = (X.H0F) r0
            X.0eM r0 = r0.A04
            java.lang.Object r5 = r0.getValue()
            X.Gge r5 = (X.C52987Gge) r5
            X.05G r4 = r5.A01
            if (r37 != 0) goto L_0x0334
            java.lang.Object r0 = r4.getValue()
            X.JVq r0 = (X.C59732JVq) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0320
        L_0x0306:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JVq r0 = (X.C59732JVq) r0
            r6 = 0
            boolean r2 = r0.A02
            r1 = 1
            r0 = 0
            boolean r0 = X.C51975G9x.A1b(r3, r4, r1, r0, r2)
            if (r0 == 0) goto L_0x0306
        L_0x0318:
            X.6oS r2 = X.C318116oQ.A00(r5)
            r0 = 48
            goto L_0x03fe
        L_0x0320:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JVq r0 = (X.C59732JVq) r0
            r6 = 0
            boolean r2 = r0.A01
            boolean r1 = r0.A02
            r0 = 0
            boolean r0 = X.C51975G9x.A1b(r3, r4, r2, r0, r1)
            if (r0 == 0) goto L_0x0320
            goto L_0x0318
        L_0x0334:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JVq r0 = (X.C59732JVq) r0
            r6 = 0
            boolean r2 = r0.A02
            r1 = 0
            r0 = 1
            boolean r0 = X.C51975G9x.A1b(r3, r4, r1, r0, r2)
            if (r0 == 0) goto L_0x0334
            goto L_0x0318
        L_0x0347:
            java.lang.Object r0 = r1.A01
            X.H0F r0 = (X.H0F) r0
            X.0eM r0 = r0.A04
            java.lang.Object r5 = r0.getValue()
            X.Gge r5 = (X.C52987Gge) r5
            X.05G r4 = r5.A01
            if (r37 != 0) goto L_0x0399
            java.lang.Object r0 = r4.getValue()
            X.JVq r0 = (X.C59732JVq) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0386
            java.lang.Object r0 = r4.getValue()
            X.JVq r0 = (X.C59732JVq) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0386
        L_0x036b:
            java.lang.Object r6 = r4.getValue()
            r3 = 0
            r2 = 1
            r1 = 9
            X.JVq r0 = new X.JVq
            r0.<init>((boolean) r3, (boolean) r2, (boolean) r2, (int) r1)
            boolean r0 = r4.AIY(r6, r0)
            if (r0 == 0) goto L_0x036b
        L_0x037e:
            X.6oS r2 = X.C318116oQ.A00(r5)
            r6 = 0
            r0 = 49
            goto L_0x03fe
        L_0x0386:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JVq r0 = (X.C59732JVq) r0
            boolean r2 = r0.A00
            boolean r1 = r0.A02
            r0 = 0
            boolean r0 = X.C51975G9x.A1b(r3, r4, r0, r2, r1)
            if (r0 == 0) goto L_0x0386
            goto L_0x037e
        L_0x0399:
            java.lang.Object r6 = r4.getValue()
            r3 = 1
            r2 = 0
            r1 = 9
            X.JVq r0 = new X.JVq
            r0.<init>((boolean) r3, (boolean) r2, (boolean) r2, (int) r1)
            boolean r0 = r4.AIY(r6, r0)
            if (r0 == 0) goto L_0x0399
            goto L_0x037e
        L_0x03ad:
            java.lang.Object r0 = r1.A01
            X.H0E r0 = (X.H0E) r0
            X.0eM r0 = r0.A01
            java.lang.Object r5 = r0.getValue()
            X.Ggd r5 = (X.C52986Ggd) r5
            X.05G r4 = r5.A01
        L_0x03bb:
            java.lang.Object r3 = r4.getValue()
            r2 = r37 ^ 1
            r1 = 21
            X.Jvg r0 = new X.Jvg
            r0.<init>((boolean) r2, (boolean) r6, (int) r1)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x03bb
            X.6oS r2 = X.C318116oQ.A00(r5)
            r6 = 0
            r0 = 46
            goto L_0x03fe
        L_0x03d6:
            java.lang.Object r0 = r1.A01
            X.H0E r0 = (X.H0E) r0
            X.0eM r0 = r0.A01
            java.lang.Object r5 = r0.getValue()
            X.Ggd r5 = (X.C52986Ggd) r5
            X.05G r4 = r5.A01
        L_0x03e4:
            java.lang.Object r3 = r4.getValue()
            r2 = r37 ^ 1
            r1 = 21
            X.Jvg r0 = new X.Jvg
            r0.<init>((boolean) r6, (boolean) r2, (int) r1)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x03e4
            X.6oS r2 = X.C318116oQ.A00(r5)
            r6 = 0
            r0 = 47
        L_0x03fe:
            X.MG2 r1 = new X.MG2
            r1.<init>(r5, r6, r0)
        L_0x0403:
            X.AnonymousClass7TE.A1Z(r1, r2)
            return
        L_0x0407:
            java.lang.Object r0 = r1.A01
            X.0sP r0 = (X.0sP) r0
            X.C51968G9o.A1O(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IEB.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
