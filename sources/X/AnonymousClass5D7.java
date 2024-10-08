package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5D7  reason: invalid class name */
public final class AnonymousClass5D7 {
    public Integer A00;
    public final 02m A01;
    public final Map A02 = new LinkedHashMap();
    public final Set A03 = new LinkedHashSet();
    public final Set A04 = new LinkedHashSet();

    public final void A00(HNL hnl, Boolean bool, Long l, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String str5;
        String str6 = str;
        0qQ.A0B(str6, 0);
        Map map = this.A02;
        if (map.get(str6) == null) {
            int A032 = 2SP.A01.A03();
            02m r4 = this.A01;
            String str7 = str4;
            if (l != null) {
                r4.A0a(814299525, A032, str7, true, l.longValue(), TimeUnit.NANOSECONDS);
            } else {
                r4.A0U(814299525, A032, str7);
            }
            r4.markerAnnotate(814299525, A032, "thread_key", str2);
            r4.markerAnnotate(814299525, A032, AnonymousClass000.A00(726), str6);
            if (bool != null) {
                r4.markerAnnotate(814299525, A032, "client_thread_exists", bool.booleanValue());
            }
            r4.markerAnnotate(814299525, A032, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
            r4.markerAnnotate(814299525, A032, "includes_text", z);
            r4.markerAnnotate(814299525, A032, "prompt_type", hnl.toString());
            if (z2) {
                str5 = "image";
            } else {
                str5 = null;
            }
            r4.markerAnnotate(814299525, A032, "input_message_type", str5);
            Set set = 0sl.A00;
            map.put(str6, new C70688OGj(set, set, A032, 0, 0, 0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass7AG r20, X.2FW r21, java.lang.String r22) {
        /*
            r19 = this;
            r17 = 2
            r11 = r20
            if (r20 == 0) goto L_0x00a7
            java.lang.String r10 = r11.A04
            if (r10 == 0) goto L_0x00a7
            r12 = r19
            java.util.Map r9 = r12.A02
            java.lang.Object r8 = r9.get(r10)
            X.OGj r8 = (X.C70688OGj) r8
            if (r8 == 0) goto L_0x00a7
            int r7 = r8.A00
            int r6 = r8.A01
            int r5 = r8.A03
            java.util.Set r4 = r8.A04
            r18 = r22
            r0 = r18
            boolean r0 = X.00k.A0u(r4, r0)
            java.lang.String r14 = "content_type"
            java.lang.String r15 = "_rendered"
            r3 = 814299525(0x30893985, float:9.98441E-10)
            r13 = r21
            if (r0 == 0) goto L_0x00b6
            java.lang.Integer r1 = r11.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0061
            int r5 = r5 + 1
            X.02m r1 = r12.A01
            int r0 = r8.A02
            com.facebook.quicklog.MarkerEditor r2 = r1.withMarker(r3, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "response_xma_"
            r1.append(r0)
            r1.append(r5)
        L_0x004e:
            r1.append(r15)
            java.lang.String r0 = r1.toString()
            com.facebook.quicklog.PointEditor r1 = r2.pointEditor(r0)
            java.lang.String r0 = r13.A00
            r1.addPointData(r14, r0)
            r1.markerEditingCompleted()
        L_0x0061:
            X.02m r14 = r12.A01
            int r2 = r8.A02
            java.lang.String r1 = r13.A00
            java.lang.String r0 = "message_type"
            r14.markerAnnotate(r3, r2, r0, r1)
            java.util.List r1 = r11.A0C
            if (r1 == 0) goto L_0x007a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x007a
            java.util.LinkedHashSet r4 = X.094.A00(r1, r4)
        L_0x007a:
            java.lang.Integer r15 = r11.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r15 != r1) goto L_0x00b3
            if (r22 == 0) goto L_0x00b3
            java.util.Set r8 = r8.A05
            r0 = r18
            java.util.LinkedHashSet r0 = X.094.A01(r0, r8)
        L_0x008a:
            X.2FW r8 = X.2FW.A0G
            if (r13 != r8) goto L_0x00a8
            java.lang.String r8 = r11.A05
            int r8 = r8.length()
            if (r8 != 0) goto L_0x00a8
            r0 = 3
        L_0x0097:
            r14.markerEnd(r3, r2, r0)
            r9.remove(r10)
            java.util.Set r0 = r12.A03
            r0.remove(r10)
            java.util.Set r0 = r12.A04
            r0.remove(r10)
        L_0x00a7:
            return
        L_0x00a8:
            if (r15 != r1) goto L_0x010b
            boolean r1 = r0.containsAll(r4)
            if (r1 == 0) goto L_0x010b
            r0 = r17
            goto L_0x0097
        L_0x00b3:
            java.util.Set r0 = r8.A05
            goto L_0x008a
        L_0x00b6:
            java.lang.String r1 = "imagine"
            java.lang.String r0 = "imagine_me"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            java.lang.String r0 = r11.A06
            boolean r0 = X.03t.A0O(r0, r1)
            if (r0 == 0) goto L_0x00df
            int r6 = r6 + 1
            X.02m r1 = r12.A01
            int r0 = r8.A02
            com.facebook.quicklog.MarkerEditor r2 = r1.withMarker(r3, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "response_image_"
            r1.append(r0)
            r1.append(r6)
            goto L_0x004e
        L_0x00df:
            int r7 = r7 + 1
            X.02m r2 = r12.A01
            int r1 = r8.A02
            com.facebook.quicklog.MarkerEditor r16 = r2.withMarker(r3, r1)
            java.lang.String r0 = "chunk_"
            java.lang.String r15 = X.002.A0c(r0, r15, r7)
            r0 = r16
            com.facebook.quicklog.PointEditor r0 = r0.pointEditor(r15)
            java.lang.String r15 = r13.A00
            r0.addPointData(r14, r15)
            r0.markerEditingCompleted()
            java.lang.String r14 = r11.A05
            java.lang.String r0 = "bot_response_id"
            r2.markerAnnotate(r3, r1, r0, r14)
            java.lang.String r0 = "chunk_count"
            r2.markerAnnotate(r3, r1, r0, r7)
            goto L_0x0061
        L_0x010b:
            X.OGj r11 = new X.OGj
            r17 = r5
            r12 = r4
            r13 = r0
            r14 = r2
            r15 = r7
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r9.put(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5D7.A01(X.7AG, X.2FW, java.lang.String):void");
    }

    public final void A02(String str) {
        if (this.A00 == null) {
            int A032 = 2SP.A01.A03();
            Integer valueOf = Integer.valueOf(A032);
            this.A00 = valueOf;
            if (valueOf != null) {
                02m r2 = this.A01;
                r2.markerStart(814299525, A032);
                r2.markerAnnotate(814299525, A032, "rewrite_type", str);
            }
        }
    }

    public final void A03(boolean z) {
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            02m r2 = this.A01;
            short s = 3;
            if (z) {
                s = 2;
            }
            r2.markerEnd(814299525, intValue, s);
            this.A00 = null;
        }
    }

    public AnonymousClass5D7(02m r2) {
        this.A01 = r2;
    }
}
