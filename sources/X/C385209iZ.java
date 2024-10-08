package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9iZ  reason: invalid class name and case insensitive filesystem */
public final class C385209iZ extends 2Ru implements C231272rL, AnonymousClass71P {
    public AnonymousClass2s2 A00;
    public List A01 = 0sn.A00;
    public C385219ia A02;
    public K9U A03;
    public C385229ib A04;
    public C385229ib A05;
    public final Context A06;
    public final AnonymousClass2s2 A07;
    public final UserSession A08;
    public final C357638Yz A09;
    public final AnonymousClass8MH A0A;
    public final C346797vl A0B;
    public final E9T A0C;
    public final E9U A0D;
    public final List A0E = AnonymousClass7TE.A1C();
    public final List A0F = AnonymousClass7TE.A1C();
    public final C346787vk A0G;
    public final C346777vj A0H;
    public final C385239ic A0I;
    public final Map A0J = AnonymousClass7TE.A1E();
    public final boolean A0K;

    /* JADX WARNING: type inference failed for: r12v1, types: [X.E9T, X.2s0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v1, types: [X.2s0, X.E9U, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.2s2, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C385209iZ(Context context, AnonymousClass0iw r21, UserSession userSession, C357638Yz r23, AnonymousClass8MH r24, int i, boolean z) {
        super(false);
        Context context2 = context;
        this.A06 = context2;
        UserSession userSession2 = userSession;
        this.A08 = userSession2;
        AnonymousClass8MH r4 = r24;
        this.A0A = r4;
        this.A0K = z;
        C357638Yz r0 = r23;
        this.A09 = r0;
        C385239ic r8 = new C385239ic(r21, userSession2, r4, 6, i);
        this.A0I = r8;
        C346777vj r9 = new C346777vj(userSession2, r0, r4, false);
        this.A0H = r9;
        C346787vk r10 = new C346787vk(userSession2, r0, r4);
        this.A0G = r10;
        C346797vl r11 = new C346797vl(userSession2, r4, false);
        this.A0B = r11;
        ? obj = new Object();
        this.A0C = obj;
        ? obj2 = new Object();
        obj2.A03 = AnonymousClass7TE.A0F(context2.getResources());
        this.A07 = obj2;
        ? obj3 = new Object();
        this.A0D = obj3;
        this.A03 = new K9U(context2, r4);
        this.A02 = new C385219ia(userSession2, r4);
        this.A04 = new C385229ib(context2, userSession2, r4, false);
        this.A05 = new C385229ib(context2, userSession2, r4, true);
        ? obj4 = new Object();
        this.A00 = obj4;
        obj4.A01 = R.color.grey_2_30_transparent;
        obj4.A04 = true;
        obj4.A02 = context2.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        init(new C231642s0[]{this.A03, r8, r9, r10, r11, obj, obj3, this.A02, this.A04, this.A05, this.A00, obj2});
    }

    private final void A00(C231632rz r6, List list, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * i2;
            C3251571g r2 = new C3251571g(list, i4, i2);
            AnonymousClass6u8 BQA = BQA(AnonymousClass7TF.A0h(r2));
            BQA.A00(i3, AnonymousClass7TF.A1S(i3, i - 1));
            BQA.A01 = i4;
            addModel(r2, BQA, r6);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.9op, java.lang.Object, X.6u8] */
    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A0J;
        AnonymousClass6u8 r1 = (AnonymousClass6u8) map.get(str);
        if (r1 != null) {
            return r1;
        }
        ? r12 = new AnonymousClass6u8();
        r12.A01 = true;
        r12.A00 = false;
        map.put(str, r12);
        return r12;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0252, code lost:
        if (r9.length() == 0) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013f, code lost:
        if (X.C346897vw.A02(r1, r0) == false) goto L_0x0141;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C385209iZ r19) {
        /*
            r7 = r19
            r7.clear()
            java.util.List r0 = r7.A01
            boolean r0 = r0.isEmpty()
            r6 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02aa
            java.util.List r0 = r7.A01
            java.util.Iterator r13 = r0.iterator()
            r5 = 0
            r4 = 0
        L_0x0018:
            r12 = 0
        L_0x0019:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02b1
            java.lang.Object r3 = r13.next()
            X.8u4 r3 = (X.C369238u4) r3
            java.lang.String r11 = r3.A04
            java.lang.String r9 = r3.A03
            java.util.List r2 = r3.A00()
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r1 = r9.toLowerCase(r8)
            X.0qQ.A07(r1)
            r0 = 5300(0x14b4, float:7.427E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b4
            X.8MH r0 = r7.A0A
            boolean r0 = r0.Buo()
            r11 = 0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r2 instanceof java.util.Collection
            r10 = 2
            if (r0 == 0) goto L_0x0087
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0087
        L_0x0056:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            X.E9U r0 = r7.A0D
            r7.addModel(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r3 = 0
            r7.A02(r0, r2, r6, r5)
            X.2s2 r0 = r7.A00
            r7.addModel(r3, r0)
            com.instagram.common.session.UserSession r1 = r7.A08
            X.8Yz r0 = r7.A09
            if (r0 == 0) goto L_0x0085
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
        L_0x0078:
            boolean r0 = X.C346897vw.A02(r1, r0)
            if (r0 == 0) goto L_0x0083
            X.2s2 r0 = r7.A07
            r7.addModel(r3, r0)
        L_0x0083:
            r12 = 1
            goto L_0x0019
        L_0x0085:
            r0 = r3
            goto L_0x0078
        L_0x0087:
            java.util.Iterator r9 = r2.iterator()
        L_0x008b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r8 = r9.next()
            X.6nz r8 = (X.C317876nz) r8
            X.6oG r3 = X.C318046oG.FILLABLE_GALLERY_STICKER
            X.6oG r1 = X.C318046oG.FILLABLE_MUSIC_STICKER
            X.6oG r0 = X.C318046oG.FILLABLE_TEXT_STICKER
            X.6oG[] r0 = new X.C318046oG[]{r3, r1, r0}
            X.0qQ.A0B(r0, r5)
            java.util.Set r1 = X.03t.A0K(r0)
            X.6oG r0 = r8.A00()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x008b
            r11 = 1
            goto L_0x0056
        L_0x00b4:
            java.lang.String r8 = r9.toLowerCase(r8)
            X.0qQ.A07(r8)
            java.lang.String r0 = "new-single-sticker"
            boolean r1 = r8.equals(r0)
            if (r1 == 0) goto L_0x00cf
            com.instagram.common.session.UserSession r0 = r7.A08
            boolean r0 = X.C394239xl.A00(r0, r9, r2)
            if (r0 == 0) goto L_0x0019
            if (r12 == 0) goto L_0x00cf
            goto L_0x0019
        L_0x00cf:
            r0 = 966(0x3c6, float:1.354E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0122
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x0019
            r8 = r12 ^ 1
            java.util.Iterator r3 = r2.iterator()
        L_0x00e7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r1 = r3.next()
            X.6nz r1 = (X.C317876nz) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A0F = r0
            goto L_0x00e7
        L_0x00f8:
            if (r8 == 0) goto L_0x0108
            X.2s2 r3 = r7.A07
            r1 = 0
            r7.addModel(r1, r3)
            X.2s2 r0 = r7.A00
            r7.addModel(r1, r0)
            r7.addModel(r1, r3)
        L_0x0108:
            r3 = 0
            r7.A02(r3, r2, r8, r5)
            if (r8 == 0) goto L_0x0019
            X.E9T r0 = r7.A0C
            r7.addModel(r3, r0)
            X.2s2 r1 = r7.A07
            r7.addModel(r3, r1)
            X.2s2 r0 = r7.A00
            r7.addModel(r3, r0)
            r7.addModel(r3, r1)
            goto L_0x0019
        L_0x0122:
            int r0 = r11.length()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            r8 = 0
            if (r0 == 0) goto L_0x0160
            if (r1 == 0) goto L_0x0141
            com.instagram.common.session.UserSession r1 = r7.A08
            X.8Yz r0 = r7.A09
            if (r0 == 0) goto L_0x02a7
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
        L_0x013b:
            boolean r0 = X.C346897vw.A02(r1, r0)
            if (r0 != 0) goto L_0x0160
        L_0x0141:
            java.lang.String r10 = r3.A02
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x02a4
            com.instagram.api.schemas.StickerTraySectionCTAType r1 = r3.A00
            com.instagram.api.schemas.StickerTraySectionCTAType r0 = com.instagram.api.schemas.StickerTraySectionCTAType.A09
            if (r1 == r0) goto L_0x02a4
            X.JwJ r0 = new X.JwJ
            r0.<init>((com.instagram.api.schemas.StickerTraySectionCTAType) r1, (java.lang.String) r10)
        L_0x0154:
            if (r12 != 0) goto L_0x0160
            X.JwJ r1 = new X.JwJ
            r1.<init>((X.C61081JwJ) r0, (java.lang.String) r11)
            X.K9U r0 = r7.A03
            r7.addModel(r1, r0)
        L_0x0160:
            int r1 = r2.size()
            r0 = 3
            if (r1 <= r0) goto L_0x0183
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0183
            X.9ia r0 = r7.A02
            r7.addModel(r2, r0)
        L_0x0170:
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0019
            java.lang.Boolean r0 = r3.A01
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r6)
            if (r0 != 0) goto L_0x0019
            X.2s2 r0 = r7.A00
            r7.addModel(r8, r0)
            goto L_0x0019
        L_0x0183:
            com.instagram.common.session.UserSession r1 = r7.A08
            boolean r0 = X.C394239xl.A00(r1, r9, r2)
            if (r0 == 0) goto L_0x029e
            java.lang.String r0 = r3.A06
            int r9 = r0.length()
            if (r9 != 0) goto L_0x01a8
            java.lang.Object r0 = r2.get(r5)
            X.6nz r0 = (X.C317876nz) r0
            X.0qQ.A0B(r0, r5)
            X.6oG r0 = r0.A00()
            int r0 = r0.ordinal()
            switch(r0) {
                case 12: goto L_0x0285;
                case 20: goto L_0x0275;
                case 21: goto L_0x0285;
                case 63: goto L_0x0279;
                case 94: goto L_0x0271;
                case 97: goto L_0x027d;
                case 110: goto L_0x0281;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            r0 = r8
        L_0x01a8:
            java.lang.String r9 = r3.A05
            int r10 = r9.length()
            if (r10 != 0) goto L_0x01c5
            java.lang.Object r9 = r2.get(r5)
            X.6nz r9 = (X.C317876nz) r9
            X.0qQ.A0B(r9, r5)
            X.6oG r9 = r9.A00()
            int r9 = r9.ordinal()
            switch(r9) {
                case 12: goto L_0x0258;
                case 20: goto L_0x0203;
                case 21: goto L_0x0258;
                case 63: goto L_0x0207;
                case 94: goto L_0x01ff;
                case 97: goto L_0x020b;
                case 110: goto L_0x020f;
                default: goto L_0x01c4;
            }
        L_0x01c4:
            r9 = r8
        L_0x01c5:
            if (r0 == 0) goto L_0x0170
            if (r9 == 0) goto L_0x0170
            X.8Yz r4 = r7.A09
            if (r4 == 0) goto L_0x01fd
            X.80m r4 = r4.A08
            java.lang.Object r4 = r4.A00
            X.4yO r4 = (X.C279284yO) r4
        L_0x01d3:
            boolean r1 = X.C346897vw.A02(r1, r4)
            if (r1 == 0) goto L_0x01fa
            java.lang.Object r1 = r2.get(r5)
            X.6nz r1 = (X.C317876nz) r1
            X.6oG r4 = r1.A00()
            X.6oG r1 = X.C318046oG.BLOKS
            if (r4 == r1) goto L_0x01fa
            X.9ib r4 = r7.A05
        L_0x01e9:
            java.lang.Object r2 = r2.get(r5)
            X.6nz r2 = (X.C317876nz) r2
            X.JV7 r1 = new X.JV7
            r1.<init>((X.C317876nz) r2, (java.lang.String) r0, (java.lang.String) r9)
            r7.addModel(r1, r4)
            r4 = 1
            goto L_0x0170
        L_0x01fa:
            X.9ib r4 = r7.A04
            goto L_0x01e9
        L_0x01fd:
            r4 = r8
            goto L_0x01d3
        L_0x01ff:
            r10 = 2131974330(0x7f1358ba, float:1.958572E38)
            goto L_0x025b
        L_0x0203:
            r10 = 2131957321(0x7f131649, float:1.9551223E38)
            goto L_0x025b
        L_0x0207:
            r10 = 2131967838(0x7f133f5e, float:1.9572554E38)
            goto L_0x025b
        L_0x020b:
            r10 = 2131974642(0x7f1359f2, float:1.9586354E38)
            goto L_0x025b
        L_0x020f:
            if (r1 == 0) goto L_0x01c4
            X.9F4 r9 = X.AnonymousClass9F3.A00(r1)
            X.0eM r9 = r9.A02
            java.lang.Object r9 = r9.getValue()
            X.9F7 r9 = (X.AnonymousClass9F7) r9
            java.lang.Class<X.ASQ> r10 = X.ASQ.class
            com.facebook.common.callercontext.CallerContext r15 = com.facebook.common.callercontext.CallerContext.A00(r10)
            java.lang.String r16 = "ig_android_whatsapp_asset_ig_to_fb_crossposting"
            java.lang.String r17 = "user"
            java.lang.String r18 = "correctnessTest"
            java.lang.String r19 = "hasWhatsappNumber"
            X.9JK r14 = new X.9JK
            r14.<init>((com.facebook.common.callercontext.CallerContext) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19)
            java.lang.Object r9 = r9.Au3(r14)
            X.9Ge r9 = (X.C376009Ge) r9
            if (r9 == 0) goto L_0x0254
            X.9Gd r9 = r9.A00
            if (r9 == 0) goto L_0x0254
            com.facebook.common.callercontext.CallerContext r15 = com.facebook.common.callercontext.CallerContext.A00(r10)
            X.9JK r14 = new X.9JK
            r14.<init>((com.facebook.common.callercontext.CallerContext) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19)
            java.lang.String r9 = r9.A00(r14, r1)
            if (r9 == 0) goto L_0x0254
            int r9 = r9.length()
            r10 = 2131976863(0x7f13629f, float:1.9590859E38)
            if (r9 != 0) goto L_0x025b
        L_0x0254:
            r10 = 2131976864(0x7f1362a0, float:1.959086E38)
            goto L_0x025b
        L_0x0258:
            r10 = 2131961560(0x7f1326d8, float:1.955982E38)
        L_0x025b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            if (r9 == 0) goto L_0x01c4
            int r10 = r9.intValue()
            android.content.Context r9 = r7.A06
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getString(r10)
            goto L_0x01c5
        L_0x0271:
            r0 = 2131974331(0x7f1358bb, float:1.9585723E38)
            goto L_0x0288
        L_0x0275:
            r0 = 2131957322(0x7f13164a, float:1.9551225E38)
            goto L_0x0288
        L_0x0279:
            r0 = 2131967839(0x7f133f5f, float:1.9572556E38)
            goto L_0x0288
        L_0x027d:
            r0 = 2131974643(0x7f1359f3, float:1.9586356E38)
            goto L_0x0288
        L_0x0281:
            r0 = 2131976865(0x7f1362a1, float:1.9590863E38)
            goto L_0x0288
        L_0x0285:
            r0 = 2131961561(0x7f1326d9, float:1.9559822E38)
        L_0x0288:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x01a7
            int r9 = r0.intValue()
            android.content.Context r0 = r7.A06
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r9)
            goto L_0x01a8
        L_0x029e:
            r7.A02(r8, r2, r6, r4)
            r4 = 0
            goto L_0x0170
        L_0x02a4:
            r0 = r8
            goto L_0x0154
        L_0x02a7:
            r0 = r8
            goto L_0x013b
        L_0x02aa:
            java.util.List r2 = r7.A0F
            r1 = 0
            r0 = 0
            r7.A02(r1, r2, r6, r0)
        L_0x02b1:
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x02ca
            java.util.List r4 = r7.A0E
            int r0 = r4.size()
            double r2 = (double) r0
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            int r2 = (int) r0
            r1 = 6
            X.9ic r0 = r7.A0I
            r7.A00(r0, r4, r2, r1)
        L_0x02ca:
            r7.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385209iZ.A01(X.9iZ):void");
    }

    private final void A02(Integer num, List list, boolean z, boolean z2) {
        C279284yO r0;
        int i;
        int i2;
        C231632rz r02;
        int A012;
        UserSession userSession = this.A08;
        C357638Yz r03 = this.A09;
        if (r03 != null) {
            r0 = (C279284yO) r03.A08.A00;
        } else {
            r0 = null;
        }
        if (C346897vw.A02(userSession, r0)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object next : list) {
                C317876nz r2 = (C317876nz) next;
                if (AnonymousClass7TF.A1Y(r2.A09, true) || r2.A00() == C318046oG.FILLABLE_GALLERY_STICKER) {
                    A1C.add(next);
                } else {
                    A1C2.add(next);
                }
            }
            list = A1C2;
            ArrayList A0r = AnonymousClass7TG.A0r(A1C);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                Drawable drawable = AJA.A02(this.A06, userSession, this.A0A, (C317876nz) it.next()).A00;
                if (drawable != null) {
                    A0r.add(drawable);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            int size = A1C.size();
            int i3 = 0;
            int i4 = 0;
            while (i3 < size) {
                if (num != null) {
                    A012 = num.intValue();
                } else {
                    A012 = AAX.A01(this.A06, userSession, A0r, i3);
                }
                C3251571g r22 = new C3251571g(A1C, i3, A012);
                AnonymousClass6u8 BQA = BQA(AnonymousClass7TF.A0h(r22));
                int i5 = A012 + i3;
                boolean z3 = false;
                if (i5 >= size) {
                    z3 = true;
                }
                BQA.A00(i4, z3);
                BQA.A01 = i3;
                C389059op r04 = (C389059op) BQA;
                r04.A01 = z;
                r04.A00 = z2;
                addModel(r22, BQA, this.A0B);
                i4++;
                i3 = i5;
            }
            i = (int) Math.ceil(((double) A1C2.size()) / 4.0d);
            i2 = 4;
            r02 = this.A0G;
        } else {
            i = (int) Math.ceil(((double) list.size()) / 3.0d);
            i2 = 3;
            r02 = this.A0H;
        }
        A00(r02, list, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }
}
