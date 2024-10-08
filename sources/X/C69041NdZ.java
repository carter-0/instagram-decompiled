package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.android.maps.model.LatLng;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;

/* renamed from: X.NdZ  reason: case insensitive filesystem */
public final class C69041NdZ extends C14955UGt implements C13907Tl7, X7N {
    public float A00;
    public long A01;
    public View A02;
    public NoteBubbleView A03;
    public OGK A04;
    public C67586MqK A05;
    public C68632NQl A06;
    public C67591MqP A07;
    public C67591MqP A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public C262204Co A0C;
    public boolean A0D;
    public final Context A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final RectF A0K;
    public final Drawable A0L;
    public final C19879Wh8 A0M;
    public final C14635Tzh A0N;
    public final UserSession A0O;
    public final N4t A0P;
    public final OHV A0Q;
    public final User A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final double A0U;
    public final double A0V;
    public final double A0W;
    public final float A0X;
    public final float A0Y;
    public final float A0Z;
    public final float A0a;
    public final int A0b;
    public final int A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final AnonymousClass07V A0h;
    public final WFU A0i;
    public final boolean A0j;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0196, code lost:
        if (((X.N4t) X.00k.A0I(r3.A0M.A04())).A0I == false) goto L_0x0198;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0207 A[LOOP:2: B:43:0x0201->B:45:0x0207, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02a2 A[LOOP:4: B:64:0x029c->B:66:0x02a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x031f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C69041NdZ(android.content.Context r29, X.AnonymousClass07V r30, X.C19879Wh8 r31, X.WFU r32, com.instagram.common.session.UserSession r33, X.N4t r34, X.OHV r35) {
        /*
            r28 = this;
            r12 = 1
            r11 = 5
            r3 = r28
            r4 = r32
            r3.<init>(r4)
            r3.A0i = r4
            r10 = r29
            r3.A0E = r10
            r6 = r33
            r3.A0O = r6
            r2 = r34
            r3.A0P = r2
            r27 = r30
            r0 = r27
            r3.A0h = r0
            r13 = r31
            r3.A0M = r13
            r0 = r35
            r3.A0Q = r0
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342164778840303354(0x20810a75003526fa, double:4.067086373488942E-152)
            boolean r0 = X.182.A06(r5, r6, r0)
            r3.A0T = r0
            com.facebook.android.maps.model.LatLng r0 = r2.A04
            double r6 = r0.A00
            r3.A0U = r6
            double r0 = r0.A01
            r3.A0V = r0
            com.instagram.user.model.User r0 = r2.A02()
            r3.A0R = r0
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 * r0
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r6 = r6 / r0
            double r8 = java.lang.Math.cos(r6)
            r0 = 4684618790526769493(0x41031bf84577d955, double:156543.03392)
            double r8 = r8 * r0
            r6 = 4625619029774565376(0x4031800000000000, double:17.5)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r6)
            double r8 = r8 / r0
            r3.A0W = r8
            float r1 = r4.A01()
            r0 = 1083179008(0x40900000, float:4.5)
            float r0 = r1 / r0
            r3.A0Z = r0
            r0 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 / r0
            r3.A0a = r1
            int r0 = r13.A03
            r4 = 0
            boolean r8 = X.C51970G9q.A1W(r0, r12)
            r3.A0S = r8
            if (r8 != 0) goto L_0x0088
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x0159
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x0159
        L_0x0088:
            r0 = 1
        L_0x0089:
            r3.A0j = r0
            android.graphics.drawable.LayerDrawable r0 = X.C67587MqL.A03(r10)
            r3.A0L = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r3.A0K = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r3.A0J = r0
            r0 = 2131165243(0x7f07003b, float:1.7944698E38)
            int r0 = X.AnonymousClass7TF.A02(r10, r0)
            r3.A0g = r0
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            int r0 = X.AnonymousClass7TF.A02(r10, r0)
            r3.A0f = r0
            r0 = 2131165276(0x7f07005c, float:1.7944765E38)
            int r0 = X.AnonymousClass7TF.A02(r10, r0)
            r3.A0d = r0
            r0 = 2131165278(0x7f07005e, float:1.7944769E38)
            int r0 = X.AnonymousClass7TF.A02(r10, r0)
            r3.A0e = r0
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = X.AnonymousClass7TF.A02(r10, r0)
            float r7 = (float) r0
            r3.A0Y = r7
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = X.AnonymousClass7TF.A02(r10, r0)
            float r0 = (float) r0
            r3.A0X = r0
            android.graphics.Path r1 = X.C51965G9l.A0C()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r1.setFillType(r0)
            r3.A0G = r1
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r3.A0H = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r3.A0I = r0
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = X.AnonymousClass7TF.A02(r10, r0)
            r3.A0b = r0
            r0 = 2131165277(0x7f07005d, float:1.7944767E38)
            int r0 = X.AnonymousClass7TF.A02(r10, r0)
            r3.A0c = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.A0A = r0
            r3.A0B = r0
            android.graphics.Paint r6 = X.AnonymousClass7TE.A0V(r12)
            r6.setColor(r4)
            r0 = 2131099784(0x7f060088, float:1.781193E38)
            int r0 = r10.getColor(r0)
            r1 = 0
            r6.setShadowLayer(r7, r1, r1, r0)
            r3.A0F = r6
            float[] r14 = new float[r11]
            r14 = {0, -1063256064, 0, 1084227584, 0} // fill-array
            X.VvY r0 = X.C14635Tzh.A0L
            java.lang.Object r9 = r0.A00()
            X.Tzh r9 = (X.C14635Tzh) r9
            if (r9 != 0) goto L_0x012c
            X.Tzh r9 = new X.Tzh
            r9.<init>()
        L_0x012c:
            r6 = 2
            int r13 = java.lang.Math.max(r11, r6)
            r9.A03 = r13
            float[] r10 = r9.A0I
            int r0 = r10.length
            if (r0 >= r13) goto L_0x0140
            float[] r10 = new float[r13]
            r9.A0I = r10
            float[] r0 = new float[r13]
            r9.A0J = r0
        L_0x0140:
            r7 = 1
            r10[r4] = r1
            float[] r1 = r9.A0J
            r0 = r14[r4]
            r1[r4] = r0
        L_0x0149:
            if (r7 >= r13) goto L_0x015c
            float r15 = (float) r7
            int r0 = r13 + -1
            float r0 = (float) r0
            float r15 = r15 / r0
            r10[r7] = r15
            r0 = r14[r7]
            r1[r7] = r0
            int r7 = r7 + 1
            goto L_0x0149
        L_0x0159:
            r0 = 0
            goto L_0x0089
        L_0x015c:
            r9.A0E = r4
            r0 = 250(0xfa, double:1.235E-321)
            r9.A07 = r0
            r9.A07(r3)
            X.Om2 r0 = new X.Om2
            r0.<init>(r3)
            r9.A08(r0)
            r3.A0N = r9
            if (r8 != 0) goto L_0x01dd
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x01c1
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x01c1
            X.Nd0 r1 = new X.Nd0
            r1.<init>(r2)
        L_0x0180:
            r3.A04 = r1
            boolean r7 = r3.A0S
            if (r7 != 0) goto L_0x0198
            X.Wh8 r0 = r3.A0M
            java.util.LinkedList r0 = r0.A04()
            java.lang.Object r0 = X.00k.A0I(r0)
            X.N4t r0 = (X.N4t) r0
            boolean r0 = r0.A0I
            r26 = 1
            if (r0 != 0) goto L_0x019a
        L_0x0198:
            r26 = 0
        L_0x019a:
            X.Wh8 r1 = r3.A0M
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r1.iterator()
        L_0x01a8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r2 = r10.next()
            r0 = r2
            X.N4t r0 = (X.N4t) r0
            X.4AB r0 = r0.A05
            if (r0 == 0) goto L_0x01bd
            r9.add(r2)
            goto L_0x01a8
        L_0x01bd:
            r8.add(r2)
            goto L_0x01a8
        L_0x01c1:
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x01dd
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x01dd
            X.Nd2 r0 = new X.Nd2
            r0.<init>(r2, r4)
            X.Ncx r1 = new X.Ncx
            r16 = r4
            r17 = r12
            r18 = r12
            r13 = r1
            r14 = r0
            r15 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x0180
        L_0x01dd:
            X.Ncz r1 = new X.Ncz
            r1.<init>(r2)
            goto L_0x0180
        L_0x01e3:
            r0 = 30
            java.util.List r2 = X.C73429PcU.A00(r9, r0)
            r0 = 31
            java.util.List r0 = X.C73429PcU.A00(r8, r0)
            java.util.ArrayList r15 = X.00k.A0S(r0, r2)
            java.lang.Object r9 = X.00k.A0I(r15)
            X.N4t r9 = (X.N4t) r9
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r15)
            java.util.Iterator r8 = r15.iterator()
        L_0x0201:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0213
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = X.N4t.A01(r0)
            r2.add(r0)
            goto L_0x0201
        L_0x0213:
            java.util.HashSet r13 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r2.iterator()
        L_0x021f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0233
            java.lang.Object r2 = r8.next()
            boolean r0 = r13.add(r2)
            if (r0 == 0) goto L_0x021f
            r10.add(r2)
            goto L_0x021f
        L_0x0233:
            int r0 = r10.size()
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r12)
            r3.A09 = r0
            if (r0 == 0) goto L_0x0250
            boolean r0 = r9.A05()
            if (r0 == 0) goto L_0x02b1
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x02b1
            X.Nd0 r0 = new X.Nd0
            r0.<init>(r9)
        L_0x024e:
            r3.A04 = r0
        L_0x0250:
            android.content.Context r13 = r3.A0E
            com.instagram.common.session.UserSession r2 = r3.A0O
            X.0qQ.A0A(r9)
            X.MqO r19 = X.C67589MqN.A00(r9)
            X.OGK r0 = r3.A04
            X.MqU r10 = r0.A00
            r0 = 42
            X.Inj r8 = new X.Inj
            r8.<init>(r3, r0)
            X.MqP r0 = new X.MqP
            r16 = r0
            r17 = r13
            r18 = r2
            r20 = r10
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r3.A07 = r0
            X.4AB r0 = r9.A05
            if (r0 == 0) goto L_0x02ae
            r0 = r9
        L_0x027c:
            X.4AB r8 = r0.A05
            java.lang.Integer r0 = r0.A07
            r16 = r13
            r17 = r1
            r19 = r8
            r20 = r0
            r21 = r4
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = X.C70287O0r.A00(r16, r17, r18, r19, r20, r21)
            r3.A03 = r0
            java.util.HashSet r10 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r1.iterator()
        L_0x029c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x02b7
            java.lang.Object r1 = r14.next()
            java.lang.String r0 = X.N4t.A01(r1)
            X.C51971G9r.A1O(r0, r1, r10, r8)
            goto L_0x029c
        L_0x02ae:
            X.N4t r0 = r3.A0P
            goto L_0x027c
        L_0x02b1:
            X.Ncz r0 = new X.Ncz
            r0.<init>(r9)
            goto L_0x024e
        L_0x02b7:
            X.0qQ.A0B(r8, r4)
            int r8 = X.C51966G9m.A06(r8)
            com.instagram.user.model.User r0 = r9.A02()
            java.lang.String r1 = X.C67587MqL.A04(r13, r0)
            if (r8 <= 0) goto L_0x036d
            java.lang.String r0 = " +"
            java.lang.String r0 = X.002.A0O(r0, r8)
        L_0x02ce:
            java.lang.String r23 = X.002.A0R(r1, r0)
            boolean r0 = r9.A0J
            if (r0 == 0) goto L_0x0369
            if (r26 == 0) goto L_0x0369
            r0 = 0
        L_0x02da:
            r8 = 0
            r20 = 0
            X.NQl r10 = new X.NQl
            r21 = r10
            r22 = r13
            r24 = r0
            r21.<init>(r22, r23, r24, r26)
            r3.A06 = r10
            if (r26 == 0) goto L_0x0319
            java.lang.String r9 = r9.A08
            if (r9 == 0) goto L_0x0319
            X.0qQ.A0B(r2, r4)
            r0 = 36321769627264772(0x810a75003f2704, double:3.03337159608465E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0319
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r13)
            r0 = 2131625784(0x7f0e0738, float:1.8878786E38)
            android.view.View r1 = r1.inflate(r0, r8, r4)
            r3.A02 = r1
            if (r1 == 0) goto L_0x0319
            r0 = 2131433175(0x7f0b16d7, float:1.8488128E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r1, r0)
            if (r0 == 0) goto L_0x0319
            r0.setText(r9)
        L_0x0319:
            if (r7 == 0) goto L_0x03c4
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x03c4
            X.0qQ.A0B(r2, r4)
            r0 = 36321769626019571(0x810a75002c26f3, double:3.0333715952971797E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0366
            r0 = 36603244602790799(0x820a75002d138f, double:3.211377504016062E-306)
            int r1 = X.DbS.A04(r5, r2, r0)
            X.2HY r0 = new X.2HY
            r0.<init>(r12, r11)
            int r0 = X.C229632nm.A05(r0, r1)
            if (r0 <= r6) goto L_0x0363
            X.Pp6 r9 = X.C74103Pp6.A00
        L_0x0343:
            X.0sP r9 = (X.0sP) r9
            java.util.HashSet r8 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r15.iterator()
        L_0x0351:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0371
            java.lang.Object r1 = r6.next()
            java.lang.Object r0 = r9.invoke(r1)
            X.C51971G9r.A1O(r0, r1, r8, r7)
            goto L_0x0351
        L_0x0363:
            X.Pp7 r9 = X.C74104Pp7.A00
            goto L_0x0343
        L_0x0366:
            X.Pp8 r9 = X.C74105Pp8.A00
            goto L_0x0343
        L_0x0369:
            long r0 = r9.A02
            goto L_0x02da
        L_0x036d:
            java.lang.String r0 = ""
            goto L_0x02ce
        L_0x0371:
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x0379:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x038e
            X.N4t r0 = X.C66580MXl.A0f(r1)
            X.0qQ.A0A(r0)
            X.MqO r0 = X.C67589MqN.A00(r0)
            r6.add(r0)
            goto L_0x0379
        L_0x038e:
            X.Nd5 r14 = X.Nd5.A00
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = r3.A03
            if (r0 == 0) goto L_0x03c1
            java.lang.Integer r15 = X.AnonymousClass05K.A00
        L_0x0396:
            r0 = 36321769625036522(0x810a75001d26ea, double:3.0333715946754955E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x03a7
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = r3.A03
            if (r0 != 0) goto L_0x03a7
            r20 = 1
        L_0x03a7:
            r0 = 43
            X.Inj r1 = new X.Inj
            r1.<init>(r3, r0)
            r19 = 928(0x3a0, float:1.3E-42)
            X.MqK r0 = new X.MqK
            r16 = r6
            r17 = r1
            r18 = r4
            r11 = r0
            r12 = r13
            r13 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.A05 = r0
            goto L_0x03ec
        L_0x03c1:
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            goto L_0x0396
        L_0x03c4:
            X.MqP r0 = r3.A07
            if (r0 != 0) goto L_0x03d2
            java.lang.String r0 = "pogDrawable"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03d2:
            X.MqO r0 = r0.A0E
            X.3WR r0 = r0.A00
            if (r0 == 0) goto L_0x03ec
            com.instagram.user.model.User r0 = r3.A0R
            X.MqO r7 = X.C67589MqN.A01(r0)
            X.Nd7 r8 = X.C69026Nd7.A00
            X.PkP r9 = X.C73826PkP.A00
            X.MqP r0 = new X.MqP
            r4 = r0
            r5 = r13
            r6 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A08 = r0
        L_0x03ec:
            r0 = r27
            r0.A09(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69041NdZ.<init>(android.content.Context, X.07V, X.Wh8, X.WFU, com.instagram.common.session.UserSession, X.N4t, X.OHV):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r0 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            A00(r5)
            r6.save()
            boolean r3 = r5.A0S
            if (r3 != 0) goto L_0x001d
            float r2 = r5.A00
            android.graphics.RectF r0 = r5.A0K
            float r1 = r0.centerX()
            float r0 = r0.centerY()
            r6.rotate(r2, r1, r0)
        L_0x001d:
            r6.save()
            android.graphics.RectF r0 = r5.A0J
            float r1 = r0.left
            float r0 = r0.top
            r6.translate(r1, r0)
            if (r3 == 0) goto L_0x009e
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x009e
            X.MqK r0 = r5.A05
            if (r0 == 0) goto L_0x0036
        L_0x0033:
            r0.draw(r6)
        L_0x0036:
            r6.restore()
            X.OGK r0 = r5.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x005f
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r2 = r5.A03
            if (r2 == 0) goto L_0x005f
            r6.save()
            android.graphics.RectF r0 = r5.A0K
            float r1 = r0.left
            float r0 = r0.top
            r6.translate(r1, r0)
            android.graphics.Path r1 = r5.A0G
            android.graphics.Paint r0 = r5.A0F
            r6.drawPath(r1, r0)
            X.C66582MXn.A13(r2, r4)
            r2.draw(r6)
            r6.restore()
        L_0x005f:
            android.view.View r2 = r5.A02
            if (r2 == 0) goto L_0x008a
            r6.save()
            android.graphics.RectF r0 = r5.A0H
            float r1 = r0.left
            float r0 = r0.top
            r6.translate(r1, r0)
            X.C66582MXn.A13(r2, r4)
            r2.draw(r6)
            r6.restore()
            android.graphics.RectF r4 = r5.A0I
            android.content.Context r2 = r5.A0E
            r1 = 2130970269(0x7f04069d, float:1.7549243E38)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            int r0 = X.AnonymousClass7TF.A03(r2, r1)
            X.C14504TxQ.A00(r6, r4, r0)
        L_0x008a:
            X.OGK r0 = r5.A04
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00a8
            X.NQl r0 = r5.A06
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "namePlateDrawable"
        L_0x0096:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009e:
            X.MqP r0 = r5.A07
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "pogDrawable"
            goto L_0x0096
        L_0x00a5:
            r0.draw(r6)
        L_0x00a8:
            X.OGK r0 = r5.A04
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x00b5
            X.MqP r0 = r5.A08
            if (r0 == 0) goto L_0x00b5
            r0.draw(r6)
        L_0x00b5:
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x00d2
            if (r3 != 0) goto L_0x00d2
            X.N4t r0 = r5.A0P
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x00d2
            X.OGK r0 = r5.A04
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00d2
            r6.save()
            android.graphics.drawable.Drawable r0 = r5.A0L
            r0.draw(r6)
            r6.restore()
        L_0x00d2:
            r6.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69041NdZ.A0D(android.graphics.Canvas):void");
    }

    public final void A0K(ImageUrl imageUrl, String str, String str2) {
    }

    public final void A0L(Integer num, boolean z) {
    }

    public final void A0N(String str) {
        0qQ.A0B(str, 2);
        0rm A11 = C51965G9l.A11();
        A11.A00 = this.A0P;
        if (this.A0S) {
            for (Object next : this.A0M.A04()) {
                if (0qQ.A0K(((N4t) next).A0B, str)) {
                    A11.A00 = next;
                }
            }
            throw new NoSuchElementException(AnonymousClass000.A00(3));
        }
        boolean A032 = A03();
        AnonymousClass7TE.A1Z(new C59673JTe(A11, this, (AnonymousClass4D7) null, 17, A032), C71772f0.A00(this.A0h));
    }

    public final void CvB(C14635Tzh tzh) {
        this.A00 = 0.0f;
    }

    public final void CvF(C14635Tzh tzh) {
        this.A00 = 0.0f;
    }

    public final void CvN(C14635Tzh tzh) {
        this.A00 = 0.0f;
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (java.lang.Integer.valueOf(r5) != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0203, code lost:
        if (r3 != null) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0205, code lost:
        r0 = r3.getMeasuredWidth();
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Rect A00(X.C69041NdZ r19) {
        /*
            r7 = r19
            double r0 = r7.A0V
            double r10 = X.W2R.A01(r0)
            r7.A00 = r10
            double r0 = r7.A0U
            double r12 = X.W2R.A00(r0)
            r7.A01 = r12
            X.WFU r0 = r7.A0i
            X.W2R r8 = r0.A0J
            float[] r9 = r7.A0C
            r8.A06(r9, r10, r12)
            r2 = 0
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r3 = r7.A03
            if (r3 == 0) goto L_0x0027
            r3.measure(r12, r12)
        L_0x0027:
            X.MqK r1 = r7.A05
            java.lang.String r18 = "pogDrawable"
            if (r1 == 0) goto L_0x021e
            android.graphics.Rect r0 = r1.getBounds()
            if (r0 == 0) goto L_0x021e
        L_0x0033:
            int r6 = r0.width()
            if (r1 == 0) goto L_0x0214
            android.graphics.Rect r0 = r1.getBounds()
            if (r0 == 0) goto L_0x0214
        L_0x003f:
            int r4 = r0.height()
            if (r1 == 0) goto L_0x0203
            if (r3 == 0) goto L_0x0212
            int r5 = r3.getMeasuredWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto L_0x0205
        L_0x0051:
            int r14 = r3.getMeasuredHeight()
        L_0x0055:
            int r14 = r14 + r4
            int r0 = r7.A0g
            int r14 = r14 - r0
            r11 = r9[r2]
            r0 = 1
            r13 = r9[r0]
            float r0 = r7.A0A
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x01d0
            float r0 = r7.A0B
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x01d0
        L_0x006a:
            android.graphics.RectF r10 = r7.A0J
            float r9 = (float) r6
            r18 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r18
            float r8 = r11 - r9
            float r0 = (float) r4
            float r6 = r13 - r0
            float r9 = r9 + r11
            r10.set(r8, r6, r9, r13)
            android.graphics.RectF r4 = r7.A0K
            float r5 = (float) r5
            float r5 = r5 / r18
            float r17 = r11 - r5
            float r0 = (float) r14
            float r16 = r13 - r0
            float r5 = r5 + r11
            r2 = r17
            r0 = r16
            r4.set(r2, r0, r5, r13)
            android.graphics.drawable.Drawable r0 = r7.A0L
            r19 = r0
            int r15 = r19.getIntrinsicWidth()
            if (r3 == 0) goto L_0x01cc
            int r0 = r3.getMeasuredWidth()
            float r2 = (float) r0
            float r2 = r2 / r18
            float r2 = r2 + r11
        L_0x009e:
            float r0 = (float) r15
            float r2 = r2 - r0
            int r14 = X.AnonymousClass1GB.A01(r2)
            r0 = r10
            if (r3 == 0) goto L_0x00a8
            r0 = r4
        L_0x00a8:
            float r2 = r0.top
            int r0 = r15 / 4
            float r0 = (float) r0
            float r2 = r2 - r0
            int r4 = X.AnonymousClass1GB.A01(r2)
            int r0 = r14 + r15
            int r15 = r15 + r4
            r2 = r19
            r2.setBounds(r14, r4, r0, r15)
            android.graphics.Path r4 = r7.A0G
            r4.reset()
            float r14 = r7.A0X
            if (r3 == 0) goto L_0x01c9
            int r0 = r3.getMeasuredWidth()
            float r2 = (float) r0
        L_0x00c8:
            float r2 = r2 - r14
            if (r3 == 0) goto L_0x01c6
            int r0 = r3.getMeasuredHeight()
            float r0 = (float) r0
        L_0x00d0:
            float r0 = r0 - r14
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r14, r14, r2, r0)
            float r2 = r7.A0Y
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r4.addRoundRect(r3, r2, r2, r0)
            X.NQl r15 = r7.A06
            java.lang.String r18 = "namePlateDrawable"
            if (r15 == 0) goto L_0x0247
            int r14 = r15.A05
            int r0 = r15.A02
            r18 = r0
            int r0 = r14 / 2
            float r0 = (float) r0
            float r4 = r11 - r0
            if (r1 == 0) goto L_0x01a6
            int r0 = r7.A0d
        L_0x00f2:
            float r0 = (float) r0
            float r13 = r13 + r0
            float r2 = (float) r14
            float r2 = r2 + r4
            r0 = r18
            float r0 = (float) r0
            float r0 = r0 + r13
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r4, r13, r2, r0)
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r1.roundOut(r0)
            r15.setBounds(r0)
            android.view.View r4 = r7.A02
            if (r4 == 0) goto L_0x01a3
            r4.measure(r12, r12)
            int r0 = r4.getMeasuredWidth()
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r11 = r11 - r1
            int r0 = r4.getMeasuredHeight()
            float r3 = r10.top
            float r0 = (float) r0
            float r3 = r3 - r0
            int r0 = r7.A0b
            float r0 = (float) r0
            float r3 = r3 - r0
        L_0x0125:
            android.graphics.RectF r1 = r7.A0H
            if (r4 == 0) goto L_0x01a1
            int r0 = r4.getMeasuredWidth()
            float r2 = (float) r0
        L_0x012e:
            float r2 = r2 + r11
            if (r4 == 0) goto L_0x019f
            int r0 = r4.getMeasuredHeight()
            float r0 = (float) r0
        L_0x0136:
            float r0 = r0 + r3
            r1.set(r11, r3, r2, r0)
            android.graphics.RectF r0 = X.C14504TxQ.A00
            float r4 = r0.width()
            r0 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 * r0
            float r3 = r1.centerX()
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r4 / r0
            float r3 = r3 - r0
            float r2 = r1.bottom
            int r0 = r7.A0c
            float r0 = (float) r0
            float r2 = r2 - r0
            android.graphics.RectF r1 = r7.A0I
            float r4 = r4 + r3
            int r0 = r7.A0b
            float r0 = (float) r0
            float r0 = r0 + r2
            r1.set(r3, r2, r4, r0)
            X.MqP r11 = r7.A08
            if (r11 == 0) goto L_0x0228
            float r6 = r10.top
            float r1 = r10.height()
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            float r6 = r6 + r1
            android.content.Context r2 = r7.A0E
            r1 = 2131165200(0x7f070010, float:1.794461E38)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            int r0 = X.AnonymousClass7TF.A02(r2, r1)
            float r5 = r10.right
            float r0 = (float) r0
            float r5 = r5 - r0
            int r0 = r11.A02
            float r4 = (float) r0
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r3
            float r2 = r5 - r4
            int r0 = r11.A01
            float r1 = (float) r0
            float r1 = r1 / r3
            float r0 = r6 - r1
            float r5 = r5 + r4
            float r6 = r6 + r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r2, r0, r5, r6)
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r1.roundOut(r0)
            r11.setBounds(r0)
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0X(r11)
            return r0
        L_0x019f:
            r0 = 0
            goto L_0x0136
        L_0x01a1:
            r2 = 0
            goto L_0x012e
        L_0x01a3:
            r11 = 0
            r3 = 0
            goto L_0x0125
        L_0x01a6:
            X.N4t r0 = r7.A0P
            X.4AB r0 = r0.A05
            if (r0 != 0) goto L_0x01c2
            com.instagram.common.session.UserSession r0 = r7.A0O
            r1 = r0
            X.0Tu r0 = X.AnonymousClass7TF.A0H(r0)
            r2 = 36321769626806013(0x810a75003826fd, double:3.033371595794529E-306)
            boolean r0 = X.182.A06(r0, r1, r2)
            if (r0 == 0) goto L_0x01c2
            int r0 = r7.A0e
            goto L_0x00f2
        L_0x01c2:
            int r0 = r7.A0f
            goto L_0x00f2
        L_0x01c6:
            r0 = 0
            goto L_0x00d0
        L_0x01c9:
            r2 = 0
            goto L_0x00c8
        L_0x01cc:
            float r2 = r10.right
            goto L_0x009e
        L_0x01d0:
            r7.A0A = r11
            r7.A0B = r11
            r7.A01()
            boolean r0 = r7.A04()
            X.MqP r2 = r7.A07
            if (r0 == 0) goto L_0x01f4
            if (r2 == 0) goto L_0x0247
            X.MqO r0 = r2.A0E
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x006a
            android.animation.ValueAnimator r2 = r2.A0C
            boolean r0 = r2.isRunning()
            if (r0 != 0) goto L_0x006a
            r2.start()
            goto L_0x006a
        L_0x01f4:
            if (r2 == 0) goto L_0x0247
            android.animation.ValueAnimator r2 = r2.A0C
            boolean r0 = r2.isRunning()
            if (r0 == 0) goto L_0x006a
            r2.cancel()
            goto L_0x006a
        L_0x0203:
            if (r3 == 0) goto L_0x0212
        L_0x0205:
            int r0 = r3.getMeasuredWidth()
        L_0x0209:
            int r5 = java.lang.Math.max(r6, r0)
            if (r3 != 0) goto L_0x0051
            r14 = 0
            goto L_0x0055
        L_0x0212:
            r0 = 0
            goto L_0x0209
        L_0x0214:
            X.MqP r0 = r7.A07
            if (r0 == 0) goto L_0x0247
            android.graphics.Rect r0 = r0.getBounds()
            goto L_0x003f
        L_0x021e:
            X.MqP r0 = r7.A07
            if (r0 == 0) goto L_0x0247
            android.graphics.Rect r0 = r0.getBounds()
            goto L_0x0033
        L_0x0228:
            int r0 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x022e
            r8 = r17
        L_0x022e:
            int r3 = (int) r8
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0235
            r6 = r16
        L_0x0235:
            int r2 = (int) r6
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x023b
            r9 = r5
        L_0x023b:
            int r1 = (int) r9
            android.graphics.Rect r0 = r15.getBounds()
            int r0 = r0.bottom
            android.graphics.Rect r0 = X.C66580MXl.A0C(r3, r2, r1, r0)
            return r0
        L_0x0247:
            X.0qQ.A0F(r18)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69041NdZ.A00(X.NdZ):android.graphics.Rect");
    }

    private final void A01() {
        C67586MqK mqK;
        if (this.A0S && (mqK = this.A05) != null) {
            UserSession userSession = this.A0O;
            0Tu A0H2 = AnonymousClass7TF.A0H(userSession);
            if (182.A06(A0H2, userSession, 36321769626019571L)) {
                ArrayList A0S2 = 00k.A0S(mqK.A0F, mqK.A0E);
                ArrayList A0r = AnonymousClass7TG.A0r(A0S2);
                Iterator it = A0S2.iterator();
                while (it.hasNext()) {
                    Drawable drawable = ((C67592MqQ) it.next()).A02;
                    0qQ.A0C(drawable, "null cannot be cast to non-null type com.instagram.friendmap.video.MapVideoAnnotation");
                    A0r.add(drawable);
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : A0r) {
                    if (((JPR) next).AkI()) {
                        A1C.add(next);
                    }
                }
                List<JPR> A0d2 = 00k.A0d(A1C, C229632nm.A05(new 2HY(1, 5), DbS.A04(A0H2, userSession, 36603244602790799L)));
                if (A0d2 != null) {
                    for (JPR A022 : A0d2) {
                        A02(A022);
                    }
                    return;
                }
                return;
            }
        }
        C67591MqP mqP = this.A07;
        if (mqP == null) {
            0qQ.A0F("pogDrawable");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A02(mqP);
        }
    }

    private final boolean A03() {
        float f;
        N4t n4t = this.A0P;
        boolean z = n4t.A0J;
        if (z) {
            f = this.A0a;
        } else {
            f = this.A0Z;
        }
        OHV ohv = this.A0Q;
        LatLng latLng = new LatLng(this.A0U + Math.toDegrees((-(((double) f) * this.A0W)) / 6371009.0d), this.A0V);
        String str = n4t.A0B;
        AnonymousClass4AB r35 = n4t.A05;
        User user = n4t.A06;
        long j = n4t.A02;
        String str2 = n4t.A0A;
        boolean z2 = n4t.A0H;
        boolean z3 = n4t.A0I;
        String str3 = n4t.A09;
        boolean z4 = n4t.A0C;
        boolean z5 = n4t.A0E;
        int i = n4t.A01;
        boolean z6 = n4t.A0G;
        boolean z7 = n4t.A0K;
        boolean z8 = n4t.A00;
        boolean z9 = n4t.A0D;
        String str4 = n4t.A08;
        Integer num = n4t.A07;
        AnonymousClass7TF.A1C(str, 0, user);
        0qQ.A0B(num, 19);
        boolean z10 = z7;
        boolean z11 = z8;
        boolean z12 = z9;
        LatLng latLng2 = latLng;
        AnonymousClass4AB r14 = r35;
        User user2 = user;
        Integer num2 = num;
        String str5 = str;
        String str6 = str2;
        N4t n4t2 = new N4t(latLng2, r14, user2, num2, str5, str6, str3, str4, i, j, z2, z3, z, z4, z5, z6, n4t.A0F, z10, z11, z12);
        C69028NdD ndD = ohv.A04;
        int A002 = AnonymousClass0nB.A00(ohv.A00.requireContext());
        C69028NdD.A08(n4t2.A03, ndD, 17.5f, 0, true, false, false);
        C70290O0u.A00(ndD, new MH0(n4t2, ndD, (AnonymousClass4D7) null, A002), 300);
        return C51970G9q.A1T((this.A0i.A02().A02 > 17.5f ? 1 : (this.A0i.A02().A02 == 17.5f ? 0 : -1)));
    }

    private final boolean A04() {
        W2R w2r = this.A0i.A0J;
        C14723U4m u4m = w2r.A00.A0I;
        LatLng A042 = w2r.A04(0.0f, (float) u4m.A0E);
        LatLng A043 = w2r.A04((float) u4m.A0G, (float) u4m.A0E);
        LatLng A044 = w2r.A04(0.0f, 0.0f);
        LatLng A045 = w2r.A04((float) u4m.A0G, 0.0f);
        C18606Vuz vuz = new C18606Vuz();
        vuz.A02(A042);
        vuz.A02(A044);
        vuz.A02(A043);
        vuz.A02(A045);
        return vuz.A01().A01(Bdm());
    }

    public final int A0A(float f, float f2) {
        if (!this.A0j) {
            return 0;
        }
        if (this.A0K.contains(f, f2) || this.A0H.contains(f, f2)) {
            return 1;
        }
        return 0;
    }

    public final void A0C(float f, float f2) {
        this.A0C = C51966G9m.A1L(new MG8(this, (AnonymousClass4D7) null, 20), C71772f0.A00(this.A0h));
    }

    public final boolean A0E(float f, float f2) {
        Object obj;
        AnonymousClass4AB r0;
        List list;
        AnonymousClass913 r02;
        C279864zZ BWY;
        String str;
        Long A10;
        if (this.A0S) {
            return true;
        }
        OHV ohv = this.A0Q;
        String str2 = this.A0P.A0B;
        0qQ.A0B(str2, 0);
        C69028NdD ndD = ohv.A04;
        Iterator A022 = MYL.A02(ndD);
        while (true) {
            if (!A022.hasNext()) {
                obj = null;
                break;
            }
            obj = A022.next();
            if (0qQ.A0K(((N4t) obj).A0B, str2)) {
                break;
            }
        }
        N4t n4t = (N4t) obj;
        if (n4t == null || (r0 = n4t.A05) == null || (list = r0.A0J) == null || (r02 = (AnonymousClass913) 00k.A0J(list)) == null || (BWY = r02.BWY()) == null || (str = BWY.A0H) == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
            return true;
        }
        long longValue = A10.longValue();
        if (n4t.A06(ndD.A02)) {
            return true;
        }
        ndD.A0P(PH8.A00);
        ndD.A0P(new C72711PGr(n4t, new C41565AwX(longValue, ndD, 2)));
        return true;
    }

    public final boolean A0F(float f, float f2) {
        Object obj;
        AnonymousClass4AB r2;
        boolean z = false;
        if (!this.A0S) {
            z = true;
            this.A0D = true;
            OHV ohv = this.A0Q;
            String str = this.A0P.A0B;
            0qQ.A0B(str, 0);
            C69028NdD ndD = ohv.A04;
            Iterator A022 = MYL.A02(ndD);
            while (true) {
                if (!A022.hasNext()) {
                    obj = null;
                    break;
                }
                obj = A022.next();
                if (0qQ.A0K(((N4t) obj).A0B, str)) {
                    break;
                }
            }
            N4t n4t = (N4t) obj;
            if (!(n4t == null || (r2 = n4t.A05) == null)) {
                ndD.A0P(new PHA(true, new C58185Inp(31, r2, ndD)));
            }
        }
        return z;
    }

    public final boolean A0G(float f, float f2) {
        if (this.A0D) {
            this.A0D = false;
            return false;
        } else if (this.A0S) {
            OHV ohv = this.A0Q;
            C19879Wh8 wh8 = this.A0M;
            LinkedList A042 = wh8.A04();
            OMr oMr = ohv.A03;
            ArrayList A0r = AnonymousClass7TG.A0r(A042);
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                A0r.add(C66580MXl.A0f(it).A04);
            }
            if (oMr.A01(A0r, 40.0f, false)) {
                ohv.A02.A0F(A042, false);
                return true;
            }
            LinkedList A043 = wh8.A04();
            ohv.A02.A0F(A043, true);
            C69028NdD ndD = ohv.A04;
            ndD.A0P(new PHA(false, new C58185Inp(29, A043, ndD)));
            C69028NdD.A0F(new C69029NdE(MYL.A01(ndD)), ndD);
            return true;
        } else {
            Dba.A1S(this, C71772f0.A00(this.A0h), 26, A03());
            return true;
        }
    }

    public final void A0H(float f) {
        C67591MqP mqP = this.A07;
        if (mqP == null) {
            0qQ.A0F("pogDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        float f2 = 255.0f * f;
        mqP.setAlpha(AnonymousClass1GB.A01(f2));
        C67586MqK mqK = this.A05;
        if (mqK != null) {
            mqK.setAlpha(AnonymousClass1GB.A01(f2));
        }
        NoteBubbleView noteBubbleView = this.A03;
        if (noteBubbleView != null) {
            noteBubbleView.setAlpha(f);
        }
        A05();
    }

    public final void A0I(LatLng latLng) {
        this.A00 = W2R.A01(latLng.A01);
        this.A01 = W2R.A00(latLng.A00);
        A05();
    }

    public final void A0M(OGK ogk, Long l) {
        if (!this.A0S && !0qQ.A0K(this.A04, ogk)) {
            C262204Co r1 = this.A0C;
            if (r1 != null) {
                r1.AG7((CancellationException) null);
            }
            this.A04 = ogk;
            C67591MqP mqP = this.A07;
            if (mqP == null) {
                0qQ.A0F("pogDrawable");
                throw AnonymousClass00P.createAndThrow();
            }
            mqP.A04(ogk.A00, l, true);
            A05();
        }
    }

    public final String getId() {
        N4t n4t = this.A0P;
        if (n4t.A05 == null) {
            return N4t.A00(n4t);
        }
        String str = n4t.A0A;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.A0i.A0I.invalidate();
    }

    public final void onPause(AnonymousClass07Z r3) {
        C67591MqP mqP = this.A07;
        if (mqP == null) {
            0qQ.A0F("pogDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        ValueAnimator valueAnimator = mqP.A0C;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    private final void A02(JPR jpr) {
        0sP r0;
        if (jpr.AkI() && A04()) {
            OHV ohv = this.A0Q;
            if (182.A06(0Tu.A05, ohv.A01, 36321769623201490L)) {
                r0 = ohv.A05;
            } else {
                return;
            }
        } else if (((C67591MqP) jpr).A0E.A00 != null) {
            r0 = this.A0Q.A06;
        } else {
            return;
        }
        r0.invoke(jpr);
    }

    public final void A0B(float f, float f2) {
        this.A01 = System.currentTimeMillis();
        N4t n4t = this.A0P;
        0qQ.A0B(n4t, 1);
        boolean A052 = n4t.A05();
        int i = R.dimen.abc_alert_dialog_button_dimen;
        if (A052) {
            i = R.dimen.abc_list_item_height_material;
        }
        A0M(new OGK(new C67596MqU(0.5f, 0.0f, i, 0, 0, 0, 1790, false, false, false), true, true, true, true), 250L);
    }

    public final String A0J() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A0U);
        A1A.append(this.A0V);
        return A1A.toString();
    }

    public final void onResume(AnonymousClass07Z r1) {
        A01();
    }
}
