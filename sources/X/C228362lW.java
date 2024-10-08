package X;

/* renamed from: X.2lW  reason: invalid class name and case insensitive filesystem */
public final class C228362lW {
    public final 02m A00;

    public C228362lW(02m r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void A01(1Xj r5, Integer num, Integer num2, String str) {
        int i;
        String str2;
        String id;
        0qQ.A0B(str, 0);
        0qQ.A0B(num, 1);
        int A002 = A00(num, str);
        if (A002 != 0) {
            if (r5 == null || (id = r5.getId()) == null) {
                i = 0;
            } else {
                i = id.hashCode();
            }
            02m r1 = this.A00;
            switch (num2.intValue()) {
                case 2:
                    str2 = "prepare_video_start";
                    break;
                case 3:
                    str2 = "prepare_video_end";
                    break;
                case 4:
                    str2 = "video_started_playing";
                    break;
                case 5:
                    str2 = "tail_load_request_success";
                    break;
                case 6:
                    str2 = "tail_load_request_failed";
                    break;
                case 7:
                    str2 = "tail_load_indicator_end";
                    break;
                case 8:
                    str2 = "fetch_request_success";
                    break;
                case 9:
                    str2 = "fetch_request_failed";
                    break;
                case 10:
                    str2 = "image_load_failed";
                    break;
                case 11:
                    str2 = "fetch_begin";
                    break;
                default:
                    str2 = "fetch_finished";
                    break;
            }
            r1.markerPoint(A002, i, str2);
        }
    }

    public final void A02(1Xj r5, Integer num, String str) {
        int i;
        String id;
        0qQ.A0B(str, 0);
        0qQ.A0B(num, 1);
        int A002 = A00(num, str);
        if (A002 != 0) {
            if (r5 == null || (id = r5.getId()) == null) {
                i = 0;
            } else {
                i = id.hashCode();
            }
            02m r1 = this.A00;
            r1.markerPoint(A002, i, "load_end");
            r1.markerEnd(A002, i, 2);
        }
    }

    public final void A03(1Xj r5, Integer num, String str) {
        int i;
        String id;
        0qQ.A0B(str, 0);
        0qQ.A0B(num, 1);
        int A002 = A00(num, str);
        if (A002 != 0) {
            if (r5 == null || (id = r5.getId()) == null) {
                i = 0;
            } else {
                i = id.hashCode();
            }
            this.A00.markerEnd(A002, i, 3);
        }
    }

    public final void A04(1Xj r7, Integer num, String str) {
        int i;
        String id;
        0qQ.A0B(num, 1);
        int A002 = A00(num, str);
        if (A002 != 0) {
            boolean z = false;
            if (r7 == null || (id = r7.getId()) == null) {
                i = 0;
            } else {
                i = id.hashCode();
            }
            02m r2 = this.A00;
            r2.A0S(A002, i, 30000);
            r2.markerAnnotate(A002, i, "asl_session_id", 0LA.A01());
            r2.markerPoint(A002, i, "load_start");
            if (r7 != null) {
                if (r7.A5D() || r7.A5E()) {
                    z = true;
                }
                r2.markerAnnotate(A002, i, "is_video", r7.CeS());
                r2.markerAnnotate(A002, i, "is_carousel", z);
            }
        }
    }

    public final void A05(1Xj r5, Integer num, String str, String str2) {
        int i;
        String id;
        0qQ.A0B(str, 0);
        0qQ.A0B(num, 1);
        int A002 = A00(num, str);
        if (A002 != 0) {
            if (r5 == null || (id = r5.getId()) == null) {
                i = 0;
            } else {
                i = id.hashCode();
            }
            02m r1 = this.A00;
            r1.markerAnnotate(A002, i, "cancel_reason", str2);
            r1.markerEnd(A002, i, 4);
        }
    }

    public final void A06(1Xj r4, Integer num, String str, String str2, boolean z) {
        int i;
        String id;
        0qQ.A0B(str, 0);
        0qQ.A0B(num, 1);
        int A002 = A00(num, str);
        if (A002 != 0) {
            if (r4 == null || (id = r4.getId()) == null) {
                i = 0;
            } else {
                i = id.hashCode();
            }
            this.A00.markerAnnotate(A002, i, str2, z);
        }
    }

    public final void A07(Integer num, String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str3, 3);
        int A002 = A00(num, str);
        if (A002 != 0) {
            this.A00.markerAnnotate(A002, 0, str2, str3);
        }
    }

    public final boolean A08(1Xj r5, Integer num, String str) {
        String id;
        0qQ.A0B(num, 1);
        int A002 = A00(num, str);
        int i = 0;
        if (A002 == 0) {
            return false;
        }
        if (!(r5 == null || (id = r5.getId()) == null)) {
            i = id.hashCode();
        }
        return this.A00.isMarkerOn(A002, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        if (r6.equals(r0) == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        r0 = r5.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (r0 == 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r0 == 1) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r0 != 2) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        return 290468408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0082, code lost:
        if (r6.equals(X.AnonymousClass000.A00(r0)) == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        r0 = r5.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r0 == 0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008a, code lost:
        if (r0 != 2) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008c, code lost:
        return 177282872;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b9, code lost:
        return 290460768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bd, code lost:
        return 290459922;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c1, code lost:
        return 177280368;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(java.lang.Integer r5, java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r3 = 1
            r2 = 0
            r4 = 0
            r1 = 2
            switch(r0) {
                case -975990334: goto L_0x0090;
                case -913715469: goto L_0x0078;
                case -400141475: goto L_0x0075;
                case 67781225: goto L_0x0072;
                case 332522282: goto L_0x006f;
                case 339532540: goto L_0x0059;
                case 464395801: goto L_0x0056;
                case 877420756: goto L_0x0040;
                case 935219501: goto L_0x0027;
                case 1127778335: goto L_0x0024;
                case 1634711301: goto L_0x0012;
                case 1765812994: goto L_0x000f;
                case 1805942339: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            return r4
        L_0x000c:
            java.lang.String r0 = "feed_contextual_self_profile"
            goto L_0x005b
        L_0x000f:
            r0 = 5234(0x1472, float:7.334E-42)
            goto L_0x007a
        L_0x0012:
            java.lang.String r0 = "feed_contextual_ads_chain"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            int r0 = r5.intValue()
            if (r0 != r1) goto L_0x000b
            r4 = 386743012(0x170d3ae4, float:4.563389E-25)
            return r4
        L_0x0024:
            r0 = 5232(0x1470, float:7.332E-42)
            goto L_0x007a
        L_0x0027:
            java.lang.String r0 = "explore_popular"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            int r0 = r5.intValue()
            if (r0 == r2) goto L_0x00ad
            if (r0 == r3) goto L_0x00a9
            r4 = 997006891(0x3b6d1e2b, float:0.0036181312)
            if (r0 == r1) goto L_0x000b
            r4 = 997005525(0x3b6d18d5, float:0.003617813)
            return r4
        L_0x0040:
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            int r0 = r5.intValue()
            if (r0 == r2) goto L_0x00b5
            if (r0 == r3) goto L_0x00b1
            if (r0 != r1) goto L_0x000b
            r4 = 776677153(0x2e4b2721, float:4.619161E-11)
            return r4
        L_0x0056:
            r0 = 5236(0x1474, float:7.337E-42)
            goto L_0x007a
        L_0x0059:
            java.lang.String r0 = "feed_contextual_profile"
        L_0x005b:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            int r0 = r5.intValue()
            if (r0 == r2) goto L_0x00bd
            if (r0 == r3) goto L_0x00b9
            if (r0 != r1) goto L_0x000b
            r4 = 290468408(0x11503238, float:1.6423782E-28)
            return r4
        L_0x006f:
            r0 = 5235(0x1473, float:7.336E-42)
            goto L_0x007a
        L_0x0072:
            r0 = 5233(0x1471, float:7.333E-42)
            goto L_0x007a
        L_0x0075:
            r0 = 5231(0x146f, float:7.33E-42)
            goto L_0x007a
        L_0x0078:
            r0 = 5237(0x1475, float:7.339E-42)
        L_0x007a:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            int r0 = r5.intValue()
            if (r0 == r2) goto L_0x00c1
            if (r0 != r1) goto L_0x000b
            r4 = 177282872(0xa911f38, float:1.3974735E-32)
            return r4
        L_0x0090:
            java.lang.String r0 = "feed_timeline"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000b
            int r0 = r5.intValue()
            if (r0 == r2) goto L_0x00c9
            if (r0 == r3) goto L_0x00c5
            r4 = 77669247(0x4a1237f, float:3.7883516E-36)
            if (r0 == r1) goto L_0x000b
            r4 = 77666306(0x4a11802, float:3.7872966E-36)
            return r4
        L_0x00a9:
            r4 = 997011871(0x3b6d319f, float:0.0036192907)
            return r4
        L_0x00ad:
            r4 = 997006453(0x3b6d1c75, float:0.0036180292)
            return r4
        L_0x00b1:
            r4 = 776673996(0x2e4b1acc, float:4.6180657E-11)
            return r4
        L_0x00b5:
            r4 = 776669815(0x2e4b0a77, float:4.616615E-11)
            return r4
        L_0x00b9:
            r4 = 290460768(0x11501460, float:1.6414585E-28)
            return r4
        L_0x00bd:
            r4 = 290459922(0x11501112, float:1.6413567E-28)
            return r4
        L_0x00c1:
            r4 = 177280368(0xa911570, float:1.3971056E-32)
            return r4
        L_0x00c5:
            r4 = 77669394(0x4a12412, float:3.7884043E-36)
            return r4
        L_0x00c9:
            r4 = 77675937(0x4a13da1, float:3.7907515E-36)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228362lW.A00(java.lang.Integer, java.lang.String):int");
    }
}
