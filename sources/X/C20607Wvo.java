package X;

/* renamed from: X.Wvo  reason: case insensitive filesystem */
public final class C20607Wvo extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20607Wvo(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v131, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.1zE.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00d4, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b0 A[Catch:{ all -> 0x0010 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r58 = this;
            r1 = r58
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0112;
                case 1: goto L_0x010f;
                case 2: goto L_0x012a;
                case 3: goto L_0x012a;
                case 4: goto L_0x012a;
                case 5: goto L_0x0131;
                case 6: goto L_0x013c;
                case 7: goto L_0x0013;
                case 8: goto L_0x0150;
                case 9: goto L_0x030f;
                case 10: goto L_0x0341;
                case 11: goto L_0x0352;
                case 12: goto L_0x036d;
                case 13: goto L_0x037a;
                case 14: goto L_0x03ce;
                case 15: goto L_0x03e2;
                case 16: goto L_0x0400;
                case 17: goto L_0x040d;
                case 18: goto L_0x041e;
                case 19: goto L_0x0437;
                case 20: goto L_0x044f;
                case 21: goto L_0x0461;
                case 22: goto L_0x0479;
                case 23: goto L_0x048a;
                case 24: goto L_0x0497;
                case 25: goto L_0x04a4;
                case 26: goto L_0x04d1;
                case 27: goto L_0x04db;
                case 28: goto L_0x0513;
                case 29: goto L_0x0522;
                case 30: goto L_0x010f;
                case 31: goto L_0x012a;
                case 32: goto L_0x052d;
                case 33: goto L_0x0534;
                case 34: goto L_0x0541;
                case 35: goto L_0x0563;
                case 36: goto L_0x00d5;
                case 37: goto L_0x00e7;
                case 38: goto L_0x0586;
                case 39: goto L_0x0594;
                case 40: goto L_0x00ef;
                case 41: goto L_0x00fa;
                case 42: goto L_0x0007;
                case 43: goto L_0x0007;
                case 44: goto L_0x00fa;
                case 45: goto L_0x0007;
                case 46: goto L_0x0107;
                case 47: goto L_0x05a9;
                case 48: goto L_0x010f;
                case 49: goto L_0x012a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.6Z5 r0 = (X.AnonymousClass6Z5) r0
            X.4mU r0 = r0.A17
        L_0x000d:
            r0.EHd()
        L_0x0010:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0013:
            java.lang.Object r5 = r1.A01     // Catch:{ all -> 0x0010 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ all -> 0x0010 }
            r0 = 2278(0x8e6, float:3.192E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0010 }
            r4 = 0
            java.io.FileInputStream r3 = r5.openFileInput(r0)     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x0032 }
            byte[] r1 = X.C11108SAj.A01(r3)     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x002e
            r3.close()     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
        L_0x002e:
            r5.deleteFile(r0)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0042
        L_0x0032:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r1 = move-exception
            X.1zE.A00(r3, r2)     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
            throw r1     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
        L_0x0039:
            r1 = move-exception
            r5.deleteFile(r0)     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            throw r1     // Catch:{ all -> 0x0010 }
        L_0x003e:
            r5.deleteFile(r0)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0010
        L_0x0042:
            r4 = r1
        L_0x0043:
            if (r4 == 0) goto L_0x0010
            android.content.Intent r0 = X.SCO.A00()     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch:{ all -> 0x0010 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0010 }
            r0 = 0
            r1.init(r0, r0, r0)     // Catch:{ all -> 0x0010 }
            javax.net.ssl.SSLSocketFactory r2 = r1.getSocketFactory()     // Catch:{ all -> 0x0010 }
            r0 = 1423(0x58f, float:1.994E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0010 }
            r1 = 443(0x1bb, float:6.21E-43)
            java.net.Socket r3 = r2.createSocket(r0, r1)     // Catch:{ all -> 0x0010 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            X.0qQ.A0C(r3, r0)     // Catch:{ all -> 0x0010 }
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3     // Catch:{ all -> 0x0010 }
            java.io.OutputStream r2 = r3.getOutputStream()     // Catch:{ all -> 0x00ce }
            r2.write(r4)     // Catch:{ all -> 0x00c7 }
            r2.flush()     // Catch:{ all -> 0x00c7 }
            r2.close()     // Catch:{ all -> 0x00ce }
            r3.close()     // Catch:{ all -> 0x0010 }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ all -> 0x0010 }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0010 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x0010 }
            r4 = 1
            java.lang.String r0 = "\n"
            r1 = 0
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0010 }
            java.util.List r0 = X.00l.A0R(r2, r0, r1)     // Catch:{ all -> 0x0010 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0010 }
        L_0x0096:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0010 }
            r2 = 0
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0010 }
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0010 }
            java.lang.String r0 = "session_id:"
            boolean r0 = X.00p.A0k(r1, r0, r4)     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0096
        L_0x00ac:
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0010 }
            if (r2 == 0) goto L_0x0010
            java.lang.String r0 = ":"
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0010 }
            r0 = 2
            java.util.List r0 = X.00l.A0R(r2, r1, r0)     // Catch:{ all -> 0x0010 }
            java.lang.String r0 = X.AnonymousClass7TE.A19(r0, r4)     // Catch:{ all -> 0x0010 }
            java.lang.String r0 = X.DbV.A12(r0)     // Catch:{ all -> 0x0010 }
            X.AnonymousClass1FK.A00 = r0     // Catch:{ all -> 0x0010 }
            goto L_0x0010
        L_0x00c7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x00ce }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ all -> 0x0010 }
            throw r0     // Catch:{ all -> 0x0010 }
        L_0x00d5:
            java.lang.Object r1 = r1.A01
            X.H1U r1 = (X.H1U) r1
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r1.A02
            if (r0 == 0) goto L_0x00e0
            X.DbS.A1T(r0)
        L_0x00e0:
            androidx.recyclerview.widget.RecyclerView r0 = r1.A00
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x0010
        L_0x00e7:
            java.lang.Object r0 = r1.A01
            X.VQD r0 = (X.VQD) r0
            X.4mU r0 = r0.A00
            goto L_0x000d
        L_0x00ef:
            java.lang.Object r0 = r1.A01
            X.6Z5 r0 = (X.AnonymousClass6Z5) r0
            X.4mU r0 = r0.A17
            r0.EIJ()
            goto L_0x0010
        L_0x00fa:
            java.lang.Object r0 = r1.A01
            X.6Z5 r0 = (X.AnonymousClass6Z5) r0
            X.4mU r1 = r0.A17
            java.lang.String r0 = "tapped"
            r1.EHY(r0)
            goto L_0x0010
        L_0x0107:
            java.lang.Object r0 = r1.A01
            X.6Zc r0 = (X.C309656Zc) r0
            X.4mU r0 = r0.A0B
            goto L_0x000d
        L_0x010f:
            java.lang.Object r4 = r1.A01
            return r4
        L_0x0112:
            java.lang.Object r4 = r1.A01
            X.GAP r4 = (X.GAP) r4
            X.2rw r3 = r4.A08
            X.4DU r0 = r4.A09
            java.lang.String r2 = r0.getModuleName()
            r1 = 49
            X.IwK r0 = new X.IwK
            r0.<init>(r4, r1)
            X.2u0 r4 = r3.A00(r2, r0)
            return r4
        L_0x012a:
            java.lang.Object r0 = r1.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x0131:
            java.lang.Object r0 = r1.A01
            X.2jw r0 = (X.C227802jw) r0
            X.0eM r0 = r0.A0n
            java.lang.Object r4 = r0.getValue()
            return r4
        L_0x013c:
            java.lang.Object r0 = r1.A01
            X.HAr r0 = (X.C54376HAr) r0
            com.instagram.common.session.UserSession r3 = r0.A08
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 2342163288484421797(0x2081091a001320a5, double:4.065822678124723E-152)
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r4
        L_0x0150:
            java.lang.Object r5 = r1.A01
            X.Uau r5 = (X.C15344Uau) r5
            X.2tC r3 = X.DbV.A0S(r5)
            X.0eM r0 = r5.A0O
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r5.A0L
            java.lang.Object r2 = r0.getValue()
            X.XC8 r2 = (X.XC8) r2
            X.UAy r1 = new X.UAy
            r1.<init>()
            X.H7I r0 = new X.H7I
            r0.<init>(r5, r1, r4, r2)
            r3.A01(r0)
            X.0eM r0 = r5.A0E
            java.lang.Object r2 = r0.getValue()
            X.GTP r2 = (X.GTP) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 31
            X.2tE[] r1 = new X.C232222tE[r0]
            X.2rv r5 = X.C231592rv.AD_CTA
            java.lang.Class<X.UuV> r4 = X.C16413UuV.class
            X.H7H r31 = new X.H7H
            r0 = r31
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.CAROUSEL_CONTENT
            java.lang.Class<X.UuZ> r4 = X.C16417UuZ.class
            X.H7H r30 = new X.H7H
            r0 = r30
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.MEDIA_HEADER
            java.lang.Class<X.Uuh> r4 = X.C16425Uuh.class
            X.H7H r29 = new X.H7H
            r0 = r29
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.MEDIA_CONTENT
            java.lang.Class<X.Uud> r4 = X.C16421Uud.class
            X.H7H r28 = new X.H7H
            r0 = r28
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.MEDIA_FEEDBACK
            java.lang.Class<X.Uue> r4 = X.C16422Uue.class
            X.H7H r27 = new X.H7H
            r0 = r27
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.LITHO_SOCIAL_CONTEXT_BUBBLES
            java.lang.Class<X.Uuw> r4 = X.C16440Uuw.class
            X.H7H r26 = new X.H7H
            r0 = r26
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.MEDIA_UFI
            java.lang.Class<X.Uuu> r4 = X.C16438Uuu.class
            X.H7H r25 = new X.H7H
            r0 = r25
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.MEDIA_INSIGHTS
            java.lang.Class<X.Uun> r4 = X.C16431Uun.class
            X.H7H r24 = new X.H7H
            r0 = r24
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.TOMBSTONE_SPONSORED
            java.lang.Class<X.Uut> r4 = X.C16437Uut.class
            X.H7H r23 = new X.H7H
            r0 = r23
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.TOMBSTONE_REPORT
            java.lang.Class<X.Uus> r4 = X.C16436Uus.class
            X.H7H r22 = new X.H7H
            r0 = r22
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.COLLECTION_TOP_WITH_BOTTOM_THREE_CONTENT
            java.lang.Class<X.Uub> r4 = X.C16419Uub.class
            X.H7H r21 = new X.H7H
            r0 = r21
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.CAROUSEL_INDICATOR
            java.lang.Class<X.Uua> r4 = X.C16418Uua.class
            X.H7H r20 = new X.H7H
            r0 = r20
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.MEDIA_LABEL_BELOW_COMMENTS
            java.lang.Class<X.Uuo> r4 = X.C16432Uuo.class
            X.H7H r19 = new X.H7H
            r0 = r19
            r0.<init>(r5, r2, r4)
            X.2rv r5 = X.C231592rv.GAP
            java.lang.Class<X.Uug> r4 = X.C16424Uug.class
            X.H7H r18 = new X.H7H
            r0 = r18
            r0.<init>(r5, r2, r4)
            X.H7A r17 = new X.H7A
            r0 = r17
            r0.<init>(r2)
            X.2rv r5 = X.C231592rv.MEDIA_HEADLINE
            java.lang.Class<X.Uui> r4 = X.C16426Uui.class
            X.H7H r16 = new X.H7H
            r0 = r16
            r0.<init>(r5, r2, r4)
            X.2rv r4 = X.C231592rv.MEDIA_VIEW_ALL_COMMENTS
            java.lang.Class<X.Uuv> r0 = X.C16439Uuv.class
            X.H7H r15 = new X.H7H
            r15.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.MEDIA_AYSF
            java.lang.Class<X.UuW> r0 = X.C16414UuW.class
            X.H7H r14 = new X.H7H
            r14.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.COMMENTS_LOADING_SPINNER
            java.lang.Class<X.Uuc> r0 = X.C16420Uuc.class
            X.H7H r13 = new X.H7H
            r13.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.BRANDED_CONTENT_LABEL
            java.lang.Class<X.UuY> r0 = X.C16416UuY.class
            X.H7H r12 = new X.H7H
            r12.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.PRODUCT_HSCROLL
            java.lang.Class<X.Uur> r0 = X.C16435Uur.class
            X.H7H r11 = new X.H7H
            r11.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.MEDIA_OVERLAY_CTA
            java.lang.Class<X.Uup> r0 = X.C16433Uup.class
            X.H7H r10 = new X.H7H
            r10.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.MEDIA_BLOKS_BANNER
            java.lang.Class<X.UuX> r0 = X.C16415UuX.class
            X.H7H r9 = new X.H7H
            r9.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.MEDIA_FUNDRAISER
            java.lang.Class<X.Uuf> r0 = X.C16423Uuf.class
            X.H7H r8 = new X.H7H
            r8.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.FULL_HEIGHT_MEDIA_INLINE_SURVEY
            java.lang.Class<X.UuT> r0 = X.C16411UuT.class
            X.H7H r7 = new X.H7H
            r7.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.MEDIA_INLINE_SURVEY_SIMPLE_ACTION
            java.lang.Class<X.Uul> r0 = X.C16429Uul.class
            X.H7H r6 = new X.H7H
            r6.<init>(r4, r2, r0)
            X.2rv r5 = X.C231592rv.MEDIA_INLINE_SURVEY_QUESTION_TITLE
            java.lang.Class<X.Uuk> r4 = X.C16428Uuk.class
            X.H7H r0 = new X.H7H
            r0.<init>(r5, r2, r4)
            r42 = r20
            r43 = r19
            r44 = r18
            r45 = r17
            r46 = r16
            r47 = r15
            r48 = r14
            r49 = r13
            r50 = r12
            r51 = r11
            r52 = r10
            r53 = r9
            r54 = r8
            r55 = r7
            r56 = r6
            r57 = r0
            r32 = r30
            r33 = r29
            r34 = r28
            r35 = r27
            r36 = r26
            r37 = r25
            r38 = r24
            r39 = r23
            r40 = r22
            r41 = r21
            X.2tE[] r0 = new X.C232222tE[]{r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57}
            boolean r8 = X.AnonymousClass7TF.A1X(r0, r1)
            X.2rv r4 = X.C231592rv.MEDIA_INLINE_SURVEY_QUESTION_ANSWERS
            java.lang.Class<X.Uuj> r0 = X.C16427Uuj.class
            X.H7H r9 = new X.H7H
            r9.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.MEDIA_INLINE_SURVEY_TOMBSTONE
            java.lang.Class<X.Uum> r0 = X.C16430Uum.class
            X.H7H r7 = new X.H7H
            r7.<init>(r4, r2, r0)
            X.2rv r4 = X.C231592rv.ACCESSIBLE_ACTIONS
            java.lang.Class<X.UuU> r0 = X.C16412UuU.class
            X.H7H r6 = new X.H7H
            r6.<init>(r4, r2, r0)
            X.2rv r5 = X.C231592rv.PRODUCT_CHICLETS
            java.lang.Class<X.Uuq> r4 = X.C16434Uuq.class
            X.H7H r0 = new X.H7H
            r0.<init>(r5, r2, r4)
            X.2tE[] r4 = new X.C232222tE[]{r9, r7, r6, r0}
            r2 = 27
            r0 = 4
            java.lang.System.arraycopy(r4, r8, r1, r2, r0)
            java.util.List r1 = X.0sr.A1P(r1)
            java.util.List r0 = r3.A0C
            r0.addAll(r1)
            X.KF6 r0 = new X.KF6
            r0.<init>()
            X.2t9 r4 = X.DbU.A0U(r3, r0)
            return r4
        L_0x030f:
            X.3kF r2 = X.C249713kF.A00
            java.lang.Object r1 = r1.A01
            X.Uau r1 = (X.C15344Uau) r1
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0eM r0 = r1.A0O
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A0P
            java.lang.String r7 = X.DbS.A0t(r0)
            java.lang.String r8 = r1.getModuleName()
            X.0eM r0 = r1.A05
            java.lang.Object r6 = r0.getValue()
            X.VhM r6 = (X.C17869VhM) r6
            r0 = 1589(0x635, float:2.227E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            r5 = 0
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            X.6xe r4 = r2.A0Q(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r4
        L_0x0341:
            java.lang.Object r0 = r1.A01
            X.Uau r0 = (X.C15344Uau) r0
            X.0eM r0 = r0.A0O
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.Uxa r0 = X.C16580Uxa.ShoppingMediaFeedListViewerFragment
            X.VhM r4 = X.C18265Vof.A00(r1, r0)
            return r4
        L_0x0352:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "media_feed_entry_point"
            java.io.Serializable r4 = r1.getSerializable(r0)
            boolean r0 = r4 instanceof X.C16509Uw6
            if (r0 == 0) goto L_0x0365
            if (r4 == 0) goto L_0x0365
            return r4
        L_0x0365:
            java.lang.String r1 = "Invalid Entry Point for Shopping Media Feed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x036d:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "permission_id"
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x037a:
            java.lang.Object r5 = r1.A01
            X.Uau r5 = (X.C15344Uau) r5
            X.0hq r3 = r5.getChildFragmentManager()
            X.0eM r2 = r5.A0D
            java.lang.Object r1 = r2.getValue()
            X.2rQ r1 = (X.C231322rQ) r1
            X.0eM r0 = r5.A09
            java.lang.Object r0 = r0.getValue()
            X.2kR r0 = (X.AnonymousClass2kR) r0
            X.32x r4 = new X.32x
            r4.<init>(r5, r3, r1, r0)
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.0eM r0 = r5.A0N
            java.lang.Object r3 = r0.getValue()
            X.2js r3 = (X.C227762js) r3
            java.lang.Object r2 = r2.getValue()
            X.2rR r2 = (X.C231332rR) r2
            X.2ku r1 = r5.A02
            X.2xD r0 = new X.2xD
            r0.<init>(r5, r3, r1, r2)
            r4.A0C = r0
            X.0eM r0 = r5.A0P
            java.lang.String r0 = X.DbS.A0t(r0)
            r4.A0W = r0
            X.0eM r0 = r5.A0A
            java.lang.Object r0 = r0.getValue()
            X.2xS r0 = (X.AnonymousClass2xS) r0
            r4.A0G = r0
            X.WWH r0 = new X.WWH
            r0.<init>(r5)
            r4.A09 = r0
            X.332 r4 = r4.A00()
            return r4
        L_0x03ce:
            java.lang.Object r2 = r1.A01
            X.Uau r2 = (X.C15344Uau) r2
            X.0eM r0 = r2.A0O
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r2.requireContext()
            X.2kR r4 = new X.2kR
            r4.<init>(r0, r1, r2)
            return r4
        L_0x03e2:
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            java.lang.Object r3 = r1.A01
            X.Uau r3 = (X.C15344Uau) r3
            android.content.Context r2 = r3.requireContext()
            X.0eM r0 = r3.A0O
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A0D
            java.lang.Object r0 = r0.getValue()
            X.2rR r0 = (X.C231332rR) r0
            X.2xS r4 = new X.2xS
            r4.<init>(r2, r1, r3, r0)
            return r4
        L_0x0400:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "shops_first_entry_point"
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x040d:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 3349(0xd15, float:4.693E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x041e:
            java.lang.Object r0 = r1.A01
            X.Uau r0 = (X.C15344Uau) r0
            X.2t9 r1 = X.C15344Uau.A00(r0)
            X.0eM r0 = r0.A0E
            java.lang.Object r0 = r0.getValue()
            X.GTP r0 = (X.GTP) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            X.WWt r4 = new X.WWt
            r4.<init>(r1, r0)
            return r4
        L_0x0437:
            java.lang.Object r6 = r1.A01
            X.Uau r6 = (X.C15344Uau) r6
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            X.0eM r0 = r6.A09
            java.lang.Object r7 = r0.getValue()
            X.2kR r7 = (X.AnonymousClass2kR) r7
            r8 = 0
            X.GTP r4 = new X.GTP
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x044f:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            java.lang.String r1 = "media_carousel_index"
            r0 = -1
            int r0 = r2.getInt(r1, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0461:
            java.lang.Object r1 = r1.A01
            X.Uau r1 = (X.C15344Uau) r1
            X.0eM r0 = r1.A0O
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2wt r4 = new X.2wt
            r4.<init>(r1, r0, r1)
            X.0eM r0 = r1.A0P
            java.lang.String r0 = X.DbS.A0t(r0)
            r4.A05 = r0
            return r4
        L_0x0479:
            java.lang.Object r2 = r1.A01
            X.Uau r2 = (X.C15344Uau) r2
            X.0eM r0 = r2.A0O
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 11
            X.36D r4 = X.WWR.A00(r1, r2, r0)
            return r4
        L_0x048a:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "prior_module_name"
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x0497:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "prior_submodule_name"
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x04a4:
            java.lang.Object r2 = r1.A01
            X.Uau r2 = (X.C15344Uau) r2
            X.0eM r0 = r2.A0O
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A0P
            java.lang.String r6 = X.DbS.A0t(r0)
            X.0eM r0 = r2.A0I
            java.lang.String r7 = X.DbS.A0t(r0)
            X.0eM r0 = r2.A0J
            java.lang.String r8 = X.DbS.A0t(r0)
            X.UzB r5 = X.C16675UzB.SHOPPABLE_MEDIA_VIEWER
            X.VvJ r1 = new X.VvJ
            r4 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.2el r0 = r2.A01
            r1.A00 = r0
            X.VwI r4 = r1.A02()
            return r4
        L_0x04d1:
            java.lang.Object r0 = r1.A01
            X.Uau r0 = (X.C15344Uau) r0
            X.Wd5 r4 = new X.Wd5
            r4.<init>(r0)
            return r4
        L_0x04db:
            java.lang.Object r7 = r1.A01
            X.Uau r7 = (X.C15344Uau) r7
            X.2el r6 = r7.A01
            X.0eM r0 = r7.A0O
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r7.A0P
            java.lang.String r8 = X.DbS.A0t(r0)
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x0511
            java.lang.String r0 = "shop_owner_id"
            java.lang.String r10 = r1.getString(r0)
        L_0x04f7:
            X.0eM r0 = r7.A0I
            java.lang.String r11 = X.DbS.A0t(r0)
            if (r11 != 0) goto L_0x0501
            java.lang.String r11 = ""
        L_0x0501:
            X.0eM r0 = r7.A0J
            java.lang.String r12 = X.DbS.A0t(r0)
            r9 = 0
            r15 = -1
            X.2qn r4 = new X.2qn
            r13 = r9
            r14 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r4
        L_0x0511:
            r10 = 0
            goto L_0x04f7
        L_0x0513:
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            java.lang.Object r0 = r1.A01
            android.content.Context r2 = X.DbT.A08(r0)
            r1 = 0
            r0 = 0
            X.2js r4 = X.C227752jr.A00(r2, r1, r0)
            return r4
        L_0x0522:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            java.lang.String r4 = X.C228022kf.A00(r0)
            return r4
        L_0x052d:
            java.lang.Object r0 = r1.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x0534:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "media_feed_title"
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x0541:
            java.lang.Object r1 = r1.A01
            X.Uau r1 = (X.C15344Uau) r1
            X.0eM r0 = r1.A0O
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A06
            java.lang.Object r2 = r0.getValue()
            X.Uw6 r2 = (X.C16509Uw6) r2
            android.os.Bundle r1 = r1.requireArguments()
            java.lang.String r0 = "media_feed_extras"
            android.os.Bundle r0 = r1.getBundle(r0)
            X.UhJ r4 = new X.UhJ
            r4.<init>(r0, r3, r2)
            return r4
        L_0x0563:
            java.lang.Object r1 = r1.A01
            X.Uau r1 = (X.C15344Uau) r1
            X.0eM r0 = r1.A0O
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r6 = r1.requireActivity()
            java.lang.String r9 = r1.getModuleName()
            android.content.Context r5 = r1.requireContext()
            X.0eM r0 = r1.A0P
            java.lang.String r10 = X.DbS.A0t(r0)
            r8 = 0
            X.Vi2 r4 = new X.Vi2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x0586:
            java.lang.Object r0 = r1.A01
            X.FnN r0 = (X.C51031FnN) r0
            androidx.fragment.app.Fragment r1 = r0.A02
            com.instagram.common.session.UserSession r0 = r0.A04
            X.F3J r4 = new X.F3J
            r4.<init>(r1, r0)
            return r4
        L_0x0594:
            java.lang.Object r2 = r1.A01
            instagram.features.stories.fragment.ReelResharesViewerFragment r2 = (instagram.features.stories.fragment.ReelResharesViewerFragment) r2
            X.0eM r0 = r2.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.328 r0 = new X.328
            r0.<init>(r2)
            X.32A r4 = new X.32A
            r4.<init>(r2, r1, r0)
            return r4
        L_0x05a9:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6fs r4 = new X.6fs
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20607Wvo.invoke():java.lang.Object");
    }
}
