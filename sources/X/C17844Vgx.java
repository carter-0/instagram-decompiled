package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vgx  reason: case insensitive filesystem */
public final class C17844Vgx {
    public static volatile C17844Vgx A03;
    public final VS0 A00;
    public final C18442Vrl A01;
    public final C17516VYu A02;

    public C17844Vgx(UserSession userSession) {
        VS0 vs0 = new VS0(userSession);
        this.A00 = vs0;
        C17516VYu vYu = new C17516VYu(vs0);
        this.A02 = vYu;
        this.A01 = new C18442Vrl(vs0, vYu);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062 A[Catch:{ NullPointerException | SecurityException -> 0x025c }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a A[Catch:{ NullPointerException | SecurityException -> 0x025c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071 A[Catch:{ NullPointerException | SecurityException -> 0x025c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.common.typedurl.ImageUrl A00(com.instagram.common.typedurl.ImageUrl r20, int r21, int r22) {
        /*
            r19 = this;
            java.lang.String r0 = r20.getUrl()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r12 = 0
            android.net.Uri r1 = X.DbT.A09(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.2iB r0 = new X.2iB     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r0.<init>(r1, r12)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r1 = r19
            X.Vrl r11 = r1.A01     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.VkD r6 = new X.VkD     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r2 = r21
            r1 = r22
            r6.<init>(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.1U5 r5 = X.AnonymousClass1U5.A01     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r2 = 0
            X.0qQ.A0B(r0, r2)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            android.net.Uri r10 = r0.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.VS0 r4 = r11.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            com.instagram.common.session.UserSession r9 = r4.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.0Tu r8 = X.0Tu.A05     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r0 = 36328671635717644(0x8110bc00023e0c, double:3.0377364540224033E-306)
            boolean r0 = X.182.A06(r8, r9, r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 != 0) goto L_0x0050
            java.lang.String r1 = "SmartFetchUriModifier"
            java.lang.String r0 = "Disabled:"
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.UJ1 r2 = new X.UJ1     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r2.<init>(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x0041:
            boolean r0 = r2 instanceof X.UJ2     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0245
            r1 = r2
            boolean r0 = r2 instanceof X.UJ3     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0219
            X.UJ3 r1 = (X.UJ3) r1     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r0 = r1.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x022c
        L_0x0050:
            boolean r0 = r10.isHierarchical()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "Not a hierarchical URI"
        L_0x0058:
            X.UJ3 r2 = new X.UJ3     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r2.<init>(r0, r12)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x005d:
            r1 = r2
            boolean r0 = r2 instanceof X.UJ3     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0071
            X.UJ3 r1 = (X.UJ3) r1     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r12 = r1.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x0066:
            boolean r0 = r2 instanceof X.UJ2     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0041
            X.VYu r0 = r11.A01     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.util.Set r1 = r0.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            monitor-enter(r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x0209
        L_0x0071:
            boolean r0 = r2 instanceof X.UJ0     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x007a
            X.UJ0 r1 = (X.UJ0) r1     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r12 = r1.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x0066
        L_0x007a:
            boolean r0 = r2 instanceof X.C14999UIz     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0066
            X.UIz r1 = (X.C14999UIz) r1     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r12 = r1.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x0066
        L_0x0083:
            int r3 = r6.A01     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r0 = 10
            if (r3 < r0) goto L_0x0205
            int r6 = r6.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r6 < r0) goto L_0x0205
            boolean r0 = r5.equals(r5)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 != 0) goto L_0x00b0
            X.1U5 r0 = X.AnonymousClass1U5.A0A     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            boolean r0 = r5.equals(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 != 0) goto L_0x00b0
            X.1U5 r0 = X.AnonymousClass1U5.A04     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            boolean r0 = r5.equals(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0201
            java.lang.Integer r15 = X.AnonymousClass05K.A01     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x00a5:
            java.lang.String r0 = "cstp"
            java.lang.String r5 = r10.getQueryParameter(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r5 != 0) goto L_0x00b3
            java.lang.String r0 = "No cstp found"
            goto L_0x0058
        L_0x00b0:
            java.lang.Integer r15 = X.AnonymousClass05K.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x00a5
        L_0x00b3:
            java.lang.String r14 = "ctp"
            java.lang.String r0 = r10.getQueryParameter(r14)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "No ctp found"
            goto L_0x0058
        L_0x00be:
            X.11S r0 = X.C17156VKi.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r1 = 1
            X.0qQ.A0B(r0, r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.5gs r0 = r0.A05(r5)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r7 = 0
            if (r0 == 0) goto L_0x01fd
            X.5gt r5 = r0.A02     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r5 == 0) goto L_0x01fd
            X.5gu r0 = r5.A09(r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = r0.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r0 = X.Pxf.A0Z(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x00db:
            int r1 = X.JTP.A09(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r0 = 2
            X.5gu r0 = r5.A09(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = r0.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r7 = X.Pxf.A0Z(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x00ec:
            int r0 = X.JTP.A09(r7)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.VkD r13 = new X.VkD     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r13.<init>(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.util.List r0 = r4.A01     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r16 = r0
            boolean r0 = r16.isEmpty()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = "Allowlist empty"
            goto L_0x0058
        L_0x0103:
            r0 = r12
            goto L_0x00db
        L_0x0105:
            int r4 = r13.A01     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            float r1 = (float) r4     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            float r0 = (float) r3     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            float r7 = r1 / r0
            int r3 = r13.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            float r5 = (float) r3     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            float r0 = (float) r6     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            float r6 = r5 / r0
            int r0 = r15.intValue()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == r2) goto L_0x01be
            float r2 = java.lang.Math.max(r7, r6)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x011b:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r0
            int r1 = X.JTO.A05(r1, r2)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            int r0 = X.JTO.A05(r5, r2)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            int r15 = java.lang.Math.max(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            int r7 = java.lang.Math.max(r4, r3)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.util.Iterator r18 = r16.iterator()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x0132:
            boolean r0 = r18.hasNext()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r6 = r18.next()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            int r0 = X.AnonymousClass7TE.A0M(r6)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            double r4 = (double) r0     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            double r2 = (double) r15     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = 37173096565768784(0x8410bc00010250, double:3.571754180013016E-306)
            double r0 = X.182.A00(r8, r9, r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            double r16 = r16 - r0
            double r2 = r2 * r16
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0132
        L_0x0155:
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r6 == 0) goto L_0x01b4
            int r1 = r6.intValue()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r1 > r7) goto L_0x01b4
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.UuO r2 = new X.UuO     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r2.<init>(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x0166:
            android.net.Uri$Builder r0 = r10.buildUpon()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            android.net.Uri$Builder r4 = r0.clearQuery()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.util.Set r0 = r10.getQueryParameterNames()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.0qQ.A07(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x0179:
            boolean r0 = r5.hasNext()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x01c4
            java.lang.String r3 = X.AnonymousClass7TE.A18(r5)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            boolean r0 = X.0qQ.A0K(r3, r14)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x019b
            r1 = r2
            boolean r0 = r2 instanceof X.C16406UuO     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0196
            X.UuO r1 = (X.C16406UuO) r1     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.String r0 = r1.A01     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x0192:
            r4.appendQueryParameter(r14, r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x0179
        L_0x0196:
            X.UuN r1 = (X.C16405UuN) r1     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.String r0 = r1.A01     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x0192
        L_0x019b:
            java.util.List r0 = r10.getQueryParameters(r3)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.0qQ.A07(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x01a6:
            boolean r0 = r1.hasNext()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0179
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r4.appendQueryParameter(r3, r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x01a6
        L_0x01b4:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.UuN r2 = new X.UuN     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r2.<init>(r13, r0, r6)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x0166
        L_0x01bc:
            r6 = 0
            goto L_0x0155
        L_0x01be:
            float r2 = java.lang.Math.min(r7, r6)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x011b
        L_0x01c4:
            android.net.Uri r1 = r4.build()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            boolean r0 = r2 instanceof X.C16405UuN     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x01e7
            X.0qQ.A0A(r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            boolean r0 = r2 instanceof X.C16406UuO     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x01e2
            X.UuO r2 = (X.C16406UuO) r2     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            int r0 = r2.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x01db:
            X.UJ0 r2 = new X.UJ0     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r2.<init>(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x005d
        L_0x01e2:
            X.UuN r2 = (X.C16405UuN) r2     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r0 = r2.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x01db
        L_0x01e7:
            boolean r0 = r2 instanceof X.C16406UuO     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0253
            X.0qQ.A0A(r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.UuO r2 = (X.C16406UuO) r2     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            int r0 = r2.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.UIz r2 = new X.UIz     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r2.<init>(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x005d
        L_0x01fd:
            java.lang.String r0 = "No max dimens found"
            goto L_0x0058
        L_0x0201:
            java.lang.String r0 = "Scale type is not supported"
            goto L_0x0058
        L_0x0205:
            java.lang.String r0 = "Viewport too small"
            goto L_0x0058
        L_0x0209:
            boolean r0 = r1.contains(r10)     // Catch:{ all -> 0x0259 }
            monitor-exit(r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "URI blocklisted"
            X.UJ3 r2 = new X.UJ3     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r2.<init>(r0, r12)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x0041
        L_0x0219:
            boolean r0 = r2 instanceof X.UJ0     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x0222
            X.UJ0 r1 = (X.UJ0) r1     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r0 = r1.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x022c
        L_0x0222:
            boolean r0 = r2 instanceof X.C14999UIz     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 == 0) goto L_0x022b
            X.UIz r1 = (X.C14999UIz) r1     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            java.lang.Integer r0 = r1.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x022c
        L_0x022b:
            r0 = 0
        L_0x022c:
            if (r0 == 0) goto L_0x023b
            int r1 = r0.intValue()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            X.UJ2 r2 = (X.UJ2) r2     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            android.net.Uri r0 = r2.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r0, r1, r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            return r0
        L_0x023b:
            X.UJ2 r2 = (X.UJ2) r2     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            android.net.Uri r1 = r2.A00     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r1, r0, r0)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            return r0
        L_0x0245:
            boolean r0 = r2 instanceof X.UJ1     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 != 0) goto L_0x025c
            boolean r0 = r2 instanceof X.UJ3     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            if (r0 != 0) goto L_0x025c
            X.Wub r0 = new X.Wub     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r0.<init>()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x025b
        L_0x0253:
            X.Wub r0 = new X.Wub     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            r0.<init>()     // Catch:{ NullPointerException | SecurityException -> 0x025c }
            goto L_0x025b
        L_0x0259:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x025b:
            throw r0     // Catch:{ NullPointerException | SecurityException -> 0x025c }
        L_0x025c:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17844Vgx.A00(com.instagram.common.typedurl.ImageUrl, int, int):com.instagram.common.typedurl.ImageUrl");
    }
}
