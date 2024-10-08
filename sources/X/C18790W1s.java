package X;

import android.content.Context;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.W1s  reason: case insensitive filesystem */
public abstract class C18790W1s {
    public static final SpannableStringBuilder A00(Context context, C2802550x r9, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r9.A00);
        int A05 = DbX.A05(r9.A00);
        for (C2802650z r0 : r9.A01) {
            int i = r0.A02;
            int i2 = r0.A00;
            int i3 = r0.A01;
            if (i >= 0 && i2 >= 0) {
                Object A02 = A02(context, r0, z);
                if (A02 instanceof AnonymousClass91V) {
                    AnonymousClass91Z.A00(spannableStringBuilder, ((AnonymousClass91V) A02).A03);
                }
                if (i > A05) {
                    i = A05;
                }
                if (i2 > A05) {
                    i2 = A05;
                }
                spannableStringBuilder.setSpan(A02, i, i2, i3);
            }
        }
        return spannableStringBuilder;
    }

    public static final C2802550x A01(Spannable spannable, boolean z) {
        if (spannable == null || 00l.A0W(spannable)) {
            return new C2802550x((String) null);
        }
        C2802550x r2 = new C2802550x(spannable.toString());
        for (Class A03 : A2N.A00) {
            A03(spannable, r2, A03);
        }
        if (!z) {
            return r2;
        }
        A03(spannable, r2, StyleSpan.class);
        return r2;
    }

    /* JADX WARNING: type inference failed for: r5v16, types: [X.91X, android.text.style.MetricAffectingSpan, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0240, code lost:
        if (r10 != null) goto L_0x0244;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(android.content.Context r20, X.C2802650z r21, boolean r22) {
        /*
            java.lang.String r4 = "Unsupported SpanMetadataModelType: "
            r11 = 1
            r0 = r21
            X.0qQ.A0B(r0, r11)
            java.lang.Integer r13 = r0.A00()
            java.lang.String r1 = r0.A04     // Catch:{ IOException -> 0x03ab }
            if (r1 == 0) goto L_0x0398
            int r0 = r13.intValue()     // Catch:{ IOException -> 0x03ab }
            java.lang.String r2 = "Required value was null."
            r15 = r20
            switch(r0) {
                case 0: goto L_0x0392;
                case 1: goto L_0x034e;
                case 2: goto L_0x033a;
                case 3: goto L_0x007a;
                case 4: goto L_0x005e;
                case 5: goto L_0x038c;
                case 6: goto L_0x031a;
                case 7: goto L_0x0386;
                case 8: goto L_0x02f7;
                case 9: goto L_0x02a8;
                case 10: goto L_0x0288;
                case 11: goto L_0x0215;
                case 12: goto L_0x01f3;
                case 13: goto L_0x01a1;
                case 14: goto L_0x013b;
                case 15: goto L_0x017f;
                case 16: goto L_0x00d4;
                case 17: goto L_0x013b;
                case 18: goto L_0x00e9;
                case 19: goto L_0x001d;
                case 20: goto L_0x00a7;
                case 21: goto L_0x001b;
                case 22: goto L_0x0095;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x03a2
        L_0x001d:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUq r9 = X.VIT.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            if (r20 == 0) goto L_0x0057
            float r8 = r9.A02     // Catch:{ IOException -> 0x03ab }
            float r7 = r9.A00     // Catch:{ IOException -> 0x03ab }
            float r6 = r9.A01     // Catch:{ IOException -> 0x03ab }
            X.VYq r0 = r9.A06     // Catch:{ IOException -> 0x03ab }
            int r5 = r0.A01     // Catch:{ IOException -> 0x03ab }
            int r3 = r0.A03     // Catch:{ IOException -> 0x03ab }
            int r2 = r0.A02     // Catch:{ IOException -> 0x03ab }
            int r1 = r0.A00     // Catch:{ IOException -> 0x03ab }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r5, r3, r2, r1)     // Catch:{ IOException -> 0x03ab }
            X.WeE r14 = new X.WeE     // Catch:{ IOException -> 0x03ab }
            r16 = r0
            r17 = r8
            r18 = r7
            r19 = r6
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ IOException -> 0x03ab }
            X.6Mr r0 = r9.A05     // Catch:{ IOException -> 0x03ab }
            r14.Eo9(r0)     // Catch:{ IOException -> 0x03ab }
            int r1 = r9.A03     // Catch:{ IOException -> 0x03ab }
            int r0 = r9.A04     // Catch:{ IOException -> 0x03ab }
            r14.ESD(r1, r0)     // Catch:{ IOException -> 0x03ab }
            goto L_0x01eb
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x005e:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUf r0 = X.VIH.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            int r1 = r0.A00     // Catch:{ IOException -> 0x03ab }
            com.instagram.model.hashtag.HashtagImpl r0 = r0.A01     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x0073
            X.Ukf r5 = new X.Ukf     // Catch:{ IOException -> 0x03ab }
            r5.<init>((com.instagram.model.hashtag.Hashtag) r0, (int) r1)     // Catch:{ IOException -> 0x03ab }
            goto L_0x0319
        L_0x0073:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x007a:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUg r0 = X.VII.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            int r1 = r0.A00     // Catch:{ IOException -> 0x03ab }
            com.instagram.user.model.User r0 = r0.A01     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x008e
            X.91O r5 = new X.91O     // Catch:{ IOException -> 0x03ab }
            r5.<init>((com.instagram.user.model.User) r0, (int) r1)     // Catch:{ IOException -> 0x03ab }
            return r5
        L_0x008e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x0095:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUd r0 = X.VIW.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            float r0 = r0.A00     // Catch:{ IOException -> 0x03ab }
            X.91X r5 = new X.91X     // Catch:{ IOException -> 0x03ab }
            r5.<init>()     // Catch:{ IOException -> 0x03ab }
            r5.A00 = r0     // Catch:{ IOException -> 0x03ab }
            return r5
        L_0x00a7:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.Abu r3 = X.A1V.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            if (r20 == 0) goto L_0x00cd
            java.lang.String r1 = r3.A00     // Catch:{ IOException -> 0x03ab }
            if (r1 == 0) goto L_0x00c6
            r0 = 0
            r2 = r22
            X.8bb r0 = X.C358878bc.A01(r1, r2, r0, r0, r0)     // Catch:{ IOException -> 0x03ab }
            X.91V r1 = new X.91V     // Catch:{ IOException -> 0x03ab }
            r1.<init>(r15, r0)     // Catch:{ IOException -> 0x03ab }
            boolean r0 = r3.A01     // Catch:{ IOException -> 0x03ab }
            r1.A00 = r0     // Catch:{ IOException -> 0x03ab }
            return r1
        L_0x00c6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x00cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x00d4:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUi r0 = X.VIR.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            X.U2E r5 = new X.U2E     // Catch:{ IOException -> 0x03ab }
            r5.<init>()     // Catch:{ IOException -> 0x03ab }
            int r1 = r0.A01     // Catch:{ IOException -> 0x03ab }
            int r0 = r0.A00     // Catch:{ IOException -> 0x03ab }
            r5.ESD(r1, r0)     // Catch:{ IOException -> 0x03ab }
            return r5
        L_0x00e9:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUp r7 = X.VIV.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            if (r20 == 0) goto L_0x0134
            float r9 = r7.A00     // Catch:{ IOException -> 0x03ab }
            java.util.List r10 = r7.A04     // Catch:{ IOException -> 0x03ab }
            r8 = 0
            if (r10 == 0) goto L_0x011f
            int r0 = r10.size()     // Catch:{ IOException -> 0x03ab }
            float[][] r6 = new float[r0][]     // Catch:{ IOException -> 0x03ab }
            int r5 = r10.size()     // Catch:{ IOException -> 0x03ab }
            r3 = 0
        L_0x0105:
            if (r3 >= r5) goto L_0x0121
            java.lang.Object r2 = r10.get(r3)     // Catch:{ IOException -> 0x03ab }
            X.VTy r2 = (X.C17397VTy) r2     // Catch:{ IOException -> 0x03ab }
            if (r2 == 0) goto L_0x011c
            r0 = 2
            float[] r1 = new float[r0]     // Catch:{ IOException -> 0x03ab }
            float r0 = r2.A00     // Catch:{ IOException -> 0x03ab }
            r1[r8] = r0     // Catch:{ IOException -> 0x03ab }
            float r0 = r2.A01     // Catch:{ IOException -> 0x03ab }
            r1[r11] = r0     // Catch:{ IOException -> 0x03ab }
            r6[r3] = r1     // Catch:{ IOException -> 0x03ab }
        L_0x011c:
            int r3 = r3 + 1
            goto L_0x0105
        L_0x011f:
            float[][] r6 = new float[r8][]     // Catch:{ IOException -> 0x03ab }
        L_0x0121:
            X.U2T r14 = new X.U2T     // Catch:{ IOException -> 0x03ab }
            r14.<init>(r15, r6, r9)     // Catch:{ IOException -> 0x03ab }
            int r1 = r7.A02     // Catch:{ IOException -> 0x03ab }
            int r0 = r7.A01     // Catch:{ IOException -> 0x03ab }
            r14.ESD(r1, r0)     // Catch:{ IOException -> 0x03ab }
            X.6Mr r0 = r7.A03     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x01eb
            r14.A0B = r0     // Catch:{ IOException -> 0x03ab }
            return r14
        L_0x0134:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x013b:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUr r8 = X.VIS.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            if (r20 == 0) goto L_0x0178
            float r7 = r8.A01     // Catch:{ IOException -> 0x03ab }
            java.util.List r0 = r8.A08     // Catch:{ IOException -> 0x03ab }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IOException -> 0x03ab }
            r6.<init>(r0)     // Catch:{ IOException -> 0x03ab }
            boolean r5 = r8.A09     // Catch:{ IOException -> 0x03ab }
            float r3 = r8.A04     // Catch:{ IOException -> 0x03ab }
            float r2 = r8.A00     // Catch:{ IOException -> 0x03ab }
            float r1 = r8.A02     // Catch:{ IOException -> 0x03ab }
            float r0 = r8.A03     // Catch:{ IOException -> 0x03ab }
            X.WeG r14 = new X.WeG     // Catch:{ IOException -> 0x03ab }
            r16 = r6
            r17 = r7
            r18 = r3
            r19 = r2
            r20 = r1
            r21 = r0
            r22 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ IOException -> 0x03ab }
            X.6Mr r0 = r8.A07     // Catch:{ IOException -> 0x03ab }
            r14.Eo9(r0)     // Catch:{ IOException -> 0x03ab }
            int r1 = r8.A06     // Catch:{ IOException -> 0x03ab }
            int r0 = r8.A05     // Catch:{ IOException -> 0x03ab }
            r14.ESD(r1, r0)     // Catch:{ IOException -> 0x03ab }
            return r14
        L_0x0178:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x017f:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUh r1 = X.VIQ.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            if (r20 == 0) goto L_0x019a
            X.9Xe r14 = new X.9Xe     // Catch:{ IOException -> 0x03ab }
            r14.<init>(r15)     // Catch:{ IOException -> 0x03ab }
            int r0 = r1.A00     // Catch:{ IOException -> 0x03ab }
            r14.ESD(r0, r0)     // Catch:{ IOException -> 0x03ab }
            X.6Mr r0 = r1.A01     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x01eb
            r14.A02 = r0     // Catch:{ IOException -> 0x03ab }
            return r14
        L_0x019a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x01a1:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUl r8 = X.VIP.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            if (r20 == 0) goto L_0x01ec
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IOException -> 0x03ab }
            r7.<init>()     // Catch:{ IOException -> 0x03ab }
            java.util.ArrayList r0 = r8.A02     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x01d5
            java.util.Iterator r6 = X.AnonymousClass7TE.A1G(r0)     // Catch:{ IOException -> 0x03ab }
        L_0x01b8:
            boolean r0 = r6.hasNext()     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r6)     // Catch:{ IOException -> 0x03ab }
            X.VYq r0 = (X.C17512VYq) r0     // Catch:{ IOException -> 0x03ab }
            int r5 = r0.A01     // Catch:{ IOException -> 0x03ab }
            int r3 = r0.A03     // Catch:{ IOException -> 0x03ab }
            int r2 = r0.A02     // Catch:{ IOException -> 0x03ab }
            int r1 = r0.A00     // Catch:{ IOException -> 0x03ab }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r5, r3, r2, r1)     // Catch:{ IOException -> 0x03ab }
            r7.add(r0)     // Catch:{ IOException -> 0x03ab }
            goto L_0x01b8
        L_0x01d5:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r7)     // Catch:{ IOException -> 0x03ab }
            X.U2V r14 = new X.U2V     // Catch:{ IOException -> 0x03ab }
            r14.<init>(r15, r0)     // Catch:{ IOException -> 0x03ab }
            int r0 = r8.A00     // Catch:{ IOException -> 0x03ab }
            r14.ESD(r0, r0)     // Catch:{ IOException -> 0x03ab }
            X.6Mr r0 = r8.A01     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x01eb
            r14.A02 = r0     // Catch:{ IOException -> 0x03ab }
            return r14
        L_0x01eb:
            return r14
        L_0x01ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x01f3:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUn r2 = X.VIO.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            java.util.List r1 = r2.A03     // Catch:{ IOException -> 0x03ab }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r1)     // Catch:{ IOException -> 0x03ab }
            X.WeD r5 = new X.WeD     // Catch:{ IOException -> 0x03ab }
            r5.<init>(r0)     // Catch:{ IOException -> 0x03ab }
            int r1 = r2.A01     // Catch:{ IOException -> 0x03ab }
            int r0 = r2.A00     // Catch:{ IOException -> 0x03ab }
            r5.ESD(r1, r0)     // Catch:{ IOException -> 0x03ab }
            X.6Mr r0 = r2.A02     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x0319
            r5.A02 = r0     // Catch:{ IOException -> 0x03ab }
            return r5
        L_0x0215:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.Abv r8 = X.A1U.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            if (r20 == 0) goto L_0x0281
            X.8bh[] r7 = X.C358928bh.values()     // Catch:{ IOException -> 0x03ab }
            int r6 = r7.length     // Catch:{ IOException -> 0x03ab }
            r5 = 0
            r10 = 0
            r3 = 0
        L_0x0227:
            if (r5 >= r6) goto L_0x023e
            r2 = r7[r5]     // Catch:{ IOException -> 0x03ab }
            java.lang.String r1 = r2.name()     // Catch:{ IOException -> 0x03ab }
            java.lang.String r0 = r8.A04     // Catch:{ IOException -> 0x03ab }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x023b
            if (r3 != 0) goto L_0x0242
            r3 = 1
            r10 = r2
        L_0x023b:
            int r5 = r5 + 1
            goto L_0x0227
        L_0x023e:
            if (r3 == 0) goto L_0x0242
            if (r10 != 0) goto L_0x0244
        L_0x0242:
            X.8bh r10 = X.C358928bh.A0C     // Catch:{ IOException -> 0x03ab }
        L_0x0244:
            float r9 = r8.A00     // Catch:{ IOException -> 0x03ab }
            java.util.List r7 = r8.A05     // Catch:{ IOException -> 0x03ab }
            java.util.List r6 = r8.A06     // Catch:{ IOException -> 0x03ab }
            boolean r12 = X.DbW.A1S(r11, r7, r6)     // Catch:{ IOException -> 0x03ab }
            int r0 = r7.size()     // Catch:{ IOException -> 0x03ab }
            float[][] r5 = new float[r0][]     // Catch:{ IOException -> 0x03ab }
            int r3 = r7.size()     // Catch:{ IOException -> 0x03ab }
            r2 = 0
        L_0x0259:
            if (r2 >= r3) goto L_0x026f
            r0 = 2
            float[] r1 = new float[r0]     // Catch:{ IOException -> 0x03ab }
            float r0 = X.AnonymousClass7TG.A00(r7, r2)     // Catch:{ IOException -> 0x03ab }
            r1[r12] = r0     // Catch:{ IOException -> 0x03ab }
            float r0 = X.AnonymousClass7TG.A00(r6, r2)     // Catch:{ IOException -> 0x03ab }
            r1[r11] = r0     // Catch:{ IOException -> 0x03ab }
            r5[r2] = r1     // Catch:{ IOException -> 0x03ab }
            int r2 = r2 + 1
            goto L_0x0259
        L_0x026f:
            X.91R r2 = new X.91R     // Catch:{ IOException -> 0x03ab }
            r2.<init>(r15, r10, r5, r9)     // Catch:{ IOException -> 0x03ab }
            X.6Mr r0 = r8.A03     // Catch:{ IOException -> 0x03ab }
            r2.Eo9(r0)     // Catch:{ IOException -> 0x03ab }
            int r1 = r8.A01     // Catch:{ IOException -> 0x03ab }
            int r0 = r8.A02     // Catch:{ IOException -> 0x03ab }
            r2.ESD(r1, r0)     // Catch:{ IOException -> 0x03ab }
            return r2
        L_0x0281:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x0288:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUk r2 = X.VIM.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            java.util.List r1 = r2.A02     // Catch:{ IOException -> 0x03ab }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r1)     // Catch:{ IOException -> 0x03ab }
            X.WeC r5 = new X.WeC     // Catch:{ IOException -> 0x03ab }
            r5.<init>(r0)     // Catch:{ IOException -> 0x03ab }
            int r0 = r2.A00     // Catch:{ IOException -> 0x03ab }
            r5.ESD(r0, r0)     // Catch:{ IOException -> 0x03ab }
            X.6Mr r0 = r2.A01     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x0319
            r5.A01 = r0     // Catch:{ IOException -> 0x03ab }
            return r5
        L_0x02a8:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUo r6 = X.VIK.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            java.util.List r0 = r6.A03     // Catch:{ IOException -> 0x03ab }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x03ab }
            r1.<init>(r0)     // Catch:{ IOException -> 0x03ab }
            java.util.List r0 = r6.A04     // Catch:{ IOException -> 0x03ab }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x03ab }
            r5.<init>(r0)     // Catch:{ IOException -> 0x03ab }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x03ab }
            r3.<init>()     // Catch:{ IOException -> 0x03ab }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x03ab }
            r2.<init>()     // Catch:{ IOException -> 0x03ab }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x03ab }
        L_0x02cc:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x02d6
            A04(r3, r1)     // Catch:{ IOException -> 0x03ab }
            goto L_0x02cc
        L_0x02d6:
            java.util.Iterator r1 = r5.iterator()     // Catch:{ IOException -> 0x03ab }
        L_0x02da:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x02e4
            A04(r2, r1)     // Catch:{ IOException -> 0x03ab }
            goto L_0x02da
        L_0x02e4:
            X.U2U r5 = new X.U2U     // Catch:{ IOException -> 0x03ab }
            r5.<init>(r3, r2)     // Catch:{ IOException -> 0x03ab }
            int r1 = r6.A01     // Catch:{ IOException -> 0x03ab }
            int r0 = r6.A00     // Catch:{ IOException -> 0x03ab }
            r5.ESD(r1, r0)     // Catch:{ IOException -> 0x03ab }
            X.6Mr r0 = r6.A02     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x0319
            r5.A01 = r0     // Catch:{ IOException -> 0x03ab }
            return r5
        L_0x02f7:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUm r3 = X.VIJ.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            float r2 = r3.A00     // Catch:{ IOException -> 0x03ab }
            java.util.List r1 = r3.A03     // Catch:{ IOException -> 0x03ab }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r1)     // Catch:{ IOException -> 0x03ab }
            X.WeF r5 = new X.WeF     // Catch:{ IOException -> 0x03ab }
            r5.<init>(r0, r2)     // Catch:{ IOException -> 0x03ab }
            int r0 = r3.A01     // Catch:{ IOException -> 0x03ab }
            r5.ESD(r0, r0)     // Catch:{ IOException -> 0x03ab }
            X.6Mr r0 = r3.A02     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x0319
            r5.A02 = r0     // Catch:{ IOException -> 0x03ab }
            return r5
        L_0x0319:
            return r5
        L_0x031a:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.Abt r0 = X.A1R.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            if (r20 == 0) goto L_0x0334
            com.instagram.ui.text.TextColors r0 = r0.A01     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x032e
            X.8bZ r14 = new X.8bZ     // Catch:{ IOException -> 0x03ab }
            r14.<init>(r15, r0)     // Catch:{ IOException -> 0x03ab }
            return r14
        L_0x032e:
            java.lang.String r0 = "textColors"
            X.0qQ.A0F(r0)     // Catch:{ IOException -> 0x03ab }
            goto L_0x039d
        L_0x0334:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03ab }
            r0.<init>(r2)     // Catch:{ IOException -> 0x03ab }
            goto L_0x03aa
        L_0x033a:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUj r0 = X.VIG.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            int r2 = r0.A01     // Catch:{ IOException -> 0x03ab }
            float r1 = r0.A00     // Catch:{ IOException -> 0x03ab }
            java.util.List r0 = r0.A02     // Catch:{ IOException -> 0x03ab }
            X.6MO r5 = new X.6MO     // Catch:{ IOException -> 0x03ab }
            r5.<init>(r0, r1, r2)     // Catch:{ IOException -> 0x03ab }
            return r5
        L_0x034e:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x03ab }
            X.WUe r5 = X.VIF.parseFromJson(r0)     // Catch:{ IOException -> 0x03ab }
            java.util.List r0 = r5.A01     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x0380
            int r3 = r0.size()     // Catch:{ IOException -> 0x03ab }
            int[] r2 = new int[r3]     // Catch:{ IOException -> 0x03ab }
            r1 = 0
        L_0x0361:
            if (r1 >= r3) goto L_0x0370
            java.util.List r0 = r5.A01     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x0380
            int r0 = X.C51971G9r.A0I(r0, r1)     // Catch:{ IOException -> 0x03ab }
            r2[r1] = r0     // Catch:{ IOException -> 0x03ab }
            int r1 = r1 + 1
            goto L_0x0361
        L_0x0370:
            java.lang.Integer r0 = r5.A00     // Catch:{ IOException -> 0x03ab }
            if (r0 == 0) goto L_0x037a
            X.9qU r5 = new X.9qU     // Catch:{ IOException -> 0x03ab }
            r5.<init>(r0, r2)     // Catch:{ IOException -> 0x03ab }
            return r5
        L_0x037a:
            java.lang.String r0 = "textAlignment"
            X.0qQ.A0F(r0)     // Catch:{ IOException -> 0x03ab }
            goto L_0x039d
        L_0x0380:
            java.lang.String r0 = "gradientColorsList"
            X.0qQ.A0F(r0)     // Catch:{ IOException -> 0x03ab }
            goto L_0x039d
        L_0x0386:
            X.9UW r0 = new X.9UW     // Catch:{ IOException -> 0x03ab }
            r0.<init>()     // Catch:{ IOException -> 0x03ab }
            return r0
        L_0x038c:
            X.91T r0 = new X.91T     // Catch:{ IOException -> 0x03ab }
            r0.<init>()     // Catch:{ IOException -> 0x03ab }
            return r0
        L_0x0392:
            com.instagram.ui.text.CustomUnderlineSpan r0 = new com.instagram.ui.text.CustomUnderlineSpan     // Catch:{ IOException -> 0x03ab }
            r0.<init>()     // Catch:{ IOException -> 0x03ab }
            return r0
        L_0x0398:
            java.lang.String r0 = "metadataModelJson"
            X.0qQ.A0F(r0)     // Catch:{ IOException -> 0x03ab }
        L_0x039d:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x03aa
        L_0x03a2:
            java.lang.String r0 = X.AnonymousClass510.A00(r13)     // Catch:{ IOException -> 0x03ab }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r4, r0)     // Catch:{ IOException -> 0x03ab }
        L_0x03aa:
            throw r0     // Catch:{ IOException -> 0x03ab }
        L_0x03ab:
            java.lang.String r0 = X.AnonymousClass510.A00(r13)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18790W1s.A02(android.content.Context, X.50z, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.50z, java.lang.Object] */
    public static final void A03(Spannable spannable, C2802550x r10, Class cls) {
        for (Object obj : C263324Kh.A06(spannable, cls)) {
            if (obj instanceof AnonymousClass6MR) {
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                int spanFlags = spannable.getSpanFlags(obj);
                if (spanStart >= 0 && spanEnd >= 0) {
                    X6W By4 = ((AnonymousClass6MR) obj).By4();
                    0qQ.A0B(By4, 4);
                    ? obj2 = new Object();
                    obj2.A02 = spanStart;
                    obj2.A00 = spanEnd;
                    obj2.A01 = spanFlags;
                    Integer CAn = By4.CAn();
                    0qQ.A0B(CAn, 0);
                    obj2.A03 = CAn;
                    String json = By4.toJson();
                    if (json == null) {
                        json = "";
                    }
                    obj2.A04 = json;
                    r10.A01.add(obj2);
                }
            }
        }
    }

    public static void A04(AbstractCollection abstractCollection, Iterator it) {
        C18501Vsw vsw = (C18501Vsw) it.next();
        Double d = vsw.A05;
        if (d != null) {
            abstractCollection.add(new C17901Vhs(new RectF(vsw.A01, vsw.A04, vsw.A02, vsw.A00), d.doubleValue(), vsw.A03, vsw.A06));
        }
    }
}
