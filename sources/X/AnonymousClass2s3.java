package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.Arrays;
import kotlin.Deprecated;

/* renamed from: X.2s3  reason: invalid class name */
public final class AnonymousClass2s3 extends C231632rz implements C231652s1 {
    public static final int A0a = C231592rv.values().length;
    public AnonymousClass310 A00;
    public AnonymousClass33R A01;
    public AnonymousClass334 A02;
    public AnonymousClass2xS A03;
    public C243393Yp A04;
    public C2362933e A05;
    public final Context A06;
    public final FragmentActivity A07;
    public final C229382nI A08;
    public final UserSession A09;
    public final AnonymousClass2oE A0A;
    public final AnonymousClass4DU A0B;
    public final 0Pl A0C;
    public final SearchContext A0D;
    public final C249763kK A0E;
    public final Boolean A0F;
    public final Integer A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N;
    public final AnonymousClass0eM A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final AnonymousClass07Z A0T;
    public final C249453jo A0U;
    public final 0xF A0V;
    public final C231672s5 A0W;
    public final AnonymousClass57L A0X;
    public final AnonymousClass2kR A0Y;
    public final Integer A0Z;

    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0470, code lost:
        if (r1 != null) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x048a, code lost:
        if (r1.A4k() != false) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019f, code lost:
        if (r1.A04() == false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a8, code lost:
        if (r5.A0A.A0G == false) goto L_0x01aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02cd A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x032e A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x035e A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x036d A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03fa A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x042b A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x043f A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04cb A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04fe A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0550 A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x056c A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x05ae A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x05c1 A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06a5 A[Catch:{ all -> 0x0727 }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:355:? A[RETURN, SYNTHETIC] */
    /* renamed from: A06 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void buildRowViewTypes(X.C232672uC r27, X.1Xg r28, X.AnonymousClass3W1 r29) {
        /*
            r26 = this;
            r13 = 0
            r7 = r27
            X.0qQ.A0B(r7, r13)
            r8 = 1
            r3 = r28
            X.0qQ.A0B(r3, r8)
            r12 = 2
            r6 = r29
            X.0qQ.A0B(r6, r12)
            r0 = r26
            X.0eM r0 = r0.A0L
            java.lang.Object r5 = r0.getValue()
            X.33W r5 = (X.AnonymousClass33W) r5
            r16 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "buildRowViewTypes: "
            r1.append(r0)
            X.1UQ r0 = r3.A06
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 2077967661(0x7bdb452d, float:2.2770321E36)
            X.0fS.A01(r1, r0)
        L_0x003d:
            X.1UQ r2 = r3.A06     // Catch:{ all -> 0x0727 }
            X.1UQ r1 = X.1UQ.A0H     // Catch:{ all -> 0x0727 }
            if (r2 == r1) goto L_0x0057
            X.1UQ r0 = X.1UQ.A0Y     // Catch:{ all -> 0x0727 }
            if (r2 == r0) goto L_0x0057
            java.lang.String r1 = "Unsupported feed item type in FeedItemBinderGroup: "
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0727 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x0727 }
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0727 }
            r1.<init>(r0)     // Catch:{ all -> 0x0727 }
        L_0x0056:
            throw r1     // Catch:{ all -> 0x0727 }
        L_0x0057:
            X.1Xn r0 = r3.A05     // Catch:{ all -> 0x0727 }
            X.1Xj r4 = X.1Xi.A02(r0)     // Catch:{ all -> 0x0727 }
            if (r4 == 0) goto L_0x06b7
            r0 = 0
            if (r2 != r1) goto L_0x0063
            r0 = 1
        L_0x0063:
            r6.A2a = r0     // Catch:{ all -> 0x0727 }
            X.3OA r14 = r3.A01     // Catch:{ all -> 0x0727 }
            java.util.concurrent.ConcurrentMap r1 = r5.A0G     // Catch:{ all -> 0x0727 }
            boolean r0 = r4.CcK()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0072
            if (r14 == 0) goto L_0x0072
            goto L_0x007c
        L_0x0072:
            X.310 r0 = r5.A03     // Catch:{ all -> 0x0727 }
            X.3WV r0 = r0.BRO()     // Catch:{ all -> 0x0727 }
            r0.E49(r4, r6)     // Catch:{ all -> 0x0727 }
            goto L_0x008e
        L_0x007c:
            java.lang.String r0 = r4.getId()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x06ae
            r1.put(r0, r14)     // Catch:{ all -> 0x0727 }
            X.310 r0 = r5.A03     // Catch:{ all -> 0x0727 }
            X.3WV r0 = r0.BRO()     // Catch:{ all -> 0x0727 }
            r0.E4A(r6, r14)     // Catch:{ all -> 0x0727 }
        L_0x008e:
            com.instagram.common.session.UserSession r3 = r5.A02     // Catch:{ all -> 0x0727 }
            boolean r0 = X.C231122qu.A0S(r3, r4)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x00a3
            X.2rv r0 = X.C231592rv.HOLDOUT     // Catch:{ all -> 0x0727 }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            X.33X r0 = r5.A05     // Catch:{ all -> 0x0727 }
            r0.A06(r7, r4, r6, r1)     // Catch:{ all -> 0x0727 }
            goto L_0x06c0
        L_0x00a3:
            X.33X r2 = r5.A05     // Catch:{ all -> 0x0727 }
            boolean r0 = r2.A08(r7, r4, r6)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x00ad
            goto L_0x071a
        L_0x00ad:
            java.lang.String r1 = "open_carousel_review_page"
            X.4DU r9 = r5.A08     // Catch:{ all -> 0x0727 }
            java.lang.String r0 = r9.getModuleName()     // Catch:{ all -> 0x0727 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x00d4
            X.2rv r0 = X.C231592rv.LITHO_MEDIA_HEADER     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            java.lang.String r0 = r5.A0E     // Catch:{ all -> 0x0727 }
            r2.A05(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            X.2rv r0 = X.C231592rv.LITHO_OPEN_CAROUSEL_REVIEW_MEDIA_CTA_ROW     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            goto L_0x06ca
        L_0x00d4:
            boolean r0 = r6.A2e     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = r5.A0E     // Catch:{ all -> 0x0727 }
            r2.A05(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            goto L_0x06d4
        L_0x00df:
            boolean r0 = r6.A3F     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x00ec
            X.2rv r0 = X.C231592rv.MEDIA_AYSF     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x00ec:
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.DUN r0 = r0.BQb()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x00fd
            X.2rv r0 = X.C231592rv.MEDIA_NOTICE     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x00fd:
            boolean r0 = r6.A2a     // Catch:{ all -> 0x0727 }
            boolean r15 = X.AnonymousClass3WY.A00(r3, r4, r9, r0)     // Catch:{ all -> 0x0727 }
            if (r15 != 0) goto L_0x0131
            X.0rQ r1 = r5.A0B     // Catch:{ all -> 0x0727 }
            r9.getModuleName()     // Catch:{ all -> 0x0727 }
            boolean r0 = r1.A05(r4)     // Catch:{ all -> 0x0727 }
            if (r0 != r8) goto L_0x0131
            X.0eM r0 = r5.A0H     // Catch:{ all -> 0x0727 }
            r0.getValue()     // Catch:{ all -> 0x0727 }
            int r0 = r6.getPosition()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0131
            boolean r0 = r1.A04()     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x0131
            X.2rv r0 = X.C231592rv.GAP     // Catch:{ all -> 0x0727 }
            int r10 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0727 }
            X.4Ec r0 = new X.4Ec     // Catch:{ all -> 0x0727 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r0, r6, r10)     // Catch:{ all -> 0x0727 }
        L_0x0131:
            X.33Y r1 = r5.A04     // Catch:{ all -> 0x0727 }
            java.lang.String r0 = r9.getModuleName()     // Catch:{ all -> 0x0727 }
            java.lang.Integer r18 = r1.A00(r4, r0)     // Catch:{ all -> 0x0727 }
            java.lang.String r11 = r5.A0E     // Catch:{ all -> 0x0727 }
            boolean r0 = r2.A0A(r4, r6, r11)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0147
            if (r18 != 0) goto L_0x0147
            goto L_0x05f0
        L_0x0147:
            boolean r0 = r2.A09(r4)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0150
            if (r15 != 0) goto L_0x01a1
            goto L_0x0190
        L_0x0150:
            if (r15 == 0) goto L_0x016b
            X.2rv r0 = X.C231592rv.GAP     // Catch:{ all -> 0x0727 }
            int r10 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0727 }
            X.4Ec r0 = new X.4Ec     // Catch:{ all -> 0x0727 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r0, r6, r10)     // Catch:{ all -> 0x0727 }
            X.2rv r0 = X.C231592rv.MEDIA_TOPIC_HEADER     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x016b:
            X.0rQ r1 = r5.A0B     // Catch:{ all -> 0x0727 }
            r9.getModuleName()     // Catch:{ all -> 0x0727 }
            boolean r0 = r1.A05(r4)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x017c
            boolean r0 = r1.A04()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x01aa
        L_0x017c:
            X.2rq r10 = X.C231542rq.MEDIA_HEADER     // Catch:{ all -> 0x0727 }
            java.lang.String r1 = r9.getModuleName()     // Catch:{ all -> 0x0727 }
            X.2rm r0 = r5.A0A     // Catch:{ all -> 0x0727 }
            X.2rv r0 = r0.A00(r4, r10, r1)     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            goto L_0x01aa
        L_0x0190:
            X.0rQ r1 = r5.A0B     // Catch:{ all -> 0x0727 }
            r9.getModuleName()     // Catch:{ all -> 0x0727 }
            boolean r0 = r1.A05(r4)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x01a1
            boolean r0 = r1.A04()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x01a4
        L_0x01a1:
            r2.A03(r7, r4, r6)     // Catch:{ all -> 0x0727 }
        L_0x01a4:
            X.2rm r0 = r5.A0A     // Catch:{ all -> 0x0727 }
            boolean r0 = r0.A0G     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x01b7
        L_0x01aa:
            boolean r0 = r6.A2v     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x01b7
            X.2rv r0 = X.C231592rv.MEDIA_AYSF     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x01b7:
            r2.A05(r7, r4, r6, r11)     // Catch:{ all -> 0x0727 }
            r2.A04(r7, r4, r6)     // Catch:{ all -> 0x0727 }
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.DUO r0 = r0.BQi()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x01d1
            X.2rv r0 = X.C231592rv.FEED_ADD_YOURS_CTA     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x01d1:
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.47o r0 = r0.Amn()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x01f2
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x0727 }
            r0 = 36318230570407949(0x81073d0005180d, double:3.031133482277757E-306)
            boolean r0 = X.182.A06(r10, r3, r0)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x01f2
            X.2rv r0 = X.C231592rv.CHANNEL_CTA     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x01f2:
            X.3xf r0 = r4.A1F()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0204
            X.2rv r0 = X.C231592rv.BUYER_INCENTIVE_BANNER     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x0204:
            boolean r0 = r4.CcK()     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x0220
            if (r14 != 0) goto L_0x0220
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.5HT r0 = r0.BYk()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0220
            X.2rv r0 = X.C231592rv.PROFESSIONAL_ORGANIC_MEDIA_BAR_CTA     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x0220:
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.1eb r0 = r0.BFi()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0234
            X.2rv r0 = X.C231592rv.IGBIO_PRODUCT_MEDIA_BAR_CTA     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x0234:
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.DTn r0 = r0.B4x()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x024c
            boolean r0 = r6.A1k     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x024c
            X.2rv r0 = X.C231592rv.FEATURED_PRODUCTS_UPSELL_CTA     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x024c:
            X.0eM r0 = r5.A0J     // Catch:{ all -> 0x0727 }
            r25 = r0
            java.lang.Object r0 = r25.getValue()     // Catch:{ all -> 0x0727 }
            X.33Z r0 = (X.AnonymousClass33Z) r0     // Catch:{ all -> 0x0727 }
            X.0eM r0 = r0.A0i     // Catch:{ all -> 0x0727 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0727 }
            X.3YK r0 = (X.AnonymousClass3YK) r0     // Catch:{ all -> 0x0727 }
            android.content.Context r14 = r5.A00     // Catch:{ all -> 0x0727 }
            X.3YL r10 = new X.3YL     // Catch:{ all -> 0x0727 }
            r10.<init>(r14, r3)     // Catch:{ all -> 0x0727 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x0727 }
            java.lang.String r0 = r4.getId()     // Catch:{ all -> 0x0727 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x0277
            boolean r0 = r10.A02(r4)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0283
        L_0x0277:
            X.2rv r0 = X.C231592rv.UNIFIED_FEEDBACK_DISCLOSURE_NUX     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x0283:
            X.2rv r1 = X.C231592rv.APP_INSTALL_CTA     // Catch:{ all -> 0x0727 }
            boolean r0 = X.AnonymousClass3YQ.A00(r1, r4)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0295
            int r0 = r1.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x0295:
            boolean r0 = r4.A4g()     // Catch:{ all -> 0x0727 }
            r1 = 0
            if (r0 == 0) goto L_0x0396
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.1bS r0 = r0.B8b()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x02a8
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r1 = r0.B8e()     // Catch:{ all -> 0x0727 }
        L_0x02a8:
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r0 = com.instagram.model.fundraiser.FundraiserCampaignTypeEnum.IG_CHARITY_BUSINESS_PROFILE     // Catch:{ all -> 0x0727 }
            if (r1 != r0) goto L_0x038e
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x0727 }
            r0 = 36318522627922141(0x810781000118dd, double:3.031318180625753E-306)
            boolean r0 = X.182.A06(r10, r3, r0)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x038e
            X.2rv r0 = X.C231592rv.MEDIA_FUNDRAISER_DONATE_BUTTON     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
        L_0x02bf:
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x02c5:
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.DSX r0 = r0.Aqj()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x02d6
            X.2rv r0 = X.C231592rv.SCHEDULED_CONTENT_PUBLISH_TIME     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x02d6:
            java.lang.Boolean r0 = r5.A0D     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x02ec
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x02ec
            X.2rv r0 = X.C231592rv.BOOST_GUIDANCE_CTA     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x02ec:
            boolean r0 = r4.A6a(r3)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0324
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.JSO r0 = r0.CGF()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0324
            java.lang.String r0 = r0.getIconicHorizonWorldDeeplink()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0324
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.JSO r0 = r0.CGF()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0324
            java.lang.Integer r0 = r0.BES()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0324
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x0727 }
            r0 = 36329083952578332(0x81111c00023f1c, double:3.037997204865369E-306)
            boolean r0 = X.182.A06(r10, r3, r0)     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x0324
            X.2rv r0 = X.C231592rv.ICONIC_ENTRYPOINTS_CTA     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x0324:
            java.lang.Integer r10 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0727 }
            X.1sy r0 = r6.A0o     // Catch:{ all -> 0x0727 }
            boolean r0 = X.AnonymousClass3YR.A05(r3, r4, r0, r10, r8)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x033a
            X.2rv r0 = X.C231592rv.MEDIA_INSIGHTS     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x033a:
            int r0 = r4.A0q()     // Catch:{ all -> 0x0727 }
            if (r0 <= 0) goto L_0x0356
            X.0Tu r15 = X.0Tu.A05     // Catch:{ all -> 0x0727 }
            r0 = 2342163288483831967(0x2081091a000a209f, double:4.065822677624597E-152)
            boolean r0 = X.182.A06(r15, r3, r0)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0356
            X.2rv r0 = X.C231592rv.MEDIA_OPEN_CAROUSEL_REVIEW_CTA     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x0356:
            X.3YU r0 = X.AnonymousClass3YS.A01     // Catch:{ all -> 0x0727 }
            boolean r0 = r0.A00(r3, r4, r6)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0367
            X.2rv r0 = X.C231592rv.MEDIA_OPEN_CAROUSEL_TURN_ON_CTA     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x0367:
            boolean r0 = X.AnonymousClass3YV.A08(r3, r4)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x03f8
            X.2rv r0 = X.C231592rv.COLLABORATIVE_INVITE     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
            X.0Tu r15 = X.0Tu.A05     // Catch:{ all -> 0x0727 }
            r0 = 36324363783581737(0x810cd100033029, double:3.0350121509853275E-306)
            boolean r0 = X.182.A06(r15, r3, r0)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x03f8
            java.lang.String r0 = r4.getId()     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x03e5
            goto L_0x06de
        L_0x038e:
            X.2rv r0 = X.C231592rv.MEDIA_FUNDRAISER     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            goto L_0x02bf
        L_0x0396:
            int r0 = r6.A03     // Catch:{ all -> 0x0727 }
            X.1Xj r0 = r4.A1c(r0)     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x039f
            r0 = r4
        L_0x039f:
            boolean r0 = r0.A6M()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x03c8
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x0727 }
            r0 = 36326150489781819(0x810e710000363b, double:3.036142071180748E-306)
            boolean r0 = X.182.A06(r10, r3, r0)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x03c0
            X.2nI r0 = r5.A01     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x03c0
            X.2rm r0 = r5.A0A     // Catch:{ all -> 0x0727 }
            X.2rv r0 = r0.A03     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            goto L_0x02bf
        L_0x03c0:
            X.2rv r0 = X.C231592rv.MEDIA_OVERLAY_CTA     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            goto L_0x02bf
        L_0x03c8:
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            com.instagram.api.schemas.BoostUpsellBannerPayloadSchema r0 = r0.Ah4()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x02c5
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x0727 }
            r0 = 36327516289710570(0x810faf000539ea, double:3.037005808555325E-306)
            boolean r0 = X.182.A06(r10, r3, r0)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x02c5
            X.2rv r0 = X.C231592rv.LITHO_BOOST_UPSELL_BANNER     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            goto L_0x02bf
        L_0x03e5:
            java.util.HashMap r22 = X.AnonymousClass3YV.A00(r3, r9, r0)     // Catch:{ all -> 0x0727 }
            if (r22 != 0) goto L_0x03ed
            goto L_0x06e8
        L_0x03ed:
            java.lang.String r21 = "com.instagram.creator_connections.screens.collab_accept_bottom_sheet_screen.component.view"
            r23 = 3600(0xe10, double:1.7786E-320)
            r19 = r14
            r20 = r3
            X.C55175HdR.A00(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0727 }
        L_0x03f8:
            if (r18 == 0) goto L_0x041d
            int r0 = r18.intValue()     // Catch:{ all -> 0x0727 }
            if (r0 == r13) goto L_0x040e
            if (r0 == r12) goto L_0x0411
            if (r0 != r8) goto L_0x0407
            X.2rv r0 = X.C231592rv.COMPOSE_MEDIA_UFI     // Catch:{ all -> 0x0727 }
            goto L_0x0413
        L_0x0407:
            X.Wub r1 = new X.Wub     // Catch:{ all -> 0x0727 }
            r1.<init>()     // Catch:{ all -> 0x0727 }
            goto L_0x0056
        L_0x040e:
            X.2rv r0 = X.C231592rv.LITHO_MEDIA_UFI     // Catch:{ all -> 0x0727 }
            goto L_0x0413
        L_0x0411:
            X.2rv r0 = X.C231592rv.MEDIA_UFI     // Catch:{ all -> 0x0727 }
        L_0x0413:
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x041d:
            X.2rm r12 = r5.A0A     // Catch:{ all -> 0x0727 }
            X.2rq r1 = X.C231542rq.COALESCED_FOOTER     // Catch:{ all -> 0x0727 }
            java.lang.String r0 = r9.getModuleName()     // Catch:{ all -> 0x0727 }
            boolean r0 = r12.A03(r4, r1, r0)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x043f
            X.3YW r0 = X.AnonymousClass33W.A01(r5, r4, r6)     // Catch:{ all -> 0x0727 }
            r2.A01(r7, r0, r4, r6)     // Catch:{ all -> 0x0727 }
            if (r18 != 0) goto L_0x05f7
            X.2rv r0 = X.C231592rv.LITHO_COALESCED_FOOTER     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
            goto L_0x05f7
        L_0x043f:
            if (r18 != 0) goto L_0x045b
            X.2rq r1 = X.C231542rq.MEDIA_UFI     // Catch:{ all -> 0x0727 }
            java.lang.String r0 = r9.getModuleName()     // Catch:{ all -> 0x0727 }
            X.2rv r0 = r12.A00(r4, r1, r0)     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            X.2rv r0 = X.C231592rv.MEDIA_UFI     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r6.A09(r0)     // Catch:{ all -> 0x0727 }
        L_0x045b:
            X.2rv r0 = X.C231592rv.MEDIA_FEEDBACK     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            boolean r0 = r4.A5D()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0481
            int r0 = r6.A03     // Catch:{ all -> 0x0727 }
            X.1Xj r1 = r4.A1c(r0)     // Catch:{ all -> 0x0727 }
            if (r1 == 0) goto L_0x0495
        L_0x0472:
            boolean r0 = r1.A5S()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0486
            X.3gp r0 = r1.A1U()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0495
            java.lang.String r0 = r0.A0d     // Catch:{ all -> 0x0727 }
            goto L_0x0483
        L_0x0481:
            r1 = r4
            goto L_0x0472
        L_0x0483:
            if (r0 == 0) goto L_0x0495
            goto L_0x048c
        L_0x0486:
            boolean r0 = r1.A4k()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0495
        L_0x048c:
            X.2rv r0 = X.C231592rv.MEDIA_HEADLINE     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x0495:
            boolean r0 = r4.CcK()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x04b0
            boolean r0 = r4.A4z()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x04b0
            boolean r0 = X.C231122qu.A0P(r3, r4)     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x04b0
            X.2rv r0 = X.C231592rv.BRANDED_CONTENT_LABEL     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x04b0:
            java.lang.String r23 = r9.getModuleName()     // Catch:{ all -> 0x0727 }
            boolean r0 = r5.A0L     // Catch:{ all -> 0x0727 }
            X.3YW r1 = new X.3YW     // Catch:{ all -> 0x0727 }
            r19 = r14
            r20 = r3
            r21 = r4
            r22 = r6
            r24 = r0
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0727 }
            boolean r0 = r1.A03     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x04e1
            X.3gp r12 = r1.A00()     // Catch:{ all -> 0x0727 }
            X.1Xj r0 = r1.A01     // Catch:{ all -> 0x0727 }
            int r13 = r1.A04     // Catch:{ all -> 0x0727 }
            X.3dY r1 = new X.3dY     // Catch:{ all -> 0x0727 }
            r1.<init>(r12, r0, r6, r13)     // Catch:{ all -> 0x0727 }
            X.2rv r0 = X.C231592rv.MEDIA_COMMENT     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r1, r0)     // Catch:{ all -> 0x0727 }
        L_0x04e1:
            X.3YW r15 = X.AnonymousClass33W.A01(r5, r4, r6)     // Catch:{ all -> 0x0727 }
            boolean r0 = X.2R8.A02(r3, r4)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x04fa
            boolean r0 = r4.A4c()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x04fa
            X.2rv r0 = X.C231592rv.MEDIA_VIEW_COMMENT_CONTROLS     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x04fa:
            boolean r14 = r15.A06     // Catch:{ all -> 0x0727 }
            if (r14 != 0) goto L_0x054c
            boolean r0 = r15.A08     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x050f
            boolean r0 = r5.A0M     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x050f
            X.2rv r0 = X.C231592rv.MEDIA_VIEW_ALL_COMMENTS     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x050f:
            X.3DI r0 = X.AnonymousClass3DI.A00     // Catch:{ all -> 0x0727 }
            boolean r0 = r0.A04(r3)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0523
            X.2rv r0 = X.C231592rv.LITHO_SOCIAL_CONTEXT_BUBBLES     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            r2.A07(r15, r6)     // Catch:{ all -> 0x0727 }
        L_0x0523:
            java.lang.Object r0 = r25.getValue()     // Catch:{ all -> 0x0727 }
            X.33Z r0 = (X.AnonymousClass33Z) r0     // Catch:{ all -> 0x0727 }
            X.0eM r0 = r0.A0d     // Catch:{ all -> 0x0727 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0727 }
            X.3fU r0 = (X.C246943fU) r0     // Catch:{ all -> 0x0727 }
            boolean r1 = r0.A03(r4, r9, r6)     // Catch:{ all -> 0x0727 }
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.3lZ r0 = r0.getInjected()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0576
            com.instagram.api.schemas.TestimonialDict r0 = r0.C4j()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0576
            X.2rv r0 = X.C231592rv.LITHO_TESTIMONIAL     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x054c:
            X.2oE r0 = r5.A07     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0564
            X.0rQ r0 = r5.A0B     // Catch:{ all -> 0x0727 }
            r9.getModuleName()     // Catch:{ all -> 0x0727 }
            boolean r0 = r0.A05(r4)     // Catch:{ all -> 0x0727 }
            if (r0 == r8) goto L_0x0564
            X.2rv r0 = X.C231592rv.MEDIA_INLINE_COMPOSER_BUTTON     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x0564:
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.DSX r0 = r0.Aqj()     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x05ac
            X.2rv r0 = X.C231592rv.MEDIA_LABEL_BELOW_COMMENTS     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            goto L_0x05ac
        L_0x0576:
            boolean r0 = r15.A07     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x054c
            boolean r0 = r5.A0M     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x054c
            if (r1 != 0) goto L_0x054c
            java.util.List r0 = r15.A02     // Catch:{ all -> 0x0727 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0727 }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ all -> 0x0727 }
        L_0x058a:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x054c
            java.lang.Object r13 = r18.next()     // Catch:{ all -> 0x0727 }
            X.3gp r13 = (X.C247733gp) r13     // Catch:{ all -> 0x0727 }
            X.0qQ.A0A(r13)     // Catch:{ all -> 0x0727 }
            X.1Xj r12 = r15.A01     // Catch:{ all -> 0x0727 }
            int r1 = r15.A04     // Catch:{ all -> 0x0727 }
            X.3dY r0 = new X.3dY     // Catch:{ all -> 0x0727 }
            r0.<init>(r13, r12, r6, r1)     // Catch:{ all -> 0x0727 }
            X.2rv r1 = X.C231592rv.MEDIA_COMMENT     // Catch:{ all -> 0x0727 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r0, r1)     // Catch:{ all -> 0x0727 }
            goto L_0x058a
        L_0x05ac:
            if (r14 == 0) goto L_0x05b7
            X.2rv r0 = X.C231592rv.COMMENTS_LOADING_SPINNER     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x05b7:
            X.4dE r0 = X.C268334dD.A00(r3)     // Catch:{ all -> 0x0727 }
            java.lang.String r1 = r4.A2n()     // Catch:{ all -> 0x0727 }
            if (r1 == 0) goto L_0x06a5
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x0727 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0727 }
            X.4dG r0 = (X.C268364dG) r0     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x05db
            X.UxV r1 = r0.A02     // Catch:{ all -> 0x0727 }
            X.UxV r0 = X.C16576UxV.FEATURED_PRODUCTS     // Catch:{ all -> 0x0727 }
            if (r1 == r0) goto L_0x05db
            X.2rv r0 = X.C231592rv.PRODUCT_HSCROLL     // Catch:{ all -> 0x0727 }
        L_0x05d3:
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
            goto L_0x05f7
        L_0x05db:
            X.2rv r0 = X.C231592rv.GAP     // Catch:{ all -> 0x0727 }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            X.4Ec r0 = new X.4Ec     // Catch:{ all -> 0x0727 }
            r0.<init>(r4, r10)     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r0, r6, r1)     // Catch:{ all -> 0x0727 }
            boolean r0 = r5.A0K     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x05f7
            X.2rv r0 = X.C231592rv.ACCESSIBLE_ACTIONS     // Catch:{ all -> 0x0727 }
            goto L_0x05d3
        L_0x05f0:
            X.3YW r0 = X.AnonymousClass33W.A01(r5, r4, r6)     // Catch:{ all -> 0x0727 }
            r2.A02(r7, r0, r4, r6)     // Catch:{ all -> 0x0727 }
        L_0x05f7:
            java.lang.String r1 = r9.getModuleName()     // Catch:{ all -> 0x0727 }
            java.lang.String r0 = "feed_timeline"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x060b
            java.lang.String r0 = "feed_timeline_older"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0624
        L_0x060b:
            X.1Xy r0 = r4.A0C     // Catch:{ all -> 0x0727 }
            X.3y6 r5 = r0.B5M()     // Catch:{ all -> 0x0727 }
            if (r5 == 0) goto L_0x0624
            com.instagram.api.schemas.OnImpressionStyle r1 = r5.C23()     // Catch:{ all -> 0x0727 }
            com.instagram.api.schemas.OnImpressionStyle r0 = com.instagram.api.schemas.OnImpressionStyle.UNIFIED_NO_SUBTEXT     // Catch:{ all -> 0x0727 }
            if (r1 != r0) goto L_0x0691
            X.2rv r0 = X.C231592rv.CONTENT_CONTROL_UNIFIED     // Catch:{ all -> 0x0727 }
        L_0x061d:
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x0624:
            java.util.HashMap r1 = X.AnonymousClass3KD.A05     // Catch:{ all -> 0x0727 }
            java.lang.String r0 = r4.A2n()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x069c
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0643
            X.W07 r0 = X.VKH.A00     // Catch:{ all -> 0x0727 }
            boolean r0 = r0.A04(r3, r4)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0643
            X.2rv r0 = X.C231592rv.IFU_UNIT_HSCROLL     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x0643:
            int r0 = X.C243393Yp.A00(r9, r11)     // Catch:{ all -> 0x0727 }
            X.C243393Yp.A01(r4, r0)     // Catch:{ all -> 0x0727 }
            boolean r0 = r6.A3G     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0657
            X.2rv r0 = X.C231592rv.MEDIA_AYSF     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x0657:
            X.4g6 r0 = r4.A08     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0684
            boolean r0 = X.1CI.A00(r3)     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0684
            X.0xi r0 = X.0tS.A4E     // Catch:{ all -> 0x0727 }
            X.0tS r5 = r0.A00()     // Catch:{ all -> 0x0727 }
            X.0s0 r3 = r5.A0y     // Catch:{ all -> 0x0727 }
            X.0YZ[] r1 = X.0tS.A4G     // Catch:{ all -> 0x0727 }
            r0 = 205(0xcd, float:2.87E-43)
            r0 = r1[r0]     // Catch:{ all -> 0x0727 }
            java.lang.Object r0 = r3.CDM(r5, r0)     // Catch:{ all -> 0x0727 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0727 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0684
            X.2rv r0 = X.C231592rv.MEDIA_DEBUG_INFO     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x0684:
            boolean r1 = r6.A3C     // Catch:{ all -> 0x0727 }
            if (r1 != 0) goto L_0x06f2
            boolean r0 = r6.A39     // Catch:{ all -> 0x0727 }
            if (r0 != 0) goto L_0x06f2
            boolean r0 = r6.A3B     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0710
            goto L_0x06f2
        L_0x0691:
            com.instagram.api.schemas.OnImpressionStyle r1 = r5.C23()     // Catch:{ all -> 0x0727 }
            com.instagram.api.schemas.OnImpressionStyle r0 = com.instagram.api.schemas.OnImpressionStyle.MINIMAL     // Catch:{ all -> 0x0727 }
            if (r1 != r0) goto L_0x0624
            X.2rv r0 = X.C231592rv.CONTENT_CONTROL_MINIMAL     // Catch:{ all -> 0x0727 }
            goto L_0x061d
        L_0x069c:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0727 }
            r1.<init>(r0)     // Catch:{ all -> 0x0727 }
            goto L_0x0056
        L_0x06a5:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0727 }
            r1.<init>(r0)     // Catch:{ all -> 0x0727 }
            goto L_0x0056
        L_0x06ae:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0727 }
            r1.<init>(r0)     // Catch:{ all -> 0x0727 }
            goto L_0x0056
        L_0x06b7:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0727 }
            r1.<init>(r0)     // Catch:{ all -> 0x0727 }
            goto L_0x0056
        L_0x06c0:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0726
            r0 = -511002600(0xffffffffe18ab818, float:-3.198645E20)
            goto L_0x0723
        L_0x06ca:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0726
            r0 = -770457768(0xffffffffd213bf58, float:-1.58642602E11)
            goto L_0x0723
        L_0x06d4:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0726
            r0 = -1168763617(0xffffffffba56151f, float:-8.1665994E-4)
            goto L_0x0723
        L_0x06de:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0726
            r0 = -2034089956(0xffffffff86c2401c, float:-7.306889E-35)
            goto L_0x0723
        L_0x06e8:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0726
            r0 = -108729652(0xfffffffff984eacc, float:-8.626818E34)
            goto L_0x0723
        L_0x06f2:
            if (r1 == 0) goto L_0x06f5
            goto L_0x0707
        L_0x06f5:
            boolean r0 = r6.A3B     // Catch:{ all -> 0x0727 }
            if (r0 == 0) goto L_0x0700
            X.2rv r0 = X.C231592rv.TOMBSTONE_REDESIGN_AD_BREAK     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            goto L_0x070d
        L_0x0700:
            X.2rv r0 = X.C231592rv.TOMBSTONE_PERSISTENT_AD_BREAK     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
            goto L_0x070d
        L_0x0707:
            X.2rv r0 = X.C231592rv.TOMBSTONE_AD_BREAK     // Catch:{ all -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0727 }
        L_0x070d:
            r2.A06(r7, r4, r6, r0)     // Catch:{ all -> 0x0727 }
        L_0x0710:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0726
            r0 = 1495970042(0x592ab0fa, float:3.00283336E15)
            goto L_0x0723
        L_0x071a:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0726
            r0 = -1317887277(0xffffffffb172a2d3, float:-3.530819E-9)
        L_0x0723:
            X.0fS.A00(r0)
        L_0x0726:
            return
        L_0x0727:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0734
            r0 = 1215157720(0x486dd5d8, float:243543.38)
            X.0fS.A00(r0)
        L_0x0734:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2s3.buildRowViewTypes(X.2uC, X.1Xg, X.3W1):void");
    }

    public final void AHO(1Xj r4, AnonymousClass3W1 r5, int i) {
        String str;
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        if (i == C231592rv.COMPOSE_MEDIA_UFI.ordinal()) {
            AnonymousClass334 r0 = this.A02;
            if (r0 == null) {
                str = "binders";
            } else {
                C2364333s r2 = (C2364333s) r0.A0k.getValue();
                String id = r4.getId();
                if (id != null) {
                    r2.A00.AGG();
                    r2.A01.remove(id);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C2362933e r02 = this.A05;
            if (r02 == null) {
                str = "lithoFeedBinderGroup";
            } else {
                r02.AHO(r4, r5, i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void E3r(1Xj r5, AnonymousClass3W1 r6, Integer num, int i) {
        String str;
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(num, 3);
        if (i == C231592rv.COMPOSE_MEDIA_UFI.ordinal()) {
            AnonymousClass334 r0 = this.A02;
            if (r0 == null) {
                str = "binders";
            } else {
                C2364333s r3 = (C2364333s) r0.A0k.getValue();
                String id = r5.getId();
                if (id != null) {
                    r3.A03(id, new C376459Ib(((AnonymousClass33Z) ((AnonymousClass33W) this.A0L.getValue()).A0J.getValue()).A00(), r5, r6), Integer.valueOf(getViewModelHash(i, r5, r6)));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C2362933e r02 = this.A05;
            if (r02 == null) {
                str = "lithoFeedBinderGroup";
            } else {
                r02.E3r(r5, r6, num, i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getBinderGroupName() {
        return "FeedItem";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        if (C231592rv.values()[i] == C231592rv.MEDIA_COMMENT) {
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.FeedCommentRowModelAndState");
            return ((C245833dY) obj2).A01.hashCode();
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
        return Arrays.hashCode(new Object[]{((1Xl) obj).BPf().getId(), Integer.valueOf(i)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0080, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A02, 36319626434780712L) != false) goto L_0x0263;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getViewModelHash(int r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            r1 = 1
            X.0qQ.A0B(r10, r1)
            X.0eM r0 = r8.A0L
            java.lang.Object r4 = r0.getValue()
            X.33W r4 = (X.AnonymousClass33W) r4
            X.1Xl r10 = (X.1Xl) r10
            X.0qQ.A0B(r10, r1)
            r0 = 1
            boolean r7 = com.facebook.systrace.Systrace.A0E(r0)
            X.2rv[] r0 = X.C231592rv.values()
            r6 = r0[r9]
            if (r7 == 0) goto L_0x003b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FeedItemBinderGroupUseCase:getViewModelHash ["
            r1.append(r0)
            r1.append(r6)
            r0 = 93
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 587937709(0x230b37ad, float:7.546995E-18)
            X.0fS.A01(r1, r0)
        L_0x003b:
            X.1Xj r2 = r10.BPf()
            java.util.Set r0 = X.AnonymousClass2u0.A05
            r1 = 0
            X.0qQ.A0B(r6, r1)
            boolean r3 = r0.contains(r6)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != 0) goto L_0x024a
            int r5 = r6.ordinal()
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.feed.ui.state.MediaState"
            switch(r5) {
                case 0: goto L_0x006e;
                case 1: goto L_0x0073;
                case 2: goto L_0x024a;
                case 3: goto L_0x0073;
                case 4: goto L_0x024a;
                case 5: goto L_0x0263;
                case 6: goto L_0x0084;
                case 7: goto L_0x024a;
                case 8: goto L_0x008c;
                case 9: goto L_0x00a2;
                case 10: goto L_0x0263;
                case 11: goto L_0x024a;
                case 12: goto L_0x024a;
                case 13: goto L_0x024a;
                case 14: goto L_0x024a;
                case 15: goto L_0x0263;
                case 16: goto L_0x024a;
                case 17: goto L_0x0057;
                case 18: goto L_0x0057;
                case 19: goto L_0x0057;
                case 20: goto L_0x0057;
                case 21: goto L_0x0057;
                case 22: goto L_0x00b9;
                case 23: goto L_0x0057;
                case 24: goto L_0x00d6;
                case 25: goto L_0x024a;
                case 26: goto L_0x024a;
                case 27: goto L_0x0073;
                case 28: goto L_0x0057;
                case 29: goto L_0x0057;
                case 30: goto L_0x0057;
                case 31: goto L_0x0263;
                case 32: goto L_0x0057;
                case 33: goto L_0x024a;
                case 34: goto L_0x024a;
                case 35: goto L_0x00f7;
                case 36: goto L_0x0104;
                case 37: goto L_0x024a;
                case 38: goto L_0x024a;
                case 39: goto L_0x0113;
                case 40: goto L_0x0129;
                case 41: goto L_0x0263;
                case 42: goto L_0x012f;
                case 43: goto L_0x0142;
                case 44: goto L_0x024a;
                case 45: goto L_0x0057;
                case 46: goto L_0x0166;
                case 47: goto L_0x024a;
                case 48: goto L_0x024a;
                case 49: goto L_0x024a;
                case 50: goto L_0x024a;
                case 51: goto L_0x024a;
                case 52: goto L_0x0057;
                case 53: goto L_0x0188;
                case 54: goto L_0x0057;
                case 55: goto L_0x024a;
                case 56: goto L_0x0263;
                case 57: goto L_0x01ab;
                case 58: goto L_0x01c0;
                case 59: goto L_0x024a;
                case 60: goto L_0x01d4;
                case 61: goto L_0x01e5;
                case 62: goto L_0x024a;
                case 63: goto L_0x01fc;
                case 64: goto L_0x0057;
                case 65: goto L_0x024a;
                case 66: goto L_0x0073;
                case 67: goto L_0x024a;
                case 68: goto L_0x0057;
                case 69: goto L_0x0073;
                case 70: goto L_0x0057;
                case 71: goto L_0x024a;
                case 72: goto L_0x020e;
                case 73: goto L_0x020e;
                case 74: goto L_0x020e;
                case 75: goto L_0x024a;
                case 76: goto L_0x024a;
                case 77: goto L_0x0263;
                case 78: goto L_0x0263;
                case 79: goto L_0x022b;
                case 80: goto L_0x0057;
                case 81: goto L_0x0057;
                case 82: goto L_0x0073;
                case 83: goto L_0x0057;
                case 84: goto L_0x0057;
                case 85: goto L_0x0057;
                case 86: goto L_0x0057;
                case 87: goto L_0x0057;
                case 88: goto L_0x00b9;
                case 89: goto L_0x00b9;
                case 90: goto L_0x0057;
                case 91: goto L_0x024d;
                case 92: goto L_0x0057;
                case 93: goto L_0x0057;
                case 94: goto L_0x01d4;
                case 95: goto L_0x0084;
                default: goto L_0x0057;
            }
        L_0x0057:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Could not get ViewModel hash for item type "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x006e:
            r0 = 2131952046(0x7f1301ae, float:1.9540524E38)
            goto L_0x0263
        L_0x0073:
            com.instagram.common.session.UserSession r4 = r4.A02
            X.0Tu r3 = X.0Tu.A05
            r1 = 36319626434780712(0x81088200051e28, double:3.032016232527787E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x024a
            goto L_0x0263
        L_0x0084:
            com.instagram.common.session.UserSession r0 = r4.A02
            int r0 = X.C262614Ff.A00(r0, r2)
            goto L_0x0263
        L_0x008c:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.GY9 r0 = (X.GY9) r0
            int r0 = r0.A01(r2)
            goto L_0x0263
        L_0x00a2:
            X.0qQ.A0B(r2, r1)
            java.lang.String r1 = r2.getId()
            X.1Xy r0 = r2.A0C
            java.util.List r0 = r0.getCoauthorProducers()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            int r0 = java.util.Arrays.hashCode(r0)
            goto L_0x0263
        L_0x00b9:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0K
            java.lang.Object r1 = r0.getValue()
            X.4U7 r1 = (X.AnonymousClass4U7) r1
            X.0qQ.A0C(r11, r3)
            X.3W1 r11 = (X.AnonymousClass3W1) r11
            X.4DU r0 = r4.A08
            int r0 = r1.A00(r2, r0, r11)
            goto L_0x0263
        L_0x00d6:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0N
            java.lang.Object r3 = r0.getValue()
            X.3hO r3 = (X.C248083hO) r3
            X.4Ec r10 = (X.C262434Ec) r10
            android.content.Context r2 = r4.A00
            X.0qQ.A0B(r10, r1)
            X.1Xj r1 = r10.A00
            java.lang.Integer r0 = r10.A01
            int r0 = r3.A00(r2, r1, r0)
            goto L_0x0263
        L_0x00f7:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.ui.state.FeedCommentRowModelAndState"
            X.0qQ.A0C(r11, r0)
            X.3dY r11 = (X.C245833dY) r11
            int r0 = X.C268384dI.A00(r11)
            goto L_0x0263
        L_0x0104:
            X.0qQ.A0C(r11, r3)
            X.3W1 r11 = (X.AnonymousClass3W1) r11
            com.instagram.common.session.UserSession r1 = r4.A02
            X.4DU r0 = r4.A08
            int r0 = X.C243163Xq.A00(r1, r2, r0, r11)
            goto L_0x0263
        L_0x0113:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0S
            java.lang.Object r0 = r0.getValue()
            X.3Yd r0 = (X.C243283Yd) r0
            int r0 = r0.A00(r2)
            goto L_0x0263
        L_0x0129:
            int r0 = X.C54982HaF.A00(r2)
            goto L_0x0263
        L_0x012f:
            X.0qQ.A0B(r2, r1)
            X.1Xy r0 = r2.A0C
            X.DUp r0 = r0.BAG()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            goto L_0x0263
        L_0x0142:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.3Ws r5 = r0.A01()
            boolean r0 = r2.A69()
            if (r0 != 0) goto L_0x0158
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x0159
        L_0x0158:
            r1 = 1
        L_0x0159:
            X.0qQ.A0C(r11, r3)
            X.3W1 r11 = (X.AnonymousClass3W1) r11
            com.instagram.common.session.UserSession r0 = r4.A02
            int r0 = r5.A03(r0, r2, r11, r1)
            goto L_0x0263
        L_0x0166:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0L
            r0.getValue()
            X.0qQ.A0B(r2, r1)
            boolean r0 = r2.A4c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            goto L_0x0263
        L_0x0188:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0P
            r0.getValue()
            X.0qQ.A0C(r11, r3)
            X.3W1 r11 = (X.AnonymousClass3W1) r11
            X.0qQ.A0B(r11, r1)
            X.3W8 r0 = r11.A3b
            java.lang.Object r0 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            goto L_0x0263
        L_0x01ab:
            X.0qQ.A0B(r2, r1)
            boolean r0 = r2.A4T()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            goto L_0x0263
        L_0x01c0:
            X.0qQ.A0C(r11, r3)
            X.3W1 r11 = (X.AnonymousClass3W1) r11
            int r0 = r11.A03
            X.1Xj r0 = r2.A1c(r0)
            if (r0 != 0) goto L_0x01ce
            r0 = r2
        L_0x01ce:
            int r0 = X.C56655I6k.A00(r0)
            goto L_0x0263
        L_0x01d4:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.3Yc r0 = r0.A00()
            int r0 = r0.A01(r2)
            goto L_0x0263
        L_0x01e5:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0j
            java.lang.Object r1 = r0.getValue()
            X.3pt r1 = (X.C252903pt) r1
            com.instagram.common.session.UserSession r0 = r4.A02
            int r0 = r1.A00(r0, r2)
            goto L_0x0263
        L_0x01fc:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0c
            r0.getValue()
            int r0 = X.C56531I0c.A00(r2)
            goto L_0x0263
        L_0x020e:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A06
            r0.getValue()
            X.0qQ.A0B(r2, r1)
            java.lang.String r0 = r2.getId()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            goto L_0x0263
        L_0x022b:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A08
            r0.getValue()
            X.0qQ.A0B(r2, r1)
            X.1Xy r0 = r2.A0C
            com.instagram.api.schemas.BoostUpsellBannerPayloadSchema r0 = r0.Ah4()
            if (r0 != 0) goto L_0x0245
            r0 = 0
            goto L_0x0263
        L_0x0245:
            int r0 = r0.hashCode()
            goto L_0x0263
        L_0x024a:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0263
        L_0x024d:
            X.0eM r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0g
            r0.getValue()
            X.0qQ.A0C(r11, r3)
            X.3W1 r11 = (X.AnonymousClass3W1) r11
            int r0 = X.C248023hI.A00(r2, r11)
        L_0x0263:
            if (r7 == 0) goto L_0x026b
            r1 = 178775268(0xaa7e4e4, float:1.6167614E-32)
            X.0fS.A00(r1)
        L_0x026b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2s3.getViewModelHash(int, java.lang.Object, java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r2 != 95) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getViewSubTypeName(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.2rv[] r0 = X.C231592rv.values()
            r1 = r0[r5]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia"
            X.0qQ.A0C(r6, r0)
            X.1Xl r6 = (X.1Xl) r6
            X.1Xj r3 = r6.BPf()
            int r2 = r1.ordinal()
            r0 = 36
            r1 = 0
            if (r2 == r0) goto L_0x0039
            r0 = 6
            if (r2 == r0) goto L_0x002a
            r0 = 87
            if (r2 == r0) goto L_0x0039
            r0 = 95
            if (r2 == r0) goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            int r0 = r3.A0w()
            X.1Xj r0 = r3.A1c(r0)
            if (r0 == 0) goto L_0x0029
            X.1iA r0 = r0.BR7()
            goto L_0x003d
        L_0x0039:
            X.1iA r0 = r3.BR7()
        L_0x003d:
            java.lang.String r1 = r0.name()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2s3.getViewSubTypeName(int, java.lang.Object):java.lang.String");
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        if (i == C231592rv.CHANNEL_CTA.ordinal()) {
            AnonymousClass1Nd.A00(this.A09).A02((1wn) view.getTag(), C57070INk.class);
        }
    }

    public final void onViewRecycled(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        if (C231592rv.values()[i] == C231592rv.COMPOSE_MEDIA_UFI) {
            AnonymousClass334 r0 = this.A02;
            if (r0 == null) {
                0qQ.A0F("binders");
                throw AnonymousClass00P.createAndThrow();
            } else {
                ((C262584Fb) r0.A0k.getValue()).A05(view);
            }
        }
    }

    private final void A00() {
        C243393Yp r4 = this.A04;
        String str = "inlineSurveyDelegate";
        if (r4 != null) {
            AnonymousClass310 r0 = this.A00;
            if (r0 == null) {
                str = "delegate";
            } else {
                C238133Ar scrollingViewProxy = r0.BqC().getScrollingViewProxy();
                C243393Yp r1 = this.A04;
                if (r1 != null) {
                    r4.A01 = new C18561VuD(r1, scrollingViewProxy);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A02(View view, C231592rv r5, AnonymousClass3OA r6, Object obj) {
        1wN.A00(this.A09).A01(r6);
        if (obj instanceof AnonymousClass3W1) {
            AnonymousClass3W1 r7 = (AnonymousClass3W1) obj;
            0qQ.A0B(r6, 0);
            0qQ.A0B(r7, 1);
            1Xj r2 = r6.A0K;
            A01(view, new C245713dM(AnonymousClass33W.A00((AnonymousClass33W) this.A0L.getValue(), r2, r7), r2, r7), r5);
            return;
        }
        1Xj r0 = r6.A0K;
        A04(view, r5, r0, obj);
        A03(view, r5, r0, obj);
    }

    @Deprecated(message = "This function is not type safe - you should not be using this - if you can move viewTypes from here you should")
    private final void A03(View view, C231592rv r9, Object obj, Object obj2) {
        AnonymousClass334 r6 = this.A02;
        if (r6 == null) {
            0qQ.A0F("binders");
            throw AnonymousClass00P.createAndThrow();
        }
        int ordinal = r9.ordinal();
        if (ordinal == 24) {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.listview.gapview.gapviewmodel.GapViewModel");
            C262434Ec r3 = (C262434Ec) obj;
            Context context = this.A06;
            0qQ.A0B(r3, 0);
            0qQ.A0B(context, 1);
            0nA.A0V(view, ((C248083hO) ((AnonymousClass33Z) ((AnonymousClass33W) this.A0L.getValue()).A0J.getValue()).A0N.getValue()).A00(context, r3.A00, r3.A01));
        } else if (ordinal == 35) {
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.FeedCommentRowModelAndState");
            C245833dY r5 = (C245833dY) obj2;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
            1Xl r32 = (1Xl) obj;
            r5.A00 = AnonymousClass3YX.A00(r32.BPf(), r5.A03, true);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
            1Xj BPf = r32.BPf();
            AnonymousClass417 r33 = (AnonymousClass417) r6.A0S.getValue();
            Object tag = view.getTag();
            if (tag != null) {
                UserSession userSession = this.A09;
                AnonymousClass4DU r1 = this.A0B;
                r33.A06(C268384dI.A01(userSession, BPf, r1, r5), (AnonymousClass419) tag, r1, r5);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.instagram.feed.comments.row.FeedCommentRowViewBinder.Holder");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Item type unhandled, item type = ");
            sb.append(r9);
            throw new UnsupportedOperationException(sb.toString());
        }
        ((AnonymousClass33W) this.A0L.getValue()).A03(view, r9, obj, obj2);
    }

    private final void A04(View view, C231592rv r8, Object obj, Object obj2) {
        AnonymousClass4DU r2;
        AnonymousClass4HH r1;
        if (obj instanceof 1Xl) {
            UserSession userSession = this.A09;
            C238833Dp A002 = C238833Dp.A00(userSession);
            0qQ.A07(A002);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
            1Xj BPf = ((1Xl) obj).BPf();
            int ordinal = r8.ordinal();
            if (!(ordinal == 43 || ordinal == 39)) {
                if (!(ordinal == 1 || ordinal == 11)) {
                    if (ordinal != 44) {
                        if (ordinal != 82) {
                            if (!(ordinal == 92 || ordinal == 91)) {
                                switch (ordinal) {
                                    case 35:
                                    case 81:
                                    case 83:
                                        break;
                                    default:
                                        A002.A04(view);
                                        return;
                                }
                            }
                        }
                    }
                }
                if (obj2 instanceof AnonymousClass3W1) {
                    r2 = this.A0B;
                    r1 = new AnonymousClass4HH(this.A06, (AnonymousClass3W2) obj2, userSession, BPf);
                    A002.A0A(view, new C246153e7(r1, userSession, BPf, r2));
                }
                return;
            }
            r2 = this.A0B;
            r1 = null;
            A002.A0A(view, new C246153e7(r1, userSession, BPf, r2));
        }
    }

    public final AnonymousClass2xS A05() {
        AnonymousClass2xS r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("feedVideoModule");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A07(0xF r2) {
        AnonymousClass334 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("binders");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ((C252643pR) r0.A0g.getValue()).A00 = r2;
        }
    }

    public final void A08(AnonymousClass310 r39) {
        AnonymousClass310 r14 = r39;
        this.A00 = r14;
        Context context = this.A06;
        UserSession userSession = this.A09;
        AnonymousClass4DU r12 = this.A0B;
        boolean z = this.A0P;
        FragmentActivity fragmentActivity = this.A07;
        0Pl r7 = this.A0C;
        AnonymousClass2xS A052 = A05();
        C249763kK r37 = this.A0E;
        C249453jo r6 = this.A0U;
        C231672s5 r5 = this.A0W;
        boolean z2 = this.A0S;
        String str = this.A0H;
        AnonymousClass07Z r2 = this.A0T;
        C229382nI r15 = this.A08;
        boolean z3 = false;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass07Z r19 = r2;
        Context context2 = context;
        AnonymousClass334 r16 = new AnonymousClass334(context2, fragmentActivity2, r19, r6, r15, userSession, r5, r14, r12, r7, (C231502rm) this.A0M.getValue(), A052, r37, str, "FeedItem", z, z2, false, true);
        this.A02 = r16;
        if (this.A0A != null) {
            this.A01 = new AnonymousClass33R(context, (AnonymousClass33Q) r16.A0W.getValue());
        }
        AnonymousClass2kR r11 = this.A0Y;
        AnonymousClass0eM r1 = this.A0L;
        AnonymousClass33Z r10 = (AnonymousClass33Z) ((AnonymousClass33W) r1.getValue()).A0J.getValue();
        C2362833d r9 = (C2362833d) ((AnonymousClass33W) r1.getValue()).A0I.getValue();
        AnonymousClass334 r72 = this.A02;
        if (r72 == null) {
            0qQ.A0F("binders");
            throw AnonymousClass00P.createAndThrow();
        }
        if (this.A0R) {
            z3 = true;
        }
        0sL r62 = new AnonymousClass9LZ(this, 28);
        AnonymousClass2xS A053 = A05();
        String str2 = this.A0J;
        Integer num = this.A0Z;
        AnonymousClass57L r3 = this.A0X;
        this.A05 = new C2362933e(r15, this.A0V, r3, r9, r10, r11, r72, A053, r37, num, "FeedItemBinderGroup", str2, this.A0I, r62, z3);
    }

    public final int getViewTypeCount() {
        return A0a;
    }

    public final String getViewTypeName(int i) {
        return 002.A0S("FeedItem[", C231592rv.values()[i].A00, ']');
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [X.2s5, java.lang.Object] */
    public AnonymousClass2s3(FragmentActivity fragmentActivity, AnonymousClass07Z r6, C249453jo r7, C229382nI r8, 0xF r9, AnonymousClass57L r10, AnonymousClass2oE r11, AnonymousClass2kR r12, 0Pl r13, SearchContext searchContext, C249763kK r15, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A07 = fragmentActivity;
        this.A0Y = r12;
        this.A0E = r15;
        this.A0T = r6;
        this.A0C = r13;
        this.A0A = r11;
        this.A08 = r8;
        this.A0S = z;
        this.A0U = r7;
        this.A0H = str;
        this.A0G = num;
        this.A0Q = z2;
        this.A0R = z3;
        this.A0I = str2;
        this.A0Z = num2;
        this.A0X = r10;
        this.A0V = r9;
        this.A0J = str3;
        this.A0K = str4;
        this.A0F = bool;
        this.A0D = searchContext;
        this.A09 = r12.A01;
        Context context = r12.A00;
        this.A06 = context;
        this.A0B = r12.A02;
        this.A0M = AnonymousClass0eN.A01(new AnonymousClass9LP(this, 22));
        this.A0O = AnonymousClass0eN.A01(new AnonymousClass9LP(this, 24));
        this.A0N = AnonymousClass0eN.A00(0eO.A04, new AnonymousClass9LP(this, 23));
        this.A0L = AnonymousClass0eN.A01(new AnonymousClass9LP(this, 21));
        this.A0W = new Object();
        this.A0P = 2eO.A00(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r10, android.view.View r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r9 = this;
            r0 = -1341396650(0xffffffffb00be956, float:-5.0899496E-10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r4 = 1
            X.0qQ.A0B(r11, r4)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            r0 = 3
            X.0qQ.A0B(r13, r0)
            X.2rv[] r0 = X.C231592rv.values()     // Catch:{ all -> 0x00ce }
            r2 = r0[r10]     // Catch:{ all -> 0x00ce }
            r7 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = "FeedItemBinderGroup.bindView: "
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x00ce }
            r0 = -105738237(0xfffffffff9b29003, float:-1.1589372E35)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x00ce }
        L_0x002f:
            X.0eM r0 = r9.A0L     // Catch:{ all -> 0x00ce }
            java.lang.Object r6 = r0.getValue()     // Catch:{ all -> 0x00ce }
            X.33W r6 = (X.AnonymousClass33W) r6     // Catch:{ all -> 0x00ce }
            boolean r0 = r12 instanceof X.AnonymousClass3OA     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x005a
            r1 = r12
            X.3OA r1 = (X.AnonymousClass3OA) r1     // Catch:{ all -> 0x00ce }
            r0 = 0
            X.9IH r6 = new X.9IH     // Catch:{ all -> 0x00ce }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x00ce }
        L_0x0044:
            X.3dN r6 = (X.C245723dN) r6     // Catch:{ all -> 0x00ce }
            r5 = r6
            r1 = 0
            boolean r0 = r6 instanceof X.AnonymousClass9IH     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00a3
            X.9IH r5 = (X.AnonymousClass9IH) r5     // Catch:{ all -> 0x00ce }
            int r0 = r5.A00     // Catch:{ all -> 0x00ce }
            if (r0 != r1) goto L_0x0099
            java.lang.Object r0 = r5.A01     // Catch:{ all -> 0x00ce }
            X.3OA r0 = (X.AnonymousClass3OA) r0     // Catch:{ all -> 0x00ce }
            r9.A02(r11, r2, r0, r13)     // Catch:{ all -> 0x00ce }
            goto L_0x00b3
        L_0x005a:
            boolean r0 = r12 instanceof X.1Xj     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0096
            r5 = r12
            X.1Xj r5 = (X.1Xj) r5     // Catch:{ all -> 0x00ce }
            boolean r0 = r5.CcK()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0085
            java.util.concurrent.ConcurrentMap r1 = r6.A0G     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r5.getId()     // Catch:{ all -> 0x00ce }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r5.getId()     // Catch:{ all -> 0x00ce }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00c6
            X.3OA r0 = (X.AnonymousClass3OA) r0     // Catch:{ all -> 0x00ce }
            X.9IH r6 = new X.9IH     // Catch:{ all -> 0x00ce }
            r6.<init>(r0, r4)     // Catch:{ all -> 0x00ce }
            goto L_0x0044
        L_0x0085:
            boolean r0 = r13 instanceof X.AnonymousClass3W1     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0096
            r1 = r13
            X.3W1 r1 = (X.AnonymousClass3W1) r1     // Catch:{ all -> 0x00ce }
            X.3dK r0 = X.AnonymousClass33W.A00(r6, r5, r1)     // Catch:{ all -> 0x00ce }
            X.3dM r6 = new X.3dM     // Catch:{ all -> 0x00ce }
            r6.<init>(r0, r5, r1)     // Catch:{ all -> 0x00ce }
            goto L_0x0044
        L_0x0096:
            X.4ic r6 = X.C271294ic.A00     // Catch:{ all -> 0x00ce }
            goto L_0x0044
        L_0x0099:
            if (r0 != r4) goto L_0x00a3
            java.lang.Object r0 = r5.A01     // Catch:{ all -> 0x00ce }
            X.3OA r0 = (X.AnonymousClass3OA) r0     // Catch:{ all -> 0x00ce }
            r9.A02(r11, r2, r0, r13)     // Catch:{ all -> 0x00ce }
            goto L_0x00b3
        L_0x00a3:
            boolean r0 = r6 instanceof X.C245713dM     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00ad
            X.3dM r6 = (X.C245713dM) r6     // Catch:{ all -> 0x00ce }
            r9.A01(r11, r6, r2)     // Catch:{ all -> 0x00ce }
            goto L_0x00b3
        L_0x00ad:
            r9.A04(r11, r2, r12, r13)     // Catch:{ all -> 0x00ce }
            r9.A03(r11, r2, r12, r13)     // Catch:{ all -> 0x00ce }
        L_0x00b3:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x00bf
            r0 = -750788923(0xffffffffd33fdec5, float:-8.2407621E11)
            X.0fS.A00(r0)
        L_0x00bf:
            r0 = -625944826(0xffffffffdab0d706, float:-2.48880083E16)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x00c6:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ce }
            r0.<init>(r1)     // Catch:{ all -> 0x00ce }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r2 = move-exception
            r0 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 287815056(0x1127b590, float:1.3229925E-28)
            X.0fS.A00(r0)
        L_0x00dd:
            r0 = -69090336(0xfffffffffbe1c3e0, float:-2.3444792E36)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2s3.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.49I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.GjS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.Gim} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.3z5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.HAc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.HAd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.UDF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.Gj9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.Exp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.Gin} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.L9A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: X.HmR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: X.HoV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: X.HoV} */
    /* JADX WARNING: type inference failed for: r0v118, types: [X.3YT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v132, types: [X.3YT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v134, types: [X.3YT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v136, types: [X.3YT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v138, types: [X.3YT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v140, types: [X.3YT, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0612, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x06ae, code lost:
        r2.setTag(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x06b5, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x06bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x06b7, code lost:
        X.0fS.A00(-1055990043);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x06bd, code lost:
        X.AnonymousClass0fD.A0A(-1547130206, r3);
        X.AnonymousClass0fD.A0A(864111080, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x06c9, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f4, code lost:
        if (r2 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r31, android.view.ViewGroup r32) {
        /*
            r30 = this;
            r0 = -1893774955(0xffffffff8f1f4995, float:-7.853477E-30)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r6 = 1
            r4 = r32
            X.0qQ.A0B(r4, r6)
            android.content.Context r7 = r4.getContext()
            X.0qQ.A07(r7)
            r0 = -345894470(0xffffffffeb6211ba, float:-2.7330095E26)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2rv[] r0 = X.C231592rv.A02     // Catch:{ all -> 0x06ca }
            r10 = r0[r31]     // Catch:{ all -> 0x06ca }
            r15 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)     // Catch:{ all -> 0x06ca }
            if (r0 == 0) goto L_0x0035
            java.lang.String r2 = "FeedItemBinderGroup.createView: "
            java.lang.String r0 = r10.A00     // Catch:{ all -> 0x06ca }
            java.lang.String r2 = X.002.A0R(r2, r0)     // Catch:{ all -> 0x06ca }
            r0 = 1984749121(0x764cde41, float:1.0388051E33)
            X.0fS.A01(r2, r0)     // Catch:{ all -> 0x06ca }
        L_0x0035:
            r2 = r30
            X.334 r8 = r2.A02     // Catch:{ all -> 0x06ca }
            r18 = 0
            if (r8 != 0) goto L_0x0044
            java.lang.String r0 = "binders"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x06ca }
            goto L_0x0615
        L_0x0044:
            int r0 = r10.ordinal()     // Catch:{ all -> 0x06ca }
            java.lang.String r9 = "delegate"
            r5 = 0
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0357;
                case 2: goto L_0x036c;
                case 3: goto L_0x0318;
                case 4: goto L_0x0699;
                case 5: goto L_0x044c;
                case 6: goto L_0x02af;
                case 7: goto L_0x0659;
                case 8: goto L_0x049c;
                case 9: goto L_0x0409;
                case 10: goto L_0x0342;
                case 11: goto L_0x00c0;
                case 12: goto L_0x066d;
                case 13: goto L_0x0468;
                case 14: goto L_0x0482;
                case 15: goto L_0x0683;
                case 16: goto L_0x02e9;
                case 17: goto L_0x004e;
                case 18: goto L_0x004e;
                case 19: goto L_0x004e;
                case 20: goto L_0x004e;
                case 21: goto L_0x004e;
                case 22: goto L_0x0211;
                case 23: goto L_0x004e;
                case 24: goto L_0x00b4;
                case 25: goto L_0x0056;
                case 26: goto L_0x043e;
                case 27: goto L_0x0396;
                case 28: goto L_0x004e;
                case 29: goto L_0x004e;
                case 30: goto L_0x004e;
                case 31: goto L_0x032d;
                case 32: goto L_0x004e;
                case 33: goto L_0x01b4;
                case 34: goto L_0x00a2;
                case 35: goto L_0x04d4;
                case 36: goto L_0x0203;
                case 37: goto L_0x00cc;
                case 38: goto L_0x03e0;
                case 39: goto L_0x01f5;
                case 40: goto L_0x00ae;
                case 41: goto L_0x03f4;
                case 42: goto L_0x021f;
                case 43: goto L_0x01e7;
                case 44: goto L_0x0082;
                case 45: goto L_0x004e;
                case 46: goto L_0x060c;
                case 47: goto L_0x0050;
                case 48: goto L_0x0090;
                case 49: goto L_0x008a;
                case 50: goto L_0x01c4;
                case 51: goto L_0x00ba;
                case 52: goto L_0x004e;
                case 53: goto L_0x03ab;
                case 54: goto L_0x004e;
                case 55: goto L_0x019e;
                case 56: goto L_0x02bf;
                case 57: goto L_0x02d4;
                case 58: goto L_0x009a;
                case 59: goto L_0x01cd;
                case 60: goto L_0x0293;
                case 61: goto L_0x03b6;
                case 62: goto L_0x03c4;
                case 63: goto L_0x05c4;
                case 64: goto L_0x005d;
                case 65: goto L_0x00a8;
                case 66: goto L_0x0381;
                case 67: goto L_0x0433;
                case 68: goto L_0x004e;
                case 69: goto L_0x0303;
                case 70: goto L_0x004e;
                case 71: goto L_0x01ac;
                case 72: goto L_0x04aa;
                case 73: goto L_0x04c6;
                case 74: goto L_0x04b8;
                case 75: goto L_0x01a4;
                case 76: goto L_0x0414;
                case 77: goto L_0x05d2;
                case 78: goto L_0x05ef;
                case 79: goto L_0x0562;
                case 80: goto L_0x0570;
                case 81: goto L_0x04e2;
                case 82: goto L_0x05a8;
                case 83: goto L_0x04f0;
                case 84: goto L_0x04fe;
                case 85: goto L_0x050c;
                case 86: goto L_0x051a;
                case 87: goto L_0x0528;
                case 88: goto L_0x0536;
                case 89: goto L_0x0546;
                case 90: goto L_0x0554;
                case 91: goto L_0x058c;
                case 92: goto L_0x057e;
                case 93: goto L_0x05b6;
                case 94: goto L_0x02a1;
                case 95: goto L_0x059a;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x061a
        L_0x0050:
            android.view.View r2 = X.W2c.A01(r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0056:
            android.view.View r2 = new android.view.View     // Catch:{ all -> 0x06ca }
            r2.<init>(r7)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x005d:
            X.4DU r0 = r2.A0B     // Catch:{ all -> 0x06ca }
            android.view.View r2 = X.Hd2.A00(r4, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0065:
            boolean r0 = r2.A0P     // Catch:{ all -> 0x06ca }
            if (r0 == 0) goto L_0x007b
            android.view.View r2 = new android.view.View     // Catch:{ all -> 0x06ca }
            r2.<init>(r7)     // Catch:{ all -> 0x06ca }
            int r0 = X.2Yu.A04(r7)     // Catch:{ all -> 0x06ca }
            int r0 = r7.getColor(r0)     // Catch:{ all -> 0x06ca }
            r2.setBackgroundColor(r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x007b:
            android.view.View r2 = new android.view.View     // Catch:{ all -> 0x06ca }
            r2.<init>(r7)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0082:
            X.0Pl r0 = r2.A0C     // Catch:{ all -> 0x06ca }
            android.view.View r2 = X.AnonymousClass5w0.A00(r7, r4, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x008a:
            android.view.View r2 = X.C18200VnN.A00(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0090:
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            java.lang.String r0 = "v1"
            android.view.View r2 = X.C18719Vys.A00(r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x009a:
            com.instagram.common.session.UserSession r0 = r2.A09     // Catch:{ all -> 0x06ca }
            android.view.View r2 = X.C56655I6k.A01(r7, r4, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x00a2:
            android.widget.FrameLayout r2 = X.C56311HwO.A00(r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x00a8:
            android.view.View r2 = X.C18696Vwu.A00(r7, r4, r5)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x00ae:
            android.view.View r2 = X.C56302HwF.A00(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x00b4:
            android.view.View r2 = X.AnonymousClass3S7.A00(r7)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x00ba:
            android.view.View r2 = X.C14232TsF.A00(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x00c0:
            com.instagram.common.session.UserSession r6 = r2.A09     // Catch:{ all -> 0x06ca }
            X.4DU r5 = r2.A0B     // Catch:{ all -> 0x06ca }
            androidx.fragment.app.FragmentActivity r0 = r2.A07     // Catch:{ all -> 0x06ca }
            android.view.View r2 = X.AnonymousClass3UW.A00(r7, r4, r0, r5, r6)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x00cc:
            com.instagram.common.session.UserSession r11 = r2.A09     // Catch:{ all -> 0x06ca }
            X.4DU r10 = r2.A0B     // Catch:{ all -> 0x06ca }
            X.0qQ.A0B(r11, r6)     // Catch:{ all -> 0x06ca }
            r0 = 2
            X.0qQ.A0B(r10, r0)     // Catch:{ all -> 0x06ca }
            X.XQr r2 = X.C21246XQr.FEED_SPONSORED_CONTENT_SHOWREEL     // Catch:{ all -> 0x06ca }
            java.util.Map r0 = X.XmL.A00     // Catch:{ all -> 0x06ca }
            java.lang.Object r9 = r0.get(r2)     // Catch:{ all -> 0x06ca }
            X.XnB r9 = (X.XnB) r9     // Catch:{ all -> 0x06ca }
            if (r9 == 0) goto L_0x0191
            java.util.Queue r8 = r9.A03     // Catch:{ all -> 0x06ca }
            java.lang.Object r2 = r8.poll()     // Catch:{ all -> 0x06ca }
            X.Xa9 r6 = r9.A02     // Catch:{ all -> 0x06ca }
            boolean r0 = r6.A01     // Catch:{ all -> 0x06ca }
            if (r0 == 0) goto L_0x00f2
            X.XnB.A00(r6, r9, r8)     // Catch:{ all -> 0x06ca }
        L_0x00f2:
            com.instagram.common.ui.base.IgFrameLayout r2 = (com.instagram.common.ui.base.IgFrameLayout) r2     // Catch:{ all -> 0x06ca }
            if (r2 == 0) goto L_0x0191
        L_0x00f6:
            r0 = 2131441602(0x7f0b37c2, float:1.850522E38)
            android.view.View r18 = r2.findViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r18)     // Catch:{ all -> 0x06ca }
            r0 = 2131435808(0x7f0b2120, float:1.8493469E38)
            android.view.View r14 = r2.findViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r14)     // Catch:{ all -> 0x06ca }
            com.instagram.ui.widget.framelayout.MediaFrameLayout r14 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r14     // Catch:{ all -> 0x06ca }
            r0 = 2131438596(0x7f0b2c04, float:1.8499123E38)
            android.view.View r13 = r2.findViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r13)     // Catch:{ all -> 0x06ca }
            com.instagram.feed.widget.IgProgressImageView r13 = (com.instagram.feed.widget.IgProgressImageView) r13     // Catch:{ all -> 0x06ca }
            r0 = 2131441363(0x7f0b36d3, float:1.8504736E38)
            android.view.View r12 = r2.findViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x06ca }
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r12 = (com.instagram.showreelnative.ui.common.ShowreelNativeMediaView) r12     // Catch:{ all -> 0x06ca }
            r0 = 2131441358(0x7f0b36ce, float:1.8504725E38)
            android.view.View r9 = r2.findViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x06ca }
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r9 = (com.instagram.showreel.composition.ui.IgShowreelCompositionView) r9     // Catch:{ all -> 0x06ca }
            r0 = 2131441601(0x7f0b37c1, float:1.8505218E38)
            android.view.View r8 = r2.findViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x06ca }
            com.instagram.ui.mediaactions.LikeActionView r8 = (com.instagram.ui.mediaactions.LikeActionView) r8     // Catch:{ all -> 0x06ca }
            r0 = 2131441603(0x7f0b37c3, float:1.8505222E38)
            android.view.View r7 = r2.findViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x06ca }
            com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer r7 = (com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer) r7     // Catch:{ all -> 0x06ca }
            r0 = 2131440207(0x7f0b324f, float:1.850239E38)
            android.view.View r6 = r2.findViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x06ca }
            com.instagram.tagging.widget.TagsLayout r6 = (com.instagram.tagging.widget.TagsLayout) r6     // Catch:{ all -> 0x06ca }
            r0 = 2131440203(0x7f0b324b, float:1.8502383E38)
            android.view.View r5 = r2.findViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x06ca }
            com.instagram.tagging.widget.MediaTagHintsLayout r5 = (com.instagram.tagging.widget.MediaTagHintsLayout) r5     // Catch:{ all -> 0x06ca }
            r0 = 2131435159(0x7f0b1e97, float:1.8492152E38)
            android.view.View r0 = r2.requireViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x06ca }
            X.3v9 r4 = new X.3v9     // Catch:{ all -> 0x06ca }
            r4.<init>(r0)     // Catch:{ all -> 0x06ca }
            X.3s3 r0 = new X.3s3     // Catch:{ all -> 0x06ca }
            r25 = r12
            r26 = r5
            r27 = r6
            r28 = r8
            r29 = r14
            r22 = r4
            r23 = r13
            r24 = r9
            r19 = r10
            r20 = r11
            r21 = r7
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x06ca }
            r2.setTag(r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0191:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131629449(0x7f0e1589, float:1.888622E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            goto L_0x00f6
        L_0x019e:
            android.view.View r2 = X.C55011Hai.A00(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x01a4:
            java.lang.String r0 = "v1"
            android.view.View r2 = X.C2363733m.A00(r7, r4, r0, r6)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x01ac:
            java.lang.String r0 = "v1"
            android.view.View r2 = X.C2363733m.A00(r7, r4, r0, r5)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x01b4:
            r21 = r5
            r22 = r5
            r19 = r4
            r20 = r5
            r17 = r7
            android.view.View r2 = X.C14033ToZ.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x01c4:
            r2 = 3
            java.lang.String r0 = "v1"
            android.view.View r2 = X.C2363733m.A00(r7, r4, r0, r2)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x01cd:
            X.0eM r0 = r8.A0j     // Catch:{ all -> 0x06ca }
            r0.getValue()     // Catch:{ all -> 0x06ca }
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131629115(0x7f0e143b, float:1.8885542E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.HmR r4 = new X.HmR     // Catch:{ all -> 0x06ca }
            r4.<init>(r2)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x01e7:
            X.0eM r0 = r8.A0g     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3pR r0 = (X.C252643pR) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A04(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x01f5:
            X.0eM r0 = r8.A0d     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.41M r0 = (X.AnonymousClass41M) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A04(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0203:
            X.0eM r0 = r8.A0n     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.4EZ r0 = (X.AnonymousClass4EZ) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A04(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0211:
            X.0eM r0 = r8.A0V     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3pN r0 = (X.C252603pN) r0     // Catch:{ all -> 0x06ca }
            X.3TP r2 = r0.A00(r4, r5)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x021f:
            X.0eM r0 = r8.A0e     // Catch:{ all -> 0x06ca }
            java.lang.Object r11 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.HoG r11 = (X.C55833HoG) r11     // Catch:{ all -> 0x06ca }
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131629088(0x7f0e1420, float:1.8885487E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.0qQ.A0B(r2, r5)     // Catch:{ all -> 0x06ca }
            r0 = 2131435926(0x7f0b2196, float:1.8493708E38)
            android.view.View r10 = r2.requireViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r10)     // Catch:{ all -> 0x06ca }
            com.instagram.ui.widget.framelayout.MediaFrameLayout r10 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r10     // Catch:{ all -> 0x06ca }
            r0 = 2131440201(0x7f0b3249, float:1.8502379E38)
            android.view.View r9 = r2.requireViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x06ca }
            com.instagram.feed.widget.IgProgressImageView r9 = (com.instagram.feed.widget.IgProgressImageView) r9     // Catch:{ all -> 0x06ca }
            r0 = 2131431453(0x7f0b101d, float:1.8484636E38)
            android.view.View r8 = r2.requireViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x06ca }
            com.instagram.common.ui.base.IgTextView r8 = (com.instagram.common.ui.base.IgTextView) r8     // Catch:{ all -> 0x06ca }
            r0 = 2131442898(0x7f0b3cd2, float:1.8507849E38)
            android.view.View r7 = r2.requireViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x06ca }
            com.instagram.common.ui.base.IgTextView r7 = (com.instagram.common.ui.base.IgTextView) r7     // Catch:{ all -> 0x06ca }
            r0 = 2131435432(0x7f0b1fa8, float:1.8492706E38)
            android.view.View r6 = r2.requireViewById(r0)     // Catch:{ all -> 0x06ca }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x06ca }
            com.instagram.ui.mediaactions.LikeActionView r6 = (com.instagram.ui.mediaactions.LikeActionView) r6     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r5 = r11.A02     // Catch:{ all -> 0x06ca }
            r4 = 2131440192(0x7f0b3240, float:1.850236E38)
            X.3V9 r0 = new X.3V9     // Catch:{ all -> 0x06ca }
            r0.<init>(r2, r5, r4)     // Catch:{ all -> 0x06ca }
            X.HoV r4 = new X.HoV     // Catch:{ all -> 0x06ca }
            r22 = r6
            r23 = r10
            r19 = r7
            r20 = r9
            r21 = r0
            r17 = r4
            r18 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x0293:
            X.0eM r0 = r8.A0m     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3z4 r0 = (X.AnonymousClass3z4) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A04(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x02a1:
            X.0eM r0 = r8.A0k     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.4Fb r0 = (X.C262584Fb) r0     // Catch:{ all -> 0x06ca }
            android.view.ViewGroup r2 = r0.A04(r7)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x02af:
            X.0eM r0 = r8.A0I     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3TC r5 = (X.AnonymousClass3TC) r5     // Catch:{ all -> 0x06ca }
            X.4DU r0 = r2.A0B     // Catch:{ all -> 0x06ca }
            X.3TP r2 = r5.A01(r7, r4, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x02bf:
            X.0eM r0 = r8.A0o     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.IS5 r0 = new X.IS5     // Catch:{ all -> 0x06ca }
            r0.<init>(r2)     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x02d4:
            X.0eM r0 = r8.A0q     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.3YS r0 = new X.3YS     // Catch:{ all -> 0x06ca }
            r0.<init>(r2)     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x02e9:
            X.0eM r0 = r8.A0R     // Catch:{ all -> 0x06ca }
            r0.getValue()     // Catch:{ all -> 0x06ca }
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131625474(0x7f0e0602, float:1.8878157E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.L9A r4 = new X.L9A     // Catch:{ all -> 0x06ca }
            r4.<init>(r2)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x0303:
            X.0eM r0 = r8.A0v     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.IS7 r0 = new X.IS7     // Catch:{ all -> 0x06ca }
            r0.<init>(r2)     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0318:
            X.0eM r0 = r8.A0D     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.AdI r0 = new X.AdI     // Catch:{ all -> 0x06ca }
            r0.<init>()     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x032d:
            X.0eM r0 = r8.A0Z     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.IS2 r0 = new X.IS2     // Catch:{ all -> 0x06ca }
            r0.<init>()     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0342:
            X.0eM r0 = r8.A0N     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.LrF r0 = new X.LrF     // Catch:{ all -> 0x06ca }
            r0.<init>()     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0357:
            X.0eM r0 = r8.A0A     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.3yy r0 = new X.3yy     // Catch:{ all -> 0x06ca }
            r0.<init>()     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x036c:
            X.0eM r0 = r8.A0B     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.IS3 r0 = new X.IS3     // Catch:{ all -> 0x06ca }
            r0.<init>()     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0381:
            X.0eM r0 = r8.A0s     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.IS6 r0 = new X.IS6     // Catch:{ all -> 0x06ca }
            r0.<init>(r2)     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0396:
            X.0eM r0 = r8.A0b     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.AdJ r0 = new X.AdJ     // Catch:{ all -> 0x06ca }
            r0.<init>(r2)     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x03ab:
            X.0eM r0 = r8.A0c     // Catch:{ all -> 0x06ca }
            r0.getValue()     // Catch:{ all -> 0x06ca }
            android.view.View r2 = X.AnonymousClass41P.A00(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x03b6:
            X.0eM r0 = r8.A14     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.46v r0 = (X.C2607346v) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A04(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x03c4:
            X.0eM r0 = r8.A0P     // Catch:{ all -> 0x06ca }
            r0.getValue()     // Catch:{ all -> 0x06ca }
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131629041(0x7f0e13f1, float:1.8885392E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.Gin r4 = new X.Gin     // Catch:{ all -> 0x06ca }
            r4.<init>(r2)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x03e0:
            android.widget.FrameLayout r2 = new android.widget.FrameLayout     // Catch:{ all -> 0x06ca }
            r2.<init>(r7)     // Catch:{ all -> 0x06ca }
            X.4n2 r0 = new X.4n2     // Catch:{ all -> 0x06ca }
            r0.<init>(r7)     // Catch:{ all -> 0x06ca }
            r2.addView(r0)     // Catch:{ all -> 0x06ca }
            X.Exp r4 = new X.Exp     // Catch:{ all -> 0x06ca }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x03f4:
            X.0eM r0 = r8.A0X     // Catch:{ all -> 0x06ca }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r5 = (X.C258383yv) r5     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r2 = r2.A09     // Catch:{ all -> 0x06ca }
            X.IS4 r0 = new X.IS4     // Catch:{ all -> 0x06ca }
            r0.<init>()     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r5.A00(r7, r4, r2, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0409:
            X.0eM r0 = r8.A0M     // Catch:{ all -> 0x06ca }
            r0.getValue()     // Catch:{ all -> 0x06ca }
            android.view.View r2 = X.C56589I2t.A00(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0414:
            X.0eM r0 = r8.A11     // Catch:{ all -> 0x06ca }
            java.lang.Object r6 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.GUB r6 = (X.GUB) r6     // Catch:{ all -> 0x06ca }
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131629757(0x7f0e16bd, float:1.8886844E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.Gj9 r4 = new X.Gj9     // Catch:{ all -> 0x06ca }
            r4.<init>(r2, r6)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x0433:
            X.0eM r0 = r8.A0t     // Catch:{ all -> 0x06ca }
            r0.getValue()     // Catch:{ all -> 0x06ca }
            android.view.View r2 = X.GUD.A00(r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x043e:
            X.0eM r0 = r8.A0u     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.Uu5 r0 = (X.Uu5) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A03(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x044c:
            X.0eM r0 = r8.A0a     // Catch:{ all -> 0x06ca }
            r0.getValue()     // Catch:{ all -> 0x06ca }
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131626022(0x7f0e0826, float:1.8879268E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.UDF r4 = new X.UDF     // Catch:{ all -> 0x06ca }
            r4.<init>(r2)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x0468:
            X.0eM r0 = r8.A0Q     // Catch:{ all -> 0x06ca }
            r0.getValue()     // Catch:{ all -> 0x06ca }
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131629076(0x7f0e1414, float:1.8885463E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.HAd r4 = new X.HAd     // Catch:{ all -> 0x06ca }
            r4.<init>(r2)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x0482:
            X.0eM r0 = r8.A0Q     // Catch:{ all -> 0x06ca }
            r0.getValue()     // Catch:{ all -> 0x06ca }
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131629075(0x7f0e1413, float:1.888546E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.HAc r4 = new X.HAc     // Catch:{ all -> 0x06ca }
            r4.<init>(r2)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x049c:
            X.0eM r0 = r8.A0G     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.I0b r0 = (X.C56530I0b) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A01(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x04aa:
            X.0eM r0 = r8.A08     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.Vw2 r0 = (X.C18650Vw2) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A03(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x04b8:
            X.0eM r0 = r8.A08     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.Vw2 r0 = (X.C18650Vw2) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A01(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x04c6:
            X.0eM r0 = r8.A08     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.Vw2 r0 = (X.C18650Vw2) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A02(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x04d4:
            X.0eM r0 = r8.A0S     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.417 r0 = (X.AnonymousClass417) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A04(r7, r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x04e2:
            X.0eM r0 = r8.A0f     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.4Dh r0 = (X.C262334Dh) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x04f0:
            X.0eM r0 = r8.A0L     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.HFk r0 = (X.C54482HFk) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x04fe:
            X.0eM r0 = r8.A0K     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3Wr r0 = (X.C242913Wr) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x050c:
            X.0eM r0 = r8.A0J     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3XU r0 = (X.AnonymousClass3XU) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x051a:
            X.0eM r0 = r8.A0p     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.HFd r0 = (X.C54475HFd) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0528:
            X.0eM r0 = r8.A0h     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3Xh r0 = (X.C243073Xh) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0536:
            X.0eM r0 = r8.A0Y     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.4Vc r0 = (X.C265524Vc) r0     // Catch:{ all -> 0x06ca }
            X.3pN r0 = r0.A00     // Catch:{ all -> 0x06ca }
            X.3TP r2 = r0.A00(r4, r6)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0546:
            X.0eM r0 = r8.A0T     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.5e2 r0 = (X.C289685e2) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0554:
            X.0eM r0 = r8.A0y     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.HFm r0 = (X.HFm) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0562:
            X.0eM r0 = r8.A0E     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.HFf r0 = (X.C54477HFf) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0570:
            X.0eM r0 = r8.A0l     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.4Df r0 = (X.C262314Df) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x057e:
            X.0eM r0 = r8.A0w     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.HFi r0 = (X.C54480HFi) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x058c:
            X.0eM r0 = r8.A0z     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.4qf r0 = (X.C275634qf) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x059a:
            X.0eM r0 = r8.A0H     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.HFj r0 = (X.C54481HFj) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x05a8:
            X.0eM r0 = r8.A09     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.HFh r0 = (X.C54479HFh) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x05b6:
            X.0eM r0 = r8.A0C     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.2to r0 = (X.C232492to) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x05c4:
            X.0eM r0 = r8.A0r     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.HFg r0 = (X.C54478HFg) r0     // Catch:{ all -> 0x06ca }
            com.facebook.litho.LithoView r2 = r0.A03()     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x05d2:
            X.0eM r0 = r8.A12     // Catch:{ all -> 0x06ca }
            java.lang.Object r6 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r6 = (X.C258383yv) r6     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r5 = r2.A09     // Catch:{ all -> 0x06ca }
            X.310 r0 = r2.A00     // Catch:{ all -> 0x06ca }
            if (r0 == 0) goto L_0x0612
            X.DQu r2 = r0.CC3()     // Catch:{ all -> 0x06ca }
            X.AdK r0 = new X.AdK     // Catch:{ all -> 0x06ca }
            r0.<init>(r2)     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r6.A00(r7, r4, r5, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x05ef:
            X.0eM r0 = r8.A13     // Catch:{ all -> 0x06ca }
            java.lang.Object r6 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.3yv r6 = (X.C258383yv) r6     // Catch:{ all -> 0x06ca }
            com.instagram.common.session.UserSession r5 = r2.A09     // Catch:{ all -> 0x06ca }
            X.310 r0 = r2.A00     // Catch:{ all -> 0x06ca }
            if (r0 == 0) goto L_0x0612
            X.DQv r2 = r0.CC5()     // Catch:{ all -> 0x06ca }
            X.AdL r0 = new X.AdL     // Catch:{ all -> 0x06ca }
            r0.<init>(r2)     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r6.A00(r7, r4, r5, r0)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x060c:
            X.33R r0 = r2.A01     // Catch:{ all -> 0x06ca }
            if (r0 != 0) goto L_0x0637
            java.lang.String r9 = "mediaRowsPreparer"
        L_0x0612:
            X.0qQ.A0F(r9)     // Catch:{ all -> 0x06ca }
        L_0x0615:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0636
        L_0x061a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06ca }
            r1.<init>()     // Catch:{ all -> 0x06ca }
            java.lang.String r0 = "Unhandled item type, view type = "
            r1.append(r0)     // Catch:{ all -> 0x06ca }
            r1.append(r10)     // Catch:{ all -> 0x06ca }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06ca }
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x06ca }
            r1.<init>(r0)     // Catch:{ all -> 0x06ca }
            r0 = 362824308(0x15a04274, float:6.472833E-26)
            X.AnonymousClass0fD.A0A(r0, r3)     // Catch:{ all -> 0x06ca }
        L_0x0636:
            throw r1     // Catch:{ all -> 0x06ca }
        L_0x0637:
            X.33S r0 = r0.A00     // Catch:{ all -> 0x06ca }
            java.util.List r2 = r0.A01     // Catch:{ all -> 0x06ca }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x06ca }
            if (r0 == 0) goto L_0x0642
            goto L_0x0649
        L_0x0642:
            java.lang.Object r2 = r2.remove(r5)     // Catch:{ all -> 0x06ca }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x06ca }
            goto L_0x064a
        L_0x0649:
            r2 = 0
        L_0x064a:
            if (r2 != 0) goto L_0x06b1
            X.0eM r0 = r8.A0W     // Catch:{ all -> 0x06ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06ca }
            X.33Q r0 = (X.AnonymousClass33Q) r0     // Catch:{ all -> 0x06ca }
            android.view.View r2 = r0.A00(r4)     // Catch:{ all -> 0x06ca }
            goto L_0x06b1
        L_0x0659:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131624452(0x7f0e0204, float:1.8876084E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.3z5 r4 = new X.3z5     // Catch:{ all -> 0x06ca }
            r4.<init>(r2)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x066d:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131629074(0x7f0e1412, float:1.8885459E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.Gim r4 = new X.Gim     // Catch:{ all -> 0x06ca }
            r4.<init>(r2)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x0683:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131629083(0x7f0e141b, float:1.8885477E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.GjS r4 = new X.GjS     // Catch:{ all -> 0x06ca }
            r4.<init>(r2)     // Catch:{ all -> 0x06ca }
            goto L_0x06ae
        L_0x0699:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x06ca }
            r0 = 2131629027(0x7f0e13e3, float:1.8885363E38)
            android.view.View r2 = r2.inflate(r0, r4, r5)     // Catch:{ all -> 0x06ca }
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE     // Catch:{ all -> 0x06ca }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x06ca }
            X.49I r4 = new X.49I     // Catch:{ all -> 0x06ca }
            r4.<init>(r2)     // Catch:{ all -> 0x06ca }
        L_0x06ae:
            r2.setTag(r4)     // Catch:{ all -> 0x06ca }
        L_0x06b1:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)
            if (r0 == 0) goto L_0x06bd
            r0 = -1055990043(0xffffffffc10edee5, float:-8.929418)
            X.0fS.A00(r0)
        L_0x06bd:
            r0 = -1547130206(0xffffffffa3c8aaa2, float:-2.175631E-17)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 864111080(0x338149e8, float:6.020474E-8)
            X.AnonymousClass0fD.A0A(r0, r1)
            return r2
        L_0x06ca:
            r2 = move-exception
            r0 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r0)
            if (r0 == 0) goto L_0x06d9
            r0 = 1137936746(0x43d3896a, float:423.07355)
            X.0fS.A00(r0)
        L_0x06d9:
            r0 = 1392479954(0x52ff8ed2, float:5.48806394E11)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2s3.createView(int, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:245:0x091d, code lost:
        r8.A02((X.C282815Ev) r5.A0X.invoke(r31), (X.C254073rt) r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0c54, code lost:
        X.0qQ.A0F("inlineSurveyDelegate");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0c5b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0c88, code lost:
        X.0qQ.A0F("delegate");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0c8f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(android.view.View r34, X.C245713dM r35, X.C231592rv r36) {
        /*
            r33 = this;
            r6 = r35
            X.1Xj r3 = r6.A01
            X.3W1 r2 = r6.A02
            r0 = r33
            r32 = r34
            r31 = r36
            r4 = r32
            r1 = r31
            r0.A04(r4, r1, r3, r2)
            X.33e r5 = r0.A05
            if (r5 != 0) goto L_0x0021
            java.lang.String r0 = "lithoFeedBinderGroup"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0021:
            boolean r1 = r5.A00(r4, r1, r3, r2)
            X.3dK r5 = r6.A00
            java.lang.String r11 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.feedfullheightmedia.viewholder.FeedFullHeightMediaViewHolder"
            if (r1 == 0) goto L_0x0054
            X.2rv r4 = X.C231592rv.LITHO_HYBRID_FULL_HEIGHT_SINGLE_MEDIA
            r1 = r31
            if (r1 != r4) goto L_0x0044
            X.0sL r5 = r5.A0f
            X.2xS r4 = r0.A05()
            java.lang.Object r1 = r32.getTag()
            if (r1 == 0) goto L_0x0b78
            X.3s2 r1 = (X.C254163s2) r1
            X.4EA r1 = r1.A06
        L_0x0041:
            r5.invoke(r4, r1)
        L_0x0044:
            X.0eM r0 = r0.A0L
            java.lang.Object r4 = r0.getValue()
            X.33W r4 = (X.AnonymousClass33W) r4
            r1 = r32
            r0 = r31
            r4.A03(r1, r0, r3, r2)
            return
        L_0x0054:
            X.334 r10 = r0.A02
            java.lang.String r13 = "binders"
            if (r10 == 0) goto L_0x0d02
            int r12 = r31.ordinal()
            r4 = 1
            java.lang.String r9 = "inlineSurveyDelegate"
            r1 = 0
            java.lang.String r8 = "delegate"
            java.lang.String r6 = "Required value was null."
            java.lang.String r7 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder"
            switch(r12) {
                case 0: goto L_0x05f7;
                case 1: goto L_0x0541;
                case 2: goto L_0x0564;
                case 3: goto L_0x04dd;
                case 4: goto L_0x07b8;
                case 5: goto L_0x09a0;
                case 6: goto L_0x0451;
                case 7: goto L_0x05d8;
                case 8: goto L_0x0acc;
                case 9: goto L_0x092e;
                case 10: goto L_0x0505;
                case 11: goto L_0x05a0;
                case 12: goto L_0x0670;
                case 13: goto L_0x0a99;
                case 14: goto L_0x0a99;
                case 15: goto L_0x0555;
                case 16: goto L_0x04aa;
                case 17: goto L_0x006b;
                case 18: goto L_0x006b;
                case 19: goto L_0x006b;
                case 20: goto L_0x006b;
                case 21: goto L_0x006b;
                case 22: goto L_0x0073;
                case 23: goto L_0x006b;
                case 24: goto L_0x006b;
                case 25: goto L_0x01c7;
                case 26: goto L_0x0983;
                case 27: goto L_0x058c;
                case 28: goto L_0x006b;
                case 29: goto L_0x006b;
                case 30: goto L_0x006b;
                case 31: goto L_0x04f1;
                case 32: goto L_0x006b;
                case 33: goto L_0x0688;
                case 34: goto L_0x013c;
                case 35: goto L_0x006b;
                case 36: goto L_0x0238;
                case 37: goto L_0x07d4;
                case 38: goto L_0x0155;
                case 39: goto L_0x0b1c;
                case 40: goto L_0x0768;
                case 41: goto L_0x0909;
                case 42: goto L_0x0287;
                case 43: goto L_0x01f1;
                case 44: goto L_0x0612;
                case 45: goto L_0x006b;
                case 46: goto L_0x0787;
                case 47: goto L_0x00c0;
                case 48: goto L_0x00a2;
                case 49: goto L_0x06f8;
                case 50: goto L_0x00f0;
                case 51: goto L_0x0b3b;
                case 52: goto L_0x006b;
                case 53: goto L_0x0b5b;
                case 54: goto L_0x006b;
                case 55: goto L_0x0a6e;
                case 56: goto L_0x0482;
                case 57: goto L_0x0496;
                case 58: goto L_0x011d;
                case 59: goto L_0x01aa;
                case 60: goto L_0x03f9;
                case 61: goto L_0x0639;
                case 62: goto L_0x0653;
                case 63: goto L_0x006b;
                case 64: goto L_0x0b7e;
                case 65: goto L_0x0747;
                case 66: goto L_0x0578;
                case 67: goto L_0x0963;
                case 68: goto L_0x006b;
                case 69: goto L_0x04c9;
                case 70: goto L_0x006b;
                case 71: goto L_0x01d3;
                case 72: goto L_0x0afd;
                case 73: goto L_0x0afd;
                case 74: goto L_0x0afd;
                case 75: goto L_0x01d3;
                case 76: goto L_0x0948;
                case 77: goto L_0x0519;
                case 78: goto L_0x052d;
                case 79: goto L_0x006b;
                case 80: goto L_0x006b;
                case 81: goto L_0x006b;
                case 82: goto L_0x006b;
                case 83: goto L_0x006b;
                case 84: goto L_0x006b;
                case 85: goto L_0x006b;
                case 86: goto L_0x006b;
                case 87: goto L_0x006b;
                case 88: goto L_0x006b;
                case 89: goto L_0x006b;
                case 90: goto L_0x006b;
                case 91: goto L_0x006b;
                case 92: goto L_0x006b;
                case 93: goto L_0x006b;
                case 94: goto L_0x0416;
                default: goto L_0x006b;
            }
        L_0x006b:
            r4 = r32
            r1 = r31
            r0.A03(r4, r1, r3, r2)
            goto L_0x0044
        L_0x0073:
            java.lang.Object r6 = r32.getTag()
            if (r6 == 0) goto L_0x0b92
            X.3s2 r6 = (X.C254163s2) r6
            X.0sP r4 = r5.A0W
            X.2xS r1 = r0.A05()
            java.lang.Object r4 = r4.invoke(r1)
            X.4WX r4 = (X.AnonymousClass4WX) r4
            X.334 r1 = r0.A02
            if (r1 == 0) goto L_0x0d02
            X.0eM r1 = r1.A0V
            java.lang.Object r1 = r1.getValue()
            X.3pN r1 = (X.C252603pN) r1
            r1.A01(r4, r6, r2)
            X.0sL r5 = r5.A0f
            X.2xS r4 = r0.A05()
            X.4EA r1 = r6.A06
            r5.invoke(r4, r1)
            goto L_0x0044
        L_0x00a2:
            X.0sa r1 = r5.A0R
            java.lang.Object r6 = r1.invoke()
            X.VjL r6 = (X.C17983VjL) r6
            java.lang.Object r5 = r32.getTag()
            if (r5 == 0) goto L_0x0b98
            X.UEm r5 = (X.C14907UEm) r5
            X.Hkw r1 = r2.A05()
            X.IUm r4 = r1.A00
            X.3Yp r1 = r0.A04
            if (r1 == 0) goto L_0x0c54
            X.C18719Vys.A01(r1, r5, r4, r6)
            goto L_0x0044
        L_0x00c0:
            X.0sa r5 = r5.A0R
            java.lang.Object r15 = r5.invoke()
            X.VjL r15 = (X.C17983VjL) r15
            int r5 = r15.A00()
            if (r5 <= 0) goto L_0x0bb0
            r0.A00()
            android.content.Context r10 = r0.A06
            java.lang.Object r12 = r32.getTag()
            if (r12 == 0) goto L_0x0ba4
            X.UE4 r12 = (X.UE4) r12
            X.Hkw r5 = r2.A05()
            X.IUm r13 = r5.A00
            X.3Yp r11 = r0.A04
            if (r11 == 0) goto L_0x0c54
            X.VjZ r14 = r15.A01(r1)
            r16 = r4
            X.W2c.A02(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0044
        L_0x00f0:
            X.0sa r1 = r5.A0S
            java.lang.Object r8 = r1.invoke()
            X.4g7 r8 = (X.C270054g7) r8
            X.0eM r1 = r10.A10
            java.lang.Object r7 = r1.getValue()
            X.33l r7 = (X.C2363633l) r7
            com.instagram.common.session.UserSession r6 = r0.A09
            X.Hkw r14 = r2.A05()
            X.0sP r4 = r5.A0a
            X.1Xj r1 = X.1Xi.A02(r8)
            java.lang.Object r1 = r4.invoke(r1)
            X.JwH r1 = (X.C61079JwH) r1
            r9 = r7
            r10 = r32
            r11 = r1
            r12 = r6
            r13 = r8
            r9.A00(r10, r11, r12, r13, r14)
            goto L_0x0044
        L_0x011d:
            X.0sa r1 = r5.A0M
            java.lang.Object r6 = r1.invoke()
            X.JwK r6 = (X.C61082JwK) r6
            java.lang.Object r5 = r32.getTag()
            if (r5 == 0) goto L_0x0bb8
            X.GjL r5 = (X.C53149GjL) r5
            X.310 r1 = r0.A00
            if (r1 == 0) goto L_0x0c88
            X.6mq r4 = r1.BQe()
            X.4DU r1 = r0.A0B
            X.C56655I6k.A03(r6, r1, r5, r4)
            goto L_0x0044
        L_0x013c:
            X.0sa r4 = r5.A02
            java.lang.Object r6 = r4.invoke()
            X.4g6 r6 = (X.C270044g6) r6
            if (r6 == 0) goto L_0x0044
            java.lang.Object r5 = r32.getTag()
            if (r5 == 0) goto L_0x0bc0
            X.Gj0 r5 = (X.C53128Gj0) r5
            X.2nI r4 = r0.A08
            X.C56311HwO.A01(r4, r6, r5, r1, r1)
            goto L_0x0044
        L_0x0155:
            X.0sa r4 = r5.A03
            java.lang.Object r9 = r4.invoke()
            X.4g6 r9 = (X.C270044g6) r9
            if (r9 == 0) goto L_0x0044
            java.lang.Object r8 = r32.getTag()
            if (r8 == 0) goto L_0x0bcc
            X.Exp r8 = (X.C49554Exp) r8
            X.2nI r7 = r0.A08
            X.0qQ.A0B(r8, r1)
            r1 = 2
            X.0qQ.A0B(r7, r1)
            X.6NS r6 = r9.A00
            if (r6 != 0) goto L_0x0198
            android.widget.FrameLayout r1 = r8.A01
            android.content.Context r5 = r1.getContext()
            X.4hR r1 = r9.A01
            X.3ew r4 = r1.A01()
            r1 = 0
            X.68u r1 = X.C3034368u.A02(r1, r4)
            X.6NR r1 = X.AnonymousClass6NS.A00(r5, r1, r7)
            X.6NS r4 = r1.A00()
            r9.A00 = r6
            X.EE6 r1 = new X.EE6
            r1.<init>(r7, r4, r9)
            r7.A05(r1)
            r6 = r4
        L_0x0198:
            X.6NS r1 = r8.A00
            if (r1 == r6) goto L_0x0044
            if (r1 == 0) goto L_0x01a1
            r1.A04()
        L_0x01a1:
            r8.A00 = r6
            X.4n2 r1 = r8.A02
            r6.A07(r1)
            goto L_0x0044
        L_0x01aa:
            X.0eM r1 = r10.A0j
            java.lang.Object r6 = r1.getValue()
            X.Hq3 r6 = (X.C55939Hq3) r6
            java.lang.Object r4 = r32.getTag()
            if (r4 == 0) goto L_0x0bd4
            X.HmR r4 = (X.C55730HmR) r4
            X.0sa r1 = r5.A0N
            java.lang.Object r1 = r1.invoke()
            X.9IZ r1 = (X.AnonymousClass9IZ) r1
            r6.A00(r1, r4)
            goto L_0x0044
        L_0x01c7:
            X.3rk r4 = new X.3rk
            r4.<init>()
            r1 = r32
            r1.setTag(r4)
            goto L_0x0044
        L_0x01d3:
            X.0eM r1 = r10.A10
            java.lang.Object r6 = r1.getValue()
            X.33l r6 = (X.C2363633l) r6
            com.instagram.common.session.UserSession r4 = r0.A09
            X.0sP r1 = r5.A0a
            java.lang.Object r1 = r1.invoke(r3)
            X.JwH r1 = (X.C61079JwH) r1
            r5 = r6
            r6 = r32
            r7 = r1
            r8 = r4
            r9 = r3
            r10 = r2
            r5.A00(r6, r7, r8, r9, r10)
            goto L_0x0044
        L_0x01f1:
            X.0sa r1 = r5.A0H
            java.lang.Object r4 = r1.invoke()
            X.0eM r1 = r10.A0g
            java.lang.Object r7 = r1.getValue()
            X.3pR r7 = (X.C252643pR) r7
            java.lang.Object r6 = r32.getTag()
            if (r6 == 0) goto L_0x0bdc
            X.3rl r6 = (X.C253993rl) r6
            X.0sP r1 = r5.A0Z
            java.lang.Object r5 = r1.invoke(r4)
            X.3Zb r5 = (X.C243513Zb) r5
            X.0eM r1 = r0.A0L
            java.lang.Object r1 = r1.getValue()
            X.33W r1 = (X.AnonymousClass33W) r1
            X.0eM r1 = r1.A0J
            java.lang.Object r1 = r1.getValue()
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.3Ws r1 = r1.A01()
            X.3Zn r4 = new X.3Zn
            r4.<init>(r1)
            int r13 = r2.getPosition()
            X.4DU r1 = r0.A0B
            r8 = r1
            r9 = r4
            r10 = r6
            r11 = r5
            r12 = r2
            r7.A06(r8, r9, r10, r11, r12, r13)
            goto L_0x0044
        L_0x0238:
            X.0eM r6 = r10.A0n
            java.lang.Object r9 = r6.getValue()
            X.4EZ r9 = (X.AnonymousClass4EZ) r9
            java.lang.Object r13 = r32.getTag()
            if (r13 == 0) goto L_0x0be4
            X.4EA r13 = (X.AnonymousClass4EA) r13
            X.0sL r8 = r5.A0d
            X.2xS r7 = r0.A05()
            X.2s5 r6 = r0.A0W
            java.lang.Object r12 = r8.invoke(r7, r6)
            X.3et r12 = (X.C246613et) r12
            int r14 = r2.getPosition()
            X.4DU r10 = r0.A0B
            r8 = 0
            r6 = -1
            X.3jo r7 = r0.A0U
            X.2dZ r7 = r7.AYJ()
            if (r7 == 0) goto L_0x026a
            int r6 = r7.AYI()
        L_0x026a:
            X.4JV r11 = new X.4JV
            r11.<init>(r8, r6, r1, r1)
            r15 = r4
            r9.A07(r10, r11, r12, r13, r14, r15)
            X.0sL r5 = r5.A0f
            X.2xS r4 = r0.A05()
            java.lang.Object r1 = r32.getTag()
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.video.holder.FeedVideoViewHolder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0287:
            X.0eM r6 = r10.A0e
            java.lang.Object r12 = r6.getValue()
            X.HoG r12 = (X.C55833HoG) r12
            java.lang.Object r11 = r32.getTag()
            if (r11 == 0) goto L_0x0bec
            X.HoV r11 = (X.C55848HoV) r11
            X.0sP r6 = r5.A0Y
            X.2s5 r5 = r0.A0W
            java.lang.Object r10 = r6.invoke(r5)
            X.GmW r10 = (X.C53346GmW) r10
            X.0qQ.A0B(r11, r1)
            X.0qQ.A0B(r10, r4)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r13 = r11.A06
            float r4 = r10.A00
            r13.A00 = r4
            X.IDK r4 = new X.IDK
            r4.<init>(r10, r11, r12)
            r13.setOnTouchListener(r4)
            X.IAo r4 = new X.IAo
            r4.<init>(r10, r11)
            X.AnonymousClass0fU.A00(r4, r13)
            com.instagram.feed.widget.IgProgressImageView r9 = r11.A03
            android.graphics.drawable.ColorDrawable r5 = r12.A00
            if (r5 != 0) goto L_0x02d7
            android.content.Context r5 = r12.A01
            r4 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r4 = X.2Yu.A0H(r5, r4)
            int r4 = r5.getColor(r4)
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r5.<init>(r4)
            r12.A00 = r5
        L_0x02d7:
            r9.setPlaceHolderColor((android.graphics.drawable.ColorDrawable) r5)
            r4 = 1132396544(0x437f0000, float:255.0)
            r9.setAlpha(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r9.getIgImageView()
            r4.clearColorFilter()
            X.GnX r8 = r10.A02
            java.lang.Object r4 = r8.A03
            X.0sP r4 = (X.0sP) r4
            r4.invoke(r9)
            r6 = 2131435565(0x7f0b202d, float:1.8492976E38)
            X.IUw r4 = new X.IUw
            r4.<init>(r10)
            r9.A0A(r4, r6)
            X.IOv r4 = new X.IOv
            r4.<init>(r10)
            r9.setOnFallbackListener(r4)
            X.IV1 r5 = new X.IV1
            r5.<init>(r10)
            android.util.SparseArray r4 = r9.A0D
            r4.put(r6, r5)
            X.2s5 r4 = r10.A03
            r9.setPostProcessor(r4)
            X.3gz r4 = new X.3gz
            r4.<init>()
            r9.setProgressiveImageConfig(r4)
            X.3W1 r7 = r10.A06
            r7.A0U = r1
            X.0eM r4 = r12.A04
            java.lang.Object r5 = r4.getValue()
            X.3fS r5 = (X.C246923fS) r5
            X.3ZT r4 = r10.A07
            X.1Xj r4 = r4.A00
            r25 = r4
            android.content.Context r6 = r12.A01
            X.3fX r4 = r5.A00(r6, r4)
            X.4DU r5 = r10.A05
            X.C247843h0.A00(r5, r4, r9)
            X.3W1 r4 = r11.A00
            if (r4 == 0) goto L_0x0348
            if (r4 == r7) goto L_0x0348
            com.instagram.ui.mediaactions.LikeActionView r14 = r11.A05
            r4.A0V(r14)
            X.3W1 r4 = r11.A00
            if (r4 == 0) goto L_0x0348
            r4.A0Y(r14)
        L_0x0348:
            r11.A00 = r7
            android.content.Context r17 = r9.getContext()
            X.0qQ.A07(r17)
            com.instagram.common.session.UserSession r4 = r12.A02
            r24 = r4
            android.content.res.Resources r18 = r9.getResources()
            X.0qQ.A07(r18)
            r16 = 0
            boolean r4 = r12.A05
            r19 = r5
            r20 = r24
            r21 = r25
            r22 = r16
            r23 = r4
            java.lang.StringBuilder r14 = X.C246673ez.A01(r17, r18, r19, r20, r21, r22, r23)
            r9.setContentDescription(r14)
            X.3V9 r14 = r11.A04
            r4 = r4 ^ 1
            r14.A0D = r4
            com.instagram.ui.mediaactions.LikeActionView r4 = r11.A05
            r4.A00()
            r7.A0T(r4)
            r7.A0X(r4)
            r17 = r6
            r18 = r13
            r19 = r24
            r20 = r25
            r21 = r5
            r22 = r7
            X.AnonymousClass4HG.A00(r17, r18, r19, r20, r21, r22)
            X.DUp r10 = r10.A04
            if (r10 == 0) goto L_0x03ec
            com.instagram.common.ui.base.IgTextView r13 = r11.A01
            r13.setVisibility(r1)
            com.instagram.api.schemas.GuideTypeStr r4 = r10.CAN()
            java.lang.String r4 = r4.toString()
            X.EVz r15 = X.VE6.A00(r4)
            int r4 = r10.BWv()
            java.lang.String r4 = X.VE9.A00(r6, r15, r4)
            r13.setText(r4)
            com.instagram.common.ui.base.IgTextView r4 = r11.A02
            r4.setVisibility(r1)
            java.lang.String r1 = r10.getTitle()
            r4.setText(r1)
        L_0x03bd:
            r1 = 2131435563(0x7f0b202b, float:1.8492972E38)
            r9.A06(r1)
            X.JT3 r1 = r12.A03
            X.4Gh r9 = r1.BR1()
            java.lang.Object r4 = r8.A00
            X.0sK r4 = (X.0sK) r4
            r1 = r24
            java.lang.Object r8 = r4.invoke(r14, r5, r1)
            android.view.View$OnClickListener r8 = (android.view.View.OnClickListener) r8
            X.3eW r17 = X.C246393eW.A00
            r18 = r6
            r21 = r25
            r22 = r5
            r23 = r7
            r24 = r16
            X.4Fv r4 = r17.A00(r18, r19, r20, r21, r22, r23, r24)
            r1 = r16
            X.C262954Gq.A00(r8, r9, r4, r1, r14)
            goto L_0x0044
        L_0x03ec:
            com.instagram.common.ui.base.IgTextView r1 = r11.A01
            r4 = 8
            r1.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r1 = r11.A02
            r1.setVisibility(r4)
            goto L_0x03bd
        L_0x03f9:
            X.0eM r1 = r10.A0m
            java.lang.Object r6 = r1.getValue()
            X.3z4 r6 = (X.AnonymousClass3z4) r6
            X.0sa r1 = r5.A0O
            java.lang.Object r4 = r1.invoke()
            X.3gM r4 = (X.C247453gM) r4
            java.lang.Object r1 = r32.getTag()
            if (r1 == 0) goto L_0x0bf4
            X.3rn r1 = (X.C254013rn) r1
            r6.A06(r1, r4, r2)
            goto L_0x0044
        L_0x0416:
            X.0eM r1 = r10.A0k
            java.lang.Object r8 = r1.getValue()
            X.33s r8 = (X.C2364333s) r8
            java.lang.String r7 = r3.getId()
            if (r7 == 0) goto L_0x0bfc
            X.0eM r1 = r0.A0L
            java.lang.Object r1 = r1.getValue()
            X.33W r1 = (X.AnonymousClass33W) r1
            X.0eM r1 = r1.A0J
            java.lang.Object r1 = r1.getValue()
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.3Yc r1 = r1.A00()
            X.9Ib r5 = new X.9Ib
            r5.<init>((X.C243273Yc) r1, (X.1Xj) r3, (X.AnonymousClass3W1) r2)
            r10 = 16
            X.9MR r4 = new X.9MR
            r9 = r4
            r11 = r2
            r12 = r0
            r13 = r3
            r14 = r31
            r9.<init>(r10, r11, r12, r13, r14)
            r1 = r32
            r8.A02(r1, r7, r5, r4)
            goto L_0x0044
        L_0x0451:
            X.0eM r1 = r10.A0I
            java.lang.Object r8 = r1.getValue()
            X.3TC r8 = (X.AnonymousClass3TC) r8
            java.lang.Object r7 = r32.getTag()
            if (r7 == 0) goto L_0x0c02
            X.3TR r7 = (X.AnonymousClass3TR) r7
            X.0sP r4 = r5.A0V
            androidx.fragment.app.FragmentActivity r1 = r0.A07
            java.lang.Object r6 = r4.invoke(r1)
            X.4Fw r6 = (X.C262754Fw) r6
            X.0sa r1 = r5.A07
            java.lang.Object r5 = r1.invoke()
            X.4Fy r5 = (X.C262774Fy) r5
            X.4DU r4 = r0.A0B
            X.2nI r1 = r0.A08
            r9 = r1
            r10 = r5
            r11 = r6
            r12 = r7
            r13 = r4
            r14 = r2
            r8.A02(r9, r10, r11, r12, r13, r14)
            goto L_0x0044
        L_0x0482:
            X.0eM r1 = r10.A0o
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x0496:
            X.0eM r1 = r10.A0q
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x04aa:
            X.0eM r1 = r10.A0R
            java.lang.Object r7 = r1.getValue()
            X.Koq r7 = (X.C62938Koq) r7
            java.lang.Object r6 = r32.getTag()
            if (r6 == 0) goto L_0x0c0a
            X.L9A r6 = (X.L9A) r6
            X.0sa r1 = r5.A0B
            java.lang.Object r4 = r1.invoke()
            X.Jvv r4 = (X.C61057Jvv) r4
            X.4DU r1 = r0.A0B
            r7.A00(r4, r1, r6)
            goto L_0x0044
        L_0x04c9:
            X.0eM r1 = r10.A0v
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x04dd:
            X.0eM r1 = r10.A0D
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x04f1:
            X.0eM r1 = r10.A0Z
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x0505:
            X.0eM r1 = r10.A0N
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x0519:
            X.0eM r1 = r10.A12
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x052d:
            X.0eM r1 = r10.A13
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x0541:
            X.0eM r1 = r10.A0A
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x0555:
            X.33L r4 = r10.A03
            java.lang.Object r1 = r32.getTag()
            if (r1 == 0) goto L_0x0c12
            X.GjS r1 = (X.C53156GjS) r1
            r4.A00(r1, r3, r2)
            goto L_0x0044
        L_0x0564:
            X.0eM r1 = r10.A0B
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x0578:
            X.0eM r1 = r10.A0s
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x058c:
            X.0eM r1 = r10.A0b
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x05a0:
            java.lang.Object r9 = r32.getTag()
            if (r9 == 0) goto L_0x0c1a
            X.3V2 r9 = (X.AnonymousClass3V2) r9
            X.0eM r1 = r10.A0O
            java.lang.Object r8 = r1.getValue()
            X.GUE r8 = (X.GUE) r8
            X.0sL r4 = r5.A0b
            X.2xS r1 = r0.A05()
            java.lang.Object r7 = r4.invoke(r9, r1)
            X.GmH r7 = (X.C53331GmH) r7
            androidx.fragment.app.FragmentActivity r6 = r0.A07
            X.2s5 r4 = r0.A0W
            X.4DU r1 = r0.A0B
            r10 = r8
            r11 = r6
            r12 = r4
            r13 = r7
            r14 = r9
            r15 = r1
            r16 = r2
            r10.A00(r11, r12, r13, r14, r15, r16)
            X.0sL r4 = r5.A0e
            X.2xS r1 = r0.A05()
            r4.invoke(r1, r9)
            goto L_0x0044
        L_0x05d8:
            androidx.fragment.app.FragmentActivity r8 = r0.A07
            java.lang.Object r7 = r32.getTag()
            X.3z5 r7 = (X.C258453z5) r7
            X.0sa r4 = r5.A06
            java.lang.Object r6 = r4.invoke()
            X.3fn r6 = (X.C247113fn) r6
            com.instagram.common.session.UserSession r5 = r0.A09
            android.content.Context r4 = r0.A06
            r14 = r1
            r9 = r4
            r10 = r5
            r11 = r7
            r12 = r6
            r13 = r2
            X.C271274ia.A00(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0044
        L_0x05f7:
            boolean r1 = r0.A0P
            if (r1 == 0) goto L_0x0044
            X.0sa r1 = r5.A00
            java.lang.Object r5 = r1.invoke()
            X.3ha r5 = (X.C248203ha) r5
            X.0eM r1 = r10.A07
            java.lang.Object r4 = r1.getValue()
            X.HpV r4 = (X.C55908HpV) r4
            r1 = r32
            r4.A00(r1, r5)
            goto L_0x0044
        L_0x0612:
            android.content.Context r9 = r0.A06
            boolean r8 = r0.A0P
            java.lang.Object r7 = r32.getTag()
            if (r7 == 0) goto L_0x0c22
            X.5w1 r7 = (X.AnonymousClass5w1) r7
            X.0sa r1 = r5.A0I
            java.lang.Object r6 = r1.invoke()
            X.9IE r6 = (X.AnonymousClass9IE) r6
            X.0Pl r5 = r0.A0C
            X.4DU r4 = r0.A0B
            com.instagram.common.session.UserSession r1 = r0.A09
            r10 = r6
            r11 = r1
            r12 = r7
            r13 = r4
            r14 = r2
            r15 = r5
            r16 = r8
            X.AnonymousClass5w0.A01(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0044
        L_0x0639:
            X.0eM r1 = r10.A14
            r1.getValue()
            java.lang.Object r4 = r32.getTag()
            if (r4 == 0) goto L_0x0c2a
            X.49J r4 = (X.AnonymousClass49J) r4
            X.0sa r1 = r5.A0U
            java.lang.Object r1 = r1.invoke()
            X.9If r1 = (X.C376499If) r1
            X.C2607346v.A00(r1, r4)
            goto L_0x0044
        L_0x0653:
            X.0eM r1 = r10.A0P
            java.lang.Object r6 = r1.getValue()
            X.GUA r6 = (X.GUA) r6
            java.lang.Object r4 = r32.getTag()
            if (r4 == 0) goto L_0x0c32
            X.Gin r4 = (X.C53115Gin) r4
            X.0sa r1 = r5.A09
            java.lang.Object r1 = r1.invoke()
            X.JwG r1 = (X.C61078JwG) r1
            r6.A00(r1, r4)
            goto L_0x0044
        L_0x0670:
            java.lang.Object r4 = r32.getTag()
            r1 = 3660(0xe4c, float:5.129E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r4, r1)
            X.Gim r4 = (X.C53114Gim) r4
            com.instagram.ui.widget.spinner.SpinnerImageView r4 = r4.A00
            X.3uy r1 = X.C255943uy.LOADING
            r4.setLoadingStatus(r1)
            goto L_0x0044
        L_0x0688:
            com.instagram.common.session.UserSession r15 = r0.A09
            X.IOg r7 = X.C55171HdN.A00(r15)
            com.instagram.user.model.User r4 = r3.A2A(r15)
            if (r4 == 0) goto L_0x0c46
            java.lang.String r5 = r4.getId()
            java.util.Map r4 = r7.A00
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            X.ToV r5 = new X.ToV
            r5.<init>(r4)
            java.lang.Integer r6 = r0.A0Z
            if (r6 == 0) goto L_0x0044
            X.ToZ r9 = X.C14148Tqk.A00
            android.content.Context r10 = r0.A06
            androidx.fragment.app.FragmentActivity r12 = r0.A07
            r20 = 0
            X.4DU r13 = r0.A0B
            java.lang.Object r4 = r32.getTag()
            if (r4 == 0) goto L_0x0c3a
            X.Tqg r4 = (X.C14144Tqg) r4
            X.310 r7 = r0.A00
            if (r7 == 0) goto L_0x0c88
            X.3Ww r29 = r7.BwU()
            X.57L r7 = r0.A0X
            X.0xF r14 = r0.A0V
            X.HBL r16 = new X.HBL
            r21 = r16
            r22 = r12
            r23 = r13
            r24 = r14
            r25 = r15
            r26 = r7
            r27 = r3
            r28 = r2
            r30 = r6
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.IV3 r6 = new X.IV3
            r6.<init>(r2)
            android.os.Parcelable r11 = r2.A0d
            r21 = r20
            r22 = r20
            r24 = r1
            r23 = r1
            r18 = r4
            r19 = r6
            r17 = r5
            r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0044
        L_0x06f8:
            X.Hkw r7 = r2.A05()
            int r4 = r2.getPosition()
            X.IUl r1 = r7.A01
            r1.A00(r4)
            X.IUm r1 = r7.A00
            r1.A00(r4)
            X.0sa r1 = r5.A0S
            java.lang.Object r7 = r1.invoke()
            X.4g7 r7 = (X.C270054g7) r7
            X.0sL r4 = r5.A0c
            X.310 r1 = r0.A00
            if (r1 == 0) goto L_0x0c88
            X.2rR r1 = r1.B5L()
            if (r1 == 0) goto L_0x0c5c
            java.lang.Object r1 = r4.invoke(r1, r7)
            X.3Yp r1 = (X.C243393Yp) r1
            r0.A04 = r1
            if (r1 == 0) goto L_0x0c54
            r1.A02(r3)
            r0.A00()
            java.lang.Object r6 = r32.getTag()
            if (r6 == 0) goto L_0x0c4c
            X.UDz r6 = (X.C14897UDz) r6
            X.Hkw r1 = r2.A05()
            X.IUl r5 = r1.A01
            X.4DU r4 = r0.A0B
            X.3Yp r1 = r0.A04
            if (r1 == 0) goto L_0x0c54
            X.C18200VnN.A01(r4, r1, r6, r5, r7)
            goto L_0x0044
        L_0x0747:
            android.content.Context r9 = r0.A06
            com.instagram.common.session.UserSession r11 = r0.A09
            X.4DU r10 = r0.A0B
            java.lang.Object r13 = r32.getTag()
            if (r13 == 0) goto L_0x0c68
            X.UDs r13 = (X.C14890UDs) r13
            X.310 r1 = r0.A00
            if (r1 == 0) goto L_0x0c88
            X.2ql r12 = r1.BgC()
            java.lang.String r14 = r3.A2n()
            if (r14 == 0) goto L_0x0c62
            X.C18696Vwu.A02(r9, r10, r11, r12, r13, r14)
            goto L_0x0044
        L_0x0768:
            androidx.fragment.app.FragmentActivity r8 = r0.A07
            java.lang.Object r7 = r32.getTag()
            X.GjG r7 = (X.C53144GjG) r7
            X.0sa r1 = r5.A0G
            java.lang.Object r6 = r1.invoke()
            X.JM5 r6 = (X.JM5) r6
            X.0sa r1 = r5.A0F
            java.lang.Object r4 = r1.invoke()
            X.Hnm r4 = (X.C55806Hnm) r4
            X.2nI r1 = r0.A08
            X.C56302HwF.A01(r8, r1, r4, r6, r7)
            goto L_0x0044
        L_0x0787:
            X.0eM r1 = r10.A0W
            java.lang.Object r5 = r1.getValue()
            X.33Q r5 = (X.AnonymousClass33Q) r5
            java.lang.Object r4 = r32.getTag()
            if (r4 == 0) goto L_0x0c74
            X.3Oz r4 = (X.C241383Oz) r4
            X.0eM r1 = r0.A0L
            java.lang.Object r1 = r1.getValue()
            X.33W r1 = (X.AnonymousClass33W) r1
            X.0eM r1 = r1.A0J
            java.lang.Object r1 = r1.getValue()
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A0L
            java.lang.Object r1 = r1.getValue()
            X.3gm r1 = (X.C247703gm) r1
            X.9J0 r1 = r1.A00(r3, r2)
            r5.A01(r1, r4, r2)
            goto L_0x0044
        L_0x07b8:
            X.0eM r1 = r10.A0F
            r1.getValue()
            java.lang.Object r6 = r32.getTag()
            if (r6 == 0) goto L_0x0c80
            X.49I r6 = (X.AnonymousClass49I) r6
            X.0sa r1 = r5.A04
            java.lang.Object r4 = r1.invoke()
            X.JwM r4 = (X.C61084JwM) r4
            X.4DU r1 = r0.A0B
            X.GU8.A00(r4, r6, r1)
            goto L_0x0044
        L_0x07d4:
            X.0eM r6 = r10.A0x
            java.lang.Object r11 = r6.getValue()
            X.HmM r11 = (X.C55725HmM) r11
            X.0sa r5 = r5.A0Q
            java.lang.Object r12 = r5.invoke()
            X.9Ij r12 = (X.C376539Ij) r12
            java.lang.Object r10 = r32.getTag()
            if (r10 == 0) goto L_0x0c90
            X.3s3 r10 = (X.C254173s3) r10
            X.2nI r14 = r0.A08
            X.310 r5 = r0.A00
            if (r5 == 0) goto L_0x0c88
            X.4GO r13 = r5.ByL()
            X.0qQ.A0B(r12, r1)
            X.0qQ.A0B(r10, r4)
            r5 = 3
            X.0qQ.A0B(r13, r5)
            java.lang.Object r9 = r12.A05
            com.instagram.model.showreel.IgShowreelComposition r9 = (com.instagram.model.showreel.IgShowreelComposition) r9
            java.lang.Object r6 = r12.A06
            X.6L7 r6 = (X.AnonymousClass6L7) r6
            java.lang.Object r8 = r12.A01
            X.GnX r8 = (X.C53400GnX) r8
            java.lang.Object r5 = r8.A02
            X.0sa r5 = (X.C62320sa) r5
            java.lang.Object r7 = r5.invoke()
            X.6Q7 r7 = (X.AnonymousClass6Q7) r7
            r15 = 8
            if (r6 == 0) goto L_0x08e4
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r5 = r10.A05
            r5.setVisibility(r15)
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r14 = r10.A06
            r14.setVisibility(r1)
            r9 = r6
            X.GVk r9 = (X.C52507GVk) r9
            java.lang.Integer r5 = r9.A01
            if (r5 == 0) goto L_0x08e1
            int r5 = r5.intValue()
            float r5 = (float) r5
            java.lang.Float r15 = java.lang.Float.valueOf(r5)
        L_0x0834:
            java.lang.Integer r5 = r9.A00
            if (r5 == 0) goto L_0x08de
            int r5 = r5.intValue()
            float r5 = (float) r5
            java.lang.Float r9 = java.lang.Float.valueOf(r5)
        L_0x0841:
            if (r15 == 0) goto L_0x08da
            if (r9 == 0) goto L_0x08da
            float r15 = r15.floatValue()
            r16 = 0
            int r5 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x08da
            float r9 = r9.floatValue()
            int r5 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x08da
            float r15 = r15 / r9
        L_0x0858:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r9 = r10.A09
            r9.A00 = r15
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
            r14.setScaleType(r5)
            com.instagram.common.session.UserSession r5 = r11.A02
            X.0iw r15 = r11.A01
            java.lang.String r18 = r15.getModuleName()
            r15 = r7
            r16 = r6
            r17 = r5
            r19 = r4
            r14.A07(r15, r16, r17, r18, r19)
            java.lang.Object r4 = r8.A03
            X.0sP r4 = (X.0sP) r4
            r4.invoke(r9)
        L_0x087a:
            java.lang.Object r7 = r12.A04
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            r10.A00 = r7
            com.instagram.ui.mediaactions.LikeActionView r6 = r10.A08
            r6.A00()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r5 = r10.A09
            X.IDU r4 = new X.IDU
            r4.<init>(r12, r13, r10, r11)
            r5.setOnTouchListener(r4)
            X.3VF r4 = r10.A07
            X.3VD r9 = r4.A04
            if (r9 == 0) goto L_0x08b0
            java.lang.Object r4 = r8.A01
            X.0sa r4 = (X.C62320sa) r4
            java.lang.Object r5 = r4.invoke()
            X.3fk r5 = (X.C247083fk) r5
            com.instagram.common.session.UserSession r4 = r11.A02
            X.47O r14 = r13.BR2()
            r13 = r4
            r15 = r5
            r16 = r9
            r17 = r1
            r18 = r1
            X.AnonymousClass4H3.A00(r13, r14, r15, r16, r17, r18)
        L_0x08b0:
            X.3v9 r13 = r10.A03
            java.lang.Object r10 = r12.A03
            X.9J3 r10 = (X.AnonymousClass9J3) r10
            android.content.Context r14 = r11.A00
            com.instagram.common.session.UserSession r9 = r11.A02
            X.0iw r1 = r11.A01
            java.lang.String r5 = r1.getModuleName()
            java.lang.Object r4 = r12.A02
            X.1Xj r4 = (X.1Xj) r4
            if (r10 == 0) goto L_0x08d8
            java.lang.String r1 = r10.A03
        L_0x08c8:
            int r1 = X.C256073vB.A00(r14, r9, r4, r5, r1)
            X.C256083vC.A00(r10, r13, r7, r1)
            java.lang.Object r1 = r8.A04
            X.0sP r1 = (X.0sP) r1
            r1.invoke(r6)
            goto L_0x0044
        L_0x08d8:
            r1 = 0
            goto L_0x08c8
        L_0x08da:
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0858
        L_0x08de:
            r9 = 0
            goto L_0x0841
        L_0x08e1:
            r15 = 0
            goto L_0x0834
        L_0x08e4:
            if (r9 == 0) goto L_0x087a
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r5 = r10.A06
            r5.setVisibility(r15)
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r6 = r10.A05
            r6.setVisibility(r1)
            if (r14 == 0) goto L_0x087a
            X.6Nn r5 = new X.6Nn
            r15 = r5
            r16 = r7
            r17 = r1
            r18 = r1
            r19 = r4
            r20 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            com.instagram.common.session.UserSession r4 = r11.A02
            r6.setShowreelAnimation(r4, r9, r5, r14)
            goto L_0x087a
        L_0x0909:
            X.0eM r1 = r10.A0X
            java.lang.Object r8 = r1.getValue()
            X.3yv r8 = (X.C258383yv) r8
            java.lang.Object r6 = r32.getTag()
            if (r6 != 0) goto L_0x091d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x091d:
            X.3rt r6 = (X.C254073rt) r6
            X.0sP r4 = r5.A0X
            r1 = r31
            java.lang.Object r1 = r4.invoke(r1)
            X.5Ev r1 = (X.C282815Ev) r1
            r8.A02(r1, r6, r2)
            goto L_0x0044
        L_0x092e:
            X.0eM r1 = r10.A0M
            r1.getValue()
            java.lang.Object r4 = r32.getTag()
            if (r4 == 0) goto L_0x0c98
            X.HnH r4 = (X.C55782HnH) r4
            X.0sa r1 = r5.A08
            java.lang.Object r1 = r1.invoke()
            X.JM7 r1 = (X.JM7) r1
            X.C56589I2t.A01(r4, r1)
            goto L_0x0044
        L_0x0948:
            X.0eM r1 = r10.A11
            java.lang.Object r6 = r1.getValue()
            X.GUB r6 = (X.GUB) r6
            java.lang.Object r4 = r32.getTag()
            X.Gj9 r4 = (X.C53137Gj9) r4
            X.0sa r1 = r5.A0T
            java.lang.Object r1 = r1.invoke()
            X.9IE r1 = (X.AnonymousClass9IE) r1
            r6.A00(r1, r4)
            goto L_0x0044
        L_0x0963:
            X.0eM r6 = r10.A0t
            java.lang.Object r5 = r6.getValue()
            X.GUD r5 = (X.GUD) r5
            java.lang.Object r1 = r32.getTag()
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.scheduledcontent.ScheduledContentPublishTimeViewBinder.Holder"
            if (r1 == 0) goto L_0x0ca6
            X.Giu r1 = (X.C53122Giu) r1
            r5.A02(r1, r3)
            java.lang.Object r1 = r32.getTag()
            if (r1 == 0) goto L_0x0ca0
            r6.getValue()
            goto L_0x0044
        L_0x0983:
            X.0eM r1 = r10.A0u
            java.lang.Object r6 = r1.getValue()
            X.Uu5 r6 = (X.Uu5) r6
            java.lang.Object r4 = r32.getTag()
            if (r4 == 0) goto L_0x0cac
            X.UC7 r4 = (X.UC7) r4
            X.0sa r1 = r5.A0P
            java.lang.Object r1 = r1.invoke()
            X.9In r1 = (X.C376579In) r1
            r6.A06(r1, r4)
            goto L_0x0044
        L_0x09a0:
            X.0eM r6 = r10.A0a
            r6.getValue()
            java.lang.Object r6 = r32.getTag()
            if (r6 == 0) goto L_0x0cb4
            X.UDF r6 = (X.UDF) r6
            X.0sa r5 = r5.A0C
            java.lang.Object r9 = r5.invoke()
            X.GnV r9 = (X.C53398GnV) r9
            X.0qQ.A0B(r6, r1)
            X.0qQ.A0B(r9, r4)
            X.0eM r7 = r6.A01
            java.lang.Object r4 = r7.getValue()
            X.0qQ.A07(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r1 = r9.A04
            r4.setText(r1)
            android.view.View r4 = r6.A00
            android.content.Context r5 = r4.getContext()
            int r1 = X.2Yu.A0C(r5)
            int r1 = r5.getColor(r1)
            r4.setBackgroundColor(r1)
            boolean r1 = r9.A05
            if (r1 == 0) goto L_0x0a14
            java.lang.Object r4 = r7.getValue()
            X.0qQ.A07(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1 = 2132018632(0x7f1405c8, float:1.9675576E38)
            r4.setTextAppearance(r1)
            java.lang.Object r4 = r7.getValue()
            X.0qQ.A07(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r1 = X.2Yu.A07(r5)
            int r1 = r5.getColor(r1)
            r4.setTextColor(r1)
            X.0eM r1 = r6.A02
            java.lang.Object r4 = r1.getValue()
            X.0qQ.A07(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1 = 2131238329(0x7f081db9, float:1.8092934E38)
            r4.setImageResource(r1)
        L_0x0a14:
            java.lang.String r11 = r9.A03
            if (r11 == 0) goto L_0x0044
            java.lang.Object r6 = r7.getValue()
            X.0qQ.A07(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Object r1 = r7.getValue()
            X.0qQ.A07(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r1 = r1.getText()
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r11}
            java.lang.String r1 = "%s %s"
            java.lang.String r5 = X.0mp.A06(r1, r4)
            java.lang.Object r1 = r7.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            android.content.Context r4 = r1.getContext()
            java.lang.Object r1 = r7.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = r1.getContext()
            int r1 = X.2Yu.A06(r1)
            int r12 = r4.getColor(r1)
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r4 = 16
            r1 = 0
            X.04x r8 = new X.04x
            r8.<init>(r4, r1)
            X.K93 r7 = new X.K93
            r7.<init>(r8, r9, r10, r11, r12)
            X.AnonymousClass7AV.A07(r7, r6, r11, r5)
            goto L_0x0044
        L_0x0a6e:
            X.0eM r1 = r10.A0i
            java.lang.Object r9 = r1.getValue()
            X.I0e r9 = (X.C56533I0e) r9
            java.lang.Object r8 = r32.getTag()
            if (r8 == 0) goto L_0x0cc2
            X.Hnn r8 = (X.C55807Hnn) r8
            X.0sa r1 = r5.A0L
            java.lang.Object r7 = r1.invoke()
            X.Jvj r7 = (X.C61045Jvj) r7
            X.0sa r1 = r5.A0K
            java.lang.Object r4 = r1.invoke()
            X.HmQ r4 = (X.C55729HmQ) r4
            java.lang.String r1 = r3.A2n()
            if (r1 == 0) goto L_0x0cbc
            r9.A00(r7, r4, r8, r1)
            goto L_0x0044
        L_0x0a99:
            X.0eM r1 = r10.A0Q
            r1.getValue()
            java.lang.Object r6 = r32.getTag()
            if (r6 == 0) goto L_0x0cca
            X.HQh r6 = (X.C54728HQh) r6
            X.0sa r1 = r5.A0A
            java.lang.Object r5 = r1.invoke()
            X.9IE r5 = (X.AnonymousClass9IE) r5
            X.0qQ.A0B(r3, r4)
            r1 = 2
            X.0qQ.A0B(r6, r1)
            r1 = 3
            X.0qQ.A0B(r5, r1)
            X.1Xy r1 = r3.A0C
            X.3y6 r1 = r1.B5M()
            if (r1 == 0) goto L_0x0044
            r6.A02(r1)
            r6.A01(r5, r1)
            r6.A00(r5)
            goto L_0x0044
        L_0x0acc:
            X.0eM r1 = r10.A0G
            r1.getValue()
            java.lang.Object r7 = r32.getTag()
            java.lang.String r6 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.channel.BroadcastChannelCTABarViewBinder.Holder"
            if (r7 == 0) goto L_0x0cd8
            X.IO5 r7 = (X.IO5) r7
            X.0sa r1 = r5.A05
            java.lang.Object r4 = r1.invoke()
            X.9JA r4 = (X.AnonymousClass9JA) r4
            X.4DU r1 = r0.A0B
            X.C56530I0b.A00(r4, r1, r7, r2)
            java.lang.Object r5 = r32.getTag()
            if (r5 == 0) goto L_0x0cd2
            X.IO5 r5 = (X.IO5) r5
            com.instagram.common.session.UserSession r1 = r0.A09
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.INk> r1 = X.C57070INk.class
            r4.A01(r5, r1)
            goto L_0x0044
        L_0x0afd:
            X.0eM r1 = r10.A08
            java.lang.Object r7 = r1.getValue()
            X.Vw2 r7 = (X.C18650Vw2) r7
            java.lang.Object r6 = r32.getTag()
            if (r6 == 0) goto L_0x0cde
            X.VcF r6 = (X.C17684VcF) r6
            X.0sa r1 = r5.A01
            java.lang.Object r4 = r1.invoke()
            X.JwM r4 = (X.C61084JwM) r4
            X.4DU r1 = r0.A0B
            r7.A04(r4, r1, r6)
            goto L_0x0044
        L_0x0b1c:
            X.0eM r1 = r10.A0d
            java.lang.Object r7 = r1.getValue()
            X.41M r7 = (X.AnonymousClass41M) r7
            android.content.Context r6 = r0.A06
            X.0sa r1 = r5.A0E
            java.lang.Object r4 = r1.invoke()
            X.3gj r4 = (X.C247673gj) r4
            java.lang.Object r1 = r32.getTag()
            if (r1 == 0) goto L_0x0cea
            X.3ro r1 = (X.C254023ro) r1
            r7.A06(r6, r1, r4, r2)
            goto L_0x0044
        L_0x0b3b:
            X.TsF r7 = X.C14232TsF.A00
            java.lang.Object r6 = r32.getTag()
            if (r6 == 0) goto L_0x0cf2
            X.TsI r6 = (X.C14235TsI) r6
            X.0sa r1 = r5.A0J
            java.lang.Object r4 = r1.invoke()
            X.TsG r4 = (X.C14233TsG) r4
            X.4DU r1 = r0.A0B
            com.instagram.common.session.UserSession r8 = r0.A09
            r9 = r4
            r10 = r6
            r11 = r3
            r12 = r1
            r13 = r2
            r7.A01(r8, r9, r10, r11, r12, r13)
            goto L_0x0044
        L_0x0b5b:
            X.0eM r1 = r10.A0c
            java.lang.Object r6 = r1.getValue()
            X.41P r6 = (X.AnonymousClass41P) r6
            java.lang.Object r4 = r32.getTag()
            if (r4 == 0) goto L_0x0cfa
            X.3rp r4 = (X.C254033rp) r4
            X.0sa r1 = r5.A0D
            java.lang.Object r1 = r1.invoke()
            X.9IP r1 = (X.AnonymousClass9IP) r1
            r6.A01(r1, r4)
            goto L_0x0044
        L_0x0b78:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r11)
            throw r0
        L_0x0b7e:
            java.lang.Object r0 = r32.getTag()
            if (r0 == 0) goto L_0x0b8a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0b8a:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.shopping.widget.chiclets.ChicletHscrollViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0b92:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r11)
            throw r0
        L_0x0b98:
            r0 = 3662(0xe4e, float:5.132E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0ba4:
            r0 = 3663(0xe4f, float:5.133E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0bb0:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0bb8:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.overlaycta.MediaOverlayCTAViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0bc0:
            r0 = 3082(0xc0a, float:4.319E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0bcc:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.mediadebug.BloksMediaDebugInfoViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0bd4:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.topicheader.MediaTopicHeaderViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0bdc:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.mediaheader.MediaHeaderViewHolder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0be4:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.mediaview.ui.holder.MediaViewHolder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0bec:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.mediaguide.MediaGuideViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0bf4:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.ufi.MediaUFIViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0bfc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0c02:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.carousel.media.ui.viewbinder.CarouselMediaViewHolder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c0a:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.feedaddyours.FeedAddYoursMediaCTABarViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c12:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.featuredproducts.FeaturedProductsUpsellCTAViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c1a:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.collection.holder.CollectionTopMainBottomThumbnailsViewHolder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c22:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.mediaheadline.MediaHeadlineRowViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c2a:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.comments.row.ViewAllCommentsViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c32:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.comments.row.CommentsOffManageControlsViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c3a:
            r0 = 3665(0xe51, float:5.136E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0c4c:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.simpleaction.SimpleActionViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c54:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0c62:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0c68:
            r0 = 1639(0x667, float:2.297E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c74:
            r0 = 3661(0xe4d, float:5.13E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c80:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.brandedcontent.BrandedContentTagViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c88:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c90:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.sponsoredrendering.SponsoredContentBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0c98:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.collaborative.CollaborativePostInviteLegacyBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0ca0:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0ca6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0cac:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.shopping.adapter.ifu.ShoppingIFUViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0cb4:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.shopping.adapter.incentives.IgFeedFundedIncentiveBannerSectionViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0cbc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0cc2:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.medianotice.ui.MediaNoticeViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0cca:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.contentcontrol.ContentControlHolder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0cd2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L_0x0cd8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L_0x0cde:
            r0 = 3659(0xe4b, float:5.127E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0cea:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.feedback.MediaFeedbackViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0cf2:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.mediainsights.MediaInsightsViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0cfa:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.labelbelowcomments.LabelBelowCommentsViewBinder.Holder"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0d02:
            X.0qQ.A0F(r13)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2s3.A01(android.view.View, X.3dM, X.2rv):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2s3(androidx.fragment.app.FragmentActivity r25, X.AnonymousClass07Z r26, X.C249453jo r27, X.C229382nI r28, X.AnonymousClass2oE r29, X.AnonymousClass2kR r30, X.0Pl r31, X.C249763kK r32, java.lang.String r33) {
        /*
            r24 = this;
            r21 = 0
            r1 = 1
            r3 = r25
            X.0qQ.A0B(r3, r1)
            r0 = 2
            r10 = r30
            X.0qQ.A0B(r10, r0)
            r0 = 4
            r4 = r26
            X.0qQ.A0B(r4, r0)
            r0 = 5
            r11 = r31
            X.0qQ.A0B(r11, r0)
            r0 = 7
            r6 = r28
            X.0qQ.A0B(r6, r0)
            r0 = 9
            r5 = r27
            X.0qQ.A0B(r5, r0)
            r7 = 0
            java.lang.String r18 = "explore_unconnected"
            r2 = r24
            r9 = r29
            r13 = r32
            r17 = r33
            r8 = r7
            r12 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r19 = r7
            r20 = r7
            r22 = r1
            r23 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2s3.<init>(androidx.fragment.app.FragmentActivity, X.07Z, X.3jo, X.2nI, X.2oE, X.2kR, X.0Pl, X.3kK, java.lang.String):void");
    }
}
