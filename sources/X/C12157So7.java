package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.So7  reason: case insensitive filesystem */
public final class C12157So7 implements C258943zt {
    public final UserSession A00;
    public final C258953zu A01;

    private final FeatureData A00(AnonymousClass40G r12, String str) {
        boolean z = r12.A02;
        String str2 = str;
        if (z) {
            Object obj = r12.A00;
            if (!((Collection) obj).isEmpty()) {
                return SOZ.A00.A01(str, (List) obj);
            }
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (!z) {
            A1A.append("Fail to read all records for feature ");
            A1A.append(str);
            A1A.append(" from signal store, error: ");
            A1A.append(r12.A01);
        } else {
            A1A.append("Empty list for calculating average value of ");
            A1A.append(str);
        }
        SOZ.A00((Exception) null, A1A.toString());
        return new FeatureData(Type.DOUBLE, str2, (String) null, (List) null, -1.0d, 16372, 0);
    }

    private final FeatureData A01(AnonymousClass40G r12, String str) {
        boolean z = r12.A02;
        String str2 = str;
        if (z) {
            Object obj = r12.A00;
            if (!((Collection) obj).isEmpty()) {
                C255463uA[] r0 = FeatureData.A0E;
                return new FeatureData(Type.LONG, str2, (String) null, (List) null, 0.0d, 16376, AnonymousClass7TE.A0R(C66582MXn.A0r((List) obj)));
            }
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (!z) {
            A1A.append("Fail to read most recent record for feature ");
            A1A.append(str);
            A1A.append(" from signal store, error: ");
            A1A.append(r12.A01);
        } else {
            A1A.append("Empty list for calculating most recent feature ");
            A1A.append(str);
        }
        SOZ.A00((Exception) null, A1A.toString());
        return new FeatureData(Type.LONG, str2, (String) null, (List) null, 0.0d, 16376, -1);
    }

    public final String getId() {
        return "StoryPrefetch";
    }

    public C12157So7(UserSession userSession, C258953zu r2) {
        AnonymousClass7TG.A1O(r2, userSession);
        this.A01 = r2;
        this.A00 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass40G ATg(com.facebook.odin.model.OdinContext r18) {
        /*
            r17 = this;
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r7 = r17
            X.3zu r1 = r7.A01
            java.lang.String r2 = "recent_time_on_story"
            r5 = -1
            X.0eM r6 = r1.A01
            java.lang.Object r1 = r6.getValue()
            X.40N r1 = (X.AnonymousClass40N) r1
            X.40G r8 = r1.E6Y(r2, r5)
            boolean r2 = r8.A02
            if (r2 == 0) goto L_0x0109
            java.lang.Object r9 = r8.A00
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0109
            java.util.List r9 = (java.util.List) r9
            X.SOZ r8 = X.SOZ.A00
            java.lang.String r1 = "3341"
            com.facebook.odin.model.FeatureData r1 = r8.A01(r1, r9)
            r3.add(r1)
            r2 = 5
            java.lang.String r1 = "3342"
            com.facebook.odin.model.FeatureData r1 = r8.A02(r1, r9, r2)
            r3.add(r1)
            r2 = 20
            java.lang.String r1 = "3343"
            com.facebook.odin.model.FeatureData r1 = r8.A02(r1, r9, r2)
            r3.add(r1)
            r2 = 50
            java.lang.String r1 = "3344"
            com.facebook.odin.model.FeatureData r1 = r8.A02(r1, r9, r2)
            r3.add(r1)
            r2 = 95
            java.lang.String r1 = "3345"
            com.facebook.odin.model.FeatureData r1 = r8.A02(r1, r9, r2)
            r3.add(r1)
        L_0x0069:
            r0.addAll(r3)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.lang.String r2 = "item_consumed_in_story_session"
            java.lang.Object r1 = r6.getValue()
            X.40N r1 = (X.AnonymousClass40N) r1
            X.40G r2 = r1.E6Y(r2, r5)
            java.lang.String r1 = "3347"
            com.facebook.odin.model.FeatureData r1 = r7.A00(r2, r1)
            r3.add(r1)
            java.lang.String r1 = "3346"
            com.facebook.odin.model.FeatureData r1 = r7.A01(r2, r1)
            r3.add(r1)
            r0.addAll(r3)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.lang.String r2 = "ad_consumed_in_story_session"
            java.lang.Object r1 = r6.getValue()
            X.40N r1 = (X.AnonymousClass40N) r1
            X.40G r2 = r1.E6Y(r2, r5)
            java.lang.String r1 = "3349"
            com.facebook.odin.model.FeatureData r1 = r7.A00(r2, r1)
            r3.add(r1)
            java.lang.String r1 = "3348"
            com.facebook.odin.model.FeatureData r1 = r7.A01(r2, r1)
            r3.add(r1)
            r0.addAll(r3)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.String r3 = "last_story_session_end_timestamp"
            java.lang.Object r2 = r6.getValue()
            X.40N r2 = (X.AnonymousClass40N) r2
            X.40G r6 = r2.E6Y(r3, r5)
            boolean r5 = r6.A02
            if (r5 == 0) goto L_0x0151
            java.lang.Object r3 = r6.A00
            r2 = r3
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0151
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r9 = r3.iterator()
        L_0x00e5:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x011c
            long r15 = X.Pxg.A0H(r9)
            long r2 = r13 - r15
            X.AnonymousClass7TE.A1Y(r5, r2)
            r7 = 0
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x00e5
            java.lang.String r10 = "Wrong time since last story session value, currentTimestampMs is : "
            java.lang.String r11 = ", sessionEndRecordMs: "
            r12 = 125(0x7d, float:1.75E-43)
            java.lang.String r3 = X.002.A0Y(r10, r11, r12, r13, r15)
            r2 = 0
            X.SOZ.A00(r2, r3)
            goto L_0x00e5
        L_0x0109:
            if (r2 != 0) goto L_0x0119
            java.lang.String r2 = "Fail to read all records on recent_time_on_story from signal store, error: "
            java.lang.String r1 = r8.A01
            java.lang.String r2 = X.002.A0R(r2, r1)
        L_0x0113:
            r1 = 0
            X.SOZ.A00(r1, r2)
            goto L_0x0069
        L_0x0119:
            java.lang.String r2 = "Empty list for calculating feature data for recent_time_on_story"
            goto L_0x0113
        L_0x011c:
            X.SOZ r3 = X.SOZ.A00
            java.lang.String r2 = "3354"
            com.facebook.odin.model.FeatureData r2 = r3.A01(r2, r5)
            r1.add(r2)
            X.3uA[] r2 = com.facebook.odin.model.FeatureData.A0E
            com.facebook.odin.model.Type r6 = com.facebook.odin.model.Type.LONG
            boolean r2 = X.DbT.A1b(r5)
            if (r2 == 0) goto L_0x014e
            int r2 = X.Pxe.A0A(r5)
            java.lang.Object r2 = r5.get(r2)
            long r13 = X.AnonymousClass7TE.A0R(r2)
        L_0x013d:
            r10 = 0
            r8 = 0
            r12 = 16376(0x3ff8, float:2.2948E-41)
            java.lang.String r7 = "3353"
            com.facebook.odin.model.FeatureData r5 = new com.facebook.odin.model.FeatureData
            r9 = r8
            r5.<init>(r6, r7, r8, r9, r10, r12, r13)
            r1.add(r5)
            goto L_0x015f
        L_0x014e:
            r13 = -1
            goto L_0x013d
        L_0x0151:
            if (r5 != 0) goto L_0x01a3
            java.lang.String r3 = "Fail to read all records on last_story_session_end_timestamp from signal store, error: "
            java.lang.String r2 = r6.A01
            java.lang.String r3 = X.002.A0R(r3, r2)
        L_0x015b:
            r2 = 0
            X.SOZ.A00(r2, r3)
        L_0x015f:
            r0.addAll(r1)
            r4.addAll(r0)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r4.iterator()
        L_0x016d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r7 = r9.next()
            r8 = r7
            com.facebook.odin.model.FeatureData r8 = (com.facebook.odin.model.FeatureData) r8
            java.lang.String r1 = r8.A03
            java.lang.String r0 = ""
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x016d
            com.facebook.odin.model.Type r5 = r8.A02
            com.facebook.odin.model.Type r0 = com.facebook.odin.model.Type.DOUBLE
            if (r5 != r0) goto L_0x0193
            double r3 = r8.A00
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0193
            goto L_0x016d
        L_0x0193:
            com.facebook.odin.model.Type r0 = com.facebook.odin.model.Type.LONG
            if (r5 != r0) goto L_0x019f
            long r3 = r8.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x016d
        L_0x019f:
            r6.add(r7)
            goto L_0x016d
        L_0x01a3:
            java.lang.String r3 = "Empty list for calculating average value of last_story_session_end_timestamp"
            goto L_0x015b
        L_0x01a6:
            X.40G r0 = X.Pxf.A0M(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12157So7.ATg(com.facebook.odin.model.OdinContext):X.40G");
    }
}
