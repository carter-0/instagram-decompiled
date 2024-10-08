package X;

/* renamed from: X.3iS  reason: invalid class name and case insensitive filesystem */
public final class C248703iS extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248703iS(2Lk r7) {
        super("checkLocalRbsMediaInfo", 508125143, 5, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: type inference failed for: r0v52, types: [java.lang.Object, X.0bY] */
    /* JADX WARNING: type inference failed for: r0v64, types: [java.lang.Object, X.0bY] */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:8|9|10|11|12|14|15|16|17|20|(4:22|(5:24|(2:25|(3:27|(2:29|(7:33|(1:35)|36|(4:39|(2:41|142)(2:43|143)|42|37)|141|44|(6:134|50|(3:52|(4:55|(2:57|147)(1:146)|144|53)|145)(1:58)|59|(3:61|(4:64|(2:66|151)(1:150)|148|62)|149)|(3:71|(1:73)|152)(0))))(1:135)|132)(1:133))|75|(1:77)(9:93|(6:96|(3:98|(1:100)(1:109)|101)(2:110|(1:112)(1:113))|102|(2:108|164)|159|94)|160|114|(4:117|(2:119|168)(1:167)|165|115)|166|120|(1:126)(1:124)|125)|78)(1:74)|79|(5:81|(3:83|(2:91|154)|92)|153|127|(1:176)(2:131|169))(1:174))(1:173)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0094 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r23 = this;
            r0 = r23
            X.2Lk r1 = r0.A00
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08
            android.content.Context r3 = r1.A01
            com.instagram.common.session.UserSession r2 = r1.A04
            r9 = 0
            X.0qQ.A0B(r3, r9)
            r8 = 1
            X.0qQ.A0B(r2, r8)
            r0 = 5
            X.Ins r1 = new X.Ins
            r1.<init>(r0, r3, r2)
            java.lang.Class<X.9EH> r0 = X.AnonymousClass9EH.class
            java.lang.Object r3 = r2.A01(r0, r1)
            X.9EH r3 = (X.AnonymousClass9EH) r3
            long r1 = java.lang.System.currentTimeMillis()
            android.content.Context r11 = r3.A00
            boolean r0 = X.C2604245p.A03(r11)
            if (r0 == 0) goto L_0x038e
            com.instagram.common.session.UserSession r5 = r3.A01
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r6 = r0.A01
            r0 = 3833(0xef9, float:5.371E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            r3 = 0
            long r6 = r6.getLong(r10, r3)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r0 = r0.A01
            long r6 = r0.getLong(r10, r3)
            X.0Tu r0 = X.0Tu.A06
            r3 = 36601423533838517(0x8208cd000210b5, double:3.2102258526777825E-306)
            long r3 = X.182.A01(r0, r5, r3)
            long r6 = r6 + r3
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x038e
        L_0x005e:
            X.0Tu r4 = X.0Tu.A05
            r6 = 36319948557000533(0x8108cd00001f55, double:3.032219943916684E-306)
            boolean r0 = X.182.A06(r4, r5, r6)
            if (r0 == 0) goto L_0x038e
            X.0qQ.A0B(r11, r9)     // Catch:{ IllegalArgumentException -> 0x0099 }
            X.0sn r6 = X.0sn.A00     // Catch:{ IllegalArgumentException -> 0x0099 }
            r12 = r6
            android.content.ContentResolver r3 = r11.getContentResolver()     // Catch:{ SecurityException -> 0x0082 }
            X.0qQ.A07(r3)     // Catch:{ SecurityException -> 0x0082 }
            r0 = 2372(0x944, float:3.324E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x0082 }
            java.util.ArrayList r12 = X.C358038aG.A02(r3, r0, r8)     // Catch:{ SecurityException -> 0x0082 }
        L_0x0082:
            r7 = r6
            android.content.ContentResolver r3 = r11.getContentResolver()     // Catch:{ SecurityException -> 0x0094 }
            X.0qQ.A07(r3)     // Catch:{ SecurityException -> 0x0094 }
            r0 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x0094 }
            java.util.ArrayList r7 = X.C358038aG.A02(r3, r0, r8)     // Catch:{ SecurityException -> 0x0094 }
        L_0x0094:
            java.util.ArrayList r3 = X.00k.A0S(r7, r12)     // Catch:{ IllegalArgumentException -> 0x0099 }
            goto L_0x00ae
        L_0x0099:
            r7 = move-exception
            X.0wj r6 = X.0wj.A01
            r3 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "Rbs Media Failure"
            X.0f9 r0 = r6.AEf(r0, r3)
            r0.ERJ(r7)
            r0.report()
            X.0sn r3 = X.0sn.A00
            r6 = r3
        L_0x00ae:
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r0 = r0.A01
            X.0xY r0 = r0.AR4()
            r0.E5c(r10, r1)
            r0.apply()
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x038e
            X.0wc r7 = X.AnonymousClass0kN.A02(r5)
            java.lang.String r0 = "rayban_stories_automontage_eligibility"
            X.0kJ r2 = r7.A00
            X.0Aj r11 = r7.A00(r2, r0)
            r0 = 36319948557066070(0x8108cd00011f56, double:3.0322199439581295E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            r10 = 0
            if (r0 == 0) goto L_0x0241
            X.0qQ.A0B(r5, r8)
            X.0wc r12 = X.AnonymousClass0kN.A02(r5)
            java.lang.String r0 = "ig_wearable_automontage_am_found"
            X.0kJ r1 = r12.A00
            X.0Aj r22 = r12.A00(r1, r0)
            java.lang.String r0 = "ig_wearable_automontage_am_not_found"
            X.0Aj r21 = r12.A00(r1, r0)
            java.lang.String r0 = "ig_wearable_automontage_clips_found"
            X.0Aj r20 = r12.A00(r1, r0)
            java.lang.String r0 = "ig_wearable_automontage_clips_not_found"
            X.0Aj r19 = r12.A00(r1, r0)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Iterator r18 = r3.iterator()
        L_0x0108:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0246
            java.lang.Object r1 = r18.next()
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
            boolean r0 = r1.CeS()
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = r1.A0X
            X.0qQ.A0B(r1, r9)
            X.0TC r0 = new X.0TC
            r0.<init>()
            android.net.Uri r0 = X.0cp.A00(r0, r1)
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = X.C59782JYb.A00(r0)
            if (r1 == 0) goto L_0x0108
            java.lang.String r0 = "&"
            r14 = 0
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r15 = X.00l.A0R(r1, r0, r9)
            r0 = 10
            int r0 = X.0Yv.A1E(r15, r0)
            int r13 = X.0se.A0L(r0)
            r0 = 16
            if (r13 >= r0) goto L_0x014b
            r13 = 16
        L_0x014b:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r13)
            java.util.Iterator r17 = r15.iterator()
        L_0x0154:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0190
            java.lang.Object r13 = r17.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r16 = "="
            java.lang.String[] r0 = new java.lang.String[]{r16}
            java.util.List r0 = X.00l.A0R(r13, r0, r9)
            int r15 = r0.size()
            r0 = 2
            if (r15 != r0) goto L_0x0185
            java.lang.String[] r0 = new java.lang.String[]{r16}
            java.util.List r0 = X.00l.A0R(r13, r0, r9)
        L_0x0179:
            java.lang.Object r13 = r0.get(r9)
            java.lang.Object r0 = r0.get(r8)
            r1.put(r13, r0)
            goto L_0x0154
        L_0x0185:
            java.lang.String r0 = ""
            java.lang.String[] r0 = new java.lang.String[]{r0, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            goto L_0x0179
        L_0x0190:
            java.lang.String r13 = "media_type"
            boolean r0 = r1.containsKey(r13)
            if (r0 == 0) goto L_0x0108
            java.lang.Object r13 = r1.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r0 = "AUTO_MONTAGE"
            if (r13 == 0) goto L_0x0108
            boolean r0 = r13.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = "montage_source_media_ids"
            java.lang.Object r8 = r1.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r17 = ","
            r13 = 0
            if (r8 == 0) goto L_0x01df
            java.lang.String[] r0 = new java.lang.String[]{r17}
            java.util.List r0 = X.00l.A0R(r8, r0, r9)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r16 = r0.iterator()
        L_0x01c6:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r8 = r16.next()
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.00l.A0W(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01c6
            r15.add(r8)
            goto L_0x01c6
        L_0x01df:
            r15 = r13
        L_0x01e0:
            java.lang.String r0 = "highlight_start_ms"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0214
            java.lang.String[] r0 = new java.lang.String[]{r17}
            java.util.List r0 = X.00l.A0R(r1, r0, r9)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r8 = r0.iterator()
        L_0x01fb:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0214
            java.lang.Object r1 = r8.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.00l.A0W(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01fb
            r13.add(r1)
            goto L_0x01fb
        L_0x0214:
            if (r15 == 0) goto L_0x0246
            if (r13 == 0) goto L_0x0246
            int r1 = r15.size()
            int r0 = r13.size()
            if (r1 != r0) goto L_0x0246
            int r8 = r15.size()
        L_0x0226:
            if (r14 >= r8) goto L_0x0246
            java.lang.Object r1 = r15.get(r14)
            java.lang.Object r0 = r13.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            float r0 = java.lang.Float.parseFloat(r0)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.put(r1, r0)
            int r14 = r14 + 1
            goto L_0x0226
        L_0x0241:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            goto L_0x026b
        L_0x0246:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x02bc
            r21.Cgf()
            java.util.Collection r0 = r12.values()
            X.0qQ.A07(r0)
            java.util.List r0 = X.00k.A0a(r0)
            X.XaA r1 = new X.XaA
            r1.<init>(r6, r0)
        L_0x025f:
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x026b:
            java.lang.String r0 = "has_eligible_auto_montage"
            r11.A7p(r0, r1)
            r11.Cgf()
            r0 = 36326678770759586(0x810eec000037a2, double:3.0364761581983044E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x038e
            java.lang.String r0 = "ig_smart_glasses_detected"
            X.0Aj r6 = r7.A00(r2, r0)
            r1 = 10
            int r0 = r3.size()
            int r7 = java.lang.Math.min(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0293:
            if (r10 >= r7) goto L_0x0378
            java.lang.Object r0 = X.00k.A0O(r3, r10)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            if (r0 == 0) goto L_0x02b9
            java.lang.String r2 = r0.A0X
            boolean r1 = r0.A05()
            r0 = 0
            X.Kp0 r0 = X.C59737JVv.A00(r0, r5, r2, r1)
            if (r0 == 0) goto L_0x02b9
            java.lang.String r1 = r0.A02()
            if (r1 == 0) goto L_0x02b9
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x02b9
            r4.add(r1)
        L_0x02b9:
            int r10 = r10 + 1
            goto L_0x0293
        L_0x02bc:
            r22.Cgf()
            java.util.Set r13 = r12.keySet()
            X.0qQ.A07(r13)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r15 = r3.iterator()
        L_0x02cf:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0326
            java.lang.Object r8 = r15.next()
            com.instagram.common.gallery.Medium r8 = (com.instagram.common.gallery.Medium) r8
            boolean r0 = r8.CeS()
            if (r0 == 0) goto L_0x0313
            java.lang.String r14 = r8.A0X
            X.0qQ.A0B(r14, r9)
            X.0TC r0 = new X.0TC
            r0.<init>()
            android.net.Uri r0 = X.0cp.A00(r0, r14)
            if (r0 == 0) goto L_0x0311
            java.lang.String r0 = X.C59782JYb.A00(r0)
        L_0x02f5:
            java.lang.String r0 = X.C59737JVv.A04(r0)
        L_0x02f9:
            boolean r14 = X.00l.A0W(r0)
            r14 = r14 ^ 1
            if (r14 == 0) goto L_0x02cf
            boolean r14 = r13.contains(r0)
            if (r14 == 0) goto L_0x02cf
            boolean r14 = r1.containsKey(r0)
            if (r14 != 0) goto L_0x02cf
            r1.put(r0, r8)
            goto L_0x02cf
        L_0x0311:
            r0 = 0
            goto L_0x02f5
        L_0x0313:
            boolean r0 = r8.A05()
            if (r0 == 0) goto L_0x0323
            java.lang.String r0 = r8.A0X
            X.0qQ.A0B(r0, r9)
            java.lang.String r0 = X.C364678lo.A05(r0)
            goto L_0x02f9
        L_0x0323:
            java.lang.String r0 = ""
            goto L_0x02f9
        L_0x0326:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r13.iterator()
        L_0x032f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0346
            java.lang.Object r0 = r9.next()
            X.0qQ.A07(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x032f
            r8.add(r0)
            goto L_0x032f
        L_0x0346:
            int r1 = r13.size()
            int r0 = r8.size()
            if (r1 != r0) goto L_0x0373
            int r1 = r8.size()
            java.util.Collection r0 = r12.values()
            int r0 = r0.size()
            if (r1 != r0) goto L_0x0373
            r20.Cgf()
        L_0x0361:
            java.util.Collection r0 = r12.values()
            X.0qQ.A07(r0)
            java.util.List r0 = X.00k.A0a(r0)
            X.XaA r1 = new X.XaA
            r1.<init>(r8, r0)
            goto L_0x025f
        L_0x0373:
            r19.Cgf()
            r8 = r6
            goto L_0x0361
        L_0x0378:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x038e
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x038e
            java.lang.String r0 = "smart_glasses_models"
            r6.AAe(r0, r4)
            r6.Cgf()
        L_0x038e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C248703iS.loggedRun():void");
    }
}
